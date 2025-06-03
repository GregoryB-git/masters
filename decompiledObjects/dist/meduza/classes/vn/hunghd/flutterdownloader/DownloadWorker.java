package vn.hunghd.flutterdownloader;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore.Downloads;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d.a;
import androidx.work.d.a.a;
import androidx.work.d.a.c;
import d5.n;
import g;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import lc.k;
import org.json.JSONException;
import org.json.JSONObject;
import sb.j;
import sb.m;
import u.q;
import u.u;
import u.u.b;
import x0.q0;

public final class DownloadWorker
  extends Worker
  implements MethodChannel.MethodCallHandler
{
  public static final AtomicBoolean H = new AtomicBoolean(false);
  public static final ArrayDeque<List<Object>> I = new ArrayDeque();
  public static FlutterEngine J;
  public static final ad.c K = new ad.c();
  public String A;
  public String B;
  public String C;
  public String D;
  public long E;
  public int F;
  public boolean G;
  public final Pattern f = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");
  public final Pattern o = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");
  public final Pattern p = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");
  public MethodChannel q;
  public n r;
  public boolean s;
  public boolean t;
  public boolean u;
  public boolean v;
  public int w;
  public int x;
  public String y;
  public String z;
  
  static
  {
    new a();
  }
  
  public DownloadWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    new Handler(paramContext.getMainLooper()).post(new io.flutter.plugins.firebase.messaging.f(2, this, paramContext));
  }
  
  public static String q(String paramString)
  {
    if (paramString != null)
    {
      Object localObject1 = new String[1];
      localObject1[0] = ";";
      Object localObject2 = localObject1[0];
      int i;
      if (((String)localObject2).length() == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        paramString = k.y0(0, paramString, (String)localObject2, false);
      }
      else
      {
        k.x0(0);
        localObject2 = new kc.h(new lc.b(paramString, 0, 0, new lc.i(j.j((Object[])localObject1), false)));
        localObject1 = new ArrayList(m.j((Iterable)localObject2));
        Iterator localIterator = ((kc.h)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (ic.f)localIterator.next();
          ec.i.e(localObject2, "range");
          ((ArrayList)localObject1).add(paramString.subSequence(Integer.valueOf(a).intValue(), Integer.valueOf(b).intValue() + 1).toString());
        }
        paramString = (String)localObject1;
      }
      paramString = (String[])paramString.toArray(new String[0]);
      if (paramString != null)
      {
        paramString = paramString[0];
        if (paramString != null)
        {
          int j = paramString.length() - 1;
          i = 0;
          int k = i;
          while (i <= j)
          {
            int m;
            if (k == 0) {
              m = i;
            } else {
              m = j;
            }
            if (ec.i.f(paramString.charAt(m), 32) <= 0) {
              m = 1;
            } else {
              m = 0;
            }
            if (k == 0)
            {
              if (m == 0) {
                k = 1;
              } else {
                i++;
              }
            }
            else
            {
              if (m == 0) {
                break;
              }
              j--;
            }
          }
          return paramString.subSequence(i, j + 1).toString();
        }
      }
    }
    paramString = null;
    return paramString;
  }
  
  public static boolean u(String paramString)
  {
    Object localObject = Environment.getExternalStorageDirectory();
    ec.i.d(localObject, "getExternalStorageDirectory(...)");
    if (paramString != null)
    {
      localObject = ((File)localObject).getPath();
      ec.i.d(localObject, "getPath(...)");
      if (lc.h.n0(paramString, (String)localObject)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public static boolean v(String paramString)
  {
    paramString = q(paramString);
    boolean bool;
    if ((paramString != null) && ((lc.h.n0(paramString, "image/")) || (lc.h.n0(paramString, "video")))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static URLConnection x(URL paramURL, Proxy paramProxy)
  {
    if (paramProxy != null) {
      paramURL = paramURL.openConnection(paramProxy);
    } else {
      paramURL = paramURL.openConnection();
    }
    ec.i.d(paramURL, "openConnection(...)");
    return paramURL;
  }
  
  public final void A(Context paramContext, String paramString, ad.a parama, int paramInt, PendingIntent paramPendingIntent, boolean paramBoolean)
  {
    Object localObject1 = new ArrayList();
    ((ArrayList)localObject1).add(Long.valueOf(b.b.c("callback_handle")));
    ??? = b.a.toString();
    ec.i.d(???, "toString(...)");
    ((ArrayList)localObject1).add(???);
    ((ArrayList)localObject1).add(Integer.valueOf(parama.ordinal()));
    ((ArrayList)localObject1).add(Integer.valueOf(paramInt));
    synchronized (H)
    {
      if (!((AtomicBoolean)???).get())
      {
        I.add(localObject1);
      }
      else
      {
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(a.getMainLooper());
        q0 localq0 = new x0/q0;
        localq0.<init>(22, this, localObject1);
        localHandler.post(localq0);
      }
      if (s)
      {
        localObject1 = new q(paramContext, "FLUTTER_DOWNLOADER_NOTIFICATION");
        e = q.b(paramString);
        g = paramPendingIntent;
        ((q)localObject1).d(8, true);
        ((q)localObject1).d(16, true);
        j = -1;
        int i = parama.ordinal();
        if (i != 2)
        {
          if (i == 3) {
            break label366;
          }
          if (i != 4)
          {
            if (i != 5)
            {
              if (i == 6)
              {
                paramPendingIntent = C;
                break label372;
              }
            }
            else
            {
              paramPendingIntent = A;
              break label372;
            }
          }
          else
          {
            paramPendingIntent = B;
            break label372;
          }
        }
        else
        {
          if (paramInt > 0) {
            break label316;
          }
          ((q)localObject1).c(y);
        }
        ((q)localObject1).f(0, 0);
        ((q)localObject1).d(2, false);
        i = t();
        label316:
        if (paramInt < 100)
        {
          ((q)localObject1).c(z);
          ((q)localObject1).f(100, paramInt);
          ((q)localObject1).d(2, true);
          i = 17301633;
          B.icon = i;
        }
        else
        {
          label366:
          paramPendingIntent = D;
          label372:
          ((q)localObject1).c(paramPendingIntent);
          ((q)localObject1).f(0, 0);
          ((q)localObject1).d(2, false);
          B.icon = 17301634;
        }
        if (System.currentTimeMillis() - E < 1000L) {
          if (paramBoolean)
          {
            w("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
            try
            {
              Thread.sleep(1000L);
            }
            catch (InterruptedException paramPendingIntent)
            {
              paramPendingIntent.printStackTrace();
            }
          }
          else
          {
            w("Update too frequently!!!!, this should be dropped");
            return;
          }
        }
        paramPendingIntent = f.l("Update notification: {notificationId: ");
        paramPendingIntent.append(x);
        paramPendingIntent.append(", title: ");
        paramPendingIntent.append(paramString);
        paramPendingIntent.append(", status: ");
        paramPendingIntent.append(parama);
        paramPendingIntent.append(", progress: ");
        paramPendingIntent.append(paramInt);
        paramPendingIntent.append('}');
        w(paramPendingIntent.toString());
        new u(paramContext).b(x, ((q)localObject1).a());
        E = System.currentTimeMillis();
      }
      return;
    }
  }
  
  public final void g()
  {
    Context localContext = a;
    ec.i.d(localContext, "getApplicationContext(...)");
    Object localObject1 = c.a;
    r = new n(c.a.a(localContext));
    Object localObject2 = b.b.d("url");
    Object localObject3 = b.b.d("file_name");
    n localn = r;
    if (localn != null)
    {
      localObject1 = b.a.toString();
      ec.i.d(localObject1, "toString(...)");
      localObject1 = localn.e((String)localObject1);
    }
    else
    {
      localObject1 = null;
    }
    if ((localObject1 != null) && (c == ad.a.a))
    {
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = localObject2;
      }
      localObject3 = ad.a.e;
      A(localContext, (String)localObject1, (ad.a)localObject3, -1, null, true);
      localObject2 = r;
      if (localObject2 != null)
      {
        localObject1 = b.a.toString();
        ec.i.d(localObject1, "toString(...)");
        ((n)localObject2).g((String)localObject1, (ad.a)localObject3, w);
      }
    }
  }
  
  public final d.a j()
  {
    Object localObject1 = c.a;
    r = new n(c.a.a(a));
    localObject1 = b.b.d("url");
    if (localObject1 != null)
    {
      Object localObject2 = b.b.d("file_name");
      String str1 = b.b.d("saved_file");
      if (str1 != null)
      {
        String str2 = b.b.d("headers");
        if (str2 != null)
        {
          boolean bool = b.b.b("is_resume");
          Object localObject3 = b.b.a.get("timeout");
          int i;
          if ((localObject3 instanceof Integer)) {
            i = ((Integer)localObject3).intValue();
          } else {
            i = 15000;
          }
          u = b.b.b("debug");
          localObject3 = b.b;
          int j = 10;
          localObject3 = a.get("step");
          if ((localObject3 instanceof Integer)) {
            j = ((Integer)localObject3).intValue();
          }
          F = j;
          v = b.b.b("ignoreSsl");
          localObject3 = a.getResources();
          y = ((Resources)localObject3).getString(2131886212);
          z = ((Resources)localObject3).getString(2131886210);
          A = ((Resources)localObject3).getString(2131886205);
          B = ((Resources)localObject3).getString(2131886209);
          C = ((Resources)localObject3).getString(2131886211);
          D = ((Resources)localObject3).getString(2131886208);
          Object localObject4 = r;
          if (localObject4 != null)
          {
            localObject3 = b.a.toString();
            ec.i.d(localObject3, "toString(...)");
            localObject3 = ((n)localObject4).e((String)localObject3);
          }
          else
          {
            localObject3 = null;
          }
          Object localObject5 = new StringBuilder();
          ((StringBuilder)localObject5).append("DownloadWorker{url=");
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append(",filename=");
          ((StringBuilder)localObject5).append((String)localObject2);
          ((StringBuilder)localObject5).append(",savedDir=");
          ((StringBuilder)localObject5).append(str1);
          ((StringBuilder)localObject5).append(",header=");
          ((StringBuilder)localObject5).append(str2);
          ((StringBuilder)localObject5).append(",isResume=");
          ((StringBuilder)localObject5).append(bool);
          ((StringBuilder)localObject5).append(",status=");
          Object localObject6;
          if (localObject3 != null)
          {
            localObject6 = c;
            localObject4 = localObject6;
            if (localObject6 != null) {}
          }
          else
          {
            localObject4 = "GONE";
          }
          ((StringBuilder)localObject5).append(localObject4);
          w(((StringBuilder)localObject5).toString());
          if ((localObject3 != null) && (c != ad.a.e))
          {
            s = b.b.b("show_notification");
            t = b.b.b("open_file_from_notification");
            G = b.b.b("save_in_public_storage");
            x = a;
            localObject4 = a;
            ec.i.d(localObject4, "getApplicationContext(...)");
            if (s)
            {
              j = Build.VERSION.SDK_INT;
              if (j >= 26)
              {
                localObject6 = a.getResources();
                localObject5 = ((Resources)localObject6).getString(2131886207);
                ec.i.d(localObject5, "getString(...)");
                localObject6 = ((Resources)localObject6).getString(2131886206);
                ec.i.d(localObject6, "getString(...)");
                localObject5 = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", (CharSequence)localObject5, 2);
                ((NotificationChannel)localObject5).setDescription((String)localObject6);
                ((NotificationChannel)localObject5).setSound(null, null);
                localObject4 = new u((Context)localObject4);
                if (j >= 26) {
                  u.b.a(b, (NotificationChannel)localObject5);
                }
              }
            }
            localObject6 = a;
            ec.i.d(localObject6, "getApplicationContext(...)");
            if (localObject2 == null) {
              localObject4 = localObject1;
            } else {
              localObject4 = localObject2;
            }
            localObject5 = ad.a.b;
            A((Context)localObject6, (String)localObject4, (ad.a)localObject5, d, null, false);
            localObject4 = r;
            if (localObject4 != null)
            {
              localObject6 = b.a.toString();
              ec.i.d(localObject6, "toString(...)");
              ((n)localObject4).g((String)localObject6, (ad.a)localObject5, d);
            }
            if (new File(g.f(f.l(str1), File.separator, (String)localObject2)).exists())
            {
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append("exists file for ");
              ((StringBuilder)localObject3).append((String)localObject2);
              ((StringBuilder)localObject3).append("automatic resuming...");
              w(((StringBuilder)localObject3).toString());
              bool = true;
            }
            try
            {
              localObject3 = a;
              ec.i.d(localObject3, "getApplicationContext(...)");
              o((Context)localObject3, (String)localObject1, str1, (String)localObject2, str2, bool, i);
              l();
              r = null;
              localObject3 = new androidx/work/d$a$c;
              ((d.a.c)localObject3).<init>();
              localObject1 = localObject3;
            }
            catch (Exception localException)
            {
              localObject4 = a;
              ec.i.d(localObject4, "getApplicationContext(...)");
              if (localObject2 != null) {
                localObject1 = localObject2;
              }
              localObject2 = ad.a.d;
              A((Context)localObject4, (String)localObject1, (ad.a)localObject2, -1, null, true);
              localObject4 = r;
              if (localObject4 != null)
              {
                localObject1 = b.a.toString();
                ec.i.d(localObject1, "toString(...)");
                ((n)localObject4).g((String)localObject1, (ad.a)localObject2, w);
              }
              localException.printStackTrace();
              r = null;
              localObject1 = new d.a.a();
            }
            return (d.a)localObject1;
          }
          return new d.a.c();
        }
        throw new IllegalArgumentException("Argument 'headers' should not be null");
      }
      throw new IllegalArgumentException("Argument 'saved_file' should not be null");
    }
    throw new IllegalArgumentException("Argument 'url' should not be null");
  }
  
  public final void k(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString3 != null) && (paramString2 != null) && (paramString1 != null))
    {
      ContentValues localContentValues;
      if (lc.h.n0(paramString3, "image/"))
      {
        localContentValues = new ContentValues();
        localContentValues.put("title", paramString1);
        localContentValues.put("_display_name", paramString1);
        localContentValues.put("description", "");
        localContentValues.put("mime_type", paramString3);
        localContentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
        localContentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        localContentValues.put("_data", paramString2);
        paramString1 = new StringBuilder();
        paramString1.append("insert ");
        paramString1.append(localContentValues);
        paramString1.append(" to MediaStore");
        w(paramString1.toString());
        paramString3 = a.getContentResolver();
        paramString1 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        paramString2 = localContentValues;
      }
      else
      {
        if (!lc.h.n0(paramString3, "video")) {
          return;
        }
        localContentValues = new ContentValues();
        localContentValues.put("title", paramString1);
        localContentValues.put("_display_name", paramString1);
        localContentValues.put("description", "");
        localContentValues.put("mime_type", paramString3);
        localContentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
        localContentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        localContentValues.put("_data", paramString2);
        paramString1 = new StringBuilder();
        paramString1.append("insert ");
        paramString1.append(localContentValues);
        paramString1.append(" to MediaStore");
        w(paramString1.toString());
        paramString3 = a.getContentResolver();
        paramString1 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        paramString2 = localContentValues;
      }
      paramString3.insert(paramString1, paramString2);
    }
  }
  
  public final void l()
  {
    Object localObject1 = r;
    ec.i.b(localObject1);
    Object localObject2 = b.a.toString();
    ec.i.d(localObject2, "toString(...)");
    ad.b localb = ((n)localObject1).e((String)localObject2);
    if ((localb != null) && (c != ad.a.c) && (!j))
    {
      localObject2 = f;
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = e;
        localObject1 = ((String)localObject1).substring(k.u0((String)localObject1, "/", 6) + 1, e.length());
        ec.i.d(localObject1, "substring(...)");
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(g);
      localObject1 = new File(g.f((StringBuilder)localObject2, File.separator, (String)localObject1));
      if (((File)localObject1).exists()) {
        ((File)localObject1).delete();
      }
    }
  }
  
  public final File m(String paramString1, String paramString2)
  {
    paramString1 = new File(paramString2, paramString1);
    try
    {
      if (paramString1.createNewFile()) {
        return paramString1;
      }
      if (u) {
        Log.e("DownloadWorker", "It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
      }
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
      if (u) {
        Log.e("DownloadWorker", "Create a file using java.io API failed ");
      }
    }
    return null;
  }
  
  public final Uri n(String paramString1, String paramString2)
  {
    Uri localUri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
    ec.i.d(localUri, "EXTERNAL_CONTENT_URI");
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("_display_name", paramString1);
    localContentValues.put("mime_type", paramString2);
    localContentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
    paramString1 = a.getContentResolver();
    try
    {
      paramString1 = paramString1.insert(localUri, localContentValues);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
      if (u) {
        Log.e("DownloadWorker", "Create a file using MediaStore API failed.");
      }
    }
    return null;
  }
  
  /* Error */
  public final void o(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: aload 4
    //   2: astore 8
    //   4: new 509	java/util/HashMap
    //   7: dup
    //   8: invokespecial 752	java/util/HashMap:<init>	()V
    //   11: astore 9
    //   13: aload_0
    //   14: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   17: astore 10
    //   19: aload 10
    //   21: ifnull +32 -> 53
    //   24: aload_0
    //   25: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   28: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload 4
    //   35: ldc_w 307
    //   38: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   41: aload 10
    //   43: aload 4
    //   45: invokevirtual 473	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   48: astore 4
    //   50: goto +6 -> 56
    //   53: aconst_null
    //   54: astore 4
    //   56: aload 4
    //   58: ifnull +12 -> 70
    //   61: aload_0
    //   62: aload 4
    //   64: invokevirtual 757	ad/b:a	()I
    //   67: putfield 488	vn/hunghd/flutterdownloader/DownloadWorker:w	I
    //   70: aload_0
    //   71: invokevirtual 760	androidx/work/d:e	()Landroidx/work/c;
    //   74: ldc_w 762
    //   77: invokevirtual 468	androidx/work/c:d	(Ljava/lang/String;)Ljava/lang/String;
    //   80: astore 10
    //   82: aload 10
    //   84: ifnull +20 -> 104
    //   87: aload 10
    //   89: invokevirtual 126	java/lang/String:length	()I
    //   92: ifne +6 -> 98
    //   95: goto +9 -> 104
    //   98: iconst_0
    //   99: istore 11
    //   101: goto +6 -> 107
    //   104: iconst_1
    //   105: istore 11
    //   107: iload 11
    //   109: ifne +57 -> 166
    //   112: new 263	java/net/URL
    //   115: astore 4
    //   117: aload 4
    //   119: aload 10
    //   121: invokespecial 763	java/net/URL:<init>	(Ljava/lang/String;)V
    //   124: new 765	java/net/Proxy
    //   127: astore 12
    //   129: getstatic 771	java/net/Proxy$Type:HTTP	Ljava/net/Proxy$Type;
    //   132: astore 10
    //   134: new 773	java/net/InetSocketAddress
    //   137: astore 13
    //   139: aload 13
    //   141: aload 4
    //   143: invokevirtual 776	java/net/URL:getHost	()Ljava/lang/String;
    //   146: aload 4
    //   148: invokevirtual 779	java/net/URL:getPort	()I
    //   151: invokespecial 782	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   154: aload 12
    //   156: aload 10
    //   158: aload 13
    //   160: invokespecial 785	java/net/Proxy:<init>	(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
    //   163: goto +6 -> 169
    //   166: aconst_null
    //   167: astore 12
    //   169: lconst_0
    //   170: lstore 14
    //   172: aload_2
    //   173: astore 16
    //   175: aconst_null
    //   176: astore 4
    //   178: aload 9
    //   180: aload 16
    //   182: invokevirtual 788	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   185: ifne +21 -> 206
    //   188: aload 9
    //   190: aload 16
    //   192: iconst_1
    //   193: invokestatic 194	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   196: invokevirtual 791	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: iconst_1
    //   201: istore 11
    //   203: goto +29 -> 232
    //   206: aload 9
    //   208: aload 16
    //   210: invokevirtual 512	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   213: astore 10
    //   215: aload 10
    //   217: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   220: aload 10
    //   222: checkcast 793	java/lang/Number
    //   225: invokevirtual 794	java/lang/Number:intValue	()I
    //   228: iconst_1
    //   229: iadd
    //   230: istore 11
    //   232: iload 11
    //   234: iconst_3
    //   235: if_icmpgt +2654 -> 2889
    //   238: new 263	java/net/URL
    //   241: astore 10
    //   243: aload 10
    //   245: aload 16
    //   247: invokespecial 763	java/net/URL:<init>	(Ljava/lang/String;)V
    //   250: aload_0
    //   251: getfield 524	vn/hunghd/flutterdownloader/DownloadWorker:v	Z
    //   254: istore 17
    //   256: iload 17
    //   258: ifeq +101 -> 359
    //   261: invokestatic 796	vn/hunghd/flutterdownloader/DownloadWorker$a:a	()V
    //   264: aload 10
    //   266: invokevirtual 799	java/net/URL:getProtocol	()Ljava/lang/String;
    //   269: astore 13
    //   271: aload 13
    //   273: ldc_w 801
    //   276: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   279: getstatic 807	java/util/Locale:US	Ljava/util/Locale;
    //   282: astore 18
    //   284: aload 18
    //   286: ldc_w 808
    //   289: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   292: aload 13
    //   294: aload 18
    //   296: invokevirtual 812	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   299: astore 13
    //   301: aload 13
    //   303: ldc_w 814
    //   306: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   309: aload 13
    //   311: ldc_w 816
    //   314: invokestatic 819	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   317: ifeq +30 -> 347
    //   320: aload 10
    //   322: aload 12
    //   324: invokestatic 821	vn/hunghd/flutterdownloader/DownloadWorker:x	(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   327: checkcast 823	javax/net/ssl/HttpsURLConnection
    //   330: astore 10
    //   332: aload 10
    //   334: getstatic 65	vn/hunghd/flutterdownloader/DownloadWorker:K	Lad/c;
    //   337: invokevirtual 827	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   340: aload 10
    //   342: astore 4
    //   344: goto +101 -> 445
    //   347: aload 10
    //   349: aload 12
    //   351: invokestatic 821	vn/hunghd/flutterdownloader/DownloadWorker:x	(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   354: astore 10
    //   356: goto +78 -> 434
    //   359: aload 10
    //   361: invokevirtual 799	java/net/URL:getProtocol	()Ljava/lang/String;
    //   364: astore 18
    //   366: aload 18
    //   368: ldc_w 801
    //   371: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   374: getstatic 807	java/util/Locale:US	Ljava/util/Locale;
    //   377: astore 13
    //   379: aload 13
    //   381: ldc_w 808
    //   384: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   387: aload 18
    //   389: aload 13
    //   391: invokevirtual 812	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   394: astore 13
    //   396: aload 13
    //   398: ldc_w 814
    //   401: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   404: aload 13
    //   406: ldc_w 816
    //   409: invokestatic 819	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   412: ifeq -65 -> 347
    //   415: aload 10
    //   417: aload 12
    //   419: invokestatic 821	vn/hunghd/flutterdownloader/DownloadWorker:x	(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   422: checkcast 823	javax/net/ssl/HttpsURLConnection
    //   425: astore 10
    //   427: aload 10
    //   429: astore 4
    //   431: goto +14 -> 445
    //   434: aload 10
    //   436: checkcast 829	java/net/HttpURLConnection
    //   439: astore 10
    //   441: aload 10
    //   443: astore 4
    //   445: aload 4
    //   447: astore 10
    //   449: new 415	java/lang/StringBuilder
    //   452: astore 13
    //   454: aload 13
    //   456: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   459: aload 13
    //   461: ldc_w 831
    //   464: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: pop
    //   468: aload 13
    //   470: aload 16
    //   472: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   475: pop
    //   476: aload_0
    //   477: aload 13
    //   479: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   482: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   485: aload 10
    //   487: iload 7
    //   489: invokevirtual 836	java/net/URLConnection:setConnectTimeout	(I)V
    //   492: aload 10
    //   494: iload 7
    //   496: invokevirtual 839	java/net/URLConnection:setReadTimeout	(I)V
    //   499: aload 10
    //   501: iconst_0
    //   502: invokevirtual 842	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   505: aload 10
    //   507: ldc_w 844
    //   510: ldc_w 846
    //   513: invokevirtual 849	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   516: aload_0
    //   517: aload 10
    //   519: aload 5
    //   521: invokevirtual 852	vn/hunghd/flutterdownloader/DownloadWorker:y	(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    //   524: iload 6
    //   526: ifeq +36 -> 562
    //   529: aload 8
    //   531: astore 13
    //   533: aload_0
    //   534: aload 10
    //   536: aload 8
    //   538: aload_3
    //   539: invokevirtual 855	vn/hunghd/flutterdownloader/DownloadWorker:z	(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J
    //   542: lstore 14
    //   544: goto +18 -> 562
    //   547: astore_1
    //   548: aload 10
    //   550: astore_2
    //   551: goto +2323 -> 2874
    //   554: astore_3
    //   555: aload 13
    //   557: astore 8
    //   559: goto +586 -> 1145
    //   562: aload 10
    //   564: invokevirtual 858	java/net/HttpURLConnection:getResponseCode	()I
    //   567: istore 11
    //   569: iload 11
    //   571: sipush 307
    //   574: if_icmpeq +2151 -> 2725
    //   577: iload 11
    //   579: sipush 308
    //   582: if_icmpeq +2143 -> 2725
    //   585: iload 11
    //   587: tableswitch	default:+25->612, 301:+2138->2725, 302:+2138->2725, 303:+2138->2725
    //   612: aload 8
    //   614: astore 12
    //   616: aload 10
    //   618: invokevirtual 861	java/net/URLConnection:connect	()V
    //   621: ldc_w 863
    //   624: astore 19
    //   626: iload 11
    //   628: sipush 200
    //   631: if_icmpeq +22 -> 653
    //   634: iload 6
    //   636: ifeq +14 -> 650
    //   639: iload 11
    //   641: sipush 206
    //   644: if_icmpne +6 -> 650
    //   647: goto +6 -> 653
    //   650: goto +1818 -> 2468
    //   653: aload 8
    //   655: astore 12
    //   657: aload_0
    //   658: invokevirtual 865	androidx/work/d:f	()Z
    //   661: ifne -11 -> 650
    //   664: aload 8
    //   666: astore 12
    //   668: aload 10
    //   670: invokevirtual 868	java/net/URLConnection:getContentType	()Ljava/lang/String;
    //   673: astore 20
    //   675: aload 8
    //   677: astore 12
    //   679: getstatic 574	android/os/Build$VERSION:SDK_INT	I
    //   682: istore 7
    //   684: iload 7
    //   686: bipush 24
    //   688: if_icmplt +17 -> 705
    //   691: aload 8
    //   693: astore 13
    //   695: aload 10
    //   697: invokestatic 873	a0/d:c	(Ljava/net/HttpURLConnection;)J
    //   700: lstore 21
    //   702: goto +15 -> 717
    //   705: aload 8
    //   707: astore 12
    //   709: aload 10
    //   711: invokevirtual 876	java/net/URLConnection:getContentLength	()I
    //   714: i2l
    //   715: lstore 21
    //   717: aload 8
    //   719: astore 12
    //   721: new 415	java/lang/StringBuilder
    //   724: astore 5
    //   726: aload 8
    //   728: astore 12
    //   730: aload 5
    //   732: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   735: aload 8
    //   737: astore 12
    //   739: aload 5
    //   741: ldc_w 878
    //   744: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: aload 8
    //   750: astore 12
    //   752: aload 5
    //   754: aload 20
    //   756: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload 8
    //   762: astore 12
    //   764: aload_0
    //   765: aload 5
    //   767: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   770: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   773: aload 8
    //   775: astore 12
    //   777: new 415	java/lang/StringBuilder
    //   780: astore 5
    //   782: aload 8
    //   784: astore 12
    //   786: aload 5
    //   788: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   791: aload 8
    //   793: astore 12
    //   795: aload 5
    //   797: ldc_w 880
    //   800: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: pop
    //   804: aload 8
    //   806: astore 12
    //   808: aload 5
    //   810: lload 21
    //   812: invokevirtual 883	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   815: pop
    //   816: aload 8
    //   818: astore 12
    //   820: aload_0
    //   821: aload 5
    //   823: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   826: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   829: aload 8
    //   831: astore 12
    //   833: aload_0
    //   834: aload 20
    //   836: invokevirtual 885	vn/hunghd/flutterdownloader/DownloadWorker:p	(Ljava/lang/String;)Ljava/lang/String;
    //   839: astore 9
    //   841: aload 8
    //   843: astore 12
    //   845: new 415	java/lang/StringBuilder
    //   848: astore 5
    //   850: aload 8
    //   852: astore 12
    //   854: aload 5
    //   856: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   859: aload 8
    //   861: astore 12
    //   863: aload 5
    //   865: ldc_w 887
    //   868: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   871: pop
    //   872: aload 8
    //   874: astore 12
    //   876: aload 5
    //   878: aload 9
    //   880: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   883: pop
    //   884: aload 8
    //   886: astore 12
    //   888: aload_0
    //   889: aload 5
    //   891: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   894: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   897: aload 8
    //   899: astore 5
    //   901: iload 6
    //   903: ifne +255 -> 1158
    //   906: aload 8
    //   908: astore 5
    //   910: aload 8
    //   912: ifnonnull +246 -> 1158
    //   915: aload 8
    //   917: astore 13
    //   919: aload 10
    //   921: ldc_w 889
    //   924: invokevirtual 892	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   927: astore 5
    //   929: aload 8
    //   931: astore 13
    //   933: new 415	java/lang/StringBuilder
    //   936: astore 12
    //   938: aload 8
    //   940: astore 13
    //   942: aload 12
    //   944: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   947: aload 8
    //   949: astore 13
    //   951: aload 12
    //   953: ldc_w 894
    //   956: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   959: pop
    //   960: aload 8
    //   962: astore 13
    //   964: aload 12
    //   966: aload 5
    //   968: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   971: pop
    //   972: aload 8
    //   974: astore 13
    //   976: aload_0
    //   977: aload 12
    //   979: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   982: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   985: aload 5
    //   987: ifnull +24 -> 1011
    //   990: aload 8
    //   992: astore 13
    //   994: aload 5
    //   996: invokevirtual 126	java/lang/String:length	()I
    //   999: ifne +6 -> 1005
    //   1002: goto +9 -> 1011
    //   1005: iconst_0
    //   1006: istore 7
    //   1008: goto +6 -> 1014
    //   1011: iconst_1
    //   1012: istore 7
    //   1014: aload 8
    //   1016: astore 12
    //   1018: iload 7
    //   1020: ifne +17 -> 1037
    //   1023: aload 8
    //   1025: astore 13
    //   1027: aload_0
    //   1028: aload 5
    //   1030: aload 9
    //   1032: invokevirtual 897	vn/hunghd/flutterdownloader/DownloadWorker:r	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1035: astore 12
    //   1037: aload 12
    //   1039: ifnull +24 -> 1063
    //   1042: aload 12
    //   1044: astore 13
    //   1046: aload 12
    //   1048: invokevirtual 126	java/lang/String:length	()I
    //   1051: ifne +6 -> 1057
    //   1054: goto +9 -> 1063
    //   1057: iconst_0
    //   1058: istore 7
    //   1060: goto +6 -> 1066
    //   1063: iconst_1
    //   1064: istore 7
    //   1066: aload 12
    //   1068: astore 5
    //   1070: iload 7
    //   1072: ifeq +86 -> 1158
    //   1075: aload 12
    //   1077: astore 13
    //   1079: aload 16
    //   1081: aload 16
    //   1083: ldc_w 703
    //   1086: bipush 6
    //   1088: invokestatic 707	lc/k:u0	(Ljava/lang/String;Ljava/lang/String;I)I
    //   1091: iconst_1
    //   1092: iadd
    //   1093: invokevirtual 899	java/lang/String:substring	(I)Ljava/lang/String;
    //   1096: astore 5
    //   1098: aload 12
    //   1100: astore 13
    //   1102: aload 5
    //   1104: ldc_w 713
    //   1107: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1110: aload 5
    //   1112: ldc_w 901
    //   1115: invokestatic 906	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1118: astore 8
    //   1120: aload 8
    //   1122: astore 5
    //   1124: goto +14 -> 1138
    //   1127: astore_3
    //   1128: goto +13 -> 1141
    //   1131: astore 8
    //   1133: aload 8
    //   1135: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   1138: goto +20 -> 1158
    //   1141: aload 5
    //   1143: astore 8
    //   1145: aload 10
    //   1147: astore 4
    //   1149: aload_3
    //   1150: astore 10
    //   1152: aload 4
    //   1154: astore_3
    //   1155: goto +1731 -> 2886
    //   1158: aload 5
    //   1160: astore 12
    //   1162: new 415	java/lang/StringBuilder
    //   1165: astore 8
    //   1167: aload 5
    //   1169: astore 12
    //   1171: aload 8
    //   1173: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   1176: aload 5
    //   1178: astore 12
    //   1180: aload 8
    //   1182: ldc_w 908
    //   1185: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1188: pop
    //   1189: aload 5
    //   1191: astore 12
    //   1193: aload 8
    //   1195: aload 5
    //   1197: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1200: pop
    //   1201: aload 5
    //   1203: astore 12
    //   1205: aload_0
    //   1206: aload 8
    //   1208: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1211: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   1214: aload 5
    //   1216: astore 12
    //   1218: aload_0
    //   1219: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   1222: astore 8
    //   1224: aload 8
    //   1226: ifnull +52 -> 1278
    //   1229: aload 5
    //   1231: astore 13
    //   1233: aload_0
    //   1234: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   1237: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   1240: astore 12
    //   1242: aload 5
    //   1244: astore 13
    //   1246: aload 12
    //   1248: ldc_w 307
    //   1251: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1254: aload 5
    //   1256: astore 13
    //   1258: aload 8
    //   1260: aload 12
    //   1262: aload 5
    //   1264: aload 20
    //   1266: invokevirtual 911	d5/n:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1269: aload 5
    //   1271: astore 13
    //   1273: getstatic 916	rb/h:a	Lrb/h;
    //   1276: astore 8
    //   1278: aload 5
    //   1280: astore 12
    //   1282: aload 10
    //   1284: invokevirtual 920	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   1287: astore 13
    //   1289: aload 13
    //   1291: astore 8
    //   1293: iload 6
    //   1295: ifeq +71 -> 1366
    //   1298: new 415	java/lang/StringBuilder
    //   1301: astore 12
    //   1303: aload 12
    //   1305: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   1308: aload 12
    //   1310: aload_3
    //   1311: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1314: pop
    //   1315: aload 12
    //   1317: getstatic 605	java/io/File:separator	Ljava/lang/String;
    //   1320: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1323: pop
    //   1324: aload 12
    //   1326: aload 5
    //   1328: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1331: pop
    //   1332: aload 12
    //   1334: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1337: astore 12
    //   1339: new 922	java/io/FileOutputStream
    //   1342: astore_3
    //   1343: aload_3
    //   1344: aload 12
    //   1346: iconst_1
    //   1347: invokespecial 925	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   1350: aload 12
    //   1352: astore 13
    //   1354: goto +119 -> 1473
    //   1357: astore_1
    //   1358: goto +66 -> 1424
    //   1361: astore 8
    //   1363: goto +64 -> 1427
    //   1366: getstatic 574	android/os/Build$VERSION:SDK_INT	I
    //   1369: istore 7
    //   1371: iload 7
    //   1373: bipush 29
    //   1375: if_icmplt +55 -> 1430
    //   1378: aload_0
    //   1379: getfield 568	vn/hunghd/flutterdownloader/DownloadWorker:G	Z
    //   1382: ifeq +48 -> 1430
    //   1385: aload_0
    //   1386: aload 5
    //   1388: aload 20
    //   1390: invokevirtual 927	vn/hunghd/flutterdownloader/DownloadWorker:n	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //   1393: astore_3
    //   1394: aload_3
    //   1395: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   1398: aload_0
    //   1399: aload_3
    //   1400: invokevirtual 930	vn/hunghd/flutterdownloader/DownloadWorker:s	(Landroid/net/Uri;)Ljava/lang/String;
    //   1403: astore 12
    //   1405: aload_1
    //   1406: invokevirtual 676	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   1409: aload_3
    //   1410: ldc_w 931
    //   1413: invokevirtual 935	android/content/ContentResolver:openOutputStream	(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;
    //   1416: astore_3
    //   1417: aload 12
    //   1419: astore 13
    //   1421: goto +52 -> 1473
    //   1424: goto +1008 -> 2432
    //   1427: goto +1020 -> 2447
    //   1430: aload 5
    //   1432: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   1435: aload_0
    //   1436: aload 5
    //   1438: aload_3
    //   1439: invokevirtual 937	vn/hunghd/flutterdownloader/DownloadWorker:m	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   1442: astore 12
    //   1444: aload 12
    //   1446: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   1449: aload 12
    //   1451: invokevirtual 246	java/io/File:getPath	()Ljava/lang/String;
    //   1454: astore_3
    //   1455: new 922	java/io/FileOutputStream
    //   1458: dup
    //   1459: aload 12
    //   1461: iconst_0
    //   1462: invokespecial 940	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   1465: astore 12
    //   1467: aload_3
    //   1468: astore 13
    //   1470: aload 12
    //   1472: astore_3
    //   1473: aload_3
    //   1474: astore 23
    //   1476: aload 8
    //   1478: astore 18
    //   1480: aload 10
    //   1482: astore 16
    //   1484: aload_3
    //   1485: astore 24
    //   1487: aload 8
    //   1489: astore 25
    //   1491: aload 10
    //   1493: astore 9
    //   1495: sipush 4096
    //   1498: newarray <illegal type>
    //   1500: astore 26
    //   1502: lload 14
    //   1504: lstore 27
    //   1506: aload 8
    //   1508: astore 4
    //   1510: aload 19
    //   1512: astore 12
    //   1514: aload 13
    //   1516: astore 19
    //   1518: aload_3
    //   1519: astore 23
    //   1521: aload 4
    //   1523: astore 18
    //   1525: aload 10
    //   1527: astore 16
    //   1529: aload_3
    //   1530: astore 24
    //   1532: aload 4
    //   1534: astore 25
    //   1536: aload 10
    //   1538: astore 9
    //   1540: aload 4
    //   1542: aload 26
    //   1544: invokevirtual 946	java/io/InputStream:read	([B)I
    //   1547: istore 11
    //   1549: iload 11
    //   1551: iconst_m1
    //   1552: if_icmpeq +279 -> 1831
    //   1555: aload_3
    //   1556: astore 23
    //   1558: aload 4
    //   1560: astore 18
    //   1562: aload 10
    //   1564: astore 16
    //   1566: aload_3
    //   1567: astore 24
    //   1569: aload 4
    //   1571: astore 25
    //   1573: aload 10
    //   1575: astore 9
    //   1577: aload_0
    //   1578: invokevirtual 865	androidx/work/d:f	()Z
    //   1581: istore 6
    //   1583: iload 6
    //   1585: ifne +246 -> 1831
    //   1588: aload 4
    //   1590: astore 13
    //   1592: aload 10
    //   1594: astore 8
    //   1596: iload 11
    //   1598: i2l
    //   1599: lload 27
    //   1601: ladd
    //   1602: lstore 27
    //   1604: bipush 100
    //   1606: i2l
    //   1607: lstore 29
    //   1609: lload 29
    //   1611: lload 27
    //   1613: lmul
    //   1614: lload 21
    //   1616: lload 14
    //   1618: ladd
    //   1619: ldiv
    //   1620: lstore 29
    //   1622: lload 29
    //   1624: l2i
    //   1625: istore 7
    //   1627: aload_3
    //   1628: ifnull +29 -> 1657
    //   1631: aload_3
    //   1632: aload 26
    //   1634: iconst_0
    //   1635: iload 11
    //   1637: invokevirtual 952	java/io/OutputStream:write	([BII)V
    //   1640: getstatic 916	rb/h:a	Lrb/h;
    //   1643: astore 16
    //   1645: goto +12 -> 1657
    //   1648: astore_1
    //   1649: goto +45 -> 1694
    //   1652: astore 4
    //   1654: goto +53 -> 1707
    //   1657: aload_0
    //   1658: getfield 488	vn/hunghd/flutterdownloader/DownloadWorker:w	I
    //   1661: istore 11
    //   1663: iload 11
    //   1665: ifeq +71 -> 1736
    //   1668: aload_0
    //   1669: getfield 520	vn/hunghd/flutterdownloader/DownloadWorker:F	I
    //   1672: istore 31
    //   1674: iload 7
    //   1676: iload 31
    //   1678: iload 11
    //   1680: iadd
    //   1681: if_icmpgt +55 -> 1736
    //   1684: iload 7
    //   1686: bipush 100
    //   1688: if_icmpne +121 -> 1809
    //   1691: goto +45 -> 1736
    //   1694: aload 13
    //   1696: astore 5
    //   1698: aload_3
    //   1699: astore 4
    //   1701: aload 8
    //   1703: astore_3
    //   1704: goto +1373 -> 3077
    //   1707: aload 13
    //   1709: astore 10
    //   1711: aload 8
    //   1713: astore 12
    //   1715: aload 4
    //   1717: astore 8
    //   1719: aload 5
    //   1721: astore 13
    //   1723: aload_3
    //   1724: astore 4
    //   1726: aload 12
    //   1728: astore_3
    //   1729: aload 10
    //   1731: astore 5
    //   1733: goto +1214 -> 2947
    //   1736: iload 7
    //   1738: iload 11
    //   1740: if_icmpeq +69 -> 1809
    //   1743: aload_0
    //   1744: iload 7
    //   1746: putfield 488	vn/hunghd/flutterdownloader/DownloadWorker:w	I
    //   1749: aload_0
    //   1750: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   1753: astore 18
    //   1755: aload 18
    //   1757: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   1760: aload_0
    //   1761: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   1764: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   1767: astore 16
    //   1769: aload 16
    //   1771: ldc_w 307
    //   1774: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1777: getstatic 600	ad/a:b	Lad/a;
    //   1780: astore 9
    //   1782: aload 18
    //   1784: aload 16
    //   1786: aload 9
    //   1788: iload 7
    //   1790: invokevirtual 491	d5/n:g	(Ljava/lang/String;Lad/a;I)V
    //   1793: aload_0
    //   1794: aload_1
    //   1795: aload 5
    //   1797: aload 9
    //   1799: iload 7
    //   1801: aconst_null
    //   1802: iconst_0
    //   1803: invokevirtual 486	vn/hunghd/flutterdownloader/DownloadWorker:A	(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V
    //   1806: goto +3 -> 1809
    //   1809: aload 13
    //   1811: astore 4
    //   1813: aload 8
    //   1815: astore 10
    //   1817: goto -299 -> 1518
    //   1820: astore_2
    //   1821: aload_3
    //   1822: astore_1
    //   1823: goto +548 -> 2371
    //   1826: astore 4
    //   1828: goto +574 -> 2402
    //   1831: aload_3
    //   1832: astore 9
    //   1834: aload 4
    //   1836: astore 16
    //   1838: aload 10
    //   1840: astore 13
    //   1842: aload_0
    //   1843: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   1846: astore 18
    //   1848: aload 18
    //   1850: ifnull +32 -> 1882
    //   1853: aload_0
    //   1854: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   1857: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   1860: astore 8
    //   1862: aload 8
    //   1864: ldc_w 307
    //   1867: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1870: aload 18
    //   1872: aload 8
    //   1874: invokevirtual 473	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   1877: astore 8
    //   1879: goto +6 -> 1885
    //   1882: aconst_null
    //   1883: astore 8
    //   1885: aload_0
    //   1886: invokevirtual 865	androidx/work/d:f	()Z
    //   1889: ifeq +25 -> 1914
    //   1892: aload 8
    //   1894: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   1897: aload 8
    //   1899: invokevirtual 954	ad/b:b	()Z
    //   1902: ifeq +12 -> 1914
    //   1905: aload_0
    //   1906: getfield 488	vn/hunghd/flutterdownloader/DownloadWorker:w	I
    //   1909: istore 7
    //   1911: goto +7 -> 1918
    //   1914: bipush 100
    //   1916: istore 7
    //   1918: aload_0
    //   1919: invokevirtual 865	androidx/work/d:f	()Z
    //   1922: ifeq +32 -> 1954
    //   1925: aload 8
    //   1927: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   1930: aload 8
    //   1932: invokevirtual 954	ad/b:b	()Z
    //   1935: ifeq +11 -> 1946
    //   1938: getstatic 956	ad/a:f	Lad/a;
    //   1941: astore 8
    //   1943: goto +16 -> 1959
    //   1946: getstatic 484	ad/a:e	Lad/a;
    //   1949: astore 8
    //   1951: goto +8 -> 1959
    //   1954: getstatic 695	ad/a:c	Lad/a;
    //   1957: astore 8
    //   1959: aload_0
    //   1960: invokevirtual 959	androidx/work/d:a	()Landroid/content/Context;
    //   1963: ldc_w 961
    //   1966: invokestatic 967	v/a:checkSelfPermission	(Landroid/content/Context;Ljava/lang/String;)I
    //   1969: istore 11
    //   1971: aload 8
    //   1973: getstatic 695	ad/a:c	Lad/a;
    //   1976: if_acmpne +264 -> 2240
    //   1979: getstatic 574	android/os/Build$VERSION:SDK_INT	I
    //   1982: istore 31
    //   1984: iload 31
    //   1986: bipush 29
    //   1988: if_icmpge +32 -> 2020
    //   1991: aload 20
    //   1993: invokestatic 969	vn/hunghd/flutterdownloader/DownloadWorker:v	(Ljava/lang/String;)Z
    //   1996: ifeq +24 -> 2020
    //   1999: aload 19
    //   2001: invokestatic 971	vn/hunghd/flutterdownloader/DownloadWorker:u	(Ljava/lang/String;)Z
    //   2004: ifeq +16 -> 2020
    //   2007: aload_0
    //   2008: aload 5
    //   2010: aload 19
    //   2012: aload 20
    //   2014: invokestatic 256	vn/hunghd/flutterdownloader/DownloadWorker:q	(Ljava/lang/String;)Ljava/lang/String;
    //   2017: invokevirtual 973	vn/hunghd/flutterdownloader/DownloadWorker:k	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   2020: aload_0
    //   2021: getfield 564	vn/hunghd/flutterdownloader/DownloadWorker:t	Z
    //   2024: istore 6
    //   2026: iload 6
    //   2028: ifeq +212 -> 2240
    //   2031: iload 31
    //   2033: bipush 29
    //   2035: if_icmpge +54 -> 2089
    //   2038: iload 11
    //   2040: ifeq +49 -> 2089
    //   2043: aload 9
    //   2045: ifnull +21 -> 2066
    //   2048: aload 9
    //   2050: invokevirtual 976	java/io/OutputStream:flush	()V
    //   2053: aload 9
    //   2055: invokevirtual 979	java/io/OutputStream:close	()V
    //   2058: goto +8 -> 2066
    //   2061: astore_1
    //   2062: aload_1
    //   2063: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   2066: aload 16
    //   2068: invokevirtual 980	java/io/InputStream:close	()V
    //   2071: goto +8 -> 2079
    //   2074: astore_1
    //   2075: aload_1
    //   2076: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   2079: aload 13
    //   2081: invokevirtual 983	java/net/HttpURLConnection:disconnect	()V
    //   2084: getstatic 916	rb/h:a	Lrb/h;
    //   2087: astore_1
    //   2088: return
    //   2089: getstatic 988	ad/d:a	Lad/d;
    //   2092: astore 25
    //   2094: aload_0
    //   2095: invokevirtual 959	androidx/work/d:a	()Landroid/content/Context;
    //   2098: astore 18
    //   2100: aload 18
    //   2102: ldc_w 447
    //   2105: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2108: aload 19
    //   2110: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   2113: aload 25
    //   2115: aload 18
    //   2117: aload 19
    //   2119: aload 20
    //   2121: invokevirtual 991	ad/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   2124: astore 25
    //   2126: aload 25
    //   2128: ifnull +76 -> 2204
    //   2131: new 415	java/lang/StringBuilder
    //   2134: astore 18
    //   2136: aload 18
    //   2138: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   2141: aload 18
    //   2143: ldc_w 993
    //   2146: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2149: pop
    //   2150: aload 18
    //   2152: aload 19
    //   2154: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2157: pop
    //   2158: aload_0
    //   2159: aload 18
    //   2161: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2164: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2167: iload 31
    //   2169: bipush 31
    //   2171: if_icmplt +11 -> 2182
    //   2174: ldc_w 994
    //   2177: istore 11
    //   2179: goto +8 -> 2187
    //   2182: ldc_w 995
    //   2185: istore 11
    //   2187: aload_0
    //   2188: invokevirtual 959	androidx/work/d:a	()Landroid/content/Context;
    //   2191: iconst_0
    //   2192: aload 25
    //   2194: iload 11
    //   2196: invokestatic 1001	android/app/PendingIntent:getActivity	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   2199: astore 18
    //   2201: goto +42 -> 2243
    //   2204: new 415	java/lang/StringBuilder
    //   2207: astore 18
    //   2209: aload 18
    //   2211: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   2214: aload 18
    //   2216: ldc_w 1003
    //   2219: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2222: pop
    //   2223: aload 18
    //   2225: aload 19
    //   2227: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2230: pop
    //   2231: aload_0
    //   2232: aload 18
    //   2234: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2237: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2240: aconst_null
    //   2241: astore 18
    //   2243: aload_0
    //   2244: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   2247: astore 25
    //   2249: aload 25
    //   2251: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   2254: aload_0
    //   2255: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   2258: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   2261: astore 24
    //   2263: aload 24
    //   2265: ldc_w 307
    //   2268: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2271: aload 25
    //   2273: aload 24
    //   2275: aload 8
    //   2277: iload 7
    //   2279: invokevirtual 491	d5/n:g	(Ljava/lang/String;Lad/a;I)V
    //   2282: aload_0
    //   2283: aload_1
    //   2284: aload 5
    //   2286: aload 8
    //   2288: iload 7
    //   2290: aload 18
    //   2292: iconst_1
    //   2293: invokevirtual 486	vn/hunghd/flutterdownloader/DownloadWorker:A	(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V
    //   2296: aload_0
    //   2297: invokevirtual 865	androidx/work/d:f	()Z
    //   2300: ifeq +6 -> 2306
    //   2303: goto +8 -> 2311
    //   2306: ldc_w 1005
    //   2309: astore 12
    //   2311: aload_0
    //   2312: aload 12
    //   2314: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2317: aload 16
    //   2319: astore_2
    //   2320: aload 9
    //   2322: astore_3
    //   2323: aload 13
    //   2325: astore_1
    //   2326: goto +331 -> 2657
    //   2329: aload_3
    //   2330: astore_1
    //   2331: aload 10
    //   2333: astore 8
    //   2335: astore_2
    //   2336: aload 4
    //   2338: astore 13
    //   2340: goto -517 -> 1823
    //   2343: aload 4
    //   2345: astore 13
    //   2347: aload 10
    //   2349: astore 8
    //   2351: astore 4
    //   2353: goto -525 -> 1828
    //   2356: astore_2
    //   2357: aload 23
    //   2359: astore_1
    //   2360: aload 18
    //   2362: astore 13
    //   2364: aload 16
    //   2366: astore 8
    //   2368: goto -545 -> 1823
    //   2371: aload 13
    //   2373: astore 5
    //   2375: aload 8
    //   2377: astore_3
    //   2378: aload_1
    //   2379: astore 4
    //   2381: aload_2
    //   2382: astore_1
    //   2383: goto +694 -> 3077
    //   2386: astore 4
    //   2388: aload 24
    //   2390: astore_3
    //   2391: aload 25
    //   2393: astore 13
    //   2395: aload 9
    //   2397: astore 8
    //   2399: goto -571 -> 1828
    //   2402: aload 13
    //   2404: astore 10
    //   2406: aload 8
    //   2408: astore 12
    //   2410: aload 4
    //   2412: astore 8
    //   2414: aload 5
    //   2416: astore 13
    //   2418: aload_3
    //   2419: astore 4
    //   2421: aload 12
    //   2423: astore_3
    //   2424: aload 10
    //   2426: astore 5
    //   2428: goto +519 -> 2947
    //   2431: astore_1
    //   2432: aload 13
    //   2434: astore 5
    //   2436: aload 4
    //   2438: astore_3
    //   2439: aconst_null
    //   2440: astore 4
    //   2442: goto +635 -> 3077
    //   2445: astore 8
    //   2447: aload 13
    //   2449: astore 10
    //   2451: aload 4
    //   2453: astore_3
    //   2454: aconst_null
    //   2455: astore 4
    //   2457: aload 5
    //   2459: astore 13
    //   2461: aload 10
    //   2463: astore 5
    //   2465: goto +482 -> 2947
    //   2468: aload_0
    //   2469: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   2472: astore_3
    //   2473: aload_3
    //   2474: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   2477: aload_0
    //   2478: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   2481: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   2484: astore 5
    //   2486: aload 5
    //   2488: ldc_w 307
    //   2491: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2494: aload_3
    //   2495: aload 5
    //   2497: invokevirtual 473	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   2500: astore_3
    //   2501: aload_0
    //   2502: invokevirtual 865	androidx/work/d:f	()Z
    //   2505: ifeq +28 -> 2533
    //   2508: aload_3
    //   2509: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   2512: aload_3
    //   2513: invokevirtual 954	ad/b:b	()Z
    //   2516: ifeq +10 -> 2526
    //   2519: getstatic 956	ad/a:f	Lad/a;
    //   2522: astore_3
    //   2523: goto +14 -> 2537
    //   2526: getstatic 484	ad/a:e	Lad/a;
    //   2529: astore_3
    //   2530: goto +7 -> 2537
    //   2533: getstatic 628	ad/a:d	Lad/a;
    //   2536: astore_3
    //   2537: aload_0
    //   2538: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   2541: astore 13
    //   2543: aload 13
    //   2545: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   2548: aload_0
    //   2549: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   2552: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   2555: astore 5
    //   2557: aload 5
    //   2559: ldc_w 307
    //   2562: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2565: aload 13
    //   2567: aload 5
    //   2569: aload_3
    //   2570: aload_0
    //   2571: getfield 488	vn/hunghd/flutterdownloader/DownloadWorker:w	I
    //   2574: invokevirtual 491	d5/n:g	(Ljava/lang/String;Lad/a;I)V
    //   2577: aload 8
    //   2579: ifnonnull +9 -> 2588
    //   2582: aload_2
    //   2583: astore 5
    //   2585: goto +7 -> 2592
    //   2588: aload 8
    //   2590: astore 5
    //   2592: aload_0
    //   2593: aload_1
    //   2594: aload 5
    //   2596: aload_3
    //   2597: iconst_m1
    //   2598: aconst_null
    //   2599: iconst_1
    //   2600: invokevirtual 486	vn/hunghd/flutterdownloader/DownloadWorker:A	(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V
    //   2603: aload_0
    //   2604: invokevirtual 865	androidx/work/d:f	()Z
    //   2607: ifeq +10 -> 2617
    //   2610: ldc_w 863
    //   2613: astore_3
    //   2614: goto +31 -> 2645
    //   2617: new 415	java/lang/StringBuilder
    //   2620: astore_3
    //   2621: aload_3
    //   2622: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   2625: aload_3
    //   2626: ldc_w 1007
    //   2629: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2632: pop
    //   2633: aload_3
    //   2634: iload 11
    //   2636: invokevirtual 419	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2639: pop
    //   2640: aload_3
    //   2641: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2644: astore_3
    //   2645: aload_0
    //   2646: aload_3
    //   2647: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2650: aconst_null
    //   2651: astore_3
    //   2652: aconst_null
    //   2653: astore_2
    //   2654: aload 10
    //   2656: astore_1
    //   2657: aload_3
    //   2658: ifnull +19 -> 2677
    //   2661: aload_3
    //   2662: invokevirtual 976	java/io/OutputStream:flush	()V
    //   2665: aload_3
    //   2666: invokevirtual 979	java/io/OutputStream:close	()V
    //   2669: goto +8 -> 2677
    //   2672: astore_3
    //   2673: aload_3
    //   2674: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   2677: aload_2
    //   2678: ifnull +15 -> 2693
    //   2681: aload_2
    //   2682: invokevirtual 980	java/io/InputStream:close	()V
    //   2685: goto +8 -> 2693
    //   2688: astore_2
    //   2689: aload_2
    //   2690: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   2693: goto +374 -> 3067
    //   2696: astore_1
    //   2697: goto +8 -> 2705
    //   2700: astore_3
    //   2701: goto +15 -> 2716
    //   2704: astore_1
    //   2705: aload 4
    //   2707: astore_2
    //   2708: goto +166 -> 2874
    //   2711: astore_3
    //   2712: aload 12
    //   2714: astore 8
    //   2716: aload_3
    //   2717: astore 10
    //   2719: aload 4
    //   2721: astore_3
    //   2722: goto +164 -> 2886
    //   2725: aload_0
    //   2726: ldc_w 1009
    //   2729: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2732: aload 10
    //   2734: ldc_w 1011
    //   2737: invokevirtual 892	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   2740: astore 13
    //   2742: new 415	java/lang/StringBuilder
    //   2745: astore 18
    //   2747: aload 18
    //   2749: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   2752: aload 18
    //   2754: ldc_w 1013
    //   2757: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2760: pop
    //   2761: aload 18
    //   2763: aload 13
    //   2765: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2768: pop
    //   2769: aload_0
    //   2770: aload 18
    //   2772: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2775: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2778: new 263	java/net/URL
    //   2781: astore 18
    //   2783: aload 18
    //   2785: aload 16
    //   2787: invokespecial 763	java/net/URL:<init>	(Ljava/lang/String;)V
    //   2790: new 263	java/net/URL
    //   2793: astore 16
    //   2795: aload 16
    //   2797: aload 18
    //   2799: aload 13
    //   2801: invokespecial 1016	java/net/URL:<init>	(Ljava/net/URL;Ljava/lang/String;)V
    //   2804: aload 16
    //   2806: invokevirtual 1019	java/net/URL:toExternalForm	()Ljava/lang/String;
    //   2809: astore 16
    //   2811: new 415	java/lang/StringBuilder
    //   2814: astore 13
    //   2816: aload 13
    //   2818: invokespecial 541	java/lang/StringBuilder:<init>	()V
    //   2821: aload 13
    //   2823: ldc_w 1021
    //   2826: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2829: pop
    //   2830: aload 13
    //   2832: aload 16
    //   2834: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2837: pop
    //   2838: aload_0
    //   2839: aload 13
    //   2841: invokevirtual 434	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2844: invokevirtual 391	vn/hunghd/flutterdownloader/DownloadWorker:w	(Ljava/lang/String;)V
    //   2847: aload 10
    //   2849: astore 4
    //   2851: goto -2673 -> 178
    //   2854: astore_1
    //   2855: goto +16 -> 2871
    //   2858: astore_3
    //   2859: goto +21 -> 2880
    //   2862: astore_1
    //   2863: goto +8 -> 2871
    //   2866: astore_3
    //   2867: goto +13 -> 2880
    //   2870: astore_1
    //   2871: aload 4
    //   2873: astore_2
    //   2874: aload_2
    //   2875: astore_3
    //   2876: goto +44 -> 2920
    //   2879: astore_3
    //   2880: aload_3
    //   2881: astore 10
    //   2883: aload 4
    //   2885: astore_3
    //   2886: goto +47 -> 2933
    //   2889: new 722	java/io/IOException
    //   2892: astore_3
    //   2893: aload_3
    //   2894: ldc_w 1023
    //   2897: invokespecial 1024	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   2900: aload_3
    //   2901: athrow
    //   2902: astore_1
    //   2903: aload 4
    //   2905: astore_3
    //   2906: goto +14 -> 2920
    //   2909: astore 10
    //   2911: aload 4
    //   2913: astore_3
    //   2914: goto +19 -> 2933
    //   2917: astore_1
    //   2918: aconst_null
    //   2919: astore_3
    //   2920: aconst_null
    //   2921: astore 4
    //   2923: aconst_null
    //   2924: astore 5
    //   2926: goto +151 -> 3077
    //   2929: astore 10
    //   2931: aconst_null
    //   2932: astore_3
    //   2933: aconst_null
    //   2934: astore 4
    //   2936: aconst_null
    //   2937: astore 5
    //   2939: aload 8
    //   2941: astore 13
    //   2943: aload 10
    //   2945: astore 8
    //   2947: aload_0
    //   2948: getfield 464	vn/hunghd/flutterdownloader/DownloadWorker:r	Ld5/n;
    //   2951: astore 12
    //   2953: aload 12
    //   2955: invokestatic 694	ec/i:b	(Ljava/lang/Object;)V
    //   2958: aload_0
    //   2959: invokevirtual 755	androidx/work/d:c	()Ljava/util/UUID;
    //   2962: invokevirtual 305	java/util/UUID:toString	()Ljava/lang/String;
    //   2965: astore 16
    //   2967: aload 16
    //   2969: ldc_w 307
    //   2972: invokestatic 241	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2975: getstatic 628	ad/a:d	Lad/a;
    //   2978: astore 10
    //   2980: aload 12
    //   2982: aload 16
    //   2984: aload 10
    //   2986: aload_0
    //   2987: getfield 488	vn/hunghd/flutterdownloader/DownloadWorker:w	I
    //   2990: invokevirtual 491	d5/n:g	(Ljava/lang/String;Lad/a;I)V
    //   2993: aload 13
    //   2995: ifnonnull +6 -> 3001
    //   2998: goto +6 -> 3004
    //   3001: aload 13
    //   3003: astore_2
    //   3004: aload_0
    //   3005: aload_1
    //   3006: aload_2
    //   3007: aload 10
    //   3009: iconst_m1
    //   3010: aconst_null
    //   3011: iconst_1
    //   3012: invokevirtual 486	vn/hunghd/flutterdownloader/DownloadWorker:A	(Landroid/content/Context;Ljava/lang/String;Lad/a;ILandroid/app/PendingIntent;Z)V
    //   3015: aload 8
    //   3017: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   3020: aload 4
    //   3022: ifnull +21 -> 3043
    //   3025: aload 4
    //   3027: invokevirtual 976	java/io/OutputStream:flush	()V
    //   3030: aload 4
    //   3032: invokevirtual 979	java/io/OutputStream:close	()V
    //   3035: goto +8 -> 3043
    //   3038: astore_1
    //   3039: aload_1
    //   3040: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   3043: aload 5
    //   3045: ifnull +16 -> 3061
    //   3048: aload 5
    //   3050: invokevirtual 980	java/io/InputStream:close	()V
    //   3053: goto +8 -> 3061
    //   3056: astore_1
    //   3057: aload_1
    //   3058: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   3061: aload_3
    //   3062: ifnull +13 -> 3075
    //   3065: aload_3
    //   3066: astore_1
    //   3067: aload_1
    //   3068: invokevirtual 983	java/net/HttpURLConnection:disconnect	()V
    //   3071: getstatic 916	rb/h:a	Lrb/h;
    //   3074: astore_1
    //   3075: return
    //   3076: astore_1
    //   3077: aload 4
    //   3079: ifnull +21 -> 3100
    //   3082: aload 4
    //   3084: invokevirtual 976	java/io/OutputStream:flush	()V
    //   3087: aload 4
    //   3089: invokevirtual 979	java/io/OutputStream:close	()V
    //   3092: goto +8 -> 3100
    //   3095: astore_2
    //   3096: aload_2
    //   3097: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   3100: aload 5
    //   3102: ifnull +16 -> 3118
    //   3105: aload 5
    //   3107: invokevirtual 980	java/io/InputStream:close	()V
    //   3110: goto +8 -> 3118
    //   3113: astore_2
    //   3114: aload_2
    //   3115: invokevirtual 402	java/lang/Throwable:printStackTrace	()V
    //   3118: aload_3
    //   3119: ifnull +11 -> 3130
    //   3122: aload_3
    //   3123: invokevirtual 983	java/net/HttpURLConnection:disconnect	()V
    //   3126: getstatic 916	rb/h:a	Lrb/h;
    //   3129: astore_2
    //   3130: aload_1
    //   3131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3132	0	this	DownloadWorker
    //   0	3132	1	paramContext	Context
    //   0	3132	2	paramString1	String
    //   0	3132	3	paramString2	String
    //   0	3132	4	paramString3	String
    //   0	3132	5	paramString4	String
    //   0	3132	6	paramBoolean	boolean
    //   0	3132	7	paramInt	int
    //   2	1119	8	localObject1	Object
    //   1131	3	8	localIllegalArgumentException	IllegalArgumentException
    //   1143	149	8	localObject2	Object
    //   1361	146	8	localIOException1	IOException
    //   1594	819	8	localObject3	Object
    //   2445	144	8	localIOException2	IOException
    //   2714	302	8	localObject4	Object
    //   11	2385	9	localObject5	Object
    //   17	2865	10	localObject6	Object
    //   2909	1	10	localIOException3	IOException
    //   2929	15	10	localIOException4	IOException
    //   2978	30	10	locala	ad.a
    //   99	2536	11	i	int
    //   127	2854	12	localObject7	Object
    //   137	2865	13	localObject8	Object
    //   170	1447	14	l1	long
    //   173	2810	16	localObject9	Object
    //   254	3	17	bool	boolean
    //   282	2516	18	localObject10	Object
    //   624	1602	19	localObject11	Object
    //   673	1447	20	str1	String
    //   700	915	21	l2	long
    //   1474	884	23	str2	String
    //   1485	904	24	str3	String
    //   1489	903	25	localObject12	Object
    //   1500	133	26	arrayOfByte	byte[]
    //   1504	108	27	l3	long
    //   1607	16	29	l4	long
    //   1672	500	31	j	int
    // Exception table:
    //   from	to	target	type
    //   533	544	547	finally
    //   695	702	547	finally
    //   919	929	547	finally
    //   933	938	547	finally
    //   942	947	547	finally
    //   951	960	547	finally
    //   964	972	547	finally
    //   976	985	547	finally
    //   994	1002	547	finally
    //   1027	1037	547	finally
    //   1046	1054	547	finally
    //   1079	1098	547	finally
    //   1102	1110	547	finally
    //   1110	1120	547	finally
    //   1133	1138	547	finally
    //   1233	1242	547	finally
    //   1246	1254	547	finally
    //   1258	1269	547	finally
    //   1273	1278	547	finally
    //   533	544	554	java/io/IOException
    //   695	702	554	java/io/IOException
    //   919	929	554	java/io/IOException
    //   933	938	554	java/io/IOException
    //   942	947	554	java/io/IOException
    //   951	960	554	java/io/IOException
    //   964	972	554	java/io/IOException
    //   976	985	554	java/io/IOException
    //   994	1002	554	java/io/IOException
    //   1027	1037	554	java/io/IOException
    //   1046	1054	554	java/io/IOException
    //   1079	1098	554	java/io/IOException
    //   1102	1110	554	java/io/IOException
    //   1233	1242	554	java/io/IOException
    //   1246	1254	554	java/io/IOException
    //   1258	1269	554	java/io/IOException
    //   1273	1278	554	java/io/IOException
    //   1110	1120	1127	java/io/IOException
    //   1133	1138	1127	java/io/IOException
    //   1110	1120	1131	java/lang/IllegalArgumentException
    //   1298	1350	1357	finally
    //   1378	1417	1357	finally
    //   1298	1350	1361	java/io/IOException
    //   1378	1417	1361	java/io/IOException
    //   1631	1645	1648	finally
    //   1668	1674	1648	finally
    //   1631	1645	1652	java/io/IOException
    //   1668	1674	1652	java/io/IOException
    //   1609	1622	1820	finally
    //   1657	1663	1820	finally
    //   1743	1793	1820	finally
    //   1609	1622	1826	java/io/IOException
    //   1657	1663	1826	java/io/IOException
    //   1743	1793	1826	java/io/IOException
    //   2053	2058	2061	java/io/IOException
    //   2066	2071	2074	java/io/IOException
    //   1793	1806	2329	finally
    //   1842	1848	2329	finally
    //   1853	1879	2329	finally
    //   1885	1911	2329	finally
    //   1918	1943	2329	finally
    //   1946	1951	2329	finally
    //   1954	1959	2329	finally
    //   1959	1984	2329	finally
    //   1991	2020	2329	finally
    //   2020	2026	2329	finally
    //   2089	2126	2329	finally
    //   2131	2167	2329	finally
    //   2187	2201	2329	finally
    //   2204	2240	2329	finally
    //   2243	2303	2329	finally
    //   2311	2317	2329	finally
    //   1793	1806	2343	java/io/IOException
    //   1842	1848	2343	java/io/IOException
    //   1853	1879	2343	java/io/IOException
    //   1885	1911	2343	java/io/IOException
    //   1918	1943	2343	java/io/IOException
    //   1946	1951	2343	java/io/IOException
    //   1954	1959	2343	java/io/IOException
    //   1959	1984	2343	java/io/IOException
    //   1991	2020	2343	java/io/IOException
    //   2020	2026	2343	java/io/IOException
    //   2089	2126	2343	java/io/IOException
    //   2131	2167	2343	java/io/IOException
    //   2187	2201	2343	java/io/IOException
    //   2204	2240	2343	java/io/IOException
    //   2243	2303	2343	java/io/IOException
    //   2311	2317	2343	java/io/IOException
    //   1495	1502	2356	finally
    //   1540	1549	2356	finally
    //   1577	1583	2356	finally
    //   1495	1502	2386	java/io/IOException
    //   1540	1549	2386	java/io/IOException
    //   1577	1583	2386	java/io/IOException
    //   1366	1371	2431	finally
    //   1430	1467	2431	finally
    //   1366	1371	2445	java/io/IOException
    //   1430	1467	2445	java/io/IOException
    //   2665	2669	2672	java/io/IOException
    //   2681	2685	2688	java/io/IOException
    //   2468	2523	2696	finally
    //   2526	2530	2696	finally
    //   2533	2537	2696	finally
    //   2537	2577	2696	finally
    //   2592	2610	2696	finally
    //   2617	2645	2696	finally
    //   2645	2650	2696	finally
    //   2468	2523	2700	java/io/IOException
    //   2526	2530	2700	java/io/IOException
    //   2533	2537	2700	java/io/IOException
    //   2537	2577	2700	java/io/IOException
    //   2592	2610	2700	java/io/IOException
    //   2617	2645	2700	java/io/IOException
    //   2645	2650	2700	java/io/IOException
    //   616	621	2704	finally
    //   657	664	2704	finally
    //   668	675	2704	finally
    //   679	684	2704	finally
    //   709	717	2704	finally
    //   721	726	2704	finally
    //   730	735	2704	finally
    //   739	748	2704	finally
    //   752	760	2704	finally
    //   764	773	2704	finally
    //   777	782	2704	finally
    //   786	791	2704	finally
    //   795	804	2704	finally
    //   808	816	2704	finally
    //   820	829	2704	finally
    //   833	841	2704	finally
    //   845	850	2704	finally
    //   854	859	2704	finally
    //   863	872	2704	finally
    //   876	884	2704	finally
    //   888	897	2704	finally
    //   1162	1167	2704	finally
    //   1171	1176	2704	finally
    //   1180	1189	2704	finally
    //   1193	1201	2704	finally
    //   1205	1214	2704	finally
    //   1218	1224	2704	finally
    //   1282	1289	2704	finally
    //   616	621	2711	java/io/IOException
    //   657	664	2711	java/io/IOException
    //   668	675	2711	java/io/IOException
    //   679	684	2711	java/io/IOException
    //   709	717	2711	java/io/IOException
    //   721	726	2711	java/io/IOException
    //   730	735	2711	java/io/IOException
    //   739	748	2711	java/io/IOException
    //   752	760	2711	java/io/IOException
    //   764	773	2711	java/io/IOException
    //   777	782	2711	java/io/IOException
    //   786	791	2711	java/io/IOException
    //   795	804	2711	java/io/IOException
    //   808	816	2711	java/io/IOException
    //   820	829	2711	java/io/IOException
    //   833	841	2711	java/io/IOException
    //   845	850	2711	java/io/IOException
    //   854	859	2711	java/io/IOException
    //   863	872	2711	java/io/IOException
    //   876	884	2711	java/io/IOException
    //   888	897	2711	java/io/IOException
    //   1162	1167	2711	java/io/IOException
    //   1171	1176	2711	java/io/IOException
    //   1180	1189	2711	java/io/IOException
    //   1193	1201	2711	java/io/IOException
    //   1205	1214	2711	java/io/IOException
    //   1218	1224	2711	java/io/IOException
    //   1282	1289	2711	java/io/IOException
    //   2732	2847	2854	finally
    //   2732	2847	2858	java/io/IOException
    //   2725	2732	2862	finally
    //   2725	2732	2866	java/io/IOException
    //   449	524	2870	finally
    //   562	569	2870	finally
    //   449	524	2879	java/io/IOException
    //   562	569	2879	java/io/IOException
    //   178	200	2902	finally
    //   206	232	2902	finally
    //   238	256	2902	finally
    //   261	340	2902	finally
    //   347	356	2902	finally
    //   359	427	2902	finally
    //   434	441	2902	finally
    //   2889	2902	2902	finally
    //   178	200	2909	java/io/IOException
    //   206	232	2909	java/io/IOException
    //   238	256	2909	java/io/IOException
    //   261	340	2909	java/io/IOException
    //   347	356	2909	java/io/IOException
    //   359	427	2909	java/io/IOException
    //   434	441	2909	java/io/IOException
    //   2889	2902	2909	java/io/IOException
    //   13	19	2917	finally
    //   24	50	2917	finally
    //   61	70	2917	finally
    //   70	82	2917	finally
    //   87	95	2917	finally
    //   112	163	2917	finally
    //   13	19	2929	java/io/IOException
    //   24	50	2929	java/io/IOException
    //   61	70	2929	java/io/IOException
    //   70	82	2929	java/io/IOException
    //   87	95	2929	java/io/IOException
    //   112	163	2929	java/io/IOException
    //   3030	3035	3038	java/io/IOException
    //   3048	3053	3056	java/io/IOException
    //   2947	2993	3076	finally
    //   3004	3020	3076	finally
    //   3087	3092	3095	java/io/IOException
    //   3105	3110	3113	java/io/IOException
  }
  
  public final void onMethodCall(MethodCall arg1, MethodChannel.Result paramResult)
  {
    ec.i.e(???, "call");
    ec.i.e(paramResult, "result");
    if (method.equals("didInitializeDispatcher")) {
      synchronized (H)
      {
        for (;;)
        {
          ArrayDeque localArrayDeque = I;
          if (localArrayDeque.isEmpty()) {
            break;
          }
          MethodChannel localMethodChannel = q;
          if (localMethodChannel != null) {
            localMethodChannel.invokeMethod("", localArrayDeque.remove());
          }
        }
        H.set(true);
        paramResult.success(null);
        paramResult = rb.h.a;
      }
    }
    paramResult.notImplemented();
  }
  
  public final String p(String paramString)
  {
    Object localObject1 = null;
    if (paramString == null) {
      return null;
    }
    Object localObject2 = f.matcher(paramString);
    paramString = (String)localObject1;
    if (((Matcher)localObject2).find())
    {
      localObject2 = ((Matcher)localObject2).group(1);
      paramString = (String)localObject1;
      if (localObject2 != null)
      {
        int i = ((CharSequence)localObject2).length() - 1;
        int j = 0;
        int k = j;
        while (j <= i)
        {
          int m;
          if (k == 0) {
            m = j;
          } else {
            m = i;
          }
          if (ec.i.f(((CharSequence)localObject2).charAt(m), 32) <= 0) {
            m = 1;
          } else {
            m = 0;
          }
          if (k == 0)
          {
            if (m == 0) {
              k = 1;
            } else {
              j++;
            }
          }
          else
          {
            if (m == 0) {
              break;
            }
            i--;
          }
        }
        localObject2 = ((CharSequence)localObject2).subSequence(j, i + 1).toString();
        paramString = (String)localObject1;
        if (localObject2 != null)
        {
          paramString = Locale.US;
          ec.i.d(paramString, "US");
          paramString = ((String)localObject2).toUpperCase(paramString);
          ec.i.d(paramString, "toUpperCase(...)");
        }
      }
    }
    return paramString;
  }
  
  public final String r(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    if (paramString1 == null) {
      return null;
    }
    Object localObject2 = p.matcher(paramString1);
    if (((Matcher)localObject2).find()) {
      localObject2 = ((Matcher)localObject2).group(1);
    } else {
      localObject2 = null;
    }
    paramString1 = o.matcher(paramString1);
    if (paramString1.find())
    {
      localObject2 = paramString1.group(3);
      paramString1 = paramString1.group(1);
      if (paramString1 != null)
      {
        paramString2 = Locale.US;
        ec.i.d(paramString2, "US");
        paramString2 = paramString1.toUpperCase(paramString2);
        ec.i.d(paramString2, "toUpperCase(...)");
      }
      else
      {
        paramString2 = null;
      }
    }
    if (localObject2 == null)
    {
      paramString1 = (String)localObject1;
    }
    else
    {
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = "ISO-8859-1";
      }
      paramString1 = URLDecoder.decode((String)localObject2, paramString1);
    }
    return paramString1;
  }
  
  public final String s(Uri paramUri)
  {
    try
    {
      Cursor localCursor = a.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
      if (localCursor == null)
      {
        x6.b.L(localCursor, null);
        return null;
      }
      try
      {
        if (!localCursor.moveToFirst()) {
          paramUri = null;
        } else {
          paramUri = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
        }
        x6.b.L(localCursor, null);
        return paramUri;
      }
      finally
      {
        try
        {
          throw paramUri;
        }
        finally
        {
          x6.b.L(localCursor, paramUri);
        }
      }
      return null;
    }
    catch (IllegalArgumentException paramUri)
    {
      paramUri.printStackTrace();
      if (u) {
        Log.e("DownloadWorker", "Get a path for a MediaStore failed");
      }
    }
  }
  
  public final int t()
  {
    try
    {
      ApplicationInfo localApplicationInfo = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128);
      ec.i.d(localApplicationInfo, "getApplicationInfo(...)");
      int i = icon;
      i = metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", i);
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.printStackTrace();
    }
    return 0;
  }
  
  public final void w(String paramString)
  {
    if (u) {
      Log.d("DownloadWorker", paramString);
    }
  }
  
  public final void y(HttpURLConnection paramHttpURLConnection, String paramString)
  {
    int i;
    if (paramString.length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Headers = ");
      ((StringBuilder)localObject).append(paramString);
      w(((StringBuilder)localObject).toString());
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = ((JSONObject)localObject).keys();
        ec.i.d(paramString, "keys(...)");
        while (paramString.hasNext())
        {
          String str = (String)paramString.next();
          paramHttpURLConnection.setRequestProperty(str, ((JSONObject)localObject).getString(str));
        }
        paramHttpURLConnection.setDoInput(true);
      }
      catch (JSONException paramHttpURLConnection)
      {
        paramHttpURLConnection.printStackTrace();
      }
    }
  }
  
  public final long z(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2)
  {
    long l = new File(g.f(f.l(paramString2), File.separator, paramString1)).length();
    paramString1 = new StringBuilder();
    paramString1.append("Resume download: Range: bytes=");
    paramString1.append(l);
    paramString1.append('-');
    w(paramString1.toString());
    paramHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    paramString1 = new StringBuilder();
    paramString1.append("bytes=");
    paramString1.append(l);
    paramString1.append('-');
    paramHttpURLConnection.setRequestProperty("Range", paramString1.toString());
    paramHttpURLConnection.setDoInput(true);
    return l;
  }
  
  public static final class a
  {
    public static final void a()
    {
      Object localObject = DownloadWorker.H;
      a locala = new a();
      try
      {
        localObject = SSLContext.getInstance("TLS");
        ec.i.d(localObject, "getInstance(...)");
        SecureRandom localSecureRandom = new java/security/SecureRandom;
        localSecureRandom.<init>();
        ((SSLContext)localObject).init(null, new TrustManager[] { locala }, localSecureRandom);
        HttpsURLConnection.setDefaultSSLSocketFactory(((SSLContext)localObject).getSocketFactory());
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
}

/* Location:
 * Qualified Name:     vn.hunghd.flutterdownloader.DownloadWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */