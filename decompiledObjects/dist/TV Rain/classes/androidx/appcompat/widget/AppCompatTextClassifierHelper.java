package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

final class AppCompatTextClassifierHelper
{
  @Nullable
  private TextClassifier mTextClassifier;
  @NonNull
  private TextView mTextView;
  
  public AppCompatTextClassifierHelper(@NonNull TextView paramTextView)
  {
    mTextView = ((TextView)Preconditions.checkNotNull(paramTextView));
  }
  
  @NonNull
  @RequiresApi(api=26)
  public TextClassifier getTextClassifier()
  {
    TextClassifier localTextClassifier1 = mTextClassifier;
    TextClassifier localTextClassifier2 = localTextClassifier1;
    if (localTextClassifier1 == null) {
      localTextClassifier2 = Api26Impl.getTextClassifier(mTextView);
    }
    return localTextClassifier2;
  }
  
  @RequiresApi(api=26)
  public void setTextClassifier(@Nullable TextClassifier paramTextClassifier)
  {
    mTextClassifier = paramTextClassifier;
  }
  
  @RequiresApi(26)
  public static final class Api26Impl
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
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextClassifierHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */