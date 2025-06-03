package T;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a$c
{
  public final int a;
  public final int b;
  public final long c;
  public final byte[] d;
  
  public a$c(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfByte)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramLong;
    d = paramArrayOfByte;
  }
  
  public a$c(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this(paramInt1, paramInt2, -1L, paramArrayOfByte);
  }
  
  public static c a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append('\000');
    paramString = localStringBuilder.toString().getBytes(a.o0);
    return new c(2, paramString.length, paramString);
  }
  
  public static c b(long paramLong, ByteOrder paramByteOrder)
  {
    return c(new long[] { paramLong }, paramByteOrder);
  }
  
  public static c c(long[] paramArrayOfLong, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.W[4] * paramArrayOfLong.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfLong.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putInt((int)paramArrayOfLong[j]);
    }
    return new c(4, paramArrayOfLong.length, localByteBuffer.array());
  }
  
  public static c d(a.e parame, ByteOrder paramByteOrder)
  {
    return e(new a.e[] { parame }, paramByteOrder);
  }
  
  public static c e(a.e[] paramArrayOfe, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.W[5] * paramArrayOfe.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfe.length;
    for (int j = 0; j < i; j++)
    {
      paramByteOrder = paramArrayOfe[j];
      localByteBuffer.putInt((int)a);
      localByteBuffer.putInt((int)b);
    }
    return new c(5, paramArrayOfe.length, localByteBuffer.array());
  }
  
  public static c f(int paramInt, ByteOrder paramByteOrder)
  {
    return g(new int[] { paramInt }, paramByteOrder);
  }
  
  public static c g(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.W[3] * paramArrayOfInt.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putShort((short)paramArrayOfInt[j]);
    }
    return new c(3, paramArrayOfInt.length, localByteBuffer.array());
  }
  
  public double h(ByteOrder paramByteOrder)
  {
    paramByteOrder = k(paramByteOrder);
    if (paramByteOrder != null)
    {
      if ((paramByteOrder instanceof String)) {
        return Double.parseDouble((String)paramByteOrder);
      }
      if ((paramByteOrder instanceof long[]))
      {
        paramByteOrder = (long[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof int[]))
      {
        paramByteOrder = (int[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof double[]))
      {
        paramByteOrder = (double[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof a.e[]))
      {
        paramByteOrder = (a.e[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0].a();
        }
        throw new NumberFormatException("There are more than one component");
      }
      throw new NumberFormatException("Couldn't find a double value");
    }
    throw new NumberFormatException("NULL can't be converted to a double value");
  }
  
  public int i(ByteOrder paramByteOrder)
  {
    paramByteOrder = k(paramByteOrder);
    if (paramByteOrder != null)
    {
      if ((paramByteOrder instanceof String)) {
        return Integer.parseInt((String)paramByteOrder);
      }
      if ((paramByteOrder instanceof long[]))
      {
        paramByteOrder = (long[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return (int)paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof int[]))
      {
        paramByteOrder = (int[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      throw new NumberFormatException("Couldn't find a integer value");
    }
    throw new NumberFormatException("NULL can't be converted to a integer value");
  }
  
  public String j(ByteOrder paramByteOrder)
  {
    Object localObject = k(paramByteOrder);
    if (localObject == null) {
      return null;
    }
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    paramByteOrder = new StringBuilder();
    boolean bool = localObject instanceof long[];
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      localObject = (long[])localObject;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m]);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    if ((localObject instanceof int[]))
    {
      localObject = (int[])localObject;
      m = i;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m]);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    if ((localObject instanceof double[]))
    {
      localObject = (double[])localObject;
      m = j;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m]);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    if ((localObject instanceof a.e[]))
    {
      localObject = (a.e[])localObject;
      m = k;
      while (m < localObject.length)
      {
        paramByteOrder.append(a);
        paramByteOrder.append('/');
        paramByteOrder.append(b);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    return null;
  }
  
  /* Error */
  public Object k(ByteOrder paramByteOrder)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 168	T/a$b
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: getfield 26	T/a$c:d	[B
    //   11: invokespecial 171	T/a$b:<init>	([B)V
    //   14: aload_3
    //   15: astore_2
    //   16: aload_3
    //   17: aload_1
    //   18: invokevirtual 174	T/a$b:c	(Ljava/nio/ByteOrder;)V
    //   21: aload_3
    //   22: astore_2
    //   23: aload_0
    //   24: getfield 20	T/a$c:a	I
    //   27: istore 4
    //   29: iconst_0
    //   30: istore 5
    //   32: iconst_0
    //   33: istore 6
    //   35: iconst_0
    //   36: istore 7
    //   38: iconst_0
    //   39: istore 8
    //   41: iconst_0
    //   42: istore 9
    //   44: iconst_0
    //   45: istore 10
    //   47: iconst_0
    //   48: istore 11
    //   50: iconst_0
    //   51: istore 12
    //   53: iconst_0
    //   54: istore 13
    //   56: iload 4
    //   58: tableswitch	default:+62->120, 1:+761->819, 2:+588->646, 3:+529->587, 4:+470->528, 5:+399->457, 6:+761->819, 7:+588->646, 8:+340->398, 9:+281->339, 10:+208->266, 11:+148->206, 12:+81->139
    //   120: aload_3
    //   121: invokevirtual 179	java/io/InputStream:close	()V
    //   124: goto +13 -> 137
    //   127: astore_1
    //   128: ldc -75
    //   130: ldc -73
    //   132: aload_1
    //   133: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   136: pop
    //   137: aconst_null
    //   138: areturn
    //   139: aload_3
    //   140: astore_2
    //   141: aload_0
    //   142: getfield 22	T/a$c:b	I
    //   145: newarray <illegal type>
    //   147: astore_1
    //   148: aload_3
    //   149: astore_2
    //   150: iload 13
    //   152: aload_0
    //   153: getfield 22	T/a$c:b	I
    //   156: if_icmpge +31 -> 187
    //   159: aload_3
    //   160: astore_2
    //   161: aload_1
    //   162: iload 13
    //   164: aload_3
    //   165: invokevirtual 191	T/a$b:readDouble	()D
    //   168: dastore
    //   169: iinc 13 1
    //   172: goto -24 -> 148
    //   175: astore_1
    //   176: goto +789 -> 965
    //   179: astore_2
    //   180: aload_3
    //   181: astore_1
    //   182: aload_2
    //   183: astore_3
    //   184: goto +747 -> 931
    //   187: aload_3
    //   188: invokevirtual 179	java/io/InputStream:close	()V
    //   191: goto +13 -> 204
    //   194: astore_2
    //   195: ldc -75
    //   197: ldc -73
    //   199: aload_2
    //   200: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   203: pop
    //   204: aload_1
    //   205: areturn
    //   206: aload_3
    //   207: astore_2
    //   208: aload_0
    //   209: getfield 22	T/a$c:b	I
    //   212: newarray <illegal type>
    //   214: astore_1
    //   215: iload 5
    //   217: istore 13
    //   219: aload_3
    //   220: astore_2
    //   221: iload 13
    //   223: aload_0
    //   224: getfield 22	T/a$c:b	I
    //   227: if_icmpge +20 -> 247
    //   230: aload_3
    //   231: astore_2
    //   232: aload_1
    //   233: iload 13
    //   235: aload_3
    //   236: invokevirtual 195	T/a$b:readFloat	()F
    //   239: f2d
    //   240: dastore
    //   241: iinc 13 1
    //   244: goto -25 -> 219
    //   247: aload_3
    //   248: invokevirtual 179	java/io/InputStream:close	()V
    //   251: goto +13 -> 264
    //   254: astore_2
    //   255: ldc -75
    //   257: ldc -73
    //   259: aload_2
    //   260: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   263: pop
    //   264: aload_1
    //   265: areturn
    //   266: aload_3
    //   267: astore_2
    //   268: aload_0
    //   269: getfield 22	T/a$c:b	I
    //   272: anewarray 88	T/a$e
    //   275: astore_1
    //   276: iload 6
    //   278: istore 13
    //   280: aload_3
    //   281: astore_2
    //   282: iload 13
    //   284: aload_0
    //   285: getfield 22	T/a$c:b	I
    //   288: if_icmpge +32 -> 320
    //   291: aload_3
    //   292: astore_2
    //   293: aload_1
    //   294: iload 13
    //   296: new 88	T/a$e
    //   299: dup
    //   300: aload_3
    //   301: invokevirtual 199	T/a$b:readInt	()I
    //   304: i2l
    //   305: aload_3
    //   306: invokevirtual 199	T/a$b:readInt	()I
    //   309: i2l
    //   310: invokespecial 202	T/a$e:<init>	(JJ)V
    //   313: aastore
    //   314: iinc 13 1
    //   317: goto -37 -> 280
    //   320: aload_3
    //   321: invokevirtual 179	java/io/InputStream:close	()V
    //   324: goto +13 -> 337
    //   327: astore_2
    //   328: ldc -75
    //   330: ldc -73
    //   332: aload_2
    //   333: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   336: pop
    //   337: aload_1
    //   338: areturn
    //   339: aload_3
    //   340: astore_2
    //   341: aload_0
    //   342: getfield 22	T/a$c:b	I
    //   345: newarray <illegal type>
    //   347: astore_1
    //   348: iload 7
    //   350: istore 13
    //   352: aload_3
    //   353: astore_2
    //   354: iload 13
    //   356: aload_0
    //   357: getfield 22	T/a$c:b	I
    //   360: if_icmpge +19 -> 379
    //   363: aload_3
    //   364: astore_2
    //   365: aload_1
    //   366: iload 13
    //   368: aload_3
    //   369: invokevirtual 199	T/a$b:readInt	()I
    //   372: iastore
    //   373: iinc 13 1
    //   376: goto -24 -> 352
    //   379: aload_3
    //   380: invokevirtual 179	java/io/InputStream:close	()V
    //   383: goto +13 -> 396
    //   386: astore_2
    //   387: ldc -75
    //   389: ldc -73
    //   391: aload_2
    //   392: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   395: pop
    //   396: aload_1
    //   397: areturn
    //   398: aload_3
    //   399: astore_2
    //   400: aload_0
    //   401: getfield 22	T/a$c:b	I
    //   404: newarray <illegal type>
    //   406: astore_1
    //   407: iload 8
    //   409: istore 13
    //   411: aload_3
    //   412: astore_2
    //   413: iload 13
    //   415: aload_0
    //   416: getfield 22	T/a$c:b	I
    //   419: if_icmpge +19 -> 438
    //   422: aload_3
    //   423: astore_2
    //   424: aload_1
    //   425: iload 13
    //   427: aload_3
    //   428: invokevirtual 206	T/a$b:readShort	()S
    //   431: iastore
    //   432: iinc 13 1
    //   435: goto -24 -> 411
    //   438: aload_3
    //   439: invokevirtual 179	java/io/InputStream:close	()V
    //   442: goto +13 -> 455
    //   445: astore_2
    //   446: ldc -75
    //   448: ldc -73
    //   450: aload_2
    //   451: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   454: pop
    //   455: aload_1
    //   456: areturn
    //   457: aload_3
    //   458: astore_2
    //   459: aload_0
    //   460: getfield 22	T/a$c:b	I
    //   463: anewarray 88	T/a$e
    //   466: astore_1
    //   467: iload 9
    //   469: istore 13
    //   471: aload_3
    //   472: astore_2
    //   473: iload 13
    //   475: aload_0
    //   476: getfield 22	T/a$c:b	I
    //   479: if_icmpge +30 -> 509
    //   482: aload_3
    //   483: astore_2
    //   484: aload_1
    //   485: iload 13
    //   487: new 88	T/a$e
    //   490: dup
    //   491: aload_3
    //   492: invokevirtual 209	T/a$b:b	()J
    //   495: aload_3
    //   496: invokevirtual 209	T/a$b:b	()J
    //   499: invokespecial 202	T/a$e:<init>	(JJ)V
    //   502: aastore
    //   503: iinc 13 1
    //   506: goto -35 -> 471
    //   509: aload_3
    //   510: invokevirtual 179	java/io/InputStream:close	()V
    //   513: goto +13 -> 526
    //   516: astore_2
    //   517: ldc -75
    //   519: ldc -73
    //   521: aload_2
    //   522: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   525: pop
    //   526: aload_1
    //   527: areturn
    //   528: aload_3
    //   529: astore_2
    //   530: aload_0
    //   531: getfield 22	T/a$c:b	I
    //   534: newarray <illegal type>
    //   536: astore_1
    //   537: iload 10
    //   539: istore 13
    //   541: aload_3
    //   542: astore_2
    //   543: iload 13
    //   545: aload_0
    //   546: getfield 22	T/a$c:b	I
    //   549: if_icmpge +19 -> 568
    //   552: aload_3
    //   553: astore_2
    //   554: aload_1
    //   555: iload 13
    //   557: aload_3
    //   558: invokevirtual 209	T/a$b:b	()J
    //   561: lastore
    //   562: iinc 13 1
    //   565: goto -24 -> 541
    //   568: aload_3
    //   569: invokevirtual 179	java/io/InputStream:close	()V
    //   572: goto +13 -> 585
    //   575: astore_2
    //   576: ldc -75
    //   578: ldc -73
    //   580: aload_2
    //   581: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   584: pop
    //   585: aload_1
    //   586: areturn
    //   587: aload_3
    //   588: astore_2
    //   589: aload_0
    //   590: getfield 22	T/a$c:b	I
    //   593: newarray <illegal type>
    //   595: astore_1
    //   596: iload 11
    //   598: istore 13
    //   600: aload_3
    //   601: astore_2
    //   602: iload 13
    //   604: aload_0
    //   605: getfield 22	T/a$c:b	I
    //   608: if_icmpge +19 -> 627
    //   611: aload_3
    //   612: astore_2
    //   613: aload_1
    //   614: iload 13
    //   616: aload_3
    //   617: invokevirtual 212	T/a$b:readUnsignedShort	()I
    //   620: iastore
    //   621: iinc 13 1
    //   624: goto -24 -> 600
    //   627: aload_3
    //   628: invokevirtual 179	java/io/InputStream:close	()V
    //   631: goto +13 -> 644
    //   634: astore_2
    //   635: ldc -75
    //   637: ldc -73
    //   639: aload_2
    //   640: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   643: pop
    //   644: aload_1
    //   645: areturn
    //   646: aload_3
    //   647: astore_2
    //   648: iload 12
    //   650: istore 13
    //   652: aload_0
    //   653: getfield 22	T/a$c:b	I
    //   656: getstatic 215	T/a:X	[B
    //   659: arraylength
    //   660: if_icmplt +56 -> 716
    //   663: iconst_0
    //   664: istore 13
    //   666: aload_3
    //   667: astore_2
    //   668: getstatic 215	T/a:X	[B
    //   671: astore_1
    //   672: aload_3
    //   673: astore_2
    //   674: iload 13
    //   676: aload_1
    //   677: arraylength
    //   678: if_icmpge +32 -> 710
    //   681: aload_3
    //   682: astore_2
    //   683: aload_0
    //   684: getfield 26	T/a$c:d	[B
    //   687: iload 13
    //   689: baload
    //   690: aload_1
    //   691: iload 13
    //   693: baload
    //   694: if_icmpeq +10 -> 704
    //   697: iload 12
    //   699: istore 13
    //   701: goto +15 -> 716
    //   704: iinc 13 1
    //   707: goto -41 -> 666
    //   710: aload_3
    //   711: astore_2
    //   712: aload_1
    //   713: arraylength
    //   714: istore 13
    //   716: aload_3
    //   717: astore_2
    //   718: new 35	java/lang/StringBuilder
    //   721: astore_1
    //   722: aload_3
    //   723: astore_2
    //   724: aload_1
    //   725: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   728: aload_3
    //   729: astore_2
    //   730: iload 13
    //   732: aload_0
    //   733: getfield 22	T/a$c:b	I
    //   736: if_icmpge +57 -> 793
    //   739: aload_3
    //   740: astore_2
    //   741: aload_0
    //   742: getfield 26	T/a$c:d	[B
    //   745: iload 13
    //   747: baload
    //   748: istore 12
    //   750: iload 12
    //   752: ifne +6 -> 758
    //   755: goto +38 -> 793
    //   758: iload 12
    //   760: bipush 32
    //   762: if_icmplt +16 -> 778
    //   765: aload_3
    //   766: astore_2
    //   767: aload_1
    //   768: iload 12
    //   770: i2c
    //   771: invokevirtual 43	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: goto +12 -> 787
    //   778: aload_3
    //   779: astore_2
    //   780: aload_1
    //   781: bipush 63
    //   783: invokevirtual 43	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   786: pop
    //   787: iinc 13 1
    //   790: goto -62 -> 728
    //   793: aload_3
    //   794: astore_2
    //   795: aload_1
    //   796: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   799: astore_1
    //   800: aload_3
    //   801: invokevirtual 179	java/io/InputStream:close	()V
    //   804: goto +13 -> 817
    //   807: astore_2
    //   808: ldc -75
    //   810: ldc -73
    //   812: aload_2
    //   813: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   816: pop
    //   817: aload_1
    //   818: areturn
    //   819: aload_3
    //   820: astore_2
    //   821: aload_0
    //   822: getfield 26	T/a$c:d	[B
    //   825: astore_1
    //   826: aload_3
    //   827: astore_2
    //   828: aload_1
    //   829: arraylength
    //   830: iconst_1
    //   831: if_icmpne +60 -> 891
    //   834: aload_1
    //   835: iconst_0
    //   836: baload
    //   837: istore 13
    //   839: iload 13
    //   841: iflt +50 -> 891
    //   844: iload 13
    //   846: iconst_1
    //   847: if_icmpgt +44 -> 891
    //   850: aload_3
    //   851: astore_2
    //   852: new 53	java/lang/String
    //   855: dup
    //   856: iconst_1
    //   857: newarray <illegal type>
    //   859: dup
    //   860: iconst_0
    //   861: iload 13
    //   863: bipush 48
    //   865: iadd
    //   866: i2c
    //   867: castore
    //   868: invokespecial 218	java/lang/String:<init>	([C)V
    //   871: astore_1
    //   872: aload_3
    //   873: invokevirtual 179	java/io/InputStream:close	()V
    //   876: goto +13 -> 889
    //   879: astore_2
    //   880: ldc -75
    //   882: ldc -73
    //   884: aload_2
    //   885: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   888: pop
    //   889: aload_1
    //   890: areturn
    //   891: aload_3
    //   892: astore_2
    //   893: new 53	java/lang/String
    //   896: dup
    //   897: aload_1
    //   898: getstatic 51	T/a:o0	Ljava/nio/charset/Charset;
    //   901: invokespecial 221	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   904: astore_1
    //   905: aload_3
    //   906: invokevirtual 179	java/io/InputStream:close	()V
    //   909: goto +13 -> 922
    //   912: astore_2
    //   913: ldc -75
    //   915: ldc -73
    //   917: aload_2
    //   918: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   921: pop
    //   922: aload_1
    //   923: areturn
    //   924: astore_1
    //   925: goto +40 -> 965
    //   928: astore_3
    //   929: aconst_null
    //   930: astore_1
    //   931: aload_1
    //   932: astore_2
    //   933: ldc -75
    //   935: ldc -33
    //   937: aload_3
    //   938: invokestatic 226	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   941: pop
    //   942: aload_1
    //   943: ifnull +20 -> 963
    //   946: aload_1
    //   947: invokevirtual 179	java/io/InputStream:close	()V
    //   950: goto +13 -> 963
    //   953: astore_1
    //   954: ldc -75
    //   956: ldc -73
    //   958: aload_1
    //   959: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   962: pop
    //   963: aconst_null
    //   964: areturn
    //   965: aload_2
    //   966: ifnull +20 -> 986
    //   969: aload_2
    //   970: invokevirtual 179	java/io/InputStream:close	()V
    //   973: goto +13 -> 986
    //   976: astore_2
    //   977: ldc -75
    //   979: ldc -73
    //   981: aload_2
    //   982: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   985: pop
    //   986: aload_1
    //   987: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	988	0	this	c
    //   0	988	1	paramByteOrder	ByteOrder
    //   1	160	2	localObject1	Object
    //   179	4	2	localIOException1	java.io.IOException
    //   194	6	2	localIOException2	java.io.IOException
    //   207	25	2	localObject2	Object
    //   254	6	2	localIOException3	java.io.IOException
    //   267	26	2	localObject3	Object
    //   327	6	2	localIOException4	java.io.IOException
    //   340	25	2	localObject4	Object
    //   386	6	2	localIOException5	java.io.IOException
    //   399	25	2	localObject5	Object
    //   445	6	2	localIOException6	java.io.IOException
    //   458	26	2	localObject6	Object
    //   516	6	2	localIOException7	java.io.IOException
    //   529	25	2	localObject7	Object
    //   575	6	2	localIOException8	java.io.IOException
    //   588	25	2	localObject8	Object
    //   634	6	2	localIOException9	java.io.IOException
    //   647	148	2	localObject9	Object
    //   807	6	2	localIOException10	java.io.IOException
    //   820	32	2	localObject10	Object
    //   879	6	2	localIOException11	java.io.IOException
    //   892	1	2	localObject11	Object
    //   912	6	2	localIOException12	java.io.IOException
    //   932	38	2	localByteOrder	ByteOrder
    //   976	6	2	localIOException13	java.io.IOException
    //   5	901	3	localObject12	Object
    //   928	10	3	localIOException14	java.io.IOException
    //   27	30	4	i	int
    //   30	186	5	j	int
    //   33	244	6	k	int
    //   36	313	7	m	int
    //   39	369	8	n	int
    //   42	426	9	i1	int
    //   45	493	10	i2	int
    //   48	549	11	i3	int
    //   51	718	12	i4	int
    //   54	812	13	i5	int
    // Exception table:
    //   from	to	target	type
    //   120	124	127	java/io/IOException
    //   16	21	175	finally
    //   23	29	175	finally
    //   141	148	175	finally
    //   150	159	175	finally
    //   161	169	175	finally
    //   208	215	175	finally
    //   221	230	175	finally
    //   232	241	175	finally
    //   268	276	175	finally
    //   282	291	175	finally
    //   293	314	175	finally
    //   341	348	175	finally
    //   354	363	175	finally
    //   365	373	175	finally
    //   400	407	175	finally
    //   413	422	175	finally
    //   424	432	175	finally
    //   459	467	175	finally
    //   473	482	175	finally
    //   484	503	175	finally
    //   530	537	175	finally
    //   543	552	175	finally
    //   554	562	175	finally
    //   589	596	175	finally
    //   602	611	175	finally
    //   613	621	175	finally
    //   652	663	175	finally
    //   668	672	175	finally
    //   674	681	175	finally
    //   683	697	175	finally
    //   712	716	175	finally
    //   718	722	175	finally
    //   724	728	175	finally
    //   730	739	175	finally
    //   741	750	175	finally
    //   767	775	175	finally
    //   780	787	175	finally
    //   795	800	175	finally
    //   821	826	175	finally
    //   828	834	175	finally
    //   852	872	175	finally
    //   893	905	175	finally
    //   933	942	175	finally
    //   16	21	179	java/io/IOException
    //   23	29	179	java/io/IOException
    //   141	148	179	java/io/IOException
    //   150	159	179	java/io/IOException
    //   161	169	179	java/io/IOException
    //   208	215	179	java/io/IOException
    //   221	230	179	java/io/IOException
    //   232	241	179	java/io/IOException
    //   268	276	179	java/io/IOException
    //   282	291	179	java/io/IOException
    //   293	314	179	java/io/IOException
    //   341	348	179	java/io/IOException
    //   354	363	179	java/io/IOException
    //   365	373	179	java/io/IOException
    //   400	407	179	java/io/IOException
    //   413	422	179	java/io/IOException
    //   424	432	179	java/io/IOException
    //   459	467	179	java/io/IOException
    //   473	482	179	java/io/IOException
    //   484	503	179	java/io/IOException
    //   530	537	179	java/io/IOException
    //   543	552	179	java/io/IOException
    //   554	562	179	java/io/IOException
    //   589	596	179	java/io/IOException
    //   602	611	179	java/io/IOException
    //   613	621	179	java/io/IOException
    //   652	663	179	java/io/IOException
    //   668	672	179	java/io/IOException
    //   674	681	179	java/io/IOException
    //   683	697	179	java/io/IOException
    //   712	716	179	java/io/IOException
    //   718	722	179	java/io/IOException
    //   724	728	179	java/io/IOException
    //   730	739	179	java/io/IOException
    //   741	750	179	java/io/IOException
    //   767	775	179	java/io/IOException
    //   780	787	179	java/io/IOException
    //   795	800	179	java/io/IOException
    //   821	826	179	java/io/IOException
    //   828	834	179	java/io/IOException
    //   852	872	179	java/io/IOException
    //   893	905	179	java/io/IOException
    //   187	191	194	java/io/IOException
    //   247	251	254	java/io/IOException
    //   320	324	327	java/io/IOException
    //   379	383	386	java/io/IOException
    //   438	442	445	java/io/IOException
    //   509	513	516	java/io/IOException
    //   568	572	575	java/io/IOException
    //   627	631	634	java/io/IOException
    //   800	804	807	java/io/IOException
    //   872	876	879	java/io/IOException
    //   905	909	912	java/io/IOException
    //   2	14	924	finally
    //   2	14	928	java/io/IOException
    //   946	950	953	java/io/IOException
    //   969	973	976	java/io/IOException
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    localStringBuilder.append(a.V[a]);
    localStringBuilder.append(", data length:");
    localStringBuilder.append(d.length);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     T.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */