package e7;

import com.google.android.gms.internal.measurement.zzgf.zzf;

public final class z6
{
  public zzgf.zzf a;
  public Long b;
  public long c;
  
  public z6(y6 paramy6) {}
  
  /* Error */
  public final zzgf.zzf a(zzgf.zzf paramzzf, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 31	com/google/android/gms/internal/measurement/zzgf$zzf:zzg	()Ljava/lang/String;
    //   4: astore_3
    //   5: aload_1
    //   6: invokevirtual 35	com/google/android/gms/internal/measurement/zzgf$zzf:zzh	()Ljava/util/List;
    //   9: astore 4
    //   11: aload_0
    //   12: getfield 16	e7/z6:d	Le7/y6;
    //   15: invokevirtual 41	e7/z5:m	()Le7/o6;
    //   18: pop
    //   19: aload_1
    //   20: ldc 43
    //   22: invokestatic 49	e7/o6:T	(Lcom/google/android/gms/internal/measurement/zzgf$zzf;Ljava/lang/String;)Ljava/io/Serializable;
    //   25: checkcast 51	java/lang/Long
    //   28: astore 5
    //   30: aload 5
    //   32: ifnull +9 -> 41
    //   35: iconst_1
    //   36: istore 6
    //   38: goto +6 -> 44
    //   41: iconst_0
    //   42: istore 6
    //   44: iload 6
    //   46: ifeq +18 -> 64
    //   49: aload_3
    //   50: ldc 53
    //   52: invokevirtual 59	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: ifeq +9 -> 64
    //   58: iconst_1
    //   59: istore 7
    //   61: goto +6 -> 67
    //   64: iconst_0
    //   65: istore 7
    //   67: iload 7
    //   69: ifeq +663 -> 732
    //   72: aload 5
    //   74: invokestatic 65	m6/j:i	(Ljava/lang/Object;)V
    //   77: aload_0
    //   78: getfield 16	e7/z6:d	Le7/y6;
    //   81: invokevirtual 41	e7/z5:m	()Le7/o6;
    //   84: pop
    //   85: aload_1
    //   86: ldc 67
    //   88: invokestatic 49	e7/o6:T	(Lcom/google/android/gms/internal/measurement/zzgf$zzf;Ljava/lang/String;)Ljava/io/Serializable;
    //   91: checkcast 55	java/lang/String
    //   94: astore 8
    //   96: aload 8
    //   98: invokestatic 73	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   101: ifeq +22 -> 123
    //   104: aload_0
    //   105: getfield 16	e7/z6:d	Le7/y6;
    //   108: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   111: getfield 85	e7/a1:p	Le7/b1;
    //   114: ldc 87
    //   116: aload 5
    //   118: invokevirtual 92	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   121: aconst_null
    //   122: areturn
    //   123: aload_0
    //   124: getfield 94	e7/z6:a	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   127: ifnull +26 -> 153
    //   130: aload_0
    //   131: getfield 96	e7/z6:b	Ljava/lang/Long;
    //   134: ifnull +19 -> 153
    //   137: aload 5
    //   139: invokevirtual 100	java/lang/Long:longValue	()J
    //   142: aload_0
    //   143: getfield 96	e7/z6:b	Ljava/lang/Long;
    //   146: invokevirtual 100	java/lang/Long:longValue	()J
    //   149: lcmp
    //   150: ifeq +315 -> 465
    //   153: aload_0
    //   154: getfield 16	e7/z6:d	Le7/y6;
    //   157: invokevirtual 104	e7/z5:n	()Le7/o;
    //   160: astore 9
    //   162: aload 9
    //   164: invokevirtual 107	d2/q:l	()V
    //   167: aload 9
    //   169: invokevirtual 111	e7/h6:p	()V
    //   172: aload 9
    //   174: invokevirtual 117	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   177: ldc 119
    //   179: iconst_2
    //   180: anewarray 55	java/lang/String
    //   183: dup
    //   184: iconst_0
    //   185: aload_2
    //   186: aastore
    //   187: dup
    //   188: iconst_1
    //   189: aload 5
    //   191: invokestatic 123	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   194: aastore
    //   195: invokevirtual 129	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   198: astore 10
    //   200: aload 10
    //   202: astore 11
    //   204: aload 10
    //   206: invokeinterface 135 1 0
    //   211: ifne +33 -> 244
    //   214: aload 10
    //   216: astore 11
    //   218: aload 9
    //   220: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   223: getfield 138	e7/a1:w	Le7/b1;
    //   226: ldc -116
    //   228: invokevirtual 143	e7/b1:b	(Ljava/lang/String;)V
    //   231: aload 10
    //   233: invokeinterface 146 1 0
    //   238: aconst_null
    //   239: astore 10
    //   241: goto +156 -> 397
    //   244: aload 10
    //   246: astore 11
    //   248: aload 10
    //   250: iconst_0
    //   251: invokeinterface 150 2 0
    //   256: astore_3
    //   257: aload 10
    //   259: astore 11
    //   261: aload 10
    //   263: iconst_1
    //   264: invokeinterface 154 2 0
    //   269: lstore 12
    //   271: aload 10
    //   273: astore 11
    //   275: invokestatic 158	com/google/android/gms/internal/measurement/zzgf$zzf:zze	()Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   278: aload_3
    //   279: invokestatic 162	e7/o6:z	(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;
    //   282: checkcast 164	com/google/android/gms/internal/measurement/zzgf$zzf$zza
    //   285: invokevirtual 170	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   288: checkcast 172	com/google/android/gms/internal/measurement/zzkg
    //   291: checkcast 27	com/google/android/gms/internal/measurement/zzgf$zzf
    //   294: astore_3
    //   295: aload 10
    //   297: astore 11
    //   299: aload_3
    //   300: lload 12
    //   302: invokestatic 175	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   305: invokestatic 181	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   308: astore_3
    //   309: aload 10
    //   311: invokeinterface 146 1 0
    //   316: aload_3
    //   317: astore 10
    //   319: goto +78 -> 397
    //   322: astore_3
    //   323: goto +41 -> 364
    //   326: astore_3
    //   327: aload 10
    //   329: astore 11
    //   331: aload 9
    //   333: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   336: getfield 184	e7/a1:o	Le7/b1;
    //   339: aload_2
    //   340: invokestatic 187	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   343: aload 5
    //   345: aload_3
    //   346: ldc -67
    //   348: invokevirtual 192	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   351: goto +36 -> 387
    //   354: astore_1
    //   355: aconst_null
    //   356: astore_2
    //   357: goto +363 -> 720
    //   360: astore_3
    //   361: aconst_null
    //   362: astore 10
    //   364: aload 10
    //   366: astore 11
    //   368: aload 9
    //   370: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   373: getfield 184	e7/a1:o	Le7/b1;
    //   376: ldc -62
    //   378: aload_3
    //   379: invokevirtual 92	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   382: aload 10
    //   384: ifnull +10 -> 394
    //   387: aload 10
    //   389: invokeinterface 146 1 0
    //   394: aconst_null
    //   395: astore 10
    //   397: aload 10
    //   399: ifnull +296 -> 695
    //   402: aload 10
    //   404: getfield 198	android/util/Pair:first	Ljava/lang/Object;
    //   407: astore 11
    //   409: aload 11
    //   411: ifnonnull +6 -> 417
    //   414: goto +281 -> 695
    //   417: aload_0
    //   418: aload 11
    //   420: checkcast 27	com/google/android/gms/internal/measurement/zzgf$zzf
    //   423: putfield 94	e7/z6:a	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   426: aload_0
    //   427: aload 10
    //   429: getfield 201	android/util/Pair:second	Ljava/lang/Object;
    //   432: checkcast 51	java/lang/Long
    //   435: invokevirtual 100	java/lang/Long:longValue	()J
    //   438: putfield 203	e7/z6:c	J
    //   441: aload_0
    //   442: getfield 16	e7/z6:d	Le7/y6;
    //   445: invokevirtual 41	e7/z5:m	()Le7/o6;
    //   448: pop
    //   449: aload_0
    //   450: aload_0
    //   451: getfield 94	e7/z6:a	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   454: ldc 43
    //   456: invokestatic 49	e7/o6:T	(Lcom/google/android/gms/internal/measurement/zzgf$zzf;Ljava/lang/String;)Ljava/io/Serializable;
    //   459: checkcast 51	java/lang/Long
    //   462: putfield 96	e7/z6:b	Ljava/lang/Long;
    //   465: aload_0
    //   466: getfield 203	e7/z6:c	J
    //   469: lconst_1
    //   470: lsub
    //   471: lstore 12
    //   473: aload_0
    //   474: lload 12
    //   476: putfield 203	e7/z6:c	J
    //   479: lload 12
    //   481: lconst_0
    //   482: lcmp
    //   483: ifgt +70 -> 553
    //   486: aload_0
    //   487: getfield 16	e7/z6:d	Le7/y6;
    //   490: invokevirtual 104	e7/z5:n	()Le7/o;
    //   493: astore 10
    //   495: aload 10
    //   497: invokevirtual 107	d2/q:l	()V
    //   500: aload 10
    //   502: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   505: getfield 138	e7/a1:w	Le7/b1;
    //   508: ldc -51
    //   510: aload_2
    //   511: invokevirtual 92	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   514: aload 10
    //   516: invokevirtual 117	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   519: ldc -49
    //   521: iconst_1
    //   522: anewarray 55	java/lang/String
    //   525: dup
    //   526: iconst_0
    //   527: aload_2
    //   528: aastore
    //   529: invokevirtual 211	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   532: goto +42 -> 574
    //   535: astore_2
    //   536: aload 10
    //   538: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   541: getfield 184	e7/a1:o	Le7/b1;
    //   544: ldc -43
    //   546: aload_2
    //   547: invokevirtual 92	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   550: goto +24 -> 574
    //   553: aload_0
    //   554: getfield 16	e7/z6:d	Le7/y6;
    //   557: invokevirtual 104	e7/z5:n	()Le7/o;
    //   560: aload_2
    //   561: aload 5
    //   563: aload_0
    //   564: getfield 203	e7/z6:c	J
    //   567: aload_0
    //   568: getfield 94	e7/z6:a	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   571: invokevirtual 217	e7/o:O	(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzgf$zzf;)V
    //   574: new 219	java/util/ArrayList
    //   577: dup
    //   578: invokespecial 220	java/util/ArrayList:<init>	()V
    //   581: astore_2
    //   582: aload_0
    //   583: getfield 94	e7/z6:a	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   586: invokevirtual 35	com/google/android/gms/internal/measurement/zzgf$zzf:zzh	()Ljava/util/List;
    //   589: invokeinterface 226 1 0
    //   594: astore 11
    //   596: aload 11
    //   598: invokeinterface 231 1 0
    //   603: ifeq +45 -> 648
    //   606: aload 11
    //   608: invokeinterface 235 1 0
    //   613: checkcast 237	com/google/android/gms/internal/measurement/zzgf$zzh
    //   616: astore 10
    //   618: aload_0
    //   619: getfield 16	e7/z6:d	Le7/y6;
    //   622: invokevirtual 41	e7/z5:m	()Le7/o6;
    //   625: pop
    //   626: aload_1
    //   627: aload 10
    //   629: invokevirtual 238	com/google/android/gms/internal/measurement/zzgf$zzh:zzg	()Ljava/lang/String;
    //   632: invokestatic 242	e7/o6:y	(Lcom/google/android/gms/internal/measurement/zzgf$zzf;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf$zzh;
    //   635: ifnonnull -39 -> 596
    //   638: aload_2
    //   639: aload 10
    //   641: invokevirtual 245	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   644: pop
    //   645: goto -49 -> 596
    //   648: aload_2
    //   649: invokevirtual 247	java/util/ArrayList:isEmpty	()Z
    //   652: ifne +13 -> 665
    //   655: aload_2
    //   656: aload 4
    //   658: invokevirtual 251	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   661: pop
    //   662: goto +23 -> 685
    //   665: aload_0
    //   666: getfield 16	e7/z6:d	Le7/y6;
    //   669: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   672: getfield 85	e7/a1:p	Le7/b1;
    //   675: ldc -3
    //   677: aload 8
    //   679: invokevirtual 92	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   682: aload 4
    //   684: astore_2
    //   685: aload 8
    //   687: astore 10
    //   689: aload_2
    //   690: astore 11
    //   692: goto +182 -> 874
    //   695: aload_0
    //   696: getfield 16	e7/z6:d	Le7/y6;
    //   699: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   702: getfield 85	e7/a1:p	Le7/b1;
    //   705: ldc -1
    //   707: aload 8
    //   709: aload 5
    //   711: invokevirtual 258	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   714: aconst_null
    //   715: areturn
    //   716: astore_1
    //   717: aload 11
    //   719: astore_2
    //   720: aload_2
    //   721: ifnull +9 -> 730
    //   724: aload_2
    //   725: invokeinterface 146 1 0
    //   730: aload_1
    //   731: athrow
    //   732: aload_3
    //   733: astore 10
    //   735: aload 4
    //   737: astore 11
    //   739: iload 6
    //   741: ifeq +133 -> 874
    //   744: aload_0
    //   745: aload 5
    //   747: putfield 96	e7/z6:b	Ljava/lang/Long;
    //   750: aload_0
    //   751: aload_1
    //   752: putfield 94	e7/z6:a	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   755: aload_0
    //   756: getfield 16	e7/z6:d	Le7/y6;
    //   759: invokevirtual 41	e7/z5:m	()Le7/o6;
    //   762: pop
    //   763: lconst_0
    //   764: invokestatic 175	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   767: astore 10
    //   769: aload_1
    //   770: ldc_w 260
    //   773: invokestatic 49	e7/o6:T	(Lcom/google/android/gms/internal/measurement/zzgf$zzf;Ljava/lang/String;)Ljava/io/Serializable;
    //   776: astore 11
    //   778: aload 11
    //   780: ifnonnull +6 -> 786
    //   783: goto +7 -> 790
    //   786: aload 11
    //   788: astore 10
    //   790: aload 10
    //   792: checkcast 51	java/lang/Long
    //   795: invokevirtual 100	java/lang/Long:longValue	()J
    //   798: lstore 12
    //   800: aload_0
    //   801: lload 12
    //   803: putfield 203	e7/z6:c	J
    //   806: lload 12
    //   808: lconst_0
    //   809: lcmp
    //   810: ifgt +30 -> 840
    //   813: aload_0
    //   814: getfield 16	e7/z6:d	Le7/y6;
    //   817: invokevirtual 79	d2/q:zzj	()Le7/a1;
    //   820: getfield 85	e7/a1:p	Le7/b1;
    //   823: ldc_w 262
    //   826: aload_3
    //   827: invokevirtual 92	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   830: aload_3
    //   831: astore 10
    //   833: aload 4
    //   835: astore 11
    //   837: goto +37 -> 874
    //   840: aload_0
    //   841: getfield 16	e7/z6:d	Le7/y6;
    //   844: invokevirtual 104	e7/z5:n	()Le7/o;
    //   847: astore 10
    //   849: aload 5
    //   851: invokestatic 65	m6/j:i	(Ljava/lang/Object;)V
    //   854: aload 10
    //   856: aload_2
    //   857: aload 5
    //   859: aload_0
    //   860: getfield 203	e7/z6:c	J
    //   863: aload_1
    //   864: invokevirtual 217	e7/o:O	(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzgf$zzf;)V
    //   867: aload 4
    //   869: astore 11
    //   871: aload_3
    //   872: astore 10
    //   874: aload_1
    //   875: invokevirtual 266	com/google/android/gms/internal/measurement/zzkg:zzch	()Lcom/google/android/gms/internal/measurement/zzkg$zza;
    //   878: checkcast 164	com/google/android/gms/internal/measurement/zzgf$zzf$zza
    //   881: aload 10
    //   883: invokevirtual 270	com/google/android/gms/internal/measurement/zzgf$zzf$zza:zza	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   886: invokevirtual 273	com/google/android/gms/internal/measurement/zzgf$zzf$zza:zzd	()Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   889: aload 11
    //   891: invokevirtual 276	com/google/android/gms/internal/measurement/zzgf$zzf$zza:zza	(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   894: invokevirtual 170	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   897: checkcast 172	com/google/android/gms/internal/measurement/zzkg
    //   900: checkcast 27	com/google/android/gms/internal/measurement/zzgf$zzf
    //   903: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	904	0	this	z6
    //   0	904	1	paramzzf	zzgf.zzf
    //   0	904	2	paramString	String
    //   4	313	3	localObject1	Object
    //   322	1	3	localSQLiteException1	android.database.sqlite.SQLiteException
    //   326	20	3	localIOException	java.io.IOException
    //   360	512	3	localSQLiteException2	android.database.sqlite.SQLiteException
    //   9	859	4	localList	java.util.List
    //   28	830	5	localLong	Long
    //   36	704	6	i	int
    //   59	9	7	j	int
    //   94	614	8	str	String
    //   160	209	9	localo	o
    //   198	684	10	localObject2	Object
    //   202	688	11	localObject3	Object
    //   269	538	12	l	long
    // Exception table:
    //   from	to	target	type
    //   204	214	322	android/database/sqlite/SQLiteException
    //   218	231	322	android/database/sqlite/SQLiteException
    //   248	257	322	android/database/sqlite/SQLiteException
    //   261	271	322	android/database/sqlite/SQLiteException
    //   275	295	322	android/database/sqlite/SQLiteException
    //   299	309	322	android/database/sqlite/SQLiteException
    //   331	351	322	android/database/sqlite/SQLiteException
    //   275	295	326	java/io/IOException
    //   172	200	354	finally
    //   172	200	360	android/database/sqlite/SQLiteException
    //   514	532	535	android/database/sqlite/SQLiteException
    //   204	214	716	finally
    //   218	231	716	finally
    //   248	257	716	finally
    //   261	271	716	finally
    //   275	295	716	finally
    //   299	309	716	finally
    //   331	351	716	finally
    //   368	382	716	finally
  }
}

/* Location:
 * Qualified Name:     e7.z6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */