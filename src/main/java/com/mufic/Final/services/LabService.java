package com.mufic.Final.services;

import com.mufic.Final.api.v2.model.LabDTO;
import com.mufic.Final.api.v2.model.lists.LabListDTO;

public interface LabService {
    LabDTO getById(Long id);

    LabListDTO getAll();

    LabDTO createNew(LabDTO labDTO);

    LabDTO saveByDTO(Long id, LabDTO vendorDTO);

    LabDTO patch(Long id, LabDTO vendorDTO);

    void deleteById(Long id);

}
