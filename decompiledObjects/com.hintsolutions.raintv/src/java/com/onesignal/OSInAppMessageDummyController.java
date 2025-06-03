/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSInAppMessageInternal;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSTaskController;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.language.LanguageContext;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageDummyController
extends OSInAppMessageController {
    public OSInAppMessageDummyController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext) {
        super(oneSignalDbHelper, oSTaskController, oSLogger, oSSharedPreferences, languageContext);
    }

    @Override
    public void addTriggers(Map<String, Object> map) {
    }

    @Override
    public void cleanCachedInAppMessages() {
    }

    @Override
    public void displayPreviewMessage(@NonNull String string) {
    }

    @Override
    @Nullable
    public OSInAppMessageInternal getCurrentDisplayedInAppMessage() {
        return null;
    }

    @Override
    @Nullable
    public Object getTriggerValue(String string) {
        return null;
    }

    @Override
    public void initRedisplayData() {
    }

    @Override
    public void initWithCachedInAppMessages() {
    }

    @Override
    public boolean isInAppMessageShowing() {
        return false;
    }

    @Override
    public void messageTriggerConditionChanged() {
    }

    @Override
    public void messageWasDismissed(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
    }

    @Override
    public void onMessageActionOccurredOnMessage(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull JSONObject jSONObject) {
    }

    @Override
    public void onMessageActionOccurredOnPreview(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull JSONObject jSONObject) {
    }

    @Override
    public void receivedInAppMessageJson(@NonNull JSONArray jSONArray) throws JSONException {
    }

    @Override
    public void removeTriggersForKeys(Collection<String> collection) {
    }

    @Override
    public void setInAppMessagingEnabled(boolean bl) {
    }
}

