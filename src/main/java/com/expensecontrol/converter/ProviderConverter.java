package com.expensecontrol.converter;

import com.expensecontrol.dto.ProviderDTO;
import com.expensecontrol.enums.ServiceProvidedEnum;
import com.expensecontrol.model.ProviderModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {

    @Autowired
    private ModelMapper modelMapper;

    public ProviderModel dtoToModel(ProviderDTO dto){

        ProviderModel model =modelMapper.map(dto, ProviderModel.class);
        model.setServiceProvided(ServiceProvidedEnum.valueOf(dto.getServiceProvided()));
        return model;

    }

    public ProviderDTO modelToDto(ProviderModel model){

        ProviderDTO dto =modelMapper.map(model, ProviderDTO.class);
        dto.setServiceProvided(model.getServiceProvided().name());
        return dto;

    }
}
