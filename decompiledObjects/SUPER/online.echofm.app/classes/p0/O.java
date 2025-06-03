package p0;

import X2.w;
import android.net.Uri;
import android.text.TextUtils;
import d0.g;
import g0.M;
import g0.a;
import i0.g.a;
import i0.k.b;
import i0.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class O
  implements Q
{
  public final g.a a;
  public final String b;
  public final boolean c;
  public final Map d;
  
  public O(String paramString, boolean paramBoolean, g.a parama)
  {
    boolean bool;
    if ((paramBoolean) && (TextUtils.isEmpty(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    a.a(bool);
    a = parama;
    b = paramString;
    c = paramBoolean;
    d = new HashMap();
  }
  
  /* Error */
  public static byte[] c(g.a parama, String paramString, byte[] paramArrayOfByte, Map paramMap)
  {
    // Byte code:
    //   0: new 49	i0/x
    //   3: dup
    //   4: aload_0
    //   5: invokeinterface 54 1 0
    //   10: invokespecial 57	i0/x:<init>	(Li0/g;)V
    //   13: astore 4
    //   15: new 59	i0/k$b
    //   18: dup
    //   19: invokespecial 60	i0/k$b:<init>	()V
    //   22: aload_1
    //   23: invokevirtual 64	i0/k$b:j	(Ljava/lang/String;)Li0/k$b;
    //   26: aload_3
    //   27: invokevirtual 68	i0/k$b:e	(Ljava/util/Map;)Li0/k$b;
    //   30: iconst_2
    //   31: invokevirtual 71	i0/k$b:d	(I)Li0/k$b;
    //   34: aload_2
    //   35: invokevirtual 74	i0/k$b:c	([B)Li0/k$b;
    //   38: iconst_1
    //   39: invokevirtual 76	i0/k$b:b	(I)Li0/k$b;
    //   42: invokevirtual 79	i0/k$b:a	()Li0/k;
    //   45: astore_1
    //   46: iconst_0
    //   47: istore 5
    //   49: aload_1
    //   50: astore_0
    //   51: new 81	i0/i
    //   54: astore_2
    //   55: aload_2
    //   56: aload 4
    //   58: aload_0
    //   59: invokespecial 84	i0/i:<init>	(Li0/g;Li0/k;)V
    //   62: aload_2
    //   63: invokestatic 89	Y2/a:b	(Ljava/io/InputStream;)[B
    //   66: astore_3
    //   67: aload_2
    //   68: invokestatic 95	g0/M:m	(Ljava/io/Closeable;)V
    //   71: aload_3
    //   72: areturn
    //   73: astore_0
    //   74: goto +52 -> 126
    //   77: astore_0
    //   78: goto +42 -> 120
    //   81: astore 6
    //   83: aload 6
    //   85: iload 5
    //   87: invokestatic 98	p0/O:d	(Li0/t;I)Ljava/lang/String;
    //   90: astore_3
    //   91: aload_3
    //   92: ifnull +25 -> 117
    //   95: iinc 5 1
    //   98: aload_0
    //   99: invokevirtual 103	i0/k:a	()Li0/k$b;
    //   102: aload_3
    //   103: invokevirtual 64	i0/k$b:j	(Ljava/lang/String;)Li0/k$b;
    //   106: invokevirtual 79	i0/k$b:a	()Li0/k;
    //   109: astore_0
    //   110: aload_2
    //   111: invokestatic 95	g0/M:m	(Ljava/io/Closeable;)V
    //   114: goto -63 -> 51
    //   117: aload 6
    //   119: athrow
    //   120: aload_2
    //   121: invokestatic 95	g0/M:m	(Ljava/io/Closeable;)V
    //   124: aload_0
    //   125: athrow
    //   126: new 105	p0/S
    //   129: dup
    //   130: aload_1
    //   131: aload 4
    //   133: invokevirtual 109	i0/x:r	()Landroid/net/Uri;
    //   136: invokestatic 112	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   139: checkcast 114	android/net/Uri
    //   142: aload 4
    //   144: invokevirtual 118	i0/x:g	()Ljava/util/Map;
    //   147: aload 4
    //   149: invokevirtual 122	i0/x:q	()J
    //   152: aload_0
    //   153: invokespecial 125	p0/S:<init>	(Li0/k;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V
    //   156: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	parama	g.a
    //   0	157	1	paramString	String
    //   0	157	2	paramArrayOfByte	byte[]
    //   0	157	3	paramMap	Map
    //   13	135	4	localx	i0.x
    //   47	49	5	i	int
    //   81	37	6	localt	t
    // Exception table:
    //   from	to	target	type
    //   51	62	73	java/lang/Exception
    //   67	71	73	java/lang/Exception
    //   110	114	73	java/lang/Exception
    //   120	126	73	java/lang/Exception
    //   62	67	77	finally
    //   83	91	77	finally
    //   98	110	77	finally
    //   117	120	77	finally
    //   62	67	81	i0/t
  }
  
  public static String d(t paramt, int paramInt)
  {
    int i = r;
    if (((i == 307) || (i == 308)) && (paramInt < 5))
    {
      paramt = t;
      if (paramt != null)
      {
        paramt = (List)paramt.get("Location");
        if ((paramt != null) && (!paramt.isEmpty())) {
          return (String)paramt.get(0);
        }
      }
    }
    return null;
  }
  
  public byte[] a(UUID paramUUID, F.d paramd)
  {
    paramUUID = new StringBuilder();
    paramUUID.append(paramd.b());
    paramUUID.append("&signedRequest=");
    paramUUID.append(M.H(paramd.a()));
    paramUUID = paramUUID.toString();
    return c(a, paramUUID, null, Collections.emptyMap());
  }
  
  public byte[] b(UUID arg1, F.a parama)
  {
    String str1 = parama.b();
    String str2;
    if (!c)
    {
      str2 = str1;
      if (!TextUtils.isEmpty(str1)) {}
    }
    else
    {
      str2 = b;
    }
    if (!TextUtils.isEmpty(str2))
    {
      HashMap localHashMap = new HashMap();
      UUID localUUID = g.e;
      if (localUUID.equals(???)) {
        str1 = "text/xml";
      } else if (g.c.equals(???)) {
        str1 = "application/json";
      } else {
        str1 = "application/octet-stream";
      }
      localHashMap.put("Content-Type", str1);
      if (localUUID.equals(???)) {
        localHashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
      }
      synchronized (d)
      {
        localHashMap.putAll(d);
        return c(a, str2, parama.a(), localHashMap);
      }
    }
    parama = new k.b();
    ??? = Uri.EMPTY;
    throw new S(parama.i(???).a(), ???, w.j(), 0L, new IllegalStateException("No license URL"));
  }
  
  public void e(String paramString1, String paramString2)
  {
    a.e(paramString1);
    a.e(paramString2);
    synchronized (d)
    {
      d.put(paramString1, paramString2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     p0.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */