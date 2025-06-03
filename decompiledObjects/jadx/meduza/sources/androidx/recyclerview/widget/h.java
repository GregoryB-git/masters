package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h extends j {
    public h(RecyclerView.j jVar) {
        super(jVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final int b(View view) {
        RecyclerView.k kVar = (RecyclerView.k) view.getLayoutParams();
        this.f1357a.getClass();
        return view.getRight() + ((RecyclerView.k) view.getLayoutParams()).f1225a.right + ((ViewGroup.MarginLayoutParams) kVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public final int c(View view) {
        RecyclerView.k kVar = (RecyclerView.k) view.getLayoutParams();
        this.f1357a.getClass();
        return (view.getLeft() - ((RecyclerView.k) view.getLayoutParams()).f1225a.left) - ((ViewGroup.MarginLayoutParams) kVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public final int d() {
        RecyclerView.j jVar = this.f1357a;
        return jVar.f - jVar.u();
    }

    @Override // androidx.recyclerview.widget.j
    public final int e() {
        return this.f1357a.t();
    }

    @Override // androidx.recyclerview.widget.j
    public final int f() {
        RecyclerView.j jVar = this.f1357a;
        return (jVar.f - jVar.t()) - this.f1357a.u();
    }
}
