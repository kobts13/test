package model;

import lombok.Data;

@Data
public final class Interaction {
    private Base after;
    private Source source;
}
