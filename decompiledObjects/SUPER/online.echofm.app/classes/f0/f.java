package f0;

import android.text.Spannable;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;

public abstract class f
{
  public static void a(Spannable paramSpannable, float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    RelativeSizeSpan[] arrayOfRelativeSizeSpan = (RelativeSizeSpan[])paramSpannable.getSpans(paramInt1, paramInt2, RelativeSizeSpan.class);
    int i = arrayOfRelativeSizeSpan.length;
    int j = 0;
    for (float f = paramFloat; j < i; f = paramFloat)
    {
      RelativeSizeSpan localRelativeSizeSpan = arrayOfRelativeSizeSpan[j];
      paramFloat = f;
      if (paramSpannable.getSpanStart(localRelativeSizeSpan) <= paramInt1)
      {
        paramFloat = f;
        if (paramSpannable.getSpanEnd(localRelativeSizeSpan) >= paramInt2) {
          paramFloat = f * localRelativeSizeSpan.getSizeChange();
        }
      }
      c(paramSpannable, localRelativeSizeSpan, paramInt1, paramInt2, paramInt3);
      j++;
    }
    paramSpannable.setSpan(new RelativeSizeSpan(f), paramInt1, paramInt2, paramInt3);
  }
  
  public static void b(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = paramSpannable.getSpans(paramInt1, paramInt2, paramObject.getClass());
    int i = arrayOfObject.length;
    for (int j = 0; j < i; j++) {
      c(paramSpannable, arrayOfObject[j], paramInt1, paramInt2, paramInt3);
    }
    paramSpannable.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public static void c(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramSpannable.getSpanStart(paramObject) == paramInt1) && (paramSpannable.getSpanEnd(paramObject) == paramInt2) && (paramSpannable.getSpanFlags(paramObject) == paramInt3)) {
      paramSpannable.removeSpan(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     f0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */