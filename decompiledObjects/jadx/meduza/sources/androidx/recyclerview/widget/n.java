package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class n {
    public static int a(RecyclerView.s sVar, j jVar, View view, View view2, RecyclerView.j jVar2, boolean z10) {
        if (jVar2.p() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z10) {
            return Math.min(jVar.f(), jVar.b(view2) - jVar.c(view));
        }
        RecyclerView.j.w(view);
        throw null;
    }

    public static int b(RecyclerView.s sVar, j jVar, View view, View view2, RecyclerView.j jVar2, boolean z10) {
        if (jVar2.p() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return sVar.a();
        }
        jVar.b(view2);
        jVar.c(view);
        RecyclerView.j.w(view);
        throw null;
    }
}
