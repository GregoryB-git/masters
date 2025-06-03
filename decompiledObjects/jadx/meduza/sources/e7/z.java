package e7;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z extends d3 {

    /* renamed from: d, reason: collision with root package name */
    public long f4791d;

    /* renamed from: e, reason: collision with root package name */
    public String f4792e;

    public z(j2 j2Var) {
        super(j2Var);
    }

    @Override // e7.d3
    public final boolean o() {
        Calendar calendar = Calendar.getInstance();
        this.f4791d = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f4792e = defpackage.g.e(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long p() {
        m();
        return this.f4791d;
    }

    public final String q() {
        m();
        return this.f4792e;
    }
}
