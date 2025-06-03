package l3;

import android.content.Context;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9544a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.a f9545b;

    /* renamed from: c, reason: collision with root package name */
    public final t3.a f9546c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9547d;

    public c(Context context, t3.a aVar, t3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f9544a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f9545b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f9546c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f9547d = str;
    }

    @Override // l3.h
    public final Context a() {
        return this.f9544a;
    }

    @Override // l3.h
    public final String b() {
        return this.f9547d;
    }

    @Override // l3.h
    public final t3.a c() {
        return this.f9546c;
    }

    @Override // l3.h
    public final t3.a d() {
        return this.f9545b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f9544a.equals(hVar.a()) && this.f9545b.equals(hVar.d()) && this.f9546c.equals(hVar.c()) && this.f9547d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f9544a.hashCode() ^ 1000003) * 1000003) ^ this.f9545b.hashCode()) * 1000003) ^ this.f9546c.hashCode()) * 1000003) ^ this.f9547d.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CreationContext{applicationContext=");
        l10.append(this.f9544a);
        l10.append(", wallClock=");
        l10.append(this.f9545b);
        l10.append(", monotonicClock=");
        l10.append(this.f9546c);
        l10.append(", backendName=");
        return defpackage.g.f(l10, this.f9547d, "}");
    }
}
