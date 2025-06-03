package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Y4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5165o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5166p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W5 f5167q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f5168r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D4 f5169s;

    public Y4(D4 d42, String str, String str2, W5 w52, InterfaceC1071y0 interfaceC1071y0) {
        this.f5169s = d42;
        this.f5165o = str;
        this.f5166p = str2;
        this.f5167q = w52;
        this.f5168r = interfaceC1071y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                r12 = this.f5169s.f4593d;
                if (r12 == null) {
                    this.f5169s.j().G().c("Failed to get conditional properties; not connected to service", this.f5165o, this.f5166p);
                } else {
                    AbstractC0328n.i(this.f5167q);
                    arrayList = S5.t0(r12.V0(this.f5165o, this.f5166p, this.f5167q));
                    this.f5169s.g0();
                }
            } catch (RemoteException e7) {
                this.f5169s.j().G().d("Failed to get conditional properties; remote exception", this.f5165o, this.f5166p, e7);
            }
        } finally {
            this.f5169s.k().W(this.f5168r, arrayList);
        }
    }
}
