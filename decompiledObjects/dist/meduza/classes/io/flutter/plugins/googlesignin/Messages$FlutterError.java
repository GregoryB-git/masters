package io.flutter.plugins.googlesignin;

public class Messages$FlutterError
  extends RuntimeException
{
  public final String code;
  public final Object details;
  
  public Messages$FlutterError(String paramString1, String paramString2, Object paramObject)
  {
    super(paramString2);
    code = paramString1;
    details = paramObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.FlutterError
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */