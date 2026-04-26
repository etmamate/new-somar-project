package br.com.somar.backend_somar.DTO.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data
public class LoginRequest {
    private String email;
    private String senha;
}
