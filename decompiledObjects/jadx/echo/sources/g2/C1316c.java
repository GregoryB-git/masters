package g2;

import android.content.Context;
import p2.InterfaceC1791a;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14396a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1791a f14397b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1791a f14398c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14399d;

    public C1316c(Context context, InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f14396a = context;
        if (interfaceC1791a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f14397b = interfaceC1791a;
        if (interfaceC1791a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f14398c = interfaceC1791a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f14399d = str;
    }

    @Override // g2.h
    public Context b() {
        return this.f14396a;
    }

    @Override // g2.h
    public String c() {
        return this.f14399d;
    }

    @Override // g2.h
    public InterfaceC1791a d() {
        return this.f14398c;
    }

    @Override // g2.h
    public InterfaceC1791a e() {
        return this.f14397b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f14396a.equals(hVar.b()) && this.f14397b.equals(hVar.e()) && this.f14398c.equals(hVar.d()) && this.f14399d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f14396a.hashCode() ^ 1000003) * 1000003) ^ this.f14397b.hashCode()) * 1000003) ^ this.f14398c.hashCode()) * 1000003) ^ this.f14399d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f14396a + ", wallClock=" + this.f14397b + ", monotonicClock=" + this.f14398c + ", backendName=" + this.f14399d + "}";
    }
}
