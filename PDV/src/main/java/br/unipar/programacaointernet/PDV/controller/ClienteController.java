package br.unipar.programacaointernet.PDV.controller;

import br.unipar.programacaointernet.PDV.Service.ClienteService;
import br.unipar.programacaointernet.PDV.model.Cliente;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/cliente")
public class ClienteController {
    @Inject
    private ClienteService clienteService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarCliente() {
        return Response.ok(clienteService.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response cadastrarCliente(Cliente cliente) {
        try {
            clienteService.cadastrar(cliente);
            return Response.status(201)
                    .entity("Cliente cadastrado com sucesso")
                    .build();
        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }

}
