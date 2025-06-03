package w5;

import E5.c.a;
import E5.c.b;
import E5.c.c;
import E5.c.d;
import E5.r;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import t5.b;
import y5.f;

public class a
  implements E5.c
{
  public final FlutterJNI a;
  public final AssetManager b;
  public final c c;
  public final E5.c d;
  public boolean e = false;
  public String f;
  public final c.a g;
  
  public a(FlutterJNI paramFlutterJNI, AssetManager paramAssetManager)
  {
    a locala = new a();
    g = locala;
    a = paramFlutterJNI;
    b = paramAssetManager;
    paramAssetManager = new c(paramFlutterJNI);
    c = paramAssetManager;
    paramAssetManager.c("flutter/isolate", locala);
    d = new d(paramAssetManager, null);
    if (paramFlutterJNI.isAttached()) {
      e = true;
    }
  }
  
  public c.c a(c.d paramd)
  {
    return d.a(paramd);
  }
  
  public void c(String paramString, c.a parama)
  {
    d.c(paramString, parama);
  }
  
  public void d(String paramString, ByteBuffer paramByteBuffer)
  {
    d.d(paramString, paramByteBuffer);
  }
  
  public void f(String paramString, ByteBuffer paramByteBuffer, c.b paramb)
  {
    d.f(paramString, paramByteBuffer, paramb);
  }
  
  public void h(String paramString, c.a parama, c.c paramc)
  {
    d.h(paramString, parama, paramc);
  }
  
  /* Error */
  public void i(b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	w5/a:e	Z
    //   4: ifeq +11 -> 15
    //   7: ldc 102
    //   9: ldc 104
    //   11: invokestatic 109	t5/b:g	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: return
    //   15: ldc 111
    //   17: invokestatic 116	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   20: astore_2
    //   21: new 118	java/lang/StringBuilder
    //   24: astore_3
    //   25: aload_3
    //   26: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   29: aload_3
    //   30: ldc 121
    //   32: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_3
    //   37: aload_1
    //   38: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: ldc 102
    //   44: aload_3
    //   45: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 134	t5/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: aload_0
    //   52: getfield 44	w5/a:a	Lio/flutter/embedding/engine/FlutterJNI;
    //   55: astore_3
    //   56: aload_1
    //   57: getfield 136	w5/a$b:b	Ljava/lang/String;
    //   60: astore 4
    //   62: aload_1
    //   63: getfield 139	w5/a$b:c	Lio/flutter/view/FlutterCallbackInformation;
    //   66: astore 5
    //   68: aload_3
    //   69: aload 4
    //   71: aload 5
    //   73: getfield 144	io/flutter/view/FlutterCallbackInformation:callbackName	Ljava/lang/String;
    //   76: aload 5
    //   78: getfield 147	io/flutter/view/FlutterCallbackInformation:callbackLibraryPath	Ljava/lang/String;
    //   81: aload_1
    //   82: getfield 149	w5/a$b:a	Landroid/content/res/AssetManager;
    //   85: aconst_null
    //   86: invokevirtual 153	io/flutter/embedding/engine/FlutterJNI:runBundleAndSnapshotFromLibrary	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V
    //   89: aload_0
    //   90: iconst_1
    //   91: putfield 37	w5/a:e	Z
    //   94: aload_2
    //   95: ifnull +7 -> 102
    //   98: aload_2
    //   99: invokevirtual 156	T5/f:close	()V
    //   102: return
    //   103: astore_1
    //   104: aload_2
    //   105: ifnull +16 -> 121
    //   108: aload_2
    //   109: invokevirtual 156	T5/f:close	()V
    //   112: goto +9 -> 121
    //   115: astore_2
    //   116: aload_1
    //   117: aload_2
    //   118: invokevirtual 162	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   121: aload_1
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	a
    //   0	123	1	paramb	b
    //   20	89	2	localf	T5.f
    //   115	3	2	localThrowable	Throwable
    //   24	45	3	localObject	Object
    //   60	10	4	str	String
    //   66	11	5	localFlutterCallbackInformation	FlutterCallbackInformation
    // Exception table:
    //   from	to	target	type
    //   21	94	103	finally
    //   108	112	115	finally
  }
  
  public void j(c paramc)
  {
    k(paramc, null);
  }
  
  /* Error */
  public void k(c paramc, java.util.List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	w5/a:e	Z
    //   4: ifeq +11 -> 15
    //   7: ldc 102
    //   9: ldc 104
    //   11: invokestatic 109	t5/b:g	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: return
    //   15: ldc -86
    //   17: invokestatic 116	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   20: astore_3
    //   21: new 118	java/lang/StringBuilder
    //   24: astore 4
    //   26: aload 4
    //   28: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   31: aload 4
    //   33: ldc -84
    //   35: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload 4
    //   41: aload_1
    //   42: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: ldc 102
    //   48: aload 4
    //   50: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 134	t5/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_0
    //   57: getfield 44	w5/a:a	Lio/flutter/embedding/engine/FlutterJNI;
    //   60: aload_1
    //   61: getfield 174	w5/a$c:a	Ljava/lang/String;
    //   64: aload_1
    //   65: getfield 176	w5/a$c:c	Ljava/lang/String;
    //   68: aload_1
    //   69: getfield 177	w5/a$c:b	Ljava/lang/String;
    //   72: aload_0
    //   73: getfield 46	w5/a:b	Landroid/content/res/AssetManager;
    //   76: aload_2
    //   77: invokevirtual 153	io/flutter/embedding/engine/FlutterJNI:runBundleAndSnapshotFromLibrary	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V
    //   80: aload_0
    //   81: iconst_1
    //   82: putfield 37	w5/a:e	Z
    //   85: aload_3
    //   86: ifnull +7 -> 93
    //   89: aload_3
    //   90: invokevirtual 156	T5/f:close	()V
    //   93: return
    //   94: astore_1
    //   95: aload_3
    //   96: ifnull +16 -> 112
    //   99: aload_3
    //   100: invokevirtual 156	T5/f:close	()V
    //   103: goto +9 -> 112
    //   106: astore_2
    //   107: aload_1
    //   108: aload_2
    //   109: invokevirtual 162	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   112: aload_1
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	a
    //   0	114	1	paramc	c
    //   0	114	2	paramList	java.util.List
    //   20	80	3	localf	T5.f
    //   24	25	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   21	85	94	finally
    //   99	103	106	finally
  }
  
  public boolean l()
  {
    return e;
  }
  
  public void m()
  {
    if (a.isAttached()) {
      a.notifyLowMemoryWarning();
    }
  }
  
  public void n()
  {
    b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
    a.setPlatformMessageHandler(c);
  }
  
  public void o()
  {
    b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
    a.setPlatformMessageHandler(null);
  }
  
  public class a
    implements c.a
  {
    public a() {}
    
    public void a(ByteBuffer paramByteBuffer, c.b paramb)
    {
      a.e(a.this, r.b.c(paramByteBuffer));
      a.g(a.this);
    }
  }
  
  public static class b
  {
    public final AssetManager a;
    public final String b;
    public final FlutterCallbackInformation c;
    
    public b(AssetManager paramAssetManager, String paramString, FlutterCallbackInformation paramFlutterCallbackInformation)
    {
      a = paramAssetManager;
      b = paramString;
      c = paramFlutterCallbackInformation;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("DartCallback( bundle path: ");
      localStringBuilder.append(b);
      localStringBuilder.append(", library path: ");
      localStringBuilder.append(c.callbackLibraryPath);
      localStringBuilder.append(", function: ");
      localStringBuilder.append(c.callbackName);
      localStringBuilder.append(" )");
      return localStringBuilder.toString();
    }
  }
  
  public static class c
  {
    public final String a;
    public final String b;
    public final String c;
    
    public c(String paramString1, String paramString2)
    {
      a = paramString1;
      b = null;
      c = paramString2;
    }
    
    public c(String paramString1, String paramString2, String paramString3)
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
    }
    
    public static c a()
    {
      f localf = t5.a.e().c();
      if (localf.l()) {
        return new c(localf.j(), "main");
      }
      throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (c)paramObject;
        if (!a.equals(a)) {
          return false;
        }
        return c.equals(c);
      }
      return false;
    }
    
    public int hashCode()
    {
      return a.hashCode() * 31 + c.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("DartEntrypoint( bundle path: ");
      localStringBuilder.append(a);
      localStringBuilder.append(", function: ");
      localStringBuilder.append(c);
      localStringBuilder.append(" )");
      return localStringBuilder.toString();
    }
  }
  
  public static class d
    implements E5.c
  {
    public final c a;
    
    public d(c paramc)
    {
      a = paramc;
    }
    
    public c.c a(c.d paramd)
    {
      return a.a(paramd);
    }
    
    public void c(String paramString, c.a parama)
    {
      a.c(paramString, parama);
    }
    
    public void d(String paramString, ByteBuffer paramByteBuffer)
    {
      a.f(paramString, paramByteBuffer, null);
    }
    
    public void f(String paramString, ByteBuffer paramByteBuffer, c.b paramb)
    {
      a.f(paramString, paramByteBuffer, paramb);
    }
    
    public void h(String paramString, c.a parama, c.c paramc)
    {
      a.h(paramString, parama, paramc);
    }
  }
  
  public static abstract interface e {}
}

/* Location:
 * Qualified Name:     w5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */