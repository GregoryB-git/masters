package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class DisplayCompatHelperApi17
{
  @NotNull
  public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();
  
  public final void getRealSize(@NotNull Display paramDisplay, @NotNull Point paramPoint)
  {
    Intrinsics.checkNotNullParameter(paramDisplay, "display");
    Intrinsics.checkNotNullParameter(paramPoint, "point");
    paramDisplay.getRealSize(paramPoint);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.DisplayCompatHelperApi17
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */