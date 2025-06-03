/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.influence.data.OSChannelTracker
 *  com.onesignal.influence.data.OSTrackerFactory
 *  com.onesignal.influence.domain.OSInfluence
 *  com.onesignal.influence.domain.OSInfluenceType
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.JSONUtils;
import com.onesignal.OSLogger;
import com.onesignal.OneSignal;
import com.onesignal.influence.data.OSChannelTracker;
import com.onesignal.influence.data.OSTrackerFactory;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class OSSessionManager {
    private static final String OS_END_CURRENT_SESSION = "OS_END_CURRENT_SESSION";
    private OSLogger logger;
    private SessionListener sessionListener;
    public OSTrackerFactory trackerFactory;

    public OSSessionManager(@NonNull SessionListener sessionListener, OSTrackerFactory oSTrackerFactory, OSLogger oSLogger) {
        this.sessionListener = sessionListener;
        this.trackerFactory = oSTrackerFactory;
        this.logger = oSLogger;
    }

    private void attemptSessionUpgrade(OneSignal.AppEntryAction appEntryAction, @Nullable String object4) {
        boolean bl;
        Object object2 = this.logger;
        Object object32 = new StringBuilder();
        object32.append("OneSignal SessionManager attemptSessionUpgrade with entryAction: ");
        object32.append((Object)appEntryAction);
        object2.debug(object32.toString());
        OSChannelTracker oSChannelTracker = this.trackerFactory.getChannelByEntryAction(appEntryAction);
        List list = this.trackerFactory.getChannelsToResetByEntryAction(appEntryAction);
        ArrayList arrayList = new ArrayList();
        if (oSChannelTracker != null) {
            object32 = oSChannelTracker.getCurrentSessionInfluence();
            OSInfluenceType oSInfluenceType = OSInfluenceType.DIRECT;
            object2 = object4;
            if (object4 == null) {
                object2 = oSChannelTracker.getDirectId();
            }
            bl = this.setSession(oSChannelTracker, oSInfluenceType, (String)object2, null);
            object4 = object32;
        } else {
            bl = false;
            object4 = null;
        }
        if (bl) {
            object32 = this.logger;
            object2 = new StringBuilder();
            object2.append("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: ");
            object2.append((Object)list);
            object32.debug(object2.toString());
            arrayList.add(object4);
            for (Object object4 : list) {
                if (!object4.getInfluenceType().isDirect()) continue;
                arrayList.add((Object)object4.getCurrentSessionInfluence());
                object4.resetAndInitInfluence();
            }
        }
        this.logger.debug("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (Object object32 : list) {
            if (!object32.getInfluenceType().isUnattributed() || (list = object32.getLastReceivedIds()).length() <= 0 || appEntryAction.isAppClose()) continue;
            object2 = object32.getCurrentSessionInfluence();
            if (!this.setSession((OSChannelTracker)object32, OSInfluenceType.INDIRECT, null, (JSONArray)list)) continue;
            arrayList.add(object2);
        }
        object4 = OneSignal.LOG_LEVEL.DEBUG;
        appEntryAction = z2.t("Trackers after update attempt: ");
        appEntryAction.append(this.trackerFactory.getChannels().toString());
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object4), appEntryAction.toString());
        this.sendSessionEndingWithInfluences((List<OSInfluence>)arrayList);
    }

    private void sendSessionEndingWithInfluences(List<OSInfluence> list) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager sendSessionEndingWithInfluences with influences: ");
        stringBuilder.append(list);
        oSLogger.debug(stringBuilder.toString());
        if (list.size() > 0) {
            new Thread(new Runnable(this, list){
                public final OSSessionManager this$0;
                public final List val$endingInfluences;
                {
                    this.this$0 = oSSessionManager;
                    this.val$endingInfluences = list;
                }

                public void run() {
                    Thread.currentThread().setPriority(10);
                    this.this$0.sessionListener.onSessionEnding((List<OSInfluence>)this.val$endingInfluences);
                }
            }, OS_END_CURRENT_SESSION).start();
        }
    }

    private boolean setSession(@NonNull OSChannelTracker oSChannelTracker, @NonNull OSInfluenceType oSInfluenceType, @Nullable String string2, @Nullable JSONArray jSONArray) {
        if (!this.willChangeSession(oSChannelTracker, oSInfluenceType, string2, jSONArray)) {
            return false;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("OSChannelTracker changed: ");
        stringBuilder.append(oSChannelTracker.getIdTag());
        stringBuilder.append("\nfrom:\ninfluenceType: ");
        stringBuilder.append((Object)oSChannelTracker.getInfluenceType());
        stringBuilder.append(", directNotificationId: ");
        stringBuilder.append(oSChannelTracker.getDirectId());
        stringBuilder.append(", indirectNotificationIds: ");
        stringBuilder.append((Object)oSChannelTracker.getIndirectIds());
        stringBuilder.append("\nto:\ninfluenceType: ");
        stringBuilder.append((Object)oSInfluenceType);
        stringBuilder.append(", directNotificationId: ");
        stringBuilder.append(string2);
        stringBuilder.append(", indirectNotificationIds: ");
        stringBuilder.append((Object)jSONArray);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        oSChannelTracker.setInfluenceType(oSInfluenceType);
        oSChannelTracker.setDirectId(string2);
        oSChannelTracker.setIndirectIds(jSONArray);
        oSChannelTracker.cacheState();
        oSChannelTracker = new StringBuilder();
        oSChannelTracker.append("Trackers changed to: ");
        oSChannelTracker.append(this.trackerFactory.getChannels().toString());
        OneSignal.Log(lOG_LEVEL, oSChannelTracker.toString());
        return true;
    }

    private boolean willChangeSession(@NonNull OSChannelTracker oSChannelTracker, @NonNull OSInfluenceType oSInfluenceType, @Nullable String string2, @Nullable JSONArray jSONArray) {
        boolean bl = oSInfluenceType.equals((Object)oSChannelTracker.getInfluenceType());
        boolean bl2 = true;
        if (!bl) {
            return true;
        }
        oSInfluenceType = oSChannelTracker.getInfluenceType();
        if (oSInfluenceType.isDirect() && oSChannelTracker.getDirectId() != null && !oSChannelTracker.getDirectId().equals((Object)string2)) {
            return true;
        }
        if (!oSInfluenceType.isIndirect() || oSChannelTracker.getIndirectIds() == null || oSChannelTracker.getIndirectIds().length() <= 0 || JSONUtils.compareJSONArrays(oSChannelTracker.getIndirectIds(), jSONArray)) {
            bl2 = false;
        }
        return bl2;
    }

    public void addSessionIds(@NonNull JSONObject jSONObject, List<OSInfluence> object) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = z2.t("OneSignal SessionManager addSessionData with influences: ");
        stringBuilder.append(object.toString());
        oSLogger.debug(stringBuilder.toString());
        this.trackerFactory.addSessionData(jSONObject, object);
        object = this.logger;
        oSLogger = new StringBuilder();
        oSLogger.append("OneSignal SessionManager addSessionIds on jsonObject: ");
        oSLogger.append(jSONObject);
        object.debug(oSLogger.toString());
    }

    public void attemptSessionUpgrade(OneSignal.AppEntryAction appEntryAction) {
        this.attemptSessionUpgrade(appEntryAction, null);
    }

    @NonNull
    public List<OSInfluence> getInfluences() {
        return this.trackerFactory.getInfluences();
    }

    @NonNull
    public List<OSInfluence> getSessionInfluences() {
        return this.trackerFactory.getSessionInfluences();
    }

    public void initSessionFromCache() {
        this.trackerFactory.initFromCache();
    }

    public void onDirectInfluenceFromIAMClick(@NonNull String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        this.setSession(this.trackerFactory.getIAMChannelTracker(), OSInfluenceType.DIRECT, string2, null);
    }

    public void onDirectInfluenceFromIAMClickFinished() {
        this.logger.debug("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.trackerFactory.getIAMChannelTracker().resetAndInitInfluence();
    }

    public void onDirectInfluenceFromNotificationOpen(OneSignal.AppEntryAction appEntryAction, @Nullable String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        if (string2 != null && !string2.isEmpty()) {
            this.attemptSessionUpgrade(appEntryAction, string2);
        }
    }

    public void onInAppMessageReceived(@NonNull String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onInAppMessageReceived messageId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        stringBuilder = this.trackerFactory.getIAMChannelTracker();
        stringBuilder.saveLastId(string2);
        stringBuilder.resetAndInitInfluence();
    }

    public void onNotificationReceived(@Nullable String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onNotificationReceived notificationId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        if (string2 != null && !string2.isEmpty()) {
            this.trackerFactory.getNotificationChannelTracker().saveLastId(string2);
        }
    }

    public void restartSessionIfNeeded(OneSignal.AppEntryAction appEntryAction2) {
        List list = this.trackerFactory.getChannelsToResetByEntryAction(appEntryAction2);
        ArrayList arrayList = new ArrayList();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager restartSessionIfNeeded with entryAction: ");
        stringBuilder.append((Object)appEntryAction2);
        stringBuilder.append("\n channelTrackers: ");
        stringBuilder.append(list.toString());
        oSLogger.debug(stringBuilder.toString());
        for (OneSignal.AppEntryAction appEntryAction2 : list) {
            list = appEntryAction2.getLastReceivedIds();
            oSLogger = this.logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("OneSignal SessionManager restartSessionIfNeeded lastIds: ");
            stringBuilder2.append((Object)list);
            oSLogger.debug(stringBuilder2.toString());
            oSLogger = appEntryAction2.getCurrentSessionInfluence();
            boolean bl = list.length() > 0 ? this.setSession((OSChannelTracker)appEntryAction2, OSInfluenceType.INDIRECT, null, (JSONArray)list) : this.setSession((OSChannelTracker)appEntryAction2, OSInfluenceType.UNATTRIBUTED, null, null);
            if (!bl) continue;
            arrayList.add((Object)oSLogger);
        }
        this.sendSessionEndingWithInfluences((List<OSInfluence>)arrayList);
    }

    public static interface SessionListener {
        public void onSessionEnding(@NonNull List<OSInfluence> var1);
    }
}

