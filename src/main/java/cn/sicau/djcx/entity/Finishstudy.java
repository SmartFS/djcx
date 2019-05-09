package cn.sicau.djcx.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
public class Finishstudy extends Model<Finishstudy> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "aid",type = IdType.AUTO)
    private Long aid;
    @TableField("ariticle_id")
    private String ariticleId;
    private Long userid;
    @TableField("accomplish_time")
    private Date accomplishTime;
    @TableField("read_time")
    private Date readTime;
    private Integer collection;


    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getAriticleId() {
        return ariticleId;
    }

    public void setAriticleId(String ariticleId) {
        this.ariticleId = ariticleId;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getAccomplishTime() {
        return accomplishTime;
    }

    public void setAccomplishTime(Date accomplishTime) {
        this.accomplishTime = accomplishTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    @Override
    protected Serializable pkVal() {
        return this.aid;
    }

    @Override
    public String toString() {
        return "Finishstudy{" +
        ", aid=" + aid +
        ", ariticleId=" + ariticleId +
        ", userid=" + userid +
        ", accomplishTime=" + accomplishTime +
        ", readTime=" + readTime +
        ", collection=" + collection +
        "}";
    }
}
