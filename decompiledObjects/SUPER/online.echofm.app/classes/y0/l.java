package y0;

import d0.q;
import i0.g;
import i0.k;

public final class l
  extends e
{
  public final f j;
  public f.b k;
  public long l;
  public volatile boolean m;
  
  public l(g paramg, k paramk, q paramq, int paramInt, Object paramObject, f paramf)
  {
    super(paramg, paramk, 2, paramq, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    j = paramf;
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	y0/l:l	J
    //   4: lconst_0
    //   5: lcmp
    //   6: ifne +22 -> 28
    //   9: aload_0
    //   10: getfield 21	y0/l:j	Ly0/f;
    //   13: aload_0
    //   14: getfield 28	y0/l:k	Ly0/f$b;
    //   17: ldc2_w 15
    //   20: ldc2_w 15
    //   23: invokeinterface 33 6 0
    //   28: aload_0
    //   29: getfield 36	y0/e:b	Li0/k;
    //   32: aload_0
    //   33: getfield 26	y0/l:l	J
    //   36: invokevirtual 42	i0/k:e	(J)Li0/k;
    //   39: astore_1
    //   40: new 44	F0/j
    //   43: astore_2
    //   44: aload_0
    //   45: getfield 48	y0/e:i	Li0/x;
    //   48: astore_3
    //   49: aload_2
    //   50: aload_3
    //   51: aload_1
    //   52: getfield 51	i0/k:g	J
    //   55: aload_3
    //   56: aload_1
    //   57: invokevirtual 56	i0/x:e	(Li0/k;)J
    //   60: invokespecial 59	F0/j:<init>	(Ld0/i;JJ)V
    //   63: aload_0
    //   64: getfield 61	y0/l:m	Z
    //   67: ifne +27 -> 94
    //   70: aload_0
    //   71: getfield 21	y0/l:j	Ly0/f;
    //   74: aload_2
    //   75: invokeinterface 65 2 0
    //   80: istore 4
    //   82: iload 4
    //   84: ifeq +10 -> 94
    //   87: goto -24 -> 63
    //   90: astore_1
    //   91: goto +33 -> 124
    //   94: aload_0
    //   95: aload_2
    //   96: invokeinterface 71 1 0
    //   101: aload_0
    //   102: getfield 36	y0/e:b	Li0/k;
    //   105: getfield 51	i0/k:g	J
    //   108: lsub
    //   109: putfield 26	y0/l:l	J
    //   112: aload_0
    //   113: getfield 48	y0/e:i	Li0/x;
    //   116: invokestatic 77	i0/j:a	(Li0/g;)V
    //   119: return
    //   120: astore_2
    //   121: goto +23 -> 144
    //   124: aload_0
    //   125: aload_2
    //   126: invokeinterface 71 1 0
    //   131: aload_0
    //   132: getfield 36	y0/e:b	Li0/k;
    //   135: getfield 51	i0/k:g	J
    //   138: lsub
    //   139: putfield 26	y0/l:l	J
    //   142: aload_1
    //   143: athrow
    //   144: aload_0
    //   145: getfield 48	y0/e:i	Li0/x;
    //   148: invokestatic 77	i0/j:a	(Li0/g;)V
    //   151: aload_2
    //   152: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	l
    //   39	18	1	localk	k
    //   90	53	1	localObject1	Object
    //   43	53	2	localj	F0.j
    //   120	32	2	localObject2	Object
    //   48	8	3	localx	i0.x
    //   80	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   63	82	90	finally
    //   28	63	120	finally
    //   94	112	120	finally
    //   124	144	120	finally
  }
  
  public void c()
  {
    m = true;
  }
  
  public void g(f.b paramb)
  {
    k = paramb;
  }
}

/* Location:
 * Qualified Name:     y0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */