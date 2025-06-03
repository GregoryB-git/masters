package com.google.android.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

class CachedContentIndex
{
  public static final String FILE_NAME = "cached_content_index.exi";
  private static final int FLAG_ENCRYPTED_INDEX = 1;
  private static final int VERSION = 2;
  private final AtomicFile atomicFile;
  private ReusableBufferedOutputStream bufferedOutputStream;
  private boolean changed;
  private final Cipher cipher;
  private final boolean encrypt;
  private final SparseArray<String> idToKey;
  private final HashMap<String, CachedContent> keyToContent;
  private final SecretKeySpec secretKeySpec;
  
  public CachedContentIndex(File paramFile)
  {
    this(paramFile, null);
  }
  
  public CachedContentIndex(File paramFile, byte[] paramArrayOfByte)
  {
    this(paramFile, paramArrayOfByte, bool);
  }
  
  public CachedContentIndex(File paramFile, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    encrypt = paramBoolean;
    boolean bool = true;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length == 16) {
        paramBoolean = bool;
      } else {
        paramBoolean = false;
      }
      Assertions.checkArgument(paramBoolean);
      try
      {
        cipher = getCipher();
        SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
        localSecretKeySpec.<init>(paramArrayOfByte, "AES");
        secretKeySpec = localSecretKeySpec;
      }
      catch (NoSuchPaddingException paramFile) {}catch (NoSuchAlgorithmException paramFile) {}
      throw new IllegalStateException(paramFile);
    }
    else
    {
      Assertions.checkState(paramBoolean ^ true);
      cipher = null;
      secretKeySpec = null;
    }
    keyToContent = new HashMap();
    idToKey = new SparseArray();
    atomicFile = new AtomicFile(new File(paramFile, "cached_content_index.exi"));
  }
  
  private void add(CachedContent paramCachedContent)
  {
    keyToContent.put(key, paramCachedContent);
    idToKey.put(id, key);
  }
  
  private CachedContent addNew(String paramString)
  {
    paramString = new CachedContent(getNewId(idToKey), paramString);
    add(paramString);
    changed = true;
    return paramString;
  }
  
  private static Cipher getCipher()
    throws NoSuchPaddingException, NoSuchAlgorithmException
  {
    if (Util.SDK_INT == 18) {}
    try
    {
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
      return localCipher;
    }
    finally
    {
      for (;;) {}
    }
    return Cipher.getInstance("AES/CBC/PKCS5PADDING");
  }
  
  public static int getNewId(SparseArray<String> paramSparseArray)
  {
    int i = paramSparseArray.size();
    int j = 0;
    int k;
    if (i == 0) {
      k = 0;
    } else {
      k = paramSparseArray.keyAt(i - 1) + 1;
    }
    int m = k;
    if (k < 0)
    {
      for (k = j; (k < i) && (k == paramSparseArray.keyAt(k)); k++) {}
      m = k;
    }
    return m;
  }
  
  /* Error */
  private boolean readFile()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: new 167	java/io/BufferedInputStream
    //   7: astore_3
    //   8: aload_3
    //   9: aload_0
    //   10: getfield 98	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:atomicFile	Lcom/google/android/exoplayer2/util/AtomicFile;
    //   13: invokevirtual 171	com/google/android/exoplayer2/util/AtomicFile:openRead	()Ljava/io/InputStream;
    //   16: invokespecial 174	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: new 176	java/io/DataInputStream
    //   22: astore 4
    //   24: aload 4
    //   26: aload_3
    //   27: invokespecial 177	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   30: aload 4
    //   32: astore_2
    //   33: aload 4
    //   35: astore 5
    //   37: aload 4
    //   39: invokevirtual 180	java/io/DataInputStream:readInt	()I
    //   42: istore 6
    //   44: iload 6
    //   46: iflt +384 -> 430
    //   49: iload 6
    //   51: iconst_2
    //   52: if_icmple +6 -> 58
    //   55: goto +375 -> 430
    //   58: aload 4
    //   60: astore_2
    //   61: aload 4
    //   63: astore 5
    //   65: aload 4
    //   67: invokevirtual 180	java/io/DataInputStream:readInt	()I
    //   70: iconst_1
    //   71: iand
    //   72: ifeq +190 -> 262
    //   75: aload 4
    //   77: astore_2
    //   78: aload 4
    //   80: astore 5
    //   82: aload_0
    //   83: getfield 60	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:cipher	Ljavax/crypto/Cipher;
    //   86: astore_1
    //   87: aload_1
    //   88: ifnonnull +10 -> 98
    //   91: aload 4
    //   93: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   96: iconst_0
    //   97: ireturn
    //   98: aload 4
    //   100: astore_2
    //   101: aload 4
    //   103: astore 5
    //   105: bipush 16
    //   107: newarray <illegal type>
    //   109: astore 7
    //   111: aload 4
    //   113: astore_2
    //   114: aload 4
    //   116: astore 5
    //   118: aload 4
    //   120: aload 7
    //   122: invokevirtual 188	java/io/DataInputStream:readFully	([B)V
    //   125: aload 4
    //   127: astore_2
    //   128: aload 4
    //   130: astore 5
    //   132: new 190	javax/crypto/spec/IvParameterSpec
    //   135: astore_1
    //   136: aload 4
    //   138: astore_2
    //   139: aload 4
    //   141: astore 5
    //   143: aload_1
    //   144: aload 7
    //   146: invokespecial 192	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   149: aload 4
    //   151: astore_2
    //   152: aload 4
    //   154: astore 5
    //   156: aload_0
    //   157: getfield 60	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:cipher	Ljavax/crypto/Cipher;
    //   160: iconst_2
    //   161: aload_0
    //   162: getfield 69	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:secretKeySpec	Ljavax/crypto/spec/SecretKeySpec;
    //   165: aload_1
    //   166: invokevirtual 196	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   169: aload 4
    //   171: astore_2
    //   172: aload 4
    //   174: astore 5
    //   176: new 176	java/io/DataInputStream
    //   179: astore_1
    //   180: aload 4
    //   182: astore_2
    //   183: aload 4
    //   185: astore 5
    //   187: new 198	javax/crypto/CipherInputStream
    //   190: astore 7
    //   192: aload 4
    //   194: astore_2
    //   195: aload 4
    //   197: astore 5
    //   199: aload 7
    //   201: aload_3
    //   202: aload_0
    //   203: getfield 60	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:cipher	Ljavax/crypto/Cipher;
    //   206: invokespecial 201	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   209: aload 4
    //   211: astore_2
    //   212: aload 4
    //   214: astore 5
    //   216: aload_1
    //   217: aload 7
    //   219: invokespecial 177	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   222: goto +72 -> 294
    //   225: astore_1
    //   226: goto +4 -> 230
    //   229: astore_1
    //   230: aload 4
    //   232: astore_2
    //   233: aload 4
    //   235: astore 5
    //   237: new 71	java/lang/IllegalStateException
    //   240: astore_3
    //   241: aload 4
    //   243: astore_2
    //   244: aload 4
    //   246: astore 5
    //   248: aload_3
    //   249: aload_1
    //   250: invokespecial 74	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   253: aload 4
    //   255: astore_2
    //   256: aload 4
    //   258: astore 5
    //   260: aload_3
    //   261: athrow
    //   262: aload 4
    //   264: astore_1
    //   265: aload 4
    //   267: astore_2
    //   268: aload 4
    //   270: astore 5
    //   272: aload_0
    //   273: getfield 48	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:encrypt	Z
    //   276: ifeq +18 -> 294
    //   279: aload 4
    //   281: astore_2
    //   282: aload 4
    //   284: astore 5
    //   286: aload_0
    //   287: iconst_1
    //   288: putfield 128	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:changed	Z
    //   291: aload 4
    //   293: astore_1
    //   294: aload_1
    //   295: astore_2
    //   296: aload_1
    //   297: astore 5
    //   299: aload_1
    //   300: invokevirtual 180	java/io/DataInputStream:readInt	()I
    //   303: istore 8
    //   305: iconst_0
    //   306: istore 9
    //   308: iload 9
    //   310: istore 10
    //   312: iload 9
    //   314: iload 8
    //   316: if_icmpge +50 -> 366
    //   319: aload_1
    //   320: astore_2
    //   321: aload_1
    //   322: astore 5
    //   324: iload 6
    //   326: aload_1
    //   327: invokestatic 205	com/google/android/exoplayer2/upstream/cache/CachedContent:readFromStream	(ILjava/io/DataInputStream;)Lcom/google/android/exoplayer2/upstream/cache/CachedContent;
    //   330: astore 4
    //   332: aload_1
    //   333: astore_2
    //   334: aload_1
    //   335: astore 5
    //   337: aload_0
    //   338: aload 4
    //   340: invokespecial 126	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:add	(Lcom/google/android/exoplayer2/upstream/cache/CachedContent;)V
    //   343: aload_1
    //   344: astore_2
    //   345: aload_1
    //   346: astore 5
    //   348: iload 10
    //   350: aload 4
    //   352: iload 6
    //   354: invokevirtual 208	com/google/android/exoplayer2/upstream/cache/CachedContent:headerHashCode	(I)I
    //   357: iadd
    //   358: istore 10
    //   360: iinc 9 1
    //   363: goto -51 -> 312
    //   366: aload_1
    //   367: astore_2
    //   368: aload_1
    //   369: astore 5
    //   371: aload_1
    //   372: invokevirtual 180	java/io/DataInputStream:readInt	()I
    //   375: istore 6
    //   377: aload_1
    //   378: astore_2
    //   379: aload_1
    //   380: astore 5
    //   382: aload_1
    //   383: invokevirtual 213	java/io/InputStream:read	()I
    //   386: istore 9
    //   388: iload 9
    //   390: iconst_m1
    //   391: if_icmpne +9 -> 400
    //   394: iconst_1
    //   395: istore 9
    //   397: goto +6 -> 403
    //   400: iconst_0
    //   401: istore 9
    //   403: iload 6
    //   405: iload 10
    //   407: if_icmpne +17 -> 424
    //   410: iload 9
    //   412: ifne +6 -> 418
    //   415: goto +9 -> 424
    //   418: aload_1
    //   419: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   422: iconst_1
    //   423: ireturn
    //   424: aload_1
    //   425: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   428: iconst_0
    //   429: ireturn
    //   430: aload 4
    //   432: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   435: iconst_0
    //   436: ireturn
    //   437: astore_1
    //   438: aload_2
    //   439: astore 4
    //   441: goto +14 -> 455
    //   444: astore_1
    //   445: aload 5
    //   447: astore_1
    //   448: goto +19 -> 467
    //   451: astore_1
    //   452: aload_2
    //   453: astore 4
    //   455: aload 4
    //   457: ifnull +8 -> 465
    //   460: aload 4
    //   462: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   465: aload_1
    //   466: athrow
    //   467: aload_1
    //   468: ifnull +7 -> 475
    //   471: aload_1
    //   472: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   475: iconst_0
    //   476: ireturn
    //   477: astore 4
    //   479: goto -12 -> 467
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	482	0	this	CachedContentIndex
    //   1	216	1	localObject1	Object
    //   225	1	1	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   229	21	1	localInvalidKeyException	java.security.InvalidKeyException
    //   264	161	1	localObject2	Object
    //   437	1	1	localObject3	Object
    //   444	1	1	localIOException1	java.io.IOException
    //   447	1	1	localObject4	Object
    //   451	21	1	localCloseable	java.io.Closeable
    //   3	450	2	localObject5	Object
    //   7	254	3	localObject6	Object
    //   22	439	4	localObject7	Object
    //   477	1	4	localIOException2	java.io.IOException
    //   35	411	5	localObject8	Object
    //   42	366	6	i	int
    //   109	109	7	localObject9	Object
    //   303	14	8	j	int
    //   306	105	9	k	int
    //   310	98	10	m	int
    // Exception table:
    //   from	to	target	type
    //   156	169	225	java/security/InvalidAlgorithmParameterException
    //   156	169	229	java/security/InvalidKeyException
    //   37	44	437	finally
    //   65	75	437	finally
    //   82	87	437	finally
    //   105	111	437	finally
    //   118	125	437	finally
    //   132	136	437	finally
    //   143	149	437	finally
    //   156	169	437	finally
    //   176	180	437	finally
    //   187	192	437	finally
    //   199	209	437	finally
    //   216	222	437	finally
    //   237	241	437	finally
    //   248	253	437	finally
    //   260	262	437	finally
    //   272	279	437	finally
    //   286	291	437	finally
    //   299	305	437	finally
    //   324	332	437	finally
    //   337	343	437	finally
    //   348	360	437	finally
    //   371	377	437	finally
    //   382	388	437	finally
    //   37	44	444	java/io/IOException
    //   65	75	444	java/io/IOException
    //   82	87	444	java/io/IOException
    //   105	111	444	java/io/IOException
    //   118	125	444	java/io/IOException
    //   132	136	444	java/io/IOException
    //   143	149	444	java/io/IOException
    //   156	169	444	java/io/IOException
    //   176	180	444	java/io/IOException
    //   187	192	444	java/io/IOException
    //   199	209	444	java/io/IOException
    //   216	222	444	java/io/IOException
    //   237	241	444	java/io/IOException
    //   248	253	444	java/io/IOException
    //   260	262	444	java/io/IOException
    //   272	279	444	java/io/IOException
    //   286	291	444	java/io/IOException
    //   299	305	444	java/io/IOException
    //   324	332	444	java/io/IOException
    //   337	343	444	java/io/IOException
    //   348	360	444	java/io/IOException
    //   371	377	444	java/io/IOException
    //   382	388	444	java/io/IOException
    //   4	30	451	finally
    //   4	30	477	java/io/IOException
  }
  
  /* Error */
  private void writeFile()
    throws Cache.CacheException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_2
    //   5: astore_3
    //   6: aload_0
    //   7: getfield 98	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:atomicFile	Lcom/google/android/exoplayer2/util/AtomicFile;
    //   10: invokevirtual 220	com/google/android/exoplayer2/util/AtomicFile:startWrite	()Ljava/io/OutputStream;
    //   13: astore 4
    //   15: aload_2
    //   16: astore_3
    //   17: aload_0
    //   18: getfield 222	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:bufferedOutputStream	Lcom/google/android/exoplayer2/util/ReusableBufferedOutputStream;
    //   21: astore 5
    //   23: aload 5
    //   25: ifnonnull +30 -> 55
    //   28: aload_2
    //   29: astore_3
    //   30: new 224	com/google/android/exoplayer2/util/ReusableBufferedOutputStream
    //   33: astore 5
    //   35: aload_2
    //   36: astore_3
    //   37: aload 5
    //   39: aload 4
    //   41: invokespecial 227	com/google/android/exoplayer2/util/ReusableBufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   44: aload_2
    //   45: astore_3
    //   46: aload_0
    //   47: aload 5
    //   49: putfield 222	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:bufferedOutputStream	Lcom/google/android/exoplayer2/util/ReusableBufferedOutputStream;
    //   52: goto +12 -> 64
    //   55: aload_2
    //   56: astore_3
    //   57: aload 5
    //   59: aload 4
    //   61: invokevirtual 230	com/google/android/exoplayer2/util/ReusableBufferedOutputStream:reset	(Ljava/io/OutputStream;)V
    //   64: aload_2
    //   65: astore_3
    //   66: new 232	java/io/DataOutputStream
    //   69: astore 4
    //   71: aload_2
    //   72: astore_3
    //   73: aload 4
    //   75: aload_0
    //   76: getfield 222	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:bufferedOutputStream	Lcom/google/android/exoplayer2/util/ReusableBufferedOutputStream;
    //   79: invokespecial 233	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   82: aload 4
    //   84: astore_2
    //   85: aload 4
    //   87: astore_1
    //   88: aload 4
    //   90: iconst_2
    //   91: invokevirtual 237	java/io/DataOutputStream:writeInt	(I)V
    //   94: aload 4
    //   96: astore_2
    //   97: aload 4
    //   99: astore_1
    //   100: aload_0
    //   101: getfield 48	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:encrypt	Z
    //   104: istore 6
    //   106: iconst_0
    //   107: istore 7
    //   109: iload 6
    //   111: ifeq +9 -> 120
    //   114: iconst_1
    //   115: istore 8
    //   117: goto +6 -> 123
    //   120: iconst_0
    //   121: istore 8
    //   123: aload 4
    //   125: astore_2
    //   126: aload 4
    //   128: astore_1
    //   129: aload 4
    //   131: iload 8
    //   133: invokevirtual 237	java/io/DataOutputStream:writeInt	(I)V
    //   136: aload 4
    //   138: astore_3
    //   139: aload 4
    //   141: astore_2
    //   142: aload 4
    //   144: astore_1
    //   145: aload_0
    //   146: getfield 48	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:encrypt	Z
    //   149: ifeq +206 -> 355
    //   152: aload 4
    //   154: astore_2
    //   155: aload 4
    //   157: astore_1
    //   158: bipush 16
    //   160: newarray <illegal type>
    //   162: astore_3
    //   163: aload 4
    //   165: astore_2
    //   166: aload 4
    //   168: astore_1
    //   169: new 239	java/util/Random
    //   172: astore 5
    //   174: aload 4
    //   176: astore_2
    //   177: aload 4
    //   179: astore_1
    //   180: aload 5
    //   182: invokespecial 240	java/util/Random:<init>	()V
    //   185: aload 4
    //   187: astore_2
    //   188: aload 4
    //   190: astore_1
    //   191: aload 5
    //   193: aload_3
    //   194: invokevirtual 243	java/util/Random:nextBytes	([B)V
    //   197: aload 4
    //   199: astore_2
    //   200: aload 4
    //   202: astore_1
    //   203: aload 4
    //   205: aload_3
    //   206: invokevirtual 248	java/io/OutputStream:write	([B)V
    //   209: aload 4
    //   211: astore_2
    //   212: aload 4
    //   214: astore_1
    //   215: new 190	javax/crypto/spec/IvParameterSpec
    //   218: astore 5
    //   220: aload 4
    //   222: astore_2
    //   223: aload 4
    //   225: astore_1
    //   226: aload 5
    //   228: aload_3
    //   229: invokespecial 192	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   232: aload 4
    //   234: astore_2
    //   235: aload 4
    //   237: astore_1
    //   238: aload_0
    //   239: getfield 60	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:cipher	Ljavax/crypto/Cipher;
    //   242: iconst_1
    //   243: aload_0
    //   244: getfield 69	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:secretKeySpec	Ljavax/crypto/spec/SecretKeySpec;
    //   247: aload 5
    //   249: invokevirtual 196	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   252: aload 4
    //   254: astore_2
    //   255: aload 4
    //   257: astore_1
    //   258: aload 4
    //   260: invokevirtual 251	java/io/DataOutputStream:flush	()V
    //   263: aload 4
    //   265: astore_2
    //   266: aload 4
    //   268: astore_1
    //   269: new 232	java/io/DataOutputStream
    //   272: astore_3
    //   273: aload 4
    //   275: astore_2
    //   276: aload 4
    //   278: astore_1
    //   279: new 253	javax/crypto/CipherOutputStream
    //   282: astore 5
    //   284: aload 4
    //   286: astore_2
    //   287: aload 4
    //   289: astore_1
    //   290: aload 5
    //   292: aload_0
    //   293: getfield 222	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:bufferedOutputStream	Lcom/google/android/exoplayer2/util/ReusableBufferedOutputStream;
    //   296: aload_0
    //   297: getfield 60	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:cipher	Ljavax/crypto/Cipher;
    //   300: invokespecial 256	javax/crypto/CipherOutputStream:<init>	(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   303: aload 4
    //   305: astore_2
    //   306: aload 4
    //   308: astore_1
    //   309: aload_3
    //   310: aload 5
    //   312: invokespecial 233	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   315: goto +40 -> 355
    //   318: astore_3
    //   319: goto +4 -> 323
    //   322: astore_3
    //   323: aload 4
    //   325: astore_2
    //   326: aload 4
    //   328: astore_1
    //   329: new 71	java/lang/IllegalStateException
    //   332: astore 5
    //   334: aload 4
    //   336: astore_2
    //   337: aload 4
    //   339: astore_1
    //   340: aload 5
    //   342: aload_3
    //   343: invokespecial 74	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   346: aload 4
    //   348: astore_2
    //   349: aload 4
    //   351: astore_1
    //   352: aload 5
    //   354: athrow
    //   355: aload_3
    //   356: astore_2
    //   357: aload_3
    //   358: astore_1
    //   359: aload_3
    //   360: aload_0
    //   361: getfield 82	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:keyToContent	Ljava/util/HashMap;
    //   364: invokevirtual 257	java/util/HashMap:size	()I
    //   367: invokevirtual 237	java/io/DataOutputStream:writeInt	(I)V
    //   370: aload_3
    //   371: astore_2
    //   372: aload_3
    //   373: astore_1
    //   374: aload_0
    //   375: getfield 82	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:keyToContent	Ljava/util/HashMap;
    //   378: invokevirtual 261	java/util/HashMap:values	()Ljava/util/Collection;
    //   381: invokeinterface 267 1 0
    //   386: astore 4
    //   388: iload 7
    //   390: istore 8
    //   392: aload_3
    //   393: astore_2
    //   394: aload_3
    //   395: astore_1
    //   396: aload 4
    //   398: invokeinterface 272 1 0
    //   403: ifeq +47 -> 450
    //   406: aload_3
    //   407: astore_2
    //   408: aload_3
    //   409: astore_1
    //   410: aload 4
    //   412: invokeinterface 276 1 0
    //   417: checkcast 102	com/google/android/exoplayer2/upstream/cache/CachedContent
    //   420: astore 5
    //   422: aload_3
    //   423: astore_2
    //   424: aload_3
    //   425: astore_1
    //   426: aload 5
    //   428: aload_3
    //   429: invokevirtual 280	com/google/android/exoplayer2/upstream/cache/CachedContent:writeToStream	(Ljava/io/DataOutputStream;)V
    //   432: aload_3
    //   433: astore_2
    //   434: aload_3
    //   435: astore_1
    //   436: iload 8
    //   438: aload 5
    //   440: iconst_2
    //   441: invokevirtual 208	com/google/android/exoplayer2/upstream/cache/CachedContent:headerHashCode	(I)I
    //   444: iadd
    //   445: istore 8
    //   447: goto -55 -> 392
    //   450: aload_3
    //   451: astore_2
    //   452: aload_3
    //   453: astore_1
    //   454: aload_3
    //   455: iload 8
    //   457: invokevirtual 237	java/io/DataOutputStream:writeInt	(I)V
    //   460: aload_3
    //   461: astore_2
    //   462: aload_3
    //   463: astore_1
    //   464: aload_0
    //   465: getfield 98	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:atomicFile	Lcom/google/android/exoplayer2/util/AtomicFile;
    //   468: aload_3
    //   469: invokevirtual 283	com/google/android/exoplayer2/util/AtomicFile:endWrite	(Ljava/io/OutputStream;)V
    //   472: aconst_null
    //   473: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   476: return
    //   477: astore 4
    //   479: aload_2
    //   480: astore_3
    //   481: goto +39 -> 520
    //   484: astore_2
    //   485: aload_1
    //   486: astore 4
    //   488: goto +12 -> 500
    //   491: astore 4
    //   493: goto +27 -> 520
    //   496: astore_2
    //   497: aload_1
    //   498: astore 4
    //   500: aload 4
    //   502: astore_3
    //   503: new 216	com/google/android/exoplayer2/upstream/cache/Cache$CacheException
    //   506: astore_1
    //   507: aload 4
    //   509: astore_3
    //   510: aload_1
    //   511: aload_2
    //   512: invokespecial 284	com/google/android/exoplayer2/upstream/cache/Cache$CacheException:<init>	(Ljava/lang/Throwable;)V
    //   515: aload 4
    //   517: astore_3
    //   518: aload_1
    //   519: athrow
    //   520: aload_3
    //   521: invokestatic 184	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   524: aload 4
    //   526: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	527	0	this	CachedContentIndex
    //   1	518	1	localObject1	Object
    //   3	477	2	localObject2	Object
    //   484	1	2	localIOException1	java.io.IOException
    //   496	16	2	localIOException2	java.io.IOException
    //   5	305	3	localObject3	Object
    //   318	1	3	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   322	147	3	localInvalidKeyException	java.security.InvalidKeyException
    //   480	41	3	localObject4	Object
    //   13	398	4	localObject5	Object
    //   477	1	4	localObject6	Object
    //   486	1	4	localObject7	Object
    //   491	1	4	localObject8	Object
    //   498	27	4	localObject9	Object
    //   21	418	5	localObject10	Object
    //   104	6	6	bool	boolean
    //   107	282	7	i	int
    //   115	341	8	j	int
    // Exception table:
    //   from	to	target	type
    //   238	252	318	java/security/InvalidAlgorithmParameterException
    //   238	252	322	java/security/InvalidKeyException
    //   88	94	477	finally
    //   100	106	477	finally
    //   129	136	477	finally
    //   145	152	477	finally
    //   158	163	477	finally
    //   169	174	477	finally
    //   180	185	477	finally
    //   191	197	477	finally
    //   203	209	477	finally
    //   215	220	477	finally
    //   226	232	477	finally
    //   238	252	477	finally
    //   258	263	477	finally
    //   269	273	477	finally
    //   279	284	477	finally
    //   290	303	477	finally
    //   309	315	477	finally
    //   329	334	477	finally
    //   340	346	477	finally
    //   352	355	477	finally
    //   359	370	477	finally
    //   374	388	477	finally
    //   396	406	477	finally
    //   410	422	477	finally
    //   426	432	477	finally
    //   436	447	477	finally
    //   454	460	477	finally
    //   464	472	477	finally
    //   88	94	484	java/io/IOException
    //   100	106	484	java/io/IOException
    //   129	136	484	java/io/IOException
    //   145	152	484	java/io/IOException
    //   158	163	484	java/io/IOException
    //   169	174	484	java/io/IOException
    //   180	185	484	java/io/IOException
    //   191	197	484	java/io/IOException
    //   203	209	484	java/io/IOException
    //   215	220	484	java/io/IOException
    //   226	232	484	java/io/IOException
    //   238	252	484	java/io/IOException
    //   258	263	484	java/io/IOException
    //   269	273	484	java/io/IOException
    //   279	284	484	java/io/IOException
    //   290	303	484	java/io/IOException
    //   309	315	484	java/io/IOException
    //   329	334	484	java/io/IOException
    //   340	346	484	java/io/IOException
    //   352	355	484	java/io/IOException
    //   359	370	484	java/io/IOException
    //   374	388	484	java/io/IOException
    //   396	406	484	java/io/IOException
    //   410	422	484	java/io/IOException
    //   426	432	484	java/io/IOException
    //   436	447	484	java/io/IOException
    //   454	460	484	java/io/IOException
    //   464	472	484	java/io/IOException
    //   6	15	491	finally
    //   17	23	491	finally
    //   30	35	491	finally
    //   37	44	491	finally
    //   46	52	491	finally
    //   57	64	491	finally
    //   66	71	491	finally
    //   73	82	491	finally
    //   503	507	491	finally
    //   510	515	491	finally
    //   518	520	491	finally
    //   6	15	496	java/io/IOException
    //   17	23	496	java/io/IOException
    //   30	35	496	java/io/IOException
    //   37	44	496	java/io/IOException
    //   46	52	496	java/io/IOException
    //   57	64	496	java/io/IOException
    //   66	71	496	java/io/IOException
    //   73	82	496	java/io/IOException
  }
  
  public void applyContentMetadataMutations(String paramString, ContentMetadataMutations paramContentMetadataMutations)
  {
    if (getOrAdd(paramString).applyMetadataMutations(paramContentMetadataMutations)) {
      changed = true;
    }
  }
  
  public int assignIdForKey(String paramString)
  {
    return getOrAddid;
  }
  
  public CachedContent get(String paramString)
  {
    return (CachedContent)keyToContent.get(paramString);
  }
  
  public Collection<CachedContent> getAll()
  {
    return keyToContent.values();
  }
  
  public ContentMetadata getContentMetadata(String paramString)
  {
    paramString = get(paramString);
    if (paramString != null) {
      paramString = paramString.getMetadata();
    } else {
      paramString = DefaultContentMetadata.EMPTY;
    }
    return paramString;
  }
  
  public String getKeyForId(int paramInt)
  {
    return (String)idToKey.get(paramInt);
  }
  
  public Set<String> getKeys()
  {
    return keyToContent.keySet();
  }
  
  public CachedContent getOrAdd(String paramString)
  {
    CachedContent localCachedContent1 = (CachedContent)keyToContent.get(paramString);
    CachedContent localCachedContent2 = localCachedContent1;
    if (localCachedContent1 == null) {
      localCachedContent2 = addNew(paramString);
    }
    return localCachedContent2;
  }
  
  public void load()
  {
    Assertions.checkState(changed ^ true);
    if (!readFile())
    {
      atomicFile.delete();
      keyToContent.clear();
      idToKey.clear();
    }
  }
  
  public void maybeRemove(String paramString)
  {
    CachedContent localCachedContent = (CachedContent)keyToContent.get(paramString);
    if ((localCachedContent != null) && (localCachedContent.isEmpty()) && (!localCachedContent.isLocked()))
    {
      keyToContent.remove(paramString);
      idToKey.remove(id);
      changed = true;
    }
  }
  
  public void removeEmpty()
  {
    int i = keyToContent.size();
    String[] arrayOfString = new String[i];
    keyToContent.keySet().toArray(arrayOfString);
    for (int j = 0; j < i; j++) {
      maybeRemove(arrayOfString[j]);
    }
  }
  
  public void store()
    throws Cache.CacheException
  {
    if (!changed) {
      return;
    }
    writeFile();
    changed = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CachedContentIndex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */