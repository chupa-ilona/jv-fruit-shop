package core.basesyntax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopServiceImpl implements ShopService {
    private final OperationStrategy strategy;
    private Storage storage;

    public ShopServiceImpl(OperationStrategy strategy) {
        this.strategy = strategy;
        this.storage = new Storage(new HashMap<>());

    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for(FruitTransaction tx : transactions) {
            strategy.getHandler(tx.getOperation()).handle(storage.getStorage(), tx);
        }
    }

    @Override
    public Storage getStorage() {
        return storage;
    }
}
