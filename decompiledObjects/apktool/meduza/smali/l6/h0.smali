.class public final Ll6/h0;
.super Ll6/x;
.source "SourceFile"


# instance fields
.field public final b:Lk6/d;


# direct methods
.method public constructor <init>(Lk6/d;)V
    .locals 0

    invoke-direct {p0}, Ll6/x;-><init>()V

    iput-object p1, p0, Ll6/h0;->b:Lk6/d;

    return-void
.end method


# virtual methods
.method public final a(Lh6/h;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1

    iget-object v0, p0, Ll6/h0;->b:Lk6/d;

    invoke-virtual {v0, p1}, Lk6/d;->doRead(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lk6/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lk6/j;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Ll6/h0;->b:Lk6/d;

    invoke-virtual {v0, p1}, Lk6/d;->doWrite(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final c()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Ll6/h0;->b:Lk6/d;

    invoke-virtual {v0}, Lk6/d;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method
