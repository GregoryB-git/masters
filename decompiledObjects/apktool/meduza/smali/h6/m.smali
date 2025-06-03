.class public abstract Lh6/m;
.super Lcom/google/android/gms/common/api/internal/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lk6/e;)V
    .locals 1

    sget-object v0, Lb6/a;->a:Lk6/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lk6/a;Lk6/e;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lk6/j;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lk6/j;)V

    return-void
.end method
