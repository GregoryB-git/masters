package d5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3450d;

    public b(String str, String str2, int i10, int i11) {
        this.f3447a = str;
        this.f3448b = str2;
        this.f3449c = i10;
        this.f3450d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3449c == bVar.f3449c && this.f3450d == bVar.f3450d && x6.b.Q(this.f3447a, bVar.f3447a) && x6.b.Q(this.f3448b, bVar.f3448b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3447a, this.f3448b, Integer.valueOf(this.f3449c), Integer.valueOf(this.f3450d)});
    }
}
