package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ParkingLotMapper<ParkingLot> {

    List<ParkingLot> selectAll();

    void insert(@Param("parkinglot") ParkingLot parkingLot);

    List<ParkingLot> selectById(@Param("id") int id);
}
