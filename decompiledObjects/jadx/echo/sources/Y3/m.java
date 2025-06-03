package Y3;

import Q3.e;
import V2.C0660k;
import V3.p;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7566a = "0123456789abcdef".toCharArray();

    public class a implements e.InterfaceC0084e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0660k f7567a;

        public a(C0660k c0660k) {
            this.f7567a = c0660k;
        }

        @Override // Q3.e.InterfaceC0084e
        public void a(Q3.c cVar, Q3.e eVar) {
            if (cVar != null) {
                this.f7567a.b(cVar.i());
            } else {
                this.f7567a.c(null);
            }
        }
    }

    public static int a(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    public static int b(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    public static String c(double d7) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d7);
        for (int i7 = 7; i7 >= 0; i7--) {
            int i8 = (int) ((doubleToLongBits >>> (i7 * 8)) & 255);
            char[] cArr = f7566a;
            sb.append(cArr[(i8 >> 4) & 15]);
            sb.append(cArr[i8 & 15]);
        }
        return sb.toString();
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static String e(String str) {
        int indexOf = str.indexOf("//");
        if (indexOf == -1) {
            throw new Q3.d("Firebase Database URL is missing URL scheme");
        }
        String substring = str.substring(indexOf + 2);
        int indexOf2 = substring.indexOf("/");
        if (indexOf2 == -1) {
            return "";
        }
        int indexOf3 = substring.indexOf("?");
        int i7 = indexOf2 + 1;
        return indexOf3 != -1 ? substring.substring(i7, indexOf3) : substring.substring(i7);
    }

    public static void f(boolean z7) {
        g(z7, "");
    }

    public static void g(boolean z7, String str) {
        if (z7) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    public static h h(String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = parse.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = parse.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            p pVar = new p();
            pVar.f6661a = host.toLowerCase(Locale.US);
            int port = parse.getPort();
            if (port != -1) {
                pVar.f6662b = scheme.equals("https") || scheme.equals("wss");
                pVar.f6661a += ":" + port;
            } else {
                pVar.f6662b = true;
            }
            pVar.f6664d = pVar.f6661a;
            pVar.f6663c = queryParameter;
            String replace = e(str).replace("+", " ");
            n.i(replace);
            h hVar = new h();
            hVar.f7553b = new V3.k(replace);
            hVar.f7552a = pVar;
            return hVar;
        } catch (Exception e7) {
            throw new Q3.d("Invalid Firebase Database url specified: " + str, e7);
        }
    }

    public static String i(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e7);
        }
    }

    public static String j(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return '\"' + replace + '\"';
    }

    public static Integer k(String str) {
        boolean z7;
        int i7;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i8 = 0;
        if (str.charAt(0) == '-') {
            z7 = true;
            if (str.length() == 1) {
                return null;
            }
            i8 = 1;
        } else {
            z7 = false;
        }
        long j7 = 0;
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j7 = (j7 * 10) + (charAt - '0');
            i8++;
        }
        if (z7) {
            long j8 = -j7;
            if (j8 < -2147483648L) {
                return null;
            }
            i7 = (int) j8;
        } else {
            if (j7 > 2147483647L) {
                return null;
            }
            i7 = (int) j7;
        }
        return Integer.valueOf(i7);
    }

    public static g l(e.InterfaceC0084e interfaceC0084e) {
        if (interfaceC0084e != null) {
            return new g(null, interfaceC0084e);
        }
        C0660k c0660k = new C0660k();
        return new g(c0660k.a(), new a(c0660k));
    }
}
