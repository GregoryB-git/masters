package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import b.a0;
import g.r;
import io.meduza.meduza.R;
import j.a;
import l.e1;
import s1.c;
import u.b0;

/* loaded from: classes.dex */
public class c extends x0.m implements d, b0.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private f mDelegate;
    private Resources mResources;

    public class a implements c.b {
        public a() {
        }

        @Override // s1.c.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            c.this.getDelegate().s();
            return bundle;
        }
    }

    public class b implements c.b {
        public b() {
        }

        @Override // c.b
        public final void a(Context context) {
            f delegate = c.this.getDelegate();
            delegate.k();
            c.this.getSavedStateRegistry().a(c.DELEGATE_TAG);
            delegate.o();
        }
    }

    public c() {
        initDelegate();
    }

    public c(int i10) {
        super(i10);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        a0.G(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        ec.i.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        a0.H(getWindow().getDecorView(), this);
        a0.F(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // b.j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        g.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // u.j, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        g.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.l(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().e(i10);
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            r.a aVar = f.f5545a;
            this.mDelegate = new g(this, null, this, this);
        }
        return this.mDelegate;
    }

    public g.b getDrawerToggleDelegate() {
        return getDelegate().g();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().i();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = e1.f9332a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public g.a getSupportActionBar() {
        return getDelegate().j();
    }

    @Override // u.b0.a
    public Intent getSupportParentActivityIntent() {
        return u.m.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().l();
    }

    @Override // b.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().n(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(b0 b0Var) {
        Intent makeMainActivity;
        b0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = u.m.a(this);
        }
        if (supportParentActivityIntent == null) {
            return;
        }
        ComponentName component = supportParentActivityIntent.getComponent();
        if (component == null) {
            component = supportParentActivityIntent.resolveActivity(b0Var.f14787b.getPackageManager());
        }
        int size = b0Var.f14786a.size();
        try {
            Context context = b0Var.f14787b;
            while (true) {
                String b10 = u.m.b(context, component);
                if (b10 == null) {
                    makeMainActivity = null;
                } else {
                    ComponentName componentName = new ComponentName(component.getPackageName(), b10);
                    makeMainActivity = u.m.b(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                }
                if (makeMainActivity == null) {
                    b0Var.f14786a.add(supportParentActivityIntent);
                    return;
                } else {
                    b0Var.f14786a.add(size, makeMainActivity);
                    context = b0Var.f14787b;
                    component = makeMainActivity.getComponent();
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // x0.m, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().p();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onLocalesChanged(a0.i iVar) {
    }

    @Override // x0.m, b.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        g.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onNightModeChanged(int i10) {
    }

    @Override // b.j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().q();
    }

    @Override // x0.m, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().r();
    }

    public void onPrepareSupportNavigateUpTaskStack(b0 b0Var) {
    }

    @Override // x0.m, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().t();
    }

    @Override // x0.m, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().u();
    }

    @Override // g.d
    public void onSupportActionModeFinished(j.a aVar) {
    }

    @Override // g.d
    public void onSupportActionModeStarted(j.a aVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        b0 b0Var = new b0(this);
        onCreateSupportNavigateUpTaskStack(b0Var);
        onPrepareSupportNavigateUpTaskStack(b0Var);
        if (b0Var.f14786a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) b0Var.f14786a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!v.a.startActivities(b0Var.f14787b, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            b0Var.f14787b.startActivity(intent);
        }
        try {
            int i10 = u.b.f14784a;
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().C(charSequence);
    }

    @Override // g.d
    public j.a onWindowStartingSupportActionMode(a.InterfaceC0121a interfaceC0121a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        g.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.m()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // b.j, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().x(i10);
    }

    @Override // b.j, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().y(view);
    }

    @Override // b.j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().z(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().A(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().B(i10);
    }

    public j.a startSupportActionMode(a.InterfaceC0121a interfaceC0121a) {
        return getDelegate().D(interfaceC0121a);
    }

    @Override // x0.m
    public void supportInvalidateOptionsMenu() {
        getDelegate().l();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().w(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }
}
