package y5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.AttributeSet;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a
{
  public static final String a;
  public static final String b;
  public static final String c;
  public static final String d;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(f.class.getName());
    localStringBuilder.append('.');
    localStringBuilder.append("aot-shared-library-name");
    a = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(f.class.getName());
    localStringBuilder.append('.');
    localStringBuilder.append("vm-snapshot-data");
    b = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(f.class.getName());
    localStringBuilder.append('.');
    localStringBuilder.append("isolate-snapshot-data");
    c = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(f.class.getName());
    localStringBuilder.append('.');
    localStringBuilder.append("flutter-assets-dir");
    d = localStringBuilder.toString();
  }
  
  public static ApplicationInfo a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new RuntimeException(paramContext);
    }
  }
  
  public static boolean b(Bundle paramBundle, String paramString, boolean paramBoolean)
  {
    if (paramBundle == null) {
      return paramBoolean;
    }
    return paramBundle.getBoolean(paramString, paramBoolean);
  }
  
  public static String c(ApplicationInfo paramApplicationInfo, Context paramContext)
  {
    paramApplicationInfo = metaData;
    if (paramApplicationInfo == null) {
      return null;
    }
    int i = paramApplicationInfo.getInt("io.flutter.network-policy", 0);
    if (i <= 0) {
      return null;
    }
    paramApplicationInfo = new JSONArray();
    try
    {
      paramContext = paramContext.getResources().getXml(i);
      paramContext.next();
      for (i = paramContext.getEventType(); i != 1; i = paramContext.next()) {
        if ((i == 2) && (paramContext.getName().equals("domain-config"))) {
          g(paramContext, paramApplicationInfo, false);
        }
      }
      return paramApplicationInfo.toString();
    }
    catch (IOException|XmlPullParserException paramApplicationInfo) {}
    return null;
  }
  
  public static String d(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {
      return null;
    }
    return paramBundle.getString(paramString, null);
  }
  
  public static b e(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = a(paramContext);
    return new b(d(metaData, a), d(metaData, b), d(metaData, c), d(metaData, d), c(localApplicationInfo, paramContext), nativeLibraryDir, b(metaData, "io.flutter.automatically-register-plugins", true));
  }
  
  public static void f(XmlResourceParser paramXmlResourceParser, JSONArray paramJSONArray, boolean paramBoolean)
  {
    boolean bool = paramXmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
    paramXmlResourceParser.next();
    if (paramXmlResourceParser.getEventType() == 4)
    {
      String str = paramXmlResourceParser.getText().trim();
      JSONArray localJSONArray = new JSONArray();
      localJSONArray.put(str);
      localJSONArray.put(bool);
      localJSONArray.put(paramBoolean);
      paramJSONArray.put(localJSONArray);
      paramXmlResourceParser.next();
      if (paramXmlResourceParser.getEventType() == 3) {
        return;
      }
      throw new IllegalStateException("Expected end of domain tag");
    }
    throw new IllegalStateException("Expected text");
  }
  
  public static void g(XmlResourceParser paramXmlResourceParser, JSONArray paramJSONArray, boolean paramBoolean)
  {
    paramBoolean = paramXmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", paramBoolean);
    int i;
    do
    {
      for (;;)
      {
        i = paramXmlResourceParser.next();
        if (i != 2) {
          break;
        }
        if (paramXmlResourceParser.getName().equals("domain")) {
          f(paramXmlResourceParser, paramJSONArray, paramBoolean);
        } else if (paramXmlResourceParser.getName().equals("domain-config")) {
          g(paramXmlResourceParser, paramJSONArray, paramBoolean);
        } else {
          h(paramXmlResourceParser);
        }
      }
    } while (i != 3);
  }
  
  public static void h(XmlResourceParser paramXmlResourceParser)
  {
    String str = paramXmlResourceParser.getName();
    for (int i = paramXmlResourceParser.getEventType();; i = paramXmlResourceParser.next()) {
      if ((i == 3) && (paramXmlResourceParser.getName() == str)) {
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     y5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */