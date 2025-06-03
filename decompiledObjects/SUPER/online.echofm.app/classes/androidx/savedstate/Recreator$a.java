package androidx.savedstate;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class Recreator$a
  implements SavedStateRegistry.b
{
  public final Set a = new HashSet();
  
  public Recreator$a(SavedStateRegistry paramSavedStateRegistry)
  {
    paramSavedStateRegistry.d("androidx.savedstate.Restarter", this);
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("classes_to_restore", new ArrayList(a));
    return localBundle;
  }
  
  public void b(String paramString)
  {
    a.add(paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.Recreator.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */