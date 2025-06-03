package androidx.core.view;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.ContentInfo.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.function.Predicate;
import p0;

@RequiresApi(31)
final class ContentInfoCompat$Api31Impl
{
  @DoNotInline
  @NonNull
  public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo paramContentInfo, @NonNull Predicate<ClipData.Item> paramPredicate)
  {
    ClipData localClipData = paramContentInfo.getClip();
    if (localClipData.getItemCount() == 1)
    {
      boolean bool = paramPredicate.test(localClipData.getItemAt(0));
      if (bool) {
        paramPredicate = paramContentInfo;
      } else {
        paramPredicate = null;
      }
      if (bool) {
        paramContentInfo = null;
      }
      return Pair.create(paramPredicate, paramContentInfo);
    }
    Objects.requireNonNull(paramPredicate);
    paramPredicate = ContentInfoCompat.partition(localClipData, new p0(paramPredicate));
    if (first == null) {
      return Pair.create(null, paramContentInfo);
    }
    if (second == null) {
      return Pair.create(paramContentInfo, null);
    }
    return Pair.create(new ContentInfo.Builder(paramContentInfo).setClip((ClipData)first).build(), new ContentInfo.Builder(paramContentInfo).setClip((ClipData)second).build());
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */