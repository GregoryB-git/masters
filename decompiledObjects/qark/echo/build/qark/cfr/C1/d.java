/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.Patterns
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package C1;

import C1.f;
import T1.a;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

public final class d {
    public static final d a = new d();

    public static final boolean g(View view) {
        Throwable throwable2;
        block5 : {
            boolean bl;
            block3 : {
                block4 : {
                    bl = a.d(d.class);
                    boolean bl2 = false;
                    if (bl) {
                        return false;
                    }
                    bl = bl2;
                    try {
                        if (!(view instanceof TextView)) break block3;
                        d d8 = a;
                        if (d8.c((TextView)view) || d8.a((TextView)view) || d8.d((TextView)view) || d8.f((TextView)view) || d8.e((TextView)view)) break block4;
                        boolean bl3 = d8.b((TextView)view);
                        bl = bl2;
                        if (!bl3) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                bl = true;
            }
            return bl;
        }
        a.b(throwable2, d.class);
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final boolean a(TextView var1_1) {
        block11 : {
            block10 : {
                block9 : {
                    var8_3 = a.d(this);
                    var9_4 = false;
                    if (var8_3) {
                        return false;
                    }
                    var1_1 = f.k((View)var1_1);
                    var1_1 = new Regex("\\s").replace((CharSequence)var1_1, "");
                    var3_5 = var1_1.length();
                    var8_3 = var9_4;
                    if (var3_5 < 12) ** GOTO lbl28
                    if (var3_5 <= 19) break block9;
                    return false;
lbl13: // 2 sources:
                    var6_9 = var3_5 - 1;
                    try {
                        var2_6 = var1_1.charAt(var3_5);
                        if (!Character.isDigit((char)var2_6)) {
                            return false;
                        }
                        var3_5 = var7_10 = CharsKt.c(var2_6);
                        if (var4_7 == 0) break block10;
                    }
                    catch (Throwable var1_2) {
                        ** continue;
                    }
                    var3_5 = var7_10 *= 2;
                    if (var7_10 <= 9) break block10;
                    var3_5 = var7_10 % 10 + 1;
                    break block10;
lbl24: // 2 sources:
                    do {
                        var8_3 = var9_4;
                        if (var5_8 % 10 == 0) {
                            var8_3 = true;
                        }
lbl28: // 4 sources:
                        return var8_3;
                        break;
                    } while (true);
lbl29: // 1 sources:
                    do {
                        a.b(var1_2, this);
                        return false;
                        break;
                    } while (true);
                    break block10;
                }
                if (--var3_5 < 0) break block11;
                var5_8 = var4_7 = 0;
                ** GOTO lbl13
            }
            var5_8 += var3_5;
            var4_7 ^= 1;
            if (var6_9 < 0) ** GOTO lbl24
            var3_5 = var6_9;
            ** GOTO lbl13
        }
        var5_8 = 0;
        ** while (true)
    }

    public final boolean b(TextView object) {
        Throwable throwable2;
        block9 : {
            block7 : {
                block8 : {
                    block6 : {
                        if (a.d(this)) {
                            return false;
                        }
                        try {
                            if (object.getInputType() != 32) break block6;
                            return true;
                        }
                        catch (Throwable throwable2) {}
                    }
                    object = f.k((View)object);
                    if (object == null) break block7;
                    if (object.length() != 0) break block8;
                    return false;
                }
                boolean bl = Patterns.EMAIL_ADDRESS.matcher((CharSequence)object).matches();
                return bl;
                break block9;
            }
            return false;
        }
        a.b(throwable2, this);
        return false;
    }

    public final boolean c(TextView textView) {
        block4 : {
            if (a.d(this)) {
                return false;
            }
            try {
                if (textView.getInputType() != 128) break block4;
                return true;
            }
            catch (Throwable throwable) {
                a.b(throwable, this);
                return false;
            }
        }
        boolean bl = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        return bl;
    }

    public final boolean d(TextView textView) {
        boolean bl = a.d(this);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        try {
            int n8 = textView.getInputType();
            if (n8 == 96) {
                bl2 = true;
            }
            return bl2;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return false;
        }
    }

    public final boolean e(TextView textView) {
        boolean bl = a.d(this);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        try {
            int n8 = textView.getInputType();
            if (n8 == 3) {
                bl2 = true;
            }
            return bl2;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return false;
        }
    }

    public final boolean f(TextView textView) {
        boolean bl = a.d(this);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        try {
            int n8 = textView.getInputType();
            if (n8 == 112) {
                bl2 = true;
            }
            return bl2;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return false;
        }
    }
}

