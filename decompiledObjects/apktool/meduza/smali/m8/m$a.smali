.class public final Lm8/m$a;
.super Lm8/f0$e$d$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lm8/f0$e$d$a$b;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm8/f0$c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm8/f0$c;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Boolean;

.field public e:Lm8/f0$e$d$a$c;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm8/f0$e$d$a$c;",
            ">;"
        }
    .end annotation
.end field

.field public g:I

.field public h:B


# direct methods
.method public constructor <init>(Lm8/f0$e$d$a;)V
    .locals 1

    invoke-direct {p0}, Lm8/f0$e$d$a$a;-><init>()V

    invoke-virtual {p1}, Lm8/f0$e$d$a;->e()Lm8/f0$e$d$a$b;

    move-result-object v0

    iput-object v0, p0, Lm8/m$a;->a:Lm8/f0$e$d$a$b;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm8/m$a;->b:Ljava/util/List;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->f()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm8/m$a;->c:Ljava/util/List;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->b()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lm8/m$a;->d:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->c()Lm8/f0$e$d$a$c;

    move-result-object v0

    iput-object v0, p0, Lm8/m$a;->e:Lm8/f0$e$d$a$c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm8/m$a;->f:Ljava/util/List;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->g()I

    move-result p1

    iput p1, p0, Lm8/m$a;->g:I

    const/4 p1, 0x1

    iput-byte p1, p0, Lm8/m$a;->h:B

    return-void
.end method


# virtual methods
.method public final a()Lm8/m;
    .locals 10

    .line 1
    iget-byte v0, p0, Lm8/m$a;->h:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v3, p0, Lm8/m$a;->a:Lm8/f0$e$d$a$b;

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Lm8/m;

    .line 12
    .line 13
    iget-object v4, p0, Lm8/m$a;->b:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, p0, Lm8/m$a;->c:Ljava/util/List;

    .line 16
    .line 17
    iget-object v6, p0, Lm8/m$a;->d:Ljava/lang/Boolean;

    .line 18
    .line 19
    iget-object v7, p0, Lm8/m$a;->e:Lm8/f0$e$d$a$c;

    .line 20
    .line 21
    iget-object v8, p0, Lm8/m$a;->f:Ljava/util/List;

    .line 22
    .line 23
    iget v9, p0, Lm8/m$a;->g:I

    .line 24
    .line 25
    move-object v2, v0

    .line 26
    invoke-direct/range {v2 .. v9}, Lm8/m;-><init>(Lm8/f0$e$d$a$b;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lm8/f0$e$d$a$c;Ljava/util/List;I)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lm8/m$a;->a:Lm8/f0$e$d$a$b;

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    const-string v2, " execution"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-byte v2, p0, Lm8/m$a;->h:B

    .line 45
    .line 46
    and-int/2addr v1, v2

    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    const-string v1, " uiOrientation"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "Missing required properties:"

    .line 57
    .line 58
    invoke-static {v2, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
