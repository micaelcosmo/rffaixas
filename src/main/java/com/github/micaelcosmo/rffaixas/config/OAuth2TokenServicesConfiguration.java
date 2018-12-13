package com.github.micaelcosmo.rffaixas.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.micaelcosmo.rffaixas.security.oauth2.SimpleAuthoritiesExtractor;
import com.github.micaelcosmo.rffaixas.security.oauth2.SimplePrincipalExtractor;

@Configuration
public class OAuth2TokenServicesConfiguration {

    private static final String OAUTH2_PRINCIPAL_ATTRIBUTE = "preferred_username";
    private static final String OAUTH2_AUTHORITIES_ATTRIBUTE = "roles";

    @Bean
    public PrincipalExtractor principalExtractor() {
        return new SimplePrincipalExtractor(OAUTH2_PRINCIPAL_ATTRIBUTE);
    }

    @Bean
    public AuthoritiesExtractor authoritiesExtractor() {
        return new SimpleAuthoritiesExtractor(OAUTH2_AUTHORITIES_ATTRIBUTE);
    }
}
