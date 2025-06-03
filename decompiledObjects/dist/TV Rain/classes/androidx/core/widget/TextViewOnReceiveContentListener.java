package androidx.core.widget;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TextViewOnReceiveContentListener
  implements OnReceiveContentListener
{
  private static final String LOG_TAG = "ReceiveContent";
  
  private static CharSequence coerceToText(@NonNull Context paramContext, @NonNull ClipData.Item paramItem, int paramInt)
  {
    return Api16Impl.coerce(paramContext, paramItem, paramInt);
  }
  
  private static void replaceSelection(@NonNull Editable paramEditable, @NonNull CharSequence paramCharSequence)
  {
    int i = Selection.getSelectionStart(paramEditable);
    int j = Selection.getSelectionEnd(paramEditable);
    int k = Math.max(0, Math.min(i, j));
    i = Math.max(0, Math.max(i, j));
    Selection.setSelection(paramEditable, i);
    paramEditable.replace(k, i, paramCharSequence);
  }
  
  @Nullable
  public ContentInfoCompat onReceiveContent(@NonNull View paramView, @NonNull ContentInfoCompat paramContentInfoCompat)
  {
    if (Log.isLoggable("ReceiveContent", 3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("onReceive: ");
      ((StringBuilder)localObject).append(paramContentInfoCompat);
      Log.d("ReceiveContent", ((StringBuilder)localObject).toString());
    }
    if (paramContentInfoCompat.getSource() == 2) {
      return paramContentInfoCompat;
    }
    Object localObject = paramContentInfoCompat.getClip();
    int i = paramContentInfoCompat.getFlags();
    paramContentInfoCompat = (TextView)paramView;
    paramView = (Editable)paramContentInfoCompat.getText();
    Context localContext = paramContentInfoCompat.getContext();
    int j = 0;
    int m;
    for (int k = 0; j < ((ClipData)localObject).getItemCount(); k = m)
    {
      paramContentInfoCompat = coerceToText(localContext, ((ClipData)localObject).getItemAt(j), i);
      m = k;
      if (paramContentInfoCompat != null) {
        if (k == 0)
        {
          replaceSelection(paramView, paramContentInfoCompat);
          m = 1;
        }
        else
        {
          paramView.insert(Selection.getSelectionEnd(paramView), "\n");
          paramView.insert(Selection.getSelectionEnd(paramView), paramContentInfoCompat);
          m = k;
        }
      }
      j++;
    }
    return null;
  }
  
  @RequiresApi(16)
  public static final class Api16Impl
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
  
  public static final class ApiImpl
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
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewOnReceiveContentListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */