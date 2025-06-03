package e0;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public a f3751a;

    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(androidx.appcompat.view.menu.m mVar) {
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.f3751a != null) {
            StringBuilder l10 = defpackage.f.l("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            l10.append(getClass().getSimpleName());
            l10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", l10.toString());
        }
        this.f3751a = aVar;
    }
}
