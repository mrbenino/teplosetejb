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
@Table(name = "ERR_DOC_PIPE_WORK_TIME")
@NamedQueries({
    @NamedQuery(name = "ErrDocPipeWorkTime.findAll", query = "SELECT e FROM ErrDocPipeWorkTime e")})
public class ErrDocPipeWorkTime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer pos2;
    private Integer systemmessagecode;
    @Size(max = 128)
    private String remark;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocBoilerWorkTime pos;
    @JoinColumn(name = "POS1", referencedColumnName = "CODE")
    @ManyToOne
    private DocPipeWorkTime pos1;

    public ErrDocPipeWorkTime() {
    }

    public ErrDocPipeWorkTime(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocBoilerWorkTime getPos() {
        return pos;
    }

    public void setPos(DocBoilerWorkTime pos) {
        this.pos = pos;
    }

    public DocPipeWorkTime getPos1() {
        return pos1;
    }

    public void setPos1(DocPipeWorkTime pos1) {
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
        if (!(object instanceof ErrDocPipeWorkTime)) {
            return false;
        }
        ErrDocPipeWorkTime other = (ErrDocPipeWorkTime) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.ErrDocPipeWorkTime[ code=" + code + " ]";
    }
    
}
