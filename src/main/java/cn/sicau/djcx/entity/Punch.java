package cn.sicau.djcx.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
public class Punch extends Model<Punch> {

    private static final long serialVersionUID = 1L;

    private Long sid;
    @TableField("punch_time")
    private Date punchTime;
    private Long aid;


    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Date getPunchTime() {
        return punchTime;
    }

    public void setPunchTime(Date punchTime) {
        this.punchTime = punchTime;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    @Override
    protected Serializable pkVal() {
        return this.aid;
    }

    @Override
    public String toString() {
        return "Punch{" +
        ", sid=" + sid +
        ", punchTime=" + punchTime +
        ", aid=" + aid +
        "}";
    }
}
