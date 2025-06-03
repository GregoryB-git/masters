/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.onesignal.OSInAppMessageInternal
 *  com.onesignal.OSInAppMessageRepository$2
 *  com.onesignal.OSInAppMessageRepository$4
 *  com.onesignal.OSInAppMessageRepository$6
 *  com.onesignal.OSInAppMessageRepository$7
 *  com.onesignal.OSInAppMessageRepository$8
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.onesignal.OSInAppMessageInternal;
import com.onesignal.OSInAppMessageRedisplayStats;
import com.onesignal.OSInAppMessageRepository;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageRepository {
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000L;
    public static final String IAM_DATA_RESPONSE_RETRY_KEY = "retry";
    private final OneSignalDbHelper dbHelper;
    private int htmlNetworkRequestAttemptCount = 0;
    private final OSLogger logger;
    private final OSSharedPreferences sharedPreferences;

    public OSInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences) {
        this.dbHelper = oneSignalDbHelper;
        this.logger = oSLogger;
        this.sharedPreferences = oSSharedPreferences;
    }

    public static /* synthetic */ void access$000(OSInAppMessageRepository oSInAppMessageRepository, String string2, String string3) {
        oSInAppMessageRepository.printHttpSuccessForInAppMessageRequest(string2, string3);
    }

    public static /* synthetic */ void access$100(OSInAppMessageRepository oSInAppMessageRepository, Set set) {
        oSInAppMessageRepository.saveClickedMessagesId((Set<String>)set);
    }

    public static /* synthetic */ void access$200(OSInAppMessageRepository oSInAppMessageRepository, String string2, int n, String string3) {
        oSInAppMessageRepository.printHttpErrorForInAppMessageRequest(string2, n, string3);
    }

    public static /* synthetic */ void access$300(OSInAppMessageRepository oSInAppMessageRepository, Set set) {
        oSInAppMessageRepository.saveImpressionedMessages((Set<String>)set);
    }

    public static /* synthetic */ int access$400(OSInAppMessageRepository oSInAppMessageRepository) {
        return oSInAppMessageRepository.htmlNetworkRequestAttemptCount;
    }

    public static /* synthetic */ int access$402(OSInAppMessageRepository oSInAppMessageRepository, int n) {
        oSInAppMessageRepository.htmlNetworkRequestAttemptCount = n;
        return n;
    }

    public static /* synthetic */ int access$408(OSInAppMessageRepository oSInAppMessageRepository) {
        int n = oSInAppMessageRepository.htmlNetworkRequestAttemptCount;
        oSInAppMessageRepository.htmlNetworkRequestAttemptCount = n + 1;
        return n;
    }

    private void cleanInAppMessageClickedClickIds(Set<String> set) {
        String string2;
        Set set2;
        if (set != null && set.size() > 0 && (set2 = OneSignalPrefs.getStringSet((String)(string2 = OneSignalPrefs.PREFS_ONESIGNAL), (String)"PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) != null && set2.size() > 0) {
            set2.removeAll(set);
            OneSignalPrefs.saveStringSet((String)string2, (String)"PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set)set2);
        }
    }

    private void cleanInAppMessageIds(Set<String> set) {
        if (set != null && set.size() > 0) {
            String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
            Set set2 = OneSignalPrefs.getStringSet((String)string2, (String)"PREFS_OS_DISPLAYED_IAMS", null);
            Set set3 = OneSignalPrefs.getStringSet((String)string2, (String)"PREFS_OS_IMPRESSIONED_IAMS", null);
            if (set2 != null && set2.size() > 0) {
                set2.removeAll(set);
                OneSignalPrefs.saveStringSet((String)string2, (String)"PREFS_OS_DISPLAYED_IAMS", (Set)set2);
            }
            if (set3 != null && set3.size() > 0) {
                set3.removeAll(set);
                OneSignalPrefs.saveStringSet((String)string2, (String)"PREFS_OS_IMPRESSIONED_IAMS", (Set)set3);
            }
        }
    }

    @Nullable
    private String htmlPathForMessage(String string2, String object, String string3) {
        if (object == null) {
            object = this.logger;
            string3 = new StringBuilder();
            string3.append("Unable to find a variant for in-app message ");
            string3.append(string2);
            object.error(string3.toString());
            return null;
        }
        string2 = a.t("in_app_messages/", string2, "/variants/", (String)object, "/html?app_id=");
        string2.append(string3);
        return string2.toString();
    }

    private void printHttpErrorForInAppMessageRequest(String string2, int n, String string3) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encountered a ");
        stringBuilder.append(n);
        stringBuilder.append(" error while attempting in-app message ");
        stringBuilder.append(string2);
        stringBuilder.append(" request: ");
        stringBuilder.append(string3);
        oSLogger.error(stringBuilder.toString());
    }

    private void printHttpSuccessForInAppMessageRequest(String string2, String string3) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Successful post for in-app message ");
        stringBuilder.append(string2);
        stringBuilder.append(" request: ");
        stringBuilder.append(string3);
        oSLogger.debug(stringBuilder.toString());
    }

    private void saveClickedMessagesId(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    private void saveImpressionedMessages(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    public void cleanCachedInAppMessages() {
        OSInAppMessageRepository oSInAppMessageRepository = this;
        synchronized (oSInAppMessageRepository) {
            Throwable throwable2;
            Cursor cursor;
            block17: {
                Set set;
                Set set2;
                String[] stringArray;
                block18: {
                    Cursor cursor2;
                    Cursor cursor3;
                    block15: {
                        block19: {
                            block16: {
                                boolean bl;
                                long l = System.currentTimeMillis() / 1000L;
                                stringArray = new String[]{String.valueOf((long)(l - 15552000L))};
                                set2 = OSUtils.newConcurrentSet();
                                set = OSUtils.newConcurrentSet();
                                cursor3 = null;
                                cursor = null;
                                cursor2 = this.dbHelper.query("in_app_message", new String[]{"message_id", "click_ids"}, "last_display < ?", stringArray, null, null, null);
                                if (cursor2 == null) break block15;
                                cursor = cursor2;
                                cursor3 = cursor2;
                                if (cursor2.getCount() == 0) break block15;
                                cursor = cursor2;
                                cursor3 = cursor2;
                                if (!cursor2.moveToFirst()) break block16;
                                do {
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    String string2 = cursor2.getString(cursor2.getColumnIndex("message_id"));
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    String string3 = cursor2.getString(cursor2.getColumnIndex("click_ids"));
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    set2.add((Object)string2);
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    string2 = new JSONArray(string3);
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    set.addAll(OSUtils.newStringSetFromJSONArray((JSONArray)string2));
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                } while (bl = cursor2.moveToNext());
                                {
                                    catch (Throwable throwable2) {
                                        break block17;
                                    }
                                    catch (JSONException jSONException) {}
                                    cursor = cursor3;
                                    {
                                        jSONException.printStackTrace();
                                    }
                                    if (cursor3 == null || cursor3.isClosed()) break block18;
                                    break block19;
                                }
                            }
                            if (cursor2.isClosed()) break block18;
                            cursor3 = cursor2;
                        }
                        cursor3.close();
                        break block18;
                    }
                    cursor = cursor2;
                    cursor3 = cursor2;
                    {
                        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
                    }
                    if (cursor2 != null && !cursor2.isClosed()) {
                        cursor2.close();
                    }
                    return;
                }
                this.dbHelper.delete("in_app_message", "last_display < ?", stringArray);
                this.cleanInAppMessageIds(set2);
                this.cleanInAppMessageClickedClickIds(set);
                return;
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    public List<OSInAppMessageInternal> getCachedInAppMessages() {
        OSInAppMessageRepository oSInAppMessageRepository = this;
        synchronized (oSInAppMessageRepository) {
            Throwable throwable2;
            Cursor cursor;
            block16: {
                ArrayList arrayList;
                block17: {
                    Cursor cursor2;
                    block18: {
                        Cursor cursor3;
                        block15: {
                            boolean bl;
                            arrayList = new ArrayList();
                            cursor2 = null;
                            cursor = null;
                            cursor = cursor3 = this.dbHelper.query("in_app_message", null, null, null, null, null, null);
                            cursor2 = cursor3;
                            if (!cursor3.moveToFirst()) break block15;
                            do {
                                cursor = cursor3;
                                cursor2 = cursor3;
                                String string2 = cursor3.getString(cursor3.getColumnIndex("message_id"));
                                cursor = cursor3;
                                cursor2 = cursor3;
                                Object object = cursor3.getString(cursor3.getColumnIndex("click_ids"));
                                cursor = cursor3;
                                cursor2 = cursor3;
                                int n = cursor3.getInt(cursor3.getColumnIndex("display_quantity"));
                                cursor = cursor3;
                                cursor2 = cursor3;
                                long l = cursor3.getLong(cursor3.getColumnIndex("last_display"));
                                cursor = cursor3;
                                cursor2 = cursor3;
                                int n2 = cursor3.getInt(cursor3.getColumnIndex("displayed_in_session"));
                                bl = true;
                                if (n2 != 1) {
                                    bl = false;
                                }
                                cursor = cursor3;
                                cursor2 = cursor3;
                                cursor = cursor3;
                                cursor2 = cursor3;
                                Set<String> set = new Set<String>((String)object);
                                cursor = cursor3;
                                cursor2 = cursor3;
                                set = OSUtils.newStringSetFromJSONArray((JSONArray)set);
                                cursor = cursor3;
                                cursor2 = cursor3;
                                cursor = cursor3;
                                cursor2 = cursor3;
                                cursor = cursor3;
                                cursor2 = cursor3;
                                object = new OSInAppMessageRedisplayStats(n, l);
                                cursor = cursor3;
                                cursor2 = cursor3;
                                OSInAppMessageInternal oSInAppMessageInternal = new OSInAppMessageInternal(string2, set, bl, (OSInAppMessageRedisplayStats)object);
                                cursor = cursor3;
                                cursor2 = cursor3;
                                arrayList.add((Object)oSInAppMessageInternal);
                                cursor = cursor3;
                                cursor2 = cursor3;
                            } while (bl = cursor3.moveToNext());
                            {
                                boolean bl2;
                                catch (Throwable throwable2) {
                                    break block16;
                                }
                                catch (JSONException jSONException) {}
                                cursor = cursor2;
                                {
                                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", jSONException);
                                }
                                if (cursor2 == null || (bl2 = cursor2.isClosed())) break block17;
                                break block18;
                            }
                        }
                        if (cursor3.isClosed()) break block17;
                        cursor2 = cursor3;
                    }
                    cursor2.close();
                }
                return arrayList;
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw throwable2;
        }
    }

    public Set<String> getClickedMessagesId() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    public Set<String> getDismissedMessagesId() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_DISPLAYED_IAMS", null);
    }

    public void getIAMData(String string2, String string3, String string4, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        OneSignalRestClient.get((String)this.htmlPathForMessage(string3, string4, string2), (OneSignalRestClient.ResponseHandler)new 8(this, oSInAppMessageRequestResponse), null);
    }

    public void getIAMPreviewData(String string2, String string3, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        OneSignalRestClient.get((String)a.m("in_app_messages/device_preview?preview_id=", string3, "&app_id=", string2), (OneSignalRestClient.ResponseHandler)new 7(this, oSInAppMessageRequestResponse), null);
    }

    public Set<String> getImpressionesMessagesId() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Nullable
    public Date getLastTimeInAppDismissed() {
        String string2 = this.sharedPreferences.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (string2 == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        try {
            string2 = simpleDateFormat.parse(string2);
            return string2;
        }
        catch (ParseException parseException) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.ERROR, parseException.getLocalizedMessage());
            return null;
        }
    }

    public String getSavedIAMs() {
        return this.sharedPreferences.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_CACHED_IAMS", null);
    }

    public Set<String> getViewPageImpressionedIds() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    public void saveDismissedMessagesId(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    public void saveIAMs(String string2) {
        this.sharedPreferences.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_CACHED_IAMS", string2);
    }

    @WorkerThread
    public void saveInAppMessage(OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageRepository oSInAppMessageRepository = this;
        synchronized (oSInAppMessageRepository) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", oSInAppMessageInternal.messageId);
            contentValues.put("display_quantity", Integer.valueOf((int)oSInAppMessageInternal.getRedisplayStats().getDisplayQuantity()));
            contentValues.put("last_display", Long.valueOf((long)oSInAppMessageInternal.getRedisplayStats().getLastDisplayTime()));
            contentValues.put("click_ids", oSInAppMessageInternal.getClickedClickIds().toString());
            contentValues.put("displayed_in_session", Boolean.valueOf((boolean)oSInAppMessageInternal.isDisplayedInSession()));
            if (this.dbHelper.update("in_app_message", contentValues, "message_id = ?", new String[]{oSInAppMessageInternal.messageId}) == 0) {
                this.dbHelper.insert("in_app_message", null, contentValues);
            }
            return;
        }
    }

    public void saveLastTimeInAppDismissed(Date object) {
        object = object != null ? object.toString() : null;
        this.sharedPreferences.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_LAST_TIME_IAM_DISMISSED", (String)object);
    }

    public void saveViewPageImpressionedIds(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    public void sendIAMClick(String string2, String string3, String string4, int n, String string5, String string6, boolean bl, Set<String> set, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        try {
            JSONObject jSONObject = new JSONObject(this, string2, n, string3, string6, string4, bl){
                public final OSInAppMessageRepository this$0;
                public final String val$appId;
                public final String val$clickId;
                public final int val$deviceType;
                public final boolean val$isFirstClick;
                public final String val$userId;
                public final String val$variantId;
                {
                    this.this$0 = oSInAppMessageRepository;
                    this.val$appId = string2;
                    this.val$deviceType = n;
                    this.val$userId = string3;
                    this.val$clickId = string4;
                    this.val$variantId = string5;
                    this.val$isFirstClick = bl;
                    this.put("app_id", string2);
                    this.put("device_type", n);
                    this.put("player_id", string3);
                    this.put("click_id", string4);
                    this.put("variant_id", string5);
                    if (bl) {
                        this.put("first_click", true);
                    }
                }
            };
            string2 = new StringBuilder();
            string2.append("in_app_messages/");
            string2.append(string5);
            string2.append("/click");
            string2 = string2.toString();
            string3 = new 2(this, set, oSInAppMessageRequestResponse);
            OneSignalRestClient.post((String)string2, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)string3);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            this.logger.error("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    public void sendIAMImpression(String string2, String string3, String string4, int n, String string5, Set<String> set, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        try {
            JSONObject jSONObject = new JSONObject(this, string2, string3, string4, n){
                public final OSInAppMessageRepository this$0;
                public final String val$appId;
                public final int val$deviceType;
                public final String val$userId;
                public final String val$variantId;
                {
                    this.this$0 = oSInAppMessageRepository;
                    this.val$appId = string2;
                    this.val$userId = string3;
                    this.val$variantId = string4;
                    this.val$deviceType = n;
                    this.put("app_id", string2);
                    this.put("player_id", string3);
                    this.put("variant_id", string4);
                    this.put("device_type", n);
                    this.put("first_impression", true);
                }
            };
            string2 = new StringBuilder();
            string2.append("in_app_messages/");
            string2.append(string5);
            string2.append("/impression");
            string2 = string2.toString();
            string3 = new 6(this, set, oSInAppMessageRequestResponse);
            OneSignalRestClient.post((String)string2, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)string3);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            this.logger.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public void sendIAMPageImpression(String string2, String string3, String string4, int n, String string5, String string6, Set<String> set, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        try {
            JSONObject jSONObject = new JSONObject(this, string2, string3, string4, n, string6){
                public final OSInAppMessageRepository this$0;
                public final String val$appId;
                public final int val$deviceType;
                public final String val$pageId;
                public final String val$userId;
                public final String val$variantId;
                {
                    this.this$0 = oSInAppMessageRepository;
                    this.val$appId = string2;
                    this.val$userId = string3;
                    this.val$variantId = string4;
                    this.val$deviceType = n;
                    this.val$pageId = string5;
                    this.put("app_id", string2);
                    this.put("player_id", string3);
                    this.put("variant_id", string4);
                    this.put("device_type", n);
                    this.put("page_id", string5);
                }
            };
            string2 = new StringBuilder();
            string2.append("in_app_messages/");
            string2.append(string5);
            string2.append("/pageImpression");
            string3 = string2.toString();
            string2 = new 4(this, set, oSInAppMessageRequestResponse);
            OneSignalRestClient.post((String)string3, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)string2);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            this.logger.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public static interface OSInAppMessageRequestResponse {
        public void onFailure(String var1);

        public void onSuccess(String var1);
    }
}

