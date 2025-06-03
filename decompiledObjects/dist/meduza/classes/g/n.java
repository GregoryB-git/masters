package g;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.app.b;
import b.l;
import e0.i;
import j.a;
import j.a.a;

public class n
  extends l
  implements d
{
  public g d;
  public final m e = new m((b)this);
  
  public n(Context paramContext, int paramInt)
  {
    super(paramContext, i);
    f localf = c();
    int i = paramInt;
    if (paramInt == 0)
    {
      localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(2130968697, localTypedValue, true);
      i = resourceId;
    }
    c0 = i;
    localf.o();
  }
  
  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    c().c(paramView, paramLayoutParams);
  }
  
  public final f c()
  {
    if (d == null)
    {
      r.a locala = f.a;
      d = new g(getContext(), getWindow(), this, this);
    }
    return d;
  }
  
  public final boolean d(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void dismiss()
  {
    super.dismiss();
    c().p();
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    return i.b(e, localView, this, paramKeyEvent);
  }
  
  public final <T extends View> T findViewById(int paramInt)
  {
    return c().e(paramInt);
  }
  
  public final void invalidateOptionsMenu()
  {
    c().l();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    c().k();
    super.onCreate(paramBundle);
    c().o();
  }
  
  public final void onStop()
  {
    super.onStop();
    c().u();
  }
  
  public final void onSupportActionModeFinished(a parama) {}
  
  public final void onSupportActionModeStarted(a parama) {}
  
  public final a onWindowStartingSupportActionMode(a.a parama)
  {
    return null;
  }
  
  public final void setContentView(int paramInt)
  {
    c().x(paramInt);
  }
  
  public final void setContentView(View paramView)
  {
    c().y(paramView);
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    c().z(paramView, paramLayoutParams);
  }
  
  public final void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    c().C(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    c().C(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     g.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */