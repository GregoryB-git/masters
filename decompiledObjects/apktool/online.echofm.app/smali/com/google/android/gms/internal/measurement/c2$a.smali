.class public final Lcom/google/android/gms/internal/measurement/c2$a;
.super Lcom/google/android/gms/internal/measurement/Y3$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/K4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/c2;->K()Lcom/google/android/gms/internal/measurement/c2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/Y3$b;-><init>(Lcom/google/android/gms/internal/measurement/Y3;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/T1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/c2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final w()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/c2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c2;->k()I

    move-result v0

    return v0
.end method

.method public final x(Lcom/google/android/gms/internal/measurement/d2$a;)Lcom/google/android/gms/internal/measurement/c2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/c2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast p1, Lcom/google/android/gms/internal/measurement/d2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/c2;->H(Lcom/google/android/gms/internal/measurement/c2;Lcom/google/android/gms/internal/measurement/d2;)V

    return-object p0
.end method

.method public final y(I)Lcom/google/android/gms/internal/measurement/d2;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast p1, Lcom/google/android/gms/internal/measurement/c2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/c2;->G(I)Lcom/google/android/gms/internal/measurement/d2;

    move-result-object p1

    return-object p1
.end method
