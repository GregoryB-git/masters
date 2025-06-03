.class public final Lj7/g;
.super Lcom/google/android/play/core/review/internal/zzg;
.source "SourceFile"


# instance fields
.field public final a:Lk7/d;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lj7/h;


# direct methods
.method public constructor <init>(Lj7/h;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    new-instance v0, Lk7/d;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, Lk7/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lj7/g;->c:Lj7/h;

    invoke-direct {p0}, Lcom/google/android/play/core/review/internal/zzg;-><init>()V

    iput-object v0, p0, Lj7/g;->a:Lk7/d;

    iput-object p2, p0, Lj7/g;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method
