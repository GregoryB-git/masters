/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFb1iSDK {
    @NotNull
    public static final AFa1vSDK valueOf = AFa1vSDK.AFInAppEventType;

    public void AFInAppEventType(@NotNull Context var1);

    public boolean AFInAppEventType();

    public void AFKeystoreWrapper(@NotNull Context var1, @NotNull AFa1wSDK var2);

    @Metadata
    public static final class AFa1vSDK {
        static final /* synthetic */ AFa1vSDK AFInAppEventType;
        private static long values;

        static {
            AFInAppEventType = new AFa1vSDK();
            values = 500L;
        }

        private AFa1vSDK() {
        }

        public static long AFInAppEventType() {
            return values;
        }
    }

    @Metadata
    public static interface AFa1wSDK {
        public void AFInAppEventType(@NotNull Context var1);

        public void values(@NotNull Activity var1);
    }

}

