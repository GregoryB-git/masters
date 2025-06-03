package p2;

import a3.b;
import android.content.Context;
import androidx.work.WorkerParameters.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import x2.s;

public final class q0$a
{
  public Context a;
  public w2.a b;
  public b c;
  public androidx.work.a d;
  public WorkDatabase e;
  public s f;
  public final List<String> g;
  public WorkerParameters.a h = new WorkerParameters.a();
  
  public q0$a(Context paramContext, androidx.work.a parama, b paramb, w2.a parama1, WorkDatabase paramWorkDatabase, s params, ArrayList paramArrayList)
  {
    a = paramContext.getApplicationContext();
    c = paramb;
    b = parama1;
    d = parama;
    e = paramWorkDatabase;
    f = params;
    g = paramArrayList;
  }
}

/* Location:
 * Qualified Name:     p2.q0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */