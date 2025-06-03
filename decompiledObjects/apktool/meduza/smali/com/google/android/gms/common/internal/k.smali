.class public final Lcom/google/android/gms/common/internal/k;
.super Lm6/a0;
.source "SourceFile"


# instance fields
.field public final synthetic g:Lcom/google/android/gms/common/internal/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/a;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    invoke-direct {p0, p1, p2, p3}, Lm6/a0;-><init>(Lcom/google/android/gms/common/internal/a;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final c(Lj6/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/a;->enableLocalFallback()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->zzo(Lcom/google/android/gms/common/internal/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/a;->zzk(Lcom/google/android/gms/common/internal/a;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/a;->zzc:Lcom/google/android/gms/common/internal/a$c;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/a$c;->a(Lj6/b;)V

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lj6/b;)V

    return-void
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/k;->g:Lcom/google/android/gms/common/internal/a;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/a;->zzc:Lcom/google/android/gms/common/internal/a$c;

    sget-object v1, Lj6/b;->e:Lj6/b;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/a$c;->a(Lj6/b;)V

    const/4 v0, 0x1

    return v0
.end method
