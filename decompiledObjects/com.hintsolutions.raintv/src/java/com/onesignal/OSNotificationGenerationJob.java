/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.SecureRandom
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import android.net.Uri;
import com.onesignal.OSNotification;
import com.onesignal.OneSignal;
import java.security.SecureRandom;
import org.json.JSONObject;

public class OSNotificationGenerationJob {
    private Context context;
    private boolean isNotificationToDisplay;
    private JSONObject jsonPayload;
    private OSNotification notification;
    private Integer orgFlags;
    private Uri orgSound;
    private CharSequence overriddenBodyFromExtender;
    private Integer overriddenFlags;
    private Uri overriddenSound;
    private CharSequence overriddenTitleFromExtender;
    private boolean restoring;
    private Long shownTimeStamp;

    public OSNotificationGenerationJob(Context context) {
        this.context = context;
    }

    public OSNotificationGenerationJob(Context context, OSNotification oSNotification, JSONObject jSONObject) {
        this.context = context;
        this.jsonPayload = jSONObject;
        this.setNotification(oSNotification);
    }

    public OSNotificationGenerationJob(Context context, JSONObject jSONObject) {
        this(context, new OSNotification(jSONObject), jSONObject);
    }

    public JSONObject getAdditionalData() {
        JSONObject jSONObject = this.notification.getAdditionalData() != null ? this.notification.getAdditionalData() : new JSONObject();
        return jSONObject;
    }

    public Integer getAndroidId() {
        return this.notification.getAndroidNotificationId();
    }

    public String getApiNotificationId() {
        return OneSignal.getNotificationIdFromFCMJson(this.jsonPayload);
    }

    public CharSequence getBody() {
        CharSequence charSequence = this.overriddenBodyFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        return this.notification.getBody();
    }

    public Context getContext() {
        return this.context;
    }

    public JSONObject getJsonPayload() {
        return this.jsonPayload;
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public Integer getOrgFlags() {
        return this.orgFlags;
    }

    public Uri getOrgSound() {
        return this.orgSound;
    }

    public CharSequence getOverriddenBodyFromExtender() {
        return this.overriddenBodyFromExtender;
    }

    public Integer getOverriddenFlags() {
        return this.overriddenFlags;
    }

    public Uri getOverriddenSound() {
        return this.overriddenSound;
    }

    public CharSequence getOverriddenTitleFromExtender() {
        return this.overriddenTitleFromExtender;
    }

    public Long getShownTimeStamp() {
        return this.shownTimeStamp;
    }

    public CharSequence getTitle() {
        CharSequence charSequence = this.overriddenTitleFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        return this.notification.getTitle();
    }

    public boolean hasExtender() {
        boolean bl = this.notification.getNotificationExtender() != null;
        return bl;
    }

    public boolean isNotificationToDisplay() {
        return this.isNotificationToDisplay;
    }

    public boolean isRestoring() {
        return this.restoring;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setIsNotificationToDisplay(boolean bl) {
        this.isNotificationToDisplay = bl;
    }

    public void setJsonPayload(JSONObject jSONObject) {
        this.jsonPayload = jSONObject;
    }

    public void setNotification(OSNotification oSNotification) {
        if (oSNotification != null && !oSNotification.hasNotificationId()) {
            OSNotification oSNotification2 = this.notification;
            if (oSNotification2 != null && oSNotification2.hasNotificationId()) {
                oSNotification.setAndroidNotificationId(this.notification.getAndroidNotificationId());
            } else {
                oSNotification.setAndroidNotificationId(new SecureRandom().nextInt());
            }
        }
        this.notification = oSNotification;
    }

    public void setOrgFlags(Integer n) {
        this.orgFlags = n;
    }

    public void setOrgSound(Uri uri) {
        this.orgSound = uri;
    }

    public void setOverriddenBodyFromExtender(CharSequence charSequence) {
        this.overriddenBodyFromExtender = charSequence;
    }

    public void setOverriddenFlags(Integer n) {
        this.overriddenFlags = n;
    }

    public void setOverriddenSound(Uri uri) {
        this.overriddenSound = uri;
    }

    public void setOverriddenTitleFromExtender(CharSequence charSequence) {
        this.overriddenTitleFromExtender = charSequence;
    }

    public void setRestoring(boolean bl) {
        this.restoring = bl;
    }

    public void setShownTimeStamp(Long l) {
        this.shownTimeStamp = l;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSNotificationGenerationJob{jsonPayload=");
        stringBuilder.append((Object)this.jsonPayload);
        stringBuilder.append(", isRestoring=");
        stringBuilder.append(this.restoring);
        stringBuilder.append(", isNotificationToDisplay=");
        stringBuilder.append(this.isNotificationToDisplay);
        stringBuilder.append(", shownTimeStamp=");
        stringBuilder.append((Object)this.shownTimeStamp);
        stringBuilder.append(", overriddenBodyFromExtender=");
        stringBuilder.append((Object)this.overriddenBodyFromExtender);
        stringBuilder.append(", overriddenTitleFromExtender=");
        stringBuilder.append((Object)this.overriddenTitleFromExtender);
        stringBuilder.append(", overriddenSound=");
        stringBuilder.append((Object)this.overriddenSound);
        stringBuilder.append(", overriddenFlags=");
        stringBuilder.append((Object)this.overriddenFlags);
        stringBuilder.append(", orgFlags=");
        stringBuilder.append((Object)this.orgFlags);
        stringBuilder.append(", orgSound=");
        stringBuilder.append((Object)this.orgSound);
        stringBuilder.append(", notification=");
        stringBuilder.append((Object)this.notification);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

