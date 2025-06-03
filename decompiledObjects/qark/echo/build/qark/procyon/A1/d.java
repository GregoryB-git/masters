// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import android.content.SharedPreferences$Editor;
import java.net.MalformedURLException;
import org.json.JSONObject;
import W5.m;
import org.json.JSONArray;
import O1.P;
import java.net.URL;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import kotlin.text.i;
import java.util.Map;
import org.json.JSONException;
import x1.N;
import O1.C;
import kotlin.jvm.internal.g;
import android.os.Bundle;
import x1.a;
import x1.F;
import x1.L;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.K;

public final class d
{
    public static final d a;
    public static final String b;
    public static boolean c;
    
    static {
        a = new d();
        b = d.class.getCanonicalName();
    }
    
    public static final void b() {
        while (true) {
            try {
                final F f = new F(null, Intrinsics.i(B.m(), "/cloudbridge_settings"), null, L.o, (F.b)new c(), null, 32, null);
                final C.a e = C.e;
                final N s = N.s;
                final String b = d.b;
                if (b != null) {
                    e.c(s, b, " \n\nCreating Graph Request: \n=============\n%s\n\n ", f);
                    f.l();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                while (true) {
                    final C.a e2;
                    final N s2;
                    final String b2;
                    final JSONException ex;
                    e2.c(s2, b2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", V5.a.b((Throwable)ex));
                    return;
                    Label_0118: {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    e2 = C.e;
                    s2 = N.s;
                    b2 = d.b;
                    continue;
                }
            }
            // iftrue(Label_0118:, b2 == null)
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final void c(final K k) {
        Intrinsics.checkNotNullParameter(k, "response");
        d.a.d(k);
    }
    
    public static final Map e() {
        if (T1.a.d(d.class)) {
            return null;
        }
        Label_0216: {
            try {
                final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                if (sharedPreferences == null) {
                    return null;
                }
                final o r = o.r;
                final String string = sharedPreferences.getString(r.e(), (String)null);
                final o p = o.p;
                final String string2 = sharedPreferences.getString(p.e(), (String)null);
                final o s = o.s;
                final String string3 = sharedPreferences.getString(s.e(), (String)null);
                if (string != null) {
                    if (i.F(string)) {
                        return null;
                    }
                    if (string2 != null) {
                        if (i.F(string2)) {
                            return null;
                        }
                        if (string3 != null) {
                            if (i.F(string3)) {
                                return null;
                            }
                            final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
                            linkedHashMap.put(p.e(), string2);
                            linkedHashMap.put(r.e(), string);
                            linkedHashMap.put(s.e(), string3);
                            C.e.c(N.s, d.b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                            return linkedHashMap;
                        }
                    }
                }
            }
            finally {
                break Label_0216;
            }
            return null;
        }
        final Throwable t;
        T1.a.b(t, d.class);
        return null;
    }
    
    public final void d(final K k) {
        boolean booleanValue = false;
        Intrinsics.checkNotNullParameter(k, "response");
        if (k.b() != null) {
            final C.a e = C.e;
            final N s = N.s;
            final String b = d.b;
            if (b != null) {
                e.c(s, b, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", k.b().toString(), String.valueOf(k.b().e()));
                final Map e2 = e();
                if (e2 != null) {
                    final URL url = new URL(String.valueOf(e2.get(o.p.e())));
                    final A1.g a = A1.g.a;
                    final String value = String.valueOf(e2.get(o.r.e()));
                    final StringBuilder sb = new StringBuilder();
                    sb.append(url.getProtocol());
                    sb.append("://");
                    sb.append((Object)url.getHost());
                    A1.g.d(value, sb.toString(), String.valueOf(e2.get(o.s.e())));
                    d.c = true;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        else {
            final C.a e3 = C.e;
            final N s2 = N.s;
            final String b2 = d.b;
            if (b2 != null) {
                e3.c(s2, b2, " \n\nGraph Response Received: \n================\n%s\n\n ", k);
                final JSONObject c = k.c();
                Label_0564: {
                    Label_0519: {
                        try {
                            final P a2 = P.a;
                            Object value2;
                            if (c == null) {
                                value2 = null;
                            }
                            else {
                                value2 = c.get("data");
                            }
                            if (value2 != null) {
                                final Map n = P.n(new JSONObject((String)m.s(P.m((JSONArray)value2))));
                                final String s3 = n.get(o.p.e());
                                final String s4 = n.get(o.r.e());
                                final String s5 = n.get(o.s.e());
                                if (s3 != null && s4 != null) {
                                    if (s5 != null) {
                                        try {
                                            A1.g.d(s4, s3, s5);
                                            this.g(n);
                                            final o q = o.q;
                                            if (n.get(q.e()) != null) {
                                                final String value3 = n.get(q.e());
                                                if (value3 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                                }
                                                booleanValue = (boolean)value3;
                                            }
                                            d.c = booleanValue;
                                            return;
                                        }
                                        catch (MalformedURLException ex) {
                                            final C.a e4 = C.e;
                                            final N s6 = N.s;
                                            final String b3 = d.b;
                                            Intrinsics.checkNotNullExpressionValue(b3, "TAG");
                                            e4.c(s6, b3, "CloudBridge Settings API response doesn't have valid url\n %s ", V5.a.b(ex));
                                            return;
                                        }
                                    }
                                }
                                Intrinsics.checkNotNullExpressionValue(b2, "TAG");
                                e3.b(s2, b2, "CloudBridge Settings API response doesn't have valid data");
                                return;
                            }
                        }
                        catch (NullPointerException ex2) {
                            break Label_0519;
                        }
                        catch (JSONException ex3) {
                            break Label_0564;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    final C.a e5 = C.e;
                    final N s7 = N.s;
                    final String b4 = d.b;
                    Intrinsics.checkNotNullExpressionValue(b4, "TAG");
                    final NullPointerException ex2;
                    e5.c(s7, b4, "CloudBridge Settings API response is not a valid json: \n%s ", V5.a.b(ex2));
                    return;
                }
                final C.a e6 = C.e;
                final N s8 = N.s;
                final String b5 = d.b;
                Intrinsics.checkNotNullExpressionValue(b5, "TAG");
                final JSONException ex3;
                e6.c(s8, b5, "CloudBridge Settings API response is not a valid json: \n%s ", V5.a.b((Throwable)ex3));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }
    
    public final boolean f() {
        return d.c;
    }
    
    public final void g(final Map map) {
        final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            final SharedPreferences$Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        final o r = o.r;
        final Object value = map.get(r.e());
        final o p = o.p;
        final Object value2 = map.get(p.e());
        final o s = o.s;
        final Object value3 = map.get(s.e());
        if (value != null && value2 != null) {
            if (value3 == null) {
                return;
            }
            final SharedPreferences$Editor edit2 = sharedPreferences.edit();
            edit2.putString(r.e(), value.toString());
            edit2.putString(p.e(), value2.toString());
            edit2.putString(s.e(), value3.toString());
            edit2.apply();
            C.e.c(N.s, d.b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", value, value2, value3);
        }
    }
}
