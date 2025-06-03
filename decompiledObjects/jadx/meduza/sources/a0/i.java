package a0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f6b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final l f7a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f8a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f8a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (localeArr[i10].equals(locale)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                Locale[] localeArr2 = f8a;
                int length2 = localeArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        z11 = false;
                        break;
                    }
                    if (localeArr2[i11].equals(locale2)) {
                        z11 = true;
                        break;
                    }
                    i11++;
                }
                if (!z11) {
                    String a10 = c0.a.a(locale);
                    if (!a10.isEmpty()) {
                        return a10.equals(c0.a.a(locale2));
                    }
                    String country = locale.getCountry();
                    return country.isEmpty() || country.equals(locale2.getCountry());
                }
            }
            return false;
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public i(l lVar) {
        this.f7a = lVar;
    }

    public static i a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new i(new m(b.a(localeArr))) : new i(new k(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return f6b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public final Locale c(int i10) {
        return this.f7a.get(i10);
    }

    public final boolean d() {
        return this.f7a.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && this.f7a.equals(((i) obj).f7a);
    }

    public final int hashCode() {
        return this.f7a.hashCode();
    }

    public final String toString() {
        return this.f7a.toString();
    }
}
