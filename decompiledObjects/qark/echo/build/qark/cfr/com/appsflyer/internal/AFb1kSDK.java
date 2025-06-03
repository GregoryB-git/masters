/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFf1vSDK;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFb1kSDK
implements AFb1iSDK {
    @NotNull
    private final Executor AFInAppEventParameterName;
    @NotNull
    private final AFf1vSDK AFInAppEventType;
    private AFb1jSDK AFKeystoreWrapper;
    @NotNull
    private final AFb1sSDK values;

    public AFb1kSDK(@NotNull Executor executor, @NotNull AFb1sSDK aFb1sSDK, @NotNull AFf1vSDK aFf1vSDK) {
        Intrinsics.checkNotNullParameter((Object)executor, "");
        Intrinsics.checkNotNullParameter(aFb1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1vSDK, "");
        this.AFInAppEventParameterName = executor;
        this.values = aFb1sSDK;
        this.AFInAppEventType = aFf1vSDK;
    }

    @Override
    public final void AFInAppEventType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "");
        Object object = this.AFKeystoreWrapper;
        if (object != null && (object = object.AFInAppEventParameterName) != null) {
            object.AFInAppEventType(context);
        }
    }

    @Override
    public final boolean AFInAppEventType() {
        if (this.AFKeystoreWrapper != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void AFKeystoreWrapper(@NotNull Context context, @NotNull AFb1iSDK.AFa1wSDK object) {
        Intrinsics.checkNotNullParameter((Object)context, "");
        Intrinsics.checkNotNullParameter(object, "");
        Intrinsics.checkNotNullParameter((Object)context, "");
        if (this.AFKeystoreWrapper != null) {
            Context context2 = context.getApplicationContext();
            if (context2 != null) {
                ((Application)context2).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.AFKeystoreWrapper);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.AFKeystoreWrapper = null;
        this.AFKeystoreWrapper = object = new AFb1jSDK(this.AFInAppEventParameterName, this.values, this.AFInAppEventType, (AFb1iSDK.AFa1wSDK)object);
        if (context instanceof Activity) {
            object.onActivityResumed((Activity)context);
        }
        if ((context = context.getApplicationContext()) != null) {
            ((Application)context).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.AFKeystoreWrapper);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }
}

