package com.google.android.gms.common.api.internal;

import A2.n;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z2.Z;
import z2.b0;
import z2.f;
import z2.g;

public class LifecycleCallback
{
  public final g o;
  
  public LifecycleCallback(g paramg)
  {
    o = paramg;
  }
  
  public static g c(Activity paramActivity)
  {
    return d(new f(paramActivity));
  }
  
  public static g d(f paramf)
  {
    if (paramf.d()) {
      return b0.J1(paramf.b());
    }
    if (paramf.c()) {
      return Z.f(paramf.a());
    }
    throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
  }
  
  @Keep
  private static g getChimeraLifecycleFragmentImpl(f paramf)
  {
    throw new IllegalStateException("Method not available in SDK.");
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public Activity b()
  {
    Activity localActivity = o.c();
    n.i(localActivity);
    return localActivity;
  }
  
  public void e(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void f(Bundle paramBundle) {}
  
  public void g() {}
  
  public void h() {}
  
  public void i(Bundle paramBundle) {}
  
  public void j() {}
  
  public void k() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.LifecycleCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */