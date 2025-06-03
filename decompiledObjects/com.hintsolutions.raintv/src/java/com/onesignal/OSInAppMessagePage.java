/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000f"}, d2={"Lcom/onesignal/OSInAppMessagePage;", "", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "pageIndex", "getPageIndex", "setPageIndex", "toJSONObject", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public class OSInAppMessagePage {
    @Nullable
    private String pageId;
    @Nullable
    private String pageIndex;

    public OSInAppMessagePage(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"jsonObject");
        this.pageId = jSONObject.optString("pageId", null);
        this.pageIndex = jSONObject.optString("pageIndex", null);
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final String getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageId(@Nullable String string2) {
        this.pageId = string2;
    }

    public final void setPageIndex(@Nullable String string2) {
        this.pageIndex = string2;
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageId", (Object)this.pageId);
            jSONObject.put("pageIndex", (Object)this.pageIndex);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }
}

