package androidx.core.widget;

import android.content.ClipData.Item;
import android.content.Context;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
final class TextViewOnReceiveContentListener$Api16Impl
{
  public static CharSequence coerce(@NonNull Context paramContext, @NonNull ClipData.Item paramItem, int paramInt)
  {
    if ((paramInt & 0x1) != 0)
    {
      paramItem = paramItem.coerceToText(paramContext);
      paramContext = paramItem;
      if ((paramItem instanceof Spanned)) {
        paramContext = paramItem.toString();
      }
      return paramContext;
    }
    return paramItem.coerceToStyledText(paramContext);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewOnReceiveContentListener.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */