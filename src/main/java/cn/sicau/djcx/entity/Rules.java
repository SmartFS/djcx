package cn.sicau.djcx.entity;

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
public class Rules extends Model<Rules> {

    private static final long serialVersionUID = 1L;

    @TableField("punch_require")
    private Integer punchRequire;
    @TableId(value = "aid")
    private Integer aid;


    public Integer getPunchRequire() {
        return punchRequire;
    }

    public void setPunchRequire(Integer punchRequire) {
        this.punchRequire = punchRequire;
    }



    @Override
    public String toString() {
        return "Rules{" +
                "punchRequire=" + punchRequire +
                ", aid=" + aid +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Override
    protected Serializable pkVal() {
        return aid;
    }
}
