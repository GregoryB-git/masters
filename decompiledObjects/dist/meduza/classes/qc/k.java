package qc;

import ec.s;
import wb.c;

public final class k<T>
  implements f
{
  public k(f<? super T> paramf, s<Throwable> params) {}
  
  /* Error */
  public final Object emit(T paramT, ub.e<? super rb.h> parame)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 9
    //   4: ifeq +36 -> 40
    //   7: aload_2
    //   8: checkcast 9	qc/k$a
    //   11: astore_3
    //   12: aload_3
    //   13: getfield 33	qc/k$a:d	I
    //   16: istore 4
    //   18: iload 4
    //   20: ldc 34
    //   22: iand
    //   23: ifeq +17 -> 40
    //   26: aload_3
    //   27: iload 4
    //   29: ldc 34
    //   31: iadd
    //   32: putfield 33	qc/k$a:d	I
    //   35: aload_3
    //   36: astore_2
    //   37: goto +13 -> 50
    //   40: new 9	qc/k$a
    //   43: dup
    //   44: aload_0
    //   45: aload_2
    //   46: invokespecial 37	qc/k$a:<init>	(Lqc/k;Lub/e;)V
    //   49: astore_2
    //   50: aload_2
    //   51: getfield 40	qc/k$a:b	Ljava/lang/Object;
    //   54: astore 5
    //   56: getstatic 45	vb/a:a	Lvb/a;
    //   59: astore_3
    //   60: aload_2
    //   61: getfield 33	qc/k$a:d	I
    //   64: istore 4
    //   66: iload 4
    //   68: ifeq +36 -> 104
    //   71: iload 4
    //   73: iconst_1
    //   74: if_icmpne +20 -> 94
    //   77: aload_2
    //   78: getfield 48	qc/k$a:a	Lqc/k;
    //   81: astore_1
    //   82: aload 5
    //   84: invokestatic 53	rb/f:b	(Ljava/lang/Object;)V
    //   87: goto +55 -> 142
    //   90: astore_2
    //   91: goto +58 -> 149
    //   94: new 55	java/lang/IllegalStateException
    //   97: dup
    //   98: ldc 57
    //   100: invokespecial 60	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   103: athrow
    //   104: aload 5
    //   106: invokestatic 53	rb/f:b	(Ljava/lang/Object;)V
    //   109: aload_0
    //   110: getfield 19	qc/k:a	Lqc/f;
    //   113: astore 5
    //   115: aload_2
    //   116: aload_0
    //   117: putfield 48	qc/k$a:a	Lqc/k;
    //   120: aload_2
    //   121: iconst_1
    //   122: putfield 33	qc/k$a:d	I
    //   125: aload 5
    //   127: aload_1
    //   128: aload_2
    //   129: invokeinterface 62 3 0
    //   134: astore_1
    //   135: aload_1
    //   136: aload_3
    //   137: if_acmpne +5 -> 142
    //   140: aload_3
    //   141: areturn
    //   142: getstatic 67	rb/h:a	Lrb/h;
    //   145: areturn
    //   146: astore_2
    //   147: aload_0
    //   148: astore_1
    //   149: aload_1
    //   150: getfield 21	qc/k:b	Lec/s;
    //   153: aload_2
    //   154: putfield 71	ec/s:a	Ljava/lang/Object;
    //   157: aload_2
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	k
    //   0	159	1	paramT	T
    //   0	159	2	parame	ub.e<? super rb.h>
    //   11	130	3	localObject1	Object
    //   16	59	4	i	int
    //   54	72	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   82	87	90	finally
    //   109	135	146	finally
  }
  
  @wb.e(c="kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f="Errors.kt", l={158}, m="emit")
  public static final class a
    extends c
  {
    public k a;
    public int d;
    
    public a(k<? super T> paramk, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      return c.emit(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     qc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */