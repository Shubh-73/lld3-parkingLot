package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import service.TicketService;

public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO response(IssueTicketRequestDTO request){

        IssueTicketResponseDTO responseDTO = new
                IssueTicketResponseDTO();

        try{
            //Ticket ticket =
        }catch(Exception e){

        }
    }
}
