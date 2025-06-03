.class public final synthetic LR2/A2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public synthetic o:LR2/x2;


# direct methods
.method public synthetic constructor <init>(LR2/x2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/A2;->o:LR2/x2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LR2/A2;->o:LR2/x2;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/measurement/P7;

    .line 4
    .line 5
    iget-object v0, v0, LR2/x2;->k:Lcom/google/android/gms/internal/measurement/T7;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/P7;-><init>(Lcom/google/android/gms/internal/measurement/T7;)V

    .line 8
    .line 9
    .line 10
    return-object v1
.end method
