package androidx.window.layout;

import android.view.DisplayCutout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class DisplayCompatHelperApi28
{
  @NotNull
  public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();
  
  public final int safeInsetBottom(@NotNull DisplayCutout paramDisplayCutout)
  {
    Intrinsics.checkNotNullParameter(paramDisplayCutout, "displayCutout");
    return f.a(paramDisplayCutout);
  }
  
  public final int safeInsetLeft(@NotNull DisplayCutout paramDisplayCutout)
  {
    Intrinsics.checkNotNullParameter(paramDisplayCutout, "displayCutout");
    return g.a(paramDisplayCutout);
  }
  
  public final int safeInsetRight(@NotNull DisplayCutout paramDisplayCutout)
  {
    Intrinsics.checkNotNullParameter(paramDisplayCutout, "displayCutout");
    return e.a(paramDisplayCutout);
  }
  
  public final int safeInsetTop(@NotNull DisplayCutout paramDisplayCutout)
  {
    Intrinsics.checkNotNullParameter(paramDisplayCutout, "displayCutout");
    return h.a(paramDisplayCutout);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.DisplayCompatHelperApi28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */