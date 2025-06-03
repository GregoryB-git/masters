// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C1;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import android.widget.TextView;
import T1.a;
import android.view.View;

public final class d
{
    public static final d a;
    
    static {
        a = new d();
    }
    
    public static final boolean g(final View view) {
        final boolean d = T1.a.d(d.class);
        final boolean b = false;
        if (d) {
            return false;
        }
        boolean b2 = b;
        Label_0115: {
            try {
                if (!(view instanceof TextView)) {
                    return b2;
                }
                final d a = C1.d.a;
                if (!a.c((TextView)view) && !a.a((TextView)view) && !a.d((TextView)view) && !a.f((TextView)view) && !a.e((TextView)view)) {
                    final boolean b3 = a.b((TextView)view);
                    b2 = b;
                    if (!b3) {
                        return b2;
                    }
                }
            }
            finally {
                break Label_0115;
            }
            b2 = true;
            return b2;
        }
        final Throwable t;
        T1.a.b(t, d.class);
        return false;
    }
    
    public final boolean a(final TextView textView) {
        final boolean d = T1.a.d(this);
        final boolean b = false;
        if (d) {
            return false;
        }
    Label_0121_Outer:
        while (true) {
        Label_0121:
            while (true) {
                Label_0194: {
                    while (true) {
                        int index = 0;
                        int n2 = 0;
                        int n = 0;
                        int n3 = 0;
                        Label_0168: {
                            while (true) {
                                try {
                                    final String replace = new Regex("\\s").replace(f.k((View)textView), "");
                                    index = replace.length();
                                    boolean b2 = b;
                                    if (index >= 12) {
                                        if (index > 19) {
                                            return false;
                                        }
                                        --index;
                                        if (index < 0) {
                                            break Label_0194;
                                        }
                                        n = (n2 = 0);
                                        n3 = index - 1;
                                        final char char1 = replace.charAt(index);
                                        if (!Character.isDigit(char1)) {
                                            return false;
                                        }
                                        final int n4 = index = CharsKt.c(char1);
                                        if (n == 0) {
                                            break Label_0168;
                                        }
                                        final int n5 = n4 * 2;
                                        if ((index = n5) > 9) {
                                            index = n5 % 10 + 1;
                                        }
                                        break Label_0168;
                                    }
                                    Label_0136: {
                                        return b2;
                                    }
                                    T1.a.b((Throwable)replace, this);
                                    return false;
                                    b2 = b;
                                    // iftrue(Label_0136:, n2 % 10 != 0)
                                    b2 = true;
                                    return b2;
                                }
                                finally {}
                                final String s;
                                final String replace = s;
                                continue Label_0121_Outer;
                            }
                        }
                        n2 += index;
                        n ^= 0x1;
                        if (n3 < 0) {
                            continue Label_0121;
                        }
                        index = n3;
                        continue Label_0121_Outer;
                    }
                }
                int n2 = 0;
                continue Label_0121;
            }
        }
    }
    
    public final boolean b(final TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        Label_0059: {
            try {
                if (textView.getInputType() == 32) {
                    return true;
                }
                final String k = f.k((View)textView);
                if (k != null) {
                    return k.length() != 0 && Patterns.EMAIL_ADDRESS.matcher(k).matches();
                }
            }
            finally {
                break Label_0059;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
    
    public final boolean c(final TextView textView) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 128 || textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public final boolean d(final TextView textView) {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        try {
            if (textView.getInputType() == 96) {
                b = true;
            }
            return b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public final boolean e(final TextView textView) {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        try {
            if (textView.getInputType() == 3) {
                b = true;
            }
            return b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public final boolean f(final TextView textView) {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        try {
            if (textView.getInputType() == 112) {
                b = true;
            }
            return b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
}
