package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: o, reason: collision with root package name */
    public Context f8390o;

    /* renamed from: p, reason: collision with root package name */
    public Context f8391p;

    /* renamed from: q, reason: collision with root package name */
    public d f8392q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f8393r;

    /* renamed from: s, reason: collision with root package name */
    public LayoutInflater f8394s;

    /* renamed from: t, reason: collision with root package name */
    public g.a f8395t;

    /* renamed from: u, reason: collision with root package name */
    public int f8396u;

    /* renamed from: v, reason: collision with root package name */
    public int f8397v;

    /* renamed from: w, reason: collision with root package name */
    public h f8398w;

    public a(Context context, int i7, int i8) {
        this.f8390o = context;
        this.f8393r = LayoutInflater.from(context);
        this.f8396u = i7;
        this.f8397v = i8;
    }

    public void a(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f8398w).addView(view, i7);
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z7) {
        g.a aVar = this.f8395t;
        if (aVar != null) {
            aVar.b(dVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void c(Context context, d dVar) {
        this.f8391p = context;
        this.f8394s = LayoutInflater.from(context);
        this.f8392q = dVar;
    }

    public abstract void d(e eVar, h.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.d] */
    @Override // androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        g.a aVar = this.f8395t;
        j jVar2 = jVar;
        if (aVar == null) {
            return false;
        }
        if (jVar == null) {
            jVar2 = this.f8392q;
        }
        return aVar.c(jVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.g
    public void f(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) this.f8398w;
        if (viewGroup == null) {
            return;
        }
        d dVar = this.f8392q;
        int i7 = 0;
        if (dVar != null) {
            dVar.q();
            ArrayList A7 = this.f8392q.A();
            int size = A7.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                e eVar = (e) A7.get(i9);
                if (o(i8, eVar)) {
                    View childAt = viewGroup.getChildAt(i8);
                    e itemData = childAt instanceof h.a ? ((h.a) childAt).getItemData() : null;
                    View n7 = n(eVar, childAt, viewGroup);
                    if (eVar != itemData) {
                        n7.setPressed(false);
                        n7.jumpDrawablesToCurrentState();
                    }
                    if (n7 != childAt) {
                        a(n7, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i7)) {
                i7++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean h(d dVar, e eVar) {
        return false;
    }

    public h.a i(ViewGroup viewGroup) {
        return (h.a) this.f8393r.inflate(this.f8397v, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean j(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(g.a aVar) {
        this.f8395t = aVar;
    }

    public boolean l(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    public g.a m() {
        return this.f8395t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(e eVar, View view, ViewGroup viewGroup) {
        h.a i7 = view instanceof h.a ? (h.a) view : i(viewGroup);
        d(eVar, i7);
        return (View) i7;
    }

    public abstract boolean o(int i7, e eVar);
}
