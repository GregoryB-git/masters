package g;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import b.a0;
import j.a.a;
import java.util.ArrayList;
import l.e1;
import u.b0;
import u.b0.a;

public class c
  extends x0.m
  implements d, b0.a
{
  private static final String DELEGATE_TAG = "androidx:appcompat";
  private f mDelegate;
  private Resources mResources;
  
  public c()
  {
    initDelegate();
  }
  
  public c(int paramInt)
  {
    super(paramInt);
    initDelegate();
  }
  
  private void initDelegate()
  {
    getSavedStateRegistry().c("androidx:appcompat", new a());
    addOnContextAvailableListener(new b());
  }
  
  private void initViewTreeOwners()
  {
    a0.G(getWindow().getDecorView(), this);
    View localView = getWindow().getDecorView();
    ec.i.e(localView, "<this>");
    localView.setTag(2131362065, this);
    a0.H(getWindow().getDecorView(), this);
    a0.F(getWindow().getDecorView(), this);
  }
  
  private boolean performMenuItemShortcut(KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 26) && (!paramKeyEvent.isCtrlPressed()) && (!KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState())) && (paramKeyEvent.getRepeatCount() == 0) && (!KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())))
    {
      Window localWindow = getWindow();
      if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))) {
        return true;
      }
    }
    return false;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initViewTreeOwners();
    getDelegate().c(paramView, paramLayoutParams);
  }
  
  public void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(getDelegate().d(paramContext));
  }
  
  public void closeOptionsMenu()
  {
    a locala = getSupportActionBar();
    if ((getWindow().hasFeature(0)) && ((locala == null) || (!locala.a()))) {
      super.closeOptionsMenu();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    a locala = getSupportActionBar();
    if ((i == 82) && (locala != null) && (locala.l(paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt)
  {
    return getDelegate().e(paramInt);
  }
  
  public f getDelegate()
  {
    if (mDelegate == null)
    {
      r.a locala = f.a;
      mDelegate = new g(this, null, this, this);
    }
    return mDelegate;
  }
  
  public b getDrawerToggleDelegate()
  {
    return getDelegate().g();
  }
  
  public MenuInflater getMenuInflater()
  {
    return getDelegate().i();
  }
  
  public Resources getResources()
  {
    Resources localResources1 = mResources;
    if (localResources1 == null) {
      int i = e1.a;
    }
    Resources localResources2 = localResources1;
    if (localResources1 == null) {
      localResources2 = super.getResources();
    }
    return localResources2;
  }
  
  public a getSupportActionBar()
  {
    return getDelegate().j();
  }
  
  public Intent getSupportParentActivityIntent()
  {
    return u.m.a(this);
  }
  
  public void invalidateOptionsMenu()
  {
    getDelegate().l();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    getDelegate().n(paramConfiguration);
    if (mResources != null)
    {
      paramConfiguration = super.getResources().getConfiguration();
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      mResources.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged()
  {
    onSupportContentChanged();
  }
  
  public void onCreateSupportNavigateUpTaskStack(b0 paramb0)
  {
    paramb0.getClass();
    Object localObject1 = getSupportParentActivityIntent();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = u.m.a(this);
    }
    if (localObject2 != null)
    {
      Object localObject3 = ((Intent)localObject2).getComponent();
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = ((Intent)localObject2).resolveActivity(b.getPackageManager());
      }
      int i = a.size();
      try
      {
        localObject3 = b;
        for (;;)
        {
          String str = u.m.b((Context)localObject3, (ComponentName)localObject1);
          if (str == null)
          {
            localObject1 = null;
          }
          else
          {
            ComponentName localComponentName = new android/content/ComponentName;
            localComponentName.<init>(((ComponentName)localObject1).getPackageName(), str);
            if (u.m.b((Context)localObject3, localComponentName) == null)
            {
              localObject1 = Intent.makeMainActivity(localComponentName);
            }
            else
            {
              localObject1 = new android/content/Intent;
              ((Intent)localObject1).<init>();
              localObject1 = ((Intent)localObject1).setComponent(localComponentName);
            }
          }
          if (localObject1 == null) {
            break;
          }
          a.add(i, localObject1);
          localObject3 = b;
          localObject1 = ((Intent)localObject1).getComponent();
        }
        a.add(localObject2);
      }
      catch (PackageManager.NameNotFoundException paramb0)
      {
        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
        throw new IllegalArgumentException(paramb0);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    getDelegate().p();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (performMenuItemShortcut(paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLocalesChanged(a0.i parami) {}
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    a locala = getSupportActionBar();
    if ((paramMenuItem.getItemId() == 16908332) && (locala != null) && ((locala.d() & 0x4) != 0)) {
      return onSupportNavigateUp();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onNightModeChanged(int paramInt) {}
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    getDelegate().q();
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    getDelegate().r();
  }
  
  public void onPrepareSupportNavigateUpTaskStack(b0 paramb0) {}
  
  public void onStart()
  {
    super.onStart();
    getDelegate().t();
  }
  
  public void onStop()
  {
    super.onStop();
    getDelegate().u();
  }
  
  public void onSupportActionModeFinished(j.a parama) {}
  
  public void onSupportActionModeStarted(j.a parama) {}
  
  @Deprecated
  public void onSupportContentChanged() {}
  
  public boolean onSupportNavigateUp()
  {
    Object localObject1 = getSupportParentActivityIntent();
    if (localObject1 != null)
    {
      if (supportShouldUpRecreateTask((Intent)localObject1))
      {
        localObject1 = new b0(this);
        onCreateSupportNavigateUpTaskStack((b0)localObject1);
        onPrepareSupportNavigateUpTaskStack((b0)localObject1);
        if (!a.isEmpty())
        {
          Object localObject2 = (Intent[])a.toArray(new Intent[0]);
          localObject2[0] = new Intent(localObject2[0]).addFlags(268484608);
          if (!v.a.startActivities(b, (Intent[])localObject2, null))
          {
            localObject2 = new Intent(localObject2[(localObject2.length - 1)]);
            ((Intent)localObject2).addFlags(268435456);
            b.startActivity((Intent)localObject2);
          }
          try
          {
            int i = u.b.a;
            finishAffinity();
          }
          catch (IllegalStateException localIllegalStateException)
          {
            finish();
          }
        }
        else
        {
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
      }
      else
      {
        supportNavigateUpTo(localIllegalStateException);
      }
      return true;
    }
    return false;
  }
  
  public void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    getDelegate().C(paramCharSequence);
  }
  
  public j.a onWindowStartingSupportActionMode(a.a parama)
  {
    return null;
  }
  
  public void openOptionsMenu()
  {
    a locala = getSupportActionBar();
    if ((getWindow().hasFeature(0)) && ((locala == null) || (!locala.m()))) {
      super.openOptionsMenu();
    }
  }
  
  public void setContentView(int paramInt)
  {
    initViewTreeOwners();
    getDelegate().x(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    initViewTreeOwners();
    getDelegate().y(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initViewTreeOwners();
    getDelegate().z(paramView, paramLayoutParams);
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    getDelegate().A(paramToolbar);
  }
  
  @Deprecated
  public void setSupportProgress(int paramInt) {}
  
  @Deprecated
  public void setSupportProgressBarIndeterminate(boolean paramBoolean) {}
  
  @Deprecated
  public void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean) {}
  
  @Deprecated
  public void setSupportProgressBarVisibility(boolean paramBoolean) {}
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    getDelegate().B(paramInt);
  }
  
  public j.a startSupportActionMode(a.a parama)
  {
    return getDelegate().D(parama);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    getDelegate().l();
  }
  
  public void supportNavigateUpTo(Intent paramIntent)
  {
    navigateUpTo(paramIntent);
  }
  
  public boolean supportRequestWindowFeature(int paramInt)
  {
    return getDelegate().w(paramInt);
  }
  
  public boolean supportShouldUpRecreateTask(Intent paramIntent)
  {
    return shouldUpRecreateTask(paramIntent);
  }
  
  public final class a
    implements s1.c.b
  {
    public a() {}
    
    public final Bundle a()
    {
      Bundle localBundle = new Bundle();
      getDelegate().s();
      return localBundle;
    }
  }
  
  public final class b
    implements c.b
  {
    public b() {}
    
    public final void a(Context paramContext)
    {
      paramContext = getDelegate();
      paramContext.k();
      getSavedStateRegistry().a("androidx:appcompat");
      paramContext.o();
    }
  }
}

/* Location:
 * Qualified Name:     g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */