package com.scm.helpers;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class Helper {

    public static String getEmailOfLoggedInUser(Authentication authentication) {
        
        //get email for set on prifile page
        if (authentication instanceof OAuth2AuthenticationToken) {
            var aOAuth2AuthenticationToken = (OAuth2AuthenticationToken) authentication;
            var clientId = aOAuth2AuthenticationToken.getAuthorizedClientRegistrationId();
            
            OAuth2AuthenticatedPrincipal principal = (OAuth2AuthenticatedPrincipal)aOAuth2AuthenticationToken.getPrincipal();

            var oAuth2User = (OAuth2User)authentication.getPrincipal();
            String username = "";
                //get email if we login with google
            if (clientId.equalsIgnoreCase("google")) {
                System.out.println("Getting email from google");
                username = oAuth2User.getAttribute("email").toString();
                
                //get email if we login with github
            } else if (clientId.equalsIgnoreCase("github")) {
                System.out.println("Getting email from github");
                username = oAuth2User.getAttribute("email") != null
                    ? oAuth2User.getAttribute("email").toString()
                    : oAuth2User.getAttribute("login").toString()+"@gmail.com";
            }
            return username;
            //get email if we login with email id
        } else {
            System.out.println("Getting email from local database");
            return authentication.getName();
        }

    }

    public static String getLinkForEmailVerification(String emailToken) {

        String link = "http://localhost:8081/auth/verify-email?token=" + emailToken;

        return link;

    }

}

