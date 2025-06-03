.class public final Lcom/google/android/play/core/integrity/bp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i;


# instance fields
.field private final a:Lm7/k;

.field private final b:Lm7/k;

.field private final c:Lm7/k;

.field private final d:Lm7/k;


# direct methods
.method public constructor <init>(Lm7/k;Lm7/k;Lm7/k;Lm7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/bp;->a:Lm7/k;

    iput-object p2, p0, Lcom/google/android/play/core/integrity/bp;->b:Lm7/k;

    iput-object p3, p0, Lcom/google/android/play/core/integrity/bp;->c:Lm7/k;

    iput-object p4, p0, Lcom/google/android/play/core/integrity/bp;->d:Lm7/k;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/play/core/integrity/bp;->a:Lm7/k;

    invoke-interface {v0}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/integrity/bp;->b:Lm7/k;

    invoke-interface {v1}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm7/v;

    iget-object v2, p0, Lcom/google/android/play/core/integrity/bp;->c:Lm7/k;

    check-cast v2, Lcom/google/android/play/core/integrity/au;

    invoke-virtual {v2}, Lcom/google/android/play/core/integrity/au;->b()Lcom/google/android/play/core/integrity/at;

    move-result-object v2

    new-instance v3, Lcom/google/android/play/core/integrity/j;

    invoke-direct {v3}, Lcom/google/android/play/core/integrity/j;-><init>()V

    new-instance v4, Lcom/google/android/play/core/integrity/bn;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/play/core/integrity/bn;-><init>(Landroid/content/Context;Lm7/v;Lcom/google/android/play/core/integrity/at;Lcom/google/android/play/core/integrity/k;)V

    return-object v4
.end method
