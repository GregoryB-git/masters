/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import android.net.Uri;
import com.onesignal.OSNotificationOpenAppSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lcom/onesignal/OSNotificationOpenBehaviorFromPushPayload;", "", "context", "Landroid/content/Context;", "fcmPayload", "Lorg/json/JSONObject;", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "shouldOpenApp", "", "getShouldOpenApp", "()Z", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSNotificationOpenBehaviorFromPushPayload {
    @NotNull
    private final Context context;
    @NotNull
    private final JSONObject fcmPayload;

    public OSNotificationOpenBehaviorFromPushPayload(@NotNull Context context, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"fcmPayload");
        this.context = context;
        this.fcmPayload = jSONObject;
    }

    public final boolean getShouldOpenApp() {
        boolean bl = OSNotificationOpenAppSettings.INSTANCE.getShouldOpenActivity(this.context) && this.getUri() == null;
        return bl;
    }

    @Nullable
    public final Uri getUri() {
        Object object = OSNotificationOpenAppSettings.INSTANCE;
        if (!((OSNotificationOpenAppSettings)object).getShouldOpenActivity(this.context)) {
            return null;
        }
        if (((OSNotificationOpenAppSettings)object).getSuppressLaunchURL(this.context)) {
            return null;
        }
        object = new JSONObject(this.fcmPayload.optString("custom"));
        if (object.has("u") && !Intrinsics.areEqual((Object)(object = object.optString("u")), (Object)"")) {
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"url");
            int n = object.length() - 1;
            int n2 = 0;
            boolean bl = false;
            while (n2 <= n) {
                int n3 = !bl ? n2 : n;
                n3 = Intrinsics.compare((int)object.charAt(n3), (int)32) <= 0 ? 1 : 0;
                if (!bl) {
                    if (n3 == 0) {
                        bl = true;
                        continue;
                    }
                    ++n2;
                    continue;
                }
                if (n3 == 0) break;
                --n;
            }
            return Uri.parse((String)object.subSequence(n2, n + 1).toString());
        }
        return null;
    }
}

