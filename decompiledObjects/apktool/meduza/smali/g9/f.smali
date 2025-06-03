.class public abstract Lg9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/f$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/firestore/g;

.field public b:Lm9/c0;

.field public c:Le9/a;

.field public d:Li9/n;

.field public e:Lg9/j0;

.field public f:Lm9/h0;

.field public g:Lg9/k;

.field public h:Li9/e;

.field public i:Li9/k1;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm9/c0;

    invoke-direct {v0}, Lm9/c0;-><init>()V

    iput-object v0, p0, Lg9/f;->b:Lm9/c0;

    iput-object p1, p0, Lg9/f;->a:Lcom/google/firebase/firestore/g;

    return-void
.end method


# virtual methods
.method public abstract a()Lg9/k;
.end method

.method public abstract b(Lg9/f$a;)Li9/k1;
.end method

.method public abstract c(Lg9/f$a;)Li9/e;
.end method

.method public abstract d(Lg9/f$a;)Li9/n;
.end method

.method public abstract e(Lg9/f$a;)Le9/a;
.end method

.method public abstract f(Lg9/f$a;)Lm9/h0;
.end method

.method public abstract g(Lg9/f$a;)Lg9/j0;
.end method

.method public final h()Li9/n;
    .locals 3

    iget-object v0, p0, Lg9/f;->d:Li9/n;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localStore not initialized yet"

    invoke-static {v0, v2, v1}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final i()Lg9/j0;
    .locals 3

    iget-object v0, p0, Lg9/f;->e:Lg9/j0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncEngine not initialized yet"

    invoke-static {v0, v2, v1}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method
