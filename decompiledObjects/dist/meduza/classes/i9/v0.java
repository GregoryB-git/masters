package i9;

import android.util.SparseArray;
import d9.r;
import g9.a0;
import j9.i;
import j9.o;
import java.util.ArrayList;
import p2.m0;
import x6.b;

public final class v0
  implements f0, p
{
  public final y0 a;
  public a0 b;
  public long c = -1L;
  public final q d;
  public l3.l e;
  
  public v0(y0 paramy0, q.b paramb)
  {
    a = paramy0;
    d = new q(this, paramb);
  }
  
  /* Error */
  public final void a(n9.d<Long> paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	i9/v0:a	Li9/y0;
    //   4: ldc 40
    //   6: invokevirtual 46	i9/y0:H	(Ljava/lang/String;)Li9/y0$d;
    //   9: astore_2
    //   10: aload_1
    //   11: checkcast 48	i9/m
    //   14: astore_1
    //   15: aload_2
    //   16: invokevirtual 53	i9/y0$d:e	()Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 59 1 0
    //   26: ifeq +22 -> 48
    //   29: aload_1
    //   30: aload_2
    //   31: iconst_0
    //   32: invokeinterface 63 2 0
    //   37: invokestatic 69	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   40: invokeinterface 75 2 0
    //   45: goto -25 -> 20
    //   48: aload_2
    //   49: invokeinterface 78 1 0
    //   54: return
    //   55: astore_1
    //   56: aload_2
    //   57: ifnull +18 -> 75
    //   60: aload_2
    //   61: invokeinterface 78 1 0
    //   66: goto +9 -> 75
    //   69: astore_2
    //   70: aload_1
    //   71: aload_2
    //   72: invokevirtual 84	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   75: aload_1
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	v0
    //   0	77	1	paramd	n9.d<Long>
    //   9	52	2	localObject	Object
    //   69	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   20	45	55	finally
    //   60	66	69	finally
  }
  
  public final int b(long paramLong, SparseArray<?> paramSparseArray)
  {
    j1 localj1 = a.d;
    int[] arrayOfInt = new int[1];
    y0.d locald = a.H("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
    locald.a(new Object[] { Long.valueOf(paramLong) });
    locald.d(new s0(localj1, paramSparseArray, arrayOfInt, 1));
    localj1.m();
    return arrayOfInt[0];
  }
  
  public final void c(i parami)
  {
    p(parami);
  }
  
  public final void d()
  {
    boolean bool;
    if (c != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Committing a transaction without having started one", bool, new Object[0]);
    c = -1L;
  }
  
  public final void e(i parami)
  {
    p(parami);
  }
  
  public final void f()
  {
    boolean bool;
    if (c == -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Starting a transaction without committing the previous one", bool, new Object[0]);
    a0 locala0 = b;
    long l = a + 1L;
    a = l;
    c = l;
  }
  
  public final void g(l paraml)
  {
    j1 localj1 = a.d;
    a.H("SELECT target_proto FROM targets").d(new i1(0, localj1, paraml));
  }
  
  public final long h()
  {
    boolean bool;
    if (c != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Attempting to get a sequence number outside of a transaction", bool, new Object[0]);
    return c;
  }
  
  public final long i()
  {
    y0 localy0 = a;
    long l = d.f;
    return ((Long)localy0.H("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").c(new d9.q(2))).longValue() + l;
  }
  
  public final int j(long paramLong)
  {
    int[] arrayOfInt = new int[1];
    ArrayList localArrayList = new ArrayList();
    o[] arrayOfo = new o[1];
    arrayOfo[0] = o.b;
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label111;
      }
      y0.d locald = a.H("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
      locald.a(new Object[] { Long.valueOf(paramLong), m0.A(arrayOfo[0]), Integer.valueOf(100) });
      if (locald.d(new u0(this, arrayOfInt, localArrayList, arrayOfo)) == 100) {
        break;
      }
    }
    label111:
    a.f.b(localArrayList);
    return arrayOfInt[0];
  }
  
  public final void k(i parami)
  {
    p(parami);
  }
  
  public final long l()
  {
    y0 localy0 = a;
    long l = ((Long)localy0.H("PRAGMA page_count").c(new r(1))).longValue();
    return ((Long)localy0.H("PRAGMA page_size").c(new d9.q(3))).longValue() * l;
  }
  
  public final void m(l3.l paraml)
  {
    e = paraml;
  }
  
  public final void n(i parami)
  {
    p(parami);
  }
  
  public final void o(m1 paramm1)
  {
    paramm1 = paramm1.b(h());
    a.d.h(paramm1);
  }
  
  public final void p(i parami)
  {
    parami = m0.A(a);
    a.G("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", new Object[] { parami, Long.valueOf(h()) });
  }
}

/* Location:
 * Qualified Name:     i9.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */