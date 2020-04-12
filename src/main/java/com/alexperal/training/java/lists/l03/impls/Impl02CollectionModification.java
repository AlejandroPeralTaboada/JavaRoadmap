package com.alexperal.training.java.lists.l03.impls;

import com.alexperal.training.java.lists.l03.LegacyUntrustedApi;
import com.alexperal.training.java.lists.l03.TicketElement;

import java.util.List;

public class Impl02CollectionModification implements LegacyUntrustedApi {
    @Override
    public long computeTicketPrice(List<TicketElement> ticketElements) {
        long sum = 0;
        while (!ticketElements.isEmpty()) {
            TicketElement remove = ticketElements.remove(0);
            sum += remove.getProductPrice();
        }
        return sum;
    }
}
