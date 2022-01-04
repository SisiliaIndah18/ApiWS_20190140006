/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webserice.a.praktekpws.a;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author User
 */
@Entity
@Table(name="customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Erialb {
    @Id
    private String idcust;
    private String nama;
    private String nohp;
    private String jenis;
    private String jumlah;
    
}
