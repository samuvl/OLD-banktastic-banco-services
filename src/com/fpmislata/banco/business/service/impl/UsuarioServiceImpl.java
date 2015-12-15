package com.fpmislata.banco.business.service.impl;

import com.fpmislata.banco.business.domain.Usuario;
import com.fpmislata.banco.business.service.UsuarioService;
import com.fpmislata.banco.core.BusinessException;
import com.fpmislata.banco.core.BusinessMessage;
import com.fpmislata.banco.persistence.dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author samu_
 */
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public Usuario get(int id) {
        return usuarioDAO.get(id);
    }

    @Override
    public Usuario insert(Usuario usuario) throws BusinessException {

        List<BusinessMessage> businessMessages = new ArrayList<>();

        if (usuario.getNick() == null || (usuario.getNick().trim().isEmpty())) {
            BusinessMessage businessMessage = new BusinessMessage("Nick: ", "El campo está vacio.");
            businessMessages.add(businessMessage);
        }

        if (usuario.getEncryptedPassword() == null || (usuario.getEncryptedPassword().trim().isEmpty())) {
            BusinessMessage businessMessage = new BusinessMessage("Password: ", "El campo está vacio.");
            businessMessages.add(businessMessage);
        }

        if ((usuario.getNombre() == null) || (usuario.getNombre().trim().isEmpty())) {
            BusinessMessage businessMessage = new BusinessMessage("Nombre: ", "El campo está vacio.");
            businessMessages.add(businessMessage);
        }

//        if (usuario.getRol() == null || usuario.getRol().toString().trim().isEmpty()) {
//            BusinessMessage businessMessage = new BusinessMessage("Rol: ", "El campo está vacio.");
//            businessMessages.add(businessMessage);
//        }
        
        if (businessMessages.size() > 0) {
            throw new BusinessException(businessMessages);
        }

        return usuarioDAO.insert(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) throws BusinessException {

        List<BusinessMessage> businessMessages = new ArrayList<>();

        if (usuario.getNick() == null || (usuario.getNick().trim().isEmpty())) {
            BusinessMessage businessMessage = new BusinessMessage("Nick: ", "El campo está vacio.");
            businessMessages.add(businessMessage);
        }

        if (usuario.getEncryptedPassword() == null || (usuario.getEncryptedPassword().trim().isEmpty())) {
            BusinessMessage businessMessage = new BusinessMessage("Password: ", "El campo está vacio.");
            businessMessages.add(businessMessage);
        }

        if ((usuario.getNombre() == null) || (usuario.getNombre().trim().isEmpty())) {
            BusinessMessage businessMessage = new BusinessMessage("Nombre: ", "El campo está vacio.");
            businessMessages.add(businessMessage);
        }

//        if (usuario.getRol() == null || usuario.getRol().toString().trim().isEmpty()) {
//            BusinessMessage businessMessage = new BusinessMessage("Rol: ", "El campo está vacio.");
//            businessMessages.add(businessMessage);
//        }

        if (businessMessages.size() > 0) {
            throw new BusinessException(businessMessages);
        }

        return usuarioDAO.update(usuario);
    }

    @Override
    public boolean delete(int id) {
        return usuarioDAO.delete(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    public List<Usuario> findByNombre(String nombre) {
        return usuarioDAO.findByNombre(nombre);
    }
}
