package cn.sicau.djcx.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
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
@TableName("article_type")
public class ArticleType extends Model<ArticleType> {

    private static final long serialVersionUID = 1L;

    @TableField("type_name")
    private String typeName;
    private Long aid;


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
        return "ArticleType{" +
        ", typeName=" + typeName +
        ", aid=" + aid +
        "}";
    }
}
