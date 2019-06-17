package com.bitcoin.bitcoinitems.dto;

import java.util.Date;

public class BlockListDto {

    private String blockhash;

    private Integer height;

    private Date time;

    private short txsize;

    private Integer size;


    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public short getTxsize() {
        return txsize;
    }

    public void setTxsize(short txsize) {
        this.txsize = txsize;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
