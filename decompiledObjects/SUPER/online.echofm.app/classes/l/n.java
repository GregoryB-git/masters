package l;

import H.e;
import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class n
{
  public TextView a;
  public TextClassifier b;
  
  public n(TextView paramTextView)
  {
    a = ((TextView)e.b(paramTextView));
  }
  
  public TextClassifier a()
  {
    TextClassifier localTextClassifier = b;
    Object localObject = localTextClassifier;
    if (localTextClassifier == null)
    {
      localObject = k.a(a.getContext().getSystemService(j.a()));
      if (localObject != null) {
        return l.a((TextClassificationManager)localObject);
      }
      localObject = m.a();
    }
    return (TextClassifier)localObject;
  }
  
  public void b(TextClassifier paramTextClassifier)
  {
    b = paramTextClassifier;
  }
}

/* Location:
 * Qualified Name:     l.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */