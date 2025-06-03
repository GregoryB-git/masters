package F5;

import D5.l;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f1988a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1989b;

    /* renamed from: c, reason: collision with root package name */
    public final l.b f1990c;

    public class a implements l.b {
        public a() {
        }

        @Override // D5.l.b
        public String a(String str, String str2) {
            Context context = e.this.f1989b;
            if (str2 != null) {
                Locale b7 = e.b(str2);
                Configuration configuration = new Configuration(e.this.f1989b.getResources().getConfiguration());
                configuration.setLocale(b7);
                context = e.this.f1989b.createConfigurationContext(configuration);
            }
            int identifier = context.getResources().getIdentifier(str, "string", e.this.f1989b.getPackageName());
            if (identifier != 0) {
                return context.getResources().getString(identifier);
            }
            return null;
        }
    }

    public e(Context context, l lVar) {
        a aVar = new a();
        this.f1990c = aVar;
        this.f1989b = context;
        this.f1988a = lVar;
        lVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i7 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i7 = 2;
        }
        if (split.length > i7 && split[i7].length() >= 2 && split[i7].length() <= 3) {
            str4 = split[i7];
        }
        return new Locale(str3, str4, str2);
    }

    /* JADX WARN: Incorrect condition in loop: B:28:0x00d2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Locale c(java.util.List r10) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.e.c(java.util.List):java.util.Locale");
    }

    public void d(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int i7 = 0; i7 < size; i7++) {
                locale = locales.get(i7);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f1988a.b(arrayList);
    }
}
