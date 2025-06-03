package u6;

import kotlin.jvm.internal.Intrinsics;

public abstract class q$a
  extends b
{
  public final q b;
  public q c;
  
  public q$a(q paramq)
  {
    b = paramq;
  }
  
  public void e(q paramq, Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      paramObject = b;
    } else {
      paramObject = c;
    }
    if ((paramObject != null) && (u.b.a(q.i(), paramq, this, paramObject)) && (i != 0))
    {
      paramq = b;
      paramObject = c;
      Intrinsics.b(paramObject);
      q.h(paramq, (q)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     u6.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */