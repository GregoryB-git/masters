package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;
import d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class EditorInfoCompat
{
  private static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
  private static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
  private static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
  private static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
  private static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
  private static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
  public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
  @VisibleForTesting
  public static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
  @VisibleForTesting
  public static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
  
  @NonNull
  public static String[] getContentMimeTypes(@NonNull EditorInfo paramEditorInfo)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      paramEditorInfo = contentMimeTypes;
      if (paramEditorInfo == null) {
        paramEditorInfo = EMPTY_STRING_ARRAY;
      }
      return paramEditorInfo;
    }
    Object localObject = extras;
    if (localObject == null) {
      return EMPTY_STRING_ARRAY;
    }
    String[] arrayOfString = ((BaseBundle)localObject).getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    localObject = arrayOfString;
    if (arrayOfString == null) {
      localObject = extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    }
    if (localObject == null) {
      localObject = EMPTY_STRING_ARRAY;
    }
    return (String[])localObject;
  }
  
  @Nullable
  public static CharSequence getInitialSelectedText(@NonNull EditorInfo paramEditorInfo, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getInitialSelectedText(paramEditorInfo, paramInt);
    }
    if (extras == null) {
      return null;
    }
    int i = Math.min(initialSelStart, initialSelEnd);
    int j = Math.max(initialSelStart, initialSelEnd);
    int k = extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
    int m = extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
    if ((initialSelStart >= 0) && (initialSelEnd >= 0) && (m - k == j - i))
    {
      paramEditorInfo = extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
      if (paramEditorInfo == null) {
        return null;
      }
      if ((paramInt & 0x1) != 0) {
        paramEditorInfo = paramEditorInfo.subSequence(k, m);
      } else {
        paramEditorInfo = TextUtils.substring(paramEditorInfo, k, m);
      }
      return paramEditorInfo;
    }
    return null;
  }
  
  @Nullable
  public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo paramEditorInfo, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getInitialTextAfterCursor(paramEditorInfo, paramInt1, paramInt2);
    }
    Object localObject = extras;
    if (localObject == null) {
      return null;
    }
    localObject = ((Bundle)localObject).getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
    if (localObject == null) {
      return null;
    }
    int i = extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
    paramInt1 = Math.min(paramInt1, ((CharSequence)localObject).length() - i);
    if ((paramInt2 & 0x1) != 0) {
      paramEditorInfo = ((CharSequence)localObject).subSequence(i, paramInt1 + i);
    } else {
      paramEditorInfo = TextUtils.substring((CharSequence)localObject, i, paramInt1 + i);
    }
    return paramEditorInfo;
  }
  
  @Nullable
  public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo paramEditorInfo, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getInitialTextBeforeCursor(paramEditorInfo, paramInt1, paramInt2);
    }
    Object localObject = extras;
    if (localObject == null) {
      return null;
    }
    localObject = ((Bundle)localObject).getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
    if (localObject == null) {
      return null;
    }
    int i = extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
    paramInt1 = Math.min(paramInt1, i);
    if ((paramInt2 & 0x1) != 0) {
      paramEditorInfo = ((CharSequence)localObject).subSequence(i - paramInt1, i);
    } else {
      paramEditorInfo = TextUtils.substring((CharSequence)localObject, i - paramInt1, i);
    }
    return paramEditorInfo;
  }
  
  public static int getProtocol(EditorInfo paramEditorInfo)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      return 1;
    }
    Bundle localBundle = extras;
    if (localBundle == null) {
      return 0;
    }
    boolean bool1 = localBundle.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    boolean bool2 = extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    if ((bool1) && (bool2)) {
      return 4;
    }
    if (bool1) {
      return 3;
    }
    if (bool2) {
      return 2;
    }
    return 0;
  }
  
  private static boolean isCutOnSurrogate(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1) {
        return false;
      }
      return Character.isHighSurrogate(paramCharSequence.charAt(paramInt1));
    }
    return Character.isLowSurrogate(paramCharSequence.charAt(paramInt1));
  }
  
  private static boolean isPasswordInputType(int paramInt)
  {
    paramInt &= 0xFFF;
    boolean bool;
    if ((paramInt != 129) && (paramInt != 225) && (paramInt != 18)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void setContentMimeTypes(@NonNull EditorInfo paramEditorInfo, @Nullable String[] paramArrayOfString)
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
  
  public static void setInitialSurroundingSubText(@NonNull EditorInfo paramEditorInfo, @NonNull CharSequence paramCharSequence, int paramInt)
  {
    Preconditions.checkNotNull(paramCharSequence);
    if (Build.VERSION.SDK_INT >= 30)
    {
      Api30Impl.setInitialSurroundingSubText(paramEditorInfo, paramCharSequence, paramInt);
      return;
    }
    int i = initialSelStart;
    int j = initialSelEnd;
    int k;
    if (i > j) {
      k = j - paramInt;
    } else {
      k = i - paramInt;
    }
    if (i > j) {
      j = i - paramInt;
    } else {
      j -= paramInt;
    }
    i = paramCharSequence.length();
    if ((paramInt >= 0) && (k >= 0) && (j <= i))
    {
      if (isPasswordInputType(inputType))
      {
        setSurroundingText(paramEditorInfo, null, 0, 0);
        return;
      }
      if (i <= 2048)
      {
        setSurroundingText(paramEditorInfo, paramCharSequence, k, j);
        return;
      }
      trimLongSurroundingText(paramEditorInfo, paramCharSequence, k, j);
      return;
    }
    setSurroundingText(paramEditorInfo, null, 0, 0);
  }
  
  public static void setInitialSurroundingText(@NonNull EditorInfo paramEditorInfo, @NonNull CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      Api30Impl.setInitialSurroundingSubText(paramEditorInfo, paramCharSequence, 0);
    } else {
      setInitialSurroundingSubText(paramEditorInfo, paramCharSequence, 0);
    }
  }
  
  private static void setSurroundingText(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2)
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
  
  private static void trimLongSurroundingText(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    int j;
    if (i > 1024) {
      j = 0;
    } else {
      j = i;
    }
    int k = paramCharSequence.length();
    int m = 2048 - j;
    int n = Math.min(k - paramInt2, m - Math.min(paramInt1, (int)(m * 0.8D)));
    k = Math.min(paramInt1, m - n);
    int i1 = paramInt1 - k;
    m = k;
    paramInt1 = i1;
    if (isCutOnSurrogate(paramCharSequence, i1, 0))
    {
      paramInt1 = i1 + 1;
      m = k - 1;
    }
    k = n;
    if (isCutOnSurrogate(paramCharSequence, paramInt2 + n - 1, 1)) {
      k = n - 1;
    }
    if (j != i) {
      paramCharSequence = TextUtils.concat(new CharSequence[] { paramCharSequence.subSequence(paramInt1, paramInt1 + m), paramCharSequence.subSequence(paramInt2, k + paramInt2) });
    } else {
      paramCharSequence = paramCharSequence.subSequence(paramInt1, m + j + k + paramInt1);
    }
    paramInt1 = m + 0;
    setSurroundingText(paramEditorInfo, paramCharSequence, paramInt1, j + paramInt1);
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    public static CharSequence getInitialSelectedText(@NonNull EditorInfo paramEditorInfo, int paramInt)
    {
      return d.j(paramEditorInfo, paramInt);
    }
    
    public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo paramEditorInfo, int paramInt1, int paramInt2)
    {
      return d.k(paramEditorInfo, paramInt1, paramInt2);
    }
    
    public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo paramEditorInfo, int paramInt1, int paramInt2)
    {
      return d.C(paramEditorInfo, paramInt1, paramInt2);
    }
    
    public static void setInitialSurroundingSubText(@NonNull EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt)
    {
      d.v(paramEditorInfo, paramCharSequence, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.EditorInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */