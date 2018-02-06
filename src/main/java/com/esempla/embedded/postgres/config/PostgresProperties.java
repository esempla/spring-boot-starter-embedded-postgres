package com.esempla.embedded.postgres.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import ru.yandex.qatools.embed.postgresql.distribution.Version;

/**
 * @author Gladîș Vladlen on 2/5/18.
 */
@ConfigurationProperties(prefix = "embedded.postgres")
public class PostgresProperties {

    private String host = "localhost";
    private String username = "user";
    private String password = "user";
    private String databaseName;
    private int port = 5433;
    private Version.Main version = Version.Main.V9_6;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Version.Main getVersion() {
        return version;
    }

    public void setVersion(Version.Main version) {
        this.version = version;
    }
}
