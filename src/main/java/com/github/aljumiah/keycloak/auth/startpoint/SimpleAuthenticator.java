package com.github.aljumiah.keycloak.auth.startpoint;

import org.jboss.logging.Logger;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class SimpleAuthenticator implements Authenticator {

    private static final Logger LOG = Logger.getLogger(SimpleAuthenticator.class);

    public SimpleAuthenticator(KeycloakSession session) {
        // configure from session
    }

    public void authenticate(AuthenticationFlowContext context) {

        UserModel user = context.getUser();

        if (user != null) {
            LOG.infof("Pass through: %s%n", user.getUsername());
        } else {
            LOG.infof("Pass through: %s%n", "anonymous");
        }

        context.success();
    }


    public boolean requiresUser() {
        return false;
    }


    public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
        return true;
    }


    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
    }


    public void action(AuthenticationFlowContext context) {
    }

    public void close() {
        // NOOP
    }
}
