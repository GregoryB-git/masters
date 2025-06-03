/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.OSInAppMessageLocationPrompt
 *  com.onesignal.OSInAppMessagePushPrompt
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSInAppMessageLocationPrompt;
import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSInAppMessagePrompt;
import com.onesignal.OSInAppMessagePushPrompt;
import com.onesignal.OSInAppMessageTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageAction {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PAGE_ID = "pageId";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    @NonNull
    private String clickId;
    @Nullable
    private String clickName;
    @Nullable
    private String clickUrl;
    private boolean closesMessage;
    private boolean firstClick;
    @NonNull
    private List<OSInAppMessageOutcome> outcomes = new ArrayList();
    @Nullable
    private String pageId;
    @NonNull
    private List<OSInAppMessagePrompt> prompts = new ArrayList();
    private OSInAppMessageTag tags;
    @Nullable
    private OSInAppMessageActionUrlType urlTarget;

    public OSInAppMessageAction(@NonNull JSONObject jSONObject) throws JSONException {
        OSInAppMessageActionUrlType oSInAppMessageActionUrlType;
        this.clickId = jSONObject.optString(ID, null);
        this.clickName = jSONObject.optString(NAME, null);
        this.clickUrl = jSONObject.optString(URL, null);
        this.pageId = jSONObject.optString(PAGE_ID, null);
        this.urlTarget = oSInAppMessageActionUrlType = OSInAppMessageActionUrlType.fromString(jSONObject.optString(URL_TARGET, null));
        if (oSInAppMessageActionUrlType == null) {
            this.urlTarget = OSInAppMessageActionUrlType.IN_APP_WEBVIEW;
        }
        this.closesMessage = jSONObject.optBoolean(CLOSE, true);
        if (jSONObject.has(OUTCOMES)) {
            this.parseOutcomes(jSONObject);
        }
        if (jSONObject.has(TAGS)) {
            this.tags = new OSInAppMessageTag(jSONObject.getJSONObject(TAGS));
        }
        if (jSONObject.has(PROMPTS)) {
            this.parsePrompts(jSONObject);
        }
    }

    private void parseOutcomes(JSONObject jSONObject) throws JSONException {
        jSONObject = jSONObject.getJSONArray(OUTCOMES);
        for (int i = 0; i < jSONObject.length(); ++i) {
            this.outcomes.add((Object)new OSInAppMessageOutcome((JSONObject)jSONObject.get(i)));
        }
    }

    private void parsePrompts(JSONObject jSONObject) throws JSONException {
        jSONObject = jSONObject.getJSONArray(PROMPTS);
        for (int i = 0; i < jSONObject.length(); ++i) {
            String string2 = jSONObject.getString(i);
            string2.getClass();
            if (!string2.equals((Object)"push")) {
                if (!string2.equals((Object)"location")) continue;
                this.prompts.add((Object)new OSInAppMessageLocationPrompt());
                continue;
            }
            this.prompts.add((Object)new OSInAppMessagePushPrompt());
        }
    }

    public boolean doesCloseMessage() {
        return this.closesMessage;
    }

    @NonNull
    public String getClickId() {
        return this.clickId;
    }

    @Nullable
    public String getClickName() {
        return this.clickName;
    }

    @Nullable
    public String getClickUrl() {
        return this.clickUrl;
    }

    @NonNull
    public List<OSInAppMessageOutcome> getOutcomes() {
        return this.outcomes;
    }

    public String getPageId() {
        return this.pageId;
    }

    @NonNull
    public List<OSInAppMessagePrompt> getPrompts() {
        return this.prompts;
    }

    public OSInAppMessageTag getTags() {
        return this.tags;
    }

    @Nullable
    public OSInAppMessageActionUrlType getUrlTarget() {
        return this.urlTarget;
    }

    public boolean isFirstClick() {
        return this.firstClick;
    }

    public void setFirstClick(boolean bl) {
        this.firstClick = bl;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        block4: {
            jSONObject = new JSONObject();
            jSONObject.put(CLICK_NAME, (Object)this.clickName);
            jSONObject.put(CLICK_URL, (Object)this.clickUrl);
            jSONObject.put(FIRST_CLICK, this.firstClick);
            jSONObject.put(CLOSES_MESSAGE, this.closesMessage);
            Object object = new JSONArray();
            Iterator iterator = this.outcomes.iterator();
            while (iterator.hasNext()) {
                object.put((Object)((OSInAppMessageOutcome)iterator.next()).toJSONObject());
            }
            jSONObject.put(OUTCOMES, object);
            object = this.tags;
            if (object == null) break block4;
            try {
                jSONObject.put(TAGS, (Object)((OSInAppMessageTag)object).toJSONObject());
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static final class OSInAppMessageActionUrlType
    extends Enum<OSInAppMessageActionUrlType> {
        private static final OSInAppMessageActionUrlType[] $VALUES;
        public static final /* enum */ OSInAppMessageActionUrlType BROWSER;
        public static final /* enum */ OSInAppMessageActionUrlType IN_APP_WEBVIEW;
        public static final /* enum */ OSInAppMessageActionUrlType REPLACE_CONTENT;
        private String text;

        static {
            OSInAppMessageActionUrlType oSInAppMessageActionUrlType;
            OSInAppMessageActionUrlType oSInAppMessageActionUrlType2;
            OSInAppMessageActionUrlType oSInAppMessageActionUrlType3;
            IN_APP_WEBVIEW = oSInAppMessageActionUrlType3 = new OSInAppMessageActionUrlType("webview");
            BROWSER = oSInAppMessageActionUrlType2 = new OSInAppMessageActionUrlType("browser");
            REPLACE_CONTENT = oSInAppMessageActionUrlType = new OSInAppMessageActionUrlType("replacement");
            $VALUES = new OSInAppMessageActionUrlType[]{oSInAppMessageActionUrlType3, oSInAppMessageActionUrlType2, oSInAppMessageActionUrlType};
        }

        private OSInAppMessageActionUrlType(String string3) {
            this.text = string3;
        }

        public static OSInAppMessageActionUrlType fromString(String string2) {
            for (OSInAppMessageActionUrlType oSInAppMessageActionUrlType : OSInAppMessageActionUrlType.values()) {
                if (!oSInAppMessageActionUrlType.text.equalsIgnoreCase(string2)) continue;
                return oSInAppMessageActionUrlType;
            }
            return null;
        }

        public static OSInAppMessageActionUrlType valueOf(String string2) {
            return (OSInAppMessageActionUrlType)Enum.valueOf(OSInAppMessageActionUrlType.class, (String)string2);
        }

        public static OSInAppMessageActionUrlType[] values() {
            return (OSInAppMessageActionUrlType[])$VALUES.clone();
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url_type", (Object)this.text);
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            return jSONObject;
        }

        public String toString() {
            return this.text;
        }
    }
}

