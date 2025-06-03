package i9;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import g9.k0;
import j9.q;
import l9.c;
import ma.a;
import ma.b0;
import ma.h;
import p2.m0;
import t8.e;
import t8.e.a;
import u7.m;
import x6.b;

public final class j1
  implements l1
{
  public final y0 a;
  public final i b;
  public int c;
  public long d;
  public q e = q.b;
  public long f;
  
  public j1(y0 paramy0, i parami)
  {
    a = paramy0;
    b = parami;
  }
  
  /* Error */
  public final m1 a(k0 paramk0)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 41	g9/k0:b	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 32	i9/j1:a	Li9/y0;
    //   9: ldc 43
    //   11: invokevirtual 49	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   14: astore_3
    //   15: aload_3
    //   16: iconst_1
    //   17: anewarray 4	java/lang/Object
    //   20: dup
    //   21: iconst_0
    //   22: aload_2
    //   23: aastore
    //   24: invokevirtual 54	i9/y0$d:a	([Ljava/lang/Object;)V
    //   27: aload_3
    //   28: invokevirtual 57	i9/y0$d:e	()Landroid/database/Cursor;
    //   31: astore 4
    //   33: aconst_null
    //   34: astore_3
    //   35: aload 4
    //   37: invokeinterface 63 1 0
    //   42: ifeq +36 -> 78
    //   45: aload_0
    //   46: aload 4
    //   48: iconst_0
    //   49: invokeinterface 67 2 0
    //   54: invokevirtual 71	i9/j1:k	([B)Li9/m1;
    //   57: astore_2
    //   58: aload_1
    //   59: aload_2
    //   60: getfield 76	i9/m1:a	Lg9/k0;
    //   63: invokevirtual 80	g9/k0:equals	(Ljava/lang/Object;)Z
    //   66: istore 5
    //   68: iload 5
    //   70: ifeq -35 -> 35
    //   73: aload_2
    //   74: astore_3
    //   75: goto -40 -> 35
    //   78: aload 4
    //   80: invokeinterface 83 1 0
    //   85: aload_3
    //   86: areturn
    //   87: astore_1
    //   88: aload 4
    //   90: ifnull +19 -> 109
    //   93: aload 4
    //   95: invokeinterface 83 1 0
    //   100: goto +9 -> 109
    //   103: astore_3
    //   104: aload_1
    //   105: aload_3
    //   106: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	j1
    //   0	111	1	paramk0	k0
    //   4	70	2	localObject1	Object
    //   14	72	3	localObject2	Object
    //   103	3	3	localThrowable	Throwable
    //   31	63	4	localCursor	android.database.Cursor
    //   66	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   35	68	87	finally
    //   93	100	103	finally
  }
  
  public final void b(e<j9.i> parame, int paramInt)
  {
    SQLiteStatement localSQLiteStatement = a.i.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
    v0 localv0 = a.g;
    parame = parame.iterator();
    for (;;)
    {
      Object localObject = (e.a)parame;
      if (!((e.a)localObject).hasNext()) {
        break;
      }
      localObject = (j9.i)((e.a)localObject).next();
      String str = m0.A(a);
      a.getClass();
      y0.F(localSQLiteStatement, new Object[] { Integer.valueOf(paramInt), str });
      localv0.p((j9.i)localObject);
    }
  }
  
  public final void c(m1 paramm1)
  {
    l(paramm1);
    int i = b;
    if (i > c) {
      c = i;
    }
    long l = c;
    if (l > d) {
      d = l;
    }
    f += 1L;
    m();
  }
  
  public final int d()
  {
    return c;
  }
  
  public final void e(e<j9.i> parame, int paramInt)
  {
    SQLiteStatement localSQLiteStatement = a.i.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
    v0 localv0 = a.g;
    parame = parame.iterator();
    for (;;)
    {
      Object localObject = (e.a)parame;
      if (!((e.a)localObject).hasNext()) {
        break;
      }
      j9.i locali = (j9.i)((e.a)localObject).next();
      localObject = m0.A(a);
      a.getClass();
      y0.F(localSQLiteStatement, new Object[] { Integer.valueOf(paramInt), localObject });
      localv0.p(locali);
    }
  }
  
  public final e<j9.i> f(int paramInt)
  {
    a locala = new a();
    y0.d locald = a.H("SELECT path FROM target_documents WHERE target_id = ?");
    locald.a(new Object[] { Integer.valueOf(paramInt) });
    locald.d(new l(locala, 3));
    return a;
  }
  
  public final q g()
  {
    return e;
  }
  
  public final void h(m1 paramm1)
  {
    l(paramm1);
    int i = b;
    int j = c;
    int k = 1;
    if (i > j)
    {
      c = i;
      j = 1;
    }
    else
    {
      j = 0;
    }
    long l = c;
    if (l > d)
    {
      d = l;
      j = k;
    }
    if (j != 0) {
      m();
    }
  }
  
  public final void i(int paramInt)
  {
    a.G("DELETE FROM target_documents WHERE target_id = ?", new Object[] { Integer.valueOf(paramInt) });
  }
  
  public final void j(q paramq)
  {
    e = paramq;
    m();
  }
  
  public final m1 k(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = b.d(c.X(paramArrayOfByte));
      return paramArrayOfByte;
    }
    catch (b0 paramArrayOfByte)
    {
      b.T("TargetData failed to parse: %s", new Object[] { paramArrayOfByte });
      throw null;
    }
  }
  
  public final void l(m1 paramm1)
  {
    int i = b;
    String str = a.b();
    m localm = e.a;
    c localc = b.g(paramm1);
    a.G("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", new Object[] { Integer.valueOf(i), str, Long.valueOf(a), Integer.valueOf(b), g.z(), Long.valueOf(c), localc.j() });
  }
  
  public final void m()
  {
    a.G("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", new Object[] { Integer.valueOf(c), Long.valueOf(d), Long.valueOf(e.a.a), Integer.valueOf(e.a.b), Long.valueOf(f) });
  }
  
  public static final class a
  {
    public e<j9.i> a = j9.i.c;
  }
}

/* Location:
 * Qualified Name:     i9.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */