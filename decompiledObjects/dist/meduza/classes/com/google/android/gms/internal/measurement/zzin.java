package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzin<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>>
  implements zzlp
{
  private final String zza(String paramString)
  {
    String str = getClass().getName();
    StringBuilder localStringBuilder = new StringBuilder("Reading ");
    localStringBuilder.append(str);
    localStringBuilder.append(" from a ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" threw an IOException (should never happen).");
    return localStringBuilder.toString();
  }
  
  public static <T> void zza(Iterable<T> paramIterable, List<? super T> paramList)
  {
    zzkj.zza(paramIterable);
    int i;
    int j;
    if ((paramIterable instanceof zzkx))
    {
      paramIterable = ((zzkx)paramIterable).zza();
      localObject = (zzkx)paramList;
      i = paramList.size();
      paramList = paramIterable.iterator();
      while (paramList.hasNext())
      {
        paramIterable = paramList.next();
        if (paramIterable == null)
        {
          j = ((List)localObject).size();
          paramIterable = new StringBuilder("Element at index ");
          paramIterable.append(j - i);
          paramIterable.append(" is null.");
          paramIterable = paramIterable.toString();
          for (j = ((List)localObject).size() - 1; j >= i; j--) {
            ((List)localObject).remove(j);
          }
          throw new NullPointerException(paramIterable);
        }
        if ((paramIterable instanceof zziy)) {}
        for (paramIterable = (zziy)paramIterable;; paramIterable = zziy.zza((byte[])paramIterable))
        {
          ((zzkx)localObject).zza(paramIterable);
          break;
          if (!(paramIterable instanceof byte[])) {
            break label180;
          }
        }
        label180:
        ((List)localObject).add((String)paramIterable);
      }
      return;
    }
    if ((paramIterable instanceof zzly))
    {
      paramList.addAll((Collection)paramIterable);
      return;
    }
    if ((paramIterable instanceof Collection))
    {
      j = ((Collection)paramIterable).size();
      if ((paramList instanceof ArrayList)) {
        ((ArrayList)paramList).ensureCapacity(paramList.size() + j);
      } else if ((paramList instanceof zzmd)) {
        ((zzmd)paramList).zzb(paramList.size() + j);
      }
    }
    int k = paramList.size();
    if (((paramIterable instanceof List)) && ((paramIterable instanceof RandomAccess)))
    {
      localObject = (List)paramIterable;
      i = ((List)localObject).size();
      for (j = 0; j < i; j++)
      {
        paramIterable = ((List)localObject).get(j);
        if (paramIterable == null) {
          zza(paramList, k);
        }
        paramList.add(paramIterable);
      }
      return;
    }
    Object localObject = paramIterable.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramIterable = ((Iterator)localObject).next();
      if (paramIterable == null) {
        zza(paramList, k);
      }
      paramList.add(paramIterable);
    }
  }
  
  private static void zza(List<?> paramList, int paramInt)
  {
    int i = paramList.size();
    Object localObject = new StringBuilder("Element at index ");
    ((StringBuilder)localObject).append(i - paramInt);
    ((StringBuilder)localObject).append(" is null.");
    localObject = ((StringBuilder)localObject).toString();
    for (i = paramList.size() - 1; i >= paramInt; i--) {
      paramList.remove(i);
    }
    throw new NullPointerException((String)localObject);
  }
  
  public abstract BuilderType zza(zzjk paramzzjk, zzjt paramzzjt);
  
  public BuilderType zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = zzjk.zza(paramArrayOfByte, 0, paramInt2, false);
      zzb(paramArrayOfByte, zzjt.zza);
      paramArrayOfByte.zzb(0);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException(zza("byte array"), paramArrayOfByte);
    }
    catch (zzkp paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
  }
  
  public BuilderType zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzjt paramzzjt)
  {
    try
    {
      paramArrayOfByte = zzjk.zza(paramArrayOfByte, 0, paramInt2, false);
      zzb(paramArrayOfByte, paramzzjt);
      paramArrayOfByte.zzb(0);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException(zza("byte array"), paramArrayOfByte);
    }
    catch (zzkp paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
  }
  
  public abstract BuilderType zzag();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */