package dev.dataivan.mqttdata.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completerdOn,
        Integer miles,
        Location location
) {
}
