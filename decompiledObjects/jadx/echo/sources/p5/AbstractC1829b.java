package p5;

import java.util.List;
import n5.C1737F;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1829b implements InterfaceC1832e {
    @Override // p5.InterfaceC1832e
    public C1737F d() {
        return new C1737F(m(), n());
    }

    @Override // p5.InterfaceC1832e
    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    @Override // p5.InterfaceC1832e
    public Boolean f() {
        return k("inTransaction");
    }

    @Override // p5.InterfaceC1832e
    public Integer g() {
        return (Integer) c("transactionId");
    }

    @Override // p5.InterfaceC1832e
    public boolean h() {
        return j("transactionId") && g() == null;
    }

    public final Boolean k(String str) {
        Object c7 = c(str);
        if (c7 instanceof Boolean) {
            return (Boolean) c7;
        }
        return null;
    }

    public boolean l() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }

    public final String m() {
        return (String) c("sql");
    }

    public final List n() {
        return (List) c("arguments");
    }

    public String toString() {
        return "" + i() + " " + m() + " " + n();
    }
}
