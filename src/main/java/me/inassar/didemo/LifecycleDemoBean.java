package me.inassar.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Ahmed Nassar.
 * Date: 15 May, 2020
 * Time: 5:39 PM
 * Methods are ordered by calling order in the lifecycle of the bean
 */
@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifecycleDemoBean() {
        System.out.println("#1 I'm in the LifeCycleDemoBean constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("#2 The Bean Name is: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#3 The Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#4 The Application Context has been set");
    }

    public void beforeInit() {
        System.out.println("#5 Before Init - called by Bean Post Processor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("#6 The postConstruct method has been called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#7 The Lifecycle Bean has its properties set");
    }

    public void afterInit() {
        System.out.println("#8 After Init - called by Bean Post Processor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("#9 The preDestroy method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#10 The Lifecycle Bean has been terminated");
    }
}
