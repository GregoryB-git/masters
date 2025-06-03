package qc;

import b.a0;
import d2.h0;
import eb.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.j1;
import nc.l;
import pc.a;
import rc.b;
import rc.m;
import wb.c;

public final class t<T>
  extends b<u>
  implements q<T>, e, m<T>
{
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state");
  private volatile Object _state;
  public int d;
  
  public t(Object paramObject)
  {
    _state = paramObject;
  }
  
  public final e<T> a(ub.h paramh, int paramInt, a parama)
  {
    int i = 0;
    int j = i;
    if (paramInt >= 0)
    {
      j = i;
      if (paramInt < 2) {
        j = 1;
      }
    }
    if (((j == 0) && (paramInt != -2)) || ((parama == a.b) || (((paramInt == 0) || (paramInt == -3)) && (parama == a.a)))) {
      paramh = this;
    } else {
      paramh = new rc.i(this, paramh, paramInt, parama);
    }
    return paramh;
  }
  
  public final T b()
  {
    h0 localh0 = y.b;
    Object localObject1 = e.get(this);
    Object localObject2 = localObject1;
    if (localObject1 == localh0) {
      localObject2 = null;
    }
    return (T)localObject2;
  }
  
  /* Error */
  public final Object collect(f<? super T> paramf, ub.e<?> parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: astore_3
    //   2: aload_2
    //   3: instanceof 13
    //   6: ifeq +37 -> 43
    //   9: aload_2
    //   10: checkcast 13	qc/t$a
    //   13: astore 4
    //   15: aload 4
    //   17: getfield 72	qc/t$a:p	I
    //   20: istore 5
    //   22: iload 5
    //   24: ldc 73
    //   26: iand
    //   27: ifeq +16 -> 43
    //   30: aload 4
    //   32: iload 5
    //   34: ldc 73
    //   36: iadd
    //   37: putfield 72	qc/t$a:p	I
    //   40: goto +14 -> 54
    //   43: new 13	qc/t$a
    //   46: dup
    //   47: aload_0
    //   48: aload_2
    //   49: invokespecial 76	qc/t$a:<init>	(Lqc/t;Lub/e;)V
    //   52: astore 4
    //   54: aload 4
    //   56: getfield 79	qc/t$a:f	Ljava/lang/Object;
    //   59: astore 6
    //   61: getstatic 84	vb/a:a	Lvb/a;
    //   64: astore 7
    //   66: aload 4
    //   68: getfield 72	qc/t$a:p	I
    //   71: istore 5
    //   73: iload 5
    //   75: ifeq +174 -> 249
    //   78: iload 5
    //   80: iconst_1
    //   81: if_icmpeq +134 -> 215
    //   84: iload 5
    //   86: iconst_2
    //   87: if_icmpeq +71 -> 158
    //   90: iload 5
    //   92: iconst_3
    //   93: if_icmpne +55 -> 148
    //   96: aload 4
    //   98: getfield 86	qc/t$a:e	Ljava/lang/Object;
    //   101: astore 8
    //   103: aload 4
    //   105: getfield 89	qc/t$a:d	Lnc/j1;
    //   108: astore_3
    //   109: aload 4
    //   111: getfield 93	qc/t$a:c	Lqc/u;
    //   114: astore 9
    //   116: aload 4
    //   118: getfield 96	qc/t$a:b	Lqc/f;
    //   121: astore 10
    //   123: aload 4
    //   125: getfield 99	qc/t$a:a	Lqc/t;
    //   128: astore 11
    //   130: aload 9
    //   132: astore_2
    //   133: aload 11
    //   135: astore_1
    //   136: aload 6
    //   138: invokestatic 103	rb/f:b	(Ljava/lang/Object;)V
    //   141: aload 4
    //   143: astore 12
    //   145: goto +353 -> 498
    //   148: new 105	java/lang/IllegalStateException
    //   151: dup
    //   152: ldc 107
    //   154: invokespecial 110	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   157: athrow
    //   158: aload 4
    //   160: getfield 86	qc/t$a:e	Ljava/lang/Object;
    //   163: astore 13
    //   165: aload 4
    //   167: getfield 89	qc/t$a:d	Lnc/j1;
    //   170: astore 14
    //   172: aload 4
    //   174: getfield 93	qc/t$a:c	Lqc/u;
    //   177: astore 11
    //   179: aload 4
    //   181: getfield 96	qc/t$a:b	Lqc/f;
    //   184: astore 15
    //   186: aload 4
    //   188: getfield 99	qc/t$a:a	Lqc/t;
    //   191: astore 16
    //   193: aload 11
    //   195: astore_2
    //   196: aload 16
    //   198: astore_1
    //   199: aload 6
    //   201: invokestatic 103	rb/f:b	(Ljava/lang/Object;)V
    //   204: aload 4
    //   206: astore 6
    //   208: aload 11
    //   210: astore 4
    //   212: goto +534 -> 746
    //   215: aload 4
    //   217: getfield 93	qc/t$a:c	Lqc/u;
    //   220: astore 9
    //   222: aload 4
    //   224: getfield 96	qc/t$a:b	Lqc/f;
    //   227: astore_3
    //   228: aload 4
    //   230: getfield 99	qc/t$a:a	Lqc/t;
    //   233: astore 11
    //   235: aload 9
    //   237: astore_2
    //   238: aload 11
    //   240: astore_1
    //   241: aload 6
    //   243: invokestatic 103	rb/f:b	(Ljava/lang/Object;)V
    //   246: goto +213 -> 459
    //   249: aload 6
    //   251: invokestatic 103	rb/f:b	(Ljava/lang/Object;)V
    //   254: aload_0
    //   255: monitorenter
    //   256: aload_0
    //   257: getfield 113	rc/b:a	[Lrc/c;
    //   260: astore_2
    //   261: aload_2
    //   262: ifnonnull +16 -> 278
    //   265: iconst_2
    //   266: anewarray 115	qc/u
    //   269: astore_1
    //   270: aload_0
    //   271: aload_1
    //   272: putfield 113	rc/b:a	[Lrc/c;
    //   275: goto +42 -> 317
    //   278: aload_2
    //   279: astore_1
    //   280: aload_0
    //   281: getfield 117	rc/b:b	I
    //   284: aload_2
    //   285: arraylength
    //   286: if_icmplt +31 -> 317
    //   289: aload_2
    //   290: aload_2
    //   291: arraylength
    //   292: iconst_2
    //   293: imul
    //   294: invokestatic 123	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   297: astore_1
    //   298: aload_1
    //   299: ldc 125
    //   301: invokestatic 130	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   304: aload_0
    //   305: aload_1
    //   306: checkcast 131	[Lrc/c;
    //   309: putfield 113	rc/b:a	[Lrc/c;
    //   312: aload_1
    //   313: checkcast 131	[Lrc/c;
    //   316: astore_1
    //   317: aload_0
    //   318: getfield 133	rc/b:c	I
    //   321: istore 17
    //   323: aload_1
    //   324: iload 17
    //   326: aaload
    //   327: astore 11
    //   329: aload 11
    //   331: astore_2
    //   332: aload 11
    //   334: ifnonnull +16 -> 350
    //   337: new 115	qc/u
    //   340: astore_2
    //   341: aload_2
    //   342: invokespecial 134	qc/u:<init>	()V
    //   345: aload_1
    //   346: iload 17
    //   348: aload_2
    //   349: aastore
    //   350: iinc 17 1
    //   353: iload 17
    //   355: istore 5
    //   357: iload 17
    //   359: aload_1
    //   360: arraylength
    //   361: if_icmplt +6 -> 367
    //   364: iconst_0
    //   365: istore 5
    //   367: iload 5
    //   369: istore 17
    //   371: aload_2
    //   372: aload_0
    //   373: invokevirtual 139	rc/c:a	(Ljava/lang/Object;)Z
    //   376: ifeq -53 -> 323
    //   379: aload_0
    //   380: iload 5
    //   382: putfield 133	rc/b:c	I
    //   385: aload_0
    //   386: aload_0
    //   387: getfield 117	rc/b:b	I
    //   390: iconst_1
    //   391: iadd
    //   392: putfield 117	rc/b:b	I
    //   395: aload_0
    //   396: monitorexit
    //   397: aload_2
    //   398: checkcast 115	qc/u
    //   401: astore 9
    //   403: aload_3
    //   404: instanceof 141
    //   407: ifeq +49 -> 456
    //   410: aload_3
    //   411: checkcast 141	qc/w
    //   414: astore_1
    //   415: aload 4
    //   417: aload_0
    //   418: putfield 99	qc/t$a:a	Lqc/t;
    //   421: aload 4
    //   423: aload_3
    //   424: putfield 96	qc/t$a:b	Lqc/f;
    //   427: aload 4
    //   429: aload 9
    //   431: putfield 93	qc/t$a:c	Lqc/u;
    //   434: aload 4
    //   436: iconst_1
    //   437: putfield 72	qc/t$a:p	I
    //   440: aload_1
    //   441: aload 4
    //   443: invokevirtual 144	qc/w:a	(Lub/e;)Lrb/h;
    //   446: astore_1
    //   447: aload_1
    //   448: aload 7
    //   450: if_acmpne +6 -> 456
    //   453: aload 7
    //   455: areturn
    //   456: aload_0
    //   457: astore 11
    //   459: aload 9
    //   461: astore_2
    //   462: aload 11
    //   464: astore_1
    //   465: aload 4
    //   467: invokeinterface 150 1 0
    //   472: getstatic 155	nc/j1$b:a	Lnc/j1$b;
    //   475: invokeinterface 160 2 0
    //   480: checkcast 162	nc/j1
    //   483: astore 13
    //   485: aconst_null
    //   486: astore 8
    //   488: aload_3
    //   489: astore 10
    //   491: aload 13
    //   493: astore_3
    //   494: aload 4
    //   496: astore 12
    //   498: aload 9
    //   500: astore_2
    //   501: aload 11
    //   503: astore_1
    //   504: getstatic 32	qc/t:e	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   507: aload 11
    //   509: invokevirtual 66	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   512: astore 18
    //   514: aload_3
    //   515: ifnull +39 -> 554
    //   518: aload 9
    //   520: astore_2
    //   521: aload 11
    //   523: astore_1
    //   524: aload_3
    //   525: invokeinterface 166 1 0
    //   530: ifeq +6 -> 536
    //   533: goto +21 -> 554
    //   536: aload 9
    //   538: astore_2
    //   539: aload 11
    //   541: astore_1
    //   542: aload_3
    //   543: invokeinterface 170 1 0
    //   548: athrow
    //   549: astore 4
    //   551: goto +576 -> 1127
    //   554: aload 8
    //   556: ifnull +42 -> 598
    //   559: aload 9
    //   561: astore_2
    //   562: aload 11
    //   564: astore_1
    //   565: aload 8
    //   567: astore 13
    //   569: aload 12
    //   571: astore 6
    //   573: aload_3
    //   574: astore 14
    //   576: aload 9
    //   578: astore 4
    //   580: aload 10
    //   582: astore 15
    //   584: aload 11
    //   586: astore 16
    //   588: aload 8
    //   590: aload 18
    //   592: invokestatic 173	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   595: ifne +151 -> 746
    //   598: aload 9
    //   600: astore_2
    //   601: aload 11
    //   603: astore_1
    //   604: aload 18
    //   606: getstatic 62	eb/y:b	Ld2/h0;
    //   609: if_acmpne +9 -> 618
    //   612: aconst_null
    //   613: astore 4
    //   615: goto +7 -> 622
    //   618: aload 18
    //   620: astore 4
    //   622: aload 9
    //   624: astore_2
    //   625: aload 11
    //   627: astore_1
    //   628: aload 12
    //   630: aload 11
    //   632: putfield 99	qc/t$a:a	Lqc/t;
    //   635: aload 9
    //   637: astore_2
    //   638: aload 11
    //   640: astore_1
    //   641: aload 12
    //   643: aload 10
    //   645: putfield 96	qc/t$a:b	Lqc/f;
    //   648: aload 9
    //   650: astore_2
    //   651: aload 11
    //   653: astore_1
    //   654: aload 12
    //   656: aload 9
    //   658: putfield 93	qc/t$a:c	Lqc/u;
    //   661: aload 9
    //   663: astore_2
    //   664: aload 11
    //   666: astore_1
    //   667: aload 12
    //   669: aload_3
    //   670: putfield 89	qc/t$a:d	Lnc/j1;
    //   673: aload 9
    //   675: astore_2
    //   676: aload 11
    //   678: astore_1
    //   679: aload 12
    //   681: aload 18
    //   683: putfield 86	qc/t$a:e	Ljava/lang/Object;
    //   686: aload 9
    //   688: astore_2
    //   689: aload 11
    //   691: astore_1
    //   692: aload 12
    //   694: iconst_2
    //   695: putfield 72	qc/t$a:p	I
    //   698: aload 9
    //   700: astore_2
    //   701: aload 11
    //   703: astore_1
    //   704: aload 10
    //   706: aload 4
    //   708: aload 12
    //   710: invokeinterface 179 3 0
    //   715: aload 7
    //   717: if_acmpne +6 -> 723
    //   720: aload 7
    //   722: areturn
    //   723: aload 18
    //   725: astore 13
    //   727: aload 11
    //   729: astore 16
    //   731: aload 10
    //   733: astore 15
    //   735: aload 9
    //   737: astore 4
    //   739: aload_3
    //   740: astore 14
    //   742: aload 12
    //   744: astore 6
    //   746: aload 4
    //   748: astore_2
    //   749: aload 16
    //   751: astore_1
    //   752: aload 4
    //   754: invokevirtual 183	java/lang/Object:getClass	()Ljava/lang/Class;
    //   757: pop
    //   758: aload 4
    //   760: astore_2
    //   761: aload 16
    //   763: astore_1
    //   764: getstatic 185	qc/u:a	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   767: astore 19
    //   769: aload 4
    //   771: astore_2
    //   772: aload 16
    //   774: astore_1
    //   775: getstatic 190	b/a0:R	Ld2/h0;
    //   778: astore 18
    //   780: aload 4
    //   782: astore_2
    //   783: aload 16
    //   785: astore_1
    //   786: aload 19
    //   788: aload 4
    //   790: aload 18
    //   792: invokevirtual 194	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:getAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   795: astore 11
    //   797: aload 4
    //   799: astore_2
    //   800: aload 16
    //   802: astore_1
    //   803: aload 11
    //   805: invokestatic 195	ec/i:b	(Ljava/lang/Object;)V
    //   808: aload 4
    //   810: astore_2
    //   811: aload 16
    //   813: astore_1
    //   814: aload 11
    //   816: getstatic 198	b/a0:S	Ld2/h0;
    //   819: if_acmpne +9 -> 828
    //   822: iconst_1
    //   823: istore 5
    //   825: goto +6 -> 831
    //   828: iconst_0
    //   829: istore 5
    //   831: aload 13
    //   833: astore 8
    //   835: aload 6
    //   837: astore 12
    //   839: aload 14
    //   841: astore_3
    //   842: aload 4
    //   844: astore 9
    //   846: aload 15
    //   848: astore 10
    //   850: aload 16
    //   852: astore 11
    //   854: iload 5
    //   856: ifne -358 -> 498
    //   859: aload 4
    //   861: astore_2
    //   862: aload 16
    //   864: astore_1
    //   865: aload 6
    //   867: aload 16
    //   869: putfield 99	qc/t$a:a	Lqc/t;
    //   872: aload 4
    //   874: astore_2
    //   875: aload 16
    //   877: astore_1
    //   878: aload 6
    //   880: aload 15
    //   882: putfield 96	qc/t$a:b	Lqc/f;
    //   885: aload 4
    //   887: astore_2
    //   888: aload 16
    //   890: astore_1
    //   891: aload 6
    //   893: aload 4
    //   895: putfield 93	qc/t$a:c	Lqc/u;
    //   898: aload 4
    //   900: astore_2
    //   901: aload 16
    //   903: astore_1
    //   904: aload 6
    //   906: aload 14
    //   908: putfield 89	qc/t$a:d	Lnc/j1;
    //   911: aload 4
    //   913: astore_2
    //   914: aload 16
    //   916: astore_1
    //   917: aload 6
    //   919: aload 13
    //   921: putfield 86	qc/t$a:e	Ljava/lang/Object;
    //   924: aload 4
    //   926: astore_2
    //   927: aload 16
    //   929: astore_1
    //   930: aload 6
    //   932: iconst_3
    //   933: putfield 72	qc/t$a:p	I
    //   936: aload 4
    //   938: astore_2
    //   939: aload 16
    //   941: astore_1
    //   942: new 200	nc/l
    //   945: astore 11
    //   947: aload 4
    //   949: astore_2
    //   950: aload 16
    //   952: astore_1
    //   953: aload 11
    //   955: iconst_1
    //   956: aload 6
    //   958: invokestatic 206	p2/m0:P	(Lub/e;)Lub/e;
    //   961: invokespecial 209	nc/l:<init>	(ILub/e;)V
    //   964: aload 4
    //   966: astore_2
    //   967: aload 16
    //   969: astore_1
    //   970: aload 11
    //   972: invokevirtual 212	nc/l:t	()V
    //   975: aload 4
    //   977: astore_2
    //   978: aload 16
    //   980: astore_1
    //   981: aload 19
    //   983: aload 4
    //   985: aload 18
    //   987: aload 11
    //   989: invokevirtual 216	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   992: ifeq +9 -> 1001
    //   995: iconst_1
    //   996: istore 5
    //   998: goto +24 -> 1022
    //   1001: aload 4
    //   1003: astore_2
    //   1004: aload 16
    //   1006: astore_1
    //   1007: aload 19
    //   1009: aload 4
    //   1011: invokevirtual 66	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1014: aload 18
    //   1016: if_acmpeq -41 -> 975
    //   1019: iconst_0
    //   1020: istore 5
    //   1022: iload 5
    //   1024: ifne +17 -> 1041
    //   1027: aload 4
    //   1029: astore_2
    //   1030: aload 16
    //   1032: astore_1
    //   1033: aload 11
    //   1035: getstatic 221	rb/h:a	Lrb/h;
    //   1038: invokevirtual 224	nc/l:resumeWith	(Ljava/lang/Object;)V
    //   1041: aload 4
    //   1043: astore_2
    //   1044: aload 16
    //   1046: astore_1
    //   1047: aload 11
    //   1049: invokevirtual 227	nc/l:s	()Ljava/lang/Object;
    //   1052: astore 11
    //   1054: aload 4
    //   1056: astore_2
    //   1057: aload 16
    //   1059: astore_1
    //   1060: aload 11
    //   1062: getstatic 84	vb/a:a	Lvb/a;
    //   1065: if_acmpne +9 -> 1074
    //   1068: aload 11
    //   1070: astore_1
    //   1071: goto +17 -> 1088
    //   1074: aload 4
    //   1076: astore_2
    //   1077: aload 16
    //   1079: astore_1
    //   1080: getstatic 221	rb/h:a	Lrb/h;
    //   1083: astore 11
    //   1085: aload 11
    //   1087: astore_1
    //   1088: aload 13
    //   1090: astore 8
    //   1092: aload 6
    //   1094: astore 12
    //   1096: aload 14
    //   1098: astore_3
    //   1099: aload 4
    //   1101: astore 9
    //   1103: aload 15
    //   1105: astore 10
    //   1107: aload 16
    //   1109: astore 11
    //   1111: aload_1
    //   1112: aload 7
    //   1114: if_acmpne -616 -> 498
    //   1117: aload 7
    //   1119: areturn
    //   1120: astore 4
    //   1122: aload_0
    //   1123: astore_1
    //   1124: aload 9
    //   1126: astore_2
    //   1127: aload_1
    //   1128: monitorenter
    //   1129: aload_1
    //   1130: getfield 117	rc/b:b	I
    //   1133: iconst_1
    //   1134: isub
    //   1135: istore 5
    //   1137: aload_1
    //   1138: iload 5
    //   1140: putfield 117	rc/b:b	I
    //   1143: iload 5
    //   1145: ifne +8 -> 1153
    //   1148: aload_1
    //   1149: iconst_0
    //   1150: putfield 133	rc/b:c	I
    //   1153: aload_2
    //   1154: ldc -27
    //   1156: invokestatic 231	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1159: aload_2
    //   1160: aload_1
    //   1161: invokevirtual 234	qc/u:b	(Lqc/t;)V
    //   1164: aload_1
    //   1165: monitorexit
    //   1166: aload 4
    //   1168: athrow
    //   1169: astore_2
    //   1170: aload_1
    //   1171: monitorexit
    //   1172: aload_2
    //   1173: athrow
    //   1174: astore_1
    //   1175: aload_0
    //   1176: monitorexit
    //   1177: aload_1
    //   1178: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1179	0	this	t
    //   0	1179	1	paramf	f<? super T>
    //   0	1179	2	parame	ub.e<?>
    //   1	1098	3	localObject1	Object
    //   13	482	4	localObject2	Object
    //   549	1	4	localObject3	Object
    //   578	522	4	localObject4	Object
    //   1120	47	4	localObject5	Object
    //   20	1124	5	i	int
    //   59	1034	6	localObject6	Object
    //   64	1054	7	locala	vb.a
    //   101	990	8	localObject7	Object
    //   114	1011	9	localObject8	Object
    //   121	985	10	localObject9	Object
    //   128	982	11	localObject10	Object
    //   143	952	12	localObject11	Object
    //   163	926	13	localObject12	Object
    //   170	927	14	localObject13	Object
    //   184	920	15	localObject14	Object
    //   191	917	16	localObject15	Object
    //   321	49	17	j	int
    //   512	503	18	localObject16	Object
    //   767	241	19	localAtomicReferenceFieldUpdater	AtomicReferenceFieldUpdater
    // Exception table:
    //   from	to	target	type
    //   136	141	549	finally
    //   199	204	549	finally
    //   241	246	549	finally
    //   465	485	549	finally
    //   504	514	549	finally
    //   524	533	549	finally
    //   542	549	549	finally
    //   588	598	549	finally
    //   604	612	549	finally
    //   628	635	549	finally
    //   641	648	549	finally
    //   654	661	549	finally
    //   667	673	549	finally
    //   679	686	549	finally
    //   692	698	549	finally
    //   704	720	549	finally
    //   752	758	549	finally
    //   764	769	549	finally
    //   775	780	549	finally
    //   786	797	549	finally
    //   803	808	549	finally
    //   814	822	549	finally
    //   865	872	549	finally
    //   878	885	549	finally
    //   891	898	549	finally
    //   904	911	549	finally
    //   917	924	549	finally
    //   930	936	549	finally
    //   942	947	549	finally
    //   953	964	549	finally
    //   970	975	549	finally
    //   981	995	549	finally
    //   1007	1019	549	finally
    //   1033	1041	549	finally
    //   1047	1054	549	finally
    //   1060	1068	549	finally
    //   1080	1085	549	finally
    //   403	447	1120	finally
    //   1129	1143	1169	finally
    //   1148	1153	1169	finally
    //   1153	1164	1169	finally
    //   256	261	1174	finally
    //   265	275	1174	finally
    //   280	317	1174	finally
    //   317	323	1174	finally
    //   337	345	1174	finally
    //   357	364	1174	finally
    //   371	395	1174	finally
  }
  
  public final Object emit(T paramT, ub.e<? super rb.h> parame)
  {
    setValue(paramT);
    return rb.h.a;
  }
  
  public final void setValue(T paramT)
  {
    Object localObject1 = paramT;
    if (paramT == null) {
      localObject1 = y.b;
    }
    try
    {
      paramT = e;
      boolean bool = ec.i.a(paramT.get(this), localObject1);
      if (bool) {}
      for (;;)
      {
        break;
        paramT.set(this, localObject1);
        int i = d;
        if ((i & 0x1) == 0)
        {
          i++;
          d = i;
          paramT = a;
          localObject1 = rb.h.a;
          label74:
          u[] arrayOfu = (u[])paramT;
          int k;
          if (arrayOfu != null)
          {
            int j = arrayOfu.length;
            label256:
            for (k = 0; k < j; k++)
            {
              localObject1 = arrayOfu[k];
              if (localObject1 != null)
              {
                paramT = u.a;
                Object localObject2;
                int m;
                do
                {
                  Object localObject4;
                  do
                  {
                    localObject2 = paramT.get(localObject1);
                    if (localObject2 == null) {
                      break label256;
                    }
                    localObject3 = a0.S;
                    if (localObject2 == localObject3) {
                      break label256;
                    }
                    localObject4 = a0.R;
                    if (localObject2 != localObject4) {
                      break;
                    }
                    localObject4 = u.a;
                    do
                    {
                      if (((AtomicReferenceFieldUpdater)localObject4).compareAndSet(localObject1, localObject2, localObject3))
                      {
                        m = 1;
                        break;
                      }
                    } while (((AtomicReferenceFieldUpdater)localObject4).get(localObject1) == localObject2);
                    m = 0;
                  } while (m == 0);
                  break;
                  Object localObject3 = u.a;
                  do
                  {
                    if (((AtomicReferenceFieldUpdater)localObject3).compareAndSet(localObject1, localObject2, localObject4))
                    {
                      m = 1;
                      break;
                    }
                  } while (((AtomicReferenceFieldUpdater)localObject3).get(localObject1) == localObject2);
                  m = 0;
                } while (m == 0);
                ((l)localObject2).resumeWith(rb.h.a);
              }
            }
          }
          try
          {
            k = d;
            if (k == i)
            {
              d = (i + 1);
              continue;
            }
            paramT = a;
            localObject1 = rb.h.a;
            i = k;
            break label74;
          }
          finally {}
        }
        else
        {
          d = (i + 2);
        }
      }
      return;
    }
    finally {}
  }
  
  @wb.e(c="kotlinx.coroutines.flow.StateFlowImpl", f="StateFlow.kt", l={384, 396, 401}, m="collect")
  public static final class a
    extends c
  {
    public t a;
    public f b;
    public u c;
    public j1 d;
    public Object e;
    public int p;
    
    public a(t<T> paramt, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      f = paramObject;
      p |= 0x80000000;
      return o.collect(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     qc.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */