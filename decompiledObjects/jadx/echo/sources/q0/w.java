package q0;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.M;
import F0.T;
import android.text.TextUtils;
import c1.t;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.E;
import g0.z;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.AbstractC1457h;

/* loaded from: classes.dex */
public final class w implements F0.r {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f18794i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f18795j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f18796a;

    /* renamed from: b, reason: collision with root package name */
    public final E f18797b;

    /* renamed from: d, reason: collision with root package name */
    public final t.a f18799d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18800e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0374t f18801f;

    /* renamed from: h, reason: collision with root package name */
    public int f18803h;

    /* renamed from: c, reason: collision with root package name */
    public final z f18798c = new z();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f18802g = new byte[1024];

    public w(String str, E e7, t.a aVar, boolean z7) {
        this.f18796a = str;
        this.f18797b = e7;
        this.f18799d = aVar;
        this.f18800e = z7;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        throw new IllegalStateException();
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f18801f = this.f18800e ? new c1.v(interfaceC0374t, this.f18799d) : interfaceC0374t;
        interfaceC0374t.e(new M.b(-9223372036854775807L));
    }

    public final T c(long j7) {
        T a7 = this.f18801f.a(0, 3);
        a7.d(new C1194q.b().o0("text/vtt").e0(this.f18796a).s0(j7).K());
        this.f18801f.j();
        return a7;
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.l(this.f18802g, 0, 6, false);
        this.f18798c.R(this.f18802g, 6);
        if (AbstractC1457h.b(this.f18798c)) {
            return true;
        }
        interfaceC0373s.l(this.f18802g, 6, 3, false);
        this.f18798c.R(this.f18802g, 9);
        return AbstractC1457h.b(this.f18798c);
    }

    public final void f() {
        z zVar = new z(this.f18802g);
        AbstractC1457h.e(zVar);
        long j7 = 0;
        long j8 = 0;
        for (String r7 = zVar.r(); !TextUtils.isEmpty(r7); r7 = zVar.r()) {
            if (r7.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f18794i.matcher(r7);
                if (!matcher.find()) {
                    throw C1162A.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + r7, null);
                }
                Matcher matcher2 = f18795j.matcher(r7);
                if (!matcher2.find()) {
                    throw C1162A.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + r7, null);
                }
                j8 = AbstractC1457h.d((String) AbstractC1297a.e(matcher.group(1)));
                j7 = E.h(Long.parseLong((String) AbstractC1297a.e(matcher2.group(1))));
            }
        }
        Matcher a7 = AbstractC1457h.a(zVar);
        if (a7 == null) {
            c(0L);
            return;
        }
        long d7 = AbstractC1457h.d((String) AbstractC1297a.e(a7.group(1)));
        long b7 = this.f18797b.b(E.l((j7 + d7) - j8));
        T c7 = c(b7 - d7);
        this.f18798c.R(this.f18802g, this.f18803h);
        c7.e(this.f18798c, this.f18803h);
        c7.b(b7, 1, this.f18803h, 0, null);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        AbstractC1297a.e(this.f18801f);
        int a7 = (int) interfaceC0373s.a();
        int i7 = this.f18803h;
        byte[] bArr = this.f18802g;
        if (i7 == bArr.length) {
            this.f18802g = Arrays.copyOf(bArr, ((a7 != -1 ? a7 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f18802g;
        int i8 = this.f18803h;
        int read = interfaceC0373s.read(bArr2, i8, bArr2.length - i8);
        if (read != -1) {
            int i9 = this.f18803h + read;
            this.f18803h = i9;
            if (a7 == -1 || i9 != a7) {
                return 0;
            }
        }
        f();
        return -1;
    }

    @Override // F0.r
    public void release() {
    }
}
