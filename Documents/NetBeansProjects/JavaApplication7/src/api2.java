/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 91799
 */
import com.mysql.cj.protocol.Message;
import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;
public class api2 {
  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "AC32d3f96546bc7ba59a8b3da0fb652241";
  public static final String AUTH_TOKEN = "[AuthToken]";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(
      new com.twilio.type.PhoneNumber("+919594791079"),
      new com.twilio.type.PhoneNumber("+12293982685"),
      "fufufuf"

    .create();

    System.out.println(message.getSid());
  }
}
