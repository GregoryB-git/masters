package D6;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements Serializable, Comparable {

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f1492r = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: s, reason: collision with root package name */
    public static final c f1493s = n(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f1494o;

    /* renamed from: p, reason: collision with root package name */
    public transient int f1495p;

    /* renamed from: q, reason: collision with root package name */
    public transient String f1496q;

    public c(byte[] bArr) {
        this.f1494o = bArr;
    }

    public static int c(String str, int i7) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            if (i9 == i7) {
                return i8;
            }
            int codePointAt = str.codePointAt(i8);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i9++;
            i8 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static c h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) ((j(str.charAt(i8)) << 4) + j(str.charAt(i8 + 1)));
        }
        return n(bArr);
    }

    public static int j(char c7) {
        if (c7 >= '0' && c7 <= '9') {
            return c7 - '0';
        }
        if (c7 >= 'a' && c7 <= 'f') {
            return c7 - 'W';
        }
        if (c7 >= 'A' && c7 <= 'F') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    public static c n(byte... bArr) {
        if (bArr != null) {
            return new c((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static c p(InputStream inputStream, int i7) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i7);
        }
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read == -1) {
                throw new EOFException();
            }
            i8 += read;
        }
        return new c(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        c p7 = p(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = c.class.getDeclaredField("o");
            declaredField.setAccessible(true);
            declaredField.set(this, p7.f1494o);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f1494o.length);
        objectOutputStream.write(this.f1494o);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int r7 = r();
        int r8 = cVar.r();
        int min = Math.min(r7, r8);
        for (int i7 = 0; i7 < min; i7++) {
            int l7 = l(i7) & 255;
            int l8 = cVar.l(i7) & 255;
            if (l7 != l8) {
                return l7 < l8 ? -1 : 1;
            }
        }
        if (r7 == r8) {
            return 0;
        }
        return r7 < r8 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int r7 = cVar.r();
            byte[] bArr = this.f1494o;
            if (r7 == bArr.length && cVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i7 = this.f1495p;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f1494o);
        this.f1495p = hashCode;
        return hashCode;
    }

    public byte l(int i7) {
        return this.f1494o[i7];
    }

    public String m() {
        byte[] bArr = this.f1494o;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = f1492r;
            cArr[i7] = cArr2[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public boolean o(int i7, byte[] bArr, int i8, int i9) {
        if (i7 >= 0) {
            byte[] bArr2 = this.f1494o;
            if (i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && g.a(bArr2, i7, bArr, i8, i9)) {
                return true;
            }
        }
        return false;
    }

    public int r() {
        return this.f1494o.length;
    }

    public c s(int i7, int i8) {
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1494o;
        if (i8 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f1494o.length + ")");
        }
        int i9 = i8 - i7;
        if (i9 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i7 == 0 && i8 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i7, bArr2, 0, i9);
        return new c(bArr2);
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f1494o.length == 0) {
            return "[size=0]";
        }
        String u7 = u();
        int c7 = c(u7, 64);
        if (c7 == -1) {
            if (this.f1494o.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(m());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f1494o.length);
                sb2.append(" hex=");
                sb2.append(s(0, 64).m());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = u7.substring(0, c7).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (c7 < u7.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f1494o.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public String u() {
        String str = this.f1496q;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f1494o, g.f1508a);
        this.f1496q = str2;
        return str2;
    }
}
