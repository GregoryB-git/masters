package f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5277c;

    public a(int i10, b bVar, int i11) {
        this.f5275a = i10;
        this.f5276b = bVar;
        this.f5277c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5275a);
        b bVar = this.f5276b;
        bVar.f5279a.performAction(this.f5277c, bundle);
    }
}
