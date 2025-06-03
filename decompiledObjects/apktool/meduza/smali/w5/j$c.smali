.class public final Lw5/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw5/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/view/WindowManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/j$c;->a:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(Lio/flutter/plugins/firebase/auth/g;)V
    .locals 1

    iget-object v0, p0, Lw5/j$c;->a:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/firebase/auth/g;->b(Landroid/view/Display;)V

    return-void
.end method
