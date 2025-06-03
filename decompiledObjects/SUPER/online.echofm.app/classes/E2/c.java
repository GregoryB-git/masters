package E2;

import android.util.Base64;

public abstract class c
{
  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
}

/* Location:
 * Qualified Name:     E2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */