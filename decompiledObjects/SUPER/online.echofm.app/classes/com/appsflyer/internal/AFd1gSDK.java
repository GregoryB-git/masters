package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;

public final class AFd1gSDK
  extends AFd1zSDK<AFd1dSDK>
{
  public AFd1dSDK AFLogger = null;
  private final AFb1ySDK AFLogger$LogLevel;
  private final AFe1zSDK AFVersionDeclaration;
  private final AFb1gSDK afDebugLog;
  private final AFd1cSDK afErrorLog;
  private final AFc1oSDK afErrorLogForExcManagerOnly;
  public final AFd1bSDK afInfoLog;
  public AFf1zSDK afRDLog;
  private final String afWarnLog;
  private final AFe1wSDK getLevel;
  
  public AFd1gSDK(@NonNull AFd1cSDK paramAFd1cSDK, @NonNull AFb1gSDK paramAFb1gSDK, @NonNull AFe1wSDK paramAFe1wSDK, @NonNull AFb1ySDK paramAFb1ySDK, @NonNull AFc1oSDK paramAFc1oSDK, @NonNull AFe1zSDK paramAFe1zSDK, @NonNull String paramString, AFd1bSDK paramAFd1bSDK)
  {
    super(AFd1vSDK.values, new AFd1vSDK[0], "UpdateRemoteConfiguration");
    afErrorLog = paramAFd1cSDK;
    afDebugLog = paramAFb1gSDK;
    getLevel = paramAFe1wSDK;
    AFLogger$LogLevel = paramAFb1ySDK;
    afErrorLogForExcManagerOnly = paramAFc1oSDK;
    AFVersionDeclaration = paramAFe1zSDK;
    afWarnLog = paramString;
    afInfoLog = paramAFd1bSDK;
  }
  
  private void AFInAppEventParameterName(String paramString1, long paramLong, AFc1gSDK<?> paramAFc1gSDK, AFe1qSDK paramAFe1qSDK, AFf1wSDK paramAFf1wSDK, String paramString2, Throwable paramThrowable)
  {
    long l;
    if (paramAFc1gSDK != null) {
      l = values.AFKeystoreWrapper;
    }
    for (int i = paramAFc1gSDK.getStatusCode();; i = 0)
    {
      break;
      l = 0L;
    }
    if ((paramThrowable instanceof HttpException))
    {
      paramAFc1gSDK = paramThrowable.getCause();
      l = getMetricsAFKeystoreWrapper;
    }
    else
    {
      paramAFc1gSDK = paramThrowable;
    }
    if (paramAFe1qSDK != null) {}
    for (paramAFe1qSDK = valueOf;; paramAFe1qSDK = null) {
      break;
    }
    afRDLog = new AFf1zSDK(paramAFe1qSDK, paramString1, l, System.currentTimeMillis() - paramLong, i, paramAFf1wSDK, paramString2, paramAFc1gSDK);
  }
  
  /* Error */
  private AFd1dSDK afInfoLog()
  {
    // Byte code:
    //   0: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   3: lstore_1
    //   4: aload_0
    //   5: getfield 55	com/appsflyer/internal/AFd1gSDK:afWarnLog	Ljava/lang/String;
    //   8: astore_3
    //   9: aload_0
    //   10: getfield 47	com/appsflyer/internal/AFd1gSDK:getLevel	Lcom/appsflyer/internal/AFe1wSDK;
    //   13: getfield 115	com/appsflyer/internal/AFe1wSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   16: astore 4
    //   18: aload 4
    //   20: ifnull +74 -> 94
    //   23: aload 4
    //   25: invokevirtual 121	java/lang/String:trim	()Ljava/lang/String;
    //   28: invokevirtual 124	java/lang/String:length	()I
    //   31: ifne +6 -> 37
    //   34: goto +60 -> 94
    //   37: aload_3
    //   38: ifnonnull +13 -> 51
    //   41: ldc 126
    //   43: invokestatic 131	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   46: aconst_null
    //   47: astore_3
    //   48: goto +54 -> 102
    //   51: ldc -123
    //   53: iconst_3
    //   54: anewarray 117	java/lang/String
    //   57: dup
    //   58: iconst_0
    //   59: ldc -121
    //   61: aastore
    //   62: dup
    //   63: iconst_1
    //   64: aload_3
    //   65: aastore
    //   66: dup
    //   67: iconst_2
    //   68: aload_0
    //   69: getfield 45	com/appsflyer/internal/AFd1gSDK:afDebugLog	Lcom/appsflyer/internal/AFb1gSDK;
    //   72: getfield 140	com/appsflyer/internal/AFb1gSDK:valueOf	Lcom/appsflyer/internal/AFb1bSDK;
    //   75: getfield 146	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   78: invokevirtual 151	android/content/Context:getPackageName	()Ljava/lang/String;
    //   81: aastore
    //   82: invokestatic 157	android/text/TextUtils:join	(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //   85: aload 4
    //   87: invokestatic 162	com/appsflyer/internal/AFc1nSDK:valueOf	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   90: astore_3
    //   91: goto +11 -> 102
    //   94: ldc -92
    //   96: invokestatic 131	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   99: goto -53 -> 46
    //   102: aload_3
    //   103: ifnonnull +12 -> 115
    //   106: ldc -90
    //   108: invokestatic 168	com/appsflyer/AFLogger:afRDLog	(Ljava/lang/String;)V
    //   111: getstatic 172	com/appsflyer/internal/AFd1dSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1dSDK;
    //   114: areturn
    //   115: aload_0
    //   116: getfield 53	com/appsflyer/internal/AFd1gSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1zSDK;
    //   119: invokevirtual 177	com/appsflyer/internal/AFe1zSDK:AFInAppEventParameterName	()Z
    //   122: ifeq +419 -> 541
    //   125: ldc -77
    //   127: invokestatic 181	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   130: aload_0
    //   131: getfield 53	com/appsflyer/internal/AFd1gSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1zSDK;
    //   134: invokevirtual 183	com/appsflyer/internal/AFe1zSDK:values	()Z
    //   137: istore 5
    //   139: aload_0
    //   140: getfield 53	com/appsflyer/internal/AFd1gSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1zSDK;
    //   143: invokevirtual 185	com/appsflyer/internal/AFe1zSDK:valueOf	()Z
    //   146: istore 6
    //   148: aload_0
    //   149: getfield 51	com/appsflyer/internal/AFd1gSDK:afErrorLogForExcManagerOnly	Lcom/appsflyer/internal/AFc1oSDK;
    //   152: iload 5
    //   154: iload 6
    //   156: aload_3
    //   157: sipush 1500
    //   160: invokevirtual 190	com/appsflyer/internal/AFc1oSDK:values	(ZZLjava/lang/String;I)Lcom/appsflyer/internal/AFc1qSDK;
    //   163: invokevirtual 195	com/appsflyer/internal/AFc1qSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1gSDK;
    //   166: astore 4
    //   168: aload 4
    //   170: invokevirtual 198	com/appsflyer/internal/AFc1gSDK:isSuccessful	()Z
    //   173: ifeq +322 -> 495
    //   176: aload 4
    //   178: invokevirtual 202	com/appsflyer/internal/AFc1gSDK:getBody	()Ljava/lang/Object;
    //   181: checkcast 90	com/appsflyer/internal/AFe1qSDK
    //   184: astore 7
    //   186: aload 4
    //   188: ldc -52
    //   190: invokevirtual 207	com/appsflyer/internal/AFc1gSDK:AFInAppEventType	(Ljava/lang/String;)Ljava/lang/String;
    //   193: astore 8
    //   195: aload 4
    //   197: ldc -47
    //   199: invokevirtual 207	com/appsflyer/internal/AFc1gSDK:AFInAppEventType	(Ljava/lang/String;)Ljava/lang/String;
    //   202: astore 9
    //   204: aload_0
    //   205: getfield 47	com/appsflyer/internal/AFd1gSDK:getLevel	Lcom/appsflyer/internal/AFe1wSDK;
    //   208: getfield 115	com/appsflyer/internal/AFe1wSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   211: astore 10
    //   213: aload 10
    //   215: ifnull +271 -> 486
    //   218: aload 10
    //   220: invokevirtual 121	java/lang/String:trim	()Ljava/lang/String;
    //   223: invokevirtual 124	java/lang/String:length	()I
    //   226: ifne +6 -> 232
    //   229: goto +257 -> 486
    //   232: aload_0
    //   233: getfield 43	com/appsflyer/internal/AFd1gSDK:afErrorLog	Lcom/appsflyer/internal/AFd1cSDK;
    //   236: aload 7
    //   238: aload 8
    //   240: aload_3
    //   241: aload 10
    //   243: invokevirtual 214	com/appsflyer/internal/AFd1cSDK:valueOf	(Lcom/appsflyer/internal/AFe1qSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFf1xSDK;
    //   246: astore 10
    //   248: aload 10
    //   250: invokevirtual 218	com/appsflyer/internal/AFf1xSDK:AFKeystoreWrapper	()Z
    //   253: ifeq +208 -> 461
    //   256: aload_0
    //   257: getfield 53	com/appsflyer/internal/AFd1gSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1zSDK;
    //   260: invokevirtual 220	com/appsflyer/internal/AFe1zSDK:AFKeystoreWrapper	()J
    //   263: lstore 11
    //   265: new 222	java/lang/StringBuilder
    //   268: astore 8
    //   270: aload 8
    //   272: ldc -32
    //   274: invokespecial 226	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   277: aload 8
    //   279: lload 11
    //   281: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   284: pop
    //   285: aload 8
    //   287: ldc -24
    //   289: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload 8
    //   295: invokevirtual 240	java/lang/Object:toString	()Ljava/lang/String;
    //   298: invokestatic 168	com/appsflyer/AFLogger:afRDLog	(Ljava/lang/String;)V
    //   301: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   304: lstore 13
    //   306: aload_0
    //   307: getfield 49	com/appsflyer/internal/AFd1gSDK:AFLogger$LogLevel	Lcom/appsflyer/internal/AFb1ySDK;
    //   310: astore 8
    //   312: aload 7
    //   314: getfield 242	com/appsflyer/internal/AFe1qSDK:AFInAppEventType	Ljava/lang/String;
    //   317: invokestatic 248	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   320: invokevirtual 252	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   323: iconst_2
    //   324: invokestatic 258	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   327: astore 15
    //   329: aload 8
    //   331: getfield 263	com/appsflyer/internal/AFb1ySDK:AFKeystoreWrapper	Lcom/appsflyer/internal/AFb1dSDK;
    //   334: ldc_w 265
    //   337: aload 15
    //   339: invokeinterface 270 3 0
    //   344: aload 8
    //   346: getfield 263	com/appsflyer/internal/AFb1ySDK:AFKeystoreWrapper	Lcom/appsflyer/internal/AFb1dSDK;
    //   349: ldc_w 272
    //   352: lload 13
    //   354: invokeinterface 275 4 0
    //   359: aload 8
    //   361: getfield 263	com/appsflyer/internal/AFb1ySDK:AFKeystoreWrapper	Lcom/appsflyer/internal/AFb1dSDK;
    //   364: ldc_w 277
    //   367: lload 11
    //   369: invokeinterface 275 4 0
    //   374: aload 8
    //   376: aload 7
    //   378: putfield 280	com/appsflyer/internal/AFb1ySDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFe1qSDK;
    //   381: aload 8
    //   383: lload 13
    //   385: putfield 282	com/appsflyer/internal/AFb1ySDK:valueOf	J
    //   388: aload 8
    //   390: lload 11
    //   392: putfield 284	com/appsflyer/internal/AFb1ySDK:AFInAppEventType	J
    //   395: new 222	java/lang/StringBuilder
    //   398: astore 7
    //   400: aload 7
    //   402: ldc_w 286
    //   405: invokespecial 226	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   408: aload 7
    //   410: lload 11
    //   412: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: aload 7
    //   418: ldc -24
    //   420: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: pop
    //   424: aload 7
    //   426: invokevirtual 240	java/lang/Object:toString	()Ljava/lang/String;
    //   429: invokestatic 288	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   432: aload_0
    //   433: aload_3
    //   434: lload_1
    //   435: aload 10
    //   437: getfield 291	com/appsflyer/internal/AFf1xSDK:valueOf	Lcom/appsflyer/internal/AFf1wSDK;
    //   440: aload 9
    //   442: aload 4
    //   444: invokespecial 294	com/appsflyer/internal/AFd1gSDK:values	(Ljava/lang/String;JLcom/appsflyer/internal/AFf1wSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFc1gSDK;)V
    //   447: getstatic 296	com/appsflyer/internal/AFd1dSDK:values	Lcom/appsflyer/internal/AFd1dSDK;
    //   450: areturn
    //   451: astore 9
    //   453: goto +102 -> 555
    //   456: astore 9
    //   458: goto +169 -> 627
    //   461: aload_0
    //   462: aload_3
    //   463: lload_1
    //   464: aload 10
    //   466: getfield 291	com/appsflyer/internal/AFf1xSDK:valueOf	Lcom/appsflyer/internal/AFf1wSDK;
    //   469: aload 9
    //   471: aload 4
    //   473: invokespecial 294	com/appsflyer/internal/AFd1gSDK:values	(Ljava/lang/String;JLcom/appsflyer/internal/AFf1wSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFc1gSDK;)V
    //   476: ldc_w 298
    //   479: invokestatic 131	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   482: getstatic 172	com/appsflyer/internal/AFd1dSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1dSDK;
    //   485: areturn
    //   486: ldc -92
    //   488: invokestatic 131	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   491: getstatic 172	com/appsflyer/internal/AFd1dSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1dSDK;
    //   494: areturn
    //   495: aload_0
    //   496: aload_3
    //   497: lload_1
    //   498: aconst_null
    //   499: aconst_null
    //   500: aload 4
    //   502: invokespecial 294	com/appsflyer/internal/AFd1gSDK:values	(Ljava/lang/String;JLcom/appsflyer/internal/AFf1wSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFc1gSDK;)V
    //   505: new 222	java/lang/StringBuilder
    //   508: astore 9
    //   510: aload 9
    //   512: ldc_w 300
    //   515: invokespecial 226	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   518: aload 9
    //   520: aload 4
    //   522: invokevirtual 76	com/appsflyer/internal/AFc1gSDK:getStatusCode	()I
    //   525: invokevirtual 303	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   528: pop
    //   529: aload 9
    //   531: invokevirtual 240	java/lang/Object:toString	()Ljava/lang/String;
    //   534: invokestatic 131	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   537: getstatic 172	com/appsflyer/internal/AFd1dSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1dSDK;
    //   540: areturn
    //   541: ldc_w 305
    //   544: invokestatic 288	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   547: getstatic 307	com/appsflyer/internal/AFd1dSDK:AFKeystoreWrapper	Lcom/appsflyer/internal/AFd1dSDK;
    //   550: astore 4
    //   552: aload 4
    //   554: areturn
    //   555: new 222	java/lang/StringBuilder
    //   558: dup
    //   559: ldc_w 309
    //   562: invokespecial 226	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   565: astore 4
    //   567: aload 4
    //   569: aload 9
    //   571: invokevirtual 312	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   574: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: pop
    //   578: aload 4
    //   580: invokevirtual 240	java/lang/Object:toString	()Ljava/lang/String;
    //   583: aload 9
    //   585: iconst_1
    //   586: iconst_0
    //   587: iconst_0
    //   588: invokestatic 315	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    //   591: aload_0
    //   592: aload_3
    //   593: lload_1
    //   594: aconst_null
    //   595: aconst_null
    //   596: aconst_null
    //   597: aconst_null
    //   598: aload 9
    //   600: invokespecial 317	com/appsflyer/internal/AFd1gSDK:AFInAppEventParameterName	(Ljava/lang/String;JLcom/appsflyer/internal/AFc1gSDK;Lcom/appsflyer/internal/AFe1qSDK;Lcom/appsflyer/internal/AFf1wSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   603: aload 9
    //   605: invokevirtual 84	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   608: instanceof 319
    //   611: ifne +7 -> 618
    //   614: getstatic 172	com/appsflyer/internal/AFd1dSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1dSDK;
    //   617: areturn
    //   618: aload 9
    //   620: invokevirtual 84	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   623: checkcast 319	java/lang/InterruptedException
    //   626: athrow
    //   627: new 222	java/lang/StringBuilder
    //   630: dup
    //   631: ldc_w 321
    //   634: invokespecial 226	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   637: astore 4
    //   639: aload 4
    //   641: aload 9
    //   643: invokevirtual 312	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   646: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   649: pop
    //   650: aload 4
    //   652: invokevirtual 240	java/lang/Object:toString	()Ljava/lang/String;
    //   655: aload 9
    //   657: iconst_1
    //   658: iconst_0
    //   659: iconst_0
    //   660: invokestatic 315	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    //   663: aload 9
    //   665: instanceof 323
    //   668: ifeq +16 -> 684
    //   671: aload 9
    //   673: checkcast 323	com/appsflyer/internal/components/network/http/exceptions/ParsingException
    //   676: invokevirtual 326	com/appsflyer/internal/components/network/http/exceptions/ParsingException:getRawResponse	()Lcom/appsflyer/internal/AFc1gSDK;
    //   679: astore 4
    //   681: goto +6 -> 687
    //   684: aconst_null
    //   685: astore 4
    //   687: aload_0
    //   688: aload_3
    //   689: lload_1
    //   690: aload 4
    //   692: aconst_null
    //   693: aconst_null
    //   694: aconst_null
    //   695: aload 9
    //   697: invokespecial 317	com/appsflyer/internal/AFd1gSDK:AFInAppEventParameterName	(Ljava/lang/String;JLcom/appsflyer/internal/AFc1gSDK;Lcom/appsflyer/internal/AFe1qSDK;Lcom/appsflyer/internal/AFf1wSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   700: aload 9
    //   702: invokevirtual 84	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   705: instanceof 328
    //   708: ifne +7 -> 715
    //   711: getstatic 172	com/appsflyer/internal/AFd1dSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1dSDK;
    //   714: areturn
    //   715: aload 9
    //   717: invokevirtual 84	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   720: checkcast 328	java/io/InterruptedIOException
    //   723: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	724	0	this	AFd1gSDK
    //   3	687	1	l1	long
    //   8	681	3	str1	String
    //   16	675	4	localObject1	Object
    //   137	16	5	bool1	boolean
    //   146	9	6	bool2	boolean
    //   184	241	7	localObject2	Object
    //   193	196	8	localObject3	Object
    //   202	239	9	str2	String
    //   451	1	9	localObject4	Object
    //   456	14	9	localIOException	java.io.IOException
    //   508	208	9	localStringBuilder	StringBuilder
    //   211	254	10	localObject5	Object
    //   263	148	11	l2	long
    //   304	80	13	l3	long
    //   327	11	15	str3	String
    // Exception table:
    //   from	to	target	type
    //   115	213	451	finally
    //   218	229	451	finally
    //   232	451	451	finally
    //   461	486	451	finally
    //   486	495	451	finally
    //   495	541	451	finally
    //   541	552	451	finally
    //   115	213	456	java/io/IOException
    //   218	229	456	java/io/IOException
    //   232	451	456	java/io/IOException
    //   461	486	456	java/io/IOException
    //   486	495	456	java/io/IOException
    //   495	541	456	java/io/IOException
    //   541	552	456	java/io/IOException
  }
  
  private void values(String paramString1, long paramLong, AFf1wSDK paramAFf1wSDK, String paramString2, AFc1gSDK<AFe1qSDK> paramAFc1gSDK)
  {
    AFe1qSDK localAFe1qSDK;
    if (paramAFc1gSDK != null) {
      localAFe1qSDK = (AFe1qSDK)paramAFc1gSDK.getBody();
    } else {
      localAFe1qSDK = null;
    }
    if (paramString2 == null) {
      paramString2 = null;
    }
    AFInAppEventParameterName(paramString1, paramLong, paramAFc1gSDK, localAFe1qSDK, paramAFf1wSDK, paramString2, null);
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final long AFInAppEventType()
  {
    return 1500L;
  }
  
  @NonNull
  public final AFd1ySDK valueOf()
  {
    try
    {
      AFd1dSDK localAFd1dSDK = afInfoLog();
      AFLogger = localAFd1dSDK;
      if (localAFd1dSDK == AFd1dSDK.AFInAppEventParameterName) {
        return AFd1ySDK.valueOf;
      }
      return AFd1ySDK.AFInAppEventParameterName;
    }
    catch (InterruptedIOException localInterruptedIOException) {}catch (InterruptedException localInterruptedException) {}
    AFLogger.afErrorLogForExcManagerOnly("RC update config failed", localInterruptedException);
    AFLogger = AFd1dSDK.AFInAppEventParameterName;
    return AFd1ySDK.AFInAppEventType;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1gSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */