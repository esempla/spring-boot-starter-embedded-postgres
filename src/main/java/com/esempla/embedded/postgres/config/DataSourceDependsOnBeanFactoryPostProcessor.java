package com.esempla.embedded.postgres.config;

import org.springframework.boot.autoconfigure.AbstractDependsOnBeanFactoryPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

/**
 * @author Gladîș Vladlen on 2/6/18.
 */
@Order
public class DataSourceDependsOnBeanFactoryPostProcessor extends AbstractDependsOnBeanFactoryPostProcessor {

    public DataSourceDependsOnBeanFactoryPostProcessor(String... dependsOn) {
        super(DataSource.class, LocalContainerEntityManagerFactoryBean.class, dependsOn);
    }
}

