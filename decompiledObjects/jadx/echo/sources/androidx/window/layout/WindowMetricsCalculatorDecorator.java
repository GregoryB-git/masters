package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata
/* loaded from: classes.dex */
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    @NotNull
    WindowMetricsCalculator decorate(@NotNull WindowMetricsCalculator windowMetricsCalculator);
}
