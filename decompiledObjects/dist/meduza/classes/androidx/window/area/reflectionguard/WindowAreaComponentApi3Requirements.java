package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;

public abstract interface WindowAreaComponentApi3Requirements
  extends WindowAreaComponentApi2Requirements
{
  public abstract void addRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> paramConsumer);
  
  public abstract void endRearDisplayPresentationSession();
  
  public abstract DisplayMetrics getRearDisplayMetrics();
  
  public abstract ExtensionWindowAreaPresentation getRearDisplayPresentation();
  
  public abstract void removeRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> paramConsumer);
  
  public abstract void startRearDisplayPresentationSession(Activity paramActivity, Consumer<Integer> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.window.area.reflectionguard.WindowAreaComponentApi3Requirements
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */