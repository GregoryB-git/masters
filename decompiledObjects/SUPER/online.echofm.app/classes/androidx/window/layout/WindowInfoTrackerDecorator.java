package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface WindowInfoTrackerDecorator
{
  @NotNull
  public abstract WindowInfoTracker decorate(@NotNull WindowInfoTracker paramWindowInfoTracker);
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowInfoTrackerDecorator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */