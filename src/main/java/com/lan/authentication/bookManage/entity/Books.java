package com.lan.authentication.bookManage.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bno;

    private String classid;

    private String bname;

    private String author;

    private BigDecimal price;

    private String publish;

    private Integer csl;


}
