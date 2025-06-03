.class public final Lh6/k;
.super Lcom/google/android/gms/auth/api/signin/internal/zba;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lh6/l;


# direct methods
.method public constructor <init>(Lh6/l;)V
    .locals 0

    iput-object p1, p0, Lh6/k;->a:Lh6/l;

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/zba;-><init>()V

    return-void
.end method


# virtual methods
.method public final o1(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lh6/k;->a:Lh6/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lk6/j;)V

    return-void
.end method
