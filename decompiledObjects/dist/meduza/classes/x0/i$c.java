package x0;

import android.os.Bundle;
import b1.h0;
import s1.d;

public final class i$c
  extends i.m
{
  public i$c(i parami) {}
  
  public final void a()
  {
    a.mSavedStateRegistryController.a();
    h0.b(a);
    Bundle localBundle = a.mSavedFragmentState;
    if (localBundle != null) {
      localBundle = localBundle.getBundle("registryState");
    } else {
      localBundle = null;
    }
    a.mSavedStateRegistryController.b(localBundle);
  }
}

/* Location:
 * Qualified Name:     x0.i.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */