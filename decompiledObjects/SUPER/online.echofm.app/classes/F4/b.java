package F4;

public abstract class b
{
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[] { d(paramString1, paramString2), paramString3, "perf-android-sdk", "android-ide" });
  }
  
  public static String b(String paramString1, String paramString2)
  {
    return String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[] { d(paramString1, paramString2), "perf-android-sdk", "android-ide" });
  }
  
  public static String c(String paramString1, String paramString2, String paramString3)
  {
    return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[] { d(paramString1, paramString2), paramString3, "perf-android-sdk", "android-ide" });
  }
  
  public static String d(String paramString1, String paramString2)
  {
    return String.format("%s/project/%s/performance/app/android:%s", new Object[] { "https://console.firebase.google.com", paramString1, paramString2 });
  }
}

/* Location:
 * Qualified Name:     F4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */