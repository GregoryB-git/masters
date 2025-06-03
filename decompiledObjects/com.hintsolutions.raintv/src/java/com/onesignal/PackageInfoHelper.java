/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.DeadSystemException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.DeadSystemException;
import com.onesignal.GetPackageInfoResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lcom/onesignal/PackageInfoHelper;", "", "()V", "Companion", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class PackageInfoHelper {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2={"Lcom/onesignal/PackageInfoHelper$Companion;", "", "()V", "getInfo", "Lcom/onesignal/GetPackageInfoResult;", "appContext", "Landroid/content/Context;", "packageName", "", "flags", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @TargetApi(value=24)
        @NotNull
        public final GetPackageInfoResult getInfo(@NotNull Context object, @NotNull String string2, int n) {
            Intrinsics.checkNotNullParameter((Object)object, (String)"appContext");
            Intrinsics.checkNotNullParameter((Object)string2, (String)"packageName");
            PackageManager packageManager = object.getPackageManager();
            try {
                object = new GetPackageInfoResult(true, packageManager.getPackageInfo(string2, n));
            }
            catch (RuntimeException runtimeException) {
                if (runtimeException.getCause() instanceof DeadSystemException) {
                    object = new GetPackageInfoResult(false, null);
                }
                throw runtimeException;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = new GetPackageInfoResult(true, null);
            }
            return object;
        }
    }
}

