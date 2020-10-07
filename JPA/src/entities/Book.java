package entities;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Data
@Entity
public class Book {

    @Id
    private int id;

    private String title;

    private String author;

    //private Date date;

    private int pages;

    //private BigDecimal price;

    private String stockStatus;

    public enum StockStatus{
        IN_STOCK("IN_STOCK"),
        OUT_OF_STUCK("OUT_OF_STOCK"),
        UNKNOWN("UNKNOWN");

        public final String status;

        StockStatus(String status) {
            this.status = status;
        }
    }
}