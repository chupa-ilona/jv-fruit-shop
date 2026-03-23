package core.basesyntax;

import java.util.Map;

public class PurchaseOperation implements OperationHandler {

    @Override
    public void handle(Map<String, Integer> storage, FruitTransaction tx) {
        if (storage.get(tx.getFruit()) < tx.getQuantity()) {
            throw new IllegalStateException("No enough " + tx.getFruit() + " in stock");
        } else {
            storage.merge(tx.getFruit(), -tx.getQuantity(), Integer::sum);}

    }
}
