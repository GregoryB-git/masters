package X2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class c
  extends d
  implements D
{
  private static final long serialVersionUID = 6588350623831699109L;
  
  public c(Map paramMap)
  {
    super(paramMap);
  }
  
  public Map a()
  {
    return super.a();
  }
  
  public boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public boolean put(Object paramObject1, Object paramObject2)
  {
    return super.put(paramObject1, paramObject2);
  }
  
  public Collection w(Collection paramCollection)
  {
    return Collections.unmodifiableList((List)paramCollection);
  }
  
  public Collection x(Object paramObject, Collection paramCollection)
  {
    return y(paramObject, (List)paramCollection, null);
  }
}

/* Location:
 * Qualified Name:     X2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */