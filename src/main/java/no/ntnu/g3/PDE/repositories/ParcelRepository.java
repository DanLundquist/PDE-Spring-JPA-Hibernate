package no.ntnu.g3.PDE.repositories;

import no.ntnu.g3.PDE.models.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
}