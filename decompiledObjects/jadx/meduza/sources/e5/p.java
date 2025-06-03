package e5;

import android.text.TextUtils;
import c4.s;
import c4.t;
import c4.v;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v3.a1;
import v3.i0;
import v5.c0;
import v5.u;

/* loaded from: classes.dex */
public final class p implements c4.h {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f4047g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f4048h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f4049a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f4050b;

    /* renamed from: d, reason: collision with root package name */
    public c4.j f4052d;
    public int f;

    /* renamed from: c, reason: collision with root package name */
    public final u f4051c = new u();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4053e = new byte[1024];

    public p(String str, c0 c0Var) {
        this.f4049a = str;
        this.f4050b = c0Var;
    }

    public final v a(long j10) {
        v r10 = this.f4052d.r(0, 3);
        i0.a aVar = new i0.a();
        aVar.f15472k = "text/vtt";
        aVar.f15465c = this.f4049a;
        aVar.f15476o = j10;
        r10.d(aVar.a());
        this.f4052d.m();
        return r10;
    }

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f4052d = jVar;
        jVar.t(new t.b(-9223372036854775807L));
    }

    @Override // c4.h
    public final int d(c4.i iVar, s sVar) {
        String g10;
        this.f4052d.getClass();
        int length = (int) iVar.getLength();
        int i10 = this.f;
        byte[] bArr = this.f4053e;
        if (i10 == bArr.length) {
            this.f4053e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f4053e;
        int i11 = this.f;
        int read = iVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f + read;
            this.f = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        u uVar = new u(this.f4053e);
        q5.h.d(uVar);
        String g11 = uVar.g();
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(g11)) {
                while (true) {
                    String g12 = uVar.g();
                    if (g12 == null) {
                        break;
                    }
                    if (q5.h.f13327a.matcher(g12).matches()) {
                        do {
                            g10 = uVar.g();
                            if (g10 != null) {
                            }
                        } while (!g10.isEmpty());
                    } else {
                        Matcher matcher2 = q5.f.f13302a.matcher(g12);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                } else {
                    String group = matcher.group(1);
                    group.getClass();
                    long c10 = q5.h.c(group);
                    long b10 = this.f4050b.b(((((j10 + c10) - j11) * 90000) / 1000000) % 8589934592L);
                    v a10 = a(b10 - c10);
                    this.f4051c.E(this.f4053e, this.f);
                    a10.b(this.f, this.f4051c);
                    a10.c(b10, 1, this.f, 0, null);
                }
                return -1;
            }
            if (g11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f4047g.matcher(g11);
                if (!matcher3.find()) {
                    throw a1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + g11, null);
                }
                Matcher matcher4 = f4048h.matcher(g11);
                if (!matcher4.find()) {
                    throw a1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + g11, null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j11 = q5.h.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j10 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            g11 = uVar.g();
        }
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        c4.e eVar = (c4.e) iVar;
        eVar.c(this.f4053e, 0, 6, false);
        this.f4051c.E(this.f4053e, 6);
        if (q5.h.a(this.f4051c)) {
            return true;
        }
        eVar.c(this.f4053e, 6, 3, false);
        this.f4051c.E(this.f4053e, 9);
        return q5.h.a(this.f4051c);
    }

    @Override // c4.h
    public final void release() {
    }
}
