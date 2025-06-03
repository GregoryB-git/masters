.class public final Lnb/h$b$a;
.super Lnb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/h$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lnb/h$b;


# direct methods
.method public constructor <init>(Lnb/h$b;)V
    .locals 0

    iput-object p1, p0, Lnb/h$b$a;->a:Lnb/h$b;

    invoke-direct {p0}, Lnb/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Leb/n;Leb/k0$j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/h$b$a;->a:Lnb/h$b;

    .line 2
    .line 3
    iget-object v1, v0, Lnb/h$b;->h:Lnb/h;

    .line 4
    .line 5
    iget-object v1, v1, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iget-object v0, v0, Lnb/h$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lnb/h$b$a;->a:Lnb/h$b;

    .line 17
    .line 18
    iput-object p1, v0, Lnb/h$b;->e:Leb/n;

    .line 19
    .line 20
    iput-object p2, v0, Lnb/h$b;->f:Leb/k0$j;

    .line 21
    .line 22
    iget-boolean p2, v0, Lnb/h$b;->g:Z

    .line 23
    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    iget-object p2, v0, Lnb/h$b;->h:Lnb/h;

    .line 27
    .line 28
    iget-boolean p2, p2, Lnb/h;->h:Z

    .line 29
    .line 30
    if-nez p2, :cond_2

    .line 31
    .line 32
    sget-object p2, Leb/n;->d:Leb/n;

    .line 33
    .line 34
    if-ne p1, p2, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lnb/h$b;->c:Lnb/e;

    .line 37
    .line 38
    invoke-virtual {p1}, Lnb/b;->e()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p1, p0, Lnb/h$b$a;->a:Lnb/h$b;

    .line 42
    .line 43
    iget-object p1, p1, Lnb/h$b;->h:Lnb/h;

    .line 44
    .line 45
    invoke-virtual {p1}, Lnb/h;->i()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
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

.method public final g()Leb/k0$e;
    .locals 1

    iget-object v0, p0, Lnb/h$b$a;->a:Lnb/h$b;

    iget-object v0, v0, Lnb/h$b;->h:Lnb/h;

    iget-object v0, v0, Lnb/h;->g:Leb/k0$e;

    return-object v0
.end method
