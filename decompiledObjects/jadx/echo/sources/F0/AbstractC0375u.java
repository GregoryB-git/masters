package F0;

import d0.C1162A;
import java.io.EOFException;

/* renamed from: F0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0375u {
    public static void a(boolean z7, String str) {
        if (!z7) {
            throw C1162A.a(str, null);
        }
    }

    public static boolean b(InterfaceC0373s interfaceC0373s, byte[] bArr, int i7, int i8, boolean z7) {
        try {
            return interfaceC0373s.l(bArr, i7, i8, z7);
        } catch (EOFException e7) {
            if (z7) {
                return false;
            }
            throw e7;
        }
    }

    public static int c(InterfaceC0373s interfaceC0373s, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int f7 = interfaceC0373s.f(bArr, i7 + i9, i8 - i9);
            if (f7 == -1) {
                break;
            }
            i9 += f7;
        }
        return i9;
    }

    public static boolean d(InterfaceC0373s interfaceC0373s, byte[] bArr, int i7, int i8) {
        try {
            interfaceC0373s.readFully(bArr, i7, i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC0373s interfaceC0373s, int i7) {
        try {
            interfaceC0373s.i(i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
