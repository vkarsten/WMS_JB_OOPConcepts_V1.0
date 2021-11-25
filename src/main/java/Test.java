package main.java;

import main.java.data.Item;
import main.java.data.Warehouse;
import main.java.data.WarehouseRepository;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        for (Warehouse warehouse : WarehouseRepository.WAREHOUSE_LIST) {
            System.out.println(warehouse.toString());
        }
    }
}