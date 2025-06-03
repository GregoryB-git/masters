.class public abstract Lub/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h$b;


# instance fields
.field public final a:Lub/h$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/h$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/h$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$c<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lub/a;->a:Lub/h$c;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Ldc/p<",
            "-TR;-",
            "Lub/h$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, p0}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lub/h$c;)Lub/h$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lub/h$b;",
            ">(",
            "Lub/h$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lub/h$b$a;->a(Lub/h$b;Lub/h$c;)Lub/h$b;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lub/h$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lub/h$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lub/a;->a:Lub/h$c;

    return-object v0
.end method

.method public minusKey(Lub/h$c;)Lub/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$c<",
            "*>;)",
            "Lub/h;"
        }
    .end annotation

    invoke-static {p0, p1}, Lub/h$b$a;->b(Lub/h$b;Lub/h$c;)Lub/h;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lub/h;)Lub/h;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lub/h$a;->a(Lub/h;Lub/h;)Lub/h;

    move-result-object p1

    return-object p1
.end method
