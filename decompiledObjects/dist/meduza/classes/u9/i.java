package u9;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public final class i
{
  public static final byte a = Byte.parseByte("01110000", 2);
  public static final byte b = Byte.parseByte("00001111", 2);
  
  public static String a()
  {
    UUID localUUID = UUID.randomUUID();
    Object localObject = ByteBuffer.wrap(new byte[17]);
    ((ByteBuffer)localObject).putLong(localUUID.getMostSignificantBits());
    ((ByteBuffer)localObject).putLong(localUUID.getLeastSignificantBits());
    localObject = ((ByteBuffer)localObject).array();
    int i = localObject[0];
    localObject[16] = ((byte)i);
    localObject[0] = ((byte)(byte)(i & b | a));
    return new String(Base64.encode((byte[])localObject, 11), Charset.defaultCharset()).substring(0, 22);
  }
}

/* Location:
 * Qualified Name:     u9.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */