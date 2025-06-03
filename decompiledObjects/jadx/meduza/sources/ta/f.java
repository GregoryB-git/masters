package ta;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f14697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14698b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14699c;

    /* renamed from: d, reason: collision with root package name */
    public final e f14700d;

    public f(String str, String str2, long j10, e eVar) {
        this.f14697a = str;
        this.f14698b = str2;
        this.f14699c = j10;
        this.f14700d = eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14697a.equals(fVar.f14697a) && this.f14698b.equals(fVar.f14698b) && this.f14699c == fVar.f14699c && Objects.equals(this.f14700d, fVar.f14700d);
    }
}
