/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.util;

import com.vk.sdk.api.model.VKApiModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VKJsonHelper {
    private static Object fromJson(Object object) throws JSONException {
        if (object == JSONObject.NULL) {
            return null;
        }
        if (object instanceof JSONObject) {
            return VKJsonHelper.toMap((JSONObject)object);
        }
        Object object2 = object;
        if (object instanceof JSONArray) {
            object2 = VKJsonHelper.toList((JSONArray)object);
        }
        return object2;
    }

    public static Map<String, Object> getMap(JSONObject jSONObject, String string2) throws JSONException {
        return VKJsonHelper.toMap(jSONObject.getJSONObject(string2));
    }

    public static boolean isEmptyObject(JSONObject jSONObject) {
        boolean bl = jSONObject.names() == null;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object toArray(JSONArray jSONArray, Class clazz) {
        Object object = Array.newInstance((Class)clazz.getComponentType(), (int)jSONArray.length());
        clazz = clazz.getComponentType();
        int n = 0;
        while (true) {
            block5: {
                if (n >= jSONArray.length()) {
                    return object;
                }
                try {
                    Object object2 = jSONArray.get(n);
                    Object object3 = clazz.newInstance();
                    if (!(object2 instanceof JSONObject)) break block5;
                    object2 = (JSONObject)object2;
                    if (object3 instanceof VKApiModel) {
                        VKApiModel vKApiModel = (VKApiModel)object3;
                        ((VKApiModel)object3).parse((JSONObject)object2);
                        Array.set((Object)object, (int)n, (Object)vKApiModel);
                    }
                }
                catch (IllegalAccessException | InstantiationException | JSONException throwable) {}
            }
            ++n;
        }
    }

    public static Object toJSON(Object object2) throws JSONException {
        if (object2 instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            Map map = (Map)object2;
            for (Object object2 : map.keySet()) {
                jSONObject.put(object2.toString(), VKJsonHelper.toJSON(map.get(object2)));
            }
            return jSONObject;
        }
        if (object2 instanceof Iterable) {
            JSONArray jSONArray = new JSONArray();
            object2 = ((Iterable)object2).iterator();
            while (object2.hasNext()) {
                jSONArray.put(object2.next());
            }
            return jSONArray;
        }
        return object2;
    }

    public static List toList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int k = 0; k < jSONArray.length(); ++k) {
            arrayList.add(VKJsonHelper.fromJson(jSONArray.get(k)));
        }
        return arrayList;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            hashMap.put((Object)string2, VKJsonHelper.fromJson(jSONObject.get(string2)));
        }
        return hashMap;
    }
}

