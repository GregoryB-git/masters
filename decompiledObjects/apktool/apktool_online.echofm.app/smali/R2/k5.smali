.class public final synthetic LR2/k5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/i5;

.field public synthetic p:I

.field public synthetic q:LR2/Y1;

.field public synthetic r:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(LR2/i5;ILR2/Y1;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/k5;->o:LR2/i5;

    .line 5
    .line 6
    iput p2, p0, LR2/k5;->p:I

    .line 7
    .line 8
    iput-object p3, p0, LR2/k5;->q:LR2/Y1;

    .line 9
    .line 10
    iput-object p4, p0, LR2/k5;->r:Landroid/content/Intent;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/k5;->o:LR2/i5;

    .line 2
    .line 3
    iget v1, p0, LR2/k5;->p:I

    .line 4
    .line 5
    iget-object v2, p0, LR2/k5;->q:LR2/Y1;

    .line 6
    .line 7
    iget-object v3, p0, LR2/k5;->r:Landroid/content/Intent;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, LR2/i5;->d(ILR2/Y1;Landroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
