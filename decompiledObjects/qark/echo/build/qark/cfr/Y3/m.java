/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 *  android.util.Log
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Locale
 */
package Y3;

import Q3.c;
import Q3.d;
import Q3.e;
import V2.j;
import V3.k;
import V3.p;
import Y3.g;
import Y3.h;
import Y3.n;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public abstract class m {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public static int a(int n8, int n9) {
        if (n8 < n9) {
            return -1;
        }
        if (n8 == n9) {
            return 0;
        }
        return 1;
    }

    public static int b(long l8, long l9) {
        long l10 = l8 LCMP l9;
        if (l10 < 0) {
            return -1;
        }
        if (l10 == false) {
            return 0;
        }
        return 1;
    }

    public static String c(double d8) {
        StringBuilder stringBuilder = new StringBuilder(16);
        long l8 = Double.doubleToLongBits((double)d8);
        for (int i8 = 7; i8 >= 0; --i8) {
            int n8 = (int)(l8 >>> i8 * 8 & 255L);
            char[] arrc = a;
            stringBuilder.append(arrc[n8 >> 4 & 15]);
            stringBuilder.append(arrc[n8 & 15]);
        }
        return stringBuilder.toString();
    }

    public static boolean d(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object != null && object2 != null) {
            return object.equals(object2);
        }
        return false;
    }

    public static String e(String string2) {
        int n8 = string2.indexOf("//");
        if (n8 != -1) {
            int n9 = (string2 = string2.substring(n8 + 2)).indexOf("/");
            if (n9 != -1) {
                n8 = string2.indexOf("?");
                ++n9;
                if (n8 != -1) {
                    return string2.substring(n9, n8);
                }
                return string2.substring(n9);
            }
            return "";
        }
        throw new d("Firebase Database URL is missing URL scheme");
    }

    public static void f(boolean bl) {
        m.g(bl, "");
    }

    public static void g(boolean bl, String string2) {
        if (!bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Assertion failed: ");
            stringBuilder.append(string2);
            Log.w((String)"FirebaseDatabase", (String)stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h h(String string2) {
        Object object;
        Object object2;
        String string3;
        block8 : {
            boolean bl;
            int n8;
            block6 : {
                block7 : {
                    try {
                        object2 = Uri.parse((String)string2);
                        String string4 = object2.getScheme();
                        if (string4 == null) {
                            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
                        }
                        String string5 = object2.getHost();
                        if (string5 == null) {
                            throw new IllegalArgumentException("Database URL does not specify a valid host");
                        }
                        object = object2.getQueryParameter("ns");
                        bl = false;
                        string3 = object;
                        if (object == null) {
                            string3 = string5.split("\\.", -1)[0].toLowerCase(Locale.US);
                        }
                        object = new p();
                        object.a = string5.toLowerCase(Locale.US);
                        n8 = object2.getPort();
                        if (n8 != -1) {
                            if (!string4.equals((Object)"https") && !string4.equals((Object)"wss")) break block6;
                            break block7;
                        }
                        object.b = true;
                        break block8;
                    }
                    catch (Exception exception) {}
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid Firebase Database url specified: ");
                    stringBuilder.append(string2);
                    throw new d(stringBuilder.toString(), (Throwable)exception);
                }
                bl = true;
            }
            object.b = bl;
            object2 = new StringBuilder();
            object2.append(object.a);
            object2.append(":");
            object2.append(n8);
            object.a = object2.toString();
        }
        object.d = object.a;
        object.c = string3;
        string3 = m.e(string2).replace((CharSequence)"+", (CharSequence)" ");
        n.i(string3);
        object2 = new h();
        object2.b = new k(string3);
        object2.a = object;
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String i(String string2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA-1");
            messageDigest.update(string2.getBytes("UTF-8"));
            return Base64.encodeToString((byte[])messageDigest.digest(), (int)2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", (Throwable)noSuchAlgorithmException);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        }
    }

    public static String j(String string2) {
        String string3 = string2.indexOf(92) != -1 ? string2.replace((CharSequence)"\\", (CharSequence)"\\\\") : string2;
        String string4 = string3;
        if (string2.indexOf(34) != -1) {
            string4 = string3.replace((CharSequence)"\"", (CharSequence)"\\\"");
        }
        string2 = new StringBuilder();
        string2.append('\"');
        string2.append(string4);
        string2.append('\"');
        return string2.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer k(String string2) {
        boolean bl;
        if (string2.length() > 11) return null;
        if (string2.length() == 0) {
            return null;
        }
        int n8 = 0;
        if (string2.charAt(0) == '-') {
            n8 = string2.length();
            bl = true;
            if (n8 == 1) {
                return null;
            }
            n8 = 1;
        } else {
            bl = false;
        }
        long l8 = 0L;
        while (n8 < string2.length()) {
            char c8 = string2.charAt(n8);
            if (c8 < '0') return null;
            if (c8 > '9') {
                return null;
            }
            l8 = l8 * 10L + (long)(c8 - 48);
            ++n8;
        }
        if (l8 > Integer.MAX_VALUE) {
            return null;
        }
        n8 = (int)l8;
        return n8;
    }

    public static g l(e.e object) {
        if (object == null) {
            object = new V2.k();
            e.e e8 = new e.e(){

                @Override
                public void a(c c8, e e8) {
                    if (c8 != null) {
                        k.this.b((Exception)c8.i());
                        return;
                    }
                    k.this.c(null);
                }
            };
            return new g(object.a(), e8);
        }
        return new g(null, object);
    }

}

