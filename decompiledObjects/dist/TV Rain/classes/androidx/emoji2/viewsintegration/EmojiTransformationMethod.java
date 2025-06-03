package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class EmojiTransformationMethod
  implements TransformationMethod
{
  @Nullable
  private final TransformationMethod mTransformationMethod;
  
  public EmojiTransformationMethod(@Nullable TransformationMethod paramTransformationMethod)
  {
    mTransformationMethod = paramTransformationMethod;
  }
  
  public TransformationMethod getOriginalTransformationMethod()
  {
    return mTransformationMethod;
  }
  
  public CharSequence getTransformation(@Nullable CharSequence paramCharSequence, @NonNull View paramView)
  {
    if (paramView.isInEditMode()) {
      return paramCharSequence;
    }
    TransformationMethod localTransformationMethod = mTransformationMethod;
    CharSequence localCharSequence = paramCharSequence;
    if (localTransformationMethod != null) {
      localCharSequence = localTransformationMethod.getTransformation(paramCharSequence, paramView);
    }
    paramCharSequence = localCharSequence;
    if (localCharSequence != null) {
      if (EmojiCompat.get().getLoadState() != 1) {
        paramCharSequence = localCharSequence;
      } else {
        paramCharSequence = EmojiCompat.get().process(localCharSequence);
      }
    }
    return paramCharSequence;
  }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
    TransformationMethod localTransformationMethod = mTransformationMethod;
    if (localTransformationMethod != null) {
      localTransformationMethod.onFocusChanged(paramView, paramCharSequence, paramBoolean, paramInt, paramRect);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTransformationMethod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */