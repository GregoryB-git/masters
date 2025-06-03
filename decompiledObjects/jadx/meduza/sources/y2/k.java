package y2;

import p2.j0;

/* loaded from: classes.dex */
public final class k implements b1.x<Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f17383a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3.b f17384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.a f17386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1.u f17387e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f17388a;

        public a(Object obj) {
            this.f17388a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b1.u uVar;
            synchronized (k.this.f17385c) {
                Object apply = k.this.f17386d.apply(this.f17388a);
                k kVar = k.this;
                Object obj = kVar.f17383a;
                if (obj == null && apply != null) {
                    kVar.f17383a = apply;
                    uVar = kVar.f17387e;
                } else if (obj != null && !obj.equals(apply)) {
                    k kVar2 = k.this;
                    kVar2.f17383a = apply;
                    uVar = kVar2.f17387e;
                }
                uVar.postValue(apply);
            }
        }
    }

    public k(a3.b bVar, Object obj, j0 j0Var, b1.u uVar) {
        this.f17384b = bVar;
        this.f17385c = obj;
        this.f17386d = j0Var;
        this.f17387e = uVar;
    }

    @Override // b1.x
    public final void a(Object obj) {
        this.f17384b.d(new a(obj));
    }
}
