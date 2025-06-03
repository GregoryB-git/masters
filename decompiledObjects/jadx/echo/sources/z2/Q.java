package z2;

import V2.C0660k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import x2.C2190d;

/* loaded from: classes.dex */
public final class Q extends AbstractC2297F {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2310m f21677b;

    /* renamed from: c, reason: collision with root package name */
    public final C0660k f21678c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2309l f21679d;

    public Q(int i7, AbstractC2310m abstractC2310m, C0660k c0660k, InterfaceC2309l interfaceC2309l) {
        super(i7);
        this.f21678c = c0660k;
        this.f21677b = abstractC2310m;
        this.f21679d = interfaceC2309l;
        if (i7 == 2 && abstractC2310m.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // z2.T
    public final void a(Status status) {
        this.f21678c.d(this.f21679d.a(status));
    }

    @Override // z2.T
    public final void b(Exception exc) {
        this.f21678c.d(exc);
    }

    @Override // z2.T
    public final void c(C2320x c2320x) {
        try {
            this.f21677b.b(c2320x.t(), this.f21678c);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(T.e(e8));
        } catch (RuntimeException e9) {
            this.f21678c.d(e9);
        }
    }

    @Override // z2.T
    public final void d(C2312o c2312o, boolean z7) {
        c2312o.b(this.f21678c, z7);
    }

    @Override // z2.AbstractC2297F
    public final boolean f(C2320x c2320x) {
        return this.f21677b.c();
    }

    @Override // z2.AbstractC2297F
    public final C2190d[] g(C2320x c2320x) {
        return this.f21677b.e();
    }
}
