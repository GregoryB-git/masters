package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.Mapper;

final class ShareInternalUtility$10
  implements Utility.Mapper<NativeAppCallAttachmentStore.Attachment, Bundle>
{
  public Bundle apply(NativeAppCallAttachmentStore.Attachment paramAttachment)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("uri", paramAttachment.getAttachmentUrl());
    paramAttachment = ShareInternalUtility.getUriExtension(paramAttachment.getOriginalUri());
    if (paramAttachment != null) {
      Utility.putNonEmptyString(localBundle, "extension", paramAttachment);
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */