.class public final Lcom/google/android/play/core/integrity/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i;


# instance fields
.field private final a:Lm7/k;


# direct methods
.method public constructor <init>(Lm7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/ab;->a:Lm7/k;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/integrity/ab;->a:Lm7/k;

    invoke-interface {v0}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/integrity/aa;

    check-cast v0, Lcom/google/android/play/core/integrity/aj;

    invoke-direct {v1, v0}, Lcom/google/android/play/core/integrity/aa;-><init>(Lcom/google/android/play/core/integrity/aj;)V

    return-object v1
.end method
