package v0;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.d;
import androidx.emoji2.text.d.a;
import androidx.emoji2.text.d.b;
import androidx.emoji2.text.h;
import java.nio.ByteBuffer;
import t0.f;

public final class c
  extends InputConnectionWrapper
{
  public final TextView a;
  public final a b;
  
  public c(EditText paramEditText, InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    super(paramInputConnection, false);
    a = paramEditText;
    b = ((a)localObject);
    paramEditText = d.j;
    int i = 1;
    int j;
    if (paramEditText != null) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      paramEditText = d.a();
      if (paramEditText.b() == 1) {
        j = i;
      } else {
        j = 0;
      }
      if ((j != 0) && (paramEditorInfo != null))
      {
        if (extras == null) {
          extras = new Bundle();
        }
        paramEditText = e;
        paramEditText.getClass();
        paramInputConnection = extras;
        localObject = c.a;
        j = ((u0.c)localObject).a(4);
        if (j != 0) {
          j = b.getInt(j + a);
        } else {
          j = 0;
        }
        paramInputConnection.putInt("android.support.text.emoji.emojiCompat_metadataVersion", j);
        paramInputConnection = extras;
        a.getClass();
        paramInputConnection.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
      }
    }
  }
  
  public final boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    a locala = b;
    Editable localEditable = a.getEditableText();
    locala.getClass();
    boolean bool = false;
    if ((a.a(this, localEditable, paramInt1, paramInt2, false)) || (super.deleteSurroundingText(paramInt1, paramInt2))) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2)
  {
    a locala = b;
    Editable localEditable = a.getEditableText();
    locala.getClass();
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (!a.a(this, localEditable, paramInt1, paramInt2, true)) {
      if (super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public static final class a
  {
    public static boolean a(InputConnection paramInputConnection, Editable paramEditable, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      Object localObject = d.i;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramEditable != null) {
        if (paramInputConnection == null)
        {
          bool2 = bool1;
        }
        else
        {
          bool2 = bool1;
          if (paramInt1 >= 0) {
            if (paramInt2 < 0)
            {
              bool2 = bool1;
            }
            else
            {
              int i = Selection.getSelectionStart(paramEditable);
              int j = Selection.getSelectionEnd(paramEditable);
              int k;
              if ((i != -1) && (j != -1) && (i == j)) {
                k = 0;
              } else {
                k = 1;
              }
              if (k != 0)
              {
                bool2 = bool1;
              }
              else
              {
                int m;
                if (paramBoolean)
                {
                  m = Math.max(paramInt1, 0);
                  paramInt1 = paramEditable.length();
                  char c;
                  if ((i >= 0) && (paramInt1 >= i))
                  {
                    paramInt1 = i;
                    k = m;
                    if (m >= 0)
                    {
                      i = 0;
                      for (;;)
                      {
                        if (k == 0) {
                          break label244;
                        }
                        paramInt1--;
                        if (paramInt1 < 0)
                        {
                          if (i != 0) {
                            break label242;
                          }
                          paramInt1 = 0;
                          break label244;
                        }
                        c = paramEditable.charAt(paramInt1);
                        if (i != 0)
                        {
                          if (!Character.isHighSurrogate(c)) {
                            break label242;
                          }
                          k--;
                          break;
                        }
                        if (!Character.isSurrogate(c))
                        {
                          k--;
                        }
                        else
                        {
                          if (Character.isHighSurrogate(c)) {
                            break label242;
                          }
                          i = 1;
                        }
                      }
                    }
                  }
                  label242:
                  paramInt1 = -1;
                  label244:
                  i = Math.max(paramInt2, 0);
                  m = paramEditable.length();
                  if ((j >= 0) && (m >= j))
                  {
                    paramInt2 = j;
                    k = i;
                    if (i >= 0)
                    {
                      i = 0;
                      for (;;)
                      {
                        if (k == 0) {
                          break label390;
                        }
                        if (paramInt2 >= m)
                        {
                          paramInt2 = m;
                          if (i == 0) {
                            break label390;
                          }
                          break label388;
                        }
                        c = paramEditable.charAt(paramInt2);
                        if (i != 0)
                        {
                          if (!Character.isLowSurrogate(c)) {
                            break label388;
                          }
                          k--;
                          paramInt2++;
                          break;
                        }
                        if (!Character.isSurrogate(c))
                        {
                          k--;
                          paramInt2++;
                        }
                        else
                        {
                          if (Character.isLowSurrogate(c)) {
                            break label388;
                          }
                          paramInt2++;
                          i = 1;
                        }
                      }
                    }
                  }
                  label388:
                  paramInt2 = -1;
                  label390:
                  bool2 = bool1;
                  if (paramInt1 == -1) {
                    break label578;
                  }
                  k = paramInt2;
                  if (paramInt2 == -1)
                  {
                    bool2 = bool1;
                    break label578;
                  }
                }
                else
                {
                  paramInt1 = Math.max(i - paramInt1, 0);
                  k = Math.min(j + paramInt2, paramEditable.length());
                }
                f[] arrayOff = (f[])paramEditable.getSpans(paramInt1, k, f.class);
                bool2 = bool1;
                if (arrayOff != null)
                {
                  bool2 = bool1;
                  if (arrayOff.length > 0)
                  {
                    i = arrayOff.length;
                    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
                    {
                      localObject = arrayOff[paramInt2];
                      m = paramEditable.getSpanStart(localObject);
                      j = paramEditable.getSpanEnd(localObject);
                      paramInt1 = Math.min(m, paramInt1);
                      k = Math.max(j, k);
                    }
                    paramInt1 = Math.max(paramInt1, 0);
                    paramInt2 = Math.min(k, paramEditable.length());
                    paramInputConnection.beginBatchEdit();
                    paramEditable.delete(paramInt1, paramInt2);
                    paramInputConnection.endBatchEdit();
                    bool2 = true;
                  }
                }
              }
            }
          }
        }
      }
      label578:
      return bool2;
    }
  }
}

/* Location:
 * Qualified Name:     v0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */