package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator
  implements f
{
  public final c o;
  
  public Recreator(c paramc)
  {
    o = paramc;
  }
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_CREATE)
    {
      paramh.g().c(this);
      paramh = o.k().a("androidx.savedstate.Restarter");
      if (paramh == null) {
        return;
      }
      paramh = paramh.getStringArrayList("classes_to_restore");
      if (paramh != null)
      {
        paramh = paramh.iterator();
        while (paramh.hasNext()) {
          b((String)paramh.next());
        }
        return;
      }
      throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
    throw new AssertionError("Next event must be ON_CREATE");
  }
  
  /* Error */
  public final void b(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: ldc 2
    //   4: invokevirtual 109	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   7: invokestatic 113	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   10: ldc 115
    //   12: invokevirtual 119	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   15: astore_2
    //   16: aload_2
    //   17: iconst_0
    //   18: anewarray 105	java/lang/Class
    //   21: invokevirtual 123	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   24: astore_3
    //   25: aload_3
    //   26: iconst_1
    //   27: invokevirtual 129	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray 4	java/lang/Object
    //   35: invokevirtual 135	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast 115	androidx/savedstate/SavedStateRegistry$a
    //   41: astore_2
    //   42: aload_2
    //   43: aload_0
    //   44: getfield 21	androidx/savedstate/Recreator:o	Landroidx/savedstate/c;
    //   47: invokeinterface 137 2 0
    //   52: return
    //   53: astore_2
    //   54: new 139	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   61: astore_3
    //   62: aload_3
    //   63: ldc -114
    //   65: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: aload_1
    //   71: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: new 148	java/lang/RuntimeException
    //   78: dup
    //   79: aload_3
    //   80: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: aload_2
    //   84: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   87: athrow
    //   88: astore_1
    //   89: new 139	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   96: astore_3
    //   97: aload_3
    //   98: ldc -99
    //   100: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_3
    //   105: aload_2
    //   106: invokevirtual 160	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   109: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_3
    //   114: ldc -94
    //   116: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: new 86	java/lang/IllegalStateException
    //   123: dup
    //   124: aload_3
    //   125: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: aload_1
    //   129: invokespecial 163	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: athrow
    //   133: astore_3
    //   134: new 139	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   141: astore_2
    //   142: aload_2
    //   143: ldc -91
    //   145: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_2
    //   150: aload_1
    //   151: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload_2
    //   156: ldc -89
    //   158: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: new 148	java/lang/RuntimeException
    //   165: dup
    //   166: aload_2
    //   167: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: aload_3
    //   171: invokespecial 155	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   174: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	Recreator
    //   0	175	1	paramString	String
    //   15	28	2	localObject1	Object
    //   53	53	2	localException	Exception
    //   141	26	2	localStringBuilder	StringBuilder
    //   24	101	3	localObject2	Object
    //   133	38	3	localClassNotFoundException	ClassNotFoundException
    // Exception table:
    //   from	to	target	type
    //   30	42	53	java/lang/Exception
    //   16	25	88	java/lang/NoSuchMethodException
    //   0	16	133	java/lang/ClassNotFoundException
  }
  
  public static final class a
    implements SavedStateRegistry.b
  {
    public final Set a = new HashSet();
    
    public a(SavedStateRegistry paramSavedStateRegistry)
    {
      paramSavedStateRegistry.d("androidx.savedstate.Restarter", this);
    }
    
    public Bundle a()
    {
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("classes_to_restore", new ArrayList(a));
      return localBundle;
    }
    
    public void b(String paramString)
    {
      a.add(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.Recreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */