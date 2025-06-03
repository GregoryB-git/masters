/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.influence.data.OSInAppMessageTracker
 *  com.onesignal.influence.data.OSNotificationTracker
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.ConcurrentHashMap
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONObject
 */
package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSTime;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.OSInfluenceConstants;
import com.onesignal.influence.data.OSChannelTracker;
import com.onesignal.influence.data.OSInAppMessageTracker;
import com.onesignal.influence.data.OSInfluenceDataRepository;
import com.onesignal.influence.data.OSNotificationTracker;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nJ\u0010\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\"\u001a\u00020#J\u0006\u0010%\u001a\u00020\u001eJ\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2={"Lcom/onesignal/influence/data/OSTrackerFactory;", "", "preferences", "Lcom/onesignal/OSSharedPreferences;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/OSSharedPreferences;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channels", "", "Lcom/onesignal/influence/data/OSChannelTracker;", "getChannels", "()Ljava/util/List;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "iAMChannelTracker", "getIAMChannelTracker", "()Lcom/onesignal/influence/data/OSChannelTracker;", "influences", "Lcom/onesignal/influence/domain/OSInfluence;", "getInfluences", "notificationChannelTracker", "getNotificationChannelTracker", "sessionInfluences", "getSessionInfluences", "trackers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "getChannelByEntryAction", "entryAction", "Lcom/onesignal/OneSignal$AppEntryAction;", "getChannelsToResetByEntryAction", "initFromCache", "saveInfluenceParams", "influenceParams", "Lcom/onesignal/OneSignalRemoteParams$InfluenceParams;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSTrackerFactory {
    @NotNull
    private final OSInfluenceDataRepository dataRepository;
    @NotNull
    private final ConcurrentHashMap<String, OSChannelTracker> trackers;

    public OSTrackerFactory(@NotNull OSSharedPreferences object, @NotNull OSLogger oSLogger, @NotNull OSTime oSTime) {
        OSInfluenceDataRepository oSInfluenceDataRepository;
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter((Object)object, (String)"preferences");
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oSTime, (String)"timeProvider");
        this.trackers = concurrentHashMap = new ConcurrentHashMap();
        this.dataRepository = oSInfluenceDataRepository = new OSInfluenceDataRepository((OSSharedPreferences)object);
        object = OSInfluenceConstants.INSTANCE;
        concurrentHashMap.put((Object)((OSInfluenceConstants)object).getIAM_TAG(), (Object)new OSInAppMessageTracker(oSInfluenceDataRepository, oSLogger, oSTime));
        concurrentHashMap.put((Object)((OSInfluenceConstants)object).getNOTIFICATION_TAG(), (Object)new OSNotificationTracker(oSInfluenceDataRepository, oSLogger, oSTime));
    }

    public final void addSessionData(@NotNull JSONObject jSONObject, @NotNull List<OSInfluence> iterator) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"jsonObject");
        Intrinsics.checkNotNullParameter(iterator, (String)"influences");
        for (OSInfluence oSInfluence : iterator) {
            OSInfluenceChannel oSInfluenceChannel = oSInfluence.getInfluenceChannel();
            if (WhenMappings.$EnumSwitchMapping$0[oSInfluenceChannel.ordinal()] != 1) continue;
            this.getNotificationChannelTracker().addSessionData(jSONObject, oSInfluence);
        }
    }

    @Nullable
    public final OSChannelTracker getChannelByEntryAction(@NotNull OneSignal.AppEntryAction object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"entryAction");
        object = object.isNotificationClick() ? this.getNotificationChannelTracker() : null;
        return object;
    }

    @NotNull
    public final List<OSChannelTracker> getChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.getNotificationChannelTracker());
        arrayList.add((Object)this.getIAMChannelTracker());
        return arrayList;
    }

    @NotNull
    public final List<OSChannelTracker> getChannelsToResetByEntryAction(@NotNull OneSignal.AppEntryAction object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"entryAction");
        ArrayList arrayList = new ArrayList();
        if (object.isAppClose()) {
            return arrayList;
        }
        if ((object = object.isAppOpen() ? this.getNotificationChannelTracker() : null) != null) {
            arrayList.add(object);
        }
        arrayList.add((Object)this.getIAMChannelTracker());
        return arrayList;
    }

    @NotNull
    public final OSChannelTracker getIAMChannelTracker() {
        Object object = this.trackers.get((Object)OSInfluenceConstants.INSTANCE.getIAM_TAG());
        Intrinsics.checkNotNull((Object)object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"trackers[OSInfluenceConstants.IAM_TAG]!!");
        return (OSChannelTracker)object;
    }

    @NotNull
    public final List<OSInfluence> getInfluences() {
        Collection collection = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue((Object)collection, (String)"trackers.values");
        ArrayList arrayList = new ArrayList(CollectionsKt.e((Iterable)collection));
        collection = collection.iterator();
        while (collection.hasNext()) {
            arrayList.add((Object)((OSChannelTracker)collection.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @NotNull
    public final OSChannelTracker getNotificationChannelTracker() {
        Object object = this.trackers.get((Object)OSInfluenceConstants.INSTANCE.getNOTIFICATION_TAG());
        Intrinsics.checkNotNull((Object)object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"trackers[OSInfluenceConstants.NOTIFICATION_TAG]!!");
        return (OSChannelTracker)object;
    }

    @NotNull
    public final List<OSInfluence> getSessionInfluences() {
        Collection collection = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue((Object)collection, (String)"trackers.values");
        ArrayList arrayList = new ArrayList();
        for (Object object : collection) {
            if (!(Intrinsics.areEqual((Object)((OSChannelTracker)object).getIdTag(), (Object)OSInfluenceConstants.INSTANCE.getIAM_TAG()) ^ true)) continue;
            arrayList.add(object);
        }
        collection = new ArrayList(CollectionsKt.e((Iterable)arrayList));
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            collection.add((Object)((OSChannelTracker)arrayList.next()).getCurrentSessionInfluence());
        }
        return collection;
    }

    public final void initFromCache() {
        Collection collection = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue((Object)collection, (String)"trackers.values");
        collection = collection.iterator();
        while (collection.hasNext()) {
            ((OSChannelTracker)collection.next()).initInfluencedTypeFromCache();
        }
    }

    public final void saveInfluenceParams(@NotNull OneSignalRemoteParams.InfluenceParams influenceParams) {
        Intrinsics.checkNotNullParameter((Object)influenceParams, (String)"influenceParams");
        this.dataRepository.saveInfluenceParams(influenceParams);
    }

    @Metadata(k=3, mv={1, 5, 1}, xi=48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[OSInfluenceChannel.values().length];
            nArray[OSInfluenceChannel.NOTIFICATION.ordinal()] = 1;
            nArray[OSInfluenceChannel.IAM.ordinal()] = 2;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

