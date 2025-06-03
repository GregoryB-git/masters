package c0;

import android.annotation.NonNull;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f2207a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f2208b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2209c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2210d;

        public a(PrecomputedText.Params params) {
            this.f2207a = params.getTextPaint();
            this.f2208b = params.getTextDirection();
            this.f2209c = params.getBreakStrategy();
            this.f2210d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public /* synthetic */ Builder(@NonNull TextPaint textPaint2) {
                    }

                    @NonNull
                    public native /* synthetic */ Params build();

                    public native /* synthetic */ Builder setBreakStrategy(int i12);

                    public native /* synthetic */ Builder setHyphenationFrequency(int i12);

                    public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
                }.setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f2207a = textPaint2;
            this.f2208b = textDirectionHeuristic;
            this.f2209c = i10;
            this.f2210d = i11;
        }

        public final boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f2209c != aVar.f2209c || this.f2210d != aVar.f2210d || this.f2207a.getTextSize() != aVar.f2207a.getTextSize() || this.f2207a.getTextScaleX() != aVar.f2207a.getTextScaleX() || this.f2207a.getTextSkewX() != aVar.f2207a.getTextSkewX() || this.f2207a.getLetterSpacing() != aVar.f2207a.getLetterSpacing() || !TextUtils.equals(this.f2207a.getFontFeatureSettings(), aVar.f2207a.getFontFeatureSettings()) || this.f2207a.getFlags() != aVar.f2207a.getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f2207a.getTextLocales().equals(aVar.f2207a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f2207a.getTextLocale().equals(aVar.f2207a.getTextLocale())) {
                return false;
            }
            return this.f2207a.getTypeface() == null ? aVar.f2207a.getTypeface() == null : this.f2207a.getTypeface().equals(aVar.f2207a.getTypeface());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2208b == aVar.f2208b;
        }

        public final int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return Objects.hash(Float.valueOf(this.f2207a.getTextSize()), Float.valueOf(this.f2207a.getTextScaleX()), Float.valueOf(this.f2207a.getTextSkewX()), Float.valueOf(this.f2207a.getLetterSpacing()), Integer.valueOf(this.f2207a.getFlags()), this.f2207a.getTextLocale(), this.f2207a.getTypeface(), Boolean.valueOf(this.f2207a.isElegantTextHeight()), this.f2208b, Integer.valueOf(this.f2209c), Integer.valueOf(this.f2210d));
            }
            textLocales = this.f2207a.getTextLocales();
            return Objects.hash(Float.valueOf(this.f2207a.getTextSize()), Float.valueOf(this.f2207a.getTextScaleX()), Float.valueOf(this.f2207a.getTextSkewX()), Float.valueOf(this.f2207a.getLetterSpacing()), Integer.valueOf(this.f2207a.getFlags()), textLocales, this.f2207a.getTypeface(), Boolean.valueOf(this.f2207a.isElegantTextHeight()), this.f2208b, Integer.valueOf(this.f2209c), Integer.valueOf(this.f2210d));
        }

        public final String toString() {
            StringBuilder l10;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder l11 = f.l("textSize=");
            l11.append(this.f2207a.getTextSize());
            sb2.append(l11.toString());
            sb2.append(", textScaleX=" + this.f2207a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f2207a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder l12 = f.l(", letterSpacing=");
            l12.append(this.f2207a.getLetterSpacing());
            sb2.append(l12.toString());
            sb2.append(", elegantTextHeight=" + this.f2207a.isElegantTextHeight());
            if (i10 >= 24) {
                l10 = f.l(", textLocale=");
                textLocale = this.f2207a.getTextLocales();
            } else {
                l10 = f.l(", textLocale=");
                textLocale = this.f2207a.getTextLocale();
            }
            l10.append(textLocale);
            sb2.append(l10.toString());
            sb2.append(", typeface=" + this.f2207a.getTypeface());
            if (i10 >= 26) {
                StringBuilder l13 = f.l(", variationSettings=");
                fontVariationSettings = this.f2207a.getFontVariationSettings();
                l13.append(fontVariationSettings);
                sb2.append(l13.toString());
            }
            StringBuilder l14 = f.l(", textDir=");
            l14.append(this.f2208b);
            sb2.append(l14.toString());
            sb2.append(", breakStrategy=" + this.f2209c);
            sb2.append(", hyphenationFrequency=" + this.f2210d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        int i12 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i10 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i13 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
