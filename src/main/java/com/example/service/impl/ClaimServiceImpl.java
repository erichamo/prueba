package com.example.service.impl;

import com.example.model.Claim;
import com.example.model.Client;
import com.example.repository.ClaimRepository;
import com.example.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {
    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public Claim save(Claim claim) {
        return claimRepository.save(claim);
    }

    @Override
    public boolean delete(Integer id) {
        if (claimRepository.findById(id).isPresent()) {
            claimRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public Claim update(Claim claim) {
        return claimRepository.save(claim);
    }

    @Override
    public List<Claim> getAll() {
        return claimRepository.findAll();
    }

    @Override
    public Claim getById(Integer id) {
        return claimRepository.findById(id).get();
    }
}
