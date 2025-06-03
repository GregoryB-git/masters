// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.Intrinsics;
import g6.l;
import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface WindowMetricsCalculator
{
    @NotNull
    public static final Companion Companion = WindowMetricsCalculator.Companion.$$INSTANCE;
    
    @NotNull
    WindowMetrics computeCurrentWindowMetrics(@NotNull final Activity p0);
    
    @NotNull
    WindowMetrics computeMaximumWindowMetrics(@NotNull final Activity p0);
    
    @Metadata
    public static final class Companion
    {
        static final /* synthetic */ Companion $$INSTANCE;
        @NotNull
        private static l decorator;
        
        static {
            $$INSTANCE = new Companion();
            Companion.decorator = (l)WindowMetricsCalculator$Companion$decorator.WindowMetricsCalculator$Companion$decorator$1.INSTANCE;
        }
        
        private Companion() {
        }
        
        @NotNull
        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator)Companion.decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }
        
        @ExperimentalWindowApi
        public final void overrideDecorator(@NotNull final WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
            Intrinsics.checkNotNullParameter(windowMetricsCalculatorDecorator, "overridingDecorator");
            Companion.decorator = (l)new WindowMetricsCalculator$Companion$overrideDecorator.WindowMetricsCalculator$Companion$overrideDecorator$1((Object)windowMetricsCalculatorDecorator);
        }
        
        @ExperimentalWindowApi
        public final void reset() {
            Companion.decorator = (l)WindowMetricsCalculator$Companion$reset.WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }
    }
}
