package nc;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11500a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11501b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f11500a = i10;
        this.f11501b = obj;
    }

    @Override // nc.j
    public final void h(Throwable th) {
        switch (this.f11500a) {
            case 0:
                if (th != null) {
                    ((Future) this.f11501b).cancel(false);
                    break;
                }
                break;
            default:
                ((dc.l) this.f11501b).invoke(th);
                break;
        }
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
        switch (this.f11500a) {
            case 0:
                h(th);
                break;
            default:
                h(th);
                break;
        }
        return rb.h.f13851a;
    }

    public final String toString() {
        switch (this.f11500a) {
            case 0:
                StringBuilder l10 = defpackage.f.l("CancelFutureOnCancel[");
                l10.append((Future) this.f11501b);
                l10.append(']');
                return l10.toString();
            default:
                StringBuilder l11 = defpackage.f.l("InvokeOnCancel[");
                l11.append(((dc.l) this.f11501b).getClass().getSimpleName());
                l11.append('@');
                l11.append(g0.b(this));
                l11.append(']');
                return l11.toString();
        }
    }
}
