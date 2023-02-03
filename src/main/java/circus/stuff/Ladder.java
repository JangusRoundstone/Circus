package circus.stuff;

import circus.stuff.Equipment;

public class Ladder extends Equipment {

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
