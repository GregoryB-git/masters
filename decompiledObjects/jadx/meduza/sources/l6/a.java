package l6;

import java.util.Arrays;
import k6.a;
import k6.a.d;

/* loaded from: classes.dex */
public final class a<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    public final int f9625a;

    /* renamed from: b, reason: collision with root package name */
    public final k6.a f9626b;

    /* renamed from: c, reason: collision with root package name */
    public final a.d f9627c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9628d;

    public a(k6.a aVar, a.d dVar, String str) {
        this.f9626b = aVar;
        this.f9627c = dVar;
        this.f9628d = str;
        this.f9625a = Arrays.hashCode(new Object[]{aVar, dVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m6.h.a(this.f9626b, aVar.f9626b) && m6.h.a(this.f9627c, aVar.f9627c) && m6.h.a(this.f9628d, aVar.f9628d);
    }

    public final int hashCode() {
        return this.f9625a;
    }
}
