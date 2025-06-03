/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal.influence.domain;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceChannel;", "", "nameValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "equalsName", "", "otherName", "toString", "IAM", "NOTIFICATION", "Companion", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public enum OSInfluenceChannel {
    IAM("iam"),
    NOTIFICATION("notification");

    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String nameValue;

    static {
        Companion = new Companion(null);
    }

    private OSInfluenceChannel(String string3) {
        this.nameValue = string3;
    }

    @JvmStatic
    @NotNull
    public static final OSInfluenceChannel fromString(@Nullable String string2) {
        return Companion.fromString(string2);
    }

    public final boolean equalsName(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"otherName");
        return Intrinsics.areEqual((Object)this.nameValue, (Object)string2);
    }

    @NotNull
    public String toString() {
        return this.nameValue;
    }

    @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceChannel$Companion;", "", "()V", "fromString", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "value", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OSInfluenceChannel fromString(@Nullable String object) {
            OSInfluenceChannel oSInfluenceChannel;
            OSInfluenceChannel oSInfluenceChannel2 = null;
            if (object == null) {
                oSInfluenceChannel = oSInfluenceChannel2;
            } else {
                OSInfluenceChannel[] oSInfluenceChannelArray = OSInfluenceChannel.values();
                int n = oSInfluenceChannelArray.length;
                do {
                    oSInfluenceChannel = oSInfluenceChannel2;
                } while (--n >= 0 && !(oSInfluenceChannel = oSInfluenceChannelArray[n]).equalsName((String)object));
            }
            object = oSInfluenceChannel;
            if (oSInfluenceChannel == null) {
                object = NOTIFICATION;
            }
            return object;
        }
    }
}

