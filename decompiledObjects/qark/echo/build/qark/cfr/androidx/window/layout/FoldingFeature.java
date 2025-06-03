/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.window.layout;

import androidx.window.layout.DisplayFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface FoldingFeature
extends DisplayFeature {
    @NotNull
    public OcclusionType getOcclusionType();

    @NotNull
    public Orientation getOrientation();

    @NotNull
    public State getState();

    public boolean isSeparating();

    @Metadata
    public static final class OcclusionType {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final OcclusionType FULL;
        @NotNull
        public static final OcclusionType NONE;
        @NotNull
        private final String description;

        static {
            NONE = new OcclusionType("NONE");
            FULL = new OcclusionType("FULL");
        }

        private OcclusionType(String string2) {
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
        }

    }

    @Metadata
    public static final class Orientation {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final Orientation HORIZONTAL;
        @NotNull
        public static final Orientation VERTICAL;
        @NotNull
        private final String description;

        static {
            VERTICAL = new Orientation("VERTICAL");
            HORIZONTAL = new Orientation("HORIZONTAL");
        }

        private Orientation(String string2) {
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
        }

    }

    @Metadata
    public static final class State {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final State FLAT = new State("FLAT");
        @NotNull
        public static final State HALF_OPENED = new State("HALF_OPENED");
        @NotNull
        private final String description;

        private State(String string2) {
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
        }

    }

}

