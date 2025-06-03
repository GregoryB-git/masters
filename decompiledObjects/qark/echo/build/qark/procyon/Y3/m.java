// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import Q3.c;
import Q3.e;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import V3.k;
import V3.p;
import java.util.Locale;
import android.net.Uri;
import android.util.Log;
import Q3.d;

public abstract class m
{
    public static final char[] a;
    
    static {
        a = "0123456789abcdef".toCharArray();
    }
    
    public static int a(final int n, final int n2) {
        if (n < n2) {
            return -1;
        }
        if (n == n2) {
            return 0;
        }
        return 1;
    }
    
    public static int b(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        if (n3 < 0) {
            return -1;
        }
        if (n3 == 0) {
            return 0;
        }
        return 1;
    }
    
    public static String c(final double value) {
        final StringBuilder sb = new StringBuilder(16);
        final long doubleToLongBits = Double.doubleToLongBits(value);
        for (int i = 7; i >= 0; --i) {
            final int n = (int)(doubleToLongBits >>> i * 8 & 0xFFL);
            final char[] a = m.a;
            sb.append(a[n >> 4 & 0xF]);
            sb.append(a[n & 0xF]);
        }
        return sb.toString();
    }
    
    public static boolean d(final Object o, final Object obj) {
        return o == obj || (o != null && obj != null && o.equals(obj));
    }
    
    public static String e(String substring) {
        final int index = substring.indexOf("//");
        if (index == -1) {
            throw new d("Firebase Database URL is missing URL scheme");
        }
        substring = substring.substring(index + 2);
        final int index2 = substring.indexOf("/");
        if (index2 == -1) {
            return "";
        }
        final int index3 = substring.indexOf("?");
        final int n = index2 + 1;
        if (index3 != -1) {
            return substring.substring(n, index3);
        }
        return substring.substring(n);
    }
    
    public static void f(final boolean b) {
        g(b, "");
    }
    
    public static void g(final boolean b, final String str) {
        if (!b) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Assertion failed: ");
            sb.append(str);
            Log.w("FirebaseDatabase", sb.toString());
        }
    }
    
    public static h h(final String str) {
        while (true) {
            while (true) {
                Label_0309: {
                    while (true) {
                        try {
                            final Uri parse = Uri.parse(str);
                            final String scheme = parse.getScheme();
                            if (scheme == null) {
                                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
                            }
                            final String host = parse.getHost();
                            if (host != null) {
                                final String queryParameter = parse.getQueryParameter("ns");
                                final boolean b = false;
                                String lowerCase;
                                if ((lowerCase = queryParameter) == null) {
                                    lowerCase = host.split("\\.", -1)[0].toLowerCase(Locale.US);
                                }
                                final p a = new p();
                                a.a = host.toLowerCase(Locale.US);
                                final int port = parse.getPort();
                                if (port != -1) {
                                    if (scheme.equals("https")) {
                                        break Label_0309;
                                    }
                                    if (scheme.equals("wss")) {
                                        break Label_0309;
                                    }
                                    a.b = b;
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(a.a);
                                    sb.append(":");
                                    sb.append(port);
                                    a.a = sb.toString();
                                }
                                else {
                                    a.b = true;
                                }
                                a.d = a.a;
                                a.c = lowerCase;
                                final String replace = e(str).replace("+", " ");
                                n.i(replace);
                                final h h = new h();
                                h.b = new k(replace);
                                h.a = a;
                                return h;
                            }
                            throw new IllegalArgumentException("Database URL does not specify a valid host");
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid Firebase Database url specified: ");
                            sb2.append(str);
                            final Exception ex;
                            throw new d(sb2.toString(), ex);
                        }
                        catch (Exception ex) {
                            continue;
                        }
                        break;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
    }
    
    public static String i(String encodeToString) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(encodeToString.getBytes("UTF-8"));
            encodeToString = Base64.encodeToString(instance.digest(), 2);
            return encodeToString;
        }
        catch (NoSuchAlgorithmException ex) {
            goto Label_0041;
        }
        catch (UnsupportedEncodingException ex2) {}
        goto Label_0031;
    }
    
    public static String j(final String s) {
        String replace;
        if (s.indexOf(92) != -1) {
            replace = s.replace("\\", "\\\\");
        }
        else {
            replace = s;
        }
        String replace2 = replace;
        if (s.indexOf(34) != -1) {
            replace2 = replace.replace("\"", "\\\"");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(replace2);
        sb.append('\"');
        return sb.toString();
    }
    
    public static Integer k(final String s) {
        if (s.length() > 11) {
            return null;
        }
        if (s.length() == 0) {
            return null;
        }
        int i = 0;
        boolean b;
        if (s.charAt(0) == '-') {
            final int length = s.length();
            b = true;
            if (length == 1) {
                return null;
            }
            i = 1;
        }
        else {
            b = false;
        }
        long n = 0L;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 < '0') {
                return null;
            }
            if (char1 > '9') {
                return null;
            }
            n = n * 10L + (char1 - '0');
            ++i;
        }
        int j;
        if (b) {
            final long n2 = -n;
            if (n2 < -2147483648L) {
                return null;
            }
            j = (int)n2;
        }
        else {
            if (n > 2147483647L) {
                return null;
            }
            j = (int)n;
        }
        return j;
    }
    
    public static g l(final e.e e) {
        if (e == null) {
            final V2.k k = new V2.k();
            return new g(k.a(), new e.e() {
                @Override
                public void a(final c c, final Q3.e e) {
                    if (c != null) {
                        k.b(c.i());
                        return;
                    }
                    k.c(null);
                }
            });
        }
        return new g(null, e);
    }
}
