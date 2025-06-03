/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.net.ssl.HttpsURLConnection
 *  org.json.JSONObject
 */
package T4;

import R4.b;
import V5.o;
import V5.t;
import X5.g;
import Z5.k;
import android.net.Uri;
import g6.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import p6.I;

public final class d
implements T4.a {
    public static final a d = new a(null);
    public final b a;
    public final g b;
    public final String c;

    public d(b b8, g g8, String string2) {
        Intrinsics.checkNotNullParameter(b8, "appInfo");
        Intrinsics.checkNotNullParameter(g8, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(string2, "baseUrl");
        this.a = b8;
        this.b = g8;
        this.c = string2;
    }

    public /* synthetic */ d(b b8, g g8, String string2, int n8, kotlin.jvm.internal.g g9) {
        if ((n8 & 4) != 0) {
            string2 = "firebase-settings.crashlytics.com";
        }
        this(b8, g8, string2);
    }

    public static final /* synthetic */ URL b(d d8) {
        return d8.c();
    }

    @Override
    public Object a(Map object, p p8, p p9, X5.d d8) {
        if ((object = p6.g.g(this.b, new p(this, (Map)object, p8, p9, null){
            public int o;
            public final /* synthetic */ d p;
            public final /* synthetic */ Map q;
            public final /* synthetic */ p r;
            public final /* synthetic */ p s;
            {
                this.p = d8;
                this.q = map;
                this.r = p8;
                this.s = p9;
                super(2, d9);
            }

            @Override
            public final X5.d create(Object object, X5.d d8) {
                return new ;
            }

            public final Object invoke(I i8, X5.d d8) {
                return (this.create(i8, d8)).invokeSuspend(t.a);
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object var1_1) {
                block12 : {
                    block11 : {
                        var4_2 = Y5.b.c();
                        var2_3 = this.o;
                        if (var2_3 != 0) {
                            if (var2_3 != 1 && var2_3 != 2) {
                                if (var2_3 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                o.b(var1_1);
                                return t.a;
                            }
                            o.b(var1_1);
                            return t.a;
                        }
                        o.b(var1_1);
                        try {
                            var1_1 = d.b(this.p).openConnection();
                            Intrinsics.c(var1_1, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                            var1_1 = (HttpsURLConnection)var1_1;
                            var1_1.setRequestMethod("GET");
                            var1_1.setRequestProperty("Accept", "application/json");
                            var3_4 = this.q.entrySet().iterator();
                            while (var3_4.hasNext()) {
                                var5_5 = (Map.Entry)var3_4.next();
                                var1_1.setRequestProperty((String)var5_5.getKey(), (String)var5_5.getValue());
                            }
                            var2_3 = var1_1.getResponseCode();
                            ** if (var2_3 != 200) goto lbl-1000
                        }
                        catch (Exception var6_6) {}
lbl-1000: // 1 sources:
                        {
                            var1_1 = var1_1.getInputStream();
                            var3_4 = new BufferedReader((Reader)new InputStreamReader((InputStream)var1_1));
                            var5_5 = new StringBuilder();
                            var6_7 = new u();
                            do {
                                var7_8 = var3_4.readLine();
                                var6_7.o = var7_8;
                                if (var7_8 == null) {
                                    var3_4.close();
                                    var1_1.close();
                                    var1_1 = new JSONObject(var5_5.toString());
                                    var3_4 = this.r;
                                    this.o = 1;
                                    if (var3_4.invoke(var1_1, this) != var4_2) return t.a;
                                    return var4_2;
                                }
                                var5_5.append(var7_8);
                            } while (true);
                        }
lbl-1000: // 1 sources:
                        {
                            break block11;
                        }
                        break block12;
                    }
                    var1_1 = this.s;
                    var3_4 = new StringBuilder();
                    var3_4.append("Bad response code: ");
                    var3_4.append(var2_3);
                    var3_4 = var3_4.toString();
                    this.o = 2;
                    var1_1 = var1_1.invoke(var3_4, this);
                    if (var1_1 != var4_2) return t.a;
                    return var4_2;
                }
                var5_5 = this.s;
                var1_1 = var3_4 = var6_6.getMessage();
                if (var3_4 == null) {
                    var1_1 = var6_6.toString();
                }
                this.o = 3;
                if (var5_5.invoke(var1_1, this) != var4_2) return t.a;
                return var4_2;
            }
        }, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.b()).appendPath("settings").appendQueryParameter("build_version", this.a.a().a()).appendQueryParameter("display_version", this.a.a().d()).build().toString());
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

