package tc;

import nc.g0;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f14767c;

    public i(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f14767c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14767c.run();
        } finally {
            this.f14766b.a();
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Task[");
        l10.append(this.f14767c.getClass().getSimpleName());
        l10.append('@');
        l10.append(g0.b(this.f14767c));
        l10.append(", ");
        l10.append(this.f14765a);
        l10.append(", ");
        l10.append(this.f14766b);
        l10.append(']');
        return l10.toString();
    }
}
