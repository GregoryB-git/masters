/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.PrecomputedText
 *  android.text.PrecomputedText$Params
 *  android.text.Spannable
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package G;

import G.b;
import G.c;
import G.d;
import G.e;
import G.f;
import G.g;
import G.h;
import G.i;
import G.j;
import G.k;
import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Locale;

public abstract class l
implements Spannable {

    public static final class G.l$a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        public G.l$a(PrecomputedText.Params params) {
            this.a = d.a(params);
            this.b = e.a(params);
            this.c = f.a(params);
            this.d = g.a(params);
            if (Build.VERSION.SDK_INT < 29) {
                params = null;
            }
            this.e = params;
        }

        /*
         * Enabled aggressive block sorting
         */
        public G.l$a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int n8, int n9) {
            PrecomputedText.Params params = Build.VERSION.SDK_INT >= 29 ? k.a(j.a(i.a(h.a(b.a(textPaint), n8), n9), textDirectionHeuristic)) : null;
            this.e = params;
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = n8;
            this.d = n9;
        }

        public boolean a(G.l$a a8) {
            int n8 = Build.VERSION.SDK_INT;
            if (this.c != a8.b()) {
                return false;
            }
            if (this.d != a8.c()) {
                return false;
            }
            if (this.a.getTextSize() != a8.e().getTextSize()) {
                return false;
            }
            if (this.a.getTextScaleX() != a8.e().getTextScaleX()) {
                return false;
            }
            if (this.a.getTextSkewX() != a8.e().getTextSkewX()) {
                return false;
            }
            if (this.a.getLetterSpacing() != a8.e().getLetterSpacing()) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.a.getFontFeatureSettings(), (CharSequence)a8.e().getFontFeatureSettings())) {
                return false;
            }
            if (this.a.getFlags() != a8.e().getFlags()) {
                return false;
            }
            if (n8 >= 24 ? !E.j.a(G.a.a(this.a), (Object)G.a.a(a8.e())) : !this.a.getTextLocale().equals((Object)a8.e().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null ? a8.e().getTypeface() != null : !this.a.getTypeface().equals((Object)a8.e().getTypeface())) {
                return false;
            }
            return true;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof G.l$a)) {
                return false;
            }
            if (!this.a((G.l$a)(object = (G.l$a)object))) {
                return false;
            }
            if (this.b != object.d()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return H.c.b(new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), Float.valueOf((float)this.a.getLetterSpacing()), this.a.getFlags(), G.a.a(this.a), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d});
            }
            return H.c.b(new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), Float.valueOf((float)this.a.getLetterSpacing()), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d});
        }

        /*
         * Enabled aggressive block sorting
         */
        public String toString() {
            LocaleList localeList;
            StringBuilder stringBuilder = new StringBuilder("{");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("textSize=");
            stringBuilder2.append(this.a.getTextSize());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", textScaleX=");
            stringBuilder2.append(this.a.getTextScaleX());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", textSkewX=");
            stringBuilder2.append(this.a.getTextSkewX());
            stringBuilder.append(stringBuilder2.toString());
            int n8 = Build.VERSION.SDK_INT;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", letterSpacing=");
            stringBuilder2.append(this.a.getLetterSpacing());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", elegantTextHeight=");
            stringBuilder2.append(this.a.isElegantTextHeight());
            stringBuilder.append(stringBuilder2.toString());
            if (n8 >= 24) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", textLocale=");
                localeList = G.a.a(this.a);
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", textLocale=");
                localeList = this.a.getTextLocale();
            }
            stringBuilder2.append((Object)localeList);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", typeface=");
            stringBuilder2.append((Object)this.a.getTypeface());
            stringBuilder.append(stringBuilder2.toString());
            if (n8 >= 26) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", variationSettings=");
                stringBuilder2.append(c.a(this.a));
                stringBuilder.append(stringBuilder2.toString());
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", textDir=");
            stringBuilder2.append((Object)this.b);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", breakStrategy=");
            stringBuilder2.append(this.c);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", hyphenationFrequency=");
            stringBuilder2.append(this.d);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public static class a {
            public final TextPaint a;
            public TextDirectionHeuristic b;
            public int c;
            public int d;

            public a(TextPaint textPaint) {
                this.a = textPaint;
                this.c = 1;
                this.d = 1;
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public G.l$a a() {
                return new G.l$a(this.a, this.b, this.c, this.d);
            }

            public a b(int n8) {
                this.c = n8;
                return this;
            }

            public a c(int n8) {
                this.d = n8;
                return this;
            }

            public a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

    }

}

