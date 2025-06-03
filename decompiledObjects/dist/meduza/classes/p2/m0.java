package p2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.work.impl.WorkDatabase;
import b.a0;
import c4.v;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d2.h0;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import nc.a2;
import nc.c0;
import nc.d0;
import nc.g1;
import nc.g2;
import nc.j1;
import nc.j1.b;
import nc.p0;
import nc.r0;
import nc.w0;
import nc.y;
import org.xmlpull.v1.XmlPullParser;
import p1.j.a;
import p1.j.c;
import sc.w;
import t1.c.c;
import ub.h.a;
import xc.x;

public class m0
  implements c4.j, e7.j, ea.m0, f2.f, m6.i, o2.a, Continuation, s5.g
{
  public static final m0 A;
  public static final m0 B;
  public static final h0 C;
  public static final h0 D;
  public static final String[] a;
  public static final String[] b;
  public static final m0 c;
  public static final m0 d;
  public static final int[] e;
  public static final int[] f;
  public static final int[] o;
  public static int p = 2;
  public static final h0 q;
  public static final h0 r;
  public static final h0 s;
  public static final h0 t;
  public static final h0 u;
  public static final h0 v;
  public static final h0 w;
  public static final h0 x;
  public static final w0 y;
  public static final w0 z;
  
  public static String A(j9.e parame)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = parame.q();
    for (int j = 0; j < i; j++)
    {
      if (localStringBuilder.length() > 0)
      {
        localStringBuilder.append('\001');
        localStringBuilder.append('\001');
      }
      String str = parame.n(j);
      int k = str.length();
      for (int m = 0; m < k; m++)
      {
        char c1 = str.charAt(m);
        char c2;
        if (c1 != 0)
        {
          if (c1 != '\001')
          {
            c2 = c1;
          }
          else
          {
            localStringBuilder.append('\001');
            c1 = '\021';
            c2 = c1;
          }
        }
        else
        {
          localStringBuilder.append('\001');
          c1 = '\020';
          c2 = c1;
        }
        localStringBuilder.append(c2);
      }
    }
    localStringBuilder.append('\001');
    localStringBuilder.append('\001');
    return localStringBuilder.toString();
  }
  
  public static void B()
  {
    if (v5.e0.a >= 18) {
      Trace.endSection();
    }
  }
  
  public static final void C(ub.h paramh)
  {
    paramh = (j1)paramh.get(j1.b.a);
    if ((paramh != null) && (!paramh.isActive())) {
      throw paramh.getCancellationException();
    }
  }
  
  public static final xb.b D(Enum[] paramArrayOfEnum)
  {
    ec.i.e(paramArrayOfEnum, "entries");
    return new xb.b(paramArrayOfEnum);
  }
  
  public static final boolean E(char paramChar1, char paramChar2, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramChar1 == paramChar2) {
      return true;
    }
    if (!paramBoolean) {
      return false;
    }
    paramChar1 = Character.toUpperCase(paramChar1);
    paramChar2 = Character.toUpperCase(paramChar2);
    paramBoolean = bool;
    if (paramChar1 != paramChar2) {
      if (Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2)) {
        paramBoolean = bool;
      } else {
        paramBoolean = false;
      }
    }
    return paramBoolean;
  }
  
  public static final Object F(sc.t paramt, long paramLong, dc.p paramp)
  {
    sc.t localt = paramt;
    if ((c >= paramLong) && (!localt.c())) {
      return localt;
    }
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = sc.c.a;
    paramt = localAtomicReferenceFieldUpdater.get(localt);
    Object localObject = C;
    if (paramt == localObject) {
      return localObject;
    }
    paramt = (sc.t)paramt;
    if (paramt != null) {}
    for (;;)
    {
      localt = paramt;
      break;
      localObject = (sc.t)paramp.invoke(Long.valueOf(c + 1L), localt);
      do
      {
        if (localAtomicReferenceFieldUpdater.compareAndSet(localt, null, localObject))
        {
          i = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater.get(localt) == null);
      int i = 0;
      if (i == 0) {
        break;
      }
      paramt = (sc.t)localObject;
      if (localt.c())
      {
        localt.d();
        paramt = (sc.t)localObject;
      }
    }
  }
  
  public static String G(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++) {
      if (paramXmlPullParser.getAttributeName(j).equals(paramString)) {
        return paramXmlPullParser.getAttributeValue(j);
      }
    }
    return null;
  }
  
  public static final void H()
  {
    vb.a locala = vb.a.a;
  }
  
  public static final int I(Cursor paramCursor, String paramString)
  {
    ec.i.e(paramCursor, "c");
    int i = paramCursor.getColumnIndex(paramString);
    if (i >= 0) {
      return i;
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append('`');
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append('`');
    i = paramCursor.getColumnIndex(((StringBuilder)localObject1).toString());
    if (i < 0)
    {
      if (Build.VERSION.SDK_INT <= 25)
      {
        if (paramString.length() == 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          paramCursor = paramCursor.getColumnNames();
          ec.i.d(paramCursor, "columnNames");
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append('.');
          ((StringBuilder)localObject1).append(paramString);
          localObject1 = ((StringBuilder)localObject1).toString();
          Object localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append('.');
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append('`');
          localObject2 = ((StringBuilder)localObject2).toString();
          int j = paramCursor.length;
          int k = 0;
          for (i = k; k < j; i++)
          {
            Object localObject3 = paramCursor[k];
            if (((String)localObject3).length() >= paramString.length() + 2)
            {
              ec.i.e(localObject1, "suffix");
              if (!((String)localObject3).endsWith((String)localObject1))
              {
                if (((String)localObject3).charAt(0) != '`') {
                  break label266;
                }
                ec.i.e(localObject2, "suffix");
                if (((String)localObject3).endsWith((String)localObject2)) {
                  return i;
                }
              }
            }
            label266:
            k++;
          }
        }
      }
      i = -1;
    }
    return i;
  }
  
  public static final int J(Cursor paramCursor, String paramString)
  {
    ec.i.e(paramCursor, "c");
    int i = I(paramCursor, paramString);
    if (i >= 0) {
      return i;
    }
    try
    {
      paramCursor = paramCursor.getColumnNames();
      ec.i.d(paramCursor, "c.columnNames");
      paramCursor = sb.k.p(paramCursor, null, null, null, 63);
    }
    catch (Exception paramCursor)
    {
      Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", paramCursor);
      paramCursor = "unknown";
    }
    throw new IllegalArgumentException(a0.j.k("column '", paramString, "' does not exist. Available columns: ", paramCursor));
  }
  
  public static Object K(Iterable paramIterable)
  {
    if ((paramIterable instanceof List))
    {
      paramIterable = (List)paramIterable;
      if (!paramIterable.isEmpty()) {
        return paramIterable.get(paramIterable.size() - 1);
      }
      throw new NoSuchElementException();
    }
    Iterator localIterator = paramIterable.iterator();
    do
    {
      paramIterable = localIterator.next();
    } while (localIterator.hasNext());
    return paramIterable;
  }
  
  public static final sc.t L(Object paramObject)
  {
    if (paramObject != C) {
      return (sc.t)paramObject;
    }
    throw new IllegalStateException("Does not contain segment".toString());
  }
  
  /* Error */
  public static final void M(ub.h paramh, Throwable paramThrowable)
  {
    // Byte code:
    //   0: getstatic 459	sc/e:a	Ljava/util/List;
    //   3: invokeinterface 462 1 0
    //   8: astore_2
    //   9: aload_2
    //   10: invokeinterface 444 1 0
    //   15: ifeq +73 -> 88
    //   18: aload_2
    //   19: invokeinterface 441 1 0
    //   24: checkcast 464	nc/b0
    //   27: astore_3
    //   28: aload_3
    //   29: aload_0
    //   30: aload_1
    //   31: invokeinterface 466 3 0
    //   36: goto -27 -> 9
    //   39: astore_3
    //   40: aload_1
    //   41: aload_3
    //   42: if_acmpne +8 -> 50
    //   45: aload_1
    //   46: astore_3
    //   47: goto +20 -> 67
    //   50: new 468	java/lang/RuntimeException
    //   53: dup
    //   54: ldc_w 470
    //   57: aload_3
    //   58: invokespecial 473	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   61: astore_3
    //   62: aload_3
    //   63: aload_1
    //   64: invokestatic 478	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   67: invokestatic 484	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   70: astore 4
    //   72: aload 4
    //   74: invokevirtual 488	java/lang/Thread:getUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   77: aload 4
    //   79: aload_3
    //   80: invokeinterface 494 3 0
    //   85: goto -76 -> 9
    //   88: new 496	sc/f
    //   91: astore_3
    //   92: aload_3
    //   93: aload_0
    //   94: invokespecial 498	sc/f:<init>	(Lub/h;)V
    //   97: aload_1
    //   98: aload_3
    //   99: invokestatic 478	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   102: invokestatic 484	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   105: astore_0
    //   106: aload_0
    //   107: invokevirtual 488	java/lang/Thread:getUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   110: aload_0
    //   111: aload_1
    //   112: invokeinterface 494 3 0
    //   117: return
    //   118: astore_0
    //   119: goto -17 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramh	ub.h
    //   0	122	1	paramThrowable	Throwable
    //   8	11	2	localIterator	Iterator
    //   27	2	3	localb0	nc.b0
    //   39	3	3	localObject1	Object
    //   46	53	3	localObject2	Object
    //   70	8	4	localThread	Thread
    // Exception table:
    //   from	to	target	type
    //   28	36	39	finally
    //   88	102	118	finally
  }
  
  public static boolean N(Bundle paramBundle1, Bundle paramBundle2)
  {
    int i;
    if (paramBundle1 == null) {
      i = -1;
    } else {
      i = paramBundle1.getInt("android.media.browse.extra.PAGE", -1);
    }
    int j;
    if (paramBundle2 == null) {
      j = -1;
    } else {
      j = paramBundle2.getInt("android.media.browse.extra.PAGE", -1);
    }
    int k;
    if (paramBundle1 == null) {
      k = -1;
    } else {
      k = paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }
    int m;
    if (paramBundle2 == null) {
      m = -1;
    } else {
      m = paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }
    int n = Integer.MAX_VALUE;
    boolean bool = true;
    if ((i != -1) && (k != -1))
    {
      i *= k;
      int i1 = k + i - 1;
      k = i;
      i = i1;
    }
    else
    {
      i = Integer.MAX_VALUE;
      k = 0;
    }
    if ((j != -1) && (m != -1))
    {
      j *= m;
      m = m + j - 1;
    }
    else
    {
      j = 0;
      m = n;
    }
    if ((i < j) || (m < k)) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean O(int paramInt)
  {
    boolean bool;
    if (paramInt >= 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final ub.e P(ub.e parame)
  {
    ec.i.e(parame, "<this>");
    wb.c localc;
    if ((parame instanceof wb.c)) {
      localc = (wb.c)parame;
    } else {
      localc = null;
    }
    ub.e locale = parame;
    if (localc != null)
    {
      locale = localc.intercepted();
      if (locale == null) {
        locale = parame;
      }
    }
    return locale;
  }
  
  public static final boolean Q(AssertionError paramAssertionError)
  {
    Object localObject = xc.p.a;
    localObject = paramAssertionError.getCause();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      paramAssertionError = paramAssertionError.getMessage();
      boolean bool3;
      if (paramAssertionError != null) {
        bool3 = lc.k.o0(paramAssertionError, "getsockname failed");
      } else {
        bool3 = false;
      }
      bool2 = bool1;
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static final boolean R(Object paramObject)
  {
    boolean bool;
    if (paramObject == C) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean S()
  {
    boolean bool;
    if (q0.g.c(p) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean T(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i = paramXmlPullParser.getEventType();
    boolean bool = true;
    if (i == 3) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) || (!paramXmlPullParser.getName().equals(paramString))) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean U(XmlPullParser paramXmlPullParser)
  {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean V(XmlPullParser paramXmlPullParser, String paramString)
  {
    boolean bool;
    if ((U(paramXmlPullParser)) && (paramXmlPullParser.getName().equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean W(char paramChar)
  {
    boolean bool;
    if ((!Character.isWhitespace(paramChar)) && (!Character.isSpaceChar(paramChar))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static String X(String paramString, Object... paramVarArgs)
  {
    String str = String.valueOf(paramString);
    int i = 0;
    for (int j = 0; j < paramVarArgs.length; j++)
    {
      Object localObject = paramVarArgs[j];
      if (localObject == null) {
        paramString = "null";
      } else {
        try
        {
          paramString = localObject.toString();
        }
        catch (Exception paramString)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localObject.getClass().getName());
          localStringBuilder.append('@');
          localStringBuilder.append(Integer.toHexString(System.identityHashCode(localObject)));
          localObject = localStringBuilder.toString();
          Logger localLogger = Logger.getLogger("com.google.common.base.Strings");
          Level localLevel = Level.WARNING;
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Exception during lenientFormat for ");
          localStringBuilder.append((String)localObject);
          localLogger.log(localLevel, localStringBuilder.toString(), paramString);
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("<");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(" threw ");
          localStringBuilder.append(paramString.getClass().getName());
          localStringBuilder.append(">");
          paramString = localStringBuilder.toString();
        }
      }
      paramVarArgs[j] = paramString;
    }
    j = str.length();
    paramString = new StringBuilder(paramVarArgs.length * 16 + j);
    int k = 0;
    for (j = i; j < paramVarArgs.length; j++)
    {
      i = str.indexOf("%s", k);
      if (i == -1) {
        break;
      }
      paramString.append(str, k, i);
      paramString.append(paramVarArgs[j]);
      k = i + 2;
    }
    paramString.append(str, k, str.length());
    if (j < paramVarArgs.length)
    {
      paramString.append(" [");
      k = j + 1;
      paramString.append(paramVarArgs[j]);
      for (j = k; j < paramVarArgs.length; j++)
      {
        paramString.append(", ");
        paramString.append(paramVarArgs[j]);
      }
      paramString.append(']');
    }
    return paramString.toString();
  }
  
  public static q0.c Y(String paramString, p0.a parama, int paramInt)
  {
    Object localObject = null;
    if ((paramInt & 0x2) != 0) {
      parama = null;
    }
    q0.a locala;
    if ((paramInt & 0x4) != 0) {
      locala = q0.a.a;
    } else {
      locala = null;
    }
    if ((paramInt & 0x8) != 0)
    {
      localObject = r0.b;
      a2 locala2 = new a2(null);
      localObject.getClass();
      localObject = nc.e0.a(h.a.a((ub.h)localObject, locala2));
    }
    ec.i.e(paramString, "name");
    ec.i.e(locala, "produceMigrations");
    ec.i.e(localObject, "scope");
    return new q0.c(paramString, parama, locala, (d0)localObject);
  }
  
  public static final void Z(p0 paramp0, ub.e parame, boolean paramBoolean)
  {
    Object localObject1 = paramp0.k();
    Object localObject2 = paramp0.f(localObject1);
    if (localObject2 != null) {
      paramp0 = rb.f.a((Throwable)localObject2);
    } else {
      paramp0 = paramp0.g(localObject1);
    }
    sc.g localg;
    if (paramBoolean)
    {
      ec.i.c(parame, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
      localg = (sc.g)parame;
      parame = e;
      localObject2 = o;
      localObject1 = parame.getContext();
      localObject2 = w.c((ub.h)localObject1, localObject2);
      if (localObject2 != w.a) {
        parame = y.c(parame, (ub.h)localObject1, localObject2);
      } else {
        parame = null;
      }
    }
    try
    {
      e.resumeWith(paramp0);
      paramp0 = rb.h.a;
      if ((parame == null) || (parame.e0())) {
        w.a((ub.h)localObject1, localObject2);
      }
    }
    finally
    {
      if ((parame == null) || (parame.e0())) {
        w.a((ub.h)localObject1, localObject2);
      }
    }
  }
  
  public static final xc.d a0(Socket paramSocket)
  {
    Object localObject = xc.p.a;
    ec.i.e(paramSocket, "<this>");
    localObject = new x(paramSocket);
    paramSocket = paramSocket.getOutputStream();
    ec.i.d(paramSocket, "getOutputStream()");
    return new xc.d((x)localObject, new xc.q(paramSocket, (xc.z)localObject));
  }
  
  public static final xc.e b0(Socket paramSocket)
  {
    Object localObject = xc.p.a;
    ec.i.e(paramSocket, "<this>");
    localObject = new x(paramSocket);
    paramSocket = paramSocket.getInputStream();
    ec.i.d(paramSocket, "getInputStream()");
    return new xc.e((x)localObject, new xc.o(paramSocket, (xc.z)localObject));
  }
  
  public static final long c0(int paramInt, mc.c paramc)
  {
    ec.i.e(paramc, "unit");
    long l;
    if (paramc.compareTo(mc.c.d) <= 0)
    {
      l = a0.p(paramInt, paramc, mc.c.b) << 1;
      paramInt = mc.a.d;
      paramInt = mc.b.a;
    }
    else
    {
      l = d0(paramInt, paramc);
    }
    return l;
  }
  
  public static final long d0(long paramLong, mc.c paramc)
  {
    ec.i.e(paramc, "unit");
    mc.c localc = mc.c.b;
    long l = a0.p(4611686018426999999L, localc, paramc);
    if ((-l <= paramLong) && (paramLong <= l)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramLong = a0.p(paramLong, paramc, localc);
      i = mc.a.d;
      i = mc.b.a;
      return paramLong << 1;
    }
    localc = mc.c.c;
    ec.i.e(localc, "targetUnit");
    paramLong = ic.g.N(a.convert(paramLong, a), -4611686018427387903L, 4611686018427387903L);
    int i = mc.a.d;
    i = mc.b.a;
    return (paramLong << 1) + 1L;
  }
  
  public static final String e0(String paramString)
  {
    ec.i.e(paramString, "<this>");
    List localList = kc.i.N(new lc.j(paramString));
    Object localObject1 = new ArrayList();
    Object localObject2 = localList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if ((true ^ lc.k.t0((String)localObject3))) {
        ((ArrayList)localObject1).add(localObject3);
      }
    }
    localObject2 = new ArrayList(sb.m.j((Iterable)localObject1));
    Object localObject3 = ((ArrayList)localObject1).iterator();
    int i;
    for (;;)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      i = 0;
      if (!bool) {
        break;
      }
      localObject1 = (String)((Iterator)localObject3).next();
      j = ((String)localObject1).length();
      while (i < j)
      {
        if ((W(((String)localObject1).charAt(i)) ^ true)) {
          break label159;
        }
        i++;
      }
      i = -1;
      label159:
      j = i;
      if (i == -1) {
        j = ((String)localObject1).length();
      }
      ((ArrayList)localObject2).add(Integer.valueOf(j));
    }
    localObject3 = ((ArrayList)localObject2).iterator();
    if (!((Iterator)localObject3).hasNext())
    {
      localObject2 = null;
    }
    else
    {
      localObject1 = (Comparable)((Iterator)localObject3).next();
      for (;;)
      {
        localObject2 = localObject1;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        localObject2 = (Comparable)((Iterator)localObject3).next();
        if (((Comparable)localObject1).compareTo(localObject2) > 0) {
          localObject1 = localObject2;
        }
      }
    }
    localObject1 = (Integer)localObject2;
    if (localObject1 != null) {
      i = ((Integer)localObject1).intValue();
    } else {
      i = 0;
    }
    int k = paramString.length();
    int m = localList.size();
    int n = va.a.d(localList);
    localObject1 = new ArrayList();
    localObject2 = localList.iterator();
    int j = 0;
    while (((Iterator)localObject2).hasNext())
    {
      paramString = ((Iterator)localObject2).next();
      if (j >= 0)
      {
        paramString = (String)paramString;
        if (((j == 0) || (j == n)) && (lc.k.t0(paramString)))
        {
          paramString = null;
        }
        else
        {
          ec.i.e(paramString, "<this>");
          if (i >= 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (i1 == 0) {
            break label443;
          }
          int i1 = paramString.length();
          if (i <= i1) {
            i1 = i;
          }
          paramString = paramString.substring(i1);
          ec.i.d(paramString, "substring(...)");
        }
        if (paramString != null) {
          ((ArrayList)localObject1).add(paramString);
        }
        j++;
        continue;
        label443:
        throw new IllegalArgumentException(a0.j.h("Requested character count ", i, " is less than zero.").toString());
      }
      else
      {
        throw new ArithmeticException("Index overflow has happened.");
      }
    }
    paramString = new StringBuilder(m * 0 + k);
    sb.q.o((Iterable)localObject1, paramString, "\n", "", "", -1, "...", null);
    return paramString.toString();
  }
  
  public static final ArrayList f(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      m7.n localn = (m7.n)localIterator.next();
      paramArrayList = new Bundle();
      paramArrayList.putInt("event_type", localn.a());
      paramArrayList.putLong("event_timestamp", localn.b());
      localArrayList.add(paramArrayList);
    }
    return localArrayList;
  }
  
  public static final Object f0(Object paramObject)
  {
    g1 localg1;
    if ((paramObject instanceof g1)) {
      localg1 = (g1)paramObject;
    } else {
      localg1 = null;
    }
    Object localObject = paramObject;
    if (localg1 != null)
    {
      localObject = a;
      if (localObject == null) {
        localObject = paramObject;
      }
    }
    return localObject;
  }
  
  public static final void g(StringBuilder paramStringBuilder, Object paramObject, dc.l paraml)
  {
    if (paraml != null)
    {
      paramObject = paraml.invoke(paramObject);
    }
    else
    {
      boolean bool;
      if (paramObject == null) {
        bool = true;
      } else {
        bool = paramObject instanceof CharSequence;
      }
      if (!bool) {
        break label41;
      }
    }
    paramObject = (CharSequence)paramObject;
    label41:
    if ((paramObject instanceof Character))
    {
      paramStringBuilder.append(((Character)paramObject).charValue());
    }
    else
    {
      paramObject = paramObject.toString();
      paramStringBuilder.append((CharSequence)paramObject);
    }
  }
  
  public static final boolean g0(String paramString, dc.a parama)
  {
    StringBuilder localStringBuilder;
    try
    {
      boolean bool1 = ((Boolean)parama.invoke()).booleanValue();
      bool2 = bool1;
      if (bool1) {
        return bool2;
      }
      bool2 = bool1;
      if (paramString == null) {
        return bool2;
      }
      Log.e("ReflectionGuard", paramString);
      bool2 = bool1;
    }
    catch (NoSuchMethodException parama)
    {
      localStringBuilder = f.l("NoSuchMethod: ");
      str = paramString;
      parama = localStringBuilder;
      if (paramString != null) {
        break label90;
      }
      parama = localStringBuilder;
      break label85;
    }
    catch (ClassNotFoundException parama)
    {
      localStringBuilder = f.l("ClassNotFound: ");
      str = paramString;
      parama = localStringBuilder;
      if (paramString != null) {
        break label90;
      }
    }
    parama = localStringBuilder;
    label85:
    String str = "";
    label90:
    a0.j.t(parama, str, "ReflectionGuard");
    boolean bool2 = false;
    return bool2;
  }
  
  public static boolean h(Bundle paramBundle1, Bundle paramBundle2)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (paramBundle1 == paramBundle2) {
      return true;
    }
    if (paramBundle1 == null)
    {
      if ((paramBundle2.getInt("android.media.browse.extra.PAGE", -1) != -1) || (paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1)) {
        bool3 = false;
      }
      return bool3;
    }
    if (paramBundle2 == null)
    {
      if ((paramBundle1.getInt("android.media.browse.extra.PAGE", -1) == -1) && (paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1)) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    if ((paramBundle1.getInt("android.media.browse.extra.PAGE", -1) == paramBundle2.getInt("android.media.browse.extra.PAGE", -1)) && (paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) == paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1))) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public static void h0(String paramString1, String paramString2, Object... paramVarArgs)
  {
    y(2, paramString1, paramString2, paramVarArgs);
  }
  
  public static void i(String paramString)
  {
    if (v5.e0.a >= 18) {
      Trace.beginSection(paramString);
    }
  }
  
  public static Object i0(Bundle paramBundle, String paramString, Class paramClass, Object paramObject)
  {
    paramBundle = paramBundle.get(paramString);
    if (paramBundle == null) {
      return paramObject;
    }
    if (paramClass.isAssignableFrom(paramBundle.getClass())) {
      return paramBundle;
    }
    throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[] { paramString, paramClass.getCanonicalName(), paramBundle.getClass().getCanonicalName() }));
  }
  
  public static final void j(dc.l paraml, Object paramObject, ub.h paramh)
  {
    paraml = k(paraml, paramObject, null);
    if (paraml != null) {
      c0.a(paramh, paraml);
    }
  }
  
  public static void j0(Bundle paramBundle, Object paramObject)
  {
    if ((paramObject instanceof Double))
    {
      paramBundle.putDouble("value", ((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramBundle.putLong("value", ((Long)paramObject).longValue());
      return;
    }
    paramBundle.putString("value", paramObject.toString());
  }
  
  /* Error */
  public static final n7.w k(dc.l paraml, Object paramObject, n7.w paramw)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface 953 2 0
    //   7: pop
    //   8: goto +21 -> 29
    //   11: astore_0
    //   12: aload_2
    //   13: ifnull +18 -> 31
    //   16: aload_2
    //   17: invokevirtual 536	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   20: aload_0
    //   21: if_acmpeq +10 -> 31
    //   24: aload_2
    //   25: aload_0
    //   26: invokestatic 478	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   29: aload_2
    //   30: areturn
    //   31: new 205	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 206	java/lang/StringBuilder:<init>	()V
    //   38: astore_2
    //   39: aload_2
    //   40: ldc_w 1053
    //   43: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_2
    //   48: aload_1
    //   49: invokevirtual 638	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: new 1055	n7/w
    //   56: dup
    //   57: aload_2
    //   58: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: aload_0
    //   62: invokespecial 1056	n7/w:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   65: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paraml	dc.l
    //   0	66	1	paramObject	Object
    //   0	66	2	paramw	n7.w
    // Exception table:
    //   from	to	target	type
    //   0	8	11	finally
  }
  
  public static final void l(ub.h paramh, CancellationException paramCancellationException)
  {
    paramh = (j1)paramh.get(j1.b.a);
    if (paramh != null) {
      paramh.cancel(paramCancellationException);
    }
  }
  
  public static void n(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static void o(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" cannot be negative but was: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static void p(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new NullPointerException(paramString);
  }
  
  public static final void q(int paramInt)
  {
    int i;
    if ((2 <= paramInt) && (paramInt < 37)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    StringBuilder localStringBuilder = a0.j.n("radix ", paramInt, " was not in valid range ");
    localStringBuilder.append(new ic.f(2, 36));
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static final int s(Comparable paramComparable1, Comparable paramComparable2)
  {
    if (paramComparable1 == paramComparable2) {
      return 0;
    }
    if (paramComparable1 == null) {
      return -1;
    }
    if (paramComparable2 == null) {
      return 1;
    }
    return paramComparable1.compareTo(paramComparable2);
  }
  
  public static final ub.e u(Object paramObject, ub.e parame, dc.p paramp)
  {
    ec.i.e(paramp, "<this>");
    ec.i.e(parame, "completion");
    if ((paramp instanceof wb.a))
    {
      paramObject = ((wb.a)paramp).create(paramObject, parame);
    }
    else
    {
      ub.h localh = parame.getContext();
      if (localh == ub.i.a) {
        paramObject = new vb.b(paramObject, parame, paramp);
      } else {
        paramObject = new vb.c(parame, localh, paramp, paramObject);
      }
    }
    return (ub.e)paramObject;
  }
  
  public static final k0 v(Context paramContext, androidx.work.a parama)
  {
    ec.i.e(paramContext, "context");
    ec.i.e(parama, "configuration");
    a3.c localc = new a3.c(b);
    Object localObject1 = paramContext.getApplicationContext();
    ec.i.d(localObject1, "context.applicationContext");
    Object localObject2 = a;
    ec.i.d(localObject2, "workTaskExecutor.serialTaskExecutor");
    Object localObject3 = c;
    boolean bool = paramContext.getResources().getBoolean(2131034118);
    ec.i.e(localObject3, "clock");
    Object localObject4;
    if (bool)
    {
      localObject4 = new j.a((Context)localObject1, null);
      j = true;
    }
    else
    {
      if (!(lc.k.t0("androidx.work.workdb") ^ true)) {
        break label2422;
      }
      localObject4 = new j.a((Context)localObject1, "androidx.work.workdb");
      i = new z((Context)localObject1);
    }
    g = ((Executor)localObject2);
    localObject3 = new b((m0)localObject3);
    d.add(localObject3);
    ((j.a)localObject4).a(new q1.b[] { i.c });
    ((j.a)localObject4).a(new q1.b[] { new s((Context)localObject1, 2, 3) });
    ((j.a)localObject4).a(new q1.b[] { j.c });
    ((j.a)localObject4).a(new q1.b[] { k.c });
    ((j.a)localObject4).a(new q1.b[] { new s((Context)localObject1, 5, 6) });
    ((j.a)localObject4).a(new q1.b[] { l.c });
    ((j.a)localObject4).a(new q1.b[] { m.c });
    ((j.a)localObject4).a(new q1.b[] { n.c });
    ((j.a)localObject4).a(new q1.b[] { new n0((Context)localObject1) });
    ((j.a)localObject4).a(new q1.b[] { new s((Context)localObject1, 10, 11) });
    ((j.a)localObject4).a(new q1.b[] { e.c });
    ((j.a)localObject4).a(new q1.b[] { f.c });
    ((j.a)localObject4).a(new q1.b[] { g.c });
    ((j.a)localObject4).a(new q1.b[] { h.c });
    l = false;
    m = true;
    localObject1 = g;
    if ((localObject1 == null) && (h == null))
    {
      localObject1 = m.c.d;
      h = ((Executor)localObject1);
    }
    else
    {
      if ((localObject1 != null) && (h == null))
      {
        h = ((Executor)localObject1);
        break label488;
      }
      if (localObject1 != null) {
        break label488;
      }
      localObject1 = h;
    }
    g = ((Executor)localObject1);
    label488:
    localObject1 = q;
    if (localObject1 != null)
    {
      localObject1 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        i = ((Number)((Iterator)localObject1).next()).intValue();
        if (!(p.contains(Integer.valueOf(i)) ^ true)) {
          throw new IllegalArgumentException(f.h("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", i).toString());
        }
      }
    }
    localObject3 = i;
    localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = new a0();
    }
    if (n > 0L)
    {
      if (c != null) {
        throw new IllegalArgumentException("Required value was null.".toString());
      }
      throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
    }
    Object localObject5 = a;
    localObject3 = c;
    localObject2 = o;
    Object localObject6 = d;
    bool = j;
    int i = k;
    if (i != 0)
    {
      ec.i.e(localObject5, "context");
      if (i == 1)
      {
        localObject7 = ((Context)localObject5).getSystemService("activity");
        ec.i.c(localObject7, "null cannot be cast to non-null type android.app.ActivityManager");
        if (!((ActivityManager)localObject7).isLowRamDevice()) {
          i = 3;
        } else {
          i = 2;
        }
      }
      Object localObject7 = g;
      if (localObject7 != null)
      {
        Executor localExecutor = h;
        if (localExecutor != null)
        {
          localObject3 = new p1.b((Context)localObject5, (String)localObject3, (c.c)localObject1, (j.c)localObject2, (ArrayList)localObject6, bool, i, (Executor)localObject7, localExecutor, l, m, p, e, f);
          localObject2 = b;
          ec.i.e(localObject2, "klass");
          localObject4 = ((Class)localObject2).getPackage();
          ec.i.b(localObject4);
          localObject6 = ((Package)localObject4).getName();
          localObject4 = ((Class)localObject2).getCanonicalName();
          ec.i.b(localObject4);
          ec.i.d(localObject6, "fullPackage");
          if (((String)localObject6).length() == 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0)
          {
            localObject4 = ((String)localObject4).substring(((String)localObject6).length() + 1);
            ec.i.d(localObject4, "this as java.lang.String).substring(startIndex)");
          }
          localObject1 = new StringBuilder();
          localObject4 = ((String)localObject4).replace('.', '_');
          ec.i.d(localObject4, "replace(...)");
          ((StringBuilder)localObject1).append((String)localObject4);
          ((StringBuilder)localObject1).append("_Impl");
          localObject1 = ((StringBuilder)localObject1).toString();
          try
          {
            if (((String)localObject6).length() == 0) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              localObject4 = localObject1;
            }
            else
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append((String)localObject6);
              ((StringBuilder)localObject4).append('.');
              ((StringBuilder)localObject4).append((String)localObject1);
              localObject4 = ((StringBuilder)localObject4).toString();
            }
            localObject4 = Class.forName((String)localObject4, true, ((Class)localObject2).getClassLoader());
            ec.i.c(localObject4, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            localObject4 = ((Class)localObject4).newInstance();
            localObject2 = (p1.j)localObject4;
            localObject2.getClass();
            d = ((p1.j)localObject2).e((p1.b)localObject3);
            localObject1 = ((p1.j)localObject2).h();
            localObject4 = new BitSet();
            localObject6 = ((Set)localObject1).iterator();
            int j;
            for (;;)
            {
              bool = ((Iterator)localObject6).hasNext();
              j = -1;
              if (!bool) {
                break label1303;
              }
              localObject1 = (Class)((Iterator)localObject6).next();
              int k = p.size() - 1;
              i = j;
              if (k >= 0) {
                for (i = k;; i = k)
                {
                  k = i - 1;
                  if (((Class)localObject1).isAssignableFrom(p.get(i).getClass()))
                  {
                    ((BitSet)localObject4).set(i);
                    break;
                  }
                  if (k < 0)
                  {
                    i = j;
                    break;
                  }
                }
              }
              if (i >= 0) {
                j = 1;
              } else {
                j = 0;
              }
              if (j == 0) {
                break;
              }
              h.put(localObject1, p.get(i));
            }
            paramContext = f.l("A required auto migration spec (");
            paramContext.append(((Class)localObject1).getCanonicalName());
            paramContext.append(") is missing in the database configuration.");
            throw new IllegalArgumentException(paramContext.toString().toString());
            label1303:
            i = p.size() - 1;
            if (i >= 0)
            {
              for (;;)
              {
                j = i - 1;
                if (!((BitSet)localObject4).get(i)) {
                  break;
                }
                if (j < 0) {
                  break label1367;
                }
                i = j;
              }
              throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
            }
            label1367:
            localObject5 = ((p1.j)localObject2).f(h).iterator();
            while (((Iterator)localObject5).hasNext())
            {
              localObject6 = (q1.b)((Iterator)localObject5).next();
              localObject4 = d;
              i = a;
              j = b;
              localObject4 = a;
              if (((Map)localObject4).containsKey(Integer.valueOf(i)))
              {
                localObject1 = (Map)((LinkedHashMap)localObject4).get(Integer.valueOf(i));
                localObject4 = localObject1;
                if (localObject1 == null) {
                  localObject4 = sb.t.a;
                }
                bool = ((Map)localObject4).containsKey(Integer.valueOf(j));
              }
              else
              {
                bool = false;
              }
              if (!bool) {
                d.a(new q1.b[] { localObject6 });
              }
            }
            localObject4 = (p1.o)p1.j.o(p1.o.class, ((p1.j)localObject2).g());
            if (localObject4 != null) {
              a = ((p1.b)localObject3);
            }
            if ((p1.a)p1.j.o(p1.a.class, ((p1.j)localObject2).g()) == null)
            {
              if (g == 3) {
                bool = true;
              } else {
                bool = false;
              }
              ((p1.j)localObject2).g().setWriteAheadLoggingEnabled(bool);
              g = e;
              b = h;
              c = new p1.q(i);
              f = f;
              localObject6 = j;
              if (localObject6 != null)
              {
                localObject5 = b;
                if (localObject5 != null)
                {
                  localObject1 = e;
                  localObject7 = a;
                  localObject1.getClass();
                  ec.i.e(localObject7, "context");
                  localObject4 = a.b;
                  if (localObject4 != null)
                  {
                    new MultiInstanceInvalidationClient((Context)localObject7, (String)localObject5, (Intent)localObject6, (p1.e)localObject1, (Executor)localObject4);
                  }
                  else
                  {
                    ec.i.i("internalQueryExecutor");
                    throw null;
                  }
                }
                else
                {
                  throw new IllegalArgumentException("Required value was null.".toString());
                }
              }
              localObject1 = ((p1.j)localObject2).i();
              localObject4 = new BitSet();
              localObject5 = ((Map)localObject1).entrySet().iterator();
              while (((Iterator)localObject5).hasNext())
              {
                localObject6 = (Map.Entry)((Iterator)localObject5).next();
                localObject1 = (Class)((Map.Entry)localObject6).getKey();
                localObject7 = ((List)((Map.Entry)localObject6).getValue()).iterator();
                while (((Iterator)localObject7).hasNext())
                {
                  localObject6 = (Class)((Iterator)localObject7).next();
                  i = o.size() - 1;
                  if (i >= 0) {
                    for (;;)
                    {
                      j = i - 1;
                      if (((Class)localObject6).isAssignableFrom(o.get(i).getClass()))
                      {
                        ((BitSet)localObject4).set(i);
                        break label1924;
                      }
                      if (j < 0) {
                        break;
                      }
                      i = j;
                    }
                  }
                  i = -1;
                  label1924:
                  if (i >= 0) {
                    j = 1;
                  } else {
                    j = 0;
                  }
                  if (j == 0) {
                    break label1971;
                  }
                  l.put(localObject6, o.get(i));
                }
                continue;
                label1971:
                paramContext = new StringBuilder();
                paramContext.append("A required type converter (");
                paramContext.append(localObject6);
                paramContext.append(") for ");
                paramContext.append(((Class)localObject1).getCanonicalName());
                paramContext.append(" is missing in the database configuration.");
                throw new IllegalArgumentException(paramContext.toString().toString());
              }
              i = o.size() - 1;
              if (i >= 0)
              {
                for (;;)
                {
                  j = i - 1;
                  if (!((BitSet)localObject4).get(i)) {
                    break;
                  }
                  if (j < 0) {
                    break label2139;
                  }
                  i = j;
                }
                parama = o.get(i);
                paramContext = new StringBuilder();
                paramContext.append("Unexpected type converter ");
                paramContext.append(parama);
                paramContext.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                throw new IllegalArgumentException(paramContext.toString());
              }
              label2139:
              localObject4 = (WorkDatabase)localObject2;
              localObject1 = paramContext.getApplicationContext();
              ec.i.d(localObject1, "context.applicationContext");
              localObject1 = new v2.n((Context)localObject1, localc);
              localObject3 = new r(paramContext.getApplicationContext(), parama, localc, (WorkDatabase)localObject4);
              localObject2 = l0.a;
              ec.i.e(localObject2, "schedulersCreator");
              localObject2 = ((l0)localObject2).e(paramContext, parama, localc, (WorkDatabase)localObject4, (v2.n)localObject1, (r)localObject3);
              return new k0(paramContext.getApplicationContext(), parama, localc, (WorkDatabase)localObject4, (List)localObject2, (r)localObject3, (v2.n)localObject1);
            }
            e.getClass();
            ec.i.e(null, "autoCloser");
            throw null;
          }
          catch (InstantiationException paramContext)
          {
            paramContext = new StringBuilder();
            paramContext.append("Failed to create an instance of ");
            paramContext.append(localObject2);
            paramContext.append(".canonicalName");
            throw new RuntimeException(paramContext.toString());
          }
          catch (IllegalAccessException paramContext)
          {
            paramContext = new StringBuilder();
            paramContext.append("Cannot access the constructor ");
            paramContext.append(localObject2);
            paramContext.append(".canonicalName");
            throw new RuntimeException(paramContext.toString());
          }
          catch (ClassNotFoundException paramContext)
          {
            paramContext = f.l("Cannot find implementation for ");
            paramContext.append(((Class)localObject2).getCanonicalName());
            paramContext.append(". ");
            paramContext.append((String)localObject1);
            paramContext.append(" does not exist");
            throw new RuntimeException(paramContext.toString());
          }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
      }
      throw new IllegalArgumentException("Required value was null.".toString());
    }
    throw null;
    label2422:
    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    y(1, paramString1, paramString2, paramVarArgs);
  }
  
  public static j9.o x(String paramString)
  {
    int i = paramString.length();
    boolean bool;
    if (i >= 2) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Invalid path \"%s\"", bool, new Object[] { paramString });
    if (i == 2)
    {
      if ((paramString.charAt(0) == '\001') && (paramString.charAt(1) == '\001')) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Non-empty path \"%s\" had length 2", bool, new Object[] { paramString });
      paramString = Collections.emptyList();
    }
    else
    {
      int j = paramString.length();
      ArrayList localArrayList = new ArrayList();
      StringBuilder localStringBuilder = new StringBuilder();
      int k = 0;
      while (k < i)
      {
        int m = paramString.indexOf(1, k);
        if ((m >= 0) && (m <= j - 2))
        {
          int n = m + 1;
          int i1 = paramString.charAt(n);
          if (i1 != 1)
          {
            if (i1 != 16)
            {
              if (i1 == 17) {
                localStringBuilder.append(paramString.substring(k, n));
              } else {
                throw new IllegalArgumentException(g.e("Invalid encoded resource path: \"", paramString, "\""));
              }
            }
            else
            {
              localStringBuilder.append(paramString.substring(k, m));
              localStringBuilder.append('\000');
            }
          }
          else
          {
            localObject = paramString.substring(k, m);
            if (localStringBuilder.length() != 0)
            {
              localStringBuilder.append((String)localObject);
              localObject = localStringBuilder.toString();
              localStringBuilder.setLength(0);
            }
            localArrayList.add(localObject);
          }
          k = m + 2;
        }
        else
        {
          throw new IllegalArgumentException(g.e("Invalid encoded resource path: \"", paramString, "\""));
        }
      }
      paramString = localArrayList;
    }
    Object localObject = j9.o.b;
    if (paramString.isEmpty()) {
      paramString = j9.o.b;
    } else {
      paramString = new j9.o(paramString);
    }
    return paramString;
  }
  
  public static void y(int paramInt, String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (paramInt != 0)
    {
      int i = paramInt - 1;
      if (i >= q0.g.c(p))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(String.format("(%s) [%s]: ", new Object[] { "25.1.2", paramString1 }));
        localStringBuilder.append(String.format(paramString2, paramVarArgs));
        paramString1 = localStringBuilder.toString();
        if (paramInt != 0)
        {
          if (i != 0)
          {
            if (i != 1)
            {
              if (i == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
              }
            }
            else {
              Log.w("Firestore", paramString1);
            }
          }
          else {
            Log.i("Firestore", paramString1);
          }
        }
        else {
          throw null;
        }
      }
      return;
    }
    throw null;
  }
  
  public static boolean z(Method paramMethod, ec.d paramd)
  {
    paramd = paramd.d();
    ec.i.c(paramd, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
    return paramMethod.getReturnType().equals(paramd);
  }
  
  public long a()
  {
    return System.currentTimeMillis();
  }
  
  public String b(String paramString1, String paramString2)
  {
    return null;
  }
  
  public void c(String paramString1, String paramString2)
  {
    ec.i.e(paramString1, "tag");
    ec.i.e(paramString2, "message");
    Log.d(paramString1, paramString2);
  }
  
  public Object d(k6.j paramj)
  {
    return b;
  }
  
  public long e()
  {
    return System.currentTimeMillis() * 1000L;
  }
  
  public void m() {}
  
  public v r(int paramInt1, int paramInt2)
  {
    return new c4.g();
  }
  
  public void t(c4.t paramt) {}
  
  public Object then(Task paramTask)
  {
    return ((r9.f)paramTask.getResult()).a();
  }
}

/* Location:
 * Qualified Name:     p2.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */