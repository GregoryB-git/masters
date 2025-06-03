// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D6;

import java.util.Arrays;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.Serializable;

public class c implements Serializable, Comparable
{
    public static final char[] r;
    public static final c s;
    private static final long serialVersionUID = 1L;
    public final byte[] o;
    public transient int p;
    public transient String q;
    
    static {
        r = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        s = n(new byte[0]);
    }
    
    public c(final byte[] o) {
        this.o = o;
    }
    
    public static int c(final String s, final int n) {
        final int length = s.length();
        int i = 0;
        int n2 = 0;
        while (i < length) {
            if (n2 == n) {
                return i;
            }
            final int codePoint = s.codePointAt(i);
            if ((Character.isISOControl(codePoint) && codePoint != 10 && codePoint != 13) || codePoint == 65533) {
                return -1;
            }
            ++n2;
            i += Character.charCount(codePoint);
        }
        return s.length();
    }
    
    public static c h(final String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 == 0) {
            final int n = str.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int index = i * 2;
                array[i] = (byte)((j(str.charAt(index)) << 4) + j(str.charAt(index + 1)));
            }
            return n(array);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int j(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected hex digit: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static c n(final byte... array) {
        if (array != null) {
            return new c(array.clone());
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static c p(final InputStream inputStream, final int i) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i >= 0) {
            final byte[] b = new byte[i];
            int read;
            for (int j = 0; j < i; j += read) {
                read = inputStream.read(b, j, i - j);
                if (read == -1) {
                    throw new EOFException();
                }
            }
            return new c(b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        final c p = p(objectInputStream, objectInputStream.readInt());
        while (true) {
            try {
                final Field declaredField = c.class.getDeclaredField("o");
                declaredField.setAccessible(true);
                declaredField.set(this, p.o);
                return;
                throw new AssertionError();
            }
            catch (NoSuchFieldException ex) {
                throw new AssertionError();
            }
            catch (IllegalAccessException ex2) {}
            continue;
        }
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.o.length);
        objectOutputStream.write(this.o);
    }
    
    public int e(final c c) {
        final int r = this.r();
        final int r2 = c.r();
        final int min = Math.min(r, r2);
        int i = 0;
        while (i < min) {
            final int n = this.l(i) & 0xFF;
            final int n2 = c.l(i) & 0xFF;
            if (n == n2) {
                ++i;
            }
            else {
                if (n < n2) {
                    return -1;
                }
                return 1;
            }
        }
        if (r == r2) {
            return 0;
        }
        if (r < r2) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            final int r = c.r();
            final byte[] o2 = this.o;
            if (r == o2.length && c.o(0, o2, 0, o2.length)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int p = this.p;
        if (p != 0) {
            return p;
        }
        return this.p = Arrays.hashCode(this.o);
    }
    
    public byte l(final int n) {
        return this.o[n];
    }
    
    public String m() {
        final byte[] o = this.o;
        final char[] value = new char[o.length * 2];
        final int length = o.length;
        int n = 0;
        int n2 = 0;
        while (true) {
            final int n3 = n2;
            if (n >= length) {
                break;
            }
            final byte b = o[n];
            final char[] r = c.r;
            value[n3] = r[b >> 4 & 0xF];
            n2 = n3 + 2;
            value[n3 + 1] = r[b & 0xF];
            ++n;
        }
        return new String(value);
    }
    
    public boolean o(final int n, final byte[] array, final int n2, final int n3) {
        if (n >= 0) {
            final byte[] o = this.o;
            if (n <= o.length - n3 && n2 >= 0 && n2 <= array.length - n3 && g.a(o, n, array, n2, n3)) {
                return true;
            }
        }
        return false;
    }
    
    public int r() {
        return this.o.length;
    }
    
    public c s(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        final byte[] o = this.o;
        if (n2 > o.length) {
            final StringBuilder sb = new StringBuilder();
            sb.append("endIndex > length(");
            sb.append(this.o.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        final int n3 = n2 - n;
        if (n3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (n == 0 && n2 == o.length) {
            return this;
        }
        final byte[] array = new byte[n3];
        System.arraycopy(o, n, array, 0, n3);
        return new c(array);
    }
    
    @Override
    public String toString() {
        if (this.o.length == 0) {
            return "[size=0]";
        }
        final String u = this.u();
        final int c = c(u, 64);
        if (c == -1) {
            StringBuilder sb;
            if (this.o.length <= 64) {
                sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(this.m());
                sb.append("]");
            }
            else {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(this.o.length);
                sb.append(" hex=");
                sb.append(this.s(0, 64).m());
                sb.append("\u2026]");
            }
            return sb.toString();
        }
        final String replace = u.substring(0, c).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        StringBuilder sb2;
        if (c < u.length()) {
            sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(this.o.length);
            sb2.append(" text=");
            sb2.append(replace);
            sb2.append("\u2026]");
        }
        else {
            sb2 = new StringBuilder();
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
        }
        return sb2.toString();
    }
    
    public String u() {
        final String q = this.q;
        if (q != null) {
            return q;
        }
        return this.q = new String(this.o, g.a);
    }
}
