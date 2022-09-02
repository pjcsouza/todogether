package com.example.todogether.SubsistemaOAuth2;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Map;

public class UsuarioOAuth2 implements OAuth2User {

    private  OAuth2User oauth2User;

    public UsuarioOAuth2(OAuth2User oauth2User) {
        super();
        this.oauth2User = oauth2User;
        System.out.println("name: " + getName());
        System.out.println("email: " + getEmail());
    }

    @Override
    public Map<String, Object> getAttributes() {
        return oauth2User.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return oauth2User.getAuthorities();
    }

    @Override
    public String getName() {
        return oauth2User.getAttribute("name");
    }

    public String getEmail() {
        return oauth2User.getAttribute("email");
    }

}
