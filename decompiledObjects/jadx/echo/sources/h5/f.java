package h5;

import g5.EnumC1320a;
import g5.EnumC1321b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public EnumC1321b f14598a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC1320a f14599b;

    /* renamed from: c, reason: collision with root package name */
    public g5.c f14600c;

    /* renamed from: d, reason: collision with root package name */
    public int f14601d = -1;

    /* renamed from: e, reason: collision with root package name */
    public b f14602e;

    public static boolean b(int i7) {
        return i7 >= 0 && i7 < 8;
    }

    public b a() {
        return this.f14602e;
    }

    public void c(EnumC1320a enumC1320a) {
        this.f14599b = enumC1320a;
    }

    public void d(int i7) {
        this.f14601d = i7;
    }

    public void e(b bVar) {
        this.f14602e = bVar;
    }

    public void f(EnumC1321b enumC1321b) {
        this.f14598a = enumC1321b;
    }

    public void g(g5.c cVar) {
        this.f14600c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f14598a);
        sb.append("\n ecLevel: ");
        sb.append(this.f14599b);
        sb.append("\n version: ");
        sb.append(this.f14600c);
        sb.append("\n maskPattern: ");
        sb.append(this.f14601d);
        if (this.f14602e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f14602e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
