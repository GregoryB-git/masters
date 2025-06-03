package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class EmptyDecorator
  implements WindowInfoTrackerDecorator
{
  @NotNull
  public static final EmptyDecorator INSTANCE = new EmptyDecorator();
  
  @NotNull
  public WindowInfoTracker decorate(@NotNull WindowInfoTracker paramWindowInfoTracker)
  {
    Intrinsics.checkNotNullParameter(paramWindowInfoTracker, "tracker");
    return paramWindowInfoTracker;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.EmptyDecorator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */