.class public abstract Le9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp4/b;


# static fields
.field public static final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract A()V
.end method

.method public abstract B()V
.end method

.method public a(Lp4/d;)Lp4/a;
    .locals 2

    .line 1
    iget-object v0, p1, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-static {v1}, Lx6/b;->q(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lz3/a;->n()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, p1, v0}, Le9/a;->i(Lp4/d;Ljava/nio/ByteBuffer;)Lp4/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_1
    return-object p1
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

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract i(Lp4/d;Ljava/nio/ByteBuffer;)Lp4/a;
.end method

.method public abstract j()Li9/a;
.end method

.method public abstract k(Le9/e;)Li9/b;
.end method

.method public abstract l()Li9/d;
.end method

.method public abstract m(Le9/e;)Li9/f;
.end method

.method public abstract n(Le9/e;Li9/f;)Li9/a0;
.end method

.method public abstract o()Li9/b0;
.end method

.method public abstract p()Li9/f0;
.end method

.method public abstract q()Li9/g0;
.end method

.method public abstract r()Li9/l1;
.end method

.method public abstract s()Lcom/google/android/gms/tasks/Task;
.end method

.method public abstract t()V
.end method

.method public abstract u()Z
.end method

.method public abstract v(Leb/t0;Leb/c;)Leb/e;
.end method

.method public abstract w()V
.end method

.method public abstract x(Ljava/lang/String;Ln9/l;)Ljava/lang/Object;
.end method

.method public abstract y(Ljava/lang/String;Ljava/lang/Runnable;)V
.end method

.method public abstract z(Ln9/j;)V
.end method
