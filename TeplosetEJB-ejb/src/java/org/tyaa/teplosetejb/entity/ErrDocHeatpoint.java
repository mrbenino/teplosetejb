/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "ERR_DOC_HEATPOINT")
@NamedQueries({
    @NamedQuery(name = "ErrDocHeatpoint.findAll", query = "SELECT e FROM ErrDocHeatpoint e")})
public class ErrDocHeatpoint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int doc;
    private Integer pos2;
    private Integer systemmessagecode;
    @Size(max = 128)
    private String remark;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocHeatpoint pos;
    @JoinColumn(name = "POS1", referencedColumnName = "CODE")
    @ManyToOne
    private DocHeatpointentry pos1;

    public ErrDocHeatpoint() {
    }

    public ErrDocHeatpoint(Integer code) {
        this.code = code;
    }

    public ErrDocHeatpoint(Integer code, int doc) {
        this.code = code;
        this.doc = doc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public Integer getPos2() {
        return pos2;
    }

    public void setPos2(Integer pos2) {
        this.pos2 = pos2;
    }

    public Integer getSystemmessagecode() {
        return systemmessagecode;
    }

    public void setSystemmessagecode(Integer systemmessagecode) {
        this.systemmessagecode = systemmessagecode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DocHeatpoint getPos() {
        return pos;
    }

    public void setPos(DocHeatpoint pos) {
        this.pos = pos;
    }

    public DocHeatpointentry getPos1() {
        return pos1;
    }

    public void setPos1(DocHeatpointentry pos1) {
        this.pos1 = pos1;
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
        if (!(object instanceof ErrDocHeatpoint)) {
            return false;
        }
        ErrDocHeatpoint other = (ErrDocHeatpoint) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.ErrDocHeatpoint[ code=" + code + " ]";
    }
    
}
