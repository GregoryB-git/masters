package l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController.b;
import androidx.appcompat.app.b;
import androidx.appcompat.app.b.a;
import g.n;

public final class z$e
  implements z.i, DialogInterface.OnClickListener
{
  public b a;
  public ListAdapter b;
  public CharSequence c;
  
  public z$e(z paramz) {}
  
  public final boolean a()
  {
    b localb = a;
    boolean bool;
    if (localb != null) {
      bool = localb.isShowing();
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final void d(int paramInt)
  {
    Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
  }
  
  public final void dismiss()
  {
    b localb = a;
    if (localb != null)
    {
      localb.dismiss();
      a = null;
    }
  }
  
  public final CharSequence e()
  {
    return c;
  }
  
  public final Drawable g()
  {
    return null;
  }
  
  public final void i(CharSequence paramCharSequence)
  {
    c = paramCharSequence;
  }
  
  public final void j(Drawable paramDrawable)
  {
    Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
  }
  
  public final void k(int paramInt)
  {
    Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
  }
  
  public final void l(int paramInt)
  {
    Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
  }
  
  public final void m(int paramInt1, int paramInt2)
  {
    if (b == null) {
      return;
    }
    Object localObject1 = new b.a(d.getPopupContext());
    Object localObject2 = c;
    if (localObject2 != null) {
      ((b.a)localObject1).setTitle((CharSequence)localObject2);
    }
    localObject2 = b;
    int i = d.getSelectedItemPosition();
    AlertController.b localb = a;
    m = ((ListAdapter)localObject2);
    n = this;
    q = i;
    p = true;
    localObject1 = ((b.a)localObject1).create();
    a = ((b)localObject1);
    localObject1 = f.g;
    z.c.d((View)localObject1, paramInt1);
    z.c.c((View)localObject1, paramInt2);
    a.show();
  }
  
  public final int n()
  {
    return 0;
  }
  
  public final void o(ListAdapter paramListAdapter)
  {
    b = paramListAdapter;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    d.setSelection(paramInt);
    if (d.getOnItemClickListener() != null) {
      d.performItemClick(null, paramInt, b.getItemId(paramInt));
    }
    dismiss();
  }
}

/* Location:
 * Qualified Name:     l.z.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */