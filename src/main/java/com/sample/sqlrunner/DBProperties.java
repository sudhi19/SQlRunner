package com.sample.sqlrunner;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties
public class DBProperties {
    @Override
    public String toString() {
        return "\"-------Current Configuration Properties-------------\"{" +
                "ibatis_delimitter='" + ibatis_delimitter + '\'' +
                ", driver_class='" + driver_class + '\'' +
                ", db_username='" + db_username + '\'' +
                ", db_password='" + db_password + '\'' +
                ", db_url='" + db_url + '\'' +
                ", ibatis_autocommit=" + ibatis_autocommit +
                ", ibatis_failon_error=" + ibatis_failon_error +
                '}';
    }

    private String ibatis_delimitter;
private String log_file_date_format;

    public String getLog_file_date_format() {
        return log_file_date_format;
    }

    public void setLog_file_date_format(String log_file_date_format) {
        this.log_file_date_format = log_file_date_format;
    }

    public String getIbatis_delimitter() {
        return ibatis_delimitter;
    }

    public void setIbatis_delimitter(String ibatis_delimitter) {
        this.ibatis_delimitter = ibatis_delimitter;
    }

    private String driver_class;
        private String db_username;
        private String db_password;
        private String db_url;
        private boolean ibatis_autocommit;
        private boolean ibatis_failon_error;
    private String log_file_path;
    public boolean getIbatis_autocommit() {
        return ibatis_autocommit;
    }

    public void setIbatis_autocommit(boolean ibatis_autocommit) {
        this.ibatis_autocommit = ibatis_autocommit;
    }

    public boolean getIbatis_failon_error() {
        return ibatis_failon_error;
    }

    public void setIbatis_failon_error(boolean ibatis_failon_error) {
        this.ibatis_failon_error = ibatis_failon_error;
    }

    public String getDriver_class() {
            return driver_class;
        }

        public void setDriver_class(String driver_class) {
            this.driver_class = driver_class;
        }

        public String getDb_username() {
            return db_username;
        }

        public void setDb_username(String db_username) {
            this.db_username = db_username;
        }

        public String getDb_password() {
            return db_password;
        }

        public void setDb_password(String db_password) {
            this.db_password = db_password;
        }

        public String getDb_url() {
            return db_url;
        }

        public void setDb_url(String db_url) {
            this.db_url = db_url;
        }

    public String getLog_file_path() {
        return log_file_path;
    }

    public void setLog_file_path(String log_file_path) {
        this.log_file_path = log_file_path;
    }
}
