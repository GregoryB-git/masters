package com.google.android.play.core.review.internal;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.tasks.TaskCompletionSource;
import f;
import j7.c;
import j7.g;
import j7.h;
import java.util.HashSet;
import k7.a;
import k7.d;
import k7.i;
import k7.n;

public abstract class zzg
  extends zzb
{
  public final boolean g(int paramInt, Parcel paramParcel)
  {
    if (paramInt == 2)
    {
      Object localObject1 = Bundle.CREATOR;
      paramInt = a.a;
      if (paramParcel.readInt() == 0) {
        localObject1 = null;
      } else {
        localObject1 = (Parcelable)((Parcelable.Creator)localObject1).createFromParcel(paramParcel);
      }
      localObject1 = (Bundle)localObject1;
      paramInt = paramParcel.dataAvail();
      if (paramInt <= 0)
      {
        paramParcel = (g)this;
        n localn = c.a;
        if (localn != null)
        {
          TaskCompletionSource localTaskCompletionSource = b;
          synchronized (f)
          {
            e.remove(localTaskCompletionSource);
            ??? = new i(localn);
            localn.a().post((Runnable)???);
          }
        }
        a.a("onGetLaunchReviewFlowInfo", new Object[0]);
        localObject1 = new c((PendingIntent)((BaseBundle)localObject1).get("confirmation_intent"), ((BaseBundle)localObject1).getBoolean("is_review_no_op"));
        b.trySetResult(localObject1);
        return true;
      }
      throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", paramInt));
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.review.internal.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */