package l;

import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class x$a
  extends x.c
{
  public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
  {
    paramBuilder.setTextDirection((TextDirectionHeuristic)x.n(paramTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
  }
}

/* Location:
 * Qualified Name:     l.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */