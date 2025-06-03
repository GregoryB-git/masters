package com.yandex.metrica.appsetid;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class b
  implements d
{
  private final Object a = new Object();
  private final List<OnCompleteListener<AppSetIdInfo>> b = new ArrayList();
  
  public b()
    throws Throwable
  {}
  
  public void a(@NotNull Context arg1, @NotNull final a parama)
    throws Throwable
  {
    ??? = AppSet.getClient(???);
    Intrinsics.checkNotNullExpressionValue(???, "AppSet.getClient(context)");
    Task localTask = ???.getAppSetIdInfo();
    Intrinsics.checkNotNullExpressionValue(localTask, "client.appSetIdInfo");
    parama = new a(this, parama);
    synchronized (a)
    {
      b.add(parama);
      localTask.addOnCompleteListener(parama);
      return;
    }
  }
  
  public static final class a
    implements OnCompleteListener<AppSetIdInfo>
  {
    public a(a parama) {}
    
    public void onComplete(@NotNull Task<AppSetIdInfo> paramTask)
    {
      synchronized (b.b(a))
      {
        b.a(a).remove(this);
        if (paramTask.isSuccessful())
        {
          ??? = parama;
          Object localObject2 = paramTask.getResult();
          Intrinsics.checkNotNullExpressionValue(localObject2, "completedTask.result");
          localObject2 = ((AppSetIdInfo)localObject2).getId();
          b localb = a;
          paramTask = paramTask.getResult();
          Intrinsics.checkNotNullExpressionValue(paramTask, "completedTask.result");
          int i = ((AppSetIdInfo)paramTask).getScope();
          localb.getClass();
          if (i != 1)
          {
            if (i != 2) {
              paramTask = c.b;
            } else {
              paramTask = c.d;
            }
          }
          else {
            paramTask = c.c;
          }
          ((a)???).a((String)localObject2, paramTask);
        }
        else
        {
          parama.a(paramTask.getException());
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.appsetid.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */