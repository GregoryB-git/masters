package sc;

public final class h$a
  implements Runnable
{
  public Runnable a;
  
  public h$a(Runnable paramRunnable)
  {
    Runnable localRunnable;
    a = localRunnable;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 21	sc/h$a:a	Ljava/lang/Runnable;
    //   6: invokeinterface 27 1 0
    //   11: goto +11 -> 22
    //   14: astore_2
    //   15: getstatic 32	ub/i:a	Lub/i;
    //   18: aload_2
    //   19: invokestatic 37	nc/c0:a	(Lub/h;Ljava/lang/Throwable;)V
    //   22: aload_0
    //   23: getfield 16	sc/h$a:b	Lsc/h;
    //   26: invokevirtual 41	sc/h:C0	()Ljava/lang/Runnable;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull +4 -> 35
    //   34: return
    //   35: aload_0
    //   36: aload_2
    //   37: putfield 21	sc/h$a:a	Ljava/lang/Runnable;
    //   40: iload_1
    //   41: iconst_1
    //   42: iadd
    //   43: istore_3
    //   44: iload_3
    //   45: istore_1
    //   46: iload_3
    //   47: bipush 16
    //   49: if_icmplt -47 -> 2
    //   52: iload_3
    //   53: istore_1
    //   54: aload_0
    //   55: getfield 16	sc/h$a:b	Lsc/h;
    //   58: getfield 45	sc/h:c	Lnc/a0;
    //   61: invokevirtual 51	nc/a0:B0	()Z
    //   64: ifeq -62 -> 2
    //   67: aload_0
    //   68: getfield 16	sc/h$a:b	Lsc/h;
    //   71: astore_2
    //   72: aload_2
    //   73: getfield 45	sc/h:c	Lnc/a0;
    //   76: aload_2
    //   77: aload_0
    //   78: invokevirtual 55	nc/a0:z0	(Lub/h;Ljava/lang/Runnable;)V
    //   81: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	a
    //   1	53	1	i	int
    //   14	5	2	localThrowable	Throwable
    //   29	48	2	localObject	Object
    //   43	10	3	j	int
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
}

/* Location:
 * Qualified Name:     sc.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */