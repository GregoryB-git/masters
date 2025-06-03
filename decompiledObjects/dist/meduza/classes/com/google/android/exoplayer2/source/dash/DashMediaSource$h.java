package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import t5.f0.a;
import t5.m;
import v5.e0;

public final class DashMediaSource$h
  implements f0.a<Long>
{
  public final Object a(Uri paramUri, m paramm)
  {
    return Long.valueOf(e0.L(new BufferedReader(new InputStreamReader(paramm)).readLine()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */