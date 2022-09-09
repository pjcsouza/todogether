package com.example.todogether.SubsistemaComunicacaoAPILogin.Google;

import com.example.todogether.SubsistemaComunicacaoAPILogin.IUsuarioAPILogin;
import com.example.todogether.SubsistemaComunicacaoAPILogin.SubsistemaComunicacaoAPILogin;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class ComunicacaoAPILoginGoogle extends SubsistemaComunicacaoAPILogin {

    private UsuarioGoogle usuarioGoogle;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        usuarioGoogle = new UsuarioGoogle(super.loadUser(userRequest));
        return usuarioGoogle;
    }

    @Override
    public IUsuarioAPILogin cadastrarUsuario() {
        return usuarioGoogle;
    }

    @Override
    public String verificarCredenciais() {
        return usuarioGoogle.getEmail();
    }
}
