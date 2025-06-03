package V4;

import a5.C0752a;
import c5.j;
import c5.k;
import c5.l;
import c5.o;
import c5.s;
import d5.C1228a;
import f5.C1293a;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements g {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6784a;

        static {
            int[] iArr = new int[V4.a.values().length];
            f6784a = iArr;
            try {
                iArr[V4.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6784a[V4.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6784a[V4.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6784a[V4.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6784a[V4.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6784a[V4.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6784a[V4.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6784a[V4.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6784a[V4.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6784a[V4.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6784a[V4.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6784a[V4.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6784a[V4.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        g kVar;
        switch (a.f6784a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new C1293a();
                break;
            case 6:
                kVar = new c5.f();
                break;
            case 7:
                kVar = new c5.h();
                break;
            case 8:
                kVar = new c5.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new C1228a();
                break;
            case 11:
                kVar = new c5.b();
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                kVar = new C0752a();
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                kVar = new W4.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return kVar.a(str, aVar, i7, i8, map);
    }
}
