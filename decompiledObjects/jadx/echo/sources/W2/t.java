package W2;

import W2.t;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class t {

    public static class a implements s, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final s f6847o;

        /* renamed from: p, reason: collision with root package name */
        public volatile transient boolean f6848p;

        /* renamed from: q, reason: collision with root package name */
        public transient Object f6849q;

        public a(s sVar) {
            this.f6847o = (s) m.j(sVar);
        }

        @Override // W2.s
        public Object get() {
            if (!this.f6848p) {
                synchronized (this) {
                    try {
                        if (!this.f6848p) {
                            Object obj = this.f6847o.get();
                            this.f6849q = obj;
                            this.f6848p = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return j.a(this.f6849q);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f6848p) {
                obj = "<supplier that returned " + this.f6849q + ">";
            } else {
                obj = this.f6847o;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class b implements s {

        /* renamed from: q, reason: collision with root package name */
        public static final s f6850q = new s() { // from class: W2.u
            @Override // W2.s
            public final Object get() {
                Void b7;
                b7 = t.b.b();
                return b7;
            }
        };

        /* renamed from: o, reason: collision with root package name */
        public volatile s f6851o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6852p;

        public b(s sVar) {
            this.f6851o = (s) m.j(sVar);
        }

        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        @Override // W2.s
        public Object get() {
            s sVar = this.f6851o;
            s sVar2 = f6850q;
            if (sVar != sVar2) {
                synchronized (this) {
                    try {
                        if (this.f6851o != sVar2) {
                            Object obj = this.f6851o.get();
                            this.f6852p = obj;
                            this.f6851o = sVar2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return j.a(this.f6852p);
        }

        public String toString() {
            Object obj = this.f6851o;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == f6850q) {
                obj = "<supplier that returned " + this.f6852p + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class c implements s, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final Object f6853o;

        public c(Object obj) {
            this.f6853o = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return k.a(this.f6853o, ((c) obj).f6853o);
            }
            return false;
        }

        @Override // W2.s
        public Object get() {
            return this.f6853o;
        }

        public int hashCode() {
            return k.b(this.f6853o);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f6853o + ")";
        }
    }

    public static s a(s sVar) {
        return ((sVar instanceof b) || (sVar instanceof a)) ? sVar : sVar instanceof Serializable ? new a(sVar) : new b(sVar);
    }

    public static s b(Object obj) {
        return new c(obj);
    }
}
