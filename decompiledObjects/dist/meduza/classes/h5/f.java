package h5;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import x6.b;
import z3.a;
import z3.j;

public abstract class f
  extends j<k, l, i>
  implements h
{
  public f()
  {
    super(new k[2], new l[2]);
    int i = g;
    int j = e.length;
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    z3.g[] arrayOfg = e;
    i = arrayOfg.length;
    while (k < i)
    {
      arrayOfg[k].q(1024);
      k++;
    }
  }
  
  public final void a(long paramLong) {}
  
  public final i e(Throwable paramThrowable)
  {
    return new i("Unexpected decode error", paramThrowable);
  }
  
  public final i f(z3.g paramg, z3.h paramh, boolean paramBoolean)
  {
    paramg = (k)paramg;
    paramh = (l)paramh;
    try
    {
      Object localObject = c;
      localObject.getClass();
      localObject = h(((ByteBuffer)localObject).array(), ((Buffer)localObject).limit(), paramBoolean);
      paramh.p(e, (g)localObject, q);
      a &= 0x7FFFFFFF;
      paramg = null;
    }
    catch (i paramg) {}
    return paramg;
  }
  
  public abstract g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     h5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */