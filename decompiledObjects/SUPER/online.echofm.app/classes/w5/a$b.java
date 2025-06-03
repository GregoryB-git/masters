package w5;

import android.content.res.AssetManager;
import io.flutter.view.FlutterCallbackInformation;

public class a$b
{
  public final AssetManager a;
  public final String b;
  public final FlutterCallbackInformation c;
  
  public a$b(AssetManager paramAssetManager, String paramString, FlutterCallbackInformation paramFlutterCallbackInformation)
  {
    a = paramAssetManager;
    b = paramString;
    c = paramFlutterCallbackInformation;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DartCallback( bundle path: ");
    localStringBuilder.append(b);
    localStringBuilder.append(", library path: ");
    localStringBuilder.append(c.callbackLibraryPath);
    localStringBuilder.append(", function: ");
    localStringBuilder.append(c.callbackName);
    localStringBuilder.append(" )");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     w5.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */