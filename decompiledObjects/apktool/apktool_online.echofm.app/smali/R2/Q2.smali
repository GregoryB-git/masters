.class public final synthetic LR2/Q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/R2;

.field public synthetic p:Ljava/lang/String;

.field public synthetic q:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LR2/R2;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/Q2;->o:LR2/R2;

    .line 5
    .line 6
    iput-object p2, p0, LR2/Q2;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LR2/Q2;->q:Landroid/os/Bundle;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/Q2;->o:LR2/R2;

    .line 2
    .line 3
    iget-object v1, p0, LR2/Q2;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LR2/Q2;->q:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LR2/R2;->Z0(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
