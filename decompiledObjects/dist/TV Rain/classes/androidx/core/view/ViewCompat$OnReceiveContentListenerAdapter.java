package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
final class ViewCompat$OnReceiveContentListenerAdapter
  implements android.view.OnReceiveContentListener
{
  @NonNull
  private final OnReceiveContentListener mJetpackListener;
  
  public ViewCompat$OnReceiveContentListenerAdapter(@NonNull OnReceiveContentListener paramOnReceiveContentListener)
  {
    mJetpackListener = paramOnReceiveContentListener;
  }
  
  @Nullable
  public ContentInfo onReceiveContent(@NonNull View paramView, @NonNull ContentInfo paramContentInfo)
  {
    ContentInfoCompat localContentInfoCompat = ContentInfoCompat.toContentInfoCompat(paramContentInfo);
    paramView = mJetpackListener.onReceiveContent(paramView, localContentInfoCompat);
    if (paramView == null) {
      return null;
    }
    if (paramView == localContentInfoCompat) {
      return paramContentInfo;
    }
    return paramView.toContentInfo();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.OnReceiveContentListenerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */