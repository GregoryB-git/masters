package v0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.d;

public final class h
  implements TransformationMethod
{
  public final TransformationMethod a;
  
  public h(TransformationMethod paramTransformationMethod)
  {
    a = paramTransformationMethod;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramView.isInEditMode()) {
      return paramCharSequence;
    }
    TransformationMethod localTransformationMethod = a;
    CharSequence localCharSequence = paramCharSequence;
    if (localTransformationMethod != null) {
      localCharSequence = localTransformationMethod.getTransformation(paramCharSequence, paramView);
    }
    paramCharSequence = localCharSequence;
    if (localCharSequence != null) {
      if (d.a().b() != 1)
      {
        paramCharSequence = localCharSequence;
      }
      else
      {
        paramCharSequence = d.a();
        paramCharSequence.getClass();
        paramCharSequence = paramCharSequence.f(localCharSequence, 0, localCharSequence.length());
      }
    }
    return paramCharSequence;
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
    TransformationMethod localTransformationMethod = a;
    if (localTransformationMethod != null) {
      localTransformationMethod.onFocusChanged(paramView, paramCharSequence, paramBoolean, paramInt, paramRect);
    }
  }
}

/* Location:
 * Qualified Name:     v0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */