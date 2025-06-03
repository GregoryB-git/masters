package b1;

import android.app.Application;
import android.os.Bundle;
import c1.b;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import s1.c;
import s1.e;

public final class k0
  extends q0.d
  implements q0.b
{
  public Application a;
  public final q0.a b;
  public Bundle c;
  public k d;
  public c e;
  
  public k0(Application paramApplication, e parame, Bundle paramBundle)
  {
    e = parame.getSavedStateRegistry();
    d = parame.getLifecycle();
    c = paramBundle;
    a = paramApplication;
    if (paramApplication != null)
    {
      if (q0.a.c == null) {
        q0.a.c = new q0.a(paramApplication);
      }
      paramApplication = q0.a.c;
      ec.i.b(paramApplication);
    }
    else
    {
      paramApplication = new q0.a(null);
    }
    b = paramApplication;
  }
  
  public final <T extends o0> T a(Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null) {
      return d(paramClass, str);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public final o0 b(Class paramClass, b paramb)
  {
    Object localObject1 = r0.a;
    localObject1 = (String)a.get(localObject1);
    if (localObject1 != null)
    {
      Object localObject2 = h0.a;
      if (a.get(localObject2) != null)
      {
        localObject2 = h0.b;
        if (a.get(localObject2) != null)
        {
          localObject1 = p0.a;
          localObject2 = (Application)a.get(localObject1);
          boolean bool = a.class.isAssignableFrom(paramClass);
          if ((bool) && (localObject2 != null)) {
            localObject1 = l0.a;
          } else {
            localObject1 = l0.b;
          }
          localObject1 = l0.a(paramClass, (List)localObject1);
          if (localObject1 == null) {
            return b.b(paramClass, paramb);
          }
          if ((bool) && (localObject2 != null))
          {
            paramClass = l0.b(paramClass, (Constructor)localObject1, new Object[] { localObject2, h0.a(paramb) });
            break label189;
          }
          paramClass = l0.b(paramClass, (Constructor)localObject1, new Object[] { h0.a(paramb) });
          break label189;
        }
      }
      if (d != null)
      {
        paramClass = d(paramClass, (String)localObject1);
        label189:
        return paramClass;
      }
      throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }
    throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
  }
  
  public final void c(o0 paramo0)
  {
    if (d != null)
    {
      c localc = e;
      ec.i.b(localc);
      k localk = d;
      ec.i.b(localk);
      i.a(paramo0, localc, localk);
    }
  }
  
  public final o0 d(Class paramClass, String paramString)
  {
    ??? = d;
    if (??? != null)
    {
      boolean bool = a.class.isAssignableFrom(paramClass);
      if ((bool) && (a != null)) {
        localObject2 = l0.a;
      } else {
        localObject2 = l0.b;
      }
      Object localObject2 = l0.a(paramClass, (List)localObject2);
      if (localObject2 == null)
      {
        if (a != null)
        {
          paramClass = b.a(paramClass);
        }
        else
        {
          if (q0.c.a == null) {
            q0.c.a = new q0.c();
          }
          paramString = q0.c.a;
          ec.i.b(paramString);
          paramClass = paramString.a(paramClass);
        }
        return paramClass;
      }
      c localc = e;
      ec.i.b(localc);
      Bundle localBundle = c;
      Object localObject3 = localc.a(paramString);
      Object localObject4 = e0.f;
      localObject4 = e0.a.a((Bundle)localObject3, localBundle);
      paramString = new g0(paramString, (e0)localObject4);
      paramString.b((k)???, localc);
      localObject3 = ((k)???).b();
      if (localObject3 != k.b.b)
      {
        int i;
        if (((Enum)localObject3).compareTo(k.b.d) >= 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          ((k)???).a(new j((k)???, localc));
          break label227;
        }
      }
      localc.d();
      label227:
      if (bool)
      {
        ??? = a;
        if (??? != null)
        {
          paramClass = l0.b(paramClass, (Constructor)localObject2, new Object[] { ???, localObject4 });
          break label280;
        }
      }
      paramClass = l0.b(paramClass, (Constructor)localObject2, new Object[] { localObject4 });
      label280:
      synchronized (a)
      {
        localObject2 = a.get("androidx.lifecycle.savedstate.vm.tag");
        if (localObject2 == null) {
          a.put("androidx.lifecycle.savedstate.vm.tag", paramString);
        }
        if (localObject2 != null) {
          paramString = (String)localObject2;
        }
        if (c) {
          o0.a(paramString);
        }
        return paramClass;
      }
    }
    throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
  }
}

/* Location:
 * Qualified Name:     b1.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */