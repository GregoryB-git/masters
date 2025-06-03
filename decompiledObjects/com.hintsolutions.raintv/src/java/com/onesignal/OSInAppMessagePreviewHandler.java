/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.ChecksSdkIntAtLeast
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.onesignal.GenerateNotification;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OneSignal;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u001c\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\bH\u0003\u00a8\u0006\u0012"}, d2={"Lcom/onesignal/OSInAppMessagePreviewHandler;", "", "()V", "inAppPreviewPushUUID", "", "payload", "Lorg/json/JSONObject;", "notificationOpened", "", "activity", "Landroid/app/Activity;", "jsonData", "notificationReceived", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "shouldDisplayNotification", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSInAppMessagePreviewHandler {
    @NotNull
    public static final OSInAppMessagePreviewHandler INSTANCE = new OSInAppMessagePreviewHandler();

    private OSInAppMessagePreviewHandler() {
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    @Nullable
    public static final String inAppPreviewPushUUID(@NotNull JSONObject object) {
        void var0_5;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter((Object)object, (String)"payload");
        Object var1_8 = null;
        try {
            jSONObject = NotificationBundleProcessor.getCustomJSONObject(object);
            Intrinsics.checkNotNullExpressionValue((Object)jSONObject, (String)"{\n            Notificati\u2026Object(payload)\n        }");
        }
        catch (JSONException jSONException) {
            Object var0_7 = var1_8;
            return var0_5;
        }
        if (!jSONObject.has("a")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.optJSONObject("a");
        if (jSONObject2 == null) {
            Object var0_2 = var1_8;
            return var0_5;
        } else {
            Object var0_3 = var1_8;
            if (jSONObject2.has("os_in_app_message_preview_id")) {
                String string2 = jSONObject2.optString("os_in_app_message_preview_id");
            }
        }
        return var0_5;
    }

    @JvmStatic
    public static final boolean notificationOpened(@NotNull Activity activity, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"jsonData");
        String string2 = OSInAppMessagePreviewHandler.inAppPreviewPushUUID(jSONObject);
        if (string2 == null) {
            return false;
        }
        OneSignal.openDestinationActivity(activity, new JSONArray().put((Object)jSONObject));
        OneSignal.getInAppMessageController().displayPreviewMessage(string2);
        return true;
    }

    @JvmStatic
    public static final boolean notificationReceived(@Nullable Context context, @Nullable Bundle bundle) {
        bundle = NotificationBundleProcessor.bundleAsJSONObject(bundle);
        Intrinsics.checkNotNullExpressionValue((Object)bundle, (String)"bundleAsJSONObject(bundle)");
        String string2 = OSInAppMessagePreviewHandler.inAppPreviewPushUUID((JSONObject)bundle);
        if (string2 == null) {
            return false;
        }
        if (OneSignal.isAppActive()) {
            OneSignal.getInAppMessageController().displayPreviewMessage(string2);
        } else if (INSTANCE.shouldDisplayNotification()) {
            GenerateNotification.displayIAMPreviewNotification(new OSNotificationGenerationJob(context, (JSONObject)bundle));
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api=19)
    private final boolean shouldDisplayNotification() {
        return true;
    }
}

