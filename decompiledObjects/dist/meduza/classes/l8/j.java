package l8;

import android.util.Log;
import f;
import j8.g;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class j
  implements d
{
  public static final Charset d = Charset.forName("UTF-8");
  public final File a;
  public final int b;
  public i c;
  
  public j(File paramFile)
  {
    a = paramFile;
    b = 65536;
  }
  
  public final void a()
  {
    g.b(c, "There was a problem closing the Crashlytics log file.");
    c = null;
  }
  
  /* Error */
  public final String b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	l8/j:a	Ljava/io/File;
    //   4: invokevirtual 56	java/io/File:exists	()Z
    //   7: istore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: iload_1
    //   11: ifne +6 -> 17
    //   14: goto +16 -> 30
    //   17: aload_0
    //   18: invokevirtual 58	l8/j:d	()V
    //   21: aload_0
    //   22: getfield 40	l8/j:c	Ll8/i;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnonnull +9 -> 36
    //   30: aconst_null
    //   31: astore 4
    //   33: goto +187 -> 220
    //   36: iconst_1
    //   37: newarray <illegal type>
    //   39: astore 4
    //   41: aload 4
    //   43: iconst_0
    //   44: iconst_0
    //   45: iastore
    //   46: aload_3
    //   47: invokevirtual 64	l8/i:b0	()I
    //   50: newarray <illegal type>
    //   52: astore_3
    //   53: aload_0
    //   54: getfield 40	l8/j:c	Ll8/i;
    //   57: astore 5
    //   59: aload 5
    //   61: monitorenter
    //   62: aload 5
    //   64: getfield 67	l8/i:d	Ll8/i$a;
    //   67: getfield 71	l8/i$a:a	I
    //   70: istore 6
    //   72: iconst_0
    //   73: istore 7
    //   75: iload 7
    //   77: aload 5
    //   79: getfield 73	l8/i:c	I
    //   82: if_icmpge +98 -> 180
    //   85: aload 5
    //   87: iload 6
    //   89: invokevirtual 77	l8/i:C	(I)Ll8/i$a;
    //   92: astore 8
    //   94: new 79	l8/i$b
    //   97: astore 9
    //   99: aload 9
    //   101: aload 5
    //   103: aload 8
    //   105: invokespecial 82	l8/i$b:<init>	(Ll8/i;Ll8/i$a;)V
    //   108: aload 8
    //   110: getfield 83	l8/i$a:b	I
    //   113: istore 6
    //   115: aload 9
    //   117: aload_3
    //   118: aload 4
    //   120: iconst_0
    //   121: iaload
    //   122: iload 6
    //   124: invokevirtual 87	l8/i$b:read	([BII)I
    //   127: pop
    //   128: aload 4
    //   130: iconst_0
    //   131: aload 4
    //   133: iconst_0
    //   134: iaload
    //   135: iload 6
    //   137: iadd
    //   138: iastore
    //   139: aload 9
    //   141: invokevirtual 92	java/io/InputStream:close	()V
    //   144: aload 5
    //   146: aload 8
    //   148: getfield 71	l8/i$a:a	I
    //   151: iconst_4
    //   152: iadd
    //   153: aload 8
    //   155: getfield 83	l8/i$a:b	I
    //   158: iadd
    //   159: invokevirtual 96	l8/i:c0	(I)I
    //   162: istore 6
    //   164: iinc 7 1
    //   167: goto -92 -> 75
    //   170: astore 8
    //   172: aload 9
    //   174: invokevirtual 92	java/io/InputStream:close	()V
    //   177: aload 8
    //   179: athrow
    //   180: aload 5
    //   182: monitorexit
    //   183: goto +23 -> 206
    //   186: astore 9
    //   188: aload 5
    //   190: monitorexit
    //   191: aload 9
    //   193: athrow
    //   194: astore 5
    //   196: ldc 98
    //   198: ldc 100
    //   200: aload 5
    //   202: invokestatic 106	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   205: pop
    //   206: new 8	l8/j$a
    //   209: dup
    //   210: aload_3
    //   211: aload 4
    //   213: iconst_0
    //   214: iaload
    //   215: invokespecial 109	l8/j$a:<init>	([BI)V
    //   218: astore 4
    //   220: aload 4
    //   222: ifnonnull +9 -> 231
    //   225: aconst_null
    //   226: astore 4
    //   228: goto +31 -> 259
    //   231: aload 4
    //   233: getfield 110	l8/j$a:b	I
    //   236: istore 7
    //   238: iload 7
    //   240: newarray <illegal type>
    //   242: astore_3
    //   243: aload 4
    //   245: getfield 113	l8/j$a:a	[B
    //   248: iconst_0
    //   249: aload_3
    //   250: iconst_0
    //   251: iload 7
    //   253: invokestatic 119	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   256: aload_3
    //   257: astore 4
    //   259: aload 4
    //   261: ifnull +16 -> 277
    //   264: new 121	java/lang/String
    //   267: dup
    //   268: aload 4
    //   270: getstatic 28	l8/j:d	Ljava/nio/charset/Charset;
    //   273: invokespecial 124	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   276: astore_2
    //   277: aload_2
    //   278: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	this	j
    //   7	4	1	bool	boolean
    //   9	269	2	str	String
    //   25	232	3	localObject1	Object
    //   31	238	4	localObject2	Object
    //   57	132	5	locali	i
    //   194	7	5	localIOException	IOException
    //   70	93	6	i	int
    //   73	179	7	j	int
    //   92	62	8	locala	i.a
    //   170	8	8	localObject3	Object
    //   97	76	9	localb	i.b
    //   186	6	9	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   115	128	170	finally
    //   62	72	186	finally
    //   75	115	186	finally
    //   139	164	186	finally
    //   172	180	186	finally
    //   53	62	194	java/io/IOException
    //   180	183	194	java/io/IOException
    //   188	194	194	java/io/IOException
  }
  
  /* Error */
  public final void c(String arg1, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 58	l8/j:d	()V
    //   4: aload_0
    //   5: getfield 40	l8/j:c	Ll8/i;
    //   8: ifnonnull +6 -> 14
    //   11: goto +202 -> 213
    //   14: aload_1
    //   15: astore 4
    //   17: aload_1
    //   18: ifnonnull +7 -> 25
    //   21: ldc 127
    //   23: astore 4
    //   25: aload_0
    //   26: getfield 38	l8/j:b	I
    //   29: iconst_4
    //   30: idiv
    //   31: istore 5
    //   33: aload 4
    //   35: astore_1
    //   36: aload 4
    //   38: invokevirtual 130	java/lang/String:length	()I
    //   41: iload 5
    //   43: if_icmple +41 -> 84
    //   46: new 132	java/lang/StringBuilder
    //   49: astore_1
    //   50: aload_1
    //   51: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   54: aload_1
    //   55: ldc -121
    //   57: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_1
    //   62: aload 4
    //   64: aload 4
    //   66: invokevirtual 130	java/lang/String:length	()I
    //   69: iload 5
    //   71: isub
    //   72: invokevirtual 143	java/lang/String:substring	(I)Ljava/lang/String;
    //   75: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload_1
    //   80: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: astore_1
    //   84: aload_1
    //   85: ldc -108
    //   87: ldc -106
    //   89: invokevirtual 154	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   92: ldc -100
    //   94: ldc -106
    //   96: invokevirtual 154	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: astore_1
    //   100: getstatic 162	java/util/Locale:US	Ljava/util/Locale;
    //   103: ldc -92
    //   105: iconst_2
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: lload_2
    //   112: invokestatic 170	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   115: aastore
    //   116: dup
    //   117: iconst_1
    //   118: aload_1
    //   119: aastore
    //   120: invokestatic 174	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   123: getstatic 28	l8/j:d	Ljava/nio/charset/Charset;
    //   126: invokevirtual 178	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   129: astore_1
    //   130: aload_0
    //   131: getfield 40	l8/j:c	Ll8/i;
    //   134: aload_1
    //   135: invokevirtual 182	l8/i:f	([B)V
    //   138: aload_0
    //   139: getfield 40	l8/j:c	Ll8/i;
    //   142: astore_1
    //   143: aload_1
    //   144: monitorenter
    //   145: aload_1
    //   146: getfield 73	l8/i:c	I
    //   149: istore 5
    //   151: iload 5
    //   153: ifne +9 -> 162
    //   156: iconst_1
    //   157: istore 5
    //   159: goto +6 -> 165
    //   162: iconst_0
    //   163: istore 5
    //   165: aload_1
    //   166: monitorexit
    //   167: iload 5
    //   169: ifne +44 -> 213
    //   172: aload_0
    //   173: getfield 40	l8/j:c	Ll8/i;
    //   176: invokevirtual 64	l8/i:b0	()I
    //   179: aload_0
    //   180: getfield 38	l8/j:b	I
    //   183: if_icmple +30 -> 213
    //   186: aload_0
    //   187: getfield 40	l8/j:c	Ll8/i;
    //   190: invokevirtual 184	l8/i:I	()V
    //   193: goto -55 -> 138
    //   196: astore 4
    //   198: aload_1
    //   199: monitorexit
    //   200: aload 4
    //   202: athrow
    //   203: astore_1
    //   204: ldc 98
    //   206: ldc -70
    //   208: aload_1
    //   209: invokestatic 106	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   212: pop
    //   213: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	j
    //   0	214	2	paramLong	long
    //   15	50	4	str	String
    //   196	5	4	localObject	Object
    //   31	137	5	i	int
    // Exception table:
    //   from	to	target	type
    //   145	151	196	finally
    //   25	33	203	java/io/IOException
    //   36	84	203	java/io/IOException
    //   84	138	203	java/io/IOException
    //   138	145	203	java/io/IOException
    //   165	167	203	java/io/IOException
    //   172	193	203	java/io/IOException
    //   198	203	203	java/io/IOException
  }
  
  public final void d()
  {
    if (c == null) {
      try
      {
        i locali = new l8/i;
        locali.<init>(a);
        c = locali;
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = f.l("Could not open log file: ");
        localStringBuilder.append(a);
        Log.e("FirebaseCrashlytics", localStringBuilder.toString(), localIOException);
      }
    }
  }
  
  public static final class a
  {
    public final byte[] a;
    public final int b;
    
    public a(byte[] paramArrayOfByte, int paramInt)
    {
      a = paramArrayOfByte;
      b = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     l8.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */