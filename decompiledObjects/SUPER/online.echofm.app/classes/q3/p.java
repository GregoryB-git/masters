package q3;

import java.security.SecureRandom;
import java.util.Random;

public abstract class p
{
  public static final ThreadLocal a = new a();
  
  public static SecureRandom b()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    localSecureRandom.nextLong();
    return localSecureRandom;
  }
  
  public static byte[] c(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    ((SecureRandom)a.get()).nextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  public class a
    extends ThreadLocal
  {
    public SecureRandom a()
    {
      return p.a();
    }
  }
}

/* Location:
 * Qualified Name:     q3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */