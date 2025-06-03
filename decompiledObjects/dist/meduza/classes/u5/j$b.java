package u5;

import f;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v5.a;
import v5.a.a;
import v5.e0;

public final class j$b
  implements j.c
{
  public final boolean a = false;
  public final Cipher b = null;
  public final SecretKeySpec c = null;
  public final SecureRandom d = null;
  public final a e;
  public boolean f;
  public o g;
  
  public j$b(File paramFile)
  {
    e = new a(paramFile);
  }
  
  public static int i(i parami, int paramInt)
  {
    int i = a;
    i = b.hashCode() + i * 31;
    if (paramInt < 2)
    {
      long l = f.d(e);
      paramInt = i * 31 + (int)(l ^ l >>> 32);
    }
    else
    {
      paramInt = i * 31 + e.hashCode();
    }
    return paramInt;
  }
  
  public static i j(int paramInt, DataInputStream paramDataInputStream)
  {
    int i = paramDataInputStream.readInt();
    String str = paramDataInputStream.readUTF();
    if (paramInt < 2)
    {
      long l = paramDataInputStream.readLong();
      paramDataInputStream = new l();
      Long localLong = Long.valueOf(l);
      HashMap localHashMap = a;
      localLong.getClass();
      localHashMap.put("exo_len", localLong);
      b.remove("exo_len");
      paramDataInputStream = m.c.a(paramDataInputStream);
    }
    else
    {
      paramDataInputStream = j.a(paramDataInputStream);
    }
    return new i(i, str, paramDataInputStream);
  }
  
  public final void a(HashMap<String, i> paramHashMap)
  {
    try
    {
      Object localObject1 = e.b();
      Object localObject2 = g;
      if (localObject2 == null)
      {
        localObject2 = new u5/o;
        ((o)localObject2).<init>((a.a)localObject1);
        g = ((o)localObject2);
      }
      else
      {
        ((o)localObject2).f((OutputStream)localObject1);
      }
      o localo = g;
      Object localObject3 = new java/io/DataOutputStream;
      ((DataOutputStream)localObject3).<init>(localo);
      localObject1 = localObject3;
      try
      {
        ((DataOutputStream)localObject3).writeInt(2);
        localObject1 = localObject3;
        if (a) {
          i = 1;
        } else {
          i = 0;
        }
        localObject1 = localObject3;
        ((DataOutputStream)localObject3).writeInt(i);
        localObject2 = localObject3;
        localObject1 = localObject3;
        if (a)
        {
          localObject1 = localObject3;
          localObject2 = new byte[16];
          localObject1 = localObject3;
          Object localObject4 = d;
          localObject1 = localObject3;
          i = e0.a;
          localObject1 = localObject3;
          ((SecureRandom)localObject4).nextBytes((byte[])localObject2);
          localObject1 = localObject3;
          ((OutputStream)localObject3).write((byte[])localObject2);
          localObject1 = localObject3;
          localObject4 = new javax/crypto/spec/IvParameterSpec;
          localObject1 = localObject3;
          ((IvParameterSpec)localObject4).<init>((byte[])localObject2);
          localObject1 = localObject3;
          try
          {
            b.init(1, c, (AlgorithmParameterSpec)localObject4);
            localObject1 = localObject3;
            ((DataOutputStream)localObject3).flush();
            localObject1 = localObject3;
            localObject2 = new java/io/DataOutputStream;
            localObject1 = localObject3;
            localObject4 = new javax/crypto/CipherOutputStream;
            localObject1 = localObject3;
            ((CipherOutputStream)localObject4).<init>(localo, b);
            localObject1 = localObject3;
            ((DataOutputStream)localObject2).<init>((OutputStream)localObject4);
          }
          catch (InvalidAlgorithmParameterException paramHashMap) {}catch (InvalidKeyException paramHashMap) {}
          localObject1 = localObject3;
          localObject2 = new java/lang/IllegalStateException;
          localObject1 = localObject3;
          ((IllegalStateException)localObject2).<init>(paramHashMap);
          localObject1 = localObject3;
          throw ((Throwable)localObject2);
        }
        localObject1 = localObject2;
        ((DataOutputStream)localObject2).writeInt(paramHashMap.size());
        localObject1 = localObject2;
        localObject3 = paramHashMap.values().iterator();
        int i = 0;
        for (;;)
        {
          localObject1 = localObject2;
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          localObject1 = localObject2;
          paramHashMap = (i)((Iterator)localObject3).next();
          localObject1 = localObject2;
          ((DataOutputStream)localObject2).writeInt(a);
          localObject1 = localObject2;
          ((DataOutputStream)localObject2).writeUTF(b);
          localObject1 = localObject2;
          j.b(e, (DataOutputStream)localObject2);
          localObject1 = localObject2;
          i += i(paramHashMap, 2);
        }
        localObject1 = localObject2;
        ((DataOutputStream)localObject2).writeInt(i);
        localObject1 = localObject2;
        paramHashMap = e;
        localObject1 = localObject2;
        paramHashMap.getClass();
        localObject1 = localObject2;
        ((OutputStream)localObject2).close();
        localObject1 = localObject2;
        b.delete();
        i = e0.a;
        f = false;
        return;
      }
      finally {}
      e0.g((Closeable)localObject1);
    }
    finally
    {
      localObject1 = null;
    }
    throw paramHashMap;
  }
  
  public final void b(i parami, boolean paramBoolean)
  {
    f = true;
  }
  
  public final boolean c()
  {
    a locala = e;
    boolean bool;
    if ((!a.exists()) && (!b.exists())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void d(HashMap<String, i> paramHashMap)
  {
    if (!f) {
      return;
    }
    a(paramHashMap);
  }
  
  public final void e(long paramLong) {}
  
  public final void f(i parami)
  {
    f = true;
  }
  
  /* Error */
  public final void g(HashMap<String, i> paramHashMap, android.util.SparseArray<String> paramSparseArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 234	u5/j$b:f	Z
    //   4: istore_3
    //   5: iconst_1
    //   6: istore 4
    //   8: iload_3
    //   9: iconst_1
    //   10: ixor
    //   11: invokestatic 258	x6/b:H	(Z)V
    //   14: aload_0
    //   15: getfield 40	u5/j$b:e	Lv5/a;
    //   18: astore 5
    //   20: aload 5
    //   22: getfield 242	v5/a:a	Ljava/io/File;
    //   25: invokevirtual 245	java/io/File:exists	()Z
    //   28: ifne +23 -> 51
    //   31: aload 5
    //   33: getfield 227	v5/a:b	Ljava/io/File;
    //   36: invokevirtual 245	java/io/File:exists	()Z
    //   39: ifeq +6 -> 45
    //   42: goto +9 -> 51
    //   45: iconst_0
    //   46: istore 6
    //   48: goto +6 -> 54
    //   51: iconst_1
    //   52: istore 6
    //   54: iload 6
    //   56: ifne +10 -> 66
    //   59: iload 4
    //   61: istore 6
    //   63: goto +621 -> 684
    //   66: aconst_null
    //   67: astore 7
    //   69: aconst_null
    //   70: astore 5
    //   72: new 260	java/io/BufferedInputStream
    //   75: astore 8
    //   77: aload 8
    //   79: aload_0
    //   80: getfield 40	u5/j$b:e	Lv5/a;
    //   83: invokevirtual 263	v5/a:a	()Ljava/io/FileInputStream;
    //   86: invokespecial 266	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   89: new 71	java/io/DataInputStream
    //   92: astore 9
    //   94: aload 9
    //   96: aload 8
    //   98: invokespecial 267	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   101: aload 9
    //   103: astore 7
    //   105: aload 9
    //   107: astore 10
    //   109: aload 9
    //   111: invokevirtual 74	java/io/DataInputStream:readInt	()I
    //   114: istore 11
    //   116: aload 9
    //   118: astore 7
    //   120: iload 11
    //   122: iflt +511 -> 633
    //   125: iload 11
    //   127: iconst_2
    //   128: if_icmple +10 -> 138
    //   131: aload 9
    //   133: astore 7
    //   135: goto +498 -> 633
    //   138: aload 9
    //   140: astore 7
    //   142: aload 9
    //   144: astore 10
    //   146: aload 9
    //   148: invokevirtual 74	java/io/DataInputStream:readInt	()I
    //   151: iconst_1
    //   152: iand
    //   153: ifeq +250 -> 403
    //   156: aload 9
    //   158: astore 7
    //   160: aload 9
    //   162: astore 10
    //   164: aload_0
    //   165: getfield 30	u5/j$b:b	Ljavax/crypto/Cipher;
    //   168: ifnonnull +10 -> 178
    //   171: aload 9
    //   173: astore 7
    //   175: goto +458 -> 633
    //   178: aload 9
    //   180: astore 7
    //   182: aload 9
    //   184: astore 10
    //   186: bipush 16
    //   188: newarray <illegal type>
    //   190: astore 12
    //   192: aload 9
    //   194: astore 7
    //   196: aload 9
    //   198: astore 10
    //   200: aload 9
    //   202: aload 12
    //   204: invokevirtual 270	java/io/DataInputStream:readFully	([B)V
    //   207: aload 9
    //   209: astore 7
    //   211: aload 9
    //   213: astore 10
    //   215: new 168	javax/crypto/spec/IvParameterSpec
    //   218: astore 5
    //   220: aload 9
    //   222: astore 7
    //   224: aload 9
    //   226: astore 10
    //   228: aload 5
    //   230: aload 12
    //   232: invokespecial 170	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   235: aload 9
    //   237: astore 7
    //   239: aload 9
    //   241: astore 10
    //   243: aload_0
    //   244: getfield 30	u5/j$b:b	Ljavax/crypto/Cipher;
    //   247: astore 13
    //   249: aload 9
    //   251: astore 7
    //   253: aload 9
    //   255: astore 10
    //   257: aload_0
    //   258: getfield 32	u5/j$b:c	Ljavax/crypto/spec/SecretKeySpec;
    //   261: astore 12
    //   263: aload 9
    //   265: astore 7
    //   267: aload 9
    //   269: astore 10
    //   271: getstatic 155	v5/e0:a	I
    //   274: istore 6
    //   276: aload 9
    //   278: astore 7
    //   280: aload 9
    //   282: astore 10
    //   284: aload 13
    //   286: iconst_2
    //   287: aload 12
    //   289: aload 5
    //   291: invokevirtual 176	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   294: aload 9
    //   296: astore 7
    //   298: aload 9
    //   300: astore 10
    //   302: new 71	java/io/DataInputStream
    //   305: astore 5
    //   307: aload 9
    //   309: astore 7
    //   311: aload 9
    //   313: astore 10
    //   315: new 272	javax/crypto/CipherInputStream
    //   318: astore 12
    //   320: aload 9
    //   322: astore 7
    //   324: aload 9
    //   326: astore 10
    //   328: aload 12
    //   330: aload 8
    //   332: aload_0
    //   333: getfield 30	u5/j$b:b	Ljavax/crypto/Cipher;
    //   336: invokespecial 275	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   339: aload 9
    //   341: astore 7
    //   343: aload 9
    //   345: astore 10
    //   347: aload 5
    //   349: aload 12
    //   351: invokespecial 267	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   354: goto +85 -> 439
    //   357: astore 5
    //   359: goto +5 -> 364
    //   362: astore 5
    //   364: aload 9
    //   366: astore 7
    //   368: aload 9
    //   370: astore 10
    //   372: new 186	java/lang/IllegalStateException
    //   375: astore 8
    //   377: aload 9
    //   379: astore 7
    //   381: aload 9
    //   383: astore 10
    //   385: aload 8
    //   387: aload 5
    //   389: invokespecial 189	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   392: aload 9
    //   394: astore 7
    //   396: aload 9
    //   398: astore 10
    //   400: aload 8
    //   402: athrow
    //   403: aload 9
    //   405: astore 5
    //   407: aload 9
    //   409: astore 7
    //   411: aload 9
    //   413: astore 10
    //   415: aload_0
    //   416: getfield 28	u5/j$b:a	Z
    //   419: ifeq +20 -> 439
    //   422: aload 9
    //   424: astore 7
    //   426: aload 9
    //   428: astore 10
    //   430: aload_0
    //   431: iconst_1
    //   432: putfield 234	u5/j$b:f	Z
    //   435: aload 9
    //   437: astore 5
    //   439: aload 5
    //   441: astore 7
    //   443: aload 5
    //   445: astore 10
    //   447: aload 5
    //   449: invokevirtual 74	java/io/DataInputStream:readInt	()I
    //   452: istore 14
    //   454: iconst_0
    //   455: istore 15
    //   457: iload 15
    //   459: istore 6
    //   461: iload 15
    //   463: iload 14
    //   465: if_icmpge +88 -> 553
    //   468: aload 5
    //   470: astore 7
    //   472: aload 5
    //   474: astore 10
    //   476: iload 11
    //   478: aload 5
    //   480: invokestatic 277	u5/j$b:j	(ILjava/io/DataInputStream;)Lu5/i;
    //   483: astore 9
    //   485: aload 5
    //   487: astore 7
    //   489: aload 5
    //   491: astore 10
    //   493: aload_1
    //   494: aload 9
    //   496: getfield 51	u5/i:b	Ljava/lang/String;
    //   499: aload 9
    //   501: invokevirtual 106	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   504: pop
    //   505: aload 5
    //   507: astore 7
    //   509: aload 5
    //   511: astore 10
    //   513: aload_2
    //   514: aload 9
    //   516: getfield 48	u5/i:a	I
    //   519: aload 9
    //   521: getfield 51	u5/i:b	Ljava/lang/String;
    //   524: invokevirtual 282	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   527: aload 5
    //   529: astore 7
    //   531: aload 5
    //   533: astore 10
    //   535: iload 6
    //   537: aload 9
    //   539: iload 11
    //   541: invokestatic 221	u5/j$b:i	(Lu5/i;I)I
    //   544: iadd
    //   545: istore 6
    //   547: iinc 15 1
    //   550: goto -89 -> 461
    //   553: aload 5
    //   555: astore 7
    //   557: aload 5
    //   559: astore 10
    //   561: aload 5
    //   563: invokevirtual 74	java/io/DataInputStream:readInt	()I
    //   566: istore 11
    //   568: aload 5
    //   570: astore 7
    //   572: aload 5
    //   574: astore 10
    //   576: aload 5
    //   578: invokevirtual 287	java/io/InputStream:read	()I
    //   581: istore 15
    //   583: iload 15
    //   585: iconst_m1
    //   586: if_icmpne +9 -> 595
    //   589: iconst_1
    //   590: istore 15
    //   592: goto +6 -> 598
    //   595: iconst_0
    //   596: istore 15
    //   598: aload 5
    //   600: astore 7
    //   602: iload 11
    //   604: iload 6
    //   606: if_icmpne +27 -> 633
    //   609: iload 15
    //   611: ifne +10 -> 621
    //   614: aload 5
    //   616: astore 7
    //   618: goto +15 -> 633
    //   621: aload 5
    //   623: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
    //   626: iload 4
    //   628: istore 6
    //   630: goto +54 -> 684
    //   633: aload 7
    //   635: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
    //   638: goto +43 -> 681
    //   641: astore_1
    //   642: aload 7
    //   644: astore_2
    //   645: goto +16 -> 661
    //   648: astore 5
    //   650: aload 10
    //   652: astore 5
    //   654: goto +17 -> 671
    //   657: astore_1
    //   658: aload 5
    //   660: astore_2
    //   661: aload_2
    //   662: ifnull +7 -> 669
    //   665: aload_2
    //   666: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
    //   669: aload_1
    //   670: athrow
    //   671: aload 5
    //   673: ifnull +8 -> 681
    //   676: aload 5
    //   678: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
    //   681: iconst_0
    //   682: istore 6
    //   684: iload 6
    //   686: ifne +32 -> 718
    //   689: aload_1
    //   690: invokevirtual 290	java/util/HashMap:clear	()V
    //   693: aload_2
    //   694: invokevirtual 291	android/util/SparseArray:clear	()V
    //   697: aload_0
    //   698: getfield 40	u5/j$b:e	Lv5/a;
    //   701: astore_1
    //   702: aload_1
    //   703: getfield 242	v5/a:a	Ljava/io/File;
    //   706: invokevirtual 232	java/io/File:delete	()Z
    //   709: pop
    //   710: aload_1
    //   711: getfield 227	v5/a:b	Ljava/io/File;
    //   714: invokevirtual 232	java/io/File:delete	()Z
    //   717: pop
    //   718: return
    //   719: astore 5
    //   721: aload 7
    //   723: astore 5
    //   725: goto -54 -> 671
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	728	0	this	b
    //   0	728	1	paramHashMap	HashMap<String, i>
    //   0	728	2	paramSparseArray	android.util.SparseArray<String>
    //   4	7	3	bool	boolean
    //   6	621	4	i	int
    //   18	330	5	localObject1	Object
    //   357	1	5	localInvalidAlgorithmParameterException	InvalidAlgorithmParameterException
    //   362	26	5	localInvalidKeyException	InvalidKeyException
    //   405	217	5	localObject2	Object
    //   648	1	5	localIOException1	java.io.IOException
    //   652	25	5	localObject3	Object
    //   719	1	5	localIOException2	java.io.IOException
    //   723	1	5	localObject4	Object
    //   46	639	6	j	int
    //   67	655	7	localObject5	Object
    //   75	326	8	localObject6	Object
    //   92	446	9	localObject7	Object
    //   107	544	10	localObject8	Object
    //   114	493	11	k	int
    //   190	160	12	localObject9	Object
    //   247	38	13	localCipher	Cipher
    //   452	14	14	m	int
    //   455	155	15	n	int
    // Exception table:
    //   from	to	target	type
    //   243	249	357	java/security/InvalidAlgorithmParameterException
    //   257	263	357	java/security/InvalidAlgorithmParameterException
    //   271	276	357	java/security/InvalidAlgorithmParameterException
    //   284	294	357	java/security/InvalidAlgorithmParameterException
    //   243	249	362	java/security/InvalidKeyException
    //   257	263	362	java/security/InvalidKeyException
    //   271	276	362	java/security/InvalidKeyException
    //   284	294	362	java/security/InvalidKeyException
    //   109	116	641	finally
    //   146	156	641	finally
    //   164	171	641	finally
    //   186	192	641	finally
    //   200	207	641	finally
    //   215	220	641	finally
    //   228	235	641	finally
    //   243	249	641	finally
    //   257	263	641	finally
    //   271	276	641	finally
    //   284	294	641	finally
    //   302	307	641	finally
    //   315	320	641	finally
    //   328	339	641	finally
    //   347	354	641	finally
    //   372	377	641	finally
    //   385	392	641	finally
    //   400	403	641	finally
    //   415	422	641	finally
    //   430	435	641	finally
    //   447	454	641	finally
    //   476	485	641	finally
    //   493	505	641	finally
    //   513	527	641	finally
    //   535	547	641	finally
    //   561	568	641	finally
    //   576	583	641	finally
    //   109	116	648	java/io/IOException
    //   146	156	648	java/io/IOException
    //   164	171	648	java/io/IOException
    //   186	192	648	java/io/IOException
    //   200	207	648	java/io/IOException
    //   215	220	648	java/io/IOException
    //   228	235	648	java/io/IOException
    //   243	249	648	java/io/IOException
    //   257	263	648	java/io/IOException
    //   271	276	648	java/io/IOException
    //   284	294	648	java/io/IOException
    //   302	307	648	java/io/IOException
    //   315	320	648	java/io/IOException
    //   328	339	648	java/io/IOException
    //   347	354	648	java/io/IOException
    //   372	377	648	java/io/IOException
    //   385	392	648	java/io/IOException
    //   400	403	648	java/io/IOException
    //   415	422	648	java/io/IOException
    //   430	435	648	java/io/IOException
    //   447	454	648	java/io/IOException
    //   476	485	648	java/io/IOException
    //   493	505	648	java/io/IOException
    //   513	527	648	java/io/IOException
    //   535	547	648	java/io/IOException
    //   561	568	648	java/io/IOException
    //   576	583	648	java/io/IOException
    //   72	101	657	finally
    //   72	101	719	java/io/IOException
  }
  
  public final void h()
  {
    a locala = e;
    a.delete();
    b.delete();
  }
}

/* Location:
 * Qualified Name:     u5.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */