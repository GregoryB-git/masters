package io.flutter.embedding.engine.loader;

import android.content.Context;
import java.util.concurrent.Callable;

class FlutterLoader$1
  implements Callable<FlutterLoader.InitResult>
{
  /* Error */
  public FlutterLoader.InitResult call()
  {
    // Byte code:
    //   0: ldc 47
    //   2: invokestatic 53	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   5: astore_1
    //   6: aload_0
    //   7: getfield 20	io/flutter/embedding/engine/loader/FlutterLoader$1:this$0	Lio/flutter/embedding/engine/loader/FlutterLoader;
    //   10: aload_0
    //   11: getfield 22	io/flutter/embedding/engine/loader/FlutterLoader$1:val$appContext	Landroid/content/Context;
    //   14: invokestatic 57	io/flutter/embedding/engine/loader/FlutterLoader:access$000	(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;)Lio/flutter/embedding/engine/loader/ResourceExtractor;
    //   17: astore_2
    //   18: aload_0
    //   19: getfield 20	io/flutter/embedding/engine/loader/FlutterLoader$1:this$0	Lio/flutter/embedding/engine/loader/FlutterLoader;
    //   22: invokestatic 36	io/flutter/embedding/engine/loader/FlutterLoader:access$100	(Lio/flutter/embedding/engine/loader/FlutterLoader;)Lio/flutter/embedding/engine/FlutterJNI;
    //   25: aload_0
    //   26: getfield 22	io/flutter/embedding/engine/loader/FlutterLoader$1:val$appContext	Landroid/content/Context;
    //   29: invokevirtual 61	io/flutter/embedding/engine/FlutterJNI:loadLibrary	(Landroid/content/Context;)V
    //   32: aload_0
    //   33: getfield 20	io/flutter/embedding/engine/loader/FlutterLoader$1:this$0	Lio/flutter/embedding/engine/loader/FlutterLoader;
    //   36: invokestatic 36	io/flutter/embedding/engine/loader/FlutterLoader:access$100	(Lio/flutter/embedding/engine/loader/FlutterLoader;)Lio/flutter/embedding/engine/FlutterJNI;
    //   39: invokevirtual 64	io/flutter/embedding/engine/FlutterJNI:updateRefreshRate	()V
    //   42: aload_0
    //   43: getfield 20	io/flutter/embedding/engine/loader/FlutterLoader$1:this$0	Lio/flutter/embedding/engine/loader/FlutterLoader;
    //   46: invokestatic 68	io/flutter/embedding/engine/loader/FlutterLoader:access$300	(Lio/flutter/embedding/engine/loader/FlutterLoader;)Ljava/util/concurrent/ExecutorService;
    //   49: astore_3
    //   50: new 70	io/flutter/embedding/engine/loader/b
    //   53: astore 4
    //   55: aload 4
    //   57: aload_0
    //   58: invokespecial 72	io/flutter/embedding/engine/loader/b:<init>	(Lio/flutter/embedding/engine/loader/FlutterLoader$1;)V
    //   61: aload_3
    //   62: aload 4
    //   64: invokeinterface 78 2 0
    //   69: aload_2
    //   70: ifnull +7 -> 77
    //   73: aload_2
    //   74: invokevirtual 83	io/flutter/embedding/engine/loader/ResourceExtractor:waitForCompletion	()V
    //   77: new 85	io/flutter/embedding/engine/loader/FlutterLoader$InitResult
    //   80: dup
    //   81: aload_0
    //   82: getfield 22	io/flutter/embedding/engine/loader/FlutterLoader$1:val$appContext	Landroid/content/Context;
    //   85: invokestatic 91	io/flutter/util/PathUtils:getFilesDir	(Landroid/content/Context;)Ljava/lang/String;
    //   88: aload_0
    //   89: getfield 22	io/flutter/embedding/engine/loader/FlutterLoader$1:val$appContext	Landroid/content/Context;
    //   92: invokestatic 94	io/flutter/util/PathUtils:getCacheDirectory	(Landroid/content/Context;)Ljava/lang/String;
    //   95: aload_0
    //   96: getfield 22	io/flutter/embedding/engine/loader/FlutterLoader$1:val$appContext	Landroid/content/Context;
    //   99: invokestatic 97	io/flutter/util/PathUtils:getDataDirectory	(Landroid/content/Context;)Ljava/lang/String;
    //   102: aconst_null
    //   103: invokespecial 100	io/flutter/embedding/engine/loader/FlutterLoader$InitResult:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/loader/FlutterLoader$1;)V
    //   106: astore_2
    //   107: aload_1
    //   108: ifnull +7 -> 115
    //   111: aload_1
    //   112: invokevirtual 103	io/flutter/util/TraceSection:close	()V
    //   115: aload_2
    //   116: areturn
    //   117: astore_3
    //   118: aload_3
    //   119: invokevirtual 107	java/lang/Object:toString	()Ljava/lang/String;
    //   122: ldc 109
    //   124: invokevirtual 115	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   127: ifne +20 -> 147
    //   130: aload_3
    //   131: invokevirtual 107	java/lang/Object:toString	()Ljava/lang/String;
    //   134: ldc 117
    //   136: invokevirtual 115	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   139: ifeq +6 -> 145
    //   142: goto +5 -> 147
    //   145: aload_3
    //   146: athrow
    //   147: ldc 119
    //   149: invokestatic 125	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   152: astore 5
    //   154: new 127	java/io/File
    //   157: astore 6
    //   159: aload 6
    //   161: aload_0
    //   162: getfield 20	io/flutter/embedding/engine/loader/FlutterLoader$1:this$0	Lio/flutter/embedding/engine/loader/FlutterLoader;
    //   165: invokestatic 131	io/flutter/embedding/engine/loader/FlutterLoader:access$200	(Lio/flutter/embedding/engine/loader/FlutterLoader;)Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   168: getfield 137	io/flutter/embedding/engine/loader/FlutterApplicationInfo:nativeLibraryDir	Ljava/lang/String;
    //   171: invokespecial 140	java/io/File:<init>	(Ljava/lang/String;)V
    //   174: aload 6
    //   176: invokevirtual 144	java/io/File:list	()[Ljava/lang/String;
    //   179: astore_2
    //   180: new 146	java/lang/UnsupportedOperationException
    //   183: astore 4
    //   185: new 148	java/lang/StringBuilder
    //   188: astore 7
    //   190: aload 7
    //   192: invokespecial 149	java/lang/StringBuilder:<init>	()V
    //   195: aload 7
    //   197: ldc -105
    //   199: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload 7
    //   205: aload 5
    //   207: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload 7
    //   213: ldc -99
    //   215: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload 7
    //   221: aload 6
    //   223: invokevirtual 160	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   226: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload 7
    //   232: ldc -94
    //   234: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload 6
    //   240: invokevirtual 166	java/io/File:exists	()Z
    //   243: ifeq +40 -> 283
    //   246: new 148	java/lang/StringBuilder
    //   249: astore 6
    //   251: aload 6
    //   253: invokespecial 149	java/lang/StringBuilder:<init>	()V
    //   256: aload 6
    //   258: ldc -88
    //   260: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: aload 6
    //   266: aload_2
    //   267: invokestatic 173	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   270: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload 6
    //   276: invokevirtual 174	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: astore_2
    //   280: goto +6 -> 286
    //   283: ldc -80
    //   285: astore_2
    //   286: aload 7
    //   288: aload_2
    //   289: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload 4
    //   295: aload 7
    //   297: invokevirtual 174	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   300: aload_3
    //   301: invokespecial 179	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   304: aload 4
    //   306: athrow
    //   307: astore_2
    //   308: aload_1
    //   309: ifnull +16 -> 325
    //   312: aload_1
    //   313: invokevirtual 103	io/flutter/util/TraceSection:close	()V
    //   316: goto +9 -> 325
    //   319: astore_1
    //   320: aload_2
    //   321: aload_1
    //   322: invokevirtual 185	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   325: aload_2
    //   326: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	327	0	this	1
    //   5	308	1	localTraceSection	io.flutter.util.TraceSection
    //   319	3	1	localThrowable	Throwable
    //   17	272	2	localObject1	Object
    //   307	19	2	localObject2	Object
    //   49	13	3	localExecutorService	java.util.concurrent.ExecutorService
    //   117	184	3	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   53	252	4	localObject3	Object
    //   152	54	5	str	String
    //   157	118	6	localObject4	Object
    //   188	108	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   18	32	117	java/lang/UnsatisfiedLinkError
    //   6	18	307	finally
    //   18	32	307	finally
    //   32	69	307	finally
    //   73	77	307	finally
    //   77	107	307	finally
    //   118	142	307	finally
    //   145	147	307	finally
    //   147	280	307	finally
    //   286	307	307	finally
    //   312	316	319	finally
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.loader.FlutterLoader.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */