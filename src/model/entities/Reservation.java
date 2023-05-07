package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
  private Integer roomNumber;
  private Date checkIn;
  private Date chckeout;
  

  public Reservation(Integer roomNumber){
    this.roomNumber = roomNumber;
  }
  
  public Reservation(Integer roomNumber, Date checkIn, Date chckeout) {
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.chckeout = chckeout;
  }
  public Integer getRoomNumber() {
    return roomNumber;
  }
  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }
  public Date getCheckIn() {
    return checkIn;
  }
  public Date getChckeout() {
    return chckeout;
  }

  public long durantion(){
    //millisegundos
    long diff  = chckeout.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  public void updateDates(Date checkIn, Date checkOut) throws DomainException{
    Date now  = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      throw new DomainException("Erro na reserva: Datas da reserva devem ser atualizadas para dads futuras");
    } 
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Erro na reserva: Data de checkOut deve ser depois da data de checkIn");
    }
    this.checkIn = checkIn;
    this.chckeout = checkOut;
  }
}
