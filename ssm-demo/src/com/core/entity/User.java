package com.core.entity;

/**
 * @author 1034683568@qq.com
 *         project_name ssm-demo
 * @date 2015-7-27
 * @time 下午5:40:10
 */
public class User {

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password="
                + password + ", roleName=" + roleName + "]";
    }

    private Integer id; // 主键 123
    private String userName; // 用户姓名
    private String password; // 密码
    private String roleName; //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
