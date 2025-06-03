package p2;

import p1.j;

/* loaded from: classes.dex */
public final class b extends j.b {

    /* renamed from: a, reason: collision with root package name */
    public final o2.a f12858a;

    public b(m0 m0Var) {
        this.f12858a = m0Var;
    }

    @Override // p1.j.b
    public final void a(u1.c cVar) {
        cVar.h();
        try {
            cVar.m("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f12858a.a() - a0.f12857a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cVar.G();
        } finally {
            cVar.X();
        }
    }
}
