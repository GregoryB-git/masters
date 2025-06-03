/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Comparable
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Field
 *  java.nio.charset.Charset
 *  java.util.Arrays
 */
package D6;

import D6.g;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;

public class c
implements Serializable,
Comparable {
    public static final char[] r = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final c s = c.n(new byte[0]);
    private static final long serialVersionUID = 1L;
    public final byte[] o;
    public transient int p;
    public transient String q;

    public c(byte[] arrby) {
        this.o = arrby;
    }

    public static int c(String string2, int n8) {
        int n9;
        int n10 = string2.length();
        int n11 = 0;
        for (int i8 = 0; i8 < n10; i8 += Character.charCount((int)n9)) {
            if (n11 == n8) {
                return i8;
            }
            n9 = string2.codePointAt(i8);
            if (Character.isISOControl((int)n9) && n9 != 10 && n9 != 13 || n9 == 65533) {
                return -1;
            }
            ++n11;
        }
        return string2.length();
    }

    public static c h(String string2) {
        if (string2 != null) {
            if (string2.length() % 2 == 0) {
                int n8 = string2.length() / 2;
                byte[] arrby = new byte[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    int n9 = i8 * 2;
                    arrby[i8] = (byte)((c.j(string2.charAt(n9)) << 4) + c.j(string2.charAt(n9 + 1)));
                }
                return c.n(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(string2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("hex == null");
    }

    public static int j(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - 48;
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 87;
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - 55;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append(c8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static /* varargs */ c n(byte ... arrby) {
        if (arrby != null) {
            return new c((byte[])arrby.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static c p(InputStream inputStream, int n8) {
        if (inputStream != null) {
            if (n8 >= 0) {
                int n9;
                byte[] arrby = new byte[n8];
                for (int i8 = 0; i8 < n8; i8 += n9) {
                    n9 = inputStream.read(arrby, i8, n8 - i8);
                    if (n9 != -1) {
                        continue;
                    }
                    throw new EOFException();
                }
                return new c(arrby);
            }
            inputStream = new StringBuilder();
            inputStream.append("byteCount < 0: ");
            inputStream.append(n8);
            throw new IllegalArgumentException(inputStream.toString());
        }
        throw new IllegalArgumentException("in == null");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void readObject(ObjectInputStream object) {
        object = c.p((InputStream)object, object.readInt());
        try {
            Field field = c.class.getDeclaredField("o");
            field.setAccessible(true);
            field.set((Object)this, (Object)object.o);
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.o.length);
        objectOutputStream.write(this.o);
    }

    public int e(c c8) {
        int n8 = this.r();
        int n9 = c8.r();
        int n10 = Math.min((int)n8, (int)n9);
        for (int i8 = 0; i8 < n10; ++i8) {
            int n11;
            int n12 = this.l(i8) & 255;
            if (n12 == (n11 = c8.l(i8) & 255)) {
                continue;
            }
            if (n12 < n11) {
                return -1;
            }
            return 1;
        }
        if (n8 == n9) {
            return 0;
        }
        if (n8 < n9) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object object) {
        int n8;
        byte[] arrby;
        if (object == this) {
            return true;
        }
        if (object instanceof c && (n8 = (object = (c)object).r()) == (arrby = this.o).length && object.o(0, arrby, 0, arrby.length)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.p;
        if (n8 != 0) {
            return n8;
        }
        this.p = n8 = Arrays.hashCode((byte[])this.o);
        return n8;
    }

    public byte l(int n8) {
        return this.o[n8];
    }

    public String m() {
        byte[] arrby = this.o;
        char[] arrc = new char[arrby.length * 2];
        int n8 = arrby.length;
        int n9 = 0;
        int n10 = 0;
        do {
            int n11 = n10;
            if (n9 >= n8) break;
            byte by = arrby[n9];
            char[] arrc2 = r;
            arrc[n11] = arrc2[by >> 4 & 15];
            n10 = n11 + 2;
            arrc[n11 + 1] = arrc2[by & 15];
            ++n9;
        } while (true);
        return new String(arrc);
    }

    public boolean o(int n8, byte[] arrby, int n9, int n10) {
        byte[] arrby2;
        if (n8 >= 0 && n8 <= (arrby2 = this.o).length - n10 && n9 >= 0 && n9 <= arrby.length - n10 && g.a(arrby2, n8, arrby, n9, n10)) {
            return true;
        }
        return false;
    }

    public int r() {
        return this.o.length;
    }

    public c s(int n8, int n9) {
        if (n8 >= 0) {
            StringBuilder stringBuilder = this.o;
            if (n9 <= stringBuilder.length) {
                int n10 = n9 - n8;
                if (n10 >= 0) {
                    if (n8 == 0 && n9 == stringBuilder.length) {
                        return this;
                    }
                    byte[] arrby = new byte[n10];
                    System.arraycopy((Object)stringBuilder, (int)n8, (Object)arrby, (int)0, (int)n10);
                    return new c(arrby);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > length(");
            stringBuilder.append(this.o.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        if (this.o.length == 0) {
            return "[size=0]";
        }
        String string2 = this.u();
        int n8 = c.c(string2, 64);
        if (n8 == -1) {
            if (this.o.length <= 64) {
                string2 = new StringBuilder();
                string2.append("[hex=");
                string2.append(this.m());
                string2.append("]");
                do {
                    return string2.toString();
                    break;
                } while (true);
            }
            string2 = new StringBuilder();
            string2.append("[size=");
            string2.append(this.o.length);
            string2.append(" hex=");
            string2.append(this.s(0, 64).m());
            string2.append("\u2026]");
            return string2.toString();
        }
        String string3 = string2.substring(0, n8).replace((CharSequence)"\\", (CharSequence)"\\\\").replace((CharSequence)"\n", (CharSequence)"\\n").replace((CharSequence)"\r", (CharSequence)"\\r");
        if (n8 < string2.length()) {
            string2 = new StringBuilder();
            string2.append("[size=");
            string2.append(this.o.length);
            string2.append(" text=");
            string2.append(string3);
            string2.append("\u2026]");
            do {
                return string2.toString();
                break;
            } while (true);
        }
        string2 = new StringBuilder();
        string2.append("[text=");
        string2.append(string3);
        string2.append("]");
        return string2.toString();
    }

    public String u() {
        String string2 = this.q;
        if (string2 != null) {
            return string2;
        }
        this.q = string2 = new String(this.o, g.a);
        return string2;
    }
}

