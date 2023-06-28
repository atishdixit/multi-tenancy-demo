package com.info.demo.config;

import com.info.demo.record.TenantDetail;
import com.info.demo.helper.CustomPropertySourceFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Configuration
@PropertySource(value = "classpath:tenants.yaml", factory = CustomPropertySourceFactory.class)
@ConfigurationProperties(prefix = "datasources")
public class TenantConfig {

    private Map<String, TenantDetail> tenants;

    public Map<Object, Object> getDataSourceHashMap() {
        Map hashMap = new HashMap();
        tenants.forEach((key,value) -> {
            DriverManagerDataSource defaultDataSource = new DriverManagerDataSource();
            defaultDataSource.setDriverClassName(value.getDriverClassName());
            defaultDataSource.setUrl(value.getUrl());
            defaultDataSource.setUsername(value.getUserName());
            defaultDataSource.setPassword(value.getPassword());
            hashMap.put(key, defaultDataSource);
        });

        return hashMap;
    }


}
