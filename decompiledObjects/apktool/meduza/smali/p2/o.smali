.class public final Lp2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/m;


# instance fields
.field public final c:Lb1/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb1/w<",
            "Lo2/m$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lz2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/c<",
            "Lo2/m$a$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb1/w;

    .line 5
    .line 6
    invoke-direct {v0}, Lb1/w;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp2/o;->c:Lb1/w;

    .line 10
    .line 11
    new-instance v0, Lz2/c;

    .line 12
    .line 13
    invoke-direct {v0}, Lz2/c;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lp2/o;->d:Lz2/c;

    .line 17
    .line 18
    sget-object v0, Lo2/m;->b:Lo2/m$a$b;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lp2/o;->a(Lo2/m$a;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public final a(Lo2/m$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp2/o;->c:Lb1/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb1/w;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lo2/m$a$c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lp2/o;->d:Lz2/c;

    .line 11
    .line 12
    check-cast p1, Lo2/m$a$c;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lz2/c;->i(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p1, Lo2/m$a$a;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lo2/m$a$a;

    .line 23
    .line 24
    iget-object v0, p0, Lp2/o;->d:Lz2/c;

    .line 25
    .line 26
    iget-object p1, p1, Lo2/m$a$a;->a:Ljava/lang/Throwable;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lz2/c;->j(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
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
