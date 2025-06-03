package u;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import b1.c0;
import b1.c0.b;
import b1.k;
import b1.k.b;
import b1.o;
import b1.p;
import e0.i.a;
import r.h;

public class j
  extends Activity
  implements o, i.a
{
  private final h<Class<? extends a>, a> extraDataMap = new h();
  private final p lifecycleRegistry = new p(this);
  
  /* Error */
  private final boolean shouldSkipDump(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_1
    //   3: istore_3
    //   4: iconst_1
    //   5: istore 4
    //   7: iconst_1
    //   8: istore 5
    //   10: aload_1
    //   11: ifnull +31 -> 42
    //   14: aload_1
    //   15: arraylength
    //   16: ifne +9 -> 25
    //   19: iconst_1
    //   20: istore 6
    //   22: goto +6 -> 28
    //   25: iconst_0
    //   26: istore 6
    //   28: iload 6
    //   30: ifeq +6 -> 36
    //   33: goto +9 -> 42
    //   36: iconst_0
    //   37: istore 6
    //   39: goto +6 -> 45
    //   42: iconst_1
    //   43: istore 6
    //   45: iload 6
    //   47: ifne +202 -> 249
    //   50: aload_1
    //   51: iconst_0
    //   52: aaload
    //   53: astore_1
    //   54: aload_1
    //   55: invokevirtual 43	java/lang/String:hashCode	()I
    //   58: lookupswitch	default:+50->108, -645125871:+158->216, 100470631:+126->184, 472614934:+114->172, 1159329357:+82->140, 1455016274:+53->111
    //   108: goto +141 -> 249
    //   111: aload_1
    //   112: ldc 45
    //   114: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   117: ifne +6 -> 123
    //   120: goto +129 -> 249
    //   123: getstatic 55	android/os/Build$VERSION:SDK_INT	I
    //   126: bipush 26
    //   128: if_icmplt +6 -> 134
    //   131: goto +6 -> 137
    //   134: iconst_0
    //   135: istore 5
    //   137: iload 5
    //   139: ireturn
    //   140: aload_1
    //   141: ldc 57
    //   143: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: ifne +6 -> 152
    //   149: goto +100 -> 249
    //   152: getstatic 55	android/os/Build$VERSION:SDK_INT	I
    //   155: bipush 29
    //   157: if_icmplt +9 -> 166
    //   160: iload_2
    //   161: istore 5
    //   163: goto +6 -> 169
    //   166: iconst_0
    //   167: istore 5
    //   169: iload 5
    //   171: ireturn
    //   172: aload_1
    //   173: ldc 59
    //   175: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   178: ifne +18 -> 196
    //   181: goto +68 -> 249
    //   184: aload_1
    //   185: ldc 61
    //   187: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   190: ifne +6 -> 196
    //   193: goto +56 -> 249
    //   196: getstatic 55	android/os/Build$VERSION:SDK_INT	I
    //   199: bipush 33
    //   201: if_icmplt +9 -> 210
    //   204: iload_3
    //   205: istore 5
    //   207: goto +6 -> 213
    //   210: iconst_0
    //   211: istore 5
    //   213: iload 5
    //   215: ireturn
    //   216: aload_1
    //   217: ldc 63
    //   219: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   222: ifne +6 -> 228
    //   225: goto +24 -> 249
    //   228: getstatic 55	android/os/Build$VERSION:SDK_INT	I
    //   231: bipush 31
    //   233: if_icmplt +10 -> 243
    //   236: iload 4
    //   238: istore 5
    //   240: goto +6 -> 246
    //   243: iconst_0
    //   244: istore 5
    //   246: iload 5
    //   248: ireturn
    //   249: iconst_0
    //   250: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	j
    //   0	251	1	paramArrayOfString	String[]
    //   1	160	2	bool1	boolean
    //   3	202	3	bool2	boolean
    //   5	232	4	bool3	boolean
    //   8	239	5	bool4	boolean
    //   20	26	6	i	int
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    ec.i.e(paramKeyEvent, "event");
    View localView = getWindow().getDecorView();
    ec.i.d(localView, "window.decorView");
    boolean bool;
    if (e0.i.a(localView, paramKeyEvent)) {
      bool = true;
    } else {
      bool = e0.i.b(this, localView, this, paramKeyEvent);
    }
    return bool;
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    ec.i.e(paramKeyEvent, "event");
    View localView = getWindow().getDecorView();
    ec.i.d(localView, "window.decorView");
    boolean bool;
    if (e0.i.a(localView, paramKeyEvent)) {
      bool = true;
    } else {
      bool = super.dispatchKeyShortcutEvent(paramKeyEvent);
    }
    return bool;
  }
  
  public <T extends a> T getExtraData(Class<T> paramClass)
  {
    ec.i.e(paramClass, "extraDataClass");
    return (a)extraDataMap.getOrDefault(paramClass, null);
  }
  
  public k getLifecycle()
  {
    return lifecycleRegistry;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = c0.b;
    c0.b.b(this);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    ec.i.e(paramBundle, "outState");
    lifecycleRegistry.h(k.b.c);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void putExtraData(a parama)
  {
    ec.i.e(parama, "extraData");
    extraDataMap.put(a.class, parama);
  }
  
  public final boolean shouldDumpInternalState(String[] paramArrayOfString)
  {
    return shouldSkipDump(paramArrayOfString) ^ true;
  }
  
  public boolean superDispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    ec.i.e(paramKeyEvent, "event");
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     u.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */