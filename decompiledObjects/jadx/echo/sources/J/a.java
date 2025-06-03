package J;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2622c;

    public a(int i7, u uVar, int i8) {
        this.f2620a = i7;
        this.f2621b = uVar;
        this.f2622c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2620a);
        this.f2621b.F(this.f2622c, bundle);
    }
}
