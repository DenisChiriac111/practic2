package controller;
import model.Produkt;
import repo.ProduktRepo;
import java.util.List;
public class ProduktController {
    private ProduktRepo produktRepo;

    public ProduktController(ProduktRepo produktRepo) {
        this.produktRepo = produktRepo;
    }

    public void addProdukt(Produkt produkt) {
        produktRepo.addProdukt(produkt);
    }

    public List<Produkt> getAllProdukts() {
        return produktRepo.getAllProdukts();
    }

    public Produkt getProduktByName(String name) {
        return produktRepo.getProduktByName(name);
    }

    public void updateProdukt(String name, Produkt updatedProdukt) {
        produktRepo.updateProdukt(name, updatedProdukt);
    }

    public void deleteProdukt(String name) {
        produktRepo.deleteProdukt(name);
    }


    public List<Produkt> getProduktsByPrice(double price) {
        return produktRepo.getProduktsByPrice(price);
    }




}
