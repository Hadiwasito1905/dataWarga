package com.datawarga.service;

import com.datawarga.entity.Warga;
import com.datawarga.repo.WargaRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WargaService {

    @Autowired
    private WargaRepos wargaRepos;


    private Warga wargaBambang;
    private Warga wargaSantoso;


    public List<Warga> init(){
        wargaBambang = new Warga();
        wargaBambang.setNama("Bambang");
        wargaBambang.setPekerjaan("Sopir");

        wargaSantoso = new Warga();
        wargaSantoso.setNama("Santoso");
        wargaSantoso.setPekerjaan("Bakul bakwan");


        return null;
    }



//    public Warga save(Warga warga){
//        return wargaRepos.save(warga);
//    }


//    public ResponseData saveData(RequestData requestData){
//        try{
//            Warga warga1 = wargaRepos.save(Warga.builder()
//                    .nama(requestData.getNama())
//                    .pekerjaan(requestData.getPekerjaan())
//                    .build());
//            return ResponseData.builder()
//                    .success(true)
//                    .messages("Success")
//                    .data(ListDataResponse.builder().Warga(warga1).build())
//                    .build();
//        }catch (Exception e){
//            return ResponseData.builder()
//                    .success(false)
//                    .messages("Authorization Invalid")
//                    .data(null)
//                    .build();
//        }
//    }
//
//    public Warga update(Warga warga){
//        return wargaRepos.save(warga);
//    }
//
//    public Warga findOne(Long id){
//        Optional<Warga> warga = wargaRepos.findById(id);
//        if(!warga.isPresent()){
//            return null;
//        }
//        return warga.get();
//    }
//
//    public List<Warga> findAll(){
//        return wargaRepos.findAll();
//    }

//    public Warga softDelete(Long id){
//        Warga currentWarga = findOne(id);
//        currentWarga.setDeleted(Boolean.TRUE);
//        return wargaRepos.save(currentWarga);
//    }

//    public List<Warga> findByNama(String nama){
//        return wargaRepos.findByNamaContains(nama);
//    }






}
