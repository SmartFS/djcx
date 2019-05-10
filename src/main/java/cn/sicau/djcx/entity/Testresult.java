package cn.sicau.djcx.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@TableName(value = "testresult")
public class Testresult extends Model<Testresult> {

    private static final long serialVersionUID = 1L;
    @TableId
    private String sid;
    @TableField("test_id")
    private String testId;
    private String aid;
    private Float score;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

    @Override
    public String toString() {
        return "Testresult{" +
        ", sid=" + sid +
        ", testId=" + testId +
        ", aid=" + aid +
        ", score=" + score +
        "}";
    }
}
