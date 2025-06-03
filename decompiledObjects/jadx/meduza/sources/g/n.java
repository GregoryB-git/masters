package g;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import g.r;
import j.a;

/* loaded from: classes.dex */
public class n extends b.l implements d {

    /* renamed from: d, reason: collision with root package name */
    public g f5621d;

    /* renamed from: e, reason: collision with root package name */
    public final m f5622e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968697(0x7f040079, float:1.7546055E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            g.m r2 = new g.m
            r3 = r4
            androidx.appcompat.app.b r3 = (androidx.appcompat.app.b) r3
            r2.<init>()
            r4.f5622e = r2
            g.f r2 = r4.c()
            if (r6 != 0) goto L37
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L37:
            r5 = r2
            g.g r5 = (g.g) r5
            r5.f5559c0 = r6
            r2.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.n.<init>(android.content.Context, int):void");
    }

    @Override // b.l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    public final f c() {
        if (this.f5621d == null) {
            r.a aVar = f.f5545a;
            this.f5621d = new g(getContext(), getWindow(), this, this);
        }
        return this.f5621d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e0.i.b(this.f5622e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) c().e(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().l();
    }

    @Override // b.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().k();
        super.onCreate(bundle);
        c().o();
    }

    @Override // b.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().u();
    }

    @Override // g.d
    public final void onSupportActionModeFinished(j.a aVar) {
    }

    @Override // g.d
    public final void onSupportActionModeStarted(j.a aVar) {
    }

    @Override // g.d
    public final j.a onWindowStartingSupportActionMode(a.InterfaceC0121a interfaceC0121a) {
        return null;
    }

    @Override // b.l, android.app.Dialog
    public final void setContentView(int i10) {
        c().x(i10);
    }

    @Override // b.l, android.app.Dialog
    public final void setContentView(View view) {
        c().y(view);
    }

    @Override // b.l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().z(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        c().C(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().C(charSequence);
    }
}
