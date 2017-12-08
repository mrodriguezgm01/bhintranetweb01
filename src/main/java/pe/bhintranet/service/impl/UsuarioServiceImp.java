/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bhintranet.service.impl;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.bhintranet.model.bean.Usuario;
import pe.bhintranet.model.dao.UsuarioDAO;
import pe.bhintranet.service.inf.UsuarioService;

/**
 *
 * @author moises_rodriguez
 */
@Service
@Transactional
public class UsuarioServiceImp implements UsuarioService{
    //@Autowired
    UsuarioDAO usuarioDAO;
    
    @Override
    public Usuario selectByLoginName(String loginName) {
        return usuarioDAO.selectByLoginName(loginName);
    }

    @Override
    public Collection listar(Usuario record) {
        
        return usuarioDAO.listar(record);
        
    }
    
}
