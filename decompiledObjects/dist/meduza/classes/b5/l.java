package b5;

import t5.k;
import t5.n;
import v3.i0;

public final class l
  extends e
{
  public final f j;
  public f.a k;
  public long l;
  public volatile boolean m;
  
  public l(k paramk, n paramn, i0 parami0, int paramInt, Object paramObject, f paramf)
  {
    super(paramk, paramn, 2, parami0, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    j = paramf;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	b5/l:l	J
    //   4: lconst_0
    //   5: lcmp
    //   6: ifne +27 -> 33
    //   9: aload_0
    //   10: getfield 21	b5/l:j	Lb5/f;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 28	b5/l:k	Lb5/f$a;
    //   18: astore_2
    //   19: aload_1
    //   20: checkcast 30	b5/d
    //   23: aload_2
    //   24: ldc2_w 15
    //   27: ldc2_w 15
    //   30: invokevirtual 33	b5/d:a	(Lb5/f$a;JJ)V
    //   33: aload_0
    //   34: getfield 37	b5/e:b	Lt5/n;
    //   37: aload_0
    //   38: getfield 26	b5/l:l	J
    //   41: invokevirtual 42	t5/n:a	(J)Lt5/n;
    //   44: astore_3
    //   45: new 44	c4/e
    //   48: astore_1
    //   49: aload_0
    //   50: getfield 48	b5/e:i	Lt5/j0;
    //   53: astore_2
    //   54: aload_1
    //   55: aload_2
    //   56: aload_3
    //   57: getfield 51	t5/n:f	J
    //   60: aload_2
    //   61: aload_3
    //   62: invokevirtual 56	t5/j0:a	(Lt5/n;)J
    //   65: invokespecial 59	c4/e:<init>	(Lt5/h;JJ)V
    //   68: aload_0
    //   69: getfield 61	b5/l:m	Z
    //   72: ifne +67 -> 139
    //   75: aload_0
    //   76: getfield 21	b5/l:j	Lb5/f;
    //   79: checkcast 30	b5/d
    //   82: getfield 64	b5/d:a	Lc4/h;
    //   85: aload_1
    //   86: getstatic 68	b5/d:r	Lc4/s;
    //   89: invokeinterface 74 3 0
    //   94: istore 4
    //   96: iconst_0
    //   97: istore 5
    //   99: iload 4
    //   101: iconst_1
    //   102: if_icmpeq +9 -> 111
    //   105: iconst_1
    //   106: istore 6
    //   108: goto +6 -> 114
    //   111: iconst_0
    //   112: istore 6
    //   114: iload 6
    //   116: invokestatic 80	x6/b:H	(Z)V
    //   119: iload 4
    //   121: ifne +6 -> 127
    //   124: iconst_1
    //   125: istore 5
    //   127: iload 5
    //   129: ifeq +10 -> 139
    //   132: goto -64 -> 68
    //   135: astore_2
    //   136: goto +27 -> 163
    //   139: aload_0
    //   140: aload_1
    //   141: getfield 82	c4/e:d	J
    //   144: aload_0
    //   145: getfield 37	b5/e:b	Lt5/n;
    //   148: getfield 51	t5/n:f	J
    //   151: lsub
    //   152: putfield 26	b5/l:l	J
    //   155: aload_0
    //   156: getfield 48	b5/e:i	Lt5/j0;
    //   159: invokestatic 87	b/z:d	(Lt5/k;)V
    //   162: return
    //   163: aload_0
    //   164: aload_1
    //   165: getfield 82	c4/e:d	J
    //   168: aload_0
    //   169: getfield 37	b5/e:b	Lt5/n;
    //   172: getfield 51	t5/n:f	J
    //   175: lsub
    //   176: putfield 26	b5/l:l	J
    //   179: aload_2
    //   180: athrow
    //   181: astore_1
    //   182: aload_0
    //   183: getfield 48	b5/e:i	Lt5/j0;
    //   186: invokestatic 87	b/z:d	(Lt5/k;)V
    //   189: aload_1
    //   190: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	l
    //   13	152	1	localObject1	Object
    //   181	9	1	localObject2	Object
    //   18	43	2	localObject3	Object
    //   135	45	2	localObject4	Object
    //   44	18	3	localn	n
    //   94	26	4	i	int
    //   97	31	5	n	int
    //   106	9	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   68	96	135	finally
    //   114	119	135	finally
    //   33	68	181	finally
    //   139	155	181	finally
    //   163	181	181	finally
  }
  
  public final void b()
  {
    m = true;
  }
}

/* Location:
 * Qualified Name:     b5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */