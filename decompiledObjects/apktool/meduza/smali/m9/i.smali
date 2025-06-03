.class public final Lm9/i;
.super Lm9/v$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm9/v$a<",
        "Lka/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic d:Lm9/j;


# direct methods
.method public constructor <init>(Lm9/j;Ljava/util/ArrayList;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lm9/i;->d:Lm9/j;

    iput-object p2, p0, Lm9/i;->a:Ljava/util/List;

    iput-object p3, p0, Lm9/i;->b:Ljava/util/List;

    iput-object p4, p0, Lm9/i;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lm9/v$a;-><init>()V

    return-void
.end method
