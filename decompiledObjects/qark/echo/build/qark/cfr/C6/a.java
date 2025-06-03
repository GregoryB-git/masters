/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.net.IDN
 *  java.net.InetAddress
 *  java.net.UnknownHostException
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.Locale
 *  java.util.TimeZone
 *  java.util.regex.Pattern
 */
package C6;

import B6.f;
import B6.h;
import D6.c;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class a {
    public static final byte[] a;
    public static final String[] b;
    public static final h c;
    public static final f d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final Charset j;
    public static final Charset k;
    public static final Charset l;
    public static final Charset m;
    public static final Charset n;
    public static final Charset o;
    public static final TimeZone p;
    public static final Comparator q;
    public static final Method r;
    public static final Pattern s;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Method method;
        Method method2 = new Method[]{};
        a = method2;
        b = new String[0];
        method = null;
        c = h.b(null, (byte[])method2);
        d = f.a(null, (byte[])method2);
        e = c.h("efbbbf");
        f = c.h("feff");
        g = c.h("fffe");
        h = c.h("0000ffff");
        i = c.h("ffff0000");
        j = Charset.forName((String)"UTF-8");
        k = Charset.forName((String)"ISO-8859-1");
        l = Charset.forName((String)"UTF-16BE");
        m = Charset.forName((String)"UTF-16LE");
        n = Charset.forName((String)"UTF-32BE");
        o = Charset.forName((String)"UTF-32LE");
        p = TimeZone.getTimeZone((String)"GMT");
        q = new Comparator(){

            public int a(String string2, String string3) {
                return string2.compareTo(string3);
            }
        };
        try {
            method = method2 = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        }
        catch (Exception exception) {}
        r = method;
        s = Pattern.compile((String)"([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static String a(String string2) {
        block7 : {
            if (string2.contains((CharSequence)":")) {
                InetAddress inetAddress = string2.startsWith("[") && string2.endsWith("]") ? a.g(string2, 1, string2.length() - 1) : a.g(string2, 0, string2.length());
                if (inetAddress == null) {
                    return null;
                }
                if ((inetAddress = inetAddress.getAddress()).length == 16) {
                    return a.j((byte[])inetAddress);
                }
                inetAddress = new StringBuilder();
                inetAddress.append("Invalid IPv6 address: '");
                inetAddress.append(string2);
                inetAddress.append("'");
                throw new AssertionError((Object)inetAddress.toString());
            }
            try {
                string2 = IDN.toASCII((String)string2).toLowerCase(Locale.US);
                if (!string2.isEmpty()) break block7;
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        boolean bl = a.d(string2);
        if (bl) {
            return null;
        }
        return string2;
    }

    public static void b(long l8, long l9, long l10) {
        if ((l9 | l10) >= 0L && l9 <= l8 && l8 - l9 >= l10) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean d(String string2) {
        for (int i8 = 0; i8 < string2.length(); ++i8) {
            char c8 = string2.charAt(i8);
            if (c8 > '\u001f') {
                if (c8 >= '') {
                    return true;
                }
                if (" #%/:?@[\\]".indexOf((int)c8) == -1) continue;
                return true;
            }
            return true;
        }
        return false;
    }

    public static int e(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - 48;
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 87;
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - 55;
        }
        return -1;
    }

    public static boolean f(String string2, int n8, int n9, byte[] arrby, int n10) {
        int n11 = n10;
        int n12 = n8;
        while (n12 < n9) {
            char c8;
            if (n11 == arrby.length) {
                return false;
            }
            n8 = n12;
            if (n11 != n10) {
                if (string2.charAt(n12) != '.') {
                    return false;
                }
                n8 = n12 + 1;
            }
            int n13 = 0;
            for (n12 = n8; n12 < n9 && (c8 = string2.charAt(n12)) >= '0' && c8 <= '9'; ++n12) {
                if (n13 == 0 && n8 != n12) {
                    return false;
                }
                if ((n13 = n13 * 10 + c8 - 48) <= 255) continue;
                return false;
            }
            if (n12 - n8 == 0) {
                return false;
            }
            arrby[n11] = (byte)(n13 ? 1 : 0);
            ++n11;
        }
        if (n11 != n10 + 4) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InetAddress g(String string2, int n8, int n9) {
        int n10;
        byte[] arrby = new byte[16];
        int n11 = 0;
        int n12 = n10 = -1;
        do {
            int n13;
            int n14;
            block16 : {
                block12 : {
                    block13 : {
                        block15 : {
                            block14 : {
                                block10 : {
                                    block11 : {
                                        n13 = n11;
                                        n14 = n10;
                                        if (n8 >= n9) return null;
                                        if (n11 == 16) {
                                            return null;
                                        }
                                        n14 = n8 + 2;
                                        if (n14 > n9 || !string2.regionMatches(n8, "::", 0, 2)) break block10;
                                        if (n10 != -1) {
                                            return null;
                                        }
                                        n8 = n13 = n11 + 2;
                                        if (n14 != n9) break block11;
                                        n14 = n8;
                                        break block12;
                                    }
                                    n12 = n14;
                                    n11 = n13;
                                    n10 = n8;
                                    n8 = n12;
                                    break block13;
                                }
                                n13 = n8;
                                if (n11 == 0) break block14;
                                if (!string2.regionMatches(n8, ":", 0, 1)) break block15;
                                n13 = n8 + 1;
                            }
                            n8 = n13;
                            break block13;
                        }
                        if (!string2.regionMatches(n8, ".", 0, 1)) return null;
                        if (!a.f(string2, n12, n9, arrby, n11 - 2)) {
                            return null;
                        }
                        n13 = n11 + 2;
                        n14 = n10;
                        break block12;
                    }
                    n12 = 0;
                    break block16;
                }
                if (n13 != 16) {
                    if (n14 == -1) {
                        return null;
                    }
                    n8 = n13 - n14;
                    System.arraycopy((Object)arrby, (int)n14, (Object)arrby, (int)(16 - n8), (int)n8);
                    Arrays.fill((byte[])arrby, (int)n14, (int)(16 - n13 + n14), (byte)0);
                }
                try {
                    return InetAddress.getByAddress((byte[])arrby);
                }
                catch (UnknownHostException unknownHostException) {
                    throw new AssertionError();
                }
            }
            for (n13 = n8; n13 < n9 && (n14 = a.e(string2.charAt(n13))) != -1; ++n13) {
                n12 = (n12 << 4) + n14;
            }
            n14 = n13 - n8;
            if (n14 == 0) return null;
            if (n14 > 4) {
                return null;
            }
            arrby[n11] = (byte)(n12 >>> 8 & 255);
            n14 = n11 + 2;
            arrby[n11 + 1] = (byte)(n12 & 255);
            n11 = n14;
            n12 = n8;
            n8 = n13;
        } while (true);
    }

    public static int h(String string2, int n8, int n9, char c8) {
        while (n8 < n9) {
            if (string2.charAt(n8) == c8) {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static int i(String string2, int n8, int n9, String string3) {
        while (n8 < n9) {
            if (string3.indexOf((int)string2.charAt(n8)) != -1) {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static String j(byte[] arrby) {
        int n8;
        int n9;
        int n10 = -1;
        int n11 = 0;
        int n12 = n8 = 0;
        while (n8 < arrby.length) {
            for (n9 = n8; n9 < 16 && arrby[n9] == 0 && arrby[n9 + 1] == 0; n9 += 2) {
            }
            int n13 = n9 - n8;
            int n14 = n10;
            int n15 = n12;
            if (n13 > n12) {
                n14 = n10;
                n15 = n12;
                if (n13 >= 4) {
                    n15 = n13;
                    n14 = n8;
                }
            }
            n8 = n9 + 2;
            n10 = n14;
            n12 = n15;
        }
        D6.a a8 = new D6.a();
        n8 = n11;
        while (n8 < arrby.length) {
            if (n8 == n10) {
                a8.D(58);
                n8 = n9 = n8 + n12;
                if (n9 != 16) continue;
                a8.D(58);
                n8 = n9;
                continue;
            }
            if (n8 > 0) {
                a8.D(58);
            }
            a8.E((arrby[n8] & 255) << 8 | arrby[n8 + 1] & 255);
            n8 += 2;
        }
        return a8.u();
    }

    public static int k(String string2, int n8, int n9) {
        while (n8 < n9) {
            char c8 = string2.charAt(n8);
            if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static int l(String string2, int n8, int n9) {
        --n9;
        while (n9 >= n8) {
            char c8 = string2.charAt(n9);
            if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                return n9 + 1;
            }
            --n9;
        }
        return n8;
    }

}

