/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.ImmutableJSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JSONUtils {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null) return false;
        if (jSONArray2 == null) {
            return false;
        }
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int n = 0;
        try {
            block2: while (true) {
                if (n >= jSONArray.length()) return true;
                int n2 = 0;
                while (n2 < jSONArray2.length()) {
                    boolean bl = JSONUtils.normalizeType(jSONArray.get(n)).equals(JSONUtils.normalizeType(jSONArray2.get(n2)));
                    if (bl) {
                        ++n;
                        continue block2;
                    }
                    ++n2;
                }
                return false;
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return false;
    }

    @NonNull
    private static Object convertNestedJSONType(@NonNull Object list) throws JSONException {
        if (list instanceof JSONObject) {
            return JSONUtils.jsonObjectToMapNonNull((JSONObject)list);
        }
        List<Object> list2 = list;
        if (list instanceof JSONArray) {
            list2 = JSONUtils.jsonArrayToListNonNull((JSONArray)list);
        }
        return list2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator iterator = jSONObject2.keys();
        JSONObject jSONObject4 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (iterator.hasNext()) {
            try {
                String string2 = (String)iterator.next();
                Object object = jSONObject2.get(string2);
                if (jSONObject.has(string2)) {
                    if (object instanceof JSONObject) {
                        void var5_9;
                        JSONObject jSONObject5 = jSONObject.getJSONObject(string2);
                        if (jSONObject3 != null && jSONObject3.has(string2)) {
                            JSONObject jSONObject6 = jSONObject3.getJSONObject(string2);
                        } else {
                            Object var5_8 = null;
                        }
                        if ((object = JSONUtils.generateJsonDiff(jSONObject5, (JSONObject)object, (JSONObject)var5_9, set).toString()).equals((Object)"{}")) continue;
                        JSONObject jSONObject7 = new JSONObject((String)object);
                        jSONObject4.put(string2, (Object)jSONObject7);
                        continue;
                    }
                    if (object instanceof JSONArray) {
                        JSONUtils.handleJsonArray(string2, (JSONArray)object, jSONObject.getJSONArray(string2), jSONObject4);
                        continue;
                    }
                    if (set != null && set.contains((Object)string2)) {
                        jSONObject4.put(string2, object);
                        continue;
                    }
                    Object object2 = jSONObject.get(string2);
                    if (object.equals(object2)) continue;
                    if (object2 instanceof Number && object instanceof Number) {
                        if (((Number)object2).doubleValue() == ((Number)object).doubleValue()) continue;
                        jSONObject4.put(string2, object);
                        continue;
                    }
                    jSONObject4.put(string2, object);
                    continue;
                }
                if (object instanceof JSONObject) {
                    JSONObject jSONObject8 = new JSONObject(object.toString());
                    jSONObject4.put(string2, (Object)jSONObject8);
                    continue;
                }
                if (object instanceof JSONArray) {
                    JSONUtils.handleJsonArray(string2, (JSONArray)object, null, jSONObject4);
                    continue;
                }
                jSONObject4.put(string2, object);
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                continue;
            }
            break;
        }
        return jSONObject4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject getJSONObjectWithoutBlankValues(ImmutableJSONObject immutableJSONObject, String string2) {
        if (!immutableJSONObject.has(string2)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        immutableJSONObject = immutableJSONObject.optJSONObject(string2);
        string2 = immutableJSONObject.keys();
        while (string2.hasNext()) {
            String string3 = (String)string2.next();
            try {
                Object object = immutableJSONObject.get(string3);
                if ("".equals(object)) continue;
                jSONObject.put(string3, object);
            }
            catch (JSONException jSONException) {}
        }
        return jSONObject;
    }

    private static void handleJsonArray(String string2, JSONArray object, JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        if (!string2.endsWith("_a") && !string2.endsWith("_d")) {
            int n;
            String string3 = JSONUtils.toStringNE(object);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            String string4 = jSONArray == null ? null : JSONUtils.toStringNE(jSONArray);
            int n2 = 0;
            for (n = 0; n < object.length(); ++n) {
                String string5 = (String)object.get(n);
                if (jSONArray != null && string4.contains((CharSequence)string5)) continue;
                jSONArray2.put((Object)string5);
            }
            if (jSONArray != null) {
                for (n = n2; n < jSONArray.length(); ++n) {
                    object = jSONArray.getString(n);
                    if (string3.contains((CharSequence)object)) continue;
                    jSONArray3.put(object);
                }
            }
            if (!jSONArray2.toString().equals((Object)"[]")) {
                object = new StringBuilder();
                object.append(string2);
                object.append("_a");
                jSONObject.put(object.toString(), (Object)jSONArray2);
            }
            if (!jSONArray3.toString().equals((Object)"[]")) {
                object = new StringBuilder();
                object.append(string2);
                object.append("_d");
                jSONObject.put(object.toString(), (Object)jSONArray3);
            }
            return;
        }
        jSONObject.put(string2, object);
    }

    @Nullable
    public static List<Object> jsonArrayToList(@Nullable JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        return JSONUtils.jsonArrayToListNonNull(jSONArray);
    }

    @NonNull
    private static List<Object> jsonArrayToListNonNull(@NonNull JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); ++i) {
            arrayList.add(JSONUtils.convertNestedJSONType(jSONArray.get(i)));
        }
        return arrayList;
    }

    @Nullable
    public static Map<String, Object> jsonObjectToMap(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && jSONObject != JSONObject.NULL) {
            return JSONUtils.jsonObjectToMapNonNull(jSONObject);
        }
        return null;
    }

    @NonNull
    private static Map<String, Object> jsonObjectToMapNonNull(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            hashMap.put((Object)string2, JSONUtils.convertNestedJSONType(jSONObject.get(string2)));
        }
        return hashMap;
    }

    public static Object normalizeType(Object object) {
        Class clazz = object.getClass();
        if (clazz.equals(Integer.class)) {
            return (long)((Integer)object).intValue();
        }
        Object object2 = object;
        if (clazz.equals(Float.class)) {
            object2 = (double)((Float)object).floatValue();
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String toStringNE(JSONArray jSONArray) {
        int n = 0;
        String string2 = "[";
        try {
            while (n < jSONArray.length()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("\"");
                stringBuilder.append(jSONArray.getString(n));
                stringBuilder.append("\"");
                String string3 = stringBuilder.toString();
                ++n;
                string2 = string3;
            }
            return z2.o(string2, "]");
        }
        catch (JSONException jSONException) {
            return z2.o(string2, "]");
        }
    }

    public static String toUnescapedEUIDString(JSONObject object) {
        String string2;
        String string3 = string2 = object.toString();
        if (object.has("external_user_id")) {
            Matcher matcher = Pattern.compile((String)"(?<=\"external_user_id\":\").*?(?=\")").matcher((CharSequence)string2);
            string3 = string2;
            if (matcher.find()) {
                object = matcher.group(0);
                string3 = string2;
                if (object != null) {
                    string3 = matcher.replaceAll(Matcher.quoteReplacement((String)object.replace((CharSequence)"\\/", (CharSequence)"/")));
                }
            }
        }
        return string3;
    }
}

