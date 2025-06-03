/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package O1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {
    public static final c a = new c();
    public static final Map b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Boolean.class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                bundle.putBoolean(string2, ((Boolean)object).booleanValue());
            }
        });
        hashMap.put(Integer.class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                bundle.putInt(string2, ((Integer)object).intValue());
            }
        });
        hashMap.put(Long.class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                bundle.putLong(string2, ((Long)object).longValue());
            }
        });
        hashMap.put(Double.class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                bundle.putDouble(string2, ((Double)object).doubleValue());
            }
        });
        hashMap.put(String.class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                bundle.putString(string2, (String)object);
            }
        });
        hashMap.put(String[].class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        hashMap.put(JSONArray.class, (Object)new h(){

            @Override
            public void a(Bundle bundle, String string2, Object object) {
                ArrayList arrayList;
                block4 : {
                    Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
                    Intrinsics.checkNotNullParameter(string2, "key");
                    Intrinsics.checkNotNullParameter(object, "value");
                    object = (JSONArray)object;
                    arrayList = new ArrayList();
                    if (object.length() == 0) {
                        bundle.putStringArrayList(string2, arrayList);
                        return;
                    }
                    int n8 = object.length();
                    if (n8 > 0) {
                        Object object2;
                        int n9 = 0;
                        do {
                            int n10 = n9 + 1;
                            object2 = object.get(n9);
                            if (!(object2 instanceof String)) break;
                            arrayList.add(object2);
                            if (n10 < n8) {
                                n9 = n10;
                                continue;
                            }
                            break block4;
                            break;
                        } while (true);
                        throw new IllegalArgumentException(Intrinsics.i("Unexpected type in an array: ", (Object)object2.getClass()));
                    }
                }
                bundle.putStringArrayList(string2, arrayList);
            }
        });
    }

    public static final Bundle a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = jSONObject.get(string2);
            if (object == JSONObject.NULL) continue;
            if (object instanceof JSONObject) {
                bundle.putBundle(string2, c.a((JSONObject)object));
                continue;
            }
            h h8 = (h)b.get((Object)object.getClass());
            if (h8 != null) {
                Intrinsics.checkNotNullExpressionValue(string2, "key");
                Intrinsics.checkNotNullExpressionValue(object, "value");
                h8.a(bundle, string2, object);
                continue;
            }
            throw new IllegalArgumentException(Intrinsics.i("Unsupported type: ", (Object)object.getClass()));
        }
        return bundle;
    }

    public static interface h {
        public void a(Bundle var1, String var2, Object var3);
    }

}

