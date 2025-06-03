package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import g1.c;
import g1.c.C0091c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.k f5780e;

    public p(int i10, int i11, Bundle bundle, c.k kVar, c.m mVar, String str) {
        this.f5780e = kVar;
        this.f5776a = mVar;
        this.f5777b = i10;
        this.f5778c = str;
        this.f5779d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.C0091c c0091c;
        IBinder a10 = ((c.m) this.f5776a).a();
        c.this.f5717d.remove(a10);
        Iterator<c.C0091c> it = c.this.f5716c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c.C0091c next = it.next();
            if (next.f5727c == this.f5777b) {
                c0091c = (TextUtils.isEmpty(this.f5778c) || this.f5779d <= 0) ? c.this.new C0091c(next.f5725a, next.f5726b, next.f5727c, this.f5776a) : null;
                it.remove();
            }
        }
        if (c0091c == null) {
            c0091c = c.this.new C0091c(this.f5778c, this.f5779d, this.f5777b, this.f5776a);
        }
        c.this.f5717d.put(a10, c0091c);
        try {
            a10.linkToDeath(c0091c, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
