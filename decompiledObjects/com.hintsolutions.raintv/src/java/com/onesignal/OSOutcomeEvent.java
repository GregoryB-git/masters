/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.influence.domain.OSInfluenceType
 *  com.onesignal.outcomes.domain.OSOutcomeEventParams
 *  com.onesignal.outcomes.domain.OSOutcomeSource
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSOutcomeEvent {
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private String name;
    private JSONArray notificationIds;
    private OSInfluenceType session;
    private long timestamp;
    private Float weight;

    public OSOutcomeEvent(@NonNull OSInfluenceType oSInfluenceType, @Nullable JSONArray jSONArray, @NonNull String string2, long l, float f) {
        this.session = oSInfluenceType;
        this.notificationIds = jSONArray;
        this.name = string2;
        this.timestamp = l;
        this.weight = Float.valueOf((float)f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static OSOutcomeEvent fromOutcomeEventParamsV2toOutcomeEventV1(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeSource oSOutcomeSource;
        OSInfluenceType oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
        if (oSOutcomeEventParams.getOutcomeSource() != null) {
            oSOutcomeSource = oSOutcomeEventParams.getOutcomeSource();
            if (oSOutcomeSource.getDirectBody() != null && oSOutcomeSource.getDirectBody().getNotificationIds() != null && oSOutcomeSource.getDirectBody().getNotificationIds().length() > 0) {
                oSInfluenceType = OSInfluenceType.DIRECT;
                oSOutcomeSource = oSOutcomeSource.getDirectBody().getNotificationIds();
                return new OSOutcomeEvent(oSInfluenceType, (JSONArray)oSOutcomeSource, oSOutcomeEventParams.getOutcomeId(), oSOutcomeEventParams.getTimestamp(), oSOutcomeEventParams.getWeight());
            }
            if (oSOutcomeSource.getIndirectBody() != null && oSOutcomeSource.getIndirectBody().getNotificationIds() != null && oSOutcomeSource.getIndirectBody().getNotificationIds().length() > 0) {
                oSInfluenceType = OSInfluenceType.INDIRECT;
                oSOutcomeSource = oSOutcomeSource.getIndirectBody().getNotificationIds();
                return new OSOutcomeEvent(oSInfluenceType, (JSONArray)oSOutcomeSource, oSOutcomeEventParams.getOutcomeId(), oSOutcomeEventParams.getTimestamp(), oSOutcomeEventParams.getWeight());
            }
        }
        oSOutcomeSource = null;
        return new OSOutcomeEvent(oSInfluenceType, (JSONArray)oSOutcomeSource, oSOutcomeEventParams.getOutcomeId(), oSOutcomeEventParams.getTimestamp(), oSOutcomeEventParams.getWeight());
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (OSOutcomeEvent)object;
            if (!(this.session.equals((Object)((OSOutcomeEvent)object).session) && this.notificationIds.equals((Object)((OSOutcomeEvent)object).notificationIds) && this.name.equals((Object)((OSOutcomeEvent)object).name) && this.timestamp == ((OSOutcomeEvent)object).timestamp && this.weight.equals((Object)((OSOutcomeEvent)object).weight))) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public OSInfluenceType getSession() {
        return this.session;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getWeight() {
        return this.weight.floatValue();
    }

    public int hashCode() {
        OSInfluenceType oSInfluenceType = this.session;
        JSONArray jSONArray = this.notificationIds;
        int n = 1;
        String string2 = this.name;
        long l = this.timestamp;
        Float f = this.weight;
        for (int i = 0; i < 5; ++i) {
            Object object = (new Object[]{oSInfluenceType, jSONArray, string2, l, f})[i];
            int n2 = object == null ? 0 : object.hashCode();
            n = n * 31 + n2;
        }
        return n;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, (Object)this.session);
        jSONObject.put(NOTIFICATION_IDS, (Object)this.notificationIds);
        jSONObject.put(OUTCOME_ID, (Object)this.name);
        jSONObject.put(TIMESTAMP, this.timestamp);
        jSONObject.put(WEIGHT, (Object)this.weight);
        return jSONObject;
    }

    public JSONObject toJSONObjectForMeasure() throws JSONException {
        long l;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.notificationIds;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put(NOTIFICATION_IDS, (Object)this.notificationIds);
        }
        jSONObject.put(OUTCOME_ID, (Object)this.name);
        if (this.weight.floatValue() > 0.0f) {
            jSONObject.put(WEIGHT, (Object)this.weight);
        }
        if ((l = this.timestamp) > 0L) {
            jSONObject.put(TIMESTAMP, l);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OutcomeEvent{session=");
        stringBuilder.append((Object)this.session);
        stringBuilder.append(", notificationIds=");
        stringBuilder.append((Object)this.notificationIds);
        stringBuilder.append(", name='");
        a.B(stringBuilder, this.name, '\'', ", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", weight=");
        stringBuilder.append((Object)this.weight);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

