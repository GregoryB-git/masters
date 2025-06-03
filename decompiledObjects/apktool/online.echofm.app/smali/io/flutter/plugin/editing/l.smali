.class public Lio/flutter/plugin/editing/l;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/editing/m$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugin/editing/l$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:I

.field public final c:LD5/w;

.field public final d:Lio/flutter/plugin/editing/m;

.field public final e:Landroid/view/inputmethod/EditorInfo;

.field public f:Landroid/view/inputmethod/ExtractedTextRequest;

.field public g:Z

.field public h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field public i:Landroid/view/inputmethod/ExtractedText;

.field public j:Landroid/view/inputmethod/InputMethodManager;

.field public final k:Landroid/text/Layout;

.field public l:Lio/flutter/plugin/editing/a;

.field public final m:Lio/flutter/plugin/editing/l$a;

.field public n:I


# direct methods
.method public constructor <init>(Landroid/view/View;ILD5/w;Lio/flutter/plugin/editing/l$a;Lio/flutter/plugin/editing/m;Landroid/view/inputmethod/EditorInfo;)V
    .locals 8

    .line 1
    new-instance v7, Lio/flutter/embedding/engine/FlutterJNI;

    invoke-direct {v7}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lio/flutter/plugin/editing/l;-><init>(Landroid/view/View;ILD5/w;Lio/flutter/plugin/editing/l$a;Lio/flutter/plugin/editing/m;Landroid/view/inputmethod/EditorInfo;Lio/flutter/embedding/engine/FlutterJNI;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;ILD5/w;Lio/flutter/plugin/editing/l$a;Lio/flutter/plugin/editing/m;Landroid/view/inputmethod/EditorInfo;Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 8

    .line 2
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugin/editing/l;->g:Z

    new-instance v1, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v1}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    iput-object v1, p0, Lio/flutter/plugin/editing/l;->i:Landroid/view/inputmethod/ExtractedText;

    iput v0, p0, Lio/flutter/plugin/editing/l;->n:I

    iput-object p1, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    iput p2, p0, Lio/flutter/plugin/editing/l;->b:I

    iput-object p3, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iput-object p5, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p5, p0}, Lio/flutter/plugin/editing/m;->a(Lio/flutter/plugin/editing/m$b;)V

    iput-object p6, p0, Lio/flutter/plugin/editing/l;->e:Landroid/view/inputmethod/EditorInfo;

    iput-object p4, p0, Lio/flutter/plugin/editing/l;->m:Lio/flutter/plugin/editing/l$a;

    new-instance p2, Lio/flutter/plugin/editing/a;

    invoke-direct {p2, p7}, Lio/flutter/plugin/editing/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p2, p0, Lio/flutter/plugin/editing/l;->l:Lio/flutter/plugin/editing/a;

    new-instance p2, Landroid/text/DynamicLayout;

    new-instance v2, Landroid/text/TextPaint;

    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v3, 0x7fffffff

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v0, p2

    move-object v1, p5

    invoke-direct/range {v0 .. v7}, Landroid/text/DynamicLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object p2, p0, Lio/flutter/plugin/editing/l;->k:Landroid/text/Layout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "input_method"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iput-object p1, p0, Lio/flutter/plugin/editing/l;->j:Landroid/view/inputmethod/InputMethodManager;

    return-void
.end method


# virtual methods
.method public a(ZZZ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->j:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->i()I

    move-result v2

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->h()I

    move-result v3

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->g()I

    move-result v4

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->f()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->f:Landroid/view/inputmethod/ExtractedTextRequest;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->j:Landroid/view/inputmethod/InputMethodManager;

    iget-object p3, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    iget v0, p1, Landroid/view/inputmethod/ExtractedTextRequest;->token:I

    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/l;->d(Landroid/view/inputmethod/ExtractedTextRequest;)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    invoke-virtual {p2, p3, v0, p1}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    :cond_0
    iget-boolean p1, p0, Lio/flutter/plugin/editing/l;->g:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->c()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->j:Landroid/view/inputmethod/InputMethodManager;

    iget-object p3, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {p2, p3, p1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    :cond_1
    return-void
.end method

.method public final b(I)Z
    .locals 6

    .line 1
    const v0, 0x102001f

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    invoke-virtual {p0, v2, p1}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    return v1

    :cond_0
    const v0, 0x1020020

    const-string v3, "text label?"

    const-string v4, "clipboard"

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    if-eq p1, v0, :cond_1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0, v2, p1}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v5, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/ClipboardManager;

    invoke-static {v3, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0, v2, p1}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0, v2, v2}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    :cond_1
    return v1

    :cond_2
    const v0, 0x1020021

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    if-eq p1, v0, :cond_3

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v2, v5, p1}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-static {v3, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :cond_3
    return v1

    :cond_4
    const v0, 0x1020022

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ClipboardManager;

    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v3, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v3}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eq v3, v0, :cond_5

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v2, v3, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_5
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0, v3, p1}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/2addr v3, p1

    invoke-virtual {p0, v3, v3}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    :cond_6
    return v1

    :cond_7
    return v2
.end method

.method public beginBatchEdit()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->b()V

    iget v0, p0, Lio/flutter/plugin/editing/l;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/flutter/plugin/editing/l;->n:I

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->beginBatchEdit()Z

    move-result v0

    return v0
.end method

.method public final c()Landroid/view/inputmethod/CursorAnchorInfo;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/editing/l;->h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/m;->i()I

    move-result v1

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v2}, Lio/flutter/plugin/editing/m;->h()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->g()I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/m;->f()I

    move-result v1

    if-ltz v0, :cond_1

    if-le v1, v0, :cond_1

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v3, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v3}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/4 v1, -0x1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :goto_1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->h:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-virtual {v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v0

    return-object v0
.end method

.method public clearMetaKeyStates(I)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->clearMetaKeyStates(I)Z

    move-result p1

    return p1
.end method

.method public closeConnection()V
    .locals 1

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->closeConnection()V

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/editing/m;->l(Lio/flutter/plugin/editing/m$b;)V

    :goto_0
    iget v0, p0, Lio/flutter/plugin/editing/l;->n:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->endBatchEdit()Z

    iget v0, p0, Lio/flutter/plugin/editing/l;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lio/flutter/plugin/editing/l;->n:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 4

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x19

    const/4 v1, 0x0

    if-lt p3, v0, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_1

    :try_start_0
    invoke-static {p1}, Lio/flutter/plugin/editing/h;->a(Landroid/view/inputmethod/InputContentInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    invoke-static {p1}, Lio/flutter/plugin/editing/i;->a(Landroid/view/inputmethod/InputContentInfo;)Landroid/content/ClipDescription;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/ClipDescription;->getMimeTypeCount()I

    move-result p2

    if-lez p2, :cond_1

    invoke-static {p1}, Lio/flutter/plugin/editing/h;->a(Landroid/view/inputmethod/InputContentInfo;)V

    invoke-static {p1}, Lio/flutter/plugin/editing/j;->a(Landroid/view/inputmethod/InputContentInfo;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1}, Lio/flutter/plugin/editing/i;->a(Landroid/view/inputmethod/InputContentInfo;)Landroid/content/ClipDescription;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/ClipDescription;->getMimeType(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    if-eqz p2, :cond_0

    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v2, :cond_0

    const/high16 v1, 0x10000

    invoke-virtual {p0, v2, v1}, Lio/flutter/plugin/editing/l;->h(Ljava/io/InputStream;I)[B

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "mimeType"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "data"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "uri"

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v0, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p2, v0, v2}, LD5/w;->b(ILjava/util/Map;)V

    invoke-static {p1}, Lio/flutter/plugin/editing/k;->a(Landroid/view/inputmethod/InputContentInfo;)V

    return p3

    :catch_0
    invoke-static {p1}, Lio/flutter/plugin/editing/k;->a(Landroid/view/inputmethod/InputContentInfo;)V

    return v1

    :cond_0
    invoke-static {p1}, Lio/flutter/plugin/editing/k;->a(Landroid/view/inputmethod/InputContentInfo;)V

    :catch_1
    :cond_1
    return v1
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method

.method public final d(Landroid/view/inputmethod/ExtractedTextRequest;)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->i:Landroid/view/inputmethod/ExtractedText;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->startOffset:I

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialStartOffset:I

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialEndOffset:I

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/m;->i()I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->i:Landroid/view/inputmethod/ExtractedText;

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/m;->h()I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->i:Landroid/view/inputmethod/ExtractedText;

    if-eqz p1, :cond_1

    iget p1, p1, Landroid/view/inputmethod/ExtractedTextRequest;->flags:I

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    iput-object p1, v0, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->i:Landroid/view/inputmethod/ExtractedText;

    return-object p1
.end method

.method public deleteSurroundingText(II)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->i()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingText(II)Z

    move-result p1

    return p1
.end method

.method public deleteSurroundingTextInCodePoints(II)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    return p1
.end method

.method public final e(ZZ)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, 0x0

    if-ltz v0, :cond_3

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->l:Lio/flutter/plugin/editing/a;

    iget-object v3, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1, v3, v1}, Lio/flutter/plugin/editing/a;->b(Ljava/lang/CharSequence;I)I

    move-result p1

    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->l:Lio/flutter/plugin/editing/a;

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1, v2, v1}, Lio/flutter/plugin/editing/a;->a(Ljava/lang/CharSequence;I)I

    move-result p1

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    if-ne v0, v1, :cond_2

    if-nez p2, :cond_2

    invoke-virtual {p0, p1, p1}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0, p1}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_2
    return v2
.end method

.method public endBatchEdit()Z
    .locals 2

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->endBatchEdit()Z

    move-result v0

    iget v1, p0, Lio/flutter/plugin/editing/l;->n:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lio/flutter/plugin/editing/l;->n:I

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/m;->d()V

    return v0
.end method

.method public f(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x15

    const/4 v3, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    invoke-virtual {p0, v3, p1}, Lio/flutter/plugin/editing/l;->e(ZZ)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x16

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    invoke-virtual {p0, v1, p1}, Lio/flutter/plugin/editing/l;->e(ZZ)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x13

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    invoke-virtual {p0, v3, p1}, Lio/flutter/plugin/editing/l;->g(ZZ)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x14

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    invoke-virtual {p0, v1, p1}, Lio/flutter/plugin/editing/l;->g(ZZ)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x42

    if-eq v0, v2, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0xa0

    if-ne v0, v2, :cond_5

    :cond_4
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->e:Landroid/view/inputmethod/EditorInfo;

    iget v2, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v4, 0x20000

    and-int/2addr v2, v4

    if-nez v2, :cond_5

    iget p1, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/l;->performEditorAction(I)Z

    return v3

    :cond_5
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result p1

    if-ltz v0, :cond_8

    if-ltz v2, :cond_8

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->beginBatchEdit()Z

    if-eq v1, v0, :cond_7

    iget-object v2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-virtual {v2, v1, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_7
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    int-to-char p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/2addr v1, v3

    invoke-virtual {p0, v1, v1}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->endBatchEdit()Z

    return v3

    :cond_8
    :goto_0
    return v1
.end method

.method public finishComposingText()Z
    .locals 1

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->finishComposingText()Z

    move-result v0

    return v0
.end method

.method public final g(ZZ)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, 0x0

    if-ltz v0, :cond_5

    if-gez v1, :cond_0

    goto :goto_3

    :cond_0
    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    if-nez p2, :cond_1

    move v2, v3

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->beginBatchEdit()Z

    if-eqz v2, :cond_3

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->k:Landroid/text/Layout;

    invoke-static {p1, p2}, Landroid/text/Selection;->moveUp(Landroid/text/Spannable;Landroid/text/Layout;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->k:Landroid/text/Layout;

    invoke-static {p1, p2}, Landroid/text/Selection;->moveDown(Landroid/text/Spannable;Landroid/text/Layout;)Z

    :goto_0
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-virtual {p0, p1, p1}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->k:Landroid/text/Layout;

    invoke-static {p1, p2}, Landroid/text/Selection;->extendUp(Landroid/text/Spannable;Landroid/text/Layout;)Z

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->k:Landroid/text/Layout;

    invoke-static {p1, p2}, Landroid/text/Selection;->extendDown(Landroid/text/Spannable;Landroid/text/Layout;)Z

    :goto_1
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    iget-object p2, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    invoke-static {p2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugin/editing/l;->setSelection(II)Z

    :goto_2
    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->endBatchEdit()Z

    return v3

    :cond_5
    :goto_3
    return v2
.end method

.method public getEditable()Landroid/text/Editable;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->d:Lio/flutter/plugin/editing/m;

    return-object v0
.end method

.method public getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 3

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/editing/l;->f:Landroid/view/inputmethod/ExtractedTextRequest;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-ne p2, v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The input method toggled text monitoring "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_2

    const-string v1, "on"

    goto :goto_2

    :cond_2
    const-string v1, "off"

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InputConnectionAdaptor"

    invoke-static {v1, v0}, Lt5/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    if-eqz p2, :cond_4

    move-object p2, p1

    goto :goto_3

    :cond_4
    const/4 p2, 0x0

    :goto_3
    iput-object p2, p0, Lio/flutter/plugin/editing/l;->f:Landroid/view/inputmethod/ExtractedTextRequest;

    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/l;->d(Landroid/view/inputmethod/ExtractedTextRequest;)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/io/InputStream;I)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-array p2, p2, [B

    :goto_0
    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move v2, v1

    :goto_1
    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method

.method public performContextMenuAction(I)Z
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->beginBatchEdit()Z

    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/l;->b(I)Z

    move-result p1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->endBatchEdit()Z

    return p1
.end method

.method public performEditorAction(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_6

    if-eq p1, v0, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    const/4 v1, 0x7

    if-eq p1, v1, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->e(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->j(I)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->h(I)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->m(I)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->l(I)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->f(I)V

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->g(I)V

    goto :goto_0

    :cond_6
    iget-object p1, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {p1, v1}, LD5/w;->o(I)V

    :goto_0
    return v0
.end method

.method public performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->c:LD5/w;

    iget v1, p0, Lio/flutter/plugin/editing/l;->b:I

    invoke-virtual {v0, v1, p1, p2}, LD5/w;->i(ILjava/lang/String;Landroid/os/Bundle;)V

    const/4 p1, 0x1

    return p1
.end method

.method public requestCursorUpdates(I)Z
    .locals 3

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->j:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lio/flutter/plugin/editing/l;->a:Landroid/view/View;

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->c()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    :cond_0
    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-boolean v1, p0, Lio/flutter/plugin/editing/l;->g:Z

    if-eq p1, v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The input method toggled cursor monitoring "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    const-string v2, "on"

    goto :goto_1

    :cond_2
    const-string v2, "off"

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "InputConnectionAdaptor"

    invoke-static {v2, v1}, Lt5/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iput-boolean p1, p0, Lio/flutter/plugin/editing/l;->g:Z

    return v0
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/l;->m:Lio/flutter/plugin/editing/l$a;

    invoke-interface {v0, p1}, Lio/flutter/plugin/editing/l$a;->b(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setComposingRegion(II)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingRegion(II)Z

    move-result p1

    return p1
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->beginBatchEdit()Z

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    :goto_0
    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->endBatchEdit()Z

    return p1
.end method

.method public setSelection(II)Z
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->beginBatchEdit()Z

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setSelection(II)Z

    move-result p1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/l;->endBatchEdit()Z

    return p1
.end method
