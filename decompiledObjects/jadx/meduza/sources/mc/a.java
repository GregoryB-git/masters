package mc;

import a0.j;
import ec.i;

/* loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* renamed from: b, reason: collision with root package name */
    public static final long f11151b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f11152c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11153d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f11154a;

    static {
        int i10 = b.f11155a;
        f11151b = Long.MAX_VALUE;
        f11152c = -9223372036854775805L;
    }

    public static final boolean f(long j10) {
        return j10 == f11151b || j10 == f11152c;
    }

    public static final long g(long j10, c cVar) {
        i.e(cVar, "unit");
        if (j10 == f11151b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f11152c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        c cVar2 = (((int) j10) & 1) == 0 ? c.f11156b : c.f11157c;
        i.e(cVar2, "sourceUnit");
        return cVar.f11162a.convert(j11, cVar2.f11162a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        long j10 = aVar.f11154a;
        long j11 = this.f11154a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j11) & 1) - (((int) j10) & 1);
            return (j11 < 0 ? 1 : 0) != 0 ? -i10 : i10;
        }
        if (j11 < j10) {
            r8 = -1;
        } else if (j11 != j10) {
            r8 = 1;
        }
        return r8;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && this.f11154a == ((a) obj).f11154a;
    }

    public final int hashCode() {
        long j10 = this.f11154a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        int i10;
        int i11;
        int i12;
        String str;
        CharSequence charSequence;
        long j10 = this.f11154a;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f11151b) {
            return "Infinity";
        }
        if (j10 == f11152c) {
            return "-Infinity";
        }
        boolean z10 = j10 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (j10 < 0) {
            j10 = (((int) j10) & 1) + ((-(j10 >> 1)) << 1);
            int i13 = b.f11155a;
        }
        long g10 = g(j10, c.f11160o);
        int g11 = f(j10) ? 0 : (int) (g(j10, c.f) % 24);
        int g12 = f(j10) ? 0 : (int) (g(j10, c.f11159e) % 60);
        int g13 = f(j10) ? 0 : (int) (g(j10, c.f11158d) % 60);
        if (f(j10)) {
            i10 = 0;
        } else {
            boolean z11 = (((int) j10) & 1) == 1;
            long j11 = j10 >> 1;
            i10 = (int) (z11 ? (j11 % 1000) * 1000000 : j11 % 1000000000);
        }
        boolean z12 = g10 != 0;
        boolean z13 = g11 != 0;
        boolean z14 = g12 != 0;
        boolean z15 = (g13 == 0 && i10 == 0) ? false : true;
        if (z12) {
            sb2.append(g10);
            sb2.append('d');
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (z13 || (z12 && (z14 || z15))) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(g11);
            sb2.append('h');
            i11 = i14;
        }
        if (z14 || (z15 && (z13 || z12))) {
            int i15 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(g12);
            sb2.append('m');
            i11 = i15;
        }
        if (z15) {
            int i16 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (g13 != 0 || z12 || z13 || z14) {
                i12 = 9;
                str = "s";
            } else if (i10 >= 1000000) {
                g13 = i10 / 1000000;
                i10 %= 1000000;
                i12 = 6;
                str = "ms";
            } else if (i10 >= 1000) {
                g13 = i10 / 1000;
                i10 %= 1000;
                str = "us";
                i12 = 3;
            } else {
                sb2.append(i10);
                sb2.append("ns");
                i11 = i16;
            }
            sb2.append(g13);
            if (i10 != 0) {
                sb2.append('.');
                String valueOf = String.valueOf(i10);
                i.e(valueOf, "<this>");
                if (i12 < 0) {
                    throw new IllegalArgumentException(j.h("Desired length ", i12, " is less than zero."));
                }
                if (i12 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb3 = new StringBuilder(i12);
                    int length = i12 - valueOf.length();
                    if (1 <= length) {
                        int i17 = 1;
                        while (true) {
                            sb3.append('0');
                            if (i17 == length) {
                                break;
                            }
                            i17++;
                        }
                    }
                    sb3.append((CharSequence) valueOf);
                    charSequence = sb3;
                }
                String obj = charSequence.toString();
                int i18 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i19 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
                            i18 = length2;
                            break;
                        }
                        if (i19 < 0) {
                            break;
                        }
                        length2 = i19;
                    }
                }
                int i20 = i18 + 1;
                if (i20 >= 3) {
                    i20 = ((i20 + 2) / 3) * 3;
                }
                sb2.append((CharSequence) obj, 0, i20);
            }
            sb2.append(str);
            i11 = i16;
        }
        if (z10 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
