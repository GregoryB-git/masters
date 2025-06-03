package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowMetricsCalculator$Companion
{
  @NotNull
  private static g6.l decorator = decorator.1.INSTANCE;
  
  @NotNull
  public final WindowMetricsCalculator getOrCreate()
  {
    return (WindowMetricsCalculator)decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
  }
  
  @ExperimentalWindowApi
  public final void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator paramWindowMetricsCalculatorDecorator)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 53
    //   3: invokestatic 59	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: new 11	androidx/window/layout/WindowMetricsCalculator$Companion$overrideDecorator$1
    //   9: dup
    //   10: aload_1
    //   11: invokespecial 62	androidx/window/layout/WindowMetricsCalculator$Companion$overrideDecorator$1:<init>	(Ljava/lang/Object;)V
    //   14: putstatic 32	androidx/window/layout/WindowMetricsCalculator$Companion:decorator	Lg6/l;
    //   17: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	18	0	this	Companion
    //   0	18	1	paramWindowMetricsCalculatorDecorator	WindowMetricsCalculatorDecorator
  }
  
  @ExperimentalWindowApi
  public final void reset()
  {
    decorator = reset.1.INSTANCE;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowMetricsCalculator.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */