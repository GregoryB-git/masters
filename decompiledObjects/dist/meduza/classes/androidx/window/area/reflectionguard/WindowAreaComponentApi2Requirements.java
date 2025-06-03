package androidx.window.area.reflectionguard;

import android.app.Activity;
import androidx.window.extensions.core.util.function.Consumer;

public abstract interface WindowAreaComponentApi2Requirements
{
  public abstract void addRearDisplayStatusListener(Consumer<Integer> paramConsumer);
  
  public abstract void endRearDisplaySession();
  
  public abstract void removeRearDisplayStatusListener(Consumer<Integer> paramConsumer);
  
  public abstract void startRearDisplaySession(Activity paramActivity, Consumer<Integer> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.window.area.reflectionguard.WindowAreaComponentApi2Requirements
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */