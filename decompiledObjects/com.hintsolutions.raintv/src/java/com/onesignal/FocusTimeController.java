/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.onesignal.FocusTimeController$FocusTimeProcessorBase$1
 *  com.onesignal.OSSyncService
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  com.onesignal.influence.domain.OSInfluence
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.onesignal.FocusTimeController;
import com.onesignal.OSFocusTimeProcessorFactory;
import com.onesignal.OSLogger;
import com.onesignal.OSSyncService;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;
import com.onesignal.influence.domain.OSInfluence;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class FocusTimeController {
    private OSLogger logger;
    private OSFocusTimeProcessorFactory processorFactory;
    @Nullable
    private Long timeFocusedAtMs;
    private Object timeFocusedAtMsLock = new Object();

    public FocusTimeController(OSFocusTimeProcessorFactory oSFocusTimeProcessorFactory, OSLogger oSLogger) {
        this.processorFactory = oSFocusTimeProcessorFactory;
        this.logger = oSLogger;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    private Long getTimeFocusedElapsed() {
        Object object;
        Object object2 = object = this.timeFocusedAtMsLock;
        synchronized (object2) {
            if (this.timeFocusedAtMs == null) {
                return null;
            }
            long l = (long)((double)(OneSignal.getTime().getElapsedRealtime() - this.timeFocusedAtMs) / 1000.0 + 0.5);
            if (l >= 1L && l <= 86400L) {
                return l;
            }
            return null;
        }
    }

    private boolean giveProcessorsValidFocusTime(@NonNull List<OSInfluence> list, @NonNull FocusEventType focusEventType) {
        Long l = this.getTimeFocusedElapsed();
        if (l == null) {
            return false;
        }
        this.processorFactory.getTimeProcessorWithInfluences(list).addTime(l, (List<OSInfluence>)list, focusEventType);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void appBackgrounded() {
        Object object;
        Object object2 = object = this.timeFocusedAtMsLock;
        synchronized (object2) {
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Application backgrounded focus time: ");
            stringBuilder.append((Object)this.timeFocusedAtMs);
            oSLogger.debug(stringBuilder.toString());
            this.processorFactory.getTimeProcessorSaved().sendUnsentTimeNow();
            this.timeFocusedAtMs = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void appForegrounded() {
        Object object;
        Object object2 = object = this.timeFocusedAtMsLock;
        synchronized (object2) {
            this.timeFocusedAtMs = OneSignal.getTime().getElapsedRealtime();
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Application foregrounded focus time: ");
            stringBuilder.append((Object)this.timeFocusedAtMs);
            oSLogger.debug(stringBuilder.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void appStopped() {
        List<OSInfluence> list;
        Long l = this.getTimeFocusedElapsed();
        List<OSInfluence> list2 = list = this.timeFocusedAtMsLock;
        // MONITORENTER : list2
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application stopped focus time: ");
        stringBuilder.append((Object)this.timeFocusedAtMs);
        stringBuilder.append(" timeElapsed: ");
        stringBuilder.append((Object)l);
        oSLogger.debug(stringBuilder.toString());
        // MONITOREXIT : list2
        if (l == null) {
            return;
        }
        list = OneSignal.getSessionManager().getSessionInfluences();
        this.processorFactory.getTimeProcessorWithInfluences(list).saveUnsentActiveData(l, (List<OSInfluence>)list);
    }

    public void doBlockingBackgroundSyncOfUnsentTime() {
        if (OneSignal.isInForeground()) {
            return;
        }
        this.processorFactory.getTimeProcessorSaved().syncUnsentTimeFromSyncJob();
    }

    public void onSessionEnded(@NonNull List<OSInfluence> list) {
        FocusEventType focusEventType = FocusEventType.END_SESSION;
        if (!this.giveProcessorsValidFocusTime(list, focusEventType)) {
            this.processorFactory.getTimeProcessorWithInfluences(list).sendUnsentTimeNow(focusEventType);
        }
    }

    public static final class FocusEventType
    extends Enum<FocusEventType> {
        private static final FocusEventType[] $VALUES;
        public static final /* enum */ FocusEventType BACKGROUND;
        public static final /* enum */ FocusEventType END_SESSION;

        static {
            FocusEventType focusEventType;
            FocusEventType focusEventType2;
            BACKGROUND = focusEventType2 = new FocusEventType();
            END_SESSION = focusEventType = new FocusEventType();
            $VALUES = new FocusEventType[]{focusEventType2, focusEventType};
        }

        public static FocusEventType valueOf(String string2) {
            return (FocusEventType)Enum.valueOf(FocusEventType.class, (String)string2);
        }

        public static FocusEventType[] values() {
            return (FocusEventType[])$VALUES.clone();
        }
    }

    public static abstract class FocusTimeProcessorBase {
        public long MIN_ON_FOCUS_TIME_SEC;
        @NonNull
        public String PREF_KEY_FOR_UNSENT_TIME;
        @NonNull
        private final AtomicBoolean runningOnFocusTime = new AtomicBoolean();
        @Nullable
        private Long unsentActiveTime = null;

        public static /* synthetic */ void access$500(FocusTimeProcessorBase focusTimeProcessorBase, long l) {
            focusTimeProcessorBase.saveUnsentActiveTime(l);
        }

        private void addTime(long l, @NonNull List<OSInfluence> list, @NonNull FocusEventType focusEventType) {
            this.saveUnsentActiveData(l, list);
            this.sendUnsentTimeNow(focusEventType);
        }

        @NonNull
        private JSONObject generateOnFocusPayload(long l) throws JSONException {
            JSONObject jSONObject = new JSONObject().put("app_id", (Object)OneSignal.getSavedAppId()).put("type", 1).put("state", (Object)"ping").put("active_time", l).put("device_type", new OSUtils().getDeviceType());
            OneSignal.addNetType(jSONObject);
            return jSONObject;
        }

        private long getUnsentActiveTime() {
            if (this.unsentActiveTime == null) {
                this.unsentActiveTime = OneSignalPrefs.getLong((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)this.PREF_KEY_FOR_UNSENT_TIME, (long)0L);
            }
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":getUnsentActiveTime: ");
            stringBuilder.append((Object)this.unsentActiveTime);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            return this.unsentActiveTime;
        }

        private boolean hasMinSyncTime() {
            boolean bl = this.getUnsentActiveTime() >= this.MIN_ON_FOCUS_TIME_SEC;
            return bl;
        }

        private void saveUnsentActiveData(long l, @NonNull List<OSInfluence> list) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":saveUnsentActiveData with lastFocusTimeInfluences: ");
            stringBuilder.append(list.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            long l2 = this.getUnsentActiveTime();
            this.saveInfluences(list);
            this.saveUnsentActiveTime(l2 + l);
        }

        private void saveUnsentActiveTime(long l) {
            this.unsentActiveTime = l;
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":saveUnsentActiveTime: ");
            stringBuilder.append((Object)this.unsentActiveTime);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            OneSignalPrefs.saveLong((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)this.PREF_KEY_FOR_UNSENT_TIME, (long)l);
        }

        private void sendOnFocus(long l) {
            try {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(":sendOnFocus with totalTimeActive: ");
                stringBuilder.append(l);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                lOG_LEVEL = this.generateOnFocusPayload(l);
                this.additionalFieldsToAddToOnFocusPayload((JSONObject)lOG_LEVEL);
                this.sendOnFocusToPlayer(OneSignal.getUserId(), (JSONObject)lOG_LEVEL);
                if (OneSignal.hasEmailId()) {
                    this.sendOnFocusToPlayer(OneSignal.getEmailId(), this.generateOnFocusPayload(l));
                }
                if (OneSignal.hasSMSlId()) {
                    this.sendOnFocusToPlayer(OneSignal.getSMSId(), this.generateOnFocusPayload(l));
                }
                lOG_LEVEL = new ArrayList();
                this.saveInfluences((List<OSInfluence>)lOG_LEVEL);
            }
            catch (JSONException jSONException) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating on_focus:JSON Failed.", jSONException);
            }
        }

        private void sendOnFocusToPlayer(@NonNull String string2, @NonNull JSONObject jSONObject) {
            1 var3_3 = new 1(this);
            OneSignalRestClient.postSync((String)z2.p("players/", string2, "/on_focus"), (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)var3_3);
        }

        private void sendUnsentTimeNow() {
            List<OSInfluence> list = this.getInfluences();
            long l = this.getUnsentActiveTime();
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":sendUnsentTimeNow with time: ");
            stringBuilder.append(l);
            stringBuilder.append(" and influences: ");
            stringBuilder.append(list.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.sendUnsentTimeNow(FocusEventType.BACKGROUND);
        }

        private void sendUnsentTimeNow(FocusEventType enum_) {
            if (!OneSignal.hasUserId()) {
                enum_ = OneSignal.LOG_LEVEL.WARN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(":sendUnsentTimeNow not possible due to user id null");
                OneSignal.Log((OneSignal.LOG_LEVEL)enum_, stringBuilder.toString());
                return;
            }
            this.sendTime((FocusEventType)enum_);
        }

        private void syncUnsentTimeFromSyncJob() {
            if (this.hasMinSyncTime()) {
                this.syncOnFocusTime();
            }
        }

        public void additionalFieldsToAddToOnFocusPayload(@NonNull JSONObject jSONObject) {
        }

        public abstract List<OSInfluence> getInfluences();

        public abstract void saveInfluences(List<OSInfluence> var1);

        public abstract void sendTime(@NonNull FocusEventType var1);

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @WorkerThread
        public void syncOnFocusTime() {
            AtomicBoolean atomicBoolean;
            if (this.runningOnFocusTime.get()) {
                return;
            }
            AtomicBoolean atomicBoolean2 = atomicBoolean = this.runningOnFocusTime;
            synchronized (atomicBoolean2) {
                this.runningOnFocusTime.set(true);
                if (this.hasMinSyncTime()) {
                    this.sendOnFocus(this.getUnsentActiveTime());
                }
                this.runningOnFocusTime.set(false);
                return;
            }
        }

        public void syncUnsentTimeOnBackgroundEvent() {
            if (!this.hasMinSyncTime()) {
                return;
            }
            OSSyncService.getInstance().scheduleSyncTask(OneSignal.appContext);
        }
    }
}

