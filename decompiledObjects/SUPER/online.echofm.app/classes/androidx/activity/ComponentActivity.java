package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.d.b;
import androidx.lifecycle.d.c;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import d.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ComponentActivity
  extends w.e
  implements h, u, androidx.savedstate.c, c, androidx.activity.result.d
{
  public final c.a q = new c.a();
  public final i r = new i(this);
  public final androidx.savedstate.b s = androidx.savedstate.b.a(this);
  public t t;
  public final OnBackPressedDispatcher u = new OnBackPressedDispatcher(new a());
  public int v;
  public final AtomicInteger w = new AtomicInteger();
  public ActivityResultRegistry x = new b();
  
  public ComponentActivity()
  {
    if (g() != null)
    {
      int i = Build.VERSION.SDK_INT;
      g().a(new f()
      {
        public void a(h paramAnonymoush, d.b paramAnonymousb)
        {
          if (paramAnonymousb == d.b.ON_STOP)
          {
            paramAnonymoush = getWindow();
            if (paramAnonymoush != null) {
              paramAnonymoush = paramAnonymoush.peekDecorView();
            } else {
              paramAnonymoush = null;
            }
            if (paramAnonymoush != null) {
              paramAnonymoush.cancelPendingInputEvents();
            }
          }
        }
      });
      g().a(new f()
      {
        public void a(h paramAnonymoush, d.b paramAnonymousb)
        {
          if (paramAnonymousb == d.b.ON_DESTROY)
          {
            q.b();
            if (!isChangingConfigurations()) {
              d().a();
            }
          }
        }
      });
      g().a(new f()
      {
        public void a(h paramAnonymoush, d.b paramAnonymousb)
        {
          h();
          g().c(this);
        }
      });
      if (i <= 23) {
        g().a(new ImmLeaksCleaner(this));
      }
      return;
    }
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    i();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public final ActivityResultRegistry c()
  {
    return x;
  }
  
  public t d()
  {
    if (getApplication() != null)
    {
      h();
      return t;
    }
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public final void f(c.b paramb)
  {
    q.a(paramb);
  }
  
  public androidx.lifecycle.d g()
  {
    return r;
  }
  
  public void h()
  {
    if (t == null)
    {
      c localc = (c)getLastNonConfigurationInstance();
      if (localc != null) {
        t = b;
      }
      if (t == null) {
        t = new t();
      }
    }
  }
  
  public final void i()
  {
    v.a(getWindow().getDecorView(), this);
    w.a(getWindow().getDecorView(), this);
    androidx.savedstate.d.a(getWindow().getDecorView(), this);
  }
  
  public final OnBackPressedDispatcher j()
  {
    return u;
  }
  
  public final SavedStateRegistry k()
  {
    return s.b();
  }
  
  public Object l()
  {
    return null;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!x.b(paramInt1, paramInt2, paramIntent)) {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    u.c();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    s.c(paramBundle);
    q.c(this);
    super.onCreate(paramBundle);
    x.g(paramBundle);
    q.g(this);
    int i = v;
    if (i != 0) {
      setContentView(i);
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (!x.b(paramInt, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfInt))) {
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    Object localObject1 = l();
    Object localObject2 = t;
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      c localc = (c)getLastNonConfigurationInstance();
      localObject3 = localObject2;
      if (localc != null) {
        localObject3 = b;
      }
    }
    if ((localObject3 == null) && (localObject1 == null)) {
      return null;
    }
    localObject2 = new c();
    a = localObject1;
    b = ((t)localObject3);
    return localObject2;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    androidx.lifecycle.d locald = g();
    if ((locald instanceof i)) {
      ((i)locald).o(d.c.q);
    }
    super.onSaveInstanceState(paramBundle);
    s.d(paramBundle);
    x.h(paramBundle);
  }
  
  public void reportFullyDrawn()
  {
    try
    {
      if (t1.b.h())
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("reportFullyDrawn() for ");
        localStringBuilder.append(getComponentName());
        t1.b.c(localStringBuilder.toString());
      }
    }
    finally
    {
      break label53;
    }
    super.reportFullyDrawn();
    t1.b.f();
    return;
    label53:
    t1.b.f();
    throw ((Throwable)localObject);
  }
  
  public void setContentView(int paramInt)
  {
    i();
    super.setContentView(paramInt);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView)
  {
    i();
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    i();
    super.setContentView(paramView, paramLayoutParams);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      try
      {
        ComponentActivity.e(ComponentActivity.this);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        if (!TextUtils.equals(localIllegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState")) {
          break label24;
        }
      }
      return;
      label24:
      throw localIllegalStateException;
    }
  }
  
  public class b
    extends ActivityResultRegistry
  {
    public b() {}
    
    public void f(final int paramInt, final d.a parama, Object paramObject, w.b paramb)
    {
      paramb = ComponentActivity.this;
      final Object localObject = parama.b(paramb, paramObject);
      if (localObject != null)
      {
        new Handler(Looper.getMainLooper()).post(new a(paramInt, (a.a)localObject));
        return;
      }
      paramObject = parama.a(paramb, paramObject);
      if (((Intent)paramObject).hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
      {
        parama = ((Intent)paramObject).getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        ((Intent)paramObject).removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      }
      else
      {
        parama = null;
      }
      if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(((Intent)paramObject).getAction()))
      {
        localObject = ((Intent)paramObject).getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (localObject == null) {
          return;
        }
        paramObject = new ArrayList();
        int i = localObject.length;
        for (int j = 0; j < i; j++)
        {
          parama = localObject[j];
          if (checkPermission(parama, Process.myPid(), Process.myUid()) != 0) {
            ((List)paramObject).add(parama);
          }
        }
        if (!((List)paramObject).isEmpty()) {
          w.a.l(paramb, (String[])((List)paramObject).toArray(new String[0]), paramInt);
        }
      }
      else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(((Intent)paramObject).getAction()))
      {
        paramObject = (androidx.activity.result.e)((Intent)paramObject).getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try
        {
          w.a.o(paramb, ((androidx.activity.result.e)paramObject).d(), paramInt, ((androidx.activity.result.e)paramObject).a(), ((androidx.activity.result.e)paramObject).b(), ((androidx.activity.result.e)paramObject).c(), 0, parama);
        }
        catch (IntentSender.SendIntentException parama)
        {
          new Handler(Looper.getMainLooper()).post(new b(paramInt, parama));
        }
      }
      else
      {
        w.a.n(paramb, (Intent)paramObject, paramInt, parama);
      }
    }
    
    public class a
      implements Runnable
    {
      public a(int paramInt, a.a parama) {}
      
      public void run()
      {
        c(paramInt, localObject.a());
      }
    }
    
    public class b
      implements Runnable
    {
      public b(int paramInt, IntentSender.SendIntentException paramSendIntentException) {}
      
      public void run()
      {
        b(paramInt, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", parama));
      }
    }
  }
  
  public static final class c
  {
    public Object a;
    public t b;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */