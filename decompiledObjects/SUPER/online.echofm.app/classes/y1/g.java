package y1;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

public final class g
{
  public static final g a = new g();
  public static final String b = g.class.getName();
  
  /* Error */
  public static final G a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 38	G1/g:b	()V
    //   6: invokestatic 44	x1/B:l	()Landroid/content/Context;
    //   9: astore_0
    //   10: aconst_null
    //   11: astore_1
    //   12: aload_0
    //   13: ldc 46
    //   15: invokevirtual 52	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   18: astore_2
    //   19: aload_2
    //   20: ldc 54
    //   22: invokestatic 60	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   25: new 6	y1/g$a
    //   28: astore_3
    //   29: new 62	java/io/BufferedInputStream
    //   32: astore 4
    //   34: aload 4
    //   36: aload_2
    //   37: invokespecial 65	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: aload_3
    //   41: aload 4
    //   43: invokespecial 66	y1/g$a:<init>	(Ljava/io/InputStream;)V
    //   46: aload_3
    //   47: astore 4
    //   49: aload_3
    //   50: invokevirtual 72	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   53: astore_2
    //   54: aload_2
    //   55: ifnull +56 -> 111
    //   58: aload_3
    //   59: astore 4
    //   61: aload_2
    //   62: checkcast 74	y1/G
    //   65: astore_2
    //   66: aload_3
    //   67: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   70: aload_0
    //   71: ldc 46
    //   73: invokevirtual 84	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   76: invokevirtual 90	java/io/File:delete	()Z
    //   79: pop
    //   80: goto +18 -> 98
    //   83: astore_3
    //   84: goto +202 -> 286
    //   87: astore_3
    //   88: getstatic 27	y1/g:b	Ljava/lang/String;
    //   91: ldc 92
    //   93: aload_3
    //   94: invokestatic 98	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   97: pop
    //   98: aload_2
    //   99: astore_3
    //   100: goto +164 -> 264
    //   103: astore_3
    //   104: goto +99 -> 203
    //   107: astore_2
    //   108: goto +43 -> 151
    //   111: aload_3
    //   112: astore 4
    //   114: new 100	java/lang/NullPointerException
    //   117: astore_2
    //   118: aload_3
    //   119: astore 4
    //   121: aload_2
    //   122: ldc 102
    //   124: invokespecial 105	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   127: aload_3
    //   128: astore 4
    //   130: aload_2
    //   131: athrow
    //   132: astore_3
    //   133: aconst_null
    //   134: astore 4
    //   136: goto +67 -> 203
    //   139: astore_2
    //   140: aconst_null
    //   141: astore_3
    //   142: goto +9 -> 151
    //   145: astore_3
    //   146: aconst_null
    //   147: astore_3
    //   148: goto +88 -> 236
    //   151: aload_3
    //   152: astore 4
    //   154: getstatic 27	y1/g:b	Ljava/lang/String;
    //   157: ldc 107
    //   159: aload_2
    //   160: invokestatic 98	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   163: pop
    //   164: aload_3
    //   165: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   168: aload_0
    //   169: ldc 46
    //   171: invokevirtual 84	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   174: invokevirtual 90	java/io/File:delete	()Z
    //   177: pop
    //   178: aload_1
    //   179: astore_3
    //   180: goto +84 -> 264
    //   183: astore_3
    //   184: getstatic 27	y1/g:b	Ljava/lang/String;
    //   187: astore 4
    //   189: aload 4
    //   191: ldc 92
    //   193: aload_3
    //   194: invokestatic 98	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   197: pop
    //   198: aload_1
    //   199: astore_3
    //   200: goto +64 -> 264
    //   203: aload 4
    //   205: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   208: aload_0
    //   209: ldc 46
    //   211: invokevirtual 84	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   214: invokevirtual 90	java/io/File:delete	()Z
    //   217: pop
    //   218: goto +16 -> 234
    //   221: astore 4
    //   223: getstatic 27	y1/g:b	Ljava/lang/String;
    //   226: ldc 92
    //   228: aload 4
    //   230: invokestatic 98	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   233: pop
    //   234: aload_3
    //   235: athrow
    //   236: aload_3
    //   237: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   240: aload_0
    //   241: ldc 46
    //   243: invokevirtual 84	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   246: invokevirtual 90	java/io/File:delete	()Z
    //   249: pop
    //   250: aload_1
    //   251: astore_3
    //   252: goto +12 -> 264
    //   255: astore_3
    //   256: getstatic 27	y1/g:b	Ljava/lang/String;
    //   259: astore 4
    //   261: goto -72 -> 189
    //   264: aload_3
    //   265: astore 4
    //   267: aload_3
    //   268: ifnonnull +12 -> 280
    //   271: new 74	y1/G
    //   274: dup
    //   275: invokespecial 108	y1/G:<init>	()V
    //   278: astore 4
    //   280: ldc 2
    //   282: monitorexit
    //   283: aload 4
    //   285: areturn
    //   286: ldc 2
    //   288: monitorexit
    //   289: aload_3
    //   290: athrow
    //   291: astore 4
    //   293: goto -57 -> 236
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	232	0	localContext	android.content.Context
    //   11	240	1	localObject1	Object
    //   18	81	2	localObject2	Object
    //   107	1	2	localException1	Exception
    //   117	14	2	localNullPointerException	NullPointerException
    //   139	21	2	localException2	Exception
    //   28	39	3	locala	a
    //   83	1	3	localObject3	Object
    //   87	7	3	localException3	Exception
    //   99	1	3	localObject4	Object
    //   103	25	3	localObject5	Object
    //   132	1	3	localObject6	Object
    //   141	1	3	localObject7	Object
    //   145	1	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   147	33	3	localObject8	Object
    //   183	11	3	localException4	Exception
    //   199	53	3	localObject9	Object
    //   255	35	3	localException5	Exception
    //   32	172	4	localObject10	Object
    //   221	8	4	localException6	Exception
    //   259	25	4	localObject11	Object
    //   291	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   3	10	83	finally
    //   66	70	83	finally
    //   70	80	83	finally
    //   88	98	83	finally
    //   164	168	83	finally
    //   168	178	83	finally
    //   184	189	83	finally
    //   189	198	83	finally
    //   203	208	83	finally
    //   208	218	83	finally
    //   223	234	83	finally
    //   234	236	83	finally
    //   236	240	83	finally
    //   240	250	83	finally
    //   256	261	83	finally
    //   271	280	83	finally
    //   70	80	87	java/lang/Exception
    //   49	54	103	finally
    //   61	66	103	finally
    //   114	118	103	finally
    //   121	127	103	finally
    //   130	132	103	finally
    //   154	164	103	finally
    //   49	54	107	java/lang/Exception
    //   61	66	107	java/lang/Exception
    //   114	118	107	java/lang/Exception
    //   121	127	107	java/lang/Exception
    //   130	132	107	java/lang/Exception
    //   12	46	132	finally
    //   12	46	139	java/lang/Exception
    //   12	46	145	java/io/FileNotFoundException
    //   168	178	183	java/lang/Exception
    //   208	218	221	java/lang/Exception
    //   240	250	255	java/lang/Exception
    //   49	54	291	java/io/FileNotFoundException
    //   61	66	291	java/io/FileNotFoundException
    //   114	118	291	java/io/FileNotFoundException
    //   121	127	291	java/io/FileNotFoundException
    //   130	132	291	java/io/FileNotFoundException
  }
  
  /* Error */
  public static final void b(G paramG)
  {
    // Byte code:
    //   0: invokestatic 44	x1/B:l	()Landroid/content/Context;
    //   3: astore_1
    //   4: aconst_null
    //   5: astore_2
    //   6: new 111	java/io/ObjectOutputStream
    //   9: astore_3
    //   10: new 113	java/io/BufferedOutputStream
    //   13: astore 4
    //   15: aload 4
    //   17: aload_1
    //   18: ldc 46
    //   20: iconst_0
    //   21: invokevirtual 117	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   24: invokespecial 120	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   27: aload_3
    //   28: aload 4
    //   30: invokespecial 121	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   33: aload_3
    //   34: aload_0
    //   35: invokevirtual 125	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   38: aload_3
    //   39: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   42: goto +47 -> 89
    //   45: astore 4
    //   47: aload_3
    //   48: astore_0
    //   49: goto +7 -> 56
    //   52: astore 4
    //   54: aload_2
    //   55: astore_0
    //   56: getstatic 27	y1/g:b	Ljava/lang/String;
    //   59: ldc 127
    //   61: aload 4
    //   63: invokestatic 98	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   66: pop
    //   67: aload_1
    //   68: ldc 46
    //   70: invokevirtual 84	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   73: invokevirtual 90	java/io/File:delete	()Z
    //   76: pop
    //   77: goto +8 -> 85
    //   80: astore 4
    //   82: goto +8 -> 90
    //   85: aload_0
    //   86: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   89: return
    //   90: aload_0
    //   91: invokestatic 80	O1/P:j	(Ljava/io/Closeable;)V
    //   94: aload 4
    //   96: athrow
    //   97: astore 4
    //   99: goto -14 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	paramG	G
    //   3	65	1	localContext	android.content.Context
    //   5	50	2	localObject1	Object
    //   9	39	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   13	16	4	localBufferedOutputStream	java.io.BufferedOutputStream
    //   45	1	4	localObject2	Object
    //   52	10	4	localThrowable	Throwable
    //   80	15	4	localObject3	Object
    //   97	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   33	38	45	finally
    //   6	33	52	finally
    //   56	67	80	finally
    //   67	77	80	finally
    //   67	77	97	java/lang/Exception
  }
  
  public static final class a
    extends ObjectInputStream
  {
    public static final a o = new a(null);
    
    public a(InputStream paramInputStream)
    {
      super();
    }
    
    public ObjectStreamClass readClassDescriptor()
    {
      ObjectStreamClass localObjectStreamClass = super.readClassDescriptor();
      if (Intrinsics.a(localObjectStreamClass.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {}
      for (Object localObject = a.b.class;; localObject = e.b.class)
      {
        localObject = ObjectStreamClass.lookup((Class)localObject);
        break;
        localObject = localObjectStreamClass;
        if (!Intrinsics.a(localObjectStreamClass.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
          break;
        }
      }
      Intrinsics.checkNotNullExpressionValue(localObject, "resultClassDescriptor");
      return (ObjectStreamClass)localObject;
    }
    
    public static final class a {}
  }
}

/* Location:
 * Qualified Name:     y1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */