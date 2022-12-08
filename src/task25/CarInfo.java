package task25;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class CarInfo {
    private String model;
    private int year;
    private int price;
    private String  color;

    @Override
    public String toString() {
        return " MODEL: " + model +
                "  YEAR: " + year +
                "  PRICE: " + price +
                "  COLOR: " + color;
    }
}
