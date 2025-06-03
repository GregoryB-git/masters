/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.GenerateNotificationOpenIntent;
import com.onesignal.OSInAppMessagePreviewHandler;
import com.onesignal.OSNotificationOpenBehaviorFromPushPayload;
import com.onesignal.OSUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u000f"}, d2={"Lcom/onesignal/GenerateNotificationOpenIntentFromPushPayload;", "", "()V", "create", "Lcom/onesignal/GenerateNotificationOpenIntent;", "context", "Landroid/content/Context;", "fcmPayload", "Lorg/json/JSONObject;", "openBrowserIntent", "Landroid/content/Intent;", "uri", "Landroid/net/Uri;", "shouldOpenApp", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class GenerateNotificationOpenIntentFromPushPayload {
    @NotNull
    public static final GenerateNotificationOpenIntentFromPushPayload INSTANCE = new GenerateNotificationOpenIntentFromPushPayload();

    private GenerateNotificationOpenIntentFromPushPayload() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.openURLInBrowserIntent(uri);
    }

    private final boolean shouldOpenApp(boolean bl, JSONObject jSONObject) {
        boolean bl2 = OSInAppMessagePreviewHandler.inAppPreviewPushUUID(jSONObject) != null;
        return bl | bl2;
    }

    @NotNull
    public final GenerateNotificationOpenIntent create(@NotNull Context context, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"fcmPayload");
        OSNotificationOpenBehaviorFromPushPayload oSNotificationOpenBehaviorFromPushPayload = new OSNotificationOpenBehaviorFromPushPayload(context, jSONObject);
        return new GenerateNotificationOpenIntent(context, this.openBrowserIntent(oSNotificationOpenBehaviorFromPushPayload.getUri()), this.shouldOpenApp(oSNotificationOpenBehaviorFromPushPayload.getShouldOpenApp(), jSONObject));
    }
}

