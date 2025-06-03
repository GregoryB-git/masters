package aa;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f296d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f297a;

    /* renamed from: b, reason: collision with root package name */
    public final String f298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f299c;

    public g0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f296d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f297a = str3;
        this.f298b = str;
        this.f299c = defpackage.g.e(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f297a.equals(g0Var.f297a) && this.f298b.equals(g0Var.f298b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f298b, this.f297a});
    }
}
