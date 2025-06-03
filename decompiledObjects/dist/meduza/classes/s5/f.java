package s5;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import h5.a.a;

public final class f
{
  public static void a(a.a parama)
  {
    parama.k = -3.4028235E38F;
    j = Integer.MIN_VALUE;
    Object localObject = a;
    if ((localObject instanceof Spanned))
    {
      if (!(localObject instanceof Spannable)) {
        a = SpannableString.valueOf((CharSequence)localObject);
      }
      parama = a;
      parama.getClass();
      localObject = (Spannable)parama;
      for (parama : ((Spanned)localObject).getSpans(0, ((CharSequence)localObject).length(), Object.class))
      {
        int k;
        if ((!(parama instanceof AbsoluteSizeSpan)) && (!(parama instanceof RelativeSizeSpan))) {
          k = 0;
        } else {
          k = 1;
        }
        if (k != 0) {
          ((Spannable)localObject).removeSpan(parama);
        }
      }
    }
  }
  
  public static float b(float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramFloat == -3.4028235E38F) {
      return -3.4028235E38F;
    }
    if (paramInt1 != 0) {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2) {
          return -3.4028235E38F;
        }
        return paramFloat;
      }
    }
    for (float f = paramInt2;; f = paramInt3) {
      return paramFloat * f;
    }
  }
}

/* Location:
 * Qualified Name:     s5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */