package R3;

import V3.k;
import Y3.d.c;
import Y3.e;
import a4.i;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import d4.n;
import d4.o;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class j
  implements X3.f
{
  public static final Charset e = Charset.forName("UTF-8");
  public final SQLiteDatabase a;
  public final c4.c b;
  public boolean c;
  public long d = 0L;
  
  public j(Context paramContext, V3.f paramf, String paramString)
  {
    try
    {
      paramString = URLEncoder.encode(paramString, "utf-8");
      b = paramf.q("Persistence");
      a = C(paramContext, paramString);
      return;
    }
    catch (IOException paramContext)
    {
      throw new RuntimeException(paramContext);
    }
  }
  
  public static String E(String paramString)
  {
    Y3.m.g(paramString.endsWith("/"), "Path keys must end with a '/'");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString.substring(0, paramString.length() - 1));
    localStringBuilder.append('0');
    return localStringBuilder.toString();
  }
  
  public static String F(k paramk)
  {
    if (paramk.isEmpty()) {
      return "/";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramk.toString());
    localStringBuilder.append("/");
    return localStringBuilder.toString();
  }
  
  public static List M(byte[] paramArrayOfByte, int paramInt)
  {
    int i = (paramArrayOfByte.length - 1) / paramInt + 1;
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfByte.length;
      int m = j * paramInt;
      k = Math.min(paramInt, k - m);
      byte[] arrayOfByte = new byte[k];
      System.arraycopy(paramArrayOfByte, m, arrayOfByte, 0, k);
      localArrayList.add(arrayOfByte);
    }
    return localArrayList;
  }
  
  public static String w(k paramk, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = paramk.size();
    boolean bool = true;
    int k = 0;
    if (i < j + 1) {
      bool = false;
    }
    Y3.m.f(bool);
    StringBuilder localStringBuilder = new StringBuilder("(");
    for (;;)
    {
      bool = paramk.isEmpty();
      localStringBuilder.append("path");
      if (bool) {
        break;
      }
      localStringBuilder.append(" = ? OR ");
      paramArrayOfString[k] = F(paramk);
      paramk = paramk.a0();
      k++;
    }
    localStringBuilder.append(" = ?)");
    paramArrayOfString[k] = F(k.Y());
    return localStringBuilder.toString();
  }
  
  /* Error */
  public final n A(k paramk)
  {
    // Byte code:
    //   0: new 125	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 178	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: new 125	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 178	java/util/ArrayList:<init>	()V
    //   15: astore_3
    //   16: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   19: lstore 4
    //   21: aload_0
    //   22: aload_1
    //   23: iconst_2
    //   24: anewarray 78	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: ldc -94
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: ldc -72
    //   36: aastore
    //   37: invokevirtual 188	R3/j:B	(LV3/k;[Ljava/lang/String;)Landroid/database/Cursor;
    //   40: astore 6
    //   42: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   45: lload 4
    //   47: lsub
    //   48: lstore 7
    //   50: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   53: lstore 9
    //   55: aload 6
    //   57: invokeinterface 193 1 0
    //   62: ifeq +40 -> 102
    //   65: aload_2
    //   66: aload 6
    //   68: iconst_0
    //   69: invokeinterface 197 2 0
    //   74: invokeinterface 146 2 0
    //   79: pop
    //   80: aload_3
    //   81: aload 6
    //   83: iconst_1
    //   84: invokeinterface 201 2 0
    //   89: invokeinterface 146 2 0
    //   94: pop
    //   95: goto -40 -> 55
    //   98: astore_1
    //   99: goto +579 -> 678
    //   102: aload 6
    //   104: invokeinterface 204 1 0
    //   109: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   112: lload 9
    //   114: lsub
    //   115: lstore 9
    //   117: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   120: lstore 11
    //   122: invokestatic 210	d4/g:W	()Ld4/g;
    //   125: astore 6
    //   127: new 212	java/util/HashMap
    //   130: dup
    //   131: invokespecial 213	java/util/HashMap:<init>	()V
    //   134: astore 13
    //   136: iconst_0
    //   137: istore 14
    //   139: iload 14
    //   141: istore 15
    //   143: iload 14
    //   145: aload_3
    //   146: invokeinterface 214 1 0
    //   151: if_icmpge +341 -> 492
    //   154: aload_2
    //   155: iload 14
    //   157: invokeinterface 218 2 0
    //   162: checkcast 78	java/lang/String
    //   165: ldc -36
    //   167: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   170: ifeq +152 -> 322
    //   173: aload_2
    //   174: iload 14
    //   176: invokeinterface 218 2 0
    //   181: checkcast 78	java/lang/String
    //   184: astore 16
    //   186: new 116	V3/k
    //   189: dup
    //   190: aload 16
    //   192: iconst_0
    //   193: aload 16
    //   195: invokevirtual 97	java/lang/String:length	()I
    //   198: bipush 10
    //   200: isub
    //   201: invokevirtual 101	java/lang/String:substring	(II)Ljava/lang/String;
    //   204: invokespecial 221	V3/k:<init>	(Ljava/lang/String;)V
    //   207: astore 17
    //   209: aload_0
    //   210: aload 17
    //   212: aload_2
    //   213: iload 14
    //   215: invokevirtual 225	R3/j:N	(LV3/k;Ljava/util/List;I)I
    //   218: istore 18
    //   220: aload_0
    //   221: getfield 61	R3/j:b	Lc4/c;
    //   224: invokevirtual 229	c4/c:f	()Z
    //   227: ifeq +59 -> 286
    //   230: aload_0
    //   231: getfield 61	R3/j:b	Lc4/c;
    //   234: astore 16
    //   236: new 92	java/lang/StringBuilder
    //   239: dup
    //   240: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   243: astore 19
    //   245: aload 19
    //   247: ldc -25
    //   249: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload 19
    //   255: iload 18
    //   257: invokevirtual 234	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload 19
    //   263: ldc -20
    //   265: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload 16
    //   271: aload 19
    //   273: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   276: iconst_0
    //   277: anewarray 4	java/lang/Object
    //   280: invokevirtual 239	c4/c:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: goto +3 -> 286
    //   286: iload 18
    //   288: iload 14
    //   290: iadd
    //   291: istore 18
    //   293: aload_0
    //   294: aload_0
    //   295: aload_3
    //   296: iload 14
    //   298: iload 18
    //   300: invokeinterface 243 3 0
    //   305: invokevirtual 247	R3/j:z	(Ljava/util/List;)[B
    //   308: invokevirtual 251	R3/j:y	([B)Ld4/n;
    //   311: astore 16
    //   313: iload 18
    //   315: iconst_1
    //   316: isub
    //   317: istore 14
    //   319: goto +40 -> 359
    //   322: aload_0
    //   323: aload_3
    //   324: iload 14
    //   326: invokeinterface 218 2 0
    //   331: checkcast 253	[B
    //   334: invokevirtual 251	R3/j:y	([B)Ld4/n;
    //   337: astore 16
    //   339: new 116	V3/k
    //   342: dup
    //   343: aload_2
    //   344: iload 14
    //   346: invokeinterface 218 2 0
    //   351: checkcast 78	java/lang/String
    //   354: invokespecial 221	V3/k:<init>	(Ljava/lang/String;)V
    //   357: astore 17
    //   359: aload 17
    //   361: invokevirtual 257	V3/k:X	()Ld4/b;
    //   364: ifnull +29 -> 393
    //   367: aload 17
    //   369: invokevirtual 257	V3/k:X	()Ld4/b;
    //   372: invokevirtual 262	d4/b:s	()Z
    //   375: ifeq +18 -> 393
    //   378: aload 13
    //   380: aload 17
    //   382: aload 16
    //   384: invokeinterface 268 3 0
    //   389: pop
    //   390: goto +69 -> 459
    //   393: aload 17
    //   395: aload_1
    //   396: invokevirtual 271	V3/k:W	(LV3/k;)Z
    //   399: ifeq +31 -> 430
    //   402: iload 15
    //   404: iconst_1
    //   405: ixor
    //   406: ldc_w 273
    //   409: invokestatic 90	Y3/m:g	(ZLjava/lang/String;)V
    //   412: aload 16
    //   414: aload 17
    //   416: aload_1
    //   417: invokestatic 277	V3/k:b0	(LV3/k;LV3/k;)LV3/k;
    //   420: invokeinterface 281 2 0
    //   425: astore 6
    //   427: goto +32 -> 459
    //   430: aload_1
    //   431: aload 17
    //   433: invokevirtual 271	V3/k:W	(LV3/k;)Z
    //   436: ifeq +29 -> 465
    //   439: aload 6
    //   441: aload_1
    //   442: aload 17
    //   444: invokestatic 277	V3/k:b0	(LV3/k;LV3/k;)LV3/k;
    //   447: aload 16
    //   449: invokeinterface 284 3 0
    //   454: astore 6
    //   456: iconst_1
    //   457: istore 15
    //   459: iinc 14 1
    //   462: goto -319 -> 143
    //   465: new 286	java/lang/IllegalStateException
    //   468: dup
    //   469: ldc_w 288
    //   472: iconst_2
    //   473: anewarray 4	java/lang/Object
    //   476: dup
    //   477: iconst_0
    //   478: aload 17
    //   480: aastore
    //   481: dup
    //   482: iconst_1
    //   483: aload_1
    //   484: aastore
    //   485: invokestatic 292	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   488: invokespecial 293	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   491: athrow
    //   492: aload 13
    //   494: invokeinterface 297 1 0
    //   499: invokeinterface 303 1 0
    //   504: astore 16
    //   506: aload 16
    //   508: invokeinterface 308 1 0
    //   513: ifeq +51 -> 564
    //   516: aload 16
    //   518: invokeinterface 312 1 0
    //   523: checkcast 314	java/util/Map$Entry
    //   526: astore 17
    //   528: aload 6
    //   530: aload_1
    //   531: aload 17
    //   533: invokeinterface 317 1 0
    //   538: checkcast 116	V3/k
    //   541: invokestatic 277	V3/k:b0	(LV3/k;LV3/k;)LV3/k;
    //   544: aload 17
    //   546: invokeinterface 320 1 0
    //   551: checkcast 279	d4/n
    //   554: invokeinterface 284 3 0
    //   559: astore 6
    //   561: goto -55 -> 506
    //   564: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   567: lstore 20
    //   569: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   572: lstore 22
    //   574: aload_0
    //   575: getfield 61	R3/j:b	Lc4/c;
    //   578: invokevirtual 229	c4/c:f	()Z
    //   581: ifeq +94 -> 675
    //   584: aload_0
    //   585: getfield 61	R3/j:b	Lc4/c;
    //   588: getstatic 326	java/util/Locale:US	Ljava/util/Locale;
    //   591: ldc_w 328
    //   594: bipush 7
    //   596: anewarray 4	java/lang/Object
    //   599: dup
    //   600: iconst_0
    //   601: aload_3
    //   602: invokeinterface 214 1 0
    //   607: invokestatic 334	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   610: aastore
    //   611: dup
    //   612: iconst_1
    //   613: aload 6
    //   615: invokestatic 339	Y3/e:c	(Ld4/n;)I
    //   618: invokestatic 334	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   621: aastore
    //   622: dup
    //   623: iconst_2
    //   624: aload_1
    //   625: aastore
    //   626: dup
    //   627: iconst_3
    //   628: lload 22
    //   630: lload 4
    //   632: lsub
    //   633: invokestatic 344	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   636: aastore
    //   637: dup
    //   638: iconst_4
    //   639: lload 7
    //   641: invokestatic 344	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   644: aastore
    //   645: dup
    //   646: iconst_5
    //   647: lload 9
    //   649: invokestatic 344	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   652: aastore
    //   653: dup
    //   654: bipush 6
    //   656: lload 20
    //   658: lload 11
    //   660: lsub
    //   661: invokestatic 344	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   664: aastore
    //   665: invokestatic 347	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   668: iconst_0
    //   669: anewarray 4	java/lang/Object
    //   672: invokevirtual 239	c4/c:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   675: aload 6
    //   677: areturn
    //   678: aload 6
    //   680: invokeinterface 204 1 0
    //   685: aload_1
    //   686: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	687	0	this	j
    //   0	687	1	paramk	k
    //   7	337	2	localArrayList1	ArrayList
    //   15	587	3	localArrayList2	ArrayList
    //   19	612	4	l1	long
    //   40	639	6	localObject1	Object
    //   48	592	7	l2	long
    //   53	595	9	l3	long
    //   120	539	11	l4	long
    //   134	359	13	localHashMap	java.util.HashMap
    //   137	323	14	i	int
    //   141	317	15	j	int
    //   184	333	16	localObject2	Object
    //   207	338	17	localObject3	Object
    //   218	99	18	k	int
    //   243	29	19	localStringBuilder	StringBuilder
    //   567	90	20	l5	long
    //   572	57	22	l6	long
    // Exception table:
    //   from	to	target	type
    //   55	95	98	finally
  }
  
  public final Cursor B(k paramk, String[] paramArrayOfString)
  {
    String str1 = F(paramk);
    String str2 = E(str1);
    String[] arrayOfString = new String[paramk.size() + 3];
    String str3 = w(paramk, arrayOfString);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(str3);
    ((StringBuilder)localObject).append(" OR (path > ? AND path < ?)");
    localObject = ((StringBuilder)localObject).toString();
    arrayOfString[(paramk.size() + 1)] = str1;
    arrayOfString[(paramk.size() + 2)] = str2;
    return a.query("serverCache", paramArrayOfString, (String)localObject, arrayOfString, null, null, "path");
  }
  
  public final SQLiteDatabase C(Context paramContext, String paramString)
  {
    paramContext = new c(paramContext, paramString);
    try
    {
      paramContext = paramContext.getWritableDatabase();
      paramContext.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
      paramContext.beginTransaction();
      paramContext.endTransaction();
      return paramContext;
    }
    catch (SQLiteException paramContext)
    {
      if ((paramContext instanceof SQLiteDatabaseLockedException)) {
        throw new Q3.d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", paramContext);
      }
      throw paramContext;
    }
  }
  
  public final String D(k paramk, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(F(paramk));
    localStringBuilder.append(String.format(Locale.US, ".part-%04d", new Object[] { Integer.valueOf(paramInt) }));
    return localStringBuilder.toString();
  }
  
  public final void G(k paramk1, final k paramk2, Y3.d paramd1, final Y3.d paramd2, X3.g paramg, final List paramList)
  {
    if (paramd1.getValue() != null)
    {
      paramd1 = (Integer)paramg.b(Integer.valueOf(0), new a(paramd2));
      if (paramd1.intValue() > 0)
      {
        paramk1 = paramk1.T(paramk2);
        if (b.f()) {
          b.b(String.format(Locale.US, "Need to rewrite %d nodes below path %s", new Object[] { paramd1, paramk1 }), new Object[0]);
        }
        paramg.b(null, new b(paramd2, paramList, paramk2, A(paramk1)));
      }
    }
    else
    {
      paramd1 = paramd1.M().iterator();
      while (paramd1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramd1.next();
        d4.b localb = (d4.b)localEntry.getKey();
        X3.g localg = paramg.a((d4.b)localEntry.getKey());
        G(paramk1, paramk2.U(localb), (Y3.d)localEntry.getValue(), paramd2.D(localb), localg, paramList);
      }
    }
  }
  
  public final int H(String paramString, k paramk)
  {
    paramk = F(paramk);
    String str = E(paramk);
    return a.delete(paramString, "path >= ? AND path < ?", new String[] { paramk, str });
  }
  
  public final int I(k paramk, n paramn)
  {
    int i = 0;
    long l = e.b(paramn);
    if (((paramn instanceof d4.c)) && (l > 16384L))
    {
      if (b.f()) {
        b.b(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[] { paramk, Long.valueOf(l), Integer.valueOf(16384) }), new Object[0]);
      }
      Iterator localIterator = paramn.iterator();
      while (localIterator.hasNext())
      {
        d4.m localm = (d4.m)localIterator.next();
        i += I(paramk.U(localm.c()), localm.d());
      }
      int j = i;
      if (!paramn.t().isEmpty())
      {
        J(paramk.U(d4.b.o()), paramn.t());
        j = i + 1;
      }
      J(paramk, d4.g.W());
      return j + 1;
    }
    J(paramk, paramn);
    return 1;
  }
  
  public final void J(k paramk, n paramn)
  {
    Object localObject = L(paramn.L(true));
    if (localObject.length >= 262144)
    {
      paramn = M((byte[])localObject, 262144);
      boolean bool = b.f();
      int i = 0;
      int j = i;
      if (bool)
      {
        c4.c localc = b;
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Saving huge leaf node with ");
        ((StringBuilder)localObject).append(paramn.size());
        ((StringBuilder)localObject).append(" parts.");
        localc.b(((StringBuilder)localObject).toString(), new Object[0]);
      }
      for (j = i; j < paramn.size(); j++)
      {
        localObject = new ContentValues();
        ((ContentValues)localObject).put("path", D(paramk, j));
        ((ContentValues)localObject).put("value", (byte[])paramn.get(j));
        a.insertWithOnConflict("serverCache", null, (ContentValues)localObject, 5);
      }
    }
    paramn = new ContentValues();
    paramn.put("path", F(paramk));
    paramn.put("value", (byte[])localObject);
    a.insertWithOnConflict("serverCache", null, paramn, 5);
  }
  
  public final void K(k paramk, long paramLong, String paramString, byte[] paramArrayOfByte)
  {
    P();
    a.delete("writes", "id = ?", new String[] { String.valueOf(paramLong) });
    if (paramArrayOfByte.length >= 262144)
    {
      paramArrayOfByte = M(paramArrayOfByte, 262144);
      for (int i = 0; i < paramArrayOfByte.size(); i++)
      {
        localContentValues = new ContentValues();
        localContentValues.put("id", Long.valueOf(paramLong));
        localContentValues.put("path", F(paramk));
        localContentValues.put("type", paramString);
        localContentValues.put("part", Integer.valueOf(i));
        localContentValues.put("node", (byte[])paramArrayOfByte.get(i));
        a.insertWithOnConflict("writes", null, localContentValues, 5);
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("id", Long.valueOf(paramLong));
    localContentValues.put("path", F(paramk));
    localContentValues.put("type", paramString);
    localContentValues.put("part", null);
    localContentValues.put("node", paramArrayOfByte);
    a.insertWithOnConflict("writes", null, localContentValues, 5);
  }
  
  public final byte[] L(Object paramObject)
  {
    try
    {
      paramObject = f4.b.d(paramObject).getBytes(e);
      return (byte[])paramObject;
    }
    catch (IOException paramObject)
    {
      throw new RuntimeException("Could not serialize leaf node", (Throwable)paramObject);
    }
  }
  
  public final int N(k paramk, List paramList, int paramInt)
  {
    int i = paramInt + 1;
    String str = F(paramk);
    if (((String)paramList.get(paramInt)).startsWith(str))
    {
      while ((i < paramList.size()) && (((String)paramList.get(i)).equals(D(paramk, i - paramInt)))) {
        i++;
      }
      if (i < paramList.size())
      {
        paramk = (String)paramList.get(i);
        paramList = new StringBuilder();
        paramList.append(str);
        paramList.append(".part-");
        if (paramk.startsWith(paramList.toString())) {
          throw new IllegalStateException("Run did not finish with all parts");
        }
      }
      return i - paramInt;
    }
    throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
  }
  
  public final void O(k paramk, n paramn, boolean paramBoolean)
  {
    long l1 = System.currentTimeMillis();
    int i;
    int j;
    if (!paramBoolean)
    {
      i = H("serverCache", paramk);
      j = I(paramk, paramn);
    }
    else
    {
      paramn = paramn.iterator();
      j = 0;
      i = j;
      while (paramn.hasNext())
      {
        d4.m localm = (d4.m)paramn.next();
        i += H("serverCache", paramk.U(localm.c()));
        j += I(paramk.U(localm.c()), localm.d());
      }
    }
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[] { Integer.valueOf(j), Integer.valueOf(i), paramk.toString(), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public final void P()
  {
    Y3.m.g(c, "Transaction expected to already be in progress.");
  }
  
  public void a()
  {
    P();
    long l1 = System.currentTimeMillis();
    int i = a.delete("writes", null, null);
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Deleted %d (all) write(s) in %dms", new Object[] { Integer.valueOf(i), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public void b(long paramLong)
  {
    P();
    long l1 = System.currentTimeMillis();
    int i = a.delete("writes", "id = ?", new String[] { String.valueOf(paramLong) });
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", new Object[] { Integer.valueOf(i), Long.valueOf(paramLong), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public void c(k paramk, V3.b paramb, long paramLong)
  {
    P();
    long l = System.currentTimeMillis();
    K(paramk, paramLong, "m", L(paramb.U(true)));
    paramLong = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Persisted user merge in %dms", new Object[] { Long.valueOf(paramLong - l) }), new Object[0]);
    }
  }
  
  /* Error */
  public List d()
  {
    // Byte code:
    //   0: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   3: lstore_1
    //   4: aload_0
    //   5: getfield 67	R3/j:a	Landroid/database/sqlite/SQLiteDatabase;
    //   8: ldc_w 516
    //   11: iconst_5
    //   12: anewarray 78	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: ldc_w 523
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc -94
    //   25: aastore
    //   26: dup
    //   27: iconst_2
    //   28: ldc_w 528
    //   31: aastore
    //   32: dup
    //   33: iconst_3
    //   34: ldc_w 530
    //   37: aastore
    //   38: dup
    //   39: iconst_4
    //   40: ldc_w 535
    //   43: aastore
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: ldc_w 589
    //   51: invokevirtual 361	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore_3
    //   55: new 125	java/util/ArrayList
    //   58: dup
    //   59: invokespecial 178	java/util/ArrayList:<init>	()V
    //   62: astore 4
    //   64: aload_3
    //   65: invokeinterface 193 1 0
    //   70: ifeq +282 -> 352
    //   73: aload_3
    //   74: iconst_0
    //   75: invokeinterface 593 2 0
    //   80: lstore 5
    //   82: new 116	V3/k
    //   85: astore 7
    //   87: aload 7
    //   89: aload_3
    //   90: iconst_1
    //   91: invokeinterface 197 2 0
    //   96: invokespecial 221	V3/k:<init>	(Ljava/lang/String;)V
    //   99: aload_3
    //   100: iconst_2
    //   101: invokeinterface 197 2 0
    //   106: astore 8
    //   108: aload_3
    //   109: iconst_3
    //   110: invokeinterface 597 2 0
    //   115: ifeq +25 -> 140
    //   118: aload_3
    //   119: iconst_4
    //   120: invokeinterface 201 2 0
    //   125: astore 9
    //   127: goto +75 -> 202
    //   130: astore 9
    //   132: goto +309 -> 441
    //   135: astore 9
    //   137: goto +286 -> 423
    //   140: new 125	java/util/ArrayList
    //   143: astore 9
    //   145: aload 9
    //   147: invokespecial 178	java/util/ArrayList:<init>	()V
    //   150: aload 9
    //   152: aload_3
    //   153: iconst_4
    //   154: invokeinterface 201 2 0
    //   159: invokeinterface 146 2 0
    //   164: pop
    //   165: aload_3
    //   166: invokeinterface 193 1 0
    //   171: ifeq +16 -> 187
    //   174: aload_3
    //   175: iconst_0
    //   176: invokeinterface 593 2 0
    //   181: lload 5
    //   183: lcmp
    //   184: ifeq -34 -> 150
    //   187: aload_3
    //   188: invokeinterface 600 1 0
    //   193: pop
    //   194: aload_0
    //   195: aload 9
    //   197: invokevirtual 247	R3/j:z	(Ljava/util/List;)[B
    //   200: astore 9
    //   202: new 78	java/lang/String
    //   205: astore 10
    //   207: aload 10
    //   209: aload 9
    //   211: getstatic 34	R3/j:e	Ljava/nio/charset/Charset;
    //   214: invokespecial 603	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   217: aload 10
    //   219: invokestatic 606	f4/b:b	(Ljava/lang/String;)Ljava/lang/Object;
    //   222: astore 9
    //   224: ldc_w 607
    //   227: aload 8
    //   229: invokevirtual 553	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   232: ifeq +30 -> 262
    //   235: aload 9
    //   237: invokestatic 612	d4/o:a	(Ljava/lang/Object;)Ld4/n;
    //   240: astore 8
    //   242: new 614	V3/B
    //   245: astore 9
    //   247: aload 9
    //   249: lload 5
    //   251: aload 7
    //   253: aload 8
    //   255: iconst_1
    //   256: invokespecial 617	V3/B:<init>	(JLV3/k;Ld4/n;Z)V
    //   259: goto +35 -> 294
    //   262: ldc_w 577
    //   265: aload 8
    //   267: invokevirtual 553	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   270: ifeq +37 -> 307
    //   273: new 614	V3/B
    //   276: dup
    //   277: lload 5
    //   279: aload 7
    //   281: aload 9
    //   283: checkcast 264	java/util/Map
    //   286: invokestatic 620	V3/b:M	(Ljava/util/Map;)LV3/b;
    //   289: invokespecial 623	V3/B:<init>	(JLV3/k;LV3/b;)V
    //   292: astore 9
    //   294: aload 4
    //   296: aload 9
    //   298: invokeinterface 146 2 0
    //   303: pop
    //   304: goto -240 -> 64
    //   307: new 286	java/lang/IllegalStateException
    //   310: astore 9
    //   312: new 92	java/lang/StringBuilder
    //   315: astore 4
    //   317: aload 4
    //   319: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   322: aload 4
    //   324: ldc_w 625
    //   327: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload 4
    //   333: aload 8
    //   335: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload 9
    //   341: aload 4
    //   343: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: invokespecial 293	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   349: aload 9
    //   351: athrow
    //   352: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   355: lstore 5
    //   357: aload_0
    //   358: getfield 61	R3/j:b	Lc4/c;
    //   361: invokevirtual 229	c4/c:f	()Z
    //   364: ifeq +50 -> 414
    //   367: aload_0
    //   368: getfield 61	R3/j:b	Lc4/c;
    //   371: getstatic 326	java/util/Locale:US	Ljava/util/Locale;
    //   374: ldc_w 627
    //   377: iconst_2
    //   378: anewarray 4	java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: aload 4
    //   385: invokeinterface 214 1 0
    //   390: invokestatic 334	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   393: aastore
    //   394: dup
    //   395: iconst_1
    //   396: lload 5
    //   398: lload_1
    //   399: lsub
    //   400: invokestatic 344	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   403: aastore
    //   404: invokestatic 347	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   407: iconst_0
    //   408: anewarray 4	java/lang/Object
    //   411: invokevirtual 239	c4/c:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   414: aload_3
    //   415: invokeinterface 204 1 0
    //   420: aload 4
    //   422: areturn
    //   423: new 69	java/lang/RuntimeException
    //   426: astore 4
    //   428: aload 4
    //   430: ldc_w 629
    //   433: aload 9
    //   435: invokespecial 547	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   438: aload 4
    //   440: athrow
    //   441: aload_3
    //   442: invokeinterface 204 1 0
    //   447: aload 9
    //   449: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	450	0	this	j
    //   3	396	1	l1	long
    //   54	388	3	localCursor	Cursor
    //   62	377	4	localObject1	Object
    //   80	317	5	l2	long
    //   85	195	7	localk	k
    //   106	228	8	localObject2	Object
    //   125	1	9	arrayOfByte	byte[]
    //   130	1	9	localObject3	Object
    //   135	1	9	localIOException	IOException
    //   143	305	9	localObject4	Object
    //   205	13	10	str	String
    // Exception table:
    //   from	to	target	type
    //   64	127	130	finally
    //   140	150	130	finally
    //   150	187	130	finally
    //   187	202	130	finally
    //   202	259	130	finally
    //   262	294	130	finally
    //   294	304	130	finally
    //   307	352	130	finally
    //   352	414	130	finally
    //   423	441	130	finally
    //   64	127	135	java/io/IOException
    //   140	150	135	java/io/IOException
    //   150	187	135	java/io/IOException
    //   187	202	135	java/io/IOException
    //   202	259	135	java/io/IOException
    //   262	294	135	java/io/IOException
    //   294	304	135	java/io/IOException
    //   307	352	135	java/io/IOException
    //   352	414	135	java/io/IOException
  }
  
  public void e(k paramk, n paramn, long paramLong)
  {
    P();
    long l = System.currentTimeMillis();
    K(paramk, paramLong, "o", L(paramn.L(true)));
    paramLong = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Persisted user overwrite in %dms", new Object[] { Long.valueOf(paramLong - l) }), new Object[0]);
    }
  }
  
  public void f()
  {
    a.endTransaction();
    c = false;
    long l1 = System.currentTimeMillis();
    long l2 = d;
    if (b.f()) {
      b.b(String.format(Locale.US, "Transaction completed. Elapsed: %dms", new Object[] { Long.valueOf(l1 - l2) }), new Object[0]);
    }
  }
  
  public void g()
  {
    Y3.m.g(c ^ true, "runInTransaction called when an existing transaction is already in progress.");
    if (b.f()) {
      b.b("Starting transaction.", new Object[0]);
    }
    a.beginTransaction();
    c = true;
    d = System.currentTimeMillis();
  }
  
  public void h(long paramLong)
  {
    P();
    String str = String.valueOf(paramLong);
    a.delete("trackedQueries", "id = ?", new String[] { str });
    a.delete("trackedKeys", "id = ?", new String[] { str });
  }
  
  public Set i(long paramLong)
  {
    return v(Collections.singleton(Long.valueOf(paramLong)));
  }
  
  public void j(long paramLong)
  {
    P();
    long l = System.currentTimeMillis();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("active", Boolean.FALSE);
    localContentValues.put("lastUse", Long.valueOf(paramLong));
    a.updateWithOnConflict("trackedQueries", localContentValues, "active = 1", new String[0], 5);
    paramLong = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Reset active tracked queries in %dms", new Object[] { Long.valueOf(paramLong - l) }), new Object[0]);
    }
  }
  
  public void k(long paramLong, Set paramSet)
  {
    P();
    long l1 = System.currentTimeMillis();
    a.delete("trackedKeys", "id = ?", new String[] { String.valueOf(paramLong) });
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      d4.b localb = (d4.b)localIterator.next();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("id", Long.valueOf(paramLong));
      localContentValues.put("key", localb.e());
      a.insertWithOnConflict("trackedKeys", null, localContentValues, 5);
    }
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", new Object[] { Integer.valueOf(paramSet.size()), Long.valueOf(paramLong), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public long l()
  {
    Object localObject1 = String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[] { "value", "path", "serverCache" });
    localObject1 = a.rawQuery((String)localObject1, null);
    IllegalStateException localIllegalStateException;
    try
    {
      if (((Cursor)localObject1).moveToFirst())
      {
        long l = ((Cursor)localObject1).getLong(0);
        ((Cursor)localObject1).close();
        return l;
      }
    }
    finally
    {
      break label83;
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Couldn't read database result!");
      throw localIllegalStateException;
      label83:
      ((Cursor)localObject1).close();
    }
  }
  
  public void m(k paramk, X3.g paramg)
  {
    if (!paramg.e()) {
      return;
    }
    P();
    long l1 = System.currentTimeMillis();
    Cursor localCursor = B(paramk, new String[] { "rowid", "path" });
    Object localObject1 = new Y3.d(null);
    Object localObject2 = new Y3.d(null);
    Object localObject4;
    if (localCursor.moveToNext())
    {
      l2 = localCursor.getLong(0);
      Object localObject3 = new k(localCursor.getString(1));
      c4.c localc;
      if (!paramk.W((k)localObject3))
      {
        localc = b;
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("We are pruning at ");
        ((StringBuilder)localObject4).append(paramk);
        ((StringBuilder)localObject4).append(" but we have data stored higher up at ");
        ((StringBuilder)localObject4).append(localObject3);
      }
      for (localObject3 = ". Ignoring.";; localObject3 = " that isn't marked for pruning or keeping. Ignoring.")
      {
        ((StringBuilder)localObject4).append((String)localObject3);
        localc.i(((StringBuilder)localObject4).toString());
        break;
        localObject4 = k.b0(paramk, (k)localObject3);
        if (paramg.g((k)localObject4))
        {
          localObject1 = ((Y3.d)localObject1).W((k)localObject4, Long.valueOf(l2));
          break;
        }
        if (paramg.f((k)localObject4))
        {
          localObject2 = ((Y3.d)localObject2).W((k)localObject4, Long.valueOf(l2));
          break;
        }
        localc = b;
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("We are pruning at ");
        ((StringBuilder)localObject4).append(paramk);
        ((StringBuilder)localObject4).append(" and have data at ");
        ((StringBuilder)localObject4).append(localObject3);
      }
    }
    int i;
    int j;
    if (!((Y3.d)localObject1).isEmpty())
    {
      localObject4 = new ArrayList();
      G(paramk, k.Y(), (Y3.d)localObject1, (Y3.d)localObject2, paramg, (List)localObject4);
      paramg = ((Y3.d)localObject1).Z();
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("rowid IN (");
      ((StringBuilder)localObject1).append(x(paramg));
      ((StringBuilder)localObject1).append(")");
      localObject1 = ((StringBuilder)localObject1).toString();
      a.delete("serverCache", (String)localObject1, null);
      localObject2 = ((List)localObject4).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (Y3.g)((Iterator)localObject2).next();
        I(paramk.T((k)((Y3.g)localObject1).a()), (n)((Y3.g)localObject1).b());
      }
      i = paramg.size();
      j = ((List)localObject4).size();
    }
    else
    {
      i = 0;
      j = i;
    }
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public List n()
  {
    long l1 = System.currentTimeMillis();
    Cursor localCursor = a.query("trackedQueries", new String[] { "id", "path", "queryParams", "lastUse", "complete", "active" }, null, null, null, null, "id");
    ArrayList localArrayList = new ArrayList();
    RuntimeException localRuntimeException;
    try
    {
      if (localCursor.moveToNext())
      {
        l2 = localCursor.getLong(0);
        localObject2 = new V3/k;
        ((k)localObject2).<init>(localCursor.getString(1));
        localObject3 = localCursor.getString(2);
      }
    }
    finally
    {
      try
      {
        long l2;
        Object localObject3 = f4.b.a((String)localObject3);
        Object localObject2 = i.b((k)localObject2, (Map)localObject3);
        l3 = localCursor.getLong(3);
        boolean bool1;
        if (localCursor.getInt(4) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        boolean bool2;
        if (localCursor.getInt(5) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        localObject3 = new X3/h;
        ((X3.h)localObject3).<init>(l2, (i)localObject2, l3, bool1, bool2);
        localArrayList.add(localObject3);
      }
      catch (IOException localIOException)
      {
        localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>(localIOException);
        throw localRuntimeException;
      }
      localObject1 = finally;
      break label304;
      long l3 = System.currentTimeMillis();
      if (b.f()) {
        b.b(String.format(Locale.US, "Loaded %d tracked queries in %dms", new Object[] { Integer.valueOf(localRuntimeException.size()), Long.valueOf(l3 - l1) }), new Object[0]);
      }
      localCursor.close();
      return localRuntimeException;
      label304:
      localCursor.close();
    }
  }
  
  public void o(k paramk, V3.b paramb)
  {
    P();
    long l1 = System.currentTimeMillis();
    Iterator localIterator = paramb.iterator();
    int i = 0;
    int j = i;
    while (localIterator.hasNext())
    {
      paramb = (Map.Entry)localIterator.next();
      i += H("serverCache", paramk.T((k)paramb.getKey()));
      j += I(paramk.T((k)paramb.getKey()), (n)paramb.getValue());
    }
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[] { Integer.valueOf(j), Integer.valueOf(i), paramk.toString(), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public void p()
  {
    a.setTransactionSuccessful();
  }
  
  public n q(k paramk)
  {
    return A(paramk);
  }
  
  public void r(long paramLong, Set paramSet1, Set paramSet2)
  {
    P();
    long l1 = System.currentTimeMillis();
    Object localObject = paramSet2.iterator();
    d4.b localb;
    while (((Iterator)localObject).hasNext())
    {
      localb = (d4.b)((Iterator)localObject).next();
      a.delete("trackedKeys", "id = ? AND key = ?", new String[] { String.valueOf(paramLong), localb.e() });
    }
    Iterator localIterator = paramSet1.iterator();
    while (localIterator.hasNext())
    {
      localb = (d4.b)localIterator.next();
      localObject = new ContentValues();
      ((ContentValues)localObject).put("id", Long.valueOf(paramLong));
      ((ContentValues)localObject).put("key", localb.e());
      a.insertWithOnConflict("trackedKeys", null, (ContentValues)localObject, 5);
    }
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[] { Integer.valueOf(paramSet1.size()), Integer.valueOf(paramSet2.size()), Long.valueOf(paramLong), Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  public void s(k paramk, n paramn)
  {
    P();
    O(paramk, paramn, true);
  }
  
  public void t(k paramk, n paramn)
  {
    P();
    O(paramk, paramn, false);
  }
  
  public void u(X3.h paramh)
  {
    P();
    long l1 = System.currentTimeMillis();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("id", Long.valueOf(a));
    localContentValues.put("path", F(b.e()));
    localContentValues.put("queryParams", b.d().y());
    localContentValues.put("lastUse", Long.valueOf(c));
    localContentValues.put("complete", Boolean.valueOf(d));
    localContentValues.put("active", Boolean.valueOf(e));
    a.insertWithOnConflict("trackedQueries", null, localContentValues, 5);
    long l2 = System.currentTimeMillis();
    if (b.f()) {
      b.b(String.format(Locale.US, "Saved new tracked query in %dms", new Object[] { Long.valueOf(l2 - l1) }), new Object[0]);
    }
  }
  
  /* Error */
  public Set v(Set paramSet)
  {
    // Byte code:
    //   0: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   3: lstore_2
    //   4: new 92	java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   11: astore 4
    //   13: aload 4
    //   15: ldc_w 817
    //   18: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload 4
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual 734	R3/j:x	(Ljava/util/Collection;)Ljava/lang/String;
    //   29: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload 4
    //   35: ldc_w 736
    //   38: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload 4
    //   44: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore 4
    //   49: aload_0
    //   50: getfield 67	R3/j:a	Landroid/database/sqlite/SQLiteDatabase;
    //   53: iconst_1
    //   54: ldc_w 643
    //   57: iconst_1
    //   58: anewarray 78	java/lang/String
    //   61: dup
    //   62: iconst_0
    //   63: ldc_w 681
    //   66: aastore
    //   67: aload 4
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: aconst_null
    //   74: invokevirtual 820	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   77: astore 4
    //   79: new 822	java/util/HashSet
    //   82: dup
    //   83: invokespecial 823	java/util/HashSet:<init>	()V
    //   86: astore 5
    //   88: aload 4
    //   90: invokeinterface 193 1 0
    //   95: ifeq +29 -> 124
    //   98: aload 5
    //   100: aload 4
    //   102: iconst_0
    //   103: invokeinterface 197 2 0
    //   108: invokestatic 826	d4/b:j	(Ljava/lang/String;)Ld4/b;
    //   111: invokeinterface 827 2 0
    //   116: pop
    //   117: goto -29 -> 88
    //   120: astore_1
    //   121: goto +82 -> 203
    //   124: invokestatic 182	java/lang/System:currentTimeMillis	()J
    //   127: lstore 6
    //   129: aload_0
    //   130: getfield 61	R3/j:b	Lc4/c;
    //   133: invokevirtual 229	c4/c:f	()Z
    //   136: ifeq +57 -> 193
    //   139: aload_0
    //   140: getfield 61	R3/j:b	Lc4/c;
    //   143: getstatic 326	java/util/Locale:US	Ljava/util/Locale;
    //   146: ldc_w 829
    //   149: iconst_3
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload 5
    //   157: invokeinterface 686 1 0
    //   162: invokestatic 334	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: aastore
    //   166: dup
    //   167: iconst_1
    //   168: aload_1
    //   169: invokevirtual 830	java/lang/Object:toString	()Ljava/lang/String;
    //   172: aastore
    //   173: dup
    //   174: iconst_2
    //   175: lload 6
    //   177: lload_2
    //   178: lsub
    //   179: invokestatic 344	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   182: aastore
    //   183: invokestatic 347	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   186: iconst_0
    //   187: anewarray 4	java/lang/Object
    //   190: invokevirtual 239	c4/c:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: aload 4
    //   195: invokeinterface 204 1 0
    //   200: aload 5
    //   202: areturn
    //   203: aload 4
    //   205: invokeinterface 204 1 0
    //   210: aload_1
    //   211: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	j
    //   0	212	1	paramSet	Set
    //   3	175	2	l1	long
    //   11	193	4	localObject	Object
    //   86	115	5	localHashSet	java.util.HashSet
    //   127	49	6	l2	long
    // Exception table:
    //   from	to	target	type
    //   88	117	120	finally
    //   124	193	120	finally
  }
  
  public final String x(Collection paramCollection)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramCollection = paramCollection.iterator();
    for (int i = 1; paramCollection.hasNext(); i = 0)
    {
      long l = ((Long)paramCollection.next()).longValue();
      if (i == 0) {
        localStringBuilder.append(",");
      }
      localStringBuilder.append(l);
    }
    return localStringBuilder.toString();
  }
  
  public final n y(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = new java/lang/String;
      ((String)localObject).<init>(paramArrayOfByte, e);
      localObject = o.a(f4.b.b((String)localObject));
      return (n)localObject;
    }
    catch (IOException localIOException)
    {
      String str = new String(paramArrayOfByte, e);
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("Could not deserialize node: ");
      paramArrayOfByte.append(str);
      throw new RuntimeException(paramArrayOfByte.toString(), localIOException);
    }
  }
  
  public final byte[] z(List paramList)
  {
    Object localObject = paramList.iterator();
    int i = 0;
    while (((Iterator)localObject).hasNext()) {
      i += ((byte[])((Iterator)localObject).next()).length;
    }
    localObject = new byte[i];
    Iterator localIterator = paramList.iterator();
    i = 0;
    while (localIterator.hasNext())
    {
      paramList = (byte[])localIterator.next();
      System.arraycopy(paramList, 0, localObject, i, paramList.length);
      i += paramList.length;
    }
    return (byte[])localObject;
  }
  
  public class a
    implements d.c
  {
    public a(Y3.d paramd) {}
    
    public Integer b(k paramk, Void paramVoid, Integer paramInteger)
    {
      int i;
      if (paramd2.s(paramk) == null) {
        i = paramInteger.intValue() + 1;
      } else {
        i = paramInteger.intValue();
      }
      return Integer.valueOf(i);
    }
  }
  
  public class b
    implements d.c
  {
    public b(Y3.d paramd, List paramList, k paramk, n paramn) {}
    
    public Void b(k paramk, Void paramVoid1, Void paramVoid2)
    {
      if (paramd2.s(paramk) == null) {
        paramList.add(new Y3.g(paramk2.T(paramk), d.A(paramk)));
      }
      return null;
    }
  }
  
  public static class c
    extends SQLiteOpenHelper
  {
    public c(Context paramContext, String paramString)
    {
      super(paramString, null, 2);
    }
    
    public final void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("DROP TABLE IF EXISTS ");
      localStringBuilder.append(paramString);
      paramSQLiteDatabase.execSQL(localStringBuilder.toString());
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
      paramSQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
      paramSQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
      paramSQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      boolean bool;
      if (paramInt2 == 2) {
        bool = true;
      } else {
        bool = false;
      }
      Y3.m.g(bool, "Why is onUpgrade() called with a different version?");
      if (paramInt1 <= 1)
      {
        a(paramSQLiteDatabase, "serverCache");
        paramSQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
        a(paramSQLiteDatabase, "complete");
        paramSQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        paramSQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
        return;
      }
      paramSQLiteDatabase = new StringBuilder();
      paramSQLiteDatabase.append("We don't handle upgrading to ");
      paramSQLiteDatabase.append(paramInt2);
      throw new AssertionError(paramSQLiteDatabase.toString());
    }
  }
}

/* Location:
 * Qualified Name:     R3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */