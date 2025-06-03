package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

public final class AlertController$b
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
  
  public AlertController$b(ContextThemeWrapper paramContextThemeWrapper)
  {
    a = paramContextThemeWrapper;
    b = ((LayoutInflater)paramContextThemeWrapper.getSystemService("layout_inflater"));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */