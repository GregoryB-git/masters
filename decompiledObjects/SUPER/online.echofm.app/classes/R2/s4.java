package R2;

import A2.n;
import java.net.URL;
import java.util.Map;

public final class s4
  implements Runnable
{
  public final URL o;
  public final byte[] p;
  public final p4 q;
  public final String r;
  public final Map s;
  
  public s4(q4 paramq4, String paramString, URL paramURL, byte[] paramArrayOfByte, Map paramMap, p4 paramp4)
  {
    n.e(paramString);
    n.i(paramURL);
    n.i(paramp4);
    o = paramURL;
    p = null;
    q = paramp4;
    r = paramString;
    s = null;
  }
  
  public final void b(int paramInt, Exception paramException, byte[] paramArrayOfByte, Map paramMap)
  {
    t.e().D(new r4(this, paramInt, paramException, paramArrayOfByte, paramMap));
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 22	R2/s4:t	LR2/q4;
    //   4: invokevirtual 76	R2/m3:l	()V
    //   7: iconst_0
    //   8: istore_1
    //   9: iconst_0
    //   10: istore_2
    //   11: iconst_0
    //   12: istore_3
    //   13: iconst_0
    //   14: istore 4
    //   16: aload_0
    //   17: getfield 37	R2/s4:o	Ljava/net/URL;
    //   20: astore 5
    //   22: invokestatic 81	com/google/android/gms/internal/measurement/h0:a	()Lcom/google/android/gms/internal/measurement/h0;
    //   25: aload 5
    //   27: ldc 83
    //   29: invokevirtual 86	com/google/android/gms/internal/measurement/h0:b	(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;
    //   32: astore 5
    //   34: aload 5
    //   36: instanceof 88
    //   39: ifeq +184 -> 223
    //   42: aload 5
    //   44: checkcast 88	java/net/HttpURLConnection
    //   47: astore 5
    //   49: aload 5
    //   51: iconst_0
    //   52: invokevirtual 94	java/net/URLConnection:setDefaultUseCaches	(Z)V
    //   55: aload 5
    //   57: ldc 95
    //   59: invokevirtual 99	java/net/URLConnection:setConnectTimeout	(I)V
    //   62: aload 5
    //   64: ldc 100
    //   66: invokevirtual 103	java/net/URLConnection:setReadTimeout	(I)V
    //   69: aload 5
    //   71: iconst_0
    //   72: invokevirtual 106	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   75: aload 5
    //   77: iconst_1
    //   78: invokevirtual 109	java/net/URLConnection:setDoInput	(Z)V
    //   81: aload 5
    //   83: invokevirtual 113	java/net/HttpURLConnection:getResponseCode	()I
    //   86: istore_2
    //   87: iload_2
    //   88: istore 4
    //   90: iload_2
    //   91: istore_1
    //   92: aload 5
    //   94: invokevirtual 117	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
    //   97: astore 6
    //   99: aload_0
    //   100: getfield 22	R2/s4:t	LR2/q4;
    //   103: aload 5
    //   105: invokestatic 123	R2/q4:u	(LR2/q4;Ljava/net/HttpURLConnection;)[B
    //   108: astore 7
    //   110: aload 5
    //   112: invokevirtual 126	java/net/HttpURLConnection:disconnect	()V
    //   115: aload_0
    //   116: iload_2
    //   117: aconst_null
    //   118: aload 7
    //   120: aload 6
    //   122: invokevirtual 128	R2/s4:b	(ILjava/lang/Exception;[BLjava/util/Map;)V
    //   125: return
    //   126: astore 8
    //   128: aload 5
    //   130: astore 7
    //   132: aload 6
    //   134: astore 5
    //   136: aload 8
    //   138: astore 6
    //   140: goto +98 -> 238
    //   143: astore 8
    //   145: aload 5
    //   147: astore 7
    //   149: aload 6
    //   151: astore 5
    //   153: aload 8
    //   155: astore 6
    //   157: goto +103 -> 260
    //   160: astore 6
    //   162: aconst_null
    //   163: astore 8
    //   165: iload 4
    //   167: istore_2
    //   168: aload 5
    //   170: astore 7
    //   172: aload 8
    //   174: astore 5
    //   176: goto +62 -> 238
    //   179: astore 6
    //   181: aconst_null
    //   182: astore 8
    //   184: iload_1
    //   185: istore_2
    //   186: aload 5
    //   188: astore 7
    //   190: aload 8
    //   192: astore 5
    //   194: goto +66 -> 260
    //   197: astore 6
    //   199: aconst_null
    //   200: astore 7
    //   202: aload 7
    //   204: astore 5
    //   206: goto +32 -> 238
    //   209: astore 6
    //   211: aconst_null
    //   212: astore 7
    //   214: aload 7
    //   216: astore 5
    //   218: iload_3
    //   219: istore_2
    //   220: goto +40 -> 260
    //   223: new 73	java/io/IOException
    //   226: astore 5
    //   228: aload 5
    //   230: ldc -126
    //   232: invokespecial 133	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   235: aload 5
    //   237: athrow
    //   238: aload 7
    //   240: ifnull +8 -> 248
    //   243: aload 7
    //   245: invokevirtual 126	java/net/HttpURLConnection:disconnect	()V
    //   248: aload_0
    //   249: iload_2
    //   250: aconst_null
    //   251: aconst_null
    //   252: aload 5
    //   254: invokevirtual 128	R2/s4:b	(ILjava/lang/Exception;[BLjava/util/Map;)V
    //   257: aload 6
    //   259: athrow
    //   260: aload 7
    //   262: ifnull +8 -> 270
    //   265: aload 7
    //   267: invokevirtual 126	java/net/HttpURLConnection:disconnect	()V
    //   270: aload_0
    //   271: iload_2
    //   272: aload 6
    //   274: aconst_null
    //   275: aload 5
    //   277: invokevirtual 128	R2/s4:b	(ILjava/lang/Exception;[BLjava/util/Map;)V
    //   280: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	281	0	this	s4
    //   8	177	1	i	int
    //   10	262	2	j	int
    //   12	207	3	k	int
    //   14	152	4	m	int
    //   20	256	5	localObject1	Object
    //   97	59	6	localObject2	Object
    //   160	1	6	localObject3	Object
    //   179	1	6	localIOException1	java.io.IOException
    //   197	1	6	localObject4	Object
    //   209	64	6	localIOException2	java.io.IOException
    //   108	158	7	localObject5	Object
    //   126	11	8	localObject6	Object
    //   143	11	8	localIOException3	java.io.IOException
    //   163	28	8	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   99	110	126	finally
    //   99	110	143	java/io/IOException
    //   81	87	160	finally
    //   92	99	160	finally
    //   81	87	179	java/io/IOException
    //   92	99	179	java/io/IOException
    //   16	81	197	finally
    //   223	238	197	finally
    //   16	81	209	java/io/IOException
    //   223	238	209	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     R2.s4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */