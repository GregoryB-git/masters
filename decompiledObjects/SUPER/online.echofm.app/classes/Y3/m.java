package Y3;

import Q3.c;
import Q3.d;
import Q3.e;
import Q3.e.e;
import V3.p;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public abstract class m
{
  public static final char[] a = "0123456789abcdef".toCharArray();
  
  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      return -1;
    }
    if (paramInt1 == paramInt2) {
      return 0;
    }
    return 1;
  }
  
  public static int b(long paramLong1, long paramLong2)
  {
    boolean bool = paramLong1 < paramLong2;
    if (bool) {
      return -1;
    }
    if (!bool) {
      return 0;
    }
    return 1;
  }
  
  public static String c(double paramDouble)
  {
    StringBuilder localStringBuilder = new StringBuilder(16);
    long l = Double.doubleToLongBits(paramDouble);
    for (int i = 7; i >= 0; i--)
    {
      int j = (int)(l >>> i * 8 & 0xFF);
      char[] arrayOfChar = a;
      localStringBuilder.append(arrayOfChar[(j >> 4 & 0xF)]);
      localStringBuilder.append(arrayOfChar[(j & 0xF)]);
    }
    return localStringBuilder.toString();
  }
  
  public static boolean d(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      return true;
    }
    if ((paramObject1 != null) && (paramObject2 != null)) {
      return paramObject1.equals(paramObject2);
    }
    return false;
  }
  
  public static String e(String paramString)
  {
    int i = paramString.indexOf("//");
    if (i != -1)
    {
      paramString = paramString.substring(i + 2);
      int j = paramString.indexOf("/");
      if (j != -1)
      {
        i = paramString.indexOf("?");
        j++;
        if (i != -1) {
          return paramString.substring(j, i);
        }
        return paramString.substring(j);
      }
      return "";
    }
    throw new d("Firebase Database URL is missing URL scheme");
  }
  
  public static void f(boolean paramBoolean)
  {
    g(paramBoolean, "");
  }
  
  public static void g(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Assertion failed: ");
      localStringBuilder.append(paramString);
      Log.w("FirebaseDatabase", localStringBuilder.toString());
    }
  }
  
  public static h h(String paramString)
  {
    Uri localUri;
    boolean bool;
    try
    {
      localUri = Uri.parse(paramString);
      localObject1 = localUri.getScheme();
      if (localObject1 == null) {
        break label263;
      }
      localObject2 = localUri.getHost();
      if (localObject2 == null) {
        break label248;
      }
      String str = localUri.getQueryParameter("ns");
      bool = false;
      localObject3 = str;
      if (str == null) {
        localObject3 = localObject2.split("\\.", -1)[0].toLowerCase(Locale.US);
      }
    }
    catch (Exception localException)
    {
      break label278;
    }
    p localp = new V3/p;
    localp.<init>();
    a = ((String)localObject2).toLowerCase(Locale.US);
    int i = localUri.getPort();
    if (i != -1)
    {
      if ((((String)localObject1).equals("https")) || (((String)localObject1).equals("wss"))) {
        bool = true;
      }
      b = bool;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(a);
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append(i);
      a = ((StringBuilder)localObject2).toString();
    }
    else
    {
      b = true;
    }
    d = a;
    c = ((String)localObject3);
    Object localObject2 = e(paramString).replace("+", " ");
    n.i((String)localObject2);
    Object localObject3 = new Y3/h;
    ((h)localObject3).<init>();
    Object localObject1 = new V3/k;
    ((V3.k)localObject1).<init>((String)localObject2);
    b = ((V3.k)localObject1);
    a = localp;
    return (h)localObject3;
    label248:
    localObject3 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject3).<init>("Database URL does not specify a valid host");
    throw ((Throwable)localObject3);
    label263:
    localObject3 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject3).<init>("Database URL does not specify a URL scheme");
    throw ((Throwable)localObject3);
    label278:
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("Invalid Firebase Database url specified: ");
    ((StringBuilder)localObject3).append(paramString);
    throw new d(((StringBuilder)localObject3).toString(), localp);
  }
  
  public static String i(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramString.getBytes("UTF-8"));
      paramString = Base64.encodeToString(localMessageDigest.digest(), 2);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString) {}catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
    }
    throw new RuntimeException("Missing SHA-1 MessageDigest provider.", paramString);
  }
  
  public static String j(String paramString)
  {
    String str1;
    if (paramString.indexOf('\\') != -1) {
      str1 = paramString.replace("\\", "\\\\");
    } else {
      str1 = paramString;
    }
    String str2 = str1;
    if (paramString.indexOf('"') != -1) {
      str2 = str1.replace("\"", "\\\"");
    }
    paramString = new StringBuilder();
    paramString.append('"');
    paramString.append(str2);
    paramString.append('"');
    return paramString.toString();
  }
  
  public static Integer k(String paramString)
  {
    if ((paramString.length() <= 11) && (paramString.length() != 0))
    {
      int i = 0;
      int j;
      if (paramString.charAt(0) == '-')
      {
        i = paramString.length();
        j = 1;
        if (i == 1) {
          return null;
        }
        i = 1;
      }
      else
      {
        j = 0;
      }
      long l = 0L;
      while (i < paramString.length())
      {
        int k = paramString.charAt(i);
        if ((k >= 48) && (k <= 57))
        {
          l = l * 10L + (k - 48);
          i++;
        }
        else
        {
          return null;
        }
      }
      if (j != 0)
      {
        l = -l;
        if (l < -2147483648L) {
          return null;
        }
      }
      for (i = (int)l;; i = (int)l)
      {
        return Integer.valueOf(i);
        if (l > 2147483647L) {
          return null;
        }
      }
    }
    return null;
  }
  
  public static g l(e.e parame)
  {
    if (parame == null)
    {
      parame = new V2.k();
      a locala = new a();
      return new g(parame.a(), locala);
    }
    return new g(null, parame);
  }
  
  public class a
    implements e.e
  {
    public a() {}
    
    public void a(c paramc, e parame)
    {
      if (paramc != null) {
        b(paramc.i());
      } else {
        c(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     Y3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */