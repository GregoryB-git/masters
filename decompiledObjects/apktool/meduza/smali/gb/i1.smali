.class public final Lgb/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/d1;


# direct methods
.method public constructor <init>(Lgb/d1;)V
    .locals 0

    iput-object p1, p0, Lgb/i1;->a:Lgb/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/i1;->a:Lgb/d1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/d1;->j:Leb/d;

    .line 4
    .line 5
    sget-object v1, Leb/d$a;->b:Leb/d$a;

    .line 6
    .line 7
    const-string v2, "Terminated"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Leb/d;->a(Leb/d$a;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lgb/i1;->a:Lgb/d1;

    .line 13
    .line 14
    iget-object v1, v0, Lgb/d1;->e:Lgb/d1$c;

    .line 15
    .line 16
    check-cast v1, Lgb/r1$o$a;

    .line 17
    .line 18
    iget-object v2, v1, Lgb/r1$o$a;->b:Lgb/r1$o;

    .line 19
    .line 20
    iget-object v2, v2, Lgb/r1$o;->j:Lgb/r1;

    .line 21
    .line 22
    iget-object v2, v2, Lgb/r1;->B:Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v2, v1, Lgb/r1$o$a;->b:Lgb/r1$o;

    .line 28
    .line 29
    iget-object v2, v2, Lgb/r1$o;->j:Lgb/r1;

    .line 30
    .line 31
    iget-object v2, v2, Lgb/r1;->Q:Leb/c0;

    .line 32
    .line 33
    iget-object v2, v2, Leb/c0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-static {v2, v0}, Leb/c0;->b(Ljava/util/AbstractMap;Leb/e0;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v1, Lgb/r1$o$a;->b:Lgb/r1$o;

    .line 39
    .line 40
    iget-object v0, v0, Lgb/r1$o;->j:Lgb/r1;

    .line 41
    .line 42
    invoke-static {v0}, Lgb/r1;->K(Lgb/r1;)V

    .line 43
    .line 44
    .line 45
    return-void
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
