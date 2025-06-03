package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.m;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class l extends BaseInputConnection implements m.b {

    /* renamed from: a, reason: collision with root package name */
    public final View f15017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15018b;

    /* renamed from: c, reason: collision with root package name */
    public final D5.w f15019c;

    /* renamed from: d, reason: collision with root package name */
    public final m f15020d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f15021e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f15022f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15023g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f15024h;

    /* renamed from: i, reason: collision with root package name */
    public ExtractedText f15025i;

    /* renamed from: j, reason: collision with root package name */
    public InputMethodManager f15026j;

    /* renamed from: k, reason: collision with root package name */
    public final Layout f15027k;

    /* renamed from: l, reason: collision with root package name */
    public C1362a f15028l;

    /* renamed from: m, reason: collision with root package name */
    public final a f15029m;

    /* renamed from: n, reason: collision with root package name */
    public int f15030n;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    public l(View view, int i7, D5.w wVar, a aVar, m mVar, EditorInfo editorInfo) {
        this(view, i7, wVar, aVar, mVar, editorInfo, new FlutterJNI());
    }

    @Override // io.flutter.plugin.editing.m.b
    public void a(boolean z7, boolean z8, boolean z9) {
        this.f15026j.updateSelection(this.f15017a, this.f15020d.i(), this.f15020d.h(), this.f15020d.g(), this.f15020d.f());
        ExtractedTextRequest extractedTextRequest = this.f15022f;
        if (extractedTextRequest != null) {
            this.f15026j.updateExtractedText(this.f15017a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f15023g) {
            this.f15026j.updateCursorAnchorInfo(this.f15017a, c());
        }
    }

    public final boolean b(int i7) {
        if (i7 == 16908319) {
            setSelection(0, this.f15020d.length());
            return true;
        }
        if (i7 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f15020d);
            int selectionEnd = Selection.getSelectionEnd(this.f15020d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f15017a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f15020d.subSequence(min, max)));
                this.f15020d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i7 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f15020d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f15020d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f15017a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f15020d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i7 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f15017a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f15017a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.f15020d));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.f15020d));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.f15020d.delete(min2, max4);
            }
            this.f15020d.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f15020d.b();
        this.f15030n++;
        return super.beginBatchEdit();
    }

    public final CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f15024h;
        if (builder == null) {
            this.f15024h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f15024h.setSelectionRange(this.f15020d.i(), this.f15020d.h());
        int g7 = this.f15020d.g();
        int f7 = this.f15020d.f();
        if (g7 < 0 || f7 <= g7) {
            this.f15024h.setComposingText(-1, "");
        } else {
            this.f15024h.setComposingText(g7, this.f15020d.toString().subSequence(g7, f7));
        }
        return this.f15024h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i7) {
        return super.clearMetaKeyStates(i7);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f15020d.l(this);
        while (this.f15030n > 0) {
            endBatchEdit();
            this.f15030n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f15017a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h7 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h7);
                                hashMap.put("uri", contentUri.toString());
                                this.f15019c.b(this.f15018b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i7) {
        return super.commitText(charSequence, i7);
    }

    public final ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f15025i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f15020d.i();
        this.f15025i.selectionEnd = this.f15020d.h();
        this.f15025i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f15020d.toString() : this.f15020d;
        return this.f15025i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        if (this.f15020d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    public final boolean e(boolean z7, boolean z8) {
        int selectionStart = Selection.getSelectionStart(this.f15020d);
        int selectionEnd = Selection.getSelectionEnd(this.f15020d);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z7 ? Math.max(this.f15028l.b(this.f15020d, selectionEnd), 0) : Math.min(this.f15028l.a(this.f15020d, selectionEnd), this.f15020d.length());
        if (selectionStart != selectionEnd || z8) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f15030n--;
        this.f15020d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f15021e;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f15020d);
            int selectionEnd = Selection.getSelectionEnd(this.f15020d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f15020d.delete(min, max);
                }
                this.f15020d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i7 = min + 1;
                setSelection(i7, i7);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public final boolean g(boolean z7, boolean z8) {
        int selectionStart = Selection.getSelectionStart(this.f15020d);
        int selectionEnd = Selection.getSelectionEnd(this.f15020d);
        boolean z9 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z8) {
            z9 = true;
        }
        beginBatchEdit();
        if (z9) {
            if (z7) {
                Selection.moveUp(this.f15020d, this.f15027k);
            } else {
                Selection.moveDown(this.f15020d, this.f15027k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f15020d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z7) {
                Selection.extendUp(this.f15020d, this.f15027k);
            } else {
                Selection.extendDown(this.f15020d, this.f15027k);
            }
            setSelection(Selection.getSelectionStart(this.f15020d), Selection.getSelectionEnd(this.f15020d));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f15020d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z7 = (i7 & 1) != 0;
        if (z7 == (this.f15022f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z7 ? "on" : "off");
            AbstractC1995b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f15022f = z7 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public final byte[] h(InputStream inputStream, int i7) {
        int i8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i7];
        while (true) {
            try {
                i8 = inputStream.read(bArr);
            } catch (IOException unused) {
                i8 = -1;
            }
            if (i8 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i8);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i7) {
        beginBatchEdit();
        boolean b7 = b(i7);
        endBatchEdit();
        return b7;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i7) {
        if (i7 == 0) {
            this.f15019c.o(this.f15018b);
        } else if (i7 == 1) {
            this.f15019c.g(this.f15018b);
        } else if (i7 == 2) {
            this.f15019c.f(this.f15018b);
        } else if (i7 == 3) {
            this.f15019c.l(this.f15018b);
        } else if (i7 == 4) {
            this.f15019c.m(this.f15018b);
        } else if (i7 == 5) {
            this.f15019c.h(this.f15018b);
        } else if (i7 != 7) {
            this.f15019c.e(this.f15018b);
        } else {
            this.f15019c.j(this.f15018b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f15019c.i(this.f15018b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i7) {
        if ((i7 & 1) != 0) {
            this.f15026j.updateCursorAnchorInfo(this.f15017a, c());
        }
        boolean z7 = (i7 & 2) != 0;
        if (z7 != this.f15023g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z7 ? "on" : "off");
            AbstractC1995b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f15023g = z7;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f15029m.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i7, int i8) {
        return super.setComposingRegion(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i7) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i7) : super.setComposingText(charSequence, i7);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i7, int i8) {
        beginBatchEdit();
        boolean selection = super.setSelection(i7, i8);
        endBatchEdit();
        return selection;
    }

    public l(View view, int i7, D5.w wVar, a aVar, m mVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f15023g = false;
        this.f15025i = new ExtractedText();
        this.f15030n = 0;
        this.f15017a = view;
        this.f15018b = i7;
        this.f15019c = wVar;
        this.f15020d = mVar;
        mVar.a(this);
        this.f15021e = editorInfo;
        this.f15029m = aVar;
        this.f15028l = new C1362a(flutterJNI);
        this.f15027k = new DynamicLayout(mVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15026j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }
}
