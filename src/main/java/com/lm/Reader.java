package com.lm;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity //JPA实体
public class Reader implements UserDetails {

    private static final long serialVersionUID = 1L;


    @Id //实体的ID
    private String username;

    private String fullname;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //授予READER权限
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_READER"));
    }

    @Override
    public boolean isAccountNonExpired() { //账户不过期
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { //不加锁
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { //证书不过期
        return true;
    }

    @Override
    public boolean isEnabled() { //不禁用
        return true;
    }

}
