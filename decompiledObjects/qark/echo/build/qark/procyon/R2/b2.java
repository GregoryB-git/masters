// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class b2 implements Runnable
{
    public final /* synthetic */ int o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Y1 t;
    
    public b2(final Y1 t, final int o, final String p6, final Object q, final Object r, final Object s) {
        this.t = t;
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        final l2 f = this.t.a.F();
        if (!f.r()) {
            this.t.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (Y1.u(this.t) == '\0') {
            Y1 y1;
            char c;
            if (this.t.f().T()) {
                y1 = this.t;
                c = 'C';
            }
            else {
                y1 = this.t;
                c = 'c';
            }
            Y1.A(y1, c);
        }
        if (Y1.D(this.t) < 0L) {
            Y1.B(this.t, 82001L);
        }
        final char char1 = "01VDIWEA?".charAt(this.o);
        final char u = Y1.u(this.t);
        final long d = Y1.D(this.t);
        final String x = Y1.x(true, this.p, this.q, this.r, this.s);
        final StringBuilder sb = new StringBuilder("2");
        sb.append(char1);
        sb.append(u);
        sb.append(d);
        sb.append(":");
        sb.append(x);
        String s;
        if ((s = sb.toString()).length() > 1024) {
            s = this.p.substring(0, 1024);
        }
        final p2 d2 = f.d;
        if (d2 != null) {
            d2.b(s, 1L);
        }
    }
}
