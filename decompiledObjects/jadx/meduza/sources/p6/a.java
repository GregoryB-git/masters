package p6;

import android.util.Log;
import java.util.Locale;
import m6.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13015a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13017c;

    public a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f13016b = sb2;
        this.f13015a = str;
        new d(str, null);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f13015a, i10)) {
            i10++;
        }
        this.f13017c = i10;
    }

    public final void a(String str, Object... objArr) {
        if (this.f13017c <= 3) {
            Log.d(this.f13015a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f13015a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f13015a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f13016b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f13017c <= 2) {
            Log.v(this.f13015a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f13015a, d(str, objArr));
    }
}
