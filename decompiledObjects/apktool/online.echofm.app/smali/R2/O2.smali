.class public final LR2/O2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/x3;

.field public final synthetic p:LR2/N2;


# direct methods
.method public constructor <init>(LR2/N2;LR2/x3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/O2;->p:LR2/N2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/O2;->o:LR2/x3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/O2;->p:LR2/N2;

    .line 2
    .line 3
    iget-object v1, p0, LR2/O2;->o:LR2/x3;

    .line 4
    .line 5
    invoke-static {v0, v1}, LR2/N2;->g(LR2/N2;LR2/x3;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/O2;->p:LR2/N2;

    .line 9
    .line 10
    iget-object v1, p0, LR2/O2;->o:LR2/x3;

    .line 11
    .line 12
    iget-object v1, v1, LR2/x3;->g:Lcom/google/android/gms/internal/measurement/H0;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LR2/N2;->k(Lcom/google/android/gms/internal/measurement/H0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
