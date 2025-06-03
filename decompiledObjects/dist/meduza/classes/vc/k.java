package vc;

import f;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sc.t;
import ub.h;

public final class k
  extends t<k>
{
  public final AtomicReferenceArray e = new AtomicReferenceArray(j.f);
  
  public k(long paramLong, k paramk, int paramInt)
  {
    super(paramLong, paramk, paramInt);
  }
  
  public final int f()
  {
    return j.f;
  }
  
  public final void g(int paramInt, h paramh)
  {
    paramh = j.e;
    e.set(paramInt, paramh);
    h();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SemaphoreSegment[id=");
    localStringBuilder.append(c);
    localStringBuilder.append(", hashCode=");
    localStringBuilder.append(hashCode());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     vc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */