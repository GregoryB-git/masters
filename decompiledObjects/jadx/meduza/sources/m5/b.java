package m5;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10214e;

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f10210a = i10;
        this.f10211b = i11;
        this.f10212c = i12;
        this.f10213d = i13;
        this.f10214e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c10;
        x6.b.q(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String x02 = x6.b.x0(split[i14].trim());
            x02.getClass();
            switch (x02.hashCode()) {
                case 100571:
                    if (x02.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (x02.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (x02.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (x02.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, split.length);
    }
}
