package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class T4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5039o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f5040p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f5041q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f5042r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f5043s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D4 f5044t;

    public T4(D4 d42, boolean z7, W5 w52, boolean z8, I i7, String str) {
        this.f5044t = d42;
        this.f5039o = z7;
        this.f5040p = w52;
        this.f5041q = z8;
        this.f5042r = i7;
        this.f5043s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f5044t.f4593d;
        if (r12 == null) {
            this.f5044t.j().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f5039o) {
            AbstractC0328n.i(this.f5040p);
            this.f5044t.F(r12, this.f5041q ? null : this.f5042r, this.f5040p);
        } else {
            try {
                if (TextUtils.isEmpty(this.f5043s)) {
                    AbstractC0328n.i(this.f5040p);
                    r12.R0(this.f5042r, this.f5040p);
                } else {
                    r12.S0(this.f5042r, this.f5043s, this.f5044t.j().O());
                }
            } catch (RemoteException e7) {
                this.f5044t.j().G().b("Failed to send event to the service", e7);
            }
        }
        this.f5044t.g0();
    }
}
