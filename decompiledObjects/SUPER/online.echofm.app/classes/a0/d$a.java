package a0;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import t.h;

public class d$a
  extends d.l
{
  public d$a(d paramd, Object paramObject, d.f paramf, String paramString, Bundle paramBundle1, Bundle paramBundle2)
  {
    super(paramObject);
  }
  
  public void h(List paramList)
  {
    if (j.s.get(f.f.asBinder()) != f)
    {
      if (d.w)
      {
        paramList = new StringBuilder();
        paramList.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
        paramList.append(f.a);
        paramList.append(" id=");
        paramList.append(g);
        Log.d("MBServiceCompat", paramList.toString());
      }
      return;
    }
    List localList = paramList;
    if ((b() & 0x1) != 0) {
      localList = j.b(paramList, h);
    }
    try
    {
      f.f.c(g, localList, h, i);
    }
    catch (RemoteException paramList)
    {
      paramList = new StringBuilder();
      paramList.append("Calling onLoadChildren() failed for id=");
      paramList.append(g);
      paramList.append(" package=");
      paramList.append(f.a);
      Log.w("MBServiceCompat", paramList.toString());
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */