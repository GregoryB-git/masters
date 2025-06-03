package d5;

import v5.e0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3477b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3478c;

    public e(String str, String str2, String str3) {
        this.f3476a = str;
        this.f3477b = str2;
        this.f3478c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return e0.a(this.f3476a, eVar.f3476a) && e0.a(this.f3477b, eVar.f3477b) && e0.a(this.f3478c, eVar.f3478c);
    }

    public final int hashCode() {
        int hashCode = this.f3476a.hashCode() * 31;
        String str = this.f3477b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3478c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
