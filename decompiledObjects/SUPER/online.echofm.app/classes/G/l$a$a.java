package G;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

public class l$a$a
{
  public final TextPaint a;
  public TextDirectionHeuristic b;
  public int c;
  public int d;
  
  public l$a$a(TextPaint paramTextPaint)
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

/* Location:
 * Qualified Name:     G.l.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */