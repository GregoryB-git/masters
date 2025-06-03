package androidx.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class t
{
  public final HashMap a = new HashMap();
  
  public final void a()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      ((r)localIterator.next()).a();
    }
    a.clear();
  }
  
  public final r b(String paramString)
  {
    return (r)a.get(paramString);
  }
  
  public Set c()
  {
    return new HashSet(a.keySet());
  }
  
  public final void d(String paramString, r paramr)
  {
    paramString = (r)a.put(paramString, paramr);
    if (paramString != null) {
      paramString.d();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */