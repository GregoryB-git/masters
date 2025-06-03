package okhttp3;

import defpackage.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class Headers {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f12242a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12243a = new ArrayList(20);

        public final void a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                b(str.substring(0, indexOf), str.substring(indexOf + 1));
            } else if (str.startsWith(":")) {
                b("", str.substring(1));
            } else {
                b("", str);
            }
        }

        public final void b(String str, String str2) {
            this.f12243a.add(str);
            this.f12243a.add(str2.trim());
        }

        public final void c(String str) {
            int i10 = 0;
            while (i10 < this.f12243a.size()) {
                if (str.equalsIgnoreCase((String) this.f12243a.get(i10))) {
                    this.f12243a.remove(i10);
                    this.f12243a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }

        public final void d(String str, String str2) {
            Headers.a(str);
            Headers.b(str2, str);
            c(str);
            b(str, str2);
        }
    }

    public Headers(Builder builder) {
        ArrayList arrayList = builder.f12243a;
        this.f12242a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(Util.l("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
            }
        }
    }

    public static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(g.e("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(Util.l("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
            }
        }
    }

    public final String c(String str) {
        String[] strArr = this.f12242a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String d(int i10) {
        return this.f12242a[i10 * 2];
    }

    public final Builder e() {
        Builder builder = new Builder();
        Collections.addAll(builder.f12243a, this.f12242a);
        return builder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(((Headers) obj).f12242a, this.f12242a);
    }

    public final String f(int i10) {
        return this.f12242a[(i10 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12242a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f12242a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(d(i10));
            sb2.append(": ");
            sb2.append(f(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
