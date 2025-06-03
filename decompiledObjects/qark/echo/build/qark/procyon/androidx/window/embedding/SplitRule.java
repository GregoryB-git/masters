// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.Rect;
import android.os.Build$VERSION;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import android.view.WindowMetrics;
import kotlin.jvm.internal.g;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public class SplitRule extends EmbeddingRule
{
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;
    
    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }
    
    public SplitRule(final int minWidth, final int minSmallestWidth, final float splitRatio, final int layoutDirection) {
        this.minWidth = minWidth;
        this.minSmallestWidth = minSmallestWidth;
        this.splitRatio = splitRatio;
        this.layoutDirection = layoutDirection;
    }
    
    public final boolean checkParentMetrics(@NotNull final WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(windowMetrics, "parentMetrics");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT <= 30) {
            return false;
        }
        final Rect bounds = Api30Impl.INSTANCE.getBounds(windowMetrics);
        final boolean b2 = this.minWidth == 0 || bounds.width() >= this.minWidth;
        final boolean b3 = this.minSmallestWidth == 0 || Math.min(bounds.width(), bounds.height()) >= this.minSmallestWidth;
        boolean b4 = b;
        if (b2) {
            b4 = b;
            if (b3) {
                b4 = true;
            }
        }
        return b4;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitRule)) {
            return false;
        }
        final int minWidth = this.minWidth;
        final SplitRule splitRule = (SplitRule)o;
        return minWidth == splitRule.minWidth && this.minSmallestWidth == splitRule.minSmallestWidth && this.splitRatio == splitRule.splitRatio && this.layoutDirection == splitRule.layoutDirection;
    }
    
    public final int getLayoutDirection() {
        return this.layoutDirection;
    }
    
    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }
    
    public final int getMinWidth() {
        return this.minWidth;
    }
    
    public final float getSplitRatio() {
        return this.splitRatio;
    }
    
    @Override
    public int hashCode() {
        return ((this.minWidth * 31 + this.minSmallestWidth) * 31 + Float.floatToIntBits(this.splitRatio)) * 31 + this.layoutDirection;
    }
    
    @Metadata
    public static final class Api30Impl
    {
        @NotNull
        public static final Api30Impl INSTANCE;
        
        static {
            INSTANCE = new Api30Impl();
        }
        
        private Api30Impl() {
        }
        
        @NotNull
        public final Rect getBounds(@NotNull final WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            final Rect bounds = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    public @interface LayoutDir {
    }
}
