package B6;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f842j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f844b;

    /* renamed from: c, reason: collision with root package name */
    public final String f845c;

    /* renamed from: d, reason: collision with root package name */
    public final String f846d;

    /* renamed from: e, reason: collision with root package name */
    public final int f847e;

    /* renamed from: f, reason: collision with root package name */
    public final List f848f;

    /* renamed from: g, reason: collision with root package name */
    public final List f849g;

    /* renamed from: h, reason: collision with root package name */
    public final String f850h;

    /* renamed from: i, reason: collision with root package name */
    public final String f851i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f852a;

        /* renamed from: d, reason: collision with root package name */
        public String f855d;

        /* renamed from: f, reason: collision with root package name */
        public final List f857f;

        /* renamed from: g, reason: collision with root package name */
        public List f858g;

        /* renamed from: h, reason: collision with root package name */
        public String f859h;

        /* renamed from: b, reason: collision with root package name */
        public String f853b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f854c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f856e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f857f = arrayList;
            arrayList.add("");
        }

        public static String b(String str, int i7, int i8) {
            return C6.a.a(c.p(str, i7, i8, false));
        }

        public static int i(String str, int i7, int i8) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(c.a(str, i7, i8, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public static int l(String str, int i7, int i8) {
            while (i7 < i8) {
                char charAt = str.charAt(i7);
                if (charAt == ':') {
                    return i7;
                }
                if (charAt == '[') {
                    do {
                        i7++;
                        if (i7 < i8) {
                        }
                    } while (str.charAt(i7) != ']');
                }
                i7++;
            }
            return i8;
        }

        public static int p(String str, int i7, int i8) {
            if (i8 - i7 < 2) {
                return -1;
            }
            char charAt = str.charAt(i7);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i7++;
                    if (i7 >= i8) {
                        break;
                    }
                    char charAt2 = str.charAt(i7);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public static int q(String str, int i7, int i8) {
            int i9 = 0;
            while (i7 < i8) {
                char charAt = str.charAt(i7);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i9++;
                i7++;
            }
            return i9;
        }

        public c a() {
            if (this.f852a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f855d != null) {
                return new c(this);
            }
            throw new IllegalStateException("host == null");
        }

        public int c() {
            int i7 = this.f856e;
            return i7 != -1 ? i7 : c.d(this.f852a);
        }

        public a d(String str) {
            this.f858g = str != null ? c.u(c.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a e(String str) {
            this.f859h = str != null ? c.b(str, "", false, false, false, false) : null;
            return this;
        }

        public final boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public final boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public a h(c cVar, String str) {
            int i7;
            int i8;
            int k7 = C6.a.k(str, 0, str.length());
            int l7 = C6.a.l(str, k7, str.length());
            int p7 = p(str, k7, l7);
            if (p7 != -1) {
                if (str.regionMatches(true, k7, "https:", 0, 6)) {
                    this.f852a = "https";
                    k7 += 6;
                } else {
                    if (!str.regionMatches(true, k7, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, p7) + "'");
                    }
                    this.f852a = "http";
                    k7 += 5;
                }
            } else {
                if (cVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f852a = cVar.f843a;
            }
            int q7 = q(str, k7, l7);
            char c7 = '?';
            char c8 = '#';
            if (q7 >= 2 || cVar == null || !cVar.f843a.equals(this.f852a)) {
                boolean z7 = false;
                boolean z8 = false;
                int i9 = k7 + q7;
                while (true) {
                    i7 = C6.a.i(str, i9, l7, "@/\\?#");
                    char charAt = i7 != l7 ? str.charAt(i7) : (char) 65535;
                    if (charAt == 65535 || charAt == c8 || charAt == '/' || charAt == '\\' || charAt == c7) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z7) {
                            i8 = i7;
                            this.f854c += "%40" + c.a(str, i9, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int h7 = C6.a.h(str, i9, i7, ':');
                            i8 = i7;
                            String a7 = c.a(str, i9, h7, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z8) {
                                a7 = this.f853b + "%40" + a7;
                            }
                            this.f853b = a7;
                            if (h7 != i8) {
                                this.f854c = c.a(str, h7 + 1, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z7 = true;
                            }
                            z8 = true;
                        }
                        i9 = i8 + 1;
                    }
                    c7 = '?';
                    c8 = '#';
                }
                int l8 = l(str, i9, i7);
                int i10 = l8 + 1;
                if (i10 < i7) {
                    this.f855d = b(str, i9, l8);
                    int i11 = i(str, i10, i7);
                    this.f856e = i11;
                    if (i11 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i10, i7) + '\"');
                    }
                } else {
                    this.f855d = b(str, i9, l8);
                    this.f856e = c.d(this.f852a);
                }
                if (this.f855d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i9, l8) + '\"');
                }
                k7 = i7;
            } else {
                this.f853b = cVar.j();
                this.f854c = cVar.f();
                this.f855d = cVar.f846d;
                this.f856e = cVar.f847e;
                this.f857f.clear();
                this.f857f.addAll(cVar.h());
                if (k7 == l7 || str.charAt(k7) == '#') {
                    d(cVar.i());
                }
            }
            int i12 = C6.a.i(str, k7, l7, "?#");
            o(str, k7, i12);
            if (i12 < l7 && str.charAt(i12) == '?') {
                int h8 = C6.a.h(str, i12, l7, '#');
                this.f858g = c.u(c.a(str, i12 + 1, h8, " \"'<>#", true, false, true, true, null));
                i12 = h8;
            }
            if (i12 < l7 && str.charAt(i12) == '#') {
                this.f859h = c.a(str, 1 + i12, l7, "", true, false, false, false, null);
            }
            return this;
        }

        public a j(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f854c = c.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public final void k() {
            if (!((String) this.f857f.remove(r0.size() - 1)).isEmpty() || this.f857f.isEmpty()) {
                this.f857f.add("");
            } else {
                this.f857f.set(r0.size() - 1, "");
            }
        }

        public final void m(String str, int i7, int i8, boolean z7, boolean z8) {
            String a7 = c.a(str, i7, i8, " \"<>^`{}|/\\?#", z8, false, false, true, null);
            if (f(a7)) {
                return;
            }
            if (g(a7)) {
                k();
                return;
            }
            if (((String) this.f857f.get(r11.size() - 1)).isEmpty()) {
                this.f857f.set(r11.size() - 1, a7);
            } else {
                this.f857f.add(a7);
            }
            if (z7) {
                this.f857f.add("");
            }
        }

        public a n(String str) {
            this.f858g = str != null ? c.u(c.b(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public final void o(String str, int i7, int i8) {
            if (i7 == i8) {
                return;
            }
            char charAt = str.charAt(i7);
            if (charAt == '/' || charAt == '\\') {
                this.f857f.clear();
                this.f857f.add("");
                i7++;
            } else {
                List list = this.f857f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i9 = i7;
                if (i9 >= i8) {
                    return;
                }
                i7 = C6.a.i(str, i9, i8, "/\\");
                boolean z7 = i7 < i8;
                m(str, i9, i7, z7, true);
                if (z7) {
                    i7++;
                }
            }
        }

        public a r(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f853b = c.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f852a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f853b.isEmpty() || !this.f854c.isEmpty()) {
                sb.append(this.f853b);
                if (!this.f854c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f854c);
                }
                sb.append('@');
            }
            String str3 = this.f855d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f855d);
                    sb.append(']');
                } else {
                    sb.append(this.f855d);
                }
            }
            if (this.f856e != -1 || this.f852a != null) {
                int c7 = c();
                String str4 = this.f852a;
                if (str4 == null || c7 != c.d(str4)) {
                    sb.append(':');
                    sb.append(c7);
                }
            }
            c.o(sb, this.f857f);
            if (this.f858g != null) {
                sb.append('?');
                c.l(sb, this.f858g);
            }
            if (this.f859h != null) {
                sb.append('#');
                sb.append(this.f859h);
            }
            return sb.toString();
        }
    }

    public c(a aVar) {
        this.f843a = aVar.f852a;
        this.f844b = q(aVar.f853b, false);
        this.f845c = q(aVar.f854c, false);
        this.f846d = aVar.f855d;
        this.f847e = aVar.c();
        this.f848f = r(aVar.f857f, false);
        List list = aVar.f858g;
        this.f849g = list != null ? r(list, true) : null;
        String str = aVar.f859h;
        this.f850h = str != null ? q(str, false) : null;
        this.f851i = aVar.toString();
    }

    public static String a(String str, int i7, int i8, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset) {
        int i9 = i7;
        while (i9 < i8) {
            int codePointAt = str.codePointAt(i9);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z10)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z7 && (!z8 || t(str, i9, i8)))) && (codePointAt != 43 || !z9))) {
                    i9 += Character.charCount(codePointAt);
                }
            }
            D6.a aVar = new D6.a();
            aVar.H(str, i7, i9);
            c(aVar, str, i9, i8, str2, z7, z8, z9, z10, charset);
            return aVar.u();
        }
        return str.substring(i7, i8);
    }

    public static String b(String str, String str2, boolean z7, boolean z8, boolean z9, boolean z10) {
        return a(str, 0, str.length(), str2, z7, z8, z9, z10, null);
    }

    public static void c(D6.a aVar, String str, int i7, int i8, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset) {
        D6.a aVar2 = null;
        while (i7 < i8) {
            int codePointAt = str.codePointAt(i7);
            if (!z7 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z9) {
                    aVar.G(z7 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z10) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z7 || (z8 && !t(str, i7, i8)))))) {
                    if (aVar2 == null) {
                        aVar2 = new D6.a();
                    }
                    if (charset == null || charset.equals(C6.a.f1034j)) {
                        aVar2.I(codePointAt);
                    } else {
                        aVar2.F(str, i7, Character.charCount(codePointAt) + i7, charset);
                    }
                    while (!aVar2.b()) {
                        byte l7 = aVar2.l();
                        aVar.D(37);
                        char[] cArr = f842j;
                        aVar.D(cArr[((l7 & 255) >> 4) & 15]);
                        aVar.D(cArr[l7 & 15]);
                    }
                } else {
                    aVar.I(codePointAt);
                }
            }
            i7 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static c k(String str) {
        return new a().h(null, str).a();
    }

    public static void l(StringBuilder sb, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7 += 2) {
            String str = (String) list.get(i7);
            String str2 = (String) list.get(i7 + 1);
            if (i7 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static c n(String str) {
        try {
            return k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void o(StringBuilder sb, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            sb.append('/');
            sb.append((String) list.get(i7));
        }
    }

    public static String p(String str, int i7, int i8, boolean z7) {
        for (int i9 = i7; i9 < i8; i9++) {
            char charAt = str.charAt(i9);
            if (charAt == '%' || (charAt == '+' && z7)) {
                D6.a aVar = new D6.a();
                aVar.H(str, i7, i9);
                s(aVar, str, i9, i8, z7);
                return aVar.u();
            }
        }
        return str.substring(i7, i8);
    }

    public static String q(String str, boolean z7) {
        return p(str, 0, str.length(), z7);
    }

    public static void s(D6.a aVar, String str, int i7, int i8, boolean z7) {
        int i9;
        while (i7 < i8) {
            int codePointAt = str.codePointAt(i7);
            if (codePointAt != 37 || (i9 = i7 + 2) >= i8) {
                if (codePointAt == 43 && z7) {
                    aVar.D(32);
                }
                aVar.I(codePointAt);
            } else {
                int e7 = C6.a.e(str.charAt(i7 + 1));
                int e8 = C6.a.e(str.charAt(i9));
                if (e7 != -1 && e8 != -1) {
                    aVar.D((e7 << 4) + e8);
                    i7 = i9;
                }
                aVar.I(codePointAt);
            }
            i7 += Character.charCount(codePointAt);
        }
    }

    public static boolean t(String str, int i7, int i8) {
        int i9 = i7 + 2;
        return i9 < i8 && str.charAt(i7) == '%' && C6.a.e(str.charAt(i7 + 1)) != -1 && C6.a.e(str.charAt(i9)) != -1;
    }

    public static List u(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int indexOf = str.indexOf(38, i7);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i7);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i7, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i7, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i7 = indexOf + 1;
        }
        return arrayList;
    }

    public String e() {
        if (this.f850h == null) {
            return null;
        }
        return this.f851i.substring(this.f851i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f851i.equals(this.f851i);
    }

    public String f() {
        if (this.f845c.isEmpty()) {
            return "";
        }
        return this.f851i.substring(this.f851i.indexOf(58, this.f843a.length() + 3) + 1, this.f851i.indexOf(64));
    }

    public String g() {
        int indexOf = this.f851i.indexOf(47, this.f843a.length() + 3);
        String str = this.f851i;
        return this.f851i.substring(indexOf, C6.a.i(str, indexOf, str.length(), "?#"));
    }

    public List h() {
        int indexOf = this.f851i.indexOf(47, this.f843a.length() + 3);
        String str = this.f851i;
        int i7 = C6.a.i(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < i7) {
            int i8 = indexOf + 1;
            int h7 = C6.a.h(this.f851i, i8, i7, '/');
            arrayList.add(this.f851i.substring(i8, h7));
            indexOf = h7;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f851i.hashCode();
    }

    public String i() {
        if (this.f849g == null) {
            return null;
        }
        int indexOf = this.f851i.indexOf(63) + 1;
        String str = this.f851i;
        return this.f851i.substring(indexOf, C6.a.h(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f844b.isEmpty()) {
            return "";
        }
        int length = this.f843a.length() + 3;
        String str = this.f851i;
        return this.f851i.substring(length, C6.a.i(str, length, str.length(), ":@"));
    }

    public a m() {
        a aVar = new a();
        aVar.f852a = this.f843a;
        aVar.f853b = j();
        aVar.f854c = f();
        aVar.f855d = this.f846d;
        aVar.f856e = this.f847e != d(this.f843a) ? this.f847e : -1;
        aVar.f857f.clear();
        aVar.f857f.addAll(h());
        aVar.d(i());
        aVar.f859h = e();
        return aVar;
    }

    public final List r(List list, boolean z7) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            String str = (String) list.get(i7);
            arrayList.add(str != null ? q(str, z7) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        return this.f851i;
    }
}
