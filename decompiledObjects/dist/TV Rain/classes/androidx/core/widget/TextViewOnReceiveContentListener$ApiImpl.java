package androidx.core.widget;

import android.content.ClipData.Item;
import android.content.Context;
import android.text.Spanned;
import androidx.annotation.NonNull;

final class TextViewOnReceiveContentListener$ApiImpl
{
  public static CharSequence coerce(@NonNull Context paramContext, @NonNull ClipData.Item paramItem, int paramInt)
  {
    paramItem = paramItem.coerceToText(paramContext);
    paramContext = paramItem;
    if ((paramInt & 0x1) != 0)
    {
      paramContext = paramItem;
      if ((paramItem instanceof Spanned)) {
        paramContext = paramItem.toString();
      }
    }
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewOnReceiveContentListener.ApiImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */