/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal.influence.domain;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceType;", "", "(Ljava/lang/String;I)V", "isAttributed", "", "isDirect", "isDisabled", "isIndirect", "isUnattributed", "DIRECT", "INDIRECT", "UNATTRIBUTED", "DISABLED", "Companion", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public enum OSInfluenceType {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    @NotNull
    public static final Companion Companion;

    static {
        Companion = new Companion(null);
    }

    @JvmStatic
    @NotNull
    public static final OSInfluenceType fromString(@Nullable String string2) {
        return Companion.fromString(string2);
    }

    public final boolean isAttributed() {
        boolean bl = this.isDirect() || this.isIndirect();
        return bl;
    }

    public final boolean isDirect() {
        boolean bl = this == DIRECT;
        return bl;
    }

    public final boolean isDisabled() {
        boolean bl = this == DISABLED;
        return bl;
    }

    public final boolean isIndirect() {
        boolean bl = this == INDIRECT;
        return bl;
    }

    public final boolean isUnattributed() {
        boolean bl = this == UNATTRIBUTED;
        return bl;
    }

    @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceType$Companion;", "", "()V", "fromString", "Lcom/onesignal/influence/domain/OSInfluenceType;", "value", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OSInfluenceType fromString(@Nullable String string2) {
            Object object;
            if (string2 != null) {
                OSInfluenceType[] oSInfluenceTypeArray = OSInfluenceType.values();
                int n = oSInfluenceTypeArray.length;
                while (--n >= 0) {
                    object = oSInfluenceTypeArray[n];
                    if (!StringsKt.g((String)object.name(), (String)string2)) continue;
                    string2 = object;
                    break;
                }
            } else {
                string2 = null;
            }
            object = string2;
            if (string2 == null) {
                object = UNATTRIBUTED;
            }
            return object;
        }
    }
}

