package x2;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16826a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16827b;

    /* renamed from: c, reason: collision with root package name */
    public final c f16828c;

    public class a extends p1.d {
        public a(p1.j jVar) {
            super(jVar, 1);
        }

        @Override // p1.p
        public final String c() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p1.d
        public final void e(t1.f fVar, Object obj) {
            fVar.d0(1);
            byte[] e10 = androidx.work.c.e(null);
            if (e10 == null) {
                fVar.d0(2);
            } else {
                fVar.T(e10, 2);
            }
        }
    }

    public class b extends p1.p {
        public b(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends p1.p {
        public c(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public r(p1.j jVar) {
        this.f16826a = jVar;
        new a(jVar);
        this.f16827b = new b(jVar);
        this.f16828c = new c(jVar);
    }

    @Override // x2.q
    public final void a(String str) {
        this.f16826a.b();
        t1.f a10 = this.f16827b.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16826a.c();
        try {
            a10.p();
            this.f16826a.n();
        } finally {
            this.f16826a.j();
            this.f16827b.d(a10);
        }
    }

    @Override // x2.q
    public final void b() {
        this.f16826a.b();
        t1.f a10 = this.f16828c.a();
        this.f16826a.c();
        try {
            a10.p();
            this.f16826a.n();
        } finally {
            this.f16826a.j();
            this.f16828c.d(a10);
        }
    }
}
