package androidx.core.content.pm;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.res.XmlResourceParser;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ShortcutXmlParser
{
  private static final String ATTR_SHORTCUT_ID = "shortcutId";
  private static final Object GET_INSTANCE_LOCK = new Object();
  private static final String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
  private static final String TAG = "ShortcutXmlParser";
  private static final String TAG_SHORTCUT = "shortcut";
  private static volatile ArrayList<String> sShortcutIds;
  
  private static String getAttributeValue(XmlPullParser paramXmlPullParser, String paramString)
  {
    String str1 = paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString);
    String str2 = str1;
    if (str1 == null) {
      str2 = paramXmlPullParser.getAttributeValue(null, paramString);
    }
    return str2;
  }
  
  @NonNull
  @WorkerThread
  public static List<String> getShortcutIds(@NonNull Context paramContext)
  {
    if (sShortcutIds == null) {
      synchronized (GET_INSTANCE_LOCK)
      {
        if (sShortcutIds == null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          sShortcutIds = localArrayList;
          sShortcutIds.addAll(parseShortcutIds(paramContext));
        }
      }
    }
    return sShortcutIds;
  }
  
  @NonNull
  private static XmlResourceParser getXmlResourceParser(Context paramContext, ActivityInfo paramActivityInfo)
  {
    paramContext = paramActivityInfo.loadXmlMetaData(paramContext.getPackageManager(), "android.app.shortcuts");
    if (paramContext != null) {
      return paramContext;
    }
    paramContext = z2.t("Failed to open android.app.shortcuts meta-data resource of ");
    paramContext.append(name);
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  @NonNull
  @VisibleForTesting
  public static List<String> parseShortcutIds(@NonNull XmlPullParser paramXmlPullParser)
    throws IOException, XmlPullParserException
  {
    ArrayList localArrayList = new ArrayList(1);
    for (;;)
    {
      int i = paramXmlPullParser.next();
      if ((i == 1) || ((i == 3) && (paramXmlPullParser.getDepth() <= 0))) {
        break;
      }
      int j = paramXmlPullParser.getDepth();
      String str = paramXmlPullParser.getName();
      if ((i == 2) && (j == 2) && ("shortcut".equals(str)))
      {
        str = getAttributeValue(paramXmlPullParser, "shortcutId");
        if (str != null) {
          localArrayList.add(str);
        }
      }
    }
    return localArrayList;
  }
  
  /* Error */
  @NonNull
  private static java.util.Set<String> parseShortcutIds(@NonNull Context paramContext)
  {
    // Byte code:
    //   0: new 141	java/util/HashSet
    //   3: dup
    //   4: invokespecial 142	java/util/HashSet:<init>	()V
    //   7: astore_1
    //   8: new 144	android/content/Intent
    //   11: dup
    //   12: ldc -110
    //   14: invokespecial 147	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   17: astore_2
    //   18: aload_2
    //   19: ldc -107
    //   21: invokevirtual 153	android/content/Intent:addCategory	(Ljava/lang/String;)Landroid/content/Intent;
    //   24: pop
    //   25: aload_2
    //   26: aload_0
    //   27: invokevirtual 156	android/content/Context:getPackageName	()Ljava/lang/String;
    //   30: invokevirtual 159	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   33: pop
    //   34: aload_0
    //   35: invokevirtual 72	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   38: aload_2
    //   39: sipush 128
    //   42: invokevirtual 165	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   45: astore_2
    //   46: aload_2
    //   47: ifnull +133 -> 180
    //   50: aload_2
    //   51: invokeinterface 170 1 0
    //   56: ifne +6 -> 62
    //   59: goto +121 -> 180
    //   62: aload_2
    //   63: invokeinterface 174 1 0
    //   68: astore_2
    //   69: aload_2
    //   70: invokeinterface 180 1 0
    //   75: ifeq +105 -> 180
    //   78: aload_2
    //   79: invokeinterface 183 1 0
    //   84: checkcast 185	android/content/pm/ResolveInfo
    //   87: getfield 189	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   90: astore_3
    //   91: aload_3
    //   92: getfield 193	android/content/pm/ActivityInfo:metaData	Landroid/os/Bundle;
    //   95: astore 4
    //   97: aload 4
    //   99: ifnull -30 -> 69
    //   102: aload 4
    //   104: ldc 17
    //   106: invokevirtual 199	android/os/BaseBundle:containsKey	(Ljava/lang/String;)Z
    //   109: ifeq -40 -> 69
    //   112: aload_0
    //   113: aload_3
    //   114: invokestatic 201	androidx/core/content/pm/ShortcutXmlParser:getXmlResourceParser	(Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Landroid/content/res/XmlResourceParser;
    //   117: astore 4
    //   119: aload_1
    //   120: aload 4
    //   122: invokestatic 203	androidx/core/content/pm/ShortcutXmlParser:parseShortcutIds	(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;
    //   125: invokeinterface 206 2 0
    //   130: pop
    //   131: aload 4
    //   133: ifnull -64 -> 69
    //   136: aload 4
    //   138: invokeinterface 211 1 0
    //   143: goto -74 -> 69
    //   146: astore_0
    //   147: aload 4
    //   149: ifnull +19 -> 168
    //   152: aload 4
    //   154: invokeinterface 211 1 0
    //   159: goto +9 -> 168
    //   162: astore_2
    //   163: aload_0
    //   164: aload_2
    //   165: invokevirtual 217	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   168: aload_0
    //   169: athrow
    //   170: astore_0
    //   171: ldc 20
    //   173: ldc -37
    //   175: aload_0
    //   176: invokestatic 225	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   179: pop
    //   180: aload_1
    //   181: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	paramContext	Context
    //   7	174	1	localHashSet	java.util.HashSet
    //   17	62	2	localObject1	Object
    //   162	3	2	localThrowable	Throwable
    //   90	24	3	localActivityInfo	ActivityInfo
    //   95	58	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   119	131	146	finally
    //   152	159	162	finally
    //   62	69	170	java/lang/Exception
    //   69	97	170	java/lang/Exception
    //   102	119	170	java/lang/Exception
    //   136	143	170	java/lang/Exception
    //   163	168	170	java/lang/Exception
    //   168	170	170	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutXmlParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */