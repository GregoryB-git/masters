package androidx.emoji2.text;

import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p2.m0;
import t0.e;
import t0.i;
import t0.j;

public final class d
{
  public static final Object i = new Object();
  public static volatile d j;
  public final ReentrantReadWriteLock a;
  public final r.d b;
  public volatile int c;
  public final Handler d;
  public final a e;
  public final g f;
  public final int g;
  public final b h;
  
  /* Error */
  public d(EmojiCompatInitializer.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 46	java/lang/Object:<init>	()V
    //   4: new 52	java/util/concurrent/locks/ReentrantReadWriteLock
    //   7: dup
    //   8: invokespecial 53	java/util/concurrent/locks/ReentrantReadWriteLock:<init>	()V
    //   11: astore_2
    //   12: aload_0
    //   13: aload_2
    //   14: putfield 55	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   17: aload_0
    //   18: iconst_3
    //   19: putfield 57	androidx/emoji2/text/d:c	I
    //   22: aload_1
    //   23: getfield 59	androidx/emoji2/text/d$c:a	Landroidx/emoji2/text/d$g;
    //   26: astore_3
    //   27: aload_0
    //   28: aload_3
    //   29: putfield 61	androidx/emoji2/text/d:f	Landroidx/emoji2/text/d$g;
    //   32: aload_1
    //   33: getfield 63	androidx/emoji2/text/d$c:b	I
    //   36: istore 4
    //   38: aload_0
    //   39: iload 4
    //   41: putfield 65	androidx/emoji2/text/d:g	I
    //   44: aload_0
    //   45: aload_1
    //   46: getfield 67	androidx/emoji2/text/d$c:c	Landroidx/emoji2/text/b;
    //   49: putfield 69	androidx/emoji2/text/d:h	Landroidx/emoji2/text/b;
    //   52: aload_0
    //   53: new 71	android/os/Handler
    //   56: dup
    //   57: invokestatic 77	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   60: invokespecial 80	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   63: putfield 82	androidx/emoji2/text/d:d	Landroid/os/Handler;
    //   66: aload_0
    //   67: new 84	r/d
    //   70: dup
    //   71: invokespecial 85	r/d:<init>	()V
    //   74: putfield 87	androidx/emoji2/text/d:b	Lr/d;
    //   77: new 6	androidx/emoji2/text/d$a
    //   80: dup
    //   81: aload_0
    //   82: invokespecial 90	androidx/emoji2/text/d$a:<init>	(Landroidx/emoji2/text/d;)V
    //   85: astore_1
    //   86: aload_0
    //   87: aload_1
    //   88: putfield 92	androidx/emoji2/text/d:e	Landroidx/emoji2/text/d$a;
    //   91: aload_2
    //   92: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   95: invokeinterface 101 1 0
    //   100: iload 4
    //   102: ifne +26 -> 128
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield 57	androidx/emoji2/text/d:c	I
    //   110: goto +18 -> 128
    //   113: astore_1
    //   114: aload_0
    //   115: getfield 55	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   118: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   121: invokeinterface 104 1 0
    //   126: aload_1
    //   127: athrow
    //   128: aload_2
    //   129: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   132: invokeinterface 104 1 0
    //   137: aload_0
    //   138: invokevirtual 107	androidx/emoji2/text/d:b	()I
    //   141: ifne +31 -> 172
    //   144: new 109	androidx/emoji2/text/c
    //   147: astore_2
    //   148: aload_2
    //   149: aload_1
    //   150: invokespecial 112	androidx/emoji2/text/c:<init>	(Landroidx/emoji2/text/d$a;)V
    //   153: aload_3
    //   154: aload_2
    //   155: invokeinterface 115 2 0
    //   160: goto +12 -> 172
    //   163: astore_3
    //   164: aload_1
    //   165: getfield 117	androidx/emoji2/text/d$b:a	Landroidx/emoji2/text/d;
    //   168: aload_3
    //   169: invokevirtual 120	androidx/emoji2/text/d:d	(Ljava/lang/Throwable;)V
    //   172: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	d
    //   0	173	1	parama	EmojiCompatInitializer.a
    //   11	144	2	localObject	Object
    //   26	128	3	localg	g
    //   163	6	3	localThrowable	Throwable
    //   36	65	4	k	int
    // Exception table:
    //   from	to	target	type
    //   105	110	113	finally
    //   144	160	163	finally
  }
  
  public static d a()
  {
    synchronized (i)
    {
      Object localObject2 = j;
      int k;
      if (localObject2 != null) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        return (d)localObject2;
      }
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
      throw ((Throwable)localObject2);
    }
  }
  
  public final int b()
  {
    a.readLock().lock();
    try
    {
      int k = c;
      return k;
    }
    finally
    {
      a.readLock().unlock();
    }
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 65	androidx/emoji2/text/d:g	I
    //   4: istore_1
    //   5: iconst_1
    //   6: istore_2
    //   7: iload_1
    //   8: iconst_1
    //   9: if_icmpne +8 -> 17
    //   12: iconst_1
    //   13: istore_1
    //   14: goto +5 -> 19
    //   17: iconst_0
    //   18: istore_1
    //   19: iload_1
    //   20: ifeq +139 -> 159
    //   23: aload_0
    //   24: invokevirtual 107	androidx/emoji2/text/d:b	()I
    //   27: iconst_1
    //   28: if_icmpne +8 -> 36
    //   31: iload_2
    //   32: istore_1
    //   33: goto +5 -> 38
    //   36: iconst_0
    //   37: istore_1
    //   38: iload_1
    //   39: ifeq +4 -> 43
    //   42: return
    //   43: aload_0
    //   44: getfield 55	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   47: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   50: invokeinterface 101 1 0
    //   55: aload_0
    //   56: getfield 57	androidx/emoji2/text/d:c	I
    //   59: istore_1
    //   60: iload_1
    //   61: ifne +16 -> 77
    //   64: aload_0
    //   65: getfield 55	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   68: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   71: invokeinterface 104 1 0
    //   76: return
    //   77: aload_0
    //   78: iconst_0
    //   79: putfield 57	androidx/emoji2/text/d:c	I
    //   82: aload_0
    //   83: getfield 55	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   86: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   89: invokeinterface 104 1 0
    //   94: aload_0
    //   95: getfield 92	androidx/emoji2/text/d:e	Landroidx/emoji2/text/d$a;
    //   98: astore_3
    //   99: aload_3
    //   100: invokevirtual 137	java/lang/Object:getClass	()Ljava/lang/Class;
    //   103: pop
    //   104: new 109	androidx/emoji2/text/c
    //   107: astore 4
    //   109: aload 4
    //   111: aload_3
    //   112: invokespecial 112	androidx/emoji2/text/c:<init>	(Landroidx/emoji2/text/d$a;)V
    //   115: aload_3
    //   116: getfield 117	androidx/emoji2/text/d$b:a	Landroidx/emoji2/text/d;
    //   119: getfield 61	androidx/emoji2/text/d:f	Landroidx/emoji2/text/d$g;
    //   122: aload 4
    //   124: invokeinterface 115 2 0
    //   129: goto +14 -> 143
    //   132: astore 4
    //   134: aload_3
    //   135: getfield 117	androidx/emoji2/text/d$b:a	Landroidx/emoji2/text/d;
    //   138: aload 4
    //   140: invokevirtual 120	androidx/emoji2/text/d:d	(Ljava/lang/Throwable;)V
    //   143: return
    //   144: astore_3
    //   145: aload_0
    //   146: getfield 55	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   149: invokevirtual 96	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   152: invokeinterface 104 1 0
    //   157: aload_3
    //   158: athrow
    //   159: new 125	java/lang/IllegalStateException
    //   162: dup
    //   163: ldc -117
    //   165: invokespecial 130	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	d
    //   4	57	1	k	int
    //   6	26	2	m	int
    //   98	37	3	locala	a
    //   144	14	3	localObject	Object
    //   107	16	4	localc	c
    //   132	7	4	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   104	129	132	finally
    //   55	60	144	finally
    //   77	82	144	finally
  }
  
  public final void d(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList();
    a.writeLock().lock();
    try
    {
      c = 2;
      localArrayList.addAll(b);
      b.clear();
      a.writeLock().unlock();
      d.post(new f(localArrayList, c, paramThrowable));
      return;
    }
    finally
    {
      a.writeLock().unlock();
    }
  }
  
  public final void e()
  {
    ArrayList localArrayList = new ArrayList();
    a.writeLock().lock();
    try
    {
      c = 1;
      localArrayList.addAll(b);
      b.clear();
      a.writeLock().unlock();
      d.post(new f(localArrayList, c, null));
      return;
    }
    finally
    {
      a.writeLock().unlock();
    }
  }
  
  public final CharSequence f(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int k = paramInt2;
    if (b() == 1) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    if (paramInt2 != 0)
    {
      if (paramInt1 >= 0)
      {
        if (k >= 0)
        {
          boolean bool;
          if (paramInt1 <= k) {
            bool = true;
          } else {
            bool = false;
          }
          m0.n("start should be <= than end", bool);
          Object localObject1 = null;
          if (paramCharSequence == null) {
            return null;
          }
          if (paramInt1 <= paramCharSequence.length()) {
            bool = true;
          } else {
            bool = false;
          }
          m0.n("start should be < than charSequence length", bool);
          if (k <= paramCharSequence.length()) {
            bool = true;
          } else {
            bool = false;
          }
          m0.n("end should be < than charSequence length", bool);
          if ((paramCharSequence.length() != 0) && (paramInt1 != k))
          {
            Object localObject2 = e.b;
            localObject2.getClass();
            bool = paramCharSequence instanceof t0.h;
            if (bool) {
              ((t0.h)paramCharSequence).a();
            }
            if (!bool) {}
            try
            {
              if (!(paramCharSequence instanceof Spannable))
              {
                localObject3 = localObject1;
                if ((paramCharSequence instanceof Spanned))
                {
                  localObject3 = localObject1;
                  if (((Spanned)paramCharSequence).nextSpanTransition(paramInt1 - 1, k + 1, t0.f.class) <= k) {
                    localObject3 = new j(paramCharSequence);
                  }
                }
              }
              else
              {
                localObject3 = new t0/j;
                ((j)localObject3).<init>((Spannable)paramCharSequence);
              }
              paramInt2 = paramInt1;
              int m = k;
              int n;
              int i1;
              Object localObject5;
              if (localObject3 != null)
              {
                localObject1 = (t0.f[])((j)localObject3).getSpans(paramInt1, k, t0.f.class);
                paramInt2 = paramInt1;
                m = k;
                if (localObject1 != null)
                {
                  paramInt2 = paramInt1;
                  m = k;
                  if (localObject1.length > 0)
                  {
                    n = localObject1.length;
                    for (i1 = 0;; i1++)
                    {
                      paramInt2 = paramInt1;
                      m = k;
                      if (i1 >= n) {
                        break;
                      }
                      localObject5 = localObject1[i1];
                      m = ((j)localObject3).getSpanStart(localObject5);
                      paramInt2 = ((j)localObject3).getSpanEnd(localObject5);
                      if (m != k) {
                        ((j)localObject3).removeSpan(localObject5);
                      }
                      paramInt1 = Math.min(m, paramInt1);
                      k = Math.max(paramInt2, k);
                    }
                  }
                }
              }
              if ((paramInt2 != m) && (paramInt2 < paramCharSequence.length()))
              {
                localObject5 = new androidx/emoji2/text/f$a;
                ((f.a)localObject5).<init>(b.c);
                k = Character.codePointAt(paramCharSequence, paramInt2);
                i1 = 0;
                paramInt1 = paramInt2;
                paramInt2 = k;
                for (;;)
                {
                  k = paramInt1;
                  for (;;)
                  {
                    if ((k >= m) || (i1 >= Integer.MAX_VALUE)) {
                      break label668;
                    }
                    n = ((f.a)localObject5).a(paramInt2);
                    if (n == 1) {
                      break label633;
                    }
                    if (n != 2)
                    {
                      if (n != 3) {
                        continue;
                      }
                      localObject1 = localObject3;
                      n = i1;
                      if (!((f)localObject2).b(paramCharSequence, paramInt1, k, d.b))
                      {
                        localObject1 = localObject3;
                        if (localObject3 == null)
                        {
                          localObject1 = new t0/j;
                          localObject3 = new android/text/SpannableString;
                          ((SpannableString)localObject3).<init>(paramCharSequence);
                          ((j)localObject1).<init>((Spannable)localObject3);
                        }
                        e locale = d.b;
                        a.getClass();
                        localObject3 = new t0/i;
                        ((i)localObject3).<init>(locale);
                        ((j)localObject1).setSpan(localObject3, paramInt1, k, 33);
                        n = i1 + 1;
                      }
                      paramInt1 = k;
                      localObject3 = localObject1;
                      k = paramInt2;
                      i1 = n;
                      break;
                    }
                    n = k + Character.charCount(paramInt2);
                    k = n;
                    if (n < m)
                    {
                      paramInt2 = Character.codePointAt(paramCharSequence, n);
                      k = n;
                    }
                  }
                  label633:
                  k = Character.charCount(Character.codePointAt(paramCharSequence, paramInt1)) + paramInt1;
                  paramInt1 = k;
                  if (k < m)
                  {
                    paramInt2 = Character.codePointAt(paramCharSequence, k);
                    paramInt1 = k;
                  }
                }
                label668:
                if ((a == 2) && (c.b != null) && ((f > 1) || (((f.a)localObject5).c()))) {
                  paramInt2 = 1;
                } else {
                  paramInt2 = 0;
                }
                localObject1 = localObject3;
                if (paramInt2 != 0)
                {
                  localObject1 = localObject3;
                  if (i1 < Integer.MAX_VALUE)
                  {
                    localObject1 = localObject3;
                    if (!((f)localObject2).b(paramCharSequence, paramInt1, k, c.b))
                    {
                      localObject1 = localObject3;
                      if (localObject3 == null)
                      {
                        localObject1 = new t0/j;
                        ((j)localObject1).<init>(paramCharSequence);
                      }
                      localObject3 = c.b;
                      a.getClass();
                      localObject2 = new t0/i;
                      ((i)localObject2).<init>((e)localObject3);
                      ((j)localObject1).setSpan(localObject2, paramInt1, k, 33);
                    }
                  }
                }
                if (localObject1 != null)
                {
                  localObject1 = b;
                  localObject3 = localObject1;
                  if (!bool) {
                    break label876;
                  }
                  ((t0.h)paramCharSequence).b();
                  localObject3 = localObject1;
                  break label876;
                }
                if (!bool) {
                  break label873;
                }
              }
              else
              {
                if (!bool) {
                  break label873;
                }
              }
              ((t0.h)paramCharSequence).b();
              label873:
              Object localObject3 = paramCharSequence;
              label876:
              return (CharSequence)localObject3;
            }
            finally
            {
              if (bool) {
                ((t0.h)paramCharSequence).b();
              }
            }
          }
          return paramCharSequence;
        }
        throw new IllegalArgumentException("end cannot be negative");
      }
      throw new IllegalArgumentException("start cannot be negative");
    }
    throw new IllegalStateException("Not initialized yet");
  }
  
  public final void g(e parame)
  {
    if (parame != null)
    {
      a.writeLock().lock();
      try
      {
        if ((c != 1) && (c != 2))
        {
          b.add(parame);
        }
        else
        {
          Handler localHandler = d;
          f localf = new androidx/emoji2/text/d$f;
          int k = c;
          localf.<init>(Arrays.asList(new e[] { parame }), k, null);
          localHandler.post(localf);
        }
        return;
      }
      finally
      {
        a.writeLock().unlock();
      }
    }
    throw new NullPointerException("initCallback cannot be null");
  }
  
  public static final class a
    extends d.b
  {
    public volatile f b;
    public volatile h c;
    
    public a(d paramd)
    {
      super();
    }
  }
  
  public static class b
  {
    public final d a;
    
    public b(d paramd)
    {
      a = paramd;
    }
  }
  
  public static abstract class c
  {
    public final d.g a;
    public int b = 0;
    public b c = new b();
    
    public c(d.g paramg)
    {
      a = paramg;
    }
  }
  
  public static abstract interface d {}
  
  public static abstract class e
  {
    public void a() {}
  }
  
  public static final class f
    implements Runnable
  {
    public final ArrayList a;
    public final int b;
    
    public f(List paramList, int paramInt, Throwable paramThrowable)
    {
      if (paramList != null)
      {
        a = new ArrayList(paramList);
        b = paramInt;
        return;
      }
      throw new NullPointerException("initCallbacks cannot be null");
    }
    
    public final void run()
    {
      int i = a.size();
      int j = b;
      int k = 0;
      int m = 0;
      if (j != 1) {
        for (k = m; k < i; k++) {
          ((d.e)a.get(k)).getClass();
        }
      }
      while (k < i)
      {
        ((d.e)a.get(k)).a();
        k++;
      }
    }
  }
  
  public static abstract interface g
  {
    public abstract void a(d.h paramh);
  }
  
  public static abstract class h
  {
    public abstract void a(Throwable paramThrowable);
    
    public abstract void b(h paramh);
  }
  
  public static final class i {}
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */