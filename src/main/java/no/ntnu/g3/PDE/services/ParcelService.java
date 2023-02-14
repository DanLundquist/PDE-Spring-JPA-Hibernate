package no.ntnu.g3.PDE.services;

import no.ntnu.g3.PDE.models.Parcel;
import no.ntnu.g3.PDE.repositories.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    public List<Parcel> list() {
        return parcelRepository.findAll();
    }
}
