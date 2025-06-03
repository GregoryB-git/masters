/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 */
package com.onesignal;

import com.onesignal.OSLogger;
import com.onesignal.OSRemoteParamController;
import com.onesignal.OSTaskController;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

class OSTaskRemoteController
extends OSTaskController {
    public static final String APP_LOST_FOCUS = "onAppLostFocus()";
    public static final String CLEAR_NOTIFICATIONS = "clearOneSignalNotifications()";
    public static final String GET_TAGS = "getTags()";
    public static final String HANDLE_NOTIFICATION_OPEN = "handleNotificationOpen()";
    public static final String IDS_AVAILABLE = "idsAvailable()";
    public static final String LOGOUT_EMAIL = "logoutEmail()";
    public static final String LOGOUT_SMS_NUMBER = "logoutSMSNumber()";
    public static final HashSet<String> METHODS_AVAILABLE_FOR_DELAY = new HashSet((Collection)Arrays.asList((Object[])new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));
    public static final String PAUSE_IN_APP_MESSAGES = "pauseInAppMessages()";
    public static final String PROMPT_LOCATION = "promptLocation()";
    public static final String REMOVE_GROUPED_NOTIFICATIONS = "removeGroupedNotifications()";
    public static final String REMOVE_NOTIFICATION = "removeNotification()";
    public static final String SEND_OUTCOME = "sendOutcome()";
    public static final String SEND_OUTCOME_WITH_VALUE = "sendOutcomeWithValue()";
    public static final String SEND_TAG = "sendTag()";
    public static final String SEND_TAGS = "sendTags()";
    public static final String SEND_UNIQUE_OUTCOME = "sendUniqueOutcome()";
    public static final String SET_DISABLE_GMS_MISSING_PROMPT = "setDisableGMSMissingPrompt()";
    public static final String SET_EMAIL = "setEmail()";
    public static final String SET_EXTERNAL_USER_ID = "setExternalUserId()";
    public static final String SET_IN_APP_MESSAGE_LIFECYCLE_HANDLER = "setInAppMessageLifecycleHandler()";
    public static final String SET_LANGUAGE = "setLanguage()";
    public static final String SET_LOCATION_SHARED = "setLocationShared()";
    public static final String SET_REQUIRES_USER_PRIVACY_CONSENT = "setRequiresUserPrivacyConsent()";
    public static final String SET_SMS_NUMBER = "setSMSNumber()";
    public static final String SET_SUBSCRIPTION = "setSubscription()";
    public static final String SYNC_HASHED_EMAIL = "syncHashedEmail()";
    public static final String UNSUBSCRIBE_WHEN_NOTIFICATION_ARE_DISABLED = "unsubscribeWhenNotificationsAreDisabled()";
    private final OSRemoteParamController paramController;

    public OSTaskRemoteController(OSRemoteParamController oSRemoteParamController, OSLogger oSLogger) {
        super(oSLogger);
        this.paramController = oSRemoteParamController;
    }

    public boolean shouldQueueTaskForInit(String string2) {
        boolean bl = !this.paramController.isRemoteParamsCallDone() && METHODS_AVAILABLE_FOR_DELAY.contains((Object)string2);
        return bl;
    }
}

