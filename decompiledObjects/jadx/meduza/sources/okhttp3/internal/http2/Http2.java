package okhttp3.internal.http2;

import defpackage.g;
import java.io.IOException;
import okhttp3.internal.Util;
import xc.i;

/* loaded from: classes.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f12530a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12531b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f12532c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f12533d;

    static {
        i iVar = i.f17259d;
        f12530a = i.a.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f12531b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f12532c = new String[64];
        f12533d = new String[256];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f12533d;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = Util.l("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f12532c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = f12532c;
            strArr3[i13 | 8] = g.f(new StringBuilder(), strArr3[i13], "|PADDED");
        }
        String[] strArr4 = f12532c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = f12532c;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i17]);
                sb2.append('|');
                strArr5[i18 | 8] = g.f(sb2, strArr5[i15], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f12532c;
            if (i10 >= strArr6.length) {
                return;
            }
            if (strArr6[i10] == null) {
                strArr6[i10] = f12533d[i10];
            }
            i10++;
        }
    }

    private Http2() {
    }

    public static String a(boolean z10, int i10, int i11, byte b10, byte b11) {
        String str;
        String str2;
        String str3;
        String[] strArr = f12531b;
        String l10 = b10 < strArr.length ? strArr[b10] : Util.l("0x%02x", Byte.valueOf(b10));
        if (b11 == 0) {
            str = "";
        } else {
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    str = b11 == 1 ? "ACK" : f12533d[b11];
                } else if (b10 != 7 && b10 != 8) {
                    String[] strArr2 = f12532c;
                    String str4 = b11 < strArr2.length ? strArr2[b11] : f12533d[b11];
                    if (b10 == 5 && (b11 & 4) != 0) {
                        str2 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (b10 != 0 || (b11 & 32) == 0) {
                        str = str4;
                    } else {
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = str4.replace(str2, str3);
                }
            }
            str = f12533d[b11];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z10 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = l10;
        objArr[4] = str;
        return Util.l("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static void b(String str, Object... objArr) {
        throw new IOException(Util.l(str, objArr));
    }
}
