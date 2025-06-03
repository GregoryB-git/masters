package y0;

import d0.q;
import g0.M;
import i0.g;
import java.util.Arrays;

public abstract class k
  extends e
{
  public byte[] j;
  public volatile boolean k;
  
  public k(g paramg, i0.k paramk, int paramInt1, q paramq, int paramInt2, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramg, paramk, paramInt1, paramq, paramInt2, paramObject, -9223372036854775807L, -9223372036854775807L);
    if (paramArrayOfByte == null) {
      paramArrayOfByte = M.f;
    }
    j = paramArrayOfByte;
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	y0/e:i	Li0/x;
    //   4: aload_0
    //   5: getfield 32	y0/e:b	Li0/k;
    //   8: invokevirtual 38	i0/x:e	(Li0/k;)J
    //   11: pop2
    //   12: iconst_0
    //   13: istore_1
    //   14: iconst_0
    //   15: istore_2
    //   16: iload_1
    //   17: iconst_m1
    //   18: if_icmpeq +52 -> 70
    //   21: aload_0
    //   22: getfield 40	y0/k:k	Z
    //   25: ifne +45 -> 70
    //   28: aload_0
    //   29: iload_2
    //   30: invokevirtual 43	y0/k:i	(I)V
    //   33: aload_0
    //   34: getfield 29	y0/e:i	Li0/x;
    //   37: aload_0
    //   38: getfield 22	y0/k:j	[B
    //   41: iload_2
    //   42: sipush 16384
    //   45: invokevirtual 47	i0/x:read	([BII)I
    //   48: istore_3
    //   49: iload_3
    //   50: istore_1
    //   51: iload_3
    //   52: iconst_m1
    //   53: if_icmpeq -37 -> 16
    //   56: iload_2
    //   57: iload_3
    //   58: iadd
    //   59: istore_2
    //   60: iload_3
    //   61: istore_1
    //   62: goto -46 -> 16
    //   65: astore 4
    //   67: goto +27 -> 94
    //   70: aload_0
    //   71: getfield 40	y0/k:k	Z
    //   74: ifne +12 -> 86
    //   77: aload_0
    //   78: aload_0
    //   79: getfield 22	y0/k:j	[B
    //   82: iload_2
    //   83: invokevirtual 51	y0/k:g	([BI)V
    //   86: aload_0
    //   87: getfield 29	y0/e:i	Li0/x;
    //   90: invokestatic 57	i0/j:a	(Li0/g;)V
    //   93: return
    //   94: aload_0
    //   95: getfield 29	y0/e:i	Li0/x;
    //   98: invokestatic 57	i0/j:a	(Li0/g;)V
    //   101: aload 4
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	k
    //   13	49	1	i	int
    //   15	68	2	m	int
    //   48	13	3	n	int
    //   65	37	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	12	65	finally
    //   21	49	65	finally
    //   70	86	65	finally
  }
  
  public final void c()
  {
    k = true;
  }
  
  public abstract void g(byte[] paramArrayOfByte, int paramInt);
  
  public byte[] h()
  {
    return j;
  }
  
  public final void i(int paramInt)
  {
    byte[] arrayOfByte = j;
    if (arrayOfByte.length < paramInt + 16384) {
      j = Arrays.copyOf(arrayOfByte, arrayOfByte.length + 16384);
    }
  }
}

/* Location:
 * Qualified Name:     y0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */