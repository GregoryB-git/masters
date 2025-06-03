package xc;

import f;

public final class d
  implements w
{
  public d(x paramx, q paramq) {}
  
  public final z c()
  {
    return a;
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	xc/d:a	Lxc/c;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 16	xc/d:b	Lxc/w;
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
    //   0	68	0	this	d
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
  public final void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	xc/d:a	Lxc/c;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 16	xc/d:b	Lxc/w;
    //   9: astore_2
    //   10: aload_1
    //   11: invokevirtual 30	xc/c:h	()V
    //   14: aload_2
    //   15: invokeinterface 48 1 0
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
    //   0	68	0	this	d
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
  public final void g0(f paramf, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 52
    //   3: invokestatic 58	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: getfield 63	xc/f:b	J
    //   10: lconst_0
    //   11: lload_2
    //   12: invokestatic 68	xc/b:b	(JJJ)V
    //   15: lconst_0
    //   16: lstore 4
    //   18: lload_2
    //   19: lconst_0
    //   20: lcmp
    //   21: ifle +155 -> 176
    //   24: aload_1
    //   25: getfield 71	xc/f:a	Lxc/t;
    //   28: astore 6
    //   30: aload 6
    //   32: invokestatic 74	ec/i:b	(Ljava/lang/Object;)V
    //   35: lload 4
    //   37: lstore 7
    //   39: lload 4
    //   41: ldc2_w 75
    //   44: lcmp
    //   45: ifge +43 -> 88
    //   48: lload 4
    //   50: aload 6
    //   52: getfield 81	xc/t:c	I
    //   55: aload 6
    //   57: getfield 83	xc/t:b	I
    //   60: isub
    //   61: i2l
    //   62: ladd
    //   63: lstore 4
    //   65: lload 4
    //   67: lload_2
    //   68: lcmp
    //   69: iflt +9 -> 78
    //   72: lload_2
    //   73: lstore 7
    //   75: goto +13 -> 88
    //   78: aload 6
    //   80: getfield 86	xc/t:f	Lxc/t;
    //   83: astore 6
    //   85: goto -55 -> 30
    //   88: aload_0
    //   89: getfield 14	xc/d:a	Lxc/c;
    //   92: astore 6
    //   94: aload_0
    //   95: getfield 16	xc/d:b	Lxc/w;
    //   98: astore 9
    //   100: aload 6
    //   102: invokevirtual 30	xc/c:h	()V
    //   105: aload 9
    //   107: aload_1
    //   108: lload 7
    //   110: invokeinterface 88 4 0
    //   115: getstatic 37	rb/h:a	Lrb/h;
    //   118: astore 9
    //   120: aload 6
    //   122: invokevirtual 41	xc/c:i	()Z
    //   125: ifne +11 -> 136
    //   128: lload_2
    //   129: lload 7
    //   131: lsub
    //   132: lstore_2
    //   133: goto -118 -> 15
    //   136: aload 6
    //   138: aconst_null
    //   139: invokevirtual 45	xc/c:j	(Ljava/io/IOException;)Ljava/io/IOException;
    //   142: athrow
    //   143: astore_1
    //   144: goto +24 -> 168
    //   147: astore_1
    //   148: aload 6
    //   150: invokevirtual 41	xc/c:i	()Z
    //   153: ifne +6 -> 159
    //   156: goto +10 -> 166
    //   159: aload 6
    //   161: aload_1
    //   162: invokevirtual 45	xc/c:j	(Ljava/io/IOException;)Ljava/io/IOException;
    //   165: astore_1
    //   166: aload_1
    //   167: athrow
    //   168: aload 6
    //   170: invokevirtual 41	xc/c:i	()Z
    //   173: pop
    //   174: aload_1
    //   175: athrow
    //   176: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	d
    //   0	177	1	paramf	f
    //   0	177	2	paramLong	long
    //   16	50	4	l1	long
    //   28	141	6	localObject1	Object
    //   37	93	7	l2	long
    //   98	21	9	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   105	120	143	finally
    //   148	156	143	finally
    //   159	166	143	finally
    //   166	168	143	finally
    //   105	120	147	java/io/IOException
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AsyncTimeout.sink(");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     xc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */