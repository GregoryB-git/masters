package io.flutter.plugins.firebase.messaging;

import aa.z;
import android.content.SharedPreferences;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingStore {
    private static final String KEY_NOTIFICATION_IDS = "notification_ids";
    private static final int MAX_SIZE_NOTIFICATIONS = 100;
    private static final String PREFERENCES_FILE = "io.flutter.plugins.firebase.messaging";
    private static FlutterFirebaseMessagingStore instance;
    private final String DELIMITER = ",";
    private SharedPreferences preferences;

    public static FlutterFirebaseMessagingStore getInstance() {
        if (instance == null) {
            instance = new FlutterFirebaseMessagingStore();
        }
        return instance;
    }

    private SharedPreferences getPreferences() {
        if (this.preferences == null) {
            this.preferences = ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.preferences;
    }

    private Map<String, Object> jsonObjectToMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = jsonArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = jsonObjectToMap((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public Map<String, Object> getFirebaseMessageMap(String str) {
        String preferencesStringValue = getPreferencesStringValue(str, null);
        if (preferencesStringValue != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map<String, Object> jsonObjectToMap = jsonObjectToMap(new JSONObject(preferencesStringValue));
                jsonObjectToMap.put("to", str);
                hashMap.put(Constants.MESSAGE, jsonObjectToMap);
                return hashMap;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public String getPreferencesStringValue(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public List<Object> jsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = jsonArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = jsonObjectToMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public void removeFirebaseMessage(String str) {
        getPreferences().edit().remove(str).apply();
        String preferencesStringValue = getPreferencesStringValue(KEY_NOTIFICATION_IDS, "");
        if (preferencesStringValue.isEmpty()) {
            return;
        }
        setPreferencesStringValue(KEY_NOTIFICATION_IDS, preferencesStringValue.replace(str + ",", ""));
    }

    public void setPreferencesStringValue(String str, String str2) {
        getPreferences().edit().putString(str, str2).apply();
    }

    public void storeFirebaseMessage(z zVar) {
        setPreferencesStringValue(zVar.E(), new JSONObject(FlutterFirebaseMessagingUtils.remoteMessageToMap(zVar)).toString());
        StringBuilder l10 = defpackage.f.l(getPreferencesStringValue(KEY_NOTIFICATION_IDS, ""));
        l10.append(zVar.E());
        l10.append(",");
        String sb2 = l10.toString();
        ArrayList arrayList = new ArrayList(Arrays.asList(sb2.split(",")));
        if (arrayList.size() > 100) {
            String str = (String) arrayList.get(0);
            getPreferences().edit().remove(str).apply();
            sb2 = sb2.replace(str + ",", "");
        }
        setPreferencesStringValue(KEY_NOTIFICATION_IDS, sb2);
    }
}
