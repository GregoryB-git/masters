package v0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f15190a;

    /* renamed from: b, reason: collision with root package name */
    public a f15191b;

    public static class a extends d.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f15192a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f15193b;

        public a(TextView textView, d dVar) {
            this.f15192a = new WeakReference(textView);
            this.f15193b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.e
        public final void a() {
            boolean z10;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f15192a.get();
            InputFilter inputFilter = (InputFilter) this.f15193b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                if (text == null) {
                    length = 0;
                } else {
                    a10.getClass();
                    length = text.length();
                }
                CharSequence f = a10.f(text, 0, length);
                if (text == f) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(f);
                int selectionEnd = Selection.getSelectionEnd(f);
                textView.setText(f);
                if (f instanceof Spannable) {
                    Spannable spannable = (Spannable) f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f15190a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f15190a.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.d.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f15190a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.d.a().f(charSequence, 0, charSequence.length());
            }
            if (b10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
        if (this.f15191b == null) {
            this.f15191b = new a(this.f15190a, this);
        }
        a10.g(this.f15191b);
        return charSequence;
    }
}
