package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class kz
{
  private final ky a;
  
  public kz()
  {
    this(null);
  }
  
  public kz(ky paramky)
  {
    a = paramky;
  }
  
  private static int a(vy paramvy, int paramInt)
  {
    byte[] arrayOfByte = a;
    int i = paramvy.d();
    int j = i;
    for (int k = paramInt;; k = paramInt)
    {
      int m = j + 1;
      if (m >= i + k) {
        break;
      }
      paramInt = k;
      if ((arrayOfByte[j] & 0xFF) == 255)
      {
        paramInt = k;
        if (arrayOfByte[m] == 0)
        {
          System.arraycopy(arrayOfByte, j + 2, arrayOfByte, m, k - (j - i) - 2);
          paramInt = k - 1;
        }
      }
      j = m;
    }
    return k;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = b(paramArrayOfByte, paramInt1);
    if (paramInt2 != 0)
    {
      paramInt1 = i;
      if (paramInt2 != 3)
      {
        while (paramInt1 < paramArrayOfByte.length - 1)
        {
          if ((paramInt1 % 2 == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 0)) {
            return paramInt1;
          }
          paramInt1 = b(paramArrayOfByte, paramInt1 + 1);
        }
        return paramArrayOfByte.length;
      }
    }
    return i;
  }
  
  /* Error */
  private static la a(int paramInt1, vy paramvy, boolean paramBoolean, int paramInt2, ky paramky)
  {
    // Byte code:
    //   0: iload_0
    //   1: istore 5
    //   3: aload_1
    //   4: astore 6
    //   6: aload_1
    //   7: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   10: istore 7
    //   12: aload_1
    //   13: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   16: istore 8
    //   18: aload_1
    //   19: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   22: istore 9
    //   24: iload 5
    //   26: iconst_3
    //   27: if_icmplt +12 -> 39
    //   30: aload_1
    //   31: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   34: istore 10
    //   36: goto +6 -> 42
    //   39: iconst_0
    //   40: istore 10
    //   42: iload 5
    //   44: iconst_4
    //   45: if_icmpne +67 -> 112
    //   48: aload_1
    //   49: invokevirtual 46	com/google/ads/interactivemedia/v3/internal/vy:p	()I
    //   52: istore 11
    //   54: iload 11
    //   56: istore 12
    //   58: iload_2
    //   59: ifne +46 -> 105
    //   62: iload 11
    //   64: bipush 24
    //   66: iushr
    //   67: bipush 21
    //   69: ishl
    //   70: iload 11
    //   72: sipush 255
    //   75: iand
    //   76: iload 11
    //   78: bipush 8
    //   80: ishr
    //   81: sipush 255
    //   84: iand
    //   85: bipush 7
    //   87: ishl
    //   88: ior
    //   89: iload 11
    //   91: bipush 16
    //   93: ishr
    //   94: sipush 255
    //   97: iand
    //   98: bipush 14
    //   100: ishl
    //   101: ior
    //   102: ior
    //   103: istore 12
    //   105: iload 12
    //   107: istore 13
    //   109: goto +27 -> 136
    //   112: iload 5
    //   114: iconst_3
    //   115: if_icmpne +12 -> 127
    //   118: aload_1
    //   119: invokevirtual 46	com/google/ads/interactivemedia/v3/internal/vy:p	()I
    //   122: istore 12
    //   124: goto -19 -> 105
    //   127: aload_1
    //   128: invokevirtual 49	com/google/ads/interactivemedia/v3/internal/vy:i	()I
    //   131: istore 12
    //   133: goto -28 -> 105
    //   136: iload 5
    //   138: iconst_3
    //   139: if_icmplt +12 -> 151
    //   142: aload_1
    //   143: invokevirtual 52	com/google/ads/interactivemedia/v3/internal/vy:f	()I
    //   146: istore 12
    //   148: goto +6 -> 154
    //   151: iconst_0
    //   152: istore 12
    //   154: iload 7
    //   156: ifne +39 -> 195
    //   159: iload 8
    //   161: ifne +34 -> 195
    //   164: iload 9
    //   166: ifne +29 -> 195
    //   169: iload 10
    //   171: ifne +24 -> 195
    //   174: iload 13
    //   176: ifne +19 -> 195
    //   179: iload 12
    //   181: ifne +14 -> 195
    //   184: aload 6
    //   186: aload_1
    //   187: invokevirtual 55	com/google/ads/interactivemedia/v3/internal/vy:c	()I
    //   190: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   193: aconst_null
    //   194: areturn
    //   195: aload_1
    //   196: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   199: iload 13
    //   201: iadd
    //   202: istore 11
    //   204: iload 11
    //   206: aload_1
    //   207: invokevirtual 55	com/google/ads/interactivemedia/v3/internal/vy:c	()I
    //   210: if_icmple +22 -> 232
    //   213: ldc 60
    //   215: ldc 62
    //   217: invokestatic 68	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   220: pop
    //   221: aload 6
    //   223: aload_1
    //   224: invokevirtual 55	com/google/ads/interactivemedia/v3/internal/vy:c	()I
    //   227: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   230: aconst_null
    //   231: areturn
    //   232: aload 4
    //   234: ifnull +31 -> 265
    //   237: aload 4
    //   239: iload_0
    //   240: iload 7
    //   242: iload 8
    //   244: iload 9
    //   246: iload 10
    //   248: invokeinterface 73 6 0
    //   253: ifne +12 -> 265
    //   256: aload 6
    //   258: iload 11
    //   260: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   263: aconst_null
    //   264: areturn
    //   265: iload 12
    //   267: istore 14
    //   269: iload 11
    //   271: istore 12
    //   273: iload 5
    //   275: iconst_3
    //   276: if_icmpne +73 -> 349
    //   279: iload 14
    //   281: sipush 128
    //   284: iand
    //   285: ifeq +9 -> 294
    //   288: iconst_1
    //   289: istore 11
    //   291: goto +6 -> 297
    //   294: iconst_0
    //   295: istore 11
    //   297: iload 14
    //   299: bipush 64
    //   301: iand
    //   302: ifeq +9 -> 311
    //   305: iconst_1
    //   306: istore 15
    //   308: goto +6 -> 314
    //   311: iconst_0
    //   312: istore 15
    //   314: iload 14
    //   316: bipush 32
    //   318: iand
    //   319: ifeq +9 -> 328
    //   322: iconst_1
    //   323: istore 14
    //   325: goto +6 -> 331
    //   328: iconst_0
    //   329: istore 14
    //   331: iconst_0
    //   332: istore 16
    //   334: iload 11
    //   336: istore 17
    //   338: iload 15
    //   340: istore 18
    //   342: iload 16
    //   344: istore 15
    //   346: goto +141 -> 487
    //   349: iload 5
    //   351: iconst_4
    //   352: if_icmpne +120 -> 472
    //   355: iload 14
    //   357: bipush 64
    //   359: iand
    //   360: ifeq +9 -> 369
    //   363: iconst_1
    //   364: istore 11
    //   366: goto +6 -> 372
    //   369: iconst_0
    //   370: istore 11
    //   372: iload 14
    //   374: bipush 8
    //   376: iand
    //   377: ifeq +9 -> 386
    //   380: iconst_1
    //   381: istore 15
    //   383: goto +6 -> 389
    //   386: iconst_0
    //   387: istore 15
    //   389: iload 14
    //   391: iconst_4
    //   392: iand
    //   393: ifeq +9 -> 402
    //   396: iconst_1
    //   397: istore 18
    //   399: goto +6 -> 405
    //   402: iconst_0
    //   403: istore 18
    //   405: iload 14
    //   407: iconst_2
    //   408: iand
    //   409: ifeq +9 -> 418
    //   412: iconst_1
    //   413: istore 16
    //   415: goto +6 -> 421
    //   418: iconst_0
    //   419: istore 16
    //   421: iload 14
    //   423: iconst_1
    //   424: iand
    //   425: ifeq +25 -> 450
    //   428: iconst_1
    //   429: istore 17
    //   431: iload 11
    //   433: istore 14
    //   435: iload 17
    //   437: istore 11
    //   439: iload 15
    //   441: istore 17
    //   443: iload 16
    //   445: istore 15
    //   447: goto +40 -> 487
    //   450: iconst_0
    //   451: istore 17
    //   453: iload 11
    //   455: istore 14
    //   457: iload 17
    //   459: istore 11
    //   461: iload 15
    //   463: istore 17
    //   465: iload 16
    //   467: istore 15
    //   469: goto +18 -> 487
    //   472: iconst_0
    //   473: istore 14
    //   475: iconst_0
    //   476: istore 11
    //   478: iconst_0
    //   479: istore 17
    //   481: iconst_0
    //   482: istore 18
    //   484: iconst_0
    //   485: istore 15
    //   487: iload 17
    //   489: ifne +2264 -> 2753
    //   492: iload 18
    //   494: ifeq +6 -> 500
    //   497: goto +2256 -> 2753
    //   500: iload 13
    //   502: istore 18
    //   504: iload 14
    //   506: ifeq +15 -> 521
    //   509: iload 13
    //   511: iconst_1
    //   512: isub
    //   513: istore 18
    //   515: aload 6
    //   517: iconst_1
    //   518: invokevirtual 75	com/google/ads/interactivemedia/v3/internal/vy:d	(I)V
    //   521: iload 18
    //   523: istore 14
    //   525: iload 11
    //   527: ifeq +15 -> 542
    //   530: iload 18
    //   532: iconst_4
    //   533: isub
    //   534: istore 14
    //   536: aload 6
    //   538: iconst_4
    //   539: invokevirtual 75	com/google/ads/interactivemedia/v3/internal/vy:d	(I)V
    //   542: iload 14
    //   544: istore 11
    //   546: iload 15
    //   548: ifeq +12 -> 560
    //   551: aload 6
    //   553: iload 14
    //   555: invokestatic 77	com/google/ads/interactivemedia/v3/internal/kz:a	(Lcom/google/ads/interactivemedia/v3/internal/vy;I)I
    //   558: istore 11
    //   560: iload 7
    //   562: bipush 84
    //   564: if_icmpne +142 -> 706
    //   567: iload 8
    //   569: bipush 88
    //   571: if_icmpne +135 -> 706
    //   574: iload 9
    //   576: bipush 88
    //   578: if_icmpne +128 -> 706
    //   581: iload 5
    //   583: iconst_2
    //   584: if_icmpeq +10 -> 594
    //   587: iload 10
    //   589: bipush 88
    //   591: if_icmpne +115 -> 706
    //   594: iload 11
    //   596: ifgt +9 -> 605
    //   599: aconst_null
    //   600: astore 4
    //   602: goto +205 -> 807
    //   605: aload_1
    //   606: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   609: istore_3
    //   610: iload_3
    //   611: invokestatic 80	com/google/ads/interactivemedia/v3/internal/kz:a	(I)Ljava/lang/String;
    //   614: astore 4
    //   616: iload 11
    //   618: iconst_1
    //   619: isub
    //   620: istore 14
    //   622: iload 14
    //   624: newarray <illegal type>
    //   626: astore 19
    //   628: aload 6
    //   630: aload 19
    //   632: iconst_0
    //   633: iload 14
    //   635: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   638: aload 19
    //   640: iconst_0
    //   641: iload_3
    //   642: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   645: istore 14
    //   647: new 87	java/lang/String
    //   650: astore 6
    //   652: aload 6
    //   654: aload 19
    //   656: iconst_0
    //   657: iload 14
    //   659: aload 4
    //   661: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   664: iload 14
    //   666: iload_3
    //   667: invokestatic 93	com/google/ads/interactivemedia/v3/internal/kz:b	(I)I
    //   670: iadd
    //   671: istore 14
    //   673: new 95	com/google/ads/interactivemedia/v3/internal/lj
    //   676: dup
    //   677: ldc 97
    //   679: aload 6
    //   681: aload 19
    //   683: iload 14
    //   685: aload 19
    //   687: iload 14
    //   689: iload_3
    //   690: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   693: aload 4
    //   695: invokestatic 100	com/google/ads/interactivemedia/v3/internal/kz:a	([BIILjava/lang/String;)Ljava/lang/String;
    //   698: invokespecial 103	com/google/ads/interactivemedia/v3/internal/lj:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   701: astore 4
    //   703: goto +104 -> 807
    //   706: iload 7
    //   708: bipush 84
    //   710: if_icmpne +114 -> 824
    //   713: iload 5
    //   715: iload 7
    //   717: iload 8
    //   719: iload 9
    //   721: iload 10
    //   723: invokestatic 106	com/google/ads/interactivemedia/v3/internal/kz:a	(IIIII)Ljava/lang/String;
    //   726: astore 19
    //   728: iload 11
    //   730: ifgt +6 -> 736
    //   733: goto -134 -> 599
    //   736: aload_1
    //   737: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   740: istore_3
    //   741: iload_3
    //   742: invokestatic 80	com/google/ads/interactivemedia/v3/internal/kz:a	(I)Ljava/lang/String;
    //   745: astore 20
    //   747: iload 11
    //   749: iconst_1
    //   750: isub
    //   751: istore 14
    //   753: iload 14
    //   755: newarray <illegal type>
    //   757: astore 4
    //   759: aload 6
    //   761: aload 4
    //   763: iconst_0
    //   764: iload 14
    //   766: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   769: aload 4
    //   771: iconst_0
    //   772: iload_3
    //   773: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   776: istore_3
    //   777: new 87	java/lang/String
    //   780: astore 6
    //   782: aload 6
    //   784: aload 4
    //   786: iconst_0
    //   787: iload_3
    //   788: aload 20
    //   790: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   793: new 95	com/google/ads/interactivemedia/v3/internal/lj
    //   796: dup
    //   797: aload 19
    //   799: aconst_null
    //   800: aload 6
    //   802: invokespecial 103	com/google/ads/interactivemedia/v3/internal/lj:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   805: astore 4
    //   807: goto +1806 -> 2613
    //   810: astore 4
    //   812: iload 12
    //   814: istore_0
    //   815: goto +1930 -> 2745
    //   818: iload 12
    //   820: istore_0
    //   821: goto +1907 -> 2728
    //   824: iload 7
    //   826: bipush 87
    //   828: if_icmpne +135 -> 963
    //   831: iload 8
    //   833: bipush 88
    //   835: if_icmpne +128 -> 963
    //   838: iload 9
    //   840: bipush 88
    //   842: if_icmpne +121 -> 963
    //   845: iload 5
    //   847: iconst_2
    //   848: if_icmpeq +10 -> 858
    //   851: iload 10
    //   853: bipush 88
    //   855: if_icmpne +108 -> 963
    //   858: iload 11
    //   860: ifgt +6 -> 866
    //   863: goto -264 -> 599
    //   866: aload_1
    //   867: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   870: istore_3
    //   871: iload_3
    //   872: invokestatic 80	com/google/ads/interactivemedia/v3/internal/kz:a	(I)Ljava/lang/String;
    //   875: astore 19
    //   877: iload 11
    //   879: iconst_1
    //   880: isub
    //   881: istore 14
    //   883: iload 14
    //   885: newarray <illegal type>
    //   887: astore 4
    //   889: aload 6
    //   891: aload 4
    //   893: iconst_0
    //   894: iload 14
    //   896: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   899: aload 4
    //   901: iconst_0
    //   902: iload_3
    //   903: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   906: istore 14
    //   908: new 87	java/lang/String
    //   911: astore 6
    //   913: aload 6
    //   915: aload 4
    //   917: iconst_0
    //   918: iload 14
    //   920: aload 19
    //   922: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   925: iload 14
    //   927: iload_3
    //   928: invokestatic 93	com/google/ads/interactivemedia/v3/internal/kz:b	(I)I
    //   931: iadd
    //   932: istore_3
    //   933: new 108	com/google/ads/interactivemedia/v3/internal/ll
    //   936: dup
    //   937: ldc 110
    //   939: aload 6
    //   941: aload 4
    //   943: iload_3
    //   944: aload 4
    //   946: iload_3
    //   947: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   950: ldc 112
    //   952: invokestatic 100	com/google/ads/interactivemedia/v3/internal/kz:a	([BIILjava/lang/String;)Ljava/lang/String;
    //   955: invokespecial 113	com/google/ads/interactivemedia/v3/internal/ll:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   958: astore 4
    //   960: goto -153 -> 807
    //   963: iload 7
    //   965: bipush 87
    //   967: if_icmpne +74 -> 1041
    //   970: iload 5
    //   972: iload 7
    //   974: iload 8
    //   976: iload 9
    //   978: iload 10
    //   980: invokestatic 106	com/google/ads/interactivemedia/v3/internal/kz:a	(IIIII)Ljava/lang/String;
    //   983: astore 4
    //   985: iload 11
    //   987: newarray <illegal type>
    //   989: astore 19
    //   991: aload 6
    //   993: aload 19
    //   995: iconst_0
    //   996: iload 11
    //   998: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   1001: aload 19
    //   1003: iconst_0
    //   1004: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   1007: istore_3
    //   1008: new 87	java/lang/String
    //   1011: astore 6
    //   1013: aload 6
    //   1015: aload 19
    //   1017: iconst_0
    //   1018: iload_3
    //   1019: ldc 112
    //   1021: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1024: new 108	com/google/ads/interactivemedia/v3/internal/ll
    //   1027: dup
    //   1028: aload 4
    //   1030: aconst_null
    //   1031: aload 6
    //   1033: invokespecial 113	com/google/ads/interactivemedia/v3/internal/ll:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1036: astore 4
    //   1038: goto -231 -> 807
    //   1041: iload 7
    //   1043: bipush 80
    //   1045: if_icmpne +87 -> 1132
    //   1048: iload 8
    //   1050: bipush 82
    //   1052: if_icmpne +80 -> 1132
    //   1055: iload 9
    //   1057: bipush 73
    //   1059: if_icmpne +73 -> 1132
    //   1062: iload 10
    //   1064: bipush 86
    //   1066: if_icmpne +66 -> 1132
    //   1069: iload 11
    //   1071: newarray <illegal type>
    //   1073: astore 4
    //   1075: aload 6
    //   1077: aload 4
    //   1079: iconst_0
    //   1080: iload 11
    //   1082: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   1085: aload 4
    //   1087: iconst_0
    //   1088: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   1091: istore_3
    //   1092: new 87	java/lang/String
    //   1095: astore 6
    //   1097: aload 6
    //   1099: aload 4
    //   1101: iconst_0
    //   1102: iload_3
    //   1103: ldc 112
    //   1105: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1108: new 115	com/google/ads/interactivemedia/v3/internal/lh
    //   1111: dup
    //   1112: aload 6
    //   1114: aload 4
    //   1116: iload_3
    //   1117: iconst_1
    //   1118: iadd
    //   1119: iload 11
    //   1121: invokestatic 118	com/google/ads/interactivemedia/v3/internal/kz:b	([BII)[B
    //   1124: invokespecial 121	com/google/ads/interactivemedia/v3/internal/lh:<init>	(Ljava/lang/String;[B)V
    //   1127: astore 4
    //   1129: goto -91 -> 1038
    //   1132: iload 7
    //   1134: bipush 71
    //   1136: if_icmpne +174 -> 1310
    //   1139: iload 8
    //   1141: bipush 69
    //   1143: if_icmpne +167 -> 1310
    //   1146: iload 9
    //   1148: bipush 79
    //   1150: if_icmpne +160 -> 1310
    //   1153: iload 10
    //   1155: bipush 66
    //   1157: if_icmpeq +9 -> 1166
    //   1160: iload 5
    //   1162: iconst_2
    //   1163: if_icmpne +147 -> 1310
    //   1166: aload_1
    //   1167: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   1170: istore_3
    //   1171: iload_3
    //   1172: invokestatic 80	com/google/ads/interactivemedia/v3/internal/kz:a	(I)Ljava/lang/String;
    //   1175: astore 19
    //   1177: iload 11
    //   1179: iconst_1
    //   1180: isub
    //   1181: istore 14
    //   1183: iload 14
    //   1185: newarray <illegal type>
    //   1187: astore 4
    //   1189: aload 6
    //   1191: aload 4
    //   1193: iconst_0
    //   1194: iload 14
    //   1196: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   1199: aload 4
    //   1201: iconst_0
    //   1202: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   1205: istore 15
    //   1207: new 87	java/lang/String
    //   1210: astore 6
    //   1212: aload 6
    //   1214: aload 4
    //   1216: iconst_0
    //   1217: iload 15
    //   1219: ldc 112
    //   1221: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1224: iinc 15 1
    //   1227: aload 4
    //   1229: iload 15
    //   1231: iload_3
    //   1232: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   1235: istore 18
    //   1237: aload 4
    //   1239: iload 15
    //   1241: iload 18
    //   1243: aload 19
    //   1245: invokestatic 100	com/google/ads/interactivemedia/v3/internal/kz:a	([BIILjava/lang/String;)Ljava/lang/String;
    //   1248: astore 20
    //   1250: iload 18
    //   1252: iload_3
    //   1253: invokestatic 93	com/google/ads/interactivemedia/v3/internal/kz:b	(I)I
    //   1256: iadd
    //   1257: istore 18
    //   1259: aload 4
    //   1261: iload 18
    //   1263: iload_3
    //   1264: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   1267: istore 15
    //   1269: new 123	com/google/ads/interactivemedia/v3/internal/kx
    //   1272: dup
    //   1273: aload 6
    //   1275: aload 20
    //   1277: aload 4
    //   1279: iload 18
    //   1281: iload 15
    //   1283: aload 19
    //   1285: invokestatic 100	com/google/ads/interactivemedia/v3/internal/kz:a	([BIILjava/lang/String;)Ljava/lang/String;
    //   1288: aload 4
    //   1290: iload 15
    //   1292: iload_3
    //   1293: invokestatic 93	com/google/ads/interactivemedia/v3/internal/kz:b	(I)I
    //   1296: iadd
    //   1297: iload 14
    //   1299: invokestatic 118	com/google/ads/interactivemedia/v3/internal/kz:b	([BII)[B
    //   1302: invokespecial 126	com/google/ads/interactivemedia/v3/internal/kx:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    //   1305: astore 4
    //   1307: goto -500 -> 807
    //   1310: iload 5
    //   1312: iconst_2
    //   1313: if_icmpne +27 -> 1340
    //   1316: iload 7
    //   1318: bipush 80
    //   1320: if_icmpne +349 -> 1669
    //   1323: iload 8
    //   1325: bipush 73
    //   1327: if_icmpne +342 -> 1669
    //   1330: iload 9
    //   1332: bipush 67
    //   1334: if_icmpne +335 -> 1669
    //   1337: goto +31 -> 1368
    //   1340: iload 7
    //   1342: bipush 65
    //   1344: if_icmpne +325 -> 1669
    //   1347: iload 8
    //   1349: bipush 80
    //   1351: if_icmpne +318 -> 1669
    //   1354: iload 9
    //   1356: bipush 73
    //   1358: if_icmpne +311 -> 1669
    //   1361: iload 10
    //   1363: bipush 67
    //   1365: if_icmpne +304 -> 1669
    //   1368: aload_1
    //   1369: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   1372: istore 15
    //   1374: iload 15
    //   1376: invokestatic 80	com/google/ads/interactivemedia/v3/internal/kz:a	(I)Ljava/lang/String;
    //   1379: astore 20
    //   1381: iload 11
    //   1383: iconst_1
    //   1384: isub
    //   1385: istore 18
    //   1387: iload 18
    //   1389: newarray <illegal type>
    //   1391: astore 19
    //   1393: aload 6
    //   1395: aload 19
    //   1397: iconst_0
    //   1398: iload 18
    //   1400: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   1403: iload 5
    //   1405: iconst_2
    //   1406: if_icmpne +83 -> 1489
    //   1409: new 87	java/lang/String
    //   1412: astore 4
    //   1414: aload 4
    //   1416: aload 19
    //   1418: iconst_0
    //   1419: iconst_3
    //   1420: ldc 112
    //   1422: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1425: aload 4
    //   1427: invokestatic 131	com/google/ads/interactivemedia/v3/internal/wl:d	(Ljava/lang/String;)Ljava/lang/String;
    //   1430: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1433: astore 4
    //   1435: aload 4
    //   1437: invokevirtual 138	java/lang/String:length	()I
    //   1440: ifeq +15 -> 1455
    //   1443: ldc -116
    //   1445: aload 4
    //   1447: invokevirtual 143	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1450: astore 6
    //   1452: goto +14 -> 1466
    //   1455: new 87	java/lang/String
    //   1458: dup
    //   1459: ldc -116
    //   1461: invokespecial 146	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1464: astore 6
    //   1466: aload 6
    //   1468: astore 4
    //   1470: ldc -108
    //   1472: aload 6
    //   1474: invokevirtual 152	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1477: ifeq +7 -> 1484
    //   1480: ldc -102
    //   1482: astore 4
    //   1484: iconst_2
    //   1485: istore_3
    //   1486: goto +94 -> 1580
    //   1489: aload 19
    //   1491: iconst_0
    //   1492: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   1495: istore 14
    //   1497: new 87	java/lang/String
    //   1500: astore 4
    //   1502: aload 4
    //   1504: aload 19
    //   1506: iconst_0
    //   1507: iload 14
    //   1509: ldc 112
    //   1511: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1514: aload 4
    //   1516: invokestatic 131	com/google/ads/interactivemedia/v3/internal/wl:d	(Ljava/lang/String;)Ljava/lang/String;
    //   1519: astore 6
    //   1521: aload 6
    //   1523: bipush 47
    //   1525: invokevirtual 157	java/lang/String:indexOf	(I)I
    //   1528: istore 16
    //   1530: aload 6
    //   1532: astore 4
    //   1534: iload 14
    //   1536: istore_3
    //   1537: iload 16
    //   1539: iconst_m1
    //   1540: if_icmpne +40 -> 1580
    //   1543: aload 6
    //   1545: invokevirtual 138	java/lang/String:length	()I
    //   1548: ifeq +18 -> 1566
    //   1551: ldc -116
    //   1553: aload 6
    //   1555: invokevirtual 143	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1558: astore 4
    //   1560: iload 14
    //   1562: istore_3
    //   1563: goto +17 -> 1580
    //   1566: new 87	java/lang/String
    //   1569: dup
    //   1570: ldc -116
    //   1572: invokespecial 146	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1575: astore 4
    //   1577: iload 14
    //   1579: istore_3
    //   1580: aload 19
    //   1582: iload_3
    //   1583: iconst_1
    //   1584: iadd
    //   1585: baload
    //   1586: istore 14
    //   1588: iload_3
    //   1589: iconst_2
    //   1590: iadd
    //   1591: istore 16
    //   1593: aload 19
    //   1595: iload 16
    //   1597: iload 15
    //   1599: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   1602: istore_3
    //   1603: new 87	java/lang/String
    //   1606: astore 6
    //   1608: aload 6
    //   1610: aload 19
    //   1612: iload 16
    //   1614: iload_3
    //   1615: iload 16
    //   1617: isub
    //   1618: aload 20
    //   1620: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1623: new 159	com/google/ads/interactivemedia/v3/internal/kn
    //   1626: dup
    //   1627: aload 4
    //   1629: aload 6
    //   1631: iload 14
    //   1633: sipush 255
    //   1636: iand
    //   1637: aload 19
    //   1639: iload_3
    //   1640: iload 15
    //   1642: invokestatic 93	com/google/ads/interactivemedia/v3/internal/kz:b	(I)I
    //   1645: iadd
    //   1646: iload 18
    //   1648: invokestatic 118	com/google/ads/interactivemedia/v3/internal/kz:b	([BII)[B
    //   1651: invokespecial 162	com/google/ads/interactivemedia/v3/internal/kn:<init>	(Ljava/lang/String;Ljava/lang/String;I[B)V
    //   1654: astore 4
    //   1656: goto +957 -> 2613
    //   1659: astore 4
    //   1661: goto -849 -> 812
    //   1664: astore 4
    //   1666: goto -848 -> 818
    //   1669: iload 7
    //   1671: bipush 67
    //   1673: if_icmpne +184 -> 1857
    //   1676: iload 8
    //   1678: bipush 79
    //   1680: if_icmpne +177 -> 1857
    //   1683: iload 9
    //   1685: bipush 77
    //   1687: if_icmpne +170 -> 1857
    //   1690: iload 10
    //   1692: bipush 77
    //   1694: if_icmpeq +9 -> 1703
    //   1697: iload 5
    //   1699: iconst_2
    //   1700: if_icmpne +157 -> 1857
    //   1703: iload 11
    //   1705: iconst_4
    //   1706: if_icmpge +9 -> 1715
    //   1709: aconst_null
    //   1710: astore 4
    //   1712: goto +901 -> 2613
    //   1715: aload_1
    //   1716: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   1719: istore_3
    //   1720: iload_3
    //   1721: invokestatic 80	com/google/ads/interactivemedia/v3/internal/kz:a	(I)Ljava/lang/String;
    //   1724: astore 19
    //   1726: iconst_3
    //   1727: newarray <illegal type>
    //   1729: astore 20
    //   1731: aload_1
    //   1732: astore 4
    //   1734: aload 4
    //   1736: aload 20
    //   1738: iconst_0
    //   1739: iconst_3
    //   1740: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   1743: new 87	java/lang/String
    //   1746: astore 6
    //   1748: aload 6
    //   1750: aload 20
    //   1752: iconst_0
    //   1753: iconst_3
    //   1754: invokespecial 164	java/lang/String:<init>	([BII)V
    //   1757: iload 11
    //   1759: iconst_4
    //   1760: isub
    //   1761: istore 14
    //   1763: iload 14
    //   1765: newarray <illegal type>
    //   1767: astore 20
    //   1769: aload 4
    //   1771: aload 20
    //   1773: iconst_0
    //   1774: iload 14
    //   1776: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   1779: aload 20
    //   1781: iconst_0
    //   1782: iload_3
    //   1783: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   1786: istore 14
    //   1788: new 87	java/lang/String
    //   1791: astore 4
    //   1793: aload 4
    //   1795: aload 20
    //   1797: iconst_0
    //   1798: iload 14
    //   1800: aload 19
    //   1802: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1805: iload 14
    //   1807: iload_3
    //   1808: invokestatic 93	com/google/ads/interactivemedia/v3/internal/kz:b	(I)I
    //   1811: iadd
    //   1812: istore 14
    //   1814: new 166	com/google/ads/interactivemedia/v3/internal/kv
    //   1817: dup
    //   1818: aload 6
    //   1820: aload 4
    //   1822: aload 20
    //   1824: iload 14
    //   1826: aload 20
    //   1828: iload 14
    //   1830: iload_3
    //   1831: invokestatic 85	com/google/ads/interactivemedia/v3/internal/kz:a	([BII)I
    //   1834: aload 19
    //   1836: invokestatic 100	com/google/ads/interactivemedia/v3/internal/kz:a	([BIILjava/lang/String;)Ljava/lang/String;
    //   1839: invokespecial 167	com/google/ads/interactivemedia/v3/internal/kv:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1842: astore 4
    //   1844: goto +769 -> 2613
    //   1847: astore 4
    //   1849: goto +858 -> 2707
    //   1852: astore 4
    //   1854: goto +859 -> 2713
    //   1857: aload_1
    //   1858: astore 6
    //   1860: iload 7
    //   1862: bipush 67
    //   1864: if_icmpne +226 -> 2090
    //   1867: iload 8
    //   1869: bipush 72
    //   1871: if_icmpne +219 -> 2090
    //   1874: iload 9
    //   1876: bipush 65
    //   1878: if_icmpne +212 -> 2090
    //   1881: iload 10
    //   1883: bipush 80
    //   1885: if_icmpne +205 -> 2090
    //   1888: aload_1
    //   1889: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   1892: istore 14
    //   1894: aload 6
    //   1896: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   1899: iload 14
    //   1901: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   1904: istore 15
    //   1906: new 87	java/lang/String
    //   1909: astore 19
    //   1911: aload 19
    //   1913: aload 6
    //   1915: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   1918: iload 14
    //   1920: iload 15
    //   1922: iload 14
    //   1924: isub
    //   1925: ldc 112
    //   1927: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   1930: aload 6
    //   1932: iload 15
    //   1934: iconst_1
    //   1935: iadd
    //   1936: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   1939: aload_1
    //   1940: invokevirtual 170	com/google/ads/interactivemedia/v3/internal/vy:l	()I
    //   1943: istore 18
    //   1945: aload_1
    //   1946: invokevirtual 170	com/google/ads/interactivemedia/v3/internal/vy:l	()I
    //   1949: istore 15
    //   1951: aload_1
    //   1952: invokevirtual 174	com/google/ads/interactivemedia/v3/internal/vy:j	()J
    //   1955: lstore 21
    //   1957: lload 21
    //   1959: lstore 23
    //   1961: lload 21
    //   1963: ldc2_w 175
    //   1966: lcmp
    //   1967: ifne +8 -> 1975
    //   1970: ldc2_w 177
    //   1973: lstore 23
    //   1975: aload_1
    //   1976: invokevirtual 174	com/google/ads/interactivemedia/v3/internal/vy:j	()J
    //   1979: lstore 25
    //   1981: lload 25
    //   1983: lstore 21
    //   1985: lload 25
    //   1987: ldc2_w 175
    //   1990: lcmp
    //   1991: ifne +8 -> 1999
    //   1994: ldc2_w 177
    //   1997: lstore 21
    //   1999: new 180	java/util/ArrayList
    //   2002: astore 6
    //   2004: aload 6
    //   2006: invokespecial 181	java/util/ArrayList:<init>	()V
    //   2009: aload_1
    //   2010: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   2013: iload 14
    //   2015: iload 11
    //   2017: iadd
    //   2018: if_icmpge +30 -> 2048
    //   2021: iload_0
    //   2022: aload_1
    //   2023: iload_2
    //   2024: iload_3
    //   2025: aload 4
    //   2027: invokestatic 183	com/google/ads/interactivemedia/v3/internal/kz:a	(ILcom/google/ads/interactivemedia/v3/internal/vy;ZILcom/google/ads/interactivemedia/v3/internal/ky;)Lcom/google/ads/interactivemedia/v3/internal/la;
    //   2030: astore 20
    //   2032: aload 20
    //   2034: ifnull -25 -> 2009
    //   2037: aload 6
    //   2039: aload 20
    //   2041: invokevirtual 186	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2044: pop
    //   2045: goto -36 -> 2009
    //   2048: aload 6
    //   2050: invokevirtual 189	java/util/ArrayList:size	()I
    //   2053: anewarray 191	com/google/ads/interactivemedia/v3/internal/la
    //   2056: astore 4
    //   2058: aload 6
    //   2060: aload 4
    //   2062: invokevirtual 195	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   2065: pop
    //   2066: new 197	com/google/ads/interactivemedia/v3/internal/kr
    //   2069: dup
    //   2070: aload 19
    //   2072: iload 18
    //   2074: iload 15
    //   2076: lload 23
    //   2078: lload 21
    //   2080: aload 4
    //   2082: invokespecial 200	com/google/ads/interactivemedia/v3/internal/kr:<init>	(Ljava/lang/String;IIJJ[Lcom/google/ads/interactivemedia/v3/internal/la;)V
    //   2085: astore 4
    //   2087: goto +526 -> 2613
    //   2090: iload 7
    //   2092: bipush 67
    //   2094: if_icmpne +289 -> 2383
    //   2097: iload 8
    //   2099: bipush 84
    //   2101: if_icmpne +282 -> 2383
    //   2104: iload 9
    //   2106: bipush 79
    //   2108: if_icmpne +275 -> 2383
    //   2111: iload 10
    //   2113: bipush 67
    //   2115: if_icmpne +268 -> 2383
    //   2118: aload_1
    //   2119: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   2122: istore 18
    //   2124: aload 6
    //   2126: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   2129: iload 18
    //   2131: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   2134: istore 14
    //   2136: new 87	java/lang/String
    //   2139: astore 20
    //   2141: aload 20
    //   2143: aload 6
    //   2145: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   2148: iload 18
    //   2150: iload 14
    //   2152: iload 18
    //   2154: isub
    //   2155: ldc 112
    //   2157: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   2160: aload 6
    //   2162: iload 14
    //   2164: iconst_1
    //   2165: iadd
    //   2166: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   2169: aload_1
    //   2170: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   2173: istore 14
    //   2175: iload 14
    //   2177: iconst_2
    //   2178: iand
    //   2179: ifeq +9 -> 2188
    //   2182: iconst_1
    //   2183: istore 27
    //   2185: goto +6 -> 2191
    //   2188: iconst_0
    //   2189: istore 27
    //   2191: iload 14
    //   2193: iconst_1
    //   2194: iand
    //   2195: ifeq +9 -> 2204
    //   2198: iconst_1
    //   2199: istore 28
    //   2201: goto +6 -> 2207
    //   2204: iconst_0
    //   2205: istore 28
    //   2207: aload_1
    //   2208: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   2211: istore 14
    //   2213: iload 14
    //   2215: anewarray 87	java/lang/String
    //   2218: astore 19
    //   2220: iconst_0
    //   2221: istore 15
    //   2223: iload 15
    //   2225: iload 14
    //   2227: if_icmpge +67 -> 2294
    //   2230: aload_1
    //   2231: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   2234: istore 16
    //   2236: aload 6
    //   2238: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   2241: iload 16
    //   2243: invokestatic 37	com/google/ads/interactivemedia/v3/internal/kz:b	([BI)I
    //   2246: istore 17
    //   2248: new 87	java/lang/String
    //   2251: astore 29
    //   2253: aload 29
    //   2255: aload 6
    //   2257: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   2260: iload 16
    //   2262: iload 17
    //   2264: iload 16
    //   2266: isub
    //   2267: ldc 112
    //   2269: invokespecial 90	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   2272: aload 19
    //   2274: iload 15
    //   2276: aload 29
    //   2278: aastore
    //   2279: aload 6
    //   2281: iload 17
    //   2283: iconst_1
    //   2284: iadd
    //   2285: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   2288: iinc 15 1
    //   2291: goto -68 -> 2223
    //   2294: new 180	java/util/ArrayList
    //   2297: astore 6
    //   2299: aload 6
    //   2301: invokespecial 181	java/util/ArrayList:<init>	()V
    //   2304: aload_1
    //   2305: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   2308: iload 18
    //   2310: iload 11
    //   2312: iadd
    //   2313: if_icmpge +30 -> 2343
    //   2316: iload_0
    //   2317: aload_1
    //   2318: iload_2
    //   2319: iload_3
    //   2320: aload 4
    //   2322: invokestatic 183	com/google/ads/interactivemedia/v3/internal/kz:a	(ILcom/google/ads/interactivemedia/v3/internal/vy;ZILcom/google/ads/interactivemedia/v3/internal/ky;)Lcom/google/ads/interactivemedia/v3/internal/la;
    //   2325: astore 29
    //   2327: aload 29
    //   2329: ifnull -25 -> 2304
    //   2332: aload 6
    //   2334: aload 29
    //   2336: invokevirtual 186	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2339: pop
    //   2340: goto -36 -> 2304
    //   2343: aload 6
    //   2345: invokevirtual 189	java/util/ArrayList:size	()I
    //   2348: anewarray 191	com/google/ads/interactivemedia/v3/internal/la
    //   2351: astore 4
    //   2353: aload 6
    //   2355: aload 4
    //   2357: invokevirtual 195	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   2360: pop
    //   2361: new 202	com/google/ads/interactivemedia/v3/internal/kt
    //   2364: dup
    //   2365: aload 20
    //   2367: iload 27
    //   2369: iload 28
    //   2371: aload 19
    //   2373: aload 4
    //   2375: invokespecial 205	com/google/ads/interactivemedia/v3/internal/kt:<init>	(Ljava/lang/String;ZZ[Ljava/lang/String;[Lcom/google/ads/interactivemedia/v3/internal/la;)V
    //   2378: astore 4
    //   2380: goto +187 -> 2567
    //   2383: iload 7
    //   2385: bipush 77
    //   2387: if_icmpne +183 -> 2570
    //   2390: iload 8
    //   2392: bipush 76
    //   2394: if_icmpne +176 -> 2570
    //   2397: iload 9
    //   2399: bipush 76
    //   2401: if_icmpne +169 -> 2570
    //   2404: iload 10
    //   2406: bipush 84
    //   2408: if_icmpne +162 -> 2570
    //   2411: aload_1
    //   2412: invokevirtual 52	com/google/ads/interactivemedia/v3/internal/vy:f	()I
    //   2415: istore 14
    //   2417: aload_1
    //   2418: invokevirtual 49	com/google/ads/interactivemedia/v3/internal/vy:i	()I
    //   2421: istore 13
    //   2423: aload_1
    //   2424: invokevirtual 49	com/google/ads/interactivemedia/v3/internal/vy:i	()I
    //   2427: istore 18
    //   2429: aload_1
    //   2430: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   2433: istore 16
    //   2435: aload_1
    //   2436: invokevirtual 43	com/google/ads/interactivemedia/v3/internal/vy:e	()I
    //   2439: istore 15
    //   2441: new 207	com/google/ads/interactivemedia/v3/internal/vz
    //   2444: astore 4
    //   2446: aload 4
    //   2448: invokespecial 208	com/google/ads/interactivemedia/v3/internal/vz:<init>	()V
    //   2451: aload 4
    //   2453: aload 6
    //   2455: getfield 22	com/google/ads/interactivemedia/v3/internal/vy:a	[B
    //   2458: aload_1
    //   2459: invokevirtual 55	com/google/ads/interactivemedia/v3/internal/vy:c	()I
    //   2462: invokevirtual 211	com/google/ads/interactivemedia/v3/internal/vz:a	([BI)V
    //   2465: aload 4
    //   2467: aload_1
    //   2468: invokevirtual 26	com/google/ads/interactivemedia/v3/internal/vy:d	()I
    //   2471: iconst_3
    //   2472: ishl
    //   2473: invokevirtual 213	com/google/ads/interactivemedia/v3/internal/vz:a	(I)V
    //   2476: iload 11
    //   2478: bipush 10
    //   2480: isub
    //   2481: bipush 8
    //   2483: imul
    //   2484: iload 16
    //   2486: iload 15
    //   2488: iadd
    //   2489: idiv
    //   2490: istore 17
    //   2492: iload 17
    //   2494: newarray <illegal type>
    //   2496: astore 6
    //   2498: iload 17
    //   2500: newarray <illegal type>
    //   2502: astore 19
    //   2504: iconst_0
    //   2505: istore_3
    //   2506: iload_3
    //   2507: iload 17
    //   2509: if_icmpge +39 -> 2548
    //   2512: aload 4
    //   2514: iload 16
    //   2516: invokevirtual 215	com/google/ads/interactivemedia/v3/internal/vz:c	(I)I
    //   2519: istore 5
    //   2521: aload 4
    //   2523: iload 15
    //   2525: invokevirtual 215	com/google/ads/interactivemedia/v3/internal/vz:c	(I)I
    //   2528: istore 30
    //   2530: aload 6
    //   2532: iload_3
    //   2533: iload 5
    //   2535: iastore
    //   2536: aload 19
    //   2538: iload_3
    //   2539: iload 30
    //   2541: iastore
    //   2542: iinc 3 1
    //   2545: goto -39 -> 2506
    //   2548: new 217	com/google/ads/interactivemedia/v3/internal/lf
    //   2551: dup
    //   2552: iload 14
    //   2554: iload 13
    //   2556: iload 18
    //   2558: aload 6
    //   2560: aload 19
    //   2562: invokespecial 220	com/google/ads/interactivemedia/v3/internal/lf:<init>	(III[I[I)V
    //   2565: astore 4
    //   2567: goto +46 -> 2613
    //   2570: iload_0
    //   2571: iload 7
    //   2573: iload 8
    //   2575: iload 9
    //   2577: iload 10
    //   2579: invokestatic 106	com/google/ads/interactivemedia/v3/internal/kz:a	(IIIII)Ljava/lang/String;
    //   2582: astore 4
    //   2584: iload 11
    //   2586: newarray <illegal type>
    //   2588: astore 19
    //   2590: aload 6
    //   2592: aload 19
    //   2594: iconst_0
    //   2595: iload 11
    //   2597: invokevirtual 83	com/google/ads/interactivemedia/v3/internal/vy:a	([BII)V
    //   2600: new 222	com/google/ads/interactivemedia/v3/internal/kp
    //   2603: dup
    //   2604: aload 4
    //   2606: aload 19
    //   2608: invokespecial 223	com/google/ads/interactivemedia/v3/internal/kp:<init>	(Ljava/lang/String;[B)V
    //   2611: astore 4
    //   2613: aload 4
    //   2615: ifnonnull +104 -> 2719
    //   2618: iload_0
    //   2619: iload 7
    //   2621: iload 8
    //   2623: iload 9
    //   2625: iload 10
    //   2627: invokestatic 106	com/google/ads/interactivemedia/v3/internal/kz:a	(IIIII)Ljava/lang/String;
    //   2630: astore 6
    //   2632: aload 6
    //   2634: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2637: invokevirtual 138	java/lang/String:length	()I
    //   2640: istore_0
    //   2641: new 225	java/lang/StringBuilder
    //   2644: astore 19
    //   2646: aload 19
    //   2648: iload_0
    //   2649: bipush 50
    //   2651: iadd
    //   2652: invokespecial 227	java/lang/StringBuilder:<init>	(I)V
    //   2655: aload 19
    //   2657: ldc -27
    //   2659: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2662: pop
    //   2663: aload 19
    //   2665: aload 6
    //   2667: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2670: pop
    //   2671: aload 19
    //   2673: ldc -21
    //   2675: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2678: pop
    //   2679: aload 19
    //   2681: iload 11
    //   2683: invokevirtual 238	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2686: pop
    //   2687: aload 19
    //   2689: invokevirtual 242	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2692: astore 6
    //   2694: ldc 60
    //   2696: aload 6
    //   2698: invokestatic 68	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   2701: pop
    //   2702: goto +17 -> 2719
    //   2705: astore 4
    //   2707: iload 12
    //   2709: istore_0
    //   2710: goto +35 -> 2745
    //   2713: iload 12
    //   2715: istore_0
    //   2716: goto +12 -> 2728
    //   2719: aload_1
    //   2720: iload 12
    //   2722: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   2725: aload 4
    //   2727: areturn
    //   2728: ldc 60
    //   2730: ldc -12
    //   2732: invokestatic 68	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   2735: pop
    //   2736: aload_1
    //   2737: iload_0
    //   2738: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   2741: aconst_null
    //   2742: areturn
    //   2743: astore 4
    //   2745: aload_1
    //   2746: iload_0
    //   2747: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   2750: aload 4
    //   2752: athrow
    //   2753: ldc 60
    //   2755: ldc -10
    //   2757: invokestatic 68	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   2760: pop
    //   2761: aload 6
    //   2763: iload 12
    //   2765: invokevirtual 58	com/google/ads/interactivemedia/v3/internal/vy:c	(I)V
    //   2768: aconst_null
    //   2769: areturn
    //   2770: astore 4
    //   2772: goto -1954 -> 818
    //   2775: astore 4
    //   2777: goto -64 -> 2713
    //   2780: astore 4
    //   2782: goto -69 -> 2713
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2785	0	paramInt1	int
    //   0	2785	1	paramvy	vy
    //   0	2785	2	paramBoolean	boolean
    //   0	2785	3	paramInt2	int
    //   0	2785	4	paramky	ky
    //   1	2533	5	i	int
    //   4	2758	6	localObject1	Object
    //   10	2610	7	j	int
    //   16	2606	8	k	int
    //   22	2602	9	m	int
    //   34	2592	10	n	int
    //   52	2630	11	i1	int
    //   56	2708	12	i2	int
    //   107	2448	13	i3	int
    //   267	2286	14	i4	int
    //   306	2218	15	i5	int
    //   332	2183	16	i6	int
    //   336	2174	17	i7	int
    //   340	2217	18	i8	int
    //   626	2062	19	localObject2	Object
    //   745	1621	20	localObject3	Object
    //   1955	124	21	l1	long
    //   1959	118	23	l2	long
    //   1979	7	25	l3	long
    //   2183	185	27	bool1	boolean
    //   2199	171	28	bool2	boolean
    //   2251	84	29	localObject4	Object
    //   2528	12	30	i9	int
    // Exception table:
    //   from	to	target	type
    //   605	616	810	finally
    //   622	703	810	finally
    //   713	728	810	finally
    //   736	747	810	finally
    //   753	807	810	finally
    //   866	877	810	finally
    //   883	960	810	finally
    //   970	1038	810	finally
    //   1069	1129	810	finally
    //   1166	1177	810	finally
    //   1183	1224	810	finally
    //   1227	1307	810	finally
    //   1409	1414	810	finally
    //   1368	1381	1659	finally
    //   1387	1403	1659	finally
    //   1368	1381	1664	java/io/UnsupportedEncodingException
    //   1387	1403	1664	java/io/UnsupportedEncodingException
    //   1489	1530	1847	finally
    //   1593	1656	1847	finally
    //   1715	1731	1847	finally
    //   1489	1530	1852	java/io/UnsupportedEncodingException
    //   1593	1656	1852	java/io/UnsupportedEncodingException
    //   1715	1731	1852	java/io/UnsupportedEncodingException
    //   1414	1452	2705	finally
    //   1455	1466	2705	finally
    //   1470	1480	2705	finally
    //   1543	1560	2705	finally
    //   1566	1577	2705	finally
    //   1734	1757	2705	finally
    //   1763	1844	2705	finally
    //   1888	1957	2705	finally
    //   1975	1981	2705	finally
    //   1999	2009	2705	finally
    //   2009	2032	2705	finally
    //   2037	2045	2705	finally
    //   2048	2087	2705	finally
    //   2118	2175	2705	finally
    //   2207	2220	2705	finally
    //   2230	2272	2705	finally
    //   2279	2288	2705	finally
    //   2294	2304	2705	finally
    //   2304	2327	2705	finally
    //   2332	2340	2705	finally
    //   2343	2380	2705	finally
    //   2411	2504	2705	finally
    //   2512	2530	2705	finally
    //   2548	2567	2705	finally
    //   2570	2613	2705	finally
    //   2618	2694	2705	finally
    //   2694	2702	2705	finally
    //   2728	2736	2743	finally
    //   605	616	2770	java/io/UnsupportedEncodingException
    //   622	703	2770	java/io/UnsupportedEncodingException
    //   713	728	2770	java/io/UnsupportedEncodingException
    //   736	747	2770	java/io/UnsupportedEncodingException
    //   753	807	2770	java/io/UnsupportedEncodingException
    //   866	877	2770	java/io/UnsupportedEncodingException
    //   883	960	2770	java/io/UnsupportedEncodingException
    //   970	1038	2770	java/io/UnsupportedEncodingException
    //   1069	1129	2770	java/io/UnsupportedEncodingException
    //   1166	1177	2770	java/io/UnsupportedEncodingException
    //   1183	1224	2770	java/io/UnsupportedEncodingException
    //   1227	1307	2770	java/io/UnsupportedEncodingException
    //   1409	1414	2770	java/io/UnsupportedEncodingException
    //   1414	1452	2775	java/io/UnsupportedEncodingException
    //   1455	1466	2775	java/io/UnsupportedEncodingException
    //   1470	1480	2775	java/io/UnsupportedEncodingException
    //   1543	1560	2775	java/io/UnsupportedEncodingException
    //   1566	1577	2775	java/io/UnsupportedEncodingException
    //   1734	1757	2775	java/io/UnsupportedEncodingException
    //   1763	1844	2775	java/io/UnsupportedEncodingException
    //   1888	1957	2775	java/io/UnsupportedEncodingException
    //   1975	1981	2775	java/io/UnsupportedEncodingException
    //   1999	2009	2775	java/io/UnsupportedEncodingException
    //   2009	2032	2775	java/io/UnsupportedEncodingException
    //   2037	2045	2775	java/io/UnsupportedEncodingException
    //   2048	2087	2775	java/io/UnsupportedEncodingException
    //   2118	2175	2775	java/io/UnsupportedEncodingException
    //   2207	2220	2775	java/io/UnsupportedEncodingException
    //   2230	2272	2775	java/io/UnsupportedEncodingException
    //   2279	2288	2775	java/io/UnsupportedEncodingException
    //   2294	2304	2775	java/io/UnsupportedEncodingException
    //   2304	2327	2775	java/io/UnsupportedEncodingException
    //   2332	2340	2775	java/io/UnsupportedEncodingException
    //   2343	2380	2775	java/io/UnsupportedEncodingException
    //   2411	2504	2775	java/io/UnsupportedEncodingException
    //   2512	2530	2775	java/io/UnsupportedEncodingException
    //   2548	2567	2775	java/io/UnsupportedEncodingException
    //   2570	2613	2775	java/io/UnsupportedEncodingException
    //   2618	2694	2775	java/io/UnsupportedEncodingException
    //   2694	2702	2780	java/io/UnsupportedEncodingException
  }
  
  private static String a(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return "ISO-8859-1";
        }
        return "UTF-8";
      }
      return "UTF-16BE";
    }
    return "UTF-16";
  }
  
  private static String a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 == 2) {
      return String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    }
    return String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
  }
  
  private static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
    throws UnsupportedEncodingException
  {
    if ((paramInt2 > paramInt1) && (paramInt2 <= paramArrayOfByte.length)) {
      return new String(paramArrayOfByte, paramInt1, paramInt2 - paramInt1, paramString);
    }
    return "";
  }
  
  private static boolean a(vy paramvy, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramvy.d();
    try
    {
      for (;;)
      {
        int j = paramvy.b();
        int k = 1;
        if (j < paramInt2) {
          break;
        }
        long l1;
        if (paramInt1 >= 3)
        {
          j = paramvy.l();
          l1 = paramvy.j();
          m = paramvy.f();
        }
        else
        {
          j = paramvy.i();
          n = paramvy.i();
          l1 = n;
          m = 0;
        }
        if ((j == 0) && (l1 == 0L) && (m == 0)) {
          return true;
        }
        long l2 = l1;
        if (paramInt1 == 4)
        {
          l2 = l1;
          if (!paramBoolean)
          {
            if ((0x808080 & l1) != 0L) {
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
            break label278;
          }
        }
        do
        {
          m = 0;
          j = n;
          n = m;
          break label278;
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
        int n = k;
        break label278;
        j = 0;
        n = j;
        label278:
        int m = j;
        if (n != 0) {
          m = j + 4;
        }
        if (l2 < m) {
          return false;
        }
        j = paramvy.b();
        if (j < l2) {
          return false;
        }
        j = (int)l2;
        paramvy.d(j);
      }
      return true;
    }
    finally
    {
      paramvy.c(i);
    }
  }
  
  private static int b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 3)) {
      return 2;
    }
    return 1;
  }
  
  private static int b(byte[] paramArrayOfByte, int paramInt)
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
  
  private static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {
      return wl.f;
    }
    return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final kd a(byte[] paramArrayOfByte, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    vy localvy = new vy(paramArrayOfByte, paramInt);
    paramInt = localvy.b();
    int i = 10;
    boolean bool1 = false;
    if (paramInt < 10) {
      Log.w("Id3Decoder", "Data too short to be an ID3 tag");
    }
    for (;;)
    {
      paramArrayOfByte = null;
      break;
      paramInt = localvy.i();
      if (paramInt != 4801587)
      {
        paramArrayOfByte = new StringBuilder(59);
        paramArrayOfByte.append("Unexpected first three bytes of ID3 tag header: ");
        paramArrayOfByte.append(paramInt);
        Log.w("Id3Decoder", paramArrayOfByte.toString());
      }
      else
      {
        int j = localvy.e();
        localvy.d(1);
        int k = localvy.e();
        m = localvy.o();
        if (j == 2)
        {
          if ((k & 0x40) != 0) {
            n = 1;
          } else {
            n = 0;
          }
          paramInt = m;
          if (n != 0) {
            Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
          }
        }
        else if (j == 3)
        {
          if ((k & 0x40) != 0) {
            n = 1;
          } else {
            n = 0;
          }
          paramInt = m;
          if (n != 0)
          {
            paramInt = localvy.l();
            localvy.d(paramInt);
            paramInt = m - (paramInt + 4);
          }
        }
        else
        {
          if (j != 4) {
            break label345;
          }
          if ((k & 0x40) != 0) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
          n = m;
          if (paramInt != 0)
          {
            paramInt = localvy.o();
            localvy.d(paramInt - 4);
            n = m - paramInt;
          }
          if ((k & 0x10) != 0) {
            m = 1;
          } else {
            m = 0;
          }
          paramInt = n;
          if (m != 0) {
            paramInt = n - 10;
          }
        }
        if ((j < 4) && ((k & 0x80) != 0)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        paramArrayOfByte = new lb(j, bool2, paramInt);
        break;
        label345:
        paramArrayOfByte = new StringBuilder(57);
        paramArrayOfByte.append("Skipped ID3 tag with unsupported majorVersion=");
        paramArrayOfByte.append(j);
        Log.w("Id3Decoder", paramArrayOfByte.toString());
      }
    }
    if (paramArrayOfByte == null) {
      return null;
    }
    int m = localvy.d();
    paramInt = i;
    if (lb.a(paramArrayOfByte) == 2) {
      paramInt = 6;
    }
    int n = lb.b(paramArrayOfByte);
    if (lb.c(paramArrayOfByte)) {
      n = a(localvy, lb.b(paramArrayOfByte));
    }
    localvy.b(m + n);
    boolean bool2 = bool1;
    if (!a(localvy, lb.a(paramArrayOfByte), paramInt, false)) {
      if ((lb.a(paramArrayOfByte) == 4) && (a(localvy, 4, paramInt, true)))
      {
        bool2 = true;
      }
      else
      {
        paramInt = lb.a(paramArrayOfByte);
        paramArrayOfByte = new StringBuilder(56);
        paramArrayOfByte.append("Failed to validate ID3 tag with majorVersion=");
        paramArrayOfByte.append(paramInt);
        Log.w("Id3Decoder", paramArrayOfByte.toString());
        return null;
      }
    }
    while (localvy.b() >= paramInt)
    {
      la localla = a(lb.a(paramArrayOfByte), localvy, bool2, paramInt, a);
      if (localla != null) {
        localArrayList.add(localla);
      }
    }
    return new kd(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */