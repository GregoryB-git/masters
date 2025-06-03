package com.google.firebase.remoteconfig.internal;

import E2.h;
import E2.j;
import P4.n;
import P4.o;
import P4.r;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import V2.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import s3.C1947e;
import s4.i;

/* loaded from: classes.dex */
public class e {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f11934q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f11935r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Set f11936a;

    /* renamed from: c, reason: collision with root package name */
    public int f11938c;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f11942g;

    /* renamed from: h, reason: collision with root package name */
    public final c f11943h;

    /* renamed from: i, reason: collision with root package name */
    public final C1947e f11944i;

    /* renamed from: j, reason: collision with root package name */
    public final i f11945j;

    /* renamed from: k, reason: collision with root package name */
    public Q4.e f11946k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f11947l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11948m;

    /* renamed from: p, reason: collision with root package name */
    public final d f11951p;

    /* renamed from: f, reason: collision with root package name */
    public final int f11941f = 8;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11937b = false;

    /* renamed from: n, reason: collision with root package name */
    public final Random f11949n = new Random();

    /* renamed from: o, reason: collision with root package name */
    public final E2.e f11950o = h.d();

    /* renamed from: d, reason: collision with root package name */
    public boolean f11939d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11940e = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.e();
        }
    }

    public e(C1947e c1947e, i iVar, c cVar, Q4.e eVar, Context context, String str, Set set, d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f11936a = set;
        this.f11942g = scheduledExecutorService;
        this.f11938c = Math.max(8 - dVar.h().b(), 1);
        this.f11944i = c1947e;
        this.f11943h = cVar;
        this.f11945j = iVar;
        this.f11946k = eVar;
        this.f11947l = context;
        this.f11948m = str;
        this.f11951p = dVar;
    }

    public static String k(String str) {
        Matcher matcher = f11935r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public void A(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.a B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.f11943h, this.f11946k, this.f11936a, new b(), this.f11942g);
    }

    public void C() {
        s(0L);
    }

    public final void D(Date date) {
        int b7 = this.f11951p.h().b() + 1;
        this.f11951p.o(b7, new Date(date.getTime() + m(b7)));
    }

    public void e() {
        if (f()) {
            if (new Date(this.f11950o.a()).before(this.f11951p.h().a())) {
                w();
            } else {
                final AbstractC0659j h7 = h();
                m.i(h7).g(this.f11942g, new InterfaceC0651b() { // from class: Q4.n
                    @Override // V2.InterfaceC0651b
                    public final Object a(AbstractC0659j abstractC0659j) {
                        AbstractC0659j q7;
                        q7 = com.google.firebase.remoteconfig.internal.e.this.q(h7, abstractC0659j);
                        return q7;
                    }
                });
            }
        }
    }

    public final synchronized boolean f() {
        boolean z7;
        if (!this.f11936a.isEmpty() && !this.f11937b && !this.f11939d) {
            z7 = this.f11940e ? false : true;
        }
        return z7;
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC0659j h() {
        final AbstractC0659j b7 = this.f11945j.b(false);
        final AbstractC0659j a7 = this.f11945j.a();
        return m.i(b7, a7).h(this.f11942g, new InterfaceC0651b() { // from class: Q4.o
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                AbstractC0659j r7;
                r7 = com.google.firebase.remoteconfig.internal.e.this.r(b7, a7, abstractC0659j);
                return r7;
            }
        });
    }

    public final JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.f11944i.r().c()));
        hashMap.put("namespace", this.f11948m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f11943h.r()));
        hashMap.put("appId", this.f11944i.r().c());
        hashMap.put("sdkVersion", "21.5.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    public final synchronized void j() {
        this.f11939d = true;
    }

    public final String l() {
        try {
            Context context = this.f11947l;
            byte[] a7 = E2.a.a(context, context.getPackageName());
            if (a7 != null) {
                return j.b(a7, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f11947l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f11947l.getPackageName());
            return null;
        }
    }

    public final long m(int i7) {
        int length = f11934q.length;
        if (i7 >= length) {
            i7 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i7 - 1]) / 2) + this.f11949n.nextInt((int) r0);
    }

    public final String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.f11944i.r().c()), str);
    }

    public final URL o() {
        try {
            return new URL(n(this.f11948m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    public final boolean p(int i7) {
        return i7 == 408 || i7 == 429 || i7 == 502 || i7 == 503 || i7 == 504;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.firebase.remoteconfig.internal.e] */
    /* JADX WARN: Type inference failed for: r12v0, types: [V2.j] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.net.HttpURLConnection] */
    public final /* synthetic */ AbstractC0659j q(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2) {
        Integer num;
        Throwable th;
        Integer num2;
        r rVar;
        int responseCode;
        boolean p7;
        try {
            try {
            } catch (IOException e7) {
                e = e7;
                abstractC0659j = 0;
                num2 = null;
            } catch (Throwable th2) {
                num = null;
                th = th2;
                abstractC0659j = 0;
            }
            if (!abstractC0659j.n()) {
                throw new IOException(abstractC0659j.i());
            }
            y(true);
            abstractC0659j = (HttpURLConnection) abstractC0659j.j();
            try {
                responseCode = abstractC0659j.getResponseCode();
                num2 = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        v();
                        this.f11951p.j();
                        B(abstractC0659j).i();
                    } catch (IOException e8) {
                        e = e8;
                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                        g(abstractC0659j);
                        y(false);
                        boolean z7 = num2 == null || p(num2.intValue());
                        if (z7) {
                            D(new Date(this.f11950o.a()));
                        }
                        if (!z7 && num2.intValue() != 200) {
                            String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                            if (num2.intValue() == 403) {
                                format = t(abstractC0659j.getErrorStream());
                            }
                            rVar = new r(num2.intValue(), format, o.a.CONFIG_UPDATE_STREAM_ERROR);
                            u(rVar);
                            return m.e(null);
                        }
                        w();
                        return m.e(null);
                    }
                }
                g(abstractC0659j);
                y(false);
                p7 = p(responseCode);
                if (p7) {
                    D(new Date(this.f11950o.a()));
                }
            } catch (IOException e9) {
                e = e9;
                num2 = null;
            } catch (Throwable th3) {
                num = null;
                th = th3;
                g(abstractC0659j);
                y(false);
                boolean z8 = num == null || p(num.intValue());
                if (z8) {
                    D(new Date(this.f11950o.a()));
                }
                if (z8 || num.intValue() == 200) {
                    w();
                } else {
                    String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format2 = t(abstractC0659j.getErrorStream());
                    }
                    u(new r(num.intValue(), format2, o.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
            if (!p7 && responseCode != 200) {
                String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                if (responseCode == 403) {
                    format3 = t(abstractC0659j.getErrorStream());
                }
                rVar = new r(responseCode, format3, o.a.CONFIG_UPDATE_STREAM_ERROR);
                u(rVar);
                return m.e(null);
            }
            w();
            return m.e(null);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final /* synthetic */ AbstractC0659j r(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2, AbstractC0659j abstractC0659j3) {
        if (!abstractC0659j.n()) {
            return m.d(new n("Firebase Installations failed to get installation auth token for config update listener connection.", abstractC0659j.i()));
        }
        if (!abstractC0659j2.n()) {
            return m.d(new n("Firebase Installations failed to get installation ID for config update listener connection.", abstractC0659j2.i()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) abstractC0659j2.j(), ((s4.n) abstractC0659j.j()).b());
            return m.e(httpURLConnection);
        } catch (IOException e7) {
            return m.d(new n("Failed to open HTTP stream connection", e7));
        }
    }

    public final synchronized void s(long j7) {
        try {
            if (f()) {
                int i7 = this.f11938c;
                if (i7 > 0) {
                    this.f11938c = i7 - 1;
                    this.f11942g.schedule(new a(), j7, TimeUnit.MILLISECONDS);
                } else if (!this.f11940e) {
                    u(new n("Unable to connect to the server. Check your connection and try again.", o.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String t(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized void u(o oVar) {
        Iterator it = this.f11936a.iterator();
        while (it.hasNext()) {
            ((P4.c) it.next()).a(oVar);
        }
    }

    public final synchronized void v() {
        this.f11938c = 8;
    }

    public synchronized void w() {
        s(Math.max(0L, this.f11951p.h().a().getTime() - new Date(this.f11950o.a()).getTime()));
    }

    public final void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f11944i.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f11947l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final synchronized void y(boolean z7) {
        this.f11937b = z7;
    }

    public void z(boolean z7) {
        this.f11940e = z7;
    }

    public class b implements P4.c {
        public b() {
        }

        @Override // P4.c
        public void a(o oVar) {
            e.this.j();
            e.this.u(oVar);
        }

        @Override // P4.c
        public void b(P4.b bVar) {
        }
    }
}
