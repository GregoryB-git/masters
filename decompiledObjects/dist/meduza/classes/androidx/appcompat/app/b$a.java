package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public final class b$a
{
  public final AlertController.b a;
  public final int b;
  
  public b$a(Context paramContext)
  {
    this(paramContext, b.e(paramContext, 0));
  }
  
  public b$a(Context paramContext, int paramInt)
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

/* Location:
 * Qualified Name:     androidx.appcompat.app.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */