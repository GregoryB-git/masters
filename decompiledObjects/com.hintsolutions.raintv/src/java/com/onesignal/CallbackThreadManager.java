/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.CallbackThreadManager$Companion$runOnPreferred$1
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.concurrent.ThreadsKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import com.onesignal.CallbackThreadManager;
import com.onesignal.OSUtils;
import kotlin.Metadata;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2={"Lcom/onesignal/CallbackThreadManager;", "", "()V", "Companion", "UseThread", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class CallbackThreadManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static UseThread preference = UseThread.MainUI;

    @Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2={"Lcom/onesignal/CallbackThreadManager$Companion;", "", "()V", "preference", "Lcom/onesignal/CallbackThreadManager$UseThread;", "getPreference", "()Lcom/onesignal/CallbackThreadManager$UseThread;", "setPreference", "(Lcom/onesignal/CallbackThreadManager$UseThread;)V", "runOnPreferred", "", "runnable", "Ljava/lang/Runnable;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UseThread getPreference() {
            return preference;
        }

        public final void runOnPreferred(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter((Object)runnable, (String)"runnable");
            UseThread useThread = this.getPreference();
            int n = WhenMappings.$EnumSwitchMapping$0[useThread.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    ThreadsKt.thread$default((boolean)false, (boolean)false, null, null, (int)0, (Function0)new runOnPreferred.1(runnable), (int)31, null);
                }
            } else {
                OSUtils.runOnMainUIThread(runnable);
            }
        }

        public final void setPreference(@NotNull UseThread useThread) {
            Intrinsics.checkNotNullParameter((Object)((Object)useThread), (String)"<set-?>");
            preference = useThread;
        }

        @Metadata(k=3, mv={1, 5, 1}, xi=48)
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] nArray = new int[UseThread.values().length];
                nArray[UseThread.MainUI.ordinal()] = 1;
                nArray[UseThread.Background.ordinal()] = 2;
                $EnumSwitchMapping$0 = nArray;
            }
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/onesignal/CallbackThreadManager$UseThread;", "", "(Ljava/lang/String;I)V", "MainUI", "Background", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static enum UseThread {
        MainUI,
        Background;

    }
}

