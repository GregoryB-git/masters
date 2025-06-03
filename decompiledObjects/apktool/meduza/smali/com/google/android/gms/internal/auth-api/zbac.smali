.class public final synthetic Lcom/google/android/gms/internal/auth-api/zbac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/n;


# instance fields
.field public final synthetic zba:Lcom/google/android/gms/internal/auth-api/zbag;

.field public final synthetic zbb:Ld6/h;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth-api/zbag;Ld6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbac;->zba:Lcom/google/android/gms/internal/auth-api/zbag;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbac;->zbb:Ld6/h;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbh;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbaf;

    iget-object v1, p0, Lcom/google/android/gms/internal/auth-api/zbac;->zba:Lcom/google/android/gms/internal/auth-api/zbag;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/auth-api/zbaf;-><init>(Lcom/google/android/gms/internal/auth-api/zbag;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbn;

    iget-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbac;->zbb:Ld6/h;

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/auth-api/zbn;->zbd(Lcom/google/android/gms/internal/auth-api/zbv;Ld6/h;)V

    return-void
.end method
