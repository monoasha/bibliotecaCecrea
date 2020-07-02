/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.StringUtils;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mono_
 */
public enum ApplicationProperties {
    INSTANCE;

    private final Properties properties;

    ApplicationProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public String getDbConnection() {
        return properties.getProperty("db.connection");
    }
    
    public String getDbUser() {
        return properties.getProperty("db.user");
    }
    
    public String getDbPass() {
        String pass = properties.getProperty("db.pass");
        return StringUtils.isNullOrEmpty(pass) ? "" : pass;
    }
}