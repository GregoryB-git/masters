package A4;

import L4.k;
import M4.f;
import M4.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s3.m;

public class e
{
  public static final F4.a i = ;
  public final Map a = new ConcurrentHashMap();
  public final C4.a b;
  public final f c;
  public Boolean d = null;
  public final s3.e e;
  public final r4.b f;
  public final s4.i g;
  public final r4.b h;
  
  public e(s3.e parame, r4.b paramb1, s4.i parami, r4.b paramb2, RemoteConfigManager paramRemoteConfigManager, C4.a parama, SessionManager paramSessionManager)
  {
    e = parame;
    f = paramb1;
    g = parami;
    h = paramb2;
    if (parame == null)
    {
      d = Boolean.FALSE;
      b = parama;
      c = new f(new Bundle());
      return;
    }
    k.l().s(parame, parami, paramb2);
    parami = parame.m();
    paramb2 = a(parami);
    c = paramb2;
    paramRemoteConfigManager.setFirebaseRemoteConfigProvider(paramb1);
    b = parama;
    parama.R(paramb2);
    parama.P(parami);
    paramSessionManager.setApplicationContext(parami);
    d = parama.j();
    paramb1 = i;
    if ((paramb1.h()) && (d())) {
      paramb1.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[] { F4.b.b(parame.r().g(), parami.getPackageName()) }));
    }
  }
  
  public static f a(Context paramContext)
  {
    try
    {
      paramContext = getPackageManagergetApplicationInfogetPackageName128metaData;
    }
    catch (NullPointerException paramContext) {}catch (PackageManager.NameNotFoundException paramContext) {}
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No perf enable meta data found ");
    ((StringBuilder)localObject).append(paramContext.getMessage());
    Log.d("isEnabled", ((StringBuilder)localObject).toString());
    paramContext = null;
    localObject = new M4/f;
    if (paramContext != null) {
      ((f)localObject).<init>(paramContext);
    } else {
      ((f)localObject).<init>();
    }
    return (f)localObject;
  }
  
  public static e c()
  {
    return (e)s3.e.o().k(e.class);
  }
  
  public Map b()
  {
    return new HashMap(a);
  }
  
  public boolean d()
  {
    Boolean localBoolean = d;
    boolean bool;
    if (localBoolean != null) {
      bool = localBoolean.booleanValue();
    } else {
      bool = s3.e.o().x();
    }
    return bool;
  }
  
  public G4.i e(String paramString1, String paramString2)
  {
    return new G4.i(paramString1, paramString2, k.l(), new l());
  }
  
  public Trace f(String paramString)
  {
    return Trace.h(paramString);
  }
  
  /* Error */
  public void g(Boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 196	s3/e:o	()Ls3/e;
    //   5: pop
    //   6: aload_0
    //   7: getfield 57	A4/e:b	LC4/a;
    //   10: invokevirtual 231	C4/a:i	()Ljava/lang/Boolean;
    //   13: invokevirtual 209	java/lang/Boolean:booleanValue	()Z
    //   16: ifeq +18 -> 34
    //   19: getstatic 30	A4/e:i	LF4/a;
    //   22: ldc -23
    //   24: invokevirtual 146	F4/a:f	(Ljava/lang/String;)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: goto +88 -> 119
    //   34: aload_0
    //   35: getfield 57	A4/e:b	LC4/a;
    //   38: aload_1
    //   39: invokevirtual 236	C4/a:Q	(Ljava/lang/Boolean;)V
    //   42: aload_1
    //   43: ifnull +11 -> 54
    //   46: aload_0
    //   47: aload_1
    //   48: putfield 42	A4/e:d	Ljava/lang/Boolean;
    //   51: goto +14 -> 65
    //   54: aload_0
    //   55: getfield 57	A4/e:b	LC4/a;
    //   58: invokevirtual 111	C4/a:j	()Ljava/lang/Boolean;
    //   61: astore_1
    //   62: goto -16 -> 46
    //   65: getstatic 239	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   68: aload_0
    //   69: getfield 42	A4/e:d	Ljava/lang/Boolean;
    //   72: invokevirtual 243	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   75: ifeq +18 -> 93
    //   78: getstatic 30	A4/e:i	LF4/a;
    //   81: astore_1
    //   82: ldc -11
    //   84: astore_2
    //   85: aload_1
    //   86: aload_2
    //   87: invokevirtual 146	F4/a:f	(Ljava/lang/String;)V
    //   90: goto +26 -> 116
    //   93: getstatic 55	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   96: aload_0
    //   97: getfield 42	A4/e:d	Ljava/lang/Boolean;
    //   100: invokevirtual 243	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   103: ifeq +13 -> 116
    //   106: getstatic 30	A4/e:i	LF4/a;
    //   109: astore_1
    //   110: ldc -9
    //   112: astore_2
    //   113: goto -28 -> 85
    //   116: aload_0
    //   117: monitorexit
    //   118: return
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_1
    //   122: athrow
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	e
    //   0	127	1	paramBoolean	Boolean
    //   84	29	2	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	30	finally
    //   6	27	30	finally
    //   34	42	30	finally
    //   46	51	30	finally
    //   54	62	30	finally
    //   65	82	30	finally
    //   85	90	30	finally
    //   93	110	30	finally
    //   2	6	123	java/lang/IllegalStateException
  }
}

/* Location:
 * Qualified Name:     A4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */