package eb;

import eb.a;
import eb.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import n7.g;
import nb.i;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a.b<Map<String, ?>> f5147b = new a.b<>("internal:health-checking-config");

    /* renamed from: c, reason: collision with root package name */
    public static final b.C0075b<k> f5148c = new b.C0075b<>();

    /* renamed from: d, reason: collision with root package name */
    public static final a.b<Boolean> f5149d = new a.b<>("internal:has-health-check-producer-listener");

    /* renamed from: e, reason: collision with root package name */
    public static final a.b<Boolean> f5150e = new a.b<>("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f5151a;

    public class a extends j {
        @Override // eb.k0.j
        public final f a(g gVar) {
            return f.f5160e;
        }

        public final String toString() {
            return "EMPTY_PICKER";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<u> f5152a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.a f5153b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[][] f5154c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public List<u> f5155a;

            /* renamed from: b, reason: collision with root package name */
            public eb.a f5156b = eb.a.f5012b;

            /* renamed from: c, reason: collision with root package name */
            public Object[][] f5157c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            public final void a(k kVar) {
                C0075b<k> c0075b = k0.f5148c;
                int i10 = 0;
                while (true) {
                    Object[][] objArr = this.f5157c;
                    if (i10 >= objArr.length) {
                        i10 = -1;
                        break;
                    } else if (c0075b.equals(objArr[i10][0])) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f5157c.length + 1, 2);
                    Object[][] objArr3 = this.f5157c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f5157c = objArr2;
                    i10 = objArr2.length - 1;
                }
                this.f5157c[i10] = new Object[]{c0075b, kVar};
            }

            public final void b(List list) {
                x6.b.s("addrs is empty", !list.isEmpty());
                this.f5155a = Collections.unmodifiableList(new ArrayList(list));
            }
        }

        /* renamed from: eb.k0$b$b, reason: collision with other inner class name */
        public static final class C0075b<T> {

            /* renamed from: a, reason: collision with root package name */
            public final String f5158a = "internal:health-check-consumer-listener";

            public final String toString() {
                return this.f5158a;
            }
        }

        public b(List list, eb.a aVar, Object[][] objArr) {
            x6.b.y(list, "addresses are not set");
            this.f5152a = list;
            x6.b.y(aVar, "attrs");
            this.f5153b = aVar;
            x6.b.y(objArr, "customOptions");
            this.f5154c = objArr;
        }

        public final Object a() {
            C0075b<k> c0075b = k0.f5148c;
            int i10 = 0;
            while (true) {
                Object[][] objArr = this.f5154c;
                if (i10 >= objArr.length) {
                    return null;
                }
                if (c0075b.equals(objArr[i10][0])) {
                    return this.f5154c[i10][1];
                }
                i10++;
            }
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f5152a, "addrs");
            b10.a(this.f5153b, "attrs");
            b10.a(Arrays.deepToString(this.f5154c), "customOptions");
            return b10.toString();
        }
    }

    public static abstract class c {
        public abstract k0 a(e eVar);
    }

    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        public final f f5159a;

        public d(f fVar) {
            x6.b.y(fVar, "result");
            this.f5159a = fVar;
        }

        @Override // eb.k0.j
        public final f a(g gVar) {
            return this.f5159a;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("FixedResultPicker(");
            l10.append(this.f5159a);
            l10.append(")");
            return l10.toString();
        }
    }

    public static abstract class e {
        public abstract i a(b bVar);

        public abstract eb.d b();

        public abstract ScheduledExecutorService c();

        public abstract h1 d();

        public abstract void e();

        public abstract void f(n nVar, j jVar);
    }

    public static final class f {

        /* renamed from: e, reason: collision with root package name */
        public static final f f5160e = new f(null, null, e1.f5070e, false);

        /* renamed from: a, reason: collision with root package name */
        public final i f5161a;

        /* renamed from: b, reason: collision with root package name */
        public final h.a f5162b;

        /* renamed from: c, reason: collision with root package name */
        public final e1 f5163c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f5164d;

        public f(i iVar, i.g.a aVar, e1 e1Var, boolean z10) {
            this.f5161a = iVar;
            this.f5162b = aVar;
            x6.b.y(e1Var, "status");
            this.f5163c = e1Var;
            this.f5164d = z10;
        }

        public static f a(e1 e1Var) {
            x6.b.s("error status shouldn't be OK", !e1Var.e());
            return new f(null, null, e1Var, false);
        }

        public static f b(i iVar, i.g.a aVar) {
            x6.b.y(iVar, "subchannel");
            return new f(iVar, aVar, e1.f5070e, false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return x6.b.Q(this.f5161a, fVar.f5161a) && x6.b.Q(this.f5163c, fVar.f5163c) && x6.b.Q(this.f5162b, fVar.f5162b) && this.f5164d == fVar.f5164d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5161a, this.f5163c, this.f5162b, Boolean.valueOf(this.f5164d)});
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f5161a, "subchannel");
            b10.a(this.f5162b, "streamTracerFactory");
            b10.a(this.f5163c, "status");
            b10.c("drop", this.f5164d);
            return b10.toString();
        }
    }

    public static abstract class g {
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final List<u> f5165a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.a f5166b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f5167c;

        public h() {
            throw null;
        }

        public h(List list, eb.a aVar, Object obj) {
            x6.b.y(list, "addresses");
            this.f5165a = Collections.unmodifiableList(new ArrayList(list));
            x6.b.y(aVar, "attributes");
            this.f5166b = aVar;
            this.f5167c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return x6.b.Q(this.f5165a, hVar.f5165a) && x6.b.Q(this.f5166b, hVar.f5166b) && x6.b.Q(this.f5167c, hVar.f5167c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5165a, this.f5166b, this.f5167c});
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f5165a, "addresses");
            b10.a(this.f5166b, "attributes");
            b10.a(this.f5167c, "loadBalancingPolicyConfig");
            return b10.toString();
        }
    }

    public static abstract class i {
        public final u a() {
            List<u> b10 = b();
            x6.b.G(b10, "%s does not have exactly one group", b10 != null && b10.size() == 1);
            return b10.get(0);
        }

        public abstract List<u> b();

        public abstract eb.a c();

        public abstract eb.d d();

        public abstract Object e();

        public abstract void f();

        public abstract void g();

        public abstract void h(k kVar);

        public abstract void i(List<u> list);
    }

    public static abstract class j {
        public abstract f a(g gVar);
    }

    public interface k {
        void a(o oVar);
    }

    static {
        new a();
    }

    public e1 a(h hVar) {
        if (!hVar.f5165a.isEmpty() || b()) {
            int i10 = this.f5151a;
            this.f5151a = i10 + 1;
            if (i10 == 0) {
                d(hVar);
            }
            this.f5151a = 0;
            return e1.f5070e;
        }
        e1 e1Var = e1.f5078n;
        StringBuilder l10 = defpackage.f.l("NameResolver returned no usable address. addrs=");
        l10.append(hVar.f5165a);
        l10.append(", attrs=");
        l10.append(hVar.f5166b);
        e1 g10 = e1Var.g(l10.toString());
        c(g10);
        return g10;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(e1 e1Var);

    public void d(h hVar) {
        int i10 = this.f5151a;
        this.f5151a = i10 + 1;
        if (i10 == 0) {
            a(hVar);
        }
        this.f5151a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
