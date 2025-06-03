package Z0;

import F0.T;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7796a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7797b;

    /* renamed from: c, reason: collision with root package name */
    public final T.a f7798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7799d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7800e;

    public t(boolean z7, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        AbstractC1297a.a((bArr2 == null) ^ (i7 == 0));
        this.f7796a = z7;
        this.f7797b = str;
        this.f7799d = i7;
        this.f7800e = bArr2;
        this.f7798c = new T.a(a(str), bArr, i8, i9);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c7 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c7 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c7 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c7 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c7 = 3;
                    break;
                }
                break;
        }
        switch (c7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case 1:
                return 2;
            default:
                g0.o.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
