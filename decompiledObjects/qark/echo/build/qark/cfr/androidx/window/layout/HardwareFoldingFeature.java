/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class HardwareFoldingFeature
implements FoldingFeature {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Bounds featureBounds;
    @NotNull
    private final FoldingFeature.State state;
    @NotNull
    private final Type type;

    public HardwareFoldingFeature(@NotNull Bounds bounds, @NotNull Type type, @NotNull FoldingFeature.State state) {
        Intrinsics.checkNotNullParameter(bounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.featureBounds = bounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class class_ = object == null ? null : object.getClass();
        if (!Intrinsics.a(HardwareFoldingFeature.class, (Object)class_)) {
            return false;
        }
        if (object != null) {
            object = (HardwareFoldingFeature)object;
            if (!Intrinsics.a(this.featureBounds, object.featureBounds)) {
                return false;
            }
            if (!Intrinsics.a(this.type, object.type)) {
                return false;
            }
            if (!Intrinsics.a(this.getState(), object.getState())) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @NotNull
    @Override
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @NotNull
    @Override
    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() != 0 && this.featureBounds.getHeight() != 0) {
            return FoldingFeature.OcclusionType.FULL;
        }
        return FoldingFeature.OcclusionType.NONE;
    }

    @NotNull
    @Override
    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    @NotNull
    @Override
    public FoldingFeature.State getState() {
        return this.state;
    }

    @NotNull
    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (this.featureBounds.hashCode() * 31 + this.type.hashCode()) * 31 + this.getState().hashCode();
    }

    @Override
    public boolean isSeparating() {
        Type type = this.type;
        Type.Companion companion = Type.Companion;
        if (Intrinsics.a(type, companion.getHINGE())) {
            return true;
        }
        if (Intrinsics.a(this.type, companion.getFOLD()) && Intrinsics.a(this.getState(), FoldingFeature.State.HALF_OPENED)) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)HardwareFoldingFeature.class.getSimpleName());
        stringBuilder.append(" { ");
        stringBuilder.append((Object)this.featureBounds);
        stringBuilder.append(", type=");
        stringBuilder.append((Object)this.type);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.getState());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final void validateFeatureBounds$window_release(@NotNull Bounds bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            int n8 = bounds.getWidth();
            int n9 = 1;
            n8 = n8 == 0 && bounds.getHeight() == 0 ? 0 : 1;
            if (n8 != 0) {
                n8 = n9;
                if (bounds.getLeft() != 0) {
                    n8 = bounds.getTop() == 0 ? n9 : 0;
                }
                if (n8 != 0) {
                    return;
                }
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    @Metadata
    public static final class Type {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final Type FOLD = new Type("FOLD");
        @NotNull
        private static final Type HINGE = new Type("HINGE");
        @NotNull
        private final String description;

        private Type(String string2) {
            this.description = string2;
        }

        @NotNull
        public String toString() {
            return this.description;
        }

        @Metadata
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g g8) {
                this();
            }

            @NotNull
            public final Type getFOLD() {
                return FOLD;
            }

            @NotNull
            public final Type getHINGE() {
                return HINGE;
            }
        }

    }

}

