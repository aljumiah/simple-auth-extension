package com.github.aljumiah.keycloak.auth.startpoint;

import org.keycloak.Config;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.List;

public class SimpleAuthenticatorFactory implements AuthenticatorFactory {

    private static final String PROVIDER_ID = "simple-auth-startpoint";


    public String getDisplayType() {
        return "Simple Start Point";
    }


    public String getReferenceCategory() {
        return null;
    }

    public boolean isConfigurable() {
        return false;
    }

    public static final AuthenticationExecutionModel.Requirement[] REQUIREMENT_CHOICES = {
            AuthenticationExecutionModel.Requirement.REQUIRED, AuthenticationExecutionModel.Requirement.DISABLED
    };

    public AuthenticationExecutionModel.Requirement[] getRequirementChoices() {
        return REQUIREMENT_CHOICES;
    }


    public boolean isUserSetupAllowed() {
        return false;
    }


    public String getHelpText() {
        return "Simple Authenticator Pass Through";
    }


    public List<ProviderConfigProperty> getConfigProperties() {
        return null;
    }


    public void close() {
        // NOOP
    }


    public Authenticator create(KeycloakSession session) {
        return new SimpleAuthenticator(session);
    }


    public void init(Config.Scope config) {
        // NOOP
    }

    public void postInit(KeycloakSessionFactory factory) {
        // NOOP
    }


    public String getId() {
        return PROVIDER_ID;
    }
}
