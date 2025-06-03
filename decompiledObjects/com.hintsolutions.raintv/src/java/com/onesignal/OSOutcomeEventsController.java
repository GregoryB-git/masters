/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.OSOutcomeEventsController$3
 *  com.onesignal.OSOutcomeEventsController$4
 *  com.onesignal.OneSignalApiResponseHandler
 *  com.onesignal.influence.domain.OSInfluence
 *  com.onesignal.influence.domain.OSInfluenceType
 *  com.onesignal.outcomes.data.OSOutcomeEventsFactory
 *  com.onesignal.outcomes.domain.OSOutcomeEventParams
 *  com.onesignal.outcomes.domain.OSOutcomeSource
 *  com.onesignal.outcomes.domain.OSOutcomeSourceBody
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSOutcomeEventsController;
import com.onesignal.OSSessionManager;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.data.OSOutcomeEventsFactory;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class OSOutcomeEventsController {
    private static final String OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD = "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD";
    private static final String OS_SAVE_OUTCOMES = "OS_SAVE_OUTCOMES";
    private static final String OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS = "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS";
    private static final String OS_SEND_SAVED_OUTCOMES = "OS_SEND_SAVED_OUTCOMES";
    @NonNull
    private final OSSessionManager osSessionManager;
    @NonNull
    private final OSOutcomeEventsFactory outcomeEventsFactory;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public OSOutcomeEventsController(@NonNull OSSessionManager oSSessionManager, @NonNull OSOutcomeEventsFactory oSOutcomeEventsFactory) {
        this.osSessionManager = oSSessionManager;
        this.outcomeEventsFactory = oSOutcomeEventsFactory;
        this.initUniqueOutcomeEventsSentSets();
    }

    public static /* synthetic */ void access$200(OSOutcomeEventsController oSOutcomeEventsController, OSOutcomeEventParams oSOutcomeEventParams) {
        oSOutcomeEventsController.saveUniqueOutcome(oSOutcomeEventParams);
    }

    private List<OSInfluence> getUniqueIds(String string2, List<OSInfluence> list) {
        string2 = this.outcomeEventsFactory.getRepository().getNotCachedUniqueOutcome(string2, list);
        if (string2.size() <= 0) {
            string2 = null;
        }
        return string2;
    }

    private void initUniqueOutcomeEventsSentSets() {
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        Set set = this.outcomeEventsFactory.getRepository().getUnattributedUniqueOutcomeEventsSent();
        if (set != null) {
            this.unattributedUniqueOutcomeEventsSentOnSession = set;
        }
    }

    private List<OSInfluence> removeDisabledInfluences(List<OSInfluence> stringBuilder) {
        ArrayList arrayList = new ArrayList(stringBuilder);
        for (OSInfluence oSInfluence : stringBuilder) {
            if (!oSInfluence.getInfluenceType().isDisabled()) continue;
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            stringBuilder = z2.t("Outcomes disabled for channel: ");
            stringBuilder.append(oSInfluence.getInfluenceChannel().toString());
            OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
            arrayList.remove((Object)oSInfluence);
        }
        return arrayList;
    }

    private void saveAttributedUniqueOutcomeNotifications(OSOutcomeEventParams oSOutcomeEventParams) {
        new Thread(new Runnable(this, oSOutcomeEventParams){
            public final OSOutcomeEventsController this$0;
            public final OSOutcomeEventParams val$eventParams;
            {
                this.this$0 = oSOutcomeEventsController;
                this.val$eventParams = oSOutcomeEventParams;
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                this.this$0.outcomeEventsFactory.getRepository().saveUniqueOutcomeNotifications(this.val$eventParams);
            }
        }, OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS).start();
    }

    private void saveUnattributedUniqueOutcomeEvents() {
        this.outcomeEventsFactory.getRepository().saveUnattributedUniqueOutcomeEventsSent(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private void saveUniqueOutcome(OSOutcomeEventParams oSOutcomeEventParams) {
        if (oSOutcomeEventParams.isUnattributed()) {
            this.saveUnattributedUniqueOutcomeEvents();
        } else {
            this.saveAttributedUniqueOutcomeNotifications(oSOutcomeEventParams);
        }
    }

    private void sendAndCreateOutcomeEvent(@NonNull String string2, @NonNull float f, @NonNull List<OSInfluence> object, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        int n = new OSUtils().getDeviceType();
        String string3 = OneSignal.appId;
        Iterator iterator = object.iterator();
        boolean bl = false;
        OSOutcomeEventParams oSOutcomeEventParams = null;
        object = null;
        while (iterator.hasNext()) {
            OSOutcomeEventParams oSOutcomeEventParams2;
            OSInfluence oSInfluence = (OSInfluence)iterator.next();
            int n2 = 6.$SwitchMap$com$onesignal$influence$domain$OSInfluenceType[oSInfluence.getInfluenceType().ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) continue;
                        object = OneSignal.LOG_LEVEL.VERBOSE;
                        string2 = z2.t("Outcomes disabled for channel: ");
                        string2.append((Object)oSInfluence.getInfluenceChannel());
                        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), string2.toString());
                        if (outcomeCallback != null) {
                            outcomeCallback.onSuccess(null);
                        }
                        return;
                    }
                    bl = true;
                    continue;
                }
                oSOutcomeEventParams2 = object;
                if (object == null) {
                    oSOutcomeEventParams2 = new OSOutcomeSourceBody();
                }
                object = this.setSourceChannelIds(oSInfluence, (OSOutcomeSourceBody)oSOutcomeEventParams2);
                continue;
            }
            oSOutcomeEventParams2 = oSOutcomeEventParams;
            if (oSOutcomeEventParams == null) {
                oSOutcomeEventParams2 = new OSOutcomeSourceBody();
            }
            oSOutcomeEventParams = this.setSourceChannelIds(oSInfluence, (OSOutcomeSourceBody)oSOutcomeEventParams2);
        }
        if (oSOutcomeEventParams == null && object == null && !bl) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for all channels");
            if (outcomeCallback != null) {
                outcomeCallback.onSuccess(null);
            }
            return;
        }
        object = new OSOutcomeEventParams(string2, new OSOutcomeSource(oSOutcomeEventParams, object), f, 0L);
        string2 = new 4(this, object, outcomeCallback, l, string2);
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(string3, n, object, (OneSignalApiResponseHandler)string2);
    }

    private void sendSavedOutcomeEvent(@NonNull OSOutcomeEventParams oSOutcomeEventParams) {
        int n = new OSUtils().getDeviceType();
        String string2 = OneSignal.appId;
        3 var3_4 = new 3(this, oSOutcomeEventParams);
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(string2, n, oSOutcomeEventParams, (OneSignalApiResponseHandler)var3_4);
    }

    private void sendUniqueOutcomeEvent(@NonNull String string2, @NonNull List<OSInfluence> object, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        boolean bl;
        StringBuilder stringBuilder;
        block8: {
            if ((object = this.removeDisabledInfluences((List<OSInfluence>)object)).isEmpty()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Unique Outcome disabled for current session");
                return;
            }
            boolean bl2 = false;
            stringBuilder = object.iterator();
            do {
                bl = bl2;
                if (!stringBuilder.hasNext()) break block8;
            } while (!((OSInfluence)stringBuilder.next()).getInfluenceType().isAttributed());
            bl = true;
        }
        if (bl) {
            stringBuilder = this.getUniqueIds(string2, (List<OSInfluence>)object);
            if (stringBuilder == null) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                stringBuilder = z2.t("Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: ");
                stringBuilder.append(object.toString());
                stringBuilder.append("\nOutcome name: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess(null);
                }
                return;
            }
            this.sendAndCreateOutcomeEvent(string2, 0.0f, (List<OSInfluence>)stringBuilder, outcomeCallback);
        } else {
            if (this.unattributedUniqueOutcomeEventsSentOnSession.contains((Object)string2)) {
                object = OneSignal.LOG_LEVEL.DEBUG;
                stringBuilder = z2.t("Measure endpoint will not send because unique outcome already sent for: \nSession: ");
                stringBuilder.append((Object)OSInfluenceType.UNATTRIBUTED);
                stringBuilder.append("\nOutcome name: ");
                stringBuilder.append(string2);
                OneSignal.Log(object, stringBuilder.toString());
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess(null);
                }
                return;
            }
            this.unattributedUniqueOutcomeEventsSentOnSession.add((Object)string2);
            this.sendAndCreateOutcomeEvent(string2, 0.0f, (List<OSInfluence>)object, outcomeCallback);
        }
    }

    private OSOutcomeSourceBody setSourceChannelIds(OSInfluence oSInfluence, OSOutcomeSourceBody oSOutcomeSourceBody) {
        int n = 6.$SwitchMap$com$onesignal$influence$domain$OSInfluenceChannel[oSInfluence.getInfluenceChannel().ordinal()];
        if (n != 1) {
            if (n == 2) {
                oSOutcomeSourceBody.setNotificationIds(oSInfluence.getIds());
            }
        } else {
            oSOutcomeSourceBody.setInAppMessagesIds(oSInfluence.getIds());
        }
        return oSOutcomeSourceBody;
    }

    public void cleanCachedUniqueOutcomes() {
        new Thread(new Runnable(this){
            public final OSOutcomeEventsController this$0;
            {
                this.this$0 = oSOutcomeEventsController;
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                this.this$0.outcomeEventsFactory.getRepository().cleanCachedUniqueOutcomeEventNotifications("notification", "notification_id");
            }
        }, OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD).start();
    }

    public void cleanOutcomes() {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "OneSignal cleanOutcomes for session");
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        this.saveUnattributedUniqueOutcomeEvents();
    }

    public void sendClickActionOutcomes(List<OSInAppMessageOutcome> object) {
        for (OSInAppMessageOutcome oSInAppMessageOutcome : object) {
            object = oSInAppMessageOutcome.getName();
            if (oSInAppMessageOutcome.isUnique()) {
                this.sendUniqueOutcomeEvent((String)object, null);
                continue;
            }
            if (oSInAppMessageOutcome.getWeight() > 0.0f) {
                this.sendOutcomeEventWithValue((String)object, oSInAppMessageOutcome.getWeight(), null);
                continue;
            }
            this.sendOutcomeEvent((String)object, null);
        }
    }

    public void sendOutcomeEvent(@NonNull String string2, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        this.sendAndCreateOutcomeEvent(string2, 0.0f, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    public void sendOutcomeEventWithValue(@NonNull String string2, float f, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        this.sendAndCreateOutcomeEvent(string2, f, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    public void sendSavedOutcomes() {
        new Thread(new Runnable(this){
            public final OSOutcomeEventsController this$0;
            {
                this.this$0 = oSOutcomeEventsController;
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                for (OSOutcomeEventParams oSOutcomeEventParams : this.this$0.outcomeEventsFactory.getRepository().getSavedOutcomeEvents()) {
                    this.this$0.sendSavedOutcomeEvent(oSOutcomeEventParams);
                }
            }
        }, OS_SEND_SAVED_OUTCOMES).start();
    }

    public void sendUniqueOutcomeEvent(@NonNull String string2, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        this.sendUniqueOutcomeEvent(string2, this.osSessionManager.getInfluences(), outcomeCallback);
    }
}

