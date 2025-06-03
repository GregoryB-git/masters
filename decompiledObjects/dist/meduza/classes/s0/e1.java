package s0;

import java.util.Iterator;
import java.util.Map.Entry;

public final class e1
  extends f1<Object, Object>
{
  public e1(int paramInt)
  {
    super(paramInt);
  }
  
  public final void h()
  {
    if (!d)
    {
      for (int i = 0; i < e(); i++) {
        ((r.a)d(i).getKey()).b();
      }
      Iterator localIterator = f().iterator();
      while (localIterator.hasNext()) {
        ((r.a)((Map.Entry)localIterator.next()).getKey()).b();
      }
    }
    super.h();
  }
}

/* Location:
 * Qualified Name:     s0.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */