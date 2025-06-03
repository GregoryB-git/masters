.class public final LJ3/n$b;
.super LJ3/B$e$d$a$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LJ3/C;

.field public b:LJ3/B$e$d$a$b$c;

.field public c:LJ3/B$a;

.field public d:LJ3/B$e$d$a$b$d;

.field public e:LJ3/C;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ3/B$e$d$a$b$b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()LJ3/B$e$d$a$b;
    .locals 9

    .line 1
    iget-object v0, p0, LJ3/n$b;->d:LJ3/B$e$d$a$b$d;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " signal"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    iget-object v0, p0, LJ3/n$b;->e:LJ3/C;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " binaries"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    new-instance v0, LJ3/n;

    .line 52
    .line 53
    iget-object v3, p0, LJ3/n$b;->a:LJ3/C;

    .line 54
    .line 55
    iget-object v4, p0, LJ3/n$b;->b:LJ3/B$e$d$a$b$c;

    .line 56
    .line 57
    iget-object v5, p0, LJ3/n$b;->c:LJ3/B$a;

    .line 58
    .line 59
    iget-object v6, p0, LJ3/n$b;->d:LJ3/B$e$d$a$b$d;

    .line 60
    .line 61
    iget-object v7, p0, LJ3/n$b;->e:LJ3/C;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    move-object v2, v0

    .line 65
    invoke-direct/range {v2 .. v8}, LJ3/n;-><init>(LJ3/C;LJ3/B$e$d$a$b$c;LJ3/B$a;LJ3/B$e$d$a$b$d;LJ3/C;LJ3/n$a;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v3, "Missing required properties:"

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0
.end method

.method public b(LJ3/B$a;)LJ3/B$e$d$a$b$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/n$b;->c:LJ3/B$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(LJ3/C;)LJ3/B$e$d$a$b$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/n$b;->e:LJ3/C;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null binaries"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public d(LJ3/B$e$d$a$b$c;)LJ3/B$e$d$a$b$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/n$b;->b:LJ3/B$e$d$a$b$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(LJ3/B$e$d$a$b$d;)LJ3/B$e$d$a$b$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/n$b;->d:LJ3/B$e$d$a$b$d;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null signal"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public f(LJ3/C;)LJ3/B$e$d$a$b$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/n$b;->a:LJ3/C;

    .line 2
    .line 3
    return-object p0
.end method
