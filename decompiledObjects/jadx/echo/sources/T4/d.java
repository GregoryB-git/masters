package T4;

import V5.o;
import V5.t;
import Z5.k;
import android.net.Uri;
import g6.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import p6.AbstractC1848g;
import p6.I;

/* loaded from: classes.dex */
public final class d implements T4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6240d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final R4.b f6241a;

    /* renamed from: b, reason: collision with root package name */
    public final X5.g f6242b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6243c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public int f6244o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map f6246q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f6247r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ p f6248s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, p pVar, p pVar2, X5.d dVar) {
            super(2, dVar);
            this.f6246q = map;
            this.f6247r = pVar;
            this.f6248s = pVar2;
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            return d.this.new b(this.f6246q, this.f6247r, this.f6248s, dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f6244o;
            try {
                if (i7 == 0) {
                    o.b(obj);
                    URLConnection openConnection = d.this.c().openConnection();
                    Intrinsics.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f6246q.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        u uVar = new u();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            uVar.f16230o = readLine;
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        p pVar = this.f6247r;
                        this.f6244o = 1;
                        if (pVar.invoke(jSONObject, this) == c7) {
                            return c7;
                        }
                    } else {
                        p pVar2 = this.f6248s;
                        String str = "Bad response code: " + responseCode;
                        this.f6244o = 2;
                        if (pVar2.invoke(str, this) == c7) {
                            return c7;
                        }
                    }
                } else if (i7 == 1 || i7 == 2) {
                    o.b(obj);
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
            } catch (Exception e7) {
                p pVar3 = this.f6248s;
                String message = e7.getMessage();
                if (message == null) {
                    message = e7.toString();
                }
                this.f6244o = 3;
                if (pVar3.invoke(message, this) == c7) {
                    return c7;
                }
            }
            return t.f6803a;
        }

        @Override // g6.p
        public final Object invoke(I i7, X5.d dVar) {
            return ((b) create(i7, dVar)).invokeSuspend(t.f6803a);
        }
    }

    public d(R4.b appInfo, X5.g blockingDispatcher, String baseUrl) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f6241a = appInfo;
        this.f6242b = blockingDispatcher;
        this.f6243c = baseUrl;
    }

    @Override // T4.a
    public Object a(Map map, p pVar, p pVar2, X5.d dVar) {
        Object c7;
        Object g7 = AbstractC1848g.g(this.f6242b, new b(map, pVar, pVar2, null), dVar);
        c7 = Y5.d.c();
        return g7 == c7 ? g7 : t.f6803a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f6243c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f6241a.b()).appendPath("settings").appendQueryParameter("build_version", this.f6241a.a().a()).appendQueryParameter("display_version", this.f6241a.a().d()).build().toString());
    }

    public /* synthetic */ d(R4.b bVar, X5.g gVar, String str, int i7, kotlin.jvm.internal.g gVar2) {
        this(bVar, gVar, (i7 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
