package com.google.android.play.core.integrity;

import android.os.BaseBundle;
import android.os.Bundle;
import k6.b;

public final class i
  implements k
{
  public final b a(Bundle paramBundle)
  {
    int i = paramBundle.getInt("error");
    if (i == 0) {
      return null;
    }
    return new IntegrityServiceException(i, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */