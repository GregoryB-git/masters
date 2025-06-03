package d9;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3688b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c, reason: collision with root package name */
    public static final n f3689c = new n(j9.l.f8691b);

    /* renamed from: a, reason: collision with root package name */
    public final j9.l f3690a;

    public n(j9.l lVar) {
        this.f3690a = lVar;
    }

    public n(List<String> list) {
        this.f3690a = list.isEmpty() ? j9.l.f8692c : new j9.l(list);
    }

    public static n a(String str) {
        if (str == null) {
            throw new NullPointerException("Provided field path must not be null.");
        }
        x6.b.p("Use FieldPath.of() for field names containing '~*/[]'.", !f3688b.matcher(str).find(), new Object[0]);
        try {
            return b(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(defpackage.g.e("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    public static n b(String... strArr) {
        x6.b.p("Invalid field path. Provided path must not be empty.", strArr.length > 0, new Object[0]);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str = strArr[i10];
            boolean z10 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder l10 = defpackage.f.l("Invalid field name at argument ");
            i10++;
            l10.append(i10);
            l10.append(". Field names must not be null or empty.");
            x6.b.p(l10.toString(), z10, new Object[0]);
        }
        return new n((List<String>) Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return this.f3690a.equals(((n) obj).f3690a);
    }

    public final int hashCode() {
        return this.f3690a.hashCode();
    }

    public final String toString() {
        return this.f3690a.h();
    }
}
