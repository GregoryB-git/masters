package b;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import b1.o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.Registrar;
import d2.h0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.g1;
import nc.o1;
import nc.t;
import o5.f;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import t1.c.b;
import t1.c.c;
import v5.e0;
import x2.s;
import xc.v;

public class a0
  implements Continuation, h8.a, d2.k0, SuccessContinuation, q9.d, d8.e, s8.c, c.c
{
  public static final int[] A;
  public static final int[] B;
  public static final int[] C;
  public static final int[] D;
  public static final int[] E;
  public static final int[] F;
  public static final int[] G;
  public static final int[] H;
  public static final int[] I;
  public static final int[] J;
  public static final int[] K;
  public static final int[] L;
  public static final int[] M;
  public static final int[] N;
  public static final int[] P;
  public static final int[] Q;
  public static final h0 R;
  public static final h0 S;
  public static final int[] T;
  public static final Object[] U;
  public static final a0 V;
  public static final int[] W;
  public static final h0 X;
  public static final h0 Y;
  public static final h0 Z;
  public static final String[] a;
  public static final int[] a0;
  public static final String[] b;
  public static final int[] b0;
  public static final String[] c;
  public static final int[] c0;
  public static final String[] d;
  public static final int[] d0;
  public static final String[] e;
  public static final int[] e0;
  public static final int[] f;
  public static final byte[] f0;
  public static final String[] g0;
  public static final char[] h0;
  public static final char[] i0;
  public static final h0 j0;
  public static final int[] o;
  public static final int[] p;
  public static final int[] q;
  public static final int[] r;
  public static final int[] s;
  public static final int[] t;
  public static final int[] u;
  public static final int[] v;
  public static final int[] w;
  public static final int[] x;
  public static final int[] y;
  public static final int[] z;
  
  public static long A(int paramInt1, int paramInt2, v5.u paramu)
  {
    paramu.G(paramInt1);
    if (c - b < 5) {
      return -9223372036854775807L;
    }
    paramInt1 = paramu.f();
    if ((0x800000 & paramInt1) != 0) {
      return -9223372036854775807L;
    }
    if ((0x1FFF00 & paramInt1) >> 8 != paramInt2) {
      return -9223372036854775807L;
    }
    if ((paramInt1 & 0x20) != 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    if (paramInt1 == 0) {
      return -9223372036854775807L;
    }
    if ((paramu.v() >= 7) && (c - b >= 7))
    {
      if ((paramu.v() & 0x10) == 16) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 != 0)
      {
        byte[] arrayOfByte = new byte[6];
        paramu.d(arrayOfByte, 0, 6);
        long l1 = arrayOfByte[0];
        long l2 = arrayOfByte[1];
        long l3 = arrayOfByte[2];
        return (arrayOfByte[3] & 0xFF) << 1 | (l1 & 0xFF) << 25 | (l2 & 0xFF) << 17 | (l3 & 0xFF) << 9 | (arrayOfByte[4] & 0xFF) >> 7;
      }
    }
    return -9223372036854775807L;
  }
  
  public static f B(f paramf, String[] paramArrayOfString, Map paramMap)
  {
    int i = 0;
    int j = 0;
    if (paramf == null)
    {
      if (paramArrayOfString == null) {
        return null;
      }
      if (paramArrayOfString.length == 1) {
        return (f)paramMap.get(paramArrayOfString[0]);
      }
      if (paramArrayOfString.length > 1)
      {
        paramf = new f();
        i = paramArrayOfString.length;
        while (j < i)
        {
          paramf.a((f)paramMap.get(paramArrayOfString[j]));
          j++;
        }
        return paramf;
      }
    }
    else
    {
      if ((paramArrayOfString != null) && (paramArrayOfString.length == 1))
      {
        paramf.a((f)paramMap.get(paramArrayOfString[0]));
        return paramf;
      }
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 1))
      {
        int k = paramArrayOfString.length;
        for (j = i; j < k; j++) {
          paramf.a((f)paramMap.get(paramArrayOfString[j]));
        }
      }
    }
    return paramf;
  }
  
  /* Error */
  public static final void C(ub.e parame, Object paramObject, dc.l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: instanceof 838
    //   4: ifeq +350 -> 354
    //   7: aload_0
    //   8: checkcast 838	sc/g
    //   11: astore_3
    //   12: aload_1
    //   13: invokestatic 843	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   16: astore_0
    //   17: iconst_0
    //   18: istore 4
    //   20: aload_0
    //   21: ifnonnull +25 -> 46
    //   24: aload_2
    //   25: ifnull +16 -> 41
    //   28: new 845	nc/v
    //   31: dup
    //   32: aload_1
    //   33: aload_2
    //   34: invokespecial 848	nc/v:<init>	(Ljava/lang/Object;Ldc/l;)V
    //   37: astore_0
    //   38: goto +18 -> 56
    //   41: aload_1
    //   42: astore_0
    //   43: goto +13 -> 56
    //   46: new 850	nc/u
    //   49: dup
    //   50: aload_0
    //   51: iconst_0
    //   52: invokespecial 853	nc/u:<init>	(Ljava/lang/Throwable;Z)V
    //   55: astore_0
    //   56: aload_3
    //   57: getfield 856	sc/g:d	Lnc/a0;
    //   60: astore_2
    //   61: aload_3
    //   62: invokevirtual 860	sc/g:getContext	()Lub/h;
    //   65: pop
    //   66: aload_2
    //   67: invokevirtual 866	nc/a0:B0	()Z
    //   70: ifeq +28 -> 98
    //   73: aload_3
    //   74: aload_0
    //   75: putfield 869	sc/g:f	Ljava/lang/Object;
    //   78: aload_3
    //   79: iconst_1
    //   80: putfield 872	nc/p0:c	I
    //   83: aload_3
    //   84: getfield 856	sc/g:d	Lnc/a0;
    //   87: aload_3
    //   88: invokevirtual 860	sc/g:getContext	()Lub/h;
    //   91: aload_3
    //   92: invokevirtual 876	nc/a0:z0	(Lub/h;Ljava/lang/Runnable;)V
    //   95: goto +266 -> 361
    //   98: invokestatic 881	nc/c2:a	()Lnc/x0;
    //   101: astore_2
    //   102: aload_2
    //   103: invokevirtual 886	nc/x0:F0	()Z
    //   106: ifeq +21 -> 127
    //   109: aload_3
    //   110: aload_0
    //   111: putfield 869	sc/g:f	Ljava/lang/Object;
    //   114: aload_3
    //   115: iconst_1
    //   116: putfield 872	nc/p0:c	I
    //   119: aload_2
    //   120: aload_3
    //   121: invokevirtual 890	nc/x0:D0	(Lnc/p0;)V
    //   124: goto +237 -> 361
    //   127: aload_2
    //   128: iconst_1
    //   129: invokevirtual 894	nc/x0:E0	(Z)V
    //   132: aload_3
    //   133: invokevirtual 860	sc/g:getContext	()Lub/h;
    //   136: getstatic 899	nc/j1$b:a	Lnc/j1$b;
    //   139: invokeinterface 904 2 0
    //   144: checkcast 906	nc/j1
    //   147: astore 5
    //   149: iload 4
    //   151: istore 6
    //   153: aload 5
    //   155: ifnull +52 -> 207
    //   158: iload 4
    //   160: istore 6
    //   162: aload 5
    //   164: invokeinterface 909 1 0
    //   169: ifne +38 -> 207
    //   172: aload 5
    //   174: invokeinterface 913 1 0
    //   179: astore 5
    //   181: aload_3
    //   182: aload_0
    //   183: aload 5
    //   185: invokevirtual 916	sc/g:a	(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    //   188: aload_3
    //   189: aload 5
    //   191: invokestatic 921	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   194: invokevirtual 925	sc/g:resumeWith	(Ljava/lang/Object;)V
    //   197: iconst_1
    //   198: istore 6
    //   200: goto +7 -> 207
    //   203: astore_0
    //   204: goto +128 -> 332
    //   207: iload 6
    //   209: ifne +109 -> 318
    //   212: aload_3
    //   213: getfield 928	sc/g:e	Lub/e;
    //   216: astore_0
    //   217: aload_3
    //   218: getfield 930	sc/g:o	Ljava/lang/Object;
    //   221: astore 7
    //   223: aload_0
    //   224: invokeinterface 933 1 0
    //   229: astore 5
    //   231: aload 5
    //   233: aload 7
    //   235: invokestatic 938	sc/w:c	(Lub/h;Ljava/lang/Object;)Ljava/lang/Object;
    //   238: astore 7
    //   240: aload 7
    //   242: getstatic 940	sc/w:a	Ld2/h0;
    //   245: if_acmpeq +15 -> 260
    //   248: aload_0
    //   249: aload 5
    //   251: aload 7
    //   253: invokestatic 945	nc/y:c	(Lub/e;Lub/h;Ljava/lang/Object;)Lnc/g2;
    //   256: astore_0
    //   257: goto +5 -> 262
    //   260: aconst_null
    //   261: astore_0
    //   262: aload_3
    //   263: getfield 928	sc/g:e	Lub/e;
    //   266: aload_1
    //   267: invokeinterface 946 2 0
    //   272: getstatic 951	rb/h:a	Lrb/h;
    //   275: astore_1
    //   276: aload_0
    //   277: ifnull +10 -> 287
    //   280: aload_0
    //   281: invokevirtual 955	nc/g2:e0	()Z
    //   284: ifeq +34 -> 318
    //   287: aload 5
    //   289: aload 7
    //   291: invokestatic 958	sc/w:a	(Lub/h;Ljava/lang/Object;)V
    //   294: goto +24 -> 318
    //   297: astore_1
    //   298: aload_0
    //   299: ifnull +10 -> 309
    //   302: aload_0
    //   303: invokevirtual 955	nc/g2:e0	()Z
    //   306: ifeq +10 -> 316
    //   309: aload 5
    //   311: aload 7
    //   313: invokestatic 958	sc/w:a	(Lub/h;Ljava/lang/Object;)V
    //   316: aload_1
    //   317: athrow
    //   318: aload_2
    //   319: invokevirtual 961	nc/x0:H0	()Z
    //   322: istore 8
    //   324: iload 8
    //   326: ifne -8 -> 318
    //   329: goto +9 -> 338
    //   332: aload_3
    //   333: aload_0
    //   334: aconst_null
    //   335: invokevirtual 965	nc/p0:i	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   338: aload_2
    //   339: iconst_1
    //   340: invokevirtual 968	nc/x0:C0	(Z)V
    //   343: goto +18 -> 361
    //   346: astore_0
    //   347: aload_2
    //   348: iconst_1
    //   349: invokevirtual 968	nc/x0:C0	(Z)V
    //   352: aload_0
    //   353: athrow
    //   354: aload_0
    //   355: aload_1
    //   356: invokeinterface 946 2 0
    //   361: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	parame	ub.e
    //   0	362	1	paramObject	Object
    //   0	362	2	paraml	dc.l
    //   11	322	3	localg	sc.g
    //   18	141	4	i	int
    //   147	163	5	localObject1	Object
    //   151	57	6	j	int
    //   221	91	7	localObject2	Object
    //   322	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   132	149	203	finally
    //   162	197	203	finally
    //   212	257	203	finally
    //   280	287	203	finally
    //   287	294	203	finally
    //   302	309	203	finally
    //   309	316	203	finally
    //   316	318	203	finally
    //   318	324	203	finally
    //   262	276	297	finally
    //   332	338	346	finally
  }
  
  public static final int E(v paramv, int paramInt)
  {
    ec.i.e(paramv, "<this>");
    int[] arrayOfInt = f;
    int i = paramInt + 1;
    int j = 0;
    paramInt = e.length;
    ec.i.e(arrayOfInt, "<this>");
    paramInt--;
    while (j <= paramInt)
    {
      int k = j + paramInt >>> 1;
      int m = arrayOfInt[k];
      if (m < i)
      {
        j = k + 1;
      }
      else
      {
        paramInt = k;
        if (m <= i) {
          break label93;
        }
        paramInt = k - 1;
      }
    }
    paramInt = -j - 1;
    label93:
    if (paramInt < 0) {
      paramInt = paramInt;
    }
    return paramInt;
  }
  
  public static final void F(View paramView, y paramy)
  {
    ec.i.e(paramView, "<this>");
    ec.i.e(paramy, "onBackPressedDispatcherOwner");
    paramView.setTag(2131362063, paramy);
  }
  
  public static final void G(View paramView, o paramo)
  {
    ec.i.e(paramView, "<this>");
    paramView.setTag(2131362062, paramo);
  }
  
  public static final void H(View paramView, s1.e parame)
  {
    ec.i.e(paramView, "<this>");
    paramView.setTag(2131362064, parame);
  }
  
  public static void K(Status paramStatus, Object paramObject, TaskCompletionSource paramTaskCompletionSource)
  {
    if (paramStatus.D())
    {
      paramTaskCompletionSource.setResult(paramObject);
      return;
    }
    paramTaskCompletionSource.setException(r(paramStatus));
  }
  
  public static boolean L(c4.i parami, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l1 = parami.getLength();
    boolean bool1 = l1 < -1L;
    long l2 = 4096L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 4096L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int i = (int)l3;
    v5.u localu = new v5.u(64);
    int j = 0;
    boolean bool3 = false;
    boolean bool4 = bool3;
    boolean bool2;
    while (bool3 < i)
    {
      localu.D(8);
      if (parami.c(a, j, 8, true))
      {
        l2 = localu.w();
        boolean bool5 = localu.f();
        boolean bool6 = true;
        if (l2 == 1L)
        {
          parami.m(a, 8, 8);
          localu.F(16);
          l3 = localu.o();
        }
        else
        {
          l3 = l2;
          if (l2 == 0L)
          {
            long l4 = parami.getLength();
            l3 = l2;
            if (l4 != -1L) {
              l3 = l4 - parami.d() + 8;
            }
          }
          bool6 = true;
        }
        l2 = bool6;
        if (l3 < l2) {
          return j;
        }
        boolean bool7 = bool3 + bool6;
        int k;
        if (bool5 == 1836019574)
        {
          bool3 = i + (int)l3;
          if ((bool1) && (bool3 > l1)) {
            bool3 = (int)l1;
          }
          k = bool3;
          bool3 = bool7;
          bool5 = bool4;
        }
        else
        {
          if ((bool5 == 1836019558) || (bool5 == 1836475768)) {
            break label593;
          }
          if (bool7 + l3 - l2 >= i)
          {
            bool2 = false;
            break;
          }
          int m = (int)(l3 - l2);
          boolean bool8 = bool7 + m;
          if (bool5 == 1718909296)
          {
            if (m < 8) {
              return false;
            }
            localu.D(m);
            parami.m(a, 0, m);
            bool5 = m / 4;
            for (bool2 = false;; bool2++)
            {
              bool7 = bool4;
              if (bool2 >= bool5) {
                break;
              }
              if (bool2 == true)
              {
                localu.H(4);
              }
              else
              {
                bool7 = localu.f();
                int[] arrayOfInt;
                if ((bool7 >>> true != 3368816) && ((bool7 != 1751476579) || (!paramBoolean2))) {
                  arrayOfInt = P;
                }
                for (bool3 = false; bool3 < true; bool3++) {
                  if (arrayOfInt[bool3] == bool7)
                  {
                    bool3 = true;
                    break label495;
                  }
                }
                bool3 = false;
                label495:
                if (bool3)
                {
                  bool7 = true;
                  break;
                }
              }
            }
            bool2 = false;
            k = i;
            bool3 = bool8;
            bool5 = bool7;
            if (!bool7) {
              return false;
            }
          }
          else
          {
            bool7 = false;
            bool2 = bool7;
            k = i;
            bool3 = bool8;
            bool5 = bool4;
            if (m != 0)
            {
              parami.e(m);
              bool5 = bool4;
              bool3 = bool8;
              k = i;
              bool2 = bool7;
            }
          }
        }
        i = k;
        bool4 = bool5;
        continue;
        label593:
        bool3 = true;
        break label603;
      }
    }
    bool3 = bool2;
    label603:
    if ((bool4) && (paramBoolean1 == bool3)) {
      bool2 = true;
    }
    return bool2;
  }
  
  /* Error */
  public static final Object M(long paramLong, dc.p paramp, ub.e parame)
  {
    // Byte code:
    //   0: lload_0
    //   1: lconst_0
    //   2: lcmp
    //   3: ifle +197 -> 200
    //   6: new 1060	nc/e2
    //   9: dup
    //   10: lload_0
    //   11: aload_3
    //   12: invokespecial 1063	nc/e2:<init>	(JLub/e;)V
    //   15: astore 4
    //   17: aload 4
    //   19: new 1065	nc/v0
    //   22: dup
    //   23: aload 4
    //   25: getfield 1069	sc/s:d	Lub/e;
    //   28: invokeinterface 933 1 0
    //   33: invokestatic 1074	nc/m0:b	(Lub/h;)Lnc/l0;
    //   36: aload 4
    //   38: getfield 1076	nc/e2:e	J
    //   41: aload 4
    //   43: aload 4
    //   45: getfield 1081	nc/a:c	Lub/h;
    //   48: invokeinterface 1087 5 0
    //   53: invokespecial 1090	nc/v0:<init>	(Lnc/t0;)V
    //   56: invokevirtual 1096	nc/o1:invokeOnCompletion	(Ldc/l;)Lnc/t0;
    //   59: pop
    //   60: iconst_0
    //   61: istore 5
    //   63: iconst_2
    //   64: aload_2
    //   65: invokestatic 1100	ec/v:a	(ILjava/lang/Object;)V
    //   68: aload_2
    //   69: aload 4
    //   71: aload 4
    //   73: invokeinterface 1106 3 0
    //   78: astore_2
    //   79: goto +14 -> 93
    //   82: astore_2
    //   83: new 850	nc/u
    //   86: dup
    //   87: aload_2
    //   88: iconst_0
    //   89: invokespecial 853	nc/u:<init>	(Ljava/lang/Throwable;Z)V
    //   92: astore_2
    //   93: getstatic 1111	vb/a:a	Lvb/a;
    //   96: astore_3
    //   97: aload_2
    //   98: aload_3
    //   99: if_acmpne +8 -> 107
    //   102: aload_3
    //   103: astore_2
    //   104: goto +94 -> 198
    //   107: aload 4
    //   109: aload_2
    //   110: invokevirtual 1113	nc/o1:L	(Ljava/lang/Object;)Ljava/lang/Object;
    //   113: astore 6
    //   115: aload 6
    //   117: getstatic 1117	p2/m0:u	Ld2/h0;
    //   120: if_acmpne +8 -> 128
    //   123: aload_3
    //   124: astore_2
    //   125: goto +73 -> 198
    //   128: aload 6
    //   130: instanceof 850
    //   133: ifeq +59 -> 192
    //   136: aload 6
    //   138: checkcast 850	nc/u
    //   141: getfield 1120	nc/u:a	Ljava/lang/Throwable;
    //   144: astore_3
    //   145: aload_3
    //   146: instanceof 1122
    //   149: ifeq +15 -> 164
    //   152: aload_3
    //   153: checkcast 1122	nc/d2
    //   156: getfield 1125	nc/d2:a	Lnc/j1;
    //   159: aload 4
    //   161: if_acmpeq +6 -> 167
    //   164: iconst_1
    //   165: istore 5
    //   167: iload 5
    //   169: ifne +21 -> 190
    //   172: aload_2
    //   173: instanceof 850
    //   176: ifne +6 -> 182
    //   179: goto +19 -> 198
    //   182: aload_2
    //   183: checkcast 850	nc/u
    //   186: getfield 1120	nc/u:a	Ljava/lang/Throwable;
    //   189: athrow
    //   190: aload_3
    //   191: athrow
    //   192: aload 6
    //   194: invokestatic 1127	p2/m0:f0	(Ljava/lang/Object;)Ljava/lang/Object;
    //   197: astore_2
    //   198: aload_2
    //   199: areturn
    //   200: new 1122	nc/d2
    //   203: dup
    //   204: ldc_w 1129
    //   207: aconst_null
    //   208: invokespecial 1132	nc/d2:<init>	(Ljava/lang/String;Lnc/j1;)V
    //   211: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramLong	long
    //   0	212	2	paramp	dc.p
    //   0	212	3	parame	ub.e
    //   15	145	4	locale2	nc.e2
    //   61	107	5	i	int
    //   113	80	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   63	79	82	finally
  }
  
  public static vc.d e()
  {
    return new vc.d(false);
  }
  
  public static final ExecutorService f(boolean paramBoolean)
  {
    Object localObject = new o2.b(paramBoolean);
    localObject = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), (ThreadFactory)localObject);
    ec.i.d(localObject, "newFixedThreadPool(\n    …)),\n        factory\n    )");
    return (ExecutorService)localObject;
  }
  
  public static s.d h(nc.k0 paramk0)
  {
    s.b localb = new s.b();
    s.d locald = new s.d(localb);
    b = locald;
    a = k1.a.class;
    try
    {
      k1.b localb1 = new k1/b;
      localb1.<init>(localb, paramk0);
      paramk0.invokeOnCompletion(localb1);
      a = "Deferred.asListenableFuture";
    }
    catch (Exception paramk0)
    {
      b.q(paramk0);
    }
    return locald;
  }
  
  public static final a0.g i(nc.l paraml)
  {
    return new a0.g(paraml);
  }
  
  public static int j(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    paramInt1--;
    int i = 0;
    while (i <= paramInt1)
    {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2) {
        i = j + 1;
      } else if (k > paramInt2) {
        paramInt1 = j - 1;
      } else {
        return j;
      }
    }
    return i;
  }
  
  public static int k(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    paramInt--;
    int i = 0;
    while (i <= paramInt)
    {
      int j = i + paramInt >>> 1;
      boolean bool = paramArrayOfLong[j] < paramLong;
      if (bool) {
        i = j + 1;
      } else if (bool) {
        paramInt = j - 1;
      } else {
        return j;
      }
    }
    return i;
  }
  
  public static String l(int paramInt1, int paramInt2, int paramInt3)
  {
    return String.format("avc1.%02X%02X%02X", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public static String m(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
  {
    Object localObject = g0[paramInt1];
    int i;
    if (paramBoolean)
    {
      paramInt1 = 72;
      i = paramInt1;
    }
    else
    {
      paramInt1 = 76;
      i = paramInt1;
    }
    localObject = new StringBuilder(e0.m("hvc1.%s%d.%X.%c%d", new Object[] { localObject, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Character.valueOf(i), Integer.valueOf(paramInt4) }));
    for (paramInt1 = paramArrayOfInt.length; (paramInt1 > 0) && (paramArrayOfInt[(paramInt1 - 1)] == 0); paramInt1--) {}
    for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++) {
      ((StringBuilder)localObject).append(String.format(".%02X", new Object[] { Integer.valueOf(paramArrayOfInt[paramInt2]) }));
    }
    return ((StringBuilder)localObject).toString();
  }
  
  public static ArrayList n(byte[] paramArrayOfByte)
  {
    long l = ((paramArrayOfByte[11] & 0xFF) << 8 | paramArrayOfByte[10] & 0xFF) * 1000000000L / 48000L;
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramArrayOfByte);
    localArrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l).array());
    localArrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
    return localArrayList;
  }
  
  public static String o(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(i + i);
    for (int j = 0; j < i; j++)
    {
      char[] arrayOfChar = h0;
      localStringBuilder.append(arrayOfChar[((paramArrayOfByte[j] & 0xF0) >>> 4)]);
      localStringBuilder.append(arrayOfChar[(paramArrayOfByte[j] & 0xF)]);
    }
    return localStringBuilder.toString();
  }
  
  public static final long p(long paramLong, mc.c paramc1, mc.c paramc2)
  {
    ec.i.e(paramc1, "sourceUnit");
    ec.i.e(paramc2, "targetUnit");
    return a.convert(paramLong, a);
  }
  
  public static String q(s0.g paramg)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramg.size());
    for (int i = 0; i < paramg.size(); i++)
    {
      int j = paramg.a(i);
      String str;
      if (j != 34)
      {
        if (j != 39)
        {
          if (j != 92)
          {
            switch (j)
            {
            default: 
              if ((j < 32) || (j > 126)) {
                break;
              }
              break;
            case 13: 
              str = "\\r";
              break;
            case 12: 
              str = "\\f";
              break;
            case 11: 
              str = "\\v";
              break;
            case 10: 
              str = "\\n";
              break;
            case 9: 
              str = "\\t";
              break;
            case 8: 
              str = "\\b";
              break;
            case 7: 
              str = "\\a";
              break;
            }
            localStringBuilder.append('\\');
            localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
            localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
            j = (j & 0x7) + 48;
            localStringBuilder.append((char)j);
            continue;
          }
          str = "\\\\";
        }
        else
        {
          str = "\\'";
        }
      }
      else {
        str = "\\\"";
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public static k6.b r(Status paramStatus)
  {
    int i;
    if (c != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return new k6.i(paramStatus);
    }
    return new k6.b(paramStatus);
  }
  
  public static final x2.l s(s params)
  {
    ec.i.e(params, "<this>");
    return new x2.l(a, t);
  }
  
  public static final Class t(jc.c paramc)
  {
    ec.i.e(paramc, "<this>");
    paramc = ((ec.c)paramc).d();
    if (!paramc.isPrimitive()) {
      return paramc;
    }
    String str = paramc.getName();
    switch (str.hashCode())
    {
    default: 
      break;
    case 109413500: 
      if (str.equals("short")) {
        paramc = Short.class;
      }
      break;
    case 97526364: 
      if (str.equals("float")) {
        paramc = Float.class;
      }
      break;
    case 64711720: 
      if (str.equals("boolean")) {
        paramc = Boolean.class;
      }
      break;
    case 3625364: 
      if (str.equals("void")) {
        paramc = Void.class;
      }
      break;
    case 3327612: 
      if (str.equals("long")) {
        paramc = Long.class;
      }
      break;
    case 3052374: 
      if (str.equals("char")) {
        paramc = Character.class;
      }
      break;
    case 3039496: 
      if (str.equals("byte")) {
        paramc = Byte.class;
      }
      break;
    case 104431: 
      if (str.equals("int")) {
        paramc = Integer.class;
      }
      break;
    case -1325958191: 
      if (str.equals("double")) {
        paramc = Double.class;
      }
      break;
    }
    return paramc;
  }
  
  public static final nc.l u(ub.e parame)
  {
    boolean bool = parame instanceof sc.g;
    int i = 1;
    if (!bool) {
      return new nc.l(1, parame);
    }
    sc.g localg = (sc.g)parame;
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = sc.g.p;
    Object localObject1;
    label229:
    do
    {
      Object localObject2;
      Object localObject3;
      int j;
      do
      {
        localObject1 = localAtomicReferenceFieldUpdater1.get(localg);
        localObject2 = null;
        if (localObject1 == null)
        {
          sc.g.p.set(localg, Z);
          localObject1 = null;
          break;
        }
        if (!(localObject1 instanceof nc.l)) {
          break label229;
        }
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = sc.g.p;
        localObject3 = Z;
        do
        {
          if (localAtomicReferenceFieldUpdater2.compareAndSet(localg, localObject1, localObject3))
          {
            j = 1;
            break;
          }
        } while (localAtomicReferenceFieldUpdater2.get(localg) == localObject1);
        j = 0;
      } while (j == 0);
      localObject1 = (nc.l)localObject1;
      if (localObject1 != null)
      {
        localAtomicReferenceFieldUpdater1 = nc.l.o;
        localObject3 = localAtomicReferenceFieldUpdater1.get(localObject1);
        if (((localObject3 instanceof t)) && (d != null))
        {
          ((nc.l)localObject1).p();
          j = 0;
        }
        else
        {
          nc.l.f.set(localObject1, 536870911);
          localAtomicReferenceFieldUpdater1.set(localObject1, nc.b.a);
          j = i;
        }
        if (j != 0) {
          localObject2 = localObject1;
        }
        if (localObject2 != null) {
          return (nc.l)localObject2;
        }
      }
      return new nc.l(2, parame);
    } while ((localObject1 == Z) || ((localObject1 instanceof Throwable)));
    parame = new StringBuilder();
    parame.append("Inconsistent state ");
    parame.append(localObject1);
    throw new IllegalStateException(parame.toString().toString());
  }
  
  public static long v(byte paramByte1, byte paramByte2)
  {
    int i = paramByte1 & 0xFF;
    int j = i & 0x3;
    paramByte1 = 2;
    int k;
    if (j != 0)
    {
      k = paramByte1;
      if (j != 1)
      {
        k = paramByte1;
        if (j != 2) {
          k = paramByte2 & 0x3F;
        }
      }
    }
    else
    {
      k = 1;
    }
    paramByte2 = i >> 3;
    paramByte1 = paramByte2 & 0x3;
    if (paramByte2 >= 16) {
      paramByte1 = 2500 << paramByte1;
    } else if (paramByte2 >= 12) {
      paramByte1 = 10000 << (paramByte1 & 0x1);
    } else if (paramByte1 == 3) {
      paramByte1 = 60000;
    } else {
      paramByte1 = 10000 << paramByte1;
    }
    return k * paramByte1;
  }
  
  public static String w(String paramString1, String paramString2)
  {
    int i = paramString1.length() - paramString2.length();
    if ((i >= 0) && (i <= 1))
    {
      i = paramString1.length();
      StringBuilder localStringBuilder = new StringBuilder(paramString2.length() + i);
      for (i = 0; i < paramString1.length(); i++)
      {
        localStringBuilder.append(paramString1.charAt(i));
        if (paramString2.length() > i) {
          localStringBuilder.append(paramString2.charAt(i));
        }
      }
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException("Invalid input received");
  }
  
  public static ThreadPoolExecutor x()
  {
    return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w6.a("firebase-iid-executor"));
  }
  
  public static void y(View paramView, EditorInfo paramEditorInfo, InputConnection paramInputConnection)
  {
    if ((paramInputConnection != null) && (hintText == null)) {
      for (paramView = paramView.getParent(); (paramView instanceof View); paramView = paramView.getParent()) {
        if ((paramView instanceof g1))
        {
          hintText = ((g1)paramView).a();
          break;
        }
      }
    }
  }
  
  public static final Object z(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
    {
      paramObject1 = paramObject2;
    }
    else if ((paramObject1 instanceof ArrayList))
    {
      ((ArrayList)paramObject1).add(paramObject2);
    }
    else
    {
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(paramObject1);
      localArrayList.add(paramObject2);
      paramObject1 = localArrayList;
    }
    return paramObject1;
  }
  
  public void I(boolean paramBoolean) {}
  
  public void J(boolean paramBoolean)
  {
    throw null;
  }
  
  public String[] a()
  {
    return a;
  }
  
  public StackTraceElement[] b(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    Object localObject = new HashMap();
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[paramArrayOfStackTraceElement.length];
    int i = 0;
    int j = i;
    int k = 1;
    while (i < paramArrayOfStackTraceElement.length)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      Integer localInteger = (Integer)((HashMap)localObject).get(localStackTraceElement);
      if (localInteger != null)
      {
        int m = localInteger.intValue();
        int n = i - m;
        if (i + n <= paramArrayOfStackTraceElement.length) {}
        for (i1 = 0; i1 < n; i1++) {
          if (!paramArrayOfStackTraceElement[(m + i1)].equals(paramArrayOfStackTraceElement[(i + i1)]))
          {
            i1 = 0;
            break label125;
          }
        }
        i1 = 1;
        label125:
        if (i1 != 0)
        {
          n = i - localInteger.intValue();
          m = j;
          i1 = k;
          if (k < 10)
          {
            System.arraycopy(paramArrayOfStackTraceElement, i, arrayOfStackTraceElement, j, n);
            m = j + n;
            i1 = k + 1;
          }
          n = n - 1 + i;
          j = m;
          k = i1;
          i1 = n;
          break label224;
        }
      }
      arrayOfStackTraceElement[j] = paramArrayOfStackTraceElement[i];
      j++;
      k = 1;
      int i1 = i;
      label224:
      ((HashMap)localObject).put(localStackTraceElement, Integer.valueOf(i));
      i = i1 + 1;
    }
    localObject = new StackTraceElement[j];
    System.arraycopy(arrayOfStackTraceElement, 0, localObject, 0, j);
    if (j < paramArrayOfStackTraceElement.length) {
      return (StackTraceElement[])localObject;
    }
    return paramArrayOfStackTraceElement;
  }
  
  public t1.c c(c.b paramb)
  {
    return new u1.d(a, b, c, d, e);
  }
  
  public WebViewProviderBoundaryInterface createWebView(WebView paramWebView)
  {
    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
  }
  
  public void d(Bundle paramBundle)
  {
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
    }
  }
  
  public Object g(d8.u paramu)
  {
    return Registrar.lambda$getComponents$1$Registrar(paramu);
  }
  
  public ProxyControllerBoundaryInterface getProxyController()
  {
    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
  }
  
  public ServiceWorkerControllerBoundaryInterface getServiceWorkerController()
  {
    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
  }
  
  public StaticsBoundaryInterface getStatics()
  {
    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
  }
  
  public TracingControllerBoundaryInterface getTracingController()
  {
    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
  }
  
  public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter()
  {
    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
  }
  
  public Task then(Object paramObject)
  {
    paramObject = (Bundle)paramObject;
    int i = i6.c.h;
    if ((paramObject != null) && (((BaseBundle)paramObject).containsKey("google.messenger"))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      paramObject = null;
    }
    return Tasks.forResult(paramObject);
  }
  
  public Object then(Task paramTask)
  {
    Task localTask = paramTask;
    if (!paramTask.isSuccessful())
    {
      localTask = paramTask;
      if ((paramTask.getException() instanceof b8.l))
      {
        localTask = paramTask;
        if (getExceptiona.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) {
          localTask = Tasks.forResult(null);
        }
      }
    }
    return localTask;
  }
}

/* Location:
 * Qualified Name:     b.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */