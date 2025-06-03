package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import e0.d0;
import e0.d0.e;
import g.n;

public final class b
  extends n
{
  public final AlertController f = new AlertController(getContext(), this, getWindow());
  
  public b(Context paramContext, int paramInt)
  {
    super(paramContext, e(paramContext, paramInt));
  }
  
  public static int e(Context paramContext, int paramInt)
  {
    if ((paramInt >>> 24 & 0xFF) >= 1) {
      return paramInt;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(2130968619, localTypedValue, true);
    return resourceId;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    AlertController localAlertController = f;
    int i = G;
    i = F;
    b.setContentView(i);
    paramBundle = c.findViewById(2131361990);
    Object localObject1 = paramBundle.findViewById(2131362055);
    Object localObject2 = paramBundle.findViewById(2131361887);
    Object localObject3 = paramBundle.findViewById(2131361877);
    Object localObject4 = (ViewGroup)paramBundle.findViewById(2131361889);
    paramBundle = h;
    Object localObject5 = null;
    int j = 0;
    if (paramBundle == null) {
      if (i != 0) {
        paramBundle = LayoutInflater.from(a).inflate(i, (ViewGroup)localObject4, false);
      } else {
        paramBundle = null;
      }
    }
    if (paramBundle != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) || (!AlertController.a(paramBundle))) {
      c.setFlags(131072, 131072);
    }
    if (i != 0)
    {
      localObject6 = (FrameLayout)c.findViewById(2131361888);
      ((ViewGroup)localObject6).addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
      if (j) {
        ((View)localObject6).setPadding(0, 0, 0, 0);
      }
      if (g != null) {
        getLayoutParamsweight = 0.0F;
      }
    }
    else
    {
      ((View)localObject4).setVisibility(8);
    }
    View localView = ((View)localObject4).findViewById(2131362055);
    Object localObject6 = ((View)localObject4).findViewById(2131361887);
    paramBundle = ((View)localObject4).findViewById(2131361877);
    localObject1 = AlertController.c(localView, (View)localObject1);
    localObject2 = AlertController.c((View)localObject6, (View)localObject2);
    localObject3 = AlertController.c(paramBundle, (View)localObject3);
    paramBundle = (NestedScrollView)c.findViewById(2131362003);
    w = paramBundle;
    paramBundle.setFocusable(false);
    w.setNestedScrollingEnabled(false);
    localObject6 = (TextView)((View)localObject2).findViewById(16908299);
    B = ((TextView)localObject6);
    if (localObject6 != null)
    {
      paramBundle = f;
      if (paramBundle != null)
      {
        ((TextView)localObject6).setText(paramBundle);
      }
      else
      {
        ((View)localObject6).setVisibility(8);
        w.removeView(B);
        if (g != null)
        {
          paramBundle = (ViewGroup)w.getParent();
          i = paramBundle.indexOfChild(w);
          paramBundle.removeViewAt(i);
          paramBundle.addView(g, i, new ViewGroup.LayoutParams(-1, -1));
        }
        else
        {
          ((View)localObject2).setVisibility(8);
        }
      }
    }
    paramBundle = (Button)((View)localObject3).findViewById(16908313);
    k = paramBundle;
    paramBundle.setOnClickListener(M);
    if ((TextUtils.isEmpty(l)) && (n == null))
    {
      k.setVisibility(8);
      i = 0;
    }
    else
    {
      k.setText(l);
      paramBundle = n;
      if (paramBundle != null)
      {
        i = d;
        paramBundle.setBounds(0, 0, i, i);
        k.setCompoundDrawables(n, null, null, null);
      }
      k.setVisibility(0);
      i = 1;
    }
    paramBundle = (Button)((View)localObject3).findViewById(16908314);
    o = paramBundle;
    paramBundle.setOnClickListener(M);
    int k;
    if ((TextUtils.isEmpty(p)) && (r == null))
    {
      o.setVisibility(8);
    }
    else
    {
      o.setText(p);
      paramBundle = r;
      if (paramBundle != null)
      {
        k = d;
        paramBundle.setBounds(0, 0, k, k);
        o.setCompoundDrawables(r, null, null, null);
      }
      o.setVisibility(0);
      i |= 0x2;
    }
    paramBundle = (Button)((View)localObject3).findViewById(16908315);
    s = paramBundle;
    paramBundle.setOnClickListener(M);
    if ((TextUtils.isEmpty(t)) && (v == null))
    {
      s.setVisibility(8);
    }
    else
    {
      s.setText(t);
      paramBundle = v;
      if (paramBundle != null)
      {
        k = d;
        paramBundle.setBounds(0, 0, k, k);
        s.setCompoundDrawables(v, null, null, null);
      }
      s.setVisibility(0);
      i |= 0x4;
    }
    localObject6 = a;
    paramBundle = new TypedValue();
    ((Context)localObject6).getTheme().resolveAttribute(2130968617, paramBundle, true);
    if (data != 0) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      if (i == 1)
      {
        paramBundle = k;
      }
      else if (i == 2)
      {
        paramBundle = o;
      }
      else
      {
        if (i != 4) {
          break label894;
        }
        paramBundle = s;
      }
      localObject6 = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
      gravity = 1;
      weight = 0.5F;
      paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject6);
    }
    label894:
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      ((View)localObject3).setVisibility(8);
    }
    if (C != null)
    {
      paramBundle = new ViewGroup.LayoutParams(-1, -2);
      ((ViewGroup)localObject1).addView(C, 0, paramBundle);
      paramBundle = c.findViewById(2131362053);
    }
    else
    {
      z = ((ImageView)c.findViewById(16908294));
      if (((TextUtils.isEmpty(e) ^ true)) && (K))
      {
        paramBundle = (TextView)c.findViewById(2131361860);
        A = paramBundle;
        paramBundle.setText(e);
        i = x;
        if (i != 0)
        {
          z.setImageResource(i);
          break label1142;
        }
        paramBundle = y;
        if (paramBundle != null)
        {
          z.setImageDrawable(paramBundle);
          break label1142;
        }
        A.setPadding(z.getPaddingLeft(), z.getPaddingTop(), z.getPaddingRight(), z.getPaddingBottom());
        z.setVisibility(8);
        break label1142;
      }
      c.findViewById(2131362053).setVisibility(8);
      z.setVisibility(8);
      paramBundle = (Bundle)localObject1;
    }
    paramBundle.setVisibility(8);
    label1142:
    if (((View)localObject4).getVisibility() != 8) {
      i = 1;
    } else {
      i = 0;
    }
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8)) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (((View)localObject3).getVisibility() != 8) {
      m = 1;
    } else {
      m = 0;
    }
    if (m == 0)
    {
      paramBundle = ((View)localObject2).findViewById(2131362047);
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
    }
    if (k != 0)
    {
      paramBundle = w;
      if (paramBundle != null) {
        paramBundle.setClipToPadding(true);
      }
      if (f == null)
      {
        paramBundle = (Bundle)localObject5;
        if (g == null) {}
      }
      else
      {
        paramBundle = ((View)localObject1).findViewById(2131362052);
      }
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
    }
    else
    {
      paramBundle = ((View)localObject2).findViewById(2131362048);
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
    }
    paramBundle = g;
    if ((paramBundle instanceof AlertController.RecycleListView)) {
      if ((m != 0) && (k != 0))
      {
        paramBundle.getClass();
      }
      else
      {
        int n = paramBundle.getPaddingLeft();
        int i1;
        if (k != 0) {
          i1 = paramBundle.getPaddingTop();
        } else {
          i1 = a;
        }
        int i2 = paramBundle.getPaddingRight();
        int i3;
        if (m != 0) {
          i3 = paramBundle.getPaddingBottom();
        } else {
          i3 = b;
        }
        paramBundle.setPadding(n, i1, i2, i3);
      }
    }
    if (i == 0)
    {
      paramBundle = g;
      if (paramBundle == null) {
        paramBundle = w;
      }
      if (paramBundle != null)
      {
        i = j;
        if (m != 0) {
          i = 2;
        }
        localObject4 = c.findViewById(2131362002);
        localObject5 = c.findViewById(2131362001);
        localObject1 = d0.a;
        d0.e.d(paramBundle, k | i, 3);
        if (localObject4 != null) {
          ((ViewGroup)localObject2).removeView((View)localObject4);
        }
        if (localObject5 != null) {
          ((ViewGroup)localObject2).removeView((View)localObject5);
        }
      }
    }
    localObject5 = g;
    if (localObject5 != null)
    {
      paramBundle = D;
      if (paramBundle != null)
      {
        ((ListView)localObject5).setAdapter(paramBundle);
        i = E;
        if (i > -1)
        {
          ((AbsListView)localObject5).setItemChecked(i, true);
          ((ListView)localObject5).setSelection(i);
        }
      }
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = f.w;
    int i;
    if ((localNestedScrollView != null) && (localNestedScrollView.e(paramKeyEvent))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = f.w;
    int i;
    if ((localNestedScrollView != null) && (localNestedScrollView.e(paramKeyEvent))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    Object localObject = f;
    e = paramCharSequence;
    localObject = A;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
  }
  
  public static final class a
  {
    public final AlertController.b a;
    public final int b;
    
    public a(Context paramContext)
    {
      this(paramContext, b.e(paramContext, 0));
    }
    
    public a(Context paramContext, int paramInt)
    {
      a = new AlertController.b(new ContextThemeWrapper(paramContext, b.e(paramContext, paramInt)));
      b = paramInt;
    }
    
    public b create()
    {
      b localb = new b(a.a, b);
      AlertController.b localb1 = a;
      AlertController localAlertController = f;
      Object localObject1 = e;
      if (localObject1 != null)
      {
        C = ((View)localObject1);
      }
      else
      {
        localObject1 = d;
        if (localObject1 != null)
        {
          e = ((CharSequence)localObject1);
          localObject2 = A;
          if (localObject2 != null) {
            ((TextView)localObject2).setText((CharSequence)localObject1);
          }
        }
        localObject2 = c;
        if (localObject2 != null)
        {
          y = ((Drawable)localObject2);
          x = 0;
          localObject1 = z;
          if (localObject1 != null)
          {
            ((ImageView)localObject1).setVisibility(0);
            z.setImageDrawable((Drawable)localObject2);
          }
        }
      }
      Object localObject2 = f;
      if (localObject2 != null)
      {
        f = ((CharSequence)localObject2);
        localObject1 = B;
        if (localObject1 != null) {
          ((TextView)localObject1).setText((CharSequence)localObject2);
        }
      }
      localObject1 = g;
      if (localObject1 != null) {
        localAlertController.d(-1, (CharSequence)localObject1, h);
      }
      localObject1 = i;
      if (localObject1 != null) {
        localAlertController.d(-2, (CharSequence)localObject1, j);
      }
      if (m != null)
      {
        localObject2 = (AlertController.RecycleListView)b.inflate(H, null);
        int i;
        if (p) {
          i = I;
        } else {
          i = J;
        }
        localObject1 = m;
        if (localObject1 == null) {
          localObject1 = new AlertController.d(a, i);
        }
        D = ((ListAdapter)localObject1);
        E = q;
        if (n != null) {
          ((AdapterView)localObject2).setOnItemClickListener(new a(localb1, localAlertController));
        }
        if (p) {
          ((AbsListView)localObject2).setChoiceMode(1);
        }
        g = ((AlertController.RecycleListView)localObject2);
      }
      localObject1 = o;
      if (localObject1 != null)
      {
        h = ((View)localObject1);
        i = 0;
        j = false;
      }
      a.getClass();
      localb.setCancelable(true);
      a.getClass();
      localb.setCanceledOnTouchOutside(true);
      localb.setOnCancelListener(a.k);
      a.getClass();
      localb.setOnDismissListener(null);
      localObject1 = a.l;
      if (localObject1 != null) {
        localb.setOnKeyListener((DialogInterface.OnKeyListener)localObject1);
      }
      return localb;
    }
    
    public Context getContext()
    {
      return a.a;
    }
    
    public a setNegativeButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.b localb = a;
      i = a.getText(paramInt);
      a.j = paramOnClickListener;
      return this;
    }
    
    public a setPositiveButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.b localb = a;
      g = a.getText(paramInt);
      a.h = paramOnClickListener;
      return this;
    }
    
    public a setTitle(CharSequence paramCharSequence)
    {
      a.d = paramCharSequence;
      return this;
    }
    
    public a setView(View paramView)
    {
      a.o = paramView;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */