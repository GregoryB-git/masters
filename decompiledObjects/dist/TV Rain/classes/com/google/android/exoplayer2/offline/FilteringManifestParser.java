package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class FilteringManifestParser<T extends FilterableManifest<T>>
  implements ParsingLoadable.Parser<T>
{
  private final ParsingLoadable.Parser<T> parser;
  private final List<StreamKey> streamKeys;
  
  public FilteringManifestParser(ParsingLoadable.Parser<T> paramParser, List<StreamKey> paramList)
  {
    parser = paramParser;
    streamKeys = paramList;
  }
  
  public T parse(Uri paramUri, InputStream paramInputStream)
    throws IOException
  {
    paramInputStream = (FilterableManifest)parser.parse(paramUri, paramInputStream);
    List localList = streamKeys;
    paramUri = paramInputStream;
    if (localList != null) {
      if (localList.isEmpty()) {
        paramUri = paramInputStream;
      } else {
        paramUri = (FilterableManifest)paramInputStream.copy(streamKeys);
      }
    }
    return paramUri;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.FilteringManifestParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */