.class public final Lz2/V;
.super Lz2/D;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lz2/W;


# direct methods
.method public constructor <init>(Lz2/W;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/V;->b:Lz2/W;

    .line 2
    .line 3
    iput-object p2, p0, Lz2/V;->a:Landroid/app/Dialog;

    .line 4
    .line 5
    invoke-direct {p0}, Lz2/D;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/V;->b:Lz2/W;

    .line 2
    .line 3
    iget-object v0, v0, Lz2/W;->p:Lz2/X;

    .line 4
    .line 5
    invoke-static {v0}, Lz2/X;->r(Lz2/X;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lz2/V;->a:Landroid/app/Dialog;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lz2/V;->a:Landroid/app/Dialog;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
