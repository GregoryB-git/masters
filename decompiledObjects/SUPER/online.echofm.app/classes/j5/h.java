package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class h
  implements i
{
  public final Cipher a;
  public final SecureRandom b = new SecureRandom();
  public Key c;
  
  public h(Context paramContext, a parama)
  {
    String str = c();
    Object localObject1 = paramContext.getSharedPreferences("FlutterSecureKeyStorage", 0);
    paramContext = ((SharedPreferences)localObject1).edit();
    localObject1 = ((SharedPreferences)localObject1).getString(str, null);
    a = d();
    if (localObject1 != null) {
      try
      {
        c = parama.b(Base64.decode((String)localObject1, 0), "AES");
        return;
      }
      catch (Exception localException)
      {
        Log.e("StorageCipher18Impl", "unwrap key failed", localException);
      }
    }
    Object localObject2 = new byte[16];
    b.nextBytes((byte[])localObject2);
    localObject2 = new SecretKeySpec((byte[])localObject2, "AES");
    c = ((Key)localObject2);
    paramContext.putString(str, Base64.encodeToString(parama.a((Key)localObject2), 0));
    paramContext.apply();
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    int i = e();
    byte[] arrayOfByte = new byte[i];
    b.nextBytes(arrayOfByte);
    Object localObject = f(arrayOfByte);
    a.init(1, c, (AlgorithmParameterSpec)localObject);
    paramArrayOfByte = a.doFinal(paramArrayOfByte);
    localObject = new byte[paramArrayOfByte.length + i];
    System.arraycopy(arrayOfByte, 0, localObject, 0, i);
    System.arraycopy(paramArrayOfByte, 0, localObject, i, paramArrayOfByte.length);
    return (byte[])localObject;
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    int i = e();
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
    AlgorithmParameterSpec localAlgorithmParameterSpec = f(arrayOfByte);
    int j = paramArrayOfByte.length - e();
    arrayOfByte = new byte[j];
    System.arraycopy(paramArrayOfByte, i, arrayOfByte, 0, j);
    a.init(2, c, localAlgorithmParameterSpec);
    return a.doFinal(arrayOfByte);
  }
  
  public String c()
  {
    return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
  }
  
  public Cipher d()
  {
    return Cipher.getInstance("AES/CBC/PKCS7Padding");
  }
  
  public int e()
  {
    return 16;
  }
  
  public AlgorithmParameterSpec f(byte[] paramArrayOfByte)
  {
    return new IvParameterSpec(paramArrayOfByte);
  }
}

/* Location:
 * Qualified Name:     j5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */