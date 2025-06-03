.class public Lio/flutter/plugin/editing/m$a;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/editing/m;-><init>(LD5/w$e;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/text/Editable;

.field public final synthetic b:Lio/flutter/plugin/editing/m;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/editing/m;Landroid/view/View;ZLandroid/text/Editable;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/editing/m$a;->b:Lio/flutter/plugin/editing/m;

    iput-object p4, p0, Lio/flutter/plugin/editing/m$a;->a:Landroid/text/Editable;

    invoke-direct {p0, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-void
.end method


# virtual methods
.method public getEditable()Landroid/text/Editable;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/m$a;->a:Landroid/text/Editable;

    return-object v0
.end method
