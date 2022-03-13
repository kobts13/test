package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public final class Party extends Base {
    private String startDate;
    private String endDate;
    private UUID createdByUserId;
}
