/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageRedisplayStats {
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private long lastDisplayTime;
    private boolean redisplayEnabled;

    public OSInAppMessageRedisplayStats() {
        this.lastDisplayTime = -1L;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0L;
        this.redisplayEnabled = false;
    }

    public OSInAppMessageRedisplayStats(int n, long l) {
        this.displayLimit = 1;
        this.displayDelay = 0L;
        this.redisplayEnabled = false;
        this.displayQuantity = n;
        this.lastDisplayTime = l;
    }

    public OSInAppMessageRedisplayStats(JSONObject object) throws JSONException {
        this.lastDisplayTime = -1L;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0L;
        this.redisplayEnabled = true;
        Object object2 = object.get(DISPLAY_LIMIT);
        object = object.get(DISPLAY_DELAY);
        if (object2 instanceof Integer) {
            this.displayLimit = (Integer)object2;
        }
        if (object instanceof Long) {
            this.displayDelay = (Long)object;
        } else if (object instanceof Integer) {
            this.displayDelay = ((Integer)object).intValue();
        }
    }

    public long getDisplayDelay() {
        return this.displayDelay;
    }

    public int getDisplayLimit() {
        return this.displayLimit;
    }

    public int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public void incrementDisplayQuantity() {
        ++this.displayQuantity;
    }

    public boolean isDelayTimeSatisfied() {
        long l = this.lastDisplayTime;
        boolean bl = true;
        if (l < 0L) {
            return true;
        }
        l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        long l2 = l - this.lastDisplayTime;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("OSInAppMessage lastDisplayTime: ");
        stringBuilder.append(this.lastDisplayTime);
        stringBuilder.append(" currentTimeInSeconds: ");
        stringBuilder.append(l);
        stringBuilder.append(" diffInSeconds: ");
        stringBuilder.append(l2);
        stringBuilder.append(" displayDelay: ");
        stringBuilder.append(this.displayDelay);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (l2 < this.displayDelay) {
            bl = false;
        }
        return bl;
    }

    public boolean isRedisplayEnabled() {
        return this.redisplayEnabled;
    }

    public void setDisplayDelay(long l) {
        this.displayDelay = l;
    }

    public void setDisplayLimit(int n) {
        this.displayLimit = n;
    }

    public void setDisplayQuantity(int n) {
        this.displayQuantity = n;
    }

    public void setDisplayStats(OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        this.setLastDisplayTime(oSInAppMessageRedisplayStats.getLastDisplayTime());
        this.setDisplayQuantity(oSInAppMessageRedisplayStats.getDisplayQuantity());
    }

    public void setLastDisplayTime(long l) {
        this.lastDisplayTime = l;
    }

    public boolean shouldDisplayAgain() {
        boolean bl = this.displayQuantity < this.displayLimit;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessage shouldDisplayAgain: ");
        stringBuilder.append(bl);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        return bl;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSInAppMessageDisplayStats{lastDisplayTime=");
        stringBuilder.append(this.lastDisplayTime);
        stringBuilder.append(", displayQuantity=");
        stringBuilder.append(this.displayQuantity);
        stringBuilder.append(", displayLimit=");
        stringBuilder.append(this.displayLimit);
        stringBuilder.append(", displayDelay=");
        return a.o(stringBuilder, this.displayDelay, '}');
    }
}

