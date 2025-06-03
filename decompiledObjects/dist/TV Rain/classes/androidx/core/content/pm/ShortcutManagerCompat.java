package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l4;
import p3;

public class ShortcutManagerCompat
{
  @VisibleForTesting
  public static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
  private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
  private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
  public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
  public static final int FLAG_MATCH_CACHED = 8;
  public static final int FLAG_MATCH_DYNAMIC = 2;
  public static final int FLAG_MATCH_MANIFEST = 1;
  public static final int FLAG_MATCH_PINNED = 4;
  @VisibleForTesting
  public static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
  private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
  private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
  private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
  private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;
  
  public static boolean addDynamicShortcuts(@NonNull Context paramContext, @NonNull List<ShortcutInfoCompat> paramList)
  {
    List localList = removeShortcutsExcludedFromSurface(paramList, 1);
    int i = Build.VERSION.SDK_INT;
    if (i <= 29) {
      convertUriIconsToBitmapIcons(paramContext, localList);
    }
    if (i >= 25)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)localIterator.next()).toShortcutInfo());
      }
      if (!((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).addDynamicShortcuts(localArrayList)) {
        return false;
      }
    }
    getShortcutInfoSaverInstance(paramContext).addShortcuts(localList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutAdded(paramList);
    }
    return true;
  }
  
  @VisibleForTesting
  public static boolean convertUriIconToBitmapIcon(@NonNull Context paramContext, @NonNull ShortcutInfoCompat paramShortcutInfoCompat)
  {
    IconCompat localIconCompat = mIcon;
    if (localIconCompat == null) {
      return false;
    }
    int i = mType;
    if ((i != 6) && (i != 4)) {
      return true;
    }
    paramContext = localIconCompat.getUriInputStream(paramContext);
    if (paramContext == null) {
      return false;
    }
    paramContext = BitmapFactory.decodeStream(paramContext);
    if (paramContext == null) {
      return false;
    }
    if (i == 6) {
      paramContext = IconCompat.createWithAdaptiveBitmap(paramContext);
    } else {
      paramContext = IconCompat.createWithBitmap(paramContext);
    }
    mIcon = paramContext;
    return true;
  }
  
  @VisibleForTesting
  public static void convertUriIconsToBitmapIcons(@NonNull Context paramContext, @NonNull List<ShortcutInfoCompat> paramList)
  {
    Iterator localIterator = new ArrayList(paramList).iterator();
    while (localIterator.hasNext())
    {
      ShortcutInfoCompat localShortcutInfoCompat = (ShortcutInfoCompat)localIterator.next();
      if (!convertUriIconToBitmapIcon(paramContext, localShortcutInfoCompat)) {
        paramList.remove(localShortcutInfoCompat);
      }
    }
  }
  
  @NonNull
  public static Intent createShortcutResultIntent(@NonNull Context paramContext, @NonNull ShortcutInfoCompat paramShortcutInfoCompat)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext = p3.d((ShortcutManager)paramContext.getSystemService(ShortcutManager.class), paramShortcutInfoCompat.toShortcutInfo());
    } else {
      paramContext = null;
    }
    Object localObject = paramContext;
    if (paramContext == null) {
      localObject = new Intent();
    }
    return paramShortcutInfoCompat.addToIntent((Intent)localObject);
  }
  
  public static void disableShortcuts(@NonNull Context paramContext, @NonNull List<String> paramList, @Nullable CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).disableShortcuts(paramList, paramCharSequence);
    }
    getShortcutInfoSaverInstance(paramContext).removeShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutRemoved(paramList);
    }
  }
  
  public static void enableShortcuts(@NonNull Context paramContext, @NonNull List<ShortcutInfoCompat> paramList)
  {
    List localList = removeShortcutsExcludedFromSurface(paramList, 1);
    if (Build.VERSION.SDK_INT >= 25)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(nextmId);
      }
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).enableShortcuts(localArrayList);
    }
    getShortcutInfoSaverInstance(paramContext).addShortcuts(localList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutAdded(paramList);
    }
  }
  
  @NonNull
  public static List<ShortcutInfoCompat> getDynamicShortcuts(@NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      Object localObject = ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
      ArrayList localArrayList = new ArrayList(((List)localObject).size());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(new ShortcutInfoCompat.Builder(paramContext, (ShortcutInfo)((Iterator)localObject).next()).build());
      }
      return localArrayList;
    }
    try
    {
      paramContext = getShortcutInfoSaverInstance(paramContext).getShortcuts();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return new ArrayList();
  }
  
  private static int getIconDimensionInternal(@NonNull Context paramContext, boolean paramBoolean)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if ((localActivityManager != null) && (!localActivityManager.isLowRamDevice())) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      i = 48;
    } else {
      i = 96;
    }
    int i = Math.max(1, i);
    paramContext = paramContext.getResources().getDisplayMetrics();
    float f;
    if (paramBoolean) {
      f = xdpi;
    } else {
      f = ydpi;
    }
    f /= 160.0F;
    return (int)(i * f);
  }
  
  public static int getIconMaxHeight(@NonNull Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }
    return getIconDimensionInternal(paramContext, false);
  }
  
  public static int getIconMaxWidth(@NonNull Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }
    return getIconDimensionInternal(paramContext, true);
  }
  
  public static int getMaxShortcutCountPerActivity(@NonNull Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }
    return 5;
  }
  
  @VisibleForTesting
  public static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners()
  {
    return sShortcutInfoChangeListeners;
  }
  
  private static String getShortcutInfoCompatWithLowestRank(@NonNull List<ShortcutInfoCompat> paramList)
  {
    Iterator localIterator = paramList.iterator();
    int i = -1;
    paramList = null;
    while (localIterator.hasNext())
    {
      ShortcutInfoCompat localShortcutInfoCompat = (ShortcutInfoCompat)localIterator.next();
      if (localShortcutInfoCompat.getRank() > i)
      {
        paramList = localShortcutInfoCompat.getId();
        i = localShortcutInfoCompat.getRank();
      }
    }
    return paramList;
  }
  
  private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context paramContext)
  {
    ArrayList localArrayList;
    Object localObject1;
    Object localObject2;
    if (sShortcutInfoChangeListeners == null)
    {
      localArrayList = new ArrayList();
      localObject1 = paramContext.getPackageManager();
      localObject2 = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
      ((Intent)localObject2).setPackage(paramContext.getPackageName());
      localObject2 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 128).iterator();
    }
    for (;;)
    {
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = nextactivityInfo;
        if (localObject1 != null)
        {
          localObject1 = metaData;
          if (localObject1 != null)
          {
            localObject1 = ((BaseBundle)localObject1).getString("androidx.core.content.pm.shortcut_listener_impl");
            if (localObject1 == null) {}
          }
        }
      }
      else
      {
        try
        {
          localArrayList.add((ShortcutInfoChangeListener)Class.forName((String)localObject1, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext }));
        }
        catch (Exception localException) {}
        if (sShortcutInfoChangeListeners == null) {
          sShortcutInfoChangeListeners = localArrayList;
        }
        return sShortcutInfoChangeListeners;
      }
    }
  }
  
  private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context paramContext)
  {
    if (sShortcutInfoCompatSaver == null) {}
    try
    {
      sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver)Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext });
      if (sShortcutInfoCompatSaver == null) {
        sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
      }
      return sShortcutInfoCompatSaver;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  @NonNull
  public static List<ShortcutInfoCompat> getShortcuts(@NonNull Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      return ShortcutInfoCompat.fromShortcuts(paramContext, l4.g((ShortcutManager)paramContext.getSystemService(ShortcutManager.class), paramInt));
    }
    if (i >= 25)
    {
      ShortcutManager localShortcutManager = (ShortcutManager)paramContext.getSystemService(ShortcutManager.class);
      ArrayList localArrayList = new ArrayList();
      if ((paramInt & 0x1) != 0) {
        localArrayList.addAll(localShortcutManager.getManifestShortcuts());
      }
      if ((paramInt & 0x2) != 0) {
        localArrayList.addAll(localShortcutManager.getDynamicShortcuts());
      }
      if ((paramInt & 0x4) != 0) {
        localArrayList.addAll(localShortcutManager.getPinnedShortcuts());
      }
      return ShortcutInfoCompat.fromShortcuts(paramContext, localArrayList);
    }
    if ((paramInt & 0x2) != 0) {}
    try
    {
      paramContext = getShortcutInfoSaverInstance(paramContext).getShortcuts();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return Collections.emptyList();
  }
  
  public static boolean isRateLimitingActive(@NonNull Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (Build.VERSION.SDK_INT >= 25) {
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }
    boolean bool;
    if (getShortcuts(paramContext, 3).size() == getMaxShortcutCountPerActivity(paramContext)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isRequestPinShortcutSupported(@NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return p3.t((ShortcutManager)paramContext.getSystemService(ShortcutManager.class));
    }
    if (ContextCompat.checkSelfPermission(paramContext, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
      return false;
    }
    Iterator localIterator = paramContext.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
    while (localIterator.hasNext())
    {
      paramContext = nextactivityInfo.permission;
      if ((TextUtils.isEmpty(paramContext)) || ("com.android.launcher.permission.INSTALL_SHORTCUT".equals(paramContext))) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  public static boolean pushDynamicShortcut(@NonNull Context paramContext, @NonNull ShortcutInfoCompat paramShortcutInfoCompat)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 279	androidx/core/util/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: invokestatic 279	androidx/core/util/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: getstatic 65	android/os/Build$VERSION:SDK_INT	I
    //   13: istore_2
    //   14: iload_2
    //   15: bipush 31
    //   17: if_icmpgt +51 -> 68
    //   20: aload_1
    //   21: iconst_1
    //   22: invokevirtual 440	androidx/core/content/pm/ShortcutInfoCompat:isExcludedFromSurfaces	(I)Z
    //   25: ifeq +43 -> 68
    //   28: aload_0
    //   29: invokestatic 123	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   32: invokeinterface 78 1 0
    //   37: astore_0
    //   38: aload_0
    //   39: invokeinterface 84 1 0
    //   44: ifeq +22 -> 66
    //   47: aload_0
    //   48: invokeinterface 88 1 0
    //   53: checkcast 125	androidx/core/content/pm/ShortcutInfoChangeListener
    //   56: aload_1
    //   57: invokestatic 444	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   60: invokevirtual 129	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   63: goto -25 -> 38
    //   66: iconst_1
    //   67: ireturn
    //   68: aload_0
    //   69: invokestatic 407	androidx/core/content/pm/ShortcutManagerCompat:getMaxShortcutCountPerActivity	(Landroid/content/Context;)I
    //   72: istore_3
    //   73: iload_3
    //   74: ifne +5 -> 79
    //   77: iconst_0
    //   78: ireturn
    //   79: iload_2
    //   80: bipush 29
    //   82: if_icmpgt +9 -> 91
    //   85: aload_0
    //   86: aload_1
    //   87: invokestatic 167	androidx/core/content/pm/ShortcutManagerCompat:convertUriIconToBitmapIcon	(Landroid/content/Context;Landroidx/core/content/pm/ShortcutInfoCompat;)Z
    //   90: pop
    //   91: iload_2
    //   92: bipush 30
    //   94: if_icmplt +22 -> 116
    //   97: aload_0
    //   98: ldc 100
    //   100: invokevirtual 106	android/content/Context:getSystemService	(Ljava/lang/Class;)Ljava/lang/Object;
    //   103: checkcast 100	android/content/pm/ShortcutManager
    //   106: aload_1
    //   107: invokevirtual 94	androidx/core/content/pm/ShortcutInfoCompat:toShortcutInfo	()Landroid/content/pm/ShortcutInfo;
    //   110: invokestatic 448	l4:h	(Landroid/content/pm/ShortcutManager;Landroid/content/pm/ShortcutInfo;)V
    //   113: goto +88 -> 201
    //   116: iload_2
    //   117: bipush 25
    //   119: if_icmplt +82 -> 201
    //   122: aload_0
    //   123: ldc 100
    //   125: invokevirtual 106	android/content/Context:getSystemService	(Ljava/lang/Class;)Ljava/lang/Object;
    //   128: checkcast 100	android/content/pm/ShortcutManager
    //   131: astore 4
    //   133: aload 4
    //   135: invokevirtual 403	android/content/pm/ShortcutManager:isRateLimitingActive	()Z
    //   138: ifeq +5 -> 143
    //   141: iconst_0
    //   142: ireturn
    //   143: aload 4
    //   145: invokevirtual 218	android/content/pm/ShortcutManager:getDynamicShortcuts	()Ljava/util/List;
    //   148: astore 5
    //   150: aload 5
    //   152: invokeinterface 204 1 0
    //   157: iload_3
    //   158: if_icmplt +23 -> 181
    //   161: aload 4
    //   163: iconst_1
    //   164: anewarray 432	java/lang/String
    //   167: dup
    //   168: iconst_0
    //   169: aload 5
    //   171: invokestatic 451	androidx/core/content/pm/ShortcutManagerCompat$Api25Impl:getShortcutInfoWithLowestRank	(Ljava/util/List;)Ljava/lang/String;
    //   174: aastore
    //   175: invokestatic 457	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   178: invokevirtual 460	android/content/pm/ShortcutManager:removeDynamicShortcuts	(Ljava/util/List;)V
    //   181: aload 4
    //   183: iconst_1
    //   184: anewarray 222	android/content/pm/ShortcutInfo
    //   187: dup
    //   188: iconst_0
    //   189: aload_1
    //   190: invokevirtual 94	androidx/core/content/pm/ShortcutInfoCompat:toShortcutInfo	()Landroid/content/pm/ShortcutInfo;
    //   193: aastore
    //   194: invokestatic 457	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   197: invokevirtual 109	android/content/pm/ShortcutManager:addDynamicShortcuts	(Ljava/util/List;)Z
    //   200: pop
    //   201: aload_0
    //   202: invokestatic 113	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoSaverInstance	(Landroid/content/Context;)Landroidx/core/content/pm/ShortcutInfoCompatSaver;
    //   205: astore 5
    //   207: aload 5
    //   209: invokevirtual 232	androidx/core/content/pm/ShortcutInfoCompatSaver:getShortcuts	()Ljava/util/List;
    //   212: astore 4
    //   214: aload 4
    //   216: invokeinterface 204 1 0
    //   221: iload_3
    //   222: if_icmplt +24 -> 246
    //   225: aload 5
    //   227: iconst_1
    //   228: anewarray 432	java/lang/String
    //   231: dup
    //   232: iconst_0
    //   233: aload 4
    //   235: invokestatic 462	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoCompatWithLowestRank	(Ljava/util/List;)Ljava/lang/String;
    //   238: aastore
    //   239: invokestatic 457	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   242: invokevirtual 195	androidx/core/content/pm/ShortcutInfoCompatSaver:removeShortcuts	(Ljava/util/List;)Ljava/lang/Object;
    //   245: pop
    //   246: aload 5
    //   248: iconst_1
    //   249: anewarray 90	androidx/core/content/pm/ShortcutInfoCompat
    //   252: dup
    //   253: iconst_0
    //   254: aload_1
    //   255: aastore
    //   256: invokestatic 457	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   259: invokevirtual 119	androidx/core/content/pm/ShortcutInfoCompatSaver:addShortcuts	(Ljava/util/List;)Ljava/lang/Object;
    //   262: pop
    //   263: aload_0
    //   264: invokestatic 123	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   267: invokeinterface 78 1 0
    //   272: astore 4
    //   274: aload 4
    //   276: invokeinterface 84 1 0
    //   281: ifeq +23 -> 304
    //   284: aload 4
    //   286: invokeinterface 88 1 0
    //   291: checkcast 125	androidx/core/content/pm/ShortcutInfoChangeListener
    //   294: aload_1
    //   295: invokestatic 444	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   298: invokevirtual 129	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   301: goto -27 -> 274
    //   304: aload_0
    //   305: aload_1
    //   306: invokevirtual 302	androidx/core/content/pm/ShortcutInfoCompat:getId	()Ljava/lang/String;
    //   309: invokestatic 466	androidx/core/content/pm/ShortcutManagerCompat:reportShortcutUsed	(Landroid/content/Context;Ljava/lang/String;)V
    //   312: iconst_1
    //   313: ireturn
    //   314: astore 5
    //   316: aload_0
    //   317: invokestatic 123	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   320: invokeinterface 78 1 0
    //   325: astore 4
    //   327: aload 4
    //   329: invokeinterface 84 1 0
    //   334: ifeq +23 -> 357
    //   337: aload 4
    //   339: invokeinterface 88 1 0
    //   344: checkcast 125	androidx/core/content/pm/ShortcutInfoChangeListener
    //   347: aload_1
    //   348: invokestatic 444	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   351: invokevirtual 129	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   354: goto -27 -> 327
    //   357: aload_0
    //   358: aload_1
    //   359: invokevirtual 302	androidx/core/content/pm/ShortcutInfoCompat:getId	()Ljava/lang/String;
    //   362: invokestatic 466	androidx/core/content/pm/ShortcutManagerCompat:reportShortcutUsed	(Landroid/content/Context;Ljava/lang/String;)V
    //   365: aload 5
    //   367: athrow
    //   368: astore 4
    //   370: aload_0
    //   371: invokestatic 123	androidx/core/content/pm/ShortcutManagerCompat:getShortcutInfoListeners	(Landroid/content/Context;)Ljava/util/List;
    //   374: invokeinterface 78 1 0
    //   379: astore 4
    //   381: aload 4
    //   383: invokeinterface 84 1 0
    //   388: ifeq +23 -> 411
    //   391: aload 4
    //   393: invokeinterface 88 1 0
    //   398: checkcast 125	androidx/core/content/pm/ShortcutInfoChangeListener
    //   401: aload_1
    //   402: invokestatic 444	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   405: invokevirtual 129	androidx/core/content/pm/ShortcutInfoChangeListener:onShortcutAdded	(Ljava/util/List;)V
    //   408: goto -27 -> 381
    //   411: aload_0
    //   412: aload_1
    //   413: invokevirtual 302	androidx/core/content/pm/ShortcutInfoCompat:getId	()Ljava/lang/String;
    //   416: invokestatic 466	androidx/core/content/pm/ShortcutManagerCompat:reportShortcutUsed	(Landroid/content/Context;Ljava/lang/String;)V
    //   419: iconst_0
    //   420: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	421	0	paramContext	Context
    //   0	421	1	paramShortcutInfoCompat	ShortcutInfoCompat
    //   13	107	2	i	int
    //   72	151	3	j	int
    //   131	207	4	localObject1	Object
    //   368	1	4	localException	Exception
    //   379	13	4	localIterator	Iterator
    //   148	99	5	localObject2	Object
    //   314	52	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   207	246	314	finally
    //   246	263	314	finally
    //   207	246	368	java/lang/Exception
    //   246	263	368	java/lang/Exception
  }
  
  public static void removeAllDynamicShortcuts(@NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
    }
    getShortcutInfoSaverInstance(paramContext).removeAllShortcuts();
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onAllShortcutsRemoved();
    }
  }
  
  public static void removeDynamicShortcuts(@NonNull Context paramContext, @NonNull List<String> paramList)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(paramList);
    }
    getShortcutInfoSaverInstance(paramContext).removeShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutRemoved(paramList);
    }
  }
  
  public static void removeLongLivedShortcuts(@NonNull Context paramContext, @NonNull List<String> paramList)
  {
    if (Build.VERSION.SDK_INT < 30)
    {
      removeDynamicShortcuts(paramContext, paramList);
      return;
    }
    l4.i((ShortcutManager)paramContext.getSystemService(ShortcutManager.class), paramList);
    getShortcutInfoSaverInstance(paramContext).removeShortcuts(paramList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutRemoved(paramList);
    }
  }
  
  @NonNull
  private static List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface(@NonNull List<ShortcutInfoCompat> paramList, int paramInt)
  {
    Objects.requireNonNull(paramList);
    if (Build.VERSION.SDK_INT > 31) {
      return paramList;
    }
    ArrayList localArrayList = new ArrayList(paramList);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (ShortcutInfoCompat)localIterator.next();
      if (paramList.isExcludedFromSurfaces(paramInt)) {
        localArrayList.remove(paramList);
      }
    }
    return localArrayList;
  }
  
  public static void reportShortcutUsed(@NonNull Context paramContext, @NonNull String paramString)
  {
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramString);
    if (Build.VERSION.SDK_INT >= 25) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).reportShortcutUsed(paramString);
    }
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutUsageReported(Collections.singletonList(paramString));
    }
  }
  
  public static boolean requestPinShortcut(@NonNull Context paramContext, @NonNull ShortcutInfoCompat paramShortcutInfoCompat, @Nullable IntentSender paramIntentSender)
  {
    int i = Build.VERSION.SDK_INT;
    if ((i <= 31) && (paramShortcutInfoCompat.isExcludedFromSurfaces(1))) {
      return false;
    }
    if (i >= 26) {
      return p3.u((ShortcutManager)paramContext.getSystemService(ShortcutManager.class), paramShortcutInfoCompat.toShortcutInfo(), paramIntentSender);
    }
    if (!isRequestPinShortcutSupported(paramContext)) {
      return false;
    }
    paramShortcutInfoCompat = paramShortcutInfoCompat.addToIntent(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
    if (paramIntentSender == null)
    {
      paramContext.sendBroadcast(paramShortcutInfoCompat);
      return true;
    }
    paramContext.sendOrderedBroadcast(paramShortcutInfoCompat, null, new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        try
        {
          sendIntent(paramAnonymousContext, 0, null, null, null);
          return;
        }
        catch (IntentSender.SendIntentException paramAnonymousContext)
        {
          for (;;) {}
        }
      }
    }, null, -1, null, null);
    return true;
  }
  
  public static boolean setDynamicShortcuts(@NonNull Context paramContext, @NonNull List<ShortcutInfoCompat> paramList)
  {
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramList);
    Object localObject = removeShortcutsExcludedFromSurface(paramList, 1);
    if (Build.VERSION.SDK_INT >= 25)
    {
      ArrayList localArrayList = new ArrayList(((List)localObject).size());
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)localIterator.next()).toShortcutInfo());
      }
      if (!((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).setDynamicShortcuts(localArrayList)) {
        return false;
      }
    }
    getShortcutInfoSaverInstance(paramContext).removeAllShortcuts();
    getShortcutInfoSaverInstance(paramContext).addShortcuts((List)localObject);
    localObject = getShortcutInfoListeners(paramContext).iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramContext = (ShortcutInfoChangeListener)((Iterator)localObject).next();
      paramContext.onAllShortcutsRemoved();
      paramContext.onShortcutAdded(paramList);
    }
    return true;
  }
  
  @VisibleForTesting
  public static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> paramList)
  {
    sShortcutInfoChangeListeners = paramList;
  }
  
  @VisibleForTesting
  public static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> paramShortcutInfoCompatSaver)
  {
    sShortcutInfoCompatSaver = paramShortcutInfoCompatSaver;
  }
  
  public static boolean updateShortcuts(@NonNull Context paramContext, @NonNull List<ShortcutInfoCompat> paramList)
  {
    List localList = removeShortcutsExcludedFromSurface(paramList, 1);
    int i = Build.VERSION.SDK_INT;
    if (i <= 29) {
      convertUriIconsToBitmapIcons(paramContext, localList);
    }
    if (i >= 25)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((ShortcutInfoCompat)localIterator.next()).toShortcutInfo());
      }
      if (!((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).updateShortcuts(localArrayList)) {
        return false;
      }
    }
    getShortcutInfoSaverInstance(paramContext).addShortcuts(localList);
    paramContext = getShortcutInfoListeners(paramContext).iterator();
    while (paramContext.hasNext()) {
      ((ShortcutInfoChangeListener)paramContext.next()).onShortcutUpdated(paramList);
    }
    return true;
  }
  
  @RequiresApi(25)
  public static class Api25Impl
  {
    public static String getShortcutInfoWithLowestRank(@NonNull List<ShortcutInfo> paramList)
    {
      Iterator localIterator = paramList.iterator();
      int i = -1;
      paramList = null;
      while (localIterator.hasNext())
      {
        ShortcutInfo localShortcutInfo = (ShortcutInfo)localIterator.next();
        if (localShortcutInfo.getRank() > i)
        {
          paramList = localShortcutInfo.getId();
          i = localShortcutInfo.getRank();
        }
      }
      return paramList;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ShortcutMatchFlags {}
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */