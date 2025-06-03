package m9;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
  implements ComponentCallbacks2
{
  public c(AtomicBoolean paramAtomicBoolean) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if (paramInt == 20) {
      a.set(true);
    }
  }
}

/* Location:
 * Qualified Name:     m9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */