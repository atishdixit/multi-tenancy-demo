package com.info.demo.config;

import com.info.demo.helper.RoutingDataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@RequiredArgsConstructor
@Configuration
public class DataSourceConfig {

    private final TenantConfig tenantConfig;

    @Bean
    public DataSource dataSource() {
        RoutingDataSource customDataSource = new RoutingDataSource();
        customDataSource.setTargetDataSources(tenantConfig.getDataSourceHashMap());
        return customDataSource;
    }
}
