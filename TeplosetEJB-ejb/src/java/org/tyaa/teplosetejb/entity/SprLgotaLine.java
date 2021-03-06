/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SPR_LGOTA_LINE")
@NamedQueries({
    @NamedQuery(name = "SprLgotaLine.findAll", query = "SELECT s FROM SprLgotaLine s")})
public class SprLgotaLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    private BigDecimal percent;
    private BigDecimal s1;
    private BigDecimal s2;
    private BigDecimal quantity;
    @Column(name = "LGOTER_COUNT")
    private Integer lgoterCount;
    @Column(name = "LGOTER_RELATIVE")
    private Integer lgoterRelative;
    @Column(name = "NOT_CHECK_LODGERS")
    private Integer notCheckLodgers;
    @Column(name = "NOT_CHECK_LEAVED")
    private Integer notCheckLeaved;
    @Column(name = "ALLOW_NORM")
    private Integer allowNorm;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    @Size(max = 128)
    private String remark;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private BigInteger rversion;
    private Integer hidden;
    @Column(name = "NACH_SOCIAL_NORM")
    private Integer nachSocialNorm;
    @JoinColumn(name = "LGOTACODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private SprLgota lgotacode;

    public SprLgotaLine() {
    }

    public SprLgotaLine(Integer code) {
        this.code = code;
    }

    public SprLgotaLine(Integer code, Date begindate, BigDecimal percent) {
        this.code = code;
        this.begindate = begindate;
        this.percent = percent;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public BigDecimal getS1() {
        return s1;
    }

    public void setS1(BigDecimal s1) {
        this.s1 = s1;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Integer getLgoterCount() {
        return lgoterCount;
    }

    public void setLgoterCount(Integer lgoterCount) {
        this.lgoterCount = lgoterCount;
    }

    public Integer getLgoterRelative() {
        return lgoterRelative;
    }

    public void setLgoterRelative(Integer lgoterRelative) {
        this.lgoterRelative = lgoterRelative;
    }

    public Integer getNotCheckLodgers() {
        return notCheckLodgers;
    }

    public void setNotCheckLodgers(Integer notCheckLodgers) {
        this.notCheckLodgers = notCheckLodgers;
    }

    public Integer getNotCheckLeaved() {
        return notCheckLeaved;
    }

    public void setNotCheckLeaved(Integer notCheckLeaved) {
        this.notCheckLeaved = notCheckLeaved;
    }

    public Integer getAllowNorm() {
        return allowNorm;
    }

    public void setAllowNorm(Integer allowNorm) {
        this.allowNorm = allowNorm;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(Integer systemuser) {
        this.systemuser = systemuser;
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getNachSocialNorm() {
        return nachSocialNorm;
    }

    public void setNachSocialNorm(Integer nachSocialNorm) {
        this.nachSocialNorm = nachSocialNorm;
    }

    public SprLgota getLgotacode() {
        return lgotacode;
    }

    public void setLgotacode(SprLgota lgotacode) {
        this.lgotacode = lgotacode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprLgotaLine)) {
            return false;
        }
        SprLgotaLine other = (SprLgotaLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprLgotaLine[ code=" + code + " ]";
    }
    
}
