package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckedTextView;
import y.a.a;

public final class h
{
  public final CheckedTextView a;
  public ColorStateList b = null;
  public PorterDuff.Mode c = null;
  public boolean d = false;
  public boolean e = false;
  public boolean f;
  
  public h(CheckedTextView paramCheckedTextView)
  {
    a = paramCheckedTextView;
  }
  
  public final void a()
  {
    Drawable localDrawable = a.getCheckMarkDrawable();
    if ((localDrawable != null) && ((d) || (e)))
    {
      localDrawable = localDrawable.mutate();
      if (d) {
        a.a.h(localDrawable, b);
      }
      if (e) {
        a.a.i(localDrawable, c);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(a.getDrawableState());
      }
      a.setCheckMarkDrawable(localDrawable);
    }
  }
}

/* Location:
 * Qualified Name:     l.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */