package m0;

import d0.C;
import e0.b;
import e0.c;
import e0.f;

public class N$h
  implements c
{
  public final b[] a;
  public final d0 b;
  public final f c;
  
  public N$h(b... paramVarArgs)
  {
    this(paramVarArgs, new d0(), new f());
  }
  
  public N$h(b[] paramArrayOfb, d0 paramd0, f paramf)
  {
    b[] arrayOfb = new b[paramArrayOfb.length + 2];
    a = arrayOfb;
    System.arraycopy(paramArrayOfb, 0, arrayOfb, 0, paramArrayOfb.length);
    b = paramd0;
    c = paramf;
    arrayOfb[paramArrayOfb.length] = paramd0;
    arrayOfb[(paramArrayOfb.length + 1)] = paramf;
  }
  
  public C a(C paramC)
  {
    c.j(a);
    c.i(b);
    return paramC;
  }
  
  public long b()
  {
    return b.v();
  }
  
  public boolean c(boolean paramBoolean)
  {
    b.E(paramBoolean);
    return paramBoolean;
  }
  
  public long d(long paramLong)
  {
    long l = paramLong;
    if (c.a()) {
      l = c.h(paramLong);
    }
    return l;
  }
  
  public b[] e()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     m0.N.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */