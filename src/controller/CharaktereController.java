package controller;
import model.Charaktere;
import repo.CharaktereRepo;
import java.util.List;
public class CharaktereController {
    private CharaktereRepo charaktereRepo;

    public  CharaktereController(CharaktereRepo charaktereRepo) {
        this.charaktereRepo = charaktereRepo;
    }

    public void addCharaktere(Charaktere charaktere) {
        charaktereRepo.addCharaktere(charaktere);
    }

    public List<Charaktere> getAllCharaktere() {
        return charaktereRepo.getAllCharaktere();
    }

    public Charaktere getCharaktereById(int id) {
        return charaktereRepo.getCharaktereById(id);
    }

    public List<Charaktere> getCharaktereByLocation(String location) {
        return charaktereRepo.getCharaktereByLocation(location);
    }

    public void updateCharaktere(int id, Charaktere updatedCharaktere) {
        charaktereRepo.updateCharaktere(id, updatedCharaktere);
    }

    public void deleteCharaktere(int id) {
        charaktereRepo.deleteCharaktere(id);
    }
