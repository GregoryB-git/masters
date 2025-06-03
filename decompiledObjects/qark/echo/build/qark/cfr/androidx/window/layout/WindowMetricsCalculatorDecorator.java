/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    @NotNull
    public WindowMetricsCalculator decorate(@NotNull WindowMetricsCalculator var1);
}

