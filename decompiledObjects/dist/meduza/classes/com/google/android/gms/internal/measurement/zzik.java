package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import n7.q;
import n7.r;
import n7.s;
import o7.l;
import o7.l.a;
import o7.o;
import o7.u.a;
import o7.x;
import o7.y;

public final class zzik
{
  public static final q<y<String, String>> zza;
  
  static
  {
    zzim localzzim = new zzim();
    Object localObject = localzzim;
    if (!(localzzim instanceof s)) {
      if ((localzzim instanceof r)) {
        localObject = localzzim;
      } else if ((localzzim instanceof Serializable)) {
        localObject = new r(localzzim);
      } else {
        localObject = new s(localzzim);
      }
    }
    zza = (q)localObject;
  }
  
  public static y zza()
  {
    Object localObject1 = new l().entrySet();
    if (((AbstractCollection)localObject1).isEmpty())
    {
      localObject1 = o.f;
    }
    else
    {
      Object localObject2 = (l.a)localObject1;
      localObject1 = new u.a(((l.a)localObject2).size());
      localObject2 = ((l.a)localObject2).iterator();
      int i = 0;
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
        Object localObject4 = ((Map.Entry)localObject3).getKey();
        localObject3 = x.q((Collection)((Map.Entry)localObject3).getValue());
        if (!((AbstractCollection)localObject3).isEmpty())
        {
          ((u.a)localObject1).b(localObject4, localObject3);
          i += ((AbstractCollection)localObject3).size();
        }
      }
      localObject1 = new y(((u.a)localObject1).a(), i);
    }
    return (y)localObject1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzik
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */