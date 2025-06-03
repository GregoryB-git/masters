package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import m6.c;
import org.jetbrains.annotations.NotNull;
import s6.b;

@Metadata
public abstract interface WindowInfoTracker
{
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  @NotNull
  public abstract b windowLayoutInfo(@NotNull Activity paramActivity);
  
  @Metadata
  public static final class Companion
  {
    private static final boolean DEBUG = false;
    private static final String TAG = v.b(WindowInfoTracker.class).a();
    @NotNull
    private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;
    
    @NotNull
    public final WindowInfoTracker getOrCreate(@NotNull Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      paramContext = new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(paramContext));
      return decorator.decorate(paramContext);
    }
    
    public final void overrideDecorator(@NotNull WindowInfoTrackerDecorator paramWindowInfoTrackerDecorator)
    {
      Intrinsics.checkNotNullParameter(paramWindowInfoTrackerDecorator, "overridingDecorator");
      decorator = paramWindowInfoTrackerDecorator;
    }
    
    public final void reset()
    {
      decorator = EmptyDecorator.INSTANCE;
    }
    
    @NotNull
    public final WindowBackend windowBackend$window_release(@NotNull Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Object localObject1 = null;
      Object localObject4;
      try
      {
        WindowLayoutComponent localWindowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        Object localObject2;
        if (localWindowLayoutComponent == null)
        {
          localObject2 = localObject1;
        }
        else
        {
          localObject2 = new androidx/window/layout/ExtensionWindowLayoutInfoBackend;
          ((ExtensionWindowLayoutInfoBackend)localObject2).<init>(localWindowLayoutComponent);
        }
      }
      finally
      {
        localObject4 = localObject1;
        if (DEBUG)
        {
          Log.d(TAG, "Failed to load WindowExtensions");
          localObject4 = localObject1;
        }
      }
      localObject1 = localObject4;
      if (localObject4 == null) {
        localObject1 = SidecarWindowBackend.Companion.getInstance(paramContext);
      }
      return (WindowBackend)localObject1;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowInfoTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */