/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.ParseException
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OSInAppMessage;
import com.onesignal.OSInAppMessageRedisplayStats;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignalSimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageInternal
extends OSInAppMessage {
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    @NonNull
    private Set<String> clickedClickIds;
    private double displayDuration;
    private boolean displayedInSession;
    private Date endTime;
    private boolean hasLiquid;
    public boolean isPreview;
    private OSInAppMessageRedisplayStats redisplayStats;
    private boolean triggerChanged;
    @NonNull
    public ArrayList<ArrayList<OSTrigger>> triggers;
    @NonNull
    public HashMap<String, HashMap<String, String>> variants;

    public OSInAppMessageInternal(@NonNull String string2, @NonNull Set<String> set, boolean bl, OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        super(string2);
        new OSInAppMessageRedisplayStats();
        this.triggerChanged = false;
        this.clickedClickIds = set;
        this.displayedInSession = bl;
        this.redisplayStats = oSInAppMessageRedisplayStats;
    }

    public OSInAppMessageInternal(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString(ID));
        this.redisplayStats = new OSInAppMessageRedisplayStats();
        this.displayedInSession = false;
        this.triggerChanged = false;
        this.variants = this.parseVariants(jSONObject.getJSONObject(IAM_VARIANTS));
        this.triggers = this.parseTriggerJson(jSONObject.getJSONArray(IAM_TRIGGERS));
        this.clickedClickIds = new HashSet();
        this.endTime = this.parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            this.redisplayStats = new OSInAppMessageRedisplayStats(jSONObject.getJSONObject(IAM_REDISPLAY_STATS));
        }
    }

    public OSInAppMessageInternal(boolean bl) {
        super("");
        this.redisplayStats = new OSInAppMessageRedisplayStats();
        this.displayedInSession = false;
        this.triggerChanged = false;
        this.isPreview = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Date parseEndTimeJson(JSONObject object) {
        String string2;
        try {
            string2 = object.getString(END_TIME);
        }
        catch (JSONException jSONException) {
            return null;
        }
        if (string2.equals((Object)"null")) {
            return null;
        }
        try {
            return OneSignalSimpleDateFormat.iso8601Format().parse(string2);
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
            return null;
        }
    }

    private HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(string2);
            HashMap hashMap2 = new HashMap();
            Iterator iterator2 = jSONObject2.keys();
            while (iterator2.hasNext()) {
                String string3 = (String)iterator2.next();
                hashMap2.put((Object)string3, (Object)jSONObject2.getString(string3));
            }
            hashMap.put((Object)string2, (Object)hashMap2);
        }
        return hashMap;
    }

    public void addClickId(String string2) {
        this.clickedClickIds.add((Object)string2);
    }

    public void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (OSInAppMessageInternal)object;
            return this.messageId.equals((Object)((OSInAppMessage)object).messageId);
        }
        return false;
    }

    @NonNull
    public Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    public double getDisplayDuration() {
        return this.displayDuration;
    }

    public boolean getHasLiquid() {
        return this.hasLiquid;
    }

    public OSInAppMessageRedisplayStats getRedisplayStats() {
        return this.redisplayStats;
    }

    public int hashCode() {
        return this.messageId.hashCode();
    }

    public boolean isClickAvailable(String string2) {
        return this.clickedClickIds.contains((Object)string2) ^ true;
    }

    public boolean isDisplayedInSession() {
        return this.displayedInSession;
    }

    public boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        return this.endTime.before(date);
    }

    public boolean isTriggerChanged() {
        return this.triggerChanged;
    }

    public ArrayList<ArrayList<OSTrigger>> parseTriggerJson(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); ++i) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int j = 0; j < jSONArray2.length(); ++j) {
                arrayList2.add((Object)new OSTrigger(jSONArray2.getJSONObject(j)));
            }
            arrayList.add((Object)arrayList2);
        }
        return arrayList;
    }

    public void removeClickId(String string2) {
        this.clickedClickIds.remove((Object)string2);
    }

    public void setDisplayDuration(double d) {
        this.displayDuration = d;
    }

    public void setDisplayedInSession(boolean bl) {
        this.displayedInSession = bl;
    }

    public void setHasLiquid(boolean bl) {
        this.hasLiquid = bl;
    }

    public void setRedisplayStats(int n, long l) {
        this.redisplayStats = new OSInAppMessageRedisplayStats(n, l);
    }

    public void setTriggerChanged(boolean bl) {
        this.triggerChanged = bl;
    }

    public boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    @Override
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, (Object)this.messageId);
            JSONObject jSONObject2 = new JSONObject();
            for (String string2 : this.variants.keySet()) {
                HashMap hashMap = (HashMap)this.variants.get((Object)string2);
                JSONObject jSONObject3 = new JSONObject();
                for (String string3 : hashMap.keySet()) {
                    jSONObject3.put(string3, hashMap.get((Object)string3));
                }
                jSONObject2.put(string2, (Object)jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, (Object)jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, (Object)this.redisplayStats.toJSONObject());
            Iterator iterator = new JSONArray();
            for (HashMap hashMap : this.triggers) {
                jSONObject2 = new JSONArray();
                hashMap = hashMap.iterator();
                while (hashMap.hasNext()) {
                    jSONObject2.put((Object)((OSTrigger)hashMap.next()).toJSONObject());
                }
                iterator.put((Object)jSONObject2);
            }
            jSONObject.put(IAM_TRIGGERS, (Object)iterator);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, (Object)OneSignalSimpleDateFormat.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSInAppMessage{messageId='");
        a.B(stringBuilder, this.messageId, '\'', ", variants=");
        stringBuilder.append(this.variants);
        stringBuilder.append(", triggers=");
        stringBuilder.append(this.triggers);
        stringBuilder.append(", clickedClickIds=");
        stringBuilder.append(this.clickedClickIds);
        stringBuilder.append(", redisplayStats=");
        stringBuilder.append((Object)this.redisplayStats);
        stringBuilder.append(", displayDuration=");
        stringBuilder.append(this.displayDuration);
        stringBuilder.append(", displayedInSession=");
        stringBuilder.append(this.displayedInSession);
        stringBuilder.append(", triggerChanged=");
        stringBuilder.append(this.triggerChanged);
        stringBuilder.append(", actionTaken=");
        stringBuilder.append(this.actionTaken);
        stringBuilder.append(", isPreview=");
        stringBuilder.append(this.isPreview);
        stringBuilder.append(", endTime=");
        stringBuilder.append((Object)this.endTime);
        stringBuilder.append(", hasLiquid=");
        stringBuilder.append(this.hasLiquid);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

