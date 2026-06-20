package org.example.buhosapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.buhosapp.repositories.RoleRepository;
import org.example.buhosapp.services.RoleService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
}
