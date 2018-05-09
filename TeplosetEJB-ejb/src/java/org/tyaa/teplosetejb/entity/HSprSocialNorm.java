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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_SPR_SOCIAL_NORM")
@NamedQueries({
    @NamedQuery(name = "HSprSocialNorm.findAll", query = "SELECT h FROM HSprSocialNorm h")})
public class HSprSocialNorm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOCIAL_NORM_CODE")
    private int socialNormCode;
    private Integer service;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    private Integer normcode;
    private Integer lgota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOCIAL_NORM")
    private BigDecimal socialNorm;
    @Column(name = "SOCIAL_NORM_ADD")
    private BigDecimal socialNormAdd;
    @Column(name = "IS_DAY")
    private Integer isDay;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private BigInteger rversion;
    private Integer hidden;

    public HSprSocialNorm() {
    }

    public HSprSocialNorm(Integer code) {
        this.code = code;
    }

    public HSprSocialNorm(Integer code, int socialNormCode) {
        this.code = code;
        this.socialNormCode = socialNormCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(Integer hProcdate) {
        this.hProcdate = hProcdate;
    }

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
    }

    public int getSocialNormCode() {
        return socialNormCode;
    }

    public void setSocialNormCode(int socialNormCode) {
        this.socialNormCode = socialNormCode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Integer getLgota() {
        return lgota;
    }

    public void setLgota(Integer lgota) {
        this.lgota = lgota;
    }

    public BigDecimal getSocialNorm() {
        return socialNorm;
    }

    public void setSocialNorm(BigDecimal socialNorm) {
        this.socialNorm = socialNorm;
    }

    public BigDecimal getSocialNormAdd() {
        return socialNormAdd;
    }

    public void setSocialNormAdd(BigDecimal socialNormAdd) {
        this.socialNormAdd = socialNormAdd;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HSprSocialNorm)) {
            return false;
        }
        HSprSocialNorm other = (HSprSocialNorm) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprSocialNorm[ code=" + code + " ]";
    }
    
}
