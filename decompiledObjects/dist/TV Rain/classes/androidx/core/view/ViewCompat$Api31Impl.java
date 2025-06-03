package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import g;

@RequiresApi(31)
final class ViewCompat$Api31Impl
{
  @DoNotInline
  @Nullable
  public static String[] getReceiveContentMimeTypes(@NonNull View paramView)
  {
    return g.s(paramView);
  }
  
  @DoNotInline
  @Nullable
  public static ContentInfoCompat performReceiveContent(@NonNull View paramView, @NonNull ContentInfoCompat paramContentInfoCompat)
  {
    ContentInfo localContentInfo = paramContentInfoCompat.toContentInfo();
    paramView = g.e(paramView, localContentInfo);
    if (paramView == null) {
      return null;
    }
    if (paramView == localContentInfo) {
      return paramContentInfoCompat;
    }
    return ContentInfoCompat.toContentInfoCompat(paramView);
  }
  
  @DoNotInline
  public static void setOnReceiveContentListener(@NonNull View paramView, @Nullable String[] paramArrayOfString, @Nullable OnReceiveContentListener paramOnReceiveContentListener)
  {
    if (paramOnReceiveContentListener == null) {
      g.n(paramView, paramArrayOfString);
    } else {
      g.o(paramView, paramArrayOfString, new ViewCompat.OnReceiveContentListenerAdapter(paramOnReceiveContentListener));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */