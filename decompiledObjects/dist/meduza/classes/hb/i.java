package hb;

import eb.a0;
import eb.e1;
import eb.f0;
import eb.f1;
import eb.s0;
import eb.t0;
import eb.t0.c;
import gb.a.b;
import gb.b1;
import gb.c1;
import gb.d.a;
import gb.f3;
import gb.h2.a;
import gb.l3;
import gb.n3;
import gb.o1;
import gb.o1.c;
import gb.o3;
import gb.r3;
import gb.t.a;
import gb.v0;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kb.a.a;
import n7.g.a;
import n7.q;
import p2.m0;
import xc.e;
import xc.r;
import xc.y;
import xc.z;

public final class i
  implements gb.x, b.a, p.c
{
  public static final Map<jb.a, e1> S;
  public static final Logger T = Logger.getLogger(i.class.getName());
  public final SocketFactory A;
  public SSLSocketFactory B;
  public HostnameVerifier C;
  public int D;
  public final LinkedList E;
  public final ib.b F;
  public o1 G;
  public boolean H;
  public long I;
  public long J;
  public boolean K;
  public final Runnable L;
  public final int M;
  public final boolean N;
  public final r3 O;
  public final a P;
  public final a0 Q;
  public int R;
  public final InetSocketAddress a;
  public final String b;
  public final String c;
  public final Random d;
  public final q<n7.p> e;
  public final int f;
  public final jb.h g;
  public h2.a h;
  public b i;
  public p j;
  public final Object k;
  public final f0 l;
  public int m;
  public final HashMap n;
  public final Executor o;
  public final f3 p;
  public final ScheduledExecutorService q;
  public final int r;
  public int s;
  public d t;
  public eb.a u;
  public e1 v;
  public boolean w;
  public b1 x;
  public boolean y;
  public boolean z;
  
  static
  {
    EnumMap localEnumMap = new EnumMap(jb.a.class);
    jb.a locala = jb.a.b;
    e1 locale1 = e1.m;
    localEnumMap.put(locala, locale1.g("No error: A GRPC status of OK should have been sent"));
    localEnumMap.put(jb.a.c, locale1.g("Protocol error"));
    localEnumMap.put(jb.a.d, locale1.g("Internal error"));
    localEnumMap.put(jb.a.e, locale1.g("Flow control error"));
    localEnumMap.put(jb.a.f, locale1.g("Stream closed"));
    localEnumMap.put(jb.a.o, locale1.g("Frame too large"));
    localEnumMap.put(jb.a.p, e1.n.g("Refused stream"));
    localEnumMap.put(jb.a.q, e1.f.g("Cancelled"));
    localEnumMap.put(jb.a.r, locale1.g("Compression error"));
    localEnumMap.put(jb.a.s, locale1.g("Connect error"));
    localEnumMap.put(jb.a.t, e1.k.g("Enhance your calm"));
    localEnumMap.put(jb.a.u, e1.i.g("Inadequate security"));
    S = Collections.unmodifiableMap(localEnumMap);
  }
  
  public i() {}
  
  /* Error */
  public i(e.d paramd, InetSocketAddress paramInetSocketAddress, String paramString1, String paramString2, eb.a parama, a0 parama0, f paramf)
  {
    // Byte code:
    //   0: getstatic 206	gb/v0:r	Lgb/v0$d;
    //   3: astore 8
    //   5: new 208	jb/f
    //   8: dup
    //   9: invokespecial 210	jb/f:<init>	()V
    //   12: astore 9
    //   14: aload_0
    //   15: invokespecial 211	java/lang/Object:<init>	()V
    //   18: aload_0
    //   19: new 213	java/util/Random
    //   22: dup
    //   23: invokespecial 214	java/util/Random:<init>	()V
    //   26: putfield 216	hb/i:d	Ljava/util/Random;
    //   29: new 4	java/lang/Object
    //   32: dup
    //   33: invokespecial 211	java/lang/Object:<init>	()V
    //   36: astore 10
    //   38: aload_0
    //   39: aload 10
    //   41: putfield 218	hb/i:k	Ljava/lang/Object;
    //   44: aload_0
    //   45: new 220	java/util/HashMap
    //   48: dup
    //   49: invokespecial 221	java/util/HashMap:<init>	()V
    //   52: putfield 223	hb/i:n	Ljava/util/HashMap;
    //   55: aload_0
    //   56: iconst_0
    //   57: putfield 225	hb/i:D	I
    //   60: aload_0
    //   61: new 227	java/util/LinkedList
    //   64: dup
    //   65: invokespecial 228	java/util/LinkedList:<init>	()V
    //   68: putfield 230	hb/i:E	Ljava/util/LinkedList;
    //   71: aload_0
    //   72: new 12	hb/i$a
    //   75: dup
    //   76: aload_0
    //   77: invokespecial 233	hb/i$a:<init>	(Lhb/i;)V
    //   80: putfield 235	hb/i:P	Lhb/i$a;
    //   83: aload_0
    //   84: sipush 30000
    //   87: putfield 237	hb/i:R	I
    //   90: aload_2
    //   91: ldc -17
    //   93: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   96: aload_0
    //   97: aload_2
    //   98: putfield 246	hb/i:a	Ljava/net/InetSocketAddress;
    //   101: aload_0
    //   102: aload_3
    //   103: putfield 248	hb/i:b	Ljava/lang/String;
    //   106: aload_0
    //   107: aload_1
    //   108: getfield 252	hb/e$d:r	I
    //   111: putfield 253	hb/i:r	I
    //   114: aload_0
    //   115: aload_1
    //   116: getfield 255	hb/e$d:v	I
    //   119: putfield 257	hb/i:f	I
    //   122: aload_1
    //   123: getfield 259	hb/e$d:b	Ljava/util/concurrent/Executor;
    //   126: astore_3
    //   127: aload_3
    //   128: ldc_w 261
    //   131: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   134: aload_0
    //   135: aload_3
    //   136: putfield 263	hb/i:o	Ljava/util/concurrent/Executor;
    //   139: aload_0
    //   140: new 265	gb/f3
    //   143: dup
    //   144: aload_1
    //   145: getfield 259	hb/e$d:b	Ljava/util/concurrent/Executor;
    //   148: invokespecial 268	gb/f3:<init>	(Ljava/util/concurrent/Executor;)V
    //   151: putfield 270	hb/i:p	Lgb/f3;
    //   154: aload_1
    //   155: getfield 272	hb/e$d:d	Ljava/util/concurrent/ScheduledExecutorService;
    //   158: astore_3
    //   159: aload_3
    //   160: ldc_w 274
    //   163: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   166: aload_0
    //   167: aload_3
    //   168: putfield 276	hb/i:q	Ljava/util/concurrent/ScheduledExecutorService;
    //   171: aload_0
    //   172: iconst_3
    //   173: putfield 278	hb/i:m	I
    //   176: aload_1
    //   177: getfield 280	hb/e$d:f	Ljavax/net/SocketFactory;
    //   180: astore 11
    //   182: aload 11
    //   184: astore_3
    //   185: aload 11
    //   187: ifnonnull +7 -> 194
    //   190: invokestatic 286	javax/net/SocketFactory:getDefault	()Ljavax/net/SocketFactory;
    //   193: astore_3
    //   194: aload_0
    //   195: aload_3
    //   196: putfield 288	hb/i:A	Ljavax/net/SocketFactory;
    //   199: aload_0
    //   200: aload_1
    //   201: getfield 290	hb/e$d:o	Ljavax/net/ssl/SSLSocketFactory;
    //   204: putfield 292	hb/i:B	Ljavax/net/ssl/SSLSocketFactory;
    //   207: aload_0
    //   208: aload_1
    //   209: getfield 294	hb/e$d:p	Ljavax/net/ssl/HostnameVerifier;
    //   212: putfield 296	hb/i:C	Ljavax/net/ssl/HostnameVerifier;
    //   215: aload_1
    //   216: getfield 298	hb/e$d:q	Lib/b;
    //   219: astore_3
    //   220: aload_3
    //   221: ldc_w 300
    //   224: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   227: aload_0
    //   228: aload_3
    //   229: putfield 302	hb/i:F	Lib/b;
    //   232: aload 8
    //   234: ldc_w 304
    //   237: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   240: aload_0
    //   241: aload 8
    //   243: putfield 306	hb/i:e	Ln7/q;
    //   246: aload_0
    //   247: aload 9
    //   249: putfield 308	hb/i:g	Ljb/h;
    //   252: new 310	java/lang/StringBuilder
    //   255: dup
    //   256: invokespecial 311	java/lang/StringBuilder:<init>	()V
    //   259: astore_3
    //   260: aload 4
    //   262: ifnull +17 -> 279
    //   265: aload_3
    //   266: aload 4
    //   268: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: pop
    //   272: aload_3
    //   273: bipush 32
    //   275: invokevirtual 318	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: aload_3
    //   280: ldc_w 320
    //   283: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aload_3
    //   288: ldc_w 322
    //   291: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload_3
    //   296: bipush 47
    //   298: invokevirtual 318	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload_3
    //   303: ldc_w 324
    //   306: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload_0
    //   311: aload_3
    //   312: invokevirtual 327	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: putfield 329	hb/i:c	Ljava/lang/String;
    //   318: aload_0
    //   319: aload 6
    //   321: putfield 331	hb/i:Q	Leb/a0;
    //   324: aload_0
    //   325: aload 7
    //   327: putfield 333	hb/i:L	Ljava/lang/Runnable;
    //   330: aload_0
    //   331: aload_1
    //   332: getfield 335	hb/e$d:x	I
    //   335: putfield 337	hb/i:M	I
    //   338: aload_1
    //   339: getfield 340	hb/e$d:e	Lgb/r3$a;
    //   342: astore_3
    //   343: aload_3
    //   344: invokevirtual 344	java/lang/Object:getClass	()Ljava/lang/Class;
    //   347: pop
    //   348: aload_0
    //   349: new 346	gb/r3
    //   352: dup
    //   353: aload_3
    //   354: getfield 351	gb/r3$a:a	Lgb/o3;
    //   357: invokespecial 354	gb/r3:<init>	(Lgb/o3;)V
    //   360: putfield 356	hb/i:O	Lgb/r3;
    //   363: aload_0
    //   364: ldc 2
    //   366: aload_2
    //   367: invokevirtual 359	java/net/InetSocketAddress:toString	()Ljava/lang/String;
    //   370: invokestatic 364	eb/f0:a	(Ljava/lang/Class;Ljava/lang/String;)Leb/f0;
    //   373: putfield 366	hb/i:l	Leb/f0;
    //   376: getstatic 370	eb/a:b	Leb/a;
    //   379: astore 4
    //   381: getstatic 375	gb/u0:b	Leb/a$b;
    //   384: astore_3
    //   385: new 377	java/util/IdentityHashMap
    //   388: dup
    //   389: iconst_1
    //   390: invokespecial 380	java/util/IdentityHashMap:<init>	(I)V
    //   393: astore_2
    //   394: aload_2
    //   395: aload_3
    //   396: aload 5
    //   398: invokevirtual 381	java/util/IdentityHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   401: pop
    //   402: aload 4
    //   404: getfield 384	eb/a:a	Ljava/util/IdentityHashMap;
    //   407: invokevirtual 388	java/util/IdentityHashMap:entrySet	()Ljava/util/Set;
    //   410: invokeinterface 394 1 0
    //   415: astore 4
    //   417: aload 4
    //   419: invokeinterface 400 1 0
    //   424: ifeq +50 -> 474
    //   427: aload 4
    //   429: invokeinterface 404 1 0
    //   434: checkcast 406	java/util/Map$Entry
    //   437: astore_3
    //   438: aload_2
    //   439: aload_3
    //   440: invokeinterface 409 1 0
    //   445: invokevirtual 413	java/util/IdentityHashMap:containsKey	(Ljava/lang/Object;)Z
    //   448: ifne -31 -> 417
    //   451: aload_2
    //   452: aload_3
    //   453: invokeinterface 409 1 0
    //   458: checkcast 415	eb/a$b
    //   461: aload_3
    //   462: invokeinterface 418 1 0
    //   467: invokevirtual 381	java/util/IdentityHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   470: pop
    //   471: goto -54 -> 417
    //   474: aload_0
    //   475: new 368	eb/a
    //   478: dup
    //   479: aload_2
    //   480: invokespecial 421	eb/a:<init>	(Ljava/util/IdentityHashMap;)V
    //   483: putfield 423	hb/i:u	Leb/a;
    //   486: aload_0
    //   487: aload_1
    //   488: getfield 425	hb/e$d:y	Z
    //   491: putfield 427	hb/i:N	Z
    //   494: aload 10
    //   496: monitorenter
    //   497: aload 10
    //   499: monitorexit
    //   500: return
    //   501: astore_1
    //   502: aload 10
    //   504: monitorexit
    //   505: aload_1
    //   506: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	507	0	this	i
    //   0	507	1	paramd	e.d
    //   0	507	2	paramInetSocketAddress	InetSocketAddress
    //   0	507	3	paramString1	String
    //   0	507	4	paramString2	String
    //   0	507	5	parama	eb.a
    //   0	507	6	parama0	a0
    //   0	507	7	paramf	f
    //   3	239	8	locald	gb.v0.d
    //   12	236	9	localf	jb.f
    //   36	467	10	localObject	Object
    //   180	6	11	localSocketFactory	SocketFactory
    // Exception table:
    //   from	to	target	type
    //   497	500	501	finally
    //   502	505	501	finally
  }
  
  public static void i(i parami, String paramString)
  {
    jb.a locala = jb.a.c;
    parami.getClass();
    parami.t(0, locala, x(locala).a(paramString));
  }
  
  /* Error */
  public static java.net.Socket j(i parami, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 344	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: pop
    //   5: aconst_null
    //   6: astore 5
    //   8: aload_2
    //   9: invokevirtual 443	java/net/InetSocketAddress:getAddress	()Ljava/net/InetAddress;
    //   12: ifnull +22 -> 34
    //   15: aload_0
    //   16: getfield 288	hb/i:A	Ljavax/net/SocketFactory;
    //   19: aload_2
    //   20: invokevirtual 443	java/net/InetSocketAddress:getAddress	()Ljava/net/InetAddress;
    //   23: aload_2
    //   24: invokevirtual 447	java/net/InetSocketAddress:getPort	()I
    //   27: invokevirtual 451	javax/net/SocketFactory:createSocket	(Ljava/net/InetAddress;I)Ljava/net/Socket;
    //   30: astore_2
    //   31: goto +19 -> 50
    //   34: aload_0
    //   35: getfield 288	hb/i:A	Ljavax/net/SocketFactory;
    //   38: aload_2
    //   39: invokevirtual 454	java/net/InetSocketAddress:getHostName	()Ljava/lang/String;
    //   42: aload_2
    //   43: invokevirtual 447	java/net/InetSocketAddress:getPort	()I
    //   46: invokevirtual 457	javax/net/SocketFactory:createSocket	(Ljava/lang/String;I)Ljava/net/Socket;
    //   49: astore_2
    //   50: aload_2
    //   51: iconst_1
    //   52: invokevirtual 463	java/net/Socket:setTcpNoDelay	(Z)V
    //   55: aload_2
    //   56: aload_0
    //   57: getfield 237	hb/i:R	I
    //   60: invokevirtual 466	java/net/Socket:setSoTimeout	(I)V
    //   63: aload_2
    //   64: invokestatic 472	p2/m0:b0	(Ljava/net/Socket;)Lxc/e;
    //   67: astore 5
    //   69: aload_2
    //   70: invokestatic 476	p2/m0:a0	(Ljava/net/Socket;)Lxc/d;
    //   73: astore 6
    //   75: new 478	xc/r
    //   78: astore 7
    //   80: aload 7
    //   82: aload 6
    //   84: invokespecial 481	xc/r:<init>	(Lxc/w;)V
    //   87: aload_0
    //   88: aload_1
    //   89: aload_3
    //   90: aload 4
    //   92: invokevirtual 484	hb/i:k	(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lkb/b;
    //   95: astore_1
    //   96: aload_1
    //   97: getfield 489	kb/b:a	Lkb/a;
    //   100: astore_0
    //   101: aload 7
    //   103: getstatic 495	java/util/Locale:US	Ljava/util/Locale;
    //   106: ldc_w 497
    //   109: iconst_2
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_0
    //   116: getfield 501	kb/a:a	Ljava/lang/String;
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: aload_0
    //   123: getfield 503	kb/a:b	I
    //   126: invokestatic 509	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: aastore
    //   130: invokestatic 515	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   133: invokevirtual 518	xc/r:O	(Ljava/lang/String;)Lxc/g;
    //   136: pop
    //   137: aload 7
    //   139: ldc_w 520
    //   142: invokevirtual 518	xc/r:O	(Ljava/lang/String;)Lxc/g;
    //   145: pop
    //   146: aload_1
    //   147: getfield 523	kb/b:b	Lib/d;
    //   150: getfield 528	ib/d:a	[Ljava/lang/String;
    //   153: arraylength
    //   154: iconst_2
    //   155: idiv
    //   156: istore 8
    //   158: iconst_0
    //   159: istore 9
    //   161: iload 9
    //   163: iload 8
    //   165: if_icmpge +134 -> 299
    //   168: aload_1
    //   169: getfield 523	kb/b:b	Lib/d;
    //   172: astore_0
    //   173: iload 9
    //   175: iconst_2
    //   176: imul
    //   177: istore 10
    //   179: iload 10
    //   181: iflt +26 -> 207
    //   184: aload_0
    //   185: getfield 528	ib/d:a	[Ljava/lang/String;
    //   188: astore_0
    //   189: iload 10
    //   191: aload_0
    //   192: arraylength
    //   193: if_icmplt +6 -> 199
    //   196: goto +16 -> 212
    //   199: aload_0
    //   200: iload 10
    //   202: aaload
    //   203: astore_0
    //   204: goto +10 -> 214
    //   207: aload_0
    //   208: invokevirtual 344	java/lang/Object:getClass	()Ljava/lang/Class;
    //   211: pop
    //   212: aconst_null
    //   213: astore_0
    //   214: aload 7
    //   216: aload_0
    //   217: invokevirtual 518	xc/r:O	(Ljava/lang/String;)Lxc/g;
    //   220: pop
    //   221: aload 7
    //   223: ldc_w 530
    //   226: invokevirtual 518	xc/r:O	(Ljava/lang/String;)Lxc/g;
    //   229: pop
    //   230: aload_1
    //   231: getfield 523	kb/b:b	Lib/d;
    //   234: astore_0
    //   235: iinc 10 1
    //   238: iload 10
    //   240: iflt +26 -> 266
    //   243: aload_0
    //   244: getfield 528	ib/d:a	[Ljava/lang/String;
    //   247: astore_0
    //   248: iload 10
    //   250: aload_0
    //   251: arraylength
    //   252: if_icmplt +6 -> 258
    //   255: goto +16 -> 271
    //   258: aload_0
    //   259: iload 10
    //   261: aaload
    //   262: astore_0
    //   263: goto +10 -> 273
    //   266: aload_0
    //   267: invokevirtual 344	java/lang/Object:getClass	()Ljava/lang/Class;
    //   270: pop
    //   271: aconst_null
    //   272: astore_0
    //   273: aload 7
    //   275: aload_0
    //   276: invokeinterface 533 2 0
    //   281: pop
    //   282: aload 7
    //   284: ldc_w 520
    //   287: invokeinterface 533 2 0
    //   292: pop
    //   293: iinc 9 1
    //   296: goto -135 -> 161
    //   299: aload 7
    //   301: ldc_w 520
    //   304: invokevirtual 518	xc/r:O	(Ljava/lang/String;)Lxc/g;
    //   307: pop
    //   308: aload 7
    //   310: invokevirtual 536	xc/r:flush	()V
    //   313: aload 5
    //   315: invokestatic 539	hb/i:r	(Lxc/e;)Ljava/lang/String;
    //   318: invokestatic 544	s8/a:a	(Ljava/lang/String;)Ls8/a;
    //   321: astore_0
    //   322: aload 5
    //   324: invokestatic 539	hb/i:r	(Lxc/e;)Ljava/lang/String;
    //   327: ldc_w 546
    //   330: invokevirtual 549	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   333: ifne +6 -> 339
    //   336: goto -14 -> 322
    //   339: aload_0
    //   340: getfield 550	s8/a:b	I
    //   343: istore 9
    //   345: iload 9
    //   347: sipush 200
    //   350: if_icmplt +18 -> 368
    //   353: iload 9
    //   355: sipush 300
    //   358: if_icmpge +10 -> 368
    //   361: aload_2
    //   362: iconst_0
    //   363: invokevirtual 466	java/net/Socket:setSoTimeout	(I)V
    //   366: aload_2
    //   367: areturn
    //   368: new 552	xc/f
    //   371: astore_1
    //   372: aload_1
    //   373: invokespecial 553	xc/f:<init>	()V
    //   376: aload_2
    //   377: invokevirtual 556	java/net/Socket:shutdownOutput	()V
    //   380: aload 5
    //   382: aload_1
    //   383: ldc2_w 557
    //   386: invokevirtual 564	xc/e:e0	(Lxc/f;J)J
    //   389: pop2
    //   390: goto +42 -> 432
    //   393: astore_3
    //   394: new 310	java/lang/StringBuilder
    //   397: astore 4
    //   399: aload 4
    //   401: invokespecial 311	java/lang/StringBuilder:<init>	()V
    //   404: aload 4
    //   406: ldc_w 566
    //   409: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: aload 4
    //   415: aload_3
    //   416: invokevirtual 567	java/lang/Object:toString	()Ljava/lang/String;
    //   419: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: pop
    //   423: aload_1
    //   424: aload 4
    //   426: invokevirtual 327	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   429: invokevirtual 571	xc/f:H0	(Ljava/lang/String;)V
    //   432: aload_2
    //   433: invokevirtual 574	java/net/Socket:close	()V
    //   436: getstatic 495	java/util/Locale:US	Ljava/util/Locale;
    //   439: ldc_w 576
    //   442: iconst_3
    //   443: anewarray 4	java/lang/Object
    //   446: dup
    //   447: iconst_0
    //   448: aload_0
    //   449: getfield 550	s8/a:b	I
    //   452: invokestatic 509	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   455: aastore
    //   456: dup
    //   457: iconst_1
    //   458: aload_0
    //   459: getfield 578	s8/a:d	Ljava/lang/Object;
    //   462: checkcast 511	java/lang/String
    //   465: aastore
    //   466: dup
    //   467: iconst_2
    //   468: aload_1
    //   469: invokevirtual 581	xc/f:k0	()Ljava/lang/String;
    //   472: aastore
    //   473: invokestatic 515	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   476: astore_0
    //   477: getstatic 149	eb/e1:n	Leb/e1;
    //   480: aload_0
    //   481: invokevirtual 121	eb/e1:g	(Ljava/lang/String;)Leb/e1;
    //   484: astore_1
    //   485: new 583	eb/f1
    //   488: astore_0
    //   489: aload_0
    //   490: aload_1
    //   491: invokespecial 586	eb/f1:<init>	(Leb/e1;)V
    //   494: aload_0
    //   495: athrow
    //   496: astore_0
    //   497: aload_2
    //   498: astore_1
    //   499: goto +7 -> 506
    //   502: astore_0
    //   503: aload 5
    //   505: astore_1
    //   506: aload_1
    //   507: ifnull +7 -> 514
    //   510: aload_1
    //   511: invokestatic 589	gb/v0:b	(Ljava/io/Closeable;)V
    //   514: new 583	eb/f1
    //   517: dup
    //   518: getstatic 149	eb/e1:n	Leb/e1;
    //   521: ldc_w 591
    //   524: invokevirtual 121	eb/e1:g	(Ljava/lang/String;)Leb/e1;
    //   527: aload_0
    //   528: invokevirtual 594	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
    //   531: invokespecial 586	eb/f1:<init>	(Leb/e1;)V
    //   534: athrow
    //   535: astore_3
    //   536: goto -100 -> 436
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	539	0	parami	i
    //   0	539	1	paramInetSocketAddress1	InetSocketAddress
    //   0	539	2	paramInetSocketAddress2	InetSocketAddress
    //   0	539	3	paramString1	String
    //   0	539	4	paramString2	String
    //   6	498	5	locale	e
    //   73	10	6	locald	xc.d
    //   78	231	7	localr	r
    //   156	10	8	i1	int
    //   159	200	9	i2	int
    //   177	83	10	i3	int
    // Exception table:
    //   from	to	target	type
    //   376	390	393	java/io/IOException
    //   50	158	496	java/io/IOException
    //   168	173	496	java/io/IOException
    //   184	196	496	java/io/IOException
    //   207	212	496	java/io/IOException
    //   214	235	496	java/io/IOException
    //   243	255	496	java/io/IOException
    //   266	271	496	java/io/IOException
    //   273	293	496	java/io/IOException
    //   299	322	496	java/io/IOException
    //   322	336	496	java/io/IOException
    //   339	345	496	java/io/IOException
    //   361	366	496	java/io/IOException
    //   368	376	496	java/io/IOException
    //   394	432	496	java/io/IOException
    //   436	496	496	java/io/IOException
    //   8	31	502	java/io/IOException
    //   34	50	502	java/io/IOException
    //   432	436	535	java/io/IOException
  }
  
  public static String r(e parame)
  {
    xc.f localf = new xc.f();
    while (parame.e0(localf, 1L) != -1L) {
      if (localf.I(b - 1L) == 10) {
        return localf.f0();
      }
    }
    parame = f.l("\\n not found: ");
    parame.append(localf.c0().l());
    throw new EOFException(parame.toString());
  }
  
  public static e1 x(jb.a parama)
  {
    e1 locale1 = (e1)S.get(parama);
    if (locale1 != null)
    {
      parama = locale1;
    }
    else
    {
      locale1 = e1.g;
      StringBuilder localStringBuilder = f.l("Unknown http2 error code: ");
      localStringBuilder.append(a);
      parama = locale1.g(localStringBuilder.toString());
    }
    return parama;
  }
  
  public final void a(Exception paramException)
  {
    paramException = e1.n.f(paramException);
    t(0, jb.a.d, paramException);
  }
  
  public final p.b[] b()
  {
    synchronized (k)
    {
      p.b[] arrayOfb1 = new p.b[n.size()];
      int i1 = 0;
      Iterator localIterator = n.values().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = nextl;
        synchronized (x)
        {
          localObject2 = K;
          arrayOfb1[i1] = localObject2;
          i1++;
        }
      }
      return arrayOfb2;
    }
  }
  
  public final void c(e1 parame1)
  {
    synchronized (k)
    {
      if (v != null) {
        return;
      }
      v = parame1;
      h.a(parame1);
      w();
      return;
    }
  }
  
  /* Error */
  public final gb.s d(t0 paramt0, s0 params0, eb.c paramc, eb.h[] paramArrayOfh)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 675
    //   4: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   7: aload_2
    //   8: ldc_w 677
    //   11: invokestatic 244	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   14: aload_0
    //   15: getfield 423	hb/i:u	Leb/a;
    //   18: astore 5
    //   20: new 679	gb/l3
    //   23: dup
    //   24: aload 4
    //   26: invokespecial 682	gb/l3:<init>	([Lm/e;)V
    //   29: astore 6
    //   31: aload 4
    //   33: arraylength
    //   34: istore 7
    //   36: iconst_0
    //   37: istore 8
    //   39: iload 8
    //   41: iload 7
    //   43: if_icmpge +20 -> 63
    //   46: aload 4
    //   48: iload 8
    //   50: aaload
    //   51: aload 5
    //   53: aload_2
    //   54: invokevirtual 687	eb/h:z	(Leb/a;Leb/s0;)V
    //   57: iinc 8 1
    //   60: goto -21 -> 39
    //   63: aload_0
    //   64: getfield 218	hb/i:k	Ljava/lang/Object;
    //   67: astore 4
    //   69: aload 4
    //   71: monitorenter
    //   72: new 652	hb/h
    //   75: astore 9
    //   77: aload_0
    //   78: getfield 689	hb/i:i	Lhb/b;
    //   81: astore 10
    //   83: aload_0
    //   84: getfield 691	hb/i:j	Lhb/p;
    //   87: astore 11
    //   89: aload_0
    //   90: getfield 218	hb/i:k	Ljava/lang/Object;
    //   93: astore 12
    //   95: aload_0
    //   96: getfield 253	hb/i:r	I
    //   99: istore 7
    //   101: aload_0
    //   102: getfield 257	hb/i:f	I
    //   105: istore 8
    //   107: aload_0
    //   108: getfield 248	hb/i:b	Ljava/lang/String;
    //   111: astore 13
    //   113: aload_0
    //   114: getfield 329	hb/i:c	Ljava/lang/String;
    //   117: astore 14
    //   119: aload_0
    //   120: getfield 356	hb/i:O	Lgb/r3;
    //   123: astore 15
    //   125: aload_0
    //   126: getfield 427	hb/i:N	Z
    //   129: istore 16
    //   131: aload 4
    //   133: astore 5
    //   135: aload 5
    //   137: astore 4
    //   139: aload 9
    //   141: aload_1
    //   142: aload_2
    //   143: aload 10
    //   145: aload_0
    //   146: aload 11
    //   148: aload 12
    //   150: iload 7
    //   152: iload 8
    //   154: aload 13
    //   156: aload 14
    //   158: aload 6
    //   160: aload 15
    //   162: aload_3
    //   163: iload 16
    //   165: invokespecial 694	hb/h:<init>	(Leb/t0;Leb/s0;Lhb/b;Lhb/i;Lhb/p;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lgb/l3;Lgb/r3;Leb/c;Z)V
    //   168: aload 5
    //   170: astore 4
    //   172: aload 5
    //   174: monitorexit
    //   175: aload 9
    //   177: areturn
    //   178: astore_1
    //   179: aload 4
    //   181: astore_2
    //   182: goto +7 -> 189
    //   185: astore_1
    //   186: aload 4
    //   188: astore_2
    //   189: aload_2
    //   190: astore 4
    //   192: aload_2
    //   193: monitorexit
    //   194: aload_1
    //   195: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	i
    //   0	196	1	paramt0	t0
    //   0	196	2	params0	s0
    //   0	196	3	paramc	eb.c
    //   0	196	4	paramArrayOfh	eb.h[]
    //   18	155	5	localObject1	Object
    //   29	130	6	locall3	l3
    //   34	117	7	i1	int
    //   37	116	8	i2	int
    //   75	101	9	localh	h
    //   81	63	10	localb	b
    //   87	60	11	localp	p
    //   93	56	12	localObject2	Object
    //   111	44	13	str1	String
    //   117	40	14	str2	String
    //   123	38	15	localr3	r3
    //   129	35	16	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   139	168	178	finally
    //   172	175	178	finally
    //   192	194	178	finally
    //   72	131	185	finally
  }
  
  /* Error */
  public final void e(gb.o1.c.a parama)
  {
    // Byte code:
    //   0: getstatic 700	s7/c:a	Ls7/c;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 218	hb/i:k	Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_3
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 689	hb/i:i	Lhb/b;
    //   15: astore 4
    //   17: iconst_1
    //   18: istore 5
    //   20: aload 4
    //   22: ifnull +9 -> 31
    //   25: iconst_1
    //   26: istore 6
    //   28: goto +6 -> 34
    //   31: iconst_0
    //   32: istore 6
    //   34: iload 6
    //   36: invokestatic 702	x6/b:J	(Z)V
    //   39: aload_0
    //   40: getfield 703	hb/i:y	Z
    //   43: ifeq +57 -> 100
    //   46: aload_0
    //   47: invokevirtual 706	hb/i:o	()Leb/f1;
    //   50: astore 4
    //   52: getstatic 710	gb/b1:g	Ljava/util/logging/Logger;
    //   55: astore 7
    //   57: new 712	gb/a1
    //   60: astore 7
    //   62: aload 7
    //   64: aload_1
    //   65: aload 4
    //   67: invokespecial 715	gb/a1:<init>	(Lgb/u$a;Ljava/lang/Throwable;)V
    //   70: aload_2
    //   71: aload 7
    //   73: invokevirtual 719	s7/c:execute	(Ljava/lang/Runnable;)V
    //   76: goto +17 -> 93
    //   79: astore_1
    //   80: getstatic 710	gb/b1:g	Ljava/util/logging/Logger;
    //   83: getstatic 725	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   86: ldc_w 727
    //   89: aload_1
    //   90: invokevirtual 731	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: aload_3
    //   94: monitorexit
    //   95: return
    //   96: astore_1
    //   97: goto +207 -> 304
    //   100: aload_0
    //   101: getfield 733	hb/i:x	Lgb/b1;
    //   104: astore 4
    //   106: aload 4
    //   108: ifnull +12 -> 120
    //   111: lconst_0
    //   112: lstore 8
    //   114: iconst_0
    //   115: istore 5
    //   117: goto +59 -> 176
    //   120: aload_0
    //   121: getfield 216	hb/i:d	Ljava/util/Random;
    //   124: invokevirtual 737	java/util/Random:nextLong	()J
    //   127: lstore 8
    //   129: aload_0
    //   130: getfield 306	hb/i:e	Ln7/q;
    //   133: invokeinterface 741 1 0
    //   138: checkcast 743	n7/p
    //   141: astore 7
    //   143: aload 7
    //   145: invokevirtual 745	n7/p:b	()V
    //   148: new 708	gb/b1
    //   151: astore 4
    //   153: aload 4
    //   155: lload 8
    //   157: aload 7
    //   159: invokespecial 748	gb/b1:<init>	(JLn7/p;)V
    //   162: aload_0
    //   163: aload 4
    //   165: putfield 733	hb/i:x	Lgb/b1;
    //   168: aload_0
    //   169: getfield 356	hb/i:O	Lgb/r3;
    //   172: invokevirtual 344	java/lang/Object:getClass	()Ljava/lang/Class;
    //   175: pop
    //   176: iload 5
    //   178: ifeq +20 -> 198
    //   181: aload_0
    //   182: getfield 689	hb/i:i	Lhb/b;
    //   185: lload 8
    //   187: bipush 32
    //   189: lushr
    //   190: l2i
    //   191: lload 8
    //   193: l2i
    //   194: iconst_0
    //   195: invokevirtual 753	hb/b:e	(IIZ)V
    //   198: aload_3
    //   199: monitorexit
    //   200: aload 4
    //   202: monitorenter
    //   203: aload 4
    //   205: getfield 755	gb/b1:d	Z
    //   208: ifne +22 -> 230
    //   211: aload 4
    //   213: getfield 758	gb/b1:c	Ljava/util/LinkedHashMap;
    //   216: aload_1
    //   217: aload_2
    //   218: invokeinterface 759 3 0
    //   223: pop
    //   224: aload 4
    //   226: monitorexit
    //   227: goto +70 -> 297
    //   230: aload 4
    //   232: getfield 762	gb/b1:e	Ljava/lang/Throwable;
    //   235: astore 7
    //   237: aload 7
    //   239: ifnull +19 -> 258
    //   242: new 712	gb/a1
    //   245: astore_3
    //   246: aload_3
    //   247: aload_1
    //   248: aload 7
    //   250: invokespecial 715	gb/a1:<init>	(Lgb/u$a;Ljava/lang/Throwable;)V
    //   253: aload_3
    //   254: astore_1
    //   255: goto +17 -> 272
    //   258: new 764	gb/z0
    //   261: dup
    //   262: aload_1
    //   263: aload 4
    //   265: getfield 766	gb/b1:f	J
    //   268: invokespecial 769	gb/z0:<init>	(Lgb/u$a;J)V
    //   271: astore_1
    //   272: aload 4
    //   274: monitorexit
    //   275: aload_2
    //   276: aload_1
    //   277: invokevirtual 719	s7/c:execute	(Ljava/lang/Runnable;)V
    //   280: goto +17 -> 297
    //   283: astore_1
    //   284: getstatic 710	gb/b1:g	Ljava/util/logging/Logger;
    //   287: getstatic 725	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   290: ldc_w 727
    //   293: aload_1
    //   294: invokevirtual 731	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   297: return
    //   298: astore_1
    //   299: aload 4
    //   301: monitorexit
    //   302: aload_1
    //   303: athrow
    //   304: aload_3
    //   305: monitorexit
    //   306: aload_1
    //   307: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	308	0	this	i
    //   0	308	1	parama	gb.o1.c.a
    //   3	273	2	localc	s7.c
    //   8	297	3	localObject1	Object
    //   15	285	4	localObject2	Object
    //   18	159	5	i1	int
    //   26	9	6	bool	boolean
    //   55	194	7	localObject3	Object
    //   112	80	8	l1	long
    // Exception table:
    //   from	to	target	type
    //   70	76	79	finally
    //   11	17	96	finally
    //   34	70	96	finally
    //   80	93	96	finally
    //   93	95	96	finally
    //   100	106	96	finally
    //   120	176	96	finally
    //   181	198	96	finally
    //   198	200	96	finally
    //   304	306	96	finally
    //   275	280	283	finally
    //   203	227	298	finally
    //   230	237	298	finally
    //   242	253	298	finally
    //   258	272	298	finally
    //   272	275	298	finally
    //   299	302	298	finally
  }
  
  public final f0 f()
  {
    return l;
  }
  
  public final Runnable g(h2.a arg1)
  {
    h = ???;
    if (H)
    {
      ??? = new o1(new o1.c(this), q, I, J, K);
      G = ???;
      try
      {
        if (d) {
          ???.b();
        }
      }
      finally
      {
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
    }
    final a locala = new a(p, this);
    Object localObject4 = new a.d(locala, g.a(new r(locala)));
    synchronized (k)
    {
      b localb = new hb/b;
      localb.<init>(this, (a.d)localObject4);
      i = localb;
      localObject4 = new hb/p;
      ((p)localObject4).<init>(this, localb);
      j = ((p)localObject4);
      ??? = new CountDownLatch(1);
      p.execute(new b(???, locala));
      try
      {
        s();
        ???.countDown();
        p.execute(new c());
        return null;
      }
      finally
      {
        ???.countDown();
      }
    }
  }
  
  public final eb.a getAttributes()
  {
    return u;
  }
  
  public final void h(e1 parame1)
  {
    c(parame1);
    synchronized (k)
    {
      Iterator localIterator = n.entrySet().iterator();
      Object localObject2;
      Object localObject3;
      Object localObject4;
      while (localIterator.hasNext())
      {
        localObject2 = (Map.Entry)localIterator.next();
        localIterator.remove();
        localObject3 = getValuel;
        localObject4 = new eb/s0;
        ((s0)localObject4).<init>();
        ((a.b)localObject3).i((s0)localObject4, parame1, false);
        q((h)((Map.Entry)localObject2).getValue());
      }
      localIterator = E.iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (h)localIterator.next();
        localObject4 = l;
        localObject2 = t.a.d;
        s0 locals0 = new eb/s0;
        locals0.<init>();
        ((a.b)localObject4).j(parame1, (t.a)localObject2, true, locals0);
        q((h)localObject3);
      }
      E.clear();
      w();
      return;
    }
  }
  
  public final kb.b k(InetSocketAddress paramInetSocketAddress, String paramString1, String paramString2)
  {
    a.a locala = new a.a();
    a = "https";
    Object localObject1 = paramInetSocketAddress.getHostName();
    int i2;
    int i3;
    int i4;
    if (localObject1 != null)
    {
      int i1 = ((String)localObject1).length();
      i2 = 0;
      i3 = 0;
      i4 = 0;
      int i5;
      int i6;
      int i7;
      int i8;
      while (i4 < i1) {
        if (((String)localObject1).charAt(i4) != '%')
        {
          i4++;
        }
        else
        {
          localObject2 = new xc.f();
          ((xc.f)localObject2).G0(0, i4, (String)localObject1);
          while (i4 < i1)
          {
            i5 = ((String)localObject1).codePointAt(i4);
            if (i5 == 37)
            {
              i6 = i4 + 2;
              if (i6 < i1)
              {
                i7 = kb.a.a(((String)localObject1).charAt(i4 + 1));
                i8 = kb.a.a(((String)localObject1).charAt(i6));
                if ((i7 != -1) && (i8 != -1))
                {
                  ((xc.f)localObject2).B0((i7 << 4) + i8);
                  i4 = i6;
                  break label188;
                }
              }
            }
            ((xc.f)localObject2).I0(i5);
            label188:
            i4 += Character.charCount(i5);
          }
          localObject3 = ((xc.f)localObject2).k0();
          break label221;
        }
      }
      localObject3 = ((String)localObject1).substring(0, i1);
      label221:
      if ((((String)localObject3).startsWith("[")) && (((String)localObject3).endsWith("]")))
      {
        int i9 = ((String)localObject3).length() - 1;
        byte[] arrayOfByte = new byte[16];
        i6 = 1;
        i4 = -1;
        i2 = i4;
        while (i6 < i9)
        {
          if (i3 == 16) {
            break label788;
          }
          do
          {
            do
            {
              i1 = i6 + 2;
              if ((i1 > i9) || (!((String)localObject3).regionMatches(i6, "::", 0, 2))) {
                break;
              }
            } while (i4 != -1);
            i3 += 2;
            localObject2 = localObject1;
            i4 = i3;
            if (i1 == i9)
            {
              localObject1 = localObject2;
              break;
            }
            i2 = i1;
            break label644;
            i1 = i6;
            if (i3 == 0) {
              break label640;
            }
            if (((String)localObject3).regionMatches(i6, ":", 0, 1))
            {
              i1 = i6 + 1;
              break label640;
            }
          } while (!((String)localObject3).regionMatches(i6, ".", 0, 1));
          i7 = i3 - 2;
          i5 = i7;
          i6 = i2;
          while (i6 < i9)
          {
            if (i5 != 16)
            {
              i2 = i6;
              if (i5 != i7) {
                if (((String)localObject3).charAt(i6) != '.') {
                  break label617;
                }
              }
            }
            else
            {
              i2 = i6 + 1;
            }
            i8 = 0;
            i6 = i2;
            while (i6 < i9)
            {
              i1 = i4;
              int i10 = ((String)localObject3).charAt(i6);
              localObject2 = localObject1;
              if ((i10 < 48) || (i10 > 57)) {
                break;
              }
              if ((i8 == 0) && (i2 != i6))
              {
                i4 = i1;
                localObject1 = localObject2;
                break label617;
              }
              i8 = i8 * 10 + i10 - 48;
              if (i8 > 255)
              {
                i4 = i1;
                localObject1 = localObject2;
                break label617;
              }
              i6++;
              i4 = i1;
              localObject1 = localObject2;
            }
            if (i6 - i2 == 0) {
              break label617;
            }
            arrayOfByte[i5] = ((byte)(byte)i8);
            i5++;
          }
          if (i5 != i7 + 4) {
            label617:
            i2 = 0;
          } else {
            i2 = 1;
          }
          if (i2 == 0) {
            break label788;
          }
          i3 += 2;
          break;
          label640:
          i2 = i1;
          label644:
          localObject2 = localObject1;
          i1 = 0;
          for (i6 = i2; i6 < i9; i6++)
          {
            i5 = kb.a.a(((String)localObject3).charAt(i6));
            if (i5 == -1) {
              break;
            }
            i1 = (i1 << 4) + i5;
          }
          i5 = i6 - i2;
          localObject1 = localObject2;
          if (i5 == 0) {
            break label788;
          }
          if (i5 > 4)
          {
            localObject1 = localObject2;
            break label788;
          }
          i5 = i3 + 1;
          arrayOfByte[i3] = ((byte)(byte)(i1 >>> 8 & 0xFF));
          i3 = i5 + 1;
          arrayOfByte[i5] = ((byte)(byte)(i1 & 0xFF));
          localObject1 = localObject2;
        }
        if (i3 != 16)
        {
          if (i4 == -1)
          {
            label788:
            localObject2 = null;
            break label843;
          }
          i2 = i3 - i4;
          System.arraycopy(arrayOfByte, i4, arrayOfByte, 16 - i2, i2);
          Arrays.fill(arrayOfByte, i4, 16 - i3 + i4, (byte)0);
        }
        try
        {
          localObject2 = InetAddress.getByAddress(arrayOfByte);
          label843:
          i5 = 0;
          if (localObject2 != null)
          {
            localObject2 = ((InetAddress)localObject2).getAddress();
            if (localObject2.length == 16)
            {
              i2 = -1;
              i4 = 0;
              for (i3 = i4; i4 < localObject2.length; i3 = i1)
              {
                for (i6 = i4; (i6 < 16) && (localObject2[i6] == 0) && (localObject2[(i6 + 1)] == 0); i6 += 2) {}
                i8 = i6 - i4;
                i1 = i3;
                if (i8 > i3)
                {
                  i1 = i8;
                  i2 = i4;
                }
                i4 = i6 + 2;
              }
              localObject3 = new xc.f();
              i4 = i5;
              while (i4 < localObject2.length) {
                if (i4 == i2)
                {
                  ((xc.f)localObject3).B0(58);
                  i6 = i4 + i3;
                  i4 = i6;
                  if (i6 == 16)
                  {
                    ((xc.f)localObject3).B0(58);
                    i4 = i6;
                  }
                }
                else
                {
                  if (i4 > 0) {
                    ((xc.f)localObject3).B0(58);
                  }
                  ((xc.f)localObject3).C0((localObject2[i4] & 0xFF) << 8 | localObject2[(i4 + 1)] & 0xFF);
                  i4 += 2;
                }
              }
              localObject2 = ((xc.f)localObject3).k0();
              localObject3 = localObject1;
              break label1219;
            }
            throw new AssertionError();
          }
        }
        catch (UnknownHostException paramInetSocketAddress)
        {
          throw new AssertionError();
        }
      }
    }
    try
    {
      localObject2 = IDN.toASCII((String)localObject3).toLowerCase(Locale.US);
      if (!((String)localObject2).isEmpty())
      {
        for (i4 = 0;; i4++)
        {
          i3 = i2;
          if (i4 >= ((String)localObject2).length()) {
            break label1203;
          }
          i3 = ((String)localObject2).charAt(i4);
          if ((i3 <= 31) || (i3 >= 127)) {
            break;
          }
          i3 = " #%/:?@[\\]".indexOf(i3);
          if (i3 != -1) {
            break;
          }
        }
        i3 = 1;
        label1203:
        localObject3 = localObject1;
        if (i3 == 0) {
          break label1219;
        }
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    Object localObject2 = null;
    Object localObject3 = localObject1;
    label1219:
    if (localObject2 != null)
    {
      b = ((String)localObject2);
      i4 = paramInetSocketAddress.getPort();
      if ((i4 > 0) && (i4 <= 65535))
      {
        c = i4;
        if (a != null)
        {
          if (b != null)
          {
            localObject2 = new kb.a(locala);
            paramInetSocketAddress = new kb.b.a();
            a = ((kb.a)localObject2);
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append(a);
            ((StringBuilder)localObject1).append(":");
            ((StringBuilder)localObject1).append(b);
            paramInetSocketAddress.a("Host", ((StringBuilder)localObject1).toString());
            paramInetSocketAddress.a("User-Agent", c);
            if ((paramString1 != null) && (paramString2 != null)) {
              try
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                ((StringBuilder)localObject1).append(paramString1);
                ((StringBuilder)localObject1).append(":");
                ((StringBuilder)localObject1).append(paramString2);
                paramString1 = xc.i.o(((StringBuilder)localObject1).toString().getBytes("ISO-8859-1")).f();
                paramString2 = new java/lang/StringBuilder;
                paramString2.<init>();
                paramString2.append("Basic ");
                paramString2.append(paramString1);
                paramString1 = paramString2.toString();
                paramInetSocketAddress.a("Proxy-Authorization", paramString1);
              }
              catch (UnsupportedEncodingException paramInetSocketAddress)
              {
                throw new AssertionError();
              }
            }
            if (a != null) {
              return new kb.b(paramInetSocketAddress);
            }
            throw new IllegalStateException("url == null");
          }
          throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
      }
      throw new IllegalArgumentException(f.h("unexpected port: ", i4));
    }
    throw new IllegalArgumentException(g.d("unexpected host: ", (String)localObject3));
    throw new IllegalArgumentException("host == null");
  }
  
  public final void l(int paramInt, e1 parame1, t.a parama, boolean paramBoolean, jb.a parama1, s0 params0)
  {
    synchronized (k)
    {
      h localh = (h)n.remove(Integer.valueOf(paramInt));
      if (localh != null)
      {
        if (parama1 != null) {
          i.R(paramInt, jb.a.q);
        }
        if (parame1 != null)
        {
          parama1 = l;
          if (params0 == null) {
            params0 = new s0();
          }
          parama1.j(parame1, parama, paramBoolean, params0);
        }
        if (!u())
        {
          w();
          q(localh);
        }
      }
      return;
    }
  }
  
  public final String m()
  {
    URI localURI = v0.a(b);
    if (localURI.getHost() != null) {
      return localURI.getHost();
    }
    return b;
  }
  
  public final int n()
  {
    URI localURI = v0.a(b);
    if (localURI.getPort() != -1) {
      return localURI.getPort();
    }
    return a.getPort();
  }
  
  public final f1 o()
  {
    synchronized (k)
    {
      e1 locale1 = v;
      if (locale1 != null)
      {
        localf1 = new eb/f1;
        localf1.<init>(locale1);
        return localf1;
      }
      locale1 = e1.n.g("Connection closed");
      f1 localf1 = new eb/f1;
      localf1.<init>(locale1);
      return localf1;
    }
  }
  
  public final boolean p(int paramInt)
  {
    synchronized (k)
    {
      int i1 = m;
      boolean bool = true;
      if ((paramInt >= i1) || ((paramInt & 0x1) != 1)) {
        bool = false;
      }
      return bool;
    }
  }
  
  public final void q(h paramh)
  {
    if ((z) && (E.isEmpty()) && (n.isEmpty()))
    {
      z = false;
      o1 localo1 = G;
      if (localo1 != null) {
        try
        {
          if (!d)
          {
            int i1 = e;
            if ((i1 == 2) || (i1 == 3)) {
              e = 1;
            }
            if (e == 4) {
              e = 5;
            }
          }
        }
        finally {}
      }
    }
    if (c) {
      P.c(paramh, false);
    }
  }
  
  public final void s()
  {
    synchronized (k)
    {
      i.w();
      c4.x localx = new c4/x;
      localx.<init>();
      localx.d(7, f);
      i.a0(localx);
      int i1 = f;
      if (i1 > 65535) {
        i.d(0, i1 - 65535);
      }
      return;
    }
  }
  
  public final void t(int paramInt, jb.a parama, e1 parame1)
  {
    synchronized (k)
    {
      if (v == null)
      {
        v = parame1;
        h.a(parame1);
      }
      if ((parama != null) && (!w))
      {
        w = true;
        i.o0(parama, new byte[0]);
      }
      Object localObject2 = n.entrySet().iterator();
      Object localObject3;
      t.a locala;
      Object localObject4;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        if (((Integer)((Map.Entry)localObject3).getKey()).intValue() > paramInt)
        {
          ((Iterator)localObject2).remove();
          parama = getValuel;
          locala = t.a.b;
          localObject4 = new eb/s0;
          ((s0)localObject4).<init>();
          parama.j(parame1, locala, false, (s0)localObject4);
          q((h)((Map.Entry)localObject3).getValue());
        }
      }
      parama = E.iterator();
      while (parama.hasNext())
      {
        localObject2 = (h)parama.next();
        localObject4 = l;
        locala = t.a.d;
        localObject3 = new eb/s0;
        ((s0)localObject3).<init>();
        ((a.b)localObject4).j(parame1, locala, true, (s0)localObject3);
        q((h)localObject2);
      }
      E.clear();
      w();
      return;
    }
  }
  
  public final String toString()
  {
    g.a locala = n7.g.b(this);
    locala.b("logId", l.c);
    locala.a(a, "address");
    return locala.toString();
  }
  
  public final boolean u()
  {
    for (boolean bool = false; (!E.isEmpty()) && (n.size() < D); bool = true) {
      v((h)E.poll());
    }
    return bool;
  }
  
  public final void v(h paramh)
  {
    int i1 = l.L;
    int i2 = 1;
    boolean bool;
    if (i1 == -1) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "StreamId already assigned");
    n.put(Integer.valueOf(m), paramh);
    if (!z)
    {
      z = true;
      localObject1 = G;
      if (localObject1 != null) {
        ((o1)localObject1).b();
      }
    }
    if (c) {
      P.c(paramh, true);
    }
    Object localObject1 = l;
    int i3 = m;
    if (L == -1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      L = i3;
      ??? = G;
      K = new p.b((p)???, i3, c, (h.b)localObject1);
      h.b localb = M.l;
      if (j != null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.J(bool);
      synchronized (b)
      {
        x6.b.I(f ^ true, "Already allocated");
        f = true;
        synchronized (b)
        {
          synchronized (b)
          {
            if ((f) && (e < 32768) && (!g)) {
              i1 = i2;
            } else {
              i1 = 0;
            }
            if (i1 != 0) {
              j.c();
            }
            ??? = c;
            ???.getClass();
            a.a();
            if (I)
            {
              F.A(M.o, L, y);
              ??? = M.j.a;
              i2 = ???.length;
              for (i1 = 0; i1 < i2; i1++) {
                ((eb.h)???[i1]).y();
              }
              y = null;
              ??? = z;
              if (b > 0L) {
                G.a(A, K, (xc.f)???, B);
              }
              I = false;
            }
            localObject1 = h.a;
            if (((localObject1 != t0.c.a) && (localObject1 != t0.c.b)) || (o)) {
              i.flush();
            }
            i1 = m;
            if (i1 >= 2147483645)
            {
              m = Integer.MAX_VALUE;
              t(Integer.MAX_VALUE, jb.a.b, e1.n.g("Stream ids exhausted"));
            }
            else
            {
              m = (i1 + 2);
            }
            return;
          }
        }
      }
    }
    throw new IllegalStateException(m0.X("the stream has been started with id %s", new Object[] { Integer.valueOf(i3) }));
  }
  
  /* Error */
  public final void w()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 664	hb/i:v	Leb/e1;
    //   4: ifnull +302 -> 306
    //   7: aload_0
    //   8: getfield 223	hb/i:n	Ljava/util/HashMap;
    //   11: invokevirtual 1055	java/util/HashMap:isEmpty	()Z
    //   14: ifeq +292 -> 306
    //   17: aload_0
    //   18: getfield 230	hb/i:E	Ljava/util/LinkedList;
    //   21: invokeinterface 1054 1 0
    //   26: ifne +6 -> 32
    //   29: goto +277 -> 306
    //   32: aload_0
    //   33: getfield 703	hb/i:y	Z
    //   36: ifeq +4 -> 40
    //   39: return
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield 703	hb/i:y	Z
    //   45: aload_0
    //   46: getfield 791	hb/i:G	Lgb/o1;
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +69 -> 120
    //   54: aload_1
    //   55: monitorenter
    //   56: aload_1
    //   57: getfield 1057	gb/o1:e	I
    //   60: bipush 6
    //   62: if_icmpeq +48 -> 110
    //   65: aload_1
    //   66: bipush 6
    //   68: putfield 1057	gb/o1:e	I
    //   71: aload_1
    //   72: getfield 1213	gb/o1:f	Ljava/util/concurrent/ScheduledFuture;
    //   75: astore_2
    //   76: aload_2
    //   77: ifnull +11 -> 88
    //   80: aload_2
    //   81: iconst_0
    //   82: invokeinterface 1219 2 0
    //   87: pop
    //   88: aload_1
    //   89: getfield 1221	gb/o1:g	Ljava/util/concurrent/ScheduledFuture;
    //   92: astore_2
    //   93: aload_2
    //   94: ifnull +16 -> 110
    //   97: aload_2
    //   98: iconst_0
    //   99: invokeinterface 1219 2 0
    //   104: pop
    //   105: aload_1
    //   106: aconst_null
    //   107: putfield 1221	gb/o1:g	Ljava/util/concurrent/ScheduledFuture;
    //   110: aload_1
    //   111: monitorexit
    //   112: goto +8 -> 120
    //   115: astore_2
    //   116: aload_1
    //   117: monitorexit
    //   118: aload_2
    //   119: athrow
    //   120: aload_0
    //   121: getfield 733	hb/i:x	Lgb/b1;
    //   124: astore_2
    //   125: aload_2
    //   126: ifnull +148 -> 274
    //   129: aload_0
    //   130: invokevirtual 706	hb/i:o	()Leb/f1;
    //   133: astore_1
    //   134: aload_2
    //   135: monitorenter
    //   136: aload_2
    //   137: getfield 755	gb/b1:d	Z
    //   140: ifeq +8 -> 148
    //   143: aload_2
    //   144: monitorexit
    //   145: goto +116 -> 261
    //   148: aload_2
    //   149: iconst_1
    //   150: putfield 755	gb/b1:d	Z
    //   153: aload_2
    //   154: aload_1
    //   155: putfield 762	gb/b1:e	Ljava/lang/Throwable;
    //   158: aload_2
    //   159: getfield 758	gb/b1:c	Ljava/util/LinkedHashMap;
    //   162: astore_3
    //   163: aload_2
    //   164: aconst_null
    //   165: putfield 758	gb/b1:c	Ljava/util/LinkedHashMap;
    //   168: aload_2
    //   169: monitorexit
    //   170: aload_3
    //   171: invokevirtual 1224	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   174: invokeinterface 394 1 0
    //   179: astore_2
    //   180: aload_2
    //   181: invokeinterface 400 1 0
    //   186: ifeq +75 -> 261
    //   189: aload_2
    //   190: invokeinterface 404 1 0
    //   195: checkcast 406	java/util/Map$Entry
    //   198: astore 4
    //   200: aload 4
    //   202: invokeinterface 409 1 0
    //   207: checkcast 1226	gb/u$a
    //   210: astore_3
    //   211: aload 4
    //   213: invokeinterface 418 1 0
    //   218: checkcast 1228	java/util/concurrent/Executor
    //   221: astore 4
    //   223: new 712	gb/a1
    //   226: dup
    //   227: aload_3
    //   228: aload_1
    //   229: invokespecial 715	gb/a1:<init>	(Lgb/u$a;Ljava/lang/Throwable;)V
    //   232: astore_3
    //   233: aload 4
    //   235: aload_3
    //   236: invokeinterface 1229 2 0
    //   241: goto -61 -> 180
    //   244: astore_3
    //   245: getstatic 710	gb/b1:g	Ljava/util/logging/Logger;
    //   248: getstatic 725	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   251: ldc_w 727
    //   254: aload_3
    //   255: invokevirtual 731	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   258: goto -78 -> 180
    //   261: aload_0
    //   262: aconst_null
    //   263: putfield 733	hb/i:x	Lgb/b1;
    //   266: goto +8 -> 274
    //   269: astore_1
    //   270: aload_2
    //   271: monitorexit
    //   272: aload_1
    //   273: athrow
    //   274: aload_0
    //   275: getfield 1081	hb/i:w	Z
    //   278: ifne +21 -> 299
    //   281: aload_0
    //   282: iconst_1
    //   283: putfield 1081	hb/i:w	Z
    //   286: aload_0
    //   287: getfield 689	hb/i:i	Lhb/b;
    //   290: getstatic 112	jb/a:b	Ljb/a;
    //   293: iconst_0
    //   294: newarray <illegal type>
    //   296: invokevirtual 1085	hb/b:o0	(Ljb/a;[B)V
    //   299: aload_0
    //   300: getfield 689	hb/i:i	Lhb/b;
    //   303: invokevirtual 1230	hb/b:close	()V
    //   306: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	this	i
    //   49	180	1	localObject1	Object
    //   269	4	1	localObject2	Object
    //   75	23	2	localScheduledFuture	java.util.concurrent.ScheduledFuture
    //   115	4	2	localObject3	Object
    //   124	147	2	localObject4	Object
    //   162	74	3	localObject5	Object
    //   244	11	3	localThrowable	Throwable
    //   198	36	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   56	76	115	finally
    //   80	88	115	finally
    //   88	93	115	finally
    //   97	110	115	finally
    //   233	241	244	finally
    //   136	145	269	finally
    //   148	170	269	finally
    //   270	272	269	finally
  }
  
  public final class a
    extends c1<h>
  {
    public a() {}
    
    public final void a()
    {
      h.e(true);
    }
    
    public final void b()
    {
      h.e(false);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(CountDownLatch paramCountDownLatch, a parama) {}
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 25	hb/i$b:a	Ljava/util/concurrent/CountDownLatch;
      //   4: invokevirtual 43	java/util/concurrent/CountDownLatch:await	()V
      //   7: goto +10 -> 17
      //   10: astore_1
      //   11: invokestatic 49	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   14: invokevirtual 52	java/lang/Thread:interrupt	()V
      //   17: new 54	xc/s
      //   20: dup
      //   21: new 13	hb/i$b$a
      //   24: dup
      //   25: invokespecial 55	hb/i$b$a:<init>	()V
      //   28: invokespecial 58	xc/s:<init>	(Lxc/y;)V
      //   31: astore_2
      //   32: aconst_null
      //   33: astore_3
      //   34: aload_2
      //   35: astore_1
      //   36: aload_0
      //   37: getfield 23	hb/i$b:c	Lhb/i;
      //   40: astore 4
      //   42: aload_2
      //   43: astore_1
      //   44: aload 4
      //   46: getfield 62	hb/i:Q	Leb/a0;
      //   49: astore 5
      //   51: aload 5
      //   53: ifnonnull +42 -> 95
      //   56: aload_2
      //   57: astore_1
      //   58: aload 4
      //   60: getfield 66	hb/i:A	Ljavax/net/SocketFactory;
      //   63: aload 4
      //   65: getfield 69	hb/i:a	Ljava/net/InetSocketAddress;
      //   68: invokevirtual 75	java/net/InetSocketAddress:getAddress	()Ljava/net/InetAddress;
      //   71: aload_0
      //   72: getfield 23	hb/i$b:c	Lhb/i;
      //   75: getfield 69	hb/i:a	Ljava/net/InetSocketAddress;
      //   78: invokevirtual 79	java/net/InetSocketAddress:getPort	()I
      //   81: invokevirtual 85	javax/net/SocketFactory:createSocket	(Ljava/net/InetAddress;I)Ljava/net/Socket;
      //   84: astore 4
      //   86: aload 4
      //   88: astore_1
      //   89: aload_1
      //   90: astore 4
      //   92: goto +57 -> 149
      //   95: aload_2
      //   96: astore_1
      //   97: aload 5
      //   99: getfield 90	eb/a0:a	Ljava/net/SocketAddress;
      //   102: astore 6
      //   104: aload_2
      //   105: astore_1
      //   106: aload 6
      //   108: instanceof 71
      //   111: ifeq +364 -> 475
      //   114: aload_2
      //   115: astore_1
      //   116: aload 4
      //   118: aload 5
      //   120: getfield 92	eb/a0:b	Ljava/net/InetSocketAddress;
      //   123: aload 6
      //   125: checkcast 71	java/net/InetSocketAddress
      //   128: aload 5
      //   130: getfield 95	eb/a0:c	Ljava/lang/String;
      //   133: aload 5
      //   135: getfield 98	eb/a0:d	Ljava/lang/String;
      //   138: invokestatic 102	hb/i:j	(Lhb/i;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
      //   141: astore 4
      //   143: aload 4
      //   145: astore_1
      //   146: goto -57 -> 89
      //   149: aload_2
      //   150: astore_1
      //   151: aload_0
      //   152: getfield 23	hb/i$b:c	Lhb/i;
      //   155: astore 7
      //   157: aload_2
      //   158: astore_1
      //   159: aload 7
      //   161: getfield 106	hb/i:B	Ljavax/net/ssl/SSLSocketFactory;
      //   164: astore 6
      //   166: aload 4
      //   168: astore 5
      //   170: aload 6
      //   172: ifnull +46 -> 218
      //   175: aload_2
      //   176: astore_1
      //   177: aload 6
      //   179: aload 7
      //   181: getfield 110	hb/i:C	Ljavax/net/ssl/HostnameVerifier;
      //   184: aload 4
      //   186: aload 7
      //   188: invokevirtual 114	hb/i:m	()Ljava/lang/String;
      //   191: aload_0
      //   192: getfield 23	hb/i$b:c	Lhb/i;
      //   195: invokevirtual 117	hb/i:n	()I
      //   198: aload_0
      //   199: getfield 23	hb/i$b:c	Lhb/i;
      //   202: getfield 121	hb/i:F	Lib/b;
      //   205: invokestatic 126	hb/n:a	(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Socket;Ljava/lang/String;ILib/b;)Ljavax/net/ssl/SSLSocket;
      //   208: astore 5
      //   210: aload_2
      //   211: astore_1
      //   212: aload 5
      //   214: invokevirtual 132	javax/net/ssl/SSLSocket:getSession	()Ljavax/net/ssl/SSLSession;
      //   217: astore_3
      //   218: aload_2
      //   219: astore_1
      //   220: aload 5
      //   222: iconst_1
      //   223: invokevirtual 138	java/net/Socket:setTcpNoDelay	(Z)V
      //   226: aload_2
      //   227: astore_1
      //   228: aload 5
      //   230: invokestatic 144	p2/m0:b0	(Ljava/net/Socket;)Lxc/e;
      //   233: astore 6
      //   235: aload_2
      //   236: astore_1
      //   237: new 54	xc/s
      //   240: astore 4
      //   242: aload_2
      //   243: astore_1
      //   244: aload 4
      //   246: aload 6
      //   248: invokespecial 58	xc/s:<init>	(Lxc/y;)V
      //   251: aload_0
      //   252: getfield 27	hb/i$b:b	Lhb/a;
      //   255: aload 5
      //   257: invokestatic 148	p2/m0:a0	(Ljava/net/Socket;)Lxc/d;
      //   260: aload 5
      //   262: invokevirtual 154	hb/a:f	(Lxc/d;Ljava/net/Socket;)V
      //   265: aload_0
      //   266: getfield 23	hb/i$b:c	Lhb/i;
      //   269: astore 6
      //   271: aload 6
      //   273: getfield 158	hb/i:u	Leb/a;
      //   276: astore_1
      //   277: aload_1
      //   278: invokevirtual 162	java/lang/Object:getClass	()Ljava/lang/Class;
      //   281: pop
      //   282: new 164	eb/a$a
      //   285: astore_2
      //   286: aload_2
      //   287: aload_1
      //   288: invokespecial 167	eb/a$a:<init>	(Leb/a;)V
      //   291: aload_2
      //   292: getstatic 172	eb/z:a	Leb/a$b;
      //   295: aload 5
      //   297: invokevirtual 176	java/net/Socket:getRemoteSocketAddress	()Ljava/net/SocketAddress;
      //   300: invokevirtual 179	eb/a$a:c	(Leb/a$b;Ljava/lang/Object;)V
      //   303: aload_2
      //   304: getstatic 181	eb/z:b	Leb/a$b;
      //   307: aload 5
      //   309: invokevirtual 184	java/net/Socket:getLocalSocketAddress	()Ljava/net/SocketAddress;
      //   312: invokevirtual 179	eb/a$a:c	(Leb/a$b;Ljava/lang/Object;)V
      //   315: aload_2
      //   316: getstatic 186	eb/z:c	Leb/a$b;
      //   319: aload_3
      //   320: invokevirtual 179	eb/a$a:c	(Leb/a$b;Ljava/lang/Object;)V
      //   323: getstatic 189	gb/u0:a	Leb/a$b;
      //   326: astore 5
      //   328: aload_3
      //   329: ifnonnull +10 -> 339
      //   332: getstatic 194	eb/a1:a	Leb/a1;
      //   335: astore_1
      //   336: goto +7 -> 343
      //   339: getstatic 196	eb/a1:b	Leb/a1;
      //   342: astore_1
      //   343: aload_2
      //   344: aload 5
      //   346: aload_1
      //   347: invokevirtual 179	eb/a$a:c	(Leb/a$b;Ljava/lang/Object;)V
      //   350: aload 6
      //   352: aload_2
      //   353: invokevirtual 199	eb/a$a:a	()Leb/a;
      //   356: putfield 158	hb/i:u	Leb/a;
      //   359: aload_0
      //   360: getfield 23	hb/i$b:c	Lhb/i;
      //   363: astore_1
      //   364: aload_1
      //   365: new 201	hb/i$d
      //   368: dup
      //   369: aload_1
      //   370: aload_1
      //   371: getfield 204	hb/i:g	Ljb/h;
      //   374: aload 4
      //   376: invokeinterface 209 2 0
      //   381: invokespecial 212	hb/i$d:<init>	(Lhb/i;Ljb/b;)V
      //   384: putfield 216	hb/i:t	Lhb/i$d;
      //   387: aload_0
      //   388: getfield 23	hb/i$b:c	Lhb/i;
      //   391: getfield 220	hb/i:k	Ljava/lang/Object;
      //   394: astore_1
      //   395: aload_1
      //   396: monitorenter
      //   397: aload_0
      //   398: getfield 23	hb/i$b:c	Lhb/i;
      //   401: invokevirtual 162	java/lang/Object:getClass	()Ljava/lang/Class;
      //   404: pop
      //   405: aload_3
      //   406: ifnull +20 -> 426
      //   409: aload_0
      //   410: getfield 23	hb/i$b:c	Lhb/i;
      //   413: astore_2
      //   414: new 222	eb/c0$a
      //   417: aload_3
      //   418: invokespecial 225	eb/c0$a:<init>	(Ljavax/net/ssl/SSLSession;)V
      //   421: aload_2
      //   422: invokevirtual 162	java/lang/Object:getClass	()Ljava/lang/Class;
      //   425: pop
      //   426: aload_1
      //   427: monitorexit
      //   428: return
      //   429: astore_2
      //   430: aload_1
      //   431: monitorexit
      //   432: aload_2
      //   433: athrow
      //   434: astore_2
      //   435: aload 4
      //   437: astore_1
      //   438: goto +205 -> 643
      //   441: astore_1
      //   442: aload 4
      //   444: astore_2
      //   445: aload_1
      //   446: astore 4
      //   448: goto +109 -> 557
      //   451: astore_1
      //   452: aload 4
      //   454: astore_2
      //   455: aload_1
      //   456: astore 4
      //   458: goto +140 -> 598
      //   461: astore_2
      //   462: goto +181 -> 643
      //   465: astore 4
      //   467: goto +90 -> 557
      //   470: astore 4
      //   472: goto +126 -> 598
      //   475: aload_2
      //   476: astore_1
      //   477: getstatic 230	eb/e1:m	Leb/e1;
      //   480: astore_3
      //   481: aload_2
      //   482: astore_1
      //   483: new 232	java/lang/StringBuilder
      //   486: astore 4
      //   488: aload_2
      //   489: astore_1
      //   490: aload 4
      //   492: invokespecial 233	java/lang/StringBuilder:<init>	()V
      //   495: aload_2
      //   496: astore_1
      //   497: aload 4
      //   499: ldc -21
      //   501: invokevirtual 239	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   504: pop
      //   505: aload_2
      //   506: astore_1
      //   507: aload 4
      //   509: aload_0
      //   510: getfield 23	hb/i$b:c	Lhb/i;
      //   513: getfield 62	hb/i:Q	Leb/a0;
      //   516: getfield 90	eb/a0:a	Ljava/net/SocketAddress;
      //   519: invokevirtual 162	java/lang/Object:getClass	()Ljava/lang/Class;
      //   522: invokevirtual 242	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   525: pop
      //   526: aload_2
      //   527: astore_1
      //   528: aload_3
      //   529: aload 4
      //   531: invokevirtual 245	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   534: invokevirtual 248	eb/e1:g	(Ljava/lang/String;)Leb/e1;
      //   537: astore 4
      //   539: aload_2
      //   540: astore_1
      //   541: new 36	eb/f1
      //   544: astore_3
      //   545: aload_2
      //   546: astore_1
      //   547: aload_3
      //   548: aload 4
      //   550: invokespecial 251	eb/f1:<init>	(Leb/e1;)V
      //   553: aload_2
      //   554: astore_1
      //   555: aload_3
      //   556: athrow
      //   557: aload_2
      //   558: astore_1
      //   559: aload_0
      //   560: getfield 23	hb/i$b:c	Lhb/i;
      //   563: aload 4
      //   565: invokevirtual 254	hb/i:a	(Ljava/lang/Exception;)V
      //   568: aload_0
      //   569: getfield 23	hb/i$b:c	Lhb/i;
      //   572: astore_1
      //   573: new 201	hb/i$d
      //   576: dup
      //   577: aload_1
      //   578: aload_1
      //   579: getfield 204	hb/i:g	Ljb/h;
      //   582: aload_2
      //   583: invokeinterface 209 2 0
      //   588: invokespecial 212	hb/i$d:<init>	(Lhb/i;Ljb/b;)V
      //   591: astore_2
      //   592: aload_1
      //   593: aload_2
      //   594: putfield 216	hb/i:t	Lhb/i$d;
      //   597: return
      //   598: aload_2
      //   599: astore_1
      //   600: aload_0
      //   601: getfield 23	hb/i$b:c	Lhb/i;
      //   604: iconst_0
      //   605: getstatic 259	jb/a:d	Ljb/a;
      //   608: aload 4
      //   610: getfield 261	eb/f1:a	Leb/e1;
      //   613: invokevirtual 264	hb/i:t	(ILjb/a;Leb/e1;)V
      //   616: aload_0
      //   617: getfield 23	hb/i$b:c	Lhb/i;
      //   620: astore_1
      //   621: new 201	hb/i$d
      //   624: dup
      //   625: aload_1
      //   626: aload_1
      //   627: getfield 204	hb/i:g	Ljb/h;
      //   630: aload_2
      //   631: invokeinterface 209 2 0
      //   636: invokespecial 212	hb/i$d:<init>	(Lhb/i;Ljb/b;)V
      //   639: astore_2
      //   640: goto -48 -> 592
      //   643: aload_0
      //   644: getfield 23	hb/i$b:c	Lhb/i;
      //   647: astore 4
      //   649: aload 4
      //   651: new 201	hb/i$d
      //   654: dup
      //   655: aload 4
      //   657: aload 4
      //   659: getfield 204	hb/i:g	Ljb/h;
      //   662: aload_1
      //   663: invokeinterface 209 2 0
      //   668: invokespecial 212	hb/i$d:<init>	(Lhb/i;Ljb/b;)V
      //   671: putfield 216	hb/i:t	Lhb/i$d;
      //   674: aload_2
      //   675: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	676	0	this	b
      //   10	1	1	localInterruptedException	InterruptedException
      //   35	403	1	localObject1	Object
      //   441	5	1	localException1	Exception
      //   451	5	1	localf11	f1
      //   476	187	1	localObject2	Object
      //   31	391	2	localObject3	Object
      //   429	4	2	localObject4	Object
      //   434	1	2	localObject5	Object
      //   444	11	2	localObject6	Object
      //   461	122	2	locals	xc.s
      //   591	84	2	locald	i.d
      //   33	523	3	localObject7	Object
      //   40	417	4	localObject8	Object
      //   465	1	4	localException2	Exception
      //   470	1	4	localf12	f1
      //   486	172	4	localObject9	Object
      //   49	296	5	localObject10	Object
      //   102	249	6	localObject11	Object
      //   155	32	7	locali	i
      // Exception table:
      //   from	to	target	type
      //   0	7	10	java/lang/InterruptedException
      //   397	405	429	finally
      //   409	426	429	finally
      //   426	428	429	finally
      //   430	432	429	finally
      //   251	328	434	finally
      //   332	336	434	finally
      //   339	343	434	finally
      //   343	359	434	finally
      //   251	328	441	java/lang/Exception
      //   332	336	441	java/lang/Exception
      //   339	343	441	java/lang/Exception
      //   343	359	441	java/lang/Exception
      //   251	328	451	eb/f1
      //   332	336	451	eb/f1
      //   339	343	451	eb/f1
      //   343	359	451	eb/f1
      //   36	42	461	finally
      //   44	51	461	finally
      //   58	86	461	finally
      //   97	104	461	finally
      //   106	114	461	finally
      //   116	143	461	finally
      //   151	157	461	finally
      //   159	166	461	finally
      //   177	210	461	finally
      //   212	218	461	finally
      //   220	226	461	finally
      //   228	235	461	finally
      //   237	242	461	finally
      //   244	251	461	finally
      //   477	481	461	finally
      //   483	488	461	finally
      //   490	495	461	finally
      //   497	505	461	finally
      //   507	526	461	finally
      //   528	539	461	finally
      //   541	545	461	finally
      //   547	553	461	finally
      //   555	557	461	finally
      //   559	568	461	finally
      //   600	616	461	finally
      //   36	42	465	java/lang/Exception
      //   44	51	465	java/lang/Exception
      //   58	86	465	java/lang/Exception
      //   97	104	465	java/lang/Exception
      //   106	114	465	java/lang/Exception
      //   116	143	465	java/lang/Exception
      //   151	157	465	java/lang/Exception
      //   159	166	465	java/lang/Exception
      //   177	210	465	java/lang/Exception
      //   212	218	465	java/lang/Exception
      //   220	226	465	java/lang/Exception
      //   228	235	465	java/lang/Exception
      //   237	242	465	java/lang/Exception
      //   244	251	465	java/lang/Exception
      //   477	481	465	java/lang/Exception
      //   483	488	465	java/lang/Exception
      //   490	495	465	java/lang/Exception
      //   497	505	465	java/lang/Exception
      //   507	526	465	java/lang/Exception
      //   528	539	465	java/lang/Exception
      //   541	545	465	java/lang/Exception
      //   547	553	465	java/lang/Exception
      //   555	557	465	java/lang/Exception
      //   36	42	470	eb/f1
      //   44	51	470	eb/f1
      //   58	86	470	eb/f1
      //   97	104	470	eb/f1
      //   106	114	470	eb/f1
      //   116	143	470	eb/f1
      //   151	157	470	eb/f1
      //   159	166	470	eb/f1
      //   177	210	470	eb/f1
      //   212	218	470	eb/f1
      //   220	226	470	eb/f1
      //   228	235	470	eb/f1
      //   237	242	470	eb/f1
      //   244	251	470	eb/f1
      //   477	481	470	eb/f1
      //   483	488	470	eb/f1
      //   490	495	470	eb/f1
      //   497	505	470	eb/f1
      //   507	526	470	eb/f1
      //   528	539	470	eb/f1
      //   541	545	470	eb/f1
      //   547	553	470	eb/f1
      //   555	557	470	eb/f1
    }
    
    public final class a
      implements y
    {
      public final z c()
      {
        return z.d;
      }
      
      public final void close() {}
      
      public final long e0(xc.f paramf, long paramLong)
      {
        return -1L;
      }
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      getClass();
      ??? = i.this;
      o.execute(t);
      synchronized (k)
      {
        i locali = i.this;
        D = Integer.MAX_VALUE;
        locali.u();
        getClass();
        return;
      }
    }
  }
  
  public final class d
    implements jb.b.a, Runnable
  {
    public final j a = new j(Level.FINE);
    public jb.b b;
    public boolean c = true;
    
    public d(jb.b paramb)
    {
      b = paramb;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: invokestatic 54	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   3: invokevirtual 58	java/lang/Thread:getName	()Ljava/lang/String;
      //   6: astore_1
      //   7: invokestatic 54	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   10: ldc 60
      //   12: invokevirtual 64	java/lang/Thread:setName	(Ljava/lang/String;)V
      //   15: aload_0
      //   16: getfield 42	hb/i$d:b	Ljb/b;
      //   19: checkcast 66	jb/f$c
      //   22: aload_0
      //   23: invokevirtual 70	jb/f$c:f	(Ljb/b$a;)Z
      //   26: ifeq +22 -> 48
      //   29: aload_0
      //   30: getfield 22	hb/i$d:d	Lhb/i;
      //   33: getfield 74	hb/i:G	Lgb/o1;
      //   36: astore_2
      //   37: aload_2
      //   38: ifnull -23 -> 15
      //   41: aload_2
      //   42: invokevirtual 78	gb/o1:a	()V
      //   45: goto -30 -> 15
      //   48: aload_0
      //   49: getfield 22	hb/i$d:d	Lhb/i;
      //   52: getfield 82	hb/i:k	Ljava/lang/Object;
      //   55: astore_2
      //   56: aload_2
      //   57: monitorenter
      //   58: aload_0
      //   59: getfield 22	hb/i$d:d	Lhb/i;
      //   62: getfield 86	hb/i:v	Leb/e1;
      //   65: astore_3
      //   66: aload_2
      //   67: monitorexit
      //   68: aload_3
      //   69: astore_2
      //   70: aload_3
      //   71: ifnonnull +12 -> 83
      //   74: getstatic 91	eb/e1:n	Leb/e1;
      //   77: ldc 93
      //   79: invokevirtual 97	eb/e1:g	(Ljava/lang/String;)Leb/e1;
      //   82: astore_2
      //   83: aload_0
      //   84: getfield 22	hb/i$d:d	Lhb/i;
      //   87: iconst_0
      //   88: getstatic 102	jb/a:d	Ljb/a;
      //   91: aload_2
      //   92: invokevirtual 106	hb/i:t	(ILjb/a;Leb/e1;)V
      //   95: aload_0
      //   96: getfield 42	hb/i$d:b	Ljb/b;
      //   99: checkcast 66	jb/f$c
      //   102: invokevirtual 109	jb/f$c:close	()V
      //   105: goto +113 -> 218
      //   108: astore_2
      //   109: ldc 111
      //   111: aload_2
      //   112: invokevirtual 116	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   115: invokevirtual 122	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   118: ifeq +6 -> 124
      //   121: goto +97 -> 218
      //   124: aload_2
      //   125: athrow
      //   126: astore_2
      //   127: goto +79 -> 206
      //   130: astore_3
      //   131: aload_2
      //   132: monitorexit
      //   133: aload_3
      //   134: athrow
      //   135: astore 4
      //   137: aload_0
      //   138: getfield 22	hb/i$d:d	Lhb/i;
      //   141: astore_2
      //   142: getstatic 124	jb/a:c	Ljb/a;
      //   145: astore_3
      //   146: getstatic 127	eb/e1:m	Leb/e1;
      //   149: ldc -127
      //   151: invokevirtual 97	eb/e1:g	(Ljava/lang/String;)Leb/e1;
      //   154: aload 4
      //   156: invokevirtual 132	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
      //   159: astore 4
      //   161: getstatic 136	hb/i:S	Ljava/util/Map;
      //   164: astore 5
      //   166: aload_2
      //   167: iconst_0
      //   168: aload_3
      //   169: aload 4
      //   171: invokevirtual 106	hb/i:t	(ILjb/a;Leb/e1;)V
      //   174: aload_0
      //   175: getfield 42	hb/i$d:b	Ljb/b;
      //   178: checkcast 66	jb/f$c
      //   181: invokevirtual 109	jb/f$c:close	()V
      //   184: goto +34 -> 218
      //   187: astore_2
      //   188: ldc 111
      //   190: aload_2
      //   191: invokevirtual 116	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   194: invokevirtual 122	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   197: ifeq +6 -> 203
      //   200: goto +18 -> 218
      //   203: aload_2
      //   204: athrow
      //   205: astore_2
      //   206: getstatic 140	hb/i:T	Ljava/util/logging/Logger;
      //   209: getstatic 143	java/util/logging/Level:INFO	Ljava/util/logging/Level;
      //   212: ldc -111
      //   214: aload_2
      //   215: invokevirtual 151	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   218: aload_0
      //   219: getfield 22	hb/i$d:d	Lhb/i;
      //   222: getfield 155	hb/i:h	Lgb/h2$a;
      //   225: invokeinterface 159 1 0
      //   230: invokestatic 54	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   233: aload_1
      //   234: invokevirtual 64	java/lang/Thread:setName	(Ljava/lang/String;)V
      //   237: return
      //   238: astore_2
      //   239: aload_0
      //   240: getfield 42	hb/i$d:b	Ljb/b;
      //   243: checkcast 66	jb/f$c
      //   246: invokevirtual 109	jb/f$c:close	()V
      //   249: goto +31 -> 280
      //   252: astore_3
      //   253: ldc 111
      //   255: aload_3
      //   256: invokevirtual 116	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   259: invokevirtual 122	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   262: ifne +18 -> 280
      //   265: aload_3
      //   266: athrow
      //   267: astore_3
      //   268: getstatic 140	hb/i:T	Ljava/util/logging/Logger;
      //   271: getstatic 143	java/util/logging/Level:INFO	Ljava/util/logging/Level;
      //   274: ldc -111
      //   276: aload_3
      //   277: invokevirtual 151	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   280: aload_0
      //   281: getfield 22	hb/i$d:d	Lhb/i;
      //   284: getfield 155	hb/i:h	Lgb/h2$a;
      //   287: invokeinterface 159 1 0
      //   292: invokestatic 54	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   295: aload_1
      //   296: invokevirtual 64	java/lang/Thread:setName	(Ljava/lang/String;)V
      //   299: aload_2
      //   300: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	301	0	this	d
      //   6	290	1	str	String
      //   108	17	2	localRuntimeException1	RuntimeException
      //   126	6	2	localIOException1	java.io.IOException
      //   141	26	2	locali	i
      //   187	17	2	localRuntimeException2	RuntimeException
      //   205	10	2	localIOException2	java.io.IOException
      //   238	62	2	localObject2	Object
      //   65	6	3	locale11	e1
      //   130	4	3	localObject3	Object
      //   145	24	3	locala	jb.a
      //   252	14	3	localRuntimeException3	RuntimeException
      //   267	10	3	localIOException3	java.io.IOException
      //   135	20	4	localThrowable	Throwable
      //   159	11	4	locale12	e1
      //   164	1	5	localMap	Map
      // Exception table:
      //   from	to	target	type
      //   95	105	108	java/lang/RuntimeException
      //   95	105	126	java/io/IOException
      //   58	68	130	finally
      //   131	133	130	finally
      //   15	37	135	finally
      //   41	45	135	finally
      //   48	58	135	finally
      //   74	83	135	finally
      //   83	95	135	finally
      //   133	135	135	finally
      //   174	184	187	java/lang/RuntimeException
      //   174	184	205	java/io/IOException
      //   137	174	238	finally
      //   239	249	252	java/lang/RuntimeException
      //   239	249	267	java/io/IOException
    }
  }
}

/* Location:
 * Qualified Name:     hb.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */