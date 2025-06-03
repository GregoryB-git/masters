.class public final Lcom/google/android/gms/internal/measurement/N0;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Lcom/google/android/gms/internal/measurement/v0;

.field public final synthetic v:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/N0;->v:Lcom/google/android/gms/internal/measurement/J0;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/N0;->s:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/N0;->t:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/N0;->u:Lcom/google/android/gms/internal/measurement/v0;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/N0;->v:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/N0;->s:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/N0;->t:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/N0;->u:Lcom/google/android/gms/internal/measurement/v0;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/x0;->getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y0;)V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/N0;->u:Lcom/google/android/gms/internal/measurement/v0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/v0;->l(Landroid/os/Bundle;)V

    return-void
.end method
