package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;

/* loaded from: classes.dex */
public final class k implements b.InterfaceC0019b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1358a;

    public k(RecyclerView recyclerView) {
        this.f1358a = recyclerView;
    }

    public final int a() {
        return this.f1358a.getChildCount();
    }

    public final void b(int i10) {
        View childAt = this.f1358a.getChildAt(i10);
        if (childAt != null) {
            this.f1358a.getClass();
            RecyclerView.p(childAt);
            childAt.clearAnimation();
        }
        this.f1358a.removeViewAt(i10);
    }
}
