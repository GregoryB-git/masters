.class public final Lcom/google/android/gms/internal/auth/zzbt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getSpatulaHeader(Lk6/e;)Lk6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/e;",
            ")",
            "Lk6/g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/auth/zzbs;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/auth/zzbs;-><init>(Lcom/google/android/gms/internal/auth/zzbt;Lk6/e;)V

    invoke-virtual {p1, v0}, Lk6/e;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final performProxyRequest(Lk6/e;Lf6/a;)Lk6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/e;",
            "Lf6/a;",
            ")",
            "Lk6/g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/auth/zzbq;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzbq;-><init>(Lcom/google/android/gms/internal/auth/zzbt;Lk6/e;Lf6/a;)V

    invoke-virtual {p1, v0}, Lk6/e;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method
