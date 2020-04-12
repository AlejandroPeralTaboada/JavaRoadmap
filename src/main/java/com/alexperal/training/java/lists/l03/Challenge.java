package com.alexperal.training.java.lists.l03;

import com.alexperal.training.java.lists.l03.impls.Impl01Fair;
import com.alexperal.training.java.lists.l03.impls.Impl02CollectionModification;
import com.alexperal.training.java.lists.l03.impls.Impl03ElementModification;
import com.alexperal.training.java.lists.l03.impls.Impl04Hell;

import java.util.ArrayList;
import java.util.List;

public class Challenge {

    public static void main(String[] args) {
        TicketElement p1 = new TicketElement("P1", 10L);
        TicketElement p2 = new TicketElement("P2", 20L);
        TicketElement p3 = new TicketElement("P3", 15L);
        List<TicketElement> ticketElements = new ArrayList<>();
        ticketElements.add(p1);
        ticketElements.add(p2);
        ticketElements.add(p3);
        LegacyUntrustedApi api = new Impl01Fair();
        System.out.println(api.computeTicketPrice(ticketElements) == 45L);
        System.out.println(api.computeTicketPrice(ticketElements) == 45L);
    }
}
