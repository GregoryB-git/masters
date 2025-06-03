/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

class OSTrigger {
    @NonNull
    public OSTriggerKind kind;
    @NonNull
    public OSTriggerOperator operatorType;
    @Nullable
    public String property;
    @NonNull
    public String triggerId;
    @Nullable
    public Object value;

    public OSTrigger(JSONObject jSONObject) throws JSONException {
        this.triggerId = jSONObject.getString("id");
        this.kind = OSTriggerKind.fromString(jSONObject.getString("kind"));
        this.property = jSONObject.optString("property", null);
        this.operatorType = OSTriggerOperator.fromString(jSONObject.getString("operator"));
        this.value = jSONObject.opt("value");
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", (Object)this.triggerId);
            jSONObject.put("kind", (Object)this.kind);
            jSONObject.put("property", (Object)this.property);
            jSONObject.put("operator", (Object)this.operatorType.toString());
            jSONObject.put("value", this.value);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSTrigger{triggerId='");
        a.B(stringBuilder, this.triggerId, '\'', ", kind=");
        stringBuilder.append((Object)this.kind);
        stringBuilder.append(", property='");
        a.B(stringBuilder, this.property, '\'', ", operatorType=");
        stringBuilder.append((Object)this.operatorType);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class OSTriggerKind
    extends Enum<OSTriggerKind> {
        private static final OSTriggerKind[] $VALUES;
        public static final /* enum */ OSTriggerKind CUSTOM;
        public static final /* enum */ OSTriggerKind SESSION_TIME;
        public static final /* enum */ OSTriggerKind TIME_SINCE_LAST_IN_APP;
        public static final /* enum */ OSTriggerKind UNKNOWN;
        private String value;

        static {
            OSTriggerKind oSTriggerKind;
            OSTriggerKind oSTriggerKind2;
            OSTriggerKind oSTriggerKind3;
            OSTriggerKind oSTriggerKind4;
            TIME_SINCE_LAST_IN_APP = oSTriggerKind4 = new OSTriggerKind("min_time_since");
            SESSION_TIME = oSTriggerKind3 = new OSTriggerKind("session_time");
            CUSTOM = oSTriggerKind2 = new OSTriggerKind("custom");
            UNKNOWN = oSTriggerKind = new OSTriggerKind("unknown");
            $VALUES = new OSTriggerKind[]{oSTriggerKind4, oSTriggerKind3, oSTriggerKind2, oSTriggerKind};
        }

        private OSTriggerKind(String string3) {
            this.value = string3;
        }

        @NonNull
        public static OSTriggerKind fromString(String string2) {
            for (OSTriggerKind oSTriggerKind : OSTriggerKind.values()) {
                if (!oSTriggerKind.value.equalsIgnoreCase(string2)) continue;
                return oSTriggerKind;
            }
            return UNKNOWN;
        }

        public static OSTriggerKind valueOf(String string2) {
            return (OSTriggerKind)Enum.valueOf(OSTriggerKind.class, (String)string2);
        }

        public static OSTriggerKind[] values() {
            return (OSTriggerKind[])$VALUES.clone();
        }

        public String toString() {
            return this.value;
        }
    }

    public static final class OSTriggerOperator
    extends Enum<OSTriggerOperator> {
        private static final OSTriggerOperator[] $VALUES;
        public static final /* enum */ OSTriggerOperator CONTAINS;
        public static final /* enum */ OSTriggerOperator EQUAL_TO;
        public static final /* enum */ OSTriggerOperator EXISTS;
        public static final /* enum */ OSTriggerOperator GREATER_THAN;
        public static final /* enum */ OSTriggerOperator GREATER_THAN_OR_EQUAL_TO;
        public static final /* enum */ OSTriggerOperator LESS_THAN;
        public static final /* enum */ OSTriggerOperator LESS_THAN_OR_EQUAL_TO;
        public static final /* enum */ OSTriggerOperator NOT_EQUAL_TO;
        public static final /* enum */ OSTriggerOperator NOT_EXISTS;
        private String text;

        static {
            OSTriggerOperator oSTriggerOperator;
            OSTriggerOperator oSTriggerOperator2;
            OSTriggerOperator oSTriggerOperator3;
            OSTriggerOperator oSTriggerOperator4;
            OSTriggerOperator oSTriggerOperator5;
            OSTriggerOperator oSTriggerOperator6;
            OSTriggerOperator oSTriggerOperator7;
            OSTriggerOperator oSTriggerOperator8;
            OSTriggerOperator oSTriggerOperator9;
            GREATER_THAN = oSTriggerOperator9 = new OSTriggerOperator("greater");
            LESS_THAN = oSTriggerOperator8 = new OSTriggerOperator("less");
            EQUAL_TO = oSTriggerOperator7 = new OSTriggerOperator("equal");
            NOT_EQUAL_TO = oSTriggerOperator6 = new OSTriggerOperator("not_equal");
            LESS_THAN_OR_EQUAL_TO = oSTriggerOperator5 = new OSTriggerOperator("less_or_equal");
            GREATER_THAN_OR_EQUAL_TO = oSTriggerOperator4 = new OSTriggerOperator("greater_or_equal");
            EXISTS = oSTriggerOperator3 = new OSTriggerOperator("exists");
            NOT_EXISTS = oSTriggerOperator2 = new OSTriggerOperator("not_exists");
            CONTAINS = oSTriggerOperator = new OSTriggerOperator("in");
            $VALUES = new OSTriggerOperator[]{oSTriggerOperator9, oSTriggerOperator8, oSTriggerOperator7, oSTriggerOperator6, oSTriggerOperator5, oSTriggerOperator4, oSTriggerOperator3, oSTriggerOperator2, oSTriggerOperator};
        }

        private OSTriggerOperator(String string3) {
            this.text = string3;
        }

        @NonNull
        public static OSTriggerOperator fromString(String string2) {
            for (OSTriggerOperator oSTriggerOperator : OSTriggerOperator.values()) {
                if (!oSTriggerOperator.text.equalsIgnoreCase(string2)) continue;
                return oSTriggerOperator;
            }
            return EQUAL_TO;
        }

        public static OSTriggerOperator valueOf(String string2) {
            return (OSTriggerOperator)Enum.valueOf(OSTriggerOperator.class, (String)string2);
        }

        public static OSTriggerOperator[] values() {
            return (OSTriggerOperator[])$VALUES.clone();
        }

        public boolean checksEquality() {
            boolean bl = this == EQUAL_TO || this == NOT_EQUAL_TO;
            return bl;
        }

        public String toString() {
            return this.text;
        }
    }
}

