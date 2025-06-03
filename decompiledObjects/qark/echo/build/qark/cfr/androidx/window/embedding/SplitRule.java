/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.WindowMetrics
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 */
package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingRule;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public class SplitRule
extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public SplitRule(int n8, int n9, float f8, int n10) {
        this.minWidth = n8;
        this.minSmallestWidth = n9;
        this.splitRatio = f8;
        this.layoutDirection = n10;
    }

    public /* synthetic */ SplitRule(int n8, int n9, float f8, int n10, int n11, g g8) {
        if ((n11 & 1) != 0) {
            n8 = 0;
        }
        if ((n11 & 2) != 0) {
            n9 = 0;
        }
        if ((n11 & 4) != 0) {
            f8 = 0.5f;
        }
        if ((n11 & 8) != 0) {
            n10 = 3;
        }
        this(n8, n9, f8, n10);
    }

    public final boolean checkParentMetrics(@NotNull WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter((Object)windowMetrics, "parentMetrics");
        int n8 = Build.VERSION.SDK_INT;
        boolean bl = false;
        if (n8 <= 30) {
            return false;
        }
        windowMetrics = Api30Impl.INSTANCE.getBounds(windowMetrics);
        n8 = this.minWidth != 0 && windowMetrics.width() < this.minWidth ? 0 : 1;
        boolean bl2 = this.minSmallestWidth == 0 || Math.min((int)windowMetrics.width(), (int)windowMetrics.height()) >= this.minSmallestWidth;
        boolean bl3 = bl;
        if (n8 != 0) {
            bl3 = bl;
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SplitRule)) {
            return false;
        }
        int n8 = this.minWidth;
        object = (SplitRule)object;
        if (n8 != object.minWidth) {
            return false;
        }
        if (this.minSmallestWidth != object.minSmallestWidth) {
            return false;
        }
        if (this.splitRatio == object.splitRatio) {
            if (this.layoutDirection != object.layoutDirection) {
                return false;
            }
            return true;
        }
        return false;
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

    public int hashCode() {
        return ((this.minWidth * 31 + this.minSmallestWidth) * 31 + Float.floatToIntBits((float)this.splitRatio)) * 31 + this.layoutDirection;
    }

    @Metadata
    public static final class Api30Impl {
        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @NotNull
        public final Rect getBounds(@NotNull WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter((Object)windowMetrics, "windowMetrics");
            windowMetrics = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue((Object)windowMetrics, "windowMetrics.bounds");
            return windowMetrics;
        }
    }

    @Retention(value=RetentionPolicy.SOURCE)
    @Metadata
    public static @interface LayoutDir {
    }

}

