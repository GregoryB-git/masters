package v6;

import V5.n;
import V5.n.a;
import V5.o;
import X5.d;

public abstract class a
{
  public static final void a(d paramd, Throwable paramThrowable)
  {
    n.a locala = n.o;
    paramd.resumeWith(n.a(o.a(paramThrowable)));
    throw paramThrowable;
  }
  
  /* Error */
  public static final void b(d paramd1, d paramd2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 34	Y5/b:b	(LX5/d;)LX5/d;
    //   4: astore_2
    //   5: getstatic 12	V5/n:o	LV5/n$a;
    //   8: astore_0
    //   9: aload_2
    //   10: getstatic 39	V5/t:a	LV5/t;
    //   13: invokestatic 20	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   16: aconst_null
    //   17: iconst_2
    //   18: aconst_null
    //   19: invokestatic 45	u6/k:c	(LX5/d;Ljava/lang/Object;Lg6/l;ILjava/lang/Object;)V
    //   22: goto +9 -> 31
    //   25: astore_0
    //   26: aload_1
    //   27: aload_0
    //   28: invokestatic 47	v6/a:a	(LX5/d;Ljava/lang/Throwable;)V
    //   31: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	paramd1	d
    //   0	32	1	paramd2	d
    //   4	6	2	locald	d
    // Exception table:
    //   from	to	target	type
    //   0	22	25	finally
  }
  
  /* Error */
  public static final void c(g6.p paramp, Object paramObject, d paramd, g6.l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokestatic 51	Y5/b:a	(Lg6/p;Ljava/lang/Object;LX5/d;)LX5/d;
    //   6: invokestatic 34	Y5/b:b	(LX5/d;)LX5/d;
    //   9: astore_1
    //   10: getstatic 12	V5/n:o	LV5/n$a;
    //   13: astore_0
    //   14: aload_1
    //   15: getstatic 39	V5/t:a	LV5/t;
    //   18: invokestatic 20	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: aload_3
    //   22: invokestatic 54	u6/k:b	(LX5/d;Ljava/lang/Object;Lg6/l;)V
    //   25: goto +9 -> 34
    //   28: astore_0
    //   29: aload_2
    //   30: aload_0
    //   31: invokestatic 47	v6/a:a	(LX5/d;Ljava/lang/Throwable;)V
    //   34: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	paramp	g6.p
    //   0	35	1	paramObject	Object
    //   0	35	2	paramd	d
    //   0	35	3	paraml	g6.l
    // Exception table:
    //   from	to	target	type
    //   0	25	28	finally
  }
}

/* Location:
 * Qualified Name:     v6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */