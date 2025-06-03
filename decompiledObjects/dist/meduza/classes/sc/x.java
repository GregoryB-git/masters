package sc;

import ec.i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.y0.c;
import nc.y0.d;

public class x<T extends y,  extends Comparable<? super T>>
{
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size");
  private volatile int _size;
  public T[] a;
  
  public final void a(y0.c paramc)
  {
    paramc.f((y0.d)this);
    y[] arrayOfy = a;
    Object localObject;
    if (arrayOfy == null)
    {
      localObject = new y[4];
      a = ((y[])localObject);
    }
    else
    {
      localObject = arrayOfy;
      if (b() >= arrayOfy.length)
      {
        localObject = Arrays.copyOf(arrayOfy, b() * 2);
        i.d(localObject, "copyOf(this, newSize)");
        localObject = (y[])localObject;
        a = ((y[])localObject);
      }
    }
    int i = b();
    b.set(this, i + 1);
    localObject[i] = paramc;
    b = i;
    d(i);
  }
  
  public final int b()
  {
    return b.get(this);
  }
  
  public final T c(int paramInt)
  {
    y[] arrayOfy = a;
    i.b(arrayOfy);
    int i = b();
    b.set(this, i - 1);
    if (paramInt < b())
    {
      e(paramInt, b());
      int j = (paramInt - 1) / 2;
      i = paramInt;
      Object localObject2;
      if (paramInt > 0)
      {
        localObject1 = arrayOfy[paramInt];
        i.b(localObject1);
        localObject1 = (Comparable)localObject1;
        localObject2 = arrayOfy[j];
        i.b(localObject2);
        i = paramInt;
        if (((Comparable)localObject1).compareTo(localObject2) < 0)
        {
          e(paramInt, j);
          d(j);
          break label264;
        }
      }
      for (;;)
      {
        j = i * 2 + 1;
        if (j >= b()) {
          break;
        }
        localObject1 = a;
        i.b(localObject1);
        int k = j + 1;
        paramInt = j;
        if (k < b())
        {
          localObject2 = localObject1[k];
          i.b(localObject2);
          Comparable localComparable = (Comparable)localObject2;
          localObject2 = localObject1[j];
          i.b(localObject2);
          paramInt = j;
          if (localComparable.compareTo(localObject2) < 0) {
            paramInt = k;
          }
        }
        localObject2 = localObject1[i];
        i.b(localObject2);
        localObject2 = (Comparable)localObject2;
        localObject1 = localObject1[paramInt];
        i.b(localObject1);
        if (((Comparable)localObject2).compareTo(localObject1) <= 0) {
          break;
        }
        e(i, paramInt);
        i = paramInt;
      }
    }
    label264:
    Object localObject1 = arrayOfy[b()];
    i.b(localObject1);
    ((y)localObject1).f(null);
    ((y)localObject1).setIndex(-1);
    arrayOfy[b()] = null;
    return (T)localObject1;
  }
  
  public final void d(int paramInt)
  {
    for (;;)
    {
      if (paramInt <= 0) {
        return;
      }
      Object localObject1 = a;
      i.b(localObject1);
      int i = (paramInt - 1) / 2;
      Object localObject2 = localObject1[i];
      i.b(localObject2);
      localObject2 = (Comparable)localObject2;
      localObject1 = localObject1[paramInt];
      i.b(localObject1);
      if (((Comparable)localObject2).compareTo(localObject1) <= 0) {
        return;
      }
      e(paramInt, i);
      paramInt = i;
    }
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    y[] arrayOfy = a;
    i.b(arrayOfy);
    y localy1 = arrayOfy[paramInt2];
    i.b(localy1);
    y localy2 = arrayOfy[paramInt1];
    i.b(localy2);
    arrayOfy[paramInt1] = localy1;
    arrayOfy[paramInt2] = localy2;
    localy1.setIndex(paramInt1);
    localy2.setIndex(paramInt2);
  }
}

/* Location:
 * Qualified Name:     sc.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */