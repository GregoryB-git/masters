/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.work.Configuration
 *  androidx.work.Configuration$Builder
 *  androidx.work.Configuration$Provider
 *  androidx.work.WorkManager
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import com.onesignal.OneSignal;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\t"}, d2={"Lcom/onesignal/OSWorkManagerHelper;", "", "()V", "getInstance", "Landroidx/work/WorkManager;", "context", "Landroid/content/Context;", "initializeWorkManager", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSWorkManagerHelper {
    @NotNull
    public static final OSWorkManagerHelper INSTANCE = new OSWorkManagerHelper();

    private OSWorkManagerHelper() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @NotNull
    public static final WorkManager getInstance(@NotNull Context context) {
        Class<OSWorkManagerHelper> clazz = OSWorkManagerHelper.class;
        synchronized (OSWorkManagerHelper.class) {
            Intrinsics.checkNotNullParameter((Object)context, (String)"context");
            try {
                WorkManager workManager = WorkManager.getInstance((Context)context);
                Intrinsics.checkNotNullExpressionValue((Object)workManager, (String)"{\n            WorkManage\u2026stance(context)\n        }");
                return workManager;
            }
            catch (IllegalStateException illegalStateException) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "OSWorkManagerHelper.getInstance failed, attempting to initialize: ", illegalStateException);
                INSTANCE.initializeWorkManager(context);
                context = WorkManager.getInstance((Context)context);
                Intrinsics.checkNotNullExpressionValue((Object)context, (String)"{\n            /*\n       \u2026stance(context)\n        }");
            }
            return context;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void initializeWorkManager(Context context) {
        try {
            Object object = context.getApplicationContext();
            boolean bl = object instanceof Configuration.Provider;
            Context context2 = null;
            object = bl ? (Configuration.Provider)object : null;
            object = object == null ? context2 : object.getWorkManagerConfiguration();
            context2 = object;
            if (object == null) {
                object = new Configuration.Builder();
                context2 = object.build();
            }
            Intrinsics.checkNotNullExpressionValue((Object)context2, (String)"(context.applicationCont\u2026uration.Builder().build()");
            WorkManager.initialize((Context)context, (Configuration)context2);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "OSWorkManagerHelper initializing WorkManager failed: ", illegalStateException);
        }
    }
}

