package N1;

import O1.I;
import O1.r;
import O1.v;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONObject;
import x1.B;

public final class a
{
  public static final a a = new a();
  public static final String b = a.class.getCanonicalName();
  public static final HashMap c = new HashMap();
  
  public static final void a(String paramString)
  {
    if (T1.a.d(a.class)) {
      return;
    }
    try
    {
      a.b(paramString);
      return;
    }
    finally
    {
      T1.a.b(paramString, a.class);
    }
  }
  
  /* Error */
  public static final android.graphics.Bitmap c(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 41	T1/a:d	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: aconst_null
    //   7: astore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: new 51	java/util/EnumMap
    //   17: astore_3
    //   18: aload_3
    //   19: ldc 53
    //   21: invokespecial 56	java/util/EnumMap:<init>	(Ljava/lang/Class;)V
    //   24: aload_3
    //   25: getstatic 60	V4/c:t	LV4/c;
    //   28: iconst_2
    //   29: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   32: invokeinterface 72 3 0
    //   37: pop
    //   38: new 74	V4/e
    //   41: astore 4
    //   43: aload 4
    //   45: invokespecial 75	V4/e:<init>	()V
    //   48: aload 4
    //   50: aload_0
    //   51: getstatic 81	V4/a:z	LV4/a;
    //   54: sipush 200
    //   57: sipush 200
    //   60: aload_3
    //   61: invokevirtual 84	V4/e:a	(Ljava/lang/String;LV4/a;IILjava/util/Map;)LY4/b;
    //   64: astore_0
    //   65: aload_0
    //   66: invokevirtual 90	Y4/b:g	()I
    //   69: istore 5
    //   71: aload_0
    //   72: invokevirtual 93	Y4/b:j	()I
    //   75: istore 6
    //   77: iload 5
    //   79: iload 6
    //   81: imul
    //   82: newarray <illegal type>
    //   84: astore_3
    //   85: iload 5
    //   87: ifle +97 -> 184
    //   90: iconst_0
    //   91: istore 7
    //   93: iload 7
    //   95: iconst_1
    //   96: iadd
    //   97: istore 8
    //   99: iload 6
    //   101: ifle +66 -> 167
    //   104: iconst_0
    //   105: istore 9
    //   107: iload 9
    //   109: iconst_1
    //   110: iadd
    //   111: istore 10
    //   113: aload_0
    //   114: iload 9
    //   116: iload 7
    //   118: invokevirtual 97	Y4/b:f	(II)Z
    //   121: ifeq +10 -> 131
    //   124: ldc 98
    //   126: istore 11
    //   128: goto +6 -> 134
    //   131: iconst_m1
    //   132: istore 11
    //   134: aload_3
    //   135: iload 7
    //   137: iload 6
    //   139: imul
    //   140: iload 9
    //   142: iadd
    //   143: iload 11
    //   145: iastore
    //   146: iload 10
    //   148: iload 6
    //   150: if_icmplt +6 -> 156
    //   153: goto +14 -> 167
    //   156: iload 10
    //   158: istore 9
    //   160: goto -53 -> 107
    //   163: astore_0
    //   164: goto +51 -> 215
    //   167: iload 8
    //   169: iload 5
    //   171: if_icmplt +6 -> 177
    //   174: goto +10 -> 184
    //   177: iload 8
    //   179: istore 7
    //   181: goto -88 -> 93
    //   184: iload 6
    //   186: iload 5
    //   188: getstatic 104	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   191: invokestatic 110	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   194: astore_0
    //   195: aload_0
    //   196: aload_3
    //   197: iconst_0
    //   198: iload 6
    //   200: iconst_0
    //   201: iconst_0
    //   202: iload 6
    //   204: iload 5
    //   206: invokevirtual 114	android/graphics/Bitmap:setPixels	([IIIIIII)V
    //   209: goto +4 -> 213
    //   212: astore_2
    //   213: aload_0
    //   214: areturn
    //   215: aload_0
    //   216: ldc 2
    //   218: invokestatic 46	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   221: aconst_null
    //   222: areturn
    //   223: astore_0
    //   224: aload_2
    //   225: astore_0
    //   226: goto -13 -> 213
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	paramString	String
    //   5	4	1	bool	boolean
    //   7	1	2	localObject1	Object
    //   212	13	2	localh	V4.h
    //   17	180	3	localObject2	Object
    //   41	8	4	locale	V4.e
    //   69	136	5	i	int
    //   75	128	6	j	int
    //   91	89	7	k	int
    //   97	81	8	m	int
    //   105	54	9	n	int
    //   111	46	10	i1	int
    //   126	18	11	i2	int
    // Exception table:
    //   from	to	target	type
    //   14	38	163	finally
    //   38	85	163	finally
    //   113	124	163	finally
    //   184	195	163	finally
    //   195	209	163	finally
    //   195	209	212	V4/h
    //   38	85	223	V4/h
    //   113	124	223	V4/h
    //   184	195	223	V4/h
  }
  
  public static final String d(Map paramMap)
  {
    if (T1.a.d(a.class)) {
      return null;
    }
    Object localObject = paramMap;
    if (paramMap == null) {
      try
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
      }
      finally
      {
        break label93;
      }
    }
    paramMap = Build.DEVICE;
    Intrinsics.checkNotNullExpressionValue(paramMap, "DEVICE");
    ((Map)localObject).put("device", paramMap);
    paramMap = Build.MODEL;
    Intrinsics.checkNotNullExpressionValue(paramMap, "MODEL");
    ((Map)localObject).put("model", paramMap);
    paramMap = new org/json/JSONObject;
    paramMap.<init>((Map)localObject);
    paramMap = paramMap.toString();
    Intrinsics.checkNotNullExpressionValue(paramMap, "JSONObject(deviceInfo as Map<*, *>).toString()");
    return paramMap;
    label93:
    T1.a.b(paramMap, a.class);
    return null;
  }
  
  public static final boolean e()
  {
    boolean bool1 = T1.a.d(a.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      Object localObject = v.a;
      localObject = v.f(B.m());
      bool1 = bool2;
      if (localObject != null)
      {
        boolean bool3 = ((r)localObject).l().contains(I.s);
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
    }
    finally
    {
      break label59;
    }
    return bool1;
    label59:
    T1.a.b(localThrowable, a.class);
    return false;
  }
  
  /* Error */
  public static final boolean f(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 41	T1/a:d	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: iconst_0
    //   7: istore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: invokestatic 180	N1/a:e	()Z
    //   17: ifeq +18 -> 35
    //   20: getstatic 19	N1/a:a	LN1/a;
    //   23: aload_0
    //   24: invokevirtual 182	N1/a:g	(Ljava/lang/String;)Z
    //   27: istore_2
    //   28: goto +7 -> 35
    //   31: astore_0
    //   32: goto +5 -> 37
    //   35: iload_2
    //   36: ireturn
    //   37: aload_0
    //   38: ldc 2
    //   40: invokestatic 46	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   43: iconst_0
    //   44: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramString	String
    //   5	4	1	bool1	boolean
    //   7	29	2	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   14	28	31	finally
  }
  
  /* Error */
  public final void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 41	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: getstatic 32	N1/a:c	Ljava/util/HashMap;
    //   11: aload_1
    //   12: invokevirtual 188	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast 190	android/net/nsd/NsdManager$RegistrationListener
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull +68 -> 88
    //   23: invokestatic 193	x1/B:l	()Landroid/content/Context;
    //   26: ldc -61
    //   28: invokevirtual 201	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnull +43 -> 76
    //   36: aload_3
    //   37: checkcast 203	android/net/nsd/NsdManager
    //   40: astore_3
    //   41: aload_3
    //   42: aload_2
    //   43: invokevirtual 207	android/net/nsd/NsdManager:unregisterService	(Landroid/net/nsd/NsdManager$RegistrationListener;)V
    //   46: goto +19 -> 65
    //   49: astore_1
    //   50: goto +39 -> 89
    //   53: astore_2
    //   54: getstatic 212	O1/P:a	LO1/P;
    //   57: astore_3
    //   58: getstatic 27	N1/a:b	Ljava/lang/String;
    //   61: aload_2
    //   62: invokestatic 216	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   65: getstatic 32	N1/a:c	Ljava/util/HashMap;
    //   68: aload_1
    //   69: invokevirtual 219	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   72: pop
    //   73: goto +15 -> 88
    //   76: new 221	java/lang/NullPointerException
    //   79: astore_1
    //   80: aload_1
    //   81: ldc -33
    //   83: invokespecial 225	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   86: aload_1
    //   87: athrow
    //   88: return
    //   89: aload_1
    //   90: aload_0
    //   91: invokestatic 46	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   94: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	a
    //   0	95	1	paramString	String
    //   18	25	2	localRegistrationListener	NsdManager.RegistrationListener
    //   53	9	2	localIllegalArgumentException	IllegalArgumentException
    //   31	27	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	19	49	finally
    //   23	32	49	finally
    //   36	41	49	finally
    //   41	46	49	finally
    //   54	65	49	finally
    //   65	73	49	finally
    //   76	88	49	finally
    //   41	46	53	java/lang/IllegalArgumentException
  }
  
  public final boolean g(String paramString)
  {
    if (T1.a.d(this)) {
      return false;
    }
    try
    {
      HashMap localHashMap = c;
      if (localHashMap.containsKey(paramString)) {
        return true;
      }
      Object localObject1 = Intrinsics.i("android-", i.p(B.B(), '.', '|', false, 4, null));
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("fbsdk_");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append('_');
      ((StringBuilder)localObject2).append(paramString);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = new android/net/nsd/NsdServiceInfo;
      ((NsdServiceInfo)localObject1).<init>();
      ((NsdServiceInfo)localObject1).setServiceType("_fb._tcp.");
      ((NsdServiceInfo)localObject1).setServiceName((String)localObject2);
      ((NsdServiceInfo)localObject1).setPort(80);
      Object localObject3 = B.l().getSystemService("servicediscovery");
      if (localObject3 != null)
      {
        localObject3 = (NsdManager)localObject3;
        a locala = new N1/a$a;
        locala.<init>((String)localObject2, paramString);
        localHashMap.put(paramString, locala);
        ((NsdManager)localObject3).registerService((NsdServiceInfo)localObject1, 1, locala);
        return true;
      }
    }
    finally
    {
      break label188;
      paramString = new java/lang/NullPointerException;
      paramString.<init>("null cannot be cast to non-null type android.net.nsd.NsdManager");
      throw paramString;
      label188:
      T1.a.b(paramString, this);
    }
    return false;
  }
  
  public static final class a
    implements NsdManager.RegistrationListener
  {
    public a(String paramString1, String paramString2) {}
    
    public void onRegistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "serviceInfo");
      paramNsdServiceInfo = a.a;
      a.a(b);
    }
    
    public void onServiceRegistered(NsdServiceInfo paramNsdServiceInfo)
    {
      Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "NsdServiceInfo");
      if (!Intrinsics.a(a, paramNsdServiceInfo.getServiceName()))
      {
        paramNsdServiceInfo = a.a;
        a.a(b);
      }
    }
    
    public void onServiceUnregistered(NsdServiceInfo paramNsdServiceInfo)
    {
      Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "serviceInfo");
    }
    
    public void onUnregistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "serviceInfo");
    }
  }
}

/* Location:
 * Qualified Name:     N1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */