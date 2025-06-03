/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.WebViewManager$Position
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.WebViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001a\u0010&\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001c\u00a8\u0006)"}, d2={"Lcom/onesignal/OSInAppMessageContent;", "", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "contentHtml", "", "getContentHtml", "()Ljava/lang/String;", "setContentHtml", "(Ljava/lang/String;)V", "displayDuration", "", "getDisplayDuration", "()Ljava/lang/Double;", "setDisplayDuration", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "displayLocation", "Lcom/onesignal/WebViewManager$Position;", "getDisplayLocation", "()Lcom/onesignal/WebViewManager$Position;", "setDisplayLocation", "(Lcom/onesignal/WebViewManager$Position;)V", "isFullBleed", "", "()Z", "setFullBleed", "(Z)V", "pageHeight", "", "getPageHeight", "()I", "setPageHeight", "(I)V", "useHeightMargin", "getUseHeightMargin", "setUseHeightMargin", "useWidthMargin", "getUseWidthMargin", "setUseWidthMargin", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public class OSInAppMessageContent {
    @Nullable
    private String contentHtml;
    @Nullable
    private Double displayDuration;
    @Nullable
    private WebViewManager.Position displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public OSInAppMessageContent(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = jSONObject.optString("html");
        this.displayDuration = jSONObject.optDouble("display_duration");
        jSONObject = jSONObject.optJSONObject("styles");
        boolean bl = false;
        boolean bl2 = jSONObject == null ? false : jSONObject.optBoolean("remove_height_margin", false);
        this.useHeightMargin = bl2 ^ true;
        bl2 = jSONObject == null ? bl : jSONObject.optBoolean("remove_width_margin", false);
        this.useWidthMargin = bl2 ^ true;
        this.isFullBleed = this.useHeightMargin ^ true;
    }

    @Nullable
    public final String getContentHtml() {
        return this.contentHtml;
    }

    @Nullable
    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    @Nullable
    public final WebViewManager.Position getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    public final boolean isFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(@Nullable String string2) {
        this.contentHtml = string2;
    }

    public final void setDisplayDuration(@Nullable Double d) {
        this.displayDuration = d;
    }

    public final void setDisplayLocation(@Nullable WebViewManager.Position position) {
        this.displayLocation = position;
    }

    public final void setFullBleed(boolean bl) {
        this.isFullBleed = bl;
    }

    public final void setPageHeight(int n) {
        this.pageHeight = n;
    }

    public final void setUseHeightMargin(boolean bl) {
        this.useHeightMargin = bl;
    }

    public final void setUseWidthMargin(boolean bl) {
        this.useWidthMargin = bl;
    }
}

