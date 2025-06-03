package l;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class a1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f9262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.d f9263b;

    public a1(androidx.appcompat.widget.d dVar) {
        this.f9263b = dVar;
        this.f9262a = new k.a(dVar.f912a.getContext(), dVar.f919i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.d dVar = this.f9263b;
        Window.Callback callback = dVar.f922l;
        if (callback == null || !dVar.f923m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f9262a);
    }
}
