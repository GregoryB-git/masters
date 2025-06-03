.class public final Lo7/v;
.super Lo7/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/x0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lo7/x0;

.field public b:Lo7/x0;


# direct methods
.method public constructor <init>(Lo7/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lo7/x0;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lo7/w;->d:Lo7/u;

    .line 5
    .line 6
    iget-object v0, p1, Lo7/u;->c:Lo7/r;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lo7/u;->e()Lo7/m0$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p1, Lo7/u;->c:Lo7/r;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Lo7/r;->n()Lo7/x0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lo7/v;->a:Lo7/x0;

    .line 21
    .line 22
    sget-object p1, Lo7/b0$a;->e:Lo7/b0$a;

    .line 23
    .line 24
    iput-object p1, p0, Lo7/v;->b:Lo7/x0;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lo7/v;->b:Lo7/x0;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo7/v;->a:Lo7/x0;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lo7/v;->b:Lo7/x0;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo7/v;->a:Lo7/x0;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/r;

    invoke-virtual {v0}, Lo7/r;->n()Lo7/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/v;->b:Lo7/x0;

    :cond_0
    iget-object v0, p0, Lo7/v;->b:Lo7/x0;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
