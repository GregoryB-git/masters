/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.DeadSystemException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.DeadSystemException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lcom/onesignal/ApplicationInfoHelper;", "", "()V", "Companion", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class ApplicationInfoHelper {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private static ApplicationInfo cachedInfo;

    @Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lcom/onesignal/ApplicationInfoHelper$Companion;", "", "()V", "cachedInfo", "Landroid/content/pm/ApplicationInfo;", "getInfo", "context", "Landroid/content/Context;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @TargetApi(value=24)
        @Nullable
        public final ApplicationInfo getInfo(@NotNull Context context) {
            RuntimeException runtimeException2;
            block3: {
                Intrinsics.checkNotNullParameter((Object)context, (String)"context");
                if (cachedInfo != null) {
                    return cachedInfo;
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    cachedInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                    context = cachedInfo;
                }
                catch (RuntimeException runtimeException2) {
                    if (!(runtimeException2.getCause() instanceof DeadSystemException)) break block3;
                    context = null;
                }
                return context;
            }
            throw runtimeException2;
        }
    }
}

