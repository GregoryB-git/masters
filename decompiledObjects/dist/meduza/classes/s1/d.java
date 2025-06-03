package s1;

import android.os.BaseBundle;
import android.os.Bundle;
import b1.k;
import b1.k.b;
import b1.o;
import ec.i;
import f;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import n.b.d;

public final class d
{
  public final e a;
  public final c b;
  public boolean c;
  
  public d(e parame)
  {
    a = parame;
    b = new c();
  }
  
  public final void a()
  {
    k localk = a.getLifecycle();
    int i;
    if (localk.b() == k.b.b) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localk.a(new a(a));
      c localc = b;
      localc.getClass();
      if ((b ^ true))
      {
        localk.a(new b(localc));
        b = true;
        c = true;
        return;
      }
      throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
  }
  
  public final void b(Bundle paramBundle)
  {
    if (!c) {
      a();
    }
    Object localObject = a.getLifecycle();
    int i;
    if (((k)localObject).b().compareTo(k.b.d) >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i ^ 0x1) != 0)
    {
      localObject = b;
      if (b)
      {
        if ((d ^ true))
        {
          if (paramBundle != null) {
            paramBundle = paramBundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
          } else {
            paramBundle = null;
          }
          c = paramBundle;
          d = true;
          return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
      }
      throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }
    paramBundle = f.l("performRestore cannot be called when owner is ");
    paramBundle.append(((k)localObject).b());
    throw new IllegalStateException(paramBundle.toString().toString());
  }
  
  public final void c(Bundle paramBundle)
  {
    i.e(paramBundle, "outBundle");
    Object localObject1 = b;
    localObject1.getClass();
    Bundle localBundle = new Bundle();
    Object localObject2 = c;
    if (localObject2 != null) {
      localBundle.putAll((Bundle)localObject2);
    }
    localObject1 = a;
    localObject1.getClass();
    localObject2 = new b.d((n.b)localObject1);
    c.put(localObject2, Boolean.FALSE);
    while (((b.d)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((b.d)localObject2).next();
      localBundle.putBundle((String)((Map.Entry)localObject1).getKey(), ((c.b)((Map.Entry)localObject1).getValue()).a());
    }
    if (!localBundle.isEmpty()) {
      paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     s1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */