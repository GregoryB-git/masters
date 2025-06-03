package s1;

import android.os.Bundle;
import b1.m;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class a
  implements m
{
  public final e a;
  
  public a(e parame)
  {
    a = parame;
  }
  
  /* Error */
  public final void a(b1.o paramo, b1.k.a parama)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 39	b1/k$a:ON_CREATE	Lb1/k$a;
    //   4: if_acmpne +223 -> 227
    //   7: aload_1
    //   8: invokeinterface 45 1 0
    //   13: aload_0
    //   14: invokevirtual 51	b1/k:c	(Lb1/n;)V
    //   17: aload_0
    //   18: getfield 25	s1/a:a	Ls1/e;
    //   21: invokeinterface 57 1 0
    //   26: ldc 59
    //   28: invokevirtual 64	s1/c:a	(Ljava/lang/String;)Landroid/os/Bundle;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnonnull +4 -> 37
    //   36: return
    //   37: aload_1
    //   38: ldc 66
    //   40: invokevirtual 72	android/os/Bundle:getStringArrayList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   43: astore_1
    //   44: aload_1
    //   45: ifnull +172 -> 217
    //   48: aload_1
    //   49: invokeinterface 78 1 0
    //   54: astore_3
    //   55: aload_3
    //   56: invokeinterface 84 1 0
    //   61: ifeq +155 -> 216
    //   64: aload_3
    //   65: invokeinterface 88 1 0
    //   70: checkcast 90	java/lang/String
    //   73: astore_1
    //   74: aload_1
    //   75: iconst_0
    //   76: ldc 2
    //   78: invokevirtual 96	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   81: invokestatic 100	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   84: ldc 102
    //   86: invokevirtual 106	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   89: astore_2
    //   90: aload_2
    //   91: ldc 108
    //   93: invokestatic 111	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   96: aload_2
    //   97: iconst_0
    //   98: anewarray 92	java/lang/Class
    //   101: invokevirtual 115	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   104: astore 4
    //   106: aload 4
    //   108: iconst_1
    //   109: invokevirtual 121	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   112: aload 4
    //   114: iconst_0
    //   115: anewarray 4	java/lang/Object
    //   118: invokevirtual 127	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   121: astore_2
    //   122: aload_2
    //   123: ldc -127
    //   125: invokestatic 111	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   128: aload_2
    //   129: checkcast 102	s1/c$a
    //   132: astore_2
    //   133: aload_2
    //   134: aload_0
    //   135: getfield 25	s1/a:a	Ls1/e;
    //   138: invokeinterface 131 2 0
    //   143: goto -88 -> 55
    //   146: astore_2
    //   147: new 133	java/lang/RuntimeException
    //   150: dup
    //   151: ldc -121
    //   153: aload_1
    //   154: invokestatic 140	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   157: aload_2
    //   158: invokespecial 143	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: athrow
    //   162: astore_3
    //   163: ldc -111
    //   165: invokestatic 151	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: astore_1
    //   169: aload_1
    //   170: aload_2
    //   171: invokevirtual 155	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   174: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload_1
    //   179: ldc -94
    //   181: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: new 164	java/lang/IllegalStateException
    //   188: dup
    //   189: aload_1
    //   190: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: aload_3
    //   194: invokespecial 168	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   197: athrow
    //   198: astore_2
    //   199: new 133	java/lang/RuntimeException
    //   202: dup
    //   203: ldc -111
    //   205: aload_1
    //   206: ldc -86
    //   208: invokestatic 173	g:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   211: aload_2
    //   212: invokespecial 143	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   215: athrow
    //   216: return
    //   217: new 164	java/lang/IllegalStateException
    //   220: dup
    //   221: ldc -81
    //   223: invokespecial 178	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   226: athrow
    //   227: new 180	java/lang/AssertionError
    //   230: dup
    //   231: ldc -74
    //   233: invokespecial 185	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   236: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	a
    //   0	237	1	paramo	b1.o
    //   0	237	2	parama	b1.k.a
    //   54	11	3	localIterator	java.util.Iterator
    //   162	32	3	localNoSuchMethodException	NoSuchMethodException
    //   104	9	4	localConstructor	java.lang.reflect.Constructor
    // Exception table:
    //   from	to	target	type
    //   112	133	146	java/lang/Exception
    //   96	106	162	java/lang/NoSuchMethodException
    //   74	96	198	java/lang/ClassNotFoundException
  }
  
  public static final class a
    implements c.b
  {
    public final LinkedHashSet a = new LinkedHashSet();
    
    public a(c paramc)
    {
      paramc.c("androidx.savedstate.Restarter", this);
    }
    
    public final Bundle a()
    {
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("classes_to_restore", new ArrayList(a));
      return localBundle;
    }
  }
}

/* Location:
 * Qualified Name:     s1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */