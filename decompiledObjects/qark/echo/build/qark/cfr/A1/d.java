/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package A1;

import A1.c;
import A1.g;
import A1.o;
import O1.C;
import O1.P;
import T1.a;
import W5.m;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.I;
import x1.K;
import x1.L;
import x1.N;
import x1.r;

public final class d {
    public static final d a = new d();
    public static final String b = d.class.getCanonicalName();
    public static boolean c;

    public static /* synthetic */ void a(K k8) {
        d.c(k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b() {
        try {
            Object object = new c();
            object = new F(null, Intrinsics.i(B.m(), "/cloudbridge_settings"), null, L.o, (F.b)object, null, 32, null);
            C.a a8 = C.e;
            N n8 = N.s;
            String string2 = b;
            if (string2 != null) {
                a8.c(n8, string2, " \n\nCreating Graph Request: \n=============\n%s\n\n ", object);
                object.l();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        catch (JSONException jSONException) {}
        C.a a9 = C.e;
        N n9 = N.s;
        String string3 = b;
        if (string3 != null) {
            a9.c(n9, string3, " \n\nGraph Request Exception: \n=============\n%s\n\n ", V5.a.b((Throwable)jSONException));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public static final void c(K k8) {
        Intrinsics.checkNotNullParameter(k8, "response");
        a.d(k8);
    }

    public static final Map e() {
        Throwable throwable2;
        block13 : {
            block11 : {
                o o8;
                o o9;
                String string2;
                o o10;
                String string3;
                Object object;
                block12 : {
                    block10 : {
                        if (a.d(d.class)) {
                            return null;
                        }
                        try {
                            object = B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                            if (object != null) break block10;
                            return null;
                        }
                        catch (Throwable throwable2) {}
                    }
                    o9 = o.r;
                    string3 = object.getString(o9.e(), null);
                    o10 = o.p;
                    string2 = object.getString(o10.e(), null);
                    o8 = o.s;
                    object = object.getString(o8.e(), null);
                    if (string3 == null) break block11;
                    if (i.F(string3)) {
                        return null;
                    }
                    if (string2 == null) break block11;
                    if (i.F(string2)) {
                        return null;
                    }
                    if (object == null) break block11;
                    if (!i.F((CharSequence)object)) break block12;
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put((Object)o10.e(), (Object)string2);
                linkedHashMap.put((Object)o9.e(), (Object)string3);
                linkedHashMap.put((Object)o8.e(), object);
                C.e.c(N.s, b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string3, string2, object);
                return linkedHashMap;
                break block13;
            }
            return null;
        }
        a.b(throwable2, d.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(K object) {
        N n8;
        Object object2;
        String string2;
        JSONException jSONException2;
        block15 : {
            NullPointerException nullPointerException2;
            block12 : {
                block13 : {
                    boolean bl = false;
                    Intrinsics.checkNotNullParameter(object, "response");
                    if (object.b() != null) {
                        C.a a8 = C.e;
                        Object object3 = N.s;
                        String string3 = b;
                        if (string3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        a8.c((N)((Object)object3), string3, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", object.b().toString(), String.valueOf((Object)((Object)object.b().e())));
                        object = d.e();
                        if (object != null) {
                            a8 = new URL(String.valueOf((Object)object.get((Object)o.p.e())));
                            object3 = g.a;
                            object3 = String.valueOf((Object)object.get((Object)o.r.e()));
                            string3 = new StringBuilder();
                            string3.append(a8.getProtocol());
                            string3.append("://");
                            string3.append((Object)a8.getHost());
                            g.d((String)object3, string3.toString(), String.valueOf((Object)object.get((Object)o.s.e())));
                            c = true;
                        }
                        return;
                    }
                    object2 = C.e;
                    n8 = N.s;
                    string2 = b;
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    object2.c(n8, string2, " \n\nGraph Response Received: \n================\n%s\n\n ", object);
                    object = object.c();
                    Object object4 = P.a;
                    object = object == null ? null : object.get("data");
                    if (object == null) break block12;
                    object = P.n(new JSONObject((String)m.s(P.m((JSONArray)object))));
                    object4 = (String)object.get((Object)o.p.e());
                    String string4 = (String)object.get((Object)o.r.e());
                    String string5 = (String)object.get((Object)o.s.e());
                    if (object4 == null || string4 == null || string5 == null) break block13;
                    try {
                        g.d(string4, (String)object4, string5);
                        this.g((Map)object);
                        object2 = o.q;
                    }
                    catch (MalformedURLException malformedURLException) {
                        object2 = C.e;
                        n8 = N.s;
                        string2 = b;
                        Intrinsics.checkNotNullExpressionValue(string2, "TAG");
                        object2.c(n8, string2, "CloudBridge Settings API response doesn't have valid url\n %s ", V5.a.b((Throwable)malformedURLException));
                        return;
                    }
                    if (object.get((Object)object2.e()) != null) {
                        if ((object = object.get((Object)object2.e())) == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        bl = (Boolean)object;
                    }
                    c = bl;
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(string2, "TAG");
                object2.b(n8, string2, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            catch (NullPointerException nullPointerException2) {
            }
            catch (JSONException jSONException2) {
                break block15;
            }
            object2 = C.e;
            n8 = N.s;
            string2 = b;
            Intrinsics.checkNotNullExpressionValue(string2, "TAG");
            object2.c(n8, string2, "CloudBridge Settings API response is not a valid json: \n%s ", V5.a.b((Throwable)nullPointerException2));
            return;
        }
        object2 = C.e;
        n8 = N.s;
        string2 = b;
        Intrinsics.checkNotNullExpressionValue(string2, "TAG");
        object2.c(n8, string2, "CloudBridge Settings API response is not a valid json: \n%s ", V5.a.b((Throwable)jSONException2));
    }

    public final boolean f() {
        return c;
    }

    public final void g(Map object) {
        SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (object == null) {
            object = sharedPreferences.edit();
            object.clear();
            object.apply();
            return;
        }
        o o8 = o.r;
        Object object2 = object.get((Object)o8.e());
        o o9 = o.p;
        Object object3 = object.get((Object)o9.e());
        o o10 = o.s;
        object = object.get((Object)o10.e());
        if (object2 != null && object3 != null) {
            if (object == null) {
                return;
            }
            sharedPreferences = sharedPreferences.edit();
            sharedPreferences.putString(o8.e(), object2.toString());
            sharedPreferences.putString(o9.e(), object3.toString());
            sharedPreferences.putString(o10.e(), object.toString());
            sharedPreferences.apply();
            C.e.c(N.s, b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", object2, object3, object);
        }
    }
}

