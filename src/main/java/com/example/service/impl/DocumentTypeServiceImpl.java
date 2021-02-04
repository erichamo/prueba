package com.example.service.impl;

import com.example.model.Client;
import com.example.model.DocumentType;
import com.example.repository.DocumentTypeRepository;
import com.example.service.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {
    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    @Override
    public DocumentType save(DocumentType documentType) {
        return documentTypeRepository.save(documentType);
    }

    @Override
    public boolean delete(Integer id) {
        if (documentTypeRepository.findById(id).isPresent()) {
            documentTypeRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public DocumentType update(DocumentType documentType) {
        return documentTypeRepository.save(documentType);
    }

    @Override
    public List<DocumentType> getAll() {
        return documentTypeRepository.findAll();
    }

    @Override
    public DocumentType getById(Integer id) {
        return documentTypeRepository.findById(id).get();
    }
}
