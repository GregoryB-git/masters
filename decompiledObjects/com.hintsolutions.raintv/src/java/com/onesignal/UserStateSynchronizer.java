/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  androidx.annotation.Nullable
 *  com.onesignal.UserStateSynchronizer$2
 *  com.onesignal.UserStateSynchronizer$3
 *  com.onesignal.UserStateSynchronizer$4
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.onesignal.ImmutableJSONObject;
import com.onesignal.JSONUtils;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStateSynchronizer;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSynchronizer {
    public static final String ANDROID_PERMISSION = "androidPermission";
    public static final String APP_ID = "app_id";
    private static final String CURRENT_STATE = "CURRENT_STATE";
    public static final String DEVICE_PLAYER_ID = "device_player_id";
    public static final String DEVICE_TYPE = "device_type";
    public static final String EMAIL_AUTH_HASH_KEY = "email_auth_hash";
    public static final String EMAIL_KEY = "email";
    private static final String ERRORS = "errors";
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final String EXTERNAL_USER_ID_AUTH_HASH = "external_user_id_auth_hash";
    private static final String ID = "id";
    public static final String IDENTIFIER = "identifier";
    public static final String LANGUAGE = "language";
    public static final String LOGOUT_EMAIL = "logoutEmail";
    public static final String PARENT_PLAYER_ID = "parent_player_id";
    private static final String SESSION = "session";
    public static final String SMS_AUTH_HASH_KEY = "sms_auth_hash";
    public static final String SMS_NUMBER_KEY = "sms_number";
    public static final String SUBSCRIBABLE_STATUS = "subscribableStatus";
    public static final String TAGS = "tags";
    private static final String TOSYNC_STATE = "TOSYNC_STATE";
    public static final String USER_SUBSCRIBE_PREF = "userSubscribePref";
    public final Object LOCK = new Object();
    private boolean canMakeUpdates;
    private OneSignalStateSynchronizer.UserStateSynchronizerType channel;
    private UserState currentUserState;
    private final Queue<OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler> deviceInfoCompletionHandler;
    private final Queue<OneSignal.OSInternalExternalUserIdUpdateCompletionHandler> externalUserIdUpdateHandlers;
    private final Object networkHandlerSyncLock;
    public HashMap<Integer, NetworkHandlerThread> networkHandlerThreads;
    private AtomicBoolean runningSyncUserState = new AtomicBoolean();
    private final Queue<OneSignal.ChangeTagsUpdateHandler> sendTagsHandlers = new LinkedBlockingQueue();
    private UserState toSyncUserState;
    public boolean waitingForSessionResponse = false;

    public UserStateSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        this.externalUserIdUpdateHandlers = new LinkedBlockingQueue();
        this.deviceInfoCompletionHandler = new LinkedBlockingQueue();
        this.networkHandlerThreads = new HashMap();
        this.networkHandlerSyncLock = new Object(this){
            public final UserStateSynchronizer this$0;
            {
                this.this$0 = userStateSynchronizer;
            }
        };
        this.channel = userStateSynchronizerType;
    }

    public static /* synthetic */ void access$1000(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.sendTagsHandlersPerformOnSuccess();
    }

    public static /* synthetic */ void access$1100(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.externalUserIdUpdateHandlersPerformOnSuccess();
    }

    public static /* synthetic */ void access$1200(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.deviceInfoHandlersPerformOnSuccess();
    }

    public static /* synthetic */ boolean access$300(UserStateSynchronizer userStateSynchronizer, int n, String string2, String string3) {
        return userStateSynchronizer.response400WithErrorsContaining(n, string2, string3);
    }

    public static /* synthetic */ void access$400(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.logoutEmailSyncSuccess();
    }

    public static /* synthetic */ void access$500(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.handlePlayerDeletedFromServer();
    }

    public static /* synthetic */ void access$600(UserStateSynchronizer userStateSynchronizer, int n) {
        userStateSynchronizer.handleNetworkFailure(n);
    }

    public static /* synthetic */ void access$700(UserStateSynchronizer userStateSynchronizer, OneSignal.SendTagsError sendTagsError) {
        userStateSynchronizer.sendTagsHandlersPerformOnFailure(sendTagsError);
    }

    public static /* synthetic */ void access$800(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.externalUserIdUpdateHandlersPerformOnFailure();
    }

    public static /* synthetic */ void access$900(UserStateSynchronizer userStateSynchronizer, OneSignalStateSynchronizer.OSDeviceInfoError oSDeviceInfoError) {
        userStateSynchronizer.deviceInfoHandlersPerformOnFailure(oSDeviceInfoError);
    }

    private void deviceInfoHandlersPerformOnFailure(OneSignalStateSynchronizer.OSDeviceInfoError oSDeviceInfoError) {
        OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler;
        while ((oSDeviceInfoCompletionHandler = (OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler)this.deviceInfoCompletionHandler.poll()) != null) {
            oSDeviceInfoCompletionHandler.onFailure(oSDeviceInfoError);
        }
    }

    private void deviceInfoHandlersPerformOnSuccess() {
        OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler;
        String string2 = OneSignalStateSynchronizer.getLanguage();
        while ((oSDeviceInfoCompletionHandler = (OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler)this.deviceInfoCompletionHandler.poll()) != null) {
            oSDeviceInfoCompletionHandler.onSuccess(string2);
        }
    }

    private void doCreateOrNewSession(String string2, JSONObject jSONObject, JSONObject jSONObject2) {
        String string3 = string2 == null ? "players" : z2.p("players/", string2, "/on_session");
        this.waitingForSessionResponse = true;
        this.addOnSessionOrCreateExtras(jSONObject);
        OneSignalRestClient.postSync(string3, jSONObject, (OneSignalRestClient.ResponseHandler)new 4(this, jSONObject2, jSONObject, string2));
    }

    private void doEmailLogout(String string2) {
        string2 = z2.p("players/", string2, "/email_logout");
        JSONObject jSONObject = new JSONObject();
        try {
            ImmutableJSONObject immutableJSONObject = this.getCurrentUserState().getDependValues();
            if (immutableJSONObject.has(EMAIL_AUTH_HASH_KEY)) {
                jSONObject.put(EMAIL_AUTH_HASH_KEY, (Object)immutableJSONObject.optString(EMAIL_AUTH_HASH_KEY));
            }
            if ((immutableJSONObject = this.getCurrentUserState().getSyncValues()).has(PARENT_PLAYER_ID)) {
                jSONObject.put(PARENT_PLAYER_ID, (Object)immutableJSONObject.optString(PARENT_PLAYER_ID));
            }
            jSONObject.put(APP_ID, (Object)immutableJSONObject.optString(APP_ID));
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        OneSignalRestClient.postSync(string2, jSONObject, (OneSignalRestClient.ResponseHandler)new 2(this));
    }

    private void doPutSync(String string2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (string2 == null) {
            OneSignal.onesignalLog(this.getLogLevel(), "Error updating the user record because of the null user id");
            this.sendTagsHandlersPerformOnFailure(new OneSignal.SendTagsError(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            this.externalUserIdUpdateHandlersPerformOnFailure();
            this.deviceInfoHandlersPerformOnFailure(new OneSignalStateSynchronizer.OSDeviceInfoError(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        OneSignalRestClient.putSync(z2.o("players/", string2), jSONObject, (OneSignalRestClient.ResponseHandler)new 3(this, jSONObject, jSONObject2));
    }

    private void externalUserIdUpdateHandlersPerformOnFailure() {
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler;
        while ((oSInternalExternalUserIdUpdateCompletionHandler = (OneSignal.OSInternalExternalUserIdUpdateCompletionHandler)this.externalUserIdUpdateHandlers.poll()) != null) {
            oSInternalExternalUserIdUpdateCompletionHandler.onComplete(this.getChannelString(), false);
        }
    }

    private void externalUserIdUpdateHandlersPerformOnSuccess() {
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler;
        while ((oSInternalExternalUserIdUpdateCompletionHandler = (OneSignal.OSInternalExternalUserIdUpdateCompletionHandler)this.externalUserIdUpdateHandlers.poll()) != null) {
            oSInternalExternalUserIdUpdateCompletionHandler.onComplete(this.getChannelString(), true);
        }
    }

    private void fireNetworkFailureEvents() {
        JSONObject jSONObject = this.getCurrentUserState().generateJsonDiff(this.toSyncUserState, false);
        if (jSONObject != null) {
            this.fireEventsForUpdateFailure(jSONObject);
        }
        if (this.getToSyncUserState().getDependValues().optBoolean(LOGOUT_EMAIL, false)) {
            OneSignal.handleFailedEmailLogout();
        }
    }

    private void handleNetworkFailure(int n) {
        if (n == 403) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            this.fireNetworkFailureEvents();
            return;
        }
        if (!this.getNetworkHandlerThread(0).doRetry()) {
            this.fireNetworkFailureEvents();
        }
    }

    private void handlePlayerDeletedFromServer() {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.handleSuccessfulEmailLogout();
        this.resetCurrentState();
        this.updateIdDependents(null);
        this.scheduleSyncToServer();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void internalSyncUserState(boolean bl) {
        Object object;
        String string2 = this.getId();
        if (this.syncEmailLogout() && string2 != null) {
            this.doEmailLogout(string2);
            return;
        }
        if (this.currentUserState == null) {
            this.initUserState();
        }
        bl = !bl && this.isSessionCall();
        Object object2 = object = this.LOCK;
        // MONITORENTER : object2
        JSONObject jSONObject = this.getCurrentUserState().generateJsonDiff(this.getToSyncUserState(), bl);
        Object object3 = this.getToSyncUserState();
        JSONObject jSONObject2 = this.getCurrentUserState().generateJsonDiffFromDependValues((UserState)object3, null);
        object3 = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserStateSynchronizer internalSyncUserState from session call: ");
        stringBuilder.append(bl);
        stringBuilder.append(" jsonBody: ");
        stringBuilder.append((Object)jSONObject);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object3), stringBuilder.toString());
        if (jSONObject == null) {
            this.getCurrentUserState().persistStateAfterSync(jSONObject2, null);
            this.sendTagsHandlersPerformOnSuccess();
            this.externalUserIdUpdateHandlersPerformOnSuccess();
            this.deviceInfoHandlersPerformOnSuccess();
            // MONITOREXIT : object2
            return;
        }
        this.getToSyncUserState().persistState();
        // MONITOREXIT : object2
        if (!bl) {
            this.doPutSync(string2, jSONObject, jSONObject2);
            return;
        }
        this.doCreateOrNewSession(string2, jSONObject, jSONObject2);
    }

    private boolean isSessionCall() {
        boolean bl = (this.getToSyncUserState().getDependValues().optBoolean(SESSION) || this.getId() == null) && !this.waitingForSessionResponse;
        return bl;
    }

    private void logoutEmailSyncSuccess() {
        this.getToSyncUserState().removeFromDependValues(LOGOUT_EMAIL);
        this.toSyncUserState.removeFromDependValues(EMAIL_AUTH_HASH_KEY);
        this.toSyncUserState.removeFromSyncValues(PARENT_PLAYER_ID);
        this.toSyncUserState.removeFromSyncValues(EMAIL_KEY);
        this.toSyncUserState.persistState();
        this.getCurrentUserState().removeFromDependValues(EMAIL_AUTH_HASH_KEY);
        this.getCurrentUserState().removeFromSyncValues(PARENT_PLAYER_ID);
        String string2 = this.getCurrentUserState().getSyncValues().optString(EMAIL_KEY);
        this.getCurrentUserState().removeFromSyncValues(EMAIL_KEY);
        OneSignalStateSynchronizer.setNewSessionForEmail();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device successfully logged out of email: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        OneSignal.handleSuccessfulEmailLogout();
    }

    private boolean response400WithErrorsContaining(int n, String string2, String string3) {
        boolean bl = false;
        if (n == 400 && string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            boolean bl2 = bl;
            try {
                if (jSONObject.has(ERRORS)) {
                    boolean bl3 = jSONObject.optString(ERRORS).contains((CharSequence)string3);
                    bl2 = bl;
                    if (bl3) {
                        bl2 = true;
                    }
                }
                return bl2;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return false;
    }

    private void sendTagsHandlersPerformOnFailure(OneSignal.SendTagsError sendTagsError) {
        OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler;
        while ((changeTagsUpdateHandler = (OneSignal.ChangeTagsUpdateHandler)this.sendTagsHandlers.poll()) != null) {
            changeTagsUpdateHandler.onFailure(sendTagsError);
        }
    }

    private void sendTagsHandlersPerformOnSuccess() {
        OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler;
        JSONObject jSONObject = OneSignalStateSynchronizer.getTags((boolean)false).result;
        while ((changeTagsUpdateHandler = (OneSignal.ChangeTagsUpdateHandler)this.sendTagsHandlers.poll()) != null) {
            changeTagsUpdateHandler.onSuccess(jSONObject);
        }
    }

    private boolean syncEmailLogout() {
        return this.getToSyncUserState().getDependValues().optBoolean(LOGOUT_EMAIL, false);
    }

    public abstract void addOnSessionOrCreateExtras(JSONObject var1);

    public void clearLocation() {
        this.getToSyncUserState().clearLocation();
        this.getToSyncUserState().persistState();
    }

    public abstract void fireEventsForUpdateFailure(JSONObject var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        Object object;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff(jSONObject, jSONObject2, jSONObject3, set);
        }
    }

    public String getChannelString() {
        return this.channel.name().toLowerCase();
    }

    public OneSignalStateSynchronizer.UserStateSynchronizerType getChannelType() {
        return this.channel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public UserState getCurrentUserState() {
        Object object;
        if (this.currentUserState != null) return this.currentUserState;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            if (this.currentUserState != null) return this.currentUserState;
            this.currentUserState = this.newUserState(CURRENT_STATE, true);
            return this.currentUserState;
        }
    }

    @Nullable
    public abstract String getExternalId(boolean var1);

    public abstract String getId();

    public abstract OneSignal.LOG_LEVEL getLogLevel();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NetworkHandlerThread getNetworkHandlerThread(Integer object) {
        Object object2;
        Object object3 = object2 = this.networkHandlerSyncLock;
        synchronized (object3) {
            if (this.networkHandlerThreads.containsKey(object)) return (NetworkHandlerThread)((Object)this.networkHandlerThreads.get(object));
            HashMap<Integer, NetworkHandlerThread> hashMap = this.networkHandlerThreads;
            NetworkHandlerThread networkHandlerThread = new NetworkHandlerThread(this, (int)object);
            hashMap.put(object, (Object)networkHandlerThread);
            return (NetworkHandlerThread)((Object)this.networkHandlerThreads.get(object));
        }
    }

    public String getRegistrationId() {
        return this.getToSyncUserState().getSyncValues().optString(IDENTIFIER, null);
    }

    public abstract boolean getSubscribed();

    public boolean getSyncAsNewSession() {
        return this.getUserStateForModification().getDependValues().optBoolean(SESSION);
    }

    public abstract GetTagsResult getTags(boolean var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public UserState getToSyncUserState() {
        Object object;
        if (this.toSyncUserState != null) return this.toSyncUserState;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            if (this.toSyncUserState != null) return this.toSyncUserState;
            this.toSyncUserState = this.newUserState(TOSYNC_STATE, true);
            return this.toSyncUserState;
        }
    }

    public UserState getUserStateForModification() {
        if (this.toSyncUserState == null) {
            this.toSyncUserState = this.getCurrentUserState().deepClone(TOSYNC_STATE);
        }
        this.scheduleSyncToServer();
        return this.toSyncUserState;
    }

    public abstract boolean getUserSubscribePreference();

    public boolean hasQueuedHandlers() {
        boolean bl = this.externalUserIdUpdateHandlers.size() > 0;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void initUserState() {
        if (this.currentUserState == null) {
            Object object;
            Object object2 = object = this.LOCK;
            synchronized (object2) {
                if (this.currentUserState == null) {
                    this.currentUserState = this.newUserState(CURRENT_STATE, true);
                }
            }
        }
        this.getToSyncUserState();
    }

    public abstract void logoutChannel();

    public abstract UserState newUserState(String var1, boolean var2);

    public abstract void onSuccessfulSync(JSONObject var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean persist() {
        Object object = this.toSyncUserState;
        boolean bl = false;
        if (object == null) return false;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            if (this.getCurrentUserState().generateJsonDiff(this.toSyncUserState, this.isSessionCall()) != null) {
                bl = true;
            }
            this.toSyncUserState.persistState();
            return bl;
        }
    }

    public void readyToUpdate(boolean bl) {
        boolean bl2 = this.canMakeUpdates != bl;
        this.canMakeUpdates = bl;
        if (bl2 && bl) {
            this.scheduleSyncToServer();
        }
    }

    public void resetCurrentState() {
        this.getCurrentUserState().setSyncValues(new JSONObject());
        this.getCurrentUserState().persistState();
    }

    public abstract void saveChannelId(String var1);

    public abstract void scheduleSyncToServer();

    public void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        OneSignalRestClient.post(z2.s(z2.t("players/"), this.getId(), "/on_purchase"), jSONObject, responseHandler);
    }

    public void sendTags(JSONObject jSONObject, @Nullable OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (changeTagsUpdateHandler != null) {
            this.sendTagsHandlers.add((Object)changeTagsUpdateHandler);
        }
        this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, null);
    }

    public void setExternalUserId(String string2, String string3, OneSignal.OSInternalExternalUserIdUpdateCompletionHandler object) throws JSONException {
        if (object != null) {
            this.externalUserIdUpdateHandlers.add(object);
        }
        object = this.getUserStateForModification();
        ((UserState)object).putOnSyncValues(EXTERNAL_USER_ID, string2);
        if (string3 != null) {
            ((UserState)object).putOnSyncValues(EXTERNAL_USER_ID_AUTH_HASH, string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setNewSession() {
        try {
            Object object;
            Object object2 = object = this.LOCK;
            synchronized (object2) {
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
        {
            this.getUserStateForModification().putOnDependValues(SESSION, Boolean.TRUE);
            this.getUserStateForModification().persistState();
            return;
        }
    }

    public abstract void setPermission(boolean var1);

    public abstract void setSubscription(boolean var1);

    public void syncHashedEmail(JSONObject jSONObject) {
        this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, null);
    }

    public void syncUserState(boolean bl) {
        this.runningSyncUserState.set(true);
        this.internalSyncUserState(bl);
        this.runningSyncUserState.set(false);
    }

    public void updateDeviceInfo(JSONObject jSONObject, @Nullable OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler) {
        if (oSDeviceInfoCompletionHandler != null) {
            this.deviceInfoCompletionHandler.add((Object)oSDeviceInfoCompletionHandler);
        }
        this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, null);
    }

    public abstract void updateIdDependents(String var1);

    public void updateLocation(LocationController.LocationPoint locationPoint) {
        this.getUserStateForModification().setLocation(locationPoint);
    }

    public abstract void updateState(JSONObject var1);

    public static class GetTagsResult {
        public JSONObject result;
        public boolean serverSuccess;

        public GetTagsResult(boolean bl, JSONObject jSONObject) {
            this.serverSuccess = bl;
            this.result = jSONObject;
        }
    }

    public class NetworkHandlerThread
    extends HandlerThread {
        public static final int MAX_RETRIES = 3;
        public static final int NETWORK_CALL_DELAY_TO_BUFFER_MS = 5000;
        public static final int NETWORK_HANDLER_USERSTATE = 0;
        private static final String THREAD_NAME_PREFIX = "OSH_NetworkHandlerThread_";
        public int currentRetry;
        public Handler mHandler;
        public int mType;
        public final UserStateSynchronizer this$0;

        public NetworkHandlerThread(UserStateSynchronizer userStateSynchronizer, int n) {
            this.this$0 = userStateSynchronizer;
            StringBuilder stringBuilder = z2.t(THREAD_NAME_PREFIX);
            stringBuilder.append((Object)userStateSynchronizer.channel);
            super(stringBuilder.toString());
            this.mType = n;
            this.start();
            this.mHandler = new Handler(this.getLooper());
        }

        private Runnable getNewRunnable() {
            if (this.mType != 0) {
                return null;
            }
            return new Runnable(this){
                public final NetworkHandlerThread this$1;
                {
                    this.this$1 = networkHandlerThread;
                }

                public void run() {
                    if (this.this$1.this$0.runningSyncUserState.get() ^ true) {
                        this.this$1.this$0.syncUserState(false);
                    }
                }
            };
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean doRetry() {
            Handler handler;
            Handler handler2 = handler = this.mHandler;
            synchronized (handler2) {
                boolean bl = this.currentRetry < 3;
                boolean bl2 = this.mHandler.hasMessages(0);
                if (!bl) return this.mHandler.hasMessages(0);
                if (bl2) return this.mHandler.hasMessages(0);
                ++this.currentRetry;
                this.mHandler.postDelayed(this.getNewRunnable(), (long)(this.currentRetry * 15000));
                return this.mHandler.hasMessages(0);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void runNewJobDelayed() {
            Handler handler;
            if (!this.this$0.canMakeUpdates) {
                return;
            }
            Handler handler2 = handler = this.mHandler;
            synchronized (handler2) {
                this.currentRetry = 0;
                this.mHandler.removeCallbacksAndMessages(null);
                this.mHandler.postDelayed(this.getNewRunnable(), 5000L);
                return;
            }
        }

        public void stopScheduledRunnable() {
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }
}

