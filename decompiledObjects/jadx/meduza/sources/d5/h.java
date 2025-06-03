package d5;

import v5.e0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3487a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3488b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3489c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3490d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3491e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f3487a = str;
        this.f3488b = str2;
        this.f3489c = str3;
        this.f3490d = str4;
        this.f3491e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.a(this.f3487a, hVar.f3487a) && e0.a(this.f3488b, hVar.f3488b) && e0.a(this.f3489c, hVar.f3489c) && e0.a(this.f3490d, hVar.f3490d) && e0.a(this.f3491e, hVar.f3491e);
    }

    public final int hashCode() {
        String str = this.f3487a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3488b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3489c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3490d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f3491e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
