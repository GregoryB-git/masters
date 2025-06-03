package pa;

import ec.i;
import io.flutter.embedding.engine.loader.FlutterLoader;

public final class g$e
  implements g.b
{
  public g$e(FlutterLoader paramFlutterLoader) {}
  
  public final String a(String paramString1, String paramString2)
  {
    FlutterLoader localFlutterLoader = a;
    i.b(paramString1);
    i.b(paramString2);
    paramString1 = localFlutterLoader.getLookupKeyForAsset(paramString1, paramString2);
    i.d(paramString1, "getLookupKeyForAsset(...)");
    return paramString1;
  }
}

/* Location:
 * Qualified Name:     pa.g.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */