package d4;

import java.util.Iterator;

/* loaded from: classes.dex */
public interface n extends Comparable, Iterable {

    /* renamed from: l, reason: collision with root package name */
    public static final c f13316l = new a();

    public enum b {
        V1,
        V2
    }

    n A(V3.k kVar);

    boolean B();

    int E();

    C1227b I(C1227b c1227b);

    n J(n nVar);

    Object L(boolean z7);

    n N(C1227b c1227b, n nVar);

    String O(b bVar);

    Iterator P();

    boolean Q(C1227b c1227b);

    String R();

    Object getValue();

    boolean isEmpty();

    n t();

    n v(C1227b c1227b);

    n y(V3.k kVar, n nVar);

    public class a extends c {
        @Override // d4.c, java.lang.Comparable
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public int compareTo(n nVar) {
            return nVar == this ? 0 : 1;
        }

        @Override // d4.c, d4.n
        public boolean Q(C1227b c1227b) {
            return false;
        }

        @Override // d4.c
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // d4.c, d4.n
        public boolean isEmpty() {
            return false;
        }

        @Override // d4.c
        public String toString() {
            return "<Max Node>";
        }

        @Override // d4.c, d4.n
        public n v(C1227b c1227b) {
            return c1227b.s() ? t() : g.W();
        }

        @Override // d4.c, d4.n
        public n t() {
            return this;
        }
    }
}
