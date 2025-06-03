package i9;

import android.database.Cursor;
import g9.f0;
import j9.e;
import j9.h;
import j9.k.a;
import j9.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import n9.n;
import p2.m0;
import x6.b;

public final class b1
  implements g0
{
  public final y0 a;
  public final i b;
  public f c;
  
  public b1(y0 paramy0, i parami)
  {
    a = paramy0;
    b = parami;
  }
  
  public final HashMap a(Iterable paramIterable)
  {
    HashMap localHashMap = new HashMap();
    Object localObject = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      j9.i locali = (j9.i)paramIterable.next();
      ((ArrayList)localObject).add(m0.A(a));
      localHashMap.put(locali, j9.m.m(locali));
    }
    localObject = new y0.b(a, (ArrayList)localObject);
    paramIterable = new n9.c();
    while (f.hasNext()) {
      ((y0.b)localObject).a().d(new k0(this, paramIterable, localHashMap, 2));
    }
    paramIterable.a();
    return localHashMap;
  }
  
  public final void b(ArrayList paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    Object localObject1 = new ArrayList();
    Object localObject2 = h.a;
    Object localObject3 = paramArrayList.iterator();
    for (paramArrayList = (ArrayList)localObject2; ((Iterator)localObject3).hasNext(); paramArrayList = paramArrayList.n(localObject2, j9.m.n((j9.i)localObject2, q.b)))
    {
      localObject2 = (j9.i)((Iterator)localObject3).next();
      ((ArrayList)localObject1).add(m0.A(a));
    }
    localObject3 = a;
    localObject2 = Collections.emptyList();
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject4 = new ArrayList((Collection)localObject2);
      for (int i = 0; (((Iterator)localObject1).hasNext()) && (i < 900 - ((List)localObject2).size()); i++) {
        ((ArrayList)localObject4).add(((Iterator)localObject1).next());
      }
      Object[] arrayOfObject = ((ArrayList)localObject4).toArray();
      localObject4 = f.l("DELETE FROM remote_documents WHERE path IN (");
      ((StringBuilder)localObject4).append(n9.o.h("?", arrayOfObject.length, ", "));
      ((StringBuilder)localObject4).append(")");
      ((y0)localObject3).G(((StringBuilder)localObject4).toString(), arrayOfObject);
    }
    c.h(paramArrayList);
  }
  
  public final Map<j9.i, j9.m> c(String paramString, k.a parama, int paramInt)
  {
    Object localObject1 = c.f(paramString);
    Object localObject2 = new ArrayList(((List)localObject1).size());
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((ArrayList)localObject2).add((j9.o)((j9.o)((Iterator)localObject1).next()).g(paramString));
    }
    if (((ArrayList)localObject2).isEmpty()) {
      return Collections.emptyMap();
    }
    if (((ArrayList)localObject2).size() * 9 < 900) {
      return h((List)localObject2, parama, paramInt, null, null);
    }
    paramString = new HashMap();
    int i = 0;
    int m;
    for (int j = 0; j < ((ArrayList)localObject2).size(); j = m)
    {
      int k = ((ArrayList)localObject2).size();
      m = j + 100;
      paramString.putAll(h(((ArrayList)localObject2).subList(j, Math.min(k, m)), parama, paramInt, null, null));
    }
    parama = k.a.b;
    localObject2 = n9.o.a;
    if (paramString.size() > paramInt)
    {
      localObject2 = new ArrayList(paramString.entrySet());
      Collections.sort((List)localObject2, new n(parama));
      parama = new HashMap();
      for (j = i;; j++)
      {
        paramString = parama;
        if (j >= paramInt) {
          break;
        }
        parama.put(((Map.Entry)((ArrayList)localObject2).get(j)).getKey(), ((Map.Entry)((ArrayList)localObject2).get(j)).getValue());
      }
    }
    return paramString;
  }
  
  public final void d(j9.m paramm, q paramq)
  {
    b.Z("Cannot add document to the RemoteDocumentCache with a read time of zero", paramq.equals(q.b) ^ true, new Object[0]);
    j9.i locali = b;
    u7.m localm = a;
    paramq = b.e(paramm);
    a.G("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", new Object[] { m0.A(a), Integer.valueOf(a.q()), Long.valueOf(a), Integer.valueOf(b), paramq.j() });
    c.j(b.i());
  }
  
  public final void e(f paramf)
  {
    c = paramf;
  }
  
  public final HashMap f(f0 paramf0, k.a parama, Set paramSet, a.a parama1)
  {
    return h(Collections.singletonList(f), parama, Integer.MAX_VALUE, new z0(paramf0, paramSet), parama1);
  }
  
  public final j9.m g(j9.i parami)
  {
    return (j9.m)a(Collections.singletonList(parami)).get(parami);
  }
  
  /* Error */
  public final HashMap h(List paramList, k.a parama, int paramInt, z0 paramz0, a.a parama1)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 344	j9/k$a:l	()Lj9/q;
    //   4: getfield 277	j9/q:a	Lu7/m;
    //   7: astore 6
    //   9: aload_2
    //   10: invokevirtual 347	j9/k$a:h	()Lj9/i;
    //   13: astore 7
    //   15: ldc_w 349
    //   18: aload_1
    //   19: invokeinterface 137 1 0
    //   24: ldc_w 351
    //   27: invokestatic 158	n9/o:h	(Ljava/lang/CharSequence;ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   30: astore 8
    //   32: aload 8
    //   34: ldc_w 353
    //   37: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload_1
    //   42: invokeinterface 137 1 0
    //   47: bipush 9
    //   49: imul
    //   50: iconst_1
    //   51: iadd
    //   52: anewarray 4	java/lang/Object
    //   55: astore_2
    //   56: aload_1
    //   57: invokeinterface 193 1 0
    //   62: astore_1
    //   63: iconst_0
    //   64: istore 9
    //   66: aload_1
    //   67: invokeinterface 41 1 0
    //   72: ifeq +247 -> 319
    //   75: aload_1
    //   76: invokeinterface 45 1 0
    //   81: checkcast 195	j9/o
    //   84: astore 10
    //   86: aload 10
    //   88: invokestatic 56	p2/m0:A	(Lj9/e;)Ljava/lang/String;
    //   91: astore 11
    //   93: iload 9
    //   95: iconst_1
    //   96: iadd
    //   97: istore 12
    //   99: aload_2
    //   100: iload 9
    //   102: aload 11
    //   104: aastore
    //   105: iload 12
    //   107: iconst_1
    //   108: iadd
    //   109: istore 9
    //   111: new 160	java/lang/StringBuilder
    //   114: dup
    //   115: aload 11
    //   117: invokespecial 356	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: astore 11
    //   122: aload 11
    //   124: invokevirtual 359	java/lang/StringBuilder:length	()I
    //   127: iconst_1
    //   128: isub
    //   129: istore 13
    //   131: aload 11
    //   133: iload 13
    //   135: invokevirtual 363	java/lang/StringBuilder:charAt	(I)C
    //   138: istore 14
    //   140: iload 14
    //   142: iconst_1
    //   143: if_icmpne +9 -> 152
    //   146: iconst_1
    //   147: istore 15
    //   149: goto +6 -> 155
    //   152: iconst_0
    //   153: istore 15
    //   155: ldc_w 365
    //   158: iload 15
    //   160: iconst_0
    //   161: anewarray 4	java/lang/Object
    //   164: invokestatic 271	x6/b:Z	(Ljava/lang/String;Z[Ljava/lang/Object;)V
    //   167: aload 11
    //   169: iload 13
    //   171: iload 14
    //   173: iconst_1
    //   174: iadd
    //   175: i2c
    //   176: invokevirtual 369	java/lang/StringBuilder:setCharAt	(IC)V
    //   179: aload_2
    //   180: iload 12
    //   182: aload 11
    //   184: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: aastore
    //   188: iload 9
    //   190: iconst_1
    //   191: iadd
    //   192: istore 12
    //   194: aload_2
    //   195: iload 9
    //   197: aload 10
    //   199: invokevirtual 288	j9/e:q	()I
    //   202: iconst_1
    //   203: iadd
    //   204: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   207: aastore
    //   208: iload 12
    //   210: iconst_1
    //   211: iadd
    //   212: istore 9
    //   214: aload_2
    //   215: iload 12
    //   217: aload 6
    //   219: getfield 299	u7/m:a	J
    //   222: invokestatic 304	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   225: aastore
    //   226: iload 9
    //   228: iconst_1
    //   229: iadd
    //   230: istore 12
    //   232: aload_2
    //   233: iload 9
    //   235: aload 6
    //   237: getfield 299	u7/m:a	J
    //   240: invokestatic 304	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   243: aastore
    //   244: iload 12
    //   246: iconst_1
    //   247: iadd
    //   248: istore 9
    //   250: aload_2
    //   251: iload 12
    //   253: aload 6
    //   255: getfield 307	u7/m:b	I
    //   258: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   261: aastore
    //   262: iload 9
    //   264: iconst_1
    //   265: iadd
    //   266: istore 14
    //   268: aload_2
    //   269: iload 9
    //   271: aload 6
    //   273: getfield 299	u7/m:a	J
    //   276: invokestatic 304	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   279: aastore
    //   280: iload 14
    //   282: iconst_1
    //   283: iadd
    //   284: istore 12
    //   286: aload_2
    //   287: iload 14
    //   289: aload 6
    //   291: getfield 307	u7/m:b	I
    //   294: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   297: aastore
    //   298: iload 12
    //   300: iconst_1
    //   301: iadd
    //   302: istore 9
    //   304: aload_2
    //   305: iload 12
    //   307: aload 7
    //   309: getfield 50	j9/i:a	Lj9/o;
    //   312: invokestatic 56	p2/m0:A	(Lj9/e;)Ljava/lang/String;
    //   315: aastore
    //   316: goto -250 -> 66
    //   319: aload_2
    //   320: iload 9
    //   322: iload_3
    //   323: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   326: aastore
    //   327: new 77	n9/c
    //   330: dup
    //   331: invokespecial 78	n9/c:<init>	()V
    //   334: astore_1
    //   335: new 25	java/util/HashMap
    //   338: dup
    //   339: invokespecial 26	java/util/HashMap:<init>	()V
    //   342: astore 6
    //   344: aload_0
    //   345: getfield 19	i9/b1:a	Li9/y0;
    //   348: aload 8
    //   350: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokevirtual 373	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   356: astore 8
    //   358: aload 8
    //   360: aload_2
    //   361: invokevirtual 376	i9/y0$d:a	([Ljava/lang/Object;)V
    //   364: aload 8
    //   366: invokevirtual 379	i9/y0$d:e	()Landroid/database/Cursor;
    //   369: astore_2
    //   370: aload_2
    //   371: invokeinterface 384 1 0
    //   376: ifeq +33 -> 409
    //   379: aload_0
    //   380: aload_1
    //   381: aload 6
    //   383: aload_2
    //   384: aload 4
    //   386: invokevirtual 387	i9/b1:i	(Ln9/c;Ljava/util/Map;Landroid/database/Cursor;Ln9/i;)V
    //   389: aload 5
    //   391: ifnull -21 -> 370
    //   394: aload 5
    //   396: aload 5
    //   398: getfield 391	a/a:a	I
    //   401: iconst_1
    //   402: iadd
    //   403: putfield 391	a/a:a	I
    //   406: goto -36 -> 370
    //   409: aload_2
    //   410: invokeinterface 394 1 0
    //   415: aload_1
    //   416: invokevirtual 98	n9/c:a	()V
    //   419: aload 6
    //   421: areturn
    //   422: astore_1
    //   423: aload_2
    //   424: ifnull +18 -> 442
    //   427: aload_2
    //   428: invokeinterface 394 1 0
    //   433: goto +9 -> 442
    //   436: astore_2
    //   437: aload_1
    //   438: aload_2
    //   439: invokevirtual 400	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   442: aload_1
    //   443: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	444	0	this	b1
    //   0	444	1	paramList	List
    //   0	444	2	parama	k.a
    //   0	444	3	paramInt	int
    //   0	444	4	paramz0	z0
    //   0	444	5	parama1	a.a
    //   7	413	6	localObject1	Object
    //   13	295	7	locali	j9.i
    //   30	335	8	localObject2	Object
    //   64	257	9	i	int
    //   84	114	10	localo	j9.o
    //   91	92	11	localObject3	Object
    //   97	209	12	j	int
    //   129	41	13	k	int
    //   138	150	14	m	int
    //   147	12	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   370	389	422	finally
    //   394	406	422	finally
    //   427	433	436	finally
  }
  
  public final void i(n9.c paramc, Map<j9.i, j9.m> paramMap, Cursor paramCursor, n9.i<j9.m, Boolean> parami)
  {
    byte[] arrayOfByte = paramCursor.getBlob(0);
    int i = paramCursor.getInt(1);
    int j = paramCursor.getInt(2);
    if (paramCursor.isLast()) {
      paramc = n9.f.b;
    }
    paramc.execute(new a1(this, arrayOfByte, i, j, parami, paramMap));
  }
}

/* Location:
 * Qualified Name:     i9.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */