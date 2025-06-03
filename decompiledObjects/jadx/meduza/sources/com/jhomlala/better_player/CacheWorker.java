package com.jhomlala.better_player;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import ec.i;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import lc.k;
import pa.j;
import t5.n;
import t5.s;
import t5.x;
import u5.h;

/* loaded from: classes.dex */
public final class CacheWorker extends Worker {
    public final Context f;

    /* renamed from: o, reason: collision with root package name */
    public h f3260o;

    /* renamed from: p, reason: collision with root package name */
    public int f3261p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "context");
        i.e(workerParameters, "params");
        this.f = context;
    }

    @Override // androidx.work.d
    public final void g() {
        try {
            h hVar = this.f3260o;
            if (hVar != null) {
                hVar.f15022j = true;
            }
        } catch (Exception e10) {
            Log.e("CacheWorker", e10.toString());
        }
    }

    @Override // androidx.work.Worker
    public final d.a j() {
        String str;
        long j10;
        String str2;
        try {
            c cVar = this.f1458b.f1436b;
            i.d(cVar, "getInputData(...)");
            String d10 = cVar.d(WebViewActivity.URL_EXTRA);
            String d11 = cVar.d("cacheKey");
            long c10 = cVar.c("preCacheSize");
            long c11 = cVar.c("maxCacheSize");
            long c12 = cVar.c("maxCacheFileSize");
            HashMap hashMap = new HashMap();
            Iterator it = Collections.unmodifiableMap(cVar.f1455a).keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                i.b(str3);
                if (k.o0(str3, "header_")) {
                    String str4 = ((String[]) new lc.d("header_").a(str3).toArray(new String[0]))[0];
                    Object obj = Collections.unmodifiableMap(cVar.f1455a).get(str3);
                    Objects.requireNonNull(obj);
                    hashMap.put(str4, (String) obj);
                }
            }
            Uri parse = Uri.parse(d10);
            if (!j.b(parse)) {
                Log.e("CacheWorker", "Preloading only possible for remote data sources");
                return new d.a.C0024a();
            }
            String property = System.getProperty("http.agent");
            if (hashMap.containsKey("User-Agent") && (str2 = (String) hashMap.get("User-Agent")) != null) {
                property = str2;
            }
            s.a a10 = j.a(property, hashMap);
            n nVar = new n(parse, 0L, c10);
            if (d11 != null) {
                if (d11.length() > 0) {
                    Uri uri = nVar.f14547a;
                    long j11 = nVar.f14548b;
                    int i10 = nVar.f14549c;
                    byte[] bArr = nVar.f14550d;
                    Map<String, String> map = nVar.f14551e;
                    long j12 = nVar.f;
                    str = d10;
                    long j13 = nVar.f14552g;
                    int i11 = nVar.f14554i;
                    Object obj2 = nVar.f14555j;
                    if (uri == null) {
                        throw new IllegalStateException("The uri must be set.");
                    }
                    j10 = c10;
                    nVar = new n(uri, j11, i10, bArr, map, j12, j13, d11, i11, obj2);
                    h hVar = new h(new pa.h(this.f, c11, c12, a10).a(), nVar, new q3.j(j10, this, str));
                    this.f3260o = hVar;
                    hVar.a();
                    return new d.a.c();
                }
            }
            str = d10;
            j10 = c10;
            h hVar2 = new h(new pa.h(this.f, c11, c12, a10).a(), nVar, new q3.j(j10, this, str));
            this.f3260o = hVar2;
            hVar2.a();
            return new d.a.c();
        } catch (Exception e10) {
            Log.e("CacheWorker", e10.toString());
            return e10 instanceof x ? new d.a.c() : new d.a.C0024a();
        }
    }
}
