package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public int f1152p;

    /* renamed from: q, reason: collision with root package name */
    public a f1153q;

    public static final class a extends c {
    }

    public static class b extends RecyclerView.k {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f1154a = new SparseIntArray();

        public c() {
            new SparseIntArray();
        }

        public static int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f1154a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f1152p = -1;
        new SparseIntArray();
        new SparseIntArray();
        this.f1153q = new a();
        new Rect();
        int i12 = RecyclerView.j.x(context, attributeSet, i10, i11).f1222b;
        if (i12 == this.f1152p) {
            return;
        }
        if (i12 < 1) {
            throw new IllegalArgumentException(defpackage.f.h("Span count should be at least 1. Provided ", i12));
        }
        this.f1152p = i12;
        this.f1153q.b();
        I();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.R(false);
    }

    public final int S(int i10, RecyclerView.p pVar, RecyclerView.s sVar) {
        if (!sVar.f1243d) {
            a aVar = this.f1153q;
            int i11 = this.f1152p;
            aVar.getClass();
            return c.a(i10, i11);
        }
        int a10 = pVar.a(i10);
        if (a10 != -1) {
            a aVar2 = this.f1153q;
            int i12 = this.f1152p;
            aVar2.getClass();
            return c.a(a10, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean d(RecyclerView.k kVar) {
        return kVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.j
    public final void g(RecyclerView.s sVar) {
        L(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.j
    public final int h(RecyclerView.s sVar) {
        return M(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.j
    public final void j(RecyclerView.s sVar) {
        L(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.j
    public final int k(RecyclerView.s sVar) {
        return M(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.j
    public final RecyclerView.k l() {
        return this.f1155h == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final RecyclerView.k m(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final RecyclerView.k n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int q(RecyclerView.p pVar, RecyclerView.s sVar) {
        if (this.f1155h == 1) {
            return this.f1152p;
        }
        if (sVar.a() < 1) {
            return 0;
        }
        return S(sVar.a() - 1, pVar, sVar) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int y(RecyclerView.p pVar, RecyclerView.s sVar) {
        if (this.f1155h == 0) {
            return this.f1152p;
        }
        if (sVar.a() < 1) {
            return 0;
        }
        return S(sVar.a() - 1, pVar, sVar) + 1;
    }
}
