package d5;

import c5.c;
import java.util.ArrayList;
import java.util.List;
import o7.t;
import v3.i0;

public final class j$a
  extends j
  implements c
{
  public final k.a p;
  
  public j$a(long paramLong, i0 parami0, t paramt, k.a parama, ArrayList paramArrayList, List paramList1, List paramList2)
  {
    super(parami0, paramt, parama, paramArrayList, paramList1, paramList2);
    p = parama;
  }
  
  public final long a(long paramLong)
  {
    return p.g(paramLong);
  }
  
  public final long b(long paramLong1, long paramLong2)
  {
    return p.e(paramLong1, paramLong2);
  }
  
  public final String c()
  {
    return null;
  }
  
  public final long d(long paramLong1, long paramLong2)
  {
    return p.c(paramLong1, paramLong2);
  }
  
  public final long e(long paramLong1, long paramLong2)
  {
    k.a locala = p;
    if (f != null)
    {
      paramLong1 = -9223372036854775807L;
    }
    else
    {
      long l = locala.c(paramLong1, paramLong2);
      l = locala.b(paramLong1, paramLong2) + l;
      paramLong2 = locala.g(l);
      paramLong1 = locala.e(l, paramLong1) + paramLong2 - i;
    }
    return paramLong1;
  }
  
  public final i f(long paramLong)
  {
    return p.h(paramLong, this);
  }
  
  public final long g(long paramLong1, long paramLong2)
  {
    return p.f(paramLong1, paramLong2);
  }
  
  public final boolean h()
  {
    return p.i();
  }
  
  public final long i()
  {
    return p.d;
  }
  
  public final long j(long paramLong)
  {
    return p.d(paramLong);
  }
  
  public final long k(long paramLong1, long paramLong2)
  {
    return p.b(paramLong1, paramLong2);
  }
  
  public final c l()
  {
    return this;
  }
  
  public final i m()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     d5.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */