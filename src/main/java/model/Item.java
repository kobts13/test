package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public final class Item extends Base {
    private UUID partyInteractionId;
    private UUID externalRefId;
    private String externalRefType;
    private UUID createdByUserId;
}
