package com.facebook.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z2;

public class ShareToMessengerParams
{
  public static final Set<String> VALID_EXTERNAL_URI_SCHEMES;
  public static final Set<String> VALID_MIME_TYPES;
  public static final Set<String> VALID_URI_SCHEMES;
  public final Uri externalUri;
  public final String metaData;
  public final String mimeType;
  public final Uri uri;
  
  static
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("image/*");
    localHashSet.add("image/jpeg");
    localHashSet.add("image/png");
    localHashSet.add("image/gif");
    localHashSet.add("image/webp");
    localHashSet.add("video/*");
    localHashSet.add("video/mp4");
    localHashSet.add("audio/*");
    localHashSet.add("audio/mpeg");
    VALID_MIME_TYPES = Collections.unmodifiableSet(localHashSet);
    localHashSet = new HashSet();
    localHashSet.add("content");
    localHashSet.add("android.resource");
    localHashSet.add("file");
    VALID_URI_SCHEMES = Collections.unmodifiableSet(localHashSet);
    localHashSet = new HashSet();
    localHashSet.add("http");
    localHashSet.add("https");
    VALID_EXTERNAL_URI_SCHEMES = Collections.unmodifiableSet(localHashSet);
  }
  
  public ShareToMessengerParams(ShareToMessengerParamsBuilder paramShareToMessengerParamsBuilder)
  {
    Object localObject = paramShareToMessengerParamsBuilder.getUri();
    uri = ((Uri)localObject);
    String str = paramShareToMessengerParamsBuilder.getMimeType();
    mimeType = str;
    metaData = paramShareToMessengerParamsBuilder.getMetaData();
    paramShareToMessengerParamsBuilder = paramShareToMessengerParamsBuilder.getExternalUri();
    externalUri = paramShareToMessengerParamsBuilder;
    if (localObject != null)
    {
      if (str != null)
      {
        if (VALID_URI_SCHEMES.contains(((Uri)localObject).getScheme()))
        {
          if (VALID_MIME_TYPES.contains(str))
          {
            if ((paramShareToMessengerParamsBuilder != null) && (!VALID_EXTERNAL_URI_SCHEMES.contains(paramShareToMessengerParamsBuilder.getScheme())))
            {
              localObject = z2.t("Unsupported external uri scheme: ");
              ((StringBuilder)localObject).append(paramShareToMessengerParamsBuilder.getScheme());
              throw new IllegalArgumentException(((StringBuilder)localObject).toString());
            }
            return;
          }
          throw new IllegalArgumentException(z2.o("Unsupported mime-type: ", str));
        }
        paramShareToMessengerParamsBuilder = z2.t("Unsupported URI scheme: ");
        paramShareToMessengerParamsBuilder.append(((Uri)localObject).getScheme());
        throw new IllegalArgumentException(paramShareToMessengerParamsBuilder.toString());
      }
      throw new NullPointerException("Must provide mimeType");
    }
    throw new NullPointerException("Must provide non-null uri");
  }
  
  public static ShareToMessengerParamsBuilder newBuilder(Uri paramUri, String paramString)
  {
    return new ShareToMessengerParamsBuilder(paramUri, paramString);
  }
}

/* Location:
 * Qualified Name:     com.facebook.messenger.ShareToMessengerParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */