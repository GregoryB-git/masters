package a0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f9c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f10a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public k(Locale... localeArr) {
        String sb2;
        if (localeArr.length == 0) {
            this.f10a = f9c;
            sb2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder();
            for (int i10 = 0; i10 < localeArr.length; i10++) {
                Locale locale = localeArr[i10];
                if (locale == null) {
                    throw new NullPointerException(j.h("list[", i10, "] is null"));
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb3.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb3.append('-');
                        sb3.append(locale2.getCountry());
                    }
                    if (i10 < localeArr.length - 1) {
                        sb3.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f10a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb2 = sb3.toString();
        }
        this.f11b = sb2;
    }

    @Override // a0.l
    public final String a() {
        return this.f11b;
    }

    @Override // a0.l
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Locale[] localeArr = ((k) obj).f10a;
        if (this.f10a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f10a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // a0.l
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f10a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f10a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override // a0.l
    public final boolean isEmpty() {
        return this.f10a.length == 0;
    }

    @Override // a0.l
    public final int size() {
        return this.f10a.length;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f10a;
            if (i10 >= localeArr.length) {
                l10.append("]");
                return l10.toString();
            }
            l10.append(localeArr[i10]);
            if (i10 < this.f10a.length - 1) {
                l10.append(',');
            }
            i10++;
        }
    }
}
