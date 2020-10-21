package com.beijing.providerticket.control;

import com.beijing.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zc217
 * @Date 2020/10/21
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    /**
     * 服务提供
     * http://localhost:8001/ticket
     */
    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
