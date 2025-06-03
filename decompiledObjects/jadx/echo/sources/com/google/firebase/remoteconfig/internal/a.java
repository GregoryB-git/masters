package com.google.firebase.remoteconfig.internal;

import P4.n;
import P4.o;
import P4.r;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import V2.m;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f11883a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f11884b;

    /* renamed from: c, reason: collision with root package name */
    public final c f11885c;

    /* renamed from: d, reason: collision with root package name */
    public final Q4.e f11886d;

    /* renamed from: e, reason: collision with root package name */
    public final P4.c f11887e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f11888f;

    /* renamed from: g, reason: collision with root package name */
    public final Random f11889g = new Random();

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    public class RunnableC0177a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f11890o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f11891p;

        public RunnableC0177a(int i7, long j7) {
            this.f11890o = i7;
            this.f11891p = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d(this.f11890o, this.f11891p);
        }
    }

    public a(HttpURLConnection httpURLConnection, c cVar, Q4.e eVar, Set set, P4.c cVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f11884b = httpURLConnection;
        this.f11885c = cVar;
        this.f11886d = eVar;
        this.f11883a = set;
        this.f11887e = cVar2;
        this.f11888f = scheduledExecutorService;
    }

    public static Boolean e(c.a aVar, long j7) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().i() >= j7);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    public final void b(int i7, long j7) {
        if (i7 == 0) {
            k(new r("Unable to fetch the latest version of the template.", o.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f11888f.schedule(new RunnableC0177a(i7, j7), this.f11889g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    public final synchronized void c(P4.b bVar) {
        Iterator it = this.f11883a.iterator();
        while (it.hasNext()) {
            ((P4.c) it.next()).b(bVar);
        }
    }

    public synchronized AbstractC0659j d(int i7, final long j7) {
        final int i8;
        final AbstractC0659j n7;
        final AbstractC0659j e7;
        i8 = i7 - 1;
        n7 = this.f11885c.n(c.b.REALTIME, 3 - i8);
        e7 = this.f11886d.e();
        return m.i(n7, e7).h(this.f11888f, new InterfaceC0651b() { // from class: Q4.a
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                AbstractC0659j h7;
                h7 = com.google.firebase.remoteconfig.internal.a.this.h(n7, e7, j7, i8, abstractC0659j);
                return h7;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r9.f11887e.a(new P4.r("The server is temporarily unavailable. Try again in a few minutes.", P4.o.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r6 = r9.f11885c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r4 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            P4.c r4 = r9.f11887e     // Catch: org.json.JSONException -> L5b
            P4.r r5 = new P4.r     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            P4.o$a r7 = P4.o.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.a(r5)     // Catch: org.json.JSONException -> L5b
            goto L96
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.g()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L96
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.c r4 = r9.f11885c     // Catch: org.json.JSONException -> L5b
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L12
            r6 = 3
            r9.b(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            P4.n r5 = new P4.n
            java.lang.Throwable r6 = r4.getCause()
            P4.o$a r7 = P4.o.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L96:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.a.f(java.io.InputStream):void");
    }

    public final synchronized boolean g() {
        return this.f11883a.isEmpty();
    }

    public final /* synthetic */ AbstractC0659j h(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2, long j7, int i7, AbstractC0659j abstractC0659j3) {
        if (!abstractC0659j.n()) {
            return m.d(new n("Failed to auto-fetch config update.", abstractC0659j.i()));
        }
        if (!abstractC0659j2.n()) {
            return m.d(new n("Failed to get activated config for auto-fetch", abstractC0659j2.i()));
        }
        c.a aVar = (c.a) abstractC0659j.j();
        b bVar = (b) abstractC0659j2.j();
        if (!e(aVar, j7).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i7, j7);
            return m.e(null);
        }
        if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return m.e(null);
        }
        if (bVar == null) {
            bVar = b.j().a();
        }
        Set e7 = bVar.e(aVar.d());
        if (e7.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return m.e(null);
        }
        c(P4.b.a(e7));
        return m.e(null);
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.f11884b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e7) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e7);
            }
        } finally {
            this.f11884b.disconnect();
        }
    }

    public final String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    public final synchronized void k(o oVar) {
        Iterator it = this.f11883a.iterator();
        while (it.hasNext()) {
            ((P4.c) it.next()).a(oVar);
        }
    }
}
