package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.j f1357a;

    public j(RecyclerView.j jVar) {
        new Rect();
        this.f1357a = jVar;
    }

    public static j a(RecyclerView.j jVar, int i10) {
        if (i10 == 0) {
            return new h(jVar);
        }
        if (i10 == 1) {
            return new i(jVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();
}
