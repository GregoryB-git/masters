package T0;

import X2.v;
import X2.v.a;
import d0.x;
import g0.M;
import g0.y;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class h
  extends O0.c
{
  public static final a b = new g();
  public final a a;
  
  public h()
  {
    this(null);
  }
  
  public h(a parama)
  {
    a = parama;
  }
  
  public static int B(g0.z paramz, int paramInt)
  {
    byte[] arrayOfByte = paramz.e();
    int i = paramz.f();
    int j = i;
    for (;;)
    {
      int k = j + 1;
      if (k >= i + paramInt) {
        break;
      }
      int m = paramInt;
      if ((arrayOfByte[j] & 0xFF) == 255)
      {
        m = paramInt;
        if (arrayOfByte[k] == 0)
        {
          System.arraycopy(arrayOfByte, j + 2, arrayOfByte, k, paramInt - (j - i) - 2);
          m = paramInt - 1;
        }
      }
      j = k;
      paramInt = m;
    }
    return paramInt;
  }
  
  public static boolean C(g0.z paramz, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramz.f();
    for (;;)
    {
      int k;
      try
      {
        j = paramz.a();
        k = 1;
        if (j < paramInt2) {
          break;
        }
        if (paramInt1 >= 3)
        {
          j = paramz.p();
          l1 = paramz.I();
          m = paramz.M();
        }
      }
      finally
      {
        break label360;
      }
      int j = paramz.J();
      int n = paramz.J();
      long l1 = n;
      int m = 0;
      if ((j == 0) && (l1 == 0L) && (m == 0))
      {
        paramz.T(i);
        return true;
      }
      long l2 = l1;
      if (paramInt1 == 4)
      {
        l2 = l1;
        if (!paramBoolean)
        {
          if ((0x808080 & l1) != 0L)
          {
            paramz.T(i);
            return false;
          }
          l2 = (l1 >> 24 & 0xFF) << 21 | l1 & 0xFF | (l1 >> 8 & 0xFF) << 7 | (l1 >> 16 & 0xFF) << 14;
        }
      }
      if (paramInt1 == 4)
      {
        if ((m & 0x40) != 0) {
          j = 1;
        } else {
          j = 0;
        }
        n = j;
        if ((m & 0x1) != 0)
        {
          n = k;
          break label283;
        }
      }
      do
      {
        m = 0;
        j = n;
        n = m;
        break label283;
        if (paramInt1 != 3) {
          break;
        }
        if ((m & 0x20) != 0) {
          j = 1;
        } else {
          j = 0;
        }
        n = j;
      } while ((m & 0x80) == 0);
      n = k;
      break label283;
      j = 0;
      n = j;
      label283:
      m = j;
      if (n != 0) {
        m = j + 4;
      }
      if (l2 < m)
      {
        paramz.T(i);
        return false;
      }
      j = paramz.a();
      if (j < l2)
      {
        paramz.T(i);
        return false;
      }
      j = (int)l2;
      paramz.U(j);
    }
    paramz.T(i);
    return true;
    label360:
    paramz.T(i);
    throw ((Throwable)localObject);
  }
  
  public static byte[] d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {
      return M.f;
    }
    return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static a f(g0.z paramz, int paramInt1, int paramInt2)
  {
    int i = paramz.G();
    Charset localCharset = w(i);
    int j = paramInt1 - 1;
    byte[] arrayOfByte = new byte[j];
    paramz.l(arrayOfByte, 0, j);
    Object localObject;
    if (paramInt2 == 2)
    {
      paramz = new StringBuilder();
      paramz.append("image/");
      paramz.append(W2.c.e(new String(arrayOfByte, 0, 3, W2.e.b)));
      localObject = paramz.toString();
      paramz = (g0.z)localObject;
      if ("image/jpg".equals(localObject)) {
        paramz = "image/jpeg";
      }
      paramInt1 = 2;
    }
    else
    {
      paramInt1 = z(arrayOfByte, 0);
      paramz = W2.c.e(new String(arrayOfByte, 0, paramInt1, W2.e.b));
      if (paramz.indexOf('/') == -1)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("image/");
        ((StringBuilder)localObject).append(paramz);
        paramz = ((StringBuilder)localObject).toString();
      }
    }
    paramInt2 = arrayOfByte[(paramInt1 + 1)];
    paramInt1 += 2;
    int k = y(arrayOfByte, paramInt1, i);
    return new a(paramz, new String(arrayOfByte, paramInt1, k - paramInt1, localCharset), paramInt2 & 0xFF, d(arrayOfByte, k + v(i), j));
  }
  
  public static b g(g0.z paramz, int paramInt, String paramString)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    return new b(paramString, arrayOfByte);
  }
  
  public static c h(g0.z paramz, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a parama)
  {
    int i = paramz.f();
    int j = z(paramz.e(), i);
    String str = new String(paramz.e(), i, j - i, W2.e.b);
    paramz.T(j + 1);
    int k = paramz.p();
    j = paramz.p();
    long l1 = paramz.I();
    if (l1 == 4294967295L) {
      l1 = -1L;
    }
    long l2 = paramz.I();
    if (l2 == 4294967295L) {
      l2 = -1L;
    }
    ArrayList localArrayList = new ArrayList();
    while (paramz.f() < i + paramInt1)
    {
      i locali = k(paramInt2, paramz, paramBoolean, paramInt3, parama);
      if (locali != null) {
        localArrayList.add(locali);
      }
    }
    return new c(str, k, j, l1, l2, (i[])localArrayList.toArray(new i[0]));
  }
  
  public static d i(g0.z paramz, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a parama)
  {
    int i = paramz.f();
    int j = z(paramz.e(), i);
    String str = new String(paramz.e(), i, j - i, W2.e.b);
    paramz.T(j + 1);
    j = paramz.G();
    boolean bool1;
    if ((j & 0x2) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if ((j & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int k = paramz.G();
    String[] arrayOfString = new String[k];
    for (j = 0; j < k; j++)
    {
      int m = paramz.f();
      int n = z(paramz.e(), m);
      arrayOfString[j] = new String(paramz.e(), m, n - m, W2.e.b);
      paramz.T(n + 1);
    }
    ArrayList localArrayList = new ArrayList();
    while (paramz.f() < i + paramInt1)
    {
      i locali = k(paramInt2, paramz, paramBoolean, paramInt3, parama);
      if (locali != null) {
        localArrayList.add(locali);
      }
    }
    return new d(str, bool1, bool2, arrayOfString, (i[])localArrayList.toArray(new i[0]));
  }
  
  public static e j(g0.z paramz, int paramInt)
  {
    if (paramInt < 4) {
      return null;
    }
    int i = paramz.G();
    Charset localCharset = w(i);
    byte[] arrayOfByte = new byte[3];
    paramz.l(arrayOfByte, 0, 3);
    String str = new String(arrayOfByte, 0, 3);
    paramInt -= 4;
    arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    paramInt = y(arrayOfByte, 0, i);
    paramz = new String(arrayOfByte, 0, paramInt, localCharset);
    paramInt += v(i);
    return new e(str, paramz, p(arrayOfByte, paramInt, y(arrayOfByte, paramInt, i), localCharset));
  }
  
  /* Error */
  public static i k(int paramInt1, g0.z paramz, boolean paramBoolean, int paramInt2, a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 94	g0/z:G	()I
    //   4: istore 5
    //   6: aload_1
    //   7: invokevirtual 94	g0/z:G	()I
    //   10: istore 6
    //   12: aload_1
    //   13: invokevirtual 94	g0/z:G	()I
    //   16: istore 7
    //   18: iload_0
    //   19: iconst_3
    //   20: if_icmplt +12 -> 32
    //   23: aload_1
    //   24: invokevirtual 94	g0/z:G	()I
    //   27: istore 8
    //   29: goto +6 -> 35
    //   32: iconst_0
    //   33: istore 8
    //   35: iload_0
    //   36: iconst_4
    //   37: if_icmpne +71 -> 108
    //   40: aload_1
    //   41: invokevirtual 222	g0/z:K	()I
    //   44: istore 9
    //   46: iload 9
    //   48: istore 10
    //   50: iload_2
    //   51: ifne +50 -> 101
    //   54: iload 9
    //   56: bipush 24
    //   58: ishr
    //   59: sipush 255
    //   62: iand
    //   63: bipush 21
    //   65: ishl
    //   66: iload 9
    //   68: sipush 255
    //   71: iand
    //   72: iload 9
    //   74: bipush 8
    //   76: ishr
    //   77: sipush 255
    //   80: iand
    //   81: bipush 7
    //   83: ishl
    //   84: ior
    //   85: iload 9
    //   87: bipush 16
    //   89: ishr
    //   90: sipush 255
    //   93: iand
    //   94: bipush 14
    //   96: ishl
    //   97: ior
    //   98: ior
    //   99: istore 10
    //   101: iload 10
    //   103: istore 11
    //   105: goto +26 -> 131
    //   108: iload_0
    //   109: iconst_3
    //   110: if_icmpne +12 -> 122
    //   113: aload_1
    //   114: invokevirtual 222	g0/z:K	()I
    //   117: istore 10
    //   119: goto -18 -> 101
    //   122: aload_1
    //   123: invokevirtual 64	g0/z:J	()I
    //   126: istore 10
    //   128: goto -27 -> 101
    //   131: iload_0
    //   132: iconst_3
    //   133: if_icmplt +12 -> 145
    //   136: aload_1
    //   137: invokevirtual 61	g0/z:M	()I
    //   140: istore 10
    //   142: goto +6 -> 148
    //   145: iconst_0
    //   146: istore 10
    //   148: aconst_null
    //   149: astore 12
    //   151: iload 5
    //   153: ifne +38 -> 191
    //   156: iload 6
    //   158: ifne +33 -> 191
    //   161: iload 7
    //   163: ifne +28 -> 191
    //   166: iload 8
    //   168: ifne +23 -> 191
    //   171: iload 11
    //   173: ifne +18 -> 191
    //   176: iload 10
    //   178: ifne +13 -> 191
    //   181: aload_1
    //   182: aload_1
    //   183: invokevirtual 224	g0/z:g	()I
    //   186: invokevirtual 68	g0/z:T	(I)V
    //   189: aconst_null
    //   190: areturn
    //   191: aload_1
    //   192: invokevirtual 41	g0/z:f	()I
    //   195: iload 11
    //   197: iadd
    //   198: istore 13
    //   200: iload 13
    //   202: aload_1
    //   203: invokevirtual 224	g0/z:g	()I
    //   206: if_icmple +20 -> 226
    //   209: ldc -30
    //   211: ldc -28
    //   213: invokestatic 233	g0/o:h	(Ljava/lang/String;Ljava/lang/String;)V
    //   216: aload_1
    //   217: aload_1
    //   218: invokevirtual 224	g0/z:g	()I
    //   221: invokevirtual 68	g0/z:T	(I)V
    //   224: aconst_null
    //   225: areturn
    //   226: aload 4
    //   228: ifnull +30 -> 258
    //   231: aload 4
    //   233: iload_0
    //   234: iload 5
    //   236: iload 6
    //   238: iload 7
    //   240: iload 8
    //   242: invokeinterface 235 6 0
    //   247: ifne +11 -> 258
    //   250: aload_1
    //   251: iload 13
    //   253: invokevirtual 68	g0/z:T	(I)V
    //   256: aconst_null
    //   257: areturn
    //   258: iload 10
    //   260: istore 14
    //   262: iload_0
    //   263: iconst_3
    //   264: if_icmpne +77 -> 341
    //   267: iload 14
    //   269: sipush 128
    //   272: iand
    //   273: ifeq +9 -> 282
    //   276: iconst_1
    //   277: istore 9
    //   279: goto +6 -> 285
    //   282: iconst_0
    //   283: istore 9
    //   285: iload 14
    //   287: bipush 64
    //   289: iand
    //   290: ifeq +9 -> 299
    //   293: iconst_1
    //   294: istore 10
    //   296: goto +6 -> 302
    //   299: iconst_0
    //   300: istore 10
    //   302: iload 14
    //   304: bipush 32
    //   306: iand
    //   307: ifeq +9 -> 316
    //   310: iconst_1
    //   311: istore 15
    //   313: goto +6 -> 319
    //   316: iconst_0
    //   317: istore 15
    //   319: iconst_0
    //   320: istore 16
    //   322: iload 15
    //   324: istore 17
    //   326: iload 9
    //   328: istore 15
    //   330: iload 10
    //   332: istore 14
    //   334: iload 16
    //   336: istore 10
    //   338: goto +128 -> 466
    //   341: iload_0
    //   342: iconst_4
    //   343: if_icmpne +108 -> 451
    //   346: iload 14
    //   348: bipush 64
    //   350: iand
    //   351: ifeq +9 -> 360
    //   354: iconst_1
    //   355: istore 10
    //   357: goto +6 -> 363
    //   360: iconst_0
    //   361: istore 10
    //   363: iload 14
    //   365: bipush 8
    //   367: iand
    //   368: ifeq +9 -> 377
    //   371: iconst_1
    //   372: istore 15
    //   374: goto +6 -> 380
    //   377: iconst_0
    //   378: istore 15
    //   380: iload 14
    //   382: iconst_4
    //   383: iand
    //   384: ifeq +9 -> 393
    //   387: iconst_1
    //   388: istore 17
    //   390: goto +6 -> 396
    //   393: iconst_0
    //   394: istore 17
    //   396: iload 14
    //   398: iconst_2
    //   399: iand
    //   400: ifeq +9 -> 409
    //   403: iconst_1
    //   404: istore 9
    //   406: goto +6 -> 412
    //   409: iconst_0
    //   410: istore 9
    //   412: iload 14
    //   414: iconst_1
    //   415: iand
    //   416: ifeq +9 -> 425
    //   419: iconst_1
    //   420: istore 14
    //   422: goto +6 -> 428
    //   425: iconst_0
    //   426: istore 14
    //   428: iload 14
    //   430: istore 16
    //   432: iload 17
    //   434: istore 14
    //   436: iload 10
    //   438: istore 17
    //   440: iload 9
    //   442: istore 10
    //   444: iload 16
    //   446: istore 9
    //   448: goto +18 -> 466
    //   451: iconst_0
    //   452: istore 15
    //   454: iconst_0
    //   455: istore 17
    //   457: iconst_0
    //   458: istore 14
    //   460: iconst_0
    //   461: istore 10
    //   463: iconst_0
    //   464: istore 9
    //   466: iload 15
    //   468: ifne +8 -> 476
    //   471: iload 14
    //   473: ifeq +6 -> 479
    //   476: goto +670 -> 1146
    //   479: iload 11
    //   481: istore 15
    //   483: iload 17
    //   485: ifeq +14 -> 499
    //   488: iload 11
    //   490: iconst_1
    //   491: isub
    //   492: istore 15
    //   494: aload_1
    //   495: iconst_1
    //   496: invokevirtual 75	g0/z:U	(I)V
    //   499: iload 15
    //   501: istore 17
    //   503: iload 9
    //   505: ifeq +14 -> 519
    //   508: iload 15
    //   510: iconst_4
    //   511: isub
    //   512: istore 17
    //   514: aload_1
    //   515: iconst_4
    //   516: invokevirtual 75	g0/z:U	(I)V
    //   519: iload 17
    //   521: istore 9
    //   523: iload 10
    //   525: ifeq +11 -> 536
    //   528: aload_1
    //   529: iload 17
    //   531: invokestatic 237	T0/h:B	(Lg0/z;I)I
    //   534: istore 9
    //   536: iload 5
    //   538: bipush 84
    //   540: if_icmpne +55 -> 595
    //   543: iload 6
    //   545: bipush 88
    //   547: if_icmpne +48 -> 595
    //   550: iload 7
    //   552: bipush 88
    //   554: if_icmpne +41 -> 595
    //   557: iload_0
    //   558: iconst_2
    //   559: if_icmpeq +10 -> 569
    //   562: iload 8
    //   564: bipush 88
    //   566: if_icmpne +29 -> 595
    //   569: aload_1
    //   570: iload 9
    //   572: invokestatic 241	T0/h:s	(Lg0/z;I)LT0/n;
    //   575: astore 4
    //   577: goto +465 -> 1042
    //   580: astore 4
    //   582: goto +475 -> 1057
    //   585: astore 4
    //   587: goto +479 -> 1066
    //   590: astore 4
    //   592: goto +474 -> 1066
    //   595: iload 5
    //   597: bipush 84
    //   599: if_icmpne +26 -> 625
    //   602: aload_1
    //   603: iload 9
    //   605: iload_0
    //   606: iload 5
    //   608: iload 6
    //   610: iload 7
    //   612: iload 8
    //   614: invokestatic 245	T0/h:x	(IIIII)Ljava/lang/String;
    //   617: invokestatic 249	T0/h:q	(Lg0/z;ILjava/lang/String;)LT0/n;
    //   620: astore 4
    //   622: goto +420 -> 1042
    //   625: iload 5
    //   627: bipush 87
    //   629: if_icmpne +40 -> 669
    //   632: iload 6
    //   634: bipush 88
    //   636: if_icmpne +33 -> 669
    //   639: iload 7
    //   641: bipush 88
    //   643: if_icmpne +26 -> 669
    //   646: iload_0
    //   647: iconst_2
    //   648: if_icmpeq +10 -> 658
    //   651: iload 8
    //   653: bipush 88
    //   655: if_icmpne +14 -> 669
    //   658: aload_1
    //   659: iload 9
    //   661: invokestatic 253	T0/h:u	(Lg0/z;I)LT0/o;
    //   664: astore 4
    //   666: goto +376 -> 1042
    //   669: iload 5
    //   671: bipush 87
    //   673: if_icmpne +26 -> 699
    //   676: aload_1
    //   677: iload 9
    //   679: iload_0
    //   680: iload 5
    //   682: iload 6
    //   684: iload 7
    //   686: iload 8
    //   688: invokestatic 245	T0/h:x	(IIIII)Ljava/lang/String;
    //   691: invokestatic 257	T0/h:t	(Lg0/z;ILjava/lang/String;)LT0/o;
    //   694: astore 4
    //   696: goto +346 -> 1042
    //   699: iload 5
    //   701: bipush 80
    //   703: if_icmpne +35 -> 738
    //   706: iload 6
    //   708: bipush 82
    //   710: if_icmpne +28 -> 738
    //   713: iload 7
    //   715: bipush 73
    //   717: if_icmpne +21 -> 738
    //   720: iload 8
    //   722: bipush 86
    //   724: if_icmpne +14 -> 738
    //   727: aload_1
    //   728: iload 9
    //   730: invokestatic 261	T0/h:o	(Lg0/z;I)LT0/m;
    //   733: astore 4
    //   735: goto +307 -> 1042
    //   738: iload 5
    //   740: bipush 71
    //   742: if_icmpne +40 -> 782
    //   745: iload 6
    //   747: bipush 69
    //   749: if_icmpne +33 -> 782
    //   752: iload 7
    //   754: bipush 79
    //   756: if_icmpne +26 -> 782
    //   759: iload 8
    //   761: bipush 66
    //   763: if_icmpeq +8 -> 771
    //   766: iload_0
    //   767: iconst_2
    //   768: if_icmpne +14 -> 782
    //   771: aload_1
    //   772: iload 9
    //   774: invokestatic 264	T0/h:l	(Lg0/z;I)LT0/f;
    //   777: astore 4
    //   779: goto +263 -> 1042
    //   782: iload_0
    //   783: iconst_2
    //   784: if_icmpne +27 -> 811
    //   787: iload 5
    //   789: bipush 80
    //   791: if_icmpne +60 -> 851
    //   794: iload 6
    //   796: bipush 73
    //   798: if_icmpne +53 -> 851
    //   801: iload 7
    //   803: bipush 67
    //   805: if_icmpne +46 -> 851
    //   808: goto +31 -> 839
    //   811: iload 5
    //   813: bipush 65
    //   815: if_icmpne +36 -> 851
    //   818: iload 6
    //   820: bipush 80
    //   822: if_icmpne +29 -> 851
    //   825: iload 7
    //   827: bipush 73
    //   829: if_icmpne +22 -> 851
    //   832: iload 8
    //   834: bipush 67
    //   836: if_icmpne +15 -> 851
    //   839: aload_1
    //   840: iload 9
    //   842: iload_0
    //   843: invokestatic 266	T0/h:f	(Lg0/z;II)LT0/a;
    //   846: astore 4
    //   848: goto +194 -> 1042
    //   851: iload 5
    //   853: bipush 67
    //   855: if_icmpne +40 -> 895
    //   858: iload 6
    //   860: bipush 79
    //   862: if_icmpne +33 -> 895
    //   865: iload 7
    //   867: bipush 77
    //   869: if_icmpne +26 -> 895
    //   872: iload 8
    //   874: bipush 77
    //   876: if_icmpeq +8 -> 884
    //   879: iload_0
    //   880: iconst_2
    //   881: if_icmpne +14 -> 895
    //   884: aload_1
    //   885: iload 9
    //   887: invokestatic 268	T0/h:j	(Lg0/z;I)LT0/e;
    //   890: astore 4
    //   892: goto +150 -> 1042
    //   895: iload 5
    //   897: bipush 67
    //   899: if_icmpne +40 -> 939
    //   902: iload 6
    //   904: bipush 72
    //   906: if_icmpne +33 -> 939
    //   909: iload 7
    //   911: bipush 65
    //   913: if_icmpne +26 -> 939
    //   916: iload 8
    //   918: bipush 80
    //   920: if_icmpne +19 -> 939
    //   923: aload_1
    //   924: iload 9
    //   926: iload_0
    //   927: iload_2
    //   928: iload_3
    //   929: aload 4
    //   931: invokestatic 270	T0/h:h	(Lg0/z;IIZILT0/h$a;)LT0/c;
    //   934: astore 4
    //   936: goto +106 -> 1042
    //   939: iload 5
    //   941: bipush 67
    //   943: if_icmpne +40 -> 983
    //   946: iload 6
    //   948: bipush 84
    //   950: if_icmpne +33 -> 983
    //   953: iload 7
    //   955: bipush 79
    //   957: if_icmpne +26 -> 983
    //   960: iload 8
    //   962: bipush 67
    //   964: if_icmpne +19 -> 983
    //   967: aload_1
    //   968: iload 9
    //   970: iload_0
    //   971: iload_2
    //   972: iload_3
    //   973: aload 4
    //   975: invokestatic 272	T0/h:i	(Lg0/z;IIZILT0/h$a;)LT0/d;
    //   978: astore 4
    //   980: goto +62 -> 1042
    //   983: iload 5
    //   985: bipush 77
    //   987: if_icmpne +35 -> 1022
    //   990: iload 6
    //   992: bipush 76
    //   994: if_icmpne +28 -> 1022
    //   997: iload 7
    //   999: bipush 76
    //   1001: if_icmpne +21 -> 1022
    //   1004: iload 8
    //   1006: bipush 84
    //   1008: if_icmpne +14 -> 1022
    //   1011: aload_1
    //   1012: iload 9
    //   1014: invokestatic 276	T0/h:n	(Lg0/z;I)LT0/l;
    //   1017: astore 4
    //   1019: goto +23 -> 1042
    //   1022: aload_1
    //   1023: iload 9
    //   1025: iload_0
    //   1026: iload 5
    //   1028: iload 6
    //   1030: iload 7
    //   1032: iload 8
    //   1034: invokestatic 245	T0/h:x	(IIIII)Ljava/lang/String;
    //   1037: invokestatic 278	T0/h:g	(Lg0/z;ILjava/lang/String;)LT0/b;
    //   1040: astore 4
    //   1042: aload_1
    //   1043: iload 13
    //   1045: invokevirtual 68	g0/z:T	(I)V
    //   1048: aload 4
    //   1050: astore_1
    //   1051: aconst_null
    //   1052: astore 4
    //   1054: goto +21 -> 1075
    //   1057: aload_1
    //   1058: iload 13
    //   1060: invokevirtual 68	g0/z:T	(I)V
    //   1063: aload 4
    //   1065: athrow
    //   1066: aload_1
    //   1067: iload 13
    //   1069: invokevirtual 68	g0/z:T	(I)V
    //   1072: aload 12
    //   1074: astore_1
    //   1075: aload_1
    //   1076: ifnonnull +68 -> 1144
    //   1079: new 104	java/lang/StringBuilder
    //   1082: dup
    //   1083: invokespecial 105	java/lang/StringBuilder:<init>	()V
    //   1086: astore 12
    //   1088: aload 12
    //   1090: ldc_w 280
    //   1093: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1096: pop
    //   1097: aload 12
    //   1099: iload_0
    //   1100: iload 5
    //   1102: iload 6
    //   1104: iload 7
    //   1106: iload 8
    //   1108: invokestatic 245	T0/h:x	(IIIII)Ljava/lang/String;
    //   1111: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1114: pop
    //   1115: aload 12
    //   1117: ldc_w 282
    //   1120: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1123: pop
    //   1124: aload 12
    //   1126: iload 9
    //   1128: invokevirtual 285	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1131: pop
    //   1132: ldc -30
    //   1134: aload 12
    //   1136: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1139: aload 4
    //   1141: invokestatic 288	g0/o:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1144: aload_1
    //   1145: areturn
    //   1146: ldc -30
    //   1148: ldc_w 290
    //   1151: invokestatic 233	g0/o:h	(Ljava/lang/String;Ljava/lang/String;)V
    //   1154: aload_1
    //   1155: iload 13
    //   1157: invokevirtual 68	g0/z:T	(I)V
    //   1160: aconst_null
    //   1161: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1162	0	paramInt1	int
    //   0	1162	1	paramz	g0.z
    //   0	1162	2	paramBoolean	boolean
    //   0	1162	3	paramInt2	int
    //   0	1162	4	parama	a
    //   4	1097	5	i	int
    //   10	1093	6	j	int
    //   16	1089	7	k	int
    //   27	1080	8	m	int
    //   44	1083	9	n	int
    //   48	476	10	i1	int
    //   103	389	11	i2	int
    //   149	986	12	localStringBuilder	StringBuilder
    //   198	958	13	i3	int
    //   260	212	14	i4	int
    //   311	201	15	i5	int
    //   320	125	16	i6	int
    //   324	206	17	i7	int
    // Exception table:
    //   from	to	target	type
    //   569	577	580	finally
    //   602	622	580	finally
    //   658	666	580	finally
    //   676	696	580	finally
    //   727	735	580	finally
    //   771	779	580	finally
    //   839	848	580	finally
    //   884	892	580	finally
    //   923	936	580	finally
    //   967	980	580	finally
    //   1011	1019	580	finally
    //   1022	1042	580	finally
    //   569	577	585	java/lang/Exception
    //   602	622	585	java/lang/Exception
    //   658	666	585	java/lang/Exception
    //   676	696	585	java/lang/Exception
    //   727	735	585	java/lang/Exception
    //   771	779	585	java/lang/Exception
    //   839	848	585	java/lang/Exception
    //   884	892	585	java/lang/Exception
    //   923	936	585	java/lang/Exception
    //   967	980	585	java/lang/Exception
    //   1011	1019	585	java/lang/Exception
    //   1022	1042	585	java/lang/Exception
    //   569	577	590	java/lang/OutOfMemoryError
    //   602	622	590	java/lang/OutOfMemoryError
    //   658	666	590	java/lang/OutOfMemoryError
    //   676	696	590	java/lang/OutOfMemoryError
    //   727	735	590	java/lang/OutOfMemoryError
    //   771	779	590	java/lang/OutOfMemoryError
    //   839	848	590	java/lang/OutOfMemoryError
    //   884	892	590	java/lang/OutOfMemoryError
    //   923	936	590	java/lang/OutOfMemoryError
    //   967	980	590	java/lang/OutOfMemoryError
    //   1011	1019	590	java/lang/OutOfMemoryError
    //   1022	1042	590	java/lang/OutOfMemoryError
  }
  
  public static f l(g0.z paramz, int paramInt)
  {
    int i = paramz.G();
    Charset localCharset = w(i);
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    int j = z(arrayOfByte, 0);
    paramz = d0.z.t(new String(arrayOfByte, 0, j, W2.e.b));
    int k = j + 1;
    j = y(arrayOfByte, k, i);
    String str = p(arrayOfByte, k, j, localCharset);
    k = j + v(i);
    j = y(arrayOfByte, k, i);
    return new f(paramz, str, p(arrayOfByte, k, j, localCharset), d(arrayOfByte, j + v(i), paramInt));
  }
  
  public static b m(g0.z paramz)
  {
    boolean bool1 = false;
    if (paramz.a() < 10)
    {
      paramz = "Data too short to be an ID3 tag";
      g0.o.h("Id3Decoder", paramz);
      return null;
    }
    int i = paramz.J();
    if (i != 4801587)
    {
      paramz = new StringBuilder();
      paramz.append("Unexpected first three bytes of ID3 tag header: 0x");
      paramz.append(String.format("%06X", new Object[] { Integer.valueOf(i) }));
    }
    for (;;)
    {
      paramz = paramz.toString();
      break;
      int j = paramz.G();
      paramz.U(1);
      int k = paramz.G();
      int m = paramz.F();
      if (j == 2)
      {
        i = m;
        if ((k & 0x40) == 0) {
          break label214;
        }
        paramz = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
        break;
      }
      if (j == 3)
      {
        i = m;
        if ((k & 0x40) != 0)
        {
          i = paramz.p();
          paramz.U(i);
          i = m - (i + 4);
        }
      }
      else
      {
        if (j != 4) {
          break label249;
        }
        int n = m;
        if ((k & 0x40) != 0)
        {
          i = paramz.F();
          paramz.U(i - 4);
          n = m - i;
        }
        i = n;
        if ((k & 0x10) != 0) {
          i = n - 10;
        }
      }
      label214:
      boolean bool2 = bool1;
      if (j < 4)
      {
        bool2 = bool1;
        if ((k & 0x80) != 0) {
          bool2 = true;
        }
      }
      return new b(j, bool2, i);
      label249:
      paramz = new StringBuilder();
      paramz.append("Skipped ID3 tag with unsupported majorVersion=");
      paramz.append(j);
    }
  }
  
  public static l n(g0.z paramz, int paramInt)
  {
    int i = paramz.M();
    int j = paramz.J();
    int k = paramz.J();
    int m = paramz.G();
    int n = paramz.G();
    y localy = new y();
    localy.m(paramz);
    int i1 = (paramInt - 10) * 8 / (m + n);
    int[] arrayOfInt = new int[i1];
    paramz = new int[i1];
    for (paramInt = 0; paramInt < i1; paramInt++)
    {
      int i2 = localy.h(m);
      int i3 = localy.h(n);
      arrayOfInt[paramInt] = i2;
      paramz[paramInt] = i3;
    }
    return new l(i, j, k, arrayOfInt, paramz);
  }
  
  public static m o(g0.z paramz, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    int i = z(arrayOfByte, 0);
    return new m(new String(arrayOfByte, 0, i, W2.e.b), d(arrayOfByte, i + 1, paramInt));
  }
  
  public static String p(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Charset paramCharset)
  {
    if ((paramInt2 > paramInt1) && (paramInt2 <= paramArrayOfByte.length)) {
      return new String(paramArrayOfByte, paramInt1, paramInt2 - paramInt1, paramCharset);
    }
    return "";
  }
  
  public static n q(g0.z paramz, int paramInt, String paramString)
  {
    if (paramInt < 1) {
      return null;
    }
    int i = paramz.G();
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    return new n(paramString, null, r(arrayOfByte, i, 0));
  }
  
  public static v r(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= paramArrayOfByte.length) {
      return v.Z("");
    }
    Object localObject = v.M();
    for (;;)
    {
      int i = y(paramArrayOfByte, paramInt2, paramInt1);
      if (paramInt2 >= i) {
        break;
      }
      ((v.a)localObject).h(new String(paramArrayOfByte, paramInt2, i - paramInt2, w(paramInt1)));
      paramInt2 = v(paramInt1) + i;
    }
    localObject = ((v.a)localObject).k();
    paramArrayOfByte = (byte[])localObject;
    if (((AbstractCollection)localObject).isEmpty()) {
      paramArrayOfByte = v.Z("");
    }
    return paramArrayOfByte;
  }
  
  public static n s(g0.z paramz, int paramInt)
  {
    if (paramInt < 1) {
      return null;
    }
    int i = paramz.G();
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    paramInt = y(arrayOfByte, 0, i);
    return new n("TXXX", new String(arrayOfByte, 0, paramInt, w(i)), r(arrayOfByte, i, paramInt + v(i)));
  }
  
  public static o t(g0.z paramz, int paramInt, String paramString)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    return new o(paramString, null, new String(arrayOfByte, 0, z(arrayOfByte, 0), W2.e.b));
  }
  
  public static o u(g0.z paramz, int paramInt)
  {
    if (paramInt < 1) {
      return null;
    }
    int i = paramz.G();
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    paramInt = y(arrayOfByte, 0, i);
    paramz = new String(arrayOfByte, 0, paramInt, w(i));
    paramInt += v(i);
    return new o("WXXX", paramz, p(arrayOfByte, paramInt, z(arrayOfByte, paramInt), W2.e.b));
  }
  
  public static int v(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 3)) {
      paramInt = 2;
    } else {
      paramInt = 1;
    }
    return paramInt;
  }
  
  public static Charset w(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return W2.e.b;
        }
        return W2.e.c;
      }
      return W2.e.d;
    }
    return W2.e.f;
  }
  
  public static String x(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    String str;
    if (paramInt1 == 2) {
      str = String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    } else {
      str = String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
    }
    return str;
  }
  
  public static int y(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = z(paramArrayOfByte, paramInt1);
    if (paramInt2 != 0)
    {
      int j = i;
      if (paramInt2 != 3)
      {
        while (j < paramArrayOfByte.length - 1)
        {
          if (((j - paramInt1) % 2 == 0) && (paramArrayOfByte[(j + 1)] == 0)) {
            return j;
          }
          j = z(paramArrayOfByte, j + 1);
        }
        return paramArrayOfByte.length;
      }
    }
    return i;
  }
  
  public static int z(byte[] paramArrayOfByte, int paramInt)
  {
    while (paramInt < paramArrayOfByte.length)
    {
      if (paramArrayOfByte[paramInt] == 0) {
        return paramInt;
      }
      paramInt++;
    }
    return paramArrayOfByte.length;
  }
  
  public x b(O0.b paramb, ByteBuffer paramByteBuffer)
  {
    return e(paramByteBuffer.array(), paramByteBuffer.limit());
  }
  
  public x e(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = new ArrayList();
    g0.z localz = new g0.z(paramArrayOfByte, paramInt);
    paramArrayOfByte = m(localz);
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = localz.f();
    if (b.a(paramArrayOfByte) == 2) {
      paramInt = 6;
    } else {
      paramInt = 10;
    }
    int j = b.b(paramArrayOfByte);
    if (b.c(paramArrayOfByte)) {
      j = B(localz, b.b(paramArrayOfByte));
    }
    localz.S(i + j);
    j = b.a(paramArrayOfByte);
    boolean bool = false;
    if (!C(localz, j, paramInt, false)) {
      if ((b.a(paramArrayOfByte) == 4) && (C(localz, 4, paramInt, true)))
      {
        bool = true;
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Failed to validate ID3 tag with majorVersion=");
        ((StringBuilder)localObject).append(b.a(paramArrayOfByte));
        g0.o.h("Id3Decoder", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    while (localz.a() >= paramInt)
    {
      i locali = k(b.a(paramArrayOfByte), localz, bool, paramInt, a);
      if (locali != null) {
        ((List)localObject).add(locali);
      }
    }
    return new x((List)localObject);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  }
  
  public static final class b
  {
    public final int a;
    public final boolean b;
    public final int c;
    
    public b(int paramInt1, boolean paramBoolean, int paramInt2)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     T0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */