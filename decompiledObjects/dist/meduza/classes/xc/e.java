package xc;

import f;

public final class e
  implements y
{
  public e(x paramx, o paramo) {}
  
  public final z c()
  {
    return a;
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	xc/e:a	Lxc/c;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 16	xc/e:b	Lxc/y;
    //   9: astore_2
    //   10: aload_1
    //   11: invokevirtual 30	xc/c:h	()V
    //   14: aload_2
    //   15: invokeinterface 32 1 0
    //   20: getstatic 37	rb/h:a	Lrb/h;
    //   23: astore_2
    //   24: aload_1
    //   25: invokevirtual 41	xc/c:i	()Z
    //   28: ifne +4 -> 32
    //   31: return
    //   32: aload_1
    //   33: aconst_null
    //   34: invokevirtual 45	xc/c:j	(Ljava/io/IOException;)Ljava/io/IOException;
    //   37: athrow
    //   38: astore_2
    //   39: goto +22 -> 61
    //   42: astore_2
    //   43: aload_1
    //   44: invokevirtual 41	xc/c:i	()Z
    //   47: ifne +6 -> 53
    //   50: goto +9 -> 59
    //   53: aload_1
    //   54: aload_2
    //   55: invokevirtual 45	xc/c:j	(Ljava/io/IOException;)Ljava/io/IOException;
    //   58: astore_2
    //   59: aload_2
    //   60: athrow
    //   61: aload_1
    //   62: invokevirtual 41	xc/c:i	()Z
    //   65: pop
    //   66: aload_2
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	e
    //   4	58	1	localc	c
    //   9	15	2	localObject1	Object
    //   38	1	2	localObject2	Object
    //   42	13	2	localIOException1	java.io.IOException
    //   58	9	2	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   14	24	38	finally
    //   43	50	38	finally
    //   53	59	38	finally
    //   59	61	38	finally
    //   14	24	42	java/io/IOException
  }
  
  /* Error */
  public final long e0(f paramf, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 49
    //   3: invokestatic 55	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 14	xc/e:a	Lxc/c;
    //   10: astore 4
    //   12: aload_0
    //   13: getfield 16	xc/e:b	Lxc/y;
    //   16: astore 5
    //   18: aload 4
    //   20: invokevirtual 30	xc/c:h	()V
    //   23: aload 5
    //   25: aload_1
    //   26: lload_2
    //   27: invokeinterface 57 4 0
    //   32: lstore_2
    //   33: aload 4
    //   35: invokevirtual 41	xc/c:i	()Z
    //   38: ifne +5 -> 43
    //   41: lload_2
    //   42: lreturn
    //   43: aload 4
    //   45: aconst_null
    //   46: invokevirtual 45	xc/c:j	(Ljava/io/IOException;)Ljava/io/IOException;
    //   49: athrow
    //   50: astore_1
    //   51: goto +24 -> 75
    //   54: astore_1
    //   55: aload 4
    //   57: invokevirtual 41	xc/c:i	()Z
    //   60: ifne +6 -> 66
    //   63: goto +10 -> 73
    //   66: aload 4
    //   68: aload_1
    //   69: invokevirtual 45	xc/c:j	(Ljava/io/IOException;)Ljava/io/IOException;
    //   72: astore_1
    //   73: aload_1
    //   74: athrow
    //   75: aload 4
    //   77: invokevirtual 41	xc/c:i	()Z
    //   80: pop
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	e
    //   0	83	1	paramf	f
    //   0	83	2	paramLong	long
    //   10	66	4	localc	c
    //   16	8	5	localy	y
    // Exception table:
    //   from	to	target	type
    //   23	33	50	finally
    //   55	63	50	finally
    //   66	73	50	finally
    //   73	75	50	finally
    //   23	33	54	java/io/IOException
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AsyncTimeout.source(");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     xc.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */