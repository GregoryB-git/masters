package w6;

import p6.M;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f20488q;

    public k(Runnable runnable, long j7, i iVar) {
        super(j7, iVar);
        this.f20488q = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f20488q.run();
        } finally {
            this.f20486p.a();
        }
    }

    public String toString() {
        return "Task[" + M.a(this.f20488q) + '@' + M.b(this.f20488q) + ", " + this.f20485o + ", " + this.f20486p + ']';
    }
}
