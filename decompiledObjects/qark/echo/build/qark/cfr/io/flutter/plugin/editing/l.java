/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.ClipboardManager
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.DynamicLayout
 *  android.text.Editable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.TextPaint
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.inputmethod.BaseInputConnection
 *  android.view.inputmethod.CursorAnchorInfo
 *  android.view.inputmethod.CursorAnchorInfo$Builder
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.ExtractedText
 *  android.view.inputmethod.ExtractedTextRequest
 *  android.view.inputmethod.InputContentInfo
 *  android.view.inputmethod.InputMethodManager
 *  java.io.ByteArrayOutputStream
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.plugin.editing;

import D5.w;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
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
import io.flutter.plugin.editing.h;
import io.flutter.plugin.editing.i;
import io.flutter.plugin.editing.j;
import io.flutter.plugin.editing.k;
import io.flutter.plugin.editing.m;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import t5.b;

public class l
extends BaseInputConnection
implements m.b {
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
    public io.flutter.plugin.editing.a l;
    public final a m;
    public int n = 0;

    public l(View view, int n8, w w8, a a8, m m8, EditorInfo editorInfo) {
        this(view, n8, w8, a8, m8, editorInfo, new FlutterJNI());
    }

    public l(View view, int n8, w w8, a a8, m m8, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.a = view;
        this.b = n8;
        this.c = w8;
        this.d = m8;
        m8.a(this);
        this.e = editorInfo;
        this.m = a8;
        this.l = new io.flutter.plugin.editing.a(flutterJNI);
        this.k = new DynamicLayout((CharSequence)m8, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager)view.getContext().getSystemService("input_method");
    }

    @Override
    public void a(boolean bl, boolean bl2, boolean bl3) {
        this.j.updateSelection(this.a, this.d.i(), this.d.h(), this.d.g(), this.d.f());
        ExtractedTextRequest extractedTextRequest = this.f;
        if (extractedTextRequest != null) {
            this.j.updateExtractedText(this.a, extractedTextRequest.token, this.d(extractedTextRequest));
        }
        if (this.g) {
            extractedTextRequest = this.c();
            this.j.updateCursorAnchorInfo(this.a, (CursorAnchorInfo)extractedTextRequest);
        }
    }

    public final boolean b(int n8) {
        if (n8 == 16908319) {
            this.setSelection(0, this.d.length());
            return true;
        }
        if (n8 == 16908320) {
            int n9;
            int n10 = Selection.getSelectionStart((CharSequence)this.d);
            if (n10 != (n9 = Selection.getSelectionEnd((CharSequence)this.d))) {
                n8 = Math.min((int)n10, (int)n9);
                n10 = Math.max((int)n10, (int)n9);
                CharSequence charSequence = this.d.subSequence(n8, n10);
                ((ClipboardManager)this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)charSequence));
                this.d.delete(n8, n10);
                this.setSelection(n8, n8);
            }
            return true;
        }
        if (n8 == 16908321) {
            int n11;
            n8 = Selection.getSelectionStart((CharSequence)this.d);
            if (n8 != (n11 = Selection.getSelectionEnd((CharSequence)this.d))) {
                CharSequence charSequence = this.d.subSequence(Math.min((int)n8, (int)n11), Math.max((int)n8, (int)n11));
                ((ClipboardManager)this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)charSequence));
            }
            return true;
        }
        if (n8 == 16908322) {
            ClipData clipData = ((ClipboardManager)this.a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (clipData != null) {
                clipData = clipData.getItemAt(0).coerceToText(this.a.getContext());
                int n12 = Math.max((int)0, (int)Selection.getSelectionStart((CharSequence)this.d));
                int n13 = Math.max((int)0, (int)Selection.getSelectionEnd((CharSequence)this.d));
                n8 = Math.min((int)n12, (int)n13);
                if (n8 != (n12 = Math.max((int)n12, (int)n13))) {
                    this.d.delete(n8, n12);
                }
                this.d.insert(n8, (CharSequence)clipData);
                this.setSelection(n8, n8 += clipData.length());
            }
            return true;
        }
        return false;
    }

    public boolean beginBatchEdit() {
        this.d.b();
        ++this.n;
        return super.beginBatchEdit();
    }

    public final CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.h;
        if (builder == null) {
            this.h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.h.setSelectionRange(this.d.i(), this.d.h());
        int n8 = this.d.g();
        int n9 = this.d.f();
        if (n8 >= 0 && n9 > n8) {
            this.h.setComposingText(n8, this.d.toString().subSequence(n8, n9));
        } else {
            this.h.setComposingText(-1, (CharSequence)"");
        }
        return this.h.build();
    }

    public boolean clearMetaKeyStates(int n8) {
        return super.clearMetaKeyStates(n8);
    }

    public void closeConnection() {
        super.closeConnection();
        this.d.l(this);
        while (this.n > 0) {
            this.endBatchEdit();
            --this.n;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean commitContent(InputContentInfo inputContentInfo, int n8, Bundle bundle) {
        block5 : {
            if (Build.VERSION.SDK_INT < 25) return false;
            if ((n8 & 1) == 0) return false;
            try {
                h.a(inputContentInfo);
            }
            catch (Exception exception) {
                return false;
            }
            if (i.a(inputContentInfo).getMimeTypeCount() <= 0) return false;
            h.a(inputContentInfo);
            bundle = j.a(inputContentInfo);
            String string2 = i.a(inputContentInfo).getMimeType(0);
            byte[] arrby = this.a.getContext();
            if (bundle != null) {
                arrby = arrby.getContentResolver().openInputStream((Uri)bundle);
                if (arrby == null) break block5;
                arrby = this.h((InputStream)arrby, 65536);
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"mimeType", (Object)string2);
                hashMap.put((Object)"data", (Object)arrby);
                hashMap.put((Object)"uri", (Object)bundle.toString());
                this.c.b(this.b, (Map)hashMap);
                k.a(inputContentInfo);
                return true;
            }
        }
        k.a(inputContentInfo);
        return false;
        catch (FileNotFoundException fileNotFoundException) {}
        k.a(inputContentInfo);
        return false;
    }

    public boolean commitText(CharSequence charSequence, int n8) {
        return super.commitText(charSequence, n8);
    }

    public final ExtractedText d(ExtractedTextRequest object) {
        ExtractedText extractedText = this.i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.d.i();
        this.i.selectionEnd = this.d.h();
        extractedText = this.i;
        object = object != null && (object.flags & 1) != 0 ? this.d : this.d.toString();
        extractedText.text = object;
        return this.i;
    }

    public boolean deleteSurroundingText(int n8, int n9) {
        if (this.d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(n8, n9);
    }

    public boolean deleteSurroundingTextInCodePoints(int n8, int n9) {
        return super.deleteSurroundingTextInCodePoints(n8, n9);
    }

    public final boolean e(boolean bl, boolean bl2) {
        int n8 = Selection.getSelectionStart((CharSequence)this.d);
        int n9 = Selection.getSelectionEnd((CharSequence)this.d);
        if (n8 >= 0) {
            if (n9 < 0) {
                return false;
            }
            int n10 = bl ? Math.max((int)this.l.b((CharSequence)this.d, n9), (int)0) : Math.min((int)this.l.a((CharSequence)this.d, n9), (int)this.d.length());
            if (n8 == n9 && !bl2) {
                this.setSelection(n10, n10);
            } else {
                this.setSelection(n8, n10);
            }
            return true;
        }
        return false;
    }

    public boolean endBatchEdit() {
        boolean bl = super.endBatchEdit();
        --this.n;
        this.d.d();
        return bl;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return this.e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return this.e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return this.g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return this.g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.e;
                if ((editorInfo.inputType & 131072) == 0) {
                    this.performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int n8 = Selection.getSelectionStart((CharSequence)this.d);
            int n9 = Selection.getSelectionEnd((CharSequence)this.d);
            int n10 = keyEvent.getUnicodeChar();
            if (n8 >= 0 && n9 >= 0) {
                if (n10 == 0) {
                    return false;
                }
                int n11 = Math.min((int)n8, (int)n9);
                n8 = Math.max((int)n8, (int)n9);
                this.beginBatchEdit();
                if (n11 != n8) {
                    this.d.delete(n11, n8);
                }
                this.d.insert(n11, (CharSequence)String.valueOf((char)((char)n10)));
                n10 = n11 + 1;
                this.setSelection(n10, n10);
                this.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public final boolean g(boolean bl, boolean bl2) {
        int n8 = Selection.getSelectionStart((CharSequence)this.d);
        int n9 = Selection.getSelectionEnd((CharSequence)this.d);
        int n10 = 0;
        if (n8 >= 0) {
            if (n9 < 0) {
                return false;
            }
            int n11 = n10;
            if (n8 == n9) {
                n11 = n10;
                if (!bl2) {
                    n11 = 1;
                }
            }
            this.beginBatchEdit();
            if (n11 != 0) {
                if (bl) {
                    Selection.moveUp((Spannable)this.d, (Layout)this.k);
                } else {
                    Selection.moveDown((Spannable)this.d, (Layout)this.k);
                }
                n11 = Selection.getSelectionStart((CharSequence)this.d);
                this.setSelection(n11, n11);
            } else {
                if (bl) {
                    Selection.extendUp((Spannable)this.d, (Layout)this.k);
                } else {
                    Selection.extendDown((Spannable)this.d, (Layout)this.k);
                }
                this.setSelection(Selection.getSelectionStart((CharSequence)this.d), Selection.getSelectionEnd((CharSequence)this.d));
            }
            this.endBatchEdit();
            return true;
        }
        return false;
    }

    public Editable getEditable() {
        return this.d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int n8) {
        Object object;
        int n9 = 1;
        n8 = (n8 & 1) != 0 ? 1 : 0;
        if (this.f != null) {
            n9 = 0;
        }
        if (n8 == n9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The input method toggled text monitoring ");
            object = n8 != 0 ? "on" : "off";
            stringBuilder.append((String)object);
            b.a("InputConnectionAdaptor", stringBuilder.toString());
        }
        object = n8 != 0 ? extractedTextRequest : null;
        this.f = object;
        return this.d(extractedTextRequest);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final byte[] h(InputStream var1_1, int var2_2) {
        var3_3 = new ByteArrayOutputStream();
        var4_4 = new byte[var2_2];
        do lbl-1000: // 2 sources:
        {
            var2_2 = var1_1.read(var4_4);
            if (var2_2 != -1) break block3;
            break;
        } while (true);
        catch (IOException var5_5) {
            return var3_3.toByteArray();
        }
        {
            block3 : {
                return var3_3.toByteArray();
            }
            var3_3.write(var4_4, 0, var2_2);
            ** while (true)
        }
    }

    public boolean performContextMenuAction(int n8) {
        this.beginBatchEdit();
        boolean bl = this.b(n8);
        this.endBatchEdit();
        return bl;
    }

    public boolean performEditorAction(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                if (n8 != 7) {
                                    this.c.e(this.b);
                                    return true;
                                }
                                this.c.j(this.b);
                                return true;
                            }
                            this.c.h(this.b);
                            return true;
                        }
                        this.c.m(this.b);
                        return true;
                    }
                    this.c.l(this.b);
                    return true;
                }
                this.c.f(this.b);
                return true;
            }
            this.c.g(this.b);
            return true;
        }
        this.c.o(this.b);
        return true;
    }

    public boolean performPrivateCommand(String string2, Bundle bundle) {
        this.c.i(this.b, string2, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int n8) {
        if ((n8 & 1) != 0) {
            this.j.updateCursorAnchorInfo(this.a, this.c());
        }
        boolean bl = (n8 & 2) != 0;
        if (bl != this.g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The input method toggled cursor monitoring ");
            String string2 = bl ? "on" : "off";
            stringBuilder.append(string2);
            b.a("InputConnectionAdaptor", stringBuilder.toString());
        }
        this.g = bl;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.m.b(keyEvent);
    }

    public boolean setComposingRegion(int n8, int n9) {
        return super.setComposingRegion(n8, n9);
    }

    public boolean setComposingText(CharSequence charSequence, int n8) {
        this.beginBatchEdit();
        boolean bl = charSequence.length() == 0 ? super.commitText(charSequence, n8) : super.setComposingText(charSequence, n8);
        this.endBatchEdit();
        return bl;
    }

    public boolean setSelection(int n8, int n9) {
        this.beginBatchEdit();
        boolean bl = super.setSelection(n8, n9);
        this.endBatchEdit();
        return bl;
    }

    public static interface a {
        public boolean b(KeyEvent var1);
    }

}

