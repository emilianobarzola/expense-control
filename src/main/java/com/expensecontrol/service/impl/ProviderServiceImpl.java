package com.expensecontrol.service.impl;

import com.expensecontrol.model.ProviderModel;
import com.expensecontrol.repo.GenericRepo;
import com.expensecontrol.repo.ProviderRepo;
import com.expensecontrol.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProviderServiceImpl extends GenericServiceImpl<ProviderModel, Integer> implements ProviderService {

    private final ProviderRepo repo;
    @Override
    protected GenericRepo<ProviderModel, Integer> getRepo() {
        return repo;
    }
}
