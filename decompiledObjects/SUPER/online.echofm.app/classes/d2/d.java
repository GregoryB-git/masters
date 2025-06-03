package d2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import e2.a.a;
import e2.j;
import e2.k;
import e2.k.a;
import e2.k.b;
import e2.l;
import e2.l.a;
import e2.m.a;
import e2.o;
import e2.o.a;
import e2.o.b;
import e2.o.c;
import e2.p;
import f2.h;
import f2.i;
import f2.i.a;
import g2.f;
import g2.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;

public final class d
  implements g2.m
{
  public final j4.a a = j.b();
  public final ConnectivityManager b;
  public final Context c;
  public final URL d;
  public final p2.a e;
  public final p2.a f;
  public final int g;
  
  public d(Context paramContext, p2.a parama1, p2.a parama2)
  {
    this(paramContext, parama1, parama2, 130000);
  }
  
  public d(Context paramContext, p2.a parama1, p2.a parama2, int paramInt)
  {
    c = paramContext;
    b = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
    d = n(a.c);
    e = parama2;
    f = parama1;
    g = paramInt;
  }
  
  public static int f(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null) {}
    int i;
    for (paramNetworkInfo = o.b.p;; paramNetworkInfo = o.b.J)
    {
      return paramNetworkInfo.e();
      i = paramNetworkInfo.getSubtype();
      if (i != -1) {
        break;
      }
    }
    if (o.b.c(i) == null) {
      i = 0;
    }
    return i;
  }
  
  public static int g(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null) {
      return o.c.H.e();
    }
    return paramNetworkInfo.getType();
  }
  
  public static int h(Context paramContext)
  {
    try
    {
      int i = getPackageManagergetPackageInfogetPackageName0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      j2.a.d("CctTransportBackend", "Unable to find version code for package", paramContext);
    }
    return -1;
  }
  
  public static TelephonyManager j(Context paramContext)
  {
    return (TelephonyManager)paramContext.getSystemService("phone");
  }
  
  public static long k()
  {
    Calendar.getInstance();
    return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
  }
  
  public static InputStream m(InputStream paramInputStream, String paramString)
  {
    if ("gzip".equals(paramString)) {
      return new GZIPInputStream(paramInputStream);
    }
    return paramInputStream;
  }
  
  public static URL n(String paramString)
  {
    try
    {
      URL localURL = new URL(paramString);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invalid url: ");
      localStringBuilder.append(paramString);
      throw new IllegalArgumentException(localStringBuilder.toString(), localMalformedURLException);
    }
  }
  
  public i a(i parami)
  {
    NetworkInfo localNetworkInfo = b.getActiveNetworkInfo();
    return parami.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(localNetworkInfo)).a("mobile-subtype", f(localNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(c).getSimOperator()).c("application_build", Integer.toString(h(c))).d();
  }
  
  public g b(f paramf)
  {
    j localj = i(paramf);
    URL localURL = d;
    Object localObject1 = paramf.c();
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = localURL;
    if (localObject1 != null) {
      try
      {
        localObject1 = a.c(paramf.c());
        paramf = (f)localObject3;
        if (((a)localObject1).e() != null) {
          paramf = ((a)localObject1).e();
        }
        localObject4 = localURL;
        localObject2 = paramf;
        if (((a)localObject1).f() != null)
        {
          localObject4 = n(((a)localObject1).f());
          localObject2 = paramf;
        }
      }
      catch (IllegalArgumentException paramf)
      {
        return g.a();
      }
    }
    try
    {
      paramf = new d2/d$a;
      paramf.<init>((URL)localObject4, localj, (String)localObject2);
      localObject2 = new d2/b;
      ((b)localObject2).<init>(this);
      localObject4 = new d2/c;
      ((c)localObject4).<init>();
      paramf = (b)k2.b.a(5, paramf, (k2.a)localObject2, (k2.c)localObject4);
      i = a;
      if (i == 200) {
        return g.e(c);
      }
    }
    catch (IOException paramf)
    {
      int i;
      break label206;
      if ((i < 500) && (i != 404))
      {
        if (i == 400) {
          return g.d();
        }
        return g.a();
      }
      paramf = g.f();
      return paramf;
      label206:
      j2.a.d("CctTransportBackend", "Could not make request to the backend", paramf);
    }
    return g.f();
  }
  
  /* Error */
  public final b e(a parama)
  {
    // Byte code:
    //   0: ldc -121
    //   2: ldc_w 390
    //   5: aload_1
    //   6: getfield 392	d2/d$a:a	Ljava/net/URL;
    //   9: invokestatic 394	j2/a:f	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   12: aload_1
    //   13: getfield 392	d2/d$a:a	Ljava/net/URL;
    //   16: invokevirtual 398	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 400	java/net/HttpURLConnection
    //   22: astore_2
    //   23: aload_2
    //   24: sipush 30000
    //   27: invokevirtual 406	java/net/URLConnection:setConnectTimeout	(I)V
    //   30: aload_2
    //   31: aload_0
    //   32: getfield 71	d2/d:g	I
    //   35: invokevirtual 409	java/net/URLConnection:setReadTimeout	(I)V
    //   38: aload_2
    //   39: iconst_1
    //   40: invokevirtual 413	java/net/URLConnection:setDoOutput	(Z)V
    //   43: aload_2
    //   44: iconst_0
    //   45: invokevirtual 416	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   48: aload_2
    //   49: ldc_w 418
    //   52: invokevirtual 421	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   55: aload_2
    //   56: ldc_w 423
    //   59: ldc_w 425
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: ldc_w 427
    //   71: aastore
    //   72: invokestatic 431	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   75: invokevirtual 435	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_2
    //   79: ldc_w 437
    //   82: ldc -73
    //   84: invokevirtual 435	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload_2
    //   88: ldc_w 439
    //   91: ldc_w 441
    //   94: invokevirtual 435	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload_2
    //   98: ldc_w 443
    //   101: ldc -73
    //   103: invokevirtual 435	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_1
    //   107: getfield 444	d2/d$a:c	Ljava/lang/String;
    //   110: astore_3
    //   111: aload_3
    //   112: ifnull +11 -> 123
    //   115: aload_2
    //   116: ldc_w 446
    //   119: aload_3
    //   120: invokevirtual 435	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload_2
    //   124: invokevirtual 450	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   127: astore_3
    //   128: new 452	java/util/zip/GZIPOutputStream
    //   131: astore 4
    //   133: aload 4
    //   135: aload_3
    //   136: invokespecial 455	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   139: aload_0
    //   140: getfield 40	d2/d:a	Lj4/a;
    //   143: astore 5
    //   145: aload_1
    //   146: getfield 458	d2/d$a:b	Le2/j;
    //   149: astore 6
    //   151: new 460	java/io/BufferedWriter
    //   154: astore 7
    //   156: new 462	java/io/OutputStreamWriter
    //   159: astore_1
    //   160: aload_1
    //   161: aload 4
    //   163: invokespecial 463	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   166: aload 7
    //   168: aload_1
    //   169: invokespecial 466	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   172: aload 5
    //   174: aload 6
    //   176: aload 7
    //   178: invokeinterface 471 3 0
    //   183: aload 4
    //   185: invokevirtual 476	java/io/OutputStream:close	()V
    //   188: aload_3
    //   189: ifnull +26 -> 215
    //   192: aload_3
    //   193: invokevirtual 476	java/io/OutputStream:close	()V
    //   196: goto +19 -> 215
    //   199: astore_1
    //   200: goto +300 -> 500
    //   203: astore_1
    //   204: goto +296 -> 500
    //   207: astore_1
    //   208: goto +314 -> 522
    //   211: astore_1
    //   212: goto +310 -> 522
    //   215: aload_2
    //   216: invokevirtual 479	java/net/HttpURLConnection:getResponseCode	()I
    //   219: istore 8
    //   221: ldc -121
    //   223: ldc_w 481
    //   226: iload 8
    //   228: invokestatic 485	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   231: invokestatic 394	j2/a:f	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   234: ldc -121
    //   236: ldc_w 487
    //   239: aload_2
    //   240: ldc_w 439
    //   243: invokevirtual 491	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   246: invokestatic 176	j2/a:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   249: ldc -121
    //   251: ldc_w 493
    //   254: aload_2
    //   255: ldc_w 437
    //   258: invokevirtual 491	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   261: invokestatic 176	j2/a:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   264: iload 8
    //   266: sipush 302
    //   269: if_icmpeq +166 -> 435
    //   272: iload 8
    //   274: sipush 301
    //   277: if_icmpeq +158 -> 435
    //   280: iload 8
    //   282: sipush 307
    //   285: if_icmpne +6 -> 291
    //   288: goto +147 -> 435
    //   291: iload 8
    //   293: sipush 200
    //   296: if_icmpeq +15 -> 311
    //   299: new 11	d2/d$b
    //   302: dup
    //   303: iload 8
    //   305: aconst_null
    //   306: lconst_0
    //   307: invokespecial 496	d2/d$b:<init>	(ILjava/net/URL;J)V
    //   310: areturn
    //   311: aload_2
    //   312: invokevirtual 500	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   315: astore_1
    //   316: aload_1
    //   317: aload_2
    //   318: ldc_w 437
    //   321: invokevirtual 491	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   324: invokestatic 502	d2/d:m	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    //   327: astore_3
    //   328: new 504	java/io/BufferedReader
    //   331: astore 4
    //   333: new 506	java/io/InputStreamReader
    //   336: astore_2
    //   337: aload_2
    //   338: aload_3
    //   339: invokespecial 507	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   342: aload 4
    //   344: aload_2
    //   345: invokespecial 510	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   348: aload 4
    //   350: invokestatic 515	e2/n:b	(Ljava/io/Reader;)Le2/n;
    //   353: invokevirtual 517	e2/n:c	()J
    //   356: lstore 9
    //   358: new 11	d2/d$b
    //   361: astore_2
    //   362: aload_2
    //   363: iload 8
    //   365: aconst_null
    //   366: lload 9
    //   368: invokespecial 496	d2/d$b:<init>	(ILjava/net/URL;J)V
    //   371: aload_3
    //   372: ifnull +14 -> 386
    //   375: aload_3
    //   376: invokevirtual 520	java/io/InputStream:close	()V
    //   379: goto +7 -> 386
    //   382: astore_3
    //   383: goto +33 -> 416
    //   386: aload_1
    //   387: ifnull +7 -> 394
    //   390: aload_1
    //   391: invokevirtual 520	java/io/InputStream:close	()V
    //   394: aload_2
    //   395: areturn
    //   396: astore_2
    //   397: aload_3
    //   398: ifnull +16 -> 414
    //   401: aload_3
    //   402: invokevirtual 520	java/io/InputStream:close	()V
    //   405: goto +9 -> 414
    //   408: astore_3
    //   409: aload_2
    //   410: aload_3
    //   411: invokevirtual 526	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   414: aload_2
    //   415: athrow
    //   416: aload_1
    //   417: ifnull +16 -> 433
    //   420: aload_1
    //   421: invokevirtual 520	java/io/InputStream:close	()V
    //   424: goto +9 -> 433
    //   427: astore_1
    //   428: aload_3
    //   429: aload_1
    //   430: invokevirtual 526	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   433: aload_3
    //   434: athrow
    //   435: new 11	d2/d$b
    //   438: dup
    //   439: iload 8
    //   441: new 198	java/net/URL
    //   444: dup
    //   445: aload_2
    //   446: ldc_w 528
    //   449: invokevirtual 491	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   452: invokespecial 201	java/net/URL:<init>	(Ljava/lang/String;)V
    //   455: lconst_0
    //   456: invokespecial 496	d2/d$b:<init>	(ILjava/net/URL;J)V
    //   459: areturn
    //   460: astore_1
    //   461: goto +20 -> 481
    //   464: astore_1
    //   465: aload 4
    //   467: invokevirtual 476	java/io/OutputStream:close	()V
    //   470: goto +9 -> 479
    //   473: astore_2
    //   474: aload_1
    //   475: aload_2
    //   476: invokevirtual 526	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   479: aload_1
    //   480: athrow
    //   481: aload_3
    //   482: ifnull +16 -> 498
    //   485: aload_3
    //   486: invokevirtual 476	java/io/OutputStream:close	()V
    //   489: goto +9 -> 498
    //   492: astore_3
    //   493: aload_1
    //   494: aload_3
    //   495: invokevirtual 526	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   498: aload_1
    //   499: athrow
    //   500: ldc -121
    //   502: ldc_w 530
    //   505: aload_1
    //   506: invokestatic 142	j2/a:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   509: new 11	d2/d$b
    //   512: dup
    //   513: sipush 400
    //   516: aconst_null
    //   517: lconst_0
    //   518: invokespecial 496	d2/d$b:<init>	(ILjava/net/URL;J)V
    //   521: areturn
    //   522: ldc -121
    //   524: ldc_w 532
    //   527: aload_1
    //   528: invokestatic 142	j2/a:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   531: new 11	d2/d$b
    //   534: dup
    //   535: sipush 500
    //   538: aconst_null
    //   539: lconst_0
    //   540: invokespecial 496	d2/d$b:<init>	(ILjava/net/URL;J)V
    //   543: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	544	0	this	d
    //   0	544	1	parama	a
    //   22	373	2	localObject1	Object
    //   396	50	2	localObject2	Object
    //   473	3	2	localThrowable1	Throwable
    //   110	266	3	localObject3	Object
    //   382	20	3	localObject4	Object
    //   408	78	3	localThrowable2	Throwable
    //   492	3	3	localThrowable3	Throwable
    //   131	335	4	localObject5	Object
    //   143	30	5	locala	j4.a
    //   149	26	6	localj	j
    //   154	23	7	localBufferedWriter	java.io.BufferedWriter
    //   219	221	8	i	int
    //   356	11	9	l	long
    // Exception table:
    //   from	to	target	type
    //   123	128	199	java/io/IOException
    //   192	196	199	java/io/IOException
    //   493	498	199	java/io/IOException
    //   498	500	199	java/io/IOException
    //   123	128	203	j4/b
    //   192	196	203	j4/b
    //   493	498	203	j4/b
    //   498	500	203	j4/b
    //   123	128	207	java/net/UnknownHostException
    //   192	196	207	java/net/UnknownHostException
    //   493	498	207	java/net/UnknownHostException
    //   498	500	207	java/net/UnknownHostException
    //   123	128	211	java/net/ConnectException
    //   192	196	211	java/net/ConnectException
    //   493	498	211	java/net/ConnectException
    //   498	500	211	java/net/ConnectException
    //   316	328	382	finally
    //   375	379	382	finally
    //   409	414	382	finally
    //   414	416	382	finally
    //   328	371	396	finally
    //   401	405	408	finally
    //   420	424	427	finally
    //   128	139	460	finally
    //   183	188	460	finally
    //   474	479	460	finally
    //   479	481	460	finally
    //   139	183	464	finally
    //   465	470	473	finally
    //   485	489	492	finally
  }
  
  public final j i(f paramf)
  {
    Object localObject1 = new HashMap();
    Object localObject2 = paramf.b().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      i locali1 = (i)((Iterator)localObject2).next();
      localObject3 = locali1.j();
      if (!((HashMap)localObject1).containsKey(localObject3))
      {
        paramf = new ArrayList();
        paramf.add(locali1);
        ((HashMap)localObject1).put(localObject3, paramf);
      }
      else
      {
        ((List)((HashMap)localObject1).get(localObject3)).add(locali1);
      }
    }
    Object localObject3 = new ArrayList();
    localObject1 = ((HashMap)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramf = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (i)((List)paramf.getValue()).get(0);
      localObject2 = e2.m.a().f(p.p).g(f.a()).h(e.a()).b(k.a().c(k.b.q).b(e2.a.a().m(Integer.valueOf(((i)localObject2).g("sdk-version"))).j(((i)localObject2).b("model")).f(((i)localObject2).b("hardware")).d(((i)localObject2).b("device")).l(((i)localObject2).b("product")).k(((i)localObject2).b("os-uild")).h(((i)localObject2).b("manufacturer")).e(((i)localObject2).b("fingerprint")).c(((i)localObject2).b("country")).g(((i)localObject2).b("locale")).i(((i)localObject2).b("mcc_mnc")).b(((i)localObject2).b("application_build")).a()).a());
      try
      {
        ((m.a)localObject2).i(Integer.parseInt((String)paramf.getKey()));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        ((m.a)localObject2).j((String)paramf.getKey());
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = ((List)paramf.getValue()).iterator();
      while (localIterator.hasNext())
      {
        i locali2 = (i)localIterator.next();
        h localh = locali2.e();
        paramf = localh.b();
        if (paramf.equals(c2.b.b("proto")))
        {
          paramf = l.j(localh.a());
        }
        else
        {
          if (!paramf.equals(c2.b.b("json"))) {
            break label592;
          }
          paramf = l.i(new String(localh.a(), Charset.forName("UTF-8")));
        }
        paramf.c(locali2.f()).d(locali2.k()).h(locali2.h("tz-offset")).e(o.a().c(o.c.c(locali2.g("net-type"))).b(o.b.c(locali2.g("mobile-subtype"))).a());
        if (locali2.d() != null) {
          paramf.b(locali2.d());
        }
        localArrayList.add(paramf.a());
        continue;
        label592:
        j2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", paramf);
      }
      ((m.a)localObject2).c(localArrayList);
      ((List)localObject3).add(((m.a)localObject2).a());
    }
    return j.a((List)localObject3);
  }
  
  public static final class a
  {
    public final URL a;
    public final j b;
    public final String c;
    
    public a(URL paramURL, j paramj, String paramString)
    {
      a = paramURL;
      b = paramj;
      c = paramString;
    }
    
    public a a(URL paramURL)
    {
      return new a(paramURL, b, c);
    }
  }
  
  public static final class b
  {
    public final int a;
    public final URL b;
    public final long c;
    
    public b(int paramInt, URL paramURL, long paramLong)
    {
      a = paramInt;
      b = paramURL;
      c = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     d2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */