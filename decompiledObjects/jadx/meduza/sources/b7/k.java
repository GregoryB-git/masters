package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.b;
import b7.c0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends n6.a {
    public static final Parcelable.Creator<k> CREATOR = new u1();

    /* renamed from: a, reason: collision with root package name */
    public final b f1973a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f1974b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f1975c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f1976d;

    public k(String str, Boolean bool, String str2, String str3) {
        b bVar;
        c0 c0Var = null;
        if (str != null) {
            try {
                b[] values = b.values();
                int length = values.length;
                for (int i10 = 0; i10 < length; i10++) {
                    bVar = values[i10];
                    if (!str.equals(bVar.f1924a)) {
                    }
                }
                throw new b.a(str);
            } catch (b.a e10) {
                e = e10;
                throw new IllegalArgumentException(e);
            } catch (c0.a e11) {
                e = e11;
                throw new IllegalArgumentException(e);
            } catch (f1 e12) {
                e = e12;
                throw new IllegalArgumentException(e);
            }
        }
        bVar = null;
        this.f1973a = bVar;
        this.f1974b = bool;
        this.f1975c = str2 == null ? null : g1.f(str2);
        if (str3 != null) {
            c0[] values2 = c0.values();
            int length2 = values2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                c0Var = values2[i11];
                if (!str3.equals(c0Var.f1932a)) {
                }
            }
            throw new c0.a(str3);
        }
        this.f1976d = c0Var;
    }

    public final c0 D() {
        c0 c0Var = this.f1976d;
        if (c0Var != null) {
            return c0Var;
        }
        Boolean bool = this.f1974b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return c0.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m6.h.a(this.f1973a, kVar.f1973a) && m6.h.a(this.f1974b, kVar.f1974b) && m6.h.a(this.f1975c, kVar.f1975c) && m6.h.a(D(), kVar.D());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1973a, this.f1974b, this.f1975c, D()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b bVar = this.f1973a;
        b.z.F(parcel, 2, bVar == null ? null : bVar.f1924a, false);
        b.z.u(parcel, 3, this.f1974b);
        g1 g1Var = this.f1975c;
        b.z.F(parcel, 4, g1Var == null ? null : g1Var.f1963a, false);
        b.z.F(parcel, 5, D() != null ? D().f1932a : null, false);
        b.z.L(J, parcel);
    }
}
