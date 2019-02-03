package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "admin_sign")
public class AdminSign {
    @Id
    @Column(name = "admin_email")
    private String adminemail;
    @Column(name ="admin_password")
    private String AdminPassword;

    public AdminSign(String adminUserName, String adminPassword) {
        this.adminemail = adminUserName;
        this.AdminPassword = adminPassword;
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "AdminSign{" +
                "adminemail='" + adminemail + '\'' +
                ", AdminPassword='" + AdminPassword + '\'' +
                '}';
    }
}
