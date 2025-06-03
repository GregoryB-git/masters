package sc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import tc.a.a;

public final class r<T>
{
  private volatile AtomicReferenceArray<T> array;
  
  public r(int paramInt)
  {
    array = new AtomicReferenceArray(paramInt);
  }
  
  public final int a()
  {
    return array.length();
  }
  
  public final T b(int paramInt)
  {
    Object localObject = array;
    if (paramInt < ((AtomicReferenceArray)localObject).length()) {
      localObject = ((AtomicReferenceArray)localObject).get(paramInt);
    } else {
      localObject = null;
    }
    return (T)localObject;
  }
  
  public final void c(int paramInt, a.a parama)
  {
    AtomicReferenceArray localAtomicReferenceArray1 = array;
    int i = localAtomicReferenceArray1.length();
    if (paramInt < i)
    {
      localAtomicReferenceArray1.set(paramInt, parama);
      return;
    }
    int j = paramInt + 1;
    int k = i * 2;
    int m = j;
    if (j < k) {
      m = k;
    }
    AtomicReferenceArray localAtomicReferenceArray2 = new AtomicReferenceArray(m);
    for (m = 0; m < i; m++) {
      localAtomicReferenceArray2.set(m, localAtomicReferenceArray1.get(m));
    }
    localAtomicReferenceArray2.set(paramInt, parama);
    array = localAtomicReferenceArray2;
  }
}

/* Location:
 * Qualified Name:     sc.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */