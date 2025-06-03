package e4;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;

public class c
{
  public static final AtomicInteger l = new AtomicInteger(0);
  public static final Charset m = Charset.forName("UTF-8");
  public static ThreadFactory n = Executors.defaultThreadFactory();
  public static b o = new a();
  public volatile d a = d.o;
  public volatile Socket b = null;
  public d c = null;
  public final URI d;
  public final String e;
  public final h f;
  public final i g;
  public final f h;
  public final c4.c i;
  public final int j;
  public final Thread k;
  
  public c(T3.c paramc, URI paramURI, String paramString, Map paramMap)
  {
    int i1 = l.incrementAndGet();
    j = i1;
    k = j().newThread(new b());
    d = paramURI;
    e = paramc.g();
    c4.d locald = paramc.f();
    paramc = new StringBuilder();
    paramc.append("sk_");
    paramc.append(i1);
    i = new c4.c(locald, "WebSocket", paramc.toString());
    h = new f(paramURI, paramString, paramMap);
    f = new h(this);
    g = new i(this, "TubeSock", i1);
  }
  
  public static b i()
  {
    return o;
  }
  
  public static ThreadFactory j()
  {
    return n;
  }
  
  public void b()
  {
    if (g.d().getState() != Thread.State.NEW) {
      g.d().join();
    }
    h().join();
  }
  
  public void c()
  {
    label68:
    try
    {
      int i1 = c.a[a.ordinal()];
      if (i1 != 1) {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4) {
              return;
            }
            return;
          }
          q();
          return;
        }
      }
    }
    finally
    {
      break label68;
      d();
      return;
      a = d.s;
      return;
    }
  }
  
  public final void d()
  {
    try
    {
      Object localObject1 = a;
      Object localObject3 = d.s;
      if (localObject1 == localObject3) {
        return;
      }
      f.h();
      g.i();
      localObject1 = b;
      if (localObject1 != null) {}
      a = d.s;
    }
    finally
    {
      try
      {
        b.close();
      }
      catch (Exception localException)
      {
        locald = c;
        localObject3 = new e4/e;
        ((e)localObject3).<init>("Failed to close", localException);
        locald.d((e)localObject3);
      }
      localObject2 = finally;
      break label99;
    }
    d locald;
    c.b();
    return;
    label99:
    throw locald;
  }
  
  public void e()
  {
    Thread localThread;
    label106:
    try
    {
      if (a != d.o)
      {
        localObject1 = c;
        e locale = new e4/e;
        locale.<init>("connect() already called");
        ((d)localObject1).d(locale);
        c();
        return;
      }
    }
    finally
    {
      break label106;
      b localb = i();
      localThread = h();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("TubeSockReader-");
      ((StringBuilder)localObject1).append(j);
      localb.a(localThread, ((StringBuilder)localObject1).toString());
      a = d.p;
      h().start();
      return;
    }
  }
  
  public final Socket f()
  {
    Object localObject1 = d.getScheme();
    String str = d.getHost();
    int i1 = d.getPort();
    int i2;
    if ((localObject1 != null) && (((String)localObject1).equals("ws")))
    {
      i2 = i1;
      if (i1 == -1) {
        i2 = 80;
      }
      try
      {
        localObject1 = new Socket(str, i2);
      }
      catch (IOException localIOException3) {}catch (UnknownHostException localUnknownHostException1)
      {
        break label113;
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("error while creating socket to ");
      ((StringBuilder)localObject1).append(d);
      throw new e(((StringBuilder)localObject1).toString(), localUnknownHostException1);
      label113:
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("unknown host: ");
      ((StringBuilder)localObject1).append(str);
      throw new e(((StringBuilder)localObject1).toString(), localUnknownHostException1);
    }
    StringBuilder localStringBuilder1;
    if ((localObject1 != null) && (((String)localObject1).equals("wss")))
    {
      i2 = i1;
      if (i1 == -1) {
        i2 = 443;
      }
      e locale = null;
      localObject1 = locale;
      Object localObject2;
      try
      {
        if (e != null)
        {
          localObject1 = new android/net/SSLSessionCache;
          File localFile = new java/io/File;
          localFile.<init>(e);
          ((SSLSessionCache)localObject1).<init>(localFile);
        }
      }
      catch (IOException localIOException1)
      {
        i.a("Failed to initialize SSL session cache", localIOException1, new Object[0]);
        localObject2 = locale;
      }
      try
      {
        localObject2 = (SSLSocket)SSLCertificateSocketFactory.getDefault(60000, (SSLSessionCache)localObject2).createSocket(str, i2);
        if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str, ((SSLSocket)localObject2).getSession())) {
          return (Socket)localObject2;
        }
        locale = new e4/e;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Error while verifying secure socket to ");
        ((StringBuilder)localObject2).append(d);
        locale.<init>(((StringBuilder)localObject2).toString());
        throw locale;
      }
      catch (IOException localIOException2) {}catch (UnknownHostException localUnknownHostException2) {}
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("error while creating secure socket to ");
      localStringBuilder2.append(d);
      throw new e(localStringBuilder2.toString(), localIOException2);
      localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("unknown host: ");
      localStringBuilder1.append(str);
      throw new e(localStringBuilder1.toString(), localStringBuilder2);
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("unsupported protocol: ");
    localStringBuilder2.append(localStringBuilder1);
    throw new e(localStringBuilder2.toString());
  }
  
  public d g()
  {
    return c;
  }
  
  public Thread h()
  {
    return k;
  }
  
  public void k(e parame)
  {
    c.d(parame);
    if (a == d.q) {
      c();
    }
    d();
  }
  
  public void l()
  {
    d();
  }
  
  public void m(byte[] paramArrayOfByte)
  {
    try
    {
      o((byte)10, paramArrayOfByte);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  /* Error */
  public final void n()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 342	e4/c:f	()Ljava/net/Socket;
    //   4: astore_1
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_1
    //   9: putfield 83	e4/c:b	Ljava/net/Socket;
    //   12: aload_0
    //   13: getfield 81	e4/c:a	Le4/c$d;
    //   16: astore_2
    //   17: getstatic 200	e4/c$d:s	Le4/c$d;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: if_acmpne +38 -> 61
    //   26: aload_0
    //   27: getfield 83	e4/c:b	Ljava/net/Socket;
    //   30: invokevirtual 211	java/net/Socket:close	()V
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 83	e4/c:b	Ljava/net/Socket;
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_0
    //   41: invokevirtual 232	e4/c:c	()V
    //   44: return
    //   45: astore_1
    //   46: goto +426 -> 472
    //   49: astore_1
    //   50: new 344	java/lang/RuntimeException
    //   53: astore_3
    //   54: aload_3
    //   55: aload_1
    //   56: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   59: aload_3
    //   60: athrow
    //   61: aload_0
    //   62: monitorexit
    //   63: new 349	java/io/DataInputStream
    //   66: astore_3
    //   67: aload_3
    //   68: aload_1
    //   69: invokevirtual 353	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   72: invokespecial 356	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   75: aload_1
    //   76: invokevirtual 360	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   79: astore_2
    //   80: aload_2
    //   81: aload_0
    //   82: getfield 147	e4/c:h	Le4/f;
    //   85: invokevirtual 363	e4/f:c	()[B
    //   88: invokevirtual 368	java/io/OutputStream:write	([B)V
    //   91: sipush 1000
    //   94: newarray <illegal type>
    //   96: astore_1
    //   97: new 370	java/util/ArrayList
    //   100: astore 4
    //   102: aload 4
    //   104: invokespecial 371	java/util/ArrayList:<init>	()V
    //   107: iconst_0
    //   108: istore 5
    //   110: iload 5
    //   112: istore 6
    //   114: iload 5
    //   116: ifne +190 -> 306
    //   119: aload_3
    //   120: invokevirtual 376	java/io/InputStream:read	()I
    //   123: istore 7
    //   125: iload 7
    //   127: iconst_m1
    //   128: if_icmpeq +165 -> 293
    //   131: aload_1
    //   132: iload 6
    //   134: iload 7
    //   136: i2b
    //   137: i2b
    //   138: bastore
    //   139: iload 6
    //   141: iconst_1
    //   142: iadd
    //   143: istore 7
    //   145: aload_1
    //   146: iload 6
    //   148: baload
    //   149: bipush 10
    //   151: if_icmpne +79 -> 230
    //   154: aload_1
    //   155: iload 6
    //   157: iconst_1
    //   158: isub
    //   159: baload
    //   160: bipush 13
    //   162: if_icmpne +68 -> 230
    //   165: new 267	java/lang/String
    //   168: astore 8
    //   170: aload 8
    //   172: aload_1
    //   173: getstatic 62	e4/c:m	Ljava/nio/charset/Charset;
    //   176: invokespecial 379	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   179: aload 8
    //   181: invokevirtual 382	java/lang/String:trim	()Ljava/lang/String;
    //   184: ldc_w 384
    //   187: invokevirtual 271	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   190: ifeq +9 -> 199
    //   193: iconst_1
    //   194: istore 5
    //   196: goto +14 -> 210
    //   199: aload 4
    //   201: aload 8
    //   203: invokevirtual 382	java/lang/String:trim	()Ljava/lang/String;
    //   206: invokevirtual 387	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   209: pop
    //   210: sipush 1000
    //   213: newarray <illegal type>
    //   215: astore_1
    //   216: iconst_0
    //   217: istore 6
    //   219: goto -105 -> 114
    //   222: astore_1
    //   223: goto +253 -> 476
    //   226: astore_1
    //   227: goto +311 -> 538
    //   230: iload 7
    //   232: sipush 1000
    //   235: if_icmpeq +10 -> 245
    //   238: iload 7
    //   240: istore 6
    //   242: goto -128 -> 114
    //   245: new 267	java/lang/String
    //   248: astore_3
    //   249: aload_3
    //   250: aload_1
    //   251: getstatic 62	e4/c:m	Ljava/nio/charset/Charset;
    //   254: invokespecial 379	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   257: new 213	e4/e
    //   260: astore_2
    //   261: new 118	java/lang/StringBuilder
    //   264: astore_1
    //   265: aload_1
    //   266: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   269: aload_1
    //   270: ldc_w 389
    //   273: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload_1
    //   278: aload_3
    //   279: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload_2
    //   284: aload_1
    //   285: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: invokespecial 230	e4/e:<init>	(Ljava/lang/String;)V
    //   291: aload_2
    //   292: athrow
    //   293: new 213	e4/e
    //   296: astore_1
    //   297: aload_1
    //   298: ldc_w 391
    //   301: invokespecial 230	e4/e:<init>	(Ljava/lang/String;)V
    //   304: aload_1
    //   305: athrow
    //   306: aload_0
    //   307: getfield 147	e4/c:h	Le4/f;
    //   310: aload 4
    //   312: iconst_0
    //   313: invokevirtual 395	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   316: checkcast 267	java/lang/String
    //   319: invokevirtual 397	e4/f:f	(Ljava/lang/String;)V
    //   322: aload 4
    //   324: iconst_0
    //   325: invokevirtual 400	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   328: pop
    //   329: new 402	java/util/HashMap
    //   332: astore_1
    //   333: aload_1
    //   334: invokespecial 403	java/util/HashMap:<init>	()V
    //   337: aload 4
    //   339: invokevirtual 407	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   342: astore 8
    //   344: aload 8
    //   346: invokeinterface 413 1 0
    //   351: ifeq +57 -> 408
    //   354: aload 8
    //   356: invokeinterface 417 1 0
    //   361: checkcast 267	java/lang/String
    //   364: ldc_w 419
    //   367: iconst_2
    //   368: invokevirtual 423	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   371: astore 9
    //   373: aload 9
    //   375: iconst_0
    //   376: aaload
    //   377: astore 10
    //   379: getstatic 429	java/util/Locale:US	Ljava/util/Locale;
    //   382: astore 4
    //   384: aload_1
    //   385: aload 10
    //   387: aload 4
    //   389: invokevirtual 433	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   392: aload 9
    //   394: iconst_1
    //   395: aaload
    //   396: aload 4
    //   398: invokevirtual 433	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   401: invokevirtual 437	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   404: pop
    //   405: goto -61 -> 344
    //   408: aload_0
    //   409: getfield 147	e4/c:h	Le4/f;
    //   412: aload_1
    //   413: invokevirtual 440	e4/f:e	(Ljava/util/HashMap;)V
    //   416: aload_0
    //   417: getfield 161	e4/c:g	Le4/i;
    //   420: aload_2
    //   421: invokevirtual 443	e4/i:h	(Ljava/io/OutputStream;)V
    //   424: aload_0
    //   425: getfield 152	e4/c:f	Le4/h;
    //   428: aload_3
    //   429: invokevirtual 446	e4/h:g	(Ljava/io/DataInputStream;)V
    //   432: aload_0
    //   433: getstatic 336	e4/c$d:q	Le4/c$d;
    //   436: putfield 81	e4/c:a	Le4/c$d;
    //   439: aload_0
    //   440: getfield 161	e4/c:g	Le4/i;
    //   443: invokevirtual 167	e4/i:d	()Ljava/lang/Thread;
    //   446: invokevirtual 247	java/lang/Thread:start	()V
    //   449: aload_0
    //   450: getfield 85	e4/c:c	Le4/d;
    //   453: invokeinterface 447 1 0
    //   458: aload_0
    //   459: getfield 152	e4/c:f	Le4/h;
    //   462: invokevirtual 449	e4/h:f	()V
    //   465: aload_0
    //   466: invokevirtual 232	e4/c:c	()V
    //   469: goto +82 -> 551
    //   472: aload_0
    //   473: monitorexit
    //   474: aload_1
    //   475: athrow
    //   476: aload_0
    //   477: getfield 85	e4/c:c	Le4/d;
    //   480: astore_2
    //   481: new 213	e4/e
    //   484: astore_3
    //   485: new 118	java/lang/StringBuilder
    //   488: astore 4
    //   490: aload 4
    //   492: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   495: aload 4
    //   497: ldc_w 451
    //   500: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: pop
    //   504: aload 4
    //   506: aload_1
    //   507: invokevirtual 456	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   510: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   513: pop
    //   514: aload_3
    //   515: aload 4
    //   517: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   520: aload_1
    //   521: invokespecial 218	e4/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   524: aload_2
    //   525: aload_3
    //   526: invokeinterface 223 2 0
    //   531: goto -66 -> 465
    //   534: astore_1
    //   535: goto +17 -> 552
    //   538: aload_0
    //   539: getfield 85	e4/c:c	Le4/d;
    //   542: aload_1
    //   543: invokeinterface 223 2 0
    //   548: goto -83 -> 465
    //   551: return
    //   552: aload_0
    //   553: invokevirtual 232	e4/c:c	()V
    //   556: aload_1
    //   557: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	558	0	this	c
    //   4	5	1	localSocket	Socket
    //   45	1	1	localObject1	Object
    //   49	27	1	localIOException	IOException
    //   96	120	1	arrayOfByte	byte[]
    //   222	1	1	localObject2	Object
    //   226	25	1	locale1	e
    //   264	257	1	localObject3	Object
    //   534	23	1	locale2	e
    //   16	509	2	localObject4	Object
    //   20	506	3	localObject5	Object
    //   100	416	4	localObject6	Object
    //   108	87	5	i1	int
    //   112	129	6	i2	int
    //   123	116	7	i3	int
    //   168	187	8	localObject7	Object
    //   371	22	9	arrayOfString	String[]
    //   377	9	10	str	String
    // Exception table:
    //   from	to	target	type
    //   7	21	45	finally
    //   26	33	45	finally
    //   33	40	45	finally
    //   50	61	45	finally
    //   61	63	45	finally
    //   472	474	45	finally
    //   26	33	49	java/io/IOException
    //   0	7	222	finally
    //   63	107	222	finally
    //   119	125	222	finally
    //   165	193	222	finally
    //   199	210	222	finally
    //   210	216	222	finally
    //   245	293	222	finally
    //   293	306	222	finally
    //   306	344	222	finally
    //   344	373	222	finally
    //   379	405	222	finally
    //   408	465	222	finally
    //   474	476	222	finally
    //   0	7	226	e4/e
    //   63	107	226	e4/e
    //   119	125	226	e4/e
    //   165	193	226	e4/e
    //   199	210	226	e4/e
    //   210	216	226	e4/e
    //   245	293	226	e4/e
    //   293	306	226	e4/e
    //   306	344	226	e4/e
    //   344	373	226	e4/e
    //   379	405	226	e4/e
    //   408	465	226	e4/e
    //   474	476	226	e4/e
    //   476	531	534	finally
    //   538	548	534	finally
  }
  
  public final void o(byte paramByte, byte[] paramArrayOfByte)
  {
    try
    {
      if (a != d.q)
      {
        paramArrayOfByte = c;
        e locale1 = new e4/e;
        locale1.<init>("error while sending data: not connected");
        paramArrayOfByte.d(locale1);
      }
    }
    finally
    {
      break label90;
    }
    try
    {
      g.g(paramByte, true, paramArrayOfByte);
    }
    catch (IOException localIOException)
    {
      paramArrayOfByte = c;
      e locale2 = new e4/e;
      locale2.<init>("Failed to send frame", localIOException);
      paramArrayOfByte.d(locale2);
      c();
    }
    return;
    label90:
    throw paramArrayOfByte;
  }
  
  public void p(String paramString)
  {
    try
    {
      o((byte)1, paramString.getBytes(m));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void q()
  {
    try
    {
      a = d.r;
      g.i();
      g.g((byte)8, true, new byte[0]);
    }
    catch (IOException localIOException)
    {
      c.d(new e("Failed to send close frame", localIOException));
    }
  }
  
  public void r(d paramd)
  {
    c = paramd;
  }
  
  public class a
    implements b
  {
    public void a(Thread paramThread, String paramString)
    {
      paramThread.setName(paramString);
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      c.a(c.this);
    }
  }
  
  public static enum d
  {
    static
    {
      d locald1 = new d("NONE", 0);
      o = locald1;
      d locald2 = new d("CONNECTING", 1);
      p = locald2;
      d locald3 = new d("CONNECTED", 2);
      q = locald3;
      d locald4 = new d("DISCONNECTING", 3);
      r = locald4;
      d locald5 = new d("DISCONNECTED", 4);
      s = locald5;
      t = new d[] { locald1, locald2, locald3, locald4, locald5 };
    }
  }
}

/* Location:
 * Qualified Name:     e4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */