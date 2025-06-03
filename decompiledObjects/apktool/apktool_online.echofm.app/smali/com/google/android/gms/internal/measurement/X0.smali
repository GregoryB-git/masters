.class public final Lcom/google/android/gms/internal/measurement/X0;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X0;->t:Lcom/google/android/gms/internal/measurement/J0;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/X0;->s:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X0;->t:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/X0;->s:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/J0$a;->p:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/x0;->beginAdUnitExposure(Ljava/lang/String;J)V

    return-void
.end method
