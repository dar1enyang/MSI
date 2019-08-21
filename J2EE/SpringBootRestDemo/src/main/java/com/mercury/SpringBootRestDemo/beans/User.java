package com.mercury.SpringBootRestDemo.beans;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-21 16:50
 **/
@Entity
@Table(name = "MSI_USER")

public class User implements UserDetails {

    @Id
    @SequenceGenerator(name = "msi_user_seq_gen", sequenceName = "MSI_USER_SEQ", allocationSize = 1)
    @GeneratedValue(generator="msi_user_seq_gen", strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String username;
    @Column
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "MSI_USER_MSI_USER_PROFILE",
            // define how mid table join with the left table(the table represented by the current class
            joinColumns = {
                    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "USER_PROFILE_ID", referencedColumnName = "ID")
            }
    )
    private List<Profile> profiles;

    public User() {
    }

    public User(String username, String password, List<Profile> profiles) {
        this.username = username;
        this.password = password;
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profiles=" + profiles +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return profiles;
    }
    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
}

