/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yurii
 */
public class AccountBill {
    
    //Тип квитанции
    public String type;
    //Код типа квитанции
    public Integer typeId;
    //Название услуги
    public String titleLong;
    //шифр услуги
    public String titleShort;
    //Начальные показания счетчика
    public BigDecimal beginMeter;
    //Потребленный объем
    public BigDecimal volume;
    //Конечные показания счетчика
    public BigDecimal endMeter;
    //Тариф
    public String tariff;
    //Субсидия
    public BigDecimal subsidyAmount;
    //Сумма, начисленная к оплате
    public BigDecimal amountToBePaid;
    //Отапливаемая площадь
    public BigDecimal heatedArea;
    
    public AccountBill() {
    }

    public AccountBill(
            String type
            , Integer typeId
            , String titleLong
            , String titleShort
            , BigDecimal beginMeter
            , BigDecimal volume
            , BigDecimal endMeter
            , String tariff
            , BigDecimal subsidyAmount
            , BigDecimal amountToBePaid
            , BigDecimal heatedArea
    ) {
        this.type = type;
        this.typeId = typeId;
        this.titleLong = titleLong;
        this.titleShort = titleShort;
        this.beginMeter = beginMeter;
        this.volume = volume;
        this.endMeter = endMeter;
        this.tariff = tariff;
        this.subsidyAmount = subsidyAmount;
        this.amountToBePaid = amountToBePaid;
        this.heatedArea = heatedArea;
    }

    
}
