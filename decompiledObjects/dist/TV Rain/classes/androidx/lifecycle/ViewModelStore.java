package androidx.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ViewModelStore
{
  private final HashMap<String, ViewModel> mMap = new HashMap();
  
  public final void clear()
  {
    Iterator localIterator = mMap.values().iterator();
    while (localIterator.hasNext()) {
      ((ViewModel)localIterator.next()).clear();
    }
    mMap.clear();
  }
  
  public final ViewModel get(String paramString)
  {
    return (ViewModel)mMap.get(paramString);
  }
  
  public Set<String> keys()
  {
    return new HashSet(mMap.keySet());
  }
  
  public final void put(String paramString, ViewModel paramViewModel)
  {
    paramString = (ViewModel)mMap.put(paramString, paramViewModel);
    if (paramString != null) {
      paramString.onCleared();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */