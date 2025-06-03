package z2;

import V2.C0660k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class P extends AbstractC2297F {

    /* renamed from: b, reason: collision with root package name */
    public final C0660k f21676b;

    public P(int i7, C0660k c0660k) {
        super(i7);
        this.f21676b = c0660k;
    }

    @Override // z2.T
    public final void a(Status status) {
        this.f21676b.d(new y2.b(status));
    }

    @Override // z2.T
    public final void b(Exception exc) {
        this.f21676b.d(exc);
    }

    @Override // z2.T
    public final void c(C2320x c2320x) {
        try {
            h(c2320x);
        } catch (DeadObjectException e7) {
            a(T.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(T.e(e8));
        } catch (RuntimeException e9) {
            this.f21676b.d(e9);
        }
    }

    public abstract void h(C2320x c2320x);
}
