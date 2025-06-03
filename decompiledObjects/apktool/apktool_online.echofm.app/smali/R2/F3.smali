.class public final synthetic LR2/F3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/C3;

.field public synthetic p:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LR2/C3;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/F3;->o:LR2/C3;

    .line 5
    .line 6
    iput-object p2, p0, LR2/F3;->p:Landroid/os/Bundle;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/F3;->o:LR2/C3;

    .line 2
    .line 3
    iget-object v1, p0, LR2/F3;->p:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LR2/C3;->O(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
