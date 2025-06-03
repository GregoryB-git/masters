package t5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import v5.e0;

public final class h0
  extends f
{
  public final Resources e;
  public final String f;
  public Uri g;
  public AssetFileDescriptor h;
  public FileInputStream i;
  public long j;
  public boolean k;
  
  public h0(Context paramContext)
  {
    super(false);
    e = paramContext.getResources();
    f = paramContext.getPackageName();
  }
  
  public static Uri buildRawResourceUri(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("rawresource:///");
    localStringBuilder.append(paramInt);
    return Uri.parse(localStringBuilder.toString());
  }
  
  /* Error */
  public final long a(n paramn)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 77	t5/n:a	Landroid/net/Uri;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 79	t5/h0:g	Landroid/net/Uri;
    //   10: ldc 81
    //   12: aload_2
    //   13: invokevirtual 84	android/net/Uri:getScheme	()Ljava/lang/String;
    //   16: invokestatic 90	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   19: ifne +194 -> 213
    //   22: ldc 92
    //   24: aload_2
    //   25: invokevirtual 84	android/net/Uri:getScheme	()Ljava/lang/String;
    //   28: invokestatic 90	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   31: ifeq +38 -> 69
    //   34: aload_2
    //   35: invokevirtual 96	android/net/Uri:getPathSegments	()Ljava/util/List;
    //   38: invokeinterface 102 1 0
    //   43: iconst_1
    //   44: if_icmpne +25 -> 69
    //   47: aload_2
    //   48: invokevirtual 105	android/net/Uri:getLastPathSegment	()Ljava/lang/String;
    //   51: astore_3
    //   52: aload_3
    //   53: invokevirtual 111	java/lang/Object:getClass	()Ljava/lang/Class;
    //   56: pop
    //   57: aload_3
    //   58: ldc 113
    //   60: invokevirtual 119	java/lang/String:matches	(Ljava/lang/String;)Z
    //   63: ifeq +6 -> 69
    //   66: goto +147 -> 213
    //   69: ldc 92
    //   71: aload_2
    //   72: invokevirtual 84	android/net/Uri:getScheme	()Ljava/lang/String;
    //   75: invokestatic 90	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   78: ifeq +121 -> 199
    //   81: aload_2
    //   82: invokevirtual 122	android/net/Uri:getPath	()Ljava/lang/String;
    //   85: astore 4
    //   87: aload 4
    //   89: invokevirtual 111	java/lang/Object:getClass	()Ljava/lang/Class;
    //   92: pop
    //   93: aload 4
    //   95: astore_3
    //   96: aload 4
    //   98: ldc 124
    //   100: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   103: ifeq +10 -> 113
    //   106: aload 4
    //   108: iconst_1
    //   109: invokevirtual 131	java/lang/String:substring	(I)Ljava/lang/String;
    //   112: astore_3
    //   113: aload_2
    //   114: invokevirtual 134	android/net/Uri:getHost	()Ljava/lang/String;
    //   117: astore 4
    //   119: new 45	java/lang/StringBuilder
    //   122: dup
    //   123: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   126: astore 5
    //   128: aload 4
    //   130: invokestatic 138	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   133: ifeq +10 -> 143
    //   136: ldc -116
    //   138: astore 4
    //   140: goto +12 -> 152
    //   143: aload 4
    //   145: ldc -114
    //   147: invokestatic 147	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   150: astore 4
    //   152: aload 5
    //   154: aload 4
    //   156: aload_3
    //   157: invokestatic 150	g:f	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   160: astore_3
    //   161: aload_0
    //   162: getfield 34	t5/h0:e	Landroid/content/res/Resources;
    //   165: aload_3
    //   166: ldc -104
    //   168: aload_0
    //   169: getfield 40	t5/h0:f	Ljava/lang/String;
    //   172: invokevirtual 158	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   175: istore 6
    //   177: iload 6
    //   179: ifeq +6 -> 185
    //   182: goto +47 -> 229
    //   185: new 6	t5/h0$a
    //   188: dup
    //   189: sipush 2005
    //   192: ldc -96
    //   194: aconst_null
    //   195: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   198: athrow
    //   199: new 6	t5/h0$a
    //   202: dup
    //   203: sipush 1004
    //   206: ldc -91
    //   208: aconst_null
    //   209: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   212: athrow
    //   213: aload_2
    //   214: invokevirtual 105	android/net/Uri:getLastPathSegment	()Ljava/lang/String;
    //   217: astore_3
    //   218: aload_3
    //   219: invokevirtual 111	java/lang/Object:getClass	()Ljava/lang/Class;
    //   222: pop
    //   223: aload_3
    //   224: invokestatic 171	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   227: istore 6
    //   229: aload_0
    //   230: aload_1
    //   231: invokevirtual 175	t5/f:q	(Lt5/n;)V
    //   234: aload_0
    //   235: getfield 34	t5/h0:e	Landroid/content/res/Resources;
    //   238: iload 6
    //   240: invokevirtual 179	android/content/res/Resources:openRawResourceFd	(I)Landroid/content/res/AssetFileDescriptor;
    //   243: astore_3
    //   244: aload_0
    //   245: aload_3
    //   246: putfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   249: aload_3
    //   250: ifnull +324 -> 574
    //   253: aload_3
    //   254: invokevirtual 187	android/content/res/AssetFileDescriptor:getLength	()J
    //   257: lstore 7
    //   259: new 189	java/io/FileInputStream
    //   262: dup
    //   263: aload_3
    //   264: invokevirtual 193	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   267: invokespecial 196	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   270: astore 4
    //   272: aload_0
    //   273: aload 4
    //   275: putfield 198	t5/h0:i	Ljava/io/FileInputStream;
    //   278: lload 7
    //   280: ldc2_w 199
    //   283: lcmp
    //   284: istore 6
    //   286: iload 6
    //   288: ifeq +31 -> 319
    //   291: aload_1
    //   292: getfield 202	t5/n:f	J
    //   295: lload 7
    //   297: lcmp
    //   298: ifgt +6 -> 304
    //   301: goto +18 -> 319
    //   304: new 6	t5/h0$a
    //   307: astore_1
    //   308: aload_1
    //   309: sipush 2008
    //   312: aconst_null
    //   313: aconst_null
    //   314: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   317: aload_1
    //   318: athrow
    //   319: aload_3
    //   320: invokevirtual 205	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   323: lstore 9
    //   325: aload 4
    //   327: aload_1
    //   328: getfield 202	t5/n:f	J
    //   331: lload 9
    //   333: ladd
    //   334: invokevirtual 209	java/io/FileInputStream:skip	(J)J
    //   337: lload 9
    //   339: lsub
    //   340: lstore 9
    //   342: lload 9
    //   344: aload_1
    //   345: getfield 202	t5/n:f	J
    //   348: lcmp
    //   349: ifne +193 -> 542
    //   352: iload 6
    //   354: ifne +70 -> 424
    //   357: aload 4
    //   359: invokevirtual 213	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   362: astore_3
    //   363: aload_3
    //   364: invokevirtual 217	java/nio/channels/FileChannel:size	()J
    //   367: lconst_0
    //   368: lcmp
    //   369: ifne +13 -> 382
    //   372: aload_0
    //   373: ldc2_w 199
    //   376: putfield 219	t5/h0:j	J
    //   379: goto +65 -> 444
    //   382: aload_3
    //   383: invokevirtual 217	java/nio/channels/FileChannel:size	()J
    //   386: aload_3
    //   387: invokevirtual 222	java/nio/channels/FileChannel:position	()J
    //   390: lsub
    //   391: lstore 7
    //   393: aload_0
    //   394: lload 7
    //   396: putfield 219	t5/h0:j	J
    //   399: lload 7
    //   401: lconst_0
    //   402: lcmp
    //   403: iflt +6 -> 409
    //   406: goto +38 -> 444
    //   409: new 6	t5/h0$a
    //   412: astore_1
    //   413: aload_1
    //   414: sipush 2008
    //   417: aconst_null
    //   418: aconst_null
    //   419: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   422: aload_1
    //   423: athrow
    //   424: lload 7
    //   426: lload 9
    //   428: lsub
    //   429: lstore 7
    //   431: aload_0
    //   432: lload 7
    //   434: putfield 219	t5/h0:j	J
    //   437: lload 7
    //   439: lconst_0
    //   440: lcmp
    //   441: iflt +88 -> 529
    //   444: aload_1
    //   445: getfield 224	t5/n:g	J
    //   448: lstore 7
    //   450: lload 7
    //   452: ldc2_w 199
    //   455: lcmp
    //   456: ifeq +36 -> 492
    //   459: aload_0
    //   460: getfield 219	t5/h0:j	J
    //   463: lstore 9
    //   465: lload 9
    //   467: ldc2_w 199
    //   470: lcmp
    //   471: ifne +6 -> 477
    //   474: goto +12 -> 486
    //   477: lload 9
    //   479: lload 7
    //   481: invokestatic 230	java/lang/Math:min	(JJ)J
    //   484: lstore 7
    //   486: aload_0
    //   487: lload 7
    //   489: putfield 219	t5/h0:j	J
    //   492: aload_0
    //   493: iconst_1
    //   494: putfield 232	t5/h0:k	Z
    //   497: aload_0
    //   498: aload_1
    //   499: invokevirtual 235	t5/f:r	(Lt5/n;)V
    //   502: aload_1
    //   503: getfield 224	t5/n:g	J
    //   506: lstore 7
    //   508: lload 7
    //   510: ldc2_w 199
    //   513: lcmp
    //   514: ifeq +6 -> 520
    //   517: goto +9 -> 526
    //   520: aload_0
    //   521: getfield 219	t5/h0:j	J
    //   524: lstore 7
    //   526: lload 7
    //   528: lreturn
    //   529: new 237	t5/l
    //   532: astore_1
    //   533: aload_1
    //   534: sipush 2008
    //   537: invokespecial 240	t5/l:<init>	(I)V
    //   540: aload_1
    //   541: athrow
    //   542: new 6	t5/h0$a
    //   545: astore_1
    //   546: aload_1
    //   547: sipush 2008
    //   550: aconst_null
    //   551: aconst_null
    //   552: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   555: aload_1
    //   556: athrow
    //   557: astore_1
    //   558: new 6	t5/h0$a
    //   561: dup
    //   562: sipush 2000
    //   565: aconst_null
    //   566: aload_1
    //   567: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   570: athrow
    //   571: astore_1
    //   572: aload_1
    //   573: athrow
    //   574: new 45	java/lang/StringBuilder
    //   577: dup
    //   578: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   581: astore_1
    //   582: aload_1
    //   583: ldc -14
    //   585: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: pop
    //   589: aload_1
    //   590: aload_2
    //   591: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   594: pop
    //   595: new 6	t5/h0$a
    //   598: dup
    //   599: sipush 2000
    //   602: aload_1
    //   603: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   606: aconst_null
    //   607: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   610: athrow
    //   611: astore_1
    //   612: new 6	t5/h0$a
    //   615: dup
    //   616: sipush 2005
    //   619: aconst_null
    //   620: aload_1
    //   621: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   624: athrow
    //   625: astore_1
    //   626: new 6	t5/h0$a
    //   629: dup
    //   630: sipush 1004
    //   633: ldc -9
    //   635: aconst_null
    //   636: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   639: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	640	0	this	h0
    //   0	640	1	paramn	n
    //   4	587	2	localUri	Uri
    //   51	336	3	localObject1	Object
    //   85	273	4	localObject2	Object
    //   126	27	5	localStringBuilder	StringBuilder
    //   175	64	6	m	int
    //   284	69	6	bool	boolean
    //   257	270	7	l1	long
    //   323	155	9	l2	long
    // Exception table:
    //   from	to	target	type
    //   291	301	557	java/io/IOException
    //   304	319	557	java/io/IOException
    //   319	352	557	java/io/IOException
    //   357	379	557	java/io/IOException
    //   382	399	557	java/io/IOException
    //   409	424	557	java/io/IOException
    //   431	437	557	java/io/IOException
    //   529	542	557	java/io/IOException
    //   542	557	557	java/io/IOException
    //   291	301	571	t5/h0$a
    //   304	319	571	t5/h0$a
    //   319	352	571	t5/h0$a
    //   357	379	571	t5/h0$a
    //   382	399	571	t5/h0$a
    //   409	424	571	t5/h0$a
    //   431	437	571	t5/h0$a
    //   529	542	571	t5/h0$a
    //   542	557	571	t5/h0$a
    //   234	244	611	android/content/res/Resources$NotFoundException
    //   213	229	625	java/lang/NumberFormatException
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 79	t5/h0:g	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 198	t5/h0:i	Ljava/io/FileInputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 252	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 198	t5/h0:i	Ljava/io/FileInputStream;
    //   23: aload_0
    //   24: getfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 253	android/content/res/AssetFileDescriptor:close	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   41: aload_0
    //   42: getfield 232	t5/h0:k	Z
    //   45: ifeq +12 -> 57
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 232	t5/h0:k	Z
    //   53: aload_0
    //   54: invokevirtual 256	t5/f:p	()V
    //   57: return
    //   58: astore_2
    //   59: new 6	t5/h0$a
    //   62: astore_1
    //   63: aload_1
    //   64: sipush 2000
    //   67: aconst_null
    //   68: aload_2
    //   69: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   72: aload_1
    //   73: athrow
    //   74: astore_1
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   80: aload_0
    //   81: getfield 232	t5/h0:k	Z
    //   84: ifeq +12 -> 96
    //   87: aload_0
    //   88: iconst_0
    //   89: putfield 232	t5/h0:k	Z
    //   92: aload_0
    //   93: invokevirtual 256	t5/f:p	()V
    //   96: aload_1
    //   97: athrow
    //   98: astore_2
    //   99: new 6	t5/h0$a
    //   102: astore_1
    //   103: aload_1
    //   104: sipush 2000
    //   107: aconst_null
    //   108: aload_2
    //   109: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   112: aload_1
    //   113: athrow
    //   114: astore_2
    //   115: aload_0
    //   116: aconst_null
    //   117: putfield 198	t5/h0:i	Ljava/io/FileInputStream;
    //   120: aload_0
    //   121: getfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   124: astore_1
    //   125: aload_1
    //   126: ifnull +7 -> 133
    //   129: aload_1
    //   130: invokevirtual 253	android/content/res/AssetFileDescriptor:close	()V
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   138: aload_0
    //   139: getfield 232	t5/h0:k	Z
    //   142: ifeq +12 -> 154
    //   145: aload_0
    //   146: iconst_0
    //   147: putfield 232	t5/h0:k	Z
    //   150: aload_0
    //   151: invokevirtual 256	t5/f:p	()V
    //   154: aload_2
    //   155: athrow
    //   156: astore_2
    //   157: new 6	t5/h0$a
    //   160: astore_1
    //   161: aload_1
    //   162: sipush 2000
    //   165: aconst_null
    //   166: aload_2
    //   167: invokespecial 163	t5/h0$a:<init>	(ILjava/lang/String;Ljava/lang/Exception;)V
    //   170: aload_1
    //   171: athrow
    //   172: astore_1
    //   173: aload_0
    //   174: aconst_null
    //   175: putfield 181	t5/h0:h	Landroid/content/res/AssetFileDescriptor;
    //   178: aload_0
    //   179: getfield 232	t5/h0:k	Z
    //   182: ifeq +12 -> 194
    //   185: aload_0
    //   186: iconst_0
    //   187: putfield 232	t5/h0:k	Z
    //   190: aload_0
    //   191: invokevirtual 256	t5/f:p	()V
    //   194: aload_1
    //   195: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	h0
    //   9	64	1	localObject1	Object
    //   74	23	1	localObject2	Object
    //   102	69	1	localObject3	Object
    //   172	23	1	localObject4	Object
    //   58	11	2	localIOException1	IOException
    //   98	11	2	localIOException2	IOException
    //   114	41	2	localObject5	Object
    //   156	11	2	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   23	28	58	java/io/IOException
    //   32	36	58	java/io/IOException
    //   23	28	74	finally
    //   32	36	74	finally
    //   59	74	74	finally
    //   5	10	98	java/io/IOException
    //   14	18	98	java/io/IOException
    //   5	10	114	finally
    //   14	18	114	finally
    //   99	114	114	finally
    //   120	125	156	java/io/IOException
    //   129	133	156	java/io/IOException
    //   120	125	172	finally
    //   129	133	172	finally
    //   157	172	172	finally
  }
  
  public final Uri l()
  {
    return g;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = j;
    if (l1 == 0L) {
      return -1;
    }
    long l2;
    if (l1 != -1L) {
      l2 = paramInt2;
    }
    try
    {
      paramInt2 = (int)Math.min(l1, l2);
      FileInputStream localFileInputStream = i;
      int m = e0.a;
      paramInt1 = localFileInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1)
      {
        if (j == -1L) {
          return -1;
        }
        throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
      }
      l2 = j;
      if (l2 != -1L) {
        j = (l2 - paramInt1);
      }
      o(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new a(2000, null, paramArrayOfByte);
    }
  }
  
  public static final class a
    extends l
  {
    public a(int paramInt, String paramString, Exception paramException)
    {
      super(paramString, paramException);
    }
  }
}

/* Location:
 * Qualified Name:     t5.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */