package com.google.android.recaptcha.internal;

import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.k;
import sb.m;
import sb.s;
import va.a;

public final class zzgy
  implements zzgx
{
  public static final zzgy zza = new zzgy();
  
  private static final List zzc(Object paramObject)
  {
    boolean bool = paramObject instanceof byte[];
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    ArrayList localArrayList;
    if (bool)
    {
      localObject = (byte[])paramObject;
      i.e(localObject, "<this>");
      i = localObject.length;
      if (i != 0)
      {
        if (i != 1)
        {
          localArrayList = new ArrayList(localObject.length);
          i = localObject.length;
          for (;;)
          {
            paramObject = localArrayList;
            if (n >= i) {
              break;
            }
            localArrayList.add(Byte.valueOf(localObject[n]));
            n++;
          }
        }
        paramObject = a.f(Byte.valueOf(localObject[0]));
      }
      else
      {
        paramObject = s.a;
      }
    }
    else
    {
      if ((paramObject instanceof short[]))
      {
        localObject = (short[])paramObject;
        i.e(localObject, "<this>");
        n = localObject.length;
        if (n != 0)
        {
          if (n != 1)
          {
            localArrayList = new ArrayList(localObject.length);
            j = localObject.length;
            for (n = i;; n++)
            {
              paramObject = localArrayList;
              if (n >= j) {
                break;
              }
              localArrayList.add(Short.valueOf(localObject[n]));
            }
          }
          paramObject = a.f(Short.valueOf(localObject[0]));
        }
        else
        {
          paramObject = s.a;
        }
      }
      for (;;)
      {
        break;
        if ((paramObject instanceof int[]))
        {
          localObject = (int[])paramObject;
          i.e(localObject, "<this>");
          n = localObject.length;
          if (n != 0)
          {
            if (n != 1)
            {
              localArrayList = new ArrayList(localObject.length);
              i = localObject.length;
              for (n = j;; n++)
              {
                paramObject = localArrayList;
                if (n >= i) {
                  break;
                }
                localArrayList.add(Integer.valueOf(localObject[n]));
              }
            }
            paramObject = a.f(Integer.valueOf(localObject[0]));
          }
          else
          {
            paramObject = s.a;
          }
        }
        else if ((paramObject instanceof long[]))
        {
          paramObject = k.q((long[])paramObject);
        }
        else if ((paramObject instanceof float[]))
        {
          localObject = (float[])paramObject;
          i.e(localObject, "<this>");
          n = localObject.length;
          if (n != 0)
          {
            if (n != 1)
            {
              localArrayList = new ArrayList(localObject.length);
              i = localObject.length;
              for (n = k;; n++)
              {
                paramObject = localArrayList;
                if (n >= i) {
                  break;
                }
                localArrayList.add(Float.valueOf(localObject[n]));
              }
            }
            paramObject = a.f(Float.valueOf(localObject[0]));
          }
          else
          {
            paramObject = s.a;
          }
        }
        else
        {
          if ((paramObject instanceof double[])) {
            break label459;
          }
          paramObject = null;
        }
      }
    }
    return (List)paramObject;
    label459:
    Object localObject = (double[])paramObject;
    i.e(localObject, "<this>");
    n = localObject.length;
    if (n != 0)
    {
      if (n != 1)
      {
        localArrayList = new ArrayList(localObject.length);
        i = localObject.length;
        for (n = m;; n++)
        {
          paramObject = localArrayList;
          if (n >= i) {
            break;
          }
          localArrayList.add(Double.valueOf(localObject[n]));
        }
      }
      paramObject = a.f(Double.valueOf(localObject[0]));
    }
    else
    {
      paramObject = s.a;
    }
    return (List)paramObject;
  }
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject1;
        if (true != localObject1 instanceof Object) {
          paramVarArgs = null;
        }
        if (paramVarArgs != null)
        {
          paramzzgd.zzc().zze(paramInt, zzb(localObject2, paramVarArgs));
          return;
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
  
  public final Object zzb(Object paramObject1, Object paramObject2)
  {
    List localList = zzc(paramObject1);
    Object localObject = zzc(paramObject2);
    boolean bool = paramObject1 instanceof Number;
    int i = 0;
    if (bool)
    {
      if ((paramObject2 instanceof Number))
      {
        paramObject1 = Double.valueOf(Math.pow(((Number)paramObject1).doubleValue(), ((Number)paramObject2).doubleValue()));
        break label318;
      }
      if (localObject != null)
      {
        paramObject2 = new ArrayList(m.j((Iterable)localObject));
        localObject = ((Iterable)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((ArrayList)paramObject2).add(Double.valueOf(Math.pow(((Number)((Iterator)localObject).next()).doubleValue(), ((Number)paramObject1).doubleValue())));
        }
        paramObject1 = ((ArrayList)paramObject2).toArray(new Double[0]);
        break label318;
      }
    }
    if ((localList != null) && ((paramObject2 instanceof Number)))
    {
      paramObject1 = new ArrayList(m.j(localList));
      localObject = localList.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((ArrayList)paramObject1).add(Double.valueOf(Math.pow(((Number)((Iterator)localObject).next()).doubleValue(), ((Number)paramObject2).doubleValue())));
      }
      paramObject1 = ((ArrayList)paramObject1).toArray(new Double[0]);
    }
    else
    {
      if ((localList == null) || (localObject == null)) {
        break label320;
      }
      zzgw.zza(this, localList.size(), ((List)localObject).size());
      int j = localList.size();
      paramObject1 = new Double[j];
      while (i < j)
      {
        paramObject1[i] = Double.valueOf(Math.pow(((Number)localList.get(i)).doubleValue(), ((Number)((List)localObject).get(i)).doubleValue()));
        i++;
      }
    }
    label318:
    return paramObject1;
    label320:
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */