package androidx.appcompat.widget;

import android.os.AsyncTask;

final class ActivityChooserModel$PersistHistoryAsyncTask
  extends AsyncTask<Object, Void, Void>
{
  public ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel paramActivityChooserModel) {}
  
  /* Error */
  public Void doInBackground(Object... paramVarArgs)
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: aaload
    //   3: checkcast 33	java/util/List
    //   6: astore_2
    //   7: aload_1
    //   8: iconst_1
    //   9: aaload
    //   10: checkcast 35	java/lang/String
    //   13: astore_3
    //   14: aload_0
    //   15: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   18: getfield 39	androidx/appcompat/widget/ActivityChooserModel:mContext	Landroid/content/Context;
    //   21: aload_3
    //   22: iconst_0
    //   23: invokevirtual 45	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   26: astore_1
    //   27: invokestatic 51	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   30: astore 4
    //   32: aload 4
    //   34: aload_1
    //   35: aconst_null
    //   36: invokeinterface 57 3 0
    //   41: aload 4
    //   43: ldc 59
    //   45: getstatic 65	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   48: invokeinterface 69 3 0
    //   53: aload 4
    //   55: aconst_null
    //   56: ldc 71
    //   58: invokeinterface 75 3 0
    //   63: pop
    //   64: aload_2
    //   65: invokeinterface 79 1 0
    //   70: istore 5
    //   72: iconst_0
    //   73: istore 6
    //   75: iload 6
    //   77: iload 5
    //   79: if_icmpge +96 -> 175
    //   82: aload_2
    //   83: iconst_0
    //   84: invokeinterface 83 2 0
    //   89: checkcast 85	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord
    //   92: astore_3
    //   93: aload 4
    //   95: aconst_null
    //   96: ldc 87
    //   98: invokeinterface 75 3 0
    //   103: pop
    //   104: aload 4
    //   106: aconst_null
    //   107: ldc 89
    //   109: aload_3
    //   110: getfield 92	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:activity	Landroid/content/ComponentName;
    //   113: invokevirtual 98	android/content/ComponentName:flattenToString	()Ljava/lang/String;
    //   116: invokeinterface 102 4 0
    //   121: pop
    //   122: aload 4
    //   124: aconst_null
    //   125: ldc 104
    //   127: aload_3
    //   128: getfield 107	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:time	J
    //   131: invokestatic 111	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   134: invokeinterface 102 4 0
    //   139: pop
    //   140: aload 4
    //   142: aconst_null
    //   143: ldc 113
    //   145: aload_3
    //   146: getfield 116	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:weight	F
    //   149: invokestatic 119	java/lang/String:valueOf	(F)Ljava/lang/String;
    //   152: invokeinterface 102 4 0
    //   157: pop
    //   158: aload 4
    //   160: aconst_null
    //   161: ldc 87
    //   163: invokeinterface 122 3 0
    //   168: pop
    //   169: iinc 6 1
    //   172: goto -97 -> 75
    //   175: aload 4
    //   177: aconst_null
    //   178: ldc 71
    //   180: invokeinterface 122 3 0
    //   185: pop
    //   186: aload 4
    //   188: invokeinterface 125 1 0
    //   193: aload_0
    //   194: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   197: iconst_1
    //   198: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
    //   201: aload_1
    //   202: ifnull +194 -> 396
    //   205: aload_1
    //   206: invokevirtual 134	java/io/FileOutputStream:close	()V
    //   209: goto +187 -> 396
    //   212: astore_3
    //   213: goto +185 -> 398
    //   216: astore 4
    //   218: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   221: astore_3
    //   222: new 140	java/lang/StringBuilder
    //   225: astore_2
    //   226: aload_2
    //   227: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   230: aload_2
    //   231: ldc -113
    //   233: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload_2
    //   238: aload_0
    //   239: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   242: getfield 150	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   245: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload_3
    //   250: aload_2
    //   251: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   254: aload 4
    //   256: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   259: pop
    //   260: aload_0
    //   261: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   264: iconst_1
    //   265: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
    //   268: aload_1
    //   269: ifnull +127 -> 396
    //   272: goto -67 -> 205
    //   275: astore_3
    //   276: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   279: astore_2
    //   280: new 140	java/lang/StringBuilder
    //   283: astore 4
    //   285: aload 4
    //   287: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   290: aload 4
    //   292: ldc -113
    //   294: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: aload 4
    //   300: aload_0
    //   301: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   304: getfield 150	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   307: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload_2
    //   312: aload 4
    //   314: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: aload_3
    //   318: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   321: pop
    //   322: aload_0
    //   323: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   326: iconst_1
    //   327: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
    //   330: aload_1
    //   331: ifnull +65 -> 396
    //   334: goto -129 -> 205
    //   337: astore_2
    //   338: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   341: astore 4
    //   343: new 140	java/lang/StringBuilder
    //   346: astore_3
    //   347: aload_3
    //   348: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   351: aload_3
    //   352: ldc -113
    //   354: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: aload_3
    //   359: aload_0
    //   360: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   363: getfield 150	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   366: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload 4
    //   372: aload_3
    //   373: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: aload_2
    //   377: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   380: pop
    //   381: aload_0
    //   382: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   385: iconst_1
    //   386: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
    //   389: aload_1
    //   390: ifnull +6 -> 396
    //   393: goto -188 -> 205
    //   396: aconst_null
    //   397: areturn
    //   398: aload_0
    //   399: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
    //   402: iconst_1
    //   403: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
    //   406: aload_1
    //   407: ifnull +7 -> 414
    //   410: aload_1
    //   411: invokevirtual 134	java/io/FileOutputStream:close	()V
    //   414: aload_3
    //   415: athrow
    //   416: astore_1
    //   417: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   420: astore_2
    //   421: new 140	java/lang/StringBuilder
    //   424: dup
    //   425: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   428: astore 4
    //   430: aload 4
    //   432: ldc -113
    //   434: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: pop
    //   438: aload 4
    //   440: aload_3
    //   441: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: pop
    //   445: aload_2
    //   446: aload 4
    //   448: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   451: aload_1
    //   452: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   455: pop
    //   456: aconst_null
    //   457: areturn
    //   458: astore_1
    //   459: goto -63 -> 396
    //   462: astore_1
    //   463: goto -49 -> 414
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	466	0	this	PersistHistoryAsyncTask
    //   0	466	1	paramVarArgs	Object[]
    //   6	306	2	localObject1	Object
    //   337	40	2	localIllegalArgumentException	IllegalArgumentException
    //   420	26	2	str1	String
    //   13	133	3	localObject2	Object
    //   212	1	3	localObject3	Object
    //   221	29	3	str2	String
    //   275	43	3	localIllegalStateException	IllegalStateException
    //   346	95	3	localStringBuilder	StringBuilder
    //   30	157	4	localXmlSerializer	org.xmlpull.v1.XmlSerializer
    //   216	39	4	localIOException	java.io.IOException
    //   283	164	4	localObject4	Object
    //   70	10	5	i	int
    //   73	97	6	j	int
    // Exception table:
    //   from	to	target	type
    //   32	72	212	finally
    //   82	169	212	finally
    //   175	193	212	finally
    //   218	260	212	finally
    //   276	322	212	finally
    //   338	381	212	finally
    //   32	72	216	java/io/IOException
    //   82	169	216	java/io/IOException
    //   175	193	216	java/io/IOException
    //   32	72	275	java/lang/IllegalStateException
    //   82	169	275	java/lang/IllegalStateException
    //   175	193	275	java/lang/IllegalStateException
    //   32	72	337	java/lang/IllegalArgumentException
    //   82	169	337	java/lang/IllegalArgumentException
    //   175	193	337	java/lang/IllegalArgumentException
    //   14	27	416	java/io/FileNotFoundException
    //   205	209	458	java/io/IOException
    //   410	414	462	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */