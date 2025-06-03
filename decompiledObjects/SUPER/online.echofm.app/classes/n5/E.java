package n5;

import A5.a.b;
import E5.c;
import E5.j;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class E
  implements A5.a, k.c
{
  public static final Map c = new HashMap();
  public static final Map d = new HashMap();
  public static final Object e = new Object();
  public static final Object f = new Object();
  public static int g = 0;
  public static String h;
  public static int i = 0;
  public static int j = 1;
  public static int k = 0;
  public static q l;
  public Context a;
  public E5.k b;
  
  public static boolean o(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (!paramString.equals(":memory:"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Map x(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
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
  
  public final void A(j arg1, final k.d paramd)
  {
    Integer localInteger = (Integer)???.a("id");
    int m = localInteger.intValue();
    final k localk = n(???, paramd);
    if (localk == null) {
      return;
    }
    if (t.b(d))
    {
      ??? = new StringBuilder();
      ???.append(localk.A());
      ???.append("closing ");
      ???.append(m);
      ???.append(" ");
      ???.append(b);
      Log.d("Sqflite", ???.toString());
    }
    String str = b;
    synchronized (e)
    {
      d.remove(localInteger);
      if (a) {
        c.remove(str);
      }
    }
    l.b(localk, new a(localk, paramd));
  }
  
  public final void B(j paramj, k.d paramd)
  {
    paramd.a(Boolean.valueOf(k.x((String)paramj.a("path"))));
  }
  
  public final void C(j paramj, k.d paramd)
  {
    Object localObject1 = (String)paramj.a("cmd");
    paramj = new HashMap();
    if ("get".equals(localObject1))
    {
      int m = g;
      if (m > 0) {
        paramj.put("logLevel", Integer.valueOf(m));
      }
      Object localObject2 = d;
      if (!((Map)localObject2).isEmpty())
      {
        localObject1 = new HashMap();
        Iterator localIterator = ((Map)localObject2).entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          k localk = (k)localEntry.getValue();
          localObject2 = new HashMap();
          ((Map)localObject2).put("path", b);
          ((Map)localObject2).put("singleInstance", Boolean.valueOf(a));
          m = d;
          if (m > 0) {
            ((Map)localObject2).put("logLevel", Integer.valueOf(m));
          }
          ((Map)localObject1).put(((Integer)localEntry.getKey()).toString(), localObject2);
        }
        paramj.put("databases", localObject1);
      }
    }
    paramd.a(paramj);
  }
  
  public final void D(j paramj, k.d paramd)
  {
    paramj = paramj.b();
    o5.a.a = Boolean.TRUE.equals(paramj);
    boolean bool;
    if ((o5.a.b) && (o5.a.a)) {
      bool = true;
    } else {
      bool = false;
    }
    o5.a.c = bool;
    if (o5.a.a)
    {
      if (o5.a.c) {
        g = 2;
      } else if (o5.a.a) {
        g = 1;
      }
    }
    else {
      g = 0;
    }
    paramd.a(null);
  }
  
  public final void E(final j paramj, final k.d paramd)
  {
    final String str = (String)paramj.a("path");
    synchronized (e)
    {
      if (t.c(g))
      {
        paramj = new java/lang/StringBuilder;
        paramj.<init>();
        paramj.append("Look for ");
        paramj.append(str);
        paramj.append(" in ");
        paramj.append(c.keySet());
        Log.d("Sqflite", paramj.toString());
      }
    }
    Map localMap1 = c;
    Integer localInteger = (Integer)localMap1.get(str);
    if (localInteger != null)
    {
      Map localMap2 = d;
      localObject2 = (k)localMap2.get(localInteger);
      if ((localObject2 != null) && (i.isOpen()))
      {
        if (t.c(g))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(((k)localObject2).A());
          localStringBuilder.append("found single instance ");
          if (((k)localObject2).F()) {
            paramj = "(in transaction) ";
          } else {
            paramj = "";
          }
          localStringBuilder.append(paramj);
          localStringBuilder.append(localInteger);
          localStringBuilder.append(" ");
          localStringBuilder.append(str);
          Log.d("Sqflite", localStringBuilder.toString());
        }
        localMap2.remove(localInteger);
        localMap1.remove(str);
        paramj = (j)localObject2;
        break label272;
      }
    }
    paramj = null;
    label272:
    Object localObject2 = new b(paramj, str, paramd);
    paramd = l;
    if (paramd != null) {
      paramd.b(paramj, (Runnable)localObject2);
    } else {
      ((Runnable)localObject2).run();
    }
  }
  
  public final void F(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new B(paramj, paramd, localk));
  }
  
  public void G(j paramj, k.d paramd)
  {
    if (h == null) {
      h = a.getDatabasePath("tekartik_sqflite.db").getParent();
    }
    paramd.a(h);
  }
  
  public final void H(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new x(paramj, paramd, localk));
  }
  
  public final void I(j paramj, k.d paramd)
  {
    String str = (String)paramj.a("path");
    Object localObject1 = (Boolean)paramj.a("readOnly");
    boolean bool1 = o(str);
    boolean bool2;
    if ((!Boolean.FALSE.equals(paramj.a("singleInstance"))) && (!bool1)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Object localObject3;
    Object localObject4;
    if (bool2)
    {
      synchronized (e)
      {
        if (t.c(g))
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Look for ");
          ((StringBuilder)localObject3).append(str);
          ((StringBuilder)localObject3).append(" in ");
          ((StringBuilder)localObject3).append(c.keySet());
          Log.d("Sqflite", ((StringBuilder)localObject3).toString());
        }
      }
      localObject4 = (Integer)c.get(str);
      if (localObject4 != null)
      {
        localObject3 = (k)d.get(localObject4);
        if (localObject3 != null)
        {
          if (i.isOpen()) {
            break label267;
          }
          if (t.c(g))
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append(((k)localObject3).A());
            ((StringBuilder)localObject4).append("single instance database of ");
            ((StringBuilder)localObject4).append(str);
            ((StringBuilder)localObject4).append(" not opened");
            Log.d("Sqflite", ((StringBuilder)localObject4).toString());
          }
        }
      }
      break label390;
      label267:
      if (t.c(g))
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(((k)localObject3).A());
        ((StringBuilder)localObject1).append("re-opened single instance ");
        if (((k)localObject3).F()) {
          paramj = "(in transaction) ";
        } else {
          paramj = "";
        }
        ((StringBuilder)localObject1).append(paramj);
        ((StringBuilder)localObject1).append(localObject4);
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append(str);
        Log.d("Sqflite", ((StringBuilder)localObject1).toString());
      }
      paramd.a(x(((Integer)localObject4).intValue(), true, ((k)localObject3).F()));
      return;
      label390:
      break label401;
      throw paramj;
    }
    synchronized (e)
    {
      label401:
      int m = k + 1;
      k = m;
      localObject3 = new k(a, str, m, bool2, g);
      try
      {
        if (l == null)
        {
          localObject4 = p.b("Sqflite", j, i);
          l = (q)localObject4;
          ((q)localObject4).start();
          if (t.b(d))
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append(((k)localObject3).A());
            ((StringBuilder)localObject4).append("starting worker pool with priority ");
            ((StringBuilder)localObject4).append(i);
            Log.d("Sqflite", ((StringBuilder)localObject4).toString());
          }
        }
      }
      finally
      {
        break label672;
      }
      h = l;
      if (t.b(d))
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append(((k)localObject3).A());
        ((StringBuilder)localObject4).append("opened ");
        ((StringBuilder)localObject4).append(m);
        ((StringBuilder)localObject4).append(" ");
        ((StringBuilder)localObject4).append(str);
        Log.d("Sqflite", ((StringBuilder)localObject4).toString());
      }
      q localq = l;
      localObject4 = new n5/A;
      ((A)localObject4).<init>(bool1, str, paramd, (Boolean)localObject1, (k)localObject3, paramj, bool2, m);
      localq.b((k)localObject3, (Runnable)localObject4);
      return;
      label672:
      throw paramj;
    }
  }
  
  public void J(j paramj, k.d paramd)
  {
    Object localObject = paramj.a("androidThreadPriority");
    if (localObject != null) {
      i = ((Integer)localObject).intValue();
    }
    localObject = paramj.a("androidThreadCount");
    if ((localObject != null) && (!localObject.equals(Integer.valueOf(j))))
    {
      j = ((Integer)localObject).intValue();
      localObject = l;
      if (localObject != null)
      {
        ((q)localObject).a();
        l = null;
      }
    }
    paramj = t.a(paramj);
    if (paramj != null) {
      g = paramj.intValue();
    }
    paramd.a(null);
  }
  
  public final void K(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new y(paramj, paramd, localk));
  }
  
  public final void L(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new w(paramj, paramd, localk));
  }
  
  public final void M(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new z(paramj, localk, paramd));
  }
  
  public final void N(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new C(paramj, paramd, localk));
  }
  
  public final void l(k paramk)
  {
    try
    {
      if (t.b(d))
      {
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>();
        ((StringBuilder)???).append(paramk.A());
        ((StringBuilder)???).append("closing database ");
        Log.d("Sqflite", ((StringBuilder)???).toString());
      }
    }
    catch (Exception localException)
    {
      break label59;
    }
    paramk.k();
    break label107;
    label59:
    ??? = new StringBuilder();
    ((StringBuilder)???).append("error ");
    ((StringBuilder)???).append(localException);
    ((StringBuilder)???).append(" while closing database ");
    ((StringBuilder)???).append(k);
    Log.e("Sqflite", ((StringBuilder)???).toString());
    synchronized (e)
    {
      label107:
      if ((!d.isEmpty()) || (l == null)) {
        break label194;
      }
      if (t.b(d))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(paramk.A());
        localStringBuilder.append("stopping thread");
        Log.d("Sqflite", localStringBuilder.toString());
      }
    }
    l.a();
    l = null;
    label194:
  }
  
  public final k m(int paramInt)
  {
    return (k)d.get(Integer.valueOf(paramInt));
  }
  
  public final k n(j paramj, k.d paramd)
  {
    int m = ((Integer)paramj.a("id")).intValue();
    paramj = m(m);
    if (paramj != null) {
      return paramj;
    }
    paramj = new StringBuilder();
    paramj.append("database_closed ");
    paramj.append(m);
    paramd.b("sqlite_error", paramj.toString(), null);
    return null;
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    y(paramb.a(), paramb.b());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    a = null;
    b.e(null);
    b = null;
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    String str = a;
    str.hashCode();
    int m = str.hashCode();
    int n = -1;
    switch (m)
    {
    default: 
      break;
    case 1863829223: 
      if (str.equals("getDatabasesPath")) {
        n = 15;
      }
      break;
    case 1385449135: 
      if (str.equals("getPlatformVersion")) {
        n = 14;
      }
      break;
    case 1193546321: 
      if (str.equals("queryCursorNext")) {
        n = 13;
      }
      break;
    case 956410295: 
      if (str.equals("databaseExists")) {
        n = 12;
      }
      break;
    case 107944136: 
      if (str.equals("query")) {
        n = 11;
      }
      break;
    case 95458899: 
      if (str.equals("debug")) {
        n = 10;
      }
      break;
    case 93509434: 
      if (str.equals("batch")) {
        n = 9;
      }
      break;
    case -17190427: 
      if (str.equals("openDatabase")) {
        n = 8;
      }
      break;
    case -198450538: 
      if (str.equals("debugMode")) {
        n = 7;
      }
      break;
    case -263511994: 
      if (str.equals("deleteDatabase")) {
        n = 6;
      }
      break;
    case -396289107: 
      if (str.equals("androidSetLocale")) {
        n = 5;
      }
      break;
    case -838846263: 
      if (str.equals("update")) {
        n = 4;
      }
      break;
    case -1183792455: 
      if (str.equals("insert")) {
        n = 3;
      }
      break;
    case -1249474914: 
      if (str.equals("options")) {
        n = 2;
      }
      break;
    case -1253581933: 
      if (str.equals("closeDatabase")) {
        n = 1;
      }
      break;
    case -1319569547: 
      if (str.equals("execute")) {
        n = 0;
      }
      break;
    }
    switch (n)
    {
    default: 
      paramd.c();
      break;
    case 15: 
      G(paramj, paramd);
      break;
    case 14: 
      paramj = new StringBuilder();
      paramj.append("Android ");
      paramj.append(Build.VERSION.RELEASE);
      paramd.a(paramj.toString());
      break;
    case 13: 
      L(paramj, paramd);
      break;
    case 12: 
      B(paramj, paramd);
      break;
    case 11: 
      K(paramj, paramd);
      break;
    case 10: 
      C(paramj, paramd);
      break;
    case 9: 
      z(paramj, paramd);
      break;
    case 8: 
      I(paramj, paramd);
      break;
    case 7: 
      D(paramj, paramd);
      break;
    case 6: 
      E(paramj, paramd);
      break;
    case 5: 
      M(paramj, paramd);
      break;
    case 4: 
      N(paramj, paramd);
      break;
    case 3: 
      H(paramj, paramd);
      break;
    case 2: 
      J(paramj, paramd);
      break;
    case 1: 
      A(paramj, paramd);
      break;
    case 0: 
      F(paramj, paramd);
    }
  }
  
  public final void y(Context paramContext, c paramc)
  {
    a = paramContext;
    paramContext = new E5.k(paramc, "com.tekartik.sqflite", E5.q.b, paramc.b());
    b = paramContext;
    paramContext.e(this);
  }
  
  public final void z(j paramj, k.d paramd)
  {
    k localk = n(paramj, paramd);
    if (localk == null) {
      return;
    }
    l.b(localk, new D(localk, paramj, paramd));
  }
  
  public class a
    implements Runnable
  {
    public a(k paramk, k.d paramd) {}
    
    public void run()
    {
      synchronized ()
      {
        E.j(E.this, localk);
        paramd.a(null);
        return;
      }
    }
  }
  
  public class b
    implements Runnable
  {
    public b(k paramk, String paramString, k.d paramd) {}
    
    public void run()
    {
      synchronized ()
      {
        k localk = paramj;
        if (localk != null) {
          E.j(E.this, localk);
        }
      }
      try
      {
        if (t.c(E.g))
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("delete database ");
          localStringBuilder.append(str);
          Log.d("Sqflite", localStringBuilder.toString());
        }
      }
      catch (Exception localException)
      {
        break label90;
      }
      k.o(str);
      break label136;
      label90:
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("error ");
      localStringBuilder.append(localException);
      localStringBuilder.append(" while closing database ");
      localStringBuilder.append(E.k());
      Log.e("Sqflite", localStringBuilder.toString());
      label136:
      paramd.a(null);
    }
  }
}

/* Location:
 * Qualified Name:     n5.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */