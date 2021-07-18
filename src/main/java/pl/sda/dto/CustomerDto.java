package pl.sda.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private String firstName;
    private String lastName;
}
