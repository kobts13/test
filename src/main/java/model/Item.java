package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public final class Item extends Base {
    private UUID partyInteractionId;
    private UUID externalRefId;
    private String externalRefType;
    private UUID createdByUserId;
}
