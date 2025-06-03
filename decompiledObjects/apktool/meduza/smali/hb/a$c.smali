.class public final Lhb/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/a;->close()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhb/a;


# direct methods
.method public constructor <init>(Lhb/a;)V
    .locals 0

    iput-object p1, p0, Lhb/a$c;->a:Lhb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lhb/a$c;->a:Lhb/a;

    .line 2
    .line 3
    iget-object v1, v0, Lhb/a;->q:Lxc/w;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lhb/a;->b:Lxc/f;

    .line 8
    .line 9
    iget-wide v2, v0, Lxc/f;->b:J

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, v0, v2, v3}, Lxc/w;->g0(Lxc/f;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    iget-object v1, p0, Lhb/a$c;->a:Lhb/a;

    .line 23
    .line 24
    iget-object v1, v1, Lhb/a;->d:Lhb/b$a;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    iget-object v0, p0, Lhb/a$c;->a:Lhb/a;

    .line 30
    .line 31
    iget-object v0, v0, Lhb/a;->b:Lxc/f;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    :try_start_1
    iget-object v0, p0, Lhb/a$c;->a:Lhb/a;

    .line 37
    .line 38
    iget-object v0, v0, Lhb/a;->q:Lxc/w;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Lxc/w;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_1
    move-exception v0

    .line 47
    iget-object v1, p0, Lhb/a$c;->a:Lhb/a;

    .line 48
    .line 49
    iget-object v1, v1, Lhb/a;->d:Lhb/b$a;

    .line 50
    .line 51
    invoke-interface {v1, v0}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_1
    :try_start_2
    iget-object v0, p0, Lhb/a$c;->a:Lhb/a;

    .line 55
    .line 56
    iget-object v0, v0, Lhb/a;->r:Ljava/net/Socket;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catch_2
    move-exception v0

    .line 65
    iget-object v1, p0, Lhb/a$c;->a:Lhb/a;

    .line 66
    .line 67
    iget-object v1, v1, Lhb/a;->d:Lhb/b$a;

    .line 68
    .line 69
    invoke-interface {v1, v0}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_2
    return-void
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
