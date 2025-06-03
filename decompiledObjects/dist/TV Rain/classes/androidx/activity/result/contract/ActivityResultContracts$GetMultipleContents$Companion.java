package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\027\020\003\032\b\022\004\022\0020\0050\004*\0020\006H\000¢\006\002\b\007¨\006\b"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "()V", "getClipDataUris", "", "Landroid/net/Uri;", "Landroid/content/Intent;", "getClipDataUris$activity_release", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
@RequiresApi(18)
public final class ActivityResultContracts$GetMultipleContents$Companion
{
  @NotNull
  public final List<Uri> getClipDataUris$activity_release(@NotNull Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramIntent, "<this>");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Uri localUri = paramIntent.getData();
    if (localUri != null) {
      localLinkedHashSet.add(localUri);
    }
    paramIntent = paramIntent.getClipData();
    if ((paramIntent == null) && (localLinkedHashSet.isEmpty())) {
      return CollectionsKt.emptyList();
    }
    if (paramIntent != null)
    {
      int i = 0;
      int j = paramIntent.getItemCount();
      while (i < j)
      {
        localUri = paramIntent.getItemAt(i).getUri();
        if (localUri != null) {
          localLinkedHashSet.add(localUri);
        }
        i++;
      }
    }
    return new ArrayList(localLinkedHashSet);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */