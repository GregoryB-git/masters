/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalRemoteParams$Params
 *  com.onesignal.influence.data.OSTrackerFactory
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.data.OSTrackerFactory;

class OSRemoteParamController {
    private OneSignalRemoteParams.Params remoteParams = null;

    private void saveReceiveReceiptEnabled(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_RECEIVE_RECEIPTS_ENABLED", (boolean)bl);
    }

    private void saveRestoreTTLFilter(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_RESTORE_TTL_FILTER", (boolean)this.remoteParams.restoreTTLFilter);
    }

    public void clearRemoteParams() {
        this.remoteParams = null;
    }

    public boolean getClearGroupSummaryClick() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_CLEAR_GROUP_SUMMARY_CLICK", (boolean)true);
    }

    public boolean getFirebaseAnalyticsEnabled() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_FIREBASE_TRACKING_ENABLED", (boolean)false);
    }

    public OneSignalRemoteParams.Params getRemoteParams() {
        return this.remoteParams;
    }

    public boolean getSavedUserConsentStatus() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"ONESIGNAL_USER_PROVIDED_CONSENT", (boolean)false);
    }

    public boolean hasDisableGMSMissingPromptKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        boolean bl = params != null && params.disableGMSMissingPrompt != null;
        return bl;
    }

    public boolean hasLocationKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        boolean bl = params != null && params.locationShared != null;
        return bl;
    }

    public boolean hasPrivacyConsentKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        boolean bl = params != null && params.requiresUserPrivacyConsent != null;
        return bl;
    }

    public boolean hasUnsubscribeNotificationKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        boolean bl = params != null && params.unsubscribeWhenNotificationsDisabled != null;
        return bl;
    }

    public boolean isGMSMissingPromptDisable() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_DISABLE_GMS_MISSING_PROMPT", (boolean)false);
    }

    public boolean isLocationShared() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_LOCATION_SHARED", (boolean)true);
    }

    public boolean isPrivacyConsentRequired() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", (boolean)false);
    }

    public boolean isReceiveReceiptEnabled() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_RECEIVE_RECEIPTS_ENABLED", (boolean)false);
    }

    public boolean isRemoteParamsCallDone() {
        boolean bl = this.remoteParams != null;
        return bl;
    }

    public boolean isRestoreTTLFilterActive() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_RESTORE_TTL_FILTER", (boolean)true);
    }

    public void saveGMSMissingPromptDisable(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_DISABLE_GMS_MISSING_PROMPT", (boolean)bl);
    }

    public void saveLocationShared(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_LOCATION_SHARED", (boolean)bl);
    }

    public void savePrivacyConsentRequired(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", (boolean)bl);
    }

    public void saveRemoteParams(OneSignalRemoteParams.Params params, OSTrackerFactory oSTrackerFactory, OSSharedPreferences oSSharedPreferences, OSLogger oSLogger) {
        this.remoteParams = params;
        String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
        OneSignalPrefs.saveBool((String)string2, (String)"GT_FIREBASE_TRACKING_ENABLED", (boolean)params.firebaseAnalytics);
        this.saveRestoreTTLFilter(params.restoreTTLFilter);
        OneSignalPrefs.saveBool((String)string2, (String)"OS_CLEAR_GROUP_SUMMARY_CLICK", (boolean)params.clearGroupOnSummaryClick);
        OneSignalPrefs.saveBool((String)string2, (String)oSSharedPreferences.getOutcomesV2KeyName(), (boolean)params.influenceParams.outcomesV2ServiceEnabled);
        this.saveReceiveReceiptEnabled(params.receiveReceiptEnabled);
        oSSharedPreferences = z2.t("OneSignal saveInfluenceParams: ");
        oSSharedPreferences.append(params.influenceParams.toString());
        oSLogger.debug(oSSharedPreferences.toString());
        oSTrackerFactory.saveInfluenceParams(params.influenceParams);
        oSTrackerFactory = params.disableGMSMissingPrompt;
        if (oSTrackerFactory != null) {
            this.saveGMSMissingPromptDisable(oSTrackerFactory.booleanValue());
        }
        if ((oSTrackerFactory = params.unsubscribeWhenNotificationsDisabled) != null) {
            this.saveUnsubscribeWhenNotificationsAreDisabled(oSTrackerFactory.booleanValue());
        }
        if ((oSTrackerFactory = params.locationShared) != null) {
            OneSignal.startLocationShared(oSTrackerFactory.booleanValue());
        }
        if ((params = params.requiresUserPrivacyConsent) != null) {
            this.savePrivacyConsentRequired(params.booleanValue());
        }
    }

    public void saveUnsubscribeWhenNotificationsAreDisabled(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", (boolean)bl);
    }

    public void saveUserConsentStatus(boolean bl) {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"ONESIGNAL_USER_PROVIDED_CONSENT", (boolean)bl);
    }

    public boolean unsubscribeWhenNotificationsAreDisabled() {
        return OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", (boolean)true);
    }
}

