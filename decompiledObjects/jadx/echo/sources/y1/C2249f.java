package y1;

import O1.C0438a;
import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2249f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21371a = new HashMap();

    public final synchronized void a(C2244a accessTokenAppIdPair, C2248e appEvent) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        C2239H e7 = e(accessTokenAppIdPair);
        if (e7 != null) {
            e7.a(appEvent);
        }
    }

    public final synchronized void b(C2238G c2238g) {
        if (c2238g == null) {
            return;
        }
        for (Map.Entry entry : c2238g.b()) {
            C2239H e7 = e((C2244a) entry.getKey());
            if (e7 != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    e7.a((C2248e) it.next());
                }
            }
        }
    }

    public final synchronized C2239H c(C2244a accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (C2239H) this.f21371a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int i7;
        Iterator it = this.f21371a.values().iterator();
        i7 = 0;
        while (it.hasNext()) {
            i7 += ((C2239H) it.next()).c();
        }
        return i7;
    }

    public final synchronized C2239H e(C2244a c2244a) {
        Context l7;
        C0438a e7;
        C2239H c2239h = (C2239H) this.f21371a.get(c2244a);
        if (c2239h == null && (e7 = C0438a.f3802f.e((l7 = C2146B.l()))) != null) {
            c2239h = new C2239H(e7, C2259p.f21393b.d(l7));
        }
        if (c2239h == null) {
            return null;
        }
        this.f21371a.put(c2244a, c2239h);
        return c2239h;
    }

    public final synchronized Set f() {
        Set keySet;
        keySet = this.f21371a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }
}
