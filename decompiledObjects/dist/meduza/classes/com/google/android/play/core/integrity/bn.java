package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import m7.e;
import m7.m;
import m7.v;
import p2.m0;

final class bn
{
  public final e a;
  private final v b;
  private final String c;
  private final TaskCompletionSource d;
  private final at e;
  private final k f;
  
  public bn(Context paramContext, v paramv, at paramat, k paramk)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    d = localTaskCompletionSource;
    c = paramContext.getPackageName();
    b = paramv;
    e = paramat;
    f = paramk;
    paramv = new e(paramContext, paramv, "ExpressIntegrityService", bo.a, bd.a);
    a = paramv;
    paramContext = new be(this, localTaskCompletionSource, paramContext);
    paramv.a().post(paramContext);
  }
  
  public static Bundle a(bn parambn, String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("package.name", c);
    localBundle.putLong("cloud.prj", paramLong1);
    localBundle.putString("nonce", paramString);
    localBundle.putLong("warm.up.sid", paramLong2);
    localBundle.putInt("playcore.integrity.version.major", 1);
    localBundle.putInt("playcore.integrity.version.minor", 3);
    localBundle.putInt("playcore.integrity.version.patch", 0);
    localBundle.putInt("webview.request.mode", 0);
    parambn = new ArrayList();
    parambn.add(new m(5, System.currentTimeMillis()));
    localBundle.putParcelableArrayList("event_timestamps", new ArrayList(m0.f(parambn)));
    return localBundle;
  }
  
  public static Bundle b(bn parambn, long paramLong, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("package.name", c);
    localBundle.putLong("cloud.prj", paramLong);
    localBundle.putInt("playcore.integrity.version.major", 1);
    localBundle.putInt("playcore.integrity.version.minor", 3);
    localBundle.putInt("playcore.integrity.version.patch", 0);
    localBundle.putInt("webview.request.mode", 0);
    parambn = new ArrayList();
    parambn.add(new m(4, System.currentTimeMillis()));
    localBundle.putParcelableArrayList("event_timestamps", new ArrayList(m0.f(parambn)));
    return localBundle;
  }
  
  public final Task c(Activity paramActivity, Bundle paramBundle)
  {
    int i = paramBundle.getInt("dialog.intent.type");
    b.b("requestAndShowDialog(%s)", new Object[] { Integer.valueOf(i) });
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramActivity = new bh(this, localTaskCompletionSource, paramBundle, paramActivity, localTaskCompletionSource, i);
    a.c(paramActivity, localTaskCompletionSource);
    return localTaskCompletionSource.getTask();
  }
  
  public final Task d(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    b.b("requestExpressIntegrityToken(%s)", new Object[] { Long.valueOf(paramLong2) });
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramString = new bg(this, localTaskCompletionSource, 0, paramString, paramLong1, paramLong2, localTaskCompletionSource);
    a.c(paramString, localTaskCompletionSource);
    return localTaskCompletionSource.getTask();
  }
  
  public final Task e(long paramLong, int paramInt)
  {
    b.b("warmUpIntegrityToken(%s)", new Object[] { Long.valueOf(paramLong) });
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    bf localbf = new bf(this, localTaskCompletionSource, 0, paramLong, localTaskCompletionSource);
    a.c(localbf, localTaskCompletionSource);
    return localTaskCompletionSource.getTask();
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */