.class public final Lcom/google/android/gms/internal/measurement/x1$a;
.super Lcom/google/android/gms/internal/measurement/Y3$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/K4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x1;->N()Lcom/google/android/gms/internal/measurement/x1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/Y3$b;-><init>(Lcom/google/android/gms/internal/measurement/Y3;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/v1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/x1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/x1;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/x1;->k()I

    move-result v0

    return v0
.end method

.method public final x(ILcom/google/android/gms/internal/measurement/y1;)Lcom/google/android/gms/internal/measurement/x1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/x1;->I(Lcom/google/android/gms/internal/measurement/x1;ILcom/google/android/gms/internal/measurement/y1;)V

    return-object p0
.end method

.method public final y(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/x1;->J(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;)V

    return-object p0
.end method

.method public final z(I)Lcom/google/android/gms/internal/measurement/y1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/x1;->G(I)Lcom/google/android/gms/internal/measurement/y1;

    move-result-object p1

    return-object p1
.end method
