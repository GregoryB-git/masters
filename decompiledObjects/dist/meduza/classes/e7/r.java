package e7;

import m6.j;

public final class r
{
  public final String a;
  public long b;
  
  public r(o paramo, String paramString)
  {
    j.e(paramString);
    a = paramString;
    b = -1L;
  }
  
  public r(o paramo, String paramString, long paramLong)
  {
    j.e(paramString);
    a = paramString;
    b = paramo.w("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[] { paramString, String.valueOf(paramLong) }, -1L);
  }
  
  /* Error */
  public final java.util.List<q> a()
  {
    // Byte code:
    //   0: new 52	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 53	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 25	e7/r:a	Ljava/lang/String;
    //   12: astore_2
    //   13: aload_0
    //   14: getfield 29	e7/r:b	J
    //   17: lstore_3
    //   18: aconst_null
    //   19: astore 5
    //   21: aconst_null
    //   22: astore 6
    //   24: aload_0
    //   25: getfield 14	e7/r:c	Le7/o;
    //   28: invokevirtual 57	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: ldc 59
    //   33: bipush 6
    //   35: anewarray 35	java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: ldc 61
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: ldc 63
    //   47: aastore
    //   48: dup
    //   49: iconst_2
    //   50: ldc 65
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc 67
    //   57: aastore
    //   58: dup
    //   59: iconst_4
    //   60: ldc 69
    //   62: aastore
    //   63: dup
    //   64: iconst_5
    //   65: ldc 71
    //   67: aastore
    //   68: ldc 73
    //   70: iconst_2
    //   71: anewarray 35	java/lang/String
    //   74: dup
    //   75: iconst_0
    //   76: aload_2
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: lload_3
    //   81: invokestatic 39	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   84: aastore
    //   85: aconst_null
    //   86: aconst_null
    //   87: ldc 61
    //   89: ldc 75
    //   91: invokevirtual 81	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore_2
    //   95: aload_2
    //   96: astore 6
    //   98: aload_2
    //   99: astore 5
    //   101: aload_2
    //   102: invokeinterface 87 1 0
    //   107: ifne +23 -> 130
    //   110: aload_2
    //   111: astore 6
    //   113: aload_2
    //   114: astore 5
    //   116: invokestatic 92	java/util/Collections:emptyList	()Ljava/util/List;
    //   119: astore 7
    //   121: aload_2
    //   122: invokeinterface 95 1 0
    //   127: aload 7
    //   129: areturn
    //   130: aload_2
    //   131: astore 6
    //   133: aload_2
    //   134: astore 5
    //   136: aload_2
    //   137: iconst_0
    //   138: invokeinterface 99 2 0
    //   143: lstore_3
    //   144: aload_2
    //   145: astore 6
    //   147: aload_2
    //   148: astore 5
    //   150: aload_2
    //   151: iconst_3
    //   152: invokeinterface 99 2 0
    //   157: lstore 8
    //   159: aload_2
    //   160: astore 6
    //   162: aload_2
    //   163: astore 5
    //   165: aload_2
    //   166: iconst_5
    //   167: invokeinterface 99 2 0
    //   172: lconst_1
    //   173: lcmp
    //   174: ifne +9 -> 183
    //   177: iconst_1
    //   178: istore 10
    //   180: goto +6 -> 186
    //   183: iconst_0
    //   184: istore 10
    //   186: aload_2
    //   187: astore 6
    //   189: aload_2
    //   190: astore 5
    //   192: aload_2
    //   193: iconst_4
    //   194: invokeinterface 103 2 0
    //   199: astore 7
    //   201: aload_2
    //   202: astore 6
    //   204: aload_2
    //   205: astore 5
    //   207: lload_3
    //   208: aload_0
    //   209: getfield 29	e7/r:b	J
    //   212: lcmp
    //   213: ifle +14 -> 227
    //   216: aload_2
    //   217: astore 6
    //   219: aload_2
    //   220: astore 5
    //   222: aload_0
    //   223: lload_3
    //   224: putfield 29	e7/r:b	J
    //   227: aload_2
    //   228: astore 6
    //   230: aload_2
    //   231: astore 5
    //   233: invokestatic 109	com/google/android/gms/internal/measurement/zzgf$zzf:zze	()Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   236: aload 7
    //   238: invokestatic 115	e7/o6:z	(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;
    //   241: checkcast 117	com/google/android/gms/internal/measurement/zzgf$zzf$zza
    //   244: astore 11
    //   246: aload_2
    //   247: astore 6
    //   249: aload_2
    //   250: astore 5
    //   252: aload_2
    //   253: iconst_1
    //   254: invokeinterface 121 2 0
    //   259: astore 7
    //   261: aload 7
    //   263: ifnull +6 -> 269
    //   266: goto +7 -> 273
    //   269: ldc 123
    //   271: astore 7
    //   273: aload_2
    //   274: astore 6
    //   276: aload_2
    //   277: astore 5
    //   279: aload 11
    //   281: aload 7
    //   283: invokevirtual 127	com/google/android/gms/internal/measurement/zzgf$zzf$zza:zza	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   286: aload_2
    //   287: iconst_2
    //   288: invokeinterface 99 2 0
    //   293: invokevirtual 131	com/google/android/gms/internal/measurement/zzgf$zzf$zza:zzb	(J)Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    //   296: pop
    //   297: aload_2
    //   298: astore 6
    //   300: aload_2
    //   301: astore 5
    //   303: new 133	e7/q
    //   306: astore 7
    //   308: aload_2
    //   309: astore 6
    //   311: aload_2
    //   312: astore 5
    //   314: aload 7
    //   316: lload_3
    //   317: lload 8
    //   319: iload 10
    //   321: aload 11
    //   323: invokevirtual 139	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   326: checkcast 141	com/google/android/gms/internal/measurement/zzkg
    //   329: checkcast 105	com/google/android/gms/internal/measurement/zzgf$zzf
    //   332: invokespecial 144	e7/q:<init>	(JJZLcom/google/android/gms/internal/measurement/zzgf$zzf;)V
    //   335: aload_2
    //   336: astore 6
    //   338: aload_2
    //   339: astore 5
    //   341: aload_1
    //   342: aload 7
    //   344: invokevirtual 148	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   347: pop
    //   348: goto +44 -> 392
    //   351: astore 5
    //   353: goto +105 -> 458
    //   356: astore_2
    //   357: goto +60 -> 417
    //   360: astore 7
    //   362: aload_2
    //   363: astore 6
    //   365: aload_2
    //   366: astore 5
    //   368: aload_0
    //   369: getfield 14	e7/r:c	Le7/o;
    //   372: invokevirtual 154	d2/q:zzj	()Le7/a1;
    //   375: getfield 160	e7/a1:o	Le7/b1;
    //   378: ldc -94
    //   380: aload_0
    //   381: getfield 25	e7/r:a	Ljava/lang/String;
    //   384: invokestatic 166	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   387: aload 7
    //   389: invokevirtual 172	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   392: aload_2
    //   393: astore 6
    //   395: aload_2
    //   396: astore 5
    //   398: aload_2
    //   399: invokeinterface 175 1 0
    //   404: istore 10
    //   406: iload 10
    //   408: ifne -278 -> 130
    //   411: aload_2
    //   412: astore 5
    //   414: goto +35 -> 449
    //   417: aload 5
    //   419: astore 6
    //   421: aload_0
    //   422: getfield 14	e7/r:c	Le7/o;
    //   425: invokevirtual 154	d2/q:zzj	()Le7/a1;
    //   428: getfield 160	e7/a1:o	Le7/b1;
    //   431: ldc -79
    //   433: aload_0
    //   434: getfield 25	e7/r:a	Ljava/lang/String;
    //   437: invokestatic 166	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   440: aload_2
    //   441: invokevirtual 172	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   444: aload 5
    //   446: ifnull +10 -> 456
    //   449: aload 5
    //   451: invokeinterface 95 1 0
    //   456: aload_1
    //   457: areturn
    //   458: aload 6
    //   460: ifnull +10 -> 470
    //   463: aload 6
    //   465: invokeinterface 95 1 0
    //   470: aload 5
    //   472: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	473	0	this	r
    //   7	450	1	localArrayList	java.util.ArrayList
    //   12	327	2	localObject1	Object
    //   356	85	2	localSQLiteException1	android.database.sqlite.SQLiteException
    //   17	300	3	l1	long
    //   19	321	5	localObject2	Object
    //   351	1	5	localObject3	Object
    //   366	105	5	localSQLiteException2	android.database.sqlite.SQLiteException
    //   22	442	6	localObject4	Object
    //   119	224	7	localObject5	Object
    //   360	28	7	localIOException	java.io.IOException
    //   157	161	8	l2	long
    //   178	229	10	bool	boolean
    //   244	78	11	localzza	com.google.android.gms.internal.measurement.zzgf.zzf.zza
    // Exception table:
    //   from	to	target	type
    //   24	95	351	finally
    //   101	110	351	finally
    //   116	121	351	finally
    //   136	144	351	finally
    //   150	159	351	finally
    //   165	177	351	finally
    //   192	201	351	finally
    //   207	216	351	finally
    //   222	227	351	finally
    //   233	246	351	finally
    //   252	261	351	finally
    //   279	297	351	finally
    //   303	308	351	finally
    //   314	335	351	finally
    //   341	348	351	finally
    //   368	392	351	finally
    //   398	406	351	finally
    //   421	444	351	finally
    //   24	95	356	android/database/sqlite/SQLiteException
    //   101	110	356	android/database/sqlite/SQLiteException
    //   116	121	356	android/database/sqlite/SQLiteException
    //   136	144	356	android/database/sqlite/SQLiteException
    //   150	159	356	android/database/sqlite/SQLiteException
    //   165	177	356	android/database/sqlite/SQLiteException
    //   192	201	356	android/database/sqlite/SQLiteException
    //   207	216	356	android/database/sqlite/SQLiteException
    //   222	227	356	android/database/sqlite/SQLiteException
    //   233	246	356	android/database/sqlite/SQLiteException
    //   252	261	356	android/database/sqlite/SQLiteException
    //   279	297	356	android/database/sqlite/SQLiteException
    //   303	308	356	android/database/sqlite/SQLiteException
    //   314	335	356	android/database/sqlite/SQLiteException
    //   341	348	356	android/database/sqlite/SQLiteException
    //   368	392	356	android/database/sqlite/SQLiteException
    //   398	406	356	android/database/sqlite/SQLiteException
    //   233	246	360	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     e7.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */