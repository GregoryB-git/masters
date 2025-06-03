package androidx.savedstate;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.Iterator;
import java.util.Map.Entry;
import n.b;
import n.b.d;

public final class SavedStateRegistry
{
  public b a = new b();
  public Bundle b;
  public boolean c;
  public Recreator.a d;
  public boolean e = true;
  
  public Bundle a(String paramString)
  {
    if (c)
    {
      Bundle localBundle = b;
      if (localBundle != null)
      {
        localBundle = localBundle.getBundle(paramString);
        b.remove(paramString);
        if (b.isEmpty()) {
          b = null;
        }
        return localBundle;
      }
      return null;
    }
    throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
  }
  
  public void b(d paramd, Bundle paramBundle)
  {
    if (!c)
    {
      if (paramBundle != null) {
        b = paramBundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
      }
      paramd.a(new f()
      {
        public void a(h paramAnonymoush, d.b paramAnonymousb)
        {
          if (paramAnonymousb == d.b.ON_START) {
            paramAnonymoush = SavedStateRegistry.this;
          }
          for (boolean bool = true;; bool = false)
          {
            e = bool;
            break;
            if (paramAnonymousb != d.b.ON_STOP) {
              break;
            }
            paramAnonymoush = SavedStateRegistry.this;
          }
        }
      });
      c = true;
      return;
    }
    throw new IllegalStateException("SavedStateRegistry was already restored.");
  }
  
  public void c(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    Object localObject = b;
    if (localObject != null) {
      localBundle.putAll((Bundle)localObject);
    }
    b.d locald = a.f();
    while (locald.hasNext())
    {
      localObject = (Map.Entry)locald.next();
      localBundle.putBundle((String)((Map.Entry)localObject).getKey(), ((b)((Map.Entry)localObject).getValue()).a());
    }
    paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", localBundle);
  }
  
  public void d(String paramString, b paramb)
  {
    if ((b)a.k(paramString, paramb) == null) {
      return;
    }
    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
  }
  
  public void e(Class paramClass)
  {
    if (e)
    {
      if (d == null) {
        d = new Recreator.a(this);
      }
      try
      {
        paramClass.getDeclaredConstructor(new Class[0]);
        d.b(paramClass.getName());
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Class");
        localStringBuilder.append(paramClass.getSimpleName());
        localStringBuilder.append(" must have default constructor in order to be automatically recreated");
        throw new IllegalArgumentException(localStringBuilder.toString(), localNoSuchMethodException);
      }
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  public static abstract interface a
  {
    public abstract void a(c paramc);
  }
  
  public static abstract interface b
  {
    public abstract Bundle a();
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.SavedStateRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */