package com.google.android.recaptcha.internal;

import a0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzkn<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>>
  implements zzoh
{
  public static void zzd(Iterable paramIterable, List paramList)
  {
    Object localObject = zznl.zza;
    paramIterable.getClass();
    boolean bool = paramIterable instanceof zznu;
    int i = 0;
    int j;
    if (bool)
    {
      localObject = ((zznu)paramIterable).zza();
      paramIterable = (zznu)paramList;
      j = paramList.size();
      paramList = ((List)localObject).iterator();
      while (paramList.hasNext())
      {
        localObject = paramList.next();
        if (localObject == null)
        {
          paramList = j.h("Element at index ", paramIterable.size() - j, " is null.");
          i = paramIterable.size();
          for (;;)
          {
            i--;
            if (i < j) {
              break;
            }
            paramIterable.remove(i);
          }
          throw new NullPointerException(paramList);
        }
        if ((localObject instanceof zzle))
        {
          localObject = (zzle)localObject;
        }
        else
        {
          if (!(localObject instanceof byte[])) {
            break label171;
          }
          localObject = (byte[])localObject;
          zzle.zzk((byte[])localObject, 0, localObject.length);
        }
        paramIterable.zzb();
        continue;
        label171:
        paramIterable.add((String)localObject);
      }
    }
    if (!(paramIterable instanceof zzor))
    {
      if ((paramIterable instanceof Collection))
      {
        j = ((Collection)paramIterable).size();
        if ((paramList instanceof ArrayList)) {
          ((ArrayList)paramList).ensureCapacity(paramList.size() + j);
        }
        if ((paramList instanceof zzot)) {
          ((zzot)paramList).zzf(paramList.size() + j);
        }
      }
      int k = paramList.size();
      if (((paramIterable instanceof List)) && ((paramIterable instanceof RandomAccess)))
      {
        localObject = (List)paramIterable;
        j = ((List)localObject).size();
      }
      while (i < j)
      {
        paramIterable = ((List)localObject).get(i);
        if (paramIterable == null) {
          zze(paramList, k);
        }
        paramList.add(paramIterable);
        i++;
        continue;
        localObject = paramIterable.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramIterable = ((Iterator)localObject).next();
          if (paramIterable == null) {
            zze(paramList, k);
          }
          paramList.add(paramIterable);
        }
      }
      return;
    }
    paramList.addAll((Collection)paramIterable);
  }
  
  private static void zze(List paramList, int paramInt)
  {
    String str = j.h("Element at index ", paramList.size() - paramInt, " is null.");
    int i = paramList.size();
    for (;;)
    {
      i--;
      if (i < paramInt) {
        break;
      }
      paramList.remove(i);
    }
    throw new NullPointerException(str);
  }
  
  public abstract zzkn zza();
  
  public abstract zzkn zzb(zzko paramzzko);
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */