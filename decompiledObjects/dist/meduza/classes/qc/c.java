package qc;

import dc.p;
import pc.a;
import pc.q;
import ub.e;

public class c<T>
  extends rc.f<T>
{
  public final p<q<? super T>, e<? super rb.h>, Object> d;
  
  public c(p<? super q<? super T>, ? super e<? super rb.h>, ? extends Object> paramp, ub.h paramh, int paramInt, a parama)
  {
    super(paramh, paramInt, parama);
    d = paramp;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("block[");
    localStringBuilder.append(d);
    localStringBuilder.append("] -> ");
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     qc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */