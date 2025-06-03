package q3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

public abstract class r
{
  public static final Pattern a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" }), 2);
  public static final Pattern b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" }), 2);
  
  public static void a(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt * 8) }));
    }
  }
  
  public static String b(String paramString1, String paramString2)
  {
    if (paramString2.toLowerCase(Locale.US).startsWith(paramString1)) {
      return paramString2.substring(paramString1.length());
    }
    throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[] { paramString1 }));
  }
  
  public static void c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return;
    }
    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
}

/* Location:
 * Qualified Name:     q3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */