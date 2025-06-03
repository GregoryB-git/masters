package va;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Log;
import f;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import p2.m0;
import v3.x0;

public class s
  implements FlutterPlugin, MethodChannel.MethodCallHandler
{
  public static final HashMap c = new HashMap();
  public static final HashMap d = new HashMap();
  public static final Object e = new Object();
  public static final Object f = new Object();
  public static int o = 0;
  public static String p;
  public static int q = 0;
  public static int r = 1;
  public static int s = 0;
  public static i t;
  public Context a;
  public MethodChannel b;
  
  public static void a(s arg0, d paramd)
  {
    ???.getClass();
    int i = 0;
    int j;
    StringBuilder localStringBuilder;
    try
    {
      if (d >= 1) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        ??? = new java/lang/StringBuilder;
        ???.<init>();
        ???.append(paramd.h());
        ???.append("closing database ");
        Log.d("Sqflite", ???.toString());
      }
      paramd.a();
    }
    catch (Exception ???)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("error ");
      localStringBuilder.append(???);
      localStringBuilder.append(" while closing database ");
      localStringBuilder.append(s);
      Log.e("Sqflite", localStringBuilder.toString());
    }
    synchronized (e)
    {
      if ((d.isEmpty()) && (t != null))
      {
        j = i;
        if (d >= 1) {
          j = 1;
        }
        if (j != 0)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(paramd.h());
          localStringBuilder.append("stopping thread");
          Log.d("Sqflite", localStringBuilder.toString());
        }
        t.b();
        t = null;
      }
      return;
    }
  }
  
  public static d b(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    int i = ((Integer)paramMethodCall.argument("id")).intValue();
    paramMethodCall = (d)d.get(Integer.valueOf(i));
    if (paramMethodCall != null) {
      return paramMethodCall;
    }
    paramMethodCall = new StringBuilder();
    paramMethodCall.append("database_closed ");
    paramMethodCall.append(i);
    paramResult.error("sqlite_error", paramMethodCall.toString(), null);
    return null;
  }
  
  public static HashMap c(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", Integer.valueOf(paramInt));
    if (paramBoolean1) {
      localHashMap.put("recovered", Boolean.TRUE);
    }
    if (paramBoolean2) {
      localHashMap.put("recoveredInTransaction", Boolean.TRUE);
    }
    return localHashMap;
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    Context localContext = paramFlutterPluginBinding.getApplicationContext();
    paramFlutterPluginBinding = paramFlutterPluginBinding.getBinaryMessenger();
    a = localContext;
    paramFlutterPluginBinding = new MethodChannel(paramFlutterPluginBinding, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, paramFlutterPluginBinding.makeBackgroundTaskQueue());
    b = paramFlutterPluginBinding;
    paramFlutterPluginBinding.setMethodCallHandler(this);
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    a = null;
    b.setMethodCallHandler(null);
    b = null;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    ??? = method;
    ???.getClass();
    int i = ((String)???).hashCode();
    int j = 1;
    int k = 1;
    boolean bool1 = false;
    switch (i)
    {
    default: 
      break;
    case 1863829223: 
      if (((String)???).equals("getDatabasesPath")) {
        i = 15;
      }
      break;
    case 1385449135: 
      if (((String)???).equals("getPlatformVersion")) {
        i = 14;
      }
      break;
    case 1193546321: 
      if (((String)???).equals("queryCursorNext")) {
        i = 13;
      }
      break;
    case 956410295: 
      if (((String)???).equals("databaseExists")) {
        i = 12;
      }
      break;
    case 107944136: 
      if (((String)???).equals("query")) {
        i = 11;
      }
      break;
    case 95458899: 
      if (((String)???).equals("debug")) {
        i = 10;
      }
      break;
    case 93509434: 
      if (((String)???).equals("batch")) {
        i = 9;
      }
      break;
    case -17190427: 
      if (((String)???).equals("openDatabase")) {
        i = 8;
      }
      break;
    case -198450538: 
      if (((String)???).equals("debugMode")) {
        i = 7;
      }
      break;
    case -263511994: 
      if (((String)???).equals("deleteDatabase")) {
        i = 6;
      }
      break;
    case -396289107: 
      if (((String)???).equals("androidSetLocale")) {
        i = 5;
      }
      break;
    case -838846263: 
      if (((String)???).equals("update")) {
        i = 4;
      }
      break;
    case -1183792455: 
      if (((String)???).equals("insert")) {
        i = 3;
      }
      break;
    case -1249474914: 
      if (((String)???).equals("options")) {
        i = 2;
      }
      break;
    case -1253581933: 
      if (((String)???).equals("closeDatabase")) {
        i = 1;
      }
      break;
    case -1319569547: 
      if (((String)???).equals("execute")) {
        i = 0;
      }
      break;
    }
    i = -1;
    Object localObject2 = null;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 15: 
      if (p == null) {
        p = a.getDatabasePath("tekartik_sqflite.db").getParent();
      }
      paramResult.success(p);
      break;
    case 14: 
      paramMethodCall = f.l("Android ");
      paramMethodCall.append(Build.VERSION.RELEASE);
      paramResult.success(paramMethodCall.toString());
      break;
    case 13: 
      ??? = b(paramMethodCall, paramResult);
      if (??? != null) {
        t.a((d)???, new x0(paramMethodCall, paramResult, ???, 8));
      }
      break;
    case 12: 
      paramMethodCall = (String)paramMethodCall.argument("path");
    }
    try
    {
      ??? = new java/io/File;
      ((File)???).<init>(paramMethodCall);
      bool2 = ((File)???).exists();
      paramResult.success(Boolean.valueOf(bool2));
      break label2525;
      ??? = b(paramMethodCall, paramResult);
      if (??? != null)
      {
        t.a((d)???, new m(paramMethodCall, paramResult, (d)???, 1));
        break label2525;
        ??? = (String)paramMethodCall.argument("cmd");
        paramMethodCall = new HashMap();
        Object localObject4;
        if ("get".equals(???))
        {
          i = o;
          if (i > 0) {
            paramMethodCall.put("logLevel", Integer.valueOf(i));
          }
          localObject2 = d;
          if (!((HashMap)localObject2).isEmpty())
          {
            ??? = new HashMap();
            ??? = ((HashMap)localObject2).entrySet().iterator();
            while (((Iterator)???).hasNext())
            {
              localObject2 = (Map.Entry)((Iterator)???).next();
              localObject4 = (d)((Map.Entry)localObject2).getValue();
              ??? = new HashMap();
              ((HashMap)???).put("path", b);
              ((HashMap)???).put("singleInstance", Boolean.valueOf(a));
              i = d;
              if (i > 0) {
                ((HashMap)???).put("logLevel", Integer.valueOf(i));
              }
              ((HashMap)???).put(((Integer)((Map.Entry)localObject2).getKey()).toString(), ???);
            }
            paramMethodCall.put("databases", ???);
          }
        }
        paramResult.success(paramMethodCall);
        break label2525;
        ??? = b(paramMethodCall, paramResult);
        if (??? != null)
        {
          t.a((d)???, new o((d)???, paramMethodCall, paramResult));
          break label2525;
          ??? = (String)paramMethodCall.argument("path");
          localObject4 = (Boolean)paramMethodCall.argument("readOnly");
          if ((??? != null) && (!((String)???).equals(":memory:"))) {
            bool2 = false;
          } else {
            bool2 = true;
          }
          if ((!Boolean.FALSE.equals(paramMethodCall.argument("singleInstance"))) && (!bool2)) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          if (bool1) {
            synchronized (e)
            {
              if (m0.O(o))
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append("Look for ");
                ((StringBuilder)localObject2).append((String)???);
                ((StringBuilder)localObject2).append(" in ");
                ((StringBuilder)localObject2).append(c.keySet());
                Log.d("Sqflite", ((StringBuilder)localObject2).toString());
              }
              ??? = (Integer)c.get(???);
              if (??? != null)
              {
                localObject2 = (d)d.get(???);
                if (localObject2 != null) {
                  if (!i.isOpen())
                  {
                    if (m0.O(o))
                    {
                      ??? = new java/lang/StringBuilder;
                      ((StringBuilder)???).<init>();
                      ((StringBuilder)???).append(((d)localObject2).h());
                      ((StringBuilder)???).append("single instance database of ");
                      ((StringBuilder)???).append((String)???);
                      ((StringBuilder)???).append(" not opened");
                      Log.d("Sqflite", ((StringBuilder)???).toString());
                    }
                  }
                  else
                  {
                    if (m0.O(o))
                    {
                      localObject4 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject4).<init>();
                      ((StringBuilder)localObject4).append(((d)localObject2).h());
                      ((StringBuilder)localObject4).append("re-opened single instance ");
                      if (((d)localObject2).j()) {
                        paramMethodCall = "(in transaction) ";
                      } else {
                        paramMethodCall = "";
                      }
                      ((StringBuilder)localObject4).append(paramMethodCall);
                      ((StringBuilder)localObject4).append(???);
                      ((StringBuilder)localObject4).append(" ");
                      ((StringBuilder)localObject4).append((String)???);
                      Log.d("Sqflite", ((StringBuilder)localObject4).toString());
                    }
                    paramResult.success(c(((Integer)???).intValue(), true, ((d)localObject2).j()));
                    break label2525;
                  }
                }
              }
            }
          }
          Object localObject6;
          synchronized (e)
          {
            j = s + 1;
            s = j;
            ??? = new d(a, (String)???, j, bool1, o);
            try
            {
              if (t == null)
              {
                int m = r;
                i = q;
                if (m == 1)
                {
                  localObject2 = new va/k;
                  ((k)localObject2).<init>(i);
                }
                else
                {
                  localObject2 = new j(m, i);
                }
                t = (i)localObject2;
                ((i)localObject2).start();
                localObject2 = ???;
                if (d >= 1) {
                  i = 1;
                } else {
                  i = 0;
                }
                if (i != 0)
                {
                  localObject6 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject6).<init>();
                  ((StringBuilder)localObject6).append(((d)localObject2).h());
                  ((StringBuilder)localObject6).append("starting worker pool with priority ");
                  ((StringBuilder)localObject6).append(q);
                  Log.d("Sqflite", ((StringBuilder)localObject6).toString());
                }
              }
              h = t;
              if (d >= 1) {
                i = k;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append(((d)???).h());
                ((StringBuilder)localObject2).append("opened ");
                ((StringBuilder)localObject2).append(j);
                ((StringBuilder)localObject2).append(" ");
                ((StringBuilder)localObject2).append((String)???);
                Log.d("Sqflite", ((StringBuilder)localObject2).toString());
              }
              localObject6 = t;
              localObject2 = new va/p;
              ((p)localObject2).<init>(bool2, (String)???, paramResult, (Boolean)localObject4, (d)???, paramMethodCall, bool1, j);
              ((i)localObject6).a((d)???, (Runnable)localObject2);
            }
            finally {}
          }
          paramMethodCall = paramMethodCall.arguments();
          bool2 = Boolean.TRUE.equals(paramMethodCall);
          if (bool2)
          {
            if (bool2) {
              o = 1;
            }
          }
          else {
            o = 0;
          }
          paramResult.success(null);
          break label2525;
          localObject4 = (String)paramMethodCall.argument("path");
          synchronized (e)
          {
            if (m0.O(o))
            {
              paramMethodCall = new java/lang/StringBuilder;
              paramMethodCall.<init>();
              paramMethodCall.append("Look for ");
              paramMethodCall.append((String)localObject4);
              paramMethodCall.append(" in ");
              paramMethodCall.append(c.keySet());
              Log.d("Sqflite", paramMethodCall.toString());
            }
            HashMap localHashMap = c;
            ??? = (Integer)localHashMap.get(localObject4);
            paramMethodCall = (MethodCall)localObject2;
            if (??? != null)
            {
              localObject6 = d;
              ??? = (d)((HashMap)localObject6).get(???);
              paramMethodCall = (MethodCall)localObject2;
              if (??? != null)
              {
                paramMethodCall = (MethodCall)localObject2;
                if (i.isOpen())
                {
                  if (m0.O(o))
                  {
                    localObject2 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject2).<init>();
                    ((StringBuilder)localObject2).append(((d)???).h());
                    ((StringBuilder)localObject2).append("found single instance ");
                    if (((d)???).j()) {
                      paramMethodCall = "(in transaction) ";
                    } else {
                      paramMethodCall = "";
                    }
                    ((StringBuilder)localObject2).append(paramMethodCall);
                    ((StringBuilder)localObject2).append(???);
                    ((StringBuilder)localObject2).append(" ");
                    ((StringBuilder)localObject2).append((String)localObject4);
                    Log.d("Sqflite", ((StringBuilder)localObject2).toString());
                  }
                  ((HashMap)localObject6).remove(???);
                  localHashMap.remove(localObject4);
                  paramMethodCall = (MethodCall)???;
                }
              }
            }
            paramResult = new r(this, paramMethodCall, (String)localObject4, paramResult);
            ??? = t;
            if (??? != null) {
              ((i)???).a(paramMethodCall, paramResult);
            } else {
              paramResult.run();
            }
          }
          ??? = b(paramMethodCall, paramResult);
          if (??? != null)
          {
            t.a((d)???, new n(paramMethodCall, (d)???, paramResult));
            break label2525;
            ??? = b(paramMethodCall, paramResult);
            if (??? != null)
            {
              t.a((d)???, new n(paramMethodCall, paramResult, (d)???));
              break label2525;
              ??? = b(paramMethodCall, paramResult);
              if (??? != null)
              {
                t.a((d)???, new m(paramMethodCall, paramResult, (d)???, 0));
                break label2525;
                ??? = paramMethodCall.argument("androidThreadPriority");
                if (??? != null) {
                  q = ((Integer)???).intValue();
                }
                ??? = paramMethodCall.argument("androidThreadCount");
                if ((??? != null) && (!???.equals(Integer.valueOf(r))))
                {
                  r = ((Integer)???).intValue();
                  ??? = t;
                  if (??? != null)
                  {
                    ((i)???).b();
                    t = null;
                  }
                }
                paramMethodCall = (Integer)paramMethodCall.argument("logLevel");
                if (paramMethodCall != null) {
                  o = paramMethodCall.intValue();
                }
                paramResult.success(null);
                break label2525;
                k = ((Integer)paramMethodCall.argument("id")).intValue();
                paramMethodCall = b(paramMethodCall, paramResult);
                if (paramMethodCall != null)
                {
                  if (d >= 1) {
                    i = j;
                  } else {
                    i = 0;
                  }
                  if (i != 0)
                  {
                    ??? = new StringBuilder();
                    ((StringBuilder)???).append(paramMethodCall.h());
                    ((StringBuilder)???).append("closing ");
                    ((StringBuilder)???).append(k);
                    ((StringBuilder)???).append(" ");
                    ((StringBuilder)???).append(b);
                    Log.d("Sqflite", ((StringBuilder)???).toString());
                  }
                  localObject2 = b;
                  synchronized (e)
                  {
                    d.remove(Integer.valueOf(k));
                    if (a) {
                      c.remove(localObject2);
                    }
                    t.a(paramMethodCall, new q(this, paramMethodCall, paramResult));
                  }
                  ??? = b(paramMethodCall, paramResult);
                  if (??? != null) {
                    t.a((d)???, new o(paramMethodCall, paramResult, (d)???));
                  }
                }
              }
            }
          }
        }
      }
      label2525:
      return;
    }
    catch (Exception paramMethodCall)
    {
      for (;;)
      {
        boolean bool2 = bool1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     va.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */