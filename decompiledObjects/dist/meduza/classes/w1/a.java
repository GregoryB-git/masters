package w1;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Trace;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{
  public static volatile a d;
  public static final Object e = new Object();
  public final HashMap a;
  public final HashSet b;
  public final Context c;
  
  public a(Context paramContext)
  {
    c = paramContext.getApplicationContext();
    b = new HashSet();
    a = new HashMap();
  }
  
  public static a c(Context paramContext)
  {
    if (d == null) {
      synchronized (e)
      {
        if (d == null)
        {
          a locala = new w1/a;
          locala.<init>(paramContext);
          d = locala;
        }
      }
    }
    return d;
  }
  
  public final void a(Bundle paramBundle)
  {
    String str = c.getString(2131886114);
    if (paramBundle != null) {
      try
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        Iterator localIterator = paramBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (String)localIterator.next();
          if (str.equals(paramBundle.getString((String)localObject, null)))
          {
            localObject = Class.forName((String)localObject);
            if (b.class.isAssignableFrom((Class)localObject)) {
              b.add(localObject);
            }
          }
        }
        paramBundle = b.iterator();
        while (paramBundle.hasNext()) {
          b((Class)paramBundle.next(), localHashSet);
        }
        return;
      }
      catch (ClassNotFoundException paramBundle)
      {
        throw new c(paramBundle);
      }
    }
  }
  
  public final Object b(Class paramClass, HashSet paramHashSet)
  {
    if (z1.a.b()) {}
    try
    {
      Trace.beginSection(z1.a.c(paramClass.getSimpleName()));
      if (!paramHashSet.contains(paramClass))
      {
        if (!a.containsKey(paramClass))
        {
          paramHashSet.add(paramClass);
          try
          {
            Object localObject1 = (b)paramClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Object localObject2 = ((b)localObject1).a();
            if (!((List)localObject2).isEmpty())
            {
              Iterator localIterator = ((List)localObject2).iterator();
              while (localIterator.hasNext())
              {
                localObject2 = (Class)localIterator.next();
                if (!a.containsKey(localObject2)) {
                  b((Class)localObject2, paramHashSet);
                }
              }
            }
            label168:
            paramClass = a.get(paramClass);
          }
          finally
          {
            break label168;
            localObject1 = ((b)localObject1).b(c);
            paramHashSet.remove(paramClass);
            a.put(paramClass, localObject1);
            paramClass = (Class)localObject1;
            break label188;
            paramClass = new w1/c;
            paramClass.<init>(paramHashSet);
          }
        }
        label188:
        return paramClass;
      }
      paramClass = String.format("Cannot initialize %s. Cycle detected.", new Object[] { paramClass.getName() });
      paramHashSet = new java/lang/IllegalStateException;
      paramHashSet.<init>(paramClass);
      throw paramHashSet;
    }
    finally
    {
      Trace.endSection();
    }
  }
}

/* Location:
 * Qualified Name:     w1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */