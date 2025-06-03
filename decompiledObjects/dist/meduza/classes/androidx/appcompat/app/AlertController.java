package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b.a0;
import g.f;
import g.n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class AlertController
{
  public TextView A;
  public TextView B;
  public View C;
  public ListAdapter D;
  public int E = -1;
  public int F;
  public int G;
  public int H;
  public int I;
  public int J;
  public boolean K;
  public c L;
  public final a M = new a();
  public final Context a;
  public final n b;
  public final Window c;
  public final int d;
  public CharSequence e;
  public CharSequence f;
  public RecycleListView g;
  public View h;
  public int i;
  public boolean j = false;
  public Button k;
  public CharSequence l;
  public Message m;
  public Drawable n;
  public Button o;
  public CharSequence p;
  public Message q;
  public Drawable r;
  public Button s;
  public CharSequence t;
  public Message u;
  public Drawable v;
  public NestedScrollView w;
  public int x = 0;
  public Drawable y;
  public ImageView z;
  
  public AlertController(Context paramContext, n paramn, Window paramWindow)
  {
    a = paramContext;
    b = paramn;
    c = paramWindow;
    L = new c(paramn);
    paramContext = paramContext.obtainStyledAttributes(null, a0.r, 2130968618, 0);
    F = paramContext.getResourceId(0, 0);
    G = paramContext.getResourceId(2, 0);
    H = paramContext.getResourceId(4, 0);
    paramContext.getResourceId(5, 0);
    I = paramContext.getResourceId(7, 0);
    J = paramContext.getResourceId(3, 0);
    K = paramContext.getBoolean(6, true);
    d = paramContext.getDimensionPixelSize(1, 0);
    paramContext.recycle();
    paramn.c().w(1);
  }
  
  public static boolean a(View paramView)
  {
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i1 = paramView.getChildCount();
    while (i1 > 0)
    {
      int i2 = i1 - 1;
      i1 = i2;
      if (a(paramView.getChildAt(i2))) {
        return true;
      }
    }
    return false;
  }
  
  public static void b(View paramView1, View paramView2, View paramView3)
  {
    int i1 = 0;
    int i2;
    if (paramView2 != null)
    {
      if (paramView1.canScrollVertically(-1)) {
        i2 = 0;
      } else {
        i2 = 4;
      }
      paramView2.setVisibility(i2);
    }
    if (paramView3 != null)
    {
      if (paramView1.canScrollVertically(1)) {
        i2 = i1;
      } else {
        i2 = 4;
      }
      paramView3.setVisibility(i2);
    }
  }
  
  public static ViewGroup c(View paramView1, View paramView2)
  {
    if (paramView1 == null)
    {
      paramView1 = paramView2;
      if ((paramView2 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView2).inflate();
      }
      return (ViewGroup)paramView1;
    }
    if (paramView2 != null)
    {
      ViewParent localViewParent = paramView2.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(paramView2);
      }
    }
    paramView2 = paramView1;
    if ((paramView1 instanceof ViewStub)) {
      paramView2 = ((ViewStub)paramView1).inflate();
    }
    return (ViewGroup)paramView2;
  }
  
  public final void d(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (paramOnClickListener != null) {
      paramOnClickListener = L.obtainMessage(paramInt, paramOnClickListener);
    } else {
      paramOnClickListener = null;
    }
    if (paramInt != -3)
    {
      if (paramInt != -2)
      {
        if (paramInt == -1)
        {
          l = paramCharSequence;
          m = paramOnClickListener;
          n = null;
        }
        else
        {
          throw new IllegalArgumentException("Button does not exist");
        }
      }
      else
      {
        p = paramCharSequence;
        q = paramOnClickListener;
        r = null;
      }
    }
    else
    {
      t = paramCharSequence;
      u = paramOnClickListener;
      v = null;
    }
  }
  
  public static class RecycleListView
    extends ListView
  {
    public final int a;
    public final int b;
    
    public RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.G);
      b = paramContext.getDimensionPixelOffset(0, -1);
      a = paramContext.getDimensionPixelOffset(1, -1);
    }
  }
  
  public final class a
    implements View.OnClickListener
  {
    public a() {}
    
    public final void onClick(View paramView)
    {
      AlertController localAlertController = AlertController.this;
      Message localMessage;
      if (paramView == k)
      {
        localMessage = m;
        if (localMessage != null)
        {
          paramView = localMessage;
          break label46;
        }
      }
      if (paramView == o)
      {
        localMessage = q;
        if (localMessage != null)
        {
          paramView = localMessage;
          label46:
          paramView = Message.obtain(paramView);
          break label81;
        }
      }
      if (paramView == s)
      {
        paramView = u;
        if (paramView != null)
        {
          paramView = Message.obtain(paramView);
          break label81;
        }
      }
      paramView = null;
      label81:
      if (paramView != null) {
        paramView.sendToTarget();
      }
      paramView = AlertController.this;
      L.obtainMessage(1, b).sendToTarget();
    }
  }
  
  public static final class b
  {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public DialogInterface.OnCancelListener k;
    public DialogInterface.OnKeyListener l;
    public ListAdapter m;
    public DialogInterface.OnClickListener n;
    public View o;
    public boolean p;
    public int q = -1;
    
    public b(ContextThemeWrapper paramContextThemeWrapper)
    {
      a = paramContextThemeWrapper;
      b = ((LayoutInflater)paramContextThemeWrapper.getSystemService("layout_inflater"));
    }
  }
  
  public static final class c
    extends Handler
  {
    public WeakReference<DialogInterface> a;
    
    public c(DialogInterface paramDialogInterface)
    {
      a = new WeakReference(paramDialogInterface);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = what;
      if ((i != -3) && (i != -2) && (i != -1))
      {
        if (i == 1) {
          ((DialogInterface)obj).dismiss();
        }
      }
      else {
        ((DialogInterface.OnClickListener)obj).onClick((DialogInterface)a.get(), what);
      }
    }
  }
  
  public static final class d
    extends ArrayAdapter<CharSequence>
  {
    public d(Context paramContext, int paramInt)
    {
      super(paramInt, 16908308, null);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final boolean hasStableIds()
    {
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */