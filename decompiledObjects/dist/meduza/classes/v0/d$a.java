package v0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.d.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class d$a
  extends d.e
{
  public final WeakReference a;
  public final WeakReference b;
  
  public d$a(TextView paramTextView, d paramd)
  {
    a = new WeakReference(paramTextView);
    b = new WeakReference(paramd);
  }
  
  public final void a()
  {
    Object localObject1 = (TextView)a.get();
    Object localObject2 = (InputFilter)b.get();
    Object localObject3;
    if ((localObject2 != null) && (localObject1 != null))
    {
      localObject3 = ((TextView)localObject1).getFilters();
      if (localObject3 != null) {
        for (i = 0; i < localObject3.length; i++) {
          if (localObject3[i] == localObject2)
          {
            i = 1;
            break label78;
          }
        }
      }
    }
    int i = 0;
    label78:
    if (i == 0) {
      return;
    }
    if (((View)localObject1).isAttachedToWindow())
    {
      localObject3 = ((TextView)localObject1).getText();
      localObject2 = androidx.emoji2.text.d.a();
      if (localObject3 == null)
      {
        i = 0;
      }
      else
      {
        localObject2.getClass();
        i = ((CharSequence)localObject3).length();
      }
      localObject2 = ((androidx.emoji2.text.d)localObject2).f((CharSequence)localObject3, 0, i);
      if (localObject3 == localObject2) {
        return;
      }
      int j = Selection.getSelectionStart((CharSequence)localObject2);
      i = Selection.getSelectionEnd((CharSequence)localObject2);
      ((TextView)localObject1).setText((CharSequence)localObject2);
      if ((localObject2 instanceof Spannable))
      {
        localObject1 = (Spannable)localObject2;
        if ((j >= 0) && (i >= 0)) {
          Selection.setSelection((Spannable)localObject1, j, i);
        } else if (j >= 0) {
          Selection.setSelection((Spannable)localObject1, j);
        } else if (i >= 0) {
          Selection.setSelection((Spannable)localObject1, i);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     v0.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */