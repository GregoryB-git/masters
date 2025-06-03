/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.core.app.NotificationCompat$Extender
 *  com.onesignal.OSMutableNotification
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
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
import androidx.core.app.NotificationCompat;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSMutableNotification;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotification {
    private List<ActionButton> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private BackgroundImageLayout backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    @Nullable
    private List<OSNotification> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility = 1;
    private NotificationCompat.Extender notificationExtender;
    private String notificationId;
    private int priority;
    private String rawPayload;
    private long sentTime;
    private String smallIcon;
    private String smallIconAccentColor;
    private String sound;
    private String templateId;
    private String templateName;
    private String title;
    private int ttl;

    public OSNotification() {
    }

    public OSNotification(OSNotification oSNotification) {
        this.notificationExtender = oSNotification.notificationExtender;
        this.groupedNotifications = oSNotification.groupedNotifications;
        this.androidNotificationId = oSNotification.androidNotificationId;
        this.notificationId = oSNotification.notificationId;
        this.templateName = oSNotification.templateName;
        this.templateId = oSNotification.templateId;
        this.title = oSNotification.title;
        this.body = oSNotification.body;
        this.additionalData = oSNotification.additionalData;
        this.smallIcon = oSNotification.smallIcon;
        this.largeIcon = oSNotification.largeIcon;
        this.bigPicture = oSNotification.bigPicture;
        this.smallIconAccentColor = oSNotification.smallIconAccentColor;
        this.launchURL = oSNotification.launchURL;
        this.sound = oSNotification.sound;
        this.ledColor = oSNotification.ledColor;
        this.lockScreenVisibility = oSNotification.lockScreenVisibility;
        this.groupKey = oSNotification.groupKey;
        this.groupMessage = oSNotification.groupMessage;
        this.actionButtons = oSNotification.actionButtons;
        this.fromProjectNumber = oSNotification.fromProjectNumber;
        this.backgroundImageLayout = oSNotification.backgroundImageLayout;
        this.collapseId = oSNotification.collapseId;
        this.priority = oSNotification.priority;
        this.rawPayload = oSNotification.rawPayload;
        this.sentTime = oSNotification.sentTime;
        this.ttl = oSNotification.ttl;
    }

    public OSNotification(@Nullable List<OSNotification> list, @NonNull JSONObject jSONObject, int n) {
        this.initPayloadData(jSONObject);
        this.groupedNotifications = list;
        this.androidNotificationId = n;
    }

    public OSNotification(@NonNull JSONObject jSONObject) {
        this(null, jSONObject, 0);
    }

    private void initPayloadData(JSONObject jSONObject) {
        Object object;
        try {
            object = NotificationBundleProcessor.getCustomJSONObject(jSONObject);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", throwable);
            return;
        }
        long l = OneSignal.getTime().getCurrentTimeMillis();
        if (jSONObject.has("google.ttl")) {
            this.sentTime = jSONObject.optLong("google.sent_time", l) / 1000L;
            this.ttl = jSONObject.optInt("google.ttl", 259200);
        } else if (jSONObject.has("hms.ttl")) {
            this.sentTime = jSONObject.optLong("hms.sent_time", l) / 1000L;
            this.ttl = jSONObject.optInt("hms.ttl", 259200);
        } else {
            this.sentTime = l / 1000L;
            this.ttl = 259200;
        }
        this.notificationId = object.optString("i");
        this.templateId = object.optString("ti");
        this.templateName = object.optString("tn");
        this.rawPayload = jSONObject.toString();
        this.additionalData = object.optJSONObject("a");
        this.launchURL = object.optString("u", null);
        this.body = jSONObject.optString("alert", null);
        this.title = jSONObject.optString("title", null);
        this.smallIcon = jSONObject.optString("sicon", null);
        this.bigPicture = jSONObject.optString("bicon", null);
        this.largeIcon = jSONObject.optString("licon", null);
        this.sound = jSONObject.optString("sound", null);
        this.groupKey = jSONObject.optString("grp", null);
        this.groupMessage = jSONObject.optString("grp_msg", null);
        this.smallIconAccentColor = jSONObject.optString("bgac", null);
        this.ledColor = jSONObject.optString("ledc", null);
        object = jSONObject.optString("vis", null);
        if (object != null) {
            this.lockScreenVisibility = Integer.parseInt((String)object);
        }
        this.fromProjectNumber = jSONObject.optString("from", null);
        this.priority = jSONObject.optInt("pri", 0);
        object = jSONObject.optString("collapse_key", null);
        if (!"do_not_collapse".equals(object)) {
            this.collapseId = object;
        }
        try {
            this.setActionButtons();
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", throwable);
        }
        try {
            this.setBackgroundImageLayout(jSONObject);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", throwable);
        }
    }

    private void setActionButtons() throws Throwable {
        JSONObject jSONObject = this.additionalData;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            jSONObject = this.additionalData.getJSONArray("actionButtons");
            this.actionButtons = new ArrayList();
            for (int i = 0; i < jSONObject.length(); ++i) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(i);
                ActionButton actionButton = new ActionButton();
                ActionButton.access$002(actionButton, jSONObject2.optString("id", null));
                ActionButton.access$102(actionButton, jSONObject2.optString("text", null));
                ActionButton.access$202(actionButton, jSONObject2.optString("icon", null));
                this.actionButtons.add((Object)actionButton);
            }
            this.additionalData.remove("actionId");
            this.additionalData.remove("actionButtons");
        }
    }

    private void setBackgroundImageLayout(JSONObject object) throws Throwable {
        if ((object = object.optString("bg_img", null)) != null) {
            BackgroundImageLayout backgroundImageLayout;
            object = new JSONObject((String)object);
            this.backgroundImageLayout = backgroundImageLayout = new BackgroundImageLayout();
            BackgroundImageLayout.access$302(backgroundImageLayout, object.optString("img"));
            BackgroundImageLayout.access$402(this.backgroundImageLayout, object.optString("tc"));
            BackgroundImageLayout.access$502(this.backgroundImageLayout, object.optString("bc"));
        }
    }

    private void setSentTime(long l) {
        this.sentTime = l;
    }

    private void setTtl(int n) {
        this.ttl = n;
    }

    public OSNotification copy() {
        return new OSNotificationBuilder().setNotificationExtender(this.notificationExtender).setGroupedNotifications(this.groupedNotifications).setAndroidNotificationId(this.androidNotificationId).setNotificationId(this.notificationId).setTemplateName(this.templateName).setTemplateId(this.templateId).setTitle(this.title).setBody(this.body).setAdditionalData(this.additionalData).setSmallIcon(this.smallIcon).setLargeIcon(this.largeIcon).setBigPicture(this.bigPicture).setSmallIconAccentColor(this.smallIconAccentColor).setLaunchURL(this.launchURL).setSound(this.sound).setLedColor(this.ledColor).setLockScreenVisibility(this.lockScreenVisibility).setGroupKey(this.groupKey).setGroupMessage(this.groupMessage).setActionButtons(this.actionButtons).setFromProjectNumber(this.fromProjectNumber).setBackgroundImageLayout(this.backgroundImageLayout).setCollapseId(this.collapseId).setPriority(this.priority).setRawPayload(this.rawPayload).setSenttime(this.sentTime).setTTL(this.ttl).build();
    }

    public List<ActionButton> getActionButtons() {
        return this.actionButtons;
    }

    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    public BackgroundImageLayout getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    public String getBigPicture() {
        return this.bigPicture;
    }

    public String getBody() {
        return this.body;
    }

    public String getCollapseId() {
        return this.collapseId;
    }

    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    public String getGroupKey() {
        return this.groupKey;
    }

    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Nullable
    public List<OSNotification> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    public String getLargeIcon() {
        return this.largeIcon;
    }

    public String getLaunchURL() {
        return this.launchURL;
    }

    public String getLedColor() {
        return this.ledColor;
    }

    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public NotificationCompat.Extender getNotificationExtender() {
        return this.notificationExtender;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getRawPayload() {
        return this.rawPayload;
    }

    public long getSentTime() {
        return this.sentTime;
    }

    public String getSmallIcon() {
        return this.smallIcon;
    }

    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    public String getSound() {
        return this.sound;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTtl() {
        return this.ttl;
    }

    public boolean hasNotificationId() {
        boolean bl = this.androidNotificationId != 0;
        return bl;
    }

    public OSMutableNotification mutableCopy() {
        return new OSMutableNotification(this);
    }

    public void setActionButtons(List<ActionButton> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int n) {
        this.androidNotificationId = n;
    }

    public void setBackgroundImageLayout(BackgroundImageLayout backgroundImageLayout) {
        this.backgroundImageLayout = backgroundImageLayout;
    }

    public void setBigPicture(String string2) {
        this.bigPicture = string2;
    }

    public void setBody(String string2) {
        this.body = string2;
    }

    public void setCollapseId(String string2) {
        this.collapseId = string2;
    }

    public void setFromProjectNumber(String string2) {
        this.fromProjectNumber = string2;
    }

    public void setGroupKey(String string2) {
        this.groupKey = string2;
    }

    public void setGroupMessage(String string2) {
        this.groupMessage = string2;
    }

    public void setGroupedNotifications(@Nullable List<OSNotification> list) {
        this.groupedNotifications = list;
    }

    public void setLargeIcon(String string2) {
        this.largeIcon = string2;
    }

    public void setLaunchURL(String string2) {
        this.launchURL = string2;
    }

    public void setLedColor(String string2) {
        this.ledColor = string2;
    }

    public void setLockScreenVisibility(int n) {
        this.lockScreenVisibility = n;
    }

    public void setNotificationExtender(NotificationCompat.Extender extender) {
        this.notificationExtender = extender;
    }

    public void setNotificationId(String string2) {
        this.notificationId = string2;
    }

    public void setPriority(int n) {
        this.priority = n;
    }

    public void setRawPayload(String string2) {
        this.rawPayload = string2;
    }

    public void setSmallIcon(String string2) {
        this.smallIcon = string2;
    }

    public void setSmallIconAccentColor(String string2) {
        this.smallIconAccentColor = string2;
    }

    public void setSound(String string2) {
        this.sound = string2;
    }

    public void setTemplateId(String string2) {
        this.templateId = string2;
    }

    public void setTemplateName(String string2) {
        this.templateName = string2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", this.androidNotificationId);
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = this.groupedNotifications;
            if (iterator != null) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    jSONArray.put((Object)((OSNotification)iterator.next()).toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", (Object)jSONArray);
            jSONObject.put("notificationId", (Object)this.notificationId);
            jSONObject.put("templateName", (Object)this.templateName);
            jSONObject.put("templateId", (Object)this.templateId);
            jSONObject.put("title", (Object)this.title);
            jSONObject.put("body", (Object)this.body);
            jSONObject.put("smallIcon", (Object)this.smallIcon);
            jSONObject.put("largeIcon", (Object)this.largeIcon);
            jSONObject.put("bigPicture", (Object)this.bigPicture);
            jSONObject.put("smallIconAccentColor", (Object)this.smallIconAccentColor);
            jSONObject.put("launchURL", (Object)this.launchURL);
            jSONObject.put("sound", (Object)this.sound);
            jSONObject.put("ledColor", (Object)this.ledColor);
            jSONObject.put("lockScreenVisibility", this.lockScreenVisibility);
            jSONObject.put("groupKey", (Object)this.groupKey);
            jSONObject.put("groupMessage", (Object)this.groupMessage);
            jSONObject.put("fromProjectNumber", (Object)this.fromProjectNumber);
            jSONObject.put("collapseId", (Object)this.collapseId);
            jSONObject.put("priority", this.priority);
            jSONArray = this.additionalData;
            if (jSONArray != null) {
                jSONObject.put("additionalData", (Object)jSONArray);
            }
            if (this.actionButtons != null) {
                iterator = new JSONArray();
                jSONArray = this.actionButtons.iterator();
                while (jSONArray.hasNext()) {
                    iterator.put((Object)((ActionButton)jSONArray.next()).toJSONObject());
                }
                jSONObject.put("actionButtons", (Object)iterator);
            }
            jSONObject.put("rawPayload", (Object)this.rawPayload);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSNotification{notificationExtender=");
        stringBuilder.append((Object)this.notificationExtender);
        stringBuilder.append(", groupedNotifications=");
        stringBuilder.append(this.groupedNotifications);
        stringBuilder.append(", androidNotificationId=");
        stringBuilder.append(this.androidNotificationId);
        stringBuilder.append(", notificationId='");
        a.B(stringBuilder, this.notificationId, '\'', ", templateName='");
        a.B(stringBuilder, this.templateName, '\'', ", templateId='");
        a.B(stringBuilder, this.templateId, '\'', ", title='");
        a.B(stringBuilder, this.title, '\'', ", body='");
        a.B(stringBuilder, this.body, '\'', ", additionalData=");
        stringBuilder.append((Object)this.additionalData);
        stringBuilder.append(", smallIcon='");
        a.B(stringBuilder, this.smallIcon, '\'', ", largeIcon='");
        a.B(stringBuilder, this.largeIcon, '\'', ", bigPicture='");
        a.B(stringBuilder, this.bigPicture, '\'', ", smallIconAccentColor='");
        a.B(stringBuilder, this.smallIconAccentColor, '\'', ", launchURL='");
        a.B(stringBuilder, this.launchURL, '\'', ", sound='");
        a.B(stringBuilder, this.sound, '\'', ", ledColor='");
        a.B(stringBuilder, this.ledColor, '\'', ", lockScreenVisibility=");
        stringBuilder.append(this.lockScreenVisibility);
        stringBuilder.append(", groupKey='");
        a.B(stringBuilder, this.groupKey, '\'', ", groupMessage='");
        a.B(stringBuilder, this.groupMessage, '\'', ", actionButtons=");
        stringBuilder.append(this.actionButtons);
        stringBuilder.append(", fromProjectNumber='");
        a.B(stringBuilder, this.fromProjectNumber, '\'', ", backgroundImageLayout=");
        stringBuilder.append((Object)this.backgroundImageLayout);
        stringBuilder.append(", collapseId='");
        a.B(stringBuilder, this.collapseId, '\'', ", priority=");
        stringBuilder.append(this.priority);
        stringBuilder.append(", rawPayload='");
        stringBuilder.append(this.rawPayload);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class ActionButton {
        private String icon;
        private String id;
        private String text;

        public ActionButton() {
        }

        public ActionButton(String string2, String string3, String string4) {
            this.id = string2;
            this.text = string3;
            this.icon = string4;
        }

        public ActionButton(JSONObject jSONObject) {
            this.id = jSONObject.optString("id");
            this.text = jSONObject.optString("text");
            this.icon = jSONObject.optString("icon");
        }

        public static /* synthetic */ String access$002(ActionButton actionButton, String string2) {
            actionButton.id = string2;
            return string2;
        }

        public static /* synthetic */ String access$102(ActionButton actionButton, String string2) {
            actionButton.text = string2;
            return string2;
        }

        public static /* synthetic */ String access$202(ActionButton actionButton, String string2) {
            actionButton.icon = string2;
            return string2;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", (Object)this.id);
                jSONObject.put("text", (Object)this.text);
                jSONObject.put("icon", (Object)this.icon);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            return jSONObject;
        }
    }

    public static class BackgroundImageLayout {
        private String bodyTextColor;
        private String image;
        private String titleTextColor;

        public static /* synthetic */ String access$302(BackgroundImageLayout backgroundImageLayout, String string2) {
            backgroundImageLayout.image = string2;
            return string2;
        }

        public static /* synthetic */ String access$402(BackgroundImageLayout backgroundImageLayout, String string2) {
            backgroundImageLayout.titleTextColor = string2;
            return string2;
        }

        public static /* synthetic */ String access$502(BackgroundImageLayout backgroundImageLayout, String string2) {
            backgroundImageLayout.bodyTextColor = string2;
            return string2;
        }

        public String getBodyTextColor() {
            return this.bodyTextColor;
        }

        public String getImage() {
            return this.image;
        }

        public String getTitleTextColor() {
            return this.titleTextColor;
        }
    }

    public static class OSNotificationBuilder {
        private List<ActionButton> actionButtons;
        private JSONObject additionalData;
        private int androidNotificationId;
        private BackgroundImageLayout backgroundImageLayout;
        private String bigPicture;
        private String body;
        private String collapseId;
        private String fromProjectNumber;
        private String groupKey;
        private String groupMessage;
        private List<OSNotification> groupedNotifications;
        private String largeIcon;
        private String launchURL;
        private String ledColor;
        private int lockScreenVisibility = 1;
        private NotificationCompat.Extender notificationExtender;
        private String notificationId;
        private int priority;
        private String rawPayload;
        private long sentTime;
        private String smallIcon;
        private String smallIconAccentColor;
        private String sound;
        private String templateId;
        private String templateName;
        private String title;
        private int ttl;

        public OSNotification build() {
            OSNotification oSNotification = new OSNotification();
            oSNotification.setNotificationExtender(this.notificationExtender);
            oSNotification.setGroupedNotifications(this.groupedNotifications);
            oSNotification.setAndroidNotificationId(this.androidNotificationId);
            oSNotification.setNotificationId(this.notificationId);
            oSNotification.setTemplateName(this.templateName);
            oSNotification.setTemplateId(this.templateId);
            oSNotification.setTitle(this.title);
            oSNotification.setBody(this.body);
            oSNotification.setAdditionalData(this.additionalData);
            oSNotification.setSmallIcon(this.smallIcon);
            oSNotification.setLargeIcon(this.largeIcon);
            oSNotification.setBigPicture(this.bigPicture);
            oSNotification.setSmallIconAccentColor(this.smallIconAccentColor);
            oSNotification.setLaunchURL(this.launchURL);
            oSNotification.setSound(this.sound);
            oSNotification.setLedColor(this.ledColor);
            oSNotification.setLockScreenVisibility(this.lockScreenVisibility);
            oSNotification.setGroupKey(this.groupKey);
            oSNotification.setGroupMessage(this.groupMessage);
            oSNotification.setActionButtons(this.actionButtons);
            oSNotification.setFromProjectNumber(this.fromProjectNumber);
            oSNotification.setBackgroundImageLayout(this.backgroundImageLayout);
            oSNotification.setCollapseId(this.collapseId);
            oSNotification.setPriority(this.priority);
            oSNotification.setRawPayload(this.rawPayload);
            oSNotification.setSentTime(this.sentTime);
            oSNotification.setTtl(this.ttl);
            return oSNotification;
        }

        public OSNotificationBuilder setActionButtons(List<ActionButton> list) {
            this.actionButtons = list;
            return this;
        }

        public OSNotificationBuilder setAdditionalData(JSONObject jSONObject) {
            this.additionalData = jSONObject;
            return this;
        }

        public OSNotificationBuilder setAndroidNotificationId(int n) {
            this.androidNotificationId = n;
            return this;
        }

        public OSNotificationBuilder setBackgroundImageLayout(BackgroundImageLayout backgroundImageLayout) {
            this.backgroundImageLayout = backgroundImageLayout;
            return this;
        }

        public OSNotificationBuilder setBigPicture(String string2) {
            this.bigPicture = string2;
            return this;
        }

        public OSNotificationBuilder setBody(String string2) {
            this.body = string2;
            return this;
        }

        public OSNotificationBuilder setCollapseId(String string2) {
            this.collapseId = string2;
            return this;
        }

        public OSNotificationBuilder setFromProjectNumber(String string2) {
            this.fromProjectNumber = string2;
            return this;
        }

        public OSNotificationBuilder setGroupKey(String string2) {
            this.groupKey = string2;
            return this;
        }

        public OSNotificationBuilder setGroupMessage(String string2) {
            this.groupMessage = string2;
            return this;
        }

        public OSNotificationBuilder setGroupedNotifications(List<OSNotification> list) {
            this.groupedNotifications = list;
            return this;
        }

        public OSNotificationBuilder setLargeIcon(String string2) {
            this.largeIcon = string2;
            return this;
        }

        public OSNotificationBuilder setLaunchURL(String string2) {
            this.launchURL = string2;
            return this;
        }

        public OSNotificationBuilder setLedColor(String string2) {
            this.ledColor = string2;
            return this;
        }

        public OSNotificationBuilder setLockScreenVisibility(int n) {
            this.lockScreenVisibility = n;
            return this;
        }

        public OSNotificationBuilder setNotificationExtender(NotificationCompat.Extender extender) {
            this.notificationExtender = extender;
            return this;
        }

        public OSNotificationBuilder setNotificationId(String string2) {
            this.notificationId = string2;
            return this;
        }

        public OSNotificationBuilder setPriority(int n) {
            this.priority = n;
            return this;
        }

        public OSNotificationBuilder setRawPayload(String string2) {
            this.rawPayload = string2;
            return this;
        }

        public OSNotificationBuilder setSenttime(long l) {
            this.sentTime = l;
            return this;
        }

        public OSNotificationBuilder setSmallIcon(String string2) {
            this.smallIcon = string2;
            return this;
        }

        public OSNotificationBuilder setSmallIconAccentColor(String string2) {
            this.smallIconAccentColor = string2;
            return this;
        }

        public OSNotificationBuilder setSound(String string2) {
            this.sound = string2;
            return this;
        }

        public OSNotificationBuilder setTTL(int n) {
            this.ttl = n;
            return this;
        }

        public OSNotificationBuilder setTemplateId(String string2) {
            this.templateId = string2;
            return this;
        }

        public OSNotificationBuilder setTemplateName(String string2) {
            this.templateName = string2;
            return this;
        }

        public OSNotificationBuilder setTitle(String string2) {
            this.title = string2;
            return this;
        }
    }
}

