package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class j3
  implements I4
{
  protected int zza = 0;
  
  public static void e(Iterable paramIterable, List paramList)
  {
    a4.e(paramIterable);
    Object localObject;
    int j;
    if ((paramIterable instanceof n4))
    {
      localObject = ((n4)paramIterable).b();
      paramIterable = (n4)paramList;
      i = paramList.size();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramList = ((Iterator)localObject).next();
        if (paramList == null)
        {
          j = paramIterable.size();
          paramList = new StringBuilder("Element at index ");
          paramList.append(j - i);
          paramList.append(" is null.");
          paramList = paramList.toString();
          for (j = paramIterable.size() - 1; j >= i; j--) {
            paramIterable.remove(j);
          }
          throw new NullPointerException(paramList);
        }
        if ((paramList instanceof q3)) {
          paramIterable.K((q3)paramList);
        } else {
          paramIterable.add((String)paramList);
        }
      }
      return;
    }
    if ((paramIterable instanceof S4))
    {
      paramList.addAll((Collection)paramIterable);
      return;
    }
    if (((paramList instanceof ArrayList)) && ((paramIterable instanceof Collection))) {
      ((ArrayList)paramList).ensureCapacity(paramList.size() + ((Collection)paramIterable).size());
    }
    int i = paramList.size();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localObject = paramIterable.next();
      if (localObject == null)
      {
        j = paramList.size();
        paramIterable = new StringBuilder("Element at index ");
        paramIterable.append(j - i);
        paramIterable.append(" is null.");
        paramIterable = paramIterable.toString();
        for (j = paramList.size() - 1; j >= i; j--) {
          paramList.remove(j);
        }
        throw new NullPointerException(paramIterable);
      }
      paramList.add(localObject);
    }
  }
  
  public abstract int c(Z4 paramZ4);
  
  public abstract int g();
  
  public final byte[] h()
  {
    try
    {
      localObject1 = new byte[a()];
      localObject2 = J3.D((byte[])localObject1);
      f((J3)localObject2);
      ((J3)localObject2).E();
      return (byte[])localObject1;
    }
    catch (IOException localIOException)
    {
      Object localObject2 = getClass().getName();
      Object localObject1 = new StringBuilder("Serializing ");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" to a ");
      ((StringBuilder)localObject1).append("byte array");
      ((StringBuilder)localObject1).append(" threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject1).toString(), localIOException);
    }
  }
  
  public abstract void j(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.j3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */