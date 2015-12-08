package me.ggikko.employee;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Park Ji Hong, ggikko.
 */

@Data
@IdClass(GgikkoKey.class)
public class GgikkoKey implements Serializable {

    private int emp_no;
    private Date from_date;

}
