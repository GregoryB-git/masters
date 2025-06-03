package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.a;
import androidx.savedstate.c;
import java.util.Iterator;
import java.util.Set;

public final class SavedStateHandleController$a
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

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandleController.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */