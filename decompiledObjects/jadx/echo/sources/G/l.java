package G;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class l implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f1992a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f1993b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1994c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1995d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f1996e;

        /* renamed from: G.l$a$a, reason: collision with other inner class name */
        public static class C0032a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f1997a;

            /* renamed from: c, reason: collision with root package name */
            public int f1999c = 1;

            /* renamed from: d, reason: collision with root package name */
            public int f2000d = 1;

            /* renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f1998b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0032a(TextPaint textPaint) {
                this.f1997a = textPaint;
            }

            public a a() {
                return new a(this.f1997a, this.f1998b, this.f1999c, this.f2000d);
            }

            public C0032a b(int i7) {
                this.f1999c = i7;
                return this;
            }

            public C0032a c(int i7) {
                this.f2000d = i7;
                return this;
            }

            public C0032a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1998b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f1992a = textPaint;
            textDirection = params.getTextDirection();
            this.f1993b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f1994c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f1995d = hyphenationFrequency;
            this.f1996e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i7 = Build.VERSION.SDK_INT;
            if (this.f1994c != aVar.b() || this.f1995d != aVar.c() || this.f1992a.getTextSize() != aVar.e().getTextSize() || this.f1992a.getTextScaleX() != aVar.e().getTextScaleX() || this.f1992a.getTextSkewX() != aVar.e().getTextSkewX() || this.f1992a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f1992a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f1992a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i7 >= 24) {
                textLocales = this.f1992a.getTextLocales();
                textLocales2 = aVar.e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f1992a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f1992a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f1992a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f1994c;
        }

        public int c() {
            return this.f1995d;
        }

        public TextDirectionHeuristic d() {
            return this.f1993b;
        }

        public TextPaint e() {
            return this.f1992a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f1993b == aVar.d();
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return H.c.b(Float.valueOf(this.f1992a.getTextSize()), Float.valueOf(this.f1992a.getTextScaleX()), Float.valueOf(this.f1992a.getTextSkewX()), Float.valueOf(this.f1992a.getLetterSpacing()), Integer.valueOf(this.f1992a.getFlags()), this.f1992a.getTextLocale(), this.f1992a.getTypeface(), Boolean.valueOf(this.f1992a.isElegantTextHeight()), this.f1993b, Integer.valueOf(this.f1994c), Integer.valueOf(this.f1995d));
            }
            Float valueOf = Float.valueOf(this.f1992a.getTextSize());
            Float valueOf2 = Float.valueOf(this.f1992a.getTextScaleX());
            Float valueOf3 = Float.valueOf(this.f1992a.getTextSkewX());
            Float valueOf4 = Float.valueOf(this.f1992a.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(this.f1992a.getFlags());
            textLocales = this.f1992a.getTextLocales();
            return H.c.b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, this.f1992a.getTypeface(), Boolean.valueOf(this.f1992a.isElegantTextHeight()), this.f1993b, Integer.valueOf(this.f1994c), Integer.valueOf(this.f1995d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f1992a.getTextSize());
            sb2.append(", textScaleX=" + this.f1992a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f1992a.getTextSkewX());
            int i7 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f1992a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f1992a.isElegantTextHeight());
            if (i7 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f1992a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f1992a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f1992a.getTypeface());
            if (i7 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f1992a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f1993b);
            sb2.append(", breakStrategy=" + this.f1994c);
            sb2.append(", hyphenationFrequency=" + this.f1995d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            PrecomputedText.Params params;
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = b.a(textPaint).setBreakStrategy(i7);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                params = textDirection.build();
            } else {
                params = null;
            }
            this.f1996e = params;
            this.f1992a = textPaint;
            this.f1993b = textDirectionHeuristic;
            this.f1994c = i7;
            this.f1995d = i8;
        }
    }
}
