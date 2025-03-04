package ch.egli.commerce.product.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductDTO {

  @NotNull
  private String id;

  @NotNull
  private Integer quantity;

  private String name;

}
