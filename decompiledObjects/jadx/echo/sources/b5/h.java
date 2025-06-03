package b5;

import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f9984a;

    /* renamed from: b, reason: collision with root package name */
    public l f9985b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f9986c;

    /* renamed from: d, reason: collision with root package name */
    public int f9987d;

    /* renamed from: e, reason: collision with root package name */
    public int f9988e;

    /* renamed from: f, reason: collision with root package name */
    public k f9989f;

    /* renamed from: g, reason: collision with root package name */
    public int f9990g;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i7 = 0; i7 < length; i7++) {
            char c7 = (char) (bytes[i7] & 255);
            if (c7 == '?' && str.charAt(i7) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c7);
        }
        this.f9984a = sb.toString();
        this.f9985b = l.FORCE_NONE;
        this.f9986c = new StringBuilder(str.length());
        this.f9988e = -1;
    }

    public int a() {
        return this.f9986c.length();
    }

    public StringBuilder b() {
        return this.f9986c;
    }

    public char c() {
        return this.f9984a.charAt(this.f9987d);
    }

    public String d() {
        return this.f9984a;
    }

    public int e() {
        return this.f9988e;
    }

    public int f() {
        return h() - this.f9987d;
    }

    public k g() {
        return this.f9989f;
    }

    public final int h() {
        return this.f9984a.length() - this.f9990g;
    }

    public boolean i() {
        return this.f9987d < h();
    }

    public void j() {
        this.f9988e = -1;
    }

    public void k() {
        this.f9989f = null;
    }

    public void m(int i7) {
        this.f9990g = i7;
    }

    public void n(l lVar) {
        this.f9985b = lVar;
    }

    public void o(int i7) {
        this.f9988e = i7;
    }

    public void p() {
        q(a());
    }

    public void q(int i7) {
        k kVar = this.f9989f;
        if (kVar == null || i7 > kVar.a()) {
            this.f9989f = k.l(i7, this.f9985b, null, null, true);
        }
    }

    public void r(char c7) {
        this.f9986c.append(c7);
    }

    public void s(String str) {
        this.f9986c.append(str);
    }

    public void l(V4.b bVar, V4.b bVar2) {
    }
}
