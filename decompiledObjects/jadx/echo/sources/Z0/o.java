package Z0;

import g0.z;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class o {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f7772a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7773b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7774c;

        /* renamed from: d, reason: collision with root package name */
        public final UUID[] f7775d;

        public a(UUID uuid, int i7, byte[] bArr, UUID[] uuidArr) {
            this.f7772a = uuid;
            this.f7773b = i7;
            this.f7774c = bArr;
            this.f7775d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        StringBuilder sb;
        String str;
        z zVar = new z(bArr);
        if (zVar.g() < 32) {
            return null;
        }
        zVar.T(0);
        int a7 = zVar.a();
        int p7 = zVar.p();
        if (p7 != a7) {
            sb = new StringBuilder();
            sb.append("Advertised atom size (");
            sb.append(p7);
            str = ") does not match buffer size: ";
        } else {
            a7 = zVar.p();
            if (a7 != 1886614376) {
                sb = new StringBuilder();
                str = "Atom type is not pssh: ";
            } else {
                a7 = Z0.a.c(zVar.p());
                if (a7 <= 1) {
                    UUID uuid = new UUID(zVar.z(), zVar.z());
                    if (a7 == 1) {
                        int K6 = zVar.K();
                        uuidArr = new UUID[K6];
                        for (int i7 = 0; i7 < K6; i7++) {
                            uuidArr[i7] = new UUID(zVar.z(), zVar.z());
                        }
                    } else {
                        uuidArr = null;
                    }
                    int K7 = zVar.K();
                    int a8 = zVar.a();
                    if (K7 == a8) {
                        byte[] bArr2 = new byte[K7];
                        zVar.l(bArr2, 0, K7);
                        return new a(uuid, a7, bArr2, uuidArr);
                    }
                    sb = new StringBuilder();
                    sb.append("Atom data size (");
                    sb.append(K7);
                    sb.append(") does not match the bytes left: ");
                    sb.append(a8);
                    g0.o.h("PsshAtomUtil", sb.toString());
                    return null;
                }
                sb = new StringBuilder();
                str = "Unsupported pssh version: ";
            }
        }
        sb.append(str);
        sb.append(a7);
        g0.o.h("PsshAtomUtil", sb.toString());
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d7 = d(bArr);
        if (d7 == null) {
            return null;
        }
        if (uuid.equals(d7.f7772a)) {
            return d7.f7774c;
        }
        g0.o.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d7.f7772a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d7 = d(bArr);
        if (d7 == null) {
            return null;
        }
        return d7.f7772a;
    }

    public static int g(byte[] bArr) {
        a d7 = d(bArr);
        if (d7 == null) {
            return -1;
        }
        return d7.f7773b;
    }
}
