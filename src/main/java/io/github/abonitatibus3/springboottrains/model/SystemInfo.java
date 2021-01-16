package io.github.abonitatibus3.springboottrains.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class SystemInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int maxBags;
    private int freeBags;
    private BigDecimal studentDiscount;
    private BigDecimal changeFee;

    public SystemInfo(int maxBags, int freeBags, BigDecimal studentDiscount, BigDecimal changeFee) {
        this.maxBags = maxBags;
        this.freeBags = freeBags;
        this.studentDiscount = studentDiscount;
        this.changeFee = changeFee;
    }

    public SystemInfo() {
    }

    public int getMaxBags() {
        return maxBags;
    }

    public void setMaxBags(int maxBags) {
        this.maxBags = maxBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public BigDecimal getStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(BigDecimal studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    public BigDecimal getChangeFee() {
        return changeFee;
    }

    public void setChangeFee(BigDecimal changeFee) {
        this.changeFee = changeFee;
    }
}
