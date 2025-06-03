.class public final LR2/d5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/a5;


# direct methods
.method public constructor <init>(LR2/a5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/d5;->o:LR2/a5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/d5;->o:LR2/a5;

    .line 2
    .line 3
    iget-object v0, v0, LR2/a5;->c:LR2/D4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, LR2/D4;->H(LR2/D4;LR2/R1;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LR2/d5;->o:LR2/a5;

    .line 10
    .line 11
    iget-object v0, v0, LR2/a5;->c:LR2/D4;

    .line 12
    .line 13
    invoke-static {v0}, LR2/D4;->k0(LR2/D4;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
