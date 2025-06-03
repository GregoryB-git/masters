package io.flutter.plugin.editing;

import D5.w;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import t5.b;

public class l
  extends BaseInputConnection
  implements m.b
{
  public final View a;
  public final int b;
  public final w c;
  public final m d;
  public final EditorInfo e;
  public ExtractedTextRequest f;
  public boolean g = false;
  public CursorAnchorInfo.Builder h;
  public ExtractedText i = new ExtractedText();
  public InputMethodManager j;
  public final Layout k;
  public a l;
  public final a m;
  public int n = 0;
  
  public l(View paramView, int paramInt, w paramw, a parama, m paramm, EditorInfo paramEditorInfo)
  {
    this(paramView, paramInt, paramw, parama, paramm, paramEditorInfo, new FlutterJNI());
  }
  
  public l(View paramView, int paramInt, w paramw, a parama, m paramm, EditorInfo paramEditorInfo, FlutterJNI paramFlutterJNI)
  {
    super(paramView, true);
    a = paramView;
    b = paramInt;
    c = paramw;
    d = paramm;
    paramm.a(this);
    e = paramEditorInfo;
    m = parama;
    l = new a(paramFlutterJNI);
    k = new DynamicLayout(paramm, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    j = ((InputMethodManager)paramView.getContext().getSystemService("input_method"));
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    j.updateSelection(a, d.i(), d.h(), d.g(), d.f());
    Object localObject = f;
    if (localObject != null) {
      j.updateExtractedText(a, token, d((ExtractedTextRequest)localObject));
    }
    if (g)
    {
      localObject = c();
      j.updateCursorAnchorInfo(a, (CursorAnchorInfo)localObject);
    }
  }
  
  public final boolean b(int paramInt)
  {
    if (paramInt == 16908319)
    {
      setSelection(0, d.length());
      return true;
    }
    int i1;
    int i2;
    Object localObject;
    if (paramInt == 16908320)
    {
      i1 = Selection.getSelectionStart(d);
      i2 = Selection.getSelectionEnd(d);
      if (i1 != i2)
      {
        paramInt = Math.min(i1, i2);
        i1 = Math.max(i1, i2);
        localObject = d.subSequence(paramInt, i1);
        ((ClipboardManager)a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", (CharSequence)localObject));
        d.delete(paramInt, i1);
        setSelection(paramInt, paramInt);
      }
      return true;
    }
    if (paramInt == 16908321)
    {
      paramInt = Selection.getSelectionStart(d);
      i1 = Selection.getSelectionEnd(d);
      if (paramInt != i1)
      {
        localObject = d.subSequence(Math.min(paramInt, i1), Math.max(paramInt, i1));
        ((ClipboardManager)a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", (CharSequence)localObject));
      }
      return true;
    }
    if (paramInt == 16908322)
    {
      localObject = ((ClipboardManager)a.getContext().getSystemService("clipboard")).getPrimaryClip();
      if (localObject != null)
      {
        localObject = ((ClipData)localObject).getItemAt(0).coerceToText(a.getContext());
        i2 = Math.max(0, Selection.getSelectionStart(d));
        i1 = Math.max(0, Selection.getSelectionEnd(d));
        paramInt = Math.min(i2, i1);
        i1 = Math.max(i2, i1);
        if (paramInt != i1) {
          d.delete(paramInt, i1);
        }
        d.insert(paramInt, (CharSequence)localObject);
        paramInt += ((CharSequence)localObject).length();
        setSelection(paramInt, paramInt);
      }
      return true;
    }
    return false;
  }
  
  public boolean beginBatchEdit()
  {
    d.b();
    n += 1;
    return super.beginBatchEdit();
  }
  
  public final CursorAnchorInfo c()
  {
    CursorAnchorInfo.Builder localBuilder = h;
    if (localBuilder == null) {
      h = new CursorAnchorInfo.Builder();
    } else {
      localBuilder.reset();
    }
    h.setSelectionRange(d.i(), d.h());
    int i1 = d.g();
    int i2 = d.f();
    if ((i1 >= 0) && (i2 > i1)) {
      h.setComposingText(i1, d.toString().subSequence(i1, i2));
    } else {
      h.setComposingText(-1, "");
    }
    return h.build();
  }
  
  public boolean clearMetaKeyStates(int paramInt)
  {
    return super.clearMetaKeyStates(paramInt);
  }
  
  public void closeConnection()
  {
    super.closeConnection();
    d.l(this);
    while (n > 0)
    {
      endBatchEdit();
      n -= 1;
    }
  }
  
  public boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    if ((Build.VERSION.SDK_INT >= 25) && ((paramInt & 0x1) != 0)) {}
    try
    {
      h.a(paramInputContentInfo);
      if (i.a(paramInputContentInfo).getMimeTypeCount() > 0)
      {
        h.a(paramInputContentInfo);
        Uri localUri = j.a(paramInputContentInfo);
        paramBundle = i.a(paramInputContentInfo).getMimeType(0);
        Object localObject = a.getContext();
        if (localUri != null) {
          try
          {
            localObject = ((Context)localObject).getContentResolver().openInputStream(localUri);
            if (localObject != null)
            {
              byte[] arrayOfByte = h((InputStream)localObject, 65536);
              localObject = new HashMap();
              ((Map)localObject).put("mimeType", paramBundle);
              ((Map)localObject).put("data", arrayOfByte);
              ((Map)localObject).put("uri", localUri.toString());
              c.b(b, (Map)localObject);
              k.a(paramInputContentInfo);
              return true;
            }
          }
          catch (FileNotFoundException paramBundle)
          {
            k.a(paramInputContentInfo);
            return false;
          }
        }
        k.a(paramInputContentInfo);
      }
    }
    catch (Exception paramInputContentInfo)
    {
      for (;;) {}
    }
    return false;
  }
  
  public boolean commitText(CharSequence paramCharSequence, int paramInt)
  {
    return super.commitText(paramCharSequence, paramInt);
  }
  
  public final ExtractedText d(ExtractedTextRequest paramExtractedTextRequest)
  {
    ExtractedText localExtractedText = i;
    startOffset = 0;
    partialStartOffset = -1;
    partialEndOffset = -1;
    selectionStart = d.i();
    i.selectionEnd = d.h();
    localExtractedText = i;
    if ((paramExtractedTextRequest != null) && ((flags & 0x1) != 0)) {
      paramExtractedTextRequest = d;
    } else {
      paramExtractedTextRequest = d.toString();
    }
    text = paramExtractedTextRequest;
    return i;
  }
  
  public boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    if (d.i() == -1) {
      return true;
    }
    return super.deleteSurroundingText(paramInt1, paramInt2);
  }
  
  public boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2)
  {
    return super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2);
  }
  
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Selection.getSelectionStart(d);
    int i2 = Selection.getSelectionEnd(d);
    if ((i1 >= 0) && (i2 >= 0))
    {
      int i3;
      if (paramBoolean1) {
        i3 = Math.max(l.b(d, i2), 0);
      } else {
        i3 = Math.min(l.a(d, i2), d.length());
      }
      if ((i1 == i2) && (!paramBoolean2)) {
        setSelection(i3, i3);
      } else {
        setSelection(i1, i3);
      }
      return true;
    }
    return false;
  }
  
  public boolean endBatchEdit()
  {
    boolean bool = super.endBatchEdit();
    n -= 1;
    d.d();
    return bool;
  }
  
  public boolean f(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      if (paramKeyEvent.getKeyCode() == 21) {
        return e(true, paramKeyEvent.isShiftPressed());
      }
      if (paramKeyEvent.getKeyCode() == 22) {
        return e(false, paramKeyEvent.isShiftPressed());
      }
      if (paramKeyEvent.getKeyCode() == 19) {
        return g(true, paramKeyEvent.isShiftPressed());
      }
      if (paramKeyEvent.getKeyCode() == 20) {
        return g(false, paramKeyEvent.isShiftPressed());
      }
      if ((paramKeyEvent.getKeyCode() == 66) || (paramKeyEvent.getKeyCode() == 160))
      {
        EditorInfo localEditorInfo = e;
        if ((inputType & 0x20000) == 0)
        {
          performEditorAction(imeOptions & 0xFF);
          return true;
        }
      }
      int i1 = Selection.getSelectionStart(d);
      int i2 = Selection.getSelectionEnd(d);
      int i3 = paramKeyEvent.getUnicodeChar();
      if ((i1 >= 0) && (i2 >= 0) && (i3 != 0))
      {
        int i4 = Math.min(i1, i2);
        i2 = Math.max(i1, i2);
        beginBatchEdit();
        if (i4 != i2) {
          d.delete(i4, i2);
        }
        d.insert(i4, String.valueOf((char)i3));
        i4++;
        setSelection(i4, i4);
        endBatchEdit();
        return true;
      }
    }
    return false;
  }
  
  public boolean finishComposingText()
  {
    return super.finishComposingText();
  }
  
  public final boolean g(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Selection.getSelectionStart(d);
    int i2 = Selection.getSelectionEnd(d);
    int i3 = 0;
    if ((i1 >= 0) && (i2 >= 0))
    {
      int i4 = i3;
      if (i1 == i2)
      {
        i4 = i3;
        if (!paramBoolean2) {
          i4 = 1;
        }
      }
      beginBatchEdit();
      if (i4 != 0)
      {
        if (paramBoolean1) {
          Selection.moveUp(d, k);
        } else {
          Selection.moveDown(d, k);
        }
        i4 = Selection.getSelectionStart(d);
        setSelection(i4, i4);
      }
      else
      {
        if (paramBoolean1) {
          Selection.extendUp(d, k);
        } else {
          Selection.extendDown(d, k);
        }
        setSelection(Selection.getSelectionStart(d), Selection.getSelectionEnd(d));
      }
      endBatchEdit();
      return true;
    }
    return false;
  }
  
  public Editable getEditable()
  {
    return d;
  }
  
  public ExtractedText getExtractedText(ExtractedTextRequest paramExtractedTextRequest, int paramInt)
  {
    int i1 = 1;
    if ((paramInt & 0x1) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (f != null) {
      i1 = 0;
    }
    Object localObject;
    if (paramInt == i1)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("The input method toggled text monitoring ");
      if (paramInt != 0) {
        localObject = "on";
      } else {
        localObject = "off";
      }
      localStringBuilder.append((String)localObject);
      b.a("InputConnectionAdaptor", localStringBuilder.toString());
    }
    if (paramInt != 0) {
      localObject = paramExtractedTextRequest;
    } else {
      localObject = null;
    }
    f = ((ExtractedTextRequest)localObject);
    return d(paramExtractedTextRequest);
  }
  
  public final byte[] h(InputStream paramInputStream, int paramInt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[paramInt];
    for (;;)
    {
      try
      {
        paramInt = paramInputStream.read(arrayOfByte);
      }
      catch (IOException localIOException)
      {
        paramInt = -1;
      }
      if (paramInt == -1) {
        return localByteArrayOutputStream.toByteArray();
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, paramInt);
    }
  }
  
  public boolean performContextMenuAction(int paramInt)
  {
    beginBatchEdit();
    boolean bool = b(paramInt);
    endBatchEdit();
    return bool;
  }
  
  public boolean performEditorAction(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5)
              {
                if (paramInt != 7) {
                  c.e(b);
                } else {
                  c.j(b);
                }
              }
              else {
                c.h(b);
              }
            }
            else {
              c.m(b);
            }
          }
          else {
            c.l(b);
          }
        }
        else {
          c.f(b);
        }
      }
      else {
        c.g(b);
      }
    }
    else {
      c.o(b);
    }
    return true;
  }
  
  public boolean performPrivateCommand(String paramString, Bundle paramBundle)
  {
    c.i(b, paramString, paramBundle);
    return true;
  }
  
  public boolean requestCursorUpdates(int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      j.updateCursorAnchorInfo(a, c());
    }
    boolean bool;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool != g)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("The input method toggled cursor monitoring ");
      String str;
      if (bool) {
        str = "on";
      } else {
        str = "off";
      }
      localStringBuilder.append(str);
      b.a("InputConnectionAdaptor", localStringBuilder.toString());
    }
    g = bool;
    return true;
  }
  
  public boolean sendKeyEvent(KeyEvent paramKeyEvent)
  {
    return m.b(paramKeyEvent);
  }
  
  public boolean setComposingRegion(int paramInt1, int paramInt2)
  {
    return super.setComposingRegion(paramInt1, paramInt2);
  }
  
  public boolean setComposingText(CharSequence paramCharSequence, int paramInt)
  {
    beginBatchEdit();
    boolean bool;
    if (paramCharSequence.length() == 0) {
      bool = super.commitText(paramCharSequence, paramInt);
    } else {
      bool = super.setComposingText(paramCharSequence, paramInt);
    }
    endBatchEdit();
    return bool;
  }
  
  public boolean setSelection(int paramInt1, int paramInt2)
  {
    beginBatchEdit();
    boolean bool = super.setSelection(paramInt1, paramInt2);
    endBatchEdit();
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract boolean b(KeyEvent paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */