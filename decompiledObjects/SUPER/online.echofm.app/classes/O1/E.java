package O1;

import T1.a;
import W5.g;
import W5.m;
import Y1.e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.o;
import x1.q;

public final class E
{
  public static final E a;
  public static final String b;
  public static final List c;
  public static final List d;
  public static final Map e;
  public static final AtomicBoolean f = new AtomicBoolean(false);
  public static final Integer[] g = { Integer.valueOf(20210906), Integer.valueOf(20171115), Integer.valueOf(20170417), Integer.valueOf(20170411), Integer.valueOf(20170213), Integer.valueOf(20161017), Integer.valueOf(20160327), Integer.valueOf(20150702), Integer.valueOf(20150401), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140313), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20131024), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101) };
  
  static
  {
    E localE = new E();
    a = localE;
    b = E.class.getName();
    c = localE.f();
    d = localE.e();
    e = localE.d();
  }
  
  public static final Intent A(Context paramContext, Intent paramIntent, e parame)
  {
    if (a.d(E.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      if (paramIntent == null) {
        return null;
      }
      ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveService(paramIntent, 0);
      if (localResolveInfo == null) {
        return null;
      }
      parame = k.a;
      parame = serviceInfo.packageName;
      Intrinsics.checkNotNullExpressionValue(parame, "resolveInfo.serviceInfo.packageName");
      boolean bool = k.a(paramContext, parame);
      if (!bool) {
        paramIntent = null;
      }
      return paramIntent;
    }
    finally
    {
      a.b(paramContext, E.class);
    }
    return null;
  }
  
  public static final int h(TreeSet paramTreeSet, int paramInt, int[] paramArrayOfInt)
  {
    if (a.d(E.class)) {
      return 0;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramArrayOfInt, "versionSpec");
      i = -1;
      if (paramTreeSet == null) {
        return -1;
      }
      j = paramArrayOfInt.length - 1;
      localIterator = paramTreeSet.descendingIterator();
      k = -1;
    }
    finally
    {
      for (;;)
      {
        int i;
        Iterator localIterator;
        int m;
        int n;
        int i1;
        break;
        if (i1 < 0) {
          return -1;
        }
        int j = i1;
        int k = n;
        if (paramArrayOfInt[i1] == paramTreeSet.intValue())
        {
          m = i;
          if (i1 % 2 == 0) {
            m = Math.min(n, paramInt);
          }
          return m;
        }
      }
      a.b(paramTreeSet, E.class);
    }
    m = i;
    if (localIterator.hasNext())
    {
      paramTreeSet = (Integer)localIterator.next();
      Intrinsics.checkNotNullExpressionValue(paramTreeSet, "fbAppVersion");
      n = Math.max(k, paramTreeSet.intValue());
      for (i1 = j; (i1 >= 0) && (paramArrayOfInt[i1] > paramTreeSet.intValue()); i1--) {}
    }
    return 0;
  }
  
  /* Error */
  public static final Bundle i(o paramo)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 108	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ifnonnull +5 -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: new 202	android/os/Bundle
    //   19: astore_1
    //   20: aload_1
    //   21: invokespecial 203	android/os/Bundle:<init>	()V
    //   24: aload_1
    //   25: ldc -51
    //   27: aload_0
    //   28: invokevirtual 210	x1/o:toString	()Ljava/lang/String;
    //   31: invokevirtual 216	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_0
    //   35: instanceof 218
    //   38: ifeq +18 -> 56
    //   41: aload_1
    //   42: ldc -36
    //   44: ldc -34
    //   46: invokevirtual 216	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: goto +7 -> 56
    //   52: astore_0
    //   53: goto +5 -> 58
    //   56: aload_1
    //   57: areturn
    //   58: aload_0
    //   59: ldc 2
    //   61: invokestatic 155	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   64: aconst_null
    //   65: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramo	o
    //   19	38	1	localBundle	Bundle
    // Exception table:
    //   from	to	target	type
    //   16	49	52	finally
  }
  
  public static final Intent j(Context paramContext, String paramString1, Collection paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, e parame, String paramString3, String paramString4, String paramString5, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    if (a.d(E.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString1, "applicationId");
      Intrinsics.checkNotNullParameter(paramCollection, "permissions");
      Intrinsics.checkNotNullParameter(paramString2, "e2e");
      Intrinsics.checkNotNullParameter(parame, "defaultAudience");
      Intrinsics.checkNotNullParameter(paramString3, "clientState");
      Intrinsics.checkNotNullParameter(paramString4, "authType");
      b localb = new O1/E$b;
      localb.<init>();
      paramContext = z(paramContext, a.k(localb, paramString1, paramCollection, paramString2, paramBoolean2, parame, paramString3, paramString4, false, paramString5, paramBoolean3, Y1.B.r, paramBoolean4, paramBoolean5, "", null, null), localb);
      return paramContext;
    }
    finally
    {
      a.b(paramContext, E.class);
    }
    return null;
  }
  
  public static final Intent l(Context paramContext)
  {
    if (a.d(E.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        Intent localIntent = new android/content/Intent;
        localIntent.<init>("com.facebook.platform.PLATFORM_SERVICE");
        localIntent = A(paramContext, localIntent.setPackage(locale.d()).addCategory("android.intent.category.DEFAULT"), locale);
        if (localIntent != null) {
          return localIntent;
        }
      }
    }
    finally
    {
      break label87;
      return null;
      label87:
      a.b(paramContext, E.class);
    }
    return null;
  }
  
  public static final Intent m(Intent paramIntent, Bundle paramBundle, o paramo)
  {
    if (a.d(E.class)) {
      return null;
    }
    Intent localIntent;
    try
    {
      Intrinsics.checkNotNullParameter(paramIntent, "requestIntent");
      UUID localUUID = p(paramIntent);
      if (localUUID == null) {
        return null;
      }
      localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", v(paramIntent));
      paramIntent = new android/os/Bundle;
      paramIntent.<init>();
      paramIntent.putString("action_id", localUUID.toString());
      if (paramo != null) {
        paramIntent.putBundle("error", i(paramo));
      }
    }
    finally
    {
      break label119;
    }
    localIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", paramIntent);
    if (paramBundle != null) {
      localIntent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", paramBundle);
    }
    return localIntent;
    label119:
    a.b(paramIntent, E.class);
    return null;
  }
  
  public static final List n(Context paramContext, String paramString1, Collection paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, e parame, String paramString3, String paramString4, boolean paramBoolean3, String paramString5, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, String paramString6, String paramString7, String paramString8)
  {
    if (a.d(E.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        Intrinsics.checkNotNullParameter(paramString1, "applicationId");
        Intrinsics.checkNotNullParameter(paramCollection, "permissions");
        Intrinsics.checkNotNullParameter(paramString2, "e2e");
        Intrinsics.checkNotNullParameter(parame, "defaultAudience");
        Intrinsics.checkNotNullParameter(paramString3, "clientState");
        Intrinsics.checkNotNullParameter(paramString4, "authType");
        Object localObject1 = (Iterable)c;
        paramContext = new java/util/ArrayList;
        paramContext.<init>();
        localObject1 = ((Iterable)localObject1).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        Object localObject2 = (e)((Iterator)localObject1).next();
        localObject2 = a.k((e)localObject2, paramString1, paramCollection, paramString2, paramBoolean2, parame, paramString3, paramString4, paramBoolean3, paramString5, paramBoolean4, Y1.B.q, paramBoolean5, paramBoolean6, paramString6, paramString7, paramString8);
        if (localObject2 != null) {
          paramContext.add(localObject2);
        }
      }
      finally
      {
        break label162;
      }
    }
    return paramContext;
    label162:
    a.b(paramContext, E.class);
    return null;
  }
  
  public static final UUID p(Intent paramIntent)
  {
    boolean bool = a.d(E.class);
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    if (paramIntent == null) {
      return null;
    }
    try
    {
      if (!w(v(paramIntent))) {
        break label62;
      }
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
      if (paramIntent != null) {
        paramIntent = paramIntent.getString("action_id");
      }
    }
    finally
    {
      break label83;
    }
    paramIntent = null;
    break label70;
    label62:
    paramIntent = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
    label70:
    Object localObject2 = localObject1;
    if (paramIntent != null) {}
    try
    {
      localObject2 = UUID.fromString(paramIntent);
      return (UUID)localObject2;
      label83:
      a.b(paramIntent, E.class);
      return null;
    }
    catch (IllegalArgumentException paramIntent)
    {
      for (;;)
      {
        localObject2 = localObject1;
      }
    }
  }
  
  public static final o q(Bundle paramBundle)
  {
    if (a.d(E.class)) {
      return null;
    }
    if (paramBundle == null) {
      return null;
    }
    Object localObject2;
    try
    {
      localObject1 = paramBundle.getString("error_type");
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = paramBundle.getString("com.facebook.platform.status.ERROR_TYPE");
      }
    }
    finally
    {
      break label102;
    }
    String str = paramBundle.getString("error_description");
    Object localObject1 = str;
    if (str == null) {
      localObject1 = paramBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
    }
    if ((localObject2 != null) && (i.l((String)localObject2, "UserCanceled", true))) {
      paramBundle = new q((String)localObject1);
    } else {
      paramBundle = new o((String)localObject1);
    }
    return paramBundle;
    label102:
    a.b(paramBundle, E.class);
    return null;
  }
  
  public static final int s(int paramInt)
  {
    if (a.d(E.class)) {
      return 0;
    }
    try
    {
      paramInt = a.r(c, new int[] { paramInt }).c();
      return paramInt;
    }
    finally
    {
      a.b(localThrowable, E.class);
    }
    return 0;
  }
  
  public static final int t()
  {
    if (a.d(E.class)) {
      return 0;
    }
    try
    {
      int i = g[0].intValue();
      return i;
    }
    finally
    {
      a.b(localThrowable, E.class);
    }
    return 0;
  }
  
  public static final Bundle u(Intent paramIntent)
  {
    if (a.d(E.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramIntent, "intent");
      if (!w(v(paramIntent))) {
        paramIntent = paramIntent.getExtras();
      }
    }
    finally
    {
      break label49;
    }
    paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    return paramIntent;
    label49:
    a.b(paramIntent, E.class);
    return null;
  }
  
  public static final int v(Intent paramIntent)
  {
    if (a.d(E.class)) {
      return 0;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramIntent, "intent");
      int i = paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
      return i;
    }
    finally
    {
      a.b(paramIntent, E.class);
    }
    return 0;
  }
  
  public static final boolean w(int paramInt)
  {
    boolean bool1 = a.d(E.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      boolean bool3 = g.h(g, Integer.valueOf(paramInt));
      bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramInt >= 20140701) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      a.b(localThrowable, E.class);
    }
    return false;
  }
  
  public static final void x()
  {
    if (a.d(E.class)) {
      return;
    }
    try
    {
      if (!f.compareAndSet(false, true)) {
        return;
      }
      Executor localExecutor = x1.B.t();
      D localD = new O1/D;
      localD.<init>();
      localExecutor.execute(localD);
      return;
    }
    finally
    {
      a.b(localThrowable, E.class);
    }
  }
  
  public static final void y()
  {
    if (a.d(E.class)) {
      return;
    }
    try
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext()) {
        ((e)localIterator.next()).a(true);
      }
      label59:
      a.b(localThrowable, E.class);
    }
    finally
    {
      break label59;
      try
      {
        f.set(false);
        return;
      }
      finally
      {
        break label68;
      }
      f.set(false);
    }
    label68:
  }
  
  public static final Intent z(Context paramContext, Intent paramIntent, e parame)
  {
    if (a.d(E.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      if (paramIntent == null) {
        return null;
      }
      parame = paramContext.getPackageManager().resolveActivity(paramIntent, 0);
      if (parame == null) {
        return null;
      }
      k localk = k.a;
      parame = activityInfo.packageName;
      Intrinsics.checkNotNullExpressionValue(parame, "resolveInfo.activityInfo.packageName");
      boolean bool = k.a(paramContext, parame);
      if (!bool) {
        paramIntent = null;
      }
      return paramIntent;
    }
    finally
    {
      a.b(paramContext, E.class);
    }
    return null;
  }
  
  public final Map d()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = new O1/E$d;
      ((d)localObject).<init>();
      localArrayList.add(localObject);
      localObject = c;
      localHashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.FEED_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", localObject);
      localHashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", localArrayList);
      localHashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", localArrayList);
      localHashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", d);
      localHashMap.put("com.facebook.platform.action.request.SHARE_STORY", localObject);
      return localHashMap;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public final List e()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      Object localObject = new O1/E$a;
      ((a)localObject).<init>();
      localObject = m.d(new e[] { localObject });
      ((ArrayList)localObject).addAll((Collection)f());
      return (List)localObject;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public final List f()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      c localc = new O1/E$c;
      localc.<init>();
      Object localObject = new O1/E$g;
      ((g)localObject).<init>();
      localObject = m.d(new e[] { localc, localObject });
      return (List)localObject;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public final Uri g(e parame)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("content://");
      localStringBuilder.append(parame.d());
      localStringBuilder.append(".provider.PlatformProvider/versions");
      parame = Uri.parse(localStringBuilder.toString());
      Intrinsics.checkNotNullExpressionValue(parame, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
      return parame;
    }
    finally
    {
      a.b(parame, this);
    }
    return null;
  }
  
  public final Intent k(e parame, String paramString1, Collection paramCollection, String paramString2, boolean paramBoolean1, e parame1, String paramString3, String paramString4, boolean paramBoolean2, String paramString5, boolean paramBoolean3, Y1.B paramB, boolean paramBoolean4, boolean paramBoolean5, String paramString6, String paramString7, String paramString8)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      paramString7 = parame.c();
      if (paramString7 == null) {
        return null;
      }
      paramString8 = new android/content/Intent;
      paramString8.<init>();
      paramString1 = paramString8.setClassName(parame.d(), paramString7).putExtra("client_id", paramString1);
      Intrinsics.checkNotNullExpressionValue(paramString1, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
      paramString1.putExtra("facebook_sdk_version", x1.B.B());
      if (!P.d0(paramCollection)) {
        paramString1.putExtra("scope", TextUtils.join(",", (Iterable)paramCollection));
      }
    }
    finally
    {
      break label268;
    }
    if (!P.c0(paramString2)) {
      paramString1.putExtra("e2e", paramString2);
    }
    paramString1.putExtra("state", paramString3);
    paramString1.putExtra("response_type", parame.e());
    paramString1.putExtra("nonce", paramString6);
    paramString1.putExtra("return_scopes", "true");
    if (paramBoolean1) {
      paramString1.putExtra("default_audience", parame1.e());
    }
    paramString1.putExtra("legacy_override", x1.B.w());
    paramString1.putExtra("auth_type", paramString4);
    if (paramBoolean2) {
      paramString1.putExtra("fail_on_logged_out", true);
    }
    paramString1.putExtra("messenger_page_id", paramString5);
    paramString1.putExtra("reset_messenger_state", paramBoolean3);
    if (paramBoolean4) {
      paramString1.putExtra("fx_app", paramB.toString());
    }
    if (paramBoolean5) {
      paramString1.putExtra("skip_dedupe", true);
    }
    return paramString1;
    label268:
    a.b(parame, this);
    return null;
  }
  
  /* Error */
  public final TreeSet o(e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 108	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 169	java/util/TreeSet
    //   12: astore_2
    //   13: aload_2
    //   14: invokespecial 572	java/util/TreeSet:<init>	()V
    //   17: invokestatic 575	x1/B:l	()Landroid/content/Context;
    //   20: invokevirtual 579	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   23: astore_3
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual 581	O1/E:g	(LO1/E$e;)Landroid/net/Uri;
    //   29: astore 4
    //   31: invokestatic 575	x1/B:l	()Landroid/content/Context;
    //   34: invokevirtual 122	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 268	O1/E$e:d	()Ljava/lang/String;
    //   43: ldc_w 583
    //   46: invokestatic 586	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   49: astore_1
    //   50: aload 5
    //   52: aload_1
    //   53: iconst_0
    //   54: invokevirtual 590	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   57: astore_1
    //   58: goto +24 -> 82
    //   61: astore 4
    //   63: aconst_null
    //   64: astore_1
    //   65: goto +152 -> 217
    //   68: astore_1
    //   69: getstatic 48	O1/E:b	Ljava/lang/String;
    //   72: ldc_w 592
    //   75: aload_1
    //   76: invokestatic 597	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   79: pop
    //   80: aconst_null
    //   81: astore_1
    //   82: aload_1
    //   83: ifnull +110 -> 193
    //   86: aload_3
    //   87: aload 4
    //   89: iconst_1
    //   90: anewarray 599	java/lang/String
    //   93: dup
    //   94: iconst_0
    //   95: ldc_w 601
    //   98: aastore
    //   99: aconst_null
    //   100: aconst_null
    //   101: aconst_null
    //   102: invokevirtual 607	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   105: astore_1
    //   106: goto +37 -> 143
    //   109: astore_1
    //   110: getstatic 48	O1/E:b	Ljava/lang/String;
    //   113: astore_1
    //   114: aload_1
    //   115: ldc_w 592
    //   118: invokestatic 610	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   121: pop
    //   122: aconst_null
    //   123: astore_1
    //   124: goto +19 -> 143
    //   127: astore_1
    //   128: getstatic 48	O1/E:b	Ljava/lang/String;
    //   131: astore_1
    //   132: goto -18 -> 114
    //   135: astore_1
    //   136: getstatic 48	O1/E:b	Ljava/lang/String;
    //   139: astore_1
    //   140: goto -26 -> 114
    //   143: aload_1
    //   144: astore 4
    //   146: aload_1
    //   147: ifnull +49 -> 196
    //   150: aload_1
    //   151: astore 4
    //   153: aload_1
    //   154: invokeinterface 615 1 0
    //   159: ifeq +37 -> 196
    //   162: aload_2
    //   163: aload_1
    //   164: aload_1
    //   165: ldc_w 601
    //   168: invokeinterface 619 2 0
    //   173: invokeinterface 622 2 0
    //   178: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   181: invokevirtual 623	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   184: pop
    //   185: goto -35 -> 150
    //   188: astore 4
    //   190: goto +27 -> 217
    //   193: aconst_null
    //   194: astore 4
    //   196: aload 4
    //   198: ifnonnull +6 -> 204
    //   201: goto +10 -> 211
    //   204: aload 4
    //   206: invokeinterface 626 1 0
    //   211: aload_2
    //   212: areturn
    //   213: astore_1
    //   214: goto +19 -> 233
    //   217: aload_1
    //   218: ifnonnull +6 -> 224
    //   221: goto +9 -> 230
    //   224: aload_1
    //   225: invokeinterface 626 1 0
    //   230: aload 4
    //   232: athrow
    //   233: aload_1
    //   234: aload_0
    //   235: invokestatic 155	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   238: aconst_null
    //   239: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	E
    //   0	240	1	parame	e
    //   12	200	2	localTreeSet	TreeSet
    //   23	64	3	localContentResolver	android.content.ContentResolver
    //   29	1	4	localUri1	Uri
    //   61	27	4	localUri2	Uri
    //   144	8	4	locale	e
    //   188	1	4	localObject1	Object
    //   194	37	4	localObject2	Object
    //   37	14	5	localPackageManager	PackageManager
    // Exception table:
    //   from	to	target	type
    //   31	50	61	finally
    //   50	58	61	finally
    //   69	80	61	finally
    //   86	106	61	finally
    //   110	114	61	finally
    //   114	122	61	finally
    //   128	132	61	finally
    //   136	140	61	finally
    //   50	58	68	java/lang/RuntimeException
    //   86	106	109	java/lang/IllegalArgumentException
    //   86	106	127	java/lang/SecurityException
    //   86	106	135	java/lang/NullPointerException
    //   153	185	188	finally
    //   9	31	213	finally
    //   204	211	213	finally
    //   224	230	213	finally
    //   230	233	213	finally
  }
  
  public final f r(List paramList, int[] paramArrayOfInt)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      x();
      if (paramList == null) {
        return f.c.b();
      }
    }
    finally
    {
      break label91;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        e locale = (e)paramList.next();
        int i = h(locale.b(), t(), paramArrayOfInt);
        if (i != -1) {
          return f.c.a(locale, i);
        }
      }
      paramList = f.c.b();
      return paramList;
      label91:
      a.b(paramList, this);
    }
    return null;
  }
  
  public static final class a
    extends E.e
  {
    public String d()
    {
      return "com.facebook.arstudio.player";
    }
    
    public Void g()
    {
      return null;
    }
  }
  
  public static final class b
    extends E.e
  {
    public String c()
    {
      return "com.instagram.platform.AppAuthorizeActivity";
    }
    
    public String d()
    {
      return "com.instagram.android";
    }
    
    public String e()
    {
      return "token,signed_request,graph_domain,granted_scopes";
    }
  }
  
  public static final class c
    extends E.e
  {
    public String c()
    {
      return "com.facebook.katana.ProxyAuth";
    }
    
    public String d()
    {
      return "com.facebook.katana";
    }
    
    public void f()
    {
      if (g()) {
        Log.w(E.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
      }
    }
    
    public final boolean g()
    {
      boolean bool;
      if (lgetApplicationInfotargetSdkVersion >= 30) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class d
    extends E.e
  {
    public String d()
    {
      return "com.facebook.orca";
    }
    
    public Void g()
    {
      return null;
    }
  }
  
  public static abstract class e
  {
    public TreeSet a;
    
    public final void a(boolean paramBoolean)
    {
      if (!paramBoolean) {
        try
        {
          Object localObject1 = a;
          if (localObject1 != null)
          {
            if (localObject1 == null) {
              localObject1 = null;
            } else {
              localObject1 = Boolean.valueOf(((TreeSet)localObject1).isEmpty());
            }
            if (Intrinsics.a(localObject1, Boolean.FALSE)) {
              break label60;
            }
          }
        }
        finally
        {
          break label85;
        }
      }
      a = E.b(E.a, this);
      label60:
      TreeSet localTreeSet = a;
      if ((localTreeSet == null) || (localTreeSet.isEmpty())) {
        f();
      }
      return;
      label85:
      throw localTreeSet;
    }
    
    public final TreeSet b()
    {
      Object localObject = a;
      if (localObject != null)
      {
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = Boolean.valueOf(((TreeSet)localObject).isEmpty());
        }
        if (Intrinsics.a(localObject, Boolean.FALSE)) {}
      }
      else
      {
        a(false);
      }
      return a;
    }
    
    public abstract String c();
    
    public abstract String d();
    
    public String e()
    {
      return "id_token,token,signed_request,graph_domain";
    }
    
    public void f() {}
  }
  
  public static final class f
  {
    public static final a c = new a(null);
    public E.e a;
    public int b;
    
    public final int c()
    {
      return b;
    }
    
    public static final class a
    {
      public final E.f a(E.e parame, int paramInt)
      {
        E.f localf = new E.f(null);
        E.f.a(localf, parame);
        E.f.b(localf, paramInt);
        return localf;
      }
      
      public final E.f b()
      {
        E.f localf = new E.f(null);
        E.f.b(localf, -1);
        return localf;
      }
    }
  }
  
  public static final class g
    extends E.e
  {
    public String c()
    {
      return "com.facebook.katana.ProxyAuth";
    }
    
    public String d()
    {
      return "com.facebook.wakizashi";
    }
  }
}

/* Location:
 * Qualified Name:     O1.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */