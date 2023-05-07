package model.entities;

import java.time.LocalDate;

import model.enums.OrderStatus;


public class Order {
  private Integer id;
  private LocalDate moment;
  public static OrderStatus status = OrderStatus.valueOf("PENDING_PAYMENT");
}
