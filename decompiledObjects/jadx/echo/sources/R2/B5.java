package R2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.E7;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class B5 extends AbstractC0649z5 {
    public B5(D5 d52) {
        super(d52);
    }

    private final String v(String str) {
        String Q6 = r().Q(str);
        if (TextUtils.isEmpty(Q6)) {
            return (String) K.f4856s.a(null);
        }
        Uri parse = Uri.parse((String) K.f4856s.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(Q6 + "." + parse.getAuthority());
        return buildUpon.build().toString();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ N5 o() {
        return super.o();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ b6 p() {
        return super.p();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0574p q() {
        return super.q();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0632x2 r() {
        return super.r();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0517g5 s() {
        return super.s();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ B5 t() {
        return super.t();
    }

    public final E5 u(String str) {
        if (E7.a() && f().s(K.f4767A0)) {
            j().K().a("sgtm feature flag enabled.");
            I2 D02 = q().D0(str);
            if (D02 == null) {
                return new E5(v(str));
            }
            E5 e52 = null;
            if (D02.t()) {
                j().K().a("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.L1 L6 = r().L(D02.t0());
                if (L6 != null) {
                    String S6 = L6.S();
                    if (!TextUtils.isEmpty(S6)) {
                        String R6 = L6.R();
                        j().K().c("sgtm configured with upload_url, server_info", S6, TextUtils.isEmpty(R6) ? "Y" : "N");
                        if (TextUtils.isEmpty(R6)) {
                            e52 = new E5(S6);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", R6);
                            e52 = new E5(S6, hashMap);
                        }
                    }
                }
            }
            if (e52 != null) {
                return e52;
            }
        }
        return new E5(v(str));
    }
}
