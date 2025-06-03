/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.EnumSet
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package O1;

import O1.P;
import O1.j;
import W5.m;
import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;

public final class r {
    public static final a w = new a(null);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final int d;
    public final EnumSet e;
    public final Map f;
    public final boolean g;
    public final j h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final JSONArray m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final String r;
    public final String s;
    public final JSONArray t;
    public final JSONArray u;
    public final Map v;

    public r(boolean bl, String string2, boolean bl2, int n8, EnumSet enumSet, Map map, boolean bl3, j j8, String string3, String string4, boolean bl4, boolean bl5, JSONArray jSONArray, String string5, boolean bl6, boolean bl7, String string6, String string7, String string8, JSONArray jSONArray2, JSONArray jSONArray3, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "nuxContent");
        Intrinsics.checkNotNullParameter((Object)enumSet, "smartLoginOptions");
        Intrinsics.checkNotNullParameter((Object)map, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(j8, "errorClassification");
        Intrinsics.checkNotNullParameter(string3, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(string4, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(string5, "sdkUpdateMessage");
        this.a = bl;
        this.b = string2;
        this.c = bl2;
        this.d = n8;
        this.e = enumSet;
        this.f = map;
        this.g = bl3;
        this.h = j8;
        this.i = string3;
        this.j = string4;
        this.k = bl4;
        this.l = bl5;
        this.m = jSONArray;
        this.n = string5;
        this.o = bl6;
        this.p = bl7;
        this.q = string6;
        this.r = string7;
        this.s = string8;
        this.t = jSONArray2;
        this.u = jSONArray3;
        this.v = map2;
    }

    public final boolean a() {
        return this.g;
    }

    public final boolean b() {
        return this.l;
    }

    public final j c() {
        return this.h;
    }

    public final JSONArray d() {
        return this.m;
    }

    public final boolean e() {
        return this.k;
    }

    public final JSONArray f() {
        return this.u;
    }

    public final JSONArray g() {
        return this.t;
    }

    public final String h() {
        return this.q;
    }

    public final String i() {
        return this.s;
    }

    public final String j() {
        return this.n;
    }

    public final int k() {
        return this.d;
    }

    public final EnumSet l() {
        return this.e;
    }

    public final String m() {
        return this.r;
    }

    public final boolean n() {
        return this.a;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b {
        public static final a e = new a(null);
        public final String a;
        public final String b;
        public final Uri c;
        public final int[] d;

        public b(String string2, String string3, Uri uri, int[] arrn) {
            this.a = string2;
            this.b = string3;
            this.c = uri;
            this.d = arrn;
        }

        public /* synthetic */ b(String string2, String string3, Uri uri, int[] arrn, g g8) {
            this(string2, string3, uri, arrn);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }

            public final b a(JSONObject jSONObject) {
                Intrinsics.checkNotNullParameter((Object)jSONObject, "dialogConfigJSON");
                String string2 = jSONObject.optString("name");
                boolean bl = P.c0(string2);
                Uri uri = null;
                if (bl) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(string2, "dialogNameWithFeature");
                Object object = i.V(string2, new String[]{"|"}, false, 0, 6, null);
                if (object.size() != 2) {
                    return null;
                }
                string2 = (String)m.r((List)object);
                object = (String)m.z((List)object);
                if (!P.c0(string2)) {
                    if (P.c0((String)object)) {
                        return null;
                    }
                    String string3 = jSONObject.optString("url");
                    if (!P.c0(string3)) {
                        uri = Uri.parse((String)string3);
                    }
                    return new b(string2, (String)object, uri, this.b(jSONObject.optJSONArray("versions")), null);
                }
                return null;
            }

            public final int[] b(JSONArray jSONArray) {
                Object object;
                if (jSONArray != null) {
                    int n8 = jSONArray.length();
                    int[] arrn = new int[n8];
                    object = arrn;
                    if (n8 > 0) {
                        int n9 = 0;
                        do {
                            int n10;
                            int n11 = n9 + 1;
                            int n12 = -1;
                            int n13 = n10 = jSONArray.optInt(n9, -1);
                            if (n10 == -1) {
                                object = jSONArray.optString(n9);
                                n13 = n10;
                                if (!P.c0((String)object)) {
                                    try {
                                        Intrinsics.checkNotNullExpressionValue(object, "versionString");
                                        n13 = Integer.parseInt((String)object);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        P.i0("FacebookSDK", (Exception)numberFormatException);
                                        n13 = n12;
                                    }
                                }
                            }
                            arrn[n9] = n13;
                            if (n11 >= n8) {
                                return arrn;
                            }
                            n9 = n11;
                        } while (true);
                    }
                } else {
                    object = null;
                }
                return object;
            }
        }

    }

}

