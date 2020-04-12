package com.alexperal.training.java.lists.l03.impls;

import com.alexperal.training.java.lists.l03.LegacyUntrustedApi;
import com.alexperal.training.java.lists.l03.TicketElement;

import java.lang.reflect.Field;
import java.util.List;

public class Impl04Hell implements LegacyUntrustedApi {
    @Override
    public long computeTicketPrice(List<TicketElement> ticketElements) {
        long sum = 0;
        while (!ticketElements.isEmpty()) {
            TicketElement remove = ticketElements.remove(0);
            sum += remove.getProductPrice();
            hell(remove);
        }
        return sum;
    }

    private void hell(TicketElement remove) {
        Field[] declaredFields = remove.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            try {
                declaredField.set(remove,null);
            } catch (IllegalAccessException e) {
                // do nothing
            }
        }
    }
}
