// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T4;

import android.net.Uri$Builder;
import java.net.URLConnection;
import java.util.Iterator;
import java.io.InputStream;
import kotlin.jvm.internal.u;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import V5.o;
import V5.t;
import p6.I;
import Z5.k;
import g6.p;
import java.util.Map;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import X5.g;
import R4.b;

public final class d implements T4.a
{
    public static final a d;
    public final b a;
    public final g b;
    public final String c;
    
    static {
        d = new a(null);
    }
    
    public d(final b a, final g b, final String c) {
        Intrinsics.checkNotNullParameter(a, "appInfo");
        Intrinsics.checkNotNullParameter(b, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(c, "baseUrl");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public Object a(final Map map, final p p4, final p p5, final X5.d d) {
        final Object g = p6.g.g(this.b, new p(p5) {
            public int o;
            public final /* synthetic */ d p;
            public final /* synthetic */ Map q;
            public final /* synthetic */ p r;
            public final /* synthetic */ p s;
            
            @Override
            public final d create(final Object o, final d d) {
                return new p() {
                    public int o;
                    public final /* synthetic */ d p = this.p;
                    public final /* synthetic */ Map q = this.q;
                    public final /* synthetic */ p r = this.r;
                    public final /* synthetic */ p s = this.s;
                };
            }
            
            public final Object invoke(final I i, final d d) {
                return ((d$b)this.create(i, d)).invokeSuspend(t.a);
            }
            
            @Override
            public final Object invokeSuspend(Object invoke) {
                final Object c = Y5.b.c();
                final int o = this.o;
                Label_0058: {
                    if (o == 0) {
                        break Label_0058;
                    }
                    if (o != 1 && o != 2) {
                        if (o == 3) {
                            V5.o.b(invoke);
                            return t.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        V5.o.b(invoke);
                    }
                    catch (Exception ex) {
                        final p s = this.s;
                        String s2;
                        if ((s2 = ex.getMessage()) == null) {
                            s2 = ex.toString();
                        }
                        this.o = 3;
                        if (s.invoke(s2, this) == c) {
                            return c;
                        }
                        return t.a;
                        Label_0240: {
                            final BufferedReader bufferedReader;
                            bufferedReader.close();
                        }
                        InputStream inputStream = null;
                        inputStream.close();
                        StringBuilder sb = null;
                        invoke = new JSONObject(sb.toString());
                        final p r = this.r;
                        this.o = 1;
                        // iftrue(Label_0387:, r.invoke(invoke, (Object)this) != c)
                        return c;
                        // iftrue(Label_0160:, !iterator.hasNext())
                        // iftrue(Label_0240:, line == null)
                        // iftrue(Label_0387:, invoke != c)
                        while (true) {
                            HttpsURLConnection httpsURLConnection = null;
                        Label_0211_Outer:
                            while (true) {
                                Iterator<Map.Entry<String, V>> iterator = null;
                                Block_7: {
                                    break Block_7;
                                    while (true) {
                                        final BufferedReader bufferedReader;
                                        final String line = bufferedReader.readLine();
                                        final u u;
                                        u.o = line;
                                        Block_9: {
                                            break Block_9;
                                            Label_0287:
                                            final p s3 = this.s;
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Bad response code: ");
                                            final int responseCode;
                                            sb2.append(responseCode);
                                            final String string = sb2.toString();
                                            this.o = 2;
                                            invoke = s3.invoke(string, this);
                                            return c;
                                            V5.o.b(invoke);
                                            final URLConnection openConnection = d.this.c().openConnection();
                                            Intrinsics.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                                            httpsURLConnection = (HttpsURLConnection)openConnection;
                                            httpsURLConnection.setRequestMethod("GET");
                                            httpsURLConnection.setRequestProperty("Accept", "application/json");
                                            iterator = this.q.entrySet().iterator();
                                            continue Label_0211_Outer;
                                        }
                                        sb.append(line);
                                        continue;
                                        inputStream = httpsURLConnection.getInputStream();
                                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                        sb = new StringBuilder();
                                        u = new u();
                                        continue;
                                    }
                                }
                                final Map.Entry<String, V> entry = iterator.next();
                                httpsURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
                                continue;
                            }
                            Label_0160:
                            final int responseCode = httpsURLConnection.getResponseCode();
                            continue;
                        }
                    }
                    // iftrue(Label_0287:, responseCode != 200)
                }
                Label_0387: {
                    return t.a;
                }
            }
        }, d);
        if (g == Y5.b.c()) {
            return g;
        }
        return t.a;
    }
    
    public final URL c() {
        return new URL(new Uri$Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.b()).appendPath("settings").appendQueryParameter("build_version", this.a.a().a()).appendQueryParameter("display_version", this.a.a().d()).build().toString());
    }
    
    public static final class a
    {
    }
}
