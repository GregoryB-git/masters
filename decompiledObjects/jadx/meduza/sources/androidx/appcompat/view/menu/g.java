package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a, reason: collision with root package name */
    public f f688a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.b f689b;

    /* renamed from: c, reason: collision with root package name */
    public d f690c;

    public g(f fVar) {
        this.f688a = fVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void b(f fVar, boolean z10) {
        androidx.appcompat.app.b bVar;
        if ((z10 || fVar == this.f688a) && (bVar = this.f689b) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean c(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        f fVar = this.f688a;
        d dVar = this.f690c;
        if (dVar.f == null) {
            dVar.f = dVar.new a();
        }
        fVar.q(dVar.f.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f690c.b(this.f688a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f689b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f689b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f688a.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f688a.performShortcut(i10, keyEvent, 0);
    }
}
