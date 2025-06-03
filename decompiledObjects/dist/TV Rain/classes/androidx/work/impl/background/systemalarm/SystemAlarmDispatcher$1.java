package androidx.work.impl.background.systemalarm;

class SystemAlarmDispatcher$1
  implements Runnable
{
  public SystemAlarmDispatcher$1(SystemAlarmDispatcher paramSystemAlarmDispatcher) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   4: getfield 25	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mIntents	Ljava/util/List;
    //   7: astore_1
    //   8: aload_1
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   14: astore_2
    //   15: aload_2
    //   16: aload_2
    //   17: getfield 25	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mIntents	Ljava/util/List;
    //   20: iconst_0
    //   21: invokeinterface 31 2 0
    //   26: checkcast 33	android/content/Intent
    //   29: putfield 37	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mCurrentIntent	Landroid/content/Intent;
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_0
    //   35: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   38: getfield 37	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mCurrentIntent	Landroid/content/Intent;
    //   41: astore_1
    //   42: aload_1
    //   43: ifnull +344 -> 387
    //   46: aload_1
    //   47: invokevirtual 41	android/content/Intent:getAction	()Ljava/lang/String;
    //   50: astore_1
    //   51: aload_0
    //   52: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   55: getfield 37	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mCurrentIntent	Landroid/content/Intent;
    //   58: ldc 43
    //   60: iconst_0
    //   61: invokevirtual 47	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   64: istore_3
    //   65: invokestatic 52	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   68: astore_2
    //   69: getstatic 56	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:TAG	Ljava/lang/String;
    //   72: astore 4
    //   74: aload_2
    //   75: aload 4
    //   77: ldc 58
    //   79: iconst_2
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_0
    //   86: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   89: getfield 37	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mCurrentIntent	Landroid/content/Intent;
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: iload_3
    //   96: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   99: aastore
    //   100: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   103: iconst_0
    //   104: anewarray 72	java/lang/Throwable
    //   107: invokevirtual 76	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   110: aload_0
    //   111: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   114: getfield 80	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mContext	Landroid/content/Context;
    //   117: ldc 82
    //   119: iconst_2
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload_1
    //   126: aastore
    //   127: dup
    //   128: iconst_1
    //   129: iload_3
    //   130: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: aastore
    //   134: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   137: invokestatic 88	androidx/work/impl/utils/WakeLocks:newWakeLock	(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   140: astore_2
    //   141: invokestatic 52	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   144: aload 4
    //   146: ldc 90
    //   148: iconst_2
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload_1
    //   155: aastore
    //   156: dup
    //   157: iconst_1
    //   158: aload_2
    //   159: aastore
    //   160: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   163: iconst_0
    //   164: anewarray 72	java/lang/Throwable
    //   167: invokevirtual 76	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   170: aload_2
    //   171: invokevirtual 95	android/os/PowerManager$WakeLock:acquire	()V
    //   174: aload_0
    //   175: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   178: astore 5
    //   180: aload 5
    //   182: getfield 99	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mCommandHandler	Landroidx/work/impl/background/systemalarm/CommandHandler;
    //   185: aload 5
    //   187: getfield 37	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:mCurrentIntent	Landroid/content/Intent;
    //   190: iload_3
    //   191: aload 5
    //   193: invokevirtual 105	androidx/work/impl/background/systemalarm/CommandHandler:onHandleIntent	(Landroid/content/Intent;ILandroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;)V
    //   196: invokestatic 52	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   199: aload 4
    //   201: ldc 107
    //   203: iconst_2
    //   204: anewarray 4	java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: aload_1
    //   210: aastore
    //   211: dup
    //   212: iconst_1
    //   213: aload_2
    //   214: aastore
    //   215: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   218: iconst_0
    //   219: anewarray 72	java/lang/Throwable
    //   222: invokevirtual 76	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   225: aload_2
    //   226: invokevirtual 110	android/os/PowerManager$WakeLock:release	()V
    //   229: aload_0
    //   230: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   233: astore_1
    //   234: new 112	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$DequeueAndCheckForCompletion
    //   237: dup
    //   238: aload_1
    //   239: invokespecial 114	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$DequeueAndCheckForCompletion:<init>	(Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;)V
    //   242: astore_2
    //   243: goto +80 -> 323
    //   246: astore 4
    //   248: invokestatic 52	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   251: astore 5
    //   253: getstatic 56	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:TAG	Ljava/lang/String;
    //   256: astore 6
    //   258: aload 5
    //   260: aload 6
    //   262: ldc 116
    //   264: iconst_1
    //   265: anewarray 72	java/lang/Throwable
    //   268: dup
    //   269: iconst_0
    //   270: aload 4
    //   272: aastore
    //   273: invokevirtual 119	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   276: invokestatic 52	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   279: aload 6
    //   281: ldc 107
    //   283: iconst_2
    //   284: anewarray 4	java/lang/Object
    //   287: dup
    //   288: iconst_0
    //   289: aload_1
    //   290: aastore
    //   291: dup
    //   292: iconst_1
    //   293: aload_2
    //   294: aastore
    //   295: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   298: iconst_0
    //   299: anewarray 72	java/lang/Throwable
    //   302: invokevirtual 76	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   305: aload_2
    //   306: invokevirtual 110	android/os/PowerManager$WakeLock:release	()V
    //   309: aload_0
    //   310: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   313: astore_1
    //   314: new 112	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$DequeueAndCheckForCompletion
    //   317: dup
    //   318: aload_1
    //   319: invokespecial 114	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$DequeueAndCheckForCompletion:<init>	(Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;)V
    //   322: astore_2
    //   323: aload_1
    //   324: aload_2
    //   325: invokevirtual 123	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:postOnMainThread	(Ljava/lang/Runnable;)V
    //   328: goto +59 -> 387
    //   331: astore 4
    //   333: invokestatic 52	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   336: getstatic 56	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:TAG	Ljava/lang/String;
    //   339: ldc 107
    //   341: iconst_2
    //   342: anewarray 4	java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: aload_1
    //   348: aastore
    //   349: dup
    //   350: iconst_1
    //   351: aload_2
    //   352: aastore
    //   353: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   356: iconst_0
    //   357: anewarray 72	java/lang/Throwable
    //   360: invokevirtual 76	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   363: aload_2
    //   364: invokevirtual 110	android/os/PowerManager$WakeLock:release	()V
    //   367: aload_0
    //   368: getfield 17	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1:this$0	Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;
    //   371: astore_1
    //   372: aload_1
    //   373: new 112	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$DequeueAndCheckForCompletion
    //   376: dup
    //   377: aload_1
    //   378: invokespecial 114	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$DequeueAndCheckForCompletion:<init>	(Landroidx/work/impl/background/systemalarm/SystemAlarmDispatcher;)V
    //   381: invokevirtual 123	androidx/work/impl/background/systemalarm/SystemAlarmDispatcher:postOnMainThread	(Ljava/lang/Runnable;)V
    //   384: aload 4
    //   386: athrow
    //   387: return
    //   388: astore_2
    //   389: aload_1
    //   390: monitorexit
    //   391: aload_2
    //   392: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	393	0	this	1
    //   7	383	1	localObject1	Object
    //   14	350	2	localObject2	Object
    //   388	4	2	localObject3	Object
    //   64	127	3	i	int
    //   72	128	4	str1	String
    //   246	25	4	localObject4	Object
    //   331	54	4	localObject5	Object
    //   178	81	5	localObject6	Object
    //   256	24	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   141	196	246	finally
    //   248	276	331	finally
    //   10	34	388	finally
    //   389	391	388	finally
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */