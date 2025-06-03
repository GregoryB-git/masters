package eb;

import java.util.Arrays;
import n7.g;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5025a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5026b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5027c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f5028d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f5029e;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public b0(String str, a aVar, long j10, e0 e0Var) {
        this.f5025a = str;
        x6.b.y(aVar, "severity");
        this.f5026b = aVar;
        this.f5027c = j10;
        this.f5028d = null;
        this.f5029e = e0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return x6.b.Q(this.f5025a, b0Var.f5025a) && x6.b.Q(this.f5026b, b0Var.f5026b) && this.f5027c == b0Var.f5027c && x6.b.Q(this.f5028d, b0Var.f5028d) && x6.b.Q(this.f5029e, b0Var.f5029e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5025a, this.f5026b, Long.valueOf(this.f5027c), this.f5028d, this.f5029e});
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f5025a, "description");
        b10.a(this.f5026b, "severity");
        b10.b("timestampNanos", this.f5027c);
        b10.a(this.f5028d, "channelRef");
        b10.a(this.f5029e, "subchannelRef");
        return b10.toString();
    }
}
