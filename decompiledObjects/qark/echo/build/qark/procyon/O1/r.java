// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.List;
import W5.m;
import kotlin.text.i;
import org.json.JSONObject;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import java.util.Map;
import java.util.EnumSet;

public final class r
{
    public static final a w;
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
    
    static {
        w = new a(null);
    }
    
    public r(final boolean a, final String b, final boolean c, final int d, final EnumSet e, final Map f, final boolean g, final j h, final String i, final String j, final boolean k, final boolean l, final JSONArray m, final String n, final boolean o, final boolean p22, final String q, final String r, final String s, final JSONArray t, final JSONArray u, final Map v) {
        Intrinsics.checkNotNullParameter(b, "nuxContent");
        Intrinsics.checkNotNullParameter(e, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(f, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(h, "errorClassification");
        Intrinsics.checkNotNullParameter(i, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(j, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(n, "sdkUpdateMessage");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p22;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
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
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public static final a e;
        public final String a;
        public final String b;
        public final Uri c;
        public final int[] d;
        
        static {
            e = new a(null);
        }
        
        public b(final String a, final String b, final Uri c, final int[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public final String a() {
            return this.a;
        }
        
        public final String b() {
            return this.b;
        }
        
        public static final class a
        {
            public final b a(final JSONObject jsonObject) {
                Intrinsics.checkNotNullParameter(jsonObject, "dialogConfigJSON");
                final String optString = jsonObject.optString("name");
                final boolean c0 = P.c0(optString);
                Uri parse = null;
                if (c0) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "dialogNameWithFeature");
                final List v = kotlin.text.i.V(optString, new String[] { "|" }, false, 0, 6, null);
                if (v.size() != 2) {
                    return null;
                }
                final String s = (String)W5.m.r(v);
                final String s2 = (String)W5.m.z(v);
                if (P.c0(s)) {
                    return null;
                }
                if (P.c0(s2)) {
                    return null;
                }
                final String optString2 = jsonObject.optString("url");
                if (!P.c0(optString2)) {
                    parse = Uri.parse(optString2);
                }
                return new b(s, s2, parse, this.b(jsonObject.optJSONArray("versions")), null);
            }
            
            public final int[] b(final JSONArray jsonArray) {
                int[] array2;
                if (jsonArray != null) {
                    final int length = jsonArray.length();
                    final int[] array = array2 = new int[length];
                    if (length > 0) {
                        int n = 0;
                        while (true) {
                            final int n2 = n + 1;
                            final int n3 = -1;
                            int n5;
                            final int n4 = n5 = jsonArray.optInt(n, -1);
                            if (n4 == -1) {
                                final String optString = jsonArray.optString(n);
                                n5 = n4;
                                if (!P.c0(optString)) {
                                    try {
                                        Intrinsics.checkNotNullExpressionValue(optString, "versionString");
                                        n5 = Integer.parseInt(optString);
                                    }
                                    catch (NumberFormatException ex) {
                                        P.i0("FacebookSDK", ex);
                                        n5 = n3;
                                    }
                                }
                            }
                            array[n] = n5;
                            if (n2 >= length) {
                                break;
                            }
                            n = n2;
                        }
                        return array;
                    }
                }
                else {
                    array2 = null;
                }
                return array2;
            }
        }
    }
}
