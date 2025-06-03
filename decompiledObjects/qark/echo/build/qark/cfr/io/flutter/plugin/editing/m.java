/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.view.View
 *  android.view.inputmethod.BaseInputConnection
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 */
package io.flutter.plugin.editing;

import D5.w;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.plugin.editing.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class m
extends SpannableStringBuilder {
    public int o = 0;
    public int p = 0;
    public ArrayList q = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public BaseInputConnection z;

    public m(w.e e8, View view) {
        this.z = new BaseInputConnection(view, true, (Editable)this){
            public final /* synthetic */ Editable a;
            {
                this.a = editable;
                super(view, bl);
            }

            public Editable getEditable() {
                return this.a;
            }
        };
        if (e8 != null) {
            this.n(e8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(b b8) {
        StringBuilder stringBuilder;
        if (this.p > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("adding a listener ");
            stringBuilder.append(b8.toString());
            stringBuilder.append(" in a listener callback");
            t5.b.b("ListenableEditingState", stringBuilder.toString());
        }
        if (this.o > 0) {
            t5.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            stringBuilder = this.r;
        } else {
            stringBuilder = this.q;
        }
        stringBuilder.add((Object)b8);
    }

    public void b() {
        ++this.o;
        if (this.p > 0) {
            t5.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.o == 1 && !this.q.isEmpty()) {
            this.u = this.toString();
            this.v = this.i();
            this.w = this.h();
            this.x = this.g();
            this.y = this.f();
        }
    }

    public void c() {
        this.s.clear();
    }

    public void d() {
        int n8 = this.o;
        if (n8 == 0) {
            t5.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (n8 == 1) {
            Iterator iterator = this.r.iterator();
            while (iterator.hasNext()) {
                this.j((b)iterator.next(), true, true, true);
            }
            if (!this.q.isEmpty()) {
                iterator = new StringBuilder();
                iterator.append("didFinishBatchEdit with ");
                iterator.append(String.valueOf((int)this.q.size()));
                iterator.append(" listener(s)");
                t5.b.f("ListenableEditingState", iterator.toString());
                boolean bl = this.toString().equals((Object)this.u);
                n8 = this.v;
                int n9 = this.i();
                boolean bl2 = false;
                boolean bl3 = n8 != n9 || this.w != this.h();
                if (this.x != this.g() || this.y != this.f()) {
                    bl2 = true;
                }
                this.k(bl ^ true, bl3, bl2);
            }
        }
        this.q.addAll((Collection)this.r);
        this.r.clear();
        --this.o;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList((Collection)this.s);
        this.s.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd((Spannable)this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart((Spannable)this);
    }

    public final int h() {
        return Selection.getSelectionEnd((CharSequence)this);
    }

    public final int i() {
        return Selection.getSelectionStart((CharSequence)this);
    }

    public final void j(b b8, boolean bl, boolean bl2, boolean bl3) {
        ++this.p;
        b8.a(bl, bl2, bl3);
        --this.p;
    }

    public final void k(boolean bl, boolean bl2, boolean bl3) {
        if (bl || bl2 || bl3) {
            Iterator iterator = this.q.iterator();
            while (iterator.hasNext()) {
                this.j((b)iterator.next(), bl, bl2, bl3);
            }
        }
    }

    public void l(b b8) {
        if (this.p > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("removing a listener ");
            stringBuilder.append(b8.toString());
            stringBuilder.append(" in a listener callback");
            t5.b.b("ListenableEditingState", stringBuilder.toString());
        }
        this.q.remove((Object)b8);
        if (this.o > 0) {
            this.r.remove((Object)b8);
        }
    }

    public void m(int n8, int n9) {
        if (n8 >= 0 && n8 < n9) {
            this.z.setComposingRegion(n8, n9);
            return;
        }
        BaseInputConnection.removeComposingSpans((Spannable)this);
    }

    public void n(w.e e8) {
        this.b();
        this.replace(0, this.length(), (CharSequence)e8.a);
        if (e8.c()) {
            Selection.setSelection((Spannable)this, (int)e8.b, (int)e8.c);
        } else {
            Selection.removeSelection((Spannable)this);
        }
        this.m(e8.d, e8.e);
        this.c();
        this.d();
    }

    public SpannableStringBuilder replace(int n8, int n9, CharSequence charSequence, int n10, int n11) {
        int n12;
        int n13;
        if (this.p > 0) {
            t5.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string2 = this.toString();
        int n14 = n9 - n8;
        boolean bl = n14 != n11 - n10;
        for (n12 = 0; n12 < n14 && !bl; bl |= n13, ++n12) {
            n13 = this.charAt(n8 + n12) != charSequence.charAt(n10 + n12) ? 1 : 0;
        }
        if (bl) {
            this.t = null;
        }
        n12 = this.i();
        n13 = this.h();
        n14 = this.g();
        int n15 = this.f();
        SpannableStringBuilder spannableStringBuilder = super.replace(n8, n9, charSequence, n10, n11);
        this.s.add((Object)new o(string2, n8, n9, charSequence, this.i(), this.h(), this.g(), this.f()));
        if (this.o > 0) {
            return spannableStringBuilder;
        }
        boolean bl2 = this.i() != n12 || this.h() != n13;
        boolean bl3 = this.g() != n14 || this.f() != n15;
        this.k(bl, bl2, bl3);
        return spannableStringBuilder;
    }

    public void setSpan(Object object, int n8, int n9, int n10) {
        super.setSpan(object, n8, n9, n10);
        this.s.add((Object)new o(this.toString(), this.i(), this.h(), this.g(), this.f()));
    }

    public String toString() {
        String string2 = this.t;
        if (string2 != null) {
            return string2;
        }
        this.t = string2 = super.toString();
        return string2;
    }

    public static interface b {
        public void a(boolean var1, boolean var2, boolean var3);
    }

}

