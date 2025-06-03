.class public final LY1/m$d;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY1/m;->N1(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:LY1/m;


# direct methods
.method public constructor <init>(LY1/m;Landroidx/fragment/app/e;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LY1/m$d;->o:LY1/m;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, LY1/m$d;->o:LY1/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LY1/m;->j2()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
