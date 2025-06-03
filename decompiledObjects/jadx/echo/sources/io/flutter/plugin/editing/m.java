package io.flutter.plugin.editing;

import D5.w;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class m extends SpannableStringBuilder {

    /* renamed from: o, reason: collision with root package name */
    public int f15031o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f15032p = 0;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f15033q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f15034r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f15035s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public String f15036t;

    /* renamed from: u, reason: collision with root package name */
    public String f15037u;

    /* renamed from: v, reason: collision with root package name */
    public int f15038v;

    /* renamed from: w, reason: collision with root package name */
    public int f15039w;

    /* renamed from: x, reason: collision with root package name */
    public int f15040x;

    /* renamed from: y, reason: collision with root package name */
    public int f15041y;

    /* renamed from: z, reason: collision with root package name */
    public BaseInputConnection f15042z;

    public class a extends BaseInputConnection {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Editable f15043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z7, Editable editable) {
            super(view, z7);
            this.f15043a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f15043a;
        }
    }

    public interface b {
        void a(boolean z7, boolean z8, boolean z9);
    }

    public m(w.e eVar, View view) {
        this.f15042z = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    public void a(b bVar) {
        ArrayList arrayList;
        if (this.f15032p > 0) {
            AbstractC1995b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f15031o > 0) {
            AbstractC1995b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f15034r;
        } else {
            arrayList = this.f15033q;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f15031o++;
        if (this.f15032p > 0) {
            AbstractC1995b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f15031o != 1 || this.f15033q.isEmpty()) {
            return;
        }
        this.f15037u = toString();
        this.f15038v = i();
        this.f15039w = h();
        this.f15040x = g();
        this.f15041y = f();
    }

    public void c() {
        this.f15035s.clear();
    }

    public void d() {
        int i7 = this.f15031o;
        if (i7 == 0) {
            AbstractC1995b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i7 == 1) {
            Iterator it = this.f15034r.iterator();
            while (it.hasNext()) {
                j((b) it.next(), true, true, true);
            }
            if (!this.f15033q.isEmpty()) {
                AbstractC1995b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f15033q.size()) + " listener(s)");
                k(!toString().equals(this.f15037u), (this.f15038v == i() && this.f15039w == h()) ? false : true, (this.f15040x == g() && this.f15041y == f()) ? false : true);
            }
        }
        this.f15033q.addAll(this.f15034r);
        this.f15034r.clear();
        this.f15031o--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.f15035s);
        this.f15035s.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public final void j(b bVar, boolean z7, boolean z8, boolean z9) {
        this.f15032p++;
        bVar.a(z7, z8, z9);
        this.f15032p--;
    }

    public final void k(boolean z7, boolean z8, boolean z9) {
        if (z7 || z8 || z9) {
            Iterator it = this.f15033q.iterator();
            while (it.hasNext()) {
                j((b) it.next(), z7, z8, z9);
            }
        }
    }

    public void l(b bVar) {
        if (this.f15032p > 0) {
            AbstractC1995b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f15033q.remove(bVar);
        if (this.f15031o > 0) {
            this.f15034r.remove(bVar);
        }
    }

    public void m(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f15042z.setComposingRegion(i7, i8);
        }
    }

    public void n(w.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f1471a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f1472b, eVar.f1473c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f1474d, eVar.f1475e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        super.setSpan(obj, i7, i8, i9);
        this.f15035s.add(new o(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f15036t;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f15036t = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        boolean z7;
        boolean z8;
        if (this.f15032p > 0) {
            AbstractC1995b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String mVar = toString();
        int i11 = i8 - i7;
        boolean z9 = i11 != i10 - i9;
        for (int i12 = 0; i12 < i11 && !z9; i12++) {
            z9 |= charAt(i7 + i12) != charSequence.charAt(i9 + i12);
        }
        if (z9) {
            this.f15036t = null;
        }
        int i13 = i();
        int h7 = h();
        int g7 = g();
        int f7 = f();
        SpannableStringBuilder replace = super.replace(i7, i8, charSequence, i9, i10);
        boolean z10 = z9;
        this.f15035s.add(new o(mVar, i7, i8, charSequence, i(), h(), g(), f()));
        if (this.f15031o > 0) {
            return replace;
        }
        boolean z11 = (i() == i13 && h() == h7) ? false : true;
        if (g() == g7 && f() == f7) {
            z7 = z10;
            z8 = false;
        } else {
            z7 = z10;
            z8 = true;
        }
        k(z7, z11, z8);
        return replace;
    }
}
