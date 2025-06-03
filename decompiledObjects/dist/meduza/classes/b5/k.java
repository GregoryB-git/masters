package b5;

import b.z;
import e5.g.a;
import java.util.Arrays;
import t5.j0;
import t5.n;
import v3.i0;
import v5.e0;

public abstract class k
  extends e
{
  public byte[] j;
  public volatile boolean k;
  
  public k(t5.k paramk, n paramn, i0 parami0, int paramInt, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramk, paramn, 3, parami0, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    if (paramArrayOfByte == null) {
      paramk = e0.f;
    } else {
      paramk = paramArrayOfByte;
    }
    j = paramk;
  }
  
  public final void a()
  {
    try
    {
      this.i.a(b);
      int i = 0;
      int m = 0;
      byte[] arrayOfByte;
      while ((i != -1) && (!k))
      {
        arrayOfByte = j;
        if (arrayOfByte.length < m + 16384) {
          j = Arrays.copyOf(arrayOfByte, arrayOfByte.length + 16384);
        }
        int n = this.i.read(j, m, 16384);
        i = n;
        if (n != -1)
        {
          m += n;
          i = n;
        }
      }
      if (!k)
      {
        arrayOfByte = j;
        l = Arrays.copyOf(arrayOfByte, m);
      }
      return;
    }
    finally
    {
      z.d(this.i);
    }
  }
  
  public final void b()
  {
    k = true;
  }
}

/* Location:
 * Qualified Name:     b5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */