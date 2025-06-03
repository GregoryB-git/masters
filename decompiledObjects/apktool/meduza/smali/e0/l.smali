.class public final synthetic Le0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# instance fields
.field public final synthetic a:Le0/m;

.field public final synthetic b:Lb1/k$b;

.field public final synthetic c:Le0/o;


# direct methods
.method public synthetic constructor <init>(Le0/m;Lb1/k$b;Le0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/l;->a:Le0/m;

    iput-object p2, p0, Le0/l;->b:Lb1/k$b;

    iput-object p3, p0, Le0/l;->c:Le0/o;

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 4

    .line 1
    iget-object p1, p0, Le0/l;->a:Le0/m;

    .line 2
    .line 3
    iget-object v0, p0, Le0/l;->b:Lb1/k$b;

    .line 4
    .line 5
    iget-object v1, p0, Le0/l;->c:Le0/o;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lb1/k$a;->Companion:Lb1/k$a$a;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v2, "state"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x2

    .line 25
    if-eq v2, v3, :cond_2

    .line 26
    .line 27
    const/4 v3, 0x3

    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    if-eq v2, v3, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v2, Lb1/k$a;->ON_RESUME:Lb1/k$a;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object v2, Lb1/k$a;->ON_START:Lb1/k$a;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget-object v2, Lb1/k$a;->ON_CREATE:Lb1/k$a;

    .line 42
    .line 43
    :goto_0
    if-ne p2, v2, :cond_3

    .line 44
    .line 45
    iget-object p2, p1, Le0/m;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Le0/m;->a:Ljava/lang/Runnable;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    sget-object v2, Lb1/k$a;->ON_DESTROY:Lb1/k$a;

    .line 57
    .line 58
    if-ne p2, v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Le0/m;->a(Le0/o;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {v0}, Lb1/k$a$a;->a(Lb1/k$b;)Lb1/k$a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne p2, v0, :cond_5

    .line 69
    .line 70
    iget-object p2, p1, Le0/m;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 71
    .line 72
    invoke-virtual {p2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object p1, p1, Le0/m;->a:Ljava/lang/Runnable;

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 78
    .line 79
    .line 80
    :cond_5
    :goto_1
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
