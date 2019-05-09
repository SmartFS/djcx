package cn.sicau.djcx.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
public class Airticle extends Model<Airticle> {

    private static final long serialVersionUID = 1L;

    @TableId("ariticle_id")
    private String ariticleId;
    private Long aid;
    @TableField("art_aid")
    private Long artAid;
    @JsonFormat(timezone = "GMT+8" ,pattern ="yyyyMMddHHmmss")
    private Date updatetime;

    private String title;
    private String content;
    private String author;
    @TableField("page_view")
    private Integer pageView;
    private String summary;
    private String label;


    public String getAriticleId() {
        return ariticleId;
    }

    public void setAriticleId(String ariticleId) {
        this.ariticleId = ariticleId;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Long getArtAid() {
        return artAid;
    }

    public void setArtAid(Long artAid) {
        this.artAid = artAid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    protected Serializable pkVal() {
        return this.ariticleId;
    }

    @Override
    public String toString() {
        return "Airticle{" +
                "ariticleId='" + ariticleId + '\'' +
                ", aid=" + aid +
                ", artAid=" + artAid +
                ", updatetime=" + updatetime +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", pageView=" + pageView +
                ", summary='" + summary + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
