package g9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final a f6011a;

    /* renamed from: b, reason: collision with root package name */
    public final ka.d0 f6012b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.l f6013c;

    public enum a {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* renamed from: a, reason: collision with root package name */
        public final String f6023a;

        a(String str) {
            this.f6023a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f6023a;
        }
    }

    public l(j9.l lVar, a aVar, ka.d0 d0Var) {
        this.f6013c = lVar;
        this.f6011a = aVar;
        this.f6012b = d0Var;
    }

    public static l e(j9.l lVar, a aVar, ka.d0 d0Var) {
        a aVar2 = a.ARRAY_CONTAINS_ANY;
        a aVar3 = a.NOT_IN;
        a aVar4 = a.IN;
        a aVar5 = a.ARRAY_CONTAINS;
        if (!lVar.u()) {
            return aVar == aVar5 ? new c(lVar, d0Var) : aVar == aVar4 ? new v(lVar, d0Var) : aVar == aVar2 ? new b(lVar, d0Var) : aVar == aVar3 ? new c0(lVar, d0Var) : new l(lVar, aVar, d0Var);
        }
        if (aVar == aVar4) {
            return new x(lVar, d0Var);
        }
        if (aVar == aVar3) {
            return new y(lVar, d0Var);
        }
        x6.b.Z(defpackage.g.f(new StringBuilder(), aVar.f6023a, "queries don't make sense on document keys"), (aVar == aVar5 || aVar == aVar2) ? false : true, new Object[0]);
        return new w(lVar, aVar, d0Var);
    }

    @Override // g9.m
    public final String a() {
        return this.f6013c.h() + this.f6011a.f6023a + j9.s.a(this.f6012b);
    }

    @Override // g9.m
    public final List<m> b() {
        return Collections.singletonList(this);
    }

    @Override // g9.m
    public final List<l> c() {
        return Collections.singletonList(this);
    }

    @Override // g9.m
    public boolean d(j9.g gVar) {
        ka.d0 g10 = gVar.g(this.f6013c);
        return this.f6011a == a.NOT_EQUAL ? g10 != null && g(j9.s.c(g10, this.f6012b)) : g10 != null && j9.s.n(g10) == j9.s.n(this.f6012b) && g(j9.s.c(g10, this.f6012b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6011a == lVar.f6011a && this.f6013c.equals(lVar.f6013c) && this.f6012b.equals(lVar.f6012b);
    }

    public final boolean f() {
        return Arrays.asList(a.LESS_THAN, a.LESS_THAN_OR_EQUAL, a.GREATER_THAN, a.GREATER_THAN_OR_EQUAL, a.NOT_EQUAL, a.NOT_IN).contains(this.f6011a);
    }

    public final boolean g(int i10) {
        int ordinal = this.f6011a.ordinal();
        if (ordinal == 0) {
            return i10 < 0;
        }
        if (ordinal == 1) {
            return i10 <= 0;
        }
        if (ordinal == 2) {
            return i10 == 0;
        }
        if (ordinal == 3) {
            return i10 != 0;
        }
        if (ordinal == 4) {
            return i10 > 0;
        }
        if (ordinal == 5) {
            return i10 >= 0;
        }
        x6.b.T("Unknown FieldFilter operator: %s", this.f6011a);
        throw null;
    }

    public final int hashCode() {
        return this.f6012b.hashCode() + ((this.f6013c.hashCode() + ((this.f6011a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
