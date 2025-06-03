// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B6;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import D6.a;
import java.nio.charset.Charset;
import java.util.List;

public final class c
{
    public static final char[] j;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    
    static {
        j = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public c(final a a) {
        this.a = a.a;
        this.b = q(a.b, false);
        this.c = q(a.c, false);
        this.d = a.d;
        this.e = a.c();
        this.f = this.r(a.f, false);
        final List g = a.g;
        final String s = null;
        List r;
        if (g != null) {
            r = this.r(g, true);
        }
        else {
            r = null;
        }
        this.g = r;
        final String h = a.h;
        String q = s;
        if (h != null) {
            q = q(h, false);
        }
        this.h = q;
        this.i = a.toString();
    }
    
    public static String a(final String s, final int beginIndex, final int endIndex, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final Charset charset) {
        int i = beginIndex;
        while (i < endIndex) {
            final int codePoint = s.codePointAt(i);
            if (codePoint >= 32 && codePoint != 127 && (codePoint < 128 || !b4)) {
                if (s2.indexOf(codePoint) == -1 && (codePoint != 37 || (b && (!b2 || t(s, i, endIndex))))) {
                    if (codePoint != 43 || !b3) {
                        i += Character.charCount(codePoint);
                        continue;
                    }
                }
            }
            final D6.a a = new D6.a();
            a.H(s, beginIndex, i);
            c(a, s, i, endIndex, s2, b, b2, b3, b4, charset);
            return a.u();
        }
        return s.substring(beginIndex, endIndex);
    }
    
    public static String b(final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return a(s, 0, s.length(), s2, b, b2, b3, b4, null);
    }
    
    public static void c(final D6.a a, final String s, int i, final int n, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final Charset charset) {
        D6.a a2 = null;
        while (i < n) {
            final int codePoint = s.codePointAt(i);
            D6.a a3 = null;
            Label_0321: {
                if (b) {
                    a3 = a2;
                    if (codePoint == 9) {
                        break Label_0321;
                    }
                    a3 = a2;
                    if (codePoint == 10) {
                        break Label_0321;
                    }
                    a3 = a2;
                    if (codePoint == 12) {
                        break Label_0321;
                    }
                    if (codePoint == 13) {
                        a3 = a2;
                        break Label_0321;
                    }
                }
                if (codePoint == 43 && b3) {
                    String s3;
                    if (b) {
                        s3 = "+";
                    }
                    else {
                        s3 = "%2B";
                    }
                    a.G(s3);
                    a3 = a2;
                }
                else {
                    Label_0190: {
                        if (codePoint >= 32 && codePoint != 127 && (codePoint < 128 || !b4) && s2.indexOf(codePoint) == -1) {
                            if (codePoint == 37) {
                                if (!b) {
                                    break Label_0190;
                                }
                                if (b2 && !t(s, i, n)) {
                                    break Label_0190;
                                }
                            }
                            a.I(codePoint);
                            a3 = a2;
                            break Label_0321;
                        }
                    }
                    D6.a a4;
                    if ((a4 = a2) == null) {
                        a4 = new D6.a();
                    }
                    if (charset != null && !charset.equals(C6.a.j)) {
                        a4.F(s, i, Character.charCount(codePoint) + i, charset);
                    }
                    else {
                        a4.I(codePoint);
                    }
                    while (true) {
                        a3 = a4;
                        if (a4.b()) {
                            break;
                        }
                        final byte l = a4.l();
                        a.D(37);
                        final char[] j = c.j;
                        a.D(j[(l & 0xFF) >> 4 & 0xF]);
                        a.D(j[l & 0xF]);
                    }
                }
            }
            i += Character.charCount(codePoint);
            a2 = a3;
        }
    }
    
    public static int d(final String s) {
        if (s.equals("http")) {
            return 80;
        }
        if (s.equals("https")) {
            return 443;
        }
        return -1;
    }
    
    public static c k(final String s) {
        return new a().h(null, s).a();
    }
    
    public static void l(final StringBuilder sb, final List list) {
        for (int size = list.size(), i = 0; i < size; i += 2) {
            final String str = list.get(i);
            final String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }
    
    public static c n(final String s) {
        try {
            return k(s);
        }
        catch (IllegalArgumentException ex) {
            return null;
        }
    }
    
    public static void o(final StringBuilder sb, final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }
    
    public static String p(final String s, final int beginIndex, final int endIndex, final boolean b) {
        for (int i = beginIndex; i < endIndex; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '%' || (char1 == '+' && b)) {
                final D6.a a = new D6.a();
                a.H(s, beginIndex, i);
                s(a, s, i, endIndex, b);
                return a.u();
            }
        }
        return s.substring(beginIndex, endIndex);
    }
    
    public static String q(final String s, final boolean b) {
        return p(s, 0, s.length(), b);
    }
    
    public static void s(final D6.a a, final String s, int i, final int n, final boolean b) {
        while (i < n) {
            final int codePoint = s.codePointAt(i);
            Label_0112: {
                Label_0105: {
                    if (codePoint == 37) {
                        final int index = i + 2;
                        if (index < n) {
                            final int e = C6.a.e(s.charAt(i + 1));
                            final int e2 = C6.a.e(s.charAt(index));
                            if (e != -1 && e2 != -1) {
                                a.D((e << 4) + e2);
                                i = index;
                                break Label_0112;
                            }
                            break Label_0105;
                        }
                    }
                    if (codePoint == 43 && b) {
                        a.D(32);
                        break Label_0112;
                    }
                }
                a.I(codePoint);
            }
            i += Character.charCount(codePoint);
        }
    }
    
    public static boolean t(final String s, final int index, final int n) {
        final int index2 = index + 2;
        return index2 < n && s.charAt(index) == '%' && C6.a.e(s.charAt(index + 1)) != -1 && C6.a.e(s.charAt(index2)) != -1;
    }
    
    public static List u(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        int n;
        for (int i = 0; i <= s.length(); i = n + 1) {
            if ((n = s.indexOf(38, i)) == -1) {
                n = s.length();
            }
            final int index = s.indexOf(61, i);
            String substring;
            if (index != -1 && index <= n) {
                list.add(s.substring(i, index));
                substring = s.substring(index + 1, n);
            }
            else {
                list.add(s.substring(i, n));
                substring = null;
            }
            list.add(substring);
        }
        return list;
    }
    
    public String e() {
        if (this.h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof c && ((c)o).i.equals(this.i);
    }
    
    public String f() {
        if (this.c.isEmpty()) {
            return "";
        }
        return this.i.substring(this.i.indexOf(58, this.a.length() + 3) + 1, this.i.indexOf(64));
    }
    
    public String g() {
        final int index = this.i.indexOf(47, this.a.length() + 3);
        final String i = this.i;
        return this.i.substring(index, C6.a.i(i, index, i.length(), "?#"));
    }
    
    public List h() {
        int i = this.i.indexOf(47, this.a.length() + 3);
        final String j = this.i;
        final int k = C6.a.i(j, i, j.length(), "?#");
        final ArrayList<String> list = new ArrayList<String>();
        while (i < k) {
            final int beginIndex = i + 1;
            i = C6.a.h(this.i, beginIndex, k, '/');
            list.add(this.i.substring(beginIndex, i));
        }
        return list;
    }
    
    @Override
    public int hashCode() {
        return this.i.hashCode();
    }
    
    public String i() {
        if (this.g == null) {
            return null;
        }
        final int beginIndex = this.i.indexOf(63) + 1;
        final String i = this.i;
        return this.i.substring(beginIndex, C6.a.h(i, beginIndex, i.length(), '#'));
    }
    
    public String j() {
        if (this.b.isEmpty()) {
            return "";
        }
        final int beginIndex = this.a.length() + 3;
        final String i = this.i;
        return this.i.substring(beginIndex, C6.a.i(i, beginIndex, i.length(), ":@"));
    }
    
    public a m() {
        final a a = new a();
        a.a = this.a;
        a.b = this.j();
        a.c = this.f();
        a.d = this.d;
        int e;
        if (this.e != d(this.a)) {
            e = this.e;
        }
        else {
            e = -1;
        }
        a.e = e;
        a.f.clear();
        a.f.addAll(this.h());
        a.d(this.i());
        a.h = this.e();
        return a;
    }
    
    public final List r(final List list, final boolean b) {
        final int size = list.size();
        final ArrayList list2 = new ArrayList<String>(size);
        for (int i = 0; i < size; ++i) {
            final String s = list.get(i);
            String q;
            if (s != null) {
                q = q(s, b);
            }
            else {
                q = null;
            }
            list2.add(q);
        }
        return Collections.unmodifiableList((List<?>)list2);
    }
    
    @Override
    public String toString() {
        return this.i;
    }
    
    public static final class a
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public final List f;
        public List g;
        public String h;
        
        public a() {
            this.b = "";
            this.c = "";
            this.e = -1;
            (this.f = new ArrayList()).add("");
        }
        
        public static String b(final String s, final int n, final int n2) {
            return C6.a.a(c.p(s, n, n2, false));
        }
        
        public static int i(final String s, int int1, final int n) {
            try {
                int1 = Integer.parseInt(c.a(s, int1, n, "", false, false, false, true, null));
                if (int1 > 0 && int1 <= 65535) {
                    return int1;
                }
                return -1;
            }
            catch (NumberFormatException ex) {
                return -1;
            }
        }
        
        public static int l(final String s, int i, final int n) {
            while (i < n) {
                final char char1 = s.charAt(i);
                if (char1 == ':') {
                    return i;
                }
                int n2 = i;
                int n3 = 0;
                Label_0058: {
                    if (char1 != '[') {
                        n3 = i;
                    }
                    else {
                        do {
                            i = n2 + 1;
                            if ((n3 = i) >= n) {
                                break Label_0058;
                            }
                            n2 = i;
                        } while (s.charAt(i) != ']');
                        n3 = i;
                    }
                }
                i = n3 + 1;
            }
            return n;
        }
        
        public static int p(final String s, int n, final int n2) {
            if (n2 - n < 2) {
                return -1;
            }
            final char char1 = s.charAt(n);
            while (true) {
                Label_0032: {
                    if (char1 < 'a') {
                        break Label_0032;
                    }
                    int n3 = n;
                    if (char1 > 'z') {
                        break Label_0032;
                    }
                    while (true) {
                        n = n3 + 1;
                        if (n >= n2) {
                            return -1;
                        }
                        final char char2 = s.charAt(n);
                        if (char2 >= 'a') {
                            n3 = n;
                            if (char2 <= 'z') {
                                continue;
                            }
                        }
                        if (char2 >= 'A') {
                            n3 = n;
                            if (char2 <= 'Z') {
                                continue;
                            }
                        }
                        if (char2 >= '0') {
                            n3 = n;
                            if (char2 <= '9') {
                                continue;
                            }
                        }
                        n3 = n;
                        if (char2 == '+') {
                            continue;
                        }
                        n3 = n;
                        if (char2 == '-') {
                            continue;
                        }
                        if (char2 == '.') {
                            n3 = n;
                        }
                        else {
                            if (char2 == ':') {
                                return n;
                            }
                            return -1;
                        }
                    }
                }
                if (char1 >= 'A') {
                    final int n3 = n;
                    if (char1 > 'Z') {
                        return -1;
                    }
                    continue;
                }
                break;
            }
            return -1;
        }
        
        public static int q(final String s, int i, final int n) {
            int n2 = 0;
            while (i < n) {
                final char char1 = s.charAt(i);
                if (char1 != '\\' && char1 != '/') {
                    break;
                }
                ++n2;
                ++i;
            }
            return n2;
        }
        
        public c a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d != null) {
                return new c(this);
            }
            throw new IllegalStateException("host == null");
        }
        
        public int c() {
            final int e = this.e;
            if (e != -1) {
                return e;
            }
            return B6.c.d(this.a);
        }
        
        public a d(final String s) {
            List u;
            if (s != null) {
                u = B6.c.u(B6.c.b(s, " \"'<>#", true, false, true, true));
            }
            else {
                u = null;
            }
            this.g = u;
            return this;
        }
        
        public a e(String b) {
            if (b != null) {
                b = B6.c.b(b, "", false, false, false, false);
            }
            else {
                b = null;
            }
            this.h = b;
            return this;
        }
        
        public final boolean f(final String s) {
            return s.equals(".") || s.equalsIgnoreCase("%2e");
        }
        
        public final boolean g(final String s) {
            return s.equals("..") || s.equalsIgnoreCase("%2e.") || s.equalsIgnoreCase(".%2e") || s.equalsIgnoreCase("%2e%2e");
        }
        
        public a h(final c c, final String s) {
            int k = C6.a.k(s, 0, s.length());
            final int l = C6.a.l(s, k, s.length());
            final int p2 = p(s, k, l);
            if (p2 != -1) {
                if (s.regionMatches(true, k, "https:", 0, 6)) {
                    this.a = "https";
                    k += 6;
                }
                else {
                    if (!s.regionMatches(true, k, "http:", 0, 5)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(s.substring(0, p2));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a = "http";
                    k += 5;
                }
            }
            else {
                if (c == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.a = c.a;
            }
            final int q = q(s, k, l);
            int n = 0;
            Label_0686: {
                if (q < 2 && c != null && c.a.equals(this.a)) {
                    this.b = c.j();
                    this.c = c.f();
                    this.d = c.d;
                    this.e = c.e;
                    this.f.clear();
                    this.f.addAll(c.h());
                    if (k != l) {
                        n = k;
                        if (s.charAt(k) != '#') {
                            break Label_0686;
                        }
                    }
                    this.d(c.i());
                    n = k;
                }
                else {
                    int n3;
                    final int n2 = n3 = 0;
                    int beginIndex = k + q;
                    int n4 = n2;
                    int i;
                    while (true) {
                        i = C6.a.i(s, beginIndex, l, "@/\\?#");
                        int char1;
                        if (i != l) {
                            char1 = s.charAt(i);
                        }
                        else {
                            char1 = -1;
                        }
                        if (char1 == -1 || char1 == 35 || char1 == 47 || char1 == 92 || char1 == 63) {
                            break;
                        }
                        if (char1 != 64) {
                            continue;
                        }
                        if (n4 == 0) {
                            final int h = C6.a.h(s, beginIndex, i, ':');
                            final int n5 = i;
                            String s2 = c.a(s, beginIndex, h, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (n3 != 0) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.b);
                                sb2.append("%40");
                                sb2.append(s2);
                                s2 = sb2.toString();
                            }
                            this.b = s2;
                            if (h != n5) {
                                this.c = c.a(s, h + 1, n5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                n4 = 1;
                            }
                            n3 = 1;
                        }
                        else {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.c);
                            sb3.append("%40");
                            sb3.append(c.a(s, beginIndex, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.c = sb3.toString();
                        }
                        beginIndex = i + 1;
                    }
                    final int j = l(s, beginIndex, i);
                    final int beginIndex2 = j + 1;
                    if (beginIndex2 < i) {
                        this.d = b(s, beginIndex, j);
                        if ((this.e = i(s, beginIndex2, i)) == -1) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Invalid URL port: \"");
                            sb4.append(s.substring(beginIndex2, i));
                            sb4.append('\"');
                            throw new IllegalArgumentException(sb4.toString());
                        }
                    }
                    else {
                        this.d = b(s, beginIndex, j);
                        this.e = c.d(this.a);
                    }
                    if (this.d == null) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid URL host: \"");
                        sb5.append(s.substring(beginIndex, j));
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    n = i;
                }
            }
            final int m = C6.a.i(s, n, l, "?#");
            this.o(s, n, m);
            int h2;
            if ((h2 = m) < l) {
                h2 = m;
                if (s.charAt(m) == '?') {
                    h2 = C6.a.h(s, m, l, '#');
                    this.g = c.u(c.a(s, m + 1, h2, " \"'<>#", true, false, true, true, null));
                }
            }
            if (h2 < l && s.charAt(h2) == '#') {
                this.h = c.a(s, 1 + h2, l, "", true, false, false, false, null);
            }
            return this;
        }
        
        public a j(final String s) {
            if (s != null) {
                this.c = B6.c.b(s, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }
        
        public final void k() {
            final List f = this.f;
            if (f.remove(f.size() - 1).isEmpty() && !this.f.isEmpty()) {
                final List f2 = this.f;
                f2.set(f2.size() - 1, "");
                return;
            }
            this.f.add("");
        }
        
        public final void m(String a, final int n, final int n2, final boolean b, final boolean b2) {
            a = B6.c.a(a, n, n2, " \"<>^`{}|/\\?#", b2, false, false, true, null);
            if (this.f(a)) {
                return;
            }
            if (this.g(a)) {
                this.k();
                return;
            }
            final List f = this.f;
            if (f.get(f.size() - 1).isEmpty()) {
                final List f2 = this.f;
                f2.set(f2.size() - 1, a);
            }
            else {
                this.f.add(a);
            }
            if (b) {
                this.f.add("");
            }
        }
        
        public a n(final String s) {
            List u;
            if (s != null) {
                u = B6.c.u(B6.c.b(s, " \"'<>#", false, false, true, true));
            }
            else {
                u = null;
            }
            this.g = u;
            return this;
        }
        
        public final void o(final String s, int i, final int n) {
            if (i == n) {
                return;
            }
            final char char1 = s.charAt(i);
            while (true) {
                Label_0135: {
                    if (char1 == '/' || char1 == '\\') {
                        this.f.clear();
                        this.f.add("");
                        break Label_0135;
                    }
                    final List f = this.f;
                    f.set(f.size() - 1, "");
                    while (i < n) {
                        final int j = C6.a.i(s, i, n, "/\\");
                        final boolean b = j < n;
                        this.m(s, i, j, b, true);
                        i = j;
                        if (b) {
                            i = j;
                            break Label_0135;
                        }
                    }
                    return;
                }
                ++i;
                continue;
            }
        }
        
        public a r(final String s) {
            if (s != null) {
                this.b = B6.c.b(s, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            final String a = this.a;
            String str;
            if (a != null) {
                sb.append(a);
                str = "://";
            }
            else {
                str = "//";
            }
            sb.append(str);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            final String d = this.d;
            if (d != null) {
                if (d.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                }
                else {
                    sb.append(this.d);
                }
            }
            if (this.e != -1 || this.a != null) {
                final int c = this.c();
                final String a2 = this.a;
                if (a2 == null || c != B6.c.d(a2)) {
                    sb.append(':');
                    sb.append(c);
                }
            }
            B6.c.o(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                B6.c.l(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }
}
