package gb;

import java.util.logging.Logger;
import n7.d;

public final class p3
{
  public static final Logger a = Logger.getLogger(p3.class.getName());
  public static final byte[] b = "-bin".getBytes(d.a);
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length - paramArrayOfByte2.length;
    if (i < 0) {
      return false;
    }
    for (int j = i; j < paramArrayOfByte1.length; j++) {
      if (paramArrayOfByte1[j] != paramArrayOfByte2[(j - i)]) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     gb.p3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */