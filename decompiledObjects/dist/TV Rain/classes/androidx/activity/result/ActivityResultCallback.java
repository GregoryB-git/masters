package androidx.activity.result;

import android.annotation.SuppressLint;

public abstract interface ActivityResultCallback<O>
{
  public abstract void onActivityResult(@SuppressLint({"UnknownNullness"}) O paramO);
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */