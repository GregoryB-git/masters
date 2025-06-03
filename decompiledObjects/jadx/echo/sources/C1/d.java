package C1;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f909a = new d();

    public static final boolean g(View view) {
        if (T1.a.d(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = f909a;
            if (!dVar.c((TextView) view) && !dVar.a((TextView) view) && !dVar.d((TextView) view) && !dVar.f((TextView) view) && !dVar.e((TextView) view)) {
                if (!dVar.b((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            T1.a.b(th, d.class);
            return false;
        }
    }

    public final boolean a(TextView textView) {
        int i7;
        int c7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(f.k(textView), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i8 = length - 1;
                if (i8 >= 0) {
                    boolean z7 = false;
                    i7 = 0;
                    while (true) {
                        int i9 = i8 - 1;
                        char charAt = replace.charAt(i8);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        c7 = kotlin.text.a.c(charAt);
                        if (z7 && (c7 = c7 * 2) > 9) {
                            c7 = (c7 % 10) + 1;
                        }
                        i7 += c7;
                        z7 = !z7;
                        if (i9 < 0) {
                            break;
                        }
                        i8 = i9;
                    }
                } else {
                    i7 = 0;
                }
                return i7 % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean b(TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String k7 = f.k(textView);
            if (k7 != null && k7.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(k7).matches();
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean c(TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean d(TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean e(TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean f(TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
