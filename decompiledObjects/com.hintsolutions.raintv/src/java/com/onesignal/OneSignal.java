/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.onesignal.ActivityLifecycleHandler
 *  com.onesignal.NotificationPermissionController
 *  com.onesignal.OSInAppMessageController
 *  com.onesignal.OSLogWrapper
 *  com.onesignal.OSNotificationDataController
 *  com.onesignal.OSNotificationOpenedResult
 *  com.onesignal.OSSharedPreferencesWrapper
 *  com.onesignal.OSSyncService
 *  com.onesignal.OSTaskRemoteController
 *  com.onesignal.OSTimeImpl
 *  com.onesignal.OneSignal$1
 *  com.onesignal.OneSignal$16
 *  com.onesignal.OneSignal$21
 *  com.onesignal.OneSignal$26
 *  com.onesignal.OneSignal$30
 *  com.onesignal.OneSignal$5
 *  com.onesignal.OneSignal$6
 *  com.onesignal.OneSignal$7
 *  com.onesignal.OneSignalAPIClient
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalRemoteParams
 *  com.onesignal.OneSignalRemoteParams$Callback
 *  com.onesignal.OneSignalRemoteParams$Params
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  com.onesignal.OneSignalRestClientWrapper
 *  com.onesignal.OneSignalStateSynchronizer
 *  com.onesignal.OneSignalStateSynchronizer$OSDeviceInfoCompletionHandler
 *  com.onesignal.PackageInfoHelper
 *  com.onesignal.PushRegistrator
 *  com.onesignal.PushRegistrator$RegisteredHandler
 *  com.onesignal.PushRegistratorADM
 *  com.onesignal.PushRegistratorFCM
 *  com.onesignal.PushRegistratorFCM$Params
 *  com.onesignal.PushRegistratorHMS
 *  com.onesignal.RootToolsInternalMethods
 *  com.onesignal.TrackAmazonPurchase
 *  com.onesignal.TrackFirebaseAnalytics
 *  com.onesignal.TrackGooglePurchase
 *  com.onesignal.UserStateSynchronizer$GetTagsResult
 *  com.onesignal.influence.data.OSTrackerFactory
 *  com.onesignal.language.LanguageContext
 *  com.onesignal.language.LanguageProvider
 *  com.onesignal.language.LanguageProviderAppDefined
 *  com.onesignal.outcomes.data.OSOutcomeEventsFactory
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.time.ZoneId
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.TimeZone
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.ApplicationInfoHelper;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.CallbackThreadManager;
import com.onesignal.DelayedConsentInitializationParameters;
import com.onesignal.FocusTimeController;
import com.onesignal.GenerateNotificationOpenIntentFromPushPayload;
import com.onesignal.GetPackageInfoResult;
import com.onesignal.LocationController;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.NotificationPermissionController;
import com.onesignal.OSDeviceState;
import com.onesignal.OSEmailSubscriptionChangedInternalObserver;
import com.onesignal.OSEmailSubscriptionObserver;
import com.onesignal.OSEmailSubscriptionState;
import com.onesignal.OSEmailSubscriptionStateChanges;
import com.onesignal.OSFocusTimeProcessorFactory;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSInAppMessageControllerFactory;
import com.onesignal.OSInAppMessageLifecycleHandler;
import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSLogWrapper;
import com.onesignal.OSLogger;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationController;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationOpenBehaviorFromPushPayload;
import com.onesignal.OSNotificationOpenedResult;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OSObservable;
import com.onesignal.OSOutcomeEvent;
import com.onesignal.OSOutcomeEventsController;
import com.onesignal.OSPermissionChangedInternalObserver;
import com.onesignal.OSPermissionObserver;
import com.onesignal.OSPermissionState;
import com.onesignal.OSPermissionStateChanges;
import com.onesignal.OSRemoteParamController;
import com.onesignal.OSSMSSubscriptionChangedInternalObserver;
import com.onesignal.OSSMSSubscriptionObserver;
import com.onesignal.OSSMSSubscriptionState;
import com.onesignal.OSSMSSubscriptionStateChanges;
import com.onesignal.OSSessionManager;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSSharedPreferencesWrapper;
import com.onesignal.OSSubscriptionChangedInternalObserver;
import com.onesignal.OSSubscriptionObserver;
import com.onesignal.OSSubscriptionState;
import com.onesignal.OSSubscriptionStateChanges;
import com.onesignal.OSSyncService;
import com.onesignal.OSTaskController;
import com.onesignal.OSTaskRemoteController;
import com.onesignal.OSTime;
import com.onesignal.OSTimeImpl;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalRestClientWrapper;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.PackageInfoHelper;
import com.onesignal.PushRegistrator;
import com.onesignal.PushRegistratorADM;
import com.onesignal.PushRegistratorFCM;
import com.onesignal.PushRegistratorHMS;
import com.onesignal.RootToolsInternalMethods;
import com.onesignal.TrackAmazonPurchase;
import com.onesignal.TrackFirebaseAnalytics;
import com.onesignal.TrackGooglePurchase;
import com.onesignal.UserStateSynchronizer;
import com.onesignal.influence.data.OSTrackerFactory;
import com.onesignal.language.LanguageContext;
import com.onesignal.language.LanguageProvider;
import com.onesignal.language.LanguageProviderAppDefined;
import com.onesignal.outcomes.data.OSOutcomeEventsFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignal {
    public static final long MIN_ON_SESSION_TIME_MILLIS = 30000L;
    private static final String VERSION = "040810";
    private static boolean androidParamsRequestStarted;
    private static OneSignalAPIClient apiClient;
    public static WeakReference<Activity> appActivity;
    public static Context appContext;
    @NonNull
    private static AppEntryAction appEntryState;
    public static String appId;
    private static OSEmailSubscriptionState currentEmailSubscriptionState;
    private static OSPermissionState currentPermissionState;
    private static OSSMSSubscriptionState currentSMSSubscriptionState;
    private static OSSubscriptionState currentSubscriptionState;
    private static DelayedConsentInitializationParameters delayedInitParams;
    private static String emailId;
    private static EmailUpdateHandler emailLogoutHandler;
    private static OSObservable<OSEmailSubscriptionObserver, OSEmailSubscriptionStateChanges> emailSubscriptionStateChangesObserver;
    private static EmailUpdateHandler emailUpdateHandler;
    private static List<EntryStateListener> entryStateListeners;
    private static FocusTimeController focusTimeController;
    private static boolean getTagsCall;
    public static String googleProjectNumber;
    private static IAPUpdateJob iapUpdateJob;
    public static OSInAppMessageClickHandler inAppMessageClickHandler;
    private static OSInAppMessageControllerFactory inAppMessageControllerFactory;
    private static boolean inForeground;
    private static boolean initDone;
    public static LanguageContext languageContext;
    public static OSEmailSubscriptionState lastEmailSubscriptionState;
    private static LocationController.LocationPoint lastLocationPoint;
    public static OSPermissionState lastPermissionState;
    private static String lastRegistrationId;
    public static OSSMSSubscriptionState lastSMSSubscriptionState;
    public static OSSubscriptionState lastSubscriptionState;
    private static boolean locationFired;
    private static LOG_LEVEL logCatLevel;
    private static OSLogger logger;
    private static PushRegistrator mPushRegistrator;
    @Nullable
    private static OSNotificationDataController notificationDataController;
    public static OSNotificationOpenedHandler notificationOpenedHandler;
    public static OSNotificationWillShowInForegroundHandler notificationWillShowInForegroundHandler;
    @NonNull
    private static OSUtils osUtils;
    @Nullable
    private static OSOutcomeEventsController outcomeEventsController;
    private static final Object outcomeEventsControllerSyncLock;
    @Nullable
    private static OSOutcomeEventsFactory outcomeEventsFactory;
    private static final ArrayList<OSGetTagsHandler> pendingGetTagsHandlers;
    private static OSObservable<OSPermissionObserver, OSPermissionStateChanges> permissionStateChangesObserver;
    private static HashSet<String> postedOpenedNotifIds;
    private static OSSharedPreferences preferences;
    private static boolean registerForPushFired;
    public static OSRemoteNotificationReceivedHandler remoteNotificationReceivedHandler;
    private static OSRemoteParamController remoteParamController;
    public static String sdkType;
    private static OSSessionManager.SessionListener sessionListener;
    private static OSSessionManager sessionManager;
    private static String smsId;
    private static OSSMSUpdateHandler smsLogoutHandler;
    private static OSObservable<OSSMSSubscriptionObserver, OSSMSSubscriptionStateChanges> smsSubscriptionStateChangesObserver;
    private static OSSMSUpdateHandler smsUpdateHandler;
    private static int subscribableStatus;
    private static OSObservable<OSSubscriptionObserver, OSSubscriptionStateChanges> subscriptionStateChangesObserver;
    private static OSTaskController taskController;
    private static OSTaskRemoteController taskRemoteController;
    private static OSTime time;
    private static TrackAmazonPurchase trackAmazonPurchase;
    private static TrackFirebaseAnalytics trackFirebaseAnalytics;
    private static TrackGooglePurchase trackGooglePurchase;
    private static OSTrackerFactory trackerFactory;
    private static Collection<JSONArray> unprocessedOpenedNotifs;
    private static String userId;
    private static LOG_LEVEL visualLogLevel;
    private static boolean waitingToPostStateSync;

    static {
        entryStateListeners = new ArrayList();
        visualLogLevel = LOG_LEVEL.NONE;
        logCatLevel = LOG_LEVEL.WARN;
        userId = null;
        emailId = null;
        smsId = null;
        subscribableStatus = Integer.MAX_VALUE;
        languageContext = null;
        appEntryState = AppEntryAction.APP_CLOSE;
        logger = new OSLogWrapper();
        sessionListener = new 1();
        inAppMessageControllerFactory = new OSInAppMessageControllerFactory();
        time = new OSTimeImpl();
        remoteParamController = new OSRemoteParamController();
        taskController = new OSTaskController(logger);
        taskRemoteController = new OSTaskRemoteController(remoteParamController, logger);
        apiClient = new OneSignalRestClientWrapper();
        OSSharedPreferencesWrapper oSSharedPreferencesWrapper = new OSSharedPreferencesWrapper();
        preferences = oSSharedPreferencesWrapper;
        oSSharedPreferencesWrapper = new OSTrackerFactory((OSSharedPreferences)oSSharedPreferencesWrapper, logger, time);
        trackerFactory = oSSharedPreferencesWrapper;
        sessionManager = new OSSessionManager(sessionListener, (OSTrackerFactory)oSSharedPreferencesWrapper, logger);
        outcomeEventsControllerSyncLock = new Object(){};
        sdkType = "native";
        osUtils = new OSUtils();
        unprocessedOpenedNotifs = new ArrayList();
        postedOpenedNotifIds = new HashSet();
        pendingGetTagsHandlers = new ArrayList();
    }

    public static void Log(@NonNull LOG_LEVEL lOG_LEVEL, @NonNull String string2) {
        OneSignal.Log(lOG_LEVEL, string2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Log(@NonNull LOG_LEVEL lOG_LEVEL, @NonNull String string2, @Nullable Throwable object) {
        if (lOG_LEVEL.compareTo(logCatLevel) < 1) {
            if (lOG_LEVEL == LOG_LEVEL.VERBOSE) {
                Log.v((String)"OneSignal", (String)string2, (Throwable)object);
            } else if (lOG_LEVEL == LOG_LEVEL.DEBUG) {
                Log.d((String)"OneSignal", (String)string2, (Throwable)object);
            } else if (lOG_LEVEL == LOG_LEVEL.INFO) {
                Log.i((String)"OneSignal", (String)string2, (Throwable)object);
            } else if (lOG_LEVEL == LOG_LEVEL.WARN) {
                Log.w((String)"OneSignal", (String)string2, (Throwable)object);
            } else if (lOG_LEVEL == LOG_LEVEL.ERROR || lOG_LEVEL == LOG_LEVEL.FATAL) {
                Log.e((String)"OneSignal", (String)string2, (Throwable)object);
            }
        }
        if (lOG_LEVEL.compareTo(visualLogLevel) >= 1) return;
        if (OneSignal.getCurrentActivity() == null) return;
        try {
            String string3;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("\n");
            string2 = string3 = stringBuilder.toString();
            if (object != null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(object.getMessage());
                String string4 = string2.toString();
                string2 = new StringWriter();
                PrintWriter printWriter = new PrintWriter((Writer)string2);
                object.printStackTrace(printWriter);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string4);
                stringBuilder2.append(string2.toString());
                string2 = stringBuilder2.toString();
            }
            Runnable runnable = new Runnable(lOG_LEVEL, string2){
                public final String val$finalFullMessage;
                public final LOG_LEVEL val$level;
                {
                    this.val$level = lOG_LEVEL;
                    this.val$finalFullMessage = string2;
                }

                public void run() {
                    if (OneSignal.getCurrentActivity() != null) {
                        new AlertDialog.Builder((Context)OneSignal.getCurrentActivity()).setTitle((CharSequence)this.val$level.toString()).setMessage((CharSequence)this.val$finalFullMessage).show();
                    }
                }
            };
            OSUtils.runOnMainUIThread(runnable);
            return;
        }
        catch (Throwable throwable) {
            Log.e((String)"OneSignal", (String)"Error showing logging message.", (Throwable)throwable);
        }
    }

    public static /* synthetic */ OSOutcomeEventsController access$000() {
        return outcomeEventsController;
    }

    public static /* synthetic */ boolean access$1002(boolean bl) {
        androidParamsRequestStarted = bl;
        return bl;
    }

    public static /* synthetic */ OSTrackerFactory access$1100() {
        return trackerFactory;
    }

    public static /* synthetic */ OSSharedPreferences access$1200() {
        return preferences;
    }

    public static /* synthetic */ OSRemoteParamController access$1300() {
        return remoteParamController;
    }

    public static /* synthetic */ void access$1400() {
        OneSignal.registerForPushToken();
    }

    public static /* synthetic */ boolean access$1802(boolean bl) {
        getTagsCall = bl;
        return bl;
    }

    public static /* synthetic */ LocationController.LocationPoint access$202(LocationController.LocationPoint locationPoint) {
        lastLocationPoint = locationPoint;
        return locationPoint;
    }

    public static /* synthetic */ boolean access$302(boolean bl) {
        locationFired = bl;
        return bl;
    }

    public static /* synthetic */ void access$400() {
        OneSignal.registerUser();
    }

    public static /* synthetic */ int access$500() {
        return subscribableStatus;
    }

    public static /* synthetic */ int access$502(int n) {
        subscribableStatus = n;
        return n;
    }

    public static /* synthetic */ boolean access$600(int n) {
        return OneSignal.pushStatusRuntimeError(n);
    }

    public static /* synthetic */ String access$702(String string2) {
        lastRegistrationId = string2;
        return string2;
    }

    public static /* synthetic */ boolean access$802(boolean bl) {
        registerForPushFired = bl;
        return bl;
    }

    public static /* synthetic */ OSSubscriptionState access$900(Context context) {
        return OneSignal.getCurrentSubscriptionState(context);
    }

    public static void addEmailSubscriptionObserver(@NonNull OSEmailSubscriptionObserver oSEmailSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add email subscription observer");
            return;
        }
        OneSignal.getEmailSubscriptionStateChangesObserver().addObserver(oSEmailSubscriptionObserver);
        if (OneSignal.getCurrentEmailSubscriptionState(appContext).compare(OneSignal.getLastEmailSubscriptionState(appContext))) {
            OSEmailSubscriptionChangedInternalObserver.fireChangesToPublicObserver(OneSignal.getCurrentEmailSubscriptionState(appContext));
        }
    }

    public static void addEntryStateListener(EntryStateListener entryStateListener, AppEntryAction appEntryAction) {
        if (!appEntryAction.equals((Object)AppEntryAction.NOTIFICATION_CLICK)) {
            entryStateListeners.add((Object)entryStateListener);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void addNetType(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", (Object)osUtils.getNetType());
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void addPermissionObserver(OSPermissionObserver oSPermissionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add permission observer");
            return;
        }
        OneSignal.getPermissionStateChangesObserver().addObserver(oSPermissionObserver);
        if (OneSignal.getCurrentPermissionState(appContext).compare(OneSignal.getLastPermissionState(appContext))) {
            OSPermissionChangedInternalObserver.fireChangesToPublicObserver(OneSignal.getCurrentPermissionState(appContext));
        }
    }

    public static void addSMSSubscriptionObserver(@NonNull OSSMSSubscriptionObserver oSSMSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add sms subscription observer");
            return;
        }
        OneSignal.getSMSSubscriptionStateChangesObserver().addObserver(oSSMSSubscriptionObserver);
        if (OneSignal.getCurrentSMSSubscriptionState(appContext).compare(OneSignal.getLastSMSSubscriptionState(appContext))) {
            OSSMSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(OneSignal.getCurrentSMSSubscriptionState(appContext));
        }
    }

    public static void addSubscriptionObserver(OSSubscriptionObserver oSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        OneSignal.getSubscriptionStateChangesObserver().addObserver(oSSubscriptionObserver);
        if (OneSignal.getCurrentSubscriptionState(appContext).compare(OneSignal.getLastSubscriptionState(appContext))) {
            OSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(OneSignal.getCurrentSubscriptionState(appContext));
        }
    }

    public static void addTrigger(String string2, Object object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)string2, object);
        OneSignal.getInAppMessageController().addTriggers((Map)hashMap);
    }

    public static void addTriggers(Map<String, Object> map) {
        OneSignal.getInAppMessageController().addTriggers(map);
    }

    public static void applicationOpenedByNotification(@Nullable String string2) {
        AppEntryAction appEntryAction;
        appEntryState = appEntryAction = AppEntryAction.NOTIFICATION_CLICK;
        sessionManager.onDirectInfluenceFromNotificationOpen(appEntryAction, string2);
    }

    public static boolean areNotificationsEnabledForSubscribedState() {
        if (remoteParamController.unsubscribeWhenNotificationsAreDisabled()) {
            return OSUtils.areNotificationsEnabled(appContext);
        }
        return true;
    }

    public static boolean atLogLevel(LOG_LEVEL lOG_LEVEL) {
        boolean bl;
        int n = lOG_LEVEL.compareTo(visualLogLevel);
        boolean bl2 = bl = true;
        if (n >= 1) {
            bl2 = lOG_LEVEL.compareTo(logCatLevel) < 1 ? bl : false;
        }
        return bl2;
    }

    public static void backgroundSyncLogic() {
        if (inForeground) {
            return;
        }
        TrackAmazonPurchase trackAmazonPurchase = OneSignal.trackAmazonPurchase;
        if (trackAmazonPurchase != null) {
            trackAmazonPurchase.checkListener();
        }
        OneSignal.getFocusTimeController().appBackgrounded();
        OneSignal.scheduleSyncService();
    }

    public static void callEntryStateListeners(AppEntryAction appEntryAction) {
        Iterator iterator = new ArrayList(entryStateListeners).iterator();
        while (iterator.hasNext()) {
            ((EntryStateListener)iterator.next()).onEntryStateChange(appEntryAction);
        }
    }

    public static void clearOneSignalNotifications() {
        OSNotificationDataController oSNotificationDataController;
        if (!taskRemoteController.shouldQueueTaskForInit("clearOneSignalNotifications()") && (oSNotificationDataController = notificationDataController) != null) {
            oSNotificationDataController.clearOneSignalNotifications(new WeakReference((Object)appContext));
            return;
        }
        logger.error("Waiting for remote params. Moving clearOneSignalNotifications() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(){

            public void run() {
                logger.debug("Running clearOneSignalNotifications() operation from pending queue.");
                OneSignal.clearOneSignalNotifications();
            }
        });
    }

    public static void deleteTag(String string2) {
        OneSignal.deleteTag(string2, null);
    }

    public static void deleteTag(String string2, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTag()")) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add((Object)string2);
        OneSignal.deleteTags((Collection<String>)arrayList, changeTagsUpdateHandler);
    }

    public static void deleteTags(String string2) {
        OneSignal.deleteTags(string2, null);
    }

    public static void deleteTags(String string2, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        try {
            JSONArray jSONArray = new JSONArray(string2);
            OneSignal.deleteTags(jSONArray, changeTagsUpdateHandler);
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", throwable);
        }
    }

    public static void deleteTags(Collection<String> collection) {
        OneSignal.deleteTags(collection, null);
    }

    public static void deleteTags(Collection<String> iterator, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                jSONObject.put((String)iterator.next(), (Object)"");
            }
            OneSignal.sendTags(jSONObject, changeTagsUpdateHandler);
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", throwable);
        }
    }

    public static void deleteTags(JSONArray jSONArray, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTags()")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        int n = 0;
        while (true) {
            if (n >= jSONArray.length()) break;
            jSONObject.put(jSONArray.getString(n), (Object)"");
            ++n;
            continue;
            break;
        }
        try {
            OneSignal.sendTags(jSONObject, changeTagsUpdateHandler);
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", throwable);
        }
    }

    public static void disableGMSMissingPrompt(boolean bl) {
        if (OneSignal.getRemoteParamController().hasDisableGMSMissingPromptKey()) {
            return;
        }
        OneSignal.getRemoteParamController().saveGMSMissingPromptDisable(bl);
    }

    public static void disablePush(boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("setSubscription()")) {
            logger.error("Waiting for remote params. Moving setSubscription() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(bl){
                public final boolean val$disable;
                {
                    this.val$disable = bl;
                }

                public void run() {
                    logger.debug("Running setSubscription() operation from pending queue.");
                    OneSignal.disablePush(this.val$disable);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setSubscription()")) {
            return;
        }
        OneSignal.getCurrentSubscriptionState(appContext).setPushDisabled(bl);
        OneSignalStateSynchronizer.setSubscription((boolean)(bl ^ true));
    }

    private static void doSessionInit() {
        if (OneSignal.shouldStartNewSession()) {
            OSLogger oSLogger = logger;
            StringBuilder stringBuilder = z2.t("Starting new session with appEntryState: ");
            stringBuilder.append((Object)OneSignal.getAppEntryState());
            oSLogger.debug(stringBuilder.toString());
            OneSignalStateSynchronizer.setNewSession();
            OneSignal.getOutcomeEventsController().cleanOutcomes();
            sessionManager.restartSessionIfNeeded(OneSignal.getAppEntryState());
            OneSignal.getInAppMessageController().resetSessionLaunchTime();
            OneSignal.setLastSessionTime(time.getCurrentTimeMillis());
        } else if (OneSignal.isInForeground()) {
            OSLogger oSLogger = logger;
            StringBuilder stringBuilder = z2.t("Continue on same session with appEntryState: ");
            stringBuilder.append((Object)OneSignal.getAppEntryState());
            oSLogger.debug(stringBuilder.toString());
            sessionManager.attemptSessionUpgrade(OneSignal.getAppEntryState());
        }
        OneSignal.getInAppMessageController().initWithCachedInAppMessages();
        if (!inForeground && OneSignal.hasUserId()) {
            logger.debug("doSessionInit on background with already registered user");
        }
        OneSignal.startRegistrationOrOnSession();
    }

    private static void fireCallbackForOpenedNotifications() {
        Iterator iterator = unprocessedOpenedNotifs.iterator();
        while (iterator.hasNext()) {
            OneSignal.runNotificationOpenedCallback((JSONArray)iterator.next());
        }
        unprocessedOpenedNotifs.clear();
    }

    public static void fireEmailUpdateFailure() {
        EmailUpdateHandler emailUpdateHandler = OneSignal.emailUpdateHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            OneSignal.emailUpdateHandler = null;
        }
    }

    public static void fireEmailUpdateSuccess() {
        EmailUpdateHandler emailUpdateHandler = OneSignal.emailUpdateHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onSuccess();
            OneSignal.emailUpdateHandler = null;
        }
    }

    public static void fireForegroundHandlers(OSNotificationController object) {
        OneSignal.onesignalLog(LOG_LEVEL.INFO, "Fire notificationWillShowInForegroundHandler");
        object = ((OSNotificationController)object).getNotificationReceivedEvent();
        try {
            notificationWillShowInForegroundHandler.notificationWillShowInForeground((OSNotificationReceivedEvent)object);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.onesignalLog(LOG_LEVEL.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            ((OSNotificationReceivedEvent)object).complete(((OSNotificationReceivedEvent)object).getNotification());
            throw throwable;
        }
    }

    private static void fireNotificationOpenedHandler(OSNotificationOpenedResult oSNotificationOpenedResult) {
        CallbackThreadManager.Companion.runOnPreferred(new Runnable(oSNotificationOpenedResult){
            public final OSNotificationOpenedResult val$openedResult;
            {
                this.val$openedResult = oSNotificationOpenedResult;
            }

            public void run() {
                notificationOpenedHandler.notificationOpened(this.val$openedResult);
            }
        });
    }

    public static void fireSMSUpdateFailure() {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsUpdateHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            smsUpdateHandler = null;
        }
    }

    public static void fireSMSUpdateSuccess(JSONObject jSONObject) {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsUpdateHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onSuccess(jSONObject);
            smsUpdateHandler = null;
        }
    }

    @NonNull
    private static OSNotificationOpenedResult generateNotificationOpenedResult(JSONArray object) {
        int n = object.length();
        int n2 = object.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean bl = true;
        Object object2 = null;
        Object object3 = null;
        for (int i = 0; i < n; ++i) {
            Object object4;
            Object object5;
            StringBuilder stringBuilder;
            block9: {
                stringBuilder = object2;
                object5 = object.getJSONObject(i);
                object4 = object2;
                if (object2 != null) break block9;
                object4 = object2;
                stringBuilder = object2;
                object3 = object5;
                if (!object5.has("actionId")) break block9;
                stringBuilder = object2;
                object3 = object5;
                object4 = object5.optString("actionId", null);
            }
            if (bl) {
                bl = false;
                object2 = object4;
                object3 = object5;
                continue;
            }
            stringBuilder = object4;
            object3 = object5;
            stringBuilder = object4;
            object3 = object5;
            object2 = new OSNotification((JSONObject)object5);
            stringBuilder = object4;
            object3 = object5;
            try {
                arrayList.add(object2);
                object2 = object4;
                object3 = object5;
                continue;
            }
            catch (Throwable throwable) {
                object5 = LOG_LEVEL.ERROR;
                object4 = new StringBuilder();
                object4.append("Error parsing JSON item ");
                object4.append(i);
                object4.append("/");
                object4.append(n);
                object4.append(" for callback.");
                OneSignal.Log((LOG_LEVEL)((Object)object5), object4.toString(), throwable);
                object2 = stringBuilder;
            }
        }
        object = object2 != null ? OSNotificationAction.ActionType.ActionTaken : OSNotificationAction.ActionType.Opened;
        object = new OSNotificationAction((OSNotificationAction.ActionType)((Object)object), (String)object2);
        return new OSNotificationOpenedResult(new OSNotification((List<OSNotification>)arrayList, (JSONObject)object3, n2), (OSNotificationAction)object);
    }

    @NonNull
    public static AppEntryAction getAppEntryState() {
        return appEntryState;
    }

    private static Integer getAppVersion() {
        Object object = appContext.getPackageName();
        if (((GetPackageInfoResult)(object = PackageInfoHelper.Companion.getInfo(appContext, (String)object, 0))).getSuccessful() && ((GetPackageInfoResult)object).getPackageInfo() != null) {
            return ((GetPackageInfoResult)object).getPackageInfo().versionCode;
        }
        return null;
    }

    public static boolean getClearGroupSummaryClick() {
        return remoteParamController.getClearGroupSummaryClick();
    }

    @Nullable
    public static Activity getCurrentActivity() {
        Object object = ActivityLifecycleListener.getActivityLifecycleHandler();
        object = object != null ? object.getCurActivity() : null;
        return object;
    }

    private static OSEmailSubscriptionState getCurrentEmailSubscriptionState(Context object) {
        if (object == null) {
            return null;
        }
        if (currentEmailSubscriptionState == null) {
            object = new OSEmailSubscriptionState(false);
            currentEmailSubscriptionState = object;
            ((OSEmailSubscriptionState)object).getObservable().addObserverStrong(new OSEmailSubscriptionChangedInternalObserver());
        }
        return currentEmailSubscriptionState;
    }

    private static OSPermissionState getCurrentPermissionState(Context object) {
        if (object == null) {
            return null;
        }
        if (currentPermissionState == null) {
            object = new OSPermissionState(false);
            currentPermissionState = object;
            ((OSPermissionState)object).getObservable().addObserverStrong(new OSPermissionChangedInternalObserver());
        }
        return currentPermissionState;
    }

    private static OSSMSSubscriptionState getCurrentSMSSubscriptionState(Context object) {
        if (object == null) {
            return null;
        }
        if (currentSMSSubscriptionState == null) {
            object = new OSSMSSubscriptionState(false);
            currentSMSSubscriptionState = object;
            ((OSSMSSubscriptionState)object).getObservable().addObserverStrong(new OSSMSSubscriptionChangedInternalObserver());
        }
        return currentSMSSubscriptionState;
    }

    private static OSSubscriptionState getCurrentSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentSubscriptionState == null) {
            currentSubscriptionState = new OSSubscriptionState(false, OneSignal.getCurrentPermissionState(context).areNotificationsEnabled());
            OneSignal.getCurrentPermissionState(context).getObservable().addObserver(currentSubscriptionState);
            currentSubscriptionState.getObservable().addObserverStrong(new OSSubscriptionChangedInternalObserver());
        }
        return currentSubscriptionState;
    }

    public static OneSignalDbHelper getDBHelperInstance() {
        return OneSignalDbHelper.getInstance((Context)appContext);
    }

    public static OneSignalDbHelper getDBHelperInstance(Context context) {
        return OneSignalDbHelper.getInstance((Context)context);
    }

    public static DelayedConsentInitializationParameters getDelayedInitParams() {
        return delayedInitParams;
    }

    @Nullable
    public static OSDeviceState getDeviceState() {
        Context context = appContext;
        if (context == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
            return null;
        }
        return new OSDeviceState(OneSignal.getCurrentSubscriptionState(context), OneSignal.getCurrentPermissionState(appContext), OneSignal.getCurrentEmailSubscriptionState(appContext), OneSignal.getCurrentSMSSubscriptionState(appContext));
    }

    public static boolean getDisableGMSMissingPrompt() {
        return remoteParamController.isGMSMissingPromptDisable();
    }

    public static String getEmailId() {
        if (emailId == null && appContext != null) {
            emailId = OneSignalPrefs.getString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty((CharSequence)emailId)) {
            return null;
        }
        return emailId;
    }

    public static OSEmailSubscriptionState getEmailSubscriptionState() {
        return OneSignal.getCurrentEmailSubscriptionState(appContext);
    }

    public static OSObservable<OSEmailSubscriptionObserver, OSEmailSubscriptionStateChanges> getEmailSubscriptionStateChangesObserver() {
        if (emailSubscriptionStateChangesObserver == null) {
            emailSubscriptionStateChangesObserver = new OSObservable("onOSEmailSubscriptionChanged", true);
        }
        return emailSubscriptionStateChangesObserver;
    }

    public static boolean getFirebaseAnalyticsEnabled() {
        return remoteParamController.getFirebaseAnalyticsEnabled();
    }

    public static FocusTimeController getFocusTimeController() {
        if (focusTimeController == null) {
            focusTimeController = new FocusTimeController(new OSFocusTimeProcessorFactory(), logger);
        }
        return focusTimeController;
    }

    public static OSInAppMessageController getInAppMessageController() {
        return inAppMessageControllerFactory.getController(OneSignal.getDBHelperInstance(), taskController, OneSignal.getLogger(), OneSignal.getSharedPreferences(), languageContext);
    }

    private static OSEmailSubscriptionState getLastEmailSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastEmailSubscriptionState == null) {
            lastEmailSubscriptionState = new OSEmailSubscriptionState(true);
        }
        return lastEmailSubscriptionState;
    }

    private static OSPermissionState getLastPermissionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastPermissionState == null) {
            lastPermissionState = new OSPermissionState(true);
        }
        return lastPermissionState;
    }

    private static OSSMSSubscriptionState getLastSMSSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastSMSSubscriptionState == null) {
            lastSMSSubscriptionState = new OSSMSSubscriptionState(true);
        }
        return lastSMSSubscriptionState;
    }

    private static long getLastSessionTime() {
        return OneSignalPrefs.getLong((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_LAST_SESSION_TIME", (long)-31000L);
    }

    private static OSSubscriptionState getLastSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastSubscriptionState == null) {
            lastSubscriptionState = new OSSubscriptionState(true, false);
        }
        return lastSubscriptionState;
    }

    private static LOG_LEVEL getLogLevel(int n) {
        switch (n) {
            default: {
                if (n >= 0) break;
                return LOG_LEVEL.NONE;
            }
            case 6: {
                return LOG_LEVEL.VERBOSE;
            }
            case 5: {
                return LOG_LEVEL.DEBUG;
            }
            case 4: {
                return LOG_LEVEL.INFO;
            }
            case 3: {
                return LOG_LEVEL.WARN;
            }
            case 2: {
                return LOG_LEVEL.ERROR;
            }
            case 1: {
                return LOG_LEVEL.FATAL;
            }
            case 0: {
                return LOG_LEVEL.NONE;
            }
        }
        return LOG_LEVEL.VERBOSE;
    }

    public static OSLogger getLogger() {
        return logger;
    }

    public static String getNotificationIdFromFCMJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", null);
            }
            logger.debug("Not a OneSignal formatted FCM message. No 'i' field in custom.");
        }
        catch (JSONException jSONException) {
            logger.debug("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OSOutcomeEventsController getOutcomeEventsController() {
        Object object;
        if (outcomeEventsController != null) return outcomeEventsController;
        Object object2 = object = outcomeEventsControllerSyncLock;
        synchronized (object2) {
            OSOutcomeEventsController oSOutcomeEventsController;
            if (outcomeEventsController != null) return outcomeEventsController;
            if (outcomeEventsFactory == null) {
                OneSignalDbHelper oneSignalDbHelper = OneSignal.getDBHelperInstance();
                oSOutcomeEventsController = new OSOutcomeEventsFactory(logger, apiClient, (OneSignalDb)oneSignalDbHelper, preferences);
                outcomeEventsFactory = oSOutcomeEventsController;
            }
            outcomeEventsController = oSOutcomeEventsController = new OSOutcomeEventsController(sessionManager, outcomeEventsFactory);
            return outcomeEventsController;
        }
    }

    public static OSObservable<OSPermissionObserver, OSPermissionStateChanges> getPermissionStateChangesObserver() {
        if (permissionStateChangesObserver == null) {
            permissionStateChangesObserver = new OSObservable("onOSPermissionChanged", true);
        }
        return permissionStateChangesObserver;
    }

    private static PushRegistrator getPushRegistrator() {
        PushRegistrator pushRegistrator = mPushRegistrator;
        if (pushRegistrator != null) {
            return pushRegistrator;
        }
        if (OSUtils.isFireOSDeviceType()) {
            mPushRegistrator = new PushRegistratorADM();
        } else if (OSUtils.isAndroidDeviceType()) {
            if (OSUtils.hasFCMLibrary()) {
                mPushRegistrator = OneSignal.getPushRegistratorFCM();
            }
        } else {
            mPushRegistrator = new PushRegistratorHMS();
        }
        return mPushRegistrator;
    }

    @NonNull
    private static PushRegistratorFCM getPushRegistratorFCM() {
        Object object = OneSignal.remoteParamController.getRemoteParams().fcmParams;
        object = object != null ? new PushRegistratorFCM.Params(object.projectId, object.appId, object.apiKey) : null;
        return new PushRegistratorFCM(appContext, (PushRegistratorFCM.Params)object);
    }

    public static OSRemoteParamController getRemoteParamController() {
        return remoteParamController;
    }

    public static OneSignalRemoteParams.Params getRemoteParams() {
        return remoteParamController.getRemoteParams();
    }

    public static String getSMSId() {
        if (smsId == null && appContext != null) {
            smsId = OneSignalPrefs.getString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty((CharSequence)smsId)) {
            return null;
        }
        return smsId;
    }

    public static OSSMSSubscriptionState getSMSSubscriptionState() {
        return OneSignal.getCurrentSMSSubscriptionState(appContext);
    }

    public static OSObservable<OSSMSSubscriptionObserver, OSSMSSubscriptionStateChanges> getSMSSubscriptionStateChangesObserver() {
        if (smsSubscriptionStateChangesObserver == null) {
            smsSubscriptionStateChangesObserver = new OSObservable("onSMSSubscriptionChanged", true);
        }
        return smsSubscriptionStateChangesObserver;
    }

    public static String getSavedAppId() {
        return OneSignal.getSavedAppId(appContext);
    }

    private static String getSavedAppId(Context context) {
        if (context == null) {
            return null;
        }
        return OneSignalPrefs.getString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_APP_ID", null);
    }

    private static String getSavedUserId(Context context) {
        if (context == null) {
            return null;
        }
        return OneSignalPrefs.getString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_PLAYER_ID", null);
    }

    public static String getSdkVersionRaw() {
        return VERSION;
    }

    public static OSSessionManager.SessionListener getSessionListener() {
        return sessionListener;
    }

    public static OSSessionManager getSessionManager() {
        return sessionManager;
    }

    public static OSSharedPreferences getSharedPreferences() {
        return preferences;
    }

    public static OSObservable<OSSubscriptionObserver, OSSubscriptionStateChanges> getSubscriptionStateChangesObserver() {
        if (subscriptionStateChangesObserver == null) {
            subscriptionStateChangesObserver = new OSObservable("onOSSubscriptionChanged", true);
        }
        return subscriptionStateChangesObserver;
    }

    public static void getTags(OSGetTagsHandler oSGetTagsHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("getTags()")) {
            logger.error("Waiting for remote params. Moving getTags() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(oSGetTagsHandler){
                public final OSGetTagsHandler val$getTagsHandler;
                {
                    this.val$getTagsHandler = oSGetTagsHandler;
                }

                public void run() {
                    logger.debug("Running getTags() operation from pending queue.");
                    OneSignal.getTags(this.val$getTagsHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("getTags()")) {
            return;
        }
        if (oSGetTagsHandler == null) {
            logger.error("getTags called with null GetTagsHandler!");
            return;
        }
        new Thread(new Runnable(oSGetTagsHandler){
            public final OSGetTagsHandler val$getTagsHandler;
            {
                this.val$getTagsHandler = oSGetTagsHandler;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                ArrayList arrayList;
                ArrayList arrayList2 = arrayList = pendingGetTagsHandlers;
                synchronized (arrayList2) {
                    pendingGetTagsHandlers.add((Object)this.val$getTagsHandler);
                    if (pendingGetTagsHandlers.size() > 1) {
                        return;
                    }
                }
                OneSignal.runGetTags();
            }
        }, "OS_GETTAGS").start();
    }

    public static OSTaskController getTaskController() {
        return taskController;
    }

    public static OSTaskController getTaskRemoteController() {
        return taskRemoteController;
    }

    @NonNull
    public static OSTime getTime() {
        return time;
    }

    private static String getTimeZoneId() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    private static int getTimeZoneOffset() {
        int n;
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int n2 = n = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            n2 = n + timeZone.getDSTSavings();
        }
        return n2 / 1000;
    }

    @Nullable
    public static Object getTriggerValueForKey(String string2) {
        if (appContext == null) {
            logger.error("Before calling getTriggerValueForKey, Make sure OneSignal initWithContext and setAppId is called first");
            return null;
        }
        return OneSignal.getInAppMessageController().getTriggerValue(string2);
    }

    public static Map<String, Object> getTriggers() {
        if (appContext == null) {
            logger.error("Before calling getTriggers, Make sure OneSignal initWithContext and setAppId is called first");
            return new HashMap();
        }
        return OneSignal.getInAppMessageController().getTriggers();
    }

    public static String getUserId() {
        Context context;
        if (userId == null && (context = appContext) != null) {
            userId = OneSignal.getSavedUserId(context);
        }
        return userId;
    }

    private static void handleActivityLifecycleHandler(Context context) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        boolean bl = context instanceof Activity;
        boolean bl2 = OneSignal.getCurrentActivity() == null;
        boolean bl3 = !bl2 || bl;
        OneSignal.setInForeground(bl3);
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = z2.t("OneSignal handleActivityLifecycleHandler inForeground: ");
        stringBuilder.append(inForeground);
        oSLogger.debug(stringBuilder.toString());
        if (inForeground) {
            if (bl2 && bl && activityLifecycleHandler != null) {
                activityLifecycleHandler.setCurActivity((Activity)context);
                activityLifecycleHandler.setNextResumeIsFirstActivity(true);
            }
            OSNotificationRestoreWorkManager.beginEnqueueingWork(context, false);
            OneSignal.getFocusTimeController().appForegrounded();
        } else if (activityLifecycleHandler != null) {
            activityLifecycleHandler.setNextResumeIsFirstActivity(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void handleAmazonPurchase() {
        try {
            TrackAmazonPurchase trackAmazonPurchase;
            Class.forName((String)"com.amazon.device.iap.PurchasingListener");
            OneSignal.trackAmazonPurchase = trackAmazonPurchase = new TrackAmazonPurchase(appContext);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }

    private static void handleAppIdChange() {
        Object object = OneSignal.getSavedAppId();
        if (object != null) {
            if (!object.equals((Object)appId)) {
                LOG_LEVEL lOG_LEVEL = LOG_LEVEL.DEBUG;
                object = a.s("App id has changed:\nFrom: ", object, "\n To: ");
                object.append(appId);
                object.append("\nClearing the user id, app state, and remoteParams as they are no longer valid");
                OneSignal.Log(lOG_LEVEL, object.toString());
                OneSignal.saveAppId(appId);
                OneSignalStateSynchronizer.resetCurrentState();
                remoteParamController.clearRemoteParams();
            }
        } else {
            object = LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = z2.t("App id set for first time:  ");
            stringBuilder.append(appId);
            OneSignal.Log((LOG_LEVEL)((Object)object), stringBuilder.toString());
            BadgeCountUpdater.updateCount(0, appContext);
            OneSignal.saveAppId(appId);
        }
    }

    public static void handleFailedEmailLogout() {
        EmailUpdateHandler emailUpdateHandler = emailLogoutHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            emailLogoutHandler = null;
        }
    }

    public static void handleFailedSMSLogout() {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsLogoutHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            smsLogoutHandler = null;
        }
    }

    public static void handleNotificationOpen(Activity activity, JSONArray jSONArray, @Nullable String string2) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName(null)) {
            return;
        }
        OneSignal.notificationOpenedRESTCall((Context)activity, jSONArray);
        if (trackFirebaseAnalytics != null && OneSignal.getFirebaseAnalyticsEnabled()) {
            trackFirebaseAnalytics.trackOpenedEvent(OneSignal.generateNotificationOpenedResult(jSONArray));
        }
        if (OneSignal.shouldInitDirectSessionFromNotificationOpen(activity, jSONArray)) {
            OneSignal.applicationOpenedByNotification(string2);
        }
        OneSignal.openDestinationActivity(activity, jSONArray);
        OneSignal.runNotificationOpenedCallback(jSONArray);
    }

    public static void handleNotificationReceived(OSNotificationGenerationJob oSNotificationGenerationJob) {
        try {
            JSONObject jSONObject = new JSONObject(oSNotificationGenerationJob.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", (Object)oSNotificationGenerationJob.getAndroidId());
            oSNotificationGenerationJob = OneSignal.generateNotificationOpenedResult(NotificationBundleProcessor.newJsonArray(jSONObject));
            if (trackFirebaseAnalytics != null && OneSignal.getFirebaseAnalyticsEnabled()) {
                trackFirebaseAnalytics.trackReceivedEvent((OSNotificationOpenedResult)oSNotificationGenerationJob);
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public static void handleSuccessfulEmailLogout() {
        EmailUpdateHandler emailUpdateHandler = emailLogoutHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onSuccess();
            emailLogoutHandler = null;
        }
    }

    public static void handleSuccessfulSMSlLogout(JSONObject jSONObject) {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsLogoutHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onSuccess(jSONObject);
            smsLogoutHandler = null;
        }
    }

    public static boolean hasEmailId() {
        return TextUtils.isEmpty((CharSequence)emailId) ^ true;
    }

    public static boolean hasSMSlId() {
        return TextUtils.isEmpty((CharSequence)smsId) ^ true;
    }

    public static boolean hasUserId() {
        boolean bl = OneSignal.getUserId() != null;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void init(Context context) {
        Class<OneSignal> clazz = OneSignal.class;
        synchronized (OneSignal.class) {
            logger.verbose("Starting OneSignal initialization!");
            OSNotificationController.setupNotificationServiceExtension(appContext);
            if (!OneSignal.requiresUserPrivacyConsent() && remoteParamController.isRemoteParamsCallDone()) {
                int n = subscribableStatus;
                if (n == Integer.MAX_VALUE) {
                    n = osUtils.initializationChecker(appContext, appId);
                }
                subscribableStatus = n;
                boolean bl = OneSignal.isSubscriptionStatusUninitializable();
                if (bl) {
                    // ** MonitorExit[var4_1] (shouldn't be in output)
                    return;
                }
                if (initDone) {
                    if (notificationOpenedHandler != null) {
                        OneSignal.fireCallbackForOpenedNotifications();
                    }
                    logger.debug("OneSignal SDK initialization already completed.");
                    // ** MonitorExit[var4_1] (shouldn't be in output)
                    return;
                }
                OneSignal.handleActivityLifecycleHandler(context);
                appActivity = null;
                OneSignalStateSynchronizer.initUserState();
                OneSignal.handleAppIdChange();
                OneSignal.handleAmazonPurchase();
                OSPermissionChangedInternalObserver.handleInternalChanges(OneSignal.getCurrentPermissionState(appContext));
                OneSignal.doSessionInit();
                if (notificationOpenedHandler != null) {
                    OneSignal.fireCallbackForOpenedNotifications();
                }
                if (TrackGooglePurchase.CanTrack((Context)appContext)) {
                    context = new TrackGooglePurchase(appContext);
                    trackGooglePurchase = context;
                }
                if (TrackFirebaseAnalytics.CanTrack()) {
                    context = new TrackFirebaseAnalytics(appContext);
                    trackFirebaseAnalytics = context;
                }
                initDone = true;
                OneSignal.Log(LOG_LEVEL.VERBOSE, "OneSignal SDK initialization done.");
                OneSignal.getOutcomeEventsController().sendSavedOutcomes();
                taskRemoteController.startPendingTasks();
                // ** MonitorExit[var4_1] (shouldn't be in output)
                return;
            }
            if (!remoteParamController.isRemoteParamsCallDone()) {
                logger.verbose("OneSignal SDK initialization delayed, waiting for remote params.");
            } else {
                logger.verbose("OneSignal SDK initialization delayed, waiting for privacy consent to be set.");
            }
            Object object = new DelayedConsentInitializationParameters(appContext, appId);
            delayedInitParams = object;
            object = appId;
            appId = null;
            if (object != null && context != null) {
                OneSignal.makeAndroidParamsRequest((String)object, OneSignal.getUserId(), false);
            }
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return;
        }
    }

    public static void initWithContext(@NonNull Context object) {
        if (object == null) {
            logger.warning("initWithContext called with null context, ignoring!");
            return;
        }
        if (object instanceof Activity) {
            appActivity = new WeakReference((Object)((Activity)object));
        }
        boolean bl = appContext == null;
        appContext = object.getApplicationContext();
        OneSignal.setupContextListeners(bl);
        OneSignal.setupPrivacyConsent(appContext);
        if (appId == null) {
            object = OneSignal.getSavedAppId();
            if (object == null) {
                logger.warning("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
            } else {
                OSLogger oSLogger = logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("appContext set and cached app id found, calling setAppId with: ");
                stringBuilder.append((String)object);
                oSLogger.verbose(stringBuilder.toString());
                OneSignal.setAppId((String)object);
            }
            return;
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initWithContext called with: ");
        stringBuilder.append(object);
        oSLogger.verbose(stringBuilder.toString());
        OneSignal.init(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void internalFireGetTagsCallbacks() {
        ArrayList<OSGetTagsHandler> arrayList;
        ArrayList<OSGetTagsHandler> arrayList2 = arrayList = pendingGetTagsHandlers;
        synchronized (arrayList2) {
            if (arrayList.size() == 0) {
                return;
            }
        }
        new Thread(new Runnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                ArrayList arrayList;
                UserStateSynchronizer.GetTagsResult getTagsResult = OneSignalStateSynchronizer.getTags((boolean)(getTagsCall ^ true));
                if (getTagsResult.serverSuccess) {
                    OneSignal.access$1802(true);
                }
                ArrayList arrayList2 = arrayList = pendingGetTagsHandlers;
                synchronized (arrayList2) {
                    Iterator iterator = pendingGetTagsHandlers.iterator();
                    while (true) {
                        if (!iterator.hasNext()) {
                            pendingGetTagsHandlers.clear();
                            return;
                        }
                        OSGetTagsHandler oSGetTagsHandler = (OSGetTagsHandler)iterator.next();
                        JSONObject jSONObject = getTagsResult.result != null && !getTagsResult.toString().equals((Object)"{}") ? getTagsResult.result : null;
                        oSGetTagsHandler.tagsAvailable(jSONObject);
                    }
                }
            }
        }, "OS_GETTAGS_CALLBACK").start();
    }

    public static boolean isAppActive() {
        boolean bl = initDone && OneSignal.isInForeground();
        return bl;
    }

    public static boolean isInAppMessagingPaused() {
        if (appContext == null) {
            logger.error("Before calling isInAppMessagingPaused, Make sure OneSignal initWithContext and setAppId is called first");
            return false;
        }
        return OneSignal.getInAppMessageController().inAppMessagingEnabled() ^ true;
    }

    public static boolean isInForeground() {
        return inForeground;
    }

    public static boolean isInitDone() {
        return initDone;
    }

    public static boolean isLocationShared() {
        return remoteParamController.isLocationShared();
    }

    private static boolean isPastOnSessionTime() {
        long l = OneSignal.getTime().getCurrentTimeMillis();
        long l2 = OneSignal.getLastSessionTime();
        long l3 = l - l2;
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isPastOnSessionTime currentTimeMillis: ");
        stringBuilder.append(l);
        stringBuilder.append(" lastSessionTime: ");
        stringBuilder.append(l2);
        stringBuilder.append(" difference: ");
        stringBuilder.append(l3);
        oSLogger.debug(stringBuilder.toString());
        boolean bl = l3 >= 30000L;
        return bl;
    }

    private static boolean isSubscriptionStatusUninitializable() {
        boolean bl = subscribableStatus == -999;
        return bl;
    }

    public static boolean isUserPrivacyConsentRequired() {
        return remoteParamController.isPrivacyConsentRequired();
    }

    private static boolean isValidOutcomeEntry(String string2) {
        if (string2 != null && !string2.isEmpty()) {
            return true;
        }
        OneSignal.Log(LOG_LEVEL.ERROR, "Outcome name must not be empty");
        return false;
    }

    private static boolean isValidOutcomeValue(float f) {
        if (f <= 0.0f) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Outcome value must be greater than 0");
            return false;
        }
        return true;
    }

    public static void logHttpError(String string2, int n, Throwable throwable, String string3) {
        string3 = string3 != null && OneSignal.atLogLevel(LOG_LEVEL.INFO) ? z2.p("\n", string3, "\n") : "";
        LOG_LEVEL lOG_LEVEL = LOG_LEVEL.WARN;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP code: ");
        stringBuilder.append(n);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), throwable);
    }

    public static void logoutEmail() {
        OneSignal.logoutEmail(null);
    }

    public static void logoutEmail(@Nullable EmailUpdateHandler emailUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("logoutEmail()")) {
            logger.error("Waiting for remote params. Moving logoutEmail() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(emailUpdateHandler){
                public final EmailUpdateHandler val$callback;
                {
                    this.val$callback = emailUpdateHandler;
                }

                public void run() {
                    logger.debug("Running  logoutEmail() operation from pending task queue.");
                    OneSignal.logoutEmail(this.val$callback);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("logoutEmail()")) {
            return;
        }
        if (OneSignal.getEmailId() == null) {
            if (emailUpdateHandler != null) {
                emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.INVALID_OPERATION, "logoutEmail not valid as email was not set or already logged out!"));
            }
            logger.error("logoutEmail not valid as email was not set or already logged out!");
            return;
        }
        emailLogoutHandler = emailUpdateHandler;
        OneSignalStateSynchronizer.logoutEmail();
    }

    public static void logoutSMSNumber() {
        OneSignal.logoutSMSNumber(null);
    }

    public static void logoutSMSNumber(@Nullable OSSMSUpdateHandler oSSMSUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("logoutSMSNumber()")) {
            logger.error("Waiting for remote params. Moving logoutSMSNumber() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(oSSMSUpdateHandler){
                public final OSSMSUpdateHandler val$callback;
                {
                    this.val$callback = oSSMSUpdateHandler;
                }

                public void run() {
                    logger.debug("Running  logoutSMSNumber() operation from pending task queue.");
                    OneSignal.logoutSMSNumber(this.val$callback);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("logoutSMSNumber()")) {
            return;
        }
        if (OneSignal.getSMSId() == null) {
            if (oSSMSUpdateHandler != null) {
                oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.INVALID_OPERATION, "logoutSMSNumber() not valid as sms number was not set or already logged out!"));
            }
            logger.error("logoutSMSNumber() not valid as sms number was not set or already logged out!");
            return;
        }
        smsLogoutHandler = oSSMSUpdateHandler;
        OneSignalStateSynchronizer.logoutSMS();
    }

    private static void makeAndroidParamsRequest(String string2, String string3, boolean bl) {
        if (OneSignal.getRemoteParams() == null && !androidParamsRequestStarted) {
            androidParamsRequestStarted = true;
            OneSignalRemoteParams.makeAndroidParamsRequest((String)string2, (String)string3, (OneSignalRemoteParams.Callback)new 7(bl));
        }
    }

    public static void notValidOrDuplicated(Context context, JSONObject jSONObject, @NonNull OSNotificationDataController.InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if (notificationDataController == null) {
            notificationDataController = new OSNotificationDataController(OneSignal.getDBHelperInstance(context), logger);
        }
        notificationDataController.notValidOrDuplicated(jSONObject, invalidOrDuplicateNotificationCallback);
    }

    private static void notificationOpenedRESTCall(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); ++i) {
            try {
                Object object = jSONArray.getJSONObject(i);
                JSONObject jSONObject = new JSONObject(object.optString("custom", null));
                String string2 = jSONObject.optString("i", null);
                if (postedOpenedNotifIds.contains((Object)string2)) continue;
                postedOpenedNotifIds.add((Object)string2);
                jSONObject = new JSONObject();
                jSONObject.put("app_id", (Object)OneSignal.getSavedAppId(context));
                jSONObject.put("player_id", (Object)OneSignal.getSavedUserId(context));
                jSONObject.put("opened", true);
                jSONObject.put("device_type", osUtils.getDeviceType());
                object = new StringBuilder();
                object.append("notifications/");
                object.append(string2);
                object = object.toString();
                string2 = new 26();
                OneSignalRestClient.put((String)object, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)string2);
                continue;
            }
            catch (Throwable throwable) {
                OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON to send notification opened.", throwable);
            }
        }
    }

    public static void onAppFocus() {
        LOG_LEVEL lOG_LEVEL = LOG_LEVEL.DEBUG;
        OneSignal.Log(lOG_LEVEL, "Application on focus");
        OneSignal.setInForeground(true);
        AppEntryAction appEntryAction = appEntryState;
        AppEntryAction appEntryAction2 = AppEntryAction.NOTIFICATION_CLICK;
        if (!appEntryAction.equals((Object)appEntryAction2)) {
            OneSignal.callEntryStateListeners(appEntryState);
            if (!appEntryState.equals((Object)appEntryAction2)) {
                appEntryState = AppEntryAction.APP_OPEN;
            }
        }
        LocationController.onFocusChange();
        NotificationPermissionController.INSTANCE.onAppForegrounded();
        if (OSUtils.shouldLogMissingAppIdError(appId)) {
            return;
        }
        if (!remoteParamController.isRemoteParamsCallDone()) {
            OneSignal.Log(lOG_LEVEL, "Delay onAppFocus logic due to missing remote params");
            OneSignal.makeAndroidParamsRequest(appId, OneSignal.getUserId(), false);
            return;
        }
        OneSignal.onAppFocusLogic();
    }

    private static void onAppFocusLogic() {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("onAppFocus")) {
            return;
        }
        OneSignal.getFocusTimeController().appForegrounded();
        OneSignal.doSessionInit();
        TrackGooglePurchase trackGooglePurchase = OneSignal.trackGooglePurchase;
        if (trackGooglePurchase != null) {
            trackGooglePurchase.trackIAP();
        }
        OSNotificationRestoreWorkManager.beginEnqueueingWork(appContext, false);
        OneSignal.refreshNotificationPermissionState();
        if (trackFirebaseAnalytics != null && OneSignal.getFirebaseAnalyticsEnabled()) {
            trackFirebaseAnalytics.trackInfluenceOpenEvent();
        }
        OSSyncService.getInstance().cancelSyncTask(appContext);
    }

    @WorkerThread
    public static void onAppLostFocus() {
        LOG_LEVEL lOG_LEVEL = LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("Application lost focus initDone: ");
        stringBuilder.append(initDone);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        OneSignal.setInForeground(false);
        appEntryState = AppEntryAction.APP_CLOSE;
        OneSignal.setLastSessionTime(OneSignal.getTime().getCurrentTimeMillis());
        LocationController.onFocusChange();
        if (!initDone) {
            if (taskRemoteController.shouldQueueTaskForInit("onAppLostFocus()")) {
                logger.error("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                taskRemoteController.addTaskToQueue(new Runnable(){

                    public void run() {
                        logger.debug("Running onAppLostFocus() operation from a pending task queue.");
                        OneSignal.backgroundSyncLogic();
                    }
                });
            }
            return;
        }
        OneSignal.backgroundSyncLogic();
    }

    public static void onAppStartFocusLogic() {
        OneSignal.refreshNotificationPermissionState();
    }

    public static void onRemoteParamSet() {
        if (!OneSignal.reassignDelayedInitParams() && inForeground) {
            OneSignal.onAppFocusLogic();
        }
    }

    public static void onesignalLog(LOG_LEVEL lOG_LEVEL, String string2) {
        OneSignal.Log(lOG_LEVEL, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void openDestinationActivity(@NonNull Activity activity, @NonNull JSONArray jSONArray) {
        try {
            jSONArray = jSONArray.getJSONObject(0);
            jSONArray = GenerateNotificationOpenIntentFromPushPayload.INSTANCE.create((Context)activity, (JSONObject)jSONArray).getIntentVisible();
            if (jSONArray != null) {
                OSLogger oSLogger = logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SDK running startActivity with Intent: ");
                stringBuilder.append((Object)jSONArray);
                oSLogger.info(stringBuilder.toString());
                activity.startActivity((Intent)jSONArray);
                return;
            }
            logger.info("SDK not showing an Activity automatically due to it's settings.");
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public static void pauseInAppMessages(boolean bl) {
        if (appContext == null) {
            logger.error("Waiting initWithContext. Moving pauseInAppMessages() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(bl){
                public final boolean val$pause;
                {
                    this.val$pause = bl;
                }

                public void run() {
                    logger.debug("Running pauseInAppMessages() operation from pending queue.");
                    OneSignal.pauseInAppMessages(this.val$pause);
                }
            });
            return;
        }
        OneSignal.getInAppMessageController().setInAppMessagingEnabled(bl ^ true);
    }

    public static void postNotification(String string2, PostNotificationResponseHandler postNotificationResponseHandler) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            OneSignal.postNotification(jSONObject, postNotificationResponseHandler);
        }
        catch (JSONException jSONException) {
            LOG_LEVEL lOG_LEVEL = LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid postNotification JSON format: ");
            stringBuilder.append(string2);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void postNotification(JSONObject jSONObject, PostNotificationResponseHandler postNotificationResponseHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("postNotification()")) {
            return;
        }
        try {
            if (!jSONObject.has("app_id")) {
                jSONObject.put("app_id", (Object)OneSignal.getSavedAppId());
            }
            if (!jSONObject.has("app_id")) {
                if (postNotificationResponseHandler == null) return;
                jSONObject = new JSONObject();
                postNotificationResponseHandler.onFailure(jSONObject.put("error", (Object)"Missing app_id"));
                return;
            }
            21 var2_5 = new 21(postNotificationResponseHandler);
            OneSignalRestClient.post((String)"notifications/", (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)var2_5);
            return;
        }
        catch (JSONException jSONException) {
            logger.error("HTTP create notification json exception!", jSONException);
            if (postNotificationResponseHandler == null) return;
            try {
                JSONObject jSONObject2 = new JSONObject("{'error': 'HTTP create notification json exception!'}");
                postNotificationResponseHandler.onFailure(jSONObject2);
                return;
            }
            catch (JSONException jSONException2) {
                jSONException2.printStackTrace();
            }
        }
    }

    public static void promptForPushNotifications() {
        OneSignal.promptForPushNotifications(false);
    }

    public static void promptForPushNotifications(boolean bl) {
        OneSignal.promptForPushNotifications(bl, null);
    }

    public static void promptForPushNotifications(boolean bl, @Nullable PromptForPushNotificationPermissionResponseHandler promptForPushNotificationPermissionResponseHandler) {
        NotificationPermissionController.INSTANCE.prompt(bl, promptForPushNotificationPermissionResponseHandler);
    }

    public static void promptLocation() {
        OneSignal.promptLocation(null, false);
    }

    public static void promptLocation(@Nullable OSPromptActionCompletionCallback oSPromptActionCompletionCallback, boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("promptLocation()")) {
            logger.error("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(oSPromptActionCompletionCallback, bl){
                public final OSPromptActionCompletionCallback val$callback;
                public final boolean val$fallbackToSettings;
                {
                    this.val$callback = oSPromptActionCompletionCallback;
                    this.val$fallbackToSettings = bl;
                }

                public void run() {
                    logger.debug("Running promptLocation() operation from pending queue.");
                    OneSignal.promptLocation(this.val$callback, this.val$fallbackToSettings);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("promptLocation()")) {
            return;
        }
        oSPromptActionCompletionCallback = new 30(oSPromptActionCompletionCallback);
        LocationController.getLocation(appContext, true, bl, (LocationController.LocationHandler)((Object)oSPromptActionCompletionCallback));
    }

    public static void provideUserConsent(boolean bl) {
        boolean bl2 = OneSignal.userProvidedPrivacyConsent();
        remoteParamController.saveUserConsentStatus(bl);
        if (!bl2 && bl && delayedInitParams != null) {
            OneSignal.Log(LOG_LEVEL.VERBOSE, "Privacy consent provided, reassigning all delayed init params and attempting init again...");
            OneSignal.reassignDelayedInitParams();
        }
    }

    private static boolean pushStatusRuntimeError(int n) {
        boolean bl = n < -6;
        return bl;
    }

    private static boolean reassignDelayedInitParams() {
        String string2;
        if (initDone) {
            return false;
        }
        DelayedConsentInitializationParameters delayedConsentInitializationParameters = delayedInitParams;
        if (delayedConsentInitializationParameters == null) {
            string2 = OneSignal.getSavedAppId();
            delayedConsentInitializationParameters = appContext;
            logger.error("Trying to continue OneSignal with null delayed params");
        } else {
            string2 = delayedConsentInitializationParameters.getAppId();
            delayedConsentInitializationParameters = delayedInitParams.getContext();
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = z2.t("reassignDelayedInitParams with appContext: ");
        stringBuilder.append((Object)appContext);
        oSLogger.debug(stringBuilder.toString());
        delayedInitParams = null;
        OneSignal.setAppId(string2);
        if (!initDone) {
            if (delayedConsentInitializationParameters == null) {
                logger.error("Trying to continue OneSignal with null delayed params context");
                return false;
            }
            OneSignal.initWithContext((Context)delayedConsentInitializationParameters);
        }
        return true;
    }

    public static void refreshNotificationPermissionState() {
        OneSignal.getCurrentPermissionState(appContext).refreshAsTo();
    }

    private static void registerForPushToken() {
        OneSignal.getPushRegistrator().registerForPush(appContext, googleProjectNumber, (PushRegistrator.RegisteredHandler)new 6());
    }

    private static void registerUser() {
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = z2.t("registerUser:registerForPushFired:");
        stringBuilder.append(registerForPushFired);
        stringBuilder.append(", locationFired: ");
        stringBuilder.append(locationFired);
        stringBuilder.append(", remoteParams: ");
        stringBuilder.append((Object)OneSignal.getRemoteParams());
        stringBuilder.append(", appId: ");
        stringBuilder.append(appId);
        oSLogger.debug(stringBuilder.toString());
        if (registerForPushFired && locationFired && OneSignal.getRemoteParams() != null && appId != null) {
            OSUtils.startThreadWithRetry(new Thread(new Runnable(){

                public void run() {
                    try {
                        OneSignal.registerUserTask();
                    }
                    catch (JSONException jSONException) {
                        OneSignal.Log(LOG_LEVEL.FATAL, "FATAL Error registering device!", jSONException);
                    }
                }
            }, "OS_REG_USER"));
            return;
        }
        logger.debug("registerUser not possible");
    }

    private static void registerUserTask() throws JSONException {
        String string2 = appContext.getPackageName();
        Object object = new JSONObject();
        object.put("app_id", (Object)OneSignal.getSavedAppId());
        object.put("device_os", (Object)Build.VERSION.RELEASE);
        object.put("timezone", OneSignal.getTimeZoneOffset());
        object.put("timezone_id", (Object)OneSignal.getTimeZoneId());
        object.put("language", (Object)languageContext.getLanguage());
        object.put("sdk", (Object)VERSION);
        object.put("sdk_type", (Object)sdkType);
        object.put("android_package", (Object)string2);
        object.put("device_model", (Object)Build.MODEL);
        string2 = OneSignal.getAppVersion();
        if (string2 != null) {
            object.put("game_version", (Object)string2);
        }
        object.put("net_type", (Object)osUtils.getNetType());
        object.put("carrier", (Object)osUtils.getCarrierName());
        object.put("rooted", RootToolsInternalMethods.isRooted());
        OneSignalStateSynchronizer.updateDeviceInfo((JSONObject)object, null);
        object = new JSONObject();
        object.put("identifier", (Object)lastRegistrationId);
        object.put("subscribableStatus", subscribableStatus);
        object.put("androidPermission", OneSignal.areNotificationsEnabledForSubscribedState());
        object.put("device_type", osUtils.getDeviceType());
        OneSignalStateSynchronizer.updatePushState((JSONObject)object);
        if (OneSignal.isLocationShared() && (object = lastLocationPoint) != null) {
            OneSignalStateSynchronizer.updateLocation((LocationController.LocationPoint)object);
        }
        logger.debug("registerUserTask calling readyToUpdate");
        OneSignalStateSynchronizer.readyToUpdate((boolean)true);
        waitingToPostStateSync = false;
    }

    public static void removeEmailSubscriptionObserver(@NonNull OSEmailSubscriptionObserver oSEmailSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify email subscription observer");
            return;
        }
        OneSignal.getEmailSubscriptionStateChangesObserver().removeObserver(oSEmailSubscriptionObserver);
    }

    public static void removeEntryStateListener(EntryStateListener entryStateListener) {
        entryStateListeners.remove((Object)entryStateListener);
    }

    public static void removeExternalUserId() {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeExternalUserId()")) {
            return;
        }
        OneSignal.removeExternalUserId(null);
    }

    public static void removeExternalUserId(OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeExternalUserId()")) {
            return;
        }
        OneSignal.setExternalUserId("", oSExternalUserIdUpdateCompletionHandler);
    }

    public static void removeGroupedNotifications(String string2) {
        if (!taskRemoteController.shouldQueueTaskForInit("removeGroupedNotifications()") && notificationDataController != null) {
            if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeGroupedNotifications()")) {
                return;
            }
            notificationDataController.removeGroupedNotifications(string2, new WeakReference((Object)appContext));
            return;
        }
        logger.error("Waiting for remote params. Moving removeGroupedNotifications() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(string2){
            public final String val$group;
            {
                this.val$group = string2;
            }

            public void run() {
                logger.debug("Running removeGroupedNotifications() operation from pending queue.");
                OneSignal.removeGroupedNotifications(this.val$group);
            }
        });
    }

    public static void removeNotification(int n) {
        if (!taskRemoteController.shouldQueueTaskForInit("removeNotification()") && notificationDataController != null) {
            if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeNotification()")) {
                return;
            }
            notificationDataController.removeNotification(n, new WeakReference((Object)appContext));
            return;
        }
        logger.error("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(n){
            public final int val$id;
            {
                this.val$id = n;
            }

            public void run() {
                logger.debug("Running removeNotification() operation from pending queue.");
                OneSignal.removeNotification(this.val$id);
            }
        });
    }

    public static void removePermissionObserver(OSPermissionObserver oSPermissionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify permission observer");
            return;
        }
        OneSignal.getPermissionStateChangesObserver().removeObserver(oSPermissionObserver);
    }

    public static void removeSMSSubscriptionObserver(@NonNull OSSMSSubscriptionObserver oSSMSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify sms subscription observer");
            return;
        }
        OneSignal.getSMSSubscriptionStateChangesObserver().removeObserver(oSSMSSubscriptionObserver);
    }

    public static void removeSubscriptionObserver(OSSubscriptionObserver oSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify subscription observer");
            return;
        }
        OneSignal.getSubscriptionStateChangesObserver().removeObserver(oSSubscriptionObserver);
    }

    public static void removeTriggerForKey(String string2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)string2);
        OneSignal.getInAppMessageController().removeTriggersForKeys((Collection)arrayList);
    }

    public static void removeTriggersForKeys(Collection<String> collection) {
        OneSignal.getInAppMessageController().removeTriggersForKeys(collection);
    }

    public static boolean requiresUserPrivacyConsent() {
        boolean bl = appContext == null || OneSignal.isUserPrivacyConsentRequired() && !OneSignal.userProvidedPrivacyConsent();
        return bl;
    }

    private static void runGetTags() {
        if (OneSignal.getUserId() == null) {
            logger.warning("getTags called under a null user!");
            return;
        }
        OneSignal.internalFireGetTagsCallbacks();
    }

    private static void runNotificationOpenedCallback(JSONArray jSONArray) {
        if (notificationOpenedHandler == null) {
            unprocessedOpenedNotifs.add((Object)jSONArray);
            return;
        }
        jSONArray = OneSignal.generateNotificationOpenedResult(jSONArray);
        OneSignal.addEntryStateListener((EntryStateListener)jSONArray, appEntryState);
        OneSignal.fireNotificationOpenedHandler((OSNotificationOpenedResult)jSONArray);
    }

    private static void saveAppId(String string2) {
        if (appContext == null) {
            return;
        }
        OneSignalPrefs.saveString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_APP_ID", (String)string2);
    }

    public static void saveEmailId(String string2) {
        emailId = string2;
        if (appContext == null) {
            return;
        }
        String string3 = OneSignalPrefs.PREFS_ONESIGNAL;
        string2 = "".equals((Object)emailId) ? null : emailId;
        OneSignalPrefs.saveString((String)string3, (String)"OS_EMAIL_ID", (String)string2);
    }

    public static void saveSMSId(String string2) {
        smsId = string2;
        if (appContext == null) {
            return;
        }
        String string3 = OneSignalPrefs.PREFS_ONESIGNAL;
        string2 = "".equals((Object)smsId) ? null : smsId;
        OneSignalPrefs.saveString((String)string3, (String)"PREFS_OS_SMS_ID", (String)string2);
    }

    public static void saveUserId(String string2) {
        userId = string2;
        if (appContext == null) {
            return;
        }
        OneSignalPrefs.saveString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_PLAYER_ID", (String)userId);
    }

    private static boolean scheduleSyncService() {
        boolean bl = OneSignalStateSynchronizer.persist();
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal scheduleSyncService unsyncedChanges: ");
        stringBuilder.append(bl);
        oSLogger.debug(stringBuilder.toString());
        if (bl) {
            OSSyncService.getInstance().scheduleSyncTask(appContext);
        }
        boolean bl2 = LocationController.scheduleUpdate(appContext);
        oSLogger = logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal scheduleSyncService locationScheduled: ");
        stringBuilder.append(bl2);
        oSLogger.debug(stringBuilder.toString());
        bl2 = bl2 || bl;
        return bl2;
    }

    public static void sendClickActionOutcomes(@NonNull List<OSInAppMessageOutcome> list) {
        OSOutcomeEventsController oSOutcomeEventsController = outcomeEventsController;
        if (oSOutcomeEventsController != null && appId != null) {
            oSOutcomeEventsController.sendClickActionOutcomes(list);
            return;
        }
        OneSignal.Log(LOG_LEVEL.ERROR, "Make sure OneSignal.init is called first");
    }

    public static void sendOutcome(@NonNull String string2) {
        OneSignal.sendOutcome(string2, null);
    }

    public static void sendOutcome(@NonNull String string2, OutcomeCallback outcomeCallback) {
        if (!OneSignal.isValidOutcomeEntry(string2)) {
            logger.error("Make sure OneSignal initWithContext and setAppId is called first");
            return;
        }
        if (!taskRemoteController.shouldQueueTaskForInit("sendOutcome()") && outcomeEventsController != null) {
            if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendOutcome()")) {
                return;
            }
            outcomeEventsController.sendOutcomeEvent(string2, outcomeCallback);
            return;
        }
        logger.error("Waiting for remote params. Moving sendOutcome() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(string2, outcomeCallback){
            public final OutcomeCallback val$callback;
            public final String val$name;
            {
                this.val$name = string2;
                this.val$callback = outcomeCallback;
            }

            public void run() {
                logger.debug("Running sendOutcome() operation from pending queue.");
                OneSignal.sendOutcome(this.val$name, this.val$callback);
            }
        });
    }

    public static void sendOutcomeWithValue(@NonNull String string2, float f) {
        OneSignal.sendOutcomeWithValue(string2, f, null);
    }

    public static void sendOutcomeWithValue(@NonNull String string2, float f, OutcomeCallback outcomeCallback) {
        if (OneSignal.isValidOutcomeEntry(string2) && OneSignal.isValidOutcomeValue(f)) {
            OSOutcomeEventsController oSOutcomeEventsController;
            if (!taskRemoteController.shouldQueueTaskForInit("sendOutcomeWithValue()") && (oSOutcomeEventsController = outcomeEventsController) != null) {
                oSOutcomeEventsController.sendOutcomeEventWithValue(string2, f, outcomeCallback);
                return;
            }
            logger.error("Waiting for remote params. Moving sendOutcomeWithValue() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(string2, f, outcomeCallback){
                public final OutcomeCallback val$callback;
                public final String val$name;
                public final float val$value;
                {
                    this.val$name = string2;
                    this.val$value = f;
                    this.val$callback = outcomeCallback;
                }

                public void run() {
                    logger.debug("Running sendOutcomeWithValue() operation from pending queue.");
                    OneSignal.sendOutcomeWithValue(this.val$name, this.val$value, this.val$callback);
                }
            });
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void sendPurchases(JSONArray object, boolean bl, OneSignalRestClient.ResponseHandler responseHandler) {
        void var2_4;
        void var1_3;
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendPurchases()")) {
            return;
        }
        if (OneSignal.getUserId() == null) {
            IAPUpdateJob iAPUpdateJob;
            iapUpdateJob = iAPUpdateJob = new IAPUpdateJob((JSONArray)object);
            iAPUpdateJob.newAsExisting = var1_3;
            iAPUpdateJob.restResponseHandler = var2_4;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", (Object)OneSignal.getSavedAppId());
            if (var1_3 != false) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", object);
            OneSignalStateSynchronizer.sendPurchases((JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)var2_4);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for sendPurchases.", throwable);
        }
    }

    public static void sendTag(String string2, String string3) {
        if (taskRemoteController.shouldQueueTaskForInit("sendTag()")) {
            logger.error("Waiting for remote params. Moving sendTag() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(string2, string3){
                public final String val$key;
                public final String val$value;
                {
                    this.val$key = string2;
                    this.val$value = string3;
                }

                public void run() {
                    logger.debug("Running sendTag() operation from pending task queue.");
                    OneSignal.sendTag(this.val$key, this.val$value);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendTag()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            OneSignal.sendTags(jSONObject.put(string2, (Object)string3));
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public static void sendTags(String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            OneSignal.sendTags(jSONObject);
        }
        catch (JSONException jSONException) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Generating JSONObject for sendTags failed!", jSONException);
        }
    }

    public static void sendTags(JSONObject jSONObject) {
        OneSignal.sendTags(jSONObject, null);
    }

    public static void sendTags(JSONObject object, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("sendTags()")) {
            logger.error("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable((JSONObject)object, changeTagsUpdateHandler){
                public final ChangeTagsUpdateHandler val$changeTagsUpdateHandler;
                public final JSONObject val$keyValues;
                {
                    this.val$keyValues = jSONObject;
                    this.val$changeTagsUpdateHandler = changeTagsUpdateHandler;
                }

                public void run() {
                    logger.debug("Running sendTags() operation from pending task queue.");
                    OneSignal.sendTags(this.val$keyValues, this.val$changeTagsUpdateHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendTags()")) {
            return;
        }
        object = new Runnable((JSONObject)object, changeTagsUpdateHandler){
            public final ChangeTagsUpdateHandler val$changeTagsUpdateHandler;
            public final JSONObject val$keyValues;
            {
                this.val$keyValues = jSONObject;
                this.val$changeTagsUpdateHandler = changeTagsUpdateHandler;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                if (this.val$keyValues == null) {
                    logger.error("Attempted to send null tags");
                    ChangeTagsUpdateHandler changeTagsUpdateHandler = this.val$changeTagsUpdateHandler;
                    if (changeTagsUpdateHandler == null) return;
                    changeTagsUpdateHandler.onFailure(new SendTagsError(-1, "Attempted to send null tags"));
                    return;
                }
                Object object = OneSignalStateSynchronizer.getTags((boolean)false).result;
                Object object2 = new JSONObject();
                Iterator iterator = this.val$keyValues.keys();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    try {
                        Object object3 = this.val$keyValues.opt(string2);
                        if (!(object3 instanceof JSONArray) && !(object3 instanceof JSONObject)) {
                            boolean bl = this.val$keyValues.isNull(string2);
                            if (!bl && !"".equals(object3)) {
                                object2.put(string2, (Object)object3.toString());
                                continue;
                            }
                            if (object == null || !object.has(string2)) continue;
                            object2.put(string2, (Object)"");
                            continue;
                        }
                        LOG_LEVEL lOG_LEVEL = LOG_LEVEL.ERROR;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Omitting key '");
                        stringBuilder.append(string2);
                        stringBuilder.append("'! sendTags DO NOT supported nested values!");
                        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                    }
                    catch (Throwable throwable) {}
                }
                if (!object2.toString().equals((Object)"{}")) {
                    object = logger;
                    iterator = z2.t("Available tags to send: ");
                    iterator.append(object2.toString());
                    object.debug(iterator.toString());
                    OneSignalStateSynchronizer.sendTags((JSONObject)object2, (ChangeTagsUpdateHandler)this.val$changeTagsUpdateHandler);
                    return;
                }
                logger.debug("Send tags ended successfully");
                object2 = this.val$changeTagsUpdateHandler;
                if (object2 == null) return;
                object2.onSuccess((JSONObject)object);
            }
        };
        if (taskRemoteController.shouldRunTaskThroughQueue()) {
            logger.debug("Sending sendTags() operation to pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable)object);
            return;
        }
        object.run();
    }

    public static void sendUniqueOutcome(@NonNull String string2) {
        OneSignal.sendUniqueOutcome(string2, null);
    }

    public static void sendUniqueOutcome(@NonNull String string2, OutcomeCallback outcomeCallback) {
        if (!OneSignal.isValidOutcomeEntry(string2)) {
            return;
        }
        if (!taskRemoteController.shouldQueueTaskForInit("sendUniqueOutcome()") && outcomeEventsController != null) {
            if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendUniqueOutcome()")) {
                return;
            }
            outcomeEventsController.sendUniqueOutcomeEvent(string2, outcomeCallback);
            return;
        }
        logger.error("Waiting for remote params. Moving sendUniqueOutcome() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(string2, outcomeCallback){
            public final OutcomeCallback val$callback;
            public final String val$name;
            {
                this.val$name = string2;
                this.val$callback = outcomeCallback;
            }

            public void run() {
                logger.debug("Running sendUniqueOutcome() operation from pending queue.");
                OneSignal.sendUniqueOutcome(this.val$name, this.val$callback);
            }
        });
    }

    public static void setAppId(@NonNull String weakReference) {
        if (weakReference != null && !weakReference.isEmpty()) {
            if (!weakReference.equals((Object)appId)) {
                initDone = false;
                OSLogger oSLogger = logger;
                StringBuilder stringBuilder = a.s("setAppId called with id: ", weakReference, " changing id from: ");
                stringBuilder.append(appId);
                oSLogger.verbose(stringBuilder.toString());
            }
            appId = weakReference;
            if (appContext == null) {
                logger.warning("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
                return;
            }
            weakReference = appActivity;
            if (weakReference != null && weakReference.get() != null) {
                OneSignal.init((Context)appActivity.get());
            } else {
                OneSignal.init(appContext);
            }
            return;
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setAppId called with id: ");
        stringBuilder.append(weakReference);
        stringBuilder.append(", ignoring!");
        oSLogger.warning(stringBuilder.toString());
    }

    public static void setEmail(@NonNull String string2) {
        OneSignal.setEmail(string2, null, null);
    }

    public static void setEmail(@NonNull String string2, EmailUpdateHandler emailUpdateHandler) {
        OneSignal.setEmail(string2, null, emailUpdateHandler);
    }

    public static void setEmail(@NonNull String string2, @Nullable String string3) {
        OneSignal.setEmail(string2, string3, null);
    }

    public static void setEmail(@NonNull String string2, @Nullable String string3, @Nullable EmailUpdateHandler object) {
        if (taskRemoteController.shouldQueueTaskForInit("setEmail()")) {
            logger.error("Waiting for remote params. Moving setEmail() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(string2, string3, (EmailUpdateHandler)object){
                public final EmailUpdateHandler val$callback;
                public final String val$email;
                public final String val$emailAuthHash;
                {
                    this.val$email = string2;
                    this.val$emailAuthHash = string3;
                    this.val$callback = emailUpdateHandler;
                }

                public void run() {
                    logger.debug("Running setEmail() operation from a pending task queue.");
                    OneSignal.setEmail(this.val$email, this.val$emailAuthHash, this.val$callback);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setEmail()")) {
            return;
        }
        if (!OSUtils.isValidEmail(string2)) {
            if (object != null) {
                object.onFailure(new EmailUpdateError(EmailErrorType.VALIDATION, "Email is invalid"));
            }
            logger.error("Email is invalid");
            return;
        }
        if (OneSignal.getRemoteParams().useEmailAuth && (string3 == null || string3.length() == 0)) {
            if (object != null) {
                object.onFailure(new EmailUpdateError(EmailErrorType.REQUIRES_EMAIL_AUTH, "Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            logger.error("Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        emailUpdateHandler = object;
        object = string2.trim();
        string2 = string3;
        if (string3 != null) {
            string2 = string3.toLowerCase();
        }
        OneSignal.getCurrentEmailSubscriptionState(appContext).setEmailAddress((String)object);
        OneSignalStateSynchronizer.setEmail((String)object.toLowerCase(), (String)string2);
    }

    public static void setExternalUserId(@NonNull String string2) {
        OneSignal.setExternalUserId(string2, null, null);
    }

    public static void setExternalUserId(@NonNull String string2, @Nullable OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        OneSignal.setExternalUserId(string2, null, oSExternalUserIdUpdateCompletionHandler);
    }

    public static void setExternalUserId(@NonNull String string2, @Nullable String string3) {
        OneSignal.setExternalUserId(string2, string3, null);
    }

    public static void setExternalUserId(@NonNull String string2, @Nullable String string3, @Nullable OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setExternalUserId()")) {
            logger.error("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(string2, string3, oSExternalUserIdUpdateCompletionHandler){
                public final OSExternalUserIdUpdateCompletionHandler val$completionCallback;
                public final String val$externalId;
                public final String val$externalIdAuthHash;
                {
                    this.val$externalId = string2;
                    this.val$externalIdAuthHash = string3;
                    this.val$completionCallback = oSExternalUserIdUpdateCompletionHandler;
                }

                public void run() {
                    logger.debug("Running setExternalUserId() operation from pending task queue.");
                    OneSignal.setExternalUserId(this.val$externalId, this.val$externalIdAuthHash, this.val$completionCallback);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setExternalUserId()")) {
            return;
        }
        if (string2 == null) {
            logger.warning("External id can't be null, set an empty string to remove an external id");
            return;
        }
        if (!string2.isEmpty() && OneSignal.getRemoteParams() != null && OneSignal.getRemoteParams().useUserIdAuth && (string3 == null || string3.length() == 0)) {
            if (oSExternalUserIdUpdateCompletionHandler != null) {
                oSExternalUserIdUpdateCompletionHandler.onFailure(new ExternalIdError(ExternalIdErrorType.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            logger.error("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        Object object = string3;
        if (string3 != null) {
            object = string3.toLowerCase();
        }
        try {
            OneSignalStateSynchronizer.setExternalUserId((String)string2, (String)object, (OSExternalUserIdUpdateCompletionHandler)oSExternalUserIdUpdateCompletionHandler);
        }
        catch (JSONException jSONException) {
            string2 = string2.equals((Object)"") ? "remove" : "set";
            object = logger;
            oSExternalUserIdUpdateCompletionHandler = new StringBuilder();
            oSExternalUserIdUpdateCompletionHandler.append("Attempted to ");
            oSExternalUserIdUpdateCompletionHandler.append(string2);
            oSExternalUserIdUpdateCompletionHandler.append(" external ID but encountered a JSON exception");
            object.error(oSExternalUserIdUpdateCompletionHandler.toString());
            jSONException.printStackTrace();
        }
    }

    public static void setInAppMessageClickHandler(@Nullable OSInAppMessageClickHandler oSInAppMessageClickHandler) {
        inAppMessageClickHandler = oSInAppMessageClickHandler;
    }

    public static void setInAppMessageLifecycleHandler(@Nullable OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler) {
        if (appContext == null) {
            logger.error("Waiting initWithContext. Moving setInAppMessageLifecycleHandler() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(oSInAppMessageLifecycleHandler){
                public final OSInAppMessageLifecycleHandler val$handler;
                {
                    this.val$handler = oSInAppMessageLifecycleHandler;
                }

                public void run() {
                    logger.debug("Running setInAppMessageLifecycleHandler() operation from pending queue.");
                    OneSignal.setInAppMessageLifecycleHandler(this.val$handler);
                }
            });
            return;
        }
        OneSignal.getInAppMessageController().setInAppMessageLifecycleHandler(oSInAppMessageLifecycleHandler);
    }

    public static void setInForeground(boolean bl) {
        inForeground = bl;
    }

    public static void setLanguage(@NonNull String string2) {
        OneSignal.setLanguage(string2, null);
    }

    public static void setLanguage(@NonNull String string2, @Nullable OSSetLanguageCompletionHandler oSSetLanguageCompletionHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setLanguage()")) {
            logger.error("Waiting for remote params. Moving setLanguage() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(string2, oSSetLanguageCompletionHandler){
                public final OSSetLanguageCompletionHandler val$completionCallback;
                public final String val$language;
                {
                    this.val$language = string2;
                    this.val$completionCallback = oSSetLanguageCompletionHandler;
                }

                public void run() {
                    logger.debug("Running setLanguage() operation from pending task queue.");
                    OneSignal.setLanguage(this.val$language, this.val$completionCallback);
                }
            });
            return;
        }
        16 var2_3 = null;
        if (oSSetLanguageCompletionHandler != null) {
            var2_3 = new 16(oSSetLanguageCompletionHandler);
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setLanguage()")) {
            return;
        }
        oSSetLanguageCompletionHandler = new LanguageProviderAppDefined(preferences);
        oSSetLanguageCompletionHandler.setLanguage(string2);
        languageContext.setStrategy((LanguageProvider)oSSetLanguageCompletionHandler);
        try {
            string2 = new JSONObject();
            string2.put("language", (Object)languageContext.getLanguage());
            OneSignalStateSynchronizer.updateDeviceInfo((JSONObject)string2, (OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler)var2_3);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public static void setLastSessionTime(long l) {
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Last session time set to: ");
        stringBuilder.append(l);
        oSLogger.debug(stringBuilder.toString());
        OneSignalPrefs.saveLong((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_LAST_SESSION_TIME", (long)l);
    }

    public static void setLocationShared(boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("setLocationShared()")) {
            logger.error("Waiting for remote params. Moving setLocationShared() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(bl){
                public final boolean val$enable;
                {
                    this.val$enable = bl;
                }

                public void run() {
                    logger.debug("Running setLocationShared() operation from pending task queue.");
                    OneSignal.setLocationShared(this.val$enable);
                }
            });
            return;
        }
        if (OneSignal.getRemoteParamController().hasLocationKey()) {
            return;
        }
        OneSignal.startLocationShared(bl);
    }

    public static void setLogLevel(int n, int n2) {
        OneSignal.setLogLevel(OneSignal.getLogLevel(n), OneSignal.getLogLevel(n2));
    }

    public static void setLogLevel(LOG_LEVEL lOG_LEVEL, LOG_LEVEL lOG_LEVEL2) {
        logCatLevel = lOG_LEVEL;
        visualLogLevel = lOG_LEVEL2;
    }

    public static void setNotificationOpenedHandler(@Nullable OSNotificationOpenedHandler oSNotificationOpenedHandler) {
        notificationOpenedHandler = oSNotificationOpenedHandler;
        if (initDone && oSNotificationOpenedHandler != null) {
            OneSignal.fireCallbackForOpenedNotifications();
        }
    }

    public static void setNotificationWillShowInForegroundHandler(@Nullable OSNotificationWillShowInForegroundHandler oSNotificationWillShowInForegroundHandler) {
        notificationWillShowInForegroundHandler = oSNotificationWillShowInForegroundHandler;
    }

    public static void setRemoteNotificationReceivedHandler(OSRemoteNotificationReceivedHandler oSRemoteNotificationReceivedHandler) {
        if (remoteNotificationReceivedHandler == null) {
            remoteNotificationReceivedHandler = oSRemoteNotificationReceivedHandler;
        }
    }

    public static void setRequiresUserPrivacyConsent(boolean bl) {
        if (OneSignal.getRemoteParamController().hasPrivacyConsentKey()) {
            logger.warning("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
            return;
        }
        if (OneSignal.requiresUserPrivacyConsent() && !bl) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
            return;
        }
        OneSignal.getRemoteParamController().savePrivacyConsentRequired(bl);
    }

    public static void setSMSNumber(@NonNull String string2) {
        OneSignal.setSMSNumber(string2, null, null);
    }

    public static void setSMSNumber(@NonNull String string2, OSSMSUpdateHandler oSSMSUpdateHandler) {
        OneSignal.setSMSNumber(string2, null, oSSMSUpdateHandler);
    }

    public static void setSMSNumber(@NonNull String string2, @Nullable String string3) {
        OneSignal.setSMSNumber(string2, string3, null);
    }

    public static void setSMSNumber(@NonNull String string2, String string3, OSSMSUpdateHandler oSSMSUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setSMSNumber()")) {
            logger.error("Waiting for remote params. Moving setSMSNumber() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(string2, string3, oSSMSUpdateHandler){
                public final OSSMSUpdateHandler val$callback;
                public final String val$smsAuthHash;
                public final String val$smsNumber;
                {
                    this.val$smsNumber = string2;
                    this.val$smsAuthHash = string3;
                    this.val$callback = oSSMSUpdateHandler;
                }

                public void run() {
                    logger.debug("Running setSMSNumber() operation from a pending task queue.");
                    OneSignal.setSMSNumber(this.val$smsNumber, this.val$smsAuthHash, this.val$callback);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setSMSNumber()")) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            if (oSSMSUpdateHandler != null) {
                oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.VALIDATION, "SMS number is invalid"));
            }
            logger.error("SMS number is invalid");
            return;
        }
        if (OneSignal.getRemoteParams().useSMSAuth && (string3 == null || string3.length() == 0)) {
            if (oSSMSUpdateHandler != null) {
                oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.REQUIRES_SMS_AUTH, "SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            logger.error("SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        smsUpdateHandler = oSSMSUpdateHandler;
        OneSignal.getCurrentSMSSubscriptionState(appContext).setSMSNumber(string2);
        OneSignalStateSynchronizer.setSMSNumber((String)string2, (String)string3);
    }

    public static void setSessionManager(OSSessionManager oSSessionManager) {
        sessionManager = oSSessionManager;
    }

    public static void setSharedPreferences(OSSharedPreferences oSSharedPreferences) {
        preferences = oSSharedPreferences;
    }

    public static void setTime(OSTime oSTime) {
        time = oSTime;
    }

    public static void setTrackerFactory(OSTrackerFactory oSTrackerFactory) {
        trackerFactory = oSTrackerFactory;
    }

    private static void setupContextListeners(boolean bl) {
        ActivityLifecycleListener.registerActivityLifecycleCallbacks((Application)appContext);
        if (bl) {
            OSNotificationDataController oSNotificationDataController;
            languageContext = new LanguageContext(preferences);
            OneSignalPrefs.startDelayedWrite();
            OneSignalDbHelper oneSignalDbHelper = OneSignal.getDBHelperInstance();
            notificationDataController = oSNotificationDataController = new OSNotificationDataController(oneSignalDbHelper, logger);
            oSNotificationDataController.cleanOldCachedData();
            OneSignal.getInAppMessageController().cleanCachedInAppMessages();
            if (outcomeEventsFactory == null) {
                outcomeEventsFactory = new OSOutcomeEventsFactory(logger, apiClient, (OneSignalDb)oneSignalDbHelper, preferences);
            }
            sessionManager.initSessionFromCache();
            OneSignal.getOutcomeEventsController().cleanCachedUniqueOutcomes();
        }
    }

    private static void setupPrivacyConsent(Context object) {
        if ((object = ApplicationInfoHelper.Companion.getInfo((Context)object)) == null) {
            return;
        }
        object = object.metaData.getString("com.onesignal.PrivacyConsent");
        if (object != null) {
            OneSignal.setRequiresUserPrivacyConsent("ENABLE".equalsIgnoreCase((String)object));
        }
    }

    public static boolean shouldFireForegroundHandlers(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (!OneSignal.isInForeground()) {
            OneSignal.onesignalLog(LOG_LEVEL.INFO, "App is in background, show notification");
            return false;
        }
        if (notificationWillShowInForegroundHandler == null) {
            OneSignal.onesignalLog(LOG_LEVEL.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        }
        if (oSNotificationGenerationJob.isRestoring()) {
            OneSignal.onesignalLog(LOG_LEVEL.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
            return false;
        }
        return true;
    }

    private static boolean shouldInitDirectSessionFromNotificationOpen(Activity activity, JSONArray object) {
        if (inForeground) {
            return false;
        }
        try {
            JSONObject jSONObject = object.getJSONObject(0);
            object = new OSNotificationOpenBehaviorFromPushPayload((Context)activity, jSONObject);
            boolean bl = ((OSNotificationOpenBehaviorFromPushPayload)object).getShouldOpenApp();
            return bl;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return true;
        }
    }

    public static boolean shouldLogUserPrivacyConsentErrorMessageForMethodName(String string2) {
        if (OneSignal.requiresUserPrivacyConsent()) {
            if (string2 != null) {
                LOG_LEVEL lOG_LEVEL = LOG_LEVEL.WARN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append(string2);
                stringBuilder.append(" was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            }
            return true;
        }
        return false;
    }

    private static boolean shouldStartNewSession() {
        if (!OneSignal.isInForeground()) {
            return false;
        }
        return OneSignal.isPastOnSessionTime();
    }

    public static void startLocationShared(boolean bl) {
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal startLocationShared: ");
        stringBuilder.append(bl);
        oSLogger.debug(stringBuilder.toString());
        OneSignal.getRemoteParamController().saveLocationShared(bl);
        if (!bl) {
            logger.debug("OneSignal is shareLocation set false, clearing last location!");
            OneSignalStateSynchronizer.clearLocation();
        }
    }

    private static void startLocationUpdate() {
        5 var0 = new 5();
        LocationController.getLocation(appContext, false, false, (LocationController.LocationHandler)var0);
    }

    private static void startRegistrationOrOnSession() {
        if (waitingToPostStateSync) {
            return;
        }
        waitingToPostStateSync = true;
        if (inForeground && OneSignalStateSynchronizer.getSyncAsNewSession()) {
            locationFired = false;
        }
        OneSignal.startLocationUpdate();
        registerForPushFired = false;
        if (OneSignal.getRemoteParams() != null) {
            OneSignal.registerForPushToken();
        } else {
            OneSignal.makeAndroidParamsRequest(appId, OneSignal.getUserId(), true);
        }
    }

    public static void unsubscribeWhenNotificationsAreDisabled(boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("unsubscribeWhenNotificationsAreDisabled()")) {
            logger.error("Waiting for remote params. Moving unsubscribeWhenNotificationsAreDisabled() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(bl){
                public final boolean val$set;
                {
                    this.val$set = bl;
                }

                public void run() {
                    logger.debug("Running unsubscribeWhenNotificationsAreDisabled() operation from pending task queue.");
                    OneSignal.unsubscribeWhenNotificationsAreDisabled(this.val$set);
                }
            });
            return;
        }
        if (OneSignal.getRemoteParamController().hasUnsubscribeNotificationKey()) {
            logger.warning("unsubscribeWhenNotificationsAreDisabled already called by remote params!, ignoring user set");
            return;
        }
        OneSignal.getRemoteParamController().saveUnsubscribeWhenNotificationsAreDisabled(bl);
    }

    public static void updateEmailIdDependents(String string2) {
        OneSignal.saveEmailId(string2);
        OneSignal.getCurrentEmailSubscriptionState(appContext).setEmailUserId(string2);
        try {
            JSONObject jSONObject = new JSONObject();
            OneSignalStateSynchronizer.updatePushState((JSONObject)jSONObject.put("parent_player_id", (Object)string2));
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public static void updateSMSIdDependents(String string2) {
        OneSignal.saveSMSId(string2);
        OneSignal.getCurrentSMSSubscriptionState(appContext).setSMSUserId(string2);
    }

    public static void updateUserIdDependents(String object) {
        OneSignal.saveUserId((String)object);
        OneSignal.internalFireGetTagsCallbacks();
        OneSignal.getCurrentSubscriptionState(appContext).setUserId((String)object);
        object = iapUpdateJob;
        if (object != null) {
            OneSignal.sendPurchases(((IAPUpdateJob)object).toReport, ((IAPUpdateJob)object).newAsExisting, ((IAPUpdateJob)object).restResponseHandler);
            iapUpdateJob = null;
        }
        OneSignalStateSynchronizer.refreshSecondaryChannelState();
    }

    public static boolean userProvidedPrivacyConsent() {
        return remoteParamController.getSavedUserConsentStatus();
    }

    public static final class AppEntryAction
    extends Enum<AppEntryAction> {
        private static final AppEntryAction[] $VALUES;
        public static final /* enum */ AppEntryAction APP_CLOSE;
        public static final /* enum */ AppEntryAction APP_OPEN;
        public static final /* enum */ AppEntryAction NOTIFICATION_CLICK;

        static {
            AppEntryAction appEntryAction;
            AppEntryAction appEntryAction2;
            AppEntryAction appEntryAction3;
            NOTIFICATION_CLICK = appEntryAction3 = new AppEntryAction();
            APP_OPEN = appEntryAction2 = new AppEntryAction();
            APP_CLOSE = appEntryAction = new AppEntryAction();
            $VALUES = new AppEntryAction[]{appEntryAction3, appEntryAction2, appEntryAction};
        }

        public static AppEntryAction valueOf(String string2) {
            return (AppEntryAction)Enum.valueOf(AppEntryAction.class, (String)string2);
        }

        public static AppEntryAction[] values() {
            return (AppEntryAction[])$VALUES.clone();
        }

        public boolean isAppClose() {
            return this.equals((Object)APP_CLOSE);
        }

        public boolean isAppOpen() {
            return this.equals((Object)APP_OPEN);
        }

        public boolean isNotificationClick() {
            return this.equals((Object)NOTIFICATION_CLICK);
        }
    }

    public static interface ChangeTagsUpdateHandler {
        public void onFailure(SendTagsError var1);

        public void onSuccess(JSONObject var1);
    }

    public static final class EmailErrorType
    extends Enum<EmailErrorType> {
        private static final EmailErrorType[] $VALUES;
        public static final /* enum */ EmailErrorType INVALID_OPERATION;
        public static final /* enum */ EmailErrorType NETWORK;
        public static final /* enum */ EmailErrorType REQUIRES_EMAIL_AUTH;
        public static final /* enum */ EmailErrorType VALIDATION;

        static {
            EmailErrorType emailErrorType;
            EmailErrorType emailErrorType2;
            EmailErrorType emailErrorType3;
            EmailErrorType emailErrorType4;
            VALIDATION = emailErrorType4 = new EmailErrorType();
            REQUIRES_EMAIL_AUTH = emailErrorType3 = new EmailErrorType();
            INVALID_OPERATION = emailErrorType2 = new EmailErrorType();
            NETWORK = emailErrorType = new EmailErrorType();
            $VALUES = new EmailErrorType[]{emailErrorType4, emailErrorType3, emailErrorType2, emailErrorType};
        }

        public static EmailErrorType valueOf(String string2) {
            return (EmailErrorType)Enum.valueOf(EmailErrorType.class, (String)string2);
        }

        public static EmailErrorType[] values() {
            return (EmailErrorType[])$VALUES.clone();
        }
    }

    public static class EmailUpdateError {
        private String message;
        private EmailErrorType type;

        public EmailUpdateError(EmailErrorType emailErrorType, String string2) {
            this.type = emailErrorType;
            this.message = string2;
        }

        public String getMessage() {
            return this.message;
        }

        public EmailErrorType getType() {
            return this.type;
        }
    }

    public static interface EmailUpdateHandler {
        public void onFailure(EmailUpdateError var1);

        public void onSuccess();
    }

    public static interface EntryStateListener {
        public void onEntryStateChange(AppEntryAction var1);
    }

    public static class ExternalIdError {
        private String message;
        private ExternalIdErrorType type;

        public ExternalIdError(ExternalIdErrorType externalIdErrorType, String string2) {
            this.type = externalIdErrorType;
            this.message = string2;
        }

        public String getMessage() {
            return this.message;
        }

        public ExternalIdErrorType getType() {
            return this.type;
        }
    }

    public static final class ExternalIdErrorType
    extends Enum<ExternalIdErrorType> {
        private static final ExternalIdErrorType[] $VALUES;
        public static final /* enum */ ExternalIdErrorType INVALID_OPERATION;
        public static final /* enum */ ExternalIdErrorType NETWORK;
        public static final /* enum */ ExternalIdErrorType REQUIRES_EXTERNAL_ID_AUTH;

        static {
            ExternalIdErrorType externalIdErrorType;
            ExternalIdErrorType externalIdErrorType2;
            ExternalIdErrorType externalIdErrorType3;
            REQUIRES_EXTERNAL_ID_AUTH = externalIdErrorType3 = new ExternalIdErrorType();
            INVALID_OPERATION = externalIdErrorType2 = new ExternalIdErrorType();
            NETWORK = externalIdErrorType = new ExternalIdErrorType();
            $VALUES = new ExternalIdErrorType[]{externalIdErrorType3, externalIdErrorType2, externalIdErrorType};
        }

        public static ExternalIdErrorType valueOf(String string2) {
            return (ExternalIdErrorType)Enum.valueOf(ExternalIdErrorType.class, (String)string2);
        }

        public static ExternalIdErrorType[] values() {
            return (ExternalIdErrorType[])$VALUES.clone();
        }
    }

    public static class IAPUpdateJob {
        public boolean newAsExisting;
        public OneSignalRestClient.ResponseHandler restResponseHandler;
        public JSONArray toReport;

        public IAPUpdateJob(JSONArray jSONArray) {
            this.toReport = jSONArray;
        }
    }

    public static final class LOG_LEVEL
    extends Enum<LOG_LEVEL> {
        private static final LOG_LEVEL[] $VALUES;
        public static final /* enum */ LOG_LEVEL DEBUG;
        public static final /* enum */ LOG_LEVEL ERROR;
        public static final /* enum */ LOG_LEVEL FATAL;
        public static final /* enum */ LOG_LEVEL INFO;
        public static final /* enum */ LOG_LEVEL NONE;
        public static final /* enum */ LOG_LEVEL VERBOSE;
        public static final /* enum */ LOG_LEVEL WARN;

        static {
            LOG_LEVEL lOG_LEVEL;
            LOG_LEVEL lOG_LEVEL2;
            LOG_LEVEL lOG_LEVEL3;
            LOG_LEVEL lOG_LEVEL4;
            LOG_LEVEL lOG_LEVEL5;
            LOG_LEVEL lOG_LEVEL6;
            LOG_LEVEL lOG_LEVEL7;
            NONE = lOG_LEVEL7 = new LOG_LEVEL();
            FATAL = lOG_LEVEL6 = new LOG_LEVEL();
            ERROR = lOG_LEVEL5 = new LOG_LEVEL();
            WARN = lOG_LEVEL4 = new LOG_LEVEL();
            INFO = lOG_LEVEL3 = new LOG_LEVEL();
            DEBUG = lOG_LEVEL2 = new LOG_LEVEL();
            VERBOSE = lOG_LEVEL = new LOG_LEVEL();
            $VALUES = new LOG_LEVEL[]{lOG_LEVEL7, lOG_LEVEL6, lOG_LEVEL5, lOG_LEVEL4, lOG_LEVEL3, lOG_LEVEL2, lOG_LEVEL};
        }

        public static LOG_LEVEL valueOf(String string2) {
            return (LOG_LEVEL)Enum.valueOf(LOG_LEVEL.class, (String)string2);
        }

        public static LOG_LEVEL[] values() {
            return (LOG_LEVEL[])$VALUES.clone();
        }
    }

    public static interface OSExternalUserIdUpdateCompletionHandler {
        public void onFailure(ExternalIdError var1);

        public void onSuccess(JSONObject var1);
    }

    public static interface OSGetTagsHandler {
        public void tagsAvailable(JSONObject var1);
    }

    public static interface OSInAppMessageClickHandler {
        public void inAppMessageClicked(OSInAppMessageAction var1);
    }

    public static interface OSInternalExternalUserIdUpdateCompletionHandler {
        public void onComplete(String var1, boolean var2);
    }

    public static class OSLanguageError {
        private int errorCode;
        private String message;

        public OSLanguageError(int n, String string2) {
            this.errorCode = n;
            this.message = string2;
        }

        public int getCode() {
            return this.errorCode;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static interface OSNotificationOpenedHandler {
        public void notificationOpened(OSNotificationOpenedResult var1);
    }

    public static interface OSNotificationWillShowInForegroundHandler {
        public void notificationWillShowInForeground(OSNotificationReceivedEvent var1);
    }

    public static interface OSPromptActionCompletionCallback {
        public void onCompleted(PromptActionResult var1);
    }

    public static interface OSRemoteNotificationReceivedHandler {
        public void remoteNotificationReceived(Context var1, OSNotificationReceivedEvent var2);
    }

    public static class OSSMSUpdateError {
        private String message;
        private SMSErrorType type;

        public OSSMSUpdateError(SMSErrorType sMSErrorType, String string2) {
            this.type = sMSErrorType;
            this.message = string2;
        }

        public String getMessage() {
            return this.message;
        }

        public SMSErrorType getType() {
            return this.type;
        }
    }

    public static interface OSSMSUpdateHandler {
        public void onFailure(OSSMSUpdateError var1);

        public void onSuccess(JSONObject var1);
    }

    public static interface OSSetLanguageCompletionHandler {
        public void onFailure(OSLanguageError var1);

        public void onSuccess(String var1);
    }

    public static interface OutcomeCallback {
        public void onSuccess(@Nullable OSOutcomeEvent var1);
    }

    public static interface PostNotificationResponseHandler {
        public void onFailure(JSONObject var1);

        public void onSuccess(JSONObject var1);
    }

    public static final class PromptActionResult
    extends Enum<PromptActionResult> {
        private static final PromptActionResult[] $VALUES;
        public static final /* enum */ PromptActionResult ERROR;
        public static final /* enum */ PromptActionResult LOCATION_PERMISSIONS_MISSING_MANIFEST;
        public static final /* enum */ PromptActionResult PERMISSION_DENIED;
        public static final /* enum */ PromptActionResult PERMISSION_GRANTED;

        static {
            PromptActionResult promptActionResult;
            PromptActionResult promptActionResult2;
            PromptActionResult promptActionResult3;
            PromptActionResult promptActionResult4;
            PERMISSION_GRANTED = promptActionResult4 = new PromptActionResult();
            PERMISSION_DENIED = promptActionResult3 = new PromptActionResult();
            LOCATION_PERMISSIONS_MISSING_MANIFEST = promptActionResult2 = new PromptActionResult();
            ERROR = promptActionResult = new PromptActionResult();
            $VALUES = new PromptActionResult[]{promptActionResult4, promptActionResult3, promptActionResult2, promptActionResult};
        }

        public static PromptActionResult valueOf(String string2) {
            return (PromptActionResult)Enum.valueOf(PromptActionResult.class, (String)string2);
        }

        public static PromptActionResult[] values() {
            return (PromptActionResult[])$VALUES.clone();
        }
    }

    public static interface PromptForPushNotificationPermissionResponseHandler {
        public void response(boolean var1);
    }

    public static final class SMSErrorType
    extends Enum<SMSErrorType> {
        private static final SMSErrorType[] $VALUES;
        public static final /* enum */ SMSErrorType INVALID_OPERATION;
        public static final /* enum */ SMSErrorType NETWORK;
        public static final /* enum */ SMSErrorType REQUIRES_SMS_AUTH;
        public static final /* enum */ SMSErrorType VALIDATION;

        static {
            SMSErrorType sMSErrorType;
            SMSErrorType sMSErrorType2;
            SMSErrorType sMSErrorType3;
            SMSErrorType sMSErrorType4;
            VALIDATION = sMSErrorType4 = new SMSErrorType();
            REQUIRES_SMS_AUTH = sMSErrorType3 = new SMSErrorType();
            INVALID_OPERATION = sMSErrorType2 = new SMSErrorType();
            NETWORK = sMSErrorType = new SMSErrorType();
            $VALUES = new SMSErrorType[]{sMSErrorType4, sMSErrorType3, sMSErrorType2, sMSErrorType};
        }

        public static SMSErrorType valueOf(String string2) {
            return (SMSErrorType)Enum.valueOf(SMSErrorType.class, (String)string2);
        }

        public static SMSErrorType[] values() {
            return (SMSErrorType[])$VALUES.clone();
        }
    }

    public static class SendTagsError {
        private int code;
        private String message;

        public SendTagsError(int n, String string2) {
            this.message = string2;
            this.code = n;
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }
    }
}

