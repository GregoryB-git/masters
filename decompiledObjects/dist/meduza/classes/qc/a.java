package qc;

import rc.o;
import wb.c;

public abstract class a<T>
  implements e<T>
{
  /* Error */
  public final Object collect(f<? super T> paramf, ub.e<? super rb.h> parame)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 9
    //   4: ifeq +36 -> 40
    //   7: aload_2
    //   8: checkcast 9	qc/a$a
    //   11: astore_3
    //   12: aload_3
    //   13: getfield 20	qc/a$a:d	I
    //   16: istore 4
    //   18: iload 4
    //   20: ldc 21
    //   22: iand
    //   23: ifeq +17 -> 40
    //   26: aload_3
    //   27: iload 4
    //   29: ldc 21
    //   31: iadd
    //   32: putfield 20	qc/a$a:d	I
    //   35: aload_3
    //   36: astore_2
    //   37: goto +13 -> 50
    //   40: new 9	qc/a$a
    //   43: dup
    //   44: aload_0
    //   45: aload_2
    //   46: invokespecial 24	qc/a$a:<init>	(Lqc/a;Lub/e;)V
    //   49: astore_2
    //   50: aload_2
    //   51: getfield 28	qc/a$a:b	Ljava/lang/Object;
    //   54: astore 5
    //   56: getstatic 34	vb/a:a	Lvb/a;
    //   59: astore_3
    //   60: aload_2
    //   61: getfield 20	qc/a$a:d	I
    //   64: istore 4
    //   66: iload 4
    //   68: ifeq +36 -> 104
    //   71: iload 4
    //   73: iconst_1
    //   74: if_icmpne +20 -> 94
    //   77: aload_2
    //   78: getfield 37	qc/a$a:a	Lrc/o;
    //   81: astore_1
    //   82: aload 5
    //   84: invokestatic 42	rb/f:b	(Ljava/lang/Object;)V
    //   87: goto +81 -> 168
    //   90: astore_2
    //   91: goto +86 -> 177
    //   94: new 44	java/lang/IllegalStateException
    //   97: dup
    //   98: ldc 46
    //   100: invokespecial 49	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   103: athrow
    //   104: aload 5
    //   106: invokestatic 42	rb/f:b	(Ljava/lang/Object;)V
    //   109: new 51	rc/o
    //   112: dup
    //   113: aload_1
    //   114: aload_2
    //   115: invokeinterface 57 1 0
    //   120: invokespecial 60	rc/o:<init>	(Lqc/f;Lub/h;)V
    //   123: astore_1
    //   124: aload_2
    //   125: aload_1
    //   126: putfield 37	qc/a$a:a	Lrc/o;
    //   129: aload_2
    //   130: iconst_1
    //   131: putfield 20	qc/a$a:d	I
    //   134: aload_0
    //   135: checkcast 62	qc/r
    //   138: getfield 65	qc/r:a	Ldc/p;
    //   141: aload_1
    //   142: aload_2
    //   143: invokeinterface 71 3 0
    //   148: astore_2
    //   149: aload_2
    //   150: aload_3
    //   151: if_acmpne +6 -> 157
    //   154: goto +7 -> 161
    //   157: getstatic 76	rb/h:a	Lrb/h;
    //   160: astore_2
    //   161: aload_2
    //   162: aload_3
    //   163: if_acmpne +5 -> 168
    //   166: aload_3
    //   167: areturn
    //   168: aload_1
    //   169: invokevirtual 79	rc/o:releaseIntercepted	()V
    //   172: getstatic 76	rb/h:a	Lrb/h;
    //   175: areturn
    //   176: astore_2
    //   177: aload_1
    //   178: invokevirtual 79	rc/o:releaseIntercepted	()V
    //   181: aload_2
    //   182: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	this	a
    //   0	183	1	paramf	f<? super T>
    //   0	183	2	parame	ub.e<? super rb.h>
    //   11	156	3	localObject1	Object
    //   16	59	4	i	int
    //   54	51	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   82	87	90	finally
    //   124	149	176	finally
    //   157	161	176	finally
  }
  
  @wb.e(c="kotlinx.coroutines.flow.AbstractFlow", f="Flow.kt", l={230}, m="collect")
  public static final class a
    extends c
  {
    public o a;
    public int d;
    
    public a(a<T> parama, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      return c.collect(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     qc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */