package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

final class DashMediaSource$XsDateTimeParser
  implements ParsingLoadable.Parser<Long>
{
  public Long parse(Uri paramUri, InputStream paramInputStream)
    throws IOException
  {
    return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(paramInputStream)).readLine()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.XsDateTimeParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */