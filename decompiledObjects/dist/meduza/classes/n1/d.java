package n1;

import f;
import g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class d
{
  public static final byte[] a = { 112, 114, 111, 0 };
  public static final byte[] b = { 112, 114, 109, 0 };
  
  public static byte[] a(b[] paramArrayOfb, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfb.length;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = m;
    while (m < i)
    {
      localObject = paramArrayOfb[m];
      int i1 = b(paramArrayOfByte, a, b).getBytes(StandardCharsets.UTF_8).length;
      int i2 = e;
      int i3 = f;
      n += (g * 2 + 8 - 1 & 0xFFFFFFF8) / 8 + (i2 * 2 + (i1 + 16) + i3);
      m++;
    }
    Object localObject = new ByteArrayOutputStream(n);
    b localb;
    if (Arrays.equals(paramArrayOfByte, e.c))
    {
      j = paramArrayOfb.length;
      for (m = k; m < j; m++)
      {
        localb = paramArrayOfb[m];
        l((ByteArrayOutputStream)localObject, localb, b(paramArrayOfByte, a, b));
        n((ByteArrayOutputStream)localObject, localb);
        k((ByteArrayOutputStream)localObject, localb);
        m((ByteArrayOutputStream)localObject, localb);
      }
    }
    k = paramArrayOfb.length;
    for (m = 0; m < k; m++)
    {
      localb = paramArrayOfb[m];
      l((ByteArrayOutputStream)localObject, localb, b(paramArrayOfByte, a, b));
    }
    k = paramArrayOfb.length;
    for (m = j; m < k; m++)
    {
      paramArrayOfByte = paramArrayOfb[m];
      n((ByteArrayOutputStream)localObject, paramArrayOfByte);
      k((ByteArrayOutputStream)localObject, paramArrayOfByte);
      m((ByteArrayOutputStream)localObject, paramArrayOfByte);
    }
    if (((ByteArrayOutputStream)localObject).size() == n) {
      return ((ByteArrayOutputStream)localObject).toByteArray();
    }
    paramArrayOfb = f.l("The bytes saved do not match expectation. actual=");
    paramArrayOfb.append(((ByteArrayOutputStream)localObject).size());
    paramArrayOfb.append(" expected=");
    paramArrayOfb.append(n);
    throw new IllegalStateException(paramArrayOfb.toString());
  }
  
  public static String b(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    byte[] arrayOfByte = e.e;
    boolean bool = Arrays.equals(paramArrayOfByte, arrayOfByte);
    String str = "!";
    Object localObject;
    if ((bool) || (Arrays.equals(paramArrayOfByte, e.d))) {
      localObject = ":";
    } else {
      localObject = "!";
    }
    if (paramString1.length() <= 0)
    {
      if ("!".equals(localObject))
      {
        paramArrayOfByte = paramString2.replace(":", "!");
      }
      else
      {
        paramArrayOfByte = paramString2;
        if (":".equals(localObject)) {
          paramArrayOfByte = paramString2.replace("!", ":");
        }
      }
      return paramArrayOfByte;
    }
    if (paramString2.equals("classes.dex")) {
      return paramString1;
    }
    if ((!paramString2.contains("!")) && (!paramString2.contains(":")))
    {
      if (paramString2.endsWith(".apk")) {
        return paramString2;
      }
      localObject = f.l(paramString1);
      if (!Arrays.equals(paramArrayOfByte, arrayOfByte))
      {
        paramString1 = str;
        if (!Arrays.equals(paramArrayOfByte, e.d)) {}
      }
      else
      {
        paramString1 = ":";
      }
      return g.f((StringBuilder)localObject, paramString1, paramString2);
    }
    if ("!".equals(localObject))
    {
      paramArrayOfByte = paramString2.replace(":", "!");
    }
    else
    {
      paramArrayOfByte = paramString2;
      if (":".equals(localObject)) {
        paramArrayOfByte = paramString2.replace("!", ":");
      }
    }
    return paramArrayOfByte;
  }
  
  public static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 == 4) {
          return paramInt2 + paramInt3;
        }
        throw new IllegalStateException(f.h("Unexpected flag: ", paramInt1));
      }
      return paramInt2;
    }
    throw new IllegalStateException("HOT methods are not stored in the bitmap");
  }
  
  public static int[] d(ByteArrayInputStream paramByteArrayInputStream, int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      j += x6.b.m0(paramByteArrayInputStream);
      arrayOfInt[i] = j;
      i++;
    }
    return arrayOfInt;
  }
  
  /* Error */
  public static b[] e(java.io.FileInputStream paramFileInputStream, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, b[] paramArrayOfb)
  {
    // Byte code:
    //   0: getstatic 170	n1/e:f	[B
    //   3: astore 4
    //   5: aload_1
    //   6: aload 4
    //   8: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   11: ifeq +127 -> 138
    //   14: getstatic 171	n1/e:a	[B
    //   17: aload_2
    //   18: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   21: ifne +107 -> 128
    //   24: aload_1
    //   25: aload 4
    //   27: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   30: ifeq +88 -> 118
    //   33: aload_0
    //   34: iconst_1
    //   35: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   38: l2i
    //   39: istore 5
    //   41: aload_0
    //   42: iconst_4
    //   43: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   46: lstore 6
    //   48: aload_0
    //   49: aload_0
    //   50: iconst_4
    //   51: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   54: l2i
    //   55: lload 6
    //   57: l2i
    //   58: invokestatic 179	x6/b:k0	(Ljava/io/FileInputStream;II)[B
    //   61: astore_1
    //   62: aload_0
    //   63: invokevirtual 184	java/io/InputStream:read	()I
    //   66: ifgt +42 -> 108
    //   69: new 186	java/io/ByteArrayInputStream
    //   72: dup
    //   73: aload_1
    //   74: invokespecial 189	java/io/ByteArrayInputStream:<init>	([B)V
    //   77: astore_0
    //   78: aload_0
    //   79: iload 5
    //   81: aload_3
    //   82: invokestatic 192	n1/d:f	(Ljava/io/ByteArrayInputStream;I[Ln1/b;)[Ln1/b;
    //   85: astore_1
    //   86: aload_0
    //   87: invokevirtual 195	java/io/InputStream:close	()V
    //   90: aload_1
    //   91: areturn
    //   92: astore_1
    //   93: aload_0
    //   94: invokevirtual 195	java/io/InputStream:close	()V
    //   97: goto +9 -> 106
    //   100: astore_0
    //   101: aload_1
    //   102: aload_0
    //   103: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   106: aload_1
    //   107: athrow
    //   108: new 109	java/lang/IllegalStateException
    //   111: dup
    //   112: ldc -53
    //   114: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   117: athrow
    //   118: new 109	java/lang/IllegalStateException
    //   121: dup
    //   122: ldc -51
    //   124: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   127: athrow
    //   128: new 109	java/lang/IllegalStateException
    //   131: dup
    //   132: ldc -49
    //   134: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   137: athrow
    //   138: aload_1
    //   139: getstatic 209	n1/e:g	[B
    //   142: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   145: ifeq +87 -> 232
    //   148: aload_0
    //   149: invokestatic 167	x6/b:m0	(Ljava/io/InputStream;)I
    //   152: istore 5
    //   154: aload_0
    //   155: iconst_4
    //   156: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   159: lstore 6
    //   161: aload_0
    //   162: aload_0
    //   163: iconst_4
    //   164: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   167: l2i
    //   168: lload 6
    //   170: l2i
    //   171: invokestatic 179	x6/b:k0	(Ljava/io/FileInputStream;II)[B
    //   174: astore_1
    //   175: aload_0
    //   176: invokevirtual 184	java/io/InputStream:read	()I
    //   179: ifgt +43 -> 222
    //   182: new 186	java/io/ByteArrayInputStream
    //   185: dup
    //   186: aload_1
    //   187: invokespecial 189	java/io/ByteArrayInputStream:<init>	([B)V
    //   190: astore_0
    //   191: aload_0
    //   192: aload_2
    //   193: iload 5
    //   195: aload_3
    //   196: invokestatic 212	n1/d:g	(Ljava/io/ByteArrayInputStream;[BI[Ln1/b;)[Ln1/b;
    //   199: astore_1
    //   200: aload_0
    //   201: invokevirtual 195	java/io/InputStream:close	()V
    //   204: aload_1
    //   205: areturn
    //   206: astore_1
    //   207: aload_0
    //   208: invokevirtual 195	java/io/InputStream:close	()V
    //   211: goto +9 -> 220
    //   214: astore_0
    //   215: aload_1
    //   216: aload_0
    //   217: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   220: aload_1
    //   221: athrow
    //   222: new 109	java/lang/IllegalStateException
    //   225: dup
    //   226: ldc -53
    //   228: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   231: athrow
    //   232: new 109	java/lang/IllegalStateException
    //   235: dup
    //   236: ldc -51
    //   238: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   241: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	paramFileInputStream	java.io.FileInputStream
    //   0	242	1	paramArrayOfByte1	byte[]
    //   0	242	2	paramArrayOfByte2	byte[]
    //   0	242	3	paramArrayOfb	b[]
    //   3	23	4	arrayOfByte	byte[]
    //   39	155	5	i	int
    //   46	123	6	l	long
    // Exception table:
    //   from	to	target	type
    //   78	86	92	finally
    //   93	97	100	finally
    //   191	200	206	finally
    //   207	211	214	finally
  }
  
  public static b[] f(ByteArrayInputStream paramByteArrayInputStream, int paramInt, b[] paramArrayOfb)
  {
    int i = paramByteArrayInputStream.available();
    int j = 0;
    if (i == 0) {
      return new b[0];
    }
    if (paramInt == paramArrayOfb.length)
    {
      String[] arrayOfString = new String[paramInt];
      int[] arrayOfInt = new int[paramInt];
      int k;
      for (i = 0;; i++)
      {
        k = j;
        if (i >= paramInt) {
          break;
        }
        k = x6.b.m0(paramByteArrayInputStream);
        arrayOfInt[i] = x6.b.m0(paramByteArrayInputStream);
        arrayOfString[i] = new String(x6.b.j0(paramByteArrayInputStream, k), StandardCharsets.UTF_8);
      }
      while (k < paramInt)
      {
        b localb = paramArrayOfb[k];
        if (b.equals(arrayOfString[k]))
        {
          i = arrayOfInt[k];
          e = i;
          h = d(paramByteArrayInputStream, i);
          k++;
        }
        else
        {
          throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
        }
      }
      return paramArrayOfb;
    }
    throw new IllegalStateException("Mismatched number of dex files found in metadata");
  }
  
  public static b[] g(ByteArrayInputStream paramByteArrayInputStream, byte[] paramArrayOfByte, int paramInt, b[] paramArrayOfb)
  {
    if (paramByteArrayInputStream.available() == 0) {
      return new b[0];
    }
    if (paramInt == paramArrayOfb.length)
    {
      int i = 0;
      while (i < paramInt)
      {
        x6.b.m0(paramByteArrayInputStream);
        String str = new String(x6.b.j0(paramByteArrayInputStream, x6.b.m0(paramByteArrayInputStream)), StandardCharsets.UTF_8);
        long l = x6.b.l0(paramByteArrayInputStream, 4);
        int j = x6.b.m0(paramByteArrayInputStream);
        int k = paramArrayOfb.length;
        Object localObject1 = null;
        Object localObject2;
        Object localObject3;
        if (k <= 0)
        {
          localObject2 = localObject1;
        }
        else
        {
          int m = str.indexOf("!");
          k = m;
          if (m < 0) {
            k = str.indexOf(":");
          }
          if (k > 0) {
            localObject3 = str.substring(k + 1);
          } else {
            localObject3 = str;
          }
          for (k = 0;; k++)
          {
            localObject2 = localObject1;
            if (k >= paramArrayOfb.length) {
              break;
            }
            if (b.equals(localObject3))
            {
              localObject2 = paramArrayOfb[k];
              break;
            }
          }
        }
        if (localObject2 != null)
        {
          d = l;
          localObject3 = d(paramByteArrayInputStream, j);
          if (Arrays.equals(paramArrayOfByte, e.e))
          {
            e = j;
            h = ((int[])localObject3);
          }
          i++;
        }
        else
        {
          throw new IllegalStateException(g.d("Missing profile key: ", str));
        }
      }
      return paramArrayOfb;
    }
    throw new IllegalStateException("Mismatched number of dex files found in metadata");
  }
  
  /* Error */
  public static b[] h(java.io.FileInputStream paramFileInputStream, byte[] paramArrayOfByte, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: getstatic 249	n1/e:b	[B
    //   4: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   7: ifeq +86 -> 93
    //   10: aload_0
    //   11: iconst_1
    //   12: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   15: l2i
    //   16: istore_3
    //   17: aload_0
    //   18: iconst_4
    //   19: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   22: lstore 4
    //   24: aload_0
    //   25: aload_0
    //   26: iconst_4
    //   27: invokestatic 175	x6/b:l0	(Ljava/io/InputStream;I)J
    //   30: l2i
    //   31: lload 4
    //   33: l2i
    //   34: invokestatic 179	x6/b:k0	(Ljava/io/FileInputStream;II)[B
    //   37: astore_1
    //   38: aload_0
    //   39: invokevirtual 184	java/io/InputStream:read	()I
    //   42: ifgt +41 -> 83
    //   45: new 186	java/io/ByteArrayInputStream
    //   48: dup
    //   49: aload_1
    //   50: invokespecial 189	java/io/ByteArrayInputStream:<init>	([B)V
    //   53: astore_0
    //   54: aload_0
    //   55: aload_2
    //   56: iload_3
    //   57: invokestatic 253	n1/d:i	(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Ln1/b;
    //   60: astore_1
    //   61: aload_0
    //   62: invokevirtual 195	java/io/InputStream:close	()V
    //   65: aload_1
    //   66: areturn
    //   67: astore_1
    //   68: aload_0
    //   69: invokevirtual 195	java/io/InputStream:close	()V
    //   72: goto +9 -> 81
    //   75: astore_0
    //   76: aload_1
    //   77: aload_0
    //   78: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   81: aload_1
    //   82: athrow
    //   83: new 109	java/lang/IllegalStateException
    //   86: dup
    //   87: ldc -53
    //   89: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   92: athrow
    //   93: new 109	java/lang/IllegalStateException
    //   96: dup
    //   97: ldc -1
    //   99: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	paramFileInputStream	java.io.FileInputStream
    //   0	103	1	paramArrayOfByte	byte[]
    //   0	103	2	paramString	String
    //   16	41	3	i	int
    //   22	10	4	l	long
    // Exception table:
    //   from	to	target	type
    //   54	61	67	finally
    //   68	72	75	finally
  }
  
  public static b[] i(ByteArrayInputStream paramByteArrayInputStream, String paramString, int paramInt)
  {
    if (paramByteArrayInputStream.available() == 0) {
      return new b[0];
    }
    b[] arrayOfb = new b[paramInt];
    int j;
    for (int i = 0; i < paramInt; i++)
    {
      j = x6.b.m0(paramByteArrayInputStream);
      k = x6.b.m0(paramByteArrayInputStream);
      long l1 = x6.b.l0(paramByteArrayInputStream, 4);
      long l2 = x6.b.l0(paramByteArrayInputStream, 4);
      long l3 = x6.b.l0(paramByteArrayInputStream, 4);
      arrayOfb[i] = new b(paramString, new String(x6.b.j0(paramByteArrayInputStream, j), StandardCharsets.UTF_8), l2, k, (int)l1, (int)l3, new int[k], new TreeMap());
    }
    int k = 0;
    while (k < paramInt)
    {
      b localb = arrayOfb[k];
      int m = paramByteArrayInputStream.available() - f;
      j = 0;
      int n;
      int i1;
      if (paramByteArrayInputStream.available() > m)
      {
        n = j + x6.b.m0(paramByteArrayInputStream);
        i.put(Integer.valueOf(n), Integer.valueOf(1));
        for (i = x6.b.m0(paramByteArrayInputStream);; i--)
        {
          j = n;
          if (i <= 0) {
            break;
          }
          x6.b.m0(paramByteArrayInputStream);
          i1 = (int)x6.b.l0(paramByteArrayInputStream, 1);
          if (i1 != 6)
          {
            j = i1;
            if (i1 != 7) {
              while (j > 0)
              {
                x6.b.l0(paramByteArrayInputStream, 1);
                for (i1 = (int)x6.b.l0(paramByteArrayInputStream, 1); i1 > 0; i1--) {
                  x6.b.m0(paramByteArrayInputStream);
                }
                j--;
              }
            }
          }
        }
      }
      if (paramByteArrayInputStream.available() == m)
      {
        h = d(paramByteArrayInputStream, e);
        BitSet localBitSet = BitSet.valueOf(x6.b.j0(paramByteArrayInputStream, (g * 2 + 8 - 1 & 0xFFFFFFF8) / 8));
        for (j = 0;; j++)
        {
          n = g;
          if (j >= n) {
            break;
          }
          if (localBitSet.get(c(2, j, n))) {
            i = 2;
          } else {
            i = 0;
          }
          i1 = i;
          if (localBitSet.get(c(4, j, n))) {
            i1 = i | 0x4;
          }
          if (i1 != 0)
          {
            Integer localInteger = (Integer)i.get(Integer.valueOf(j));
            paramString = localInteger;
            if (localInteger == null) {
              paramString = Integer.valueOf(0);
            }
            i.put(Integer.valueOf(j), Integer.valueOf(paramString.intValue() | i1));
          }
        }
        k++;
      }
      else
      {
        throw new IllegalStateException("Read too much data during profile line parse");
      }
    }
    return arrayOfb;
  }
  
  /* Error */
  public static boolean j(ByteArrayOutputStream paramByteArrayOutputStream, byte[] paramArrayOfByte, b[] paramArrayOfb)
  {
    // Byte code:
    //   0: aload_1
    //   1: getstatic 171	n1/e:a	[B
    //   4: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   7: ifeq +1027 -> 1034
    //   10: new 298	java/util/ArrayList
    //   13: dup
    //   14: iconst_3
    //   15: invokespecial 299	java/util/ArrayList:<init>	(I)V
    //   18: astore_3
    //   19: new 298	java/util/ArrayList
    //   22: dup
    //   23: iconst_3
    //   24: invokespecial 299	java/util/ArrayList:<init>	(I)V
    //   27: astore_1
    //   28: new 54	java/io/ByteArrayOutputStream
    //   31: dup
    //   32: invokespecial 300	java/io/ByteArrayOutputStream:<init>	()V
    //   35: astore 4
    //   37: aload 4
    //   39: aload_2
    //   40: arraylength
    //   41: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   44: iconst_0
    //   45: istore 5
    //   47: iconst_2
    //   48: istore 6
    //   50: iload 5
    //   52: aload_2
    //   53: arraylength
    //   54: if_icmpge +123 -> 177
    //   57: aload_2
    //   58: iload 5
    //   60: aaload
    //   61: astore 7
    //   63: aload 4
    //   65: aload 7
    //   67: getfield 306	n1/b:c	J
    //   70: iconst_4
    //   71: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   74: aload 4
    //   76: aload 7
    //   78: getfield 242	n1/b:d	J
    //   81: iconst_4
    //   82: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   85: aload 4
    //   87: aload 7
    //   89: getfield 52	n1/b:g	I
    //   92: i2l
    //   93: iconst_4
    //   94: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   97: aload 7
    //   99: getfield 25	n1/b:a	Ljava/lang/String;
    //   102: astore 8
    //   104: aload 7
    //   106: getfield 27	n1/b:b	Ljava/lang/String;
    //   109: astore 7
    //   111: getstatic 171	n1/e:a	[B
    //   114: aload 8
    //   116: aload 7
    //   118: invokestatic 30	n1/d:b	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 8
    //   123: aload 8
    //   125: getstatic 36	java/nio/charset/StandardCharsets:UTF_8	Ljava/nio/charset/Charset;
    //   128: invokevirtual 42	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   131: arraylength
    //   132: istore 9
    //   134: aload 4
    //   136: iload 9
    //   138: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   141: iload 6
    //   143: iconst_4
    //   144: iadd
    //   145: iconst_4
    //   146: iadd
    //   147: iconst_4
    //   148: iadd
    //   149: iconst_2
    //   150: iadd
    //   151: iload 9
    //   153: iconst_1
    //   154: imul
    //   155: iadd
    //   156: istore 6
    //   158: aload 4
    //   160: aload 8
    //   162: getstatic 36	java/nio/charset/StandardCharsets:UTF_8	Ljava/nio/charset/Charset;
    //   165: invokevirtual 42	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   168: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   171: iinc 5 1
    //   174: goto -124 -> 50
    //   177: aload 4
    //   179: invokevirtual 91	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   182: astore 8
    //   184: aload 8
    //   186: arraylength
    //   187: istore 5
    //   189: iload 6
    //   191: iload 5
    //   193: if_icmpne +769 -> 962
    //   196: new 317	n1/f
    //   199: dup
    //   200: iconst_1
    //   201: aload 8
    //   203: iconst_0
    //   204: invokespecial 320	n1/f:<init>	(I[BZ)V
    //   207: astore 8
    //   209: aload 4
    //   211: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   214: aload_3
    //   215: aload 8
    //   217: invokevirtual 324	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   220: pop
    //   221: new 54	java/io/ByteArrayOutputStream
    //   224: dup
    //   225: invokespecial 300	java/io/ByteArrayOutputStream:<init>	()V
    //   228: astore 4
    //   230: iconst_0
    //   231: istore 6
    //   233: iload 6
    //   235: istore 5
    //   237: iload 6
    //   239: aload_2
    //   240: arraylength
    //   241: if_icmpge +55 -> 296
    //   244: aload_2
    //   245: iload 6
    //   247: aaload
    //   248: astore 8
    //   250: aload 4
    //   252: iload 6
    //   254: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   257: aload 4
    //   259: aload 8
    //   261: getfield 46	n1/b:e	I
    //   264: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   267: iload 5
    //   269: iconst_2
    //   270: iadd
    //   271: iconst_2
    //   272: iadd
    //   273: aload 8
    //   275: getfield 46	n1/b:e	I
    //   278: iconst_2
    //   279: imul
    //   280: iadd
    //   281: istore 5
    //   283: aload 4
    //   285: aload 8
    //   287: invokestatic 80	n1/d:k	(Ljava/io/ByteArrayOutputStream;Ln1/b;)V
    //   290: iinc 6 1
    //   293: goto -56 -> 237
    //   296: aload 4
    //   298: invokevirtual 91	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   301: astore 8
    //   303: iload 5
    //   305: aload 8
    //   307: arraylength
    //   308: if_icmpne +582 -> 890
    //   311: new 317	n1/f
    //   314: dup
    //   315: iconst_3
    //   316: aload 8
    //   318: iconst_1
    //   319: invokespecial 320	n1/f:<init>	(I[BZ)V
    //   322: astore 8
    //   324: aload 4
    //   326: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   329: aload_3
    //   330: aload 8
    //   332: invokevirtual 324	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   335: pop
    //   336: new 54	java/io/ByteArrayOutputStream
    //   339: dup
    //   340: invokespecial 300	java/io/ByteArrayOutputStream:<init>	()V
    //   343: astore 4
    //   345: iconst_0
    //   346: istore 5
    //   348: iload 5
    //   350: istore 6
    //   352: iload 5
    //   354: aload_2
    //   355: arraylength
    //   356: if_icmpge +223 -> 579
    //   359: aload_2
    //   360: iload 5
    //   362: aaload
    //   363: astore 7
    //   365: aload 7
    //   367: getfield 265	n1/b:i	Ljava/util/TreeMap;
    //   370: invokevirtual 328	java/util/TreeMap:entrySet	()Ljava/util/Set;
    //   373: invokeinterface 334 1 0
    //   378: astore 8
    //   380: iconst_0
    //   381: istore 9
    //   383: aload 8
    //   385: invokeinterface 340 1 0
    //   390: ifeq +32 -> 422
    //   393: iload 9
    //   395: aload 8
    //   397: invokeinterface 344 1 0
    //   402: checkcast 346	java/util/Map$Entry
    //   405: invokeinterface 349 1 0
    //   410: checkcast 267	java/lang/Integer
    //   413: invokevirtual 292	java/lang/Integer:intValue	()I
    //   416: ior
    //   417: istore 9
    //   419: goto -36 -> 383
    //   422: new 54	java/io/ByteArrayOutputStream
    //   425: astore 10
    //   427: aload 10
    //   429: invokespecial 300	java/io/ByteArrayOutputStream:<init>	()V
    //   432: aload 10
    //   434: aload 7
    //   436: invokestatic 83	n1/d:m	(Ljava/io/ByteArrayOutputStream;Ln1/b;)V
    //   439: aload 10
    //   441: invokevirtual 91	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   444: astore 8
    //   446: aload 10
    //   448: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   451: new 54	java/io/ByteArrayOutputStream
    //   454: astore 10
    //   456: aload 10
    //   458: invokespecial 300	java/io/ByteArrayOutputStream:<init>	()V
    //   461: aload 10
    //   463: aload 7
    //   465: invokestatic 77	n1/d:n	(Ljava/io/ByteArrayOutputStream;Ln1/b;)V
    //   468: aload 10
    //   470: invokevirtual 91	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   473: astore 7
    //   475: aload 10
    //   477: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   480: aload 4
    //   482: iload 5
    //   484: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   487: aload 8
    //   489: arraylength
    //   490: iconst_2
    //   491: iadd
    //   492: aload 7
    //   494: arraylength
    //   495: iadd
    //   496: istore 11
    //   498: aload 4
    //   500: iload 11
    //   502: i2l
    //   503: iconst_4
    //   504: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   507: aload 4
    //   509: iload 9
    //   511: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   514: aload 4
    //   516: aload 8
    //   518: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   521: aload 4
    //   523: aload 7
    //   525: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   528: iload 6
    //   530: iconst_2
    //   531: iadd
    //   532: iconst_4
    //   533: iadd
    //   534: iload 11
    //   536: iadd
    //   537: istore 6
    //   539: iinc 5 1
    //   542: goto -190 -> 352
    //   545: astore_0
    //   546: aload 10
    //   548: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   551: goto +9 -> 560
    //   554: astore_1
    //   555: aload_0
    //   556: aload_1
    //   557: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   560: aload_0
    //   561: athrow
    //   562: astore_0
    //   563: aload 10
    //   565: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   568: goto +9 -> 577
    //   571: astore_1
    //   572: aload_0
    //   573: aload_1
    //   574: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   577: aload_0
    //   578: athrow
    //   579: aload 4
    //   581: invokevirtual 91	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   584: astore_2
    //   585: iload 6
    //   587: aload_2
    //   588: arraylength
    //   589: if_icmpne +230 -> 819
    //   592: new 317	n1/f
    //   595: dup
    //   596: iconst_4
    //   597: aload_2
    //   598: iconst_1
    //   599: invokespecial 320	n1/f:<init>	(I[BZ)V
    //   602: astore_2
    //   603: aload 4
    //   605: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   608: aload_3
    //   609: aload_2
    //   610: invokevirtual 324	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   613: pop
    //   614: iconst_4
    //   615: i2l
    //   616: lstore 12
    //   618: lload 12
    //   620: lload 12
    //   622: ladd
    //   623: ldc2_w 350
    //   626: ladd
    //   627: aload_3
    //   628: invokevirtual 352	java/util/ArrayList:size	()I
    //   631: bipush 16
    //   633: imul
    //   634: i2l
    //   635: ladd
    //   636: lstore 12
    //   638: aload_0
    //   639: aload_3
    //   640: invokevirtual 352	java/util/ArrayList:size	()I
    //   643: i2l
    //   644: iconst_4
    //   645: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   648: iconst_0
    //   649: istore 6
    //   651: iload 6
    //   653: aload_3
    //   654: invokevirtual 352	java/util/ArrayList:size	()I
    //   657: if_icmpge +129 -> 786
    //   660: aload_3
    //   661: iload 6
    //   663: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   666: checkcast 317	n1/f
    //   669: astore_2
    //   670: aload_0
    //   671: aload_2
    //   672: getfield 357	n1/f:a	I
    //   675: invokestatic 360	f:f	(I)J
    //   678: iconst_4
    //   679: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   682: aload_0
    //   683: lload 12
    //   685: iconst_4
    //   686: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   689: aload_2
    //   690: getfield 363	n1/f:c	Z
    //   693: ifeq +46 -> 739
    //   696: aload_2
    //   697: getfield 364	n1/f:b	[B
    //   700: astore_2
    //   701: aload_2
    //   702: arraylength
    //   703: i2l
    //   704: lstore 14
    //   706: aload_2
    //   707: invokestatic 368	x6/b:M	([B)[B
    //   710: astore_2
    //   711: aload_1
    //   712: aload_2
    //   713: invokevirtual 324	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   716: pop
    //   717: aload_0
    //   718: aload_2
    //   719: arraylength
    //   720: i2l
    //   721: iconst_4
    //   722: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   725: aload_0
    //   726: lload 14
    //   728: iconst_4
    //   729: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   732: aload_2
    //   733: arraylength
    //   734: istore 5
    //   736: goto +36 -> 772
    //   739: aload_1
    //   740: aload_2
    //   741: getfield 364	n1/f:b	[B
    //   744: invokevirtual 324	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   747: pop
    //   748: aload_0
    //   749: aload_2
    //   750: getfield 364	n1/f:b	[B
    //   753: arraylength
    //   754: i2l
    //   755: iconst_4
    //   756: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   759: aload_0
    //   760: lconst_0
    //   761: iconst_4
    //   762: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   765: aload_2
    //   766: getfield 364	n1/f:b	[B
    //   769: arraylength
    //   770: istore 5
    //   772: lload 12
    //   774: iload 5
    //   776: i2l
    //   777: ladd
    //   778: lstore 12
    //   780: iinc 6 1
    //   783: goto -132 -> 651
    //   786: iconst_0
    //   787: istore 6
    //   789: iload 6
    //   791: aload_1
    //   792: invokevirtual 352	java/util/ArrayList:size	()I
    //   795: if_icmpge +22 -> 817
    //   798: aload_0
    //   799: aload_1
    //   800: iload 6
    //   802: invokevirtual 355	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   805: checkcast 369	[B
    //   808: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   811: iinc 6 1
    //   814: goto -25 -> 789
    //   817: iconst_1
    //   818: ireturn
    //   819: new 99	java/lang/StringBuilder
    //   822: astore_0
    //   823: aload_0
    //   824: invokespecial 370	java/lang/StringBuilder:<init>	()V
    //   827: aload_0
    //   828: ldc_w 372
    //   831: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   834: pop
    //   835: aload_0
    //   836: iload 6
    //   838: invokevirtual 103	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   841: pop
    //   842: aload_0
    //   843: ldc_w 374
    //   846: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   849: pop
    //   850: aload_0
    //   851: aload_2
    //   852: arraylength
    //   853: invokevirtual 103	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   856: pop
    //   857: aload_0
    //   858: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   861: astore_1
    //   862: new 109	java/lang/IllegalStateException
    //   865: astore_0
    //   866: aload_0
    //   867: aload_1
    //   868: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   871: aload_0
    //   872: athrow
    //   873: astore_0
    //   874: aload 4
    //   876: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   879: goto +9 -> 888
    //   882: astore_1
    //   883: aload_0
    //   884: aload_1
    //   885: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   888: aload_0
    //   889: athrow
    //   890: new 99	java/lang/StringBuilder
    //   893: astore_0
    //   894: aload_0
    //   895: invokespecial 370	java/lang/StringBuilder:<init>	()V
    //   898: aload_0
    //   899: ldc_w 372
    //   902: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   905: pop
    //   906: aload_0
    //   907: iload 5
    //   909: invokevirtual 103	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   912: pop
    //   913: aload_0
    //   914: ldc_w 374
    //   917: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   920: pop
    //   921: aload_0
    //   922: aload 8
    //   924: arraylength
    //   925: invokevirtual 103	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: aload_0
    //   930: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   933: astore_1
    //   934: new 109	java/lang/IllegalStateException
    //   937: astore_0
    //   938: aload_0
    //   939: aload_1
    //   940: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   943: aload_0
    //   944: athrow
    //   945: astore_0
    //   946: aload 4
    //   948: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   951: goto +9 -> 960
    //   954: astore_1
    //   955: aload_0
    //   956: aload_1
    //   957: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   960: aload_0
    //   961: athrow
    //   962: new 99	java/lang/StringBuilder
    //   965: astore_0
    //   966: aload_0
    //   967: invokespecial 370	java/lang/StringBuilder:<init>	()V
    //   970: aload_0
    //   971: ldc_w 372
    //   974: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   977: pop
    //   978: aload_0
    //   979: iload 6
    //   981: invokevirtual 103	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   984: pop
    //   985: aload_0
    //   986: ldc_w 374
    //   989: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   992: pop
    //   993: aload_0
    //   994: aload 8
    //   996: arraylength
    //   997: invokevirtual 103	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1000: pop
    //   1001: aload_0
    //   1002: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1005: astore_0
    //   1006: new 109	java/lang/IllegalStateException
    //   1009: astore_1
    //   1010: aload_1
    //   1011: aload_0
    //   1012: invokespecial 116	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1015: aload_1
    //   1016: athrow
    //   1017: astore_0
    //   1018: aload 4
    //   1020: invokevirtual 321	java/io/ByteArrayOutputStream:close	()V
    //   1023: goto +9 -> 1032
    //   1026: astore_1
    //   1027: aload_0
    //   1028: aload_1
    //   1029: invokevirtual 201	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1032: aload_0
    //   1033: athrow
    //   1034: getstatic 249	n1/e:b	[B
    //   1037: astore_3
    //   1038: aload_1
    //   1039: aload_3
    //   1040: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   1043: ifeq +45 -> 1088
    //   1046: aload_2
    //   1047: aload_3
    //   1048: invokestatic 376	n1/d:a	([Ln1/b;[B)[B
    //   1051: astore_1
    //   1052: aload_0
    //   1053: aload_2
    //   1054: arraylength
    //   1055: i2l
    //   1056: iconst_1
    //   1057: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1060: aload_0
    //   1061: aload_1
    //   1062: arraylength
    //   1063: i2l
    //   1064: iconst_4
    //   1065: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1068: aload_1
    //   1069: invokestatic 368	x6/b:M	([B)[B
    //   1072: astore_1
    //   1073: aload_0
    //   1074: aload_1
    //   1075: arraylength
    //   1076: i2l
    //   1077: iconst_4
    //   1078: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1081: aload_0
    //   1082: aload_1
    //   1083: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   1086: iconst_1
    //   1087: ireturn
    //   1088: aload_1
    //   1089: getstatic 123	n1/e:d	[B
    //   1092: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   1095: ifeq +198 -> 1293
    //   1098: aload_0
    //   1099: aload_2
    //   1100: arraylength
    //   1101: i2l
    //   1102: iconst_1
    //   1103: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1106: aload_2
    //   1107: arraylength
    //   1108: istore 9
    //   1110: iconst_0
    //   1111: istore 6
    //   1113: iload 6
    //   1115: iload 9
    //   1117: if_icmpge +174 -> 1291
    //   1120: aload_2
    //   1121: iload 6
    //   1123: aaload
    //   1124: astore_1
    //   1125: aload_1
    //   1126: getfield 265	n1/b:i	Ljava/util/TreeMap;
    //   1129: invokevirtual 377	java/util/TreeMap:size	()I
    //   1132: istore 5
    //   1134: aload_1
    //   1135: getfield 25	n1/b:a	Ljava/lang/String;
    //   1138: astore_3
    //   1139: aload_1
    //   1140: getfield 27	n1/b:b	Ljava/lang/String;
    //   1143: astore 4
    //   1145: getstatic 123	n1/e:d	[B
    //   1148: aload_3
    //   1149: aload 4
    //   1151: invokestatic 30	n1/d:b	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1154: astore_3
    //   1155: aload_0
    //   1156: aload_3
    //   1157: getstatic 36	java/nio/charset/StandardCharsets:UTF_8	Ljava/nio/charset/Charset;
    //   1160: invokevirtual 42	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1163: arraylength
    //   1164: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1167: aload_0
    //   1168: aload_1
    //   1169: getfield 227	n1/b:h	[I
    //   1172: arraylength
    //   1173: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1176: aload_0
    //   1177: iload 5
    //   1179: iconst_4
    //   1180: imul
    //   1181: i2l
    //   1182: iconst_4
    //   1183: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1186: aload_0
    //   1187: aload_1
    //   1188: getfield 306	n1/b:c	J
    //   1191: iconst_4
    //   1192: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1195: aload_0
    //   1196: aload_3
    //   1197: getstatic 36	java/nio/charset/StandardCharsets:UTF_8	Ljava/nio/charset/Charset;
    //   1200: invokevirtual 42	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1203: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   1206: aload_1
    //   1207: getfield 265	n1/b:i	Ljava/util/TreeMap;
    //   1210: invokevirtual 380	java/util/TreeMap:keySet	()Ljava/util/Set;
    //   1213: invokeinterface 334 1 0
    //   1218: astore_3
    //   1219: aload_3
    //   1220: invokeinterface 340 1 0
    //   1225: ifeq +27 -> 1252
    //   1228: aload_0
    //   1229: aload_3
    //   1230: invokeinterface 344 1 0
    //   1235: checkcast 267	java/lang/Integer
    //   1238: invokevirtual 292	java/lang/Integer:intValue	()I
    //   1241: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1244: aload_0
    //   1245: iconst_0
    //   1246: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1249: goto -30 -> 1219
    //   1252: aload_1
    //   1253: getfield 227	n1/b:h	[I
    //   1256: astore_1
    //   1257: aload_1
    //   1258: arraylength
    //   1259: istore 11
    //   1261: iconst_0
    //   1262: istore 5
    //   1264: iload 5
    //   1266: iload 11
    //   1268: if_icmpge +17 -> 1285
    //   1271: aload_0
    //   1272: aload_1
    //   1273: iload 5
    //   1275: iaload
    //   1276: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1279: iinc 5 1
    //   1282: goto -18 -> 1264
    //   1285: iinc 6 1
    //   1288: goto -175 -> 1113
    //   1291: iconst_1
    //   1292: ireturn
    //   1293: getstatic 63	n1/e:c	[B
    //   1296: astore_3
    //   1297: aload_1
    //   1298: aload_3
    //   1299: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   1302: ifeq +45 -> 1347
    //   1305: aload_2
    //   1306: aload_3
    //   1307: invokestatic 376	n1/d:a	([Ln1/b;[B)[B
    //   1310: astore_1
    //   1311: aload_0
    //   1312: aload_2
    //   1313: arraylength
    //   1314: i2l
    //   1315: iconst_1
    //   1316: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1319: aload_0
    //   1320: aload_1
    //   1321: arraylength
    //   1322: i2l
    //   1323: iconst_4
    //   1324: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1327: aload_1
    //   1328: invokestatic 368	x6/b:M	([B)[B
    //   1331: astore_1
    //   1332: aload_0
    //   1333: aload_1
    //   1334: arraylength
    //   1335: i2l
    //   1336: iconst_4
    //   1337: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1340: aload_0
    //   1341: aload_1
    //   1342: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   1345: iconst_1
    //   1346: ireturn
    //   1347: aload_1
    //   1348: getstatic 118	n1/e:e	[B
    //   1351: invokestatic 69	java/util/Arrays:equals	([B[B)Z
    //   1354: ifeq +183 -> 1537
    //   1357: aload_0
    //   1358: aload_2
    //   1359: arraylength
    //   1360: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1363: aload_2
    //   1364: arraylength
    //   1365: istore 9
    //   1367: iconst_0
    //   1368: istore 6
    //   1370: iload 6
    //   1372: iload 9
    //   1374: if_icmpge +161 -> 1535
    //   1377: aload_2
    //   1378: iload 6
    //   1380: aaload
    //   1381: astore_1
    //   1382: aload_1
    //   1383: getfield 25	n1/b:a	Ljava/lang/String;
    //   1386: astore 4
    //   1388: aload_1
    //   1389: getfield 27	n1/b:b	Ljava/lang/String;
    //   1392: astore_3
    //   1393: getstatic 118	n1/e:e	[B
    //   1396: aload 4
    //   1398: aload_3
    //   1399: invokestatic 30	n1/d:b	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1402: astore_3
    //   1403: aload_0
    //   1404: aload_3
    //   1405: getstatic 36	java/nio/charset/StandardCharsets:UTF_8	Ljava/nio/charset/Charset;
    //   1408: invokevirtual 42	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1411: arraylength
    //   1412: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1415: aload_0
    //   1416: aload_1
    //   1417: getfield 265	n1/b:i	Ljava/util/TreeMap;
    //   1420: invokevirtual 377	java/util/TreeMap:size	()I
    //   1423: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1426: aload_0
    //   1427: aload_1
    //   1428: getfield 227	n1/b:h	[I
    //   1431: arraylength
    //   1432: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1435: aload_0
    //   1436: aload_1
    //   1437: getfield 306	n1/b:c	J
    //   1440: iconst_4
    //   1441: invokestatic 310	x6/b:C0	(Ljava/io/ByteArrayOutputStream;JI)V
    //   1444: aload_0
    //   1445: aload_3
    //   1446: getstatic 36	java/nio/charset/StandardCharsets:UTF_8	Ljava/nio/charset/Charset;
    //   1449: invokevirtual 42	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1452: invokevirtual 315	java/io/OutputStream:write	([B)V
    //   1455: aload_1
    //   1456: getfield 265	n1/b:i	Ljava/util/TreeMap;
    //   1459: invokevirtual 380	java/util/TreeMap:keySet	()Ljava/util/Set;
    //   1462: invokeinterface 334 1 0
    //   1467: astore_3
    //   1468: aload_3
    //   1469: invokeinterface 340 1 0
    //   1474: ifeq +22 -> 1496
    //   1477: aload_0
    //   1478: aload_3
    //   1479: invokeinterface 344 1 0
    //   1484: checkcast 267	java/lang/Integer
    //   1487: invokevirtual 292	java/lang/Integer:intValue	()I
    //   1490: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1493: goto -25 -> 1468
    //   1496: aload_1
    //   1497: getfield 227	n1/b:h	[I
    //   1500: astore_1
    //   1501: aload_1
    //   1502: arraylength
    //   1503: istore 11
    //   1505: iconst_0
    //   1506: istore 5
    //   1508: iload 5
    //   1510: iload 11
    //   1512: if_icmpge +17 -> 1529
    //   1515: aload_0
    //   1516: aload_1
    //   1517: iload 5
    //   1519: iaload
    //   1520: invokestatic 304	x6/b:D0	(Ljava/io/ByteArrayOutputStream;I)V
    //   1523: iinc 5 1
    //   1526: goto -18 -> 1508
    //   1529: iinc 6 1
    //   1532: goto -162 -> 1370
    //   1535: iconst_1
    //   1536: ireturn
    //   1537: iconst_0
    //   1538: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1539	0	paramByteArrayOutputStream	ByteArrayOutputStream
    //   0	1539	1	paramArrayOfByte	byte[]
    //   0	1539	2	paramArrayOfb	b[]
    //   18	1461	3	localObject1	Object
    //   35	1362	4	localObject2	Object
    //   45	1479	5	i	int
    //   48	1482	6	j	int
    //   61	463	7	localObject3	Object
    //   102	893	8	localObject4	Object
    //   132	1243	9	k	int
    //   425	139	10	localByteArrayOutputStream	ByteArrayOutputStream
    //   496	1017	11	m	int
    //   616	163	12	l1	long
    //   704	23	14	l2	long
    // Exception table:
    //   from	to	target	type
    //   461	475	545	finally
    //   546	551	554	finally
    //   432	446	562	finally
    //   563	568	571	finally
    //   352	359	873	finally
    //   365	380	873	finally
    //   383	419	873	finally
    //   422	432	873	finally
    //   446	461	873	finally
    //   475	528	873	finally
    //   555	560	873	finally
    //   560	562	873	finally
    //   572	577	873	finally
    //   577	579	873	finally
    //   579	603	873	finally
    //   819	873	873	finally
    //   874	879	882	finally
    //   237	244	945	finally
    //   250	290	945	finally
    //   296	324	945	finally
    //   890	945	945	finally
    //   946	951	954	finally
    //   37	44	1017	finally
    //   50	57	1017	finally
    //   63	141	1017	finally
    //   158	171	1017	finally
    //   177	189	1017	finally
    //   196	209	1017	finally
    //   962	1017	1017	finally
    //   1018	1023	1026	finally
  }
  
  public static void k(ByteArrayOutputStream paramByteArrayOutputStream, b paramb)
  {
    paramb = h;
    int i = paramb.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Integer localInteger = Integer.valueOf(paramb[j]);
      x6.b.D0(paramByteArrayOutputStream, localInteger.intValue() - k);
      k = localInteger.intValue();
      j++;
    }
  }
  
  public static void l(ByteArrayOutputStream paramByteArrayOutputStream, b paramb, String paramString)
  {
    x6.b.D0(paramByteArrayOutputStream, paramString.getBytes(StandardCharsets.UTF_8).length);
    x6.b.D0(paramByteArrayOutputStream, e);
    x6.b.C0(paramByteArrayOutputStream, f, 4);
    x6.b.C0(paramByteArrayOutputStream, c, 4);
    x6.b.C0(paramByteArrayOutputStream, g, 4);
    paramByteArrayOutputStream.write(paramString.getBytes(StandardCharsets.UTF_8));
  }
  
  public static void m(ByteArrayOutputStream paramByteArrayOutputStream, b paramb)
  {
    byte[] arrayOfByte = new byte[(g * 2 + 8 - 1 & 0xFFFFFFF8) / 8];
    Iterator localIterator = i.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = ((Integer)localEntry.getKey()).intValue();
      int j = ((Integer)localEntry.getValue()).intValue();
      int k;
      if ((j & 0x2) != 0)
      {
        k = c(2, i, g);
        int m = k / 8;
        arrayOfByte[m] = ((byte)(byte)(1 << k % 8 | arrayOfByte[m]));
      }
      if ((j & 0x4) != 0)
      {
        i = c(4, i, g);
        k = i / 8;
        arrayOfByte[k] = ((byte)(byte)(1 << i % 8 | arrayOfByte[k]));
      }
    }
    paramByteArrayOutputStream.write(arrayOfByte);
  }
  
  public static void n(ByteArrayOutputStream paramByteArrayOutputStream, b paramb)
  {
    Iterator localIterator = i.entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      paramb = (Map.Entry)localIterator.next();
      int j = ((Integer)paramb.getKey()).intValue();
      if ((((Integer)paramb.getValue()).intValue() & 0x1) != 0)
      {
        x6.b.D0(paramByteArrayOutputStream, j - i);
        x6.b.D0(paramByteArrayOutputStream, 0);
        i = j;
      }
    }
  }
}

/* Location:
 * Qualified Name:     n1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */