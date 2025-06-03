package androidx.exifinterface.media;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import z2;

class ExifInterface$ExifAttribute
{
  public final byte[] bytes;
  public final int format;
  public final int numberOfComponents;
  
  public ExifInterface$ExifAttribute(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    format = paramInt1;
    numberOfComponents = paramInt2;
    bytes = paramArrayOfByte;
  }
  
  public static ExifAttribute createByte(String paramString)
  {
    if ((paramString.length() == 1) && (paramString.charAt(0) >= '0') && (paramString.charAt(0) <= '1')) {
      return new ExifAttribute(1, 1, new byte[] { (byte)(paramString.charAt(0) - '0') });
    }
    paramString = paramString.getBytes(ExifInterface.ASCII);
    return new ExifAttribute(1, paramString.length, paramString);
  }
  
  public static ExifAttribute createDouble(double paramDouble, ByteOrder paramByteOrder)
  {
    return createDouble(new double[] { paramDouble }, paramByteOrder);
  }
  
  public static ExifAttribute createDouble(double[] paramArrayOfDouble, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * paramArrayOfDouble.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfDouble.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putDouble(paramArrayOfDouble[j]);
    }
    return new ExifAttribute(12, paramArrayOfDouble.length, localByteBuffer.array());
  }
  
  public static ExifAttribute createSLong(int paramInt, ByteOrder paramByteOrder)
  {
    return createSLong(new int[] { paramInt }, paramByteOrder);
  }
  
  public static ExifAttribute createSLong(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * paramArrayOfInt.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putInt(paramArrayOfInt[j]);
    }
    return new ExifAttribute(9, paramArrayOfInt.length, localByteBuffer.array());
  }
  
  public static ExifAttribute createSRational(ExifInterface.Rational paramRational, ByteOrder paramByteOrder)
  {
    return createSRational(new ExifInterface.Rational[] { paramRational }, paramByteOrder);
  }
  
  public static ExifAttribute createSRational(ExifInterface.Rational[] paramArrayOfRational, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * paramArrayOfRational.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfRational.length;
    for (int j = 0; j < i; j++)
    {
      paramByteOrder = paramArrayOfRational[j];
      localByteBuffer.putInt((int)numerator);
      localByteBuffer.putInt((int)denominator);
    }
    return new ExifAttribute(10, paramArrayOfRational.length, localByteBuffer.array());
  }
  
  public static ExifAttribute createString(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append('\000');
    paramString = localStringBuilder.toString().getBytes(ExifInterface.ASCII);
    return new ExifAttribute(2, paramString.length, paramString);
  }
  
  public static ExifAttribute createULong(long paramLong, ByteOrder paramByteOrder)
  {
    return createULong(new long[] { paramLong }, paramByteOrder);
  }
  
  public static ExifAttribute createULong(long[] paramArrayOfLong, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * paramArrayOfLong.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfLong.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putInt((int)paramArrayOfLong[j]);
    }
    return new ExifAttribute(4, paramArrayOfLong.length, localByteBuffer.array());
  }
  
  public static ExifAttribute createURational(ExifInterface.Rational paramRational, ByteOrder paramByteOrder)
  {
    return createURational(new ExifInterface.Rational[] { paramRational }, paramByteOrder);
  }
  
  public static ExifAttribute createURational(ExifInterface.Rational[] paramArrayOfRational, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * paramArrayOfRational.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfRational.length;
    for (int j = 0; j < i; j++)
    {
      paramByteOrder = paramArrayOfRational[j];
      localByteBuffer.putInt((int)numerator);
      localByteBuffer.putInt((int)denominator);
    }
    return new ExifAttribute(5, paramArrayOfRational.length, localByteBuffer.array());
  }
  
  public static ExifAttribute createUShort(int paramInt, ByteOrder paramByteOrder)
  {
    return createUShort(new int[] { paramInt }, paramByteOrder);
  }
  
  public static ExifAttribute createUShort(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * paramArrayOfInt.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putShort((short)paramArrayOfInt[j]);
    }
    return new ExifAttribute(3, paramArrayOfInt.length, localByteBuffer.array());
  }
  
  public double getDoubleValue(ByteOrder paramByteOrder)
  {
    paramByteOrder = getValue(paramByteOrder);
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
      if ((paramByteOrder instanceof ExifInterface.Rational[]))
      {
        paramByteOrder = (ExifInterface.Rational[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0].calculate();
        }
        throw new NumberFormatException("There are more than one component");
      }
      throw new NumberFormatException("Couldn't find a double value");
    }
    throw new NumberFormatException("NULL can't be converted to a double value");
  }
  
  public int getIntValue(ByteOrder paramByteOrder)
  {
    paramByteOrder = getValue(paramByteOrder);
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
  
  public String getStringValue(ByteOrder paramByteOrder)
  {
    Object localObject = getValue(paramByteOrder);
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
    if ((localObject instanceof ExifInterface.Rational[]))
    {
      localObject = (ExifInterface.Rational[])localObject;
      m = k;
      while (m < localObject.length)
      {
        paramByteOrder.append(numerator);
        paramByteOrder.append('/');
        paramByteOrder.append(denominator);
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
  public Object getValue(ByteOrder paramByteOrder)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 189	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
    //   11: invokespecial 192	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:<init>	([B)V
    //   14: aload_3
    //   15: astore_2
    //   16: aload_3
    //   17: aload_1
    //   18: invokevirtual 196	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:setByteOrder	(Ljava/nio/ByteOrder;)V
    //   21: aload_3
    //   22: astore_2
    //   23: aload_0
    //   24: getfield 19	androidx/exifinterface/media/ExifInterface$ExifAttribute:format	I
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
    //   56: iconst_1
    //   57: istore 14
    //   59: iload 4
    //   61: tableswitch	default:+63->124, 1:+746->807, 2:+561->622, 3:+502->563, 4:+443->504, 5:+372->433, 6:+746->807, 7:+561->622, 8:+313->374, 9:+254->315, 10:+181->242, 11:+121->182, 12:+66->127
    //   124: goto +788 -> 912
    //   127: aload_3
    //   128: astore_2
    //   129: aload_0
    //   130: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   133: newarray <illegal type>
    //   135: astore_1
    //   136: aload_3
    //   137: astore_2
    //   138: iload 13
    //   140: aload_0
    //   141: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   144: if_icmpge +19 -> 163
    //   147: aload_3
    //   148: astore_2
    //   149: aload_1
    //   150: iload 13
    //   152: aload_3
    //   153: invokevirtual 199	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readDouble	()D
    //   156: dastore
    //   157: iinc 13 1
    //   160: goto -24 -> 136
    //   163: aload_3
    //   164: invokevirtual 204	java/io/InputStream:close	()V
    //   167: goto +13 -> 180
    //   170: astore_2
    //   171: ldc -50
    //   173: ldc -48
    //   175: aload_2
    //   176: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   179: pop
    //   180: aload_1
    //   181: areturn
    //   182: aload_3
    //   183: astore_2
    //   184: aload_0
    //   185: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   188: newarray <illegal type>
    //   190: astore_1
    //   191: iload 5
    //   193: istore 13
    //   195: aload_3
    //   196: astore_2
    //   197: iload 13
    //   199: aload_0
    //   200: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   203: if_icmpge +20 -> 223
    //   206: aload_3
    //   207: astore_2
    //   208: aload_1
    //   209: iload 13
    //   211: aload_3
    //   212: invokevirtual 218	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readFloat	()F
    //   215: f2d
    //   216: dastore
    //   217: iinc 13 1
    //   220: goto -25 -> 195
    //   223: aload_3
    //   224: invokevirtual 204	java/io/InputStream:close	()V
    //   227: goto +13 -> 240
    //   230: astore_2
    //   231: ldc -50
    //   233: ldc -48
    //   235: aload_2
    //   236: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   239: pop
    //   240: aload_1
    //   241: areturn
    //   242: aload_3
    //   243: astore_2
    //   244: aload_0
    //   245: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   248: anewarray 86	androidx/exifinterface/media/ExifInterface$Rational
    //   251: astore_1
    //   252: iload 6
    //   254: istore 13
    //   256: aload_3
    //   257: astore_2
    //   258: iload 13
    //   260: aload_0
    //   261: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   264: if_icmpge +32 -> 296
    //   267: aload_3
    //   268: astore_2
    //   269: aload_1
    //   270: iload 13
    //   272: new 86	androidx/exifinterface/media/ExifInterface$Rational
    //   275: dup
    //   276: aload_3
    //   277: invokevirtual 221	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readInt	()I
    //   280: i2l
    //   281: aload_3
    //   282: invokevirtual 221	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readInt	()I
    //   285: i2l
    //   286: invokespecial 224	androidx/exifinterface/media/ExifInterface$Rational:<init>	(JJ)V
    //   289: aastore
    //   290: iinc 13 1
    //   293: goto -37 -> 256
    //   296: aload_3
    //   297: invokevirtual 204	java/io/InputStream:close	()V
    //   300: goto +13 -> 313
    //   303: astore_2
    //   304: ldc -50
    //   306: ldc -48
    //   308: aload_2
    //   309: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   312: pop
    //   313: aload_1
    //   314: areturn
    //   315: aload_3
    //   316: astore_2
    //   317: aload_0
    //   318: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   321: newarray <illegal type>
    //   323: astore_1
    //   324: iload 7
    //   326: istore 13
    //   328: aload_3
    //   329: astore_2
    //   330: iload 13
    //   332: aload_0
    //   333: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   336: if_icmpge +19 -> 355
    //   339: aload_3
    //   340: astore_2
    //   341: aload_1
    //   342: iload 13
    //   344: aload_3
    //   345: invokevirtual 221	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readInt	()I
    //   348: iastore
    //   349: iinc 13 1
    //   352: goto -24 -> 328
    //   355: aload_3
    //   356: invokevirtual 204	java/io/InputStream:close	()V
    //   359: goto +13 -> 372
    //   362: astore_2
    //   363: ldc -50
    //   365: ldc -48
    //   367: aload_2
    //   368: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   371: pop
    //   372: aload_1
    //   373: areturn
    //   374: aload_3
    //   375: astore_2
    //   376: aload_0
    //   377: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   380: newarray <illegal type>
    //   382: astore_1
    //   383: iload 8
    //   385: istore 13
    //   387: aload_3
    //   388: astore_2
    //   389: iload 13
    //   391: aload_0
    //   392: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   395: if_icmpge +19 -> 414
    //   398: aload_3
    //   399: astore_2
    //   400: aload_1
    //   401: iload 13
    //   403: aload_3
    //   404: invokevirtual 228	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readShort	()S
    //   407: iastore
    //   408: iinc 13 1
    //   411: goto -24 -> 387
    //   414: aload_3
    //   415: invokevirtual 204	java/io/InputStream:close	()V
    //   418: goto +13 -> 431
    //   421: astore_2
    //   422: ldc -50
    //   424: ldc -48
    //   426: aload_2
    //   427: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   430: pop
    //   431: aload_1
    //   432: areturn
    //   433: aload_3
    //   434: astore_2
    //   435: aload_0
    //   436: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   439: anewarray 86	androidx/exifinterface/media/ExifInterface$Rational
    //   442: astore_1
    //   443: iload 9
    //   445: istore 13
    //   447: aload_3
    //   448: astore_2
    //   449: iload 13
    //   451: aload_0
    //   452: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   455: if_icmpge +30 -> 485
    //   458: aload_3
    //   459: astore_2
    //   460: aload_1
    //   461: iload 13
    //   463: new 86	androidx/exifinterface/media/ExifInterface$Rational
    //   466: dup
    //   467: aload_3
    //   468: invokevirtual 232	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedInt	()J
    //   471: aload_3
    //   472: invokevirtual 232	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedInt	()J
    //   475: invokespecial 224	androidx/exifinterface/media/ExifInterface$Rational:<init>	(JJ)V
    //   478: aastore
    //   479: iinc 13 1
    //   482: goto -35 -> 447
    //   485: aload_3
    //   486: invokevirtual 204	java/io/InputStream:close	()V
    //   489: goto +13 -> 502
    //   492: astore_2
    //   493: ldc -50
    //   495: ldc -48
    //   497: aload_2
    //   498: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   501: pop
    //   502: aload_1
    //   503: areturn
    //   504: aload_3
    //   505: astore_2
    //   506: aload_0
    //   507: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   510: newarray <illegal type>
    //   512: astore_1
    //   513: iload 10
    //   515: istore 13
    //   517: aload_3
    //   518: astore_2
    //   519: iload 13
    //   521: aload_0
    //   522: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   525: if_icmpge +19 -> 544
    //   528: aload_3
    //   529: astore_2
    //   530: aload_1
    //   531: iload 13
    //   533: aload_3
    //   534: invokevirtual 232	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedInt	()J
    //   537: lastore
    //   538: iinc 13 1
    //   541: goto -24 -> 517
    //   544: aload_3
    //   545: invokevirtual 204	java/io/InputStream:close	()V
    //   548: goto +13 -> 561
    //   551: astore_2
    //   552: ldc -50
    //   554: ldc -48
    //   556: aload_2
    //   557: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   560: pop
    //   561: aload_1
    //   562: areturn
    //   563: aload_3
    //   564: astore_2
    //   565: aload_0
    //   566: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   569: newarray <illegal type>
    //   571: astore_1
    //   572: iload 11
    //   574: istore 13
    //   576: aload_3
    //   577: astore_2
    //   578: iload 13
    //   580: aload_0
    //   581: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   584: if_icmpge +19 -> 603
    //   587: aload_3
    //   588: astore_2
    //   589: aload_1
    //   590: iload 13
    //   592: aload_3
    //   593: invokevirtual 235	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedShort	()I
    //   596: iastore
    //   597: iinc 13 1
    //   600: goto -24 -> 576
    //   603: aload_3
    //   604: invokevirtual 204	java/io/InputStream:close	()V
    //   607: goto +13 -> 620
    //   610: astore_2
    //   611: ldc -50
    //   613: ldc -48
    //   615: aload_2
    //   616: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   619: pop
    //   620: aload_1
    //   621: areturn
    //   622: iload 12
    //   624: istore 13
    //   626: aload_3
    //   627: astore_2
    //   628: aload_0
    //   629: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   632: getstatic 238	androidx/exifinterface/media/ExifInterface:EXIF_ASCII_PREFIX	[B
    //   635: arraylength
    //   636: if_icmplt +68 -> 704
    //   639: iconst_0
    //   640: istore 13
    //   642: aload_3
    //   643: astore_2
    //   644: getstatic 238	androidx/exifinterface/media/ExifInterface:EXIF_ASCII_PREFIX	[B
    //   647: astore_1
    //   648: iload 14
    //   650: istore 5
    //   652: aload_3
    //   653: astore_2
    //   654: iload 13
    //   656: aload_1
    //   657: arraylength
    //   658: if_icmpge +31 -> 689
    //   661: aload_3
    //   662: astore_2
    //   663: aload_0
    //   664: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
    //   667: iload 13
    //   669: baload
    //   670: aload_1
    //   671: iload 13
    //   673: baload
    //   674: if_icmpeq +9 -> 683
    //   677: iconst_0
    //   678: istore 5
    //   680: goto +9 -> 689
    //   683: iinc 13 1
    //   686: goto -44 -> 642
    //   689: iload 12
    //   691: istore 13
    //   693: iload 5
    //   695: ifeq +9 -> 704
    //   698: aload_3
    //   699: astore_2
    //   700: aload_1
    //   701: arraylength
    //   702: istore 13
    //   704: aload_3
    //   705: astore_2
    //   706: new 99	java/lang/StringBuilder
    //   709: astore_1
    //   710: aload_3
    //   711: astore_2
    //   712: aload_1
    //   713: invokespecial 100	java/lang/StringBuilder:<init>	()V
    //   716: aload_3
    //   717: astore_2
    //   718: iload 13
    //   720: aload_0
    //   721: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
    //   724: if_icmpge +57 -> 781
    //   727: aload_3
    //   728: astore_2
    //   729: aload_0
    //   730: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
    //   733: iload 13
    //   735: baload
    //   736: istore 5
    //   738: iload 5
    //   740: ifne +6 -> 746
    //   743: goto +38 -> 781
    //   746: iload 5
    //   748: bipush 32
    //   750: if_icmplt +16 -> 766
    //   753: aload_3
    //   754: astore_2
    //   755: aload_1
    //   756: iload 5
    //   758: i2c
    //   759: invokevirtual 107	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   762: pop
    //   763: goto +12 -> 775
    //   766: aload_3
    //   767: astore_2
    //   768: aload_1
    //   769: bipush 63
    //   771: invokevirtual 107	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: iinc 13 1
    //   778: goto -62 -> 716
    //   781: aload_3
    //   782: astore_2
    //   783: aload_1
    //   784: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   787: astore_1
    //   788: aload_3
    //   789: invokevirtual 204	java/io/InputStream:close	()V
    //   792: goto +13 -> 805
    //   795: astore_2
    //   796: ldc -50
    //   798: ldc -48
    //   800: aload_2
    //   801: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   804: pop
    //   805: aload_1
    //   806: areturn
    //   807: aload_3
    //   808: astore_2
    //   809: aload_0
    //   810: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
    //   813: astore_1
    //   814: aload_3
    //   815: astore_2
    //   816: aload_1
    //   817: arraylength
    //   818: iconst_1
    //   819: if_icmpne +60 -> 879
    //   822: aload_1
    //   823: iconst_0
    //   824: baload
    //   825: istore 13
    //   827: iload 13
    //   829: iflt +50 -> 879
    //   832: iload 13
    //   834: iconst_1
    //   835: if_icmpgt +44 -> 879
    //   838: aload_3
    //   839: astore_2
    //   840: new 28	java/lang/String
    //   843: dup
    //   844: iconst_1
    //   845: newarray <illegal type>
    //   847: dup
    //   848: iconst_0
    //   849: iload 13
    //   851: bipush 48
    //   853: iadd
    //   854: i2c
    //   855: castore
    //   856: invokespecial 241	java/lang/String:<init>	([C)V
    //   859: astore_1
    //   860: aload_3
    //   861: invokevirtual 204	java/io/InputStream:close	()V
    //   864: goto +13 -> 877
    //   867: astore_2
    //   868: ldc -50
    //   870: ldc -48
    //   872: aload_2
    //   873: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   876: pop
    //   877: aload_1
    //   878: areturn
    //   879: aload_3
    //   880: astore_2
    //   881: new 28	java/lang/String
    //   884: dup
    //   885: aload_1
    //   886: getstatic 42	androidx/exifinterface/media/ExifInterface:ASCII	Ljava/nio/charset/Charset;
    //   889: invokespecial 244	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   892: astore_1
    //   893: aload_3
    //   894: invokevirtual 204	java/io/InputStream:close	()V
    //   897: goto +13 -> 910
    //   900: astore_2
    //   901: ldc -50
    //   903: ldc -48
    //   905: aload_2
    //   906: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   909: pop
    //   910: aload_1
    //   911: areturn
    //   912: aload_3
    //   913: invokevirtual 204	java/io/InputStream:close	()V
    //   916: goto +13 -> 929
    //   919: astore_1
    //   920: ldc -50
    //   922: ldc -48
    //   924: aload_1
    //   925: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   928: pop
    //   929: aconst_null
    //   930: areturn
    //   931: astore_2
    //   932: aload_3
    //   933: astore_1
    //   934: aload_2
    //   935: astore_3
    //   936: goto +10 -> 946
    //   939: astore_1
    //   940: goto +41 -> 981
    //   943: astore_3
    //   944: aconst_null
    //   945: astore_1
    //   946: aload_1
    //   947: astore_2
    //   948: ldc -50
    //   950: ldc -10
    //   952: aload_3
    //   953: invokestatic 249	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   956: pop
    //   957: aload_1
    //   958: ifnull +20 -> 978
    //   961: aload_1
    //   962: invokevirtual 204	java/io/InputStream:close	()V
    //   965: goto +13 -> 978
    //   968: astore_1
    //   969: ldc -50
    //   971: ldc -48
    //   973: aload_1
    //   974: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   977: pop
    //   978: aconst_null
    //   979: areturn
    //   980: astore_1
    //   981: aload_2
    //   982: ifnull +20 -> 1002
    //   985: aload_2
    //   986: invokevirtual 204	java/io/InputStream:close	()V
    //   989: goto +13 -> 1002
    //   992: astore_2
    //   993: ldc -50
    //   995: ldc -48
    //   997: aload_2
    //   998: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1001: pop
    //   1002: aload_1
    //   1003: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1004	0	this	ExifAttribute
    //   0	1004	1	paramByteOrder	ByteOrder
    //   1	148	2	localObject1	Object
    //   170	6	2	localIOException1	java.io.IOException
    //   183	25	2	localObject2	Object
    //   230	6	2	localIOException2	java.io.IOException
    //   243	26	2	localObject3	Object
    //   303	6	2	localIOException3	java.io.IOException
    //   316	25	2	localObject4	Object
    //   362	6	2	localIOException4	java.io.IOException
    //   375	25	2	localObject5	Object
    //   421	6	2	localIOException5	java.io.IOException
    //   434	26	2	localObject6	Object
    //   492	6	2	localIOException6	java.io.IOException
    //   505	25	2	localObject7	Object
    //   551	6	2	localIOException7	java.io.IOException
    //   564	25	2	localObject8	Object
    //   610	6	2	localIOException8	java.io.IOException
    //   627	156	2	localObject9	Object
    //   795	6	2	localIOException9	java.io.IOException
    //   808	32	2	localObject10	Object
    //   867	6	2	localIOException10	java.io.IOException
    //   880	1	2	localObject11	Object
    //   900	6	2	localIOException11	java.io.IOException
    //   931	4	2	localIOException12	java.io.IOException
    //   947	39	2	localByteOrder	ByteOrder
    //   992	6	2	localIOException13	java.io.IOException
    //   5	931	3	localObject12	Object
    //   943	10	3	localIOException14	java.io.IOException
    //   27	33	4	i	int
    //   30	727	5	j	int
    //   33	220	6	k	int
    //   36	289	7	m	int
    //   39	345	8	n	int
    //   42	402	9	i1	int
    //   45	469	10	i2	int
    //   48	525	11	i3	int
    //   51	639	12	i4	int
    //   54	800	13	i5	int
    //   57	592	14	i6	int
    // Exception table:
    //   from	to	target	type
    //   163	167	170	java/io/IOException
    //   223	227	230	java/io/IOException
    //   296	300	303	java/io/IOException
    //   355	359	362	java/io/IOException
    //   414	418	421	java/io/IOException
    //   485	489	492	java/io/IOException
    //   544	548	551	java/io/IOException
    //   603	607	610	java/io/IOException
    //   788	792	795	java/io/IOException
    //   860	864	867	java/io/IOException
    //   893	897	900	java/io/IOException
    //   912	916	919	java/io/IOException
    //   16	21	931	java/io/IOException
    //   23	29	931	java/io/IOException
    //   129	136	931	java/io/IOException
    //   138	147	931	java/io/IOException
    //   149	157	931	java/io/IOException
    //   184	191	931	java/io/IOException
    //   197	206	931	java/io/IOException
    //   208	217	931	java/io/IOException
    //   244	252	931	java/io/IOException
    //   258	267	931	java/io/IOException
    //   269	290	931	java/io/IOException
    //   317	324	931	java/io/IOException
    //   330	339	931	java/io/IOException
    //   341	349	931	java/io/IOException
    //   376	383	931	java/io/IOException
    //   389	398	931	java/io/IOException
    //   400	408	931	java/io/IOException
    //   435	443	931	java/io/IOException
    //   449	458	931	java/io/IOException
    //   460	479	931	java/io/IOException
    //   506	513	931	java/io/IOException
    //   519	528	931	java/io/IOException
    //   530	538	931	java/io/IOException
    //   565	572	931	java/io/IOException
    //   578	587	931	java/io/IOException
    //   589	597	931	java/io/IOException
    //   628	639	931	java/io/IOException
    //   644	648	931	java/io/IOException
    //   654	661	931	java/io/IOException
    //   663	677	931	java/io/IOException
    //   700	704	931	java/io/IOException
    //   706	710	931	java/io/IOException
    //   712	716	931	java/io/IOException
    //   718	727	931	java/io/IOException
    //   729	738	931	java/io/IOException
    //   755	763	931	java/io/IOException
    //   768	775	931	java/io/IOException
    //   783	788	931	java/io/IOException
    //   809	814	931	java/io/IOException
    //   816	822	931	java/io/IOException
    //   840	860	931	java/io/IOException
    //   881	893	931	java/io/IOException
    //   2	14	939	finally
    //   2	14	943	java/io/IOException
    //   961	965	968	java/io/IOException
    //   16	21	980	finally
    //   23	29	980	finally
    //   129	136	980	finally
    //   138	147	980	finally
    //   149	157	980	finally
    //   184	191	980	finally
    //   197	206	980	finally
    //   208	217	980	finally
    //   244	252	980	finally
    //   258	267	980	finally
    //   269	290	980	finally
    //   317	324	980	finally
    //   330	339	980	finally
    //   341	349	980	finally
    //   376	383	980	finally
    //   389	398	980	finally
    //   400	408	980	finally
    //   435	443	980	finally
    //   449	458	980	finally
    //   460	479	980	finally
    //   506	513	980	finally
    //   519	528	980	finally
    //   530	538	980	finally
    //   565	572	980	finally
    //   578	587	980	finally
    //   589	597	980	finally
    //   628	639	980	finally
    //   644	648	980	finally
    //   654	661	980	finally
    //   663	677	980	finally
    //   700	704	980	finally
    //   706	710	980	finally
    //   712	716	980	finally
    //   718	727	980	finally
    //   729	738	980	finally
    //   755	763	980	finally
    //   768	775	980	finally
    //   783	788	980	finally
    //   809	814	980	finally
    //   816	822	980	finally
    //   840	860	980	finally
    //   881	893	980	finally
    //   948	957	980	finally
    //   985	989	992	java/io/IOException
  }
  
  public int size()
  {
    return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[format] * numberOfComponents;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("(");
    localStringBuilder.append(ExifInterface.IFD_FORMAT_NAMES[format]);
    localStringBuilder.append(", data length:");
    return z2.q(localStringBuilder, bytes.length, ")");
  }
}

/* Location:
 * Qualified Name:     androidx.exifinterface.media.ExifInterface.ExifAttribute
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */