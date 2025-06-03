package i9;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import b0.d;
import d9.p;
import e9.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k9.g;
import ma.a;
import ma.h;
import x6.b;

public final class w0
  implements a0
{
  public final y0 a;
  public final i b;
  public final f c;
  public final String d;
  public int e;
  public h f;
  
  public w0(y0 paramy0, i parami, e parame, f paramf)
  {
    a = paramy0;
    b = parami;
    paramy0 = a;
    int i;
    if (paramy0 != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      paramy0 = "";
    }
    d = paramy0;
    f = m9.q0.w;
    c = paramf;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	i9/w0:a	Li9/y0;
    //   4: ldc 48
    //   6: invokevirtual 54	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   9: astore_1
    //   10: aload_1
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: getfield 35	i9/w0:d	Ljava/lang/String;
    //   21: aastore
    //   22: invokevirtual 59	i9/y0$d:a	([Ljava/lang/Object;)V
    //   25: aload_1
    //   26: invokevirtual 62	i9/y0$d:e	()Landroid/database/Cursor;
    //   29: astore_2
    //   30: aload_2
    //   31: invokeinterface 68 1 0
    //   36: istore_3
    //   37: aload_2
    //   38: invokeinterface 71 1 0
    //   43: iload_3
    //   44: iconst_1
    //   45: ixor
    //   46: ifne +4 -> 50
    //   49: return
    //   50: new 73	java/util/ArrayList
    //   53: dup
    //   54: invokespecial 74	java/util/ArrayList:<init>	()V
    //   57: astore_1
    //   58: aload_0
    //   59: getfield 25	i9/w0:a	Li9/y0;
    //   62: ldc 76
    //   64: invokevirtual 54	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   67: astore_2
    //   68: aload_2
    //   69: iconst_1
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_0
    //   76: getfield 35	i9/w0:d	Ljava/lang/String;
    //   79: aastore
    //   80: invokevirtual 59	i9/y0$d:a	([Ljava/lang/Object;)V
    //   83: aload_2
    //   84: new 78	i9/o0
    //   87: dup
    //   88: iconst_1
    //   89: aload_1
    //   90: invokespecial 81	i9/o0:<init>	(ILjava/util/ArrayList;)V
    //   93: invokevirtual 84	i9/y0$d:d	(Ln9/d;)I
    //   96: pop
    //   97: ldc 86
    //   99: aload_1
    //   100: invokevirtual 89	java/util/ArrayList:isEmpty	()Z
    //   103: iconst_1
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload_1
    //   110: aastore
    //   111: invokestatic 95	x6/b:Z	(Ljava/lang/String;Z[Ljava/lang/Object;)V
    //   114: return
    //   115: astore_1
    //   116: aload_2
    //   117: ifnull +18 -> 135
    //   120: aload_2
    //   121: invokeinterface 71 1 0
    //   126: goto +9 -> 135
    //   129: astore_2
    //   130: aload_1
    //   131: aload_2
    //   132: invokevirtual 101	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   135: aload_1
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	w0
    //   9	101	1	localObject1	Object
    //   115	21	1	localObject2	Object
    //   29	92	2	localObject3	Object
    //   129	3	2	localThrowable	Throwable
    //   36	10	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   30	37	115	finally
    //   120	126	129	finally
  }
  
  public final void b(g paramg)
  {
    Object localObject1 = a.i.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
    SQLiteStatement localSQLiteStatement = a.i.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
    int i = a;
    Object localObject2 = a;
    String str1 = d;
    localObject2.getClass();
    boolean bool;
    if (y0.F((SQLiteStatement)localObject1, new Object[] { str1, Integer.valueOf(i) }) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Mutation batch (%s, %d) did not exist", bool, new Object[] { d, Integer.valueOf(a) });
    localObject1 = d.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = nexta;
      str1 = p2.m0.A(a);
      paramg = a;
      String str2 = d;
      paramg.getClass();
      y0.F(localSQLiteStatement, new Object[] { str2, str1, Integer.valueOf(i) });
      a.g.p((j9.i)localObject2);
    }
  }
  
  public final void c(h paramh)
  {
    paramh.getClass();
    f = paramh;
    m();
  }
  
  public final g d(u7.m paramm, ArrayList paramArrayList, List paramList)
  {
    int i = e;
    e = (i + 1);
    paramm = new g(i, paramm, paramArrayList, paramList);
    paramArrayList = b.f(paramm);
    a.G("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", new Object[] { d, Integer.valueOf(i), paramArrayList.j() });
    HashSet localHashSet = new HashSet();
    paramArrayList = a.i.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      j9.i locali = nexta;
      if (localHashSet.add(locali))
      {
        paramList = p2.m0.A(a);
        y0 localy0 = a;
        String str = d;
        localy0.getClass();
        y0.F(paramArrayList, new Object[] { str, paramList, Integer.valueOf(i) });
        c.j(locali.i());
      }
    }
    return paramm;
  }
  
  public final ArrayList e(Set paramSet)
  {
    Object localObject = new ArrayList();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      ((ArrayList)localObject).add(p2.m0.A(nexta));
    }
    localObject = new y0.b(a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(new Object[] { Integer.valueOf(1000000), d }), (ArrayList)localObject, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
    paramSet = new ArrayList();
    HashSet localHashSet = new HashSet();
    while (f.hasNext()) {
      ((y0.b)localObject).a().d(new k0(this, localHashSet, paramSet, 1));
    }
    if (e > 1) {
      Collections.sort(paramSet, new d(11));
    }
    return paramSet;
  }
  
  public final g f(int paramInt)
  {
    y0.d locald = a.H("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
    locald.a(new Object[] { Integer.valueOf(1000000), d, Integer.valueOf(paramInt + 1) });
    return (g)locald.c(new aa.m0(this, 4));
  }
  
  public final int g()
  {
    y0.d locald = a.H("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?");
    locald.a(new Object[] { Integer.valueOf(-1), d });
    return ((Integer)locald.c(new p(1))).intValue();
  }
  
  /* Error */
  public final g h(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	i9/w0:a	Li9/y0;
    //   4: ldc_w 291
    //   7: invokevirtual 54	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   10: astore_2
    //   11: aload_2
    //   12: iconst_3
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: ldc -22
    //   20: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: aload_0
    //   27: getfield 35	i9/w0:d	Ljava/lang/String;
    //   30: aastore
    //   31: dup
    //   32: iconst_2
    //   33: iload_1
    //   34: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: aastore
    //   38: invokevirtual 59	i9/y0$d:a	([Ljava/lang/Object;)V
    //   41: aload_2
    //   42: invokevirtual 62	i9/y0$d:e	()Landroid/database/Cursor;
    //   45: astore_3
    //   46: aload_3
    //   47: invokeinterface 68 1 0
    //   52: ifeq +19 -> 71
    //   55: aload_0
    //   56: aload_3
    //   57: iconst_0
    //   58: invokeinterface 295 2 0
    //   63: iload_1
    //   64: invokevirtual 299	i9/w0:l	([BI)Lk9/g;
    //   67: astore_2
    //   68: goto +5 -> 73
    //   71: aconst_null
    //   72: astore_2
    //   73: aload_3
    //   74: invokeinterface 71 1 0
    //   79: aload_2
    //   80: areturn
    //   81: astore_2
    //   82: aload_3
    //   83: ifnull +18 -> 101
    //   86: aload_3
    //   87: invokeinterface 71 1 0
    //   92: goto +9 -> 101
    //   95: astore_3
    //   96: aload_2
    //   97: aload_3
    //   98: invokevirtual 101	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   101: aload_2
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	w0
    //   0	103	1	paramInt	int
    //   10	70	2	localObject1	Object
    //   81	21	2	localObject2	Object
    //   45	42	3	localCursor	android.database.Cursor
    //   95	3	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   46	68	81	finally
    //   86	92	95	finally
  }
  
  public final h i()
  {
    return f;
  }
  
  public final void j(g paramg, h paramh)
  {
    paramh.getClass();
    f = paramh;
    m();
  }
  
  public final List<g> k()
  {
    ArrayList localArrayList = new ArrayList();
    y0.d locald = a.H("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
    locald.a(new Object[] { Integer.valueOf(1000000), d });
    locald.d(new q0(2, this, localArrayList));
    return localArrayList;
  }
  
  /* Error */
  public final g l(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: ldc -22
    //   4: if_icmpge +15 -> 19
    //   7: aload_0
    //   8: getfield 27	i9/w0:b	Li9/i;
    //   11: aload_1
    //   12: invokestatic 320	l9/e:S	([B)Ll9/e;
    //   15: invokevirtual 323	i9/i:c	(Ll9/e;)Lk9/g;
    //   18: areturn
    //   19: new 73	java/util/ArrayList
    //   22: astore_3
    //   23: aload_3
    //   24: invokespecial 74	java/util/ArrayList:<init>	()V
    //   27: getstatic 327	ma/h:b	Lma/h$h;
    //   30: astore 4
    //   32: aload_3
    //   33: aload_1
    //   34: iconst_0
    //   35: aload_1
    //   36: arraylength
    //   37: invokestatic 330	ma/h:m	([BII)Lma/h$h;
    //   40: invokevirtual 229	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: iconst_1
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +163 -> 212
    //   52: aload_3
    //   53: invokevirtual 333	java/util/ArrayList:size	()I
    //   56: istore 6
    //   58: aload_0
    //   59: getfield 25	i9/w0:a	Li9/y0;
    //   62: ldc_w 335
    //   65: invokevirtual 54	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   68: astore_1
    //   69: aload_1
    //   70: iconst_4
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: iload 6
    //   78: ldc -22
    //   80: imul
    //   81: iconst_1
    //   82: iadd
    //   83: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: aastore
    //   87: dup
    //   88: iconst_1
    //   89: ldc -22
    //   91: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   94: aastore
    //   95: dup
    //   96: iconst_2
    //   97: aload_0
    //   98: getfield 35	i9/w0:d	Ljava/lang/String;
    //   101: aastore
    //   102: dup
    //   103: iconst_3
    //   104: iload_2
    //   105: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: aastore
    //   109: invokevirtual 59	i9/y0$d:a	([Ljava/lang/Object;)V
    //   112: aload_1
    //   113: invokevirtual 62	i9/y0$d:e	()Landroid/database/Cursor;
    //   116: astore_1
    //   117: iload 5
    //   119: istore 6
    //   121: aload_1
    //   122: invokeinterface 68 1 0
    //   127: ifeq +50 -> 177
    //   130: aload_1
    //   131: iconst_0
    //   132: invokeinterface 295 2 0
    //   137: astore 7
    //   139: getstatic 327	ma/h:b	Lma/h$h;
    //   142: astore 4
    //   144: aload_3
    //   145: aload 7
    //   147: iconst_0
    //   148: aload 7
    //   150: arraylength
    //   151: invokestatic 330	ma/h:m	([BII)Lma/h$h;
    //   154: invokevirtual 229	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   157: pop
    //   158: aload 7
    //   160: arraylength
    //   161: istore 8
    //   163: iload 5
    //   165: istore 6
    //   167: iload 8
    //   169: ldc -22
    //   171: if_icmpge +6 -> 177
    //   174: iconst_0
    //   175: istore 6
    //   177: aload_1
    //   178: invokeinterface 71 1 0
    //   183: iload 6
    //   185: istore 5
    //   187: goto -140 -> 47
    //   190: astore_3
    //   191: aload_1
    //   192: ifnull +18 -> 210
    //   195: aload_1
    //   196: invokeinterface 71 1 0
    //   201: goto +9 -> 210
    //   204: astore_1
    //   205: aload_3
    //   206: aload_1
    //   207: invokevirtual 101	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   210: aload_3
    //   211: athrow
    //   212: aload_3
    //   213: invokeinterface 338 1 0
    //   218: istore_2
    //   219: iload_2
    //   220: ifne +10 -> 230
    //   223: getstatic 327	ma/h:b	Lma/h$h;
    //   226: astore_1
    //   227: goto +12 -> 239
    //   230: aload_3
    //   231: invokevirtual 339	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   234: iload_2
    //   235: invokestatic 342	ma/h:h	(Ljava/util/Iterator;I)Lma/h;
    //   238: astore_1
    //   239: aload_0
    //   240: getfield 27	i9/w0:b	Li9/i;
    //   243: aload_1
    //   244: invokestatic 346	l9/e:R	(Lma/h;)Ll9/e;
    //   247: invokevirtual 323	i9/i:c	(Ll9/e;)Lk9/g;
    //   250: astore_1
    //   251: aload_1
    //   252: areturn
    //   253: astore_1
    //   254: ldc_w 348
    //   257: iconst_1
    //   258: anewarray 4	java/lang/Object
    //   261: dup
    //   262: iconst_0
    //   263: aload_1
    //   264: aastore
    //   265: invokestatic 351	x6/b:T	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: aconst_null
    //   269: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	this	w0
    //   0	270	1	paramArrayOfByte	byte[]
    //   0	270	2	paramInt	int
    //   22	123	3	localArrayList	ArrayList
    //   190	41	3	localObject	Object
    //   30	113	4	localh	ma.h.h
    //   45	141	5	i	int
    //   56	128	6	j	int
    //   137	22	7	arrayOfByte	byte[]
    //   161	11	8	k	int
    // Exception table:
    //   from	to	target	type
    //   121	163	190	finally
    //   195	201	204	finally
    //   0	19	253	ma/b0
    //   19	44	253	ma/b0
    //   52	117	253	ma/b0
    //   177	183	253	ma/b0
    //   205	210	253	ma/b0
    //   210	212	253	ma/b0
    //   212	219	253	ma/b0
    //   223	227	253	ma/b0
    //   230	239	253	ma/b0
    //   239	251	253	ma/b0
  }
  
  public final void m()
  {
    a.G("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", new Object[] { d, Integer.valueOf(-1), f.z() });
  }
  
  public final void start()
  {
    Object localObject = new ArrayList();
    a.H("SELECT uid FROM mutation_queues").d(new m(localObject, 2));
    e = 0;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localObject = a.H("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
      ((y0.d)localObject).a(new Object[] { str });
      ((y0.d)localObject).d(new p0(this, 2));
    }
    e += 1;
    localObject = a.H("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
    ((y0.d)localObject).a(new Object[] { d });
    if (((y0.d)localObject).b(new l(this, 2)) == 0) {
      m();
    }
  }
}

/* Location:
 * Qualified Name:     i9.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */