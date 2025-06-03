package x1;

import O1.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20948c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f20949d = M.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final String f20950a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f20951b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j7 = bundle.getLong(str, Long.MIN_VALUE);
            if (j7 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j7);
        }

        public final Date c(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final EnumC2155h e(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource") ? (EnumC2155h) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource") : bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? EnumC2155h.FACEBOOK_APPLICATION_WEB : EnumC2155h.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }
    }

    public M(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.f20950a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.f20951b = sharedPreferences;
    }

    public final void a() {
        this.f20951b.edit().clear().apply();
    }

    public final void b(String str, Bundle bundle) {
        String str2;
        String string;
        String string2 = this.f20951b.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i7 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals("stringList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i8 = i7 + 1;
                                Object obj = jSONArray.get(i7);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else {
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    str2 = (String) obj;
                                }
                                arrayList.add(i7, str2);
                                if (i8 < length) {
                                    i7 = i8;
                                }
                            }
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i9 = length2 - 1;
                        if (i9 >= 0) {
                            while (true) {
                                int i10 = i7 + 1;
                                zArr[i7] = jSONArray2.getBoolean(i7);
                                if (i10 <= i9) {
                                    i7 = i10;
                                }
                            }
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i11 = length3 - 1;
                        if (i11 >= 0) {
                            while (true) {
                                int i12 = i7 + 1;
                                bArr[i7] = (byte) jSONArray3.getInt(i7);
                                if (i12 <= i11) {
                                    i7 = i12;
                                }
                            }
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i13 = length4 - 1;
                        if (i13 >= 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                String string4 = jSONArray4.getString(i14);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i14] = string4.charAt(0);
                                }
                                if (i15 <= i13) {
                                    i14 = i15;
                                }
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals("double")) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i16 = length5 - 1;
                        if (i16 >= 0) {
                            while (true) {
                                int i17 = i7 + 1;
                                jArr[i7] = jSONArray5.getLong(i7);
                                if (i17 <= i16) {
                                    i7 = i17;
                                }
                            }
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i18 = length6 - 1;
                        if (i18 >= 0) {
                            while (true) {
                                int i19 = i7 + 1;
                                fArr[i7] = (float) jSONArray6.getDouble(i7);
                                if (i19 <= i18) {
                                    i7 = i19;
                                }
                            }
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals("char") && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i20 = length7 - 1;
                        if (i20 >= 0) {
                            while (true) {
                                int i21 = i7 + 1;
                                iArr[i7] = jSONArray7.getInt(i7);
                                if (i21 <= i20) {
                                    i7 = i21;
                                }
                            }
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals("short")) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i22 = length8 - 1;
                        if (i22 >= 0) {
                            while (true) {
                                int i23 = i7 + 1;
                                dArr[i7] = jSONArray8.getDouble(i7);
                                if (i23 <= i22) {
                                    i7 = i23;
                                }
                            }
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i24 = length9 - 1;
                        if (i24 >= 0) {
                            while (true) {
                                int i25 = i7 + 1;
                                sArr[i7] = (short) jSONArray9.getInt(i7);
                                if (i25 <= i24) {
                                    i7 = i25;
                                }
                            }
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String key : this.f20951b.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                b(key, bundle);
            } catch (JSONException e7) {
                C.a aVar = O1.C.f3715e;
                N n7 = N.CACHE;
                String TAG = f20949d;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.a(n7, 5, TAG, "Error reading cached value for key: '" + ((Object) key) + "' -- " + e7);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ M(Context context, String str, int i7, kotlin.jvm.internal.g gVar) {
        this(context, (i7 & 2) != 0 ? null : str);
    }
}
