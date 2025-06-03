// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import androidx.window.core.Bounds;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class HardwareFoldingFeature implements FoldingFeature
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Bounds featureBounds;
    @NotNull
    private final State state;
    @NotNull
    private final Type type;
    
    static {
        Companion = new Companion(null);
    }
    
    public HardwareFoldingFeature(@NotNull final Bounds featureBounds, @NotNull final Type type, @NotNull final State state) {
        Intrinsics.checkNotNullParameter(featureBounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        HardwareFoldingFeature.Companion.validateFeatureBounds$window_release(featureBounds);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Object class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        if (!Intrinsics.a(HardwareFoldingFeature.class, class1)) {
            return false;
        }
        if (o != null) {
            final HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature)o;
            return Intrinsics.a(this.featureBounds, hardwareFoldingFeature.featureBounds) && Intrinsics.a(this.type, hardwareFoldingFeature.type) && Intrinsics.a(this.getState(), hardwareFoldingFeature.getState());
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
    public OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() != 0 && this.featureBounds.getHeight() != 0) {
            return OcclusionType.FULL;
        }
        return OcclusionType.NONE;
    }
    
    @NotNull
    @Override
    public Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return Orientation.HORIZONTAL;
        }
        return Orientation.VERTICAL;
    }
    
    @NotNull
    @Override
    public State getState() {
        return this.state;
    }
    
    @NotNull
    public final Type getType$window_release() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return (this.featureBounds.hashCode() * 31 + this.type.hashCode()) * 31 + this.getState().hashCode();
    }
    
    @Override
    public boolean isSeparating() {
        final Type type = this.type;
        final Type.Companion companion = Type.Companion;
        return Intrinsics.a(type, companion.getHINGE()) || (Intrinsics.a(this.type, companion.getFOLD()) && Intrinsics.a(this.getState(), State.HALF_OPENED));
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)HardwareFoldingFeature.class.getSimpleName());
        sb.append(" { ");
        sb.append(this.featureBounds);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", state=");
        sb.append(this.getState());
        sb.append(" }");
        return sb.toString();
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        public final void validateFeatureBounds$window_release(@NotNull final Bounds bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            final int width = bounds.getWidth();
            final boolean b = true;
            if (width == 0 && bounds.getHeight() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            boolean b2 = b;
            if (bounds.getLeft() != 0) {
                b2 = (bounds.getTop() == 0 && b);
            }
            if (b2) {
                return;
            }
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
        }
    }
    
    @Metadata
    public static final class Type
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private static final Type FOLD;
        @NotNull
        private static final Type HINGE;
        @NotNull
        private final String description;
        
        static {
            Companion = new Companion(null);
            FOLD = new Type("FOLD");
            HINGE = new Type("HINGE");
        }
        
        private Type(final String description) {
            this.description = description;
        }
        
        public static final /* synthetic */ Type access$getFOLD$cp() {
            return Type.FOLD;
        }
        
        public static final /* synthetic */ Type access$getHINGE$cp() {
            return Type.HINGE;
        }
        
        @NotNull
        @Override
        public String toString() {
            return this.description;
        }
        
        @Metadata
        public static final class Companion
        {
            private Companion() {
            }
            
            @NotNull
            public final Type getFOLD() {
                return Type.access$getFOLD$cp();
            }
            
            @NotNull
            public final Type getHINGE() {
                return Type.access$getHINGE$cp();
            }
        }
    }
}
