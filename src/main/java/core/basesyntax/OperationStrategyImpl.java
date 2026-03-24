package core.basesyntax;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OperationStrategyImpl implements OperationStrategy {
    private Map<FruitTransaction.Operation, OperationHandler> handlers = new HashMap<>();

    public OperationStrategyImpl(Map<FruitTransaction.Operation, OperationHandler> handlers) {
        if (handlers == null || handlers.isEmpty()) {
            throw new IllegalArgumentException("handlers map must not be null or empty");
        }
        this.handlers = Collections.unmodifiableMap(new HashMap<>(handlers));
    }

    @Override
    public OperationHandler getHandler(FruitTransaction.Operation operation) {
        OperationHandler handler = handlers.get(operation);
        if (handler == null) {
            throw new IllegalArgumentException("No handler found for operation: " + operation);
        }
        return handler;
    }
}
