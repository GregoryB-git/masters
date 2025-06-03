package k4;

import java.nio.ByteBuffer;
import java.util.UUID;
import v5.u;

/* loaded from: classes.dex */
public final class h {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f9032a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9033b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f9034c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f9032a = uuid;
            this.f9033b = i10;
            this.f9034c = bArr;
        }
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static a b(byte[] bArr) {
        u uVar = new u(bArr);
        if (uVar.f15976c < 32) {
            return null;
        }
        uVar.G(0);
        if (uVar.f() != (uVar.f15976c - uVar.f15975b) + 4 || uVar.f() != 1886614376) {
            return null;
        }
        int f = (uVar.f() >> 24) & 255;
        if (f > 1) {
            defpackage.f.p("Unsupported pssh version: ", f, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(uVar.o(), uVar.o());
        if (f == 1) {
            uVar.H(uVar.y() * 16);
        }
        int y10 = uVar.y();
        if (y10 != uVar.f15976c - uVar.f15975b) {
            return null;
        }
        byte[] bArr2 = new byte[y10];
        uVar.d(bArr2, 0, y10);
        return new a(uuid, f, bArr2);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        a b10 = b(bArr);
        if (b10 == null) {
            return null;
        }
        if (uuid.equals(b10.f9032a)) {
            return b10.f9034c;
        }
        v5.m.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b10.f9032a + ".");
        return null;
    }
}
