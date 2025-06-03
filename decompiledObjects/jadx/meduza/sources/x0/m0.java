package x0;

import android.view.View;
import e0.d0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16713e;

    public m0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f16709a = i10;
        this.f16710b = arrayList;
        this.f16711c = arrayList2;
        this.f16712d = arrayList3;
        this.f16713e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f16709a; i10++) {
            View view = (View) this.f16710b.get(i10);
            String str = (String) this.f16711c.get(i10);
            WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
            d0.d.v(view, str);
            d0.d.v((View) this.f16712d.get(i10), (String) this.f16713e.get(i10));
        }
    }
}
