package a4;

import android.os.Handler;
import android.os.Looper;

public final class a$c
  extends Handler
{
  public boolean a;
  
  public a$c(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  /* Error */
  public final void handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 31	android/os/Message:obj	Ljava/lang/Object;
    //   4: checkcast 33	a4/a$d
    //   7: astore_2
    //   8: iconst_1
    //   9: istore_3
    //   10: aload_1
    //   11: getfield 37	android/os/Message:what	I
    //   14: istore 4
    //   16: iload 4
    //   18: ifeq +55 -> 73
    //   21: iload 4
    //   23: iconst_1
    //   24: if_icmpne +36 -> 60
    //   27: aload_0
    //   28: getfield 15	a4/a$c:b	La4/a;
    //   31: astore 5
    //   33: aload 5
    //   35: getfield 41	a4/a:l	La4/w;
    //   38: aload 5
    //   40: getfield 45	a4/a:m	Ljava/util/UUID;
    //   43: aload_2
    //   44: getfield 47	a4/a$d:c	Ljava/lang/Object;
    //   47: checkcast 49	a4/o$a
    //   50: invokeinterface 54 3 0
    //   55: astore 5
    //   57: goto +361 -> 418
    //   60: new 56	java/lang/RuntimeException
    //   63: astore 5
    //   65: aload 5
    //   67: invokespecial 59	java/lang/RuntimeException:<init>	()V
    //   70: aload 5
    //   72: athrow
    //   73: aload_0
    //   74: getfield 15	a4/a$c:b	La4/a;
    //   77: getfield 41	a4/a:l	La4/w;
    //   80: aload_2
    //   81: getfield 47	a4/a$d:c	Ljava/lang/Object;
    //   84: checkcast 61	a4/o$d
    //   87: invokeinterface 64 2 0
    //   92: astore 5
    //   94: goto +324 -> 418
    //   97: astore 5
    //   99: ldc 66
    //   101: ldc 68
    //   103: aload 5
    //   105: invokestatic 74	v5/m:g	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   108: goto +310 -> 418
    //   111: astore 6
    //   113: aload_1
    //   114: getfield 31	android/os/Message:obj	Ljava/lang/Object;
    //   117: checkcast 33	a4/a$d
    //   120: astore 7
    //   122: aload 7
    //   124: getfield 76	a4/a$d:b	Z
    //   127: ifne +6 -> 133
    //   130: goto +275 -> 405
    //   133: aload 7
    //   135: getfield 79	a4/a$d:d	I
    //   138: iconst_1
    //   139: iadd
    //   140: istore 4
    //   142: aload 7
    //   144: iload 4
    //   146: putfield 79	a4/a$d:d	I
    //   149: iload 4
    //   151: aload_0
    //   152: getfield 15	a4/a$c:b	La4/a;
    //   155: getfield 83	a4/a:j	Lt5/c0;
    //   158: checkcast 85	t5/u
    //   161: iconst_3
    //   162: invokevirtual 88	t5/u:b	(I)I
    //   165: if_icmple +6 -> 171
    //   168: goto +237 -> 405
    //   171: new 90	z4/n
    //   174: astore 5
    //   176: invokestatic 96	android/os/SystemClock:elapsedRealtime	()J
    //   179: pop2
    //   180: invokestatic 96	android/os/SystemClock:elapsedRealtime	()J
    //   183: pop2
    //   184: aload 6
    //   186: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   189: instanceof 104
    //   192: ifeq +16 -> 208
    //   195: aload 6
    //   197: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   200: checkcast 104	java/io/IOException
    //   203: astore 5
    //   205: goto +17 -> 222
    //   208: new 106	a4/a$f
    //   211: dup
    //   212: aload 6
    //   214: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   217: invokespecial 109	a4/a$f:<init>	(Ljava/lang/Throwable;)V
    //   220: astore 5
    //   222: aload_0
    //   223: getfield 15	a4/a$c:b	La4/a;
    //   226: getfield 83	a4/a:j	Lt5/c0;
    //   229: astore 8
    //   231: aload 7
    //   233: getfield 79	a4/a$d:d	I
    //   236: istore 9
    //   238: aload 8
    //   240: checkcast 85	t5/u
    //   243: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
    //   246: pop
    //   247: aload 5
    //   249: instanceof 117
    //   252: ifne +106 -> 358
    //   255: aload 5
    //   257: instanceof 119
    //   260: ifne +98 -> 358
    //   263: aload 5
    //   265: instanceof 121
    //   268: ifne +90 -> 358
    //   271: aload 5
    //   273: instanceof 123
    //   276: ifne +82 -> 358
    //   279: getstatic 127	t5/l:b	I
    //   282: istore 4
    //   284: aload 5
    //   286: ifnull +41 -> 327
    //   289: aload 5
    //   291: instanceof 125
    //   294: ifeq +23 -> 317
    //   297: aload 5
    //   299: checkcast 125	t5/l
    //   302: getfield 129	t5/l:a	I
    //   305: sipush 2008
    //   308: if_icmpne +9 -> 317
    //   311: iconst_1
    //   312: istore 4
    //   314: goto +16 -> 330
    //   317: aload 5
    //   319: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   322: astore 5
    //   324: goto -40 -> 284
    //   327: iconst_0
    //   328: istore 4
    //   330: iload 4
    //   332: ifeq +6 -> 338
    //   335: goto +23 -> 358
    //   338: iload 9
    //   340: iconst_1
    //   341: isub
    //   342: sipush 1000
    //   345: imul
    //   346: sipush 5000
    //   349: invokestatic 135	java/lang/Math:min	(II)I
    //   352: i2l
    //   353: lstore 10
    //   355: goto +8 -> 363
    //   358: ldc2_w 136
    //   361: lstore 10
    //   363: lload 10
    //   365: ldc2_w 136
    //   368: lcmp
    //   369: ifne +6 -> 375
    //   372: goto +33 -> 405
    //   375: aload_0
    //   376: monitorenter
    //   377: aload_0
    //   378: getfield 139	a4/a$c:a	Z
    //   381: ifne +22 -> 403
    //   384: aload_0
    //   385: aload_1
    //   386: invokestatic 143	android/os/Message:obtain	(Landroid/os/Message;)Landroid/os/Message;
    //   389: lload 10
    //   391: invokevirtual 147	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
    //   394: pop
    //   395: aload_0
    //   396: monitorexit
    //   397: iload_3
    //   398: istore 4
    //   400: goto +8 -> 408
    //   403: aload_0
    //   404: monitorexit
    //   405: iconst_0
    //   406: istore 4
    //   408: iload 4
    //   410: ifeq +4 -> 414
    //   413: return
    //   414: aload 6
    //   416: astore 5
    //   418: aload_0
    //   419: getfield 15	a4/a$c:b	La4/a;
    //   422: getfield 83	a4/a:j	Lt5/c0;
    //   425: astore 6
    //   427: aload_2
    //   428: getfield 150	a4/a$d:a	J
    //   431: lstore 10
    //   433: aload 6
    //   435: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
    //   438: pop
    //   439: aload_0
    //   440: monitorenter
    //   441: aload_0
    //   442: getfield 139	a4/a$c:a	Z
    //   445: ifne +29 -> 474
    //   448: aload_0
    //   449: getfield 15	a4/a$c:b	La4/a;
    //   452: getfield 154	a4/a:o	La4/a$e;
    //   455: aload_1
    //   456: getfield 37	android/os/Message:what	I
    //   459: aload_2
    //   460: getfield 47	a4/a$d:c	Ljava/lang/Object;
    //   463: aload 5
    //   465: invokestatic 160	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   468: invokevirtual 164	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   471: invokevirtual 167	android/os/Message:sendToTarget	()V
    //   474: aload_0
    //   475: monitorexit
    //   476: return
    //   477: astore_1
    //   478: aload_0
    //   479: monitorexit
    //   480: aload_1
    //   481: athrow
    //   482: astore_1
    //   483: aload_0
    //   484: monitorexit
    //   485: aload_1
    //   486: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	487	0	this	c
    //   0	487	1	paramMessage	android.os.Message
    //   7	453	2	locald1	a.d
    //   9	389	3	i	int
    //   14	395	4	j	int
    //   31	62	5	localObject1	Object
    //   97	7	5	localException	Exception
    //   174	290	5	localObject2	Object
    //   111	304	6	localx	x
    //   425	9	6	localc01	t5.c0
    //   120	112	7	locald2	a.d
    //   229	10	8	localc02	t5.c0
    //   236	106	9	k	int
    //   353	79	10	l	long
    // Exception table:
    //   from	to	target	type
    //   10	16	97	java/lang/Exception
    //   27	57	97	java/lang/Exception
    //   60	73	97	java/lang/Exception
    //   73	94	97	java/lang/Exception
    //   10	16	111	a4/x
    //   27	57	111	a4/x
    //   60	73	111	a4/x
    //   73	94	111	a4/x
    //   441	474	477	finally
    //   474	476	477	finally
    //   478	480	477	finally
    //   377	397	482	finally
    //   403	405	482	finally
    //   483	485	482	finally
  }
}

/* Location:
 * Qualified Name:     a4.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */