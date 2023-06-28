package com.info.demo.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TenantDetail {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
    private Boolean isActive;
}
