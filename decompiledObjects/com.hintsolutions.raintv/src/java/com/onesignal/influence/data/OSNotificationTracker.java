/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSTime;
import com.onesignal.influence.data.OSChannelTracker;
import com.onesignal.influence.data.OSInfluenceDataRepository;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0018H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006'"}, d2={"Lcom/onesignal/influence/data/OSNotificationTracker;", "Lcom/onesignal/influence/data/OSChannelTracker;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channelLimit", "", "getChannelLimit", "()I", "channelType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getChannelType", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "idTag", "", "getIdTag", "()Ljava/lang/String;", "indirectAttributionWindow", "getIndirectAttributionWindow", "lastChannelObjects", "Lorg/json/JSONArray;", "getLastChannelObjects", "()Lorg/json/JSONArray;", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "influence", "Lcom/onesignal/influence/domain/OSInfluence;", "cacheState", "getLastChannelObjectsReceivedByNewId", "id", "initInfluencedTypeFromCache", "saveChannelObjects", "channelObjects", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSNotificationTracker
extends OSChannelTracker {
    public OSNotificationTracker(@NotNull OSInfluenceDataRepository oSInfluenceDataRepository, @NotNull OSLogger oSLogger, @NotNull OSTime oSTime) {
        Intrinsics.checkNotNullParameter((Object)oSInfluenceDataRepository, (String)"dataRepository");
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oSTime, (String)"timeProvider");
        super(oSInfluenceDataRepository, oSLogger, oSTime);
    }

    @Override
    public void addSessionData(@NotNull JSONObject jSONObject, @NotNull OSInfluence oSInfluence) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"jsonObject");
        Intrinsics.checkNotNullParameter((Object)oSInfluence, (String)"influence");
        if (oSInfluence.getInfluenceType().isAttributed()) {
            try {
                jSONObject.put("direct", oSInfluence.getInfluenceType().isDirect());
                jSONObject.put("notification_ids", (Object)oSInfluence.getIds());
            }
            catch (JSONException jSONException) {
                this.getLogger().error("Generating notification tracker addSessionData JSONObject ", jSONException);
            }
        }
    }

    @Override
    public void cacheState() {
        OSInfluenceType oSInfluenceType;
        OSInfluenceDataRepository oSInfluenceDataRepository = this.getDataRepository();
        OSInfluenceType oSInfluenceType2 = oSInfluenceType = this.getInfluenceType();
        if (oSInfluenceType == null) {
            oSInfluenceType2 = OSInfluenceType.UNATTRIBUTED;
        }
        oSInfluenceDataRepository.cacheNotificationInfluenceType(oSInfluenceType2);
        this.getDataRepository().cacheNotificationOpenId(this.getDirectId());
    }

    @Override
    public int getChannelLimit() {
        return this.getDataRepository().getNotificationLimit();
    }

    @Override
    @NotNull
    public OSInfluenceChannel getChannelType() {
        return OSInfluenceChannel.NOTIFICATION;
    }

    @Override
    @NotNull
    public String getIdTag() {
        return "notification_id";
    }

    @Override
    public int getIndirectAttributionWindow() {
        return this.getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override
    @NotNull
    public JSONArray getLastChannelObjects() throws JSONException {
        return this.getDataRepository().getLastNotificationsReceivedData();
    }

    @Override
    @NotNull
    public JSONArray getLastChannelObjectsReceivedByNewId(@Nullable String string2) {
        try {
            string2 = this.getLastChannelObjects();
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating Notification tracker getLastChannelObjects JSONObject ", jSONException);
            string2 = new JSONArray();
        }
        return string2;
    }

    @Override
    public void initInfluencedTypeFromCache() {
        OSInfluenceType oSInfluenceType = this.getDataRepository().getNotificationCachedInfluenceType();
        if (oSInfluenceType.isIndirect()) {
            this.setIndirectIds(this.getLastReceivedIds());
        } else if (oSInfluenceType.isDirect()) {
            this.setDirectId(this.getDataRepository().getCachedNotificationOpenId());
        }
        Unit unit = Unit.INSTANCE;
        this.setInfluenceType(oSInfluenceType);
        this.getLogger().debug(Intrinsics.stringPlus((String)"OneSignal NotificationTracker initInfluencedTypeFromCache: ", (Object)this));
    }

    @Override
    public void saveChannelObjects(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)jSONArray, (String)"channelObjects");
        this.getDataRepository().saveNotifications(jSONArray);
    }
}

