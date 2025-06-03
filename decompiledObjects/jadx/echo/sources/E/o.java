package E;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f1531a;

    public o(Object obj) {
        this.f1531a = n.a(obj);
    }

    @Override // E.i
    public Object a() {
        return this.f1531a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f1531a.equals(((i) obj).a());
        return equals;
    }

    @Override // E.i
    public Locale get(int i7) {
        Locale locale;
        locale = this.f1531a.get(i7);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f1531a.hashCode();
        return hashCode;
    }

    public String toString() {
        String localeList;
        localeList = this.f1531a.toString();
        return localeList;
    }
}
