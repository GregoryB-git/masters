package gb;

import eb.k0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s2 extends k0.g {

    /* renamed from: a, reason: collision with root package name */
    public final eb.c f6805a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.s0 f6806b;

    /* renamed from: c, reason: collision with root package name */
    public final eb.t0<?, ?> f6807c;

    public s2(eb.t0<?, ?> t0Var, eb.s0 s0Var, eb.c cVar) {
        x6.b.y(t0Var, Constants.METHOD);
        this.f6807c = t0Var;
        x6.b.y(s0Var, "headers");
        this.f6806b = s0Var;
        x6.b.y(cVar, "callOptions");
        this.f6805a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s2.class != obj.getClass()) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return x6.b.Q(this.f6805a, s2Var.f6805a) && x6.b.Q(this.f6806b, s2Var.f6806b) && x6.b.Q(this.f6807c, s2Var.f6807c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6805a, this.f6806b, this.f6807c});
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("[method=");
        l10.append(this.f6807c);
        l10.append(" headers=");
        l10.append(this.f6806b);
        l10.append(" callOptions=");
        l10.append(this.f6805a);
        l10.append("]");
        return l10.toString();
    }
}
