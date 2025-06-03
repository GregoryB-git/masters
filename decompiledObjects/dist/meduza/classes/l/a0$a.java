package l;

import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class a0$a
{
  public static TextClassifier a(TextView paramTextView)
  {
    paramTextView = (TextClassificationManager)paramTextView.getContext().getSystemService(TextClassificationManager.class);
    if (paramTextView != null) {
      return paramTextView.getTextClassifier();
    }
    return TextClassifier.NO_OP;
  }
}

/* Location:
 * Qualified Name:     l.a0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */