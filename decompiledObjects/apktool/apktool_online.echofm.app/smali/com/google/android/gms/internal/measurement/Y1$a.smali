.class public final Lcom/google/android/gms/internal/measurement/Y1$a;
.super Lcom/google/android/gms/internal/measurement/Y3$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/K4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/Y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y1;->a0()Lcom/google/android/gms/internal/measurement/Y1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/Y3$b;-><init>(Lcom/google/android/gms/internal/measurement/Y3;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/T1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/Y1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(J)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/Y1;->W(Lcom/google/android/gms/internal/measurement/Y1;J)V

    return-object p0
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast p1, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/Y1;->N(Lcom/google/android/gms/internal/measurement/Y1;Lcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method

.method public final C(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/Y1;->N(Lcom/google/android/gms/internal/measurement/Y1;Lcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method

.method public final D(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/Y1;->O(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/Y1;->P(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)V

    return-object p0
.end method

.method public final F()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y1;->X()J

    move-result-wide v0

    return-wide v0
.end method

.method public final G(J)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/Y1;->M(Lcom/google/android/gms/internal/measurement/Y1;J)V

    return-object p0
.end method

.method public final H(I)Lcom/google/android/gms/internal/measurement/a2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/Y1;->G(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object p1

    return-object p1
.end method

.method public final I()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    move-result-wide v0

    return-wide v0
.end method

.method public final J()Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/Y1;->J(Lcom/google/android/gms/internal/measurement/Y1;)V

    return-object p0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y1;->c0()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y1;->f0()Z

    move-result v0

    return v0
.end method

.method public final w()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y1;->T()I

    move-result v0

    return v0
.end method

.method public final x(I)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/Y1;->K(Lcom/google/android/gms/internal/measurement/Y1;I)V

    return-object p0
.end method

.method public final y(ILcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast p2, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/Y1;->L(Lcom/google/android/gms/internal/measurement/Y1;ILcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method

.method public final z(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/Y1;->L(Lcom/google/android/gms/internal/measurement/Y1;ILcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method
