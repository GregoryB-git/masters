/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.N;
import x1.h;

public final class M {
    public static final a c = new a(null);
    public static final String d = M.class.getSimpleName();
    public final String a;
    public final SharedPreferences b;

    public M(Context object, String string2) {
        String string3;
        block5 : {
            block4 : {
                Intrinsics.checkNotNullParameter(object, "context");
                if (string2 == null) break block4;
                string3 = string2;
                if (string2.length() != 0) break block5;
            }
            string3 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.a = string3;
        string2 = object.getApplicationContext();
        if (string2 != null) {
            object = string2;
        }
        object = object.getSharedPreferences(string3, 0);
        Intrinsics.checkNotNullExpressionValue(object, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.b = object;
    }

    public /* synthetic */ M(Context context, String string2, int n8, g g8) {
        if ((n8 & 2) != 0) {
            string2 = null;
        }
        this(context, string2);
    }

    public final void a() {
        this.b.edit().clear().apply();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void b(String string2, Bundle bundle) {
        Object object = this.b.getString(string2, "{}");
        if (object == null) throw new IllegalStateException("Required value was null.".toString());
        short[] arrs = (object = new JSONObject((String)object)).getString("valueType");
        if (arrs == null) return;
        int n8 = arrs.hashCode();
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        switch (n8) {
            default: {
                return;
            }
            case 2067161310: {
                if (!arrs.equals((Object)"short[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n9 = object.length();
                arrs = new short[n9];
                n10 = n9 - 1;
                if (n10 >= 0) {
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = (short)object.getInt(n16);
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putShortArray(string2, arrs);
                return;
            }
            case 1359468275: {
                if (!arrs.equals((Object)"double[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new double[n16];
                n10 = n16 - 1;
                if (n10 >= 0) {
                    n16 = n9;
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = (short)object.getDouble(n16);
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putDoubleArray(string2, (double[])arrs);
                return;
            }
            case 109413500: {
                if (!arrs.equals((Object)"short")) {
                    return;
                }
                bundle.putShort(string2, (short)object.getInt("value"));
                return;
            }
            case 100361105: {
                if (!arrs.equals((Object)"int[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new int[n16];
                n11 = n16 - 1;
                if (n11 >= 0) {
                    n16 = n10;
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = object.getInt(n16);
                        if (n9 > n11) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putIntArray(string2, (int[])arrs);
                return;
            }
            case 97526364: {
                if (!arrs.equals((Object)"float")) {
                    return;
                }
                bundle.putFloat(string2, (float)object.getDouble("value"));
                return;
            }
            case 3327612: {
                if (!arrs.equals((Object)"long")) {
                    return;
                }
                bundle.putLong(string2, object.getLong("value"));
                return;
            }
            case 3118337: {
                if (!arrs.equals((Object)"enum")) {
                    return;
                }
                bundle.putSerializable(string2, (Serializable)Enum.valueOf((Class)Class.forName((String)object.getString("enumType")), (String)object.getString("value")));
                return;
            }
            case 3052374: {
                if (!arrs.equals((Object)"char")) {
                    return;
                }
                if ((object = object.getString("value")) == null) return;
                if (object.length() != 1) return;
                bundle.putChar(string2, object.charAt(0));
                return;
            }
            case 3039496: {
                if (!arrs.equals((Object)"byte")) {
                    return;
                }
                bundle.putByte(string2, (byte)object.getInt("value"));
                return;
            }
            case 3029738: {
                if (!arrs.equals((Object)"bool")) {
                    return;
                }
                bundle.putBoolean(string2, object.getBoolean("value"));
                return;
            }
            case 104431: {
                if (!arrs.equals((Object)"int")) {
                    return;
                }
                bundle.putInt(string2, object.getInt("value"));
                return;
            }
            case -766441794: {
                if (!arrs.equals((Object)"float[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new float[n16];
                n10 = n16 - 1;
                if (n10 >= 0) {
                    n16 = n11;
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = (short)object.getDouble(n16);
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putFloatArray(string2, (float[])arrs);
                return;
            }
            case -891985903: {
                if (!arrs.equals((Object)"string")) {
                    return;
                }
                bundle.putString(string2, object.getString("value"));
                return;
            }
            case -1097129250: {
                if (!arrs.equals((Object)"long[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new long[n16];
                n10 = n16 - 1;
                if (n10 >= 0) {
                    n16 = n12;
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = (short)object.getLong(n16);
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putLongArray(string2, (long[])arrs);
                return;
            }
            case -1325958191: {
                if (!arrs.equals((Object)"double")) {
                    return;
                }
                bundle.putDouble(string2, object.getDouble("value"));
                return;
            }
            case -1361632968: {
                if (!arrs.equals((Object)"char[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new char[n16];
                n10 = n16 - 1;
                if (n10 >= 0) {
                    n16 = 0;
                    do {
                        n9 = n16 + 1;
                        String string3 = object.getString(n16);
                        if (string3 != null && string3.length() == 1) {
                            arrs[n16] = (short)string3.charAt(0);
                        }
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putCharArray(string2, (char[])arrs);
                return;
            }
            case -1374008726: {
                if (!arrs.equals((Object)"byte[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new byte[n16];
                n10 = n16 - 1;
                if (n10 >= 0) {
                    n16 = n13;
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = (byte)object.getInt(n16);
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putByteArray(string2, (byte[])arrs);
                return;
            }
            case -1383386164: {
                if (!arrs.equals((Object)"bool[]")) {
                    return;
                }
                object = object.getJSONArray("value");
                n16 = object.length();
                arrs = new boolean[n16];
                n10 = n16 - 1;
                if (n10 >= 0) {
                    n16 = n14;
                    do {
                        n9 = n16 + 1;
                        arrs[n16] = (short)(object.getBoolean(n16) ? 1 : 0);
                        if (n9 > n10) break;
                        n16 = n9;
                    } while (true);
                }
                bundle.putBooleanArray(string2, (boolean[])arrs);
                return;
            }
            case -1573317553: 
        }
        if (!arrs.equals((Object)"stringList")) {
            return;
        }
        arrs = object.getJSONArray("value");
        n10 = arrs.length();
        ArrayList arrayList = new ArrayList(n10);
        if (n10 > 0) {
            n16 = n15;
            do {
                n9 = n16 + 1;
                object = arrs.get(n16);
                if (object == JSONObject.NULL) {
                    object = null;
                } else {
                    if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    object = (String)object;
                }
                arrayList.add(n16, object);
                if (n9 >= n10) break;
                n16 = n9;
            } while (true);
        }
        bundle.putStringArrayList(string2, arrayList);
        return;
        catch (ClassNotFoundException | IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public final Bundle c() {
        Object object;
        Bundle bundle = new Bundle();
        Object object2 = this.b.getAll().keySet().iterator();
        do {
            object = bundle;
            if (!object2.hasNext()) break;
            object = (String)object2.next();
            try {
                Intrinsics.checkNotNullExpressionValue(object, "key");
                this.b((String)object, bundle);
            }
            catch (JSONException jSONException) {
                object2 = C.e;
                N n8 = N.r;
                String string2 = d;
                Intrinsics.checkNotNullExpressionValue(string2, "TAG");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error reading cached value for key: '");
                stringBuilder.append(object);
                stringBuilder.append("' -- ");
                stringBuilder.append((Object)jSONException);
                object2.a(n8, 5, string2, stringBuilder.toString());
                object = null;
                break;
            }
        } while (true);
        return object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final String a(Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date b(Bundle bundle, String string2) {
            if (bundle == null) {
                return null;
            }
            long l8 = bundle.getLong(string2, Long.MIN_VALUE);
            if (l8 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(l8);
        }

        public final Date c(Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            return this.b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            return this.b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final h e(Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (h)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                return h.q;
            }
            return h.t;
        }

        public final String f(Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            boolean bl = false;
            if (bundle == null) {
                return false;
            }
            String string2 = bundle.getString("com.facebook.TokenCachingStrategy.Token");
            boolean bl2 = bl;
            if (string2 != null) {
                if (string2.length() == 0) {
                    return false;
                }
                bl2 = bl;
                if (bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L) {
                    bl2 = true;
                }
            }
            return bl2;
        }
    }

}

