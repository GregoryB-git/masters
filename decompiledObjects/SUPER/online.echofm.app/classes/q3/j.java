package q3;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public abstract interface j
{
  public abstract Object a(String paramString, Provider paramProvider);
  
  public static class a
    implements j
  {
    public Cipher b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return Cipher.getInstance(paramString);
      }
      return Cipher.getInstance(paramString, paramProvider);
    }
  }
  
  public static class b
    implements j
  {
    public KeyAgreement b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return KeyAgreement.getInstance(paramString);
      }
      return KeyAgreement.getInstance(paramString, paramProvider);
    }
  }
  
  public static class c
    implements j
  {
    public KeyFactory b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return KeyFactory.getInstance(paramString);
      }
      return KeyFactory.getInstance(paramString, paramProvider);
    }
  }
  
  public static class d
    implements j
  {
    public KeyPairGenerator b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return KeyPairGenerator.getInstance(paramString);
      }
      return KeyPairGenerator.getInstance(paramString, paramProvider);
    }
  }
  
  public static class e
    implements j
  {
    public Mac b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return Mac.getInstance(paramString);
      }
      return Mac.getInstance(paramString, paramProvider);
    }
  }
  
  public static class f
    implements j
  {
    public MessageDigest b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return MessageDigest.getInstance(paramString);
      }
      return MessageDigest.getInstance(paramString, paramProvider);
    }
  }
  
  public static class g
    implements j
  {
    public Signature b(String paramString, Provider paramProvider)
    {
      if (paramProvider == null) {
        return Signature.getInstance(paramString);
      }
      return Signature.getInstance(paramString, paramProvider);
    }
  }
}

/* Location:
 * Qualified Name:     q3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */