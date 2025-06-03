package C1;

import T1.a;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

public final class d
{
  public static final d a = new d();
  
  /* Error */
  public static final boolean g(android.view.View paramView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 23	T1/a:d	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: iconst_0
    //   7: istore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: iload_2
    //   15: istore_1
    //   16: aload_0
    //   17: instanceof 25
    //   20: ifeq +88 -> 108
    //   23: getstatic 13	C1/d:a	LC1/d;
    //   26: astore_3
    //   27: aload_3
    //   28: aload_0
    //   29: checkcast 25	android/widget/TextView
    //   32: invokevirtual 29	C1/d:c	(Landroid/widget/TextView;)Z
    //   35: ifne +71 -> 106
    //   38: aload_3
    //   39: aload_0
    //   40: checkcast 25	android/widget/TextView
    //   43: invokevirtual 31	C1/d:a	(Landroid/widget/TextView;)Z
    //   46: ifne +60 -> 106
    //   49: aload_3
    //   50: aload_0
    //   51: checkcast 25	android/widget/TextView
    //   54: invokevirtual 33	C1/d:d	(Landroid/widget/TextView;)Z
    //   57: ifne +49 -> 106
    //   60: aload_3
    //   61: aload_0
    //   62: checkcast 25	android/widget/TextView
    //   65: invokevirtual 36	C1/d:f	(Landroid/widget/TextView;)Z
    //   68: ifne +38 -> 106
    //   71: aload_3
    //   72: aload_0
    //   73: checkcast 25	android/widget/TextView
    //   76: invokevirtual 39	C1/d:e	(Landroid/widget/TextView;)Z
    //   79: ifne +27 -> 106
    //   82: aload_3
    //   83: aload_0
    //   84: checkcast 25	android/widget/TextView
    //   87: invokevirtual 42	C1/d:b	(Landroid/widget/TextView;)Z
    //   90: istore 4
    //   92: iload_2
    //   93: istore_1
    //   94: iload 4
    //   96: ifeq +12 -> 108
    //   99: goto +7 -> 106
    //   102: astore_0
    //   103: goto +7 -> 110
    //   106: iconst_1
    //   107: istore_1
    //   108: iload_1
    //   109: ireturn
    //   110: aload_0
    //   111: ldc 2
    //   113: invokestatic 45	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   116: iconst_0
    //   117: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	paramView	android.view.View
    //   5	104	1	bool1	boolean
    //   7	86	2	bool2	boolean
    //   26	57	3	locald	d
    //   90	5	4	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   16	92	102	finally
  }
  
  public final boolean a(TextView paramTextView)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    for (;;)
    {
      int j;
      int m;
      try
      {
        String str = f.k(paramTextView);
        paramTextView = new kotlin/text/Regex;
        paramTextView.<init>("\\s");
        paramTextView = paramTextView.replace(str, "");
        i = paramTextView.length();
        bool1 = bool2;
        if (i < 12) {
          break label196;
        }
        if (i > 19)
        {
          bool1 = bool2;
          break label196;
        }
        i--;
        if (i < 0) {
          break;
        }
        j = 0;
        k = j;
        m = i - 1;
        char c = paramTextView.charAt(i);
        if (!Character.isDigit(c)) {
          return false;
        }
        int n = CharsKt.c(c);
        i = n;
        if (j != 0)
        {
          n *= 2;
          i = n;
          if (n > 9) {
            i = n % 10 + 1;
          }
        }
      }
      finally
      {
        break label198;
      }
      k += i;
      j ^= 0x1;
      if (m < 0) {
        break label184;
      }
      int i = m;
    }
    int k = 0;
    label184:
    bool1 = bool2;
    if (k % 10 == 0) {
      bool1 = true;
    }
    label196:
    return bool1;
    label198:
    a.b(paramTextView, this);
    return false;
  }
  
  public final boolean b(TextView paramTextView)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      if (paramTextView.getInputType() == 32) {
        return true;
      }
      paramTextView = f.k(paramTextView);
      bool1 = bool2;
      if (paramTextView != null) {
        if (paramTextView.length() == 0) {
          bool1 = bool2;
        } else {
          bool1 = Patterns.EMAIL_ADDRESS.matcher(paramTextView).matches();
        }
      }
    }
    finally
    {
      break label69;
    }
    return bool1;
    label69:
    a.b(paramTextView, this);
    return false;
  }
  
  public final boolean c(TextView paramTextView)
  {
    if (a.d(this)) {
      return false;
    }
    try
    {
      if (paramTextView.getInputType() == 128) {
        return true;
      }
      boolean bool = paramTextView.getTransformationMethod() instanceof PasswordTransformationMethod;
      return bool;
    }
    finally
    {
      a.b(paramTextView, this);
    }
    return false;
  }
  
  public final boolean d(TextView paramTextView)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramTextView.getInputType();
      if (i == 96) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      a.b(paramTextView, this);
    }
    return false;
  }
  
  public final boolean e(TextView paramTextView)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramTextView.getInputType();
      if (i == 3) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      a.b(paramTextView, this);
    }
    return false;
  }
  
  public final boolean f(TextView paramTextView)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramTextView.getInputType();
      if (i == 112) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      a.b(paramTextView, this);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     C1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */