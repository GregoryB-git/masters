package v0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.d;
import t0.f;

public final class c$a
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

/* Location:
 * Qualified Name:     v0.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */