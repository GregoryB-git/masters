package eb;

import eb.b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k extends eb.b {

    /* renamed from: a, reason: collision with root package name */
    public final eb.b f5138a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.b f5139b;

    public static final class a extends b.a {

        /* renamed from: a, reason: collision with root package name */
        public final b.a f5140a;

        /* renamed from: b, reason: collision with root package name */
        public final s0 f5141b;

        public a(b.a aVar, s0 s0Var) {
            this.f5140a = aVar;
            this.f5141b = s0Var;
        }

        @Override // eb.b.a
        public final void a(s0 s0Var) {
            s0 s0Var2 = new s0();
            s0Var2.d(this.f5141b);
            s0Var2.d(s0Var);
            this.f5140a.a(s0Var2);
        }

        @Override // eb.b.a
        public final void b(e1 e1Var) {
            this.f5140a.b(e1Var);
        }
    }

    public final class b extends b.a {

        /* renamed from: a, reason: collision with root package name */
        public final b.AbstractC0074b f5142a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f5143b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f5144c;

        /* renamed from: d, reason: collision with root package name */
        public final p f5145d;

        public b(b.AbstractC0074b abstractC0074b, Executor executor, b.a aVar, p pVar) {
            this.f5142a = abstractC0074b;
            this.f5143b = executor;
            this.f5144c = aVar;
            x6.b.y(pVar, "context");
            this.f5145d = pVar;
        }

        @Override // eb.b.a
        public final void a(s0 s0Var) {
            p a10 = this.f5145d.a();
            try {
                k.this.f5139b.a(this.f5142a, this.f5143b, new a(this.f5144c, s0Var));
            } finally {
                this.f5145d.c(a10);
            }
        }

        @Override // eb.b.a
        public final void b(e1 e1Var) {
            this.f5144c.b(e1Var);
        }
    }

    public k(eb.b bVar, eb.b bVar2) {
        x6.b.y(bVar, "creds1");
        this.f5138a = bVar;
        this.f5139b = bVar2;
    }

    @Override // eb.b
    public final void a(b.AbstractC0074b abstractC0074b, Executor executor, b.a aVar) {
        this.f5138a.a(abstractC0074b, executor, new b(abstractC0074b, executor, aVar, p.b()));
    }
}
