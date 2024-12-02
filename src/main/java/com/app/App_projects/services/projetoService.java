package com.app.App_projects.services;

import com.app.App_projects.domain.participantes.Participantes;
import com.app.App_projects.domain.projetos.Projetos;
import com.app.App_projects.repository.projetosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface projetoService {

    void insertProjeto(Projetos projetos);

    void updateProjeto(UUID id, Projetos projetos) throws Exception;

    void deleteProjeto(UUID id);

    List<Projetos> showAllProjetos();

    Optional<Projetos> showById(UUID id);

    Optional<Projetos> findByTitulo(String titulo);
}