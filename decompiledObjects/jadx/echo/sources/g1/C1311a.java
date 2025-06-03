package g1;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.AbstractC1297a;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1311a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14354d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14355e;

    public C1311a(int i7, int i8, int i9, int i10, int i11) {
        this.f14351a = i7;
        this.f14352b = i8;
        this.f14353c = i9;
        this.f14354d = i10;
        this.f14355e = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C1311a a(String str) {
        char c7;
        AbstractC1297a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String e7 = W2.c.e(split[i11].trim());
            e7.hashCode();
            switch (e7.hashCode()) {
                case 100571:
                    if (e7.equals("end")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3556653:
                    if (e7.equals("text")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109757538:
                    if (e7.equals("start")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109780401:
                    if (e7.equals("style")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i8 = i11;
                    break;
                case 1:
                    i10 = i11;
                    break;
                case 2:
                    i7 = i11;
                    break;
                case 3:
                    i9 = i11;
                    break;
            }
        }
        if (i7 == -1 || i8 == -1 || i10 == -1) {
            return null;
        }
        return new C1311a(i7, i8, i9, i10, split.length);
    }
}
