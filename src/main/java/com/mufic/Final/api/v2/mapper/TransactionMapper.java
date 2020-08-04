package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.TransactionDTO;
import com.mufic.Final.domain.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);


    @Mapping(source = "term.id", target = "term")
    @Mapping(source = "student.id", target = "student")
    TransactionDTO objToDTO(Transaction obj);
}
