package t0;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class h$a
  implements TextWatcher, SpanWatcher
{
  public final Object a;
  public final AtomicInteger b = new AtomicInteger(0);
  
  public h$a(Object paramObject)
  {
    a = paramObject;
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    ((TextWatcher)a).afterTextChanged(paramEditable);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextWatcher)a).beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
  
  public final void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    if ((b.get() > 0) && ((paramObject instanceof f))) {
      return;
    }
    ((SpanWatcher)a).onSpanAdded(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public final void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((b.get() > 0) && ((paramObject instanceof f))) {
      return;
    }
    if (Build.VERSION.SDK_INT < 28)
    {
      if (paramInt1 > paramInt2) {
        paramInt1 = 0;
      }
      if (paramInt3 > paramInt4) {
        paramInt3 = 0;
      } else {}
    }
    ((SpanWatcher)a).onSpanChanged(paramSpannable, paramObject, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    if ((b.get() > 0) && ((paramObject instanceof f))) {
      return;
    }
    ((SpanWatcher)a).onSpanRemoved(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextWatcher)a).onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
}

/* Location:
 * Qualified Name:     t0.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */