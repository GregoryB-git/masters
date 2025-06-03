package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface ExtensionInterfaceCompat
{
  public abstract void onWindowLayoutChangeListenerAdded(@NotNull Activity paramActivity);
  
  public abstract void onWindowLayoutChangeListenerRemoved(@NotNull Activity paramActivity);
  
  public abstract void setExtensionCallback(@NotNull ExtensionCallbackInterface paramExtensionCallbackInterface);
  
  public abstract boolean validateExtensionInterface();
  
  @Metadata
  public static abstract interface ExtensionCallbackInterface
  {
    public abstract void onWindowLayoutChanged(@NotNull Activity paramActivity, @NotNull WindowLayoutInfo paramWindowLayoutInfo);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.ExtensionInterfaceCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */