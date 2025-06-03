package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

public class UnrecognizedInputFormatException
  extends ParserException
{
  public final Uri uri;
  
  public UnrecognizedInputFormatException(String paramString, Uri paramUri)
  {
    super(paramString);
    uri = paramUri;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.UnrecognizedInputFormatException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */