package l;

import a7.b;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import b.a0;
import b7.u;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzr;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i6.b0;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l6.d1;
import l6.n;
import p1.j;
import p2.x;
import r.h;
import sb.q;
import v0.a.a;
import v0.e;

public final class l
  implements Continuation, n
{
  public final Object c;
  
  public l(int paramInt)
  {
    b = new AtomicInteger();
    c = new AtomicInteger();
  }
  
  public l(EditText paramEditText)
  {
    b = paramEditText;
    c = new v0.a(paramEditText);
  }
  
  public l(d1 paramd1, AlertDialog paramAlertDialog) {}
  
  public l(j paramj)
  {
    b = paramj;
    paramj = Collections.newSetFromMap(new IdentityHashMap());
    ec.i.d(paramj, "newSetFromMap(IdentityHashMap())");
    c = paramj;
  }
  
  public final boolean a(x2.l paraml)
  {
    synchronized (b)
    {
      boolean bool = ((Map)c).containsKey(paraml);
      return bool;
    }
  }
  
  public final void accept(Object paramObject1, Object paramObject2)
  {
    u localu = (u)c;
    paramObject1 = (zzp)paramObject1;
    paramObject2 = new b((TaskCompletionSource)paramObject2);
    ((zzs)((com.google.android.gms.common.internal.a)paramObject1).getService()).zzc((zzr)paramObject2, localu);
  }
  
  public final KeyListener b(KeyListener paramKeyListener)
  {
    Object localObject = paramKeyListener;
    if ((paramKeyListener instanceof NumberKeyListener ^ true))
    {
      c).a.getClass();
      if ((paramKeyListener instanceof e)) {
        localObject = paramKeyListener;
      } else if (paramKeyListener == null) {
        localObject = null;
      } else if ((paramKeyListener instanceof NumberKeyListener)) {
        localObject = paramKeyListener;
      } else {
        localObject = new e(paramKeyListener);
      }
    }
    return (KeyListener)localObject;
  }
  
  public final void c(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = ((EditText)b).getContext().obtainStyledAttributes(paramAttributeSet, a0.v, paramInt, 0);
    try
    {
      boolean bool1 = localTypedArray.hasValue(14);
      boolean bool2 = true;
      if (bool1) {
        bool2 = localTypedArray.getBoolean(14, true);
      }
      localTypedArray.recycle();
      g(bool2);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public final InputConnection d(InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    Object localObject = (v0.a)c;
    if (paramInputConnection == null)
    {
      localObject.getClass();
      paramInputConnection = null;
    }
    else
    {
      localObject = a;
      localObject.getClass();
      if (!(paramInputConnection instanceof v0.c)) {
        paramInputConnection = new v0.c(a, paramInputConnection, paramEditorInfo);
      }
    }
    return paramInputConnection;
  }
  
  public final List e(String paramString)
  {
    ec.i.e(paramString, "workSpecId");
    synchronized (b)
    {
      Object localObject2 = (Map)c;
      LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
      localLinkedHashMap.<init>();
      Iterator localIterator = ((Map)localObject2).entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (Map.Entry)localIterator.next();
        if (ec.i.a(getKeya, paramString)) {
          localLinkedHashMap.put(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
        }
      }
      localObject2 = localLinkedHashMap.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramString = (x2.l)((Iterator)localObject2).next();
        ((Map)c).remove(paramString);
      }
      paramString = q.u(localLinkedHashMap.values());
      return paramString;
    }
  }
  
  public final x f(x2.l paraml)
  {
    ec.i.e(paraml, "id");
    synchronized (b)
    {
      paraml = (x)((Map)c).remove(paraml);
      return paraml;
    }
  }
  
  /* Error */
  public final void g(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	l/l:c	Ljava/lang/Object;
    //   4: checkcast 35	v0/a
    //   7: getfield 99	v0/a:a	Lv0/a$a;
    //   10: getfield 231	v0/a$a:b	Lv0/g;
    //   13: astore_2
    //   14: aload_2
    //   15: getfield 236	v0/g:d	Z
    //   18: iload_1
    //   19: if_icmpeq +108 -> 127
    //   22: aload_2
    //   23: getfield 239	v0/g:c	Lv0/g$a;
    //   26: ifnull +79 -> 105
    //   29: invokestatic 244	androidx/emoji2/text/d:a	()Landroidx/emoji2/text/d;
    //   32: astore_3
    //   33: aload_2
    //   34: getfield 239	v0/g:c	Lv0/g$a;
    //   37: astore 4
    //   39: aload_3
    //   40: invokevirtual 103	java/lang/Object:getClass	()Ljava/lang/Class;
    //   43: pop
    //   44: aload 4
    //   46: ldc -10
    //   48: invokestatic 251	p2/m0:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   51: aload_3
    //   52: getfield 254	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   55: invokevirtual 260	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   58: invokeinterface 265 1 0
    //   63: aload_3
    //   64: getfield 268	androidx/emoji2/text/d:b	Lr/d;
    //   67: aload 4
    //   69: invokevirtual 272	r/d:remove	(Ljava/lang/Object;)Z
    //   72: pop
    //   73: aload_3
    //   74: getfield 254	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   77: invokevirtual 260	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   80: invokeinterface 275 1 0
    //   85: goto +20 -> 105
    //   88: astore 4
    //   90: aload_3
    //   91: getfield 254	androidx/emoji2/text/d:a	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   94: invokevirtual 260	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/Lock;
    //   97: invokeinterface 275 1 0
    //   102: aload 4
    //   104: athrow
    //   105: aload_2
    //   106: iload_1
    //   107: putfield 236	v0/g:d	Z
    //   110: iload_1
    //   111: ifeq +16 -> 127
    //   114: aload_2
    //   115: getfield 276	v0/g:a	Landroid/widget/EditText;
    //   118: invokestatic 244	androidx/emoji2/text/d:a	()Landroidx/emoji2/text/d;
    //   121: invokevirtual 279	androidx/emoji2/text/d:b	()I
    //   124: invokestatic 282	v0/g:a	(Landroid/widget/EditText;I)V
    //   127: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	l
    //   0	128	1	paramBoolean	boolean
    //   13	102	2	localg	v0.g
    //   32	59	3	locald	androidx.emoji2.text.d
    //   37	31	4	locala	v0.g.a
    //   88	15	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   63	73	88	finally
  }
  
  public final x h(x2.l paraml)
  {
    synchronized (b)
    {
      Map localMap = (Map)c;
      Object localObject2 = localMap.get(paraml);
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = new p2/x;
        ((x)localObject3).<init>(paraml);
        localMap.put(paraml, localObject3);
      }
      paraml = (x)localObject3;
      return paraml;
    }
  }
  
  public final Object then(Task paramTask)
  {
    switch (a)
    {
    default: 
      break;
    case 3: 
      localObject1 = (i6.c)b;
      localObject2 = (Bundle)c;
      localObject1.getClass();
      if (paramTask.isSuccessful())
      {
        Bundle localBundle = (Bundle)paramTask.getResult();
        int i;
        if ((localBundle != null) && (localBundle.containsKey("google.messenger"))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          paramTask = ((i6.c)localObject1).b((Bundle)localObject2).onSuccessTask(b0.a, a0.O);
        }
      }
      return paramTask;
    }
    Object localObject1 = (r9.i)b;
    Object localObject2 = (Pair)c;
    try
    {
      b.remove(localObject2);
      return paramTask;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     l.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */