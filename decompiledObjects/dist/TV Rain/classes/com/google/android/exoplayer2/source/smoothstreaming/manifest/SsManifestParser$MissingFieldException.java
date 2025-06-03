package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import com.google.android.exoplayer2.ParserException;
import z2;

public class SsManifestParser$MissingFieldException
  extends ParserException
{
  public SsManifestParser$MissingFieldException(String paramString)
  {
    super(z2.o("Missing required field: ", paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.MissingFieldException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */