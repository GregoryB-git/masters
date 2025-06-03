package l;

import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class e0$d
  extends e0.f
{
  public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
  {
    paramBuilder.setTextDirection((TextDirectionHeuristic)e0.e("getTextDirectionHeuristic", paramTextView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
  }
}

/* Location:
 * Qualified Name:     l.e0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */