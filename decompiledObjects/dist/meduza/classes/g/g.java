package g;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.view.menu.j.a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import b.a0;
import b1.k.b;
import e0.d0;
import e0.d0.c;
import e0.d0.d;
import e0.i.a;
import e0.o0;
import j.a.a;
import j.e.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import l.f1;
import l.g0;
import u.m;

public final class g
  extends f
  implements f.a, LayoutInflater.Factory2
{
  public static final r.h<String, Integer> q0 = new r.h();
  public static final int[] r0 = { 16842836 };
  public static final boolean s0 = "robolectric".equals(Build.FINGERPRINT) ^ true;
  public static final boolean t0 = true;
  public d A;
  public q B;
  public j.a C;
  public ActionBarContextView D;
  public PopupWindow E;
  public j F;
  public o0 G = null;
  public boolean H = true;
  public boolean I;
  public ViewGroup J;
  public TextView K;
  public View L;
  public boolean M;
  public boolean N;
  public boolean O;
  public boolean P;
  public boolean Q;
  public boolean R;
  public boolean S;
  public boolean T;
  public p[] U;
  public p V;
  public boolean W;
  public boolean X;
  public boolean Y;
  public boolean Z;
  public Configuration a0;
  public int b0 = -100;
  public int c0;
  public int d0;
  public boolean e0;
  public n f0;
  public l g0;
  public boolean h0;
  public int i0;
  public final a j0 = new a();
  public boolean k0;
  public Rect l0;
  public Rect m0;
  public o n0;
  public OnBackInvokedDispatcher o0;
  public OnBackInvokedCallback p0;
  public final Object r;
  public final Context s;
  public Window t;
  public k u;
  public final d v;
  public a w;
  public j.f x;
  public CharSequence y;
  public g0 z;
  
  public g(Context paramContext, Window paramWindow, d paramd, Object paramObject)
  {
    s = paramContext;
    v = paramd;
    r = paramObject;
    if ((paramObject instanceof Dialog))
    {
      while (paramContext != null)
      {
        if ((paramContext instanceof c))
        {
          paramContext = (c)paramContext;
          break label95;
        }
        if (!(paramContext instanceof ContextWrapper)) {
          break;
        }
        paramContext = ((ContextWrapper)paramContext).getBaseContext();
      }
      paramContext = null;
      label95:
      if (paramContext != null) {
        b0 = paramContext.getDelegate().h();
      }
    }
    if (b0 == -100)
    {
      paramContext = q0;
      paramd = (Integer)paramContext.getOrDefault(r.getClass().getName(), null);
      if (paramd != null)
      {
        b0 = paramd.intValue();
        paramContext.remove(r.getClass().getName());
      }
    }
    if (paramWindow != null) {
      F(paramWindow);
    }
    l.j.c();
  }
  
  public static a0.i G(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 33) {
      return null;
    }
    a0.i locali1 = f.c;
    if (locali1 == null) {
      return null;
    }
    a0.i locali2 = Q(paramContext.getApplicationContext().getResources().getConfiguration());
    int j = 0;
    if (i >= 24)
    {
      if (locali1.d())
      {
        paramContext = a0.i.b;
      }
      else
      {
        LinkedHashSet localLinkedHashSet = new LinkedHashSet();
        for (;;)
        {
          i = a.size();
          if (j >= a.size() + i) {
            break;
          }
          if (j < a.size()) {
            paramContext = locali1.c(j);
          } else {
            paramContext = locali2.c(j - a.size());
          }
          if (paramContext != null) {
            localLinkedHashSet.add(paramContext);
          }
          j++;
        }
        paramContext = a0.i.a((Locale[])localLinkedHashSet.toArray(new Locale[localLinkedHashSet.size()]));
      }
    }
    else if (locali1.d()) {
      paramContext = a0.i.b;
    } else {
      paramContext = a0.i.b(locali1.c(0).toString());
    }
    if (paramContext.d()) {
      paramContext = locali2;
    }
    return paramContext;
  }
  
  public static Configuration K(Context paramContext, int paramInt, a0.i parami, Configuration paramConfiguration, boolean paramBoolean)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramBoolean) {
          paramInt = 0;
        } else {
          paramInt = getApplicationContextgetResourcesgetConfigurationuiMode & 0x30;
        }
      }
      else {
        paramInt = 32;
      }
    }
    else {
      paramInt = 16;
    }
    paramContext = new Configuration();
    fontScale = 0.0F;
    if (paramConfiguration != null) {
      paramContext.setTo(paramConfiguration);
    }
    uiMode = (paramInt | uiMode & 0xFFFFFFCF);
    if (parami != null) {
      if (Build.VERSION.SDK_INT >= 24)
      {
        h.d(paramContext, parami);
      }
      else
      {
        f.b(paramContext, parami.c(0));
        f.a(paramContext, parami.c(0));
      }
    }
    return paramContext;
  }
  
  public static a0.i Q(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return h.b(paramConfiguration);
    }
    return a0.i.b(g.a(locale));
  }
  
  public final void A(Toolbar paramToolbar)
  {
    if (!(r instanceof Activity)) {
      return;
    }
    T();
    Object localObject = w;
    if (!(localObject instanceof x))
    {
      x = null;
      if (localObject != null) {
        ((a)localObject).j();
      }
      w = null;
      if (paramToolbar != null)
      {
        localObject = r;
        if ((localObject instanceof Activity)) {
          localObject = ((Activity)localObject).getTitle();
        } else {
          localObject = y;
        }
        localObject = new u(paramToolbar, (CharSequence)localObject, u);
        w = ((a)localObject);
        u.b = c;
        paramToolbar.setBackInvokedCallbackEnabled(true);
      }
      else
      {
        u.b = null;
      }
      l();
      return;
    }
    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
  }
  
  public final void B(int paramInt)
  {
    c0 = paramInt;
  }
  
  public final void C(CharSequence paramCharSequence)
  {
    y = paramCharSequence;
    Object localObject = z;
    if (localObject != null)
    {
      ((g0)localObject).setWindowTitle(paramCharSequence);
    }
    else
    {
      localObject = w;
      if (localObject != null)
      {
        ((a)localObject).s(paramCharSequence);
      }
      else
      {
        localObject = K;
        if (localObject != null) {
          ((TextView)localObject).setText(paramCharSequence);
        }
      }
    }
  }
  
  public final j.a D(a.a parama)
  {
    Object localObject1;
    e locale;
    if (parama != null)
    {
      localObject1 = C;
      if (localObject1 != null) {
        ((j.a)localObject1).c();
      }
      locale = new e(parama);
      T();
      parama = w;
      if (parama != null)
      {
        parama = parama.u(locale);
        C = parama;
        if (parama != null)
        {
          localObject1 = v;
          if (localObject1 != null) {
            ((d)localObject1).onSupportActionModeStarted(parama);
          }
        }
      }
      if (C == null)
      {
        parama = G;
        if (parama != null) {
          parama.b();
        }
        parama = C;
        if (parama != null) {
          parama.c();
        }
        parama = v;
        if ((parama == null) || (Z)) {}
      }
    }
    try
    {
      parama = parama.onWindowStartingSupportActionMode(locale);
    }
    catch (AbstractMethodError parama)
    {
      int i;
      Object localObject2;
      int j;
      for (;;) {}
    }
    parama = null;
    if (parama != null)
    {
      C = parama;
    }
    else
    {
      parama = D;
      i = 1;
      if (parama == null) {
        if (R)
        {
          localObject1 = new TypedValue();
          parama = s.getTheme();
          parama.resolveAttribute(2130968585, (TypedValue)localObject1, true);
          if (resourceId != 0)
          {
            localObject2 = s.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(parama);
            ((Resources.Theme)localObject2).applyStyle(resourceId, true);
            parama = new j.c(s, 0);
            parama.getTheme().setTo((Resources.Theme)localObject2);
          }
          else
          {
            parama = s;
          }
          D = new ActionBarContextView(parama, null);
          localObject2 = new PopupWindow(parama, null, 2130968600);
          E = ((PopupWindow)localObject2);
          j0.g.d((PopupWindow)localObject2, 2);
          E.setContentView(D);
          E.setWidth(-1);
          parama.getTheme().resolveAttribute(2130968579, (TypedValue)localObject1, true);
          j = TypedValue.complexToDimensionPixelSize(data, parama.getResources().getDisplayMetrics());
          D.setContentHeight(j);
          E.setHeight(-2);
          F = new j(this);
        }
        else
        {
          localObject2 = (ViewStubCompat)J.findViewById(2131361849);
          if (localObject2 != null)
          {
            T();
            parama = w;
            if (parama != null) {
              parama = parama.e();
            } else {
              parama = null;
            }
            localObject1 = parama;
            if (parama == null) {
              localObject1 = s;
            }
            ((ViewStubCompat)localObject2).setLayoutInflater(LayoutInflater.from((Context)localObject1));
            D = ((ActionBarContextView)((ViewStubCompat)localObject2).a());
          }
        }
      }
      if (D != null)
      {
        parama = G;
        if (parama != null) {
          parama.b();
        }
        D.h();
        parama = new j.d(D.getContext(), D, locale);
        if (locale.a(parama, p))
        {
          parama.i();
          D.f(parama);
          C = parama;
          if (I)
          {
            localObject1 = J;
            if (localObject1 != null)
            {
              parama = d0.a;
              if (((View)localObject1).isLaidOut()) {
                break label559;
              }
            }
          }
          i = 0;
          label559:
          parama = D;
          if (i != 0)
          {
            parama.setAlpha(0.0F);
            parama = d0.a(D);
            parama.a(1.0F);
            G = parama;
            parama.d(new k(this));
          }
          else
          {
            parama.setAlpha(1.0F);
            D.setVisibility(0);
            if ((D.getParent() instanceof View))
            {
              localObject1 = (View)D.getParent();
              parama = d0.a;
              d0.c.c((View)localObject1);
            }
          }
          if (E != null) {
            t.getDecorView().post(F);
          }
        }
        else
        {
          C = null;
        }
      }
    }
    parama = C;
    if (parama != null)
    {
      localObject1 = v;
      if (localObject1 != null) {
        ((d)localObject1).onSupportActionModeStarted(parama);
      }
    }
    a0();
    C = C;
    a0();
    return C;
    throw new IllegalArgumentException("ActionMode callback can not be null.");
  }
  
  public final boolean E(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (Z) {
      return false;
    }
    int i = b0;
    if (i == -100) {
      i = f.b;
    }
    int j = U(s, i);
    int k = Build.VERSION.SDK_INT;
    Object localObject1;
    if (k < 33) {
      localObject1 = G(s);
    } else {
      localObject1 = null;
    }
    Object localObject3 = localObject1;
    if (!paramBoolean2)
    {
      localObject3 = localObject1;
      if (localObject1 != null) {
        localObject3 = Q(s.getResources().getConfiguration());
      }
    }
    Configuration localConfiguration = K(s, j, (a0.i)localObject3, null, false);
    Object localObject4 = s;
    boolean bool = e0;
    paramBoolean2 = true;
    Object localObject8;
    if ((!bool) && ((r instanceof Activity)))
    {
      localObject1 = ((Context)localObject4).getPackageManager();
      if (localObject1 == null)
      {
        m = 0;
        break label269;
      }
      if (k >= 29) {
        k = 269221888;
      } else if (k >= 24) {
        k = 786432;
      } else {
        k = 0;
      }
      try
      {
        localObject8 = new android/content/ComponentName;
        ((ComponentName)localObject8).<init>((Context)localObject4, r.getClass());
        localObject1 = ((PackageManager)localObject1).getActivityInfo((ComponentName)localObject8, k);
        if (localObject1 != null) {
          d0 = configChanges;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", localNameNotFoundException);
        d0 = 0;
      }
    }
    e0 = true;
    int m = d0;
    label269:
    localObject4 = a0;
    Object localObject2 = localObject4;
    if (localObject4 == null) {
      localObject2 = s.getResources().getConfiguration();
    }
    k = uiMode;
    int n = uiMode & 0x30;
    localObject4 = Q((Configuration)localObject2);
    if (localObject3 == null) {
      localObject2 = null;
    } else {
      localObject2 = Q(localConfiguration);
    }
    if ((k & 0x30) != n) {
      k = 512;
    } else {
      k = 0;
    }
    int i1 = k;
    if (localObject2 != null)
    {
      i1 = k;
      if (!((a0.i)localObject4).equals(localObject2)) {
        i1 = k | 0x4 | 0x2000;
      }
    }
    if (((m & i1) != 0) && (paramBoolean1) && (X) && ((s0) || (Y)))
    {
      localObject4 = r;
      if (((localObject4 instanceof Activity)) && (!((Activity)localObject4).isChild()))
      {
        localObject4 = (Activity)r;
        k = u.b.a;
        if (Build.VERSION.SDK_INT >= 28) {
          ((Activity)localObject4).recreate();
        } else {
          new Handler(((Context)localObject4).getMainLooper()).post(new u.a(localObject4, 0));
        }
        paramBoolean1 = true;
        break label512;
      }
    }
    paramBoolean1 = false;
    label512:
    Object localObject7;
    if ((!paramBoolean1) && (i1 != 0))
    {
      if ((m & i1) == i1) {
        k = 1;
      } else {
        k = 0;
      }
      localObject4 = s.getResources();
      localConfiguration = new Configuration(((Resources)localObject4).getConfiguration());
      uiMode = (getConfigurationuiMode & 0xFFFFFFCF | n);
      if (localObject2 != null) {
        if (Build.VERSION.SDK_INT >= 24)
        {
          h.d(localConfiguration, (a0.i)localObject2);
        }
        else
        {
          f.b(localConfiguration, ((a0.i)localObject2).c(0));
          f.a(localConfiguration, ((a0.i)localObject2).c(0));
        }
      }
      ((Resources)localObject4).updateConfiguration(localConfiguration, null);
      m = Build.VERSION.SDK_INT;
      if ((m < 26) && (m < 28))
      {
        Field localField2;
        Object localObject6;
        if (m >= 24)
        {
          if (!t.h)
          {
            try
            {
              localObject8 = Resources.class.getDeclaredField("mResourcesImpl");
              t.g = (Field)localObject8;
              ((AccessibleObject)localObject8).setAccessible(true);
            }
            catch (NoSuchFieldException localNoSuchFieldException1)
            {
              Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", localNoSuchFieldException1);
            }
            t.h = true;
          }
          Field localField1 = t.g;
          if (localField1 != null)
          {
            Object localObject5;
            try
            {
              localObject4 = localField1.get(localObject4);
            }
            catch (IllegalAccessException localIllegalAccessException1)
            {
              Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", localIllegalAccessException1);
              localObject5 = null;
            }
            if (localObject5 != null)
            {
              if (!t.b)
              {
                try
                {
                  localField1 = localObject5.getClass().getDeclaredField("mDrawableCache");
                  t.a = localField1;
                  localField1.setAccessible(true);
                }
                catch (NoSuchFieldException localNoSuchFieldException2)
                {
                  Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", localNoSuchFieldException2);
                }
                t.b = true;
              }
              localField2 = t.a;
              if (localField2 != null) {
                try
                {
                  localObject5 = localField2.get(localObject5);
                }
                catch (IllegalAccessException localIllegalAccessException2)
                {
                  Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", localIllegalAccessException2);
                }
              } else {
                localObject6 = null;
              }
              if (localObject6 != null) {
                t.a(localObject6);
              }
            }
          }
        }
        else
        {
          if (!t.b)
          {
            try
            {
              localField2 = Resources.class.getDeclaredField("mDrawableCache");
              t.a = localField2;
              localField2.setAccessible(true);
            }
            catch (NoSuchFieldException localNoSuchFieldException3)
            {
              Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException3);
            }
            t.b = true;
          }
          Field localField3 = t.a;
          if (localField3 != null) {
            try
            {
              localObject6 = localField3.get(localObject6);
            }
            catch (IllegalAccessException localIllegalAccessException3)
            {
              Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", localIllegalAccessException3);
            }
          } else {
            localObject7 = null;
          }
          if (localObject7 != null) {
            t.a(localObject7);
          }
        }
      }
      m = c0;
      if (m != 0)
      {
        s.setTheme(m);
        s.getTheme().applyStyle(c0, true);
      }
      paramBoolean1 = paramBoolean2;
      if (k != 0)
      {
        localObject7 = r;
        paramBoolean1 = paramBoolean2;
        if ((localObject7 instanceof Activity))
        {
          localObject7 = (Activity)localObject7;
          if ((localObject7 instanceof b1.o))
          {
            if (((b1.o)localObject7).getLifecycle().b().compareTo(k.b.c) >= 0) {
              k = 1;
            } else {
              k = 0;
            }
            paramBoolean1 = paramBoolean2;
            if (k == 0) {
              break label1111;
            }
          }
          else
          {
            paramBoolean1 = paramBoolean2;
            if (!Y) {
              break label1111;
            }
            paramBoolean1 = paramBoolean2;
            if (Z) {
              break label1111;
            }
          }
          ((Activity)localObject7).onConfigurationChanged(localConfiguration);
          paramBoolean1 = paramBoolean2;
        }
      }
    }
    label1111:
    if (paramBoolean1)
    {
      localObject7 = r;
      if ((localObject7 instanceof c))
      {
        if ((i1 & 0x200) != 0) {
          ((c)localObject7).onNightModeChanged(j);
        }
        if ((i1 & 0x4) != 0) {
          ((c)r).onLocalesChanged((a0.i)localObject3);
        }
      }
    }
    if ((paramBoolean1) && (localObject2 != null))
    {
      localObject2 = Q(s.getResources().getConfiguration());
      if (Build.VERSION.SDK_INT >= 24) {
        h.c((a0.i)localObject2);
      } else {
        Locale.setDefault(((a0.i)localObject2).c(0));
      }
    }
    if (i == 0)
    {
      P(s).e();
    }
    else
    {
      localObject2 = f0;
      if (localObject2 != null) {
        ((m)localObject2).a();
      }
    }
    if (i == 3)
    {
      localObject2 = s;
      if (g0 == null) {
        g0 = new l((Context)localObject2);
      }
      g0.e();
    }
    else
    {
      localObject2 = g0;
      if (localObject2 != null) {
        ((m)localObject2).a();
      }
    }
    return paramBoolean1;
  }
  
  public final void F(Window paramWindow)
  {
    if (t == null)
    {
      Object localObject1 = paramWindow.getCallback();
      if (!(localObject1 instanceof k))
      {
        localObject1 = new k((Window.Callback)localObject1);
        u = ((k)localObject1);
        paramWindow.setCallback((Window.Callback)localObject1);
        localObject1 = s;
        Object localObject2 = r0;
        Object localObject3 = null;
        localObject2 = ((Context)localObject1).obtainStyledAttributes(null, (int[])localObject2);
        if (((TypedArray)localObject2).hasValue(0))
        {
          int i = ((TypedArray)localObject2).getResourceId(0, 0);
          if (i != 0) {
            synchronized (l.j.a())
            {
              localObject1 = a.g((Context)localObject1, i, true);
            }
          }
        }
        localObject1 = null;
        if (localObject1 != null) {
          paramWindow.setBackgroundDrawable((Drawable)localObject1);
        }
        ((TypedArray)localObject2).recycle();
        t = paramWindow;
        if (Build.VERSION.SDK_INT >= 33)
        {
          paramWindow = o0;
          if (paramWindow == null)
          {
            if (paramWindow != null)
            {
              localObject1 = p0;
              if (localObject1 != null)
              {
                j.c(paramWindow, localObject1);
                p0 = null;
              }
            }
            localObject1 = r;
            paramWindow = (Window)localObject3;
            if ((localObject1 instanceof Activity))
            {
              paramWindow = (Window)localObject3;
              if (((Activity)localObject1).getWindow() != null) {
                paramWindow = j.a((Activity)r);
              }
            }
            o0 = paramWindow;
            a0();
          }
        }
        return;
      }
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    throw new IllegalStateException("AppCompat has already installed itself into the Window");
  }
  
  public final void H(int paramInt, p paramp, androidx.appcompat.view.menu.f paramf)
  {
    Object localObject1 = paramp;
    Object localObject2 = paramf;
    if (paramf == null)
    {
      p localp = paramp;
      if (paramp == null)
      {
        localp = paramp;
        if (paramInt >= 0)
        {
          localObject2 = U;
          localp = paramp;
          if (paramInt < localObject2.length) {
            localp = localObject2[paramInt];
          }
        }
      }
      localObject1 = localp;
      localObject2 = paramf;
      if (localp != null)
      {
        localObject2 = h;
        localObject1 = localp;
      }
    }
    if ((localObject1 != null) && (!m)) {
      return;
    }
    if (!Z)
    {
      paramp = u;
      paramf = t.getCallback();
      paramp.getClass();
      try
      {
        e = true;
        paramf.onPanelClosed(paramInt, (Menu)localObject2);
        e = false;
      }
      finally
      {
        e = false;
      }
    }
  }
  
  public final void I(androidx.appcompat.view.menu.f paramf)
  {
    if (T) {
      return;
    }
    T = true;
    z.i();
    Window.Callback localCallback = S();
    if ((localCallback != null) && (!Z)) {
      localCallback.onPanelClosed(108, paramf);
    }
    T = false;
  }
  
  public final void J(p paramp, boolean paramBoolean)
  {
    if ((paramBoolean) && (a == 0))
    {
      localObject = z;
      if ((localObject != null) && (((g0)localObject).a()))
      {
        I(h);
        return;
      }
    }
    Object localObject = (WindowManager)s.getSystemService("window");
    if ((localObject != null) && (m))
    {
      o localo = e;
      if (localo != null)
      {
        ((ViewManager)localObject).removeView(localo);
        if (paramBoolean) {
          H(a, paramp, null);
        }
      }
    }
    k = false;
    l = false;
    m = false;
    f = null;
    n = true;
    if (V == paramp) {
      V = null;
    }
    if (a == 0) {
      a0();
    }
  }
  
  public final boolean L(KeyEvent paramKeyEvent)
  {
    Object localObject1 = r;
    boolean bool1 = localObject1 instanceof i.a;
    boolean bool2 = true;
    boolean bool3 = true;
    if ((bool1) || ((localObject1 instanceof n)))
    {
      localObject1 = t.getDecorView();
      if ((localObject1 != null) && (e0.i.a((View)localObject1, paramKeyEvent))) {
        return true;
      }
    }
    Object localObject2;
    if (paramKeyEvent.getKeyCode() == 82)
    {
      localObject1 = u;
      localObject2 = t.getCallback();
      localObject1.getClass();
      try
      {
        d = true;
        bool1 = ((Window.Callback)localObject2).dispatchKeyEvent(paramKeyEvent);
        d = false;
        if (bool1) {
          return true;
        }
      }
      finally
      {
        d = false;
      }
    }
    int i = paramKeyEvent.getKeyCode();
    int j;
    if (paramKeyEvent.getAction() == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if (i != 4)
      {
        if (i == 82)
        {
          bool1 = bool2;
          if (paramKeyEvent.getRepeatCount() != 0) {
            return bool1;
          }
          localObject1 = R(0);
          bool1 = bool2;
          if (m) {
            return bool1;
          }
          Y((p)localObject1, paramKeyEvent);
          return bool2;
        }
      }
      else
      {
        if ((paramKeyEvent.getFlags() & 0x80) == 0) {
          bool3 = false;
        }
        W = bool3;
      }
    }
    else if (i != 4)
    {
      if (i == 82)
      {
        if (C != null) {
          return bool2;
        }
        localObject1 = R(0);
        localObject2 = z;
        if ((localObject2 != null) && (((g0)localObject2).c()) && (!ViewConfiguration.get(s).hasPermanentMenuKey()))
        {
          if (!z.a())
          {
            if ((!Z) && (Y((p)localObject1, paramKeyEvent)))
            {
              bool3 = z.g();
              break label426;
            }
          }
          else
          {
            bool3 = z.f();
            break label426;
          }
        }
        else
        {
          bool3 = m;
          if ((bool3) || (l)) {
            break label420;
          }
          if (k)
          {
            if (o)
            {
              k = false;
              bool3 = Y((p)localObject1, paramKeyEvent);
            }
            else
            {
              bool3 = true;
            }
            if (bool3)
            {
              W((p)localObject1, paramKeyEvent);
              bool3 = true;
              break label426;
            }
          }
        }
        bool3 = false;
        break label426;
        label420:
        J((p)localObject1, true);
        label426:
        bool1 = bool2;
        if (!bool3) {
          return bool1;
        }
        paramKeyEvent = (AudioManager)s.getApplicationContext().getSystemService("audio");
        if (paramKeyEvent != null)
        {
          paramKeyEvent.playSoundEffect(0);
          return bool2;
        }
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        return bool2;
      }
    }
    else if (V()) {
      return bool2;
    }
    bool1 = false;
    return bool1;
  }
  
  public final void M(int paramInt)
  {
    p localp = R(paramInt);
    if (h != null)
    {
      Bundle localBundle = new Bundle();
      h.t(localBundle);
      if (localBundle.size() > 0) {
        p = localBundle;
      }
      h.w();
      h.clear();
    }
    o = true;
    n = true;
    if (((paramInt == 108) || (paramInt == 0)) && (z != null))
    {
      localp = R(0);
      k = false;
      Y(localp, null);
    }
  }
  
  public final void N()
  {
    if (!I)
    {
      Object localObject1 = s.obtainStyledAttributes(a0.w);
      if (((TypedArray)localObject1).hasValue(117))
      {
        if (((TypedArray)localObject1).getBoolean(126, false)) {
          w(1);
        } else if (((TypedArray)localObject1).getBoolean(117, false)) {
          w(108);
        }
        if (((TypedArray)localObject1).getBoolean(118, false)) {
          w(109);
        }
        if (((TypedArray)localObject1).getBoolean(119, false)) {
          w(10);
        }
        R = ((TypedArray)localObject1).getBoolean(0, false);
        ((TypedArray)localObject1).recycle();
        O();
        t.getDecorView();
        localObject1 = LayoutInflater.from(s);
        Object localObject2;
        int i;
        if (!S)
        {
          if (R)
          {
            localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(2131558412, null);
            P = false;
            O = false;
          }
          else if (O)
          {
            localObject1 = new TypedValue();
            s.getTheme().resolveAttribute(2130968585, (TypedValue)localObject1, true);
            if (resourceId != 0) {
              localObject1 = new j.c(s, resourceId);
            } else {
              localObject1 = s;
            }
            localObject2 = (ViewGroup)LayoutInflater.from((Context)localObject1).inflate(2131558423, null);
            localObject1 = (g0)((View)localObject2).findViewById(2131361891);
            z = ((g0)localObject1);
            ((g0)localObject1).setWindowCallback(S());
            if (P) {
              z.h(109);
            }
            if (M) {
              z.h(2);
            }
            localObject1 = localObject2;
            if (N)
            {
              z.h(5);
              localObject1 = localObject2;
            }
          }
          else
          {
            localObject1 = null;
          }
        }
        else
        {
          if (Q) {
            i = 2131558422;
          } else {
            i = 2131558421;
          }
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i, null);
        }
        if (localObject1 != null)
        {
          localObject2 = new h(this);
          Object localObject4 = d0.a;
          d0.d.u((View)localObject1, (e0.t)localObject2);
          if (z == null) {
            K = ((TextView)((View)localObject1).findViewById(2131362051));
          }
          localObject2 = f1.a;
          try
          {
            try
            {
              localObject2 = localObject1.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
              if (!((AccessibleObject)localObject2).isAccessible()) {
                ((AccessibleObject)localObject2).setAccessible(true);
              }
              ((Method)localObject2).invoke(localObject1, new Object[0]);
            }
            catch (IllegalAccessException localIllegalAccessException) {}catch (InvocationTargetException localInvocationTargetException) {}
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", localInvocationTargetException);
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
          }
          localObject4 = (ContentFrameLayout)((View)localObject1).findViewById(2131361833);
          Object localObject3 = (ViewGroup)t.findViewById(16908290);
          if (localObject3 != null)
          {
            while (((ViewGroup)localObject3).getChildCount() > 0)
            {
              View localView = ((ViewGroup)localObject3).getChildAt(0);
              ((ViewGroup)localObject3).removeViewAt(0);
              ((ViewGroup)localObject4).addView(localView);
            }
            ((View)localObject3).setId(-1);
            ((View)localObject4).setId(16908290);
            if ((localObject3 instanceof FrameLayout)) {
              ((FrameLayout)localObject3).setForeground(null);
            }
          }
          t.setContentView((View)localObject1);
          ((ContentFrameLayout)localObject4).setAttachListener(new i(this));
          J = ((ViewGroup)localObject1);
          localObject1 = r;
          if ((localObject1 instanceof Activity)) {
            localObject1 = ((Activity)localObject1).getTitle();
          } else {
            localObject1 = y;
          }
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            localObject3 = z;
            if (localObject3 != null)
            {
              ((g0)localObject3).setWindowTitle((CharSequence)localObject1);
            }
            else
            {
              localObject3 = w;
              if (localObject3 != null)
              {
                ((a)localObject3).s((CharSequence)localObject1);
              }
              else
              {
                localObject3 = K;
                if (localObject3 != null) {
                  ((TextView)localObject3).setText((CharSequence)localObject1);
                }
              }
            }
          }
          localObject1 = (ContentFrameLayout)J.findViewById(16908290);
          localObject3 = t.getDecorView();
          int j = ((View)localObject3).getPaddingLeft();
          int k = ((View)localObject3).getPaddingTop();
          i = ((View)localObject3).getPaddingRight();
          int m = ((View)localObject3).getPaddingBottom();
          o.set(j, k, i, m);
          localObject3 = d0.a;
          if (((View)localObject1).isLaidOut()) {
            ((View)localObject1).requestLayout();
          }
          localObject3 = s.obtainStyledAttributes(a0.w);
          ((TypedArray)localObject3).getValue(124, ((ContentFrameLayout)localObject1).getMinWidthMajor());
          ((TypedArray)localObject3).getValue(125, ((ContentFrameLayout)localObject1).getMinWidthMinor());
          if (((TypedArray)localObject3).hasValue(122)) {
            ((TypedArray)localObject3).getValue(122, ((ContentFrameLayout)localObject1).getFixedWidthMajor());
          }
          if (((TypedArray)localObject3).hasValue(123)) {
            ((TypedArray)localObject3).getValue(123, ((ContentFrameLayout)localObject1).getFixedWidthMinor());
          }
          if (((TypedArray)localObject3).hasValue(120)) {
            ((TypedArray)localObject3).getValue(120, ((ContentFrameLayout)localObject1).getFixedHeightMajor());
          }
          if (((TypedArray)localObject3).hasValue(121)) {
            ((TypedArray)localObject3).getValue(121, ((ContentFrameLayout)localObject1).getFixedHeightMinor());
          }
          ((TypedArray)localObject3).recycle();
          ((View)localObject1).requestLayout();
          I = true;
          localObject1 = R(0);
          if ((!Z) && (h == null))
          {
            i0 |= 0x1000;
            if (!h0)
            {
              t.getDecorView().postOnAnimation(j0);
              h0 = true;
            }
          }
        }
        else
        {
          localObject1 = f.l("AppCompat does not support the current theme features: { windowActionBar: ");
          ((StringBuilder)localObject1).append(O);
          ((StringBuilder)localObject1).append(", windowActionBarOverlay: ");
          ((StringBuilder)localObject1).append(P);
          ((StringBuilder)localObject1).append(", android:windowIsFloating: ");
          ((StringBuilder)localObject1).append(R);
          ((StringBuilder)localObject1).append(", windowActionModeOverlay: ");
          ((StringBuilder)localObject1).append(Q);
          ((StringBuilder)localObject1).append(", windowNoTitle: ");
          ((StringBuilder)localObject1).append(S);
          ((StringBuilder)localObject1).append(" }");
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
        }
      }
      else
      {
        ((TypedArray)localObject1).recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      }
    }
  }
  
  public final void O()
  {
    if (t == null)
    {
      Object localObject = r;
      if ((localObject instanceof Activity)) {
        F(((Activity)localObject).getWindow());
      }
    }
    if (t != null) {
      return;
    }
    throw new IllegalStateException("We have not been given a Window");
  }
  
  public final m P(Context paramContext)
  {
    if (f0 == null)
    {
      if (w.d == null)
      {
        paramContext = paramContext.getApplicationContext();
        w.d = new w(paramContext, (LocationManager)paramContext.getSystemService("location"));
      }
      f0 = new n(w.d);
    }
    return f0;
  }
  
  public final p R(int paramInt)
  {
    Object localObject1 = U;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (localObject1.length > paramInt) {}
    }
    else
    {
      localObject2 = new p[paramInt + 1];
      if (localObject1 != null) {
        System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
      }
      U = ((p[])localObject2);
    }
    Object localObject3 = localObject2[paramInt];
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject1 = new p(paramInt);
      localObject2[paramInt] = localObject1;
    }
    return (p)localObject1;
  }
  
  public final Window.Callback S()
  {
    return t.getCallback();
  }
  
  public final void T()
  {
    N();
    if ((O) && (w == null))
    {
      Object localObject = r;
      if ((localObject instanceof Activity)) {}
      for (localObject = new x((Activity)r, P);; localObject = new x((Dialog)r))
      {
        w = ((a)localObject);
        break;
        if (!(localObject instanceof Dialog)) {
          break;
        }
      }
      localObject = w;
      if (localObject != null) {
        ((a)localObject).o(k0);
      }
    }
  }
  
  public final int U(Context paramContext, int paramInt)
  {
    if (paramInt != -100)
    {
      if (paramInt != -1)
      {
        if (paramInt != 0)
        {
          if ((paramInt == 1) || (paramInt == 2)) {
            break label101;
          }
          if (paramInt == 3)
          {
            if (g0 == null) {
              g0 = new l(paramContext);
            }
            paramContext = g0;
          }
          else
          {
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          }
        }
        else
        {
          if (((UiModeManager)paramContext.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
            return -1;
          }
          paramContext = P(paramContext);
        }
        return paramContext.c();
      }
      label101:
      return paramInt;
    }
    return -1;
  }
  
  public final boolean V()
  {
    boolean bool = W;
    W = false;
    Object localObject = R(0);
    if (m)
    {
      if (!bool) {
        J((p)localObject, true);
      }
      return true;
    }
    localObject = C;
    if (localObject != null)
    {
      ((j.a)localObject).c();
      return true;
    }
    T();
    localObject = w;
    return (localObject != null) && (((a)localObject).b());
  }
  
  public final void W(p paramp, KeyEvent paramKeyEvent)
  {
    if ((!m) && (!Z))
    {
      if (a == 0)
      {
        if ((s.getResources().getConfiguration().screenLayout & 0xF) == 4) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          return;
        }
      }
      Object localObject = S();
      if ((localObject != null) && (!((Window.Callback)localObject).onMenuOpened(a, h)))
      {
        J(paramp, true);
        return;
      }
      WindowManager localWindowManager = (WindowManager)s.getSystemService("window");
      if (localWindowManager == null) {
        return;
      }
      if (!Y(paramp, paramKeyEvent)) {
        return;
      }
      paramKeyEvent = e;
      if ((paramKeyEvent != null) && (!n))
      {
        paramKeyEvent = g;
        if (paramKeyEvent != null)
        {
          paramKeyEvent = paramKeyEvent.getLayoutParams();
          if ((paramKeyEvent != null) && (width == -1))
          {
            i = -1;
            break label790;
          }
        }
      }
      else
      {
        if (paramKeyEvent == null)
        {
          T();
          paramKeyEvent = w;
          if (paramKeyEvent != null) {
            paramKeyEvent = paramKeyEvent.e();
          } else {
            paramKeyEvent = null;
          }
          localObject = paramKeyEvent;
          if (paramKeyEvent == null) {
            localObject = s;
          }
          TypedValue localTypedValue = new TypedValue();
          paramKeyEvent = ((Context)localObject).getResources().newTheme();
          paramKeyEvent.setTo(((Context)localObject).getTheme());
          paramKeyEvent.resolveAttribute(2130968578, localTypedValue, true);
          i = resourceId;
          if (i != 0) {
            paramKeyEvent.applyStyle(i, true);
          }
          paramKeyEvent.resolveAttribute(2130968799, localTypedValue, true);
          i = resourceId;
          if (i == 0) {
            i = 2131951901;
          }
          paramKeyEvent.applyStyle(i, true);
          localObject = new j.c((Context)localObject, 0);
          ((j.c)localObject).getTheme().setTo(paramKeyEvent);
          j = ((j.c)localObject);
          paramKeyEvent = ((Context)localObject).obtainStyledAttributes(a0.w);
          b = paramKeyEvent.getResourceId(86, 0);
          d = paramKeyEvent.getResourceId(1, 0);
          paramKeyEvent.recycle();
          e = new o(j);
          c = 81;
        }
        else if ((n) && (paramKeyEvent.getChildCount() > 0))
        {
          e.removeAllViews();
        }
        paramKeyEvent = g;
        if (paramKeyEvent != null)
        {
          f = paramKeyEvent;
        }
        else
        {
          if (h == null) {
            break label612;
          }
          if (B == null) {
            B = new q();
          }
          localObject = B;
          if (i == null)
          {
            paramKeyEvent = new androidx.appcompat.view.menu.d(j);
            i = paramKeyEvent;
            e = ((j.a)localObject);
            localObject = h;
            ((androidx.appcompat.view.menu.f)localObject).b(paramKeyEvent, a);
          }
          localObject = i;
          paramKeyEvent = e;
          if (d == null)
          {
            d = ((ExpandedMenuView)b.inflate(2131558413, paramKeyEvent, false));
            if (f == null) {
              f = new d.a((androidx.appcompat.view.menu.d)localObject);
            }
            d.setAdapter(f);
            d.setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
          }
          paramKeyEvent = d;
          f = paramKeyEvent;
          if (paramKeyEvent == null) {
            break label612;
          }
        }
        i = 1;
        break label614;
        label612:
        i = 0;
        label614:
        if (i == 0) {
          break label861;
        }
        if (f != null) {
          if (g == null)
          {
            paramKeyEvent = i;
            if (f == null) {
              f = new d.a(paramKeyEvent);
            }
            if (f.getCount() <= 0) {}
          }
          else
          {
            i = 1;
            break label679;
          }
        }
        i = 0;
        label679:
        if (i == 0) {
          break label861;
        }
        localObject = f.getLayoutParams();
        paramKeyEvent = (KeyEvent)localObject;
        if (localObject == null) {
          paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
        }
        i = b;
        e.setBackgroundResource(i);
        localObject = f.getParent();
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(f);
        }
        e.addView(f, paramKeyEvent);
        if (!f.hasFocus()) {
          f.requestFocus();
        }
      }
      int i = -2;
      label790:
      l = false;
      paramKeyEvent = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
      gravity = c;
      windowAnimations = d;
      localWindowManager.addView(e, paramKeyEvent);
      m = true;
      if (a == 0) {
        a0();
      }
      return;
      label861:
      n = true;
    }
  }
  
  public final boolean X(p paramp, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = paramKeyEvent.isSystem();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (!k)
    {
      bool1 = bool2;
      if (!Y(paramp, paramKeyEvent)) {}
    }
    else
    {
      paramp = h;
      bool1 = bool2;
      if (paramp != null) {
        bool1 = paramp.performShortcut(paramInt, paramKeyEvent, 1);
      }
    }
    return bool1;
  }
  
  public final boolean Y(p paramp, KeyEvent paramKeyEvent)
  {
    if (Z) {
      return false;
    }
    if (k) {
      return true;
    }
    Object localObject1 = V;
    if ((localObject1 != null) && (localObject1 != paramp)) {
      J((p)localObject1, false);
    }
    Window.Callback localCallback = S();
    if (localCallback != null) {
      g = localCallback.onCreatePanelView(a);
    }
    int i = a;
    if ((i != 0) && (i != 108)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      localObject1 = z;
      if (localObject1 != null) {
        ((g0)localObject1).b();
      }
    }
    if ((g == null) && ((i == 0) || (!(w instanceof u))))
    {
      localObject1 = h;
      if ((localObject1 == null) || (o))
      {
        if (localObject1 == null)
        {
          Context localContext = s;
          int j = a;
          if (j != 0)
          {
            localObject1 = localContext;
            if (j != 108) {}
          }
          else
          {
            localObject1 = localContext;
            if (z != null)
            {
              TypedValue localTypedValue = new TypedValue();
              Resources.Theme localTheme = localContext.getTheme();
              localTheme.resolveAttribute(2130968585, localTypedValue, true);
              if (resourceId != 0)
              {
                localObject1 = localContext.getResources().newTheme();
                ((Resources.Theme)localObject1).setTo(localTheme);
                ((Resources.Theme)localObject1).applyStyle(resourceId, true);
                ((Resources.Theme)localObject1).resolveAttribute(2130968586, localTypedValue, true);
              }
              else
              {
                localTheme.resolveAttribute(2130968586, localTypedValue, true);
                localObject1 = null;
              }
              localObject2 = localObject1;
              if (resourceId != 0)
              {
                localObject2 = localObject1;
                if (localObject1 == null)
                {
                  localObject2 = localContext.getResources().newTheme();
                  ((Resources.Theme)localObject2).setTo(localTheme);
                }
                ((Resources.Theme)localObject2).applyStyle(resourceId, true);
              }
              localObject1 = localContext;
              if (localObject2 != null)
              {
                localObject1 = new j.c(localContext, 0);
                ((j.c)localObject1).getTheme().setTo((Resources.Theme)localObject2);
              }
            }
          }
          localObject1 = new androidx.appcompat.view.menu.f((Context)localObject1);
          e = this;
          Object localObject2 = h;
          if (localObject1 != localObject2)
          {
            if (localObject2 != null) {
              ((androidx.appcompat.view.menu.f)localObject2).r(i);
            }
            h = ((androidx.appcompat.view.menu.f)localObject1);
            localObject2 = i;
            if (localObject2 != null) {
              ((androidx.appcompat.view.menu.f)localObject1).b((androidx.appcompat.view.menu.j)localObject2, a);
            }
          }
          if (h == null) {
            return false;
          }
        }
        if (i != 0)
        {
          localObject1 = z;
          if (localObject1 != null)
          {
            if (A == null) {
              A = new d();
            }
            ((g0)localObject1).d(h, A);
          }
        }
        h.w();
        if (!localCallback.onCreatePanelMenu(a, h))
        {
          paramKeyEvent = h;
          if (paramKeyEvent != null)
          {
            if (paramKeyEvent != null) {
              paramKeyEvent.r(i);
            }
            h = null;
          }
          if (i != 0)
          {
            paramp = z;
            if (paramp != null) {
              paramp.d(null, A);
            }
          }
          return false;
        }
        o = false;
      }
      h.w();
      localObject1 = p;
      if (localObject1 != null)
      {
        h.s((Bundle)localObject1);
        p = null;
      }
      if (!localCallback.onPreparePanel(0, g, h))
      {
        if (i != 0)
        {
          paramKeyEvent = z;
          if (paramKeyEvent != null) {
            paramKeyEvent.d(null, A);
          }
        }
        h.v();
        return false;
      }
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      boolean bool;
      if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      }
      h.setQwertyMode(bool);
      h.v();
    }
    k = true;
    l = false;
    V = paramp;
    return true;
  }
  
  public final void Z()
  {
    if (!I) {
      return;
    }
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  public final boolean a(androidx.appcompat.view.menu.f paramf, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = S();
    if ((localCallback != null) && (!Z))
    {
      androidx.appcompat.view.menu.f localf = paramf.k();
      p[] arrayOfp = U;
      int i;
      if (arrayOfp != null)
      {
        i = arrayOfp.length;
        j = 0;
      }
      else
      {
        i = 0;
      }
      for (int j = i; j < i; j++)
      {
        paramf = arrayOfp[j];
        if ((paramf != null) && (h == localf)) {
          break label88;
        }
      }
      paramf = null;
      label88:
      if (paramf != null) {
        return localCallback.onMenuItemSelected(a, paramMenuItem);
      }
    }
    return false;
  }
  
  public final void a0()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      Object localObject = o0;
      int i = 0;
      if ((localObject != null) && ((R0m) || (C != null))) {
        i = 1;
      }
      if ((i != 0) && (p0 == null))
      {
        p0 = j.b(o0, this);
      }
      else if (i == 0)
      {
        localObject = p0;
        if (localObject != null) {
          j.c(o0, localObject);
        }
      }
    }
  }
  
  public final void b(androidx.appcompat.view.menu.f paramf)
  {
    paramf = z;
    if ((paramf != null) && (paramf.c()) && ((!ViewConfiguration.get(s).hasPermanentMenuKey()) || (z.e())))
    {
      Window.Callback localCallback = S();
      if (z.a())
      {
        z.f();
        if (!Z) {
          localCallback.onPanelClosed(108, R0h);
        }
      }
      else if ((localCallback != null) && (!Z))
      {
        if ((h0) && ((0x1 & i0) != 0))
        {
          t.getDecorView().removeCallbacks(j0);
          j0.run();
        }
        p localp = R(0);
        paramf = h;
        if ((paramf != null) && (!o) && (localCallback.onPreparePanel(0, g, paramf)))
        {
          localCallback.onMenuOpened(108, h);
          z.g();
        }
      }
    }
    else
    {
      paramf = R(0);
      n = true;
      J(paramf, false);
      W(paramf, null);
    }
  }
  
  public final void c(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    N();
    ((ViewGroup)J.findViewById(16908290)).addView(paramView, paramLayoutParams);
    u.a(t.getCallback());
  }
  
  public final Context d(Context paramContext)
  {
    X = true;
    int i = b0;
    if (i == -100) {
      i = f.b;
    }
    i = U(paramContext, i);
    if ((f.m(paramContext)) && (f.m(paramContext))) {
      if (a0.a.a())
      {
        if (!f.f) {
          f.a.execute(new e(paramContext, 0));
        }
      }
      else {
        synchronized (f.q)
        {
          ??? = f.c;
          if (??? == null)
          {
            if (f.d == null) {
              f.d = a0.i.b(r.b(paramContext));
            }
            if (!f.d.d()) {
              f.c = f.d;
            }
          }
          else if (!((a0.i)???).equals(f.d))
          {
            ??? = f.c;
            f.d = (a0.i)???;
            r.a(paramContext, a.a());
          }
        }
      }
    }
    Object localObject3 = G(paramContext);
    if ((t0) && ((paramContext instanceof ContextThemeWrapper))) {
      ??? = K(paramContext, i, (a0.i)localObject3, null, false);
    }
    try
    {
      ((ContextThemeWrapper)paramContext).applyOverrideConfiguration((Configuration)???);
      return paramContext;
    }
    catch (IllegalStateException localIllegalStateException1)
    {
      for (;;) {}
    }
    if ((paramContext instanceof j.c)) {
      ??? = K(paramContext, i, (a0.i)localObject3, null, false);
    }
    try
    {
      ((j.c)paramContext).a((Configuration)???);
      return paramContext;
    }
    catch (IllegalStateException localIllegalStateException2)
    {
      int j;
      Configuration localConfiguration;
      float f1;
      float f2;
      int k;
      int m;
      for (;;) {}
    }
    if (!s0) {
      return paramContext;
    }
    j = Build.VERSION.SDK_INT;
    ??? = new Configuration();
    uiMode = -1;
    fontScale = 0.0F;
    localConfiguration = paramContext.createConfigurationContext((Configuration)???).getResources().getConfiguration();
    ??? = paramContext.getResources().getConfiguration();
    uiMode = uiMode;
    if (!localConfiguration.equals((Configuration)???))
    {
      ??? = new Configuration();
      fontScale = 0.0F;
      if (localConfiguration.diff((Configuration)???) == 0)
      {
        ??? = ???;
      }
      else
      {
        f1 = fontScale;
        f2 = fontScale;
        if (f1 != f2) {
          fontScale = f2;
        }
        k = mcc;
        m = mcc;
        if (k != m) {
          mcc = m;
        }
        m = mnc;
        k = mnc;
        if (m != k) {
          mnc = k;
        }
        if (j >= 24) {
          h.a(localConfiguration, (Configuration)???, (Configuration)???);
        } else if (!Objects.equals(locale, locale)) {
          locale = locale;
        }
        k = touchscreen;
        m = touchscreen;
        if (k != m) {
          touchscreen = m;
        }
        m = keyboard;
        k = keyboard;
        if (m != k) {
          keyboard = k;
        }
        m = keyboardHidden;
        k = keyboardHidden;
        if (m != k) {
          keyboardHidden = k;
        }
        k = navigation;
        m = navigation;
        if (k != m) {
          navigation = m;
        }
        k = navigationHidden;
        m = navigationHidden;
        if (k != m) {
          navigationHidden = m;
        }
        m = orientation;
        k = orientation;
        if (m != k) {
          orientation = k;
        }
        k = screenLayout;
        m = screenLayout & 0xF;
        if ((k & 0xF) != m) {
          screenLayout |= m;
        }
        k = screenLayout;
        m = screenLayout & 0xC0;
        if ((k & 0xC0) != m) {
          screenLayout |= m;
        }
        m = screenLayout;
        k = screenLayout & 0x30;
        if ((m & 0x30) != k) {
          screenLayout |= k;
        }
        m = screenLayout;
        k = screenLayout & 0x300;
        if ((m & 0x300) != k) {
          screenLayout |= k;
        }
        if (j >= 26) {
          i.a(localConfiguration, (Configuration)???, (Configuration)???);
        }
        j = uiMode;
        m = uiMode & 0xF;
        if ((j & 0xF) != m) {
          uiMode |= m;
        }
        m = uiMode;
        j = uiMode & 0x30;
        if ((m & 0x30) != j) {
          uiMode |= j;
        }
        j = screenWidthDp;
        m = screenWidthDp;
        if (j != m) {
          screenWidthDp = m;
        }
        m = screenHeightDp;
        j = screenHeightDp;
        if (m != j) {
          screenHeightDp = j;
        }
        j = smallestScreenWidthDp;
        m = smallestScreenWidthDp;
        if (j != m) {
          smallestScreenWidthDp = m;
        }
        m = densityDpi;
        j = densityDpi;
        ??? = ???;
        if (m != j)
        {
          densityDpi = j;
          ??? = ???;
        }
      }
    }
    else
    {
      ??? = null;
    }
    ??? = K(paramContext, i, (a0.i)localObject3, (Configuration)???, true);
    ??? = new j.c(paramContext, 2131951913);
    ((j.c)???).a((Configuration)???);
    try
    {
      paramContext = paramContext.getTheme();
      if (paramContext != null) {
        i = 1;
      }
    }
    catch (NullPointerException paramContext)
    {
      for (;;) {}
    }
    i = 0;
    if (i != 0)
    {
      paramContext = ((j.c)???).getTheme();
      if (Build.VERSION.SDK_INT >= 29) {
        w.j.a(paramContext);
      } else {
        synchronized (w.i.a)
        {
          boolean bool = w.i.c;
          if (!bool)
          {
            try
            {
              localObject3 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
              w.i.b = (Method)localObject3;
              ((AccessibleObject)localObject3).setAccessible(true);
            }
            catch (NoSuchMethodException localNoSuchMethodException)
            {
              Log.i("ResourcesCompat", "Failed to retrieve rebase() method", localNoSuchMethodException);
            }
            w.i.c = true;
          }
          Method localMethod = w.i.b;
          if (localMethod != null)
          {
            try
            {
              localMethod.invoke(paramContext, new Object[0]);
            }
            catch (InvocationTargetException paramContext) {}catch (IllegalAccessException paramContext) {}
            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", paramContext);
            w.i.b = null;
          }
        }
      }
    }
    return (Context)???;
  }
  
  public final <T extends View> T e(int paramInt)
  {
    N();
    return t.findViewById(paramInt);
  }
  
  public final Context f()
  {
    return s;
  }
  
  public final b g()
  {
    return new b();
  }
  
  public final int h()
  {
    return b0;
  }
  
  public final MenuInflater i()
  {
    if (x == null)
    {
      T();
      Object localObject = w;
      if (localObject != null) {
        localObject = ((a)localObject).e();
      } else {
        localObject = s;
      }
      x = new j.f((Context)localObject);
    }
    return x;
  }
  
  public final a j()
  {
    T();
    return w;
  }
  
  public final void k()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(s);
    if (localLayoutInflater.getFactory() == null) {
      localLayoutInflater.setFactory2(this);
    } else if (!(localLayoutInflater.getFactory2() instanceof g)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    }
  }
  
  public final void l()
  {
    if (w != null)
    {
      T();
      if (!w.g())
      {
        i0 |= 0x1;
        if (!h0)
        {
          View localView = t.getDecorView();
          a locala = j0;
          WeakHashMap localWeakHashMap = d0.a;
          localView.postOnAnimation(locala);
          h0 = true;
        }
      }
    }
  }
  
  /* Error */
  public final void n(Configuration paramConfiguration)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 1063	g/g:O	Z
    //   4: ifeq +27 -> 31
    //   7: aload_0
    //   8: getfield 582	g/g:I	Z
    //   11: ifeq +20 -> 31
    //   14: aload_0
    //   15: invokevirtual 356	g/g:T	()V
    //   18: aload_0
    //   19: getfield 358	g/g:w	Lg/a;
    //   22: astore_1
    //   23: aload_1
    //   24: ifnull +7 -> 31
    //   27: aload_1
    //   28: invokevirtual 1633	g/a:i	()V
    //   31: invokestatic 854	l/j:a	()Ll/j;
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 195	g/g:s	Landroid/content/Context;
    //   39: astore_2
    //   40: aload_1
    //   41: monitorenter
    //   42: aload_1
    //   43: getfield 857	l/j:a	Ll/q0;
    //   46: astore_3
    //   47: aload_3
    //   48: monitorenter
    //   49: aload_3
    //   50: getfield 1635	l/q0:d	Ljava/util/WeakHashMap;
    //   53: aload_2
    //   54: invokevirtual 1638	java/util/WeakHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast 1640	r/e
    //   60: astore 4
    //   62: aload 4
    //   64: ifnull +53 -> 117
    //   67: aload 4
    //   69: getfield 1641	r/e:d	I
    //   72: istore 5
    //   74: aload 4
    //   76: getfield 1644	r/e:c	[Ljava/lang/Object;
    //   79: astore_2
    //   80: iconst_0
    //   81: istore 6
    //   83: iload 6
    //   85: iload 5
    //   87: if_icmpge +18 -> 105
    //   90: aload_2
    //   91: iload 6
    //   93: aconst_null
    //   94: aastore
    //   95: iinc 6 1
    //   98: goto -15 -> 83
    //   101: astore_2
    //   102: goto +48 -> 150
    //   105: aload 4
    //   107: iconst_0
    //   108: putfield 1641	r/e:d	I
    //   111: aload 4
    //   113: iconst_0
    //   114: putfield 1646	r/e:a	Z
    //   117: aload_3
    //   118: monitorexit
    //   119: aload_1
    //   120: monitorexit
    //   121: aload_0
    //   122: new 323	android/content/res/Configuration
    //   125: dup
    //   126: aload_0
    //   127: getfield 195	g/g:s	Landroid/content/Context;
    //   130: invokevirtual 266	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   133: invokevirtual 272	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   136: invokespecial 719	android/content/res/Configuration:<init>	(Landroid/content/res/Configuration;)V
    //   139: putfield 687	g/g:a0	Landroid/content/res/Configuration;
    //   142: aload_0
    //   143: iconst_0
    //   144: iconst_0
    //   145: invokevirtual 1648	g/g:E	(ZZ)Z
    //   148: pop
    //   149: return
    //   150: aload_3
    //   151: monitorexit
    //   152: aload_2
    //   153: athrow
    //   154: astore_3
    //   155: aload_1
    //   156: monitorexit
    //   157: aload_3
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	g
    //   0	159	1	paramConfiguration	Configuration
    //   39	52	2	localObject1	Object
    //   101	52	2	localObject2	Object
    //   154	4	3	localObject3	Object
    //   60	52	4	locale	r.e
    //   72	16	5	i	int
    //   81	15	6	j	int
    // Exception table:
    //   from	to	target	type
    //   49	62	101	finally
    //   67	80	101	finally
    //   105	117	101	finally
    //   42	49	154	finally
    //   117	119	154	finally
    //   150	154	154	finally
  }
  
  public final void o()
  {
    X = true;
    E(false, true);
    O();
    Object localObject1 = r;
    if ((localObject1 instanceof Activity)) {
      ??? = null;
    }
    try
    {
      localObject1 = (Activity)localObject1;
      try
      {
        localObject1 = m.b((Context)localObject1, ((Activity)localObject1).getComponentName());
        ??? = localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>(localNameNotFoundException);
        throw ((Throwable)localObject1);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    if (??? != null)
    {
      ??? = w;
      if (??? == null) {
        k0 = true;
      } else {
        ((a)???).o(true);
      }
    }
    synchronized (f.p)
    {
      f.v(this);
      r.d locald = f.o;
      localObject1 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject1).<init>(this);
      locald.add(localObject1);
    }
    a0 = new Configuration(s.getResources().getConfiguration());
    Y = true;
  }
  
  /* Error */
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 1681	g/g:n0	Lg/o;
    //   4: ifnonnull +131 -> 135
    //   7: aload_0
    //   8: getfield 195	g/g:s	Landroid/content/Context;
    //   11: getstatic 1039	b/a0:w	[I
    //   14: invokevirtual 1042	android/content/Context:obtainStyledAttributes	([I)Landroid/content/res/TypedArray;
    //   17: bipush 116
    //   19: invokevirtual 1685	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   22: astore 5
    //   24: aload 5
    //   26: ifnonnull +14 -> 40
    //   29: new 1687	g/o
    //   32: dup
    //   33: invokespecial 1688	g/o:<init>	()V
    //   36: astore_1
    //   37: goto +93 -> 130
    //   40: aload_0
    //   41: aload_0
    //   42: getfield 195	g/g:s	Landroid/content/Context;
    //   45: invokevirtual 1692	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   48: aload 5
    //   50: invokevirtual 1698	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   53: iconst_0
    //   54: anewarray 224	java/lang/Class
    //   57: invokevirtual 1702	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   60: iconst_0
    //   61: anewarray 218	java/lang/Object
    //   64: invokevirtual 1708	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   67: checkcast 1687	g/o
    //   70: putfield 1681	g/g:n0	Lg/o;
    //   73: goto +62 -> 135
    //   76: astore 6
    //   78: new 1216	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 1709	java/lang/StringBuilder:<init>	()V
    //   85: astore_1
    //   86: aload_1
    //   87: ldc_w 1711
    //   90: invokevirtual 1224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_1
    //   95: aload 5
    //   97: invokevirtual 1224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_1
    //   102: ldc_w 1713
    //   105: invokevirtual 1224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: ldc_w 678
    //   112: aload_1
    //   113: invokevirtual 1233	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: aload 6
    //   118: invokestatic 1604	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   121: pop
    //   122: new 1687	g/o
    //   125: dup
    //   126: invokespecial 1688	g/o:<init>	()V
    //   129: astore_1
    //   130: aload_0
    //   131: aload_1
    //   132: putfield 1681	g/g:n0	Lg/o;
    //   135: aload_0
    //   136: getfield 1681	g/g:n0	Lg/o;
    //   139: astore 7
    //   141: getstatic 1716	l/e1:a	I
    //   144: istore 8
    //   146: aload 7
    //   148: invokevirtual 222	java/lang/Object:getClass	()Ljava/lang/Class;
    //   151: pop
    //   152: iconst_4
    //   153: istore 8
    //   155: aload_3
    //   156: aload 4
    //   158: getstatic 1718	b/a0:L	[I
    //   161: iconst_0
    //   162: iconst_0
    //   163: invokevirtual 1721	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   166: astore_1
    //   167: aload_1
    //   168: iconst_4
    //   169: iconst_0
    //   170: invokevirtual 851	android/content/res/TypedArray:getResourceId	(II)I
    //   173: istore 9
    //   175: iload 9
    //   177: ifeq +13 -> 190
    //   180: ldc_w 1723
    //   183: ldc_w 1725
    //   186: invokestatic 1631	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   189: pop
    //   190: aload_1
    //   191: invokevirtual 869	android/content/res/TypedArray:recycle	()V
    //   194: iload 9
    //   196: ifeq +37 -> 233
    //   199: aload_3
    //   200: instanceof 482
    //   203: ifeq +15 -> 218
    //   206: aload_3
    //   207: checkcast 482	j/c
    //   210: getfield 1726	j/c:a	I
    //   213: iload 9
    //   215: if_icmpeq +18 -> 233
    //   218: new 482	j/c
    //   221: dup
    //   222: aload_3
    //   223: iload 9
    //   225: invokespecial 485	j/c:<init>	(Landroid/content/Context;I)V
    //   228: astore 6
    //   230: goto +6 -> 236
    //   233: aload_3
    //   234: astore 6
    //   236: aload_2
    //   237: invokevirtual 222	java/lang/Object:getClass	()Ljava/lang/Class;
    //   240: pop
    //   241: aload_2
    //   242: invokevirtual 1729	java/lang/String:hashCode	()I
    //   245: lookupswitch	default:+123->368, -1946472170:+375->620, -1455429095:+356->601, -1346021293:+337->582, -938935918:+318->563, -937446323:+305->550, -658531749:+286->531, -339785223:+266->511, 776382189:+246->491, 799298502:+226->471, 1125864064:+206->451, 1413872058:+186->431, 1601505219:+166->411, 1666676343:+146->391, 2001146706:+126->371
    //   368: goto +271 -> 639
    //   371: aload_2
    //   372: ldc_w 1731
    //   375: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   378: ifne +6 -> 384
    //   381: goto +258 -> 639
    //   384: bipush 13
    //   386: istore 8
    //   388: goto +254 -> 642
    //   391: aload_2
    //   392: ldc_w 1733
    //   395: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   398: ifne +6 -> 404
    //   401: goto +238 -> 639
    //   404: bipush 12
    //   406: istore 8
    //   408: goto +234 -> 642
    //   411: aload_2
    //   412: ldc_w 1735
    //   415: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   418: ifne +6 -> 424
    //   421: goto +218 -> 639
    //   424: bipush 11
    //   426: istore 8
    //   428: goto +214 -> 642
    //   431: aload_2
    //   432: ldc_w 1737
    //   435: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   438: ifne +6 -> 444
    //   441: goto +198 -> 639
    //   444: bipush 10
    //   446: istore 8
    //   448: goto +194 -> 642
    //   451: aload_2
    //   452: ldc_w 1739
    //   455: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   458: ifne +6 -> 464
    //   461: goto +178 -> 639
    //   464: bipush 9
    //   466: istore 8
    //   468: goto +174 -> 642
    //   471: aload_2
    //   472: ldc_w 1741
    //   475: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   478: ifne +6 -> 484
    //   481: goto +158 -> 639
    //   484: bipush 8
    //   486: istore 8
    //   488: goto +154 -> 642
    //   491: aload_2
    //   492: ldc_w 1743
    //   495: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   498: ifne +6 -> 504
    //   501: goto +138 -> 639
    //   504: bipush 7
    //   506: istore 8
    //   508: goto +134 -> 642
    //   511: aload_2
    //   512: ldc_w 1745
    //   515: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   518: ifne +6 -> 524
    //   521: goto +118 -> 639
    //   524: bipush 6
    //   526: istore 8
    //   528: goto +114 -> 642
    //   531: aload_2
    //   532: ldc_w 1747
    //   535: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   538: ifne +6 -> 544
    //   541: goto +98 -> 639
    //   544: iconst_5
    //   545: istore 8
    //   547: goto +95 -> 642
    //   550: aload_2
    //   551: ldc_w 1749
    //   554: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   557: ifne +85 -> 642
    //   560: goto +79 -> 639
    //   563: aload_2
    //   564: ldc_w 1751
    //   567: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   570: ifne +6 -> 576
    //   573: goto +66 -> 639
    //   576: iconst_3
    //   577: istore 8
    //   579: goto +63 -> 642
    //   582: aload_2
    //   583: ldc_w 1753
    //   586: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   589: ifne +6 -> 595
    //   592: goto +47 -> 639
    //   595: iconst_2
    //   596: istore 8
    //   598: goto +44 -> 642
    //   601: aload_2
    //   602: ldc_w 1755
    //   605: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   608: ifne +6 -> 614
    //   611: goto +28 -> 639
    //   614: iconst_1
    //   615: istore 8
    //   617: goto +25 -> 642
    //   620: aload_2
    //   621: ldc_w 1757
    //   624: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   627: ifne +6 -> 633
    //   630: goto +9 -> 639
    //   633: iconst_0
    //   634: istore 8
    //   636: goto +6 -> 642
    //   639: iconst_m1
    //   640: istore 8
    //   642: aconst_null
    //   643: astore 10
    //   645: iload 8
    //   647: tableswitch	default:+69->716, 0:+276->923, 1:+261->908, 2:+246->893, 3:+231->878, 4:+213->860, 5:+198->845, 6:+180->827, 7:+165->812, 8:+150->797, 9:+134->781, 10:+119->766, 11:+104->751, 12:+89->736, 13:+74->721
    //   716: aconst_null
    //   717: astore_1
    //   718: goto +217 -> 935
    //   721: new 1759	l/e
    //   724: dup
    //   725: aload 6
    //   727: aload 4
    //   729: invokespecial 1760	l/e:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   732: astore_1
    //   733: goto +202 -> 935
    //   736: new 1762	l/k
    //   739: dup
    //   740: aload 6
    //   742: aload 4
    //   744: invokespecial 1763	l/k:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   747: astore_1
    //   748: goto +187 -> 935
    //   751: new 1765	l/f
    //   754: dup
    //   755: aload 6
    //   757: aload 4
    //   759: invokespecial 1766	l/f:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   762: astore_1
    //   763: goto +172 -> 935
    //   766: new 1768	l/c
    //   769: dup
    //   770: aload 6
    //   772: aload 4
    //   774: invokespecial 1769	l/c:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   777: astore_1
    //   778: goto +157 -> 935
    //   781: new 1771	l/p
    //   784: dup
    //   785: aload 6
    //   787: aload 4
    //   789: iconst_0
    //   790: invokespecial 1772	l/p:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   793: astore_1
    //   794: goto +141 -> 935
    //   797: new 1774	l/f0
    //   800: dup
    //   801: aload 6
    //   803: aload 4
    //   805: invokespecial 1775	l/f0:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   808: astore_1
    //   809: goto +126 -> 935
    //   812: new 1777	l/t
    //   815: dup
    //   816: aload 6
    //   818: aload 4
    //   820: invokespecial 1778	l/t:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   823: astore_1
    //   824: goto +111 -> 935
    //   827: new 1780	l/z
    //   830: dup
    //   831: aload 6
    //   833: aload 4
    //   835: ldc_w 1781
    //   838: invokespecial 1782	l/z:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   841: astore_1
    //   842: goto +93 -> 935
    //   845: new 1784	l/w
    //   848: dup
    //   849: aload 6
    //   851: aload 4
    //   853: invokespecial 1785	l/w:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   856: astore_1
    //   857: goto +78 -> 935
    //   860: new 1787	l/n
    //   863: dup
    //   864: aload 6
    //   866: aload 4
    //   868: ldc_w 1788
    //   871: invokespecial 1789	l/n:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   874: astore_1
    //   875: goto +60 -> 935
    //   878: new 1791	l/d0
    //   881: dup
    //   882: aload 6
    //   884: aload 4
    //   886: invokespecial 1792	l/d0:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   889: astore_1
    //   890: goto +45 -> 935
    //   893: new 1794	l/q
    //   896: dup
    //   897: aload 6
    //   899: aload 4
    //   901: invokespecial 1795	l/q:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   904: astore_1
    //   905: goto +30 -> 935
    //   908: new 1797	l/g
    //   911: dup
    //   912: aload 6
    //   914: aload 4
    //   916: invokespecial 1798	l/g:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   919: astore_1
    //   920: goto +15 -> 935
    //   923: new 1800	l/u
    //   926: dup
    //   927: aload 6
    //   929: aload 4
    //   931: invokespecial 1801	l/u:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   934: astore_1
    //   935: aload_1
    //   936: astore 5
    //   938: aload_1
    //   939: ifnonnull +202 -> 1141
    //   942: aload_1
    //   943: astore 5
    //   945: aload_3
    //   946: aload 6
    //   948: if_acmpeq +193 -> 1141
    //   951: aload_2
    //   952: astore_1
    //   953: aload_2
    //   954: ldc_w 1803
    //   957: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   960: ifeq +15 -> 975
    //   963: aload 4
    //   965: aconst_null
    //   966: ldc_w 1805
    //   969: invokeinterface 1811 3 0
    //   974: astore_1
    //   975: aload 7
    //   977: getfield 1813	g/o:a	[Ljava/lang/Object;
    //   980: astore_2
    //   981: aload_2
    //   982: iconst_0
    //   983: aload 6
    //   985: aastore
    //   986: aload_2
    //   987: iconst_1
    //   988: aload 4
    //   990: aastore
    //   991: iconst_m1
    //   992: aload_1
    //   993: bipush 46
    //   995: invokevirtual 1817	java/lang/String:indexOf	(I)I
    //   998: if_icmpne +78 -> 1076
    //   1001: iconst_0
    //   1002: istore 8
    //   1004: getstatic 1820	g/o:g	[Ljava/lang/String;
    //   1007: astore_2
    //   1008: iload 8
    //   1010: iconst_3
    //   1011: if_icmpge +45 -> 1056
    //   1014: aload 7
    //   1016: aload 6
    //   1018: aload_1
    //   1019: aload_2
    //   1020: iload 8
    //   1022: aaload
    //   1023: invokevirtual 1823	g/o:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   1026: astore_2
    //   1027: aload_2
    //   1028: ifnull +22 -> 1050
    //   1031: aload 7
    //   1033: getfield 1813	g/o:a	[Ljava/lang/Object;
    //   1036: astore_1
    //   1037: aload_1
    //   1038: iconst_0
    //   1039: aconst_null
    //   1040: aastore
    //   1041: aload_1
    //   1042: iconst_1
    //   1043: aconst_null
    //   1044: aastore
    //   1045: aload_2
    //   1046: astore_1
    //   1047: goto +91 -> 1138
    //   1050: iinc 8 1
    //   1053: goto -49 -> 1004
    //   1056: aload 7
    //   1058: getfield 1813	g/o:a	[Ljava/lang/Object;
    //   1061: astore_1
    //   1062: aload_1
    //   1063: iconst_0
    //   1064: aconst_null
    //   1065: aastore
    //   1066: aload_1
    //   1067: iconst_1
    //   1068: aconst_null
    //   1069: aastore
    //   1070: aload 10
    //   1072: astore_1
    //   1073: goto +65 -> 1138
    //   1076: aload 7
    //   1078: aload 6
    //   1080: aload_1
    //   1081: aconst_null
    //   1082: invokevirtual 1823	g/o:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   1085: astore_1
    //   1086: aload 7
    //   1088: getfield 1813	g/o:a	[Ljava/lang/Object;
    //   1091: astore_2
    //   1092: aload_2
    //   1093: iconst_0
    //   1094: aconst_null
    //   1095: aastore
    //   1096: aload_2
    //   1097: iconst_1
    //   1098: aconst_null
    //   1099: aastore
    //   1100: goto +38 -> 1138
    //   1103: astore_1
    //   1104: aload 7
    //   1106: getfield 1813	g/o:a	[Ljava/lang/Object;
    //   1109: astore_2
    //   1110: aload_2
    //   1111: iconst_0
    //   1112: aconst_null
    //   1113: aastore
    //   1114: aload_2
    //   1115: iconst_1
    //   1116: aconst_null
    //   1117: aastore
    //   1118: aload_1
    //   1119: athrow
    //   1120: astore_1
    //   1121: aload 7
    //   1123: getfield 1813	g/o:a	[Ljava/lang/Object;
    //   1126: astore_1
    //   1127: aload_1
    //   1128: iconst_0
    //   1129: aconst_null
    //   1130: aastore
    //   1131: aload_1
    //   1132: iconst_1
    //   1133: aconst_null
    //   1134: aastore
    //   1135: aload 10
    //   1137: astore_1
    //   1138: aload_1
    //   1139: astore 5
    //   1141: aload 5
    //   1143: ifnull +218 -> 1361
    //   1146: aload 5
    //   1148: invokevirtual 567	android/view/View:getContext	()Landroid/content/Context;
    //   1151: astore_2
    //   1152: aload_2
    //   1153: instanceof 205
    //   1156: ifeq +57 -> 1213
    //   1159: getstatic 587	e0/d0:a	Ljava/util/WeakHashMap;
    //   1162: astore_1
    //   1163: aload 5
    //   1165: invokevirtual 1826	android/view/View:hasOnClickListeners	()Z
    //   1168: ifne +6 -> 1174
    //   1171: goto +42 -> 1213
    //   1174: aload_2
    //   1175: aload 4
    //   1177: getstatic 1828	g/o:c	[I
    //   1180: invokevirtual 841	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1183: astore_1
    //   1184: aload_1
    //   1185: iconst_0
    //   1186: invokevirtual 1685	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   1189: astore_2
    //   1190: aload_2
    //   1191: ifnull +18 -> 1209
    //   1194: aload 5
    //   1196: new 1830	g/o$a
    //   1199: dup
    //   1200: aload 5
    //   1202: aload_2
    //   1203: invokespecial 1833	g/o$a:<init>	(Landroid/view/View;Ljava/lang/String;)V
    //   1206: invokevirtual 1837	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1209: aload_1
    //   1210: invokevirtual 869	android/content/res/TypedArray:recycle	()V
    //   1213: getstatic 254	android/os/Build$VERSION:SDK_INT	I
    //   1216: bipush 28
    //   1218: if_icmple +6 -> 1224
    //   1221: goto +140 -> 1361
    //   1224: aload 6
    //   1226: aload 4
    //   1228: getstatic 1839	g/o:d	[I
    //   1231: invokevirtual 841	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1234: astore_1
    //   1235: aload_1
    //   1236: iconst_0
    //   1237: invokevirtual 847	android/content/res/TypedArray:hasValue	(I)Z
    //   1240: ifeq +32 -> 1272
    //   1243: aload_1
    //   1244: iconst_0
    //   1245: iconst_0
    //   1246: invokevirtual 1046	android/content/res/TypedArray:getBoolean	(IZ)Z
    //   1249: istore 11
    //   1251: getstatic 587	e0/d0:a	Ljava/util/WeakHashMap;
    //   1254: astore_2
    //   1255: new 1841	e0/c0
    //   1258: dup
    //   1259: invokespecial 1842	e0/c0:<init>	()V
    //   1262: aload 5
    //   1264: iload 11
    //   1266: invokestatic 1848	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1269: invokevirtual 1853	e0/d0$b:e	(Landroid/view/View;Ljava/lang/Object;)V
    //   1272: aload_1
    //   1273: invokevirtual 869	android/content/res/TypedArray:recycle	()V
    //   1276: aload 6
    //   1278: aload 4
    //   1280: getstatic 1855	g/o:e	[I
    //   1283: invokevirtual 841	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1286: astore_1
    //   1287: aload_1
    //   1288: iconst_0
    //   1289: invokevirtual 847	android/content/res/TypedArray:hasValue	(I)Z
    //   1292: ifeq +13 -> 1305
    //   1295: aload 5
    //   1297: aload_1
    //   1298: iconst_0
    //   1299: invokevirtual 1685	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   1302: invokestatic 1858	e0/d0:i	(Landroid/view/View;Ljava/lang/CharSequence;)V
    //   1305: aload_1
    //   1306: invokevirtual 869	android/content/res/TypedArray:recycle	()V
    //   1309: aload 6
    //   1311: aload 4
    //   1313: getstatic 1860	g/o:f	[I
    //   1316: invokevirtual 841	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1319: astore_1
    //   1320: aload_1
    //   1321: iconst_0
    //   1322: invokevirtual 847	android/content/res/TypedArray:hasValue	(I)Z
    //   1325: ifeq +32 -> 1357
    //   1328: aload_1
    //   1329: iconst_0
    //   1330: iconst_0
    //   1331: invokevirtual 1046	android/content/res/TypedArray:getBoolean	(IZ)Z
    //   1334: istore 11
    //   1336: getstatic 587	e0/d0:a	Ljava/util/WeakHashMap;
    //   1339: astore_2
    //   1340: new 1862	e0/a0
    //   1343: dup
    //   1344: invokespecial 1863	e0/a0:<init>	()V
    //   1347: aload 5
    //   1349: iload 11
    //   1351: invokestatic 1848	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1354: invokevirtual 1853	e0/d0$b:e	(Landroid/view/View;Ljava/lang/Object;)V
    //   1357: aload_1
    //   1358: invokevirtual 869	android/content/res/TypedArray:recycle	()V
    //   1361: aload 5
    //   1363: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1364	0	this	g
    //   0	1364	1	paramView	View
    //   0	1364	2	paramString	String
    //   0	1364	3	paramContext	Context
    //   0	1364	4	paramAttributeSet	AttributeSet
    //   22	1340	5	localObject1	Object
    //   76	41	6	localThrowable	Throwable
    //   228	1082	6	localObject2	Object
    //   139	983	7	localo	o
    //   144	907	8	i	int
    //   173	51	9	j	int
    //   643	493	10	localObject3	Object
    //   1249	101	11	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   40	73	76	finally
    //   975	981	1103	finally
    //   991	1001	1103	finally
    //   1004	1008	1103	finally
    //   1014	1027	1103	finally
    //   1076	1086	1103	finally
    //   975	981	1120	java/lang/Exception
    //   991	1001	1120	java/lang/Exception
    //   1004	1008	1120	java/lang/Exception
    //   1014	1027	1120	java/lang/Exception
    //   1076	1086	1120	java/lang/Exception
  }
  
  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public final void p()
  {
    if ((r instanceof Activity)) {
      synchronized (f.p)
      {
        f.v(this);
      }
    }
    if (h0) {
      t.getDecorView().removeCallbacks(j0);
    }
    Z = true;
    if (b0 != -100)
    {
      ??? = r;
      if (((??? instanceof Activity)) && (((Activity)???).isChangingConfigurations()))
      {
        q0.put(r.getClass().getName(), Integer.valueOf(b0));
        break label132;
      }
    }
    q0.remove(r.getClass().getName());
    label132:
    ??? = w;
    if (??? != null) {
      ((a)???).j();
    }
    ??? = f0;
    if (??? != null) {
      ((m)???).a();
    }
    ??? = g0;
    if (??? != null) {
      ((m)???).a();
    }
  }
  
  public final void q()
  {
    N();
  }
  
  public final void r()
  {
    T();
    a locala = w;
    if (locala != null) {
      locala.q(true);
    }
  }
  
  public final void s() {}
  
  public final void t()
  {
    E(true, false);
  }
  
  public final void u()
  {
    T();
    a locala = w;
    if (locala != null) {
      locala.q(false);
    }
  }
  
  public final boolean w(int paramInt)
  {
    int i;
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      i = 108;
    }
    else
    {
      i = paramInt;
      if (paramInt == 9)
      {
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        i = 109;
      }
    }
    if ((S) && (i == 108)) {
      return false;
    }
    if ((O) && (i == 1)) {
      O = false;
    }
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 5)
        {
          if (i != 10)
          {
            if (i != 108)
            {
              if (i != 109) {
                return t.requestFeature(i);
              }
              Z();
              P = true;
              return true;
            }
            Z();
            O = true;
            return true;
          }
          Z();
          Q = true;
          return true;
        }
        Z();
        N = true;
        return true;
      }
      Z();
      M = true;
      return true;
    }
    Z();
    S = true;
    return true;
  }
  
  public final void x(int paramInt)
  {
    N();
    ViewGroup localViewGroup = (ViewGroup)J.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(s).inflate(paramInt, localViewGroup);
    u.a(t.getCallback());
  }
  
  public final void y(View paramView)
  {
    N();
    ViewGroup localViewGroup = (ViewGroup)J.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    u.a(t.getCallback());
  }
  
  public final void z(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    N();
    ViewGroup localViewGroup = (ViewGroup)J.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    u.a(t.getCallback());
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      g localg = g.this;
      if ((i0 & 0x1) != 0) {
        localg.M(0);
      }
      localg = g.this;
      if ((i0 & 0x1000) != 0) {
        localg.M(108);
      }
      localg = g.this;
      h0 = false;
      i0 = 0;
    }
  }
  
  public final class b
    implements b
  {}
  
  public static abstract interface c {}
  
  public final class d
    implements j.a
  {
    public d() {}
    
    public final void b(androidx.appcompat.view.menu.f paramf, boolean paramBoolean)
    {
      I(paramf);
    }
    
    public final boolean c(androidx.appcompat.view.menu.f paramf)
    {
      Window.Callback localCallback = S();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramf);
      }
      return true;
    }
  }
  
  public final class e
    implements a.a
  {
    public a.a a;
    
    public e(a.a parama)
    {
      a = parama;
    }
    
    public final boolean a(j.a parama, androidx.appcompat.view.menu.f paramf)
    {
      return a.a(parama, paramf);
    }
    
    public final void b(j.a parama)
    {
      a.b(parama);
      parama = g.this;
      if (E != null) {
        t.getDecorView().removeCallbacks(F);
      }
      parama = g.this;
      if (D != null)
      {
        parama = G;
        if (parama != null) {
          parama.b();
        }
        localObject = g.this;
        parama = d0.a(D);
        parama.a(0.0F);
        G = parama;
        G.d(new a());
      }
      Object localObject = g.this;
      parama = v;
      if (parama != null) {
        parama.onSupportActionModeFinished(C);
      }
      parama = g.this;
      C = null;
      localObject = J;
      parama = d0.a;
      d0.c.c((View)localObject);
      a0();
    }
    
    public final boolean c(j.a parama, androidx.appcompat.view.menu.f paramf)
    {
      ViewGroup localViewGroup = J;
      WeakHashMap localWeakHashMap = d0.a;
      d0.c.c(localViewGroup);
      return a.c(parama, paramf);
    }
    
    public final boolean d(j.a parama, MenuItem paramMenuItem)
    {
      return a.d(parama, paramMenuItem);
    }
    
    public final class a
      extends e0.q0
    {
      public a()
      {
        super();
      }
      
      public final void c()
      {
        D.setVisibility(8);
        Object localObject1 = g.this;
        Object localObject2 = E;
        if (localObject2 != null)
        {
          ((PopupWindow)localObject2).dismiss();
        }
        else if ((D.getParent() instanceof View))
        {
          localObject2 = (View)D.getParent();
          localObject1 = d0.a;
          d0.c.c((View)localObject2);
        }
        D.h();
        G.d(null);
        localObject2 = g.this;
        G = null;
        localObject2 = J;
        localObject1 = d0.a;
        d0.c.c((View)localObject2);
      }
    }
  }
  
  public static final class f
  {
    public static void a(Configuration paramConfiguration, Locale paramLocale)
    {
      paramConfiguration.setLayoutDirection(paramLocale);
    }
    
    public static void b(Configuration paramConfiguration, Locale paramLocale)
    {
      paramConfiguration.setLocale(paramLocale);
    }
  }
  
  public static final class g
  {
    public static String a(Locale paramLocale)
    {
      return paramLocale.toLanguageTag();
    }
  }
  
  public static final class h
  {
    public static void a(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
    {
      LocaleList localLocaleList = paramConfiguration1.getLocales();
      paramConfiguration1 = paramConfiguration2.getLocales();
      if (!localLocaleList.equals(paramConfiguration1))
      {
        paramConfiguration3.setLocales(paramConfiguration1);
        locale = locale;
      }
    }
    
    public static a0.i b(Configuration paramConfiguration)
    {
      return a0.i.b(paramConfiguration.getLocales().toLanguageTags());
    }
    
    public static void c(a0.i parami)
    {
      LocaleList.setDefault(LocaleList.forLanguageTags(a.a()));
    }
    
    public static void d(Configuration paramConfiguration, a0.i parami)
    {
      paramConfiguration.setLocales(LocaleList.forLanguageTags(a.a()));
    }
  }
  
  public static final class i
  {
    public static void a(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
    {
      int i = colorMode;
      int j = colorMode & 0x3;
      if ((i & 0x3) != j) {
        colorMode |= j;
      }
      j = colorMode;
      i = colorMode & 0xC;
      if ((j & 0xC) != i) {
        colorMode |= i;
      }
    }
  }
  
  public static final class j
  {
    public static OnBackInvokedDispatcher a(Activity paramActivity)
    {
      return paramActivity.getOnBackInvokedDispatcher();
    }
    
    public static OnBackInvokedCallback b(Object paramObject, g paramg)
    {
      Objects.requireNonNull(paramg);
      paramg = new l(paramg);
      ((OnBackInvokedDispatcher)paramObject).registerOnBackInvokedCallback(1000000, paramg);
      return paramg;
    }
    
    public static void c(Object paramObject1, Object paramObject2)
    {
      paramObject2 = (OnBackInvokedCallback)paramObject2;
      ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
    }
  }
  
  public final class k
    extends j.h
  {
    public g.c b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    public k(Window.Callback paramCallback)
    {
      super();
    }
    
    public final void a(Window.Callback paramCallback)
    {
      try
      {
        c = true;
        paramCallback.onContentChanged();
        return;
      }
      finally
      {
        c = false;
      }
    }
    
    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      if (d) {
        return a.dispatchKeyEvent(paramKeyEvent);
      }
      boolean bool;
      if ((!L(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      boolean bool1 = super.dispatchKeyShortcutEvent(paramKeyEvent);
      boolean bool2 = false;
      if (!bool1)
      {
        g localg = g.this;
        int i = paramKeyEvent.getKeyCode();
        localg.T();
        Object localObject = w;
        if ((localObject == null) || (!((a)localObject).k(i, paramKeyEvent)))
        {
          localObject = V;
          if ((localObject != null) && (localg.X((g.p)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent)))
          {
            paramKeyEvent = V;
            if (paramKeyEvent != null) {
              l = true;
            }
          }
          else
          {
            if (V != null) {
              break label154;
            }
            localObject = localg.R(0);
            localg.Y((g.p)localObject, paramKeyEvent);
            bool1 = localg.X((g.p)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
            k = false;
            if (!bool1) {
              break label154;
            }
          }
        }
        i = 1;
        break label157;
        label154:
        i = 0;
        label157:
        if (i == 0) {}
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    }
    
    public final void onContentChanged()
    {
      if (c) {
        a.onContentChanged();
      }
    }
    
    public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof androidx.appcompat.view.menu.f))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public final View onCreatePanelView(int paramInt)
    {
      Object localObject = b;
      if (localObject != null)
      {
        localObject = (u.e)localObject;
        if (paramInt == 0) {
          localObject = new View(a.a.getContext());
        } else {
          localObject = null;
        }
        if (localObject != null) {
          return (View)localObject;
        }
      }
      return super.onCreatePanelView(paramInt);
    }
    
    public final boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      paramMenu = g.this;
      if (paramInt == 108)
      {
        paramMenu.T();
        paramMenu = w;
        if (paramMenu != null) {
          paramMenu.c(true);
        }
      }
      else
      {
        paramMenu.getClass();
      }
      return true;
    }
    
    public final void onPanelClosed(int paramInt, Menu paramMenu)
    {
      if (e)
      {
        a.onPanelClosed(paramInt, paramMenu);
        return;
      }
      super.onPanelClosed(paramInt, paramMenu);
      paramMenu = g.this;
      if (paramInt == 108)
      {
        paramMenu.T();
        paramMenu = w;
        if (paramMenu != null) {
          paramMenu.c(false);
        }
      }
      else if (paramInt == 0)
      {
        g.p localp = paramMenu.R(paramInt);
        if (m) {
          paramMenu.J(localp, false);
        }
      }
      else
      {
        paramMenu.getClass();
      }
    }
    
    public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      androidx.appcompat.view.menu.f localf;
      if ((paramMenu instanceof androidx.appcompat.view.menu.f)) {
        localf = (androidx.appcompat.view.menu.f)paramMenu;
      } else {
        localf = null;
      }
      if ((paramInt == 0) && (localf == null)) {
        return false;
      }
      if (localf != null) {
        y = true;
      }
      Object localObject = b;
      if (localObject != null)
      {
        localObject = (u.e)localObject;
        if (paramInt == 0)
        {
          localObject = a;
          if (!d)
          {
            a.m = true;
            d = true;
          }
        }
      }
      boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      if (localf != null) {
        y = false;
      }
      return bool;
    }
    
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
    {
      androidx.appcompat.view.menu.f localf = R(0).h;
      if (localf != null) {
        super.onProvideKeyboardShortcuts(paramList, localf, paramInt);
      } else {
        super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
      }
    }
    
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      return null;
    }
    
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
    {
      Object localObject = g.this;
      if ((H) && (paramInt == 0))
      {
        localObject = new e.a(s, paramCallback);
        paramCallback = D((a.a)localObject);
        if (paramCallback != null) {
          paramCallback = ((e.a)localObject).e(paramCallback);
        } else {
          paramCallback = null;
        }
        return paramCallback;
      }
      return super.onWindowStartingActionMode(paramCallback, paramInt);
    }
  }
  
  public final class l
    extends g.m
  {
    public final PowerManager c;
    
    public l(Context paramContext)
    {
      super();
      c = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    }
    
    public final IntentFilter b()
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
      return localIntentFilter;
    }
    
    public final int c()
    {
      int i;
      if (c.isPowerSaveMode()) {
        i = 2;
      } else {
        i = 1;
      }
      return i;
    }
    
    public final void d()
    {
      E(true, true);
    }
  }
  
  public abstract class m
  {
    public a a;
    
    public m() {}
    
    public final void a()
    {
      a locala = a;
      if (locala != null) {}
      try
      {
        s.unregisterReceiver(locala);
        a = null;
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
    
    public abstract IntentFilter b();
    
    public abstract int c();
    
    public abstract void d();
    
    public final void e()
    {
      a();
      IntentFilter localIntentFilter = b();
      if ((localIntentFilter != null) && (localIntentFilter.countActions() != 0))
      {
        if (a == null) {
          a = new a();
        }
        s.registerReceiver(a, localIntentFilter);
      }
    }
    
    public final class a
      extends BroadcastReceiver
    {
      public a() {}
      
      public final void onReceive(Context paramContext, Intent paramIntent)
      {
        d();
      }
    }
  }
  
  public final class n
    extends g.m
  {
    public final w c;
    
    public n(w paramw)
    {
      super();
      c = paramw;
    }
    
    public final IntentFilter b()
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.TIME_SET");
      localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      localIntentFilter.addAction("android.intent.action.TIME_TICK");
      return localIntentFilter;
    }
    
    public final int c()
    {
      w localw = c;
      w.a locala1 = c;
      long l1 = b;
      long l2 = System.currentTimeMillis();
      boolean bool1 = false;
      boolean bool2 = false;
      int i = 1;
      if (l1 > l2) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0)
      {
        j = x6.b.F(a, "android.permission.ACCESS_COARSE_LOCATION");
        Object localObject1 = null;
        w.a locala2;
        if (j == 0) {
          try
          {
            if (b.isProviderEnabled("network")) {
              Location localLocation = b.getLastKnownLocation("network");
            }
          }
          catch (Exception localException1)
          {
            Log.d("TwilightManager", "Failed to get last known location", localException1);
            locala2 = null;
          }
        } else {
          locala2 = null;
        }
        Object localObject2 = localObject1;
        Object localObject3;
        if (x6.b.F(a, "android.permission.ACCESS_FINE_LOCATION") == 0)
        {
          localObject2 = localObject1;
          try
          {
            if (b.isProviderEnabled("gps")) {
              localObject2 = b.getLastKnownLocation("gps");
            }
          }
          catch (Exception localException2)
          {
            Log.d("TwilightManager", "Failed to get last known location", localException2);
            localObject3 = localObject1;
          }
        }
        if ((localObject3 != null) && (locala2 != null))
        {
          localObject1 = locala2;
          if (((Location)localObject3).getTime() <= locala2.getTime()) {
            break label225;
          }
        }
        else
        {
          localObject1 = locala2;
          if (localObject3 == null) {
            break label225;
          }
        }
        localObject1 = localObject3;
        label225:
        if (localObject1 != null)
        {
          locala2 = c;
          l2 = System.currentTimeMillis();
          if (v.d == null) {
            v.d = new v();
          }
          localObject3 = v.d;
          ((v)localObject3).a(l2 - 86400000L, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
          ((v)localObject3).a(l2, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
          if (c == 1) {
            bool2 = true;
          }
          long l3 = b;
          long l4 = a;
          ((v)localObject3).a(l2 + 86400000L, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
          l1 = b;
          if ((l3 != -1L) && (l4 != -1L))
          {
            if (l2 > l4) {
              l2 = l1 + 0L;
            } else if (l2 > l3) {
              l2 = l4 + 0L;
            } else {
              l2 = l3 + 0L;
            }
            l2 += 60000L;
          }
          else
          {
            l2 = 43200000L + l2;
          }
          a = bool2;
          b = l2;
        }
      }
      else
      {
        bool2 = a;
        break label494;
      }
      Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
      int j = Calendar.getInstance().get(11);
      if (j >= 6)
      {
        bool2 = bool1;
        if (j < 22) {}
      }
      else
      {
        bool2 = true;
      }
      label494:
      j = i;
      if (bool2) {
        j = 2;
      }
      return j;
    }
    
    public final void d()
    {
      E(true, true);
    }
  }
  
  public final class o
    extends ContentFrameLayout
  {
    public o(j.c paramc)
    {
      super(null);
    }
    
    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if ((!L(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (paramMotionEvent.getAction() == 0)
      {
        int i = (int)paramMotionEvent.getX();
        int j = (int)paramMotionEvent.getY();
        if ((i >= -5) && (j >= -5) && (i <= getWidth() + 5) && (j <= getHeight() + 5)) {
          j = 0;
        } else {
          j = 1;
        }
        if (j != 0)
        {
          paramMotionEvent = g.this;
          paramMotionEvent.J(paramMotionEvent.R(0), true);
          return true;
        }
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public final void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(x6.b.X(getContext(), paramInt));
    }
  }
  
  public static final class p
  {
    public int a;
    public int b;
    public int c;
    public int d;
    public g.o e;
    public View f;
    public View g;
    public androidx.appcompat.view.menu.f h;
    public androidx.appcompat.view.menu.d i;
    public j.c j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Bundle p;
    
    public p(int paramInt)
    {
      a = paramInt;
      n = false;
    }
  }
  
  public final class q
    implements j.a
  {
    public q() {}
    
    public final void b(androidx.appcompat.view.menu.f paramf, boolean paramBoolean)
    {
      androidx.appcompat.view.menu.f localf = paramf.k();
      int i = 0;
      int j;
      if (localf != paramf) {
        j = 1;
      } else {
        j = 0;
      }
      g localg = g.this;
      if (j != 0) {
        paramf = localf;
      }
      g.p[] arrayOfp = U;
      int k;
      if (arrayOfp != null) {
        k = arrayOfp.length;
      } else {
        k = 0;
      }
      while (i < k)
      {
        localg = arrayOfp[i];
        if ((localg != null) && (h == paramf))
        {
          paramf = localg;
          break label100;
        }
        i++;
      }
      paramf = null;
      label100:
      if (paramf != null)
      {
        localg = g.this;
        if (j != 0)
        {
          localg.H(a, paramf, localf);
          J(paramf, true);
        }
        else
        {
          localg.J(paramf, paramBoolean);
        }
      }
    }
    
    public final boolean c(androidx.appcompat.view.menu.f paramf)
    {
      if (paramf == paramf.k())
      {
        Object localObject = g.this;
        if (O)
        {
          localObject = ((g)localObject).S();
          if ((localObject != null) && (!Z)) {
            ((Window.Callback)localObject).onMenuOpened(108, paramf);
          }
        }
      }
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     g.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */