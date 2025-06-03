package s1;

import android.os.BaseBundle;
import android.os.Bundle;
import b1.i.a;
import ec.i;
import f;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import n.b;
import n.b.e;

public final class c
{
  public final b<String, b> a = new b();
  public boolean b;
  public Bundle c;
  public boolean d;
  public a.a e;
  public boolean f = true;
  
  public final Bundle a(String paramString)
  {
    if (d)
    {
      Bundle localBundle1 = c;
      if (localBundle1 != null)
      {
        localBundle1 = localBundle1.getBundle(paramString);
        Bundle localBundle2 = c;
        if (localBundle2 != null) {
          localBundle2.remove(paramString);
        }
        paramString = c;
        int i = 0;
        int j = i;
        if (paramString != null)
        {
          j = i;
          if (!paramString.isEmpty()) {
            j = 1;
          }
        }
        if (j == 0) {
          c = null;
        }
        return localBundle1;
      }
      return null;
    }
    throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
  }
  
  public final b b()
  {
    Iterator localIterator = a.iterator();
    String str;
    do
    {
      localObject = (b.e)localIterator;
      if (!((b.e)localObject).hasNext()) {
        break;
      }
      localObject = (Map.Entry)((b.e)localObject).next();
      i.d(localObject, "components");
      str = (String)((Map.Entry)localObject).getKey();
      localObject = (b)((Map.Entry)localObject).getValue();
    } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
    return (b)localObject;
    Object localObject = null;
    return (b)localObject;
  }
  
  public final void c(String paramString, b paramb)
  {
    i.e(paramString, "key");
    i.e(paramb, "provider");
    int i;
    if ((b)a.h(paramString, paramb) == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
  }
  
  public final void d()
  {
    if (f)
    {
      Object localObject1 = e;
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new a.a(this);
      }
      e = ((a.a)localObject2);
      try
      {
        i.a.class.getDeclaredConstructor(new Class[0]);
        localObject2 = e;
        if (localObject2 != null)
        {
          localObject1 = i.a.class.getName();
          a.add(localObject1);
        }
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject1 = f.l("Class ");
        ((StringBuilder)localObject1).append(i.a.class.getSimpleName());
        ((StringBuilder)localObject1).append(" must have default constructor in order to be automatically recreated");
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString(), localNoSuchMethodException);
      }
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
  }
  
  public static abstract interface a
  {
    public abstract void a(e parame);
  }
  
  public static abstract interface b
  {
    public abstract Bundle a();
  }
}

/* Location:
 * Qualified Name:     s1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */