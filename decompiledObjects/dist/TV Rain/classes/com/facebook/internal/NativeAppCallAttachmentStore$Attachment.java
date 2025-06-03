package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.UUID;
import z2;

public final class NativeAppCallAttachmentStore$Attachment
{
  private final String attachmentName;
  private final String attachmentUrl;
  private Bitmap bitmap;
  private final UUID callId;
  private boolean isContentUri;
  private Uri originalUri;
  private boolean shouldCreateFile;
  
  private NativeAppCallAttachmentStore$Attachment(UUID paramUUID, Bitmap paramBitmap, Uri paramUri)
  {
    callId = paramUUID;
    bitmap = paramBitmap;
    originalUri = paramUri;
    boolean bool = true;
    if (paramUri != null)
    {
      paramBitmap = paramUri.getScheme();
      if ("content".equalsIgnoreCase(paramBitmap))
      {
        isContentUri = true;
        if ((paramUri.getAuthority() == null) || (paramUri.getAuthority().startsWith("media"))) {
          bool = false;
        }
        shouldCreateFile = bool;
      }
      else if ("file".equalsIgnoreCase(paramUri.getScheme()))
      {
        shouldCreateFile = true;
      }
      else if (!Utility.isWebUri(paramUri))
      {
        throw new FacebookException(z2.o("Unsupported scheme for media Uri : ", paramBitmap));
      }
    }
    else
    {
      if (paramBitmap == null) {
        break label189;
      }
      shouldCreateFile = true;
    }
    if (!shouldCreateFile) {
      paramBitmap = null;
    } else {
      paramBitmap = UUID.randomUUID().toString();
    }
    attachmentName = paramBitmap;
    if (!shouldCreateFile) {
      paramUUID = originalUri.toString();
    } else {
      paramUUID = FacebookContentProvider.getAttachmentUrl(FacebookSdk.getApplicationId(), paramUUID, paramBitmap);
    }
    attachmentUrl = paramUUID;
    return;
    label189:
    throw new FacebookException("Cannot share media without a bitmap or Uri set");
  }
  
  public String getAttachmentUrl()
  {
    return attachmentUrl;
  }
  
  public Uri getOriginalUri()
  {
    return originalUri;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeAppCallAttachmentStore.Attachment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */