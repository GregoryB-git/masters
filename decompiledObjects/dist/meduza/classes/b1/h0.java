package b1;

import android.os.BaseBundle;
import android.os.Bundle;
import c1.a;
import c1.a.a;
import c1.b;
import ec.i;
import java.util.LinkedHashMap;
import java.util.Map;
import s1.c;
import s1.c.b;
import s1.e;

public final class h0
{
  public static final b a = new b();
  public static final c b = new c();
  public static final a c = new a();
  
  public static final e0 a(b paramb)
  {
    Object localObject1 = a;
    Object localObject2 = (e)a.get(localObject1);
    if (localObject2 != null)
    {
      localObject1 = b;
      localObject1 = (t0)a.get(localObject1);
      if (localObject1 != null)
      {
        Object localObject3 = c;
        localObject3 = (Bundle)a.get(localObject3);
        Object localObject4 = r0.a;
        localObject4 = (String)a.get(localObject4);
        if (localObject4 != null)
        {
          paramb = ((e)localObject2).getSavedStateRegistry().b();
          if ((paramb instanceof i0)) {
            paramb = (i0)paramb;
          } else {
            paramb = null;
          }
          if (paramb != null)
          {
            j0 localj0 = c((t0)localObject1);
            localObject2 = (e0)d.get(localObject4);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = e0.f;
              paramb.b();
              localObject1 = c;
              if (localObject1 != null) {
                localObject1 = ((Bundle)localObject1).getBundle((String)localObject4);
              } else {
                localObject1 = null;
              }
              localObject2 = c;
              if (localObject2 != null) {
                ((Bundle)localObject2).remove((String)localObject4);
              }
              localObject2 = c;
              int i = 1;
              if ((localObject2 == null) || (((BaseBundle)localObject2).isEmpty() != true)) {
                i = 0;
              }
              if (i != 0) {
                c = null;
              }
              localObject1 = e0.a.a((Bundle)localObject1, (Bundle)localObject3);
              d.put(localObject4, localObject1);
            }
            return (e0)localObject1;
          }
          throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
      }
      throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
    }
    throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
  }
  
  public static final <T extends e,  extends t0> void b(T paramT)
  {
    i.e(paramT, "<this>");
    Object localObject = paramT.getLifecycle().b();
    int i;
    if ((localObject != k.b.b) && (localObject != k.b.c)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if (paramT.getSavedStateRegistry().b() == null)
      {
        localObject = new i0(paramT.getSavedStateRegistry(), (t0)paramT);
        paramT.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", (c.b)localObject);
        paramT.getLifecycle().a(new f0((i0)localObject));
      }
      return;
    }
    throw new IllegalArgumentException("Failed requirement.".toString());
  }
  
  public static final j0 c(t0 paramt0)
  {
    i.e(paramt0, "<this>");
    d locald = new d();
    s0 locals0 = paramt0.getViewModelStore();
    if ((paramt0 instanceof h)) {
      paramt0 = ((h)paramt0).getDefaultViewModelCreationExtras();
    } else {
      paramt0 = a.a.b;
    }
    return (j0)new q0(locals0, locald, paramt0).b(j0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
  }
  
  public static final class a {}
  
  public static final class b {}
  
  public static final class c {}
  
  public static final class d
    implements q0.b
  {
    public final o0 a(Class paramClass)
    {
      throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
    
    public final o0 b(Class paramClass, b paramb)
    {
      return new j0();
    }
  }
}

/* Location:
 * Qualified Name:     b1.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */