// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata
public final class AFb1kSDK implements AFb1iSDK
{
    @NotNull
    private final Executor AFInAppEventParameterName;
    @NotNull
    private final AFf1vSDK AFInAppEventType;
    private AFb1jSDK AFKeystoreWrapper;
    @NotNull
    private final AFb1sSDK values;
    
    public AFb1kSDK(@NotNull final Executor afInAppEventParameterName, @NotNull final AFb1sSDK values, @NotNull final AFf1vSDK afInAppEventType) {
        Intrinsics.checkNotNullParameter(afInAppEventParameterName, "");
        Intrinsics.checkNotNullParameter(values, "");
        Intrinsics.checkNotNullParameter(afInAppEventType, "");
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.values = values;
        this.AFInAppEventType = afInAppEventType;
    }
    
    @Override
    public final void AFInAppEventType(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final AFb1jSDK afKeystoreWrapper = this.AFKeystoreWrapper;
        if (afKeystoreWrapper != null) {
            final AFa1wSDK afInAppEventParameterName = afKeystoreWrapper.AFInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                afInAppEventParameterName.AFInAppEventType(context);
            }
        }
    }
    
    @Override
    public final boolean AFInAppEventType() {
        return this.AFKeystoreWrapper != null;
    }
    
    @Override
    public final void AFKeystoreWrapper(@NotNull Context applicationContext, @NotNull final AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter(applicationContext, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        Intrinsics.checkNotNullParameter(applicationContext, "");
        if (this.AFKeystoreWrapper != null) {
            final Context applicationContext2 = applicationContext.getApplicationContext();
            if (applicationContext2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            ((Application)applicationContext2).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.AFKeystoreWrapper);
        }
        this.AFKeystoreWrapper = null;
        final AFb1jSDK afKeystoreWrapper = new AFb1jSDK(this.AFInAppEventParameterName, this.values, this.AFInAppEventType, aFa1wSDK);
        this.AFKeystoreWrapper = afKeystoreWrapper;
        if (applicationContext instanceof Activity) {
            afKeystoreWrapper.onActivityResumed((Activity)applicationContext);
        }
        applicationContext = applicationContext.getApplicationContext();
        if (applicationContext != null) {
            ((Application)applicationContext).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.AFKeystoreWrapper);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }
}
