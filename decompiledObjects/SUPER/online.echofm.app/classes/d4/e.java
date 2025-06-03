package d4;

import Y3.m;
import java.util.Map;

public class e
  extends k
{
  public Map q;
  
  public e(Map paramMap, n paramn)
  {
    super(paramn);
    q = paramMap;
  }
  
  public String O(n.b paramb)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(T(paramb));
    localStringBuilder.append("deferredValue:");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public k.b S()
  {
    return k.b.o;
  }
  
  public int V(e parame)
  {
    return 0;
  }
  
  public e W(n paramn)
  {
    m.f(r.b(paramn));
    return new e(q, paramn);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (e)paramObject;
    bool1 = bool2;
    if (q.equals(q))
    {
      bool1 = bool2;
      if (o.equals(o)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public Object getValue()
  {
    return q;
  }
  
  public int hashCode()
  {
    return q.hashCode() + o.hashCode();
  }
}

/* Location:
 * Qualified Name:     d4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */