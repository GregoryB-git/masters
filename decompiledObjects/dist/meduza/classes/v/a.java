package v;

import a0.d;
import a0.h;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import e0.f0;
import e0.g0;
import g;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import u.u;
import w.f.b;
import w.f.c;
import w.f.d;

public class a
{
  private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
  public static final int RECEIVER_EXPORTED = 2;
  public static final int RECEIVER_NOT_EXPORTED = 4;
  public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
  private static final String TAG = "ContextCompat";
  private static final Object sSync = new Object();
  
  public static int checkSelfPermission(Context paramContext, String paramString)
  {
    if (paramString != null)
    {
      if ((Build.VERSION.SDK_INT < 33) && (TextUtils.equals("android.permission.POST_NOTIFICATIONS", paramString)))
      {
        int i;
        if (new u(paramContext).a()) {
          i = 0;
        } else {
          i = -1;
        }
        return i;
      }
      return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
    }
    throw new NullPointerException("permission must be non-null");
  }
  
  public static Context createAttributionContext(Context paramContext, String paramString)
  {
    Context localContext = paramContext;
    if (Build.VERSION.SDK_INT >= 30) {
      localContext = f.a(paramContext, paramString);
    }
    return localContext;
  }
  
  public static Context createDeviceProtectedStorageContext(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return c.a(paramContext);
    }
    return null;
  }
  
  private static File createFilesDir(File paramFile)
  {
    synchronized (sSync)
    {
      if (!paramFile.exists())
      {
        if (paramFile.mkdirs()) {
          return paramFile;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unable to create files subdir ");
        localStringBuilder.append(paramFile.getPath());
        Log.w("ContextCompat", localStringBuilder.toString());
      }
      return paramFile;
    }
  }
  
  public static String getAttributionTag(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return f.b(paramContext);
    }
    return null;
  }
  
  public static File getCodeCacheDir(Context paramContext)
  {
    return a.a(paramContext);
  }
  
  public static int getColor(Context paramContext, int paramInt)
  {
    return b.a(paramContext, paramInt);
  }
  
  public static ColorStateList getColorStateList(Context paramContext, int paramInt)
  {
    ??? = paramContext.getResources();
    Resources.Theme localTheme = paramContext.getTheme();
    f.d locald = new f.d((Resources)???, localTheme);
    synchronized (w.f.c)
    {
      Object localObject3 = (SparseArray)w.f.b.get(locald);
      Object localObject4 = null;
      if ((localObject3 != null) && (((SparseArray)localObject3).size() > 0))
      {
        paramContext = (f.c)((SparseArray)localObject3).get(paramInt);
        if (paramContext != null)
        {
          if ((b.equals(((Resources)???).getConfiguration())) && (((localTheme == null) && (c == 0)) || ((localTheme != null) && (c == localTheme.hashCode()))))
          {
            paramContext = a;
            break label134;
          }
          ((SparseArray)localObject3).remove(paramInt);
        }
      }
      paramContext = null;
      label134:
      if (paramContext == null)
      {
        localObject3 = w.f.a;
        ??? = (TypedValue)((ThreadLocal)localObject3).get();
        paramContext = (Context)???;
        if (??? == null)
        {
          paramContext = new TypedValue();
          ((ThreadLocal)localObject3).set(paramContext);
        }
        int i = 1;
        ((Resources)???).getValue(paramInt, paramContext, true);
        int j = type;
        if ((j < 28) || (j > 31)) {
          i = 0;
        }
        if (i != 0)
        {
          paramContext = (Context)localObject4;
        }
        else
        {
          paramContext = ((Resources)???).getXml(paramInt);
          try
          {
            paramContext = w.b.a((Resources)???, paramContext, localTheme);
          }
          catch (Exception paramContext)
          {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", paramContext);
            paramContext = (Context)localObject4;
          }
        }
        if (paramContext != null) {
          synchronized (w.f.c)
          {
            localObject3 = w.f.b;
            ??? = (SparseArray)((WeakHashMap)localObject3).get(locald);
            localObject4 = ???;
            if (??? == null)
            {
              localObject4 = new android/util/SparseArray;
              ((SparseArray)localObject4).<init>();
              ((WeakHashMap)localObject3).put(locald, localObject4);
            }
            ??? = new w/f$c;
            ((f.c)???).<init>(paramContext, a.getConfiguration(), localTheme);
            ((SparseArray)localObject4).append(paramInt, ???);
          }
        }
        paramContext = f.b.b((Resources)???, paramInt, localTheme);
      }
      return paramContext;
    }
  }
  
  /* Error */
  public static Context getContextForLanguage(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 56	android/os/Build$VERSION:SDK_INT	I
    //   3: bipush 33
    //   5: if_icmplt +44 -> 49
    //   8: aload_0
    //   9: ldc_w 280
    //   12: invokevirtual 284	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +25 -> 42
    //   20: new 286	a0/i
    //   23: dup
    //   24: new 288	a0/m
    //   27: dup
    //   28: aload_1
    //   29: invokestatic 293	u/k:a	(Ljava/lang/Object;)Landroid/os/LocaleList;
    //   32: invokespecial 295	a0/m:<init>	(Ljava/lang/Object;)V
    //   35: invokespecial 298	a0/i:<init>	(La0/l;)V
    //   38: astore_1
    //   39: goto +225 -> 264
    //   42: getstatic 301	a0/i:b	La0/i;
    //   45: astore_1
    //   46: goto +218 -> 264
    //   49: getstatic 305	u/g:a	Ljava/lang/Object;
    //   52: astore_2
    //   53: aload_2
    //   54: monitorenter
    //   55: ldc_w 307
    //   58: astore_1
    //   59: aload_0
    //   60: ldc_w 309
    //   63: invokevirtual 313	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   66: astore_3
    //   67: invokestatic 319	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   70: astore 4
    //   72: aload 4
    //   74: aload_3
    //   75: ldc_w 321
    //   78: invokeinterface 327 3 0
    //   83: aload 4
    //   85: invokeinterface 330 1 0
    //   90: istore 5
    //   92: aload 4
    //   94: invokeinterface 333 1 0
    //   99: istore 6
    //   101: aload_1
    //   102: astore 7
    //   104: iload 6
    //   106: iconst_1
    //   107: if_icmpeq +68 -> 175
    //   110: iload 6
    //   112: iconst_3
    //   113: if_icmpne +18 -> 131
    //   116: aload_1
    //   117: astore 7
    //   119: aload 4
    //   121: invokeinterface 330 1 0
    //   126: iload 5
    //   128: if_icmple +47 -> 175
    //   131: iload 6
    //   133: iconst_3
    //   134: if_icmpeq -42 -> 92
    //   137: iload 6
    //   139: iconst_4
    //   140: if_icmpne +6 -> 146
    //   143: goto -51 -> 92
    //   146: aload 4
    //   148: invokeinterface 336 1 0
    //   153: ldc_w 338
    //   156: invokevirtual 343	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   159: ifeq -67 -> 92
    //   162: aload 4
    //   164: aconst_null
    //   165: ldc_w 345
    //   168: invokeinterface 349 3 0
    //   173: astore 7
    //   175: aload 7
    //   177: astore 4
    //   179: aload_3
    //   180: ifnull +39 -> 219
    //   183: aload 7
    //   185: astore_1
    //   186: goto +26 -> 212
    //   189: astore_0
    //   190: goto +57 -> 247
    //   193: astore 7
    //   195: ldc_w 351
    //   198: ldc_w 353
    //   201: invokestatic 134	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   204: pop
    //   205: aload_1
    //   206: astore 4
    //   208: aload_3
    //   209: ifnull +10 -> 219
    //   212: aload_3
    //   213: invokevirtual 358	java/io/FileInputStream:close	()V
    //   216: aload_1
    //   217: astore 4
    //   219: aload 4
    //   221: invokevirtual 361	java/lang/String:isEmpty	()Z
    //   224: ifne +9 -> 233
    //   227: aload 4
    //   229: astore_1
    //   230: goto +27 -> 257
    //   233: aload_0
    //   234: ldc_w 309
    //   237: invokevirtual 365	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   240: pop
    //   241: aload 4
    //   243: astore_1
    //   244: goto +13 -> 257
    //   247: aload_3
    //   248: ifnull +7 -> 255
    //   251: aload_3
    //   252: invokevirtual 358	java/io/FileInputStream:close	()V
    //   255: aload_0
    //   256: athrow
    //   257: aload_2
    //   258: monitorexit
    //   259: aload_1
    //   260: invokestatic 368	a0/i:b	(Ljava/lang/String;)La0/i;
    //   263: astore_1
    //   264: getstatic 56	android/os/Build$VERSION:SDK_INT	I
    //   267: istore 5
    //   269: aload_0
    //   270: astore 7
    //   272: iload 5
    //   274: bipush 32
    //   276: if_icmpgt +70 -> 346
    //   279: aload_0
    //   280: astore 7
    //   282: aload_1
    //   283: invokevirtual 370	a0/i:d	()Z
    //   286: ifne +60 -> 346
    //   289: new 197	android/content/res/Configuration
    //   292: dup
    //   293: aload_0
    //   294: invokevirtual 154	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   297: invokevirtual 195	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   300: invokespecial 373	android/content/res/Configuration:<init>	(Landroid/content/res/Configuration;)V
    //   303: astore 7
    //   305: iload 5
    //   307: bipush 24
    //   309: if_icmplt +12 -> 321
    //   312: aload 7
    //   314: aload_1
    //   315: invokestatic 378	a0/f:b	(Landroid/content/res/Configuration;La0/i;)V
    //   318: goto +20 -> 338
    //   321: aload_1
    //   322: invokevirtual 370	a0/i:d	()Z
    //   325: ifne +13 -> 338
    //   328: aload 7
    //   330: aload_1
    //   331: iconst_0
    //   332: invokevirtual 381	a0/i:c	(I)Ljava/util/Locale;
    //   335: invokevirtual 385	android/content/res/Configuration:setLocale	(Ljava/util/Locale;)V
    //   338: aload_0
    //   339: aload 7
    //   341: invokevirtual 389	android/content/Context:createConfigurationContext	(Landroid/content/res/Configuration;)Landroid/content/Context;
    //   344: astore 7
    //   346: aload 7
    //   348: areturn
    //   349: astore_0
    //   350: aload_2
    //   351: monitorexit
    //   352: aload_0
    //   353: athrow
    //   354: astore 7
    //   356: goto -99 -> 257
    //   359: astore 7
    //   361: aload_1
    //   362: astore 4
    //   364: goto -145 -> 219
    //   367: astore_1
    //   368: goto -113 -> 255
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	371	0	paramContext	Context
    //   15	347	1	localObject1	Object
    //   367	1	1	localIOException1	java.io.IOException
    //   52	299	2	localObject2	Object
    //   66	186	3	localFileInputStream	java.io.FileInputStream
    //   70	293	4	localObject3	Object
    //   90	220	5	i	int
    //   99	42	6	j	int
    //   102	82	7	localObject4	Object
    //   193	1	7	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   270	77	7	localObject5	Object
    //   354	1	7	localFileNotFoundException	java.io.FileNotFoundException
    //   359	1	7	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   67	92	189	finally
    //   92	101	189	finally
    //   119	131	189	finally
    //   146	175	189	finally
    //   195	205	189	finally
    //   67	92	193	org/xmlpull/v1/XmlPullParserException
    //   67	92	193	java/io/IOException
    //   92	101	193	org/xmlpull/v1/XmlPullParserException
    //   92	101	193	java/io/IOException
    //   119	131	193	org/xmlpull/v1/XmlPullParserException
    //   119	131	193	java/io/IOException
    //   146	175	193	org/xmlpull/v1/XmlPullParserException
    //   146	175	193	java/io/IOException
    //   59	67	349	finally
    //   212	216	349	finally
    //   219	227	349	finally
    //   233	241	349	finally
    //   251	255	349	finally
    //   255	257	349	finally
    //   257	259	349	finally
    //   350	352	349	finally
    //   59	67	354	java/io/FileNotFoundException
    //   212	216	359	java/io/IOException
    //   251	255	367	java/io/IOException
  }
  
  public static File getDataDir(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return c.b(paramContext);
    }
    paramContext = getApplicationInfodataDir;
    if (paramContext != null) {
      paramContext = new File(paramContext);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static Display getDisplayOrDefault(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return f.c(paramContext);
    }
    return ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
  }
  
  public static Drawable getDrawable(Context paramContext, int paramInt)
  {
    return a.b(paramContext, paramInt);
  }
  
  public static File[] getExternalCacheDirs(Context paramContext)
  {
    return paramContext.getExternalCacheDirs();
  }
  
  public static File[] getExternalFilesDirs(Context paramContext, String paramString)
  {
    return paramContext.getExternalFilesDirs(paramString);
  }
  
  public static Executor getMainExecutor(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return e.a(paramContext);
    }
    return new h(new Handler(paramContext.getMainLooper()));
  }
  
  public static File getNoBackupFilesDir(Context paramContext)
  {
    return a.c(paramContext);
  }
  
  public static File[] getObbDirs(Context paramContext)
  {
    return paramContext.getObbDirs();
  }
  
  public static String getString(Context paramContext, int paramInt)
  {
    return getContextForLanguage(paramContext).getString(paramInt);
  }
  
  public static <T> T getSystemService(Context paramContext, Class<T> paramClass)
  {
    return (T)b.b(paramContext, paramClass);
  }
  
  public static String getSystemServiceName(Context paramContext, Class<?> paramClass)
  {
    return b.c(paramContext, paramClass);
  }
  
  public static boolean isDeviceProtectedStorage(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return c.c(paramContext);
    }
    return false;
  }
  
  public static String obtainAndCheckReceiverPermission(Context paramContext)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramContext.getPackageName());
    ((StringBuilder)localObject).append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
    localObject = ((StringBuilder)localObject).toString();
    if (x6.b.F(paramContext, (String)localObject) == 0) {
      return (String)localObject;
    }
    throw new RuntimeException(g.e("Permission ", (String)localObject, " is required by your application to receive broadcasts, please add it to your manifest"));
  }
  
  public static Intent registerReceiver(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, int paramInt)
  {
    return registerReceiver(paramContext, paramBroadcastReceiver, paramIntentFilter, null, null, paramInt);
  }
  
  public static Intent registerReceiver(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    int i = paramInt & 0x1;
    if ((i != 0) && ((paramInt & 0x4) != 0)) {
      throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }
    int j = paramInt;
    if (i != 0) {
      j = paramInt | 0x2;
    }
    paramInt = j & 0x2;
    if ((paramInt == 0) && ((j & 0x4) == 0)) {
      throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
    }
    if ((paramInt != 0) && ((j & 0x4) != 0)) {
      throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }
    paramInt = Build.VERSION.SDK_INT;
    if (paramInt >= 33) {
      return g.a(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
    }
    if (paramInt >= 26) {
      return d.a(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, j);
    }
    if (((j & 0x4) != 0) && (paramString == null)) {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, obtainAndCheckReceiverPermission(paramContext), paramHandler);
    }
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler);
  }
  
  public static boolean startActivities(Context paramContext, Intent[] paramArrayOfIntent)
  {
    return startActivities(paramContext, paramArrayOfIntent, null);
  }
  
  public static boolean startActivities(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    paramContext.startActivities(paramArrayOfIntent, paramBundle);
    return true;
  }
  
  public static void startActivity(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    paramContext.startActivity(paramIntent, paramBundle);
  }
  
  public static void startForegroundService(Context paramContext, Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      d.b(paramContext, paramIntent);
    } else {
      paramContext.startService(paramIntent);
    }
  }
  
  public static final class a
  {
    public static File a(Context paramContext)
    {
      return paramContext.getCodeCacheDir();
    }
    
    public static Drawable b(Context paramContext, int paramInt)
    {
      return paramContext.getDrawable(paramInt);
    }
    
    public static File c(Context paramContext)
    {
      return paramContext.getNoBackupFilesDir();
    }
  }
  
  public static final class b
  {
    public static int a(Context paramContext, int paramInt)
    {
      return paramContext.getColor(paramInt);
    }
    
    public static <T> T b(Context paramContext, Class<T> paramClass)
    {
      return (T)paramContext.getSystemService(paramClass);
    }
    
    public static String c(Context paramContext, Class<?> paramClass)
    {
      return paramContext.getSystemServiceName(paramClass);
    }
  }
  
  public static final class c
  {
    public static Context a(Context paramContext)
    {
      return d.f(paramContext);
    }
    
    public static File b(Context paramContext)
    {
      return a0.e.d(paramContext);
    }
    
    public static boolean c(Context paramContext)
    {
      return b0.f.q(paramContext);
    }
  }
  
  public static final class d
  {
    public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
    {
      if (((paramInt & 0x4) != 0) && (paramString == null)) {
        return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, a.obtainAndCheckReceiverPermission(paramContext), paramHandler);
      }
      return d2.e.e(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt & 0x1);
    }
    
    public static ComponentName b(Context paramContext, Intent paramIntent)
    {
      return com.google.android.gms.internal.base.a.h(paramContext, paramIntent);
    }
  }
  
  public static final class e
  {
    public static Executor a(Context paramContext)
    {
      return android.support.v4.media.session.b.g(paramContext);
    }
  }
  
  public static final class f
  {
    public static Context a(Context paramContext, String paramString)
    {
      return g0.b(paramContext, paramString);
    }
    
    public static String b(Context paramContext)
    {
      return f0.c(paramContext);
    }
    
    public static Display c(Context paramContext)
    {
      try
      {
        Display localDisplay = d3.a.b(paramContext);
        return localDisplay;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("The context:");
        localStringBuilder.append(paramContext);
        localStringBuilder.append(" is not associated with any display. Return a fallback display instead.");
        Log.w("ContextCompat", localStringBuilder.toString());
      }
      return ((DisplayManager)paramContext.getSystemService(DisplayManager.class)).getDisplay(0);
    }
  }
  
  public static final class g
  {
    public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
    {
      return d2.e.e(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     v.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */