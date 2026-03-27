package com.startdev.agendador_horarios.services;

import com.startdev.agendador_horarios.infrastructure.entity.Agendamento;
import com.startdev.agendador_horarios.infrastructure.repository.AgendamentoRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DataLoaderService {

    private final AgendamentoRepository agendamentoRepository;

    @PostConstruct
    public void init() {
        // Insere dados de teste apenas se não houver registros
        if (agendamentoRepository.count() == 0) {
            Agendamento a1 = new Agendamento();
            a1.setCliente("Alexandro");
            a1.setServico("Corte de cabelo");
            a1.setDataHoraAgendamento(LocalDateTime.now().plusDays(1));
            agendamentoRepository.save(a1);

            Agendamento a2 = new Agendamento();
            a2.setCliente("Maria");
            a2.setServico("Manicure");
            a2.setDataHoraAgendamento(LocalDateTime.now().plusDays(2));
            agendamentoRepository.save(a2);
        }
    }
}
