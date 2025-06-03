.class public final synthetic Lm9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lm9/v;

.field public final synthetic b:Lm9/v$a;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lm9/v;Lm9/i;Lka/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/o;->a:Lm9/v;

    iput-object p2, p0, Lm9/o;->b:Lm9/v$a;

    iput-object p3, p0, Lm9/o;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    iget-object v0, p0, Lm9/o;->a:Lm9/v;

    iget-object v1, p0, Lm9/o;->b:Lm9/v$a;

    iget-object v2, p0, Lm9/o;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/e;

    new-instance v3, Lm9/t;

    invoke-direct {v3, v1, p1}, Lm9/t;-><init>(Lm9/v$a;Leb/e;)V

    invoke-virtual {v0}, Lm9/v;->a()Leb/s0;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Leb/e;->e(Leb/e$a;Leb/s0;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Leb/e;->c(I)V

    invoke-virtual {p1, v2}, Leb/e;->d(Ljava/lang/Object;)V

    invoke-virtual {p1}, Leb/e;->b()V

    return-void
.end method
