// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.os.BaseBundle;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import O1.C;
import org.json.JSONArray;
import java.util.ArrayList;
import java.io.Serializable;
import org.json.JSONObject;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import kotlin.jvm.internal.g;
import android.content.SharedPreferences;

public final class M
{
    public static final a c;
    public static final String d;
    public final String a;
    public final SharedPreferences b;
    
    static {
        c = new a(null);
        d = M.class.getSimpleName();
    }
    
    public M(Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a = null;
        Label_0028: {
            if (s != null) {
                a = s;
                if (s.length() != 0) {
                    break Label_0028;
                }
            }
            a = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.a = a;
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        final SharedPreferences sharedPreferences = context.getSharedPreferences(a, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }
    
    public final void a() {
        this.b.edit().clear().apply();
    }
    
    public final void b(final String s, final Bundle bundle) {
        final String string = this.b.getString(s, "{}");
        Label_1340: {
            if (string == null) {
                break Label_1340;
            }
            final JSONObject jsonObject = new JSONObject(string);
            final String string2 = jsonObject.getString("valueType");
            if (string2 == null) {
                return;
            }
            final int hashCode = string2.hashCode();
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            final int n4 = 0;
            final int n5 = 0;
            final int n6 = 0;
            final int n7 = 0;
            int n8 = 0;
            Label_1211: {
                switch (hashCode) {
                    default: {
                        return;
                    }
                    case 2067161310: {
                        if (!string2.equals("short[]")) {
                            return;
                        }
                        final JSONArray jsonArray = jsonObject.getJSONArray("value");
                        final int length = jsonArray.length();
                        final short[] array = new short[length];
                        final int n9 = length - 1;
                        if (n9 >= 0) {
                            while (true) {
                                final int n10 = n8 + 1;
                                array[n8] = (short)jsonArray.getInt(n8);
                                if (n10 > n9) {
                                    break;
                                }
                                n8 = n10;
                            }
                        }
                        bundle.putShortArray(s, array);
                        return;
                    }
                    case 1359468275: {
                        if (!string2.equals("double[]")) {
                            return;
                        }
                        final JSONArray jsonArray2 = jsonObject.getJSONArray("value");
                        final int length2 = jsonArray2.length();
                        final double[] array2 = new double[length2];
                        final int n11 = length2 - 1;
                        if (n11 >= 0) {
                            int n12 = n;
                            while (true) {
                                final int n13 = n12 + 1;
                                array2[n12] = jsonArray2.getDouble(n12);
                                if (n13 > n11) {
                                    break;
                                }
                                n12 = n13;
                            }
                        }
                        ((BaseBundle)bundle).putDoubleArray(s, array2);
                        return;
                    }
                    case 109413500: {
                        if (!string2.equals("short")) {
                            return;
                        }
                        bundle.putShort(s, (short)jsonObject.getInt("value"));
                        return;
                    }
                    case 100361105: {
                        if (!string2.equals("int[]")) {
                            return;
                        }
                        final JSONArray jsonArray3 = jsonObject.getJSONArray("value");
                        final int length3 = jsonArray3.length();
                        final int[] array3 = new int[length3];
                        final int n14 = length3 - 1;
                        if (n14 >= 0) {
                            int n15 = n2;
                            while (true) {
                                final int n16 = n15 + 1;
                                array3[n15] = jsonArray3.getInt(n15);
                                if (n16 > n14) {
                                    break;
                                }
                                n15 = n16;
                            }
                        }
                        ((BaseBundle)bundle).putIntArray(s, array3);
                        return;
                    }
                    case 97526364: {
                        if (!string2.equals("float")) {
                            return;
                        }
                        bundle.putFloat(s, (float)jsonObject.getDouble("value"));
                        return;
                    }
                    case 3327612: {
                        if (!string2.equals("long")) {
                            return;
                        }
                        ((BaseBundle)bundle).putLong(s, jsonObject.getLong("value"));
                        return;
                    }
                    case 3118337: {
                        if (!string2.equals("enum")) {
                            return;
                        }
                        break;
                    }
                    case 3052374: {
                        break Label_1211;
                    }
                    case 3039496: {
                        break Label_1211;
                    }
                    case 3029738: {
                        break Label_1211;
                    }
                    case 104431: {
                        break Label_1211;
                    }
                    case -766441794: {
                        break Label_1211;
                    }
                    case -891985903: {
                        break Label_1211;
                    }
                    case -1097129250: {
                        break Label_1211;
                    }
                    case -1325958191: {
                        break Label_1211;
                    }
                    case -1361632968: {
                        break Label_1211;
                    }
                    case -1374008726: {
                        break Label_1211;
                    }
                    case -1383386164: {
                        break Label_1211;
                    }
                    case -1573317553: {
                        break Label_1211;
                    }
                }
                try {
                    bundle.putSerializable(s, Enum.valueOf(Class.forName(jsonObject.getString("enumType")), jsonObject.getString("value")));
                    return;
                    // iftrue(Label_1054:, string2.equals((Object)"byte[]"))
                    return;
                    // iftrue(Label_1018:, string3 == null || string3.length() != 1)
                    // iftrue(Label_1139:, string2.equals((Object)"bool[]"))
                    // iftrue(Label_1339:, string4 == null || string4.length() != 1)
                    // iftrue(Label_0898:, n20 <= n21)
                    // iftrue(Label_1034:, n22 < 0)
                    // iftrue(Label_1315:, n24 < length5)
                    // iftrue(Label_1113:, n26 <= n27)
                    // iftrue(Label_1321:, value == null)
                    // iftrue(Label_0659:, string2.equals((Object)"byte"))
                    // iftrue(Label_0797:, n28 < 0)
                    // iftrue(Label_0684:, string2.equals((Object)"bool"))
                    // iftrue(Label_0732:, string2.equals((Object)"float[]"))
                    // iftrue(Label_1223:, string2.equals((Object)"stringList"))
                    // iftrue(Label_1332:, length5 <= 0)
                    // iftrue(Label_0924:, string2.equals((Object)"double"))
                    // iftrue(Block_28:, n21 < 0)
                    // iftrue(Label_1119:, n27 < 0)
                    // iftrue(Label_0949:, string2.equals((Object)"char[]"))
                    // iftrue(Label_1028:, n18 <= n22)
                    // iftrue(Label_1197:, n29 <= n30)
                    // iftrue(Label_0791:, n31 <= n28)
                    // iftrue(Label_1285:, value != JSONObject.NULL)
                    // iftrue(Label_0816:, string2.equals((Object)"string"))
                    // iftrue(Label_0708:, string2.equals((Object)"int"))
                    // iftrue(Label_0613:, string2.equals((Object)"char"))
                    // iftrue(Label_1203:, n30 < 0)
                Label_1119_Outer:
                    while (true) {
                        final JSONArray jsonArray9;
                    Label_0765_Outer:
                        while (true) {
                            Block_37: {
                            Label_0765:
                                while (true) {
                                Label_1297:
                                    while (true) {
                                        Object value = null;
                                        Block_44: {
                                            while (true) {
                                                float[] array4 = null;
                                                int n17;
                                                int n18;
                                                JSONArray jsonArray4;
                                                String string3;
                                                String element;
                                                int n20;
                                                int n19;
                                                long[] array5;
                                                char[] array6;
                                                String string4 = null;
                                                JSONArray jsonArray5;
                                                int n21;
                                                int length4;
                                                int n22;
                                                int n23 = 0;
                                                ArrayList list;
                                                int index = 0;
                                                final int n24;
                                                int length5;
                                                int n26;
                                                int n25;
                                                final boolean[] array7;
                                                byte[] array8;
                                                JSONArray jsonArray6;
                                                int n27;
                                                JSONArray jsonArray7 = null;
                                                int length6;
                                                int n28;
                                                int n29;
                                                JSONArray jsonArray8 = null;
                                                int length7;
                                                int length8;
                                                final int n32;
                                                int n31;
                                                Block_27_Outer:Label_1087_Outer:
                                                while (true) {
                                                    Label_1087:Block_34_Outer:
                                                    while (true) {
                                                    Block_36:
                                                        while (true) {
                                                            Label_1172: {
                                                                while (true) {
                                                                    Label_1018: {
                                                                        Block_18: {
                                                                            while (true) {
                                                                            Label_1332_Outer:
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        Label_0981:Block_42_Outer:
                                                                                        while (true) {
                                                                                        Block_28_Outer:
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    bundle.putFloatArray(s, array4);
                                                                                                    return;
                                                                                                    n17 = 0;
                                                                                                    break Label_0981;
                                                                                                    Label_1339: {
                                                                                                        return;
                                                                                                    }
                                                                                                    continue Block_28_Outer;
                                                                                                }
                                                                                                n18 = n17 + 1;
                                                                                                string3 = jsonArray4.getString(n17);
                                                                                                while (true) {
                                                                                                    Label_0873: {
                                                                                                        Block_33: {
                                                                                                            break Block_33;
                                                                                                            return;
                                                                                                            element = null;
                                                                                                            break Label_1297;
                                                                                                            Label_0898: {
                                                                                                                n19 = n20;
                                                                                                            }
                                                                                                            break Label_0873;
                                                                                                            ((BaseBundle)bundle).putLongArray(s, array5);
                                                                                                            return;
                                                                                                            n19 = n4;
                                                                                                            break Label_0873;
                                                                                                        }
                                                                                                        array6[n17] = string3.charAt(0);
                                                                                                        break Label_1018;
                                                                                                        Label_0613: {
                                                                                                            string4 = jsonObject.getString("value");
                                                                                                        }
                                                                                                        break Block_18;
                                                                                                    }
                                                                                                    n20 = n19 + 1;
                                                                                                    array5[n19] = jsonArray5.getLong(n19);
                                                                                                    continue Block_27_Outer;
                                                                                                }
                                                                                                Label_0949: {
                                                                                                    jsonArray4 = jsonObject.getJSONArray("value");
                                                                                                }
                                                                                                length4 = jsonArray4.length();
                                                                                                array6 = new char[length4];
                                                                                                n22 = length4 - 1;
                                                                                                continue Block_28_Outer;
                                                                                            }
                                                                                            n23 = n6;
                                                                                            break Label_1172;
                                                                                            list.add(index, element);
                                                                                            break Label_0981;
                                                                                            Label_1113: {
                                                                                                n25 = n26;
                                                                                            }
                                                                                            break Label_1087;
                                                                                            ((BaseBundle)bundle).putBooleanArray(s, array7);
                                                                                            return;
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    bundle.putCharArray(s, array6);
                                                                                                    return;
                                                                                                    n26 = n25 + 1;
                                                                                                    array8[n25] = (byte)jsonArray6.getInt(n25);
                                                                                                    break Block_37;
                                                                                                    index = n7;
                                                                                                    break Block_27_Outer;
                                                                                                    Label_1285:
                                                                                                    break Block_44;
                                                                                                    return;
                                                                                                    Label_0732:
                                                                                                    jsonArray7 = jsonObject.getJSONArray("value");
                                                                                                    length6 = jsonArray7.length();
                                                                                                    array4 = new float[length6];
                                                                                                    n28 = length6 - 1;
                                                                                                    break Label_1297;
                                                                                                    return;
                                                                                                    Label_1197:
                                                                                                    n23 = n29;
                                                                                                    break Label_1172;
                                                                                                    return;
                                                                                                    Label_1321:
                                                                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                                                                    bundle.putStringArrayList(s, list);
                                                                                                    return;
                                                                                                    continue Block_42_Outer;
                                                                                                }
                                                                                                return;
                                                                                                Label_1223:
                                                                                                jsonArray8 = jsonObject.getJSONArray("value");
                                                                                                length5 = jsonArray8.length();
                                                                                                list = new ArrayList<String>(length5);
                                                                                                continue Label_1332_Outer;
                                                                                            }
                                                                                            bundle.putByteArray(s, array8);
                                                                                            return;
                                                                                            return;
                                                                                            Label_1028:
                                                                                            n17 = n18;
                                                                                            continue Label_0981;
                                                                                        }
                                                                                        continue Block_34_Outer;
                                                                                    }
                                                                                    Label_1315: {
                                                                                        index = n24;
                                                                                    }
                                                                                    break Block_27_Outer;
                                                                                    Label_0659:
                                                                                    bundle.putByte(s, (byte)jsonObject.getInt("value"));
                                                                                    return;
                                                                                    continue Label_1332_Outer;
                                                                                }
                                                                                Label_0708: {
                                                                                    ((BaseBundle)bundle).putInt(s, jsonObject.getInt("value"));
                                                                                }
                                                                                return;
                                                                                Label_0840:
                                                                                jsonArray5 = jsonObject.getJSONArray("value");
                                                                                length7 = jsonArray5.length();
                                                                                array5 = new long[length7];
                                                                                n21 = length7 - 1;
                                                                                continue Label_1087_Outer;
                                                                            }
                                                                            Label_0684: {
                                                                                ((BaseBundle)bundle).putBoolean(s, jsonObject.getBoolean("value"));
                                                                            }
                                                                            return;
                                                                        }
                                                                        bundle.putChar(s, string4.charAt(0));
                                                                        return;
                                                                        Label_0924: {
                                                                            ((BaseBundle)bundle).putDouble(s, jsonObject.getDouble("value"));
                                                                        }
                                                                        return;
                                                                        Label_1054:
                                                                        jsonArray6 = jsonObject.getJSONArray("value");
                                                                        length8 = jsonArray6.length();
                                                                        array8 = new byte[length8];
                                                                        n27 = length8 - 1;
                                                                        break Block_36;
                                                                        return;
                                                                    }
                                                                    continue Label_1119_Outer;
                                                                }
                                                            }
                                                            n29 = n23 + 1;
                                                            array7[n23] = jsonArray9.getBoolean(n23);
                                                            continue Label_0765_Outer;
                                                        }
                                                        n25 = n5;
                                                        continue Label_1087;
                                                    }
                                                    n31 = n32 + 1;
                                                    array4[n32] = (float)jsonArray7.getDouble(n32);
                                                    continue Block_27_Outer;
                                                }
                                                n24 = index + 1;
                                                value = jsonArray8.get(index);
                                                continue Label_1119_Outer;
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                            Label_0791: {
                                                final int n31;
                                                final int n32 = n31;
                                            }
                                            continue Label_0765;
                                            return;
                                            Label_0816:
                                            ((BaseBundle)bundle).putString(s, jsonObject.getString("value"));
                                            return;
                                            return;
                                        }
                                        String element = (String)value;
                                        continue Label_1297;
                                    }
                                    final int n32 = n3;
                                    continue Label_0765;
                                }
                                return;
                            }
                            continue;
                        }
                        Label_1139: {
                            jsonArray9 = jsonObject.getJSONArray("value");
                        }
                        final int length9 = jsonArray9.length();
                        final boolean[] array7 = new boolean[length9];
                        final int n30 = length9 - 1;
                        continue Label_1119_Outer;
                    }
                }
                // iftrue(Label_0840:, string2.equals((Object)"long[]"))
                catch (ClassNotFoundException | IllegalArgumentException ex) {}
            }
        }
    }
    
    public final Bundle c() {
        final Bundle bundle = new Bundle();
        final Iterator<String> iterator = this.b.getAll().keySet().iterator();
        Bundle bundle2;
        while (true) {
            bundle2 = bundle;
            if (iterator.hasNext()) {
                final String obj = iterator.next();
                try {
                    Intrinsics.checkNotNullExpressionValue(obj, "key");
                    this.b(obj, bundle);
                    continue;
                }
                catch (JSONException obj2) {
                    final C.a e = C.e;
                    final N r = N.r;
                    final String d = M.d;
                    Intrinsics.checkNotNullExpressionValue(d, "TAG");
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error reading cached value for key: '");
                    sb.append((Object)obj);
                    sb.append("' -- ");
                    sb.append(obj2);
                    e.a(r, 5, d, sb.toString());
                    bundle2 = null;
                }
                break;
            }
            break;
        }
        return bundle2;
    }
    
    public static final class a
    {
        public final String a(final Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return ((BaseBundle)bundle).getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }
        
        public final Date b(final Bundle bundle, final String s) {
            if (bundle == null) {
                return null;
            }
            final long long1 = ((BaseBundle)bundle).getLong(s, Long.MIN_VALUE);
            if (long1 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(long1);
        }
        
        public final Date c(final Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return this.b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }
        
        public final Date d(final Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return this.b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }
        
        public final h e(final Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (((BaseBundle)bundle).containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (h)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            if (((BaseBundle)bundle).getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                return h.q;
            }
            return h.t;
        }
        
        public final String f(final Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return ((BaseBundle)bundle).getString("com.facebook.TokenCachingStrategy.Token");
        }
        
        public final boolean g(final Bundle bundle) {
            final boolean b = false;
            if (bundle == null) {
                return false;
            }
            final String string = ((BaseBundle)bundle).getString("com.facebook.TokenCachingStrategy.Token");
            boolean b2 = b;
            if (string != null) {
                if (string.length() == 0) {
                    return false;
                }
                b2 = b;
                if (((BaseBundle)bundle).getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
}
