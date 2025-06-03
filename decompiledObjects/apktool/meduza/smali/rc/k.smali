.class public final Lrc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h;


# instance fields
.field public final a:Ljava/lang/Throwable;

.field public final synthetic b:Lub/h;


# direct methods
.method public constructor <init>(Lub/h;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrc/k;->a:Ljava/lang/Throwable;

    iput-object p1, p0, Lrc/k;->b:Lub/h;

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

    iget-object v0, p0, Lrc/k;->b:Lub/h;

    invoke-interface {v0, p1, p2}, Lub/h;->fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lub/h$c;)Lub/h$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lub/h$b;",
            ">(",
            "Lub/h$c<",
            "TE;>;)TE;"
        }
    .end annotation

    iget-object v0, p0, Lrc/k;->b:Lub/h;

    invoke-interface {v0, p1}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lub/h$c;)Lub/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$c<",
            "*>;)",
            "Lub/h;"
        }
    .end annotation

    iget-object v0, p0, Lrc/k;->b:Lub/h;

    invoke-interface {v0, p1}, Lub/h;->minusKey(Lub/h$c;)Lub/h;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lub/h;)Lub/h;
    .locals 1

    iget-object v0, p0, Lrc/k;->b:Lub/h;

    invoke-interface {v0, p1}, Lub/h;->plus(Lub/h;)Lub/h;

    move-result-object p1

    return-object p1
.end method
