package androidx.window.layout;

import H.a;
import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarWindowBackend$WindowLayoutChangeCallbackWrapper
{
  @NotNull
  private final Activity activity;
  @NotNull
  private final a callback;
  @NotNull
  private final Executor executor;
  private WindowLayoutInfo lastInfo;
  
  public SidecarWindowBackend$WindowLayoutChangeCallbackWrapper(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    activity = paramActivity;
    executor = paramExecutor;
    callback = parama;
  }
  
  private static final void accept$lambda-0(WindowLayoutChangeCallbackWrapper paramWindowLayoutChangeCallbackWrapper, WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramWindowLayoutChangeCallbackWrapper, "this$0");
    Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "$newLayoutInfo");
    paramWindowLayoutChangeCallbackWrapper.getCallback().accept(paramWindowLayoutInfo);
  }
  
  public final void accept(@NotNull WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "newLayoutInfo");
    lastInfo = paramWindowLayoutInfo;
    executor.execute(new i(this, paramWindowLayoutInfo));
  }
  
  @NotNull
  public final Activity getActivity()
  {
    return activity;
  }
  
  @NotNull
  public final a getCallback()
  {
    return callback;
  }
  
  public final WindowLayoutInfo getLastInfo()
  {
    return lastInfo;
  }
  
  public final void setLastInfo(WindowLayoutInfo paramWindowLayoutInfo)
  {
    lastInfo = paramWindowLayoutInfo;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */