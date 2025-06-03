package q3;

import android.util.Log;
import com.jhomlala.better_player.CacheWorker;
import k3.s;
import s3.b;
import u5.h;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements b.a, h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13254c;

    public /* synthetic */ j(long j10, CacheWorker cacheWorker, String str) {
        this.f13252a = j10;
        this.f13253b = cacheWorker;
        this.f13254c = str;
    }

    public /* synthetic */ j(k kVar, s sVar, long j10) {
        this.f13253b = kVar;
        this.f13254c = sVar;
        this.f13252a = j10;
    }

    @Override // s3.b.a
    public final Object a() {
        k kVar = (k) this.f13253b;
        kVar.f13257c.P(kVar.f13260g.a() + this.f13252a, (s) this.f13254c);
        return null;
    }

    public final void b(long j10) {
        long j11 = this.f13252a;
        CacheWorker cacheWorker = (CacheWorker) this.f13253b;
        String str = (String) this.f13254c;
        double d10 = (j10 * 100.0f) / j11;
        int i10 = cacheWorker.f3261p;
        if (d10 >= i10 * 10) {
            cacheWorker.f3261p = i10 + 1;
            StringBuilder m10 = defpackage.f.m("Completed pre cache of ", str, ": ");
            m10.append((int) d10);
            m10.append('%');
            Log.d("CacheWorker", m10.toString());
        }
    }
}
