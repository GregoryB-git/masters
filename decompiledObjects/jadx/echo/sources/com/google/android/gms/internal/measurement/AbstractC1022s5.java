package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1022s5 {
    public static String a(AbstractC1003q3 abstractC1003q3) {
        String str;
        C1013r5 c1013r5 = new C1013r5(abstractC1003q3);
        StringBuilder sb = new StringBuilder(c1013r5.a());
        for (int i7 = 0; i7 < c1013r5.a(); i7++) {
            int e7 = c1013r5.e(i7);
            if (e7 == 34) {
                str = "\\\"";
            } else if (e7 == 39) {
                str = "\\'";
            } else if (e7 != 92) {
                switch (e7) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        str = "\\f";
                        break;
                    case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        str = "\\r";
                        break;
                    default:
                        if (e7 < 32 || e7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((e7 >>> 6) & 3) + 48));
                            sb.append((char) (((e7 >>> 3) & 7) + 48));
                            e7 = (e7 & 7) + 48;
                        }
                        sb.append((char) e7);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
