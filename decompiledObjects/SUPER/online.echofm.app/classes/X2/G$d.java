package X2;

import W2.m;
import java.util.Map;

public abstract class G$d
  extends a0.d
{
  public final Map o;
  
  public G$d(Map paramMap)
  {
    o = ((Map)m.j(paramMap));
  }
  
  public Map a()
  {
    return o;
  }
  
  public boolean contains(Object paramObject)
  {
    return a().containsKey(paramObject);
  }
  
  public boolean isEmpty()
  {
    return a().isEmpty();
  }
  
  public int size()
  {
    return a().size();
  }
}

/* Location:
 * Qualified Name:     X2.G.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */