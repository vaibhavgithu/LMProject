 
package com.main.springrolejwt.service;

import com.main.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
