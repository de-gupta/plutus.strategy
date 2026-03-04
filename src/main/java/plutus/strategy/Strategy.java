package plutus.strategy;

import plutus.datatypes.model.Event;
import plutus.datatypes.model.Order;
import plutus.datatypes.model.Trade;

import java.util.Optional;

public interface Strategy
{
	Optional<Order> onTrade(Trade trade);

	void update(Event event);
}