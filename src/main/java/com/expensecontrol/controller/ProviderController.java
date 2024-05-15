package com.expensecontrol.controller;

import com.expensecontrol.converter.ProviderConverter;
import com.expensecontrol.dto.ProviderDTO;
import com.expensecontrol.model.ProviderModel;
import com.expensecontrol.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/providers")
@RequiredArgsConstructor
public class ProviderController {

    private final ProviderService service;
    private final ProviderConverter converter;

    @GetMapping
    public ResponseEntity<List<ProviderDTO>> findAll() throws Exception{
        List<ProviderDTO> list = service.findAll().stream().map(converter::modelToDto).toList();

        return new ResponseEntity<>(list, OK);
    }

    @GetMapping("/pageable")
    public ResponseEntity<Page<ProviderDTO>> pageable(Pageable pageable) throws Exception{

        Page<ProviderDTO> page = service.pageable(pageable).map(converter::modelToDto);

        return new ResponseEntity<>(page, OK);

    }

    @PostMapping
    public ResponseEntity<Void> save (@RequestBody ProviderDTO dto) throws Exception{

        ProviderModel model = service.save(converter.dtoToModel(dto));
        return ResponseEntity.accepted().build();
    }
}
