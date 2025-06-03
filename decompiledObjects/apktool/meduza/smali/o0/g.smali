.class public final Lo0/g;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Ljava/lang/Object;",
        "Lub/e<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2"
    f = "DataMigrationInitializer.kt"
    l = {
        0x2c,
        0x2e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/util/Iterator;

.field public b:Lo0/d;

.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo0/d<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldc/l<",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo0/d<",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "Ldc/l<",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;",
            "Ljava/lang/Object;",
            ">;>;",
            "Lub/e<",
            "-",
            "Lo0/g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/g;->f:Ljava/util/List;

    iput-object p2, p0, Lo0/g;->o:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/g;

    iget-object v1, p0, Lo0/g;->f:Ljava/util/List;

    iget-object v2, p0, Lo0/g;->o:Ljava/util/List;

    invoke-direct {v0, v1, v2, p2}, Lo0/g;-><init>(Ljava/util/List;Ljava/util/List;Lub/e;)V

    iput-object p1, v0, Lo0/g;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lo0/g;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lo0/g;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lo0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lo0/g;->d:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lo0/g;->a:Ljava/util/Iterator;

    iget-object v4, p0, Lo0/g;->e:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lo0/g;->c:Ljava/lang/Object;

    iget-object v4, p0, Lo0/g;->b:Lo0/d;

    iget-object v5, p0, Lo0/g;->a:Ljava/util/Iterator;

    iget-object v6, p0, Lo0/g;->e:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    move-object v7, p0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo0/g;->e:Ljava/lang/Object;

    iget-object v1, p0, Lo0/g;->f:Ljava/util/List;

    iget-object v4, p0, Lo0/g;->o:Ljava/util/List;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v5, p0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo0/d;

    iput-object v4, v5, Lo0/g;->e:Ljava/lang/Object;

    iput-object v1, v5, Lo0/g;->a:Ljava/util/Iterator;

    iput-object v6, v5, Lo0/g;->b:Lo0/d;

    iput-object p1, v5, Lo0/g;->c:Ljava/lang/Object;

    iput v2, v5, Lo0/g;->d:I

    invoke-interface {v6}, Lo0/d;->c()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_3

    return-object v0

    :cond_3
    move-object v8, v1

    move-object v1, p1

    move-object p1, v7

    move-object v7, v5

    move-object v5, v8

    move-object v9, v6

    move-object v6, v4

    move-object v4, v9

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lo0/g$a;

    const/4 v1, 0x0

    invoke-direct {p1, v4, v1}, Lo0/g$a;-><init>(Lo0/d;Lub/e;)V

    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v6, v7, Lo0/g;->e:Ljava/lang/Object;

    iput-object v5, v7, Lo0/g;->a:Ljava/util/Iterator;

    iput-object v1, v7, Lo0/g;->b:Lo0/d;

    iput-object v1, v7, Lo0/g;->c:Ljava/lang/Object;

    iput v3, v7, Lo0/g;->d:I

    invoke-interface {v4}, Lo0/d;->b()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_4
    move-object p1, v1

    :cond_5
    move-object v1, v5

    move-object v4, v6

    move-object v5, v7

    goto :goto_1

    :cond_6
    return-object p1
.end method
