package R2;

import A2.AbstractC0328n;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0858a2;
import com.google.android.gms.internal.measurement.C0876c2;
import com.google.android.gms.internal.measurement.C0885d2;
import com.google.android.gms.internal.measurement.C0894e2;
import com.google.android.gms.internal.measurement.C0921h2;
import com.google.android.gms.internal.measurement.C0979n6;
import com.google.android.gms.internal.measurement.C1024s7;
import com.google.android.gms.internal.measurement.Y1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: R2.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613u4 extends C5 {
    public C0613u4(D5 d52) {
        super(d52);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // R2.C5
    public final boolean x() {
        return false;
    }

    public final byte[] y(I i7, String str) {
        T5 t52;
        C0885d2.a aVar;
        Bundle bundle;
        I2 i22;
        C0876c2.a aVar2;
        byte[] bArr;
        long j7;
        E a7;
        n();
        this.f5424a.Q();
        AbstractC0328n.i(i7);
        AbstractC0328n.e(str);
        if (!f().B(str, K.f4831f0)) {
            j().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(i7.f4704o) && !"_iapx".equals(i7.f4704o)) {
            j().F().c("Generating a payload for this event is not available. package_name, event_name", str, i7.f4704o);
            return null;
        }
        C0876c2.a J6 = C0876c2.J();
        q().Q0();
        try {
            I2 D02 = q().D0(str);
            if (D02 == null) {
                j().F().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!D02.r()) {
                j().F().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C0885d2.a O02 = C0885d2.A3().m0(1).O0("android");
            if (!TextUtils.isEmpty(D02.t0())) {
                O02.O(D02.t0());
            }
            if (!TextUtils.isEmpty(D02.v0())) {
                O02.a0((String) AbstractC0328n.i(D02.v0()));
            }
            if (!TextUtils.isEmpty(D02.h())) {
                O02.g0((String) AbstractC0328n.i(D02.h()));
            }
            if (D02.z() != -2147483648L) {
                O02.d0((int) D02.z());
            }
            O02.j0(D02.g0()).Y(D02.c0());
            String j8 = D02.j();
            String r02 = D02.r0();
            if (!TextUtils.isEmpty(j8)) {
                O02.I0(j8);
            } else if (!TextUtils.isEmpty(r02)) {
                O02.I(r02);
            }
            O02.y0(D02.p0());
            C0585q3 Q6 = this.f5633b.Q(str);
            O02.S(D02.a0());
            if (this.f5424a.p() && f().K(O02.S0()) && Q6.x() && !TextUtils.isEmpty(null)) {
                O02.z0(null);
            }
            O02.o0(Q6.v());
            if (Q6.x() && D02.q()) {
                Pair z7 = s().z(D02.t0(), Q6);
                if (D02.q() && z7 != null && !TextUtils.isEmpty((CharSequence) z7.first)) {
                    O02.Q0(c((String) z7.first, Long.toString(i7.f4707r)));
                    Object obj = z7.second;
                    if (obj != null) {
                        O02.V(((Boolean) obj).booleanValue());
                    }
                }
            }
            g().o();
            C0885d2.a w02 = O02.w0(Build.MODEL);
            g().o();
            w02.M0(Build.VERSION.RELEASE).u0((int) g().v()).T0(g().w());
            if (Q6.y() && D02.u0() != null) {
                O02.U(c((String) AbstractC0328n.i(D02.u0()), Long.toString(i7.f4707r)));
            }
            if (!TextUtils.isEmpty(D02.i())) {
                O02.G0((String) AbstractC0328n.i(D02.i()));
            }
            String t02 = D02.t0();
            List M02 = q().M0(t02);
            Iterator it = M02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t52 = null;
                    break;
                }
                t52 = (T5) it.next();
                if ("_lte".equals(t52.f5047c)) {
                    break;
                }
            }
            if (t52 == null || t52.f5049e == null) {
                T5 t53 = new T5(t02, "auto", "_lte", b().a(), 0L);
                M02.add(t53);
                q().d0(t53);
            }
            C0921h2[] c0921h2Arr = new C0921h2[M02.size()];
            for (int i8 = 0; i8 < M02.size(); i8++) {
                C0921h2.a B7 = C0921h2.X().z(((T5) M02.get(i8)).f5047c).B(((T5) M02.get(i8)).f5048d);
                o().U(B7, ((T5) M02.get(i8)).f5049e);
                c0921h2Arr[i8] = (C0921h2) ((com.google.android.gms.internal.measurement.Y3) B7.p());
            }
            O02.f0(Arrays.asList(c0921h2Arr));
            o().T(O02);
            if (C0979n6.a() && f().s(K.f4805T0)) {
                this.f5633b.s(D02, O02);
            }
            C0486c2 b7 = C0486c2.b(i7);
            k().Q(b7.f5233d, q().B0(str));
            k().K(b7, f().y(str));
            Bundle bundle2 = b7.f5233d;
            bundle2.putLong("_c", 1L);
            j().F().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", i7.f4706q);
            if (k().F0(O02.S0())) {
                k().R(bundle2, "_dbg", 1L);
                k().R(bundle2, "_r", 1L);
            }
            E C02 = q().C0(str, i7.f4704o);
            if (C02 == null) {
                aVar = O02;
                bundle = bundle2;
                i22 = D02;
                aVar2 = J6;
                bArr = null;
                a7 = new E(str, i7.f4704o, 0L, 0L, i7.f4707r, 0L, null, null, null, null);
                j7 = 0;
            } else {
                aVar = O02;
                bundle = bundle2;
                i22 = D02;
                aVar2 = J6;
                bArr = null;
                j7 = C02.f4645f;
                a7 = C02.a(i7.f4707r);
            }
            q().T(a7);
            A a8 = new A(this.f5424a, i7.f4706q, str, i7.f4704o, i7.f4707r, j7, bundle);
            Y1.a A7 = com.google.android.gms.internal.measurement.Y1.Z().G(a8.f4538d).E(a8.f4536b).A(a8.f4539e);
            Iterator it2 = a8.f4540f.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                C0858a2.a B8 = C0858a2.Z().B(str2);
                Object k7 = a8.f4540f.k(str2);
                if (k7 != null) {
                    o().S(B8, k7);
                    A7.B(B8);
                }
            }
            C0885d2.a aVar3 = aVar;
            aVar3.D(A7).E(C0894e2.G().w(com.google.android.gms.internal.measurement.Z1.G().w(a7.f4642c).x(i7.f4704o)));
            aVar3.H(p().z(i22.t0(), Collections.emptyList(), aVar3.Z0(), Long.valueOf(A7.I()), Long.valueOf(A7.I())));
            if (A7.M()) {
                aVar3.v0(A7.I()).e0(A7.I());
            }
            long i02 = i22.i0();
            if (i02 != 0) {
                aVar3.n0(i02);
            }
            long m02 = i22.m0();
            if (m02 != 0) {
                aVar3.r0(m02);
            } else if (i02 != 0) {
                aVar3.r0(i02);
            }
            String m7 = i22.m();
            if (C1024s7.a() && f().B(str, K.f4869y0) && m7 != null) {
                aVar3.R0(m7);
            }
            i22.p();
            aVar3.i0((int) i22.k0()).F0(82001L).C0(b().a()).b0(true);
            if (f().s(K.f4771C0)) {
                this.f5633b.E(aVar3.S0(), aVar3);
            }
            C0876c2.a aVar4 = aVar2;
            aVar4.x(aVar3);
            I2 i23 = i22;
            i23.j0(aVar3.W());
            i23.f0(aVar3.Q());
            q().U(i23);
            q().T0();
            try {
                return o().g0(((C0876c2) ((com.google.android.gms.internal.measurement.Y3) aVar4.p())).h());
            } catch (IOException e7) {
                j().G().c("Data loss. Failed to bundle and serialize. appId", Y1.v(str), e7);
                return bArr;
            }
        } catch (SecurityException e8) {
            j().F().b("Resettable device id encryption failed", e8.getMessage());
            return new byte[0];
        } catch (SecurityException e9) {
            j().F().b("app instance id encryption failed", e9.getMessage());
            return new byte[0];
        } finally {
            q().R0();
        }
    }
}
