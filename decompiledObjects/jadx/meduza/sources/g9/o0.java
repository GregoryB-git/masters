package g9;

import e7.p3;
import java.util.Set;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final p3 f6040a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.l f6041b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6042c;

    public o0(p3 p3Var, j9.l lVar, boolean z10) {
        this.f6040a = p3Var;
        this.f6041b = lVar;
        this.f6042c = z10;
    }

    public final void a(j9.l lVar) {
        ((Set) this.f6040a.f4568c).add(lVar);
    }

    public final o0 b(j9.l lVar) {
        j9.l lVar2 = this.f6041b;
        j9.l f = lVar2 == null ? null : lVar2.f(lVar);
        o0 o0Var = new o0(this.f6040a, f, false);
        if (f != null) {
            for (int i10 = 0; i10 < o0Var.f6041b.q(); i10++) {
                o0Var.e(o0Var.f6041b.n(i10));
            }
        }
        return o0Var;
    }

    public final IllegalArgumentException c(String str) {
        String str2;
        j9.l lVar = this.f6041b;
        if (lVar == null || lVar.o()) {
            str2 = "";
        } else {
            StringBuilder l10 = defpackage.f.l(" (found in field ");
            l10.append(this.f6041b.h());
            l10.append(")");
            str2 = l10.toString();
        }
        return new IllegalArgumentException(defpackage.g.e("Invalid data. ", str, str2));
    }

    public final boolean d() {
        int ordinal = ((p0) this.f6040a.f4567b).ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3 || ordinal == 4) {
            return false;
        }
        x6.b.T("Unexpected case for UserDataSource: %s", ((p0) this.f6040a.f4567b).name());
        throw null;
    }

    public final void e(String str) {
        if (str.isEmpty()) {
            throw c("Document fields must not be empty");
        }
        if (d() && str.startsWith("__") && str.endsWith("__")) {
            throw c("Document fields cannot begin and end with \"__\"");
        }
    }
}
