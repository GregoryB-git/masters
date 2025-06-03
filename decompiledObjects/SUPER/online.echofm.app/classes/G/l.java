package G;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.PrecomputedText.Params;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Locale;

public abstract class l
  implements Spannable
{
  public static final class a
  {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;
    public final PrecomputedText.Params e;
    
    public a(PrecomputedText.Params paramParams)
    {
      a = d.a(paramParams);
      b = e.a(paramParams);
      c = f.a(paramParams);
      d = g.a(paramParams);
      if (Build.VERSION.SDK_INT < 29) {
        paramParams = null;
      }
      e = paramParams;
    }
    
    public a(TextPaint paramTextPaint, TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT >= 29) {}
      for (PrecomputedText.Params localParams = k.a(j.a(i.a(h.a(b.a(paramTextPaint), paramInt1), paramInt2), paramTextDirectionHeuristic));; localParams = null)
      {
        e = localParams;
        break;
      }
      a = paramTextPaint;
      b = paramTextDirectionHeuristic;
      c = paramInt1;
      d = paramInt2;
    }
    
    public boolean a(a parama)
    {
      int i = Build.VERSION.SDK_INT;
      if (c != parama.b()) {
        return false;
      }
      if (d != parama.c()) {
        return false;
      }
      if (a.getTextSize() != parama.e().getTextSize()) {
        return false;
      }
      if (a.getTextScaleX() != parama.e().getTextScaleX()) {
        return false;
      }
      if (a.getTextSkewX() != parama.e().getTextSkewX()) {
        return false;
      }
      if (a.getLetterSpacing() != parama.e().getLetterSpacing()) {
        return false;
      }
      if (!TextUtils.equals(a.getFontFeatureSettings(), parama.e().getFontFeatureSettings())) {
        return false;
      }
      if (a.getFlags() != parama.e().getFlags()) {
        return false;
      }
      if (i >= 24)
      {
        if (!E.j.a(a.a(a), a.a(parama.e()))) {
          return false;
        }
      }
      else if (!a.getTextLocale().equals(parama.e().getTextLocale())) {
        return false;
      }
      if (a.getTypeface() == null)
      {
        if (parama.e().getTypeface() != null) {
          return false;
        }
      }
      else if (!a.getTypeface().equals(parama.e().getTypeface())) {
        return false;
      }
      return true;
    }
    
    public int b()
    {
      return c;
    }
    
    public int c()
    {
      return d;
    }
    
    public TextDirectionHeuristic d()
    {
      return b;
    }
    
    public TextPaint e()
    {
      return a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if (!a((a)paramObject)) {
        return false;
      }
      return b == ((a)paramObject).d();
    }
    
    public int hashCode()
    {
      if (Build.VERSION.SDK_INT >= 24) {
        return H.c.b(new Object[] { Float.valueOf(a.getTextSize()), Float.valueOf(a.getTextScaleX()), Float.valueOf(a.getTextSkewX()), Float.valueOf(a.getLetterSpacing()), Integer.valueOf(a.getFlags()), a.a(a), a.getTypeface(), Boolean.valueOf(a.isElegantTextHeight()), b, Integer.valueOf(c), Integer.valueOf(d) });
      }
      return H.c.b(new Object[] { Float.valueOf(a.getTextSize()), Float.valueOf(a.getTextScaleX()), Float.valueOf(a.getTextSkewX()), Float.valueOf(a.getLetterSpacing()), Integer.valueOf(a.getFlags()), a.getTextLocale(), a.getTypeface(), Boolean.valueOf(a.isElegantTextHeight()), b, Integer.valueOf(c), Integer.valueOf(d) });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("{");
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("textSize=");
      ((StringBuilder)localObject).append(a.getTextSize());
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", textScaleX=");
      ((StringBuilder)localObject).append(a.getTextScaleX());
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", textSkewX=");
      ((StringBuilder)localObject).append(a.getTextSkewX());
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      int i = Build.VERSION.SDK_INT;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", letterSpacing=");
      ((StringBuilder)localObject).append(a.getLetterSpacing());
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", elegantTextHeight=");
      ((StringBuilder)localObject).append(a.isElegantTextHeight());
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      StringBuilder localStringBuilder2;
      if (i >= 24)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", textLocale=");
      }
      for (localObject = a.a(a);; localObject = a.getTextLocale())
      {
        localStringBuilder2.append(localObject);
        localStringBuilder1.append(localStringBuilder2.toString());
        break;
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", textLocale=");
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", typeface=");
      ((StringBuilder)localObject).append(a.getTypeface());
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      if (i >= 26)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(", variationSettings=");
        ((StringBuilder)localObject).append(c.a(a));
        localStringBuilder1.append(((StringBuilder)localObject).toString());
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", textDir=");
      ((StringBuilder)localObject).append(b);
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", breakStrategy=");
      ((StringBuilder)localObject).append(c);
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", hyphenationFrequency=");
      ((StringBuilder)localObject).append(d);
      localStringBuilder1.append(((StringBuilder)localObject).toString());
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
    }
    
    public static class a
    {
      public final TextPaint a;
      public TextDirectionHeuristic b;
      public int c;
      public int d;
      
      public a(TextPaint paramTextPaint)
      {
        a = paramTextPaint;
        c = 1;
        d = 1;
        b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      }
      
      public l.a a()
      {
        return new l.a(a, b, c, d);
      }
      
      public a b(int paramInt)
      {
        c = paramInt;
        return this;
      }
      
      public a c(int paramInt)
      {
        d = paramInt;
        return this;
      }
      
      public a d(TextDirectionHeuristic paramTextDirectionHeuristic)
      {
        b = paramTextDirectionHeuristic;
        return this;
      }
    }
  }
}

/* Location:
 * Qualified Name:     G.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */