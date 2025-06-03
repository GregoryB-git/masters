package io.flutter.plugin.common;

public class FlutterException
  extends RuntimeException
{
  private static final String TAG = "FlutterException#";
  public final String code;
  public final Object details;
  
  public FlutterException(String paramString1, String paramString2, Object paramObject)
  {
    super(paramString2);
    code = paramString1;
    details = paramObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.FlutterException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */