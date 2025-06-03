package t2;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14412a = new a();
    }

    /* renamed from: t2.b$b, reason: collision with other inner class name */
    public static final class C0227b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14413a;

        public C0227b(int i10) {
            this.f14413a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0227b) && this.f14413a == ((C0227b) obj).f14413a;
        }

        public final int hashCode() {
            return this.f14413a;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("ConstraintsNotMet(reason=");
            l10.append(this.f14413a);
            l10.append(')');
            return l10.toString();
        }
    }
}
