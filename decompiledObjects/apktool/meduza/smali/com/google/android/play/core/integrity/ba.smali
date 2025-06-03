.class public final Lcom/google/android/play/core/integrity/ba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i;


# instance fields
.field private final a:Lm7/k;

.field private final b:Lm7/k;


# direct methods
.method public constructor <init>(Lm7/k;Lm7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/ba;->a:Lm7/k;

    iput-object p2, p0, Lcom/google/android/play/core/integrity/ba;->b:Lm7/k;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/integrity/ba;->b:Lm7/k;

    iget-object v1, p0, Lcom/google/android/play/core/integrity/ba;->a:Lm7/k;

    invoke-interface {v1}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Lcom/google/android/play/core/integrity/az;

    check-cast v1, Lcom/google/android/play/core/integrity/bn;

    check-cast v0, Lcom/google/android/play/core/integrity/bt;

    invoke-direct {v2, v1, v0}, Lcom/google/android/play/core/integrity/az;-><init>(Lcom/google/android/play/core/integrity/bn;Lcom/google/android/play/core/integrity/bt;)V

    return-object v2
.end method
