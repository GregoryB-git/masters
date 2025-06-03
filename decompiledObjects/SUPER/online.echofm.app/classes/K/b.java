package K;

import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

public abstract class b
{
  public static final String[] a = new String[0];
  
  public static void a(EditorInfo paramEditorInfo, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      a.a(paramEditorInfo, paramArrayOfString);
    }
    else
    {
      if (extras == null) {
        extras = new Bundle();
      }
      extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", paramArrayOfString);
      extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", paramArrayOfString);
    }
  }
}

/* Location:
 * Qualified Name:     K.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */