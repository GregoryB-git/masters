package t0;

import a0.d;
import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import b0.f;
import c0.c;
import java.util.stream.IntStream;

public final class j
  implements Spannable
{
  public boolean a = false;
  public Spannable b;
  
  public j(Spannable paramSpannable)
  {
    b = paramSpannable;
  }
  
  public j(CharSequence paramCharSequence)
  {
    b = new SpannableString(paramCharSequence);
  }
  
  public final void a()
  {
    Spannable localSpannable = b;
    if (!a)
    {
      Object localObject;
      if (Build.VERSION.SDK_INT < 28) {
        localObject = new a();
      } else {
        localObject = new b();
      }
      if (((a)localObject).a(localSpannable)) {
        b = new SpannableString(localSpannable);
      }
    }
    a = true;
  }
  
  public final char charAt(int paramInt)
  {
    return b.charAt(paramInt);
  }
  
  public final IntStream chars()
  {
    return f.e(b);
  }
  
  public final IntStream codePoints()
  {
    return d.i(b);
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    return b.getSpanEnd(paramObject);
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    return b.getSpanFlags(paramObject);
  }
  
  public final int getSpanStart(Object paramObject)
  {
    return b.getSpanStart(paramObject);
  }
  
  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    return b.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public final int length()
  {
    return b.length();
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return b.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public final void removeSpan(Object paramObject)
  {
    a();
    b.removeSpan(paramObject);
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    a();
    b.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return b.subSequence(paramInt1, paramInt2);
  }
  
  public final String toString()
  {
    return b.toString();
  }
  
  public static class a
  {
    public boolean a(Spannable paramSpannable)
    {
      return paramSpannable instanceof c;
    }
  }
  
  public static final class b
    extends j.a
  {
    public final boolean a(Spannable paramSpannable)
    {
      boolean bool;
      if ((!(paramSpannable instanceof PrecomputedText)) && (!(paramSpannable instanceof c))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     t0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */