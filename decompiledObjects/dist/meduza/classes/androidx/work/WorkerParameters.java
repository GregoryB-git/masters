package androidx.work;

import a3.b;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o2.e;
import o2.r;
import o2.s;
import y2.z;

public final class WorkerParameters
{
  public UUID a;
  public c b;
  public Executor c;
  public b d;
  public s e;
  public e f;
  
  public WorkerParameters(UUID paramUUID, c paramc, List paramList, ExecutorService paramExecutorService, b paramb, r paramr, z paramz)
  {
    a = paramUUID;
    b = paramc;
    new HashSet(paramList);
    c = paramExecutorService;
    d = paramb;
    e = paramr;
    f = paramz;
  }
  
  public static final class a
  {
    public List<String> a = Collections.emptyList();
    public List<Uri> b = Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkerParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */