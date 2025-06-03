package gb;

import eb.u0;
import gb.g3;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d3 extends u0.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6296c;

    /* renamed from: d, reason: collision with root package name */
    public final i f6297d;

    public d3(boolean z10, int i10, int i11, i iVar) {
        this.f6294a = z10;
        this.f6295b = i10;
        this.f6296c = i11;
        this.f6297d = iVar;
    }

    @Override // eb.u0.f
    public final u0.b a(Map<String, ?> map) {
        List<g3.a> d10;
        u0.b bVar;
        try {
            i iVar = this.f6297d;
            iVar.getClass();
            Object obj = null;
            if (map != null) {
                try {
                    d10 = g3.d(g3.b(map));
                } catch (RuntimeException e10) {
                    bVar = new u0.b(eb.e1.f5071g.g("can't parse load balancer configuration").f(e10));
                }
            } else {
                d10 = null;
            }
            bVar = (d10 == null || d10.isEmpty()) ? null : g3.c(d10, iVar.f6465a);
            if (bVar != null) {
                eb.e1 e1Var = bVar.f5244a;
                if (e1Var != null) {
                    return new u0.b(e1Var);
                }
                obj = bVar.f5245b;
            }
            return new u0.b(g2.a(map, this.f6294a, this.f6295b, this.f6296c, obj));
        } catch (RuntimeException e11) {
            return new u0.b(eb.e1.f5071g.g("failed to parse service config").f(e11));
        }
    }
}
