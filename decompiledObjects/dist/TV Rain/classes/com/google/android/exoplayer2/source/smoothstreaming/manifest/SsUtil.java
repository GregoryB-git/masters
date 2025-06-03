package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;

public final class SsUtil
{
  public static Uri fixManifestUri(Uri paramUri)
  {
    if (Util.toLowerInvariant(paramUri.getLastPathSegment()).matches("manifest(\\(.+\\))?")) {
      return paramUri;
    }
    return Uri.withAppendedPath(paramUri, "Manifest");
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */