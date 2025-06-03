package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public abstract interface ParsingLoadable$Parser<T>
{
  public abstract T parse(Uri paramUri, InputStream paramInputStream)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */