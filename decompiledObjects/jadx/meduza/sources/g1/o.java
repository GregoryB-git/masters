package g1;

import android.util.Log;
import g1.c;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.a f5774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.k f5775d;

    public o(c.k kVar, c.m mVar, String str, android.support.v4.os.a aVar) {
        this.f5775d = kVar;
        this.f5772a = mVar;
        this.f5773b = str;
        this.f5774c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (c.this.f5717d.getOrDefault(((c.m) this.f5772a).a(), null) == null) {
            StringBuilder l10 = defpackage.f.l("getMediaItem for callback that isn't registered id=");
            l10.append(this.f5773b);
            Log.w("MBServiceCompat", l10.toString());
            return;
        }
        c cVar = c.this;
        String str = this.f5773b;
        android.support.v4.os.a aVar = this.f5774c;
        cVar.getClass();
        d dVar = new d(str, aVar);
        cVar.e(str, dVar);
        if (!dVar.b()) {
            throw new IllegalStateException(defpackage.g.d("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
