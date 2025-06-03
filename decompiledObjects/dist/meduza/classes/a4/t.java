package a4;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import o7.m0;
import t5.k.a;
import t5.n;
import t5.s.a;
import v3.h;
import v5.e0;
import x6.b;

public final class t
  implements w
{
  public final k.a a;
  public final String b;
  public final boolean c;
  public final HashMap d;
  
  public t(String paramString, boolean paramBoolean, s.a parama)
  {
    boolean bool;
    if ((paramBoolean) && (TextUtils.isEmpty(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    b.q(bool);
    a = parama;
    b = paramString;
    c = paramBoolean;
    d = new HashMap();
  }
  
  /* Error */
  public static byte[] c(k.a parama, String paramString, byte[] paramArrayOfByte, java.util.Map<String, String> paramMap)
  {
    // Byte code:
    //   0: new 50	t5/j0
    //   3: dup
    //   4: aload_0
    //   5: invokeinterface 55 1 0
    //   10: invokespecial 58	t5/j0:<init>	(Lt5/k;)V
    //   13: astore 4
    //   15: invokestatic 64	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   18: pop
    //   19: aload_1
    //   20: invokestatic 70	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   23: astore_0
    //   24: aload_0
    //   25: ifnull +373 -> 398
    //   28: new 72	t5/n
    //   31: dup
    //   32: aload_0
    //   33: lconst_0
    //   34: iconst_2
    //   35: aload_2
    //   36: aload_3
    //   37: lconst_0
    //   38: ldc2_w 73
    //   41: aconst_null
    //   42: iconst_1
    //   43: aconst_null
    //   44: invokespecial 77	t5/n:<init>	(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V
    //   47: astore_2
    //   48: iconst_0
    //   49: istore 5
    //   51: aload_2
    //   52: astore_0
    //   53: new 79	t5/m
    //   56: astore 6
    //   58: aload 6
    //   60: aload 4
    //   62: aload_0
    //   63: invokespecial 82	t5/m:<init>	(Lt5/k;Lt5/n;)V
    //   66: getstatic 87	v5/e0:a	I
    //   69: istore 7
    //   71: sipush 4096
    //   74: newarray <illegal type>
    //   76: astore_1
    //   77: new 89	java/io/ByteArrayOutputStream
    //   80: astore_3
    //   81: aload_3
    //   82: invokespecial 90	java/io/ByteArrayOutputStream:<init>	()V
    //   85: aload 6
    //   87: aload_1
    //   88: invokevirtual 94	t5/m:read	([B)I
    //   91: istore 7
    //   93: iload 7
    //   95: iconst_m1
    //   96: if_icmpeq +23 -> 119
    //   99: aload_3
    //   100: aload_1
    //   101: iconst_0
    //   102: iload 7
    //   104: invokevirtual 98	java/io/ByteArrayOutputStream:write	([BII)V
    //   107: goto -22 -> 85
    //   110: astore_0
    //   111: goto +247 -> 358
    //   114: astore 8
    //   116: goto +15 -> 131
    //   119: aload_3
    //   120: invokevirtual 102	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   123: astore_1
    //   124: aload 6
    //   126: invokestatic 106	v5/e0:g	(Ljava/io/Closeable;)V
    //   129: aload_1
    //   130: areturn
    //   131: aload 8
    //   133: getfield 108	t5/z:d	I
    //   136: istore 7
    //   138: iload 7
    //   140: sipush 307
    //   143: if_icmpeq +11 -> 154
    //   146: iload 7
    //   148: sipush 308
    //   151: if_icmpne +15 -> 166
    //   154: iload 5
    //   156: iconst_5
    //   157: if_icmpge +9 -> 166
    //   160: iconst_1
    //   161: istore 7
    //   163: goto +6 -> 169
    //   166: iconst_0
    //   167: istore 7
    //   169: aconst_null
    //   170: astore_3
    //   171: iload 7
    //   173: ifne +8 -> 181
    //   176: aload_3
    //   177: astore_1
    //   178: goto +62 -> 240
    //   181: aload 8
    //   183: getfield 112	t5/z:e	Ljava/util/Map;
    //   186: astore 9
    //   188: aload_3
    //   189: astore_1
    //   190: aload 9
    //   192: ifnull +48 -> 240
    //   195: aload 9
    //   197: ldc 114
    //   199: invokeinterface 120 2 0
    //   204: checkcast 122	java/util/List
    //   207: astore 9
    //   209: aload_3
    //   210: astore_1
    //   211: aload 9
    //   213: ifnull +27 -> 240
    //   216: aload_3
    //   217: astore_1
    //   218: aload 9
    //   220: invokeinterface 125 1 0
    //   225: ifne +15 -> 240
    //   228: aload 9
    //   230: iconst_0
    //   231: invokeinterface 128 2 0
    //   236: checkcast 130	java/lang/String
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull +114 -> 355
    //   244: iinc 5 1
    //   247: aload_0
    //   248: getfield 133	t5/n:b	J
    //   251: lstore 10
    //   253: aload_0
    //   254: getfield 135	t5/n:c	I
    //   257: istore 7
    //   259: aload_0
    //   260: getfield 138	t5/n:d	[B
    //   263: astore 9
    //   265: aload_0
    //   266: getfield 139	t5/n:e	Ljava/util/Map;
    //   269: astore 8
    //   271: aload_0
    //   272: getfield 142	t5/n:f	J
    //   275: lstore 12
    //   277: aload_0
    //   278: getfield 144	t5/n:g	J
    //   281: lstore 14
    //   283: aload_0
    //   284: getfield 147	t5/n:h	Ljava/lang/String;
    //   287: astore_3
    //   288: aload_0
    //   289: getfield 150	t5/n:i	I
    //   292: istore 16
    //   294: aload_0
    //   295: getfield 154	t5/n:j	Ljava/lang/Object;
    //   298: astore 17
    //   300: aload_1
    //   301: invokestatic 70	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   304: astore_1
    //   305: aload_1
    //   306: ifnull +37 -> 343
    //   309: new 72	t5/n
    //   312: astore_0
    //   313: aload_0
    //   314: aload_1
    //   315: lload 10
    //   317: iload 7
    //   319: aload 9
    //   321: aload 8
    //   323: lload 12
    //   325: lload 14
    //   327: aload_3
    //   328: iload 16
    //   330: aload 17
    //   332: invokespecial 77	t5/n:<init>	(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V
    //   335: aload 6
    //   337: invokestatic 106	v5/e0:g	(Ljava/io/Closeable;)V
    //   340: goto -287 -> 53
    //   343: new 156	java/lang/IllegalStateException
    //   346: astore_0
    //   347: aload_0
    //   348: ldc -98
    //   350: invokespecial 161	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   353: aload_0
    //   354: athrow
    //   355: aload 8
    //   357: athrow
    //   358: aload 6
    //   360: invokestatic 106	v5/e0:g	(Ljava/io/Closeable;)V
    //   363: aload_0
    //   364: athrow
    //   365: astore_0
    //   366: aload 4
    //   368: getfield 164	t5/j0:c	Landroid/net/Uri;
    //   371: astore_1
    //   372: aload_1
    //   373: invokevirtual 168	java/lang/Object:getClass	()Ljava/lang/Class;
    //   376: pop
    //   377: new 170	a4/x
    //   380: dup
    //   381: aload_2
    //   382: aload_1
    //   383: aload 4
    //   385: invokevirtual 172	t5/j0:h	()Ljava/util/Map;
    //   388: aload 4
    //   390: getfield 173	t5/j0:b	J
    //   393: aload_0
    //   394: invokespecial 176	a4/x:<init>	(Lt5/n;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V
    //   397: athrow
    //   398: new 156	java/lang/IllegalStateException
    //   401: dup
    //   402: ldc -98
    //   404: invokespecial 161	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   407: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	408	0	parama	k.a
    //   0	408	1	paramString	String
    //   0	408	2	paramArrayOfByte	byte[]
    //   0	408	3	paramMap	java.util.Map<String, String>
    //   13	376	4	localj0	t5.j0
    //   49	196	5	i	int
    //   56	303	6	localm	t5.m
    //   69	249	7	j	int
    //   114	68	8	localz	t5.z
    //   269	87	8	localMap	java.util.Map
    //   186	134	9	localObject1	Object
    //   251	65	10	l1	long
    //   275	49	12	l2	long
    //   281	45	14	l3	long
    //   292	37	16	k	int
    //   298	33	17	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   66	85	110	finally
    //   85	93	110	finally
    //   99	107	110	finally
    //   119	124	110	finally
    //   131	138	110	finally
    //   181	188	110	finally
    //   195	209	110	finally
    //   218	240	110	finally
    //   247	305	110	finally
    //   309	335	110	finally
    //   343	355	110	finally
    //   355	358	110	finally
    //   66	85	114	t5/z
    //   85	93	114	t5/z
    //   99	107	114	t5/z
    //   119	124	114	t5/z
    //   53	66	365	java/lang/Exception
    //   124	129	365	java/lang/Exception
    //   335	340	365	java/lang/Exception
    //   358	365	365	java/lang/Exception
  }
  
  public final byte[] a(o.d paramd)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b);
    localStringBuilder.append("&signedRequest=");
    localStringBuilder.append(e0.n(a));
    paramd = localStringBuilder.toString();
    return c(a, paramd, null, Collections.emptyMap());
  }
  
  public final byte[] b(UUID arg1, o.a parama)
  {
    String str1 = b;
    String str2;
    if (!c)
    {
      str2 = str1;
      if (!TextUtils.isEmpty(str1)) {}
    }
    else
    {
      str2 = b;
    }
    if (!TextUtils.isEmpty(str2))
    {
      HashMap localHashMap = new HashMap();
      UUID localUUID = h.e;
      if (localUUID.equals(???)) {
        str1 = "text/xml";
      } else if (h.c.equals(???)) {
        str1 = "application/json";
      } else {
        str1 = "application/octet-stream";
      }
      localHashMap.put("Content-Type", str1);
      if (localUUID.equals(???)) {
        localHashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
      }
      synchronized (d)
      {
        localHashMap.putAll(d);
        return c(a, str2, a, localHashMap);
      }
    }
    ??? = Collections.emptyMap();
    parama = Uri.EMPTY;
    if (parama != null) {
      throw new x(new n(parama, 0L, 1, null, ???, 0L, -1L, null, 0, null), Uri.EMPTY, m0.o, 0L, new IllegalStateException("No license URL"));
    }
    throw new IllegalStateException("The uri must be set.");
  }
}

/* Location:
 * Qualified Name:     a4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */