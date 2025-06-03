package androidx.savedstate;

import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class SavedStateRegistry$1
  implements f
{
  public SavedStateRegistry$1(SavedStateRegistry paramSavedStateRegistry) {}
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_START) {
      paramh = o;
    }
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      break;
      if (paramb != d.b.ON_STOP) {
        break;
      }
      paramh = o;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.SavedStateRegistry.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */