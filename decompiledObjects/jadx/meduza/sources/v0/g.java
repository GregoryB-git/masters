package v0;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f15201a;

    /* renamed from: c, reason: collision with root package name */
    public a f15203c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15202b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15204d = true;

    public static class a extends d.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f15205a;

        public a(EditText editText) {
            this.f15205a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public final void a() {
            g.a((EditText) this.f15205a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f15201a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if ((androidx.emoji2.text.d.f978j != null) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            android.widget.EditText r0 = r3.f15201a
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L56
            boolean r0 = r3.f15204d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            boolean r0 = r3.f15202b
            if (r0 != 0) goto L1c
            androidx.emoji2.text.d r0 = androidx.emoji2.text.d.f978j
            if (r0 == 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 == 0) goto L1f
            goto L56
        L1f:
            if (r6 > r7) goto L56
            boolean r6 = r4 instanceof android.text.Spannable
            if (r6 == 0) goto L56
            androidx.emoji2.text.d r6 = androidx.emoji2.text.d.a()
            int r6 = r6.b()
            if (r6 == 0) goto L40
            if (r6 == r2) goto L35
            r4 = 3
            if (r6 == r4) goto L40
            goto L56
        L35:
            android.text.Spannable r4 = (android.text.Spannable) r4
            androidx.emoji2.text.d r6 = androidx.emoji2.text.d.a()
            int r7 = r7 + r5
            r6.f(r4, r5, r7)
            goto L56
        L40:
            androidx.emoji2.text.d r4 = androidx.emoji2.text.d.a()
            v0.g$a r5 = r3.f15203c
            if (r5 != 0) goto L51
            v0.g$a r5 = new v0.g$a
            android.widget.EditText r6 = r3.f15201a
            r5.<init>(r6)
            r3.f15203c = r5
        L51:
            v0.g$a r5 = r3.f15203c
            r4.g(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
