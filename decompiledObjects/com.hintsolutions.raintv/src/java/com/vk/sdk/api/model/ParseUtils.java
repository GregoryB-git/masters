/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  com.vk.sdk.api.model.VKAttachments
 *  com.vk.sdk.api.model.VKList
 *  com.vk.sdk.api.model.VKPhotoSizes
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchMethodError
 *  java.lang.NoSuchMethodException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.ParameterizedType
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcelable;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKList;
import com.vk.sdk.api.model.VKPhotoSizes;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ParseUtils {
    private ParseUtils() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object parseArrayViaReflection(JSONArray jSONArray, Class object) throws JSONException {
        Object object2 = Array.newInstance((Class)object.getComponentType(), (int)jSONArray.length());
        Class clazz = object.getComponentType();
        int n = 0;
        while (n < jSONArray.length()) {
            try {
                void var1_9;
                Object object3;
                Object object4 = object3 = jSONArray.opt(n);
                if (VKApiModel.class.isAssignableFrom(clazz)) {
                    Object object5 = object3;
                    if (object3 instanceof JSONObject) {
                        VKApiModel vKApiModel = ((VKApiModel)clazz.newInstance()).parse((JSONObject)object3);
                    }
                }
                Array.set((Object)object2, (int)n, (Object)var1_9);
                ++n;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new JSONException(illegalArgumentException.getMessage());
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new JSONException(illegalAccessException.getMessage());
            }
            catch (InstantiationException instantiationException) {
                throw new JSONException(instantiationException.getMessage());
            }
        }
        return object2;
    }

    public static boolean parseBoolean(String string2) throws JSONException {
        string2 = new JSONObject(string2);
        boolean bl = false;
        if (string2.optInt("response", 0) == 1) {
            bl = true;
        }
        return bl;
    }

    public static boolean parseBoolean(JSONObject jSONObject, String string2) {
        boolean bl = true;
        if (jSONObject == null || jSONObject.optInt(string2, 0) != 1) {
            bl = false;
        }
        return bl;
    }

    public static int parseInt(String string2) throws JSONException {
        if (string2 == null) {
            return 0;
        }
        return new JSONObject(string2).optInt("response");
    }

    public static int parseInt(JSONObject jSONObject, String string2) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(string2, 0);
    }

    public static int[] parseIntArray(JSONArray jSONArray) {
        int n = jSONArray.length();
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = jSONArray.optInt(k);
        }
        return nArray;
    }

    public static long parseLong(JSONObject jSONObject, String string2) {
        if (jSONObject == null) {
            return 0L;
        }
        return jSONObject.optLong(string2, 0L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static <T> T parseViaReflection(T t2, JSONObject object) throws JSONException {
        Object object2 = object;
        if (object.has("response")) {
            object2 = object.optJSONObject("response");
        }
        if (object2 == null) {
            return t2;
        }
        Field[] fieldArray = t2.getClass().getFields();
        int n = fieldArray.length;
        int n3 = 0;
        while (true) {
            block24: {
                if (n3 >= n) {
                    return t2;
                }
                Field field = fieldArray[n3];
                boolean bl = true;
                field.setAccessible(true);
                String string2 = field.getName();
                Class clazz = field.getType();
                Object object3 = object2.opt(string2);
                if (object3 == null) break block24;
                try {
                    void var1_19;
                    block26: {
                        block30: {
                            block29: {
                                block28: {
                                    block27: {
                                        block25: {
                                            if (clazz.isPrimitive() && object3 instanceof Number) {
                                                Number number = (Number)object3;
                                                if (clazz.equals((Object)Integer.TYPE)) {
                                                    field.setInt(t2, number.intValue());
                                                    break block24;
                                                }
                                                if (clazz.equals((Object)Long.TYPE)) {
                                                    field.setLong(t2, number.longValue());
                                                    break block24;
                                                }
                                                if (clazz.equals((Object)Float.TYPE)) {
                                                    field.setFloat(t2, number.floatValue());
                                                    break block24;
                                                }
                                                if (clazz.equals((Object)Double.TYPE)) {
                                                    field.setDouble(t2, number.doubleValue());
                                                    break block24;
                                                }
                                                if (clazz.equals((Object)Boolean.TYPE)) {
                                                    if (number.intValue() != 1) {
                                                        bl = false;
                                                    }
                                                    field.setBoolean(t2, bl);
                                                    break block24;
                                                }
                                                if (clazz.equals((Object)Short.TYPE)) {
                                                    field.setShort(t2, number.shortValue());
                                                    break block24;
                                                }
                                                if (clazz.equals((Object)Byte.TYPE)) {
                                                    field.setByte(t2, number.byteValue());
                                                }
                                                break block24;
                                            }
                                            Object object4 = field.get(t2);
                                            if (!object3.getClass().equals((Object)clazz)) break block25;
                                            Object object5 = object3;
                                            break block26;
                                        }
                                        if (!clazz.isArray() || !(object3 instanceof JSONArray)) break block27;
                                        Object object6 = ParseUtils.parseArrayViaReflection((JSONArray)object3, clazz);
                                        break block26;
                                    }
                                    if (!VKPhotoSizes.class.isAssignableFrom(clazz) || !(object3 instanceof JSONArray)) break block28;
                                    Object object7 = clazz.getConstructor(new Class[]{JSONArray.class}).newInstance(new Object[]{(JSONArray)object3});
                                    break block26;
                                }
                                if (!VKAttachments.class.isAssignableFrom(clazz) || !(object3 instanceof JSONArray)) break block29;
                                Object object8 = clazz.getConstructor(new Class[]{JSONArray.class}).newInstance(new Object[]{(JSONArray)object3});
                                break block26;
                            }
                            if (!VKList.class.equals((Object)clazz)) break block30;
                            clazz = (Class)((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
                            if (VKApiModel.class.isAssignableFrom(clazz) && Parcelable.class.isAssignableFrom(clazz) && Identifiable.class.isAssignableFrom(clazz)) {
                                if (object3 instanceof JSONArray) {
                                    VKList vKList = new VKList((JSONArray)object3, clazz);
                                    break block26;
                                } else if (object3 instanceof JSONObject) {
                                    VKList vKList = new VKList((JSONObject)object3, clazz);
                                }
                            }
                            break block26;
                        }
                        if (VKApiModel.class.isAssignableFrom(clazz) && object3 instanceof JSONObject) {
                            VKApiModel vKApiModel = ((VKApiModel)clazz.newInstance()).parse((JSONObject)object3);
                        }
                    }
                    field.set(t2, (Object)var1_19);
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    throw new JSONException(noSuchMethodError.getMessage());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new JSONException(invocationTargetException.getMessage());
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    throw new JSONException(noSuchMethodException.getMessage());
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new JSONException(illegalAccessException.getMessage());
                }
                catch (InstantiationException instantiationException) {
                    throw new JSONException(instantiationException.getMessage());
                }
            }
            ++n3;
        }
    }

    public static JSONArray rootJSONArray(String string2) throws JSONException {
        return new JSONObject(string2).getJSONArray("response");
    }

    public static JSONObject rootJSONObject(String string2) throws JSONException {
        return new JSONObject(string2).getJSONObject("response");
    }
}

