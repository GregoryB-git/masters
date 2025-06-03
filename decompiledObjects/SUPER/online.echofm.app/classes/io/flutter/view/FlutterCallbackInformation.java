package io.flutter.view;

import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;

@Keep
public final class FlutterCallbackInformation
{
  public final String callbackClassName;
  public final String callbackLibraryPath;
  public final String callbackName;
  
  private FlutterCallbackInformation(String paramString1, String paramString2, String paramString3)
  {
    callbackName = paramString1;
    callbackClassName = paramString2;
    callbackLibraryPath = paramString3;
  }
  
  public static FlutterCallbackInformation lookupCallbackInformation(long paramLong)
  {
    return FlutterJNI.nativeLookupCallbackInformation(paramLong);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.FlutterCallbackInformation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */