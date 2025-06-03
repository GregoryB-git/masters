// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import java.io.IOException;
import org.json.JSONException;
import android.util.Log;
import P4.n;
import org.json.JSONObject;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.concurrent.Executor;
import V2.m;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import P4.r;
import P4.o;
import V2.j;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import Q4.e;
import java.net.HttpURLConnection;
import java.util.Set;

public class a
{
    public final Set a;
    public final HttpURLConnection b;
    public final c c;
    public final e d;
    public final P4.c e;
    public final ScheduledExecutorService f;
    public final Random g;
    
    public a(final HttpURLConnection b, final c c, final e d, final Set a, final P4.c e, final ScheduledExecutorService f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = new Random();
    }
    
    public static Boolean e(final c.a a, final long n) {
        final b d = a.d();
        final boolean b = false;
        boolean b2 = false;
        if (d != null) {
            if (a.d().i() >= n) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (a.f() == 1) {
            b3 = true;
        }
        return b3;
    }
    
    public final void b(final int n, final long n2) {
        if (n == 0) {
            this.k(new r("Unable to fetch the latest version of the template.", o.a.s));
            return;
        }
        this.f.schedule(new Runnable() {
            @Override
            public void run() {
                com.google.firebase.remoteconfig.internal.a.this.d(n, n2);
            }
        }, this.g.nextInt(4), TimeUnit.SECONDS);
    }
    
    public final void c(final P4.b b) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0046: {
            try {
                final Iterator<P4.c> iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b(b);
                }
            }
            finally {
                break Label_0046;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public j d(int n, final long n2) {
        // monitorenter(this)
        --n;
        try {
            final j n3 = this.c.n(com.google.firebase.remoteconfig.internal.c.b.q, 3 - n);
            final j e = this.d.e();
            return m.i(n3, e).h(this.f, new Q4.a(this, n3, e, n2, n));
        }
        finally {
        }
        // monitorexit(this)
    }
    
    public final void f(final InputStream in) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "utf-8"));
    Label_0209_Outer:
        while (true) {
            String str = "";
            while (true) {
                Label_0245: {
                    while (true) {
                        final String line = bufferedReader.readLine();
                        if (line == null) {
                            break Label_0245;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(line);
                        final String s = str = sb.toString();
                        if (!line.contains("}")) {
                            continue Label_0209_Outer;
                        }
                        str = this.j(s);
                        if (str.isEmpty()) {
                            continue Label_0209_Outer;
                        }
                        break;
                    }
                    try {
                        final JSONObject jsonObject = new JSONObject(str);
                        if (jsonObject.has("featureDisabled") && jsonObject.getBoolean("featureDisabled")) {
                            this.e.a(new r("The server is temporarily unavailable. Try again in a few minutes.", o.a.t));
                        }
                        else if (!this.g()) {
                            if (!jsonObject.has("latestTemplateVersionNumber")) {
                                continue Label_0209_Outer;
                            }
                            final long r = this.c.r();
                            final long long1 = jsonObject.getLong("latestTemplateVersionNumber");
                            if (long1 > r) {
                                this.b(3, long1);
                                continue Label_0209_Outer;
                            }
                            continue Label_0209_Outer;
                        }
                        bufferedReader.close();
                        in.close();
                        return;
                        final Throwable t;
                        this.k(new n("Unable to parse config update message.", t.getCause(), o.a.r));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", t);
                        continue Label_0209_Outer;
                    }
                    catch (JSONException ex) {}
                }
                final JSONException ex;
                final Throwable t = (Throwable)ex;
                continue;
            }
        }
    }
    
    public final boolean g() {
        synchronized (this) {
            return this.a.isEmpty();
        }
    }
    
    public void i() {
        final HttpURLConnection b = this.b;
        if (b == null) {
            return;
        }
        while (true) {
            try {
                try {
                    final InputStream inputStream = b.getInputStream();
                    this.f(inputStream);
                    inputStream.close();
                    this.b.disconnect();
                    return;
                }
                finally {}
            }
            catch (IOException ex) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", (Throwable)ex);
                continue;
            }
            break;
        }
        this.b.disconnect();
    }
    
    public final String j(final String s) {
        final int index = s.indexOf(123);
        final int lastIndex = s.lastIndexOf(125);
        String substring = "";
        if (index >= 0) {
            if (lastIndex < 0) {
                return "";
            }
            if (index >= lastIndex) {
                return "";
            }
            substring = s.substring(index, lastIndex + 1);
        }
        return substring;
    }
    
    public final void k(final o o) {
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
}
