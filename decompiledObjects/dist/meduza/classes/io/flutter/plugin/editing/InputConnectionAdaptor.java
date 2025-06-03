package io.flutter.plugin.editing;

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
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class InputConnectionAdaptor
  extends BaseInputConnection
  implements ListenableEditingState.EditingStateWatcher
{
  private static final String TAG = "InputConnectionAdaptor";
  private int batchEditNestDepth = 0;
  private FlutterTextUtils flutterTextUtils;
  private final KeyboardDelegate keyboardDelegate;
  private final int mClient;
  private CursorAnchorInfo.Builder mCursorAnchorInfoBuilder;
  private final ListenableEditingState mEditable;
  private final EditorInfo mEditorInfo;
  private ExtractedTextRequest mExtractRequest;
  private ExtractedText mExtractedText = new ExtractedText();
  private final View mFlutterView;
  private InputMethodManager mImm;
  private final Layout mLayout;
  private boolean mMonitorCursorUpdate = false;
  private final ScribeChannel scribeChannel;
  private final TextInputChannel textInputChannel;
  
  public InputConnectionAdaptor(View paramView, int paramInt, TextInputChannel paramTextInputChannel, ScribeChannel paramScribeChannel, KeyboardDelegate paramKeyboardDelegate, ListenableEditingState paramListenableEditingState, EditorInfo paramEditorInfo)
  {
    this(paramView, paramInt, paramTextInputChannel, paramScribeChannel, paramKeyboardDelegate, paramListenableEditingState, paramEditorInfo, new FlutterJNI());
  }
  
  public InputConnectionAdaptor(View paramView, int paramInt, TextInputChannel paramTextInputChannel, ScribeChannel paramScribeChannel, KeyboardDelegate paramKeyboardDelegate, ListenableEditingState paramListenableEditingState, EditorInfo paramEditorInfo, FlutterJNI paramFlutterJNI)
  {
    super(paramView, true);
    mFlutterView = paramView;
    mClient = paramInt;
    textInputChannel = paramTextInputChannel;
    scribeChannel = paramScribeChannel;
    mEditable = paramListenableEditingState;
    paramListenableEditingState.addEditingStateListener(this);
    mEditorInfo = paramEditorInfo;
    keyboardDelegate = paramKeyboardDelegate;
    flutterTextUtils = new FlutterTextUtils(paramFlutterJNI);
    mLayout = new DynamicLayout(paramListenableEditingState, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    mImm = ((InputMethodManager)paramView.getContext().getSystemService("input_method"));
  }
  
  private static int clampIndexToEditable(int paramInt, Editable paramEditable)
  {
    int i = Math.max(0, Math.min(paramEditable.length(), paramInt));
    if (i != paramInt)
    {
      paramEditable = new StringBuilder();
      paramEditable.append("Text selection index was clamped (");
      paramEditable.append(paramInt);
      paramEditable.append("->");
      paramEditable.append(i);
      paramEditable.append(") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
      Log.d("flutter", paramEditable.toString());
    }
    return i;
  }
  
  private boolean doPerformContextMenuAction(int paramInt)
  {
    if (paramInt == 16908319)
    {
      setSelection(0, mEditable.length());
      return true;
    }
    int i;
    int j;
    Object localObject;
    if (paramInt == 16908320)
    {
      i = Selection.getSelectionStart(mEditable);
      j = Selection.getSelectionEnd(mEditable);
      if (i != j)
      {
        paramInt = Math.min(i, j);
        i = Math.max(i, j);
        localObject = mEditable.subSequence(paramInt, i);
        ((ClipboardManager)mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", (CharSequence)localObject));
        mEditable.delete(paramInt, i);
        setSelection(paramInt, paramInt);
      }
      return true;
    }
    if (paramInt == 16908321)
    {
      paramInt = Selection.getSelectionStart(mEditable);
      i = Selection.getSelectionEnd(mEditable);
      if (paramInt != i)
      {
        localObject = mEditable.subSequence(Math.min(paramInt, i), Math.max(paramInt, i));
        ((ClipboardManager)mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", (CharSequence)localObject));
      }
      return true;
    }
    if (paramInt == 16908322)
    {
      localObject = ((ClipboardManager)mFlutterView.getContext().getSystemService("clipboard")).getPrimaryClip();
      if (localObject != null)
      {
        localObject = ((ClipData)localObject).getItemAt(0).coerceToText(mFlutterView.getContext());
        i = Math.max(0, Selection.getSelectionStart(mEditable));
        j = Math.max(0, Selection.getSelectionEnd(mEditable));
        paramInt = Math.min(i, j);
        i = Math.max(i, j);
        if (paramInt != i) {
          mEditable.delete(paramInt, i);
        }
        mEditable.insert(paramInt, (CharSequence)localObject);
        paramInt = ((CharSequence)localObject).length() + paramInt;
        setSelection(paramInt, paramInt);
      }
      return true;
    }
    return false;
  }
  
  private CursorAnchorInfo getCursorAnchorInfo()
  {
    CursorAnchorInfo.Builder localBuilder = mCursorAnchorInfoBuilder;
    if (localBuilder == null) {
      mCursorAnchorInfoBuilder = new CursorAnchorInfo.Builder();
    } else {
      localBuilder.reset();
    }
    mCursorAnchorInfoBuilder.setSelectionRange(mEditable.getSelectionStart(), mEditable.getSelectionEnd());
    int i = mEditable.getComposingStart();
    int j = mEditable.getComposingEnd();
    if ((i >= 0) && (j > i)) {
      mCursorAnchorInfoBuilder.setComposingText(i, mEditable.toString().subSequence(i, j));
    } else {
      mCursorAnchorInfoBuilder.setComposingText(-1, "");
    }
    return mCursorAnchorInfoBuilder.build();
  }
  
  private ExtractedText getExtractedText(ExtractedTextRequest paramExtractedTextRequest)
  {
    ExtractedText localExtractedText = mExtractedText;
    startOffset = 0;
    partialStartOffset = -1;
    partialEndOffset = -1;
    selectionStart = mEditable.getSelectionStart();
    mExtractedText.selectionEnd = mEditable.getSelectionEnd();
    localExtractedText = mExtractedText;
    if ((paramExtractedTextRequest != null) && ((flags & 0x1) != 0)) {
      paramExtractedTextRequest = mEditable;
    } else {
      paramExtractedTextRequest = mEditable.toString();
    }
    text = paramExtractedTextRequest;
    return mExtractedText;
  }
  
  private boolean handleHorizontalMovement(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Selection.getSelectionStart(mEditable);
    int j = Selection.getSelectionEnd(mEditable);
    int k = 0;
    if ((i >= 0) && (j >= 0))
    {
      int m;
      if (paramBoolean1) {
        m = Math.max(flutterTextUtils.getOffsetBefore(mEditable, j), 0);
      } else {
        m = Math.min(flutterTextUtils.getOffsetAfter(mEditable, j), mEditable.length());
      }
      int n = k;
      if (i == j)
      {
        n = k;
        if (!paramBoolean2) {
          n = 1;
        }
      }
      if (n != 0) {
        setSelection(m, m);
      } else {
        setSelection(i, m);
      }
      return true;
    }
    return false;
  }
  
  private boolean handleVerticalMovement(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Selection.getSelectionStart(mEditable);
    int j = Selection.getSelectionEnd(mEditable);
    int k = 0;
    if ((i >= 0) && (j >= 0))
    {
      int m = k;
      if (i == j)
      {
        m = k;
        if (!paramBoolean2) {
          m = 1;
        }
      }
      beginBatchEdit();
      if (m != 0)
      {
        if (paramBoolean1) {
          Selection.moveUp(mEditable, mLayout);
        } else {
          Selection.moveDown(mEditable, mLayout);
        }
        m = Selection.getSelectionStart(mEditable);
        setSelection(m, m);
      }
      else
      {
        if (paramBoolean1) {
          Selection.extendUp(mEditable, mLayout);
        } else {
          Selection.extendDown(mEditable, mLayout);
        }
        setSelection(Selection.getSelectionStart(mEditable), Selection.getSelectionEnd(mEditable));
      }
      endBatchEdit();
      return true;
    }
    return false;
  }
  
  private byte[] readStreamFully(InputStream paramInputStream, int paramInt)
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
  
  public boolean beginBatchEdit()
  {
    mEditable.beginBatchEdit();
    batchEditNestDepth += 1;
    return super.beginBatchEdit();
  }
  
  public boolean clearMetaKeyStates(int paramInt)
  {
    return super.clearMetaKeyStates(paramInt);
  }
  
  public void closeConnection()
  {
    super.closeConnection();
    mEditable.removeEditingStateListener(this);
    while (batchEditNestDepth > 0)
    {
      endBatchEdit();
      batchEditNestDepth -= 1;
    }
  }
  
  public boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    if ((Build.VERSION.SDK_INT >= 25) && ((paramInt & 0x1) != 0)) {}
    try
    {
      paramInputContentInfo.requestPermission();
      if (paramInputContentInfo.getDescription().getMimeTypeCount() > 0)
      {
        paramInputContentInfo.requestPermission();
        paramBundle = paramInputContentInfo.getContentUri();
        String str = paramInputContentInfo.getDescription().getMimeType(0);
        Object localObject = mFlutterView.getContext();
        if (paramBundle != null) {
          try
          {
            localObject = ((Context)localObject).getContentResolver().openInputStream(paramBundle);
            if (localObject != null)
            {
              localObject = readStreamFully((InputStream)localObject, 65536);
              HashMap localHashMap = new HashMap();
              localHashMap.put("mimeType", str);
              localHashMap.put("data", localObject);
              localHashMap.put("uri", paramBundle.toString());
              textInputChannel.commitContent(mClient, localHashMap);
              paramInputContentInfo.releasePermission();
              return true;
            }
          }
          catch (FileNotFoundException paramBundle)
          {
            paramInputContentInfo.releasePermission();
            return false;
          }
        }
        paramInputContentInfo.releasePermission();
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
  
  public boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    if (mEditable.getSelectionStart() == -1) {
      return true;
    }
    return super.deleteSurroundingText(paramInt1, paramInt2);
  }
  
  public boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2)
  {
    return super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2);
  }
  
  public void didChangeEditingState(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    mImm.updateSelection(mFlutterView, mEditable.getSelectionStart(), mEditable.getSelectionEnd(), mEditable.getComposingStart(), mEditable.getComposingEnd());
    Object localObject = mExtractRequest;
    if (localObject != null) {
      mImm.updateExtractedText(mFlutterView, token, getExtractedText((ExtractedTextRequest)localObject));
    }
    if (mMonitorCursorUpdate)
    {
      localObject = getCursorAnchorInfo();
      mImm.updateCursorAnchorInfo(mFlutterView, (CursorAnchorInfo)localObject);
    }
  }
  
  public boolean endBatchEdit()
  {
    boolean bool = super.endBatchEdit();
    batchEditNestDepth -= 1;
    mEditable.endBatchEdit();
    return bool;
  }
  
  public boolean finishComposingText()
  {
    return super.finishComposingText();
  }
  
  public Editable getEditable()
  {
    return mEditable;
  }
  
  public ExtractedText getExtractedText(ExtractedTextRequest paramExtractedTextRequest, int paramInt)
  {
    int i = 1;
    if ((paramInt & 0x1) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (mExtractRequest != null) {
      i = 0;
    }
    Object localObject;
    if (paramInt == i)
    {
      StringBuilder localStringBuilder = f.l("The input method toggled text monitoring ");
      if (paramInt != 0) {
        localObject = "on";
      } else {
        localObject = "off";
      }
      localStringBuilder.append((String)localObject);
      Log.d("InputConnectionAdaptor", localStringBuilder.toString());
    }
    if (paramInt != 0) {
      localObject = paramExtractedTextRequest;
    } else {
      localObject = null;
    }
    mExtractRequest = ((ExtractedTextRequest)localObject);
    return getExtractedText(paramExtractedTextRequest);
  }
  
  public boolean handleKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      if (paramKeyEvent.getKeyCode() == 21) {
        return handleHorizontalMovement(true, paramKeyEvent.isShiftPressed());
      }
      if (paramKeyEvent.getKeyCode() == 22) {
        return handleHorizontalMovement(false, paramKeyEvent.isShiftPressed());
      }
      if (paramKeyEvent.getKeyCode() == 19) {
        return handleVerticalMovement(true, paramKeyEvent.isShiftPressed());
      }
      if (paramKeyEvent.getKeyCode() == 20) {
        return handleVerticalMovement(false, paramKeyEvent.isShiftPressed());
      }
      if ((paramKeyEvent.getKeyCode() == 66) || (paramKeyEvent.getKeyCode() == 160))
      {
        EditorInfo localEditorInfo = mEditorInfo;
        if ((0x20000 & inputType) == 0)
        {
          performEditorAction(imeOptions & 0xFF);
          return true;
        }
      }
      int i = Selection.getSelectionStart(mEditable);
      int j = Selection.getSelectionEnd(mEditable);
      int k = paramKeyEvent.getUnicodeChar();
      if ((i >= 0) && (j >= 0) && (k != 0))
      {
        int m = Math.min(i, j);
        j = Math.max(i, j);
        beginBatchEdit();
        if (m != j) {
          mEditable.delete(m, j);
        }
        mEditable.insert(m, String.valueOf((char)k));
        m++;
        setSelection(m, m);
        endBatchEdit();
        return true;
      }
    }
    return false;
  }
  
  public boolean performContextMenuAction(int paramInt)
  {
    beginBatchEdit();
    boolean bool = doPerformContextMenuAction(paramInt);
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
                  textInputChannel.done(mClient);
                } else {
                  textInputChannel.previous(mClient);
                }
              }
              else {
                textInputChannel.next(mClient);
              }
            }
            else {
              textInputChannel.send(mClient);
            }
          }
          else {
            textInputChannel.search(mClient);
          }
        }
        else {
          textInputChannel.go(mClient);
        }
      }
      else {
        textInputChannel.newline(mClient);
      }
    }
    else {
      textInputChannel.unspecifiedAction(mClient);
    }
    return true;
  }
  
  public boolean performPrivateCommand(String paramString, Bundle paramBundle)
  {
    textInputChannel.performPrivateCommand(mClient, paramString, paramBundle);
    return true;
  }
  
  public boolean requestCursorUpdates(int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      mImm.updateCursorAnchorInfo(mFlutterView, getCursorAnchorInfo());
    }
    boolean bool;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool != mMonitorCursorUpdate)
    {
      StringBuilder localStringBuilder = f.l("The input method toggled cursor monitoring ");
      String str;
      if (bool) {
        str = "on";
      } else {
        str = "off";
      }
      localStringBuilder.append(str);
      Log.d("InputConnectionAdaptor", localStringBuilder.toString());
    }
    mMonitorCursorUpdate = bool;
    return true;
  }
  
  public boolean sendKeyEvent(KeyEvent paramKeyEvent)
  {
    return keyboardDelegate.handleEvent(paramKeyEvent);
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
  
  public static abstract interface KeyboardDelegate
  {
    public abstract boolean handleEvent(KeyEvent paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.InputConnectionAdaptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */