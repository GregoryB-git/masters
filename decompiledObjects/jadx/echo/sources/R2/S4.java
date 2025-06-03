package R2;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1071y0;

/* loaded from: classes.dex */
public final class S4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f5018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5019p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f5020q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D4 f5021r;

    public S4(D4 d42, I i7, String str, InterfaceC1071y0 interfaceC1071y0) {
        this.f5021r = d42;
        this.f5018o = i7;
        this.f5019p = str;
        this.f5020q = interfaceC1071y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        byte[] bArr = null;
        try {
            try {
                r12 = this.f5021r.f4593d;
                if (r12 == null) {
                    this.f5021r.j().G().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = r12.M0(this.f5018o, this.f5019p);
                    this.f5021r.g0();
                }
            } catch (RemoteException e7) {
                this.f5021r.j().G().b("Failed to send event to the service to bundle", e7);
            }
        } finally {
            this.f5021r.k().Y(this.f5020q, bArr);
        }
    }
}
