package k3;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

public abstract class t
{
  public static final Charset a = Charset.forName("UTF-8");
  
  public static Integer a()
  {
    if (!b()) {
      return null;
    }
    return a.a();
  }
  
  public static boolean b()
  {
    return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
  }
  
  public static int c()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    byte[] arrayOfByte = new byte[4];
    for (int i = 0; i == 0; i = (arrayOfByte[0] & 0x7F) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF) {
      localSecureRandom.nextBytes(arrayOfByte);
    }
    return i;
  }
  
  public static final byte d(char paramChar)
  {
    if ((paramChar >= '!') && (paramChar <= '~')) {
      return (byte)paramChar;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Not a printable ASCII character: ");
    localStringBuilder.append(paramChar);
    throw new s(localStringBuilder.toString());
  }
  
  public static final r3.a e(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length()];
    for (int i = 0; i < paramString.length(); i++) {
      arrayOfByte[i] = d(paramString.charAt(i));
    }
    return r3.a.a(arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     k3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */