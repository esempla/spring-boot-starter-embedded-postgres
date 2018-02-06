package com.esempla.embedded.postgres.config;

/**
 * @author Gladîș Vladlen on 7/25/17.
 * @project grm
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;

import java.io.IOException;

@Configuration
@ConditionalOnProperty(prefix = "embedded.postgres", name = "database-name")
@EnableConfigurationProperties(PostgresProperties.class)
public class PostgresAutoConfiguration {

    private final PostgresProperties properties;

    @Autowired
    public PostgresAutoConfiguration(PostgresProperties properties) {
        this.properties = properties;
    }

    @Configuration
    protected static class EmbeddedPostgresDependencyConfiguration extends DataSourceDependsOnBeanFactoryPostProcessor{
        public EmbeddedPostgresDependencyConfiguration(){
            super("embeddedPostgres");
        }
    }

    @Bean(destroyMethod = "stop")
    @ConditionalOnMissingBean
    public EmbeddedPostgres embeddedPostgres() throws IOException {
        EmbeddedPostgres embeddedPostgres = new EmbeddedPostgres(properties.getVersion());

        embeddedPostgres.start(properties.getHost(), properties.getPort(), properties.getDatabaseName(),
                properties.getUsername(), properties.getPassword());


        return embeddedPostgres;
    }

}
