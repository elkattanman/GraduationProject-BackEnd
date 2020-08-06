package com.mufic.Final.services.impl;

import com.mufic.Final.api.v2.mapper.SummerTermRulesMapper;
import com.mufic.Final.api.v2.model.SummerTermRulesDTO;
import com.mufic.Final.api.v2.model.lists.SummerTermRulesListDTO;
import com.mufic.Final.controllers.v2.StateController;
import com.mufic.Final.repositories.SummerTermRulesRepository;
import com.mufic.Final.services.ResourceNotFoundException;
import com.mufic.Final.services.SummerTermRuleService;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class  SummerTermRuleServiceImpl implements SummerTermRuleService {

    private final SummerTermRulesRepository summerTermRulesRepository;
    private final SummerTermRulesMapper summerTermRulesMapper;

    public SummerTermRuleServiceImpl(SummerTermRulesRepository summerTermRulesRepository, SummerTermRulesMapper summerTermRulesMapper) {
        this.summerTermRulesRepository = summerTermRulesRepository;
        this.summerTermRulesMapper = summerTermRulesMapper;
    }

    @Override
    public SummerTermRulesDTO getById(Long id) {
        return summerTermRulesRepository.findById(id)
            .map(summerTermRulesMapper::objToDTO)
            .map(summerTermRulesDTO -> {
                summerTermRulesDTO.setSummerTermRuleUrl(getUrl(id));
                return summerTermRulesDTO;
            })
            .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public SummerTermRulesListDTO getAll() {
        return new SummerTermRulesListDTO(
            summerTermRulesRepository.findAll()
            .stream()
            .map(summerTermRulesMapper::objToDTO)
            .map(summerTermRulesDTO -> {
                summerTermRulesDTO.setSummerTermRuleUrl(getUrl(summerTermRulesDTO.getId()));
                return summerTermRulesDTO;
            })
            .collect(Collectors.toList())
        );
    }

    @Override
    public SummerTermRulesDTO createNew(SummerTermRulesDTO summerTermRulesDTO) {
        return null;
    }

    @Override
    public SummerTermRulesDTO saveByDTO(Long id, SummerTermRulesDTO summerTermRulesDTO) {
        return null;
    }

    @Override
    public SummerTermRulesDTO patch(Long id, SummerTermRulesDTO vendorDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    private String getUrl(long id) {
        return StateController.BASE_URL + "/" + id;
    }

}
