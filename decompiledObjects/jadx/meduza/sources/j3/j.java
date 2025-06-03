package j3;

import j3.t;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    public final long f8348a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8349b;

    /* renamed from: c, reason: collision with root package name */
    public final p f8350c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8351d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8352e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8353g;

    /* renamed from: h, reason: collision with root package name */
    public final w f8354h;

    /* renamed from: i, reason: collision with root package name */
    public final q f8355i;

    public static final class a extends t.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f8356a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f8357b;

        /* renamed from: c, reason: collision with root package name */
        public p f8358c;

        /* renamed from: d, reason: collision with root package name */
        public Long f8359d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f8360e;
        public String f;

        /* renamed from: g, reason: collision with root package name */
        public Long f8361g;

        /* renamed from: h, reason: collision with root package name */
        public w f8362h;

        /* renamed from: i, reason: collision with root package name */
        public q f8363i;
    }

    public j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f8348a = j10;
        this.f8349b = num;
        this.f8350c = pVar;
        this.f8351d = j11;
        this.f8352e = bArr;
        this.f = str;
        this.f8353g = j12;
        this.f8354h = wVar;
        this.f8355i = qVar;
    }

    @Override // j3.t
    public final p a() {
        return this.f8350c;
    }

    @Override // j3.t
    public final Integer b() {
        return this.f8349b;
    }

    @Override // j3.t
    public final long c() {
        return this.f8348a;
    }

    @Override // j3.t
    public final long d() {
        return this.f8351d;
    }

    @Override // j3.t
    public final q e() {
        return this.f8355i;
    }

    public final boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f8348a == tVar.c() && ((num = this.f8349b) != null ? num.equals(tVar.b()) : tVar.b() == null) && ((pVar = this.f8350c) != null ? pVar.equals(tVar.a()) : tVar.a() == null) && this.f8351d == tVar.d()) {
            if (Arrays.equals(this.f8352e, tVar instanceof j ? ((j) tVar).f8352e : tVar.g()) && ((str = this.f) != null ? str.equals(tVar.h()) : tVar.h() == null) && this.f8353g == tVar.i() && ((wVar = this.f8354h) != null ? wVar.equals(tVar.f()) : tVar.f() == null)) {
                q qVar = this.f8355i;
                q e10 = tVar.e();
                if (qVar == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (qVar.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j3.t
    public final w f() {
        return this.f8354h;
    }

    @Override // j3.t
    public final byte[] g() {
        return this.f8352e;
    }

    @Override // j3.t
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j10 = this.f8348a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f8349b;
        int hashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f8350c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f8351d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f8352e)) * 1000003;
        String str = this.f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f8353g;
        int i11 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f8354h;
        int hashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f8355i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // j3.t
    public final long i() {
        return this.f8353g;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("LogEvent{eventTimeMs=");
        l10.append(this.f8348a);
        l10.append(", eventCode=");
        l10.append(this.f8349b);
        l10.append(", complianceData=");
        l10.append(this.f8350c);
        l10.append(", eventUptimeMs=");
        l10.append(this.f8351d);
        l10.append(", sourceExtension=");
        l10.append(Arrays.toString(this.f8352e));
        l10.append(", sourceExtensionJsonProto3=");
        l10.append(this.f);
        l10.append(", timezoneOffsetSeconds=");
        l10.append(this.f8353g);
        l10.append(", networkConnectionInfo=");
        l10.append(this.f8354h);
        l10.append(", experimentIds=");
        l10.append(this.f8355i);
        l10.append("}");
        return l10.toString();
    }
}
