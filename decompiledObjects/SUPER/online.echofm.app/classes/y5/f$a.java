package y5;

import android.content.Context;
import java.util.concurrent.Callable;

public class f$a
  implements Callable
{
  public f$a(f paramf, Context paramContext) {}
  
  /* Error */
  public f.b b()
  {
    // Byte code:
    //   0: ldc 36
    //   2: invokestatic 42	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   5: astore_1
    //   6: aload_0
    //   7: getfield 19	y5/f$a:p	Ly5/f;
    //   10: aload_0
    //   11: getfield 21	y5/f$a:o	Landroid/content/Context;
    //   14: invokestatic 45	y5/f:c	(Ly5/f;Landroid/content/Context;)Ly5/g;
    //   17: pop
    //   18: aload_0
    //   19: getfield 19	y5/f$a:p	Ly5/f;
    //   22: invokestatic 49	y5/f:d	(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;
    //   25: invokevirtual 54	io/flutter/embedding/engine/FlutterJNI:loadLibrary	()V
    //   28: aload_0
    //   29: getfield 19	y5/f$a:p	Ly5/f;
    //   32: invokestatic 49	y5/f:d	(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;
    //   35: invokevirtual 57	io/flutter/embedding/engine/FlutterJNI:updateRefreshRate	()V
    //   38: aload_0
    //   39: getfield 19	y5/f$a:p	Ly5/f;
    //   42: invokestatic 61	y5/f:f	(Ly5/f;)Ljava/util/concurrent/ExecutorService;
    //   45: astore_2
    //   46: new 63	y5/e
    //   49: astore_3
    //   50: aload_3
    //   51: aload_0
    //   52: invokespecial 65	y5/e:<init>	(Ly5/f$a;)V
    //   55: aload_2
    //   56: aload_3
    //   57: invokeinterface 71 2 0
    //   62: new 73	y5/f$b
    //   65: dup
    //   66: aload_0
    //   67: getfield 21	y5/f$a:o	Landroid/content/Context;
    //   70: invokestatic 78	T5/c:d	(Landroid/content/Context;)Ljava/lang/String;
    //   73: aload_0
    //   74: getfield 21	y5/f$a:o	Landroid/content/Context;
    //   77: invokestatic 80	T5/c:a	(Landroid/content/Context;)Ljava/lang/String;
    //   80: aload_0
    //   81: getfield 21	y5/f$a:o	Landroid/content/Context;
    //   84: invokestatic 82	T5/c:c	(Landroid/content/Context;)Ljava/lang/String;
    //   87: aconst_null
    //   88: invokespecial 85	y5/f$b:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly5/f$a;)V
    //   91: astore_2
    //   92: aload_1
    //   93: ifnull +7 -> 100
    //   96: aload_1
    //   97: invokevirtual 88	T5/f:close	()V
    //   100: aload_2
    //   101: areturn
    //   102: astore_2
    //   103: goto +146 -> 249
    //   106: astore_3
    //   107: aload_3
    //   108: invokevirtual 92	java/lang/Object:toString	()Ljava/lang/String;
    //   111: ldc 94
    //   113: invokevirtual 100	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   116: ifne +20 -> 136
    //   119: aload_3
    //   120: invokevirtual 92	java/lang/Object:toString	()Ljava/lang/String;
    //   123: ldc 102
    //   125: invokevirtual 100	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   128: ifeq +6 -> 134
    //   131: goto +5 -> 136
    //   134: aload_3
    //   135: athrow
    //   136: ldc 104
    //   138: invokestatic 110	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   141: astore 4
    //   143: new 112	java/io/File
    //   146: astore_2
    //   147: aload_2
    //   148: aload_0
    //   149: getfield 19	y5/f$a:p	Ly5/f;
    //   152: invokestatic 116	y5/f:e	(Ly5/f;)Ly5/b;
    //   155: getfield 121	y5/b:f	Ljava/lang/String;
    //   158: invokespecial 124	java/io/File:<init>	(Ljava/lang/String;)V
    //   161: aload_2
    //   162: invokevirtual 128	java/io/File:list	()[Ljava/lang/String;
    //   165: astore 5
    //   167: new 130	java/lang/UnsupportedOperationException
    //   170: astore 6
    //   172: new 132	java/lang/StringBuilder
    //   175: astore 7
    //   177: aload 7
    //   179: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   182: aload 7
    //   184: ldc -121
    //   186: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload 7
    //   192: aload 4
    //   194: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload 7
    //   200: ldc -115
    //   202: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload 7
    //   208: aload_2
    //   209: invokevirtual 144	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   212: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload 7
    //   218: ldc -110
    //   220: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload 7
    //   226: aload 5
    //   228: invokestatic 151	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   231: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload 6
    //   237: aload 7
    //   239: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: aload_3
    //   243: invokespecial 155	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   246: aload 6
    //   248: athrow
    //   249: aload_1
    //   250: ifnull +16 -> 266
    //   253: aload_1
    //   254: invokevirtual 88	T5/f:close	()V
    //   257: goto +9 -> 266
    //   260: astore_1
    //   261: aload_2
    //   262: aload_1
    //   263: invokevirtual 161	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   266: aload_2
    //   267: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	this	a
    //   5	249	1	localf	T5.f
    //   260	3	1	localThrowable	Throwable
    //   45	56	2	localObject1	Object
    //   102	1	2	localObject2	Object
    //   146	121	2	localFile	java.io.File
    //   49	8	3	locale	e
    //   106	137	3	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   141	52	4	str	String
    //   165	62	5	arrayOfString	String[]
    //   170	77	6	localUnsupportedOperationException	UnsupportedOperationException
    //   175	63	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   6	18	102	finally
    //   18	28	102	finally
    //   28	92	102	finally
    //   107	131	102	finally
    //   134	136	102	finally
    //   136	249	102	finally
    //   18	28	106	java/lang/UnsatisfiedLinkError
    //   253	257	260	finally
  }
}

/* Location:
 * Qualified Name:     y5.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */