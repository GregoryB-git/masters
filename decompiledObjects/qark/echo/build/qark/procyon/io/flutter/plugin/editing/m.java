// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.Spannable;
import java.util.Iterator;
import java.util.Collection;
import t5.b;
import android.text.Editable;
import android.view.View;
import D5.w;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;

public class m extends SpannableStringBuilder
{
    public int o;
    public int p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public BaseInputConnection z;
    
    public m(final w.e e, final View view) {
        this.o = 0;
        this.p = 0;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.z = new BaseInputConnection(view, true) {
            public final /* synthetic */ Editable a;
            
            public Editable getEditable() {
                return this.a;
            }
        };
        if (e != null) {
            this.n(e);
        }
    }
    
    public void a(final b e) {
        if (this.p > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("adding a listener ");
            sb.append(e.toString());
            sb.append(" in a listener callback");
            t5.b.b("ListenableEditingState", sb.toString());
        }
        ArrayList list;
        if (this.o > 0) {
            t5.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            list = this.r;
        }
        else {
            list = this.q;
        }
        list.add(e);
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
        final int o = this.o;
        if (o == 0) {
            t5.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (o == 1) {
            final Iterator<b> iterator = (Iterator<b>)this.r.iterator();
            while (iterator.hasNext()) {
                this.j(iterator.next(), true, true, true);
            }
            if (!this.q.isEmpty()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("didFinishBatchEdit with ");
                sb.append(String.valueOf(this.q.size()));
                sb.append(" listener(s)");
                t5.b.f("ListenableEditingState", sb.toString());
                final boolean equals = this.toString().equals(this.u);
                final int v = this.v;
                final int i = this.i();
                boolean b = false;
                final boolean b2 = v != i || this.w != this.h();
                if (this.x != this.g() || this.y != this.f()) {
                    b = true;
                }
                this.k(equals ^ true, b2, b);
            }
        }
        this.q.addAll(this.r);
        this.r.clear();
        --this.o;
    }
    
    public ArrayList e() {
        final ArrayList list = new ArrayList(this.s);
        this.s.clear();
        return list;
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
    
    public final void j(final b b, final boolean b2, final boolean b3, final boolean b4) {
        ++this.p;
        b.a(b2, b3, b4);
        --this.p;
    }
    
    public final void k(final boolean b, final boolean b2, final boolean b3) {
        if (b || b2 || b3) {
            final Iterator<b> iterator = this.q.iterator();
            while (iterator.hasNext()) {
                this.j(iterator.next(), b, b2, b3);
            }
        }
    }
    
    public void l(final b b) {
        if (this.p > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("removing a listener ");
            sb.append(b.toString());
            sb.append(" in a listener callback");
            b.b("ListenableEditingState", sb.toString());
        }
        this.q.remove(b);
        if (this.o > 0) {
            this.r.remove(b);
        }
    }
    
    public void m(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            this.z.setComposingRegion(n, n2);
            return;
        }
        BaseInputConnection.removeComposingSpans((Spannable)this);
    }
    
    public void n(final w.e e) {
        this.b();
        this.replace(0, this.length(), (CharSequence)e.a);
        if (e.c()) {
            Selection.setSelection((Spannable)this, e.b, e.c);
        }
        else {
            Selection.removeSelection((Spannable)this);
        }
        this.m(e.d, e.e);
        this.c();
        this.d();
    }
    
    public SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence, final int n3, final int n4) {
        if (this.p > 0) {
            t5.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        final String string = this.toString();
        final int n5 = n2 - n;
        boolean b = n5 != n4 - n3;
        for (int n6 = 0; n6 < n5 && !b; b |= (this.charAt(n + n6) != charSequence.charAt(n3 + n6)), ++n6) {}
        if (b) {
            this.t = null;
        }
        final int i = this.i();
        final int h = this.h();
        final int g = this.g();
        final int f = this.f();
        final SpannableStringBuilder replace = super.replace(n, n2, charSequence, n3, n4);
        this.s.add(new o(string, n, n2, charSequence, this.i(), this.h(), this.g(), this.f()));
        if (this.o > 0) {
            return replace;
        }
        this.k(b, this.i() != i || this.h() != h, this.g() != g || this.f() != f);
        return replace;
    }
    
    public void setSpan(final Object o, final int n, final int n2, final int n3) {
        super.setSpan(o, n, n2, n3);
        this.s.add(new o(this.toString(), this.i(), this.h(), this.g(), this.f()));
    }
    
    public String toString() {
        final String t = this.t;
        if (t != null) {
            return t;
        }
        return this.t = super.toString();
    }
    
    public interface b
    {
        void a(final boolean p0, final boolean p1, final boolean p2);
    }
}
