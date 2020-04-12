package com.alexperal.training.java.lists.l03.impls;

import com.alexperal.training.java.lists.l03.LegacyUntrustedApi;
import com.alexperal.training.java.lists.l03.TicketElement;

import java.util.List;

public class Impl01Fair implements LegacyUntrustedApi {
    @Override
    public long computeTicketPrice(List<TicketElement> ticketElements) {
        long sum = 0;
        for (TicketElement ticketElement : ticketElements) {
            long p = ticketElement.getProductPrice();
            sum += p;
        }
        return sum;
    }
}
