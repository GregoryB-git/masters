// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import t5.b;
import android.text.Editable;
import android.text.Spannable;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Selection;
import android.text.DynamicLayout;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import io.flutter.embedding.engine.FlutterJNI;
import android.text.Layout;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.CursorAnchorInfo$Builder;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.EditorInfo;
import D5.w;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

public class l extends BaseInputConnection implements b
{
    public final View a;
    public final int b;
    public final w c;
    public final m d;
    public final EditorInfo e;
    public ExtractedTextRequest f;
    public boolean g;
    public CursorAnchorInfo$Builder h;
    public ExtractedText i;
    public InputMethodManager j;
    public final Layout k;
    public io.flutter.plugin.editing.a l;
    public final a m;
    public int n;
    
    public l(final View view, final int n, final w w, final a a, final m m, final EditorInfo editorInfo) {
        this(view, n, w, a, m, editorInfo, new FlutterJNI());
    }
    
    public l(final View a, final int b, final w c, final a m, final m d, final EditorInfo e, final FlutterJNI flutterJNI) {
        super(a, true);
        this.g = false;
        this.i = new ExtractedText();
        this.n = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        (this.d = d).a((m.b)this);
        this.e = e;
        this.m = m;
        this.l = new io.flutter.plugin.editing.a(flutterJNI);
        this.k = (Layout)new DynamicLayout((CharSequence)d, new TextPaint(), Integer.MAX_VALUE, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager)a.getContext().getSystemService("input_method");
    }
    
    public void a(final boolean b, final boolean b2, final boolean b3) {
        this.j.updateSelection(this.a, this.d.i(), this.d.h(), this.d.g(), this.d.f());
        final ExtractedTextRequest f = this.f;
        if (f != null) {
            this.j.updateExtractedText(this.a, f.token, this.d(f));
        }
        if (this.g) {
            this.j.updateCursorAnchorInfo(this.a, this.c());
        }
    }
    
    public final boolean b(int n) {
        if (n == 16908319) {
            this.setSelection(0, this.d.length());
            return true;
        }
        if (n == 16908320) {
            final int selectionStart = Selection.getSelectionStart((CharSequence)this.d);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)this.d);
            if (selectionStart != selectionEnd) {
                n = Math.min(selectionStart, selectionEnd);
                final int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager)this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", this.d.subSequence(n, max)));
                this.d.delete(n, max);
                this.setSelection(n, n);
            }
            return true;
        }
        if (n == 16908321) {
            n = Selection.getSelectionStart((CharSequence)this.d);
            final int selectionEnd2 = Selection.getSelectionEnd((CharSequence)this.d);
            if (n != selectionEnd2) {
                ((ClipboardManager)this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", this.d.subSequence(Math.min(n, selectionEnd2), Math.max(n, selectionEnd2))));
            }
            return true;
        }
        if (n == 16908322) {
            final ClipData primaryClip = ((ClipboardManager)this.a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                final CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.a.getContext());
                final int max2 = Math.max(0, Selection.getSelectionStart((CharSequence)this.d));
                final int max3 = Math.max(0, Selection.getSelectionEnd((CharSequence)this.d));
                n = Math.min(max2, max3);
                final int max4 = Math.max(max2, max3);
                if (n != max4) {
                    this.d.delete(n, max4);
                }
                this.d.insert(n, coerceToText);
                n += coerceToText.length();
                this.setSelection(n, n);
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
        final CursorAnchorInfo$Builder h = this.h;
        if (h == null) {
            this.h = new CursorAnchorInfo$Builder();
        }
        else {
            h.reset();
        }
        this.h.setSelectionRange(this.d.i(), this.d.h());
        final int g = this.d.g();
        final int f = this.d.f();
        if (g >= 0 && f > g) {
            this.h.setComposingText(g, this.d.toString().subSequence(g, f));
        }
        else {
            this.h.setComposingText(-1, (CharSequence)"");
        }
        return this.h.build();
    }
    
    public boolean clearMetaKeyStates(final int n) {
        return super.clearMetaKeyStates(n);
    }
    
    public void closeConnection() {
        super.closeConnection();
        this.d.l((m.b)this);
        while (this.n > 0) {
            this.endBatchEdit();
            --this.n;
        }
    }
    
    public boolean commitContent(final InputContentInfo p0, final int p1, final Bundle p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          25
        //     5: if_icmplt       166
        //     8: iload_2        
        //     9: iconst_1       
        //    10: iand           
        //    11: ifeq            166
        //    14: aload_1        
        //    15: invokestatic    io/flutter/plugin/editing/h.a:(Landroid/view/inputmethod/InputContentInfo;)V
        //    18: aload_1        
        //    19: invokestatic    io/flutter/plugin/editing/i.a:(Landroid/view/inputmethod/InputContentInfo;)Landroid/content/ClipDescription;
        //    22: invokevirtual   android/content/ClipDescription.getMimeTypeCount:()I
        //    25: ifle            166
        //    28: aload_1        
        //    29: invokestatic    io/flutter/plugin/editing/h.a:(Landroid/view/inputmethod/InputContentInfo;)V
        //    32: aload_1        
        //    33: invokestatic    io/flutter/plugin/editing/j.a:(Landroid/view/inputmethod/InputContentInfo;)Landroid/net/Uri;
        //    36: astore_3       
        //    37: aload_1        
        //    38: invokestatic    io/flutter/plugin/editing/i.a:(Landroid/view/inputmethod/InputContentInfo;)Landroid/content/ClipDescription;
        //    41: iconst_0       
        //    42: invokevirtual   android/content/ClipDescription.getMimeType:(I)Ljava/lang/String;
        //    45: astore          4
        //    47: aload_0        
        //    48: getfield        io/flutter/plugin/editing/l.a:Landroid/view/View;
        //    51: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    54: astore          5
        //    56: aload_3        
        //    57: ifnull          162
        //    60: aload           5
        //    62: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    65: aload_3        
        //    66: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    69: astore          5
        //    71: aload           5
        //    73: ifnull          162
        //    76: aload_0        
        //    77: aload           5
        //    79: ldc_w           65536
        //    82: invokevirtual   io/flutter/plugin/editing/l.h:(Ljava/io/InputStream;I)[B
        //    85: astore          5
        //    87: new             Ljava/util/HashMap;
        //    90: dup            
        //    91: invokespecial   java/util/HashMap.<init>:()V
        //    94: astore          6
        //    96: aload           6
        //    98: ldc_w           "mimeType"
        //   101: aload           4
        //   103: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   108: pop            
        //   109: aload           6
        //   111: ldc_w           "data"
        //   114: aload           5
        //   116: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: aload           6
        //   124: ldc_w           "uri"
        //   127: aload_3        
        //   128: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   131: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   136: pop            
        //   137: aload_0        
        //   138: getfield        io/flutter/plugin/editing/l.c:LD5/w;
        //   141: aload_0        
        //   142: getfield        io/flutter/plugin/editing/l.b:I
        //   145: aload           6
        //   147: invokevirtual   D5/w.b:(ILjava/util/Map;)V
        //   150: aload_1        
        //   151: invokestatic    io/flutter/plugin/editing/k.a:(Landroid/view/inputmethod/InputContentInfo;)V
        //   154: iconst_1       
        //   155: ireturn        
        //   156: aload_1        
        //   157: invokestatic    io/flutter/plugin/editing/k.a:(Landroid/view/inputmethod/InputContentInfo;)V
        //   160: iconst_0       
        //   161: ireturn        
        //   162: aload_1        
        //   163: invokestatic    io/flutter/plugin/editing/k.a:(Landroid/view/inputmethod/InputContentInfo;)V
        //   166: iconst_0       
        //   167: ireturn        
        //   168: astore_1       
        //   169: iconst_0       
        //   170: ireturn        
        //   171: astore_3       
        //   172: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  14     18     168    171    Ljava/lang/Exception;
        //  60     71     171    162    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0156:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean commitText(final CharSequence charSequence, final int n) {
        return super.commitText(charSequence, n);
    }
    
    public final ExtractedText d(final ExtractedTextRequest extractedTextRequest) {
        final ExtractedText i = this.i;
        i.startOffset = 0;
        i.partialStartOffset = -1;
        i.partialEndOffset = -1;
        i.selectionStart = this.d.i();
        this.i.selectionEnd = this.d.h();
        final ExtractedText j = this.i;
        Object text;
        if (extractedTextRequest != null && (extractedTextRequest.flags & 0x1) != 0x0) {
            text = this.d;
        }
        else {
            text = this.d.toString();
        }
        j.text = (CharSequence)text;
        return this.i;
    }
    
    public boolean deleteSurroundingText(final int n, final int n2) {
        return this.d.i() == -1 || super.deleteSurroundingText(n, n2);
    }
    
    public boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        return super.deleteSurroundingTextInCodePoints(n, n2);
    }
    
    public final boolean e(final boolean b, final boolean b2) {
        final int selectionStart = Selection.getSelectionStart((CharSequence)this.d);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)this.d);
        if (selectionStart < 0) {
            return false;
        }
        if (selectionEnd < 0) {
            return false;
        }
        int n;
        if (b) {
            n = Math.max(this.l.b((CharSequence)this.d, selectionEnd), 0);
        }
        else {
            n = Math.min(this.l.a((CharSequence)this.d, selectionEnd), this.d.length());
        }
        if (selectionStart == selectionEnd && !b2) {
            this.setSelection(n, n);
        }
        else {
            this.setSelection(selectionStart, n);
        }
        return true;
    }
    
    public boolean endBatchEdit() {
        final boolean endBatchEdit = super.endBatchEdit();
        --this.n;
        this.d.d();
        return endBatchEdit;
    }
    
    public boolean f(final KeyEvent keyEvent) {
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
                final EditorInfo e = this.e;
                if ((e.inputType & 0x20000) == 0x0) {
                    this.performEditorAction(e.imeOptions & 0xFF);
                    return true;
                }
            }
            final int selectionStart = Selection.getSelectionStart((CharSequence)this.d);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)this.d);
            final int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                if (unicodeChar == 0) {
                    return false;
                }
                final int min = Math.min(selectionStart, selectionEnd);
                final int max = Math.max(selectionStart, selectionEnd);
                this.beginBatchEdit();
                if (min != max) {
                    this.d.delete(min, max);
                }
                this.d.insert(min, (CharSequence)String.valueOf((char)unicodeChar));
                final int n = min + 1;
                this.setSelection(n, n);
                this.endBatchEdit();
                return true;
            }
        }
        return false;
    }
    
    public boolean finishComposingText() {
        return super.finishComposingText();
    }
    
    public final boolean g(final boolean b, final boolean b2) {
        final int selectionStart = Selection.getSelectionStart((CharSequence)this.d);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)this.d);
        final boolean b3 = false;
        if (selectionStart < 0) {
            return false;
        }
        if (selectionEnd < 0) {
            return false;
        }
        boolean b4 = b3;
        if (selectionStart == selectionEnd) {
            b4 = b3;
            if (!b2) {
                b4 = true;
            }
        }
        this.beginBatchEdit();
        if (b4) {
            if (b) {
                Selection.moveUp((Spannable)this.d, this.k);
            }
            else {
                Selection.moveDown((Spannable)this.d, this.k);
            }
            final int selectionStart2 = Selection.getSelectionStart((CharSequence)this.d);
            this.setSelection(selectionStart2, selectionStart2);
        }
        else {
            if (b) {
                Selection.extendUp((Spannable)this.d, this.k);
            }
            else {
                Selection.extendDown((Spannable)this.d, this.k);
            }
            this.setSelection(Selection.getSelectionStart((CharSequence)this.d), Selection.getSelectionEnd((CharSequence)this.d));
        }
        this.endBatchEdit();
        return true;
    }
    
    public Editable getEditable() {
        return (Editable)this.d;
    }
    
    public ExtractedText getExtractedText(final ExtractedTextRequest extractedTextRequest, int n) {
        int n2 = 1;
        if ((n & 0x1) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (this.f != null) {
            n2 = 0;
        }
        if (n == n2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            String str;
            if (n != 0) {
                str = "on";
            }
            else {
                str = "off";
            }
            sb.append(str);
            t5.b.a("InputConnectionAdaptor", sb.toString());
        }
        ExtractedTextRequest f;
        if (n != 0) {
            f = extractedTextRequest;
        }
        else {
            f = null;
        }
        this.f = f;
        return this.d(extractedTextRequest);
    }
    
    public final byte[] h(final InputStream inputStream, int read) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[read];
    Label_0023_Outer:
        while (true) {
            while (true) {
                try {
                    while (true) {
                        while (true) {
                            read = inputStream.read(array);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(array, 0, read);
                        }
                        return byteArrayOutputStream.toByteArray();
                        read = -1;
                        continue Label_0023_Outer;
                    }
                }
                catch (IOException ex) {}
                continue;
            }
        }
    }
    
    public boolean performContextMenuAction(final int n) {
        this.beginBatchEdit();
        final boolean b = this.b(n);
        this.endBatchEdit();
        return b;
    }
    
    public boolean performEditorAction(final int n) {
        if (n == 0) {
            this.c.o(this.b);
            return true;
        }
        if (n == 1) {
            this.c.g(this.b);
            return true;
        }
        if (n == 2) {
            this.c.f(this.b);
            return true;
        }
        if (n == 3) {
            this.c.l(this.b);
            return true;
        }
        if (n == 4) {
            this.c.m(this.b);
            return true;
        }
        if (n == 5) {
            this.c.h(this.b);
            return true;
        }
        if (n != 7) {
            this.c.e(this.b);
            return true;
        }
        this.c.j(this.b);
        return true;
    }
    
    public boolean performPrivateCommand(final String s, final Bundle bundle) {
        this.c.i(this.b, s, bundle);
        return true;
    }
    
    public boolean requestCursorUpdates(final int n) {
        if ((n & 0x1) != 0x0) {
            this.j.updateCursorAnchorInfo(this.a, this.c());
        }
        final boolean g = (n & 0x2) != 0x0;
        if (g != this.g) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            String str;
            if (g) {
                str = "on";
            }
            else {
                str = "off";
            }
            sb.append(str);
            t5.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.g = g;
        return true;
    }
    
    public boolean sendKeyEvent(final KeyEvent keyEvent) {
        return this.m.b(keyEvent);
    }
    
    public boolean setComposingRegion(final int n, final int n2) {
        return super.setComposingRegion(n, n2);
    }
    
    public boolean setComposingText(final CharSequence charSequence, final int n) {
        this.beginBatchEdit();
        boolean b;
        if (charSequence.length() == 0) {
            b = super.commitText(charSequence, n);
        }
        else {
            b = super.setComposingText(charSequence, n);
        }
        this.endBatchEdit();
        return b;
    }
    
    public boolean setSelection(final int n, final int n2) {
        this.beginBatchEdit();
        final boolean setSelection = super.setSelection(n, n2);
        this.endBatchEdit();
        return setSelection;
    }
    
    public interface a
    {
        boolean b(final KeyEvent p0);
    }
}
