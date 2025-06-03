/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.window.layout.WindowMetricsCalculator$Companion$decorator
 *  androidx.window.layout.WindowMetricsCalculator$Companion$overrideDecorator
 *  androidx.window.layout.WindowMetricsCalculator$Companion$reset
 *  java.lang.Object
 */
package androidx.window.layout;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import androidx.window.layout.WindowMetricsCalculatorDecorator;
import g6.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface WindowMetricsCalculator {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public WindowMetrics computeCurrentWindowMetrics(@NotNull Activity var1);

    @NotNull
    public WindowMetrics computeMaximumWindowMetrics(@NotNull Activity var1);

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE;
        @NotNull
        private static l decorator;

        static {
            $$INSTANCE = new Companion();
            decorator = Companion.decorator.INSTANCE;
        }

        private Companion() {
        }

        @NotNull
        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator)decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        public final void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
            Intrinsics.checkNotNullParameter(windowMetricsCalculatorDecorator, "overridingDecorator");
            decorator = new l(windowMetricsCalculatorDecorator){

                @NotNull
                public final WindowMetricsCalculator invoke(@NotNull WindowMetricsCalculator windowMetricsCalculator) {
                    Intrinsics.checkNotNullParameter(windowMetricsCalculator, "p0");
                    return ((WindowMetricsCalculatorDecorator)this.receiver).decorate(windowMetricsCalculator);
                }
            };
        }

        @ExperimentalWindowApi
        public final void reset() {
            decorator = Companion.reset.INSTANCE;
        }
    }

}

