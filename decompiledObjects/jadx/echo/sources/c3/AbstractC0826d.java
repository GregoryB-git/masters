package c3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.C1794C;
import p3.I;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0826d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f10077a = new byte[0];

    /* renamed from: c3.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10078a;

        static {
            int[] iArr = new int[I.values().length];
            f10078a = iArr;
            try {
                iArr[I.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10078a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10078a[I.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10078a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(C1794C.c cVar) {
        ByteBuffer put;
        int i7 = a.f10078a[cVar.b0().ordinal()];
        if (i7 == 1 || i7 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    return f10077a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        return put.putInt(cVar.a0()).array();
    }
}
