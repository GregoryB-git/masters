package pa;

import ec.i;
import io.flutter.embedding.engine.loader.FlutterLoader;

public final class g$d
  implements g.c
{
  public g$d(FlutterLoader paramFlutterLoader) {}
  
  public final String a(String paramString)
  {
    FlutterLoader localFlutterLoader = a;
    i.b(paramString);
    paramString = localFlutterLoader.getLookupKeyForAsset(paramString);
    i.d(paramString, "getLookupKeyForAsset(...)");
    return paramString;
  }
}

/* Location:
 * Qualified Name:     pa.g.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */