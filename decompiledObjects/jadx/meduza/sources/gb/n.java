package gb;

import eb.d;
import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class n extends eb.d {

    /* renamed from: a, reason: collision with root package name */
    public final p f6602a;

    /* renamed from: b, reason: collision with root package name */
    public final o3 f6603b;

    public n(p pVar, o3 o3Var) {
        this.f6602a = pVar;
        x6.b.y(o3Var, "time");
        this.f6603b = o3Var;
    }

    public static Level c(d.a aVar) {
        int ordinal = aVar.ordinal();
        return ordinal != 1 ? (ordinal == 2 || ordinal == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // eb.d
    public final void a(d.a aVar, String str) {
        eb.f0 f0Var = this.f6602a.f6625b;
        Level c10 = c(aVar);
        if (p.f6623c.isLoggable(c10)) {
            p.a(f0Var, c10, str);
        }
        if (aVar != d.a.DEBUG) {
            p pVar = this.f6602a;
            synchronized (pVar.f6624a) {
                pVar.getClass();
            }
        }
    }

    @Override // eb.d
    public final void b(d.a aVar, String str, Object... objArr) {
        Level c10 = c(aVar);
        if (aVar != d.a.DEBUG) {
            p pVar = this.f6602a;
            synchronized (pVar.f6624a) {
                pVar.getClass();
            }
        }
        a(aVar, p.f6623c.isLoggable(c10) ? MessageFormat.format(str, objArr) : null);
    }
}
