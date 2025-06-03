package p0;

import W2.e;
import android.media.MediaDrm;
import android.media.MediaDrm.KeyRequest;
import android.media.MediaDrm.ProvisionRequest;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import d0.g;
import d0.m.b;
import g0.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import k0.g0;
import l0.y1;
import m0.O;

public final class N
  implements F
{
  public static final F.c d = new H();
  public final UUID a;
  public final MediaDrm b;
  public int c;
  
  public N(UUID paramUUID)
  {
    g0.a.e(paramUUID);
    g0.a.b(g.b.equals(paramUUID) ^ true, "Use C.CLEARKEY_UUID instead");
    a = paramUUID;
    MediaDrm localMediaDrm = new MediaDrm(u(paramUUID));
    b = localMediaDrm;
    c = 1;
    if ((g.d.equals(paramUUID)) && (C())) {
      w(localMediaDrm);
    }
  }
  
  public static boolean C()
  {
    return "ASUS_Z00AD".equals(g0.M.d);
  }
  
  public static N D(UUID paramUUID)
  {
    try
    {
      paramUUID = new N(paramUUID);
      return paramUUID;
    }
    catch (Exception paramUUID) {}catch (UnsupportedSchemeException paramUUID) {}
    throw new T(2, paramUUID);
    throw new T(1, paramUUID);
  }
  
  public static byte[] p(byte[] paramArrayOfByte)
  {
    Object localObject = new z(paramArrayOfByte);
    int i = ((z)localObject).t();
    int j = ((z)localObject).v();
    int k = ((z)localObject).v();
    if ((j == 1) && (k == 1))
    {
      int m = ((z)localObject).v();
      Charset localCharset = e.e;
      localObject = ((z)localObject).E(m, localCharset);
      if (((String)localObject).contains("<LA_URL>")) {
        return paramArrayOfByte;
      }
      m = ((String)localObject).indexOf("</DATA>");
      if (m == -1) {
        g0.o.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
      }
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append(((String)localObject).substring(0, m));
      paramArrayOfByte.append("<LA_URL>https://x</LA_URL>");
      paramArrayOfByte.append(((String)localObject).substring(m));
      localObject = paramArrayOfByte.toString();
      i += 52;
      paramArrayOfByte = ByteBuffer.allocate(i);
      paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
      paramArrayOfByte.putInt(i);
      paramArrayOfByte.putShort((short)j);
      paramArrayOfByte.putShort((short)k);
      paramArrayOfByte.putShort((short)(((String)localObject).length() * 2));
      paramArrayOfByte.put(((String)localObject).getBytes(localCharset));
      return paramArrayOfByte.array();
    }
    g0.o.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
    return paramArrayOfByte;
  }
  
  public static byte[] r(UUID paramUUID, byte[] paramArrayOfByte)
  {
    if (g.c.equals(paramUUID)) {
      return a.a(paramArrayOfByte);
    }
    return paramArrayOfByte;
  }
  
  public static byte[] s(UUID paramUUID, byte[] paramArrayOfByte)
  {
    UUID localUUID = g.e;
    byte[] arrayOfByte = paramArrayOfByte;
    if (localUUID.equals(paramUUID))
    {
      arrayOfByte = Z0.o.e(paramArrayOfByte, paramUUID);
      if (arrayOfByte != null) {
        paramArrayOfByte = arrayOfByte;
      }
      arrayOfByte = Z0.o.a(localUUID, p(paramArrayOfByte));
    }
    if ((g0.M.a >= 23) || (!g.d.equals(paramUUID)))
    {
      if ((localUUID.equals(paramUUID)) && ("Amazon".equals(g0.M.c)))
      {
        paramArrayOfByte = g0.M.d;
        if ((!"AFTB".equals(paramArrayOfByte)) && (!"AFTS".equals(paramArrayOfByte)) && (!"AFTM".equals(paramArrayOfByte)) && (!"AFTT".equals(paramArrayOfByte))) {}
      }
    }
    else
    {
      paramUUID = Z0.o.e(arrayOfByte, paramUUID);
      if (paramUUID != null) {
        return paramUUID;
      }
    }
    return arrayOfByte;
  }
  
  public static String t(UUID paramUUID, String paramString)
  {
    if ((g0.M.a < 26) && (g.c.equals(paramUUID)) && (("video/mp4".equals(paramString)) || ("audio/mp4".equals(paramString)))) {
      return "cenc";
    }
    return paramString;
  }
  
  public static UUID u(UUID paramUUID)
  {
    UUID localUUID = paramUUID;
    if (g0.M.a < 27)
    {
      localUUID = paramUUID;
      if (g.c.equals(paramUUID)) {
        localUUID = g.b;
      }
    }
    return localUUID;
  }
  
  public static void w(MediaDrm paramMediaDrm)
  {
    paramMediaDrm.setPropertyString("securityLevel", "L3");
  }
  
  public static m.b y(UUID paramUUID, List paramList)
  {
    if (!g.d.equals(paramUUID)) {}
    for (;;)
    {
      return (m.b)paramList.get(0);
      int j;
      int k;
      if ((g0.M.a >= 28) && (paramList.size() > 1))
      {
        paramUUID = (m.b)paramList.get(0);
        i = 0;
        j = i;
        byte[] arrayOfByte;
        while (i < paramList.size())
        {
          localObject = (m.b)paramList.get(i);
          arrayOfByte = (byte[])g0.a.e(s);
          if ((!g0.M.c(r, r)) || (!g0.M.c(q, q)) || (!Z0.o.c(arrayOfByte))) {
            break label213;
          }
          j += arrayOfByte.length;
          i++;
        }
        Object localObject = new byte[j];
        j = 0;
        i = j;
        while (j < paramList.size())
        {
          arrayOfByte = (byte[])g0.a.e(gets);
          k = arrayOfByte.length;
          System.arraycopy(arrayOfByte, 0, localObject, i, k);
          i += k;
          j++;
        }
        return paramUUID.b((byte[])localObject);
      }
      label213:
      for (int i = 0; i < paramList.size(); i++)
      {
        paramUUID = (m.b)paramList.get(i);
        j = Z0.o.g((byte[])g0.a.e(s));
        k = g0.M.a;
        if ((k < 23) && (j == 0)) {
          return paramUUID;
        }
        if ((k >= 23) && (j == 1)) {
          return paramUUID;
        }
      }
    }
  }
  
  public final boolean E()
  {
    boolean bool;
    if ((g0.M.a < 21) && (g.d.equals(a)) && ("L3".equals(x("securityLevel")))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a(F.b paramb)
  {
    MediaDrm localMediaDrm = b;
    if (paramb == null) {
      paramb = null;
    } else {
      paramb = new I(this, paramb);
    }
    localMediaDrm.setOnEventListener(paramb);
  }
  
  /* Error */
  public boolean b(byte[] paramArrayOfByte, String paramString)
  {
    // Byte code:
    //   0: getstatic 251	g0/M:a	I
    //   3: bipush 31
    //   5: if_icmplt +22 -> 27
    //   8: aload_0
    //   9: invokevirtual 343	p0/N:z	()Z
    //   12: ifeq +15 -> 27
    //   15: aload_0
    //   16: getfield 61	p0/N:b	Landroid/media/MediaDrm;
    //   19: aload_2
    //   20: invokestatic 346	p0/N$a:a	(Landroid/media/MediaDrm;Ljava/lang/String;)Z
    //   23: istore_3
    //   24: goto +36 -> 60
    //   27: aconst_null
    //   28: astore 4
    //   30: aconst_null
    //   31: astore 5
    //   33: new 348	android/media/MediaCrypto
    //   36: astore 6
    //   38: aload 6
    //   40: aload_0
    //   41: getfield 51	p0/N:a	Ljava/util/UUID;
    //   44: aload_1
    //   45: invokespecial 351	android/media/MediaCrypto:<init>	(Ljava/util/UUID;[B)V
    //   48: aload 6
    //   50: aload_2
    //   51: invokevirtual 355	android/media/MediaCrypto:requiresSecureDecoderComponent	(Ljava/lang/String;)Z
    //   54: istore_3
    //   55: aload 6
    //   57: invokevirtual 358	android/media/MediaCrypto:release	()V
    //   60: iload_3
    //   61: ifeq +53 -> 114
    //   64: goto +38 -> 102
    //   67: astore_1
    //   68: aload 6
    //   70: astore_2
    //   71: goto +11 -> 82
    //   74: astore_1
    //   75: goto +17 -> 92
    //   78: astore_1
    //   79: aload 5
    //   81: astore_2
    //   82: aload_2
    //   83: ifnull +7 -> 90
    //   86: aload_2
    //   87: invokevirtual 358	android/media/MediaCrypto:release	()V
    //   90: aload_1
    //   91: athrow
    //   92: aload 6
    //   94: ifnull +8 -> 102
    //   97: aload 6
    //   99: invokevirtual 358	android/media/MediaCrypto:release	()V
    //   102: aload_0
    //   103: invokevirtual 360	p0/N:E	()Z
    //   106: ifne +8 -> 114
    //   109: iconst_1
    //   110: istore_3
    //   111: goto +5 -> 116
    //   114: iconst_0
    //   115: istore_3
    //   116: iload_3
    //   117: ireturn
    //   118: astore_1
    //   119: aload 4
    //   121: astore 6
    //   123: goto -31 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	N
    //   0	126	1	paramArrayOfByte	byte[]
    //   0	126	2	paramString	String
    //   23	94	3	bool	boolean
    //   28	92	4	localObject1	Object
    //   31	49	5	localObject2	Object
    //   36	86	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   48	55	67	finally
    //   48	55	74	android/media/MediaCryptoException
    //   33	48	78	finally
    //   33	48	118	android/media/MediaCryptoException
  }
  
  public void c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    b.restoreKeys(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public Map d(byte[] paramArrayOfByte)
  {
    return b.queryKeyStatus(paramArrayOfByte);
  }
  
  public void e(byte[] paramArrayOfByte)
  {
    b.closeSession(paramArrayOfByte);
  }
  
  public void f(byte[] paramArrayOfByte, y1 paramy1)
  {
    if (g0.M.a >= 31) {
      try
      {
        a.b(b, paramArrayOfByte, paramy1);
      }
      catch (UnsupportedOperationException paramArrayOfByte)
      {
        g0.o.h("FrameworkMediaDrm", "setLogSessionId failed.");
      }
    }
  }
  
  public byte[] g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = paramArrayOfByte2;
    if (g.c.equals(a)) {
      arrayOfByte = a.b(paramArrayOfByte2);
    }
    return b.provideKeyResponse(paramArrayOfByte1, arrayOfByte);
  }
  
  public F.d h()
  {
    MediaDrm.ProvisionRequest localProvisionRequest = b.getProvisionRequest();
    return new F.d(localProvisionRequest.getData(), localProvisionRequest.getDefaultUrl());
  }
  
  public void i(byte[] paramArrayOfByte)
  {
    b.provideProvisionResponse(paramArrayOfByte);
  }
  
  public F.a j(byte[] paramArrayOfByte, List paramList, int paramInt, HashMap paramHashMap)
  {
    if (paramList != null)
    {
      paramList = y(a, paramList);
      arrayOfByte = s(a, (byte[])g0.a.e(s));
      localObject = t(a, r);
    }
    else
    {
      paramList = null;
      arrayOfByte = null;
      localObject = arrayOfByte;
    }
    Object localObject = b.getKeyRequest(paramArrayOfByte, arrayOfByte, (String)localObject, paramInt, paramHashMap);
    byte[] arrayOfByte = r(a, ((MediaDrm.KeyRequest)localObject).getData());
    paramHashMap = q(((MediaDrm.KeyRequest)localObject).getDefaultUrl());
    paramArrayOfByte = paramHashMap;
    if (TextUtils.isEmpty(paramHashMap))
    {
      paramArrayOfByte = paramHashMap;
      if (paramList != null)
      {
        paramArrayOfByte = paramHashMap;
        if (!TextUtils.isEmpty(q)) {
          paramArrayOfByte = q;
        }
      }
    }
    if (g0.M.a >= 23) {
      paramInt = ((MediaDrm.KeyRequest)localObject).getRequestType();
    } else {
      paramInt = Integer.MIN_VALUE;
    }
    return new F.a(arrayOfByte, paramArrayOfByte, paramInt);
  }
  
  public int k()
  {
    return 2;
  }
  
  public byte[] m()
  {
    return b.openSession();
  }
  
  public final String q(String paramString)
  {
    if ("<LA_URL>https://x</LA_URL>".equals(paramString)) {
      return "";
    }
    if ((g0.M.a >= 33) && ("https://default.url".equals(paramString)))
    {
      String str = x("version");
      if ((Objects.equals(str, "1.2")) || (Objects.equals(str, "aidl-1"))) {
        return "";
      }
    }
    return paramString;
  }
  
  public void release()
  {
    try
    {
      int i = c - 1;
      c = i;
      if (i == 0) {
        b.release();
      }
    }
    finally
    {
      break label35;
    }
    return;
    label35:
    throw ((Throwable)localObject);
  }
  
  public G v(byte[] paramArrayOfByte)
  {
    boolean bool = E();
    return new G(u(a), paramArrayOfByte, bool);
  }
  
  public String x(String paramString)
  {
    return b.getPropertyString(paramString);
  }
  
  public final boolean z()
  {
    if (a.equals(g.d))
    {
      String str = x("version");
      boolean bool;
      if ((!str.startsWith("v5.")) && (!str.startsWith("14.")) && (!str.startsWith("15.")) && (!str.startsWith("16.0"))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return a.equals(g.c);
  }
  
  public static abstract class a
  {
    public static boolean a(MediaDrm paramMediaDrm, String paramString)
    {
      return M.a(paramMediaDrm, paramString);
    }
    
    public static void b(MediaDrm paramMediaDrm, byte[] paramArrayOfByte, y1 paramy1)
    {
      paramy1 = paramy1.a();
      if (!O.a(paramy1, g0.a())) {
        L.a(K.a(g0.a.e(J.a(paramMediaDrm, paramArrayOfByte))), paramy1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     p0.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */