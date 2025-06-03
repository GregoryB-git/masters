package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

final class ImmutableList<T>
  extends AbstractList<T>
  implements RandomAccess
{
  private final T[] views;
  
  public ImmutableList(T[] paramArrayOfT)
  {
    views = paramArrayOfT;
  }
  
  public boolean contains(Object paramObject)
  {
    Object[] arrayOfObject = views;
    int i = arrayOfObject.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfObject[j] == paramObject) {
        return true;
      }
    }
    return false;
  }
  
  public T get(int paramInt)
  {
    return (T)views[paramInt];
  }
  
  public int size()
  {
    return views.length;
  }
}

/* Location:
 * Qualified Name:     butterknife.internal.ImmutableList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */