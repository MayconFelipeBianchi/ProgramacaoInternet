package br.unipar.programacaointernet.PDV.controller;

import br.unipar.programacaointernet.PDV.Service.ItensVendaService;
import br.unipar.programacaointernet.PDV.model.ItensVenda;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/itensVenda")
public class ItemVendaController {
    @Inject
    private ItensVendaService itensVendaService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listaItensVenda() {
        return Response.ok(itensVendaService.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response cadastrarVenda(ItensVenda itensVenda) {
        try {
            itensVendaService.cadastrar(itensVenda);
            return Response.status(201)
                    .entity("Venda cadastrada com sucesso")
                    .build();
        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}
