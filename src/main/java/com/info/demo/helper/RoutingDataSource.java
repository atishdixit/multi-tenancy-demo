package com.info.demo.helper;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static com.info.demo.constant.Constant.DEFAULT_TENANT;
import static com.info.demo.constant.Constant.Tenant_ID;

public class RoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String tenantId = DEFAULT_TENANT;
        if(attr!=null) {
            tenantId = attr.getRequest().getParameter(Tenant_ID);
        }
        return tenantId;

    }
}
