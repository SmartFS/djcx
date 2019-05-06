package cn.sicau.djcx.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long userid;
    private String sname;
    private String sclass;
    private String phone;
    private String email;
    private String identity;
    @TableField("application_time")
    private Date applicationTime;
    @TableField("activist_time")
    private Date activistTime;
    @TableField("potential_time")
    private Date potentialTime;
    @TableField("probationary_time")
    private Date probationaryTime;
    @TableField("fullparty_time")
    private Date fullpartyTime;
    @TableField("register_status")
    private String registerStatus;


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public Date getActivistTime() {
        return activistTime;
    }

    public void setActivistTime(Date activistTime) {
        this.activistTime = activistTime;
    }

    public Date getPotentialTime() {
        return potentialTime;
    }

    public void setPotentialTime(Date potentialTime) {
        this.potentialTime = potentialTime;
    }

    public Date getProbationaryTime() {
        return probationaryTime;
    }

    public void setProbationaryTime(Date probationaryTime) {
        this.probationaryTime = probationaryTime;
    }

    public Date getFullpartyTime() {
        return fullpartyTime;
    }

    public void setFullpartyTime(Date fullpartyTime) {
        this.fullpartyTime = fullpartyTime;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userid=" + userid +
                ", sname='" + sname + '\'' +
                ", sclass='" + sclass + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", identity='" + identity + '\'' +
                ", applicationTime=" + applicationTime +
                ", activistTime=" + activistTime +
                ", potentialTime=" + potentialTime +
                ", probationaryTime=" + probationaryTime +
                ", fullpartyTime=" + fullpartyTime +
                ", registerStatus='" + registerStatus + '\'' +
                '}';
    }
}
