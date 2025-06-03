package i9;

import java.util.PriorityQueue;
import q5.i;

public final class q$d
{
  public static final i c = new i(4);
  public final PriorityQueue<Long> a;
  public final int b;
  
  public q$d(int paramInt)
  {
    b = paramInt;
    a = new PriorityQueue(paramInt, c);
  }
  
  public final void a(Long paramLong)
  {
    if (a.size() < b) {}
    for (;;)
    {
      a.add(paramLong);
      break;
      Long localLong = (Long)a.peek();
      if (paramLong.longValue() >= localLong.longValue()) {
        break;
      }
      a.poll();
    }
  }
}

/* Location:
 * Qualified Name:     i9.q.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */