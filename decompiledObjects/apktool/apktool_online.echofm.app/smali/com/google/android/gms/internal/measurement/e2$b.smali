.class public final Lcom/google/android/gms/internal/measurement/e2$b;
.super Lcom/google/android/gms/internal/measurement/Y3$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/K4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/e2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/e2;->J()Lcom/google/android/gms/internal/measurement/e2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/Y3$b;-><init>(Lcom/google/android/gms/internal/measurement/Y3;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/T1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/e2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Lcom/google/android/gms/internal/measurement/Z1$a;)Lcom/google/android/gms/internal/measurement/e2$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/e2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast p1, Lcom/google/android/gms/internal/measurement/Z1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/e2;->I(Lcom/google/android/gms/internal/measurement/e2;Lcom/google/android/gms/internal/measurement/Z1;)V

    return-object p0
.end method
