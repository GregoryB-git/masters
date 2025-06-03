/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.UUID
 */
package Z0;

import g0.z;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class o {
    public static byte[] a(UUID uUID, byte[] arrby) {
        return o.b(uUID, null, arrby);
    }

    public static byte[] b(UUID uUID2, UUID[] arruUID, byte[] arrby) {
        int n8;
        int n9 = arrby != null ? arrby.length : 0;
        n9 = n8 = n9 + 32;
        if (arruUID != null) {
            n9 = n8 + (arruUID.length * 16 + 4);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)n9);
        byteBuffer.putInt(n9);
        byteBuffer.putInt(1886614376);
        n9 = arruUID != null ? 16777216 : 0;
        byteBuffer.putInt(n9);
        byteBuffer.putLong(uUID2.getMostSignificantBits());
        byteBuffer.putLong(uUID2.getLeastSignificantBits());
        if (arruUID != null) {
            byteBuffer.putInt(arruUID.length);
            for (UUID uUID2 : arruUID) {
                byteBuffer.putLong(uUID2.getMostSignificantBits());
                byteBuffer.putLong(uUID2.getLeastSignificantBits());
            }
        }
        if (arrby != null && arrby.length != 0) {
            byteBuffer.putInt(arrby.length);
            byteBuffer.put(arrby);
        } else {
            byteBuffer.putInt(0);
        }
        return byteBuffer.array();
    }

    public static boolean c(byte[] arrby) {
        if (o.d(arrby) != null) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a d(byte[] var0) {
        block9 : {
            block8 : {
                var5_1 = new z((byte[])var0);
                if (var5_1.g() < 32) {
                    return null;
                }
                var5_1.T(0);
                var1_2 = var5_1.a();
                var2_3 = var5_1.p();
                if (var2_3 == var1_2) break block8;
                var0 = new StringBuilder();
                var0.append("Advertised atom size (");
                var0.append(var2_3);
                var4_4 = ") does not match buffer size: ";
                ** GOTO lbl25
            }
            var1_2 = var5_1.p();
            if (var1_2 == 1886614376) break block9;
            var0 = new StringBuilder();
            var4_4 = "Atom type is not pssh: ";
            ** GOTO lbl25
        }
        var2_3 = Z0.a.c(var5_1.p());
        if (var2_3 > 1) {
            var0 = new StringBuilder();
            var4_4 = "Unsupported pssh version: ";
            var1_2 = var2_3;
lbl25: // 3 sources:
            var0.append(var4_4);
            var0.append(var1_2);
        } else {
            var6_6 = new UUID(var5_1.z(), var5_1.z());
            if (var2_3 == 1) {
                var3_7 = var5_1.K();
                var4_5 = new UUID[var3_7];
                var1_2 = 0;
                do {
                    var0 = var4_5;
                    if (var1_2 < var3_7) {
                        var4_5[var1_2] = new UUID(var5_1.z(), var5_1.z());
                        ++var1_2;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                var0 = null;
            }
            if ((var1_2 = var5_1.K()) == (var3_7 = var5_1.a())) {
                var4_5 = new byte[var1_2];
                var5_1.l((byte[])var4_5, 0, var1_2);
                return new a(var6_6, var2_3, (byte[])var4_5, (UUID[])var0);
            }
            var0 = new StringBuilder();
            var0.append("Atom data size (");
            var0.append(var1_2);
            var0.append(") does not match the bytes left: ");
            var0.append(var3_7);
        }
        g0.o.h("PsshAtomUtil", var0.toString());
        return null;
    }

    public static byte[] e(byte[] object, UUID uUID) {
        if ((object = o.d((byte[])object)) == null) {
            return null;
        }
        if (!uUID.equals((Object)object.a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UUID mismatch. Expected: ");
            stringBuilder.append((Object)uUID);
            stringBuilder.append(", got: ");
            stringBuilder.append((Object)object.a);
            stringBuilder.append(".");
            g0.o.h("PsshAtomUtil", stringBuilder.toString());
            return null;
        }
        return object.c;
    }

    public static UUID f(byte[] object) {
        if ((object = o.d((byte[])object)) == null) {
            return null;
        }
        return object.a;
    }

    public static int g(byte[] object) {
        if ((object = o.d((byte[])object)) == null) {
            return -1;
        }
        return object.b;
    }

    public static final class a {
        public final UUID a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;

        public a(UUID uUID, int n8, byte[] arrby, UUID[] arruUID) {
            this.a = uUID;
            this.b = n8;
            this.c = arrby;
            this.d = arruUID;
        }
    }

}

