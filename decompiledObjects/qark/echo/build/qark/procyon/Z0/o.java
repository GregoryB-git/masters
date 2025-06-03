// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import g0.z;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class o
{
    public static byte[] a(final UUID uuid, final byte[] array) {
        return b(uuid, null, array);
    }
    
    public static byte[] b(UUID uuid, final UUID[] array, final byte[] src) {
        int length;
        if (src != null) {
            length = src.length;
        }
        else {
            length = 0;
        }
        int capacity;
        final int n = capacity = length + 32;
        if (array != null) {
            capacity = n + (array.length * 16 + 4);
        }
        final ByteBuffer allocate = ByteBuffer.allocate(capacity);
        allocate.putInt(capacity);
        allocate.putInt(1886614376);
        int n2;
        if (array != null) {
            n2 = 16777216;
        }
        else {
            n2 = 0;
        }
        allocate.putInt(n2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (array != null) {
            allocate.putInt(array.length);
            for (int length2 = array.length, i = 0; i < length2; ++i) {
                uuid = array[i];
                allocate.putLong(uuid.getMostSignificantBits());
                allocate.putLong(uuid.getLeastSignificantBits());
            }
        }
        if (src != null && src.length != 0) {
            allocate.putInt(src.length);
            allocate.put(src);
        }
        else {
            allocate.putInt(0);
        }
        return allocate.array();
    }
    
    public static boolean c(final byte[] array) {
        return d(array) != null;
    }
    
    public static a d(final byte[] array) {
        final z z = new z(array);
        if (z.g() < 32) {
            return null;
        }
        z.T(0);
        int i = z.a();
        final int p = z.p();
        StringBuilder sb = null;
        Label_0083: {
            String str;
            if (p != i) {
                sb = new StringBuilder();
                sb.append("Advertised atom size (");
                sb.append(p);
                str = ") does not match buffer size: ";
            }
            else {
                i = z.p();
                if (i != 1886614376) {
                    sb = new StringBuilder();
                    str = "Atom type is not pssh: ";
                }
                else {
                    final int c = Z0.a.c(z.p());
                    if (c > 1) {
                        sb = new StringBuilder();
                        str = "Unsupported pssh version: ";
                        i = c;
                    }
                    else {
                        final UUID uuid = new UUID(z.z(), z.z());
                        UUID[] array3;
                        if (c == 1) {
                            final int k = z.K();
                            final UUID[] array2 = new UUID[k];
                            int n = 0;
                            while (true) {
                                array3 = array2;
                                if (n >= k) {
                                    break;
                                }
                                array2[n] = new UUID(z.z(), z.z());
                                ++n;
                            }
                        }
                        else {
                            array3 = null;
                        }
                        final int j = z.K();
                        final int a = z.a();
                        if (j != a) {
                            sb = new StringBuilder();
                            sb.append("Atom data size (");
                            sb.append(j);
                            sb.append(") does not match the bytes left: ");
                            sb.append(a);
                            break Label_0083;
                        }
                        final byte[] array4 = new byte[j];
                        z.l(array4, 0, j);
                        return new a(uuid, c, array4, array3);
                    }
                }
            }
            sb.append(str);
            sb.append(i);
        }
        g0.o.h("PsshAtomUtil", sb.toString());
        return null;
    }
    
    public static byte[] e(final byte[] array, final UUID obj) {
        final a d = d(array);
        if (d == null) {
            return null;
        }
        if (!obj.equals(d.a)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("UUID mismatch. Expected: ");
            sb.append(obj);
            sb.append(", got: ");
            sb.append(d.a);
            sb.append(".");
            g0.o.h("PsshAtomUtil", sb.toString());
            return null;
        }
        return d.c;
    }
    
    public static UUID f(final byte[] array) {
        final a d = d(array);
        if (d == null) {
            return null;
        }
        return d.a;
    }
    
    public static int g(final byte[] array) {
        final a d = d(array);
        if (d == null) {
            return -1;
        }
        return d.b;
    }
    
    public static final class a
    {
        public final UUID a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;
        
        public a(final UUID a, final int b, final byte[] c, final UUID[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
