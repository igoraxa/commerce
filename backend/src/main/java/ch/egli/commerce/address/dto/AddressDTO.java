package ch.egli.commerce.address.dto;

import ch.egli.commerce.dto.AbstractDTO;
import ch.egli.commerce.persistence.Address;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO extends AbstractDTO {

  @NotNull
  private String name = "";

  @NotNull
  private String prename = "";

  @NotNull
  private String street = "";

  @NotNull
  private String number = "";

  @NotNull
  private String zip = "";

  @NotNull
  private String city = "";

  public Address toEntity() {
    // FIXME fetch address from database to avoid hibernate session conflict
    Address ad = new Address();
    ad.setName(this.getName());
    ad.setPrename(this.getPrename());
    ad.setStreet(this.getStreet());
    ad.setNumber(this.getNumber());
    ad.setZip(this.getZip());
    ad.setCity(this.getCity());

    return ad;
  }

  public AddressDTO fromEntity(Address entity) {
    AddressDTO addressDTO = new AddressDTO();

    super.fromEntity(this, entity);

    addressDTO.setCity(entity.getCity());
    addressDTO.setName(entity.getName());
    addressDTO.setNumber(entity.getNumber());
    addressDTO.setPrename(entity.getPrename());
    addressDTO.setStreet(entity.getStreet());
    addressDTO.setZip(entity.getZip());

    return addressDTO;
  }

}
