package u6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import l6.d;
import org.jetbrains.annotations.NotNull;

public final class A
{
  @NotNull
  private volatile AtomicReferenceArray<Object> array;
  
  public A(int paramInt)
  {
    array = new AtomicReferenceArray(paramInt);
  }
  
  public final int a()
  {
    return array.length();
  }
  
  public final Object b(int paramInt)
  {
    Object localObject = array;
    if (paramInt < ((AtomicReferenceArray)localObject).length()) {
      localObject = ((AtomicReferenceArray)localObject).get(paramInt);
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public final void c(int paramInt, Object paramObject)
  {
    AtomicReferenceArray localAtomicReferenceArray1 = array;
    int i = localAtomicReferenceArray1.length();
    if (paramInt < i)
    {
      localAtomicReferenceArray1.set(paramInt, paramObject);
      return;
    }
    AtomicReferenceArray localAtomicReferenceArray2 = new AtomicReferenceArray(d.a(paramInt + 1, i * 2));
    for (int j = 0; j < i; j++) {
      localAtomicReferenceArray2.set(j, localAtomicReferenceArray1.get(j));
    }
    localAtomicReferenceArray2.set(paramInt, paramObject);
    array = localAtomicReferenceArray2;
  }
}

/* Location:
 * Qualified Name:     u6.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */