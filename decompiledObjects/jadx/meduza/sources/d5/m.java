package d5;

import java.util.Locale;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3527a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3528b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3529c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3530d;

    public m(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f3527a = strArr;
        this.f3528b = iArr;
        this.f3529c = strArr2;
        this.f3530d = i10;
    }

    public final String a(String str, long j10, long j11, int i10) {
        String format;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f3530d;
            if (i11 >= i12) {
                sb2.append(this.f3527a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f3527a[i11]);
            int i13 = this.f3528b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else {
                if (i13 == 2) {
                    format = String.format(Locale.US, this.f3529c[i11], Long.valueOf(j10));
                } else if (i13 == 3) {
                    format = String.format(Locale.US, this.f3529c[i11], Integer.valueOf(i10));
                } else if (i13 == 4) {
                    format = String.format(Locale.US, this.f3529c[i11], Long.valueOf(j11));
                }
                sb2.append(format);
            }
            i11++;
        }
    }
}
