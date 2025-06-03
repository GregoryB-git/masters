package t0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class j implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14403a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f14404b;

    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof c0.c;
        }
    }

    public static class b extends a {
        @Override // t0.j.a
        public final boolean a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof c0.c);
        }
    }

    public j(Spannable spannable) {
        this.f14404b = spannable;
    }

    public j(CharSequence charSequence) {
        this.f14404b = new SpannableString(charSequence);
    }

    public final void a() {
        Spannable spannable = this.f14404b;
        if (!this.f14403a) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f14404b = new SpannableString(spannable);
            }
        }
        this.f14403a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f14404b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f14404b.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f14404b.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f14404b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f14404b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f14404b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f14404b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f14404b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f14404b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f14404b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f14404b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f14404b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f14404b.toString();
    }
}
