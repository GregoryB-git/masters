package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class X4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5137o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5138p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5139q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f5140r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W5 f5141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f5142t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D4 f5143u;

    public X4(D4 d42, AtomicReference atomicReference, String str, String str2, String str3, W5 w52, boolean z7) {
        this.f5143u = d42;
        this.f5137o = atomicReference;
        this.f5138p = str;
        this.f5139q = str2;
        this.f5140r = str3;
        this.f5141s = w52;
        this.f5142t = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R1 r12;
        AtomicReference atomicReference2;
        List W6;
        synchronized (this.f5137o) {
            try {
                try {
                    r12 = this.f5143u.f4593d;
                } catch (RemoteException e7) {
                    this.f5143u.j().G().d("(legacy) Failed to get user properties; remote exception", Y1.v(this.f5138p), this.f5139q, e7);
                    this.f5137o.set(Collections.emptyList());
                    atomicReference = this.f5137o;
                }
                if (r12 == null) {
                    this.f5143u.j().G().d("(legacy) Failed to get user properties; not connected to service", Y1.v(this.f5138p), this.f5139q, this.f5140r);
                    this.f5137o.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f5138p)) {
                    AbstractC0328n.i(this.f5141s);
                    atomicReference2 = this.f5137o;
                    W6 = r12.x0(this.f5139q, this.f5140r, this.f5142t, this.f5141s);
                } else {
                    atomicReference2 = this.f5137o;
                    W6 = r12.W(this.f5138p, this.f5139q, this.f5140r, this.f5142t);
                }
                atomicReference2.set(W6);
                this.f5143u.g0();
                atomicReference = this.f5137o;
                atomicReference.notify();
            } finally {
                this.f5137o.notify();
            }
        }
    }
}
