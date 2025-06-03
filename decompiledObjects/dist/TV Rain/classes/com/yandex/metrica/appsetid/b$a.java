package com.yandex.metrica.appsetid;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class b$a
  implements OnCompleteListener<AppSetIdInfo>
{
  public b$a(a parama) {}
  
  public void onComplete(@NotNull Task<AppSetIdInfo> paramTask)
  {
    synchronized (b.b(a))
    {
      b.a(a).remove(this);
      if (paramTask.isSuccessful())
      {
        ??? = b;
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
        b.a(paramTask.getException());
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.appsetid.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */