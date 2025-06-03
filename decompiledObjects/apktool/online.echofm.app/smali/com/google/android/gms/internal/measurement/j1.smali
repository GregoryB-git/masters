.class public final Lcom/google/android/gms/internal/measurement/j1;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Z

.field public final synthetic t:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/j1;->t:Lcom/google/android/gms/internal/measurement/J0;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/j1;->s:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j1;->t:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/x0;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/j1;->s:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/x0;->setDataCollectionEnabled(Z)V

    return-void
.end method
