// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import java.util.Iterator;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import P4.r;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import java.io.IOException;
import java.util.concurrent.Executor;
import Q4.n;
import V2.m;
import java.util.Date;
import P4.b;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import P4.o;
import V2.j;
import E2.h;
import java.util.Random;
import android.content.Context;
import s4.i;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Set;
import java.util.regex.Pattern;

public class e
{
    public static final int[] q;
    public static final Pattern r;
    public final Set a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public final int f;
    public final ScheduledExecutorService g;
    public final c h;
    public final s3.e i;
    public final i j;
    public Q4.e k;
    public final Context l;
    public final String m;
    public final Random n;
    public final E2.e o;
    public final d p;
    
    static {
        q = new int[] { 2, 4, 8, 16, 32, 64, 128, 256 };
        r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }
    
    public e(final s3.e i, final i j, final c h, final Q4.e k, final Context l, final String m, final Set a, final d p9, final ScheduledExecutorService g) {
        this.f = 8;
        this.a = a;
        this.b = false;
        this.g = g;
        this.n = new Random();
        this.c = Math.max(8 - p9.h().b(), 1);
        this.o = E2.h.d();
        this.i = i;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.p = p9;
        this.d = false;
        this.e = false;
    }
    
    public static String k(final String input) {
        final Matcher matcher = e.r.matcher(input);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
    
    public void A(final HttpURLConnection httpURLConnection, final String s, final String s2) {
        httpURLConnection.setRequestMethod("POST");
        this.x(httpURLConnection, s2);
        final byte[] bytes = this.i(s).toString().getBytes("utf-8");
        final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
    
    public a B(final HttpURLConnection httpURLConnection) {
        synchronized (this) {
            return new a(httpURLConnection, this.h, this.k, this.a, new P4.c() {
                @Override
                public void a(final o o) {
                    com.google.firebase.remoteconfig.internal.e.this.j();
                    com.google.firebase.remoteconfig.internal.e.this.u(o);
                }
                
                @Override
                public void b(final b b) {
                }
            }, this.g);
        }
    }
    
    public void C() {
        this.s(0L);
    }
    
    public final void D(Date date) {
        final int n = this.p.h().b() + 1;
        date = new Date(date.getTime() + this.m(n));
        this.p.o(n, date);
    }
    
    public void e() {
        if (!this.f()) {
            return;
        }
        if (new Date(this.o.a()).before(this.p.h().a())) {
            this.w();
            return;
        }
        final j h = this.h();
        V2.m.i(h).g(this.g, new n(this, h));
    }
    
    public final boolean f() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0052: {
            boolean e = false;
            Label_0048: {
                try {
                    if (!this.a.isEmpty() && !this.b && !this.d) {
                        e = this.e;
                        if (!e) {
                            e = true;
                            break Label_0048;
                        }
                    }
                }
                finally {
                    break Label_0052;
                }
                e = false;
            }
            return e;
        }
    }
    // monitorexit(this)
    
    public void g(final HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.disconnect();
        try {
            httpURLConnection.getInputStream().close();
            if (httpURLConnection.getErrorStream() != null) {
                httpURLConnection.getErrorStream().close();
            }
        }
        catch (IOException ex) {}
    }
    
    public j h() {
        final j b = this.j.b(false);
        final j a = this.j.a();
        return V2.m.i(b, a).h(this.g, new Q4.o(this, b, a));
    }
    
    public final JSONObject i(final String s) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("project", k(this.i.r().c()));
        hashMap.put("namespace", this.m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.h.r()));
        hashMap.put("appId", this.i.r().c());
        hashMap.put("sdkVersion", "21.5.0");
        hashMap.put("appInstanceId", s);
        return new JSONObject((Map)hashMap);
    }
    
    public final void j() {
        synchronized (this) {
            this.d = true;
        }
    }
    
    public final String l() {
        while (true) {
            try {
                final Context l = this.l;
                final byte[] a = E2.a.a(l, l.getPackageName());
                if (a == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not get fingerprint hash for package: ");
                    sb.append(this.l.getPackageName());
                    Log.e("FirebaseRemoteConfig", sb.toString());
                    return null;
                }
                return E2.j.b(a, false);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("No such package: ");
                sb2.append(this.l.getPackageName());
                Log.i("FirebaseRemoteConfig", sb2.toString());
                return null;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public final long m(int n) {
        final int[] q = com.google.firebase.remoteconfig.internal.e.q;
        final int length = q.length;
        if (n >= length) {
            n = length;
        }
        final long millis = TimeUnit.MINUTES.toMillis(q[n - 1]);
        return millis / 2L + this.n.nextInt((int)millis);
    }
    
    public final String n(final String s) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.i.r().c()), s);
    }
    
    public final URL o() {
        while (true) {
            try {
                return new URL(this.n(this.m));
                Log.e("FirebaseRemoteConfig", "URL is malformed");
                return null;
            }
            catch (MalformedURLException ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean p(final int n) {
        return n == 408 || n == 429 || n == 502 || n == 503 || n == 504;
    }
    
    public final void s(final long n) {
        // monitorenter(this)
        while (true) {
            try {
                if (!this.f()) {
                    // monitorexit(this)
                    return;
                }
                final int c = this.c;
                if (c > 0) {
                    this.c = c - 1;
                    this.g.schedule(new Runnable() {
                        @Override
                        public void run() {
                            com.google.firebase.remoteconfig.internal.e.this.e();
                        }
                    }, n, TimeUnit.MILLISECONDS);
                }
                else if (!this.e) {
                    this.u(new P4.n("Unable to connect to the server. Check your connection and try again.", P4.o.a.q));
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String t(final InputStream in) {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
                while (true) {
                    final String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                Label_0053: {
                    return sb.toString();
                }
                // iftrue(Label_0053:, sb.length() != 0)
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
            catch (IOException ex) {}
            continue;
        }
    }
    
    public final void u(final o o) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0046: {
            try {
                final Iterator<P4.c> iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(o);
                }
            }
            finally {
                break Label_0046;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final void v() {
        synchronized (this) {
            this.c = 8;
        }
    }
    
    public void w() {
        synchronized (this) {
            this.s(Math.max(0L, this.p.h().a().getTime() - new Date(this.o.a()).getTime()));
        }
    }
    
    public final void x(final HttpURLConnection httpURLConnection, final String value) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", value);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }
    
    public final void y(final boolean b) {
        synchronized (this) {
            this.b = b;
        }
    }
    
    public void z(final boolean e) {
        this.e = e;
    }
}
