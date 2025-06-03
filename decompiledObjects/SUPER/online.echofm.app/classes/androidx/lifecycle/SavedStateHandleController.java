package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.a;
import androidx.savedstate.c;
import java.util.Iterator;
import java.util.Set;

final class SavedStateHandleController
  implements f
{
  public boolean o;
  
  public static void b(r paramr, SavedStateRegistry paramSavedStateRegistry, d paramd)
  {
    paramr = (SavedStateHandleController)paramr.c("androidx.lifecycle.savedstate.vm.tag");
    if ((paramr != null) && (!paramr.d()))
    {
      paramr.c(paramSavedStateRegistry, paramd);
      e(paramSavedStateRegistry, paramd);
    }
  }
  
  public static void e(final SavedStateRegistry paramSavedStateRegistry, d paramd)
  {
    d.c localc = paramd.b();
    if ((localc != d.c.p) && (!localc.c(d.c.r))) {
      paramd.a(new f()
      {
        public void a(h paramAnonymoush, d.b paramAnonymousb)
        {
          if (paramAnonymousb == d.b.ON_START)
          {
            c(this);
            paramSavedStateRegistry.e(SavedStateHandleController.a.class);
          }
        }
      });
    } else {
      paramSavedStateRegistry.e(a.class);
    }
  }
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_DESTROY)
    {
      o = false;
      paramh.g().c(this);
    }
  }
  
  public void c(SavedStateRegistry paramSavedStateRegistry, d paramd)
  {
    if (o) {
      throw new IllegalStateException("Already attached to lifecycleOwner");
    }
    o = true;
    paramd.a(this);
    throw null;
  }
  
  public boolean d()
  {
    return o;
  }
  
  public static final class a
    implements SavedStateRegistry.a
  {
    public void a(c paramc)
    {
      if ((paramc instanceof u))
      {
        t localt = ((u)paramc).d();
        SavedStateRegistry localSavedStateRegistry = paramc.k();
        Iterator localIterator = localt.c().iterator();
        while (localIterator.hasNext()) {
          SavedStateHandleController.b(localt.b((String)localIterator.next()), localSavedStateRegistry, paramc.g());
        }
        if (!localt.c().isEmpty()) {
          localSavedStateRegistry.e(a.class);
        }
        return;
      }
      throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandleController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */