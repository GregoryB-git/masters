package io.flutter.embedding.engine.loader;

import java.io.File;
import java.io.FilenameFilter;

class ResourceExtractor$1
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.startsWith("res_timestamp-");
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.loader.ResourceExtractor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */