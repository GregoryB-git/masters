package l;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;
import e0.d0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import w.f.e;

public final class b0$a
  extends f.e
{
  public b0$a(b0 paramb0, int paramInt1, int paramInt2, WeakReference paramWeakReference) {}
  
  public final void c(Typeface paramTypeface)
  {
    Typeface localTypeface = paramTypeface;
    if (Build.VERSION.SDK_INT >= 28)
    {
      int i = a;
      localTypeface = paramTypeface;
      if (i != -1)
      {
        boolean bool;
        if ((b & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localTypeface = b0.f.a(paramTypeface, i, bool);
      }
    }
    paramTypeface = d;
    Object localObject = c;
    if (m)
    {
      l = localTypeface;
      TextView localTextView = (TextView)((Reference)localObject).get();
      if (localTextView != null)
      {
        localObject = d0.a;
        if (localTextView.isAttachedToWindow()) {
          localTextView.post(new c0(localTextView, localTypeface, j));
        } else {
          localTextView.setTypeface(localTypeface, j);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.b0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */