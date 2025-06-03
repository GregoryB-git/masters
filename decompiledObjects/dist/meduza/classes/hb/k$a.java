package hb;

import ib.i;
import ib.j;
import ib.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r3.a0;

public final class k$a
  extends k
{
  public static final a0 e;
  public static final a0 f;
  public static final a0 g;
  public static final a0 h;
  public static final a0 i;
  public static final a0 j;
  public static final Method k;
  public static final Method l;
  public static final Method m;
  public static final Method n;
  public static final Method o;
  public static final Method p;
  public static final Constructor<?> q;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: getstatic 34	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   3: astore_0
    //   4: aconst_null
    //   5: astore_1
    //   6: new 36	r3/a0
    //   9: dup
    //   10: aconst_null
    //   11: ldc 38
    //   13: iconst_1
    //   14: anewarray 40	java/lang/Class
    //   17: dup
    //   18: iconst_0
    //   19: aload_0
    //   20: aastore
    //   21: invokespecial 44	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   24: putstatic 46	hb/k$a:e	Lr3/a0;
    //   27: new 36	r3/a0
    //   30: dup
    //   31: aconst_null
    //   32: ldc 48
    //   34: iconst_1
    //   35: anewarray 40	java/lang/Class
    //   38: dup
    //   39: iconst_0
    //   40: ldc 50
    //   42: aastore
    //   43: invokespecial 44	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   46: putstatic 52	hb/k$a:f	Lr3/a0;
    //   49: new 36	r3/a0
    //   52: dup
    //   53: ldc 54
    //   55: ldc 56
    //   57: iconst_0
    //   58: anewarray 40	java/lang/Class
    //   61: invokespecial 44	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   64: putstatic 58	hb/k$a:g	Lr3/a0;
    //   67: new 36	r3/a0
    //   70: dup
    //   71: aconst_null
    //   72: ldc 60
    //   74: iconst_1
    //   75: anewarray 40	java/lang/Class
    //   78: dup
    //   79: iconst_0
    //   80: ldc 54
    //   82: aastore
    //   83: invokespecial 44	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   86: putstatic 62	hb/k$a:h	Lr3/a0;
    //   89: new 36	r3/a0
    //   92: dup
    //   93: ldc 54
    //   95: ldc 64
    //   97: iconst_0
    //   98: anewarray 40	java/lang/Class
    //   101: invokespecial 44	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   104: putstatic 66	hb/k$a:i	Lr3/a0;
    //   107: new 36	r3/a0
    //   110: dup
    //   111: aconst_null
    //   112: ldc 68
    //   114: iconst_1
    //   115: anewarray 40	java/lang/Class
    //   118: dup
    //   119: iconst_0
    //   120: ldc 54
    //   122: aastore
    //   123: invokespecial 44	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   126: putstatic 70	hb/k$a:j	Lr3/a0;
    //   129: ldc 72
    //   131: ldc 74
    //   133: iconst_1
    //   134: anewarray 40	java/lang/Class
    //   137: dup
    //   138: iconst_0
    //   139: ldc 76
    //   141: aastore
    //   142: invokevirtual 80	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   145: astore_2
    //   146: ldc 72
    //   148: ldc 82
    //   150: iconst_0
    //   151: anewarray 40	java/lang/Class
    //   154: invokevirtual 80	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   157: astore_3
    //   158: ldc 84
    //   160: ldc 86
    //   162: iconst_0
    //   163: anewarray 40	java/lang/Class
    //   166: invokevirtual 80	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   169: astore 4
    //   171: ldc 88
    //   173: invokestatic 92	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   176: astore 5
    //   178: aload 5
    //   180: ldc 94
    //   182: iconst_1
    //   183: anewarray 40	java/lang/Class
    //   186: dup
    //   187: iconst_0
    //   188: ldc 84
    //   190: aastore
    //   191: invokevirtual 80	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   194: astore 6
    //   196: aload 5
    //   198: ldc 38
    //   200: iconst_2
    //   201: anewarray 40	java/lang/Class
    //   204: dup
    //   205: iconst_0
    //   206: ldc 84
    //   208: aastore
    //   209: dup
    //   210: iconst_1
    //   211: aload_0
    //   212: aastore
    //   213: invokevirtual 80	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   216: astore_0
    //   217: goto +174 -> 391
    //   220: astore 7
    //   222: aload_3
    //   223: astore_0
    //   224: aload_2
    //   225: astore 5
    //   227: aload 7
    //   229: astore_2
    //   230: aload 6
    //   232: astore_3
    //   233: goto +132 -> 365
    //   236: astore 7
    //   238: aload_3
    //   239: astore_0
    //   240: aload_2
    //   241: astore 5
    //   243: aload 7
    //   245: astore_2
    //   246: aload 6
    //   248: astore_3
    //   249: goto +116 -> 365
    //   252: astore 6
    //   254: aconst_null
    //   255: astore 7
    //   257: aload_3
    //   258: astore_0
    //   259: aload_2
    //   260: astore 5
    //   262: aload 6
    //   264: astore_2
    //   265: aload 7
    //   267: astore_3
    //   268: goto +97 -> 365
    //   271: astore 6
    //   273: aconst_null
    //   274: astore 7
    //   276: aload_3
    //   277: astore_0
    //   278: aload_2
    //   279: astore 5
    //   281: aload 6
    //   283: astore_2
    //   284: aload 7
    //   286: astore_3
    //   287: goto +78 -> 365
    //   290: astore_0
    //   291: aload_2
    //   292: astore 5
    //   294: aload_0
    //   295: astore_2
    //   296: goto +44 -> 340
    //   299: astore 4
    //   301: aload_3
    //   302: astore_0
    //   303: aload_2
    //   304: astore 5
    //   306: aload 4
    //   308: astore_2
    //   309: goto +51 -> 360
    //   312: astore_0
    //   313: aconst_null
    //   314: astore_3
    //   315: aload_2
    //   316: astore 5
    //   318: aload_0
    //   319: astore_2
    //   320: goto +20 -> 340
    //   323: astore_3
    //   324: aconst_null
    //   325: astore_0
    //   326: aload_2
    //   327: astore 5
    //   329: aload_3
    //   330: astore_2
    //   331: goto +29 -> 360
    //   334: astore_2
    //   335: aconst_null
    //   336: astore_3
    //   337: aload_3
    //   338: astore 5
    //   340: aconst_null
    //   341: astore 4
    //   343: aconst_null
    //   344: astore 6
    //   346: aload_3
    //   347: astore_0
    //   348: aload 6
    //   350: astore_3
    //   351: goto +14 -> 365
    //   354: astore_2
    //   355: aconst_null
    //   356: astore_0
    //   357: aload_0
    //   358: astore 5
    //   360: aconst_null
    //   361: astore 4
    //   363: aconst_null
    //   364: astore_3
    //   365: getstatic 98	hb/k:b	Ljava/util/logging/Logger;
    //   368: getstatic 104	java/util/logging/Level:FINER	Ljava/util/logging/Level;
    //   371: ldc 106
    //   373: aload_2
    //   374: invokevirtual 112	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   377: aconst_null
    //   378: astore 7
    //   380: aload_3
    //   381: astore 6
    //   383: aload 5
    //   385: astore_2
    //   386: aload_0
    //   387: astore_3
    //   388: aload 7
    //   390: astore_0
    //   391: aload_2
    //   392: putstatic 114	hb/k$a:m	Ljava/lang/reflect/Method;
    //   395: aload_3
    //   396: putstatic 116	hb/k$a:n	Ljava/lang/reflect/Method;
    //   399: aload 4
    //   401: putstatic 118	hb/k$a:o	Ljava/lang/reflect/Method;
    //   404: aload 6
    //   406: putstatic 120	hb/k$a:k	Ljava/lang/reflect/Method;
    //   409: aload_0
    //   410: putstatic 122	hb/k$a:l	Ljava/lang/reflect/Method;
    //   413: ldc 72
    //   415: ldc 124
    //   417: iconst_1
    //   418: anewarray 40	java/lang/Class
    //   421: dup
    //   422: iconst_0
    //   423: ldc 126
    //   425: aastore
    //   426: invokevirtual 80	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   429: astore_2
    //   430: ldc -128
    //   432: invokestatic 92	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   435: iconst_1
    //   436: anewarray 40	java/lang/Class
    //   439: dup
    //   440: iconst_0
    //   441: ldc 50
    //   443: aastore
    //   444: invokevirtual 132	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   447: astore_3
    //   448: goto +34 -> 482
    //   451: astore_3
    //   452: goto +16 -> 468
    //   455: astore_3
    //   456: goto +12 -> 468
    //   459: astore_3
    //   460: aconst_null
    //   461: astore_2
    //   462: goto +6 -> 468
    //   465: astore_3
    //   466: aconst_null
    //   467: astore_2
    //   468: getstatic 98	hb/k:b	Ljava/util/logging/Logger;
    //   471: getstatic 104	java/util/logging/Level:FINER	Ljava/util/logging/Level;
    //   474: ldc -122
    //   476: aload_3
    //   477: invokevirtual 112	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   480: aload_1
    //   481: astore_3
    //   482: aload_2
    //   483: putstatic 136	hb/k$a:p	Ljava/lang/reflect/Method;
    //   486: aload_3
    //   487: putstatic 138	hb/k$a:q	Ljava/lang/reflect/Constructor;
    //   490: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	275	0	localObject1	Object
    //   290	5	0	localNoSuchMethodException1	NoSuchMethodException
    //   302	1	0	localObject2	Object
    //   312	7	0	localNoSuchMethodException2	NoSuchMethodException
    //   325	85	0	localObject3	Object
    //   5	476	1	localObject4	Object
    //   145	186	2	localObject5	Object
    //   334	1	2	localNoSuchMethodException3	NoSuchMethodException
    //   354	20	2	localClassNotFoundException1	ClassNotFoundException
    //   385	98	2	localObject6	Object
    //   157	158	3	localObject7	Object
    //   323	7	3	localClassNotFoundException2	ClassNotFoundException
    //   336	112	3	localObject8	Object
    //   451	1	3	localNoSuchMethodException4	NoSuchMethodException
    //   455	1	3	localClassNotFoundException3	ClassNotFoundException
    //   459	1	3	localNoSuchMethodException5	NoSuchMethodException
    //   465	12	3	localClassNotFoundException4	ClassNotFoundException
    //   481	6	3	localObject9	Object
    //   169	1	4	localMethod1	Method
    //   299	8	4	localClassNotFoundException5	ClassNotFoundException
    //   341	59	4	localMethod2	Method
    //   176	208	5	localObject10	Object
    //   194	53	6	localMethod3	Method
    //   252	11	6	localNoSuchMethodException6	NoSuchMethodException
    //   271	11	6	localClassNotFoundException6	ClassNotFoundException
    //   344	61	6	localObject11	Object
    //   220	8	7	localNoSuchMethodException7	NoSuchMethodException
    //   236	8	7	localClassNotFoundException7	ClassNotFoundException
    //   255	134	7	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   196	217	220	java/lang/NoSuchMethodException
    //   196	217	236	java/lang/ClassNotFoundException
    //   171	196	252	java/lang/NoSuchMethodException
    //   171	196	271	java/lang/ClassNotFoundException
    //   158	171	290	java/lang/NoSuchMethodException
    //   158	171	299	java/lang/ClassNotFoundException
    //   146	158	312	java/lang/NoSuchMethodException
    //   146	158	323	java/lang/ClassNotFoundException
    //   129	146	334	java/lang/NoSuchMethodException
    //   129	146	354	java/lang/ClassNotFoundException
    //   430	448	451	java/lang/NoSuchMethodException
    //   430	448	455	java/lang/ClassNotFoundException
    //   413	430	459	java/lang/NoSuchMethodException
    //   413	430	465	java/lang/ClassNotFoundException
  }
  
  public k$a(i parami)
  {
    super(parami);
  }
  
  public final void a(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((ArrayList)localObject1).add(nexta);
    }
    localObject1 = (String[])((ArrayList)localObject1).toArray(new String[0]);
    localObject2 = paramSSLSocket.getSSLParameters();
    if (paramString != null) {}
    try
    {
      if (k.c(paramString))
      {
        Method localMethod = k;
        if (localMethod != null) {
          if (((Boolean)localMethod.invoke(null, new Object[] { paramSSLSocket })).booleanValue())
          {
            l.invoke(null, new Object[] { paramSSLSocket, Boolean.TRUE });
            break label155;
          }
        }
        e.l(paramSSLSocket, new Object[] { Boolean.TRUE });
        label155:
        localMethod = p;
        if (localMethod != null)
        {
          Constructor localConstructor = q;
          if (localConstructor != null)
          {
            localMethod.invoke(localObject2, new Object[] { Collections.singletonList(localConstructor.newInstance(new Object[] { paramString })) });
            break label224;
          }
        }
        f.l(paramSSLSocket, new Object[] { paramString });
      }
      label224:
      paramString = o;
      int i1;
      if (paramString != null) {
        try
        {
          paramString.invoke(paramSSLSocket, new Object[0]);
          m.invoke(localObject2, new Object[] { localObject1 });
          i1 = 1;
        }
        catch (InvocationTargetException paramString)
        {
          if ((paramString.getTargetException() instanceof UnsupportedOperationException)) {
            k.b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
          } else {
            throw paramString;
          }
        }
      } else {
        i1 = 0;
      }
      paramSSLSocket.setSSLParameters((SSLParameters)localObject2);
      if (i1 != 0)
      {
        paramString = n;
        if (paramString != null)
        {
          boolean bool = Arrays.equals((Object[])localObject1, (String[])paramString.invoke(paramSSLSocket.getSSLParameters(), new Object[0]));
          if (bool) {
            return;
          }
        }
      }
      paramString = new Object[1];
      paramString[0] = i.b(paramList);
      if (a.e() == 1) {
        h.p(paramSSLSocket, paramString);
      }
      if (a.e() != 3)
      {
        j.p(paramSSLSocket, paramString);
        return;
      }
      throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
    }
    catch (InstantiationException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
  }
  
  public final String b(SSLSocket paramSSLSocket)
  {
    Object localObject1 = o;
    if (localObject1 != null) {
      try
      {
        localObject1 = (String)((Method)localObject1).invoke(paramSSLSocket, new Object[0]);
        return (String)localObject1;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        if ((localInvocationTargetException.getTargetException() instanceof UnsupportedOperationException)) {
          k.b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
        } else {
          throw new RuntimeException(localInvocationTargetException);
        }
      }
      catch (IllegalAccessException paramSSLSocket)
      {
        throw new RuntimeException(paramSSLSocket);
      }
    }
    if (a.e() == 1) {
      try
      {
        Object localObject2 = (byte[])g.p(paramSSLSocket, new Object[0]);
        if (localObject2 != null)
        {
          localObject2 = new String((byte[])localObject2, l.b);
          return (String)localObject2;
        }
      }
      catch (Exception localException)
      {
        k.b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", localException);
      }
    }
    if (a.e() != 3) {
      try
      {
        paramSSLSocket = (byte[])i.p(paramSSLSocket, new Object[0]);
        if (paramSSLSocket != null)
        {
          paramSSLSocket = new String(paramSSLSocket, l.b);
          return paramSSLSocket;
        }
      }
      catch (Exception paramSSLSocket)
      {
        k.b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", paramSSLSocket);
      }
    }
    return null;
  }
  
  public final String d(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
  {
    String str1 = b(paramSSLSocket);
    String str2 = str1;
    if (str1 == null) {
      str2 = super.d(paramSSLSocket, paramString, paramList);
    }
    return str2;
  }
}

/* Location:
 * Qualified Name:     hb.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */