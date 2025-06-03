package z4;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17727c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17728d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17729e;

    public s(Object obj, int i10, int i11, long j10, int i12) {
        this.f17725a = obj;
        this.f17726b = i10;
        this.f17727c = i11;
        this.f17728d = j10;
        this.f17729e = i12;
    }

    public s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public s(s sVar) {
        this.f17725a = sVar.f17725a;
        this.f17726b = sVar.f17726b;
        this.f17727c = sVar.f17727c;
        this.f17728d = sVar.f17728d;
        this.f17729e = sVar.f17729e;
    }

    public final boolean a() {
        return this.f17726b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f17725a.equals(sVar.f17725a) && this.f17726b == sVar.f17726b && this.f17727c == sVar.f17727c && this.f17728d == sVar.f17728d && this.f17729e == sVar.f17729e;
    }

    public final int hashCode() {
        return ((((((((this.f17725a.hashCode() + 527) * 31) + this.f17726b) * 31) + this.f17727c) * 31) + ((int) this.f17728d)) * 31) + this.f17729e;
    }
}
