package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i extends j {
    public i(RecyclerView.j jVar) {
        super(jVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final int b(View view) {
        RecyclerView.k kVar = (RecyclerView.k) view.getLayoutParams();
        this.f1357a.getClass();
        return view.getBottom() + ((RecyclerView.k) view.getLayoutParams()).f1225a.bottom + ((ViewGroup.MarginLayoutParams) kVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public final int c(View view) {
        RecyclerView.k kVar = (RecyclerView.k) view.getLayoutParams();
        this.f1357a.getClass();
        return (view.getTop() - ((RecyclerView.k) view.getLayoutParams()).f1225a.top) - ((ViewGroup.MarginLayoutParams) kVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public final int d() {
        RecyclerView.j jVar = this.f1357a;
        return jVar.f1218g - jVar.s();
    }

    @Override // androidx.recyclerview.widget.j
    public final int e() {
        return this.f1357a.v();
    }

    @Override // androidx.recyclerview.widget.j
    public final int f() {
        RecyclerView.j jVar = this.f1357a;
        return (jVar.f1218g - jVar.v()) - this.f1357a.s();
    }
}
