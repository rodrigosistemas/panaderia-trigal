package com.panaderia.panaderiatrigal.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityStatefulConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity
                //
                .authorizeHttpRequests(auth -> auth
                        // 1. Permitir acceso solo a la raíz exacta
                        .requestMatchers("/").permitAll()
                        //.requestMatchers("/**").permitAll(); Permitir acceso libre a todas las rutas

                        // 2. Cualquier otra ruta (como /productos) requiere autenticación
                        .anyRequest().authenticated()
                )
                // 3. Habilita el formulario de login para que puedan autenticarse
                .formLogin(withDefaults()) // Permite login desde navegador creando un JSESIONID
                .httpBasic(withDefaults()); // Permite pasar credenciales en los headers para clientes REST

        return httpSecurity.build();

    }

    /*@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/

}
