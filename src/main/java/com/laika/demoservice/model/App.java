package com.laika.demoservice.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
public class App {
    /**
     * 主键
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * AppID
     */
    @Column(name = "AppId")
    private String appid;

    /**
     * 应用名
     */
    @Column(name = "Name")
    private String name;

    /**
     * 部门Id
     */
    @Column(name = "OrgId")
    private String orgid;

    /**
     * 部门名字
     */
    @Column(name = "OrgName")
    private String orgname;

    /**
     * ownerName
     */
    @Column(name = "OwnerName")
    private String ownername;

    /**
     * ownerEmail
     */
    @Column(name = "OwnerEmail")
    private String owneremail;

    /**
     * 1: deleted, 0: normal
     */
    @Column(name = "IsDeleted")
    private Boolean isdeleted;

    /**
     * 创建人邮箱前缀
     */
    @Column(name = "DataChange_CreatedBy")
    private String datachangeCreatedby;

    /**
     * 创建时间
     */
    @Column(name = "DataChange_CreatedTime")
    private Date datachangeCreatedtime;

    /**
     * 最后修改人邮箱前缀
     */
    @Column(name = "DataChange_LastModifiedBy")
    private String datachangeLastmodifiedby;

    /**
     * 最后修改时间
     */
    @Column(name = "DataChange_LastTime")
    private Date datachangeLasttime;

    /**
     * 获取主键
     *
     * @return Id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取AppID
     *
     * @return AppId - AppID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置AppID
     *
     * @param appid AppID
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取应用名
     *
     * @return Name - 应用名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置应用名
     *
     * @param name 应用名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取部门Id
     *
     * @return OrgId - 部门Id
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * 设置部门Id
     *
     * @param orgid 部门Id
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    /**
     * 获取部门名字
     *
     * @return OrgName - 部门名字
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * 设置部门名字
     *
     * @param orgname 部门名字
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    /**
     * 获取ownerName
     *
     * @return OwnerName - ownerName
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * 设置ownerName
     *
     * @param ownername ownerName
     */
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    /**
     * 获取ownerEmail
     *
     * @return OwnerEmail - ownerEmail
     */
    public String getOwneremail() {
        return owneremail;
    }

    /**
     * 设置ownerEmail
     *
     * @param owneremail ownerEmail
     */
    public void setOwneremail(String owneremail) {
        this.owneremail = owneremail;
    }

    /**
     * 获取1: deleted, 0: normal
     *
     * @return IsDeleted - 1: deleted, 0: normal
     */
    public Boolean getIsdeleted() {
        return isdeleted;
    }

    /**
     * 设置1: deleted, 0: normal
     *
     * @param isdeleted 1: deleted, 0: normal
     */
    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * 获取创建人邮箱前缀
     *
     * @return DataChange_CreatedBy - 创建人邮箱前缀
     */
    public String getDatachangeCreatedby() {
        return datachangeCreatedby;
    }

    /**
     * 设置创建人邮箱前缀
     *
     * @param datachangeCreatedby 创建人邮箱前缀
     */
    public void setDatachangeCreatedby(String datachangeCreatedby) {
        this.datachangeCreatedby = datachangeCreatedby;
    }

    /**
     * 获取创建时间
     *
     * @return DataChange_CreatedTime - 创建时间
     */
    public Date getDatachangeCreatedtime() {
        return datachangeCreatedtime;
    }

    /**
     * 设置创建时间
     *
     * @param datachangeCreatedtime 创建时间
     */
    public void setDatachangeCreatedtime(Date datachangeCreatedtime) {
        this.datachangeCreatedtime = datachangeCreatedtime;
    }

    /**
     * 获取最后修改人邮箱前缀
     *
     * @return DataChange_LastModifiedBy - 最后修改人邮箱前缀
     */
    public String getDatachangeLastmodifiedby() {
        return datachangeLastmodifiedby;
    }

    /**
     * 设置最后修改人邮箱前缀
     *
     * @param datachangeLastmodifiedby 最后修改人邮箱前缀
     */
    public void setDatachangeLastmodifiedby(String datachangeLastmodifiedby) {
        this.datachangeLastmodifiedby = datachangeLastmodifiedby;
    }

    /**
     * 获取最后修改时间
     *
     * @return DataChange_LastTime - 最后修改时间
     */
    public Date getDatachangeLasttime() {
        return datachangeLasttime;
    }

    /**
     * 设置最后修改时间
     *
     * @param datachangeLasttime 最后修改时间
     */
    public void setDatachangeLasttime(Date datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }
}