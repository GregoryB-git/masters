package gb;

import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;

public final class l1
  implements i0.e
{
  public static final Throwable a;
  
  static
  {
    try
    {
      Class.forName("javax.naming.directory.InitialDirContext");
      Class.forName("com.sun.jndi.dns.DnsContextFactory");
      Object localObject = null;
    }
    catch (Error localError) {}catch (RuntimeException localRuntimeException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    a = localClassNotFoundException;
  }
  
  public final b a()
  {
    if (a != null) {
      return null;
    }
    return new b(new a());
  }
  
  public final Throwable b()
  {
    return a;
  }
  
  public static final class a
    implements l1.c
  {
    public static void a(NamingEnumeration<?> paramNamingEnumeration, NamingException paramNamingException)
    {
      try
      {
        paramNamingEnumeration.close();
        throw paramNamingException;
      }
      catch (NamingException paramNamingEnumeration)
      {
        for (;;) {}
      }
    }
    
    public static void b(DirContext paramDirContext, NamingException paramNamingException)
    {
      try
      {
        paramDirContext.close();
        throw paramNamingException;
      }
      catch (NamingException paramDirContext)
      {
        for (;;) {}
      }
    }
    
    /* Error */
    public final ArrayList c(String paramString)
    {
      // Byte code:
      //   0: getstatic 34	gb/l1:a	Ljava/lang/Throwable;
      //   3: astore_2
      //   4: aload_2
      //   5: ifnonnull +173 -> 178
      //   8: new 36	java/util/ArrayList
      //   11: dup
      //   12: invokespecial 37	java/util/ArrayList:<init>	()V
      //   15: astore_3
      //   16: new 39	java/util/Hashtable
      //   19: dup
      //   20: invokespecial 40	java/util/Hashtable:<init>	()V
      //   23: astore_2
      //   24: aload_2
      //   25: ldc 42
      //   27: ldc 44
      //   29: invokevirtual 48	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   32: pop
      //   33: aload_2
      //   34: ldc 50
      //   36: ldc 44
      //   38: invokevirtual 48	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   41: pop
      //   42: new 52	javax/naming/directory/InitialDirContext
      //   45: dup
      //   46: aload_2
      //   47: invokespecial 55	javax/naming/directory/InitialDirContext:<init>	(Ljava/util/Hashtable;)V
      //   50: astore_2
      //   51: aload_2
      //   52: aload_1
      //   53: iconst_1
      //   54: anewarray 57	java/lang/String
      //   57: dup
      //   58: iconst_0
      //   59: ldc 59
      //   61: aastore
      //   62: invokeinterface 63 3 0
      //   67: invokeinterface 69 1 0
      //   72: astore_1
      //   73: aload_1
      //   74: invokeinterface 73 1 0
      //   79: ifeq +70 -> 149
      //   82: aload_1
      //   83: invokeinterface 77 1 0
      //   88: checkcast 79	javax/naming/directory/Attribute
      //   91: invokeinterface 80 1 0
      //   96: astore 4
      //   98: aload 4
      //   100: invokeinterface 73 1 0
      //   105: ifeq +21 -> 126
      //   108: aload_3
      //   109: aload 4
      //   111: invokeinterface 77 1 0
      //   116: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   119: invokevirtual 88	java/util/ArrayList:add	(Ljava/lang/Object;)Z
      //   122: pop
      //   123: goto -25 -> 98
      //   126: aload 4
      //   128: invokeinterface 22 1 0
      //   133: goto -60 -> 73
      //   136: astore_3
      //   137: aload 4
      //   139: aload_3
      //   140: invokestatic 90	gb/l1$a:a	(Ljavax/naming/NamingEnumeration;Ljavax/naming/NamingException;)V
      //   143: aconst_null
      //   144: athrow
      //   145: astore_3
      //   146: goto +17 -> 163
      //   149: aload_1
      //   150: invokeinterface 22 1 0
      //   155: aload_2
      //   156: invokeinterface 29 1 0
      //   161: aload_3
      //   162: areturn
      //   163: aload_1
      //   164: aload_3
      //   165: invokestatic 90	gb/l1$a:a	(Ljavax/naming/NamingEnumeration;Ljavax/naming/NamingException;)V
      //   168: aconst_null
      //   169: athrow
      //   170: astore_1
      //   171: aload_2
      //   172: aload_1
      //   173: invokestatic 92	gb/l1$a:b	(Ljavax/naming/directory/DirContext;Ljavax/naming/NamingException;)V
      //   176: aconst_null
      //   177: athrow
      //   178: new 94	java/lang/UnsupportedOperationException
      //   181: dup
      //   182: ldc 96
      //   184: aload_2
      //   185: invokespecial 99	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   188: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	189	0	this	a
      //   0	189	1	paramString	String
      //   3	182	2	localObject	Object
      //   15	94	3	localArrayList	ArrayList
      //   136	4	3	localNamingException1	NamingException
      //   145	20	3	localNamingException2	NamingException
      //   96	42	4	localNamingEnumeration	NamingEnumeration
      // Exception table:
      //   from	to	target	type
      //   98	123	136	javax/naming/NamingException
      //   73	98	145	javax/naming/NamingException
      //   126	133	145	javax/naming/NamingException
      //   137	145	145	javax/naming/NamingException
      //   51	73	170	javax/naming/NamingException
      //   149	155	170	javax/naming/NamingException
      //   163	170	170	javax/naming/NamingException
    }
  }
  
  public static final class b
    implements i0.d
  {
    public static final Logger b = Logger.getLogger(b.class.getName());
    public final l1.c a;
    
    static
    {
      Pattern.compile("\\s+");
    }
    
    public b(l1.a parama)
    {
      a = parama;
    }
    
    public final List<String> a(String paramString)
    {
      Object localObject1 = b;
      Object localObject2 = Level.FINER;
      if (((Logger)localObject1).isLoggable((Level)localObject2)) {
        ((Logger)localObject1).log((Level)localObject2, "About to query TXT records for {0}", new Object[] { paramString });
      }
      Object localObject3 = a;
      paramString = g.d("dns:///", paramString);
      localObject3 = ((l1.a)localObject3).c(paramString);
      if (((Logger)localObject1).isLoggable((Level)localObject2)) {
        ((Logger)localObject1).log((Level)localObject2, "Found {0} TXT records", new Object[] { Integer.valueOf(((ArrayList)localObject3).size()) });
      }
      paramString = new ArrayList(((ArrayList)localObject3).size());
      localObject3 = ((ArrayList)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (String)((Iterator)localObject3).next();
        localObject2 = new StringBuilder(((String)localObject1).length());
        int i = 0;
        int j = i;
        while (i < ((String)localObject1).length())
        {
          char c1 = ((String)localObject1).charAt(i);
          int k;
          char c2;
          if (j == 0)
          {
            if (c1 == ' ') {
              break label255;
            }
            k = i;
            c2 = c1;
            if (c1 == '"')
            {
              j = 1;
              break label255;
            }
          }
          else
          {
            if (c1 == '"')
            {
              j = 0;
              break label255;
            }
            k = i;
            c2 = c1;
            if (c1 == '\\')
            {
              k = i + 1;
              i = ((String)localObject1).charAt(k);
              c2 = i;
            }
          }
          ((StringBuilder)localObject2).append(c2);
          i = k;
          label255:
          i++;
        }
        paramString.add(((StringBuilder)localObject2).toString());
      }
      return Collections.unmodifiableList(paramString);
    }
  }
  
  public static abstract interface c {}
}

/* Location:
 * Qualified Name:     gb.l1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */