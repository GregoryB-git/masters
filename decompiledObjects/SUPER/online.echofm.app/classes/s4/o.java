package s4;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class o
{
  public static final byte a = Byte.parseByte("01110000", 2);
  public static final byte b = Byte.parseByte("00001111", 2);
  
  public static String b(byte[] paramArrayOfByte)
  {
    return new String(Base64.encode(paramArrayOfByte, 11), Charset.defaultCharset()).substring(0, 22);
  }
  
  public static byte[] c(UUID paramUUID, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.putLong(paramUUID.getMostSignificantBits());
    paramArrayOfByte.putLong(paramUUID.getLeastSignificantBits());
    return paramArrayOfByte.array();
  }
  
  public String a()
  {
    byte[] arrayOfByte = c(UUID.randomUUID(), new byte[17]);
    int i = arrayOfByte[0];
    arrayOfByte[16] = ((byte)i);
    arrayOfByte[0] = ((byte)(byte)(i & b | a));
    return b(arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     s4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */