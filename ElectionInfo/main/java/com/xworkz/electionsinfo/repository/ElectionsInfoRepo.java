package com.xworkz.electionsinfo.repository;

import java.util.List;

import com.xworkz.electionsinfo.dto.ElectionsInfoDto;

public interface ElectionsInfoRepo {

public	boolean save(ElectionsInfoDto dto);

public List<ElectionsInfoDto> readAll();

}
