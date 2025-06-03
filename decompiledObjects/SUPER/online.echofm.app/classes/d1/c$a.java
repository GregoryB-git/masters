package d1;

import android.text.Layout.Alignment;
import f0.a;
import f0.a.b;
import java.util.Comparator;

public final class c$a
{
  public static final Comparator c = new b();
  public final a a;
  public final int b;
  
  public c$a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    paramCharSequence = new a.b().o(paramCharSequence).p(paramAlignment).h(paramFloat1, paramInt1).i(paramInt2).k(paramFloat2).l(paramInt3).n(paramFloat3);
    if (paramBoolean) {
      paramCharSequence.s(paramInt4);
    }
    a = paramCharSequence.a();
    b = paramInt5;
  }
}

/* Location:
 * Qualified Name:     d1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */