package v6;

import V5.n;
import V5.o;
import X5.d;
import X5.g;
import Z5.h;
import g6.p;
import kotlin.jvm.internal.y;
import u6.J;

public abstract class b
{
  public static final void a(p paramp, Object paramObject, d paramd)
  {
    d locald = h.a(paramd);
    try
    {
      g localg = paramd.getContext();
      paramd = J.c(localg, null);
      locald.resumeWith(n.a(paramp));
    }
    finally
    {
      try
      {
        paramp = ((p)y.b(paramp, 2)).invoke(paramObject, locald);
        J.a(localg, paramd);
        if (paramp == Y5.b.c()) {
          return;
        }
      }
      finally
      {
        J.a(localg, paramd);
      }
      paramp = finally;
      paramp = o.a(paramp);
    }
  }
  
  /* Error */
  public static final Object b(u6.B paramB, Object paramObject, p paramp)
  {
    // Byte code:
    //   0: aload_2
    //   1: iconst_2
    //   2: invokestatic 29	kotlin/jvm/internal/y:b	(Ljava/lang/Object;I)Ljava/lang/Object;
    //   5: checkcast 31	g6/p
    //   8: aload_1
    //   9: aload_0
    //   10: invokeinterface 35 3 0
    //   15: astore_1
    //   16: goto +16 -> 32
    //   19: astore_1
    //   20: new 65	p6/z
    //   23: dup
    //   24: aload_1
    //   25: iconst_0
    //   26: iconst_2
    //   27: aconst_null
    //   28: invokespecial 69	p6/z:<init>	(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V
    //   31: astore_1
    //   32: aload_1
    //   33: invokestatic 43	Y5/b:c	()Ljava/lang/Object;
    //   36: if_acmpne +10 -> 46
    //   39: invokestatic 43	Y5/b:c	()Ljava/lang/Object;
    //   42: astore_0
    //   43: goto +31 -> 74
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual 74	p6/x0:j0	(Ljava/lang/Object;)Ljava/lang/Object;
    //   51: astore_0
    //   52: aload_0
    //   53: getstatic 79	p6/y0:b	Lu6/F;
    //   56: if_acmpne +6 -> 62
    //   59: goto -20 -> 39
    //   62: aload_0
    //   63: instanceof 65
    //   66: ifne +10 -> 76
    //   69: aload_0
    //   70: invokestatic 82	p6/y0:h	(Ljava/lang/Object;)Ljava/lang/Object;
    //   73: astore_0
    //   74: aload_0
    //   75: areturn
    //   76: aload_0
    //   77: checkcast 65	p6/z
    //   80: getfield 85	p6/z:a	Ljava/lang/Throwable;
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	paramB	u6.B
    //   0	84	1	paramObject	Object
    //   0	84	2	paramp	p
    // Exception table:
    //   from	to	target	type
    //   0	16	19	finally
  }
}

/* Location:
 * Qualified Name:     v6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */