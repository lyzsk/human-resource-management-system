package cn.sichu.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author sichu
 * @date 2023/01/10
 **/
@Entity
@Table(name = "sys_permission")
@SQLDelete(sql = "update sys_permission set is_deleted = 1 where id = ?")
@Where(clause = "is_deleted = 0")
public class SysPermission {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 父级id
     */
    private Long parentId;

    /**
     * 权限编码
     */
    private String code;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限描述
     */
    private String description;

    /**
     * 允许访问的uri路径
     */
    private String uri;

    /**
     * 组件
     */
    private String component;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类型, 0: 目录, 1: 菜单, 2: 按钮
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 更新人
     */
    private Long updateUser;

    /**
     * 逻辑删除, 0: 否, 1: 是
     */
    private Integer isDeleted;

    public SysPermission() {
    }

    public SysPermission(Long id, Long parentId, String code, String name, String description, String uri,
        String component, String icon, Integer type, Date createTime, Date updateTime, Long createUser, Long updateUser,
        Integer isDeleted) {
        this.id = id;
        this.parentId = parentId;
        this.code = code;
        this.name = name;
        this.description = description;
        this.uri = uri;
        this.component = component;
        this.icon = icon;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "SysPermission{" + "id=" + id + ", parentId=" + parentId + ", code='" + code + '\'' + ", name='" + name
            + '\'' + ", description='" + description + '\'' + ", uri='" + uri + '\'' + ", component='" + component
            + '\'' + ", icon='" + icon + '\'' + ", type=" + type + ", createTime=" + createTime + ", updateTime="
            + updateTime + ", createUser=" + createUser + ", updateUser=" + updateUser + ", isDeleted=" + isDeleted
            + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
