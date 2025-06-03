package u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;
import s3.m;

public class b
{
  public static final String[] c = { "*", "FCM", "GCM", "" };
  public final SharedPreferences a;
  public final String b;
  
  public b(e parame)
  {
    a = parame.m().getSharedPreferences("com.google.android.gms.appid", 0);
    b = b(parame);
  }
  
  public static String b(e parame)
  {
    String str = parame.r().f();
    if (str != null) {
      return str;
    }
    parame = parame.r().c();
    if ((!parame.startsWith("1:")) && (!parame.startsWith("2:"))) {
      return parame;
    }
    parame = parame.split(":");
    if (parame.length != 4) {
      return null;
    }
    parame = parame[1];
    if (parame.isEmpty()) {
      return null;
    }
    return parame;
  }
  
  public static String c(PublicKey paramPublicKey)
  {
    paramPublicKey = paramPublicKey.getEncoded();
    try
    {
      paramPublicKey = MessageDigest.getInstance("SHA1").digest(paramPublicKey);
      paramPublicKey[0] = ((byte)(byte)((paramPublicKey[0] & 0xF) + 112 & 0xFF));
      paramPublicKey = Base64.encodeToString(paramPublicKey, 0, 8, 11);
      return paramPublicKey;
    }
    catch (NoSuchAlgorithmException paramPublicKey)
    {
      Log.w("ContentValues", "Unexpected error, device missing required algorithms");
    }
    return null;
  }
  
  public final String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public final String d(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.getString("token");
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public final PublicKey e(String paramString)
  {
    try
    {
      localObject = Base64.decode(paramString, 8);
      KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
      paramString = new java/security/spec/X509EncodedKeySpec;
      paramString.<init>((byte[])localObject);
      paramString = localKeyFactory.generatePublic(paramString);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString) {}catch (InvalidKeySpecException paramString) {}catch (IllegalArgumentException paramString) {}
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid key stored ");
    ((StringBuilder)localObject).append(paramString);
    Log.w("ContentValues", ((StringBuilder)localObject).toString());
    return null;
  }
  
  public String f()
  {
    String str2;
    synchronized (a)
    {
      String str1 = g();
      if (str1 != null) {
        return str1;
      }
    }
  }
  
  public final String g()
  {
    synchronized (a)
    {
      String str = a.getString("|S|id", null);
      return str;
    }
  }
  
  public final String h()
  {
    Object localObject;
    synchronized (a)
    {
      String str1 = a.getString("|S||P|", null);
      if (str1 == null) {
        return null;
      }
    }
  }
  
  public String i()
  {
    for (;;)
    {
      int j;
      synchronized (a)
      {
        Object localObject = c;
        int i = localObject.length;
        j = 0;
        if (j >= i) {
          break;
        }
        String str2 = localObject[j];
        str2 = a(b, str2);
        str2 = a.getString(str2, null);
        if ((str2 == null) || (str2.isEmpty())) {
          break label99;
        }
        localObject = str2;
        if (str2.startsWith("{")) {
          localObject = d(str2);
        }
      }
      return str1;
      label99:
      j++;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     u4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */