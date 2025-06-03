/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.JvmOverloads
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.domain;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "", "notificationIds", "Lorg/json/JSONArray;", "inAppMessagesIds", "(Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "getInAppMessagesIds", "()Lorg/json/JSONArray;", "setInAppMessagesIds", "(Lorg/json/JSONArray;)V", "getNotificationIds", "setNotificationIds", "toJSONObject", "Lorg/json/JSONObject;", "toString", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeSourceBody {
    @Nullable
    private JSONArray inAppMessagesIds;
    @Nullable
    private JSONArray notificationIds;

    @JvmOverloads
    public OSOutcomeSourceBody() {
        this(null, null, 3, null);
    }

    @JvmOverloads
    public OSOutcomeSourceBody(@Nullable JSONArray jSONArray) {
        this(jSONArray, null, 2, null);
    }

    @JvmOverloads
    public OSOutcomeSourceBody(@Nullable JSONArray jSONArray, @Nullable JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    public /* synthetic */ OSOutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            jSONArray = new JSONArray();
        }
        if ((n & 2) != 0) {
            jSONArray2 = new JSONArray();
        }
        this(jSONArray, jSONArray2);
    }

    @Nullable
    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    @Nullable
    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(@Nullable JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(@Nullable JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject().put("notification_ids", (Object)this.notificationIds).put("in_app_message_ids", (Object)this.inAppMessagesIds);
        Intrinsics.checkNotNullExpressionValue((Object)jSONObject, (String)"JSONObject()\n        .pu\u2026AM_IDS, inAppMessagesIds)");
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("OSOutcomeSourceBody{notificationIds=");
        stringBuilder.append((Object)this.notificationIds);
        stringBuilder.append(", inAppMessagesIds=");
        stringBuilder.append((Object)this.inAppMessagesIds);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

