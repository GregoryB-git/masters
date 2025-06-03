// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface FoldingFeature extends DisplayFeature
{
    @NotNull
    OcclusionType getOcclusionType();
    
    @NotNull
    Orientation getOrientation();
    
    @NotNull
    State getState();
    
    boolean isSeparating();
    
    @Metadata
    public static final class OcclusionType
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        public static final OcclusionType FULL;
        @NotNull
        public static final OcclusionType NONE;
        @NotNull
        private final String description;
        
        static {
            Companion = new Companion(null);
            NONE = new OcclusionType("NONE");
            FULL = new OcclusionType("FULL");
        }
        
        private OcclusionType(final String description) {
            this.description = description;
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
        }
    }
    
    @Metadata
    public static final class Orientation
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        public static final Orientation HORIZONTAL;
        @NotNull
        public static final Orientation VERTICAL;
        @NotNull
        private final String description;
        
        static {
            Companion = new Companion(null);
            VERTICAL = new Orientation("VERTICAL");
            HORIZONTAL = new Orientation("HORIZONTAL");
        }
        
        private Orientation(final String description) {
            this.description = description;
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
        }
    }
    
    @Metadata
    public static final class State
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        public static final State FLAT;
        @NotNull
        public static final State HALF_OPENED;
        @NotNull
        private final String description;
        
        static {
            Companion = new Companion(null);
            FLAT = new State("FLAT");
            HALF_OPENED = new State("HALF_OPENED");
        }
        
        private State(final String description) {
            this.description = description;
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
        }
    }
}
