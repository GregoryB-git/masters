package okhttp3;

import a0.j;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

/* loaded from: classes.dex */
public final class Cookie {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f12216j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f12217k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f12218l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f12219m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f12220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12221b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12222c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12223d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12224e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12225g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12226h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12227i;

    public static final class Builder {
    }

    public Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f12220a = str;
        this.f12221b = str2;
        this.f12222c = j10;
        this.f12223d = str3;
        this.f12224e = str4;
        this.f = z10;
        this.f12225g = z11;
        this.f12227i = z12;
        this.f12226h = z13;
    }

    public static int a(int i10, int i11, String str, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static long b(int i10, String str) {
        int a10 = a(0, i10, str, false);
        Matcher matcher = f12219m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (a10 < i10) {
            int a11 = a(a10 + 1, i10, str, true);
            matcher.region(a10, a11);
            if (i12 == -1 && matcher.usePattern(f12219m).matches()) {
                i12 = Integer.parseInt(matcher.group(1));
                i15 = Integer.parseInt(matcher.group(2));
                i16 = Integer.parseInt(matcher.group(3));
            } else if (i13 == -1 && matcher.usePattern(f12218l).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
            } else {
                if (i14 == -1) {
                    Pattern pattern = f12217k;
                    if (matcher.usePattern(pattern).matches()) {
                        i14 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(f12216j).matches()) {
                    i11 = Integer.parseInt(matcher.group(1));
                }
            }
            a10 = a(a11 + 1, i10, str, false);
        }
        if (i11 >= 70 && i11 <= 99) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 <= 69) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i14 == -1) {
            throw new IllegalArgumentException();
        }
        if (i13 < 1 || i13 > 31) {
            throw new IllegalArgumentException();
        }
        if (i12 < 0 || i12 > 23) {
            throw new IllegalArgumentException();
        }
        if (i15 < 0 || i15 > 59) {
            throw new IllegalArgumentException();
        }
        if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f12384n);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, i14 - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i15);
        gregorianCalendar.set(13, i16);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.f12220a.equals(this.f12220a) && cookie.f12221b.equals(this.f12221b) && cookie.f12223d.equals(this.f12223d) && cookie.f12224e.equals(this.f12224e) && cookie.f12222c == this.f12222c && cookie.f == this.f && cookie.f12225g == this.f12225g && cookie.f12226h == this.f12226h && cookie.f12227i == this.f12227i;
    }

    public final int hashCode() {
        int e10 = j.e(this.f12224e, j.e(this.f12223d, j.e(this.f12221b, j.e(this.f12220a, 527, 31), 31), 31), 31);
        long j10 = this.f12222c;
        return ((((((((e10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.f12225g ? 1 : 0)) * 31) + (!this.f12226h ? 1 : 0)) * 31) + (!this.f12227i ? 1 : 0);
    }

    public final String toString() {
        String format;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12220a);
        sb2.append('=');
        sb2.append(this.f12221b);
        if (this.f12226h) {
            if (this.f12222c == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb2.append("; expires=");
                format = HttpDate.f12453a.get().format(new Date(this.f12222c));
            }
            sb2.append(format);
        }
        if (!this.f12227i) {
            sb2.append("; domain=");
            sb2.append(this.f12223d);
        }
        sb2.append("; path=");
        sb2.append(this.f12224e);
        if (this.f) {
            sb2.append("; secure");
        }
        if (this.f12225g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
