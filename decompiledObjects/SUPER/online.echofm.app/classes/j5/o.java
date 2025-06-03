package j5;

import android.content.Context;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

public class o
  extends h
{
  public o(Context paramContext, a parama)
  {
    super(paramContext, parama);
  }
  
  public String c()
  {
    return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
  }
  
  public Cipher d()
  {
    return Cipher.getInstance("AES/GCM/NoPadding");
  }
  
  public int e()
  {
    return 12;
  }
  
  public AlgorithmParameterSpec f(byte[] paramArrayOfByte)
  {
    return new GCMParameterSpec(128, paramArrayOfByte);
  }
}

/* Location:
 * Qualified Name:     j5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */