package v2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o2.j;

public final class a
  extends e<Boolean>
{
  public a(Context paramContext, a3.b paramb)
  {
    super(paramContext, paramb);
  }
  
  public final Object a()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = b.registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null)
    {
      j.d().b(b.a, "getInitialState - null intent received");
      localObject = Boolean.FALSE;
    }
    else
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      boolean bool;
      if ((i != 2) && (i != 5)) {
        bool = false;
      } else {
        bool = true;
      }
      localObject = Boolean.valueOf(bool);
    }
    return localObject;
  }
  
  public final IntentFilter e()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.os.action.CHARGING");
    localIntentFilter.addAction("android.os.action.DISCHARGING");
    return localIntentFilter;
  }
  
  /* Error */
  public final void f(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 88
    //   3: invokestatic 15	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: invokevirtual 92	android/content/Intent:getAction	()Ljava/lang/String;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +4 -> 16
    //   15: return
    //   16: invokestatic 45	o2/j:d	()Lo2/j;
    //   19: astore_2
    //   20: getstatic 50	v2/b:a	Ljava/lang/String;
    //   23: astore_3
    //   24: new 94	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   31: astore 4
    //   33: aload 4
    //   35: ldc 97
    //   37: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload 4
    //   43: aload_1
    //   44: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_2
    //   49: aload_3
    //   50: aload 4
    //   52: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokevirtual 106	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload_1
    //   59: invokevirtual 112	java/lang/String:hashCode	()I
    //   62: lookupswitch	default:+42->104, -1886648615:+88->150, -54942926:+76->138, 948344062:+57->119, 1019184907:+45->107
    //   104: goto +67 -> 171
    //   107: aload_1
    //   108: ldc 114
    //   110: invokevirtual 118	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   113: ifne +18 -> 131
    //   116: goto +55 -> 171
    //   119: aload_1
    //   120: ldc 79
    //   122: invokevirtual 118	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   125: ifne +6 -> 131
    //   128: goto +43 -> 171
    //   131: getstatic 121	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   134: astore_1
    //   135: goto +31 -> 166
    //   138: aload_1
    //   139: ldc 84
    //   141: invokevirtual 118	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   144: ifne +18 -> 162
    //   147: goto +24 -> 171
    //   150: aload_1
    //   151: ldc 123
    //   153: invokevirtual 118	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   156: ifne +6 -> 162
    //   159: goto +12 -> 171
    //   162: getstatic 61	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   165: astore_1
    //   166: aload_0
    //   167: aload_1
    //   168: invokevirtual 126	v2/g:b	(Ljava/lang/Object;)V
    //   171: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	a
    //   0	172	1	paramIntent	Intent
    //   19	30	2	localj	j
    //   23	27	3	str	String
    //   31	20	4	localStringBuilder	StringBuilder
  }
}

/* Location:
 * Qualified Name:     v2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */