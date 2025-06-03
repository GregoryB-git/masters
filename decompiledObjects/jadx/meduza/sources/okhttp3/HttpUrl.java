package okhttp3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.Util;
import xc.f;

/* loaded from: classes.dex */
public final class HttpUrl {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f12244j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f12245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12248d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12249e;
    public final List<String> f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f12250g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12251h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12252i;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12253a;

        /* renamed from: d, reason: collision with root package name */
        public String f12256d;
        public final ArrayList f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f12258g;

        /* renamed from: h, reason: collision with root package name */
        public String f12259h;

        /* renamed from: b, reason: collision with root package name */
        public String f12254b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f12255c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f12257e = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final HttpUrl a() {
            if (this.f12253a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f12256d != null) {
                return new HttpUrl(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX WARN: Code restructure failed: missing block: B:175:0x0216, code lost:
        
            if (r1 <= 65535) goto L116;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(okhttp3.HttpUrl r24, java.lang.String r25) {
            /*
                Method dump skipped, instructions count: 1000
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.b(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.f12253a;
            if (str2 != null) {
                sb2.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb2.append(str);
            if (!this.f12254b.isEmpty() || !this.f12255c.isEmpty()) {
                sb2.append(this.f12254b);
                if (!this.f12255c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f12255c);
                }
                sb2.append('@');
            }
            String str3 = this.f12256d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f12256d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f12256d);
                }
            }
            int i10 = this.f12257e;
            if (i10 != -1 || this.f12253a != null) {
                if (i10 == -1) {
                    i10 = HttpUrl.c(this.f12253a);
                }
                String str4 = this.f12253a;
                if (str4 == null || i10 != HttpUrl.c(str4)) {
                    sb2.append(':');
                    sb2.append(i10);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i11));
            }
            if (this.f12258g != null) {
                sb2.append('?');
                HttpUrl.i(sb2, this.f12258g);
            }
            if (this.f12259h != null) {
                sb2.append('#');
                sb2.append(this.f12259h);
            }
            return sb2.toString();
        }
    }

    public HttpUrl(Builder builder) {
        this.f12245a = builder.f12253a;
        String str = builder.f12254b;
        this.f12246b = j(0, str.length(), str, false);
        String str2 = builder.f12255c;
        this.f12247c = j(0, str2.length(), str2, false);
        this.f12248d = builder.f12256d;
        int i10 = builder.f12257e;
        this.f12249e = i10 == -1 ? c(builder.f12253a) : i10;
        this.f = k(builder.f, false);
        ArrayList arrayList = builder.f12258g;
        this.f12250g = arrayList != null ? k(arrayList, true) : null;
        String str3 = builder.f12259h;
        this.f12251h = str3 != null ? j(0, str3.length(), str3, false) : null;
        this.f12252i = builder.toString();
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z10 || (z11 && !l(i12, i11, str)))) || (codePointAt == 43 && z12)))) {
                f fVar = new f();
                fVar.G0(i10, i12, str);
                f fVar2 = null;
                while (i12 < i11) {
                    int codePointAt2 = str.codePointAt(i12);
                    if (!z10 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z12) {
                            fVar.H0(z10 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z13) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z10 || (z11 && !l(i12, i11, str)))))) {
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.I0(codePointAt2);
                            while (!fVar2.v()) {
                                int readByte = fVar2.readByte() & 255;
                                fVar.B0(37);
                                char[] cArr = f12244j;
                                fVar.B0(cArr[(readByte >> 4) & 15]);
                                fVar.B0(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.I0(codePointAt2);
                        }
                    }
                    i12 += Character.charCount(codePointAt2);
                }
                return fVar.k0();
            }
            i12 += Character.charCount(codePointAt);
        }
        return str.substring(i10, i11);
    }

    public static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13);
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void i(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static String j(int i10, int i11, String str, boolean z10) {
        int i12;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z10)) {
                f fVar = new f();
                fVar.G0(i10, i13, str);
                while (i13 < i11) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt != 37 || (i12 = i13 + 2) >= i11) {
                        if (codePointAt == 43 && z10) {
                            fVar.B0(32);
                        }
                        fVar.I0(codePointAt);
                    } else {
                        int g10 = Util.g(str.charAt(i13 + 1));
                        int g11 = Util.g(str.charAt(i12));
                        if (g10 != -1 && g11 != -1) {
                            fVar.B0((g10 << 4) + g11);
                            i13 = i12;
                        }
                        fVar.I0(codePointAt);
                    }
                    i13 += Character.charCount(codePointAt);
                }
                return fVar.k0();
            }
            i13++;
        }
        return str.substring(i10, i11);
    }

    public static List k(List list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) list.get(i10);
            arrayList.add(str != null ? j(0, str.length(), str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean l(int i10, int i11, String str) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && Util.g(str.charAt(i10 + 1)) != -1 && Util.g(str.charAt(i12)) != -1;
    }

    public static ArrayList m(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f12247c.isEmpty()) {
            return "";
        }
        return this.f12252i.substring(this.f12252i.indexOf(58, this.f12245a.length() + 3) + 1, this.f12252i.indexOf(64));
    }

    public final String e() {
        int indexOf = this.f12252i.indexOf(47, this.f12245a.length() + 3);
        String str = this.f12252i;
        return this.f12252i.substring(indexOf, Util.j(str, indexOf, str.length(), "?#"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).f12252i.equals(this.f12252i);
    }

    public final ArrayList f() {
        int indexOf = this.f12252i.indexOf(47, this.f12245a.length() + 3);
        String str = this.f12252i;
        int j10 = Util.j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j10) {
            int i10 = indexOf + 1;
            int i11 = Util.i(this.f12252i, i10, j10, '/');
            arrayList.add(this.f12252i.substring(i10, i11));
            indexOf = i11;
        }
        return arrayList;
    }

    public final String g() {
        if (this.f12250g == null) {
            return null;
        }
        int indexOf = this.f12252i.indexOf(63) + 1;
        String str = this.f12252i;
        return this.f12252i.substring(indexOf, Util.i(str, indexOf, str.length(), '#'));
    }

    public final String h() {
        if (this.f12246b.isEmpty()) {
            return "";
        }
        int length = this.f12245a.length() + 3;
        String str = this.f12252i;
        return this.f12252i.substring(length, Util.j(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.f12252i.hashCode();
    }

    public final URI n() {
        Builder builder = new Builder();
        builder.f12253a = this.f12245a;
        builder.f12254b = h();
        builder.f12255c = d();
        builder.f12256d = this.f12248d;
        builder.f12257e = this.f12249e != c(this.f12245a) ? this.f12249e : -1;
        builder.f.clear();
        builder.f.addAll(f());
        String g10 = g();
        builder.f12258g = g10 != null ? m(b(g10, " \"'<>#", true, false, true, true)) : null;
        builder.f12259h = this.f12251h != null ? this.f12252i.substring(this.f12252i.indexOf(35) + 1) : null;
        int size = builder.f.size();
        for (int i10 = 0; i10 < size; i10++) {
            builder.f.set(i10, b((String) builder.f.get(i10), "[]", true, true, false, true));
        }
        ArrayList arrayList = builder.f12258g;
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str = (String) builder.f12258g.get(i11);
                if (str != null) {
                    builder.f12258g.set(i11, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = builder.f12259h;
        if (str2 != null) {
            builder.f12259h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String builder2 = builder.toString();
        try {
            return new URI(builder2);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(builder2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f12252i;
    }
}
