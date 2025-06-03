package R2;

import R2.C0585q3;
import java.util.EnumMap;

/* renamed from: R2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546l {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f5382a;

    public C0546l() {
        this.f5382a = new EnumMap(C0585q3.a.class);
    }

    public static C0546l b(String str) {
        EnumMap enumMap = new EnumMap(C0585q3.a.class);
        if (str.length() >= C0585q3.a.values().length) {
            int i7 = 0;
            if (str.charAt(0) == '1') {
                C0585q3.a[] values = C0585q3.a.values();
                int length = values.length;
                int i8 = 1;
                while (i7 < length) {
                    enumMap.put((EnumMap) values[i7], (C0585q3.a) EnumC0539k.e(str.charAt(i8)));
                    i7++;
                    i8++;
                }
                return new C0546l(enumMap);
            }
        }
        return new C0546l();
    }

    public final EnumC0539k a(C0585q3.a aVar) {
        EnumC0539k enumC0539k = (EnumC0539k) this.f5382a.get(aVar);
        return enumC0539k == null ? EnumC0539k.UNSET : enumC0539k;
    }

    public final void c(C0585q3.a aVar, int i7) {
        EnumC0539k enumC0539k = EnumC0539k.UNSET;
        if (i7 != -20) {
            if (i7 == -10) {
                enumC0539k = EnumC0539k.MANIFEST;
            } else if (i7 != 0) {
                if (i7 == 30) {
                    enumC0539k = EnumC0539k.INITIALIZATION;
                }
            }
            this.f5382a.put((EnumMap) aVar, (C0585q3.a) enumC0539k);
        }
        enumC0539k = EnumC0539k.API;
        this.f5382a.put((EnumMap) aVar, (C0585q3.a) enumC0539k);
    }

    public final void d(C0585q3.a aVar, EnumC0539k enumC0539k) {
        this.f5382a.put((EnumMap) aVar, (C0585q3.a) enumC0539k);
    }

    public final String toString() {
        char c7;
        StringBuilder sb = new StringBuilder("1");
        for (C0585q3.a aVar : C0585q3.a.values()) {
            EnumC0539k enumC0539k = (EnumC0539k) this.f5382a.get(aVar);
            if (enumC0539k == null) {
                enumC0539k = EnumC0539k.UNSET;
            }
            c7 = enumC0539k.f5365o;
            sb.append(c7);
        }
        return sb.toString();
    }

    public C0546l(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C0585q3.a.class);
        this.f5382a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
