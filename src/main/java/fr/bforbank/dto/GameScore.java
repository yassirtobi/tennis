package fr.bforbank.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GameScore {

    String pointPlayerA;
    String pointPlayerB;
}
