package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public final class Party extends Base {
    private String startDate;
    private String endDate;
    private UUID createdByUserId;
}
