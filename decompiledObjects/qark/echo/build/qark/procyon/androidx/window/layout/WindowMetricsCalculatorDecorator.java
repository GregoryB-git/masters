// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public interface WindowMetricsCalculatorDecorator
{
    @ExperimentalWindowApi
    @NotNull
    WindowMetricsCalculator decorate(@NotNull final WindowMetricsCalculator p0);
}
