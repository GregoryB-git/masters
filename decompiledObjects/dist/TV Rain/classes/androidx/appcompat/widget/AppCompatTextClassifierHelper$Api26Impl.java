package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
final class AppCompatTextClassifierHelper$Api26Impl
{
  @DoNotInline
  @NonNull
  public static TextClassifier getTextClassifier(@NonNull TextView paramTextView)
  {
    paramTextView = (TextClassificationManager)paramTextView.getContext().getSystemService(TextClassificationManager.class);
    if (paramTextView != null) {
      return paramTextView.getTextClassifier();
    }
    return TextClassifier.NO_OP;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextClassifierHelper.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */