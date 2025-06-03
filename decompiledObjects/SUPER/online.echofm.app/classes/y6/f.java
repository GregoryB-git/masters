package y6;

import X5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import u6.C;

public final class f
  extends C
{
  public final AtomicReferenceArray s = new AtomicReferenceArray(e.f());
  
  public f(long paramLong, f paramf, int paramInt)
  {
    super(paramLong, paramf, paramInt);
  }
  
  public int n()
  {
    return e.f();
  }
  
  public void o(int paramInt, Throwable paramThrowable, g paramg)
  {
    paramThrowable = e.c();
    r().set(paramInt, paramThrowable);
    p();
  }
  
  public final AtomicReferenceArray r()
  {
    return s;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SemaphoreSegment[id=");
    localStringBuilder.append(q);
    localStringBuilder.append(", hashCode=");
    localStringBuilder.append(hashCode());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     y6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */