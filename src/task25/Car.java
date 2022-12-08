package task25;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private String licencePlate;

    @Override
    public String toString() {
        return "Car - " +
                "Licence Plate: " + licencePlate + " -> ";
    }
}
