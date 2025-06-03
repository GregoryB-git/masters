package w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import u7.f;
import u7.j;

public final class b
{
  public static final String[] c = { "*", "FCM", "GCM", "" };
  public final SharedPreferences a;
  public final String b;
  
  public b(f paramf)
  {
    paramf.a();
    a = a.getSharedPreferences("com.google.android.gms.appid", 0);
    paramf.a();
    String str = c.e;
    if (str != null)
    {
      paramf = str;
    }
    else
    {
      paramf.a();
      paramf = c.b;
      if ((paramf.startsWith("1:")) || (paramf.startsWith("2:")))
      {
        paramf = paramf.split(":");
        if (paramf.length != 4) {}
        do
        {
          paramf = null;
          break;
          str = paramf[1];
          paramf = str;
        } while (str.isEmpty());
      }
    }
    b = paramf;
  }
  
  public final String a()
  {
    synchronized (a)
    {
      Object localObject1 = a;
      Object localObject5 = null;
      localObject1 = ((SharedPreferences)localObject1).getString("|S||P|", null);
      if (localObject1 == null) {
        return null;
      }
      try
      {
        localObject6 = Base64.decode((String)localObject1, 8);
        localObject1 = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec localX509EncodedKeySpec = new java/security/spec/X509EncodedKeySpec;
        localX509EncodedKeySpec.<init>((byte[])localObject6);
        localObject1 = ((KeyFactory)localObject1).generatePublic(localX509EncodedKeySpec);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException1) {}catch (InvalidKeySpecException localInvalidKeySpecException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      ((StringBuilder)localObject6).append("Invalid key stored ");
      ((StringBuilder)localObject6).append(localIllegalArgumentException);
      Log.w("ContentValues", ((StringBuilder)localObject6).toString());
      Object localObject2 = null;
      if (localObject2 == null) {
        return null;
      }
      localObject2 = ((Key)localObject2).getEncoded();
      Object localObject3;
      try
      {
        localObject2 = MessageDigest.getInstance("SHA1").digest((byte[])localObject2);
        localObject2[0] = ((byte)(byte)((localObject2[0] & 0xF) + 112 & 0xFF));
        localObject2 = Base64.encodeToString((byte[])localObject2, 0, 8, 11);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException2)
      {
        Log.w("ContentValues", "Unexpected error, device missing required algorithms");
        localObject3 = localObject5;
      }
      return (String)localObject3;
    }
  }
}

/* Location:
 * Qualified Name:     w9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */