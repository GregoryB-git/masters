package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class r
{
  /* Error */
  public static void a(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 19
    //   3: invokevirtual 25	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   6: ifeq +11 -> 17
    //   9: aload_0
    //   10: ldc 27
    //   12: invokevirtual 33	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   15: pop
    //   16: return
    //   17: aload_0
    //   18: ldc 27
    //   20: iconst_0
    //   21: invokevirtual 37	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   24: astore_0
    //   25: invokestatic 43	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   28: astore_2
    //   29: aload_2
    //   30: aload_0
    //   31: aconst_null
    //   32: invokeinterface 49 3 0
    //   37: aload_2
    //   38: ldc 51
    //   40: getstatic 57	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   43: invokeinterface 61 3 0
    //   48: aload_2
    //   49: aconst_null
    //   50: ldc 63
    //   52: invokeinterface 67 3 0
    //   57: pop
    //   58: aload_2
    //   59: aconst_null
    //   60: ldc 69
    //   62: aload_1
    //   63: invokeinterface 73 4 0
    //   68: pop
    //   69: aload_2
    //   70: aconst_null
    //   71: ldc 63
    //   73: invokeinterface 76 3 0
    //   78: pop
    //   79: aload_2
    //   80: invokeinterface 80 1 0
    //   85: new 82	java/lang/StringBuilder
    //   88: astore_2
    //   89: aload_2
    //   90: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   93: aload_2
    //   94: ldc 87
    //   96: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_2
    //   101: aload_1
    //   102: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_2
    //   107: ldc 93
    //   109: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: ldc 95
    //   115: aload_2
    //   116: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: invokestatic 105	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: aload_0
    //   124: ifnull +54 -> 178
    //   127: aload_0
    //   128: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   131: goto +47 -> 178
    //   134: astore_1
    //   135: goto +44 -> 179
    //   138: astore_2
    //   139: new 82	java/lang/StringBuilder
    //   142: astore_3
    //   143: aload_3
    //   144: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   147: aload_3
    //   148: ldc 112
    //   150: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_3
    //   155: aload_1
    //   156: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: ldc 95
    //   162: aload_3
    //   163: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: aload_2
    //   167: invokestatic 116	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: aload_0
    //   172: ifnull +6 -> 178
    //   175: goto -48 -> 127
    //   178: return
    //   179: aload_0
    //   180: ifnull +7 -> 187
    //   183: aload_0
    //   184: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   187: aload_1
    //   188: athrow
    //   189: astore_0
    //   190: ldc 95
    //   192: ldc 118
    //   194: iconst_1
    //   195: anewarray 4	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: ldc 27
    //   202: aastore
    //   203: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   206: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   209: pop
    //   210: return
    //   211: astore_0
    //   212: goto -34 -> 178
    //   215: astore_0
    //   216: goto -29 -> 187
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramContext	android.content.Context
    //   0	219	1	paramString	String
    //   28	88	2	localObject	Object
    //   138	29	2	localException	Exception
    //   142	21	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   29	123	134	finally
    //   139	171	134	finally
    //   29	123	138	java/lang/Exception
    //   17	25	189	java/io/FileNotFoundException
    //   127	131	211	java/io/IOException
    //   183	187	215	java/io/IOException
  }
  
  /* Error */
  public static String b(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 19
    //   2: astore_1
    //   3: aload_0
    //   4: ldc 27
    //   6: invokevirtual 132	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   9: astore_2
    //   10: invokestatic 136	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   13: astore_3
    //   14: aload_3
    //   15: aload_2
    //   16: ldc 51
    //   18: invokeinterface 142 3 0
    //   23: aload_3
    //   24: invokeinterface 146 1 0
    //   29: istore 4
    //   31: aload_3
    //   32: invokeinterface 149 1 0
    //   37: istore 5
    //   39: aload_1
    //   40: astore 6
    //   42: iload 5
    //   44: iconst_1
    //   45: if_icmpeq +63 -> 108
    //   48: iload 5
    //   50: iconst_3
    //   51: if_icmpne +17 -> 68
    //   54: aload_1
    //   55: astore 6
    //   57: aload_3
    //   58: invokeinterface 146 1 0
    //   63: iload 4
    //   65: if_icmple +43 -> 108
    //   68: iload 5
    //   70: iconst_3
    //   71: if_icmpeq -40 -> 31
    //   74: iload 5
    //   76: iconst_4
    //   77: if_icmpne +6 -> 83
    //   80: goto -49 -> 31
    //   83: aload_3
    //   84: invokeinterface 152 1 0
    //   89: ldc 63
    //   91: invokevirtual 25	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   94: ifeq -63 -> 31
    //   97: aload_3
    //   98: aconst_null
    //   99: ldc 69
    //   101: invokeinterface 156 3 0
    //   106: astore 6
    //   108: aload 6
    //   110: astore_3
    //   111: aload_2
    //   112: ifnull +39 -> 151
    //   115: aload_2
    //   116: invokevirtual 159	java/io/FileInputStream:close	()V
    //   119: aload 6
    //   121: astore_3
    //   122: goto +29 -> 151
    //   125: astore_0
    //   126: goto +75 -> 201
    //   129: astore 6
    //   131: ldc 95
    //   133: ldc -95
    //   135: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   138: pop
    //   139: aload_1
    //   140: astore_3
    //   141: aload_2
    //   142: ifnull +9 -> 151
    //   145: aload_1
    //   146: astore 6
    //   148: goto -33 -> 115
    //   151: aload_3
    //   152: invokevirtual 165	java/lang/String:isEmpty	()Z
    //   155: ifne +37 -> 192
    //   158: new 82	java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   165: astore_0
    //   166: aload_0
    //   167: ldc -89
    //   169: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload_0
    //   174: aload_3
    //   175: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: ldc 95
    //   181: aload_0
    //   182: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: invokestatic 105	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   188: pop
    //   189: goto +10 -> 199
    //   192: aload_0
    //   193: ldc 27
    //   195: invokevirtual 33	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   198: pop
    //   199: aload_3
    //   200: areturn
    //   201: aload_2
    //   202: ifnull +7 -> 209
    //   205: aload_2
    //   206: invokevirtual 159	java/io/FileInputStream:close	()V
    //   209: aload_0
    //   210: athrow
    //   211: astore_0
    //   212: ldc 95
    //   214: ldc -87
    //   216: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   219: pop
    //   220: ldc 19
    //   222: areturn
    //   223: astore_1
    //   224: aload 6
    //   226: astore_3
    //   227: goto -76 -> 151
    //   230: astore 6
    //   232: goto -23 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	paramContext	android.content.Context
    //   2	144	1	str1	String
    //   223	1	1	localIOException1	java.io.IOException
    //   9	197	2	localFileInputStream	java.io.FileInputStream
    //   13	214	3	localObject	Object
    //   29	37	4	i	int
    //   37	41	5	j	int
    //   40	80	6	str2	String
    //   129	1	6	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   146	79	6	str3	String
    //   230	1	6	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   10	31	125	finally
    //   31	39	125	finally
    //   57	68	125	finally
    //   83	108	125	finally
    //   131	139	125	finally
    //   10	31	129	org/xmlpull/v1/XmlPullParserException
    //   10	31	129	java/io/IOException
    //   31	39	129	org/xmlpull/v1/XmlPullParserException
    //   31	39	129	java/io/IOException
    //   57	68	129	org/xmlpull/v1/XmlPullParserException
    //   57	68	129	java/io/IOException
    //   83	108	129	org/xmlpull/v1/XmlPullParserException
    //   83	108	129	java/io/IOException
    //   3	10	211	java/io/FileNotFoundException
    //   115	119	223	java/io/IOException
    //   205	209	230	java/io/IOException
  }
  
  public static final class a
    implements Executor
  {
    public final Object a = new Object();
    public final ArrayDeque b = new ArrayDeque();
    public final Executor c;
    public Runnable d;
    
    public a(r.b paramb)
    {
      c = paramb;
    }
    
    public final void a()
    {
      synchronized (a)
      {
        Runnable localRunnable = (Runnable)b.poll();
        d = localRunnable;
        if (localRunnable != null) {
          c.execute(localRunnable);
        }
        return;
      }
    }
    
    public final void execute(Runnable paramRunnable)
    {
      synchronized (a)
      {
        ArrayDeque localArrayDeque = b;
        q localq = new g/q;
        localq.<init>(0, this, paramRunnable);
        localArrayDeque.add(localq);
        if (d == null) {
          a();
        }
        return;
      }
    }
  }
  
  public static final class b
    implements Executor
  {
    public final void execute(Runnable paramRunnable)
    {
      new Thread(paramRunnable).start();
    }
  }
}

/* Location:
 * Qualified Name:     g.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */