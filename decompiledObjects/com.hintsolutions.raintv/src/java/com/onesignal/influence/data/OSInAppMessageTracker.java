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

@Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0018H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006'"}, d2={"Lcom/onesignal/influence/data/OSInAppMessageTracker;", "Lcom/onesignal/influence/data/OSChannelTracker;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channelLimit", "", "getChannelLimit", "()I", "channelType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getChannelType", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "idTag", "", "getIdTag", "()Ljava/lang/String;", "indirectAttributionWindow", "getIndirectAttributionWindow", "lastChannelObjects", "Lorg/json/JSONArray;", "getLastChannelObjects", "()Lorg/json/JSONArray;", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "influence", "Lcom/onesignal/influence/domain/OSInfluence;", "cacheState", "getLastChannelObjectsReceivedByNewId", "id", "initInfluencedTypeFromCache", "saveChannelObjects", "channelObjects", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSInAppMessageTracker
extends OSChannelTracker {
    public OSInAppMessageTracker(@NotNull OSInfluenceDataRepository oSInfluenceDataRepository, @NotNull OSLogger oSLogger, @NotNull OSTime oSTime) {
        Intrinsics.checkNotNullParameter((Object)oSInfluenceDataRepository, (String)"dataRepository");
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oSTime, (String)"timeProvider");
        super(oSInfluenceDataRepository, oSLogger, oSTime);
    }

    @Override
    public void addSessionData(@NotNull JSONObject jSONObject, @NotNull OSInfluence oSInfluence) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"jsonObject");
        Intrinsics.checkNotNullParameter((Object)oSInfluence, (String)"influence");
    }

    @Override
    public void cacheState() {
        OSInfluenceType oSInfluenceType;
        OSInfluenceType oSInfluenceType2 = oSInfluenceType = this.getInfluenceType();
        if (oSInfluenceType == null) {
            oSInfluenceType2 = OSInfluenceType.UNATTRIBUTED;
        }
        OSInfluenceDataRepository oSInfluenceDataRepository = this.getDataRepository();
        oSInfluenceType = oSInfluenceType2;
        if (oSInfluenceType2 == OSInfluenceType.DIRECT) {
            oSInfluenceType = OSInfluenceType.INDIRECT;
        }
        oSInfluenceDataRepository.cacheIAMInfluenceType(oSInfluenceType);
    }

    @Override
    public int getChannelLimit() {
        return this.getDataRepository().getIamLimit();
    }

    @Override
    @NotNull
    public OSInfluenceChannel getChannelType() {
        return OSInfluenceChannel.IAM;
    }

    @Override
    @NotNull
    public String getIdTag() {
        return "iam_id";
    }

    @Override
    public int getIndirectAttributionWindow() {
        return this.getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override
    @NotNull
    public JSONArray getLastChannelObjects() throws JSONException {
        return this.getDataRepository().getLastIAMsReceivedData();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public JSONArray getLastChannelObjectsReceivedByNewId(@Nullable String string2) {
        JSONArray jSONArray2;
        try {
            jSONArray2 = this.getLastChannelObjects();
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating IAM tracker getLastChannelObjects JSONObject ", jSONException);
            return new JSONArray();
        }
        try {
            JSONArray jSONArray = new JSONArray();
            int n2 = 0;
            int n = jSONArray2.length();
            if (n <= 0) return jSONArray;
            while (true) {
                int n3 = n2 + 1;
                if (!Intrinsics.areEqual((Object)string2, (Object)jSONArray2.getJSONObject(n2).getString(this.getIdTag()))) {
                    jSONArray.put((Object)jSONArray2.getJSONObject(n2));
                }
                if (n3 >= n) break;
                n2 = n3;
            }
            return jSONArray;
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating tracker lastChannelObjectReceived get JSONObject ", jSONException);
            return jSONArray2;
        }
    }

    @Override
    public void initInfluencedTypeFromCache() {
        OSInfluenceType oSInfluenceType = this.getDataRepository().getIamCachedInfluenceType();
        if (oSInfluenceType.isIndirect()) {
            this.setIndirectIds(this.getLastReceivedIds());
        }
        Unit unit = Unit.INSTANCE;
        this.setInfluenceType(oSInfluenceType);
        this.getLogger().debug(Intrinsics.stringPlus((String)"OneSignal InAppMessageTracker initInfluencedTypeFromCache: ", (Object)this));
    }

    @Override
    public void saveChannelObjects(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)jSONArray, (String)"channelObjects");
        this.getDataRepository().saveIAMs(jSONArray);
    }
}

