package i0;

import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

public final class a
{
  public static final String[] a = new String[0];
  
  public static String[] a(EditorInfo paramEditorInfo)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      paramEditorInfo = contentMimeTypes;
      if (paramEditorInfo == null) {
        paramEditorInfo = a;
      }
      return paramEditorInfo;
    }
    Object localObject = extras;
    if (localObject == null) {
      return a;
    }
    String[] arrayOfString = ((BaseBundle)localObject).getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    localObject = arrayOfString;
    if (arrayOfString == null) {
      localObject = extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    }
    if (localObject == null) {
      localObject = a;
    }
    return (String[])localObject;
  }
  
  public static void b(EditorInfo paramEditorInfo, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      contentMimeTypes = paramArrayOfString;
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
  
  public static void c(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (extras == null) {
      extras = new Bundle();
    }
    if (paramCharSequence != null) {
      paramCharSequence = new SpannableStringBuilder(paramCharSequence);
    } else {
      paramCharSequence = null;
    }
    extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", paramCharSequence);
    extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", paramInt1);
    extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", paramInt2);
  }
}

/* Location:
 * Qualified Name:     i0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */