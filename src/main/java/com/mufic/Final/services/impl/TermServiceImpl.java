package com.mufic.Final.services.impl;

import com.mufic.Final.api.v2.mapper.TermMapper;
import com.mufic.Final.api.v2.model.TermDTO;
import com.mufic.Final.api.v2.model.lists.TermListDTO;
import com.mufic.Final.controllers.v2.StateController;
import com.mufic.Final.controllers.v2.TermController;
import com.mufic.Final.repositories.TermRepository;
import com.mufic.Final.services.ResourceNotFoundException;
import com.mufic.Final.services.TermService;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class TermServiceImpl implements TermService {

    private final TermMapper termMapper;
    private final TermRepository termRepository;

    public TermServiceImpl(TermMapper termMapper, TermRepository termRepository) {
        this.termMapper = termMapper;
        this.termRepository = termRepository;
    }

    @Override
    public TermDTO getById(Long id) {
        return termRepository.findById(id)
                .map(termMapper::objToDTO)
                .map(termDTO -> {
                    termDTO.setTermUrl(getUrl(id));
                    return termDTO;
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public TermListDTO getAll() {
        return new TermListDTO(
            termRepository.findAll()
            .stream()
            .map(termMapper::objToDTO)
            .map(termDTO -> {
                termDTO.setTermUrl(getUrl(termDTO.getId()));
                return termDTO;
            })
            .collect(Collectors.toList())
        );
    }

    @Override
    public TermDTO createNew(TermDTO termDTO) {
        return null;
    }

    @Override
    public TermDTO saveByDTO(Long id, TermDTO termDTO) {
        return null;
    }

    @Override
    public TermDTO patch(Long id, TermDTO termDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    private String getUrl(long id) {
        return TermController.BASE_URL + "/" + id;
    }

}
