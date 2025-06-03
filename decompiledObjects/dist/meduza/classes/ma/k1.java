package ma;

import java.util.Iterator;
import java.util.Map.Entry;

public final class k1
  extends l1<Object, Object>
{
  public k1(int paramInt)
  {
    super(paramInt);
  }
  
  public final void h()
  {
    if (!d)
    {
      for (int i = 0; i < e(); i++) {
        ((s.a)d(i).getKey()).b();
      }
      Iterator localIterator = f().iterator();
      while (localIterator.hasNext()) {
        ((s.a)((Map.Entry)localIterator.next()).getKey()).b();
      }
    }
    super.h();
  }
}

/* Location:
 * Qualified Name:     ma.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */