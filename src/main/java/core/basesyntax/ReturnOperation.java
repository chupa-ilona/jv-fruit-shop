package core.basesyntax;

import java.util.Map;

public class ReturnOperation implements OperationHandler {
    @Override
    public void handle(Map<String, Integer> storage, FruitTransaction tx) {
        storage.merge(tx.getFruit(), tx.getQuantity(), Integer::sum);
    }

}
