.class public final synthetic Lv3/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv3/z0$a;

.field public final synthetic b:Landroid/util/Pair;

.field public final synthetic c:Lz4/n;

.field public final synthetic d:Lz4/q;

.field public final synthetic e:Ljava/io/IOException;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lv3/z0$a;Landroid/util/Pair;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/w0;->a:Lv3/z0$a;

    iput-object p2, p0, Lv3/w0;->b:Landroid/util/Pair;

    iput-object p3, p0, Lv3/w0;->c:Lz4/n;

    iput-object p4, p0, Lv3/w0;->d:Lz4/q;

    iput-object p5, p0, Lv3/w0;->e:Ljava/io/IOException;

    iput-boolean p6, p0, Lv3/w0;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lv3/w0;->a:Lv3/z0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/w0;->b:Landroid/util/Pair;

    .line 4
    .line 5
    iget-object v5, p0, Lv3/w0;->c:Lz4/n;

    .line 6
    .line 7
    iget-object v6, p0, Lv3/w0;->d:Lz4/q;

    .line 8
    .line 9
    iget-object v7, p0, Lv3/w0;->e:Ljava/io/IOException;

    .line 10
    .line 11
    iget-boolean v8, p0, Lv3/w0;->f:Z

    .line 12
    .line 13
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 14
    .line 15
    iget-object v2, v0, Lv3/z0;->h:Lw3/a;

    .line 16
    .line 17
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    check-cast v4, Lz4/t$b;

    .line 29
    .line 30
    invoke-interface/range {v2 .. v8}, Lz4/w;->f0(ILz4/t$b;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V

    .line 31
    .line 32
    .line 33
    return-void
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
