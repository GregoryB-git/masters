.class public final Lcom/google/android/gms/internal/measurement/z3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/J3;

.field public final b:[B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/z3;->b:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/J3;->D([B)Lcom/google/android/gms/internal/measurement/J3;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/z3;->a:Lcom/google/android/gms/internal/measurement/J3;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/android/gms/internal/measurement/y3;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/z3;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/measurement/q3;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z3;->a:Lcom/google/android/gms/internal/measurement/J3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/J3;->E()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/A3;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/z3;->b:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/A3;-><init>([B)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/J3;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z3;->a:Lcom/google/android/gms/internal/measurement/J3;

    return-object v0
.end method
