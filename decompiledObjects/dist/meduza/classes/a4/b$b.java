package a4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v5.e0;

public final class b$b
  extends Handler
{
  public b$b(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = (byte[])obj;
    if (arrayOfByte == null) {
      return;
    }
    Iterator localIterator = a.m.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      locala.p();
      if (Arrays.equals(v, arrayOfByte)) {
        if ((what == 2) && (e == 0) && (p == 4))
        {
          int i = e0.a;
          locala.a(false);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     a4.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */