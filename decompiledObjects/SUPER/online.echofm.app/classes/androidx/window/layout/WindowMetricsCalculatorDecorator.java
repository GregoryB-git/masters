package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public abstract interface WindowMetricsCalculatorDecorator
{
  @ExperimentalWindowApi
  @NotNull
  public abstract WindowMetricsCalculator decorate(@NotNull WindowMetricsCalculator paramWindowMetricsCalculator);
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowMetricsCalculatorDecorator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */