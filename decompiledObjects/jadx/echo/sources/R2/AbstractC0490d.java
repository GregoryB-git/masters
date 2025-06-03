package R2;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.C1080z1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: R2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0490d {

    /* renamed from: a, reason: collision with root package name */
    public String f5240a;

    /* renamed from: b, reason: collision with root package name */
    public int f5241b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f5242c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f5243d;

    /* renamed from: e, reason: collision with root package name */
    public Long f5244e;

    /* renamed from: f, reason: collision with root package name */
    public Long f5245f;

    public AbstractC0490d(String str, int i7) {
        this.f5240a = str;
        this.f5241b = i7;
    }

    public static Boolean b(double d7, C1080z1 c1080z1) {
        try {
            return h(new BigDecimal(d7), c1080z1, Math.ulp(d7));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(long j7, C1080z1 c1080z1) {
        try {
            return h(new BigDecimal(j7), c1080z1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean d(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    public static Boolean e(String str, C1080z1 c1080z1) {
        if (!N5.f0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), c1080z1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(String str, B1.a aVar, boolean z7, String str2, List list, String str3, Y1 y12) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (aVar == B1.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && aVar != B1.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (e6.f5282a[aVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z7 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (y12 != null) {
                        y12.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    public static Boolean g(String str, com.google.android.gms.internal.measurement.B1 b12, Y1 y12) {
        List list;
        AbstractC0328n.i(b12);
        if (str == null || !b12.O() || b12.G() == B1.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        B1.a G6 = b12.G();
        B1.a aVar = B1.a.IN_LIST;
        if (G6 == aVar) {
            if (b12.k() == 0) {
                return null;
            }
        } else if (!b12.N()) {
            return null;
        }
        B1.a G7 = b12.G();
        boolean L6 = b12.L();
        String J6 = (L6 || G7 == B1.a.REGEXP || G7 == aVar) ? b12.J() : b12.J().toUpperCase(Locale.ENGLISH);
        if (b12.k() == 0) {
            list = null;
        } else {
            List K6 = b12.K();
            if (!L6) {
                ArrayList arrayList = new ArrayList(K6.size());
                Iterator it = K6.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                K6 = Collections.unmodifiableList(arrayList);
            }
            list = K6;
        }
        return f(str, G7, L6, J6, list, G7 == B1.a.REGEXP ? J6 : null, y12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.C1080z1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.AbstractC0490d.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.z1, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean i();

    public abstract boolean j();
}
